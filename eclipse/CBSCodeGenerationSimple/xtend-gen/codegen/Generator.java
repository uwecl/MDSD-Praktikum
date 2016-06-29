package codegen;

import componentBasedSystem.ComponentBasedSystem;
import componentBasedSystem.Repository;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Generator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    for (final EObject o : _contents) {
      this.compile(o, fsa);
    }
  }
  
  protected void _compile(final EObject eObject, final IFileSystemAccess fsa) {
    String _string = eObject.toString();
    String _plus = ("Warning, no generator defined for input resource " + _string);
    InputOutput.<String>println(_plus);
  }
  
  protected void _compile(final ComponentBasedSystem cbs, final IFileSystemAccess fsa) {
    final Repository repository = cbs.getRepository();
    CharSequence _mapCBS = this.mapCBS(cbs);
    InputOutput.<CharSequence>println(_mapCBS);
    CharSequence _mapRepository = this.mapRepository(repository);
    InputOutput.<CharSequence>println(_mapRepository);
  }
  
  public CharSequence mapCBS(final ComponentBasedSystem cbs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("class MyName {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"Hello World!\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mapRepository(final Repository r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("boolean areYouAwesome = true;");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public void compile(final EObject cbs, final IFileSystemAccess fsa) {
    if (cbs instanceof ComponentBasedSystem) {
      _compile((ComponentBasedSystem)cbs, fsa);
      return;
    } else if (cbs != null) {
      _compile(cbs, fsa);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cbs, fsa).toString());
    }
  }
}
