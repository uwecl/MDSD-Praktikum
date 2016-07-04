package codegen;

import com.google.common.base.Objects;
import componentBasedSystem.Component;
import componentBasedSystem.ComponentBasedSystem;
import componentBasedSystem.CompositeComponent;
import componentBasedSystem.Interface;
import componentBasedSystem.Parameter;
import componentBasedSystem.Repository;
import componentBasedSystem.Signature;
import componentBasedSystem.dataTypes.ParameterType;
import componentBasedSystem.dataTypes.ReturnType;
import componentBasedSystem.roles.ProvidedRole;
import componentBasedSystem.roles.RequiredRole;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.StringExtensions;

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
    final String exportDir = "output";
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(exportDir, "");
    _builder.append("/");
    _builder.append(mainPackageName, "");
    final String mainPackagePath = _builder.toString();
    final Repository repository = cbs.getRepository();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(exportDir, "");
    _builder_1.append("/");
    _builder_1.append(mainPackageName, "");
    this.createFolder(_builder_1.toString());
    this.generateHelper(mainPackageName, mainPackagePath);
    final EList<Interface> ifaces = repository.getInterface();
    this.generateInterfaces(ifaces, mainPackageName, mainPackagePath);
    final EList<Component> components = repository.getComponent();
    this.generateComponents(components, mainPackageName, exportDir);
  }
  
  public boolean createFolder(final String path) {
    boolean _xblockexpression = false;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Create folder ");
      _builder.append(path, "");
      InputOutput.<String>println(_builder.toString());
      File _file = new File(path);
      _xblockexpression = _file.mkdirs();
    }
    return _xblockexpression;
  }
  
  public void writeCodeToFile(final CharSequence code, final String filePath) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Write code to ");
      _builder.append(filePath, "");
      InputOutput.<String>println(_builder.toString());
      final PrintWriter writer = new PrintWriter(filePath, "UTF-8");
      writer.println(code);
      writer.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void generateHelper(final String mainPackageName, final String exportDirPath) {
    final CharSequence code = this.createHelperClass(mainPackageName);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(exportDirPath, "");
    _builder.append("/Helper.java");
    this.writeCodeToFile(code, _builder.toString());
  }
  
  public CharSequence createHelperClass(final String mainPackageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(mainPackageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class Helper {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void assertNull(Object o) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(o != null) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("System.out.println(\"[AssertNull] Test failed! Element is not null!\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void assertNotNull(Object o) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(o == null) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("System.out.println(\"[AssertNotNull] Test failed! Element is null!\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public void generateInterfaces(final EList<Interface> ifaces, final String mainPackageName, final String exportDirPath) {
    for (final Interface iface : ifaces) {
      {
        final CharSequence code = this.mapInterface(iface, mainPackageName);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(exportDirPath, "");
        _builder.append("/");
        String _name = iface.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "");
        _builder.append(".java");
        this.writeCodeToFile(code, _builder.toString());
      }
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
        _builder.append(";");
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
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public void generateComponents(final EList<Component> components, final String mainPackageName, final String exportDirPath) {
    for (final Component c : components) {
      if (((c instanceof CompositeComponent) == false)) {
        final CharSequence code = this.mapComponent(c, mainPackageName);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(exportDirPath, "");
        _builder.append("/");
        String _name = c.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "");
        this.createFolder(_builder.toString());
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(exportDirPath, "");
        _builder_1.append("/");
        String _name_1 = c.getName();
        _builder_1.append(_name_1, "");
        _builder_1.append("/");
        String _name_2 = c.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
        _builder_1.append(_firstUpper_1, "");
        _builder_1.append("Impl.java");
        this.writeCodeToFile(code, _builder_1.toString());
      }
    }
  }
  
  public CharSequence mapComponent(final Component c, final String mainPackageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name = c.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _generateImports = this.generateImports(c, mainPackageName);
    _builder.append(_generateImports, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = c.getName();
    _builder.append(_name_1, "");
    _builder.append("Impl ");
    CharSequence _mapProvidedRoles = this.mapProvidedRoles(c);
    _builder.append(_mapProvidedRoles, "");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    EList<RequiredRole> _requiredrole = c.getRequiredrole();
    CharSequence _mapRequiredInterfaces = this.mapRequiredInterfaces(_requiredrole);
    _builder.append(_mapRequiredInterfaces, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _mapMethodsToImplement = this.mapMethodsToImplement(c);
    _builder.append(_mapMethodsToImplement, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    EList<RequiredRole> _requiredrole_1 = c.getRequiredrole();
    CharSequence _mapSetterMethods = this.mapSetterMethods(_requiredrole_1);
    _builder.append(_mapSetterMethods, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateImports(final Component c, final String mainPackageName) {
    CharSequence _xblockexpression = null;
    {
      final ArrayList<String> imports = CollectionLiterals.<String>newArrayList();
      ProvidedRole _providedrole = c.getProvidedrole();
      boolean _notEquals = (!Objects.equal(_providedrole, null));
      if (_notEquals) {
        ProvidedRole _providedrole_1 = c.getProvidedrole();
        Interface _interface = _providedrole_1.getInterface();
        String _name = _interface.getName();
        imports.add(_name);
      }
      EList<RequiredRole> _requiredrole = c.getRequiredrole();
      for (final RequiredRole rRole : _requiredrole) {
        Interface _interface_1 = rRole.getInterface();
        String _name_1 = _interface_1.getName();
        boolean _contains = imports.contains(_name_1);
        boolean _not = (!_contains);
        if (_not) {
          Interface _interface_2 = rRole.getInterface();
          String _name_2 = _interface_2.getName();
          imports.add(_name_2);
        }
      }
      EList<RequiredRole> _requiredrole_1 = c.getRequiredrole();
      int _size = _requiredrole_1.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        imports.add("Helper");
      }
      _xblockexpression = this.mapImports(imports, mainPackageName);
    }
    return _xblockexpression;
  }
  
  /**
   * Our meta model supports only one provided role for a component at the moment.
   * TODO: Adapt this to support several provided roles if the meta model was adapted
   */
  public CharSequence mapImports(final ArrayList<String> imports, final String mainPackageName) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String i : imports) {
        _builder.append("import ");
        _builder.append(mainPackageName, "");
        _builder.append(".");
        _builder.append(i, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence mapRequiredInterfaces(final EList<RequiredRole> rRoles) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final RequiredRole r : rRoles) {
        Interface _interface = r.getInterface();
        String _name = _interface.getName();
        _builder.append(_name, "");
        _builder.append(" ");
        Interface _interface_1 = r.getInterface();
        String _name_1 = _interface_1.getName();
        String _firstLower = StringExtensions.toFirstLower(_name_1);
        _builder.append(_firstLower, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  /**
   * Our meta model supports only one provided role for a component at the moment.
   * TODO: Adapt this to support several provided roles if the meta model was adapted
   */
  public CharSequence mapProvidedRoles(final Component c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ProvidedRole _providedrole = c.getProvidedrole();
      boolean _notEquals = (!Objects.equal(_providedrole, null));
      if (_notEquals) {
        _builder.append("implements ");
        ProvidedRole _providedrole_1 = c.getProvidedrole();
        Interface _interface = _providedrole_1.getInterface();
        String _name = _interface.getName();
        _builder.append(_name, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Our meta model supports only one provided role for a component at the moment.
   * TODO: Adapt this to support several provided roles if the meta model was adapted
   */
  public CharSequence mapMethodsToImplement(final Component c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ProvidedRole _providedrole = c.getProvidedrole();
      Interface _interface = _providedrole.getInterface();
      EList<Signature> _signature = _interface.getSignature();
      for(final Signature s : _signature) {
        _builder.append("// Implementing ");
        String _name = s.getName();
        _builder.append(_name, "");
        _builder.append(" from interface ");
        ProvidedRole _providedrole_1 = c.getProvidedrole();
        Interface _interface_1 = _providedrole_1.getInterface();
        String _name_1 = _interface_1.getName();
        _builder.append(_name_1, "");
        _builder.append(".");
        _builder.newLineIfNotEmpty();
        _builder.append("@Override");
        _builder.newLine();
        CharSequence _mapSignature = this.mapSignature(s);
        _builder.append(_mapSignature, "");
        _builder.append("{");
        _builder.newLineIfNotEmpty();
        {
          EList<RequiredRole> _requiredrole = c.getRequiredrole();
          for(final RequiredRole rRole : _requiredrole) {
            _builder.append("\t");
            _builder.append("Helper.assertNotNull(this.");
            Interface _interface_2 = rRole.getInterface();
            String _name_2 = _interface_2.getName();
            String _firstLower = StringExtensions.toFirstLower(_name_2);
            _builder.append(_firstLower, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("// TODO: Insert code here.");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence mapSetterMethods(final EList<RequiredRole> rRoles) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = rRoles.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("// Setter methods.");
        _builder.newLine();
      }
    }
    {
      for(final RequiredRole r : rRoles) {
        _builder.append("public void set");
        Interface _interface = r.getInterface();
        String _name = _interface.getName();
        _builder.append(_name, "");
        _builder.append("(");
        Interface _interface_1 = r.getInterface();
        String _name_1 = _interface_1.getName();
        _builder.append(_name_1, "");
        _builder.append(" ");
        Interface _interface_2 = r.getInterface();
        String _name_2 = _interface_2.getName();
        String _firstLower = StringExtensions.toFirstLower(_name_2);
        _builder.append(_firstLower, "");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("Helper.assertNull(this.");
        Interface _interface_3 = r.getInterface();
        String _name_3 = _interface_3.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
        _builder.append(_firstLower_1, "\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this.");
        Interface _interface_4 = r.getInterface();
        String _name_4 = _interface_4.getName();
        String _firstLower_2 = StringExtensions.toFirstLower(_name_4);
        _builder.append(_firstLower_2, "\t");
        _builder.append(" = ");
        Interface _interface_5 = r.getInterface();
        String _name_5 = _interface_5.getName();
        String _firstLower_3 = StringExtensions.toFirstLower(_name_5);
        _builder.append(_firstLower_3, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
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
