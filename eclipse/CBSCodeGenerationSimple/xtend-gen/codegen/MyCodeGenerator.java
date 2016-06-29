package codegen;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class MyCodeGenerator {
  public static void main(final String[] args) {
    MyCodeGenerator _myCodeGenerator = new MyCodeGenerator();
    _myCodeGenerator.generate("inputModels/mfs.componentbasedsystem");
  }
  
  public void generate(final String file) {
    this.doEMFSetup();
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    URI _createURI = URI.createURI(file);
    final Resource resource = resourceSet.getResource(_createURI, true);
    EList<EObject> _contents = resource.getContents();
    for (final EObject content : _contents) {
      this.generateCode(content);
    }
  }
  
  protected CharSequence _generateCode(final EObject content) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class Hello {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public Object doEMFSetup() {
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    return _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
  }
  
  public CharSequence generateCode(final EObject content) {
    return _generateCode(content);
  }
}
