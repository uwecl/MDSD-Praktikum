package cbscodegeneration;

import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class RepositoryToJavaSetup implements ISetup{

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		
		// Set up injector.
		return Guice.createInjector(new RepositoryToJavaModule());
		
	}

}
