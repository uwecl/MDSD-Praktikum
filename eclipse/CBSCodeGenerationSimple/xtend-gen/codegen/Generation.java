package codegen;

import codegen.Generator;
import componentBasedSystem.ComponentBasedSystemPackage;
import componentBasedSystem.behaviourDescription.BehaviourDescriptionPackage;
import componentBasedSystem.dataTypes.DataTypesPackage;
import componentBasedSystem.roles.RolesPackage;
import java.io.File;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Generation {
  public static void main(final String[] args) {
    InputOutput.<String>println("Starting Code Generation ...");
    Generation _generation = new Generation();
    _generation.readInputModel("inputModels/mfs.componentbasedsystem");
  }
  
  public void readInputModel(final String pathToInputModel) {
    try {
      this.doEMFSetup();
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      EPackage.Registry _packageRegistry = resourceSet.getPackageRegistry();
      _packageRegistry.put(ComponentBasedSystemPackage.eNS_URI, ComponentBasedSystemPackage.eINSTANCE);
      EPackage.Registry _packageRegistry_1 = resourceSet.getPackageRegistry();
      _packageRegistry_1.put(BehaviourDescriptionPackage.eNS_URI, BehaviourDescriptionPackage.eINSTANCE);
      EPackage.Registry _packageRegistry_2 = resourceSet.getPackageRegistry();
      _packageRegistry_2.put(DataTypesPackage.eNS_URI, DataTypesPackage.eINSTANCE);
      EPackage.Registry _packageRegistry_3 = resourceSet.getPackageRegistry();
      _packageRegistry_3.put(RolesPackage.eNS_URI, RolesPackage.eINSTANCE);
      File _file = new File(pathToInputModel);
      String _absolutePath = _file.getAbsolutePath();
      final URI resourceURI = URI.createFileURI(_absolutePath);
      final Resource resource = resourceSet.createResource(resourceURI);
      resource.load(null);
      final IFileSystemAccess fsa = null;
      Generator _generator = new Generator();
      _generator.doGenerate(resource, fsa);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Object doEMFSetup() {
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    return _extensionToFactoryMap.put("componentbasedsystem", _xMIResourceFactoryImpl);
  }
}
