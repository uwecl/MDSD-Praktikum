package cbscodegeneration;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

import codegen.RepositoryToJava;

public class RepositoryToJavaModule extends AbstractGenericResourceRuntimeModule{

	@Override
	protected String getLanguageName() {
		return "cbscodegeneration.presentation.SampleEditorID";
	}

	@Override
	protected String getFileExtensions() {
		return "componentbasedsystem";
	}
	
	public Class<? extends IGenerator> bindIGenerator() {
        return RepositoryToJava.class;
    }
 
    public Class<? extends ResourceSet> bindResourceSet() {
        return ResourceSetImpl.class;
    }

}
