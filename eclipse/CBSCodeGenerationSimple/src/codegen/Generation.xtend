package codegen

import componentBasedSystem.ComponentBasedSystemPackage
import componentBasedSystem.behaviourDescription.BehaviourDescriptionPackage
import componentBasedSystem.dataTypes.DataTypesPackage
import componentBasedSystem.roles.RolesPackage
import java.io.File
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.generator.IFileSystemAccess

class Generation {

	def static void main(String[] args) {
		println("Starting Code Generation ...")
		new Generation().readInputModel("inputModels/mfs.componentbasedsystem")
	}

	def readInputModel(String pathToInputModel) {

		doEMFSetup

		val resourceSet = new ResourceSetImpl
		
		// Register ePackages from .ecore model.
		resourceSet.packageRegistry.put(ComponentBasedSystemPackage.eNS_URI, ComponentBasedSystemPackage.eINSTANCE)
		resourceSet.packageRegistry.put(BehaviourDescriptionPackage.eNS_URI, BehaviourDescriptionPackage.eINSTANCE)
		resourceSet.packageRegistry.put(DataTypesPackage.eNS_URI, DataTypesPackage.eINSTANCE)
		resourceSet.packageRegistry.put(RolesPackage.eNS_URI, RolesPackage.eINSTANCE)
		
		// Load input model.
		val resourceURI = URI.createFileURI(new File(pathToInputModel).absolutePath)
		val resource = resourceSet.createResource(resourceURI)
		resource.load(null)

		// TODO: How to create a new IFileSystemAccess?
		val IFileSystemAccess fsa = null;
		
		// Generate code.
		new Generator().doGenerate(resource, fsa)

	}

	def doEMFSetup() {
//		EPackage.Registry.INSTANCE.put(edu.kit.ipd.sdq.mdsdpc.componentBasedSystem.eINSTANCE.nsURI, MyPackage.eINSTANCE)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("componentbasedsystem",
			new XMIResourceFactoryImpl);
	}

}
