package codegen

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

import componentBasedSystem.ComponentBasedSystem
import componentBasedSystem.Repository

class RepositoryToJava implements IGenerator {

	override doGenerate(Resource input, IFileSystemAccess fsa) {

		for (EObject o : input.contents) {
			compile(o, fsa)
		}

	}

	/**
	 * Catch not supported input resources.
	 */
	def dispatch void compile(EObject obj, IFileSystemAccess fsa) {
		println("Warning, no generator defined for input resource " + obj.toString)
	}

	/**
	 * Generate java code from CBS repository model.
	 */
	def dispatch void compile(ComponentBasedSystem cbs, IFileSystemAccess fsa) {

		val filename = "MyRepo" // TODO
		val Repository repo = cbs.repository
		fsa.generateFile(filename + ".java", mapRepository(repo))
	}

	def mapRepository(Repository repo) '''
		
		class Test {
			public static void main(String[] args) {
				system.out.println("Hello World.");
			}
		}
		
	'''

}
