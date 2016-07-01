package codegen;

import com.google.common.base.Objects;
import componentBasedSystem.ComponentBasedSystem;
import componentBasedSystem.Interface;
import componentBasedSystem.Parameter;
import componentBasedSystem.Repository;
import componentBasedSystem.Signature;
import componentBasedSystem.dataTypes.ParameterType;
import componentBasedSystem.dataTypes.ReturnType;
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
    final String mainPackageName = "repository";
    final Repository repository = cbs.getRepository();
    final EList<Interface> ifaces = repository.getInterface();
    this.generateInterfaces(ifaces, mainPackageName);
  }
  
  public void generateInterfaces(final EList<Interface> ifaces, final String mainPackageName) {
    for (final Interface iface : ifaces) {
      CharSequence _mapInterface = this.mapInterface(iface, mainPackageName);
      InputOutput.<CharSequence>println(_mapInterface);
    }
  }
  
  public CharSequence mapInterface(final Interface iface, final String mainPackageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(mainPackageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public interface ");
    String _name = iface.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Signature> _signature = iface.getSignature();
      for(final Signature sig : _signature) {
        _builder.append("\t");
        CharSequence _mapSignature = this.mapSignature(sig);
        _builder.append(_mapSignature, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mapSignature(final Signature sig) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    ReturnType _returntype = sig.getReturntype();
    String _name = _returntype.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _name_1 = sig.getName();
    _builder.append(_name_1, "");
    _builder.append("(");
    {
      EList<Parameter> _parameter = sig.getParameter();
      boolean _hasElements = false;
      for(final Parameter p : _parameter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        {
          if (((!Objects.equal(p.getParametertype(), null)) && (!Objects.equal(p.getName(), null)))) {
            ParameterType _parametertype = p.getParametertype();
            String _name_2 = _parametertype.getName();
            _builder.append(_name_2, "");
            _builder.append(" ");
            String _name_3 = p.getName();
            _builder.append(_name_3, "");
          }
        }
      }
      if (_hasElements) {
        _builder.append("", "");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
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
