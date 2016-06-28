package cbscodegeneration;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class RepositoryToJavaSupport extends AbstractGenericResourceSupport {

	@Override
	protected Module createGuiceModule() {
		return new RepositoryToJavaModule();
	}

}
