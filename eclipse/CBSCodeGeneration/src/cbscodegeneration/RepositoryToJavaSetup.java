package cbscodegeneration;

import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class RepositoryToJavaSetup implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {

		// Set up standalone OCL.
		org.eclipse.ocl.pivot.uml.UMLStandaloneSetup.init();
		org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup.doSetup();
		org.eclipse.ocl.xtext.oclinecore.OCLinEcoreStandaloneSetup.doSetup();
		org.eclipse.ocl.xtext.oclstdlib.OCLstdlibStandaloneSetup.doSetup();

		// Set up injector.
		return Guice.createInjector(new RepositoryToJavaModule());

	}

}
