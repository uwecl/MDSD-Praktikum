package codegen

import componentBasedSystem.ComponentBasedSystem
import componentBasedSystem.Interface
import componentBasedSystem.Signature
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class Generator implements IGenerator {

	override doGenerate(Resource resource, IFileSystemAccess fsa) {

		/*
		 * Use resoucre.contents to get the root node element of the input model.
		 * Use resource.allContents.toIterable to get all elements of the input model.
		 */
		for (EObject o : resource.contents) {
			o.compile(fsa)
		}

	}

	// Catch unsupported input resources.
	def dispatch void compile(EObject eObject, IFileSystemAccess fsa) {
		println("Warning, no generator defined for input resource " + eObject.toString)
	}

	// Generate java code from CBS models.
	def dispatch void compile(ComponentBasedSystem cbs, IFileSystemAccess fsa) {

		val mainPackageName = "repository"
		val repository = cbs.repository

		// TODO: Generate main package.
		val ifaces = repository.interface
		generateInterfaces(ifaces, mainPackageName)
		

//		TODO: Write output in files.
//		fsa.generateFile(filename + ".java", mapCBS(cbs))
	}

	// Code generation.	
	// -------------------------------------------------------------------------------------
	// Interfaces.
	def generateInterfaces(EList<Interface> ifaces, String mainPackageName) {

		for (iface : ifaces) {
			println(mapInterface(iface, mainPackageName))
		}

	}

	def mapInterface(Interface iface, String mainPackageName) '''
		package «mainPackageName»;
			
		public interface «iface.name» {
			«FOR sig : iface.signature»
				«mapSignature(sig)»
			«ENDFOR»
		}
	'''

	def mapSignature(Signature sig) '''
		public «sig.returntype.name» «sig.name»(«
			FOR p : sig.parameter SEPARATOR ", " AFTER ""»«
				»«IF p.parametertype != null && p.name != null»«
					p.parametertype.name» «p.name
				»«ENDIF»«
			»«ENDFOR»);
	'''
}
