package codegen

import componentBasedSystem.Component
import componentBasedSystem.ComponentBasedSystem
import componentBasedSystem.CompositeComponent
import componentBasedSystem.Interface
import componentBasedSystem.Signature
import componentBasedSystem.roles.RequiredRole
import java.util.ArrayList
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
		// Generate helper.
		generateHelper(mainPackageName)

		// Generate interfaces.
		val ifaces = repository.interface
		generateInterfaces(ifaces, mainPackageName)

		// Generate components.
		val components = repository.component
		generateComponents(components, mainPackageName)

//		TODO: Write output in files.
//		fsa.generateFile(filename + ".java", mapCBS(cbs))
	}

	// Code generation.	
	// -------------------------------------------------------------------------------------
	// Helper.
	def generateHelper(String mainPackageName) {
		println(createHelperClass(mainPackageName))
	}

	def createHelperClass(String mainPackageName) '''
		package «mainPackageName»;
		
		public class Helper {
			
			public static void assertNull(Object o) {
				if(o != null) {
					System.out.println("[AssertNull] Test failed! Element is not null!");
				}
			}
			
			public static void assertNotNull(Object o) {
				if(o == null) {
					System.out.println("[AssertNotNull] Test failed! Element is null!");
				}
			}
		}
	'''

	// Interfaces.
	def generateInterfaces(EList<Interface> ifaces, String mainPackageName) {

		for (iface : ifaces) {
			// TODO: Remove println to export source code in a file.
			println(mapInterface(iface, mainPackageName))
		}

	}

	def mapInterface(Interface iface, String mainPackageName) '''
		package «mainPackageName»;
			
		public interface «iface.name» {
			«FOR sig : iface.signature»
				«mapSignature(sig)»;
			«ENDFOR»
		}
	'''

	// TODO: Fix newline bug at the end.
	def mapSignature(Signature sig) '''
		public «sig.returntype.name» «sig.name»(«FOR p : sig.parameter SEPARATOR ", " AFTER ""»«
			»«IF p.parametertype != null && p.name != null»«
				p.parametertype.name» «p.name
			»«ENDIF»«
		»«ENDFOR»)
	'''

	// Components.
	def generateComponents(EList<Component> components, String mainPackageName) {

		for (c : components) {

			// Composite components should not be supported at the moment.
			if ((c instanceof CompositeComponent) == false) {
				// TODO: Remove println to export source code in a file.
				println(mapComponent(c, mainPackageName))
			}
		}
	}

	def mapComponent(Component c, String mainPackageName) '''
		package «mainPackageName»;
		
		«generateImports(c, mainPackageName)»
		
		public class «c.name» «mapProvidedRoles(c)»{
		
			«mapRequiredInterfaces(c.requiredrole)»
			
			«mapMethodsToImplement(c)»
			
			«mapSetterMethods(c.requiredrole)»
		}
	'''

	def generateImports(Component c, String mainPackageName) {

		val imports = newArrayList()

		// Add provided interfaces.
		// TODO: Adapt this to support several provided roles if the meta model was adapted.
		if (c.providedrole != null) {
			imports.add(c.providedrole.interface.name)
		}

		// Add required interfaces.
		for (rRole : c.requiredrole) {
			if (!imports.contains(rRole.interface.name)) {
				imports.add(rRole.interface.name)
			}
		}

		// Add other imports.
		if (c.requiredrole.size > 0) {
			imports.add("Helper")
		}

		// Generate import statements.
		mapImports(imports, mainPackageName)

	}

	/*
	 * Our meta model supports only one provided role for a component at the moment.
	 * TODO: Adapt this to support several provided roles if the meta model was adapted
	 */
	def mapImports(ArrayList<String> imports, String mainPackageName) '''
		«FOR i : imports»
			import «mainPackageName».«i»;
		«ENDFOR»
	'''

	def mapRequiredInterfaces(EList<RequiredRole> rRoles) '''
		«FOR r : rRoles»
			«r.interface.name » «r.interface.name.toFirstLower»;
		«ENDFOR»	
	'''

	/*
	 * Our meta model supports only one provided role for a component at the moment.
	 * TODO: Adapt this to support several provided roles if the meta model was adapted
	 */
	def mapProvidedRoles(Component c) '''
		«IF c.providedrole != null»implements «c.providedrole.interface.name»«ENDIF»
	'''

	/*
	 * Our meta model supports only one provided role for a component at the moment.
	 * TODO: Adapt this to support several provided roles if the meta model was adapted
	 */
	def mapMethodsToImplement(Component c) '''
		«FOR s : c.providedrole.interface.signature»
			// Implementing «s.name» from interface «c.providedrole.interface.name».
			@Override
			«mapSignature(s)»{
				«FOR rRole : c.requiredrole»
					Helper.assertNotNull(this.«rRole.interface.name.toFirstLower»);
				«ENDFOR»
				// TODO: Insert code here.
			}
		«ENDFOR»
	'''

	def mapSetterMethods(EList<RequiredRole> rRoles) '''
		«IF rRoles.size > 0»
			// Setter methods.
		«ENDIF»
		«FOR r : rRoles»
			public void set«r.interface.name»(«r.interface.name» «r.interface.name.toFirstLower»){
				Helper.assertNull(this.«r.interface.name.toFirstLower»);
				this.«r.interface.name.toFirstLower» = «r.interface.name.toFirstLower»;
			}
		«ENDFOR»
	'''
}
