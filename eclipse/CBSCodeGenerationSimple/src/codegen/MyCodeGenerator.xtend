package codegen

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource$Factory$Registry
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

class MyCodeGenerator {

	def static void main(String[] args) {
		new MyCodeGenerator().generate("inputModels/mfs.componentbasedsystem")
	}

	def generate(String file) {
		doEMFSetup
		val resourceSet = new ResourceSetImpl
		val resource = resourceSet.getResource(URI.createURI(file), true)
		for (content : resource.contents) {
			generateCode(content)
		}
	}

	def dispatch generateCode(EObject content) '''
		public class Hello {
		}
	'''

	def doEMFSetup() {
//    EPackage$Registry.INSTANCE.put(MyPackage.eINSTANCE.nsURI, MyPackage.eINSTANCE)
		Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
	}

}
