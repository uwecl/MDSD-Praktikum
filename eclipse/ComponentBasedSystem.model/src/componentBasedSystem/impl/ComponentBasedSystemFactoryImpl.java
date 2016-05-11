/**
 */
package componentBasedSystem.impl;

import componentBasedSystem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentBasedSystemFactoryImpl extends EFactoryImpl implements ComponentBasedSystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentBasedSystemFactory init() {
		try {
			ComponentBasedSystemFactory theComponentBasedSystemFactory = (ComponentBasedSystemFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentBasedSystemPackage.eNS_URI);
			if (theComponentBasedSystemFactory != null) {
				return theComponentBasedSystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentBasedSystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentBasedSystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM: return createComponentBasedSystem();
			case ComponentBasedSystemPackage.COMPONENT: return createComponent();
			case ComponentBasedSystemPackage.INTERFACE: return createInterface();
			case ComponentBasedSystemPackage.COMPOSITE_COMPONENT: return createCompositeComponent();
			case ComponentBasedSystemPackage.CONTAINER: return createContainer();
			case ComponentBasedSystemPackage.LINK: return createLink();
			case ComponentBasedSystemPackage.SIGNATURE: return createSignature();
			case ComponentBasedSystemPackage.PARAMETER: return createParameter();
			case ComponentBasedSystemPackage.ASSEMBLY_CONTEXT: return createAssemblyContext();
			case ComponentBasedSystemPackage.ALLOCATION_CONTEXT: return createAllocationContext();
			case ComponentBasedSystemPackage.DELEGATION_CONNECTOR: return createDelegationConnector();
			case ComponentBasedSystemPackage.ENVIRONMENT: return createEnvironment();
			case ComponentBasedSystemPackage.REPOSITORY: return createRepository();
			case ComponentBasedSystemPackage.ALLOCATION: return createAllocation();
			case ComponentBasedSystemPackage.SERVICE: return createService();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentBasedSystem createComponentBasedSystem() {
		ComponentBasedSystemImpl componentBasedSystem = new ComponentBasedSystemImpl();
		return componentBasedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeComponent createCompositeComponent() {
		CompositeComponentImpl compositeComponent = new CompositeComponentImpl();
		return compositeComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public componentBasedSystem.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext createAssemblyContext() {
		AssemblyContextImpl assemblyContext = new AssemblyContextImpl();
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext createAllocationContext() {
		AllocationContextImpl allocationContext = new AllocationContextImpl();
		return allocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationConnector createDelegationConnector() {
		DelegationConnectorImpl delegationConnector = new DelegationConnectorImpl();
		return delegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation createAllocation() {
		AllocationImpl allocation = new AllocationImpl();
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentBasedSystemPackage getComponentBasedSystemPackage() {
		return (ComponentBasedSystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentBasedSystemPackage getPackage() {
		return ComponentBasedSystemPackage.eINSTANCE;
	}

} //ComponentBasedSystemFactoryImpl
