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
public class RepositoryToJava implements IGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    EList<EObject> _contents = input.getContents();
    for (final EObject o : _contents) {
      this.compile(o, fsa);
    }
  }
  
  /**
   * Catch not supported input resources.
   */
  protected void _compile(final EObject obj, final IFileSystemAccess fsa) {
    String _string = obj.toString();
    String _plus = ("Warning, no generator defined for input resource " + _string);
    InputOutput.<String>println(_plus);
  }
  
  /**
   * Generate java code from CBS repository model.
   */
  protected void _compile(final ComponentBasedSystem cbs, final IFileSystemAccess fsa) {
    final String filename = "MyRepo";
    final Repository repo = cbs.getRepository();
    CharSequence _mapRepository = this.mapRepository(repo);
    fsa.generateFile((filename + ".java"), _mapRepository);
  }
  
  public CharSequence mapRepository(final Repository repo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("class Test {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("system.out.println(\"Hello World.\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
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
