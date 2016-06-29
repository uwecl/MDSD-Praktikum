package codegen

import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject;

import componentBasedSystem.ComponentBasedSystem;
import componentBasedSystem.Repository

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
		
		val repository = cbs.repository
		
		println(mapCBS(cbs))
		println(mapRepository(repository))
		
//		TODO: Write output in files.
//		fsa.generateFile(filename + ".java", mapCBS(cbs))
	}
	

	// Code generation.
	def mapCBS(ComponentBasedSystem cbs) '''

		class MyName {
				
			public static void main(String[] args) {
				System.out.println("Hello World!");
			}
		}
		
	'''
	
	def mapRepository(Repository r) '''
		
		boolean areYouAwesome = true;
		
	'''
}