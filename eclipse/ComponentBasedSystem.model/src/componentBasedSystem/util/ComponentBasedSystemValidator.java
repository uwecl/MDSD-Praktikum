/**
 */
package componentBasedSystem.util;

import componentBasedSystem.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see componentBasedSystem.ComponentBasedSystemPackage
 * @generated
 */
public class ComponentBasedSystemValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ComponentBasedSystemValidator INSTANCE = new ComponentBasedSystemValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "componentBasedSystem";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentBasedSystemValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ComponentBasedSystemPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM:
				return validateComponentBasedSystem((ComponentBasedSystem)value, diagnostics, context);
			case ComponentBasedSystemPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case ComponentBasedSystemPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case ComponentBasedSystemPackage.COMPOSITE_COMPONENT:
				return validateCompositeComponent((CompositeComponent)value, diagnostics, context);
			case ComponentBasedSystemPackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case ComponentBasedSystemPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case ComponentBasedSystemPackage.SIGNATURE:
				return validateSignature((Signature)value, diagnostics, context);
			case ComponentBasedSystemPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case ComponentBasedSystemPackage.ASSEMBLY_CONTEXT:
				return validateAssemblyContext((AssemblyContext)value, diagnostics, context);
			case ComponentBasedSystemPackage.ALLOCATION_CONTEXT:
				return validateAllocationContext((AllocationContext)value, diagnostics, context);
			case ComponentBasedSystemPackage.DELEGATION_CONNECTOR:
				return validateDelegationConnector((DelegationConnector)value, diagnostics, context);
			case ComponentBasedSystemPackage.ENVIRONMENT:
				return validateEnvironment((Environment)value, diagnostics, context);
			case ComponentBasedSystemPackage.REPOSITORY:
				return validateRepository((Repository)value, diagnostics, context);
			case ComponentBasedSystemPackage.ALLOCATION:
				return validateAllocation((Allocation)value, diagnostics, context);
			case ComponentBasedSystemPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentBasedSystem(ComponentBasedSystem componentBasedSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentBasedSystem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentBasedSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentBasedSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentBasedSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentBasedSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentBasedSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentBasedSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentBasedSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentBasedSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentBasedSystem_SameParentContainerOrLinkedContainerOfconnectedAssemblyContexts(componentBasedSystem, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SameParentContainerOrLinkedContainerOfconnectedAssemblyContexts constraint of '<em>Component Based System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_BASED_SYSTEM__SAME_PARENT_CONTAINER_OR_LINKED_CONTAINER_OFCONNECTED_ASSEMBLY_CONTEXTS__EEXPRESSION = "\n" +
		"\t  \tself.assemblyconnector->forAll( a | \n" +
		"\t  \tlet c1 : Container = GetContainerOfContext(a.providedAssemblyContext),\n" +
		"\t  \t\tc2: Container = GetContainerOfContext(a.requiredAssemblyContext)\n" +
		"\t  \tin c1 = c2  or environment.IsLinked(c1,c2))";

	/**
	 * Validates the SameParentContainerOrLinkedContainerOfconnectedAssemblyContexts constraint of '<em>Component Based System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentBasedSystem_SameParentContainerOrLinkedContainerOfconnectedAssemblyContexts(ComponentBasedSystem componentBasedSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM,
				 componentBasedSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SameParentContainerOrLinkedContainerOfconnectedAssemblyContexts",
				 COMPONENT_BASED_SYSTEM__SAME_PARENT_CONTAINER_OR_LINKED_CONTAINER_OFCONNECTED_ASSEMBLY_CONTEXTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interface_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeComponent(CompositeComponent compositeComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeComponent_SameInterfaceDelegated(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeComponent_RoleCount(compositeComponent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SameInterfaceDelegated constraint of '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_COMPONENT__SAME_INTERFACE_DELEGATED__EEXPRESSION = "\n" +
		"\t\tself.delegationconnector->\n" +
		"\t\tforAll( d | d.role->includesAll(providedrole) or d.role->includesAll(requiredrole))";

	/**
	 * Validates the SameInterfaceDelegated constraint of '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeComponent_SameInterfaceDelegated(CompositeComponent compositeComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentBasedSystemPackage.Literals.COMPOSITE_COMPONENT,
				 compositeComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SameInterfaceDelegated",
				 COMPOSITE_COMPONENT__SAME_INTERFACE_DELEGATED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RoleCount constraint of '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_COMPONENT__ROLE_COUNT__EEXPRESSION = "\n" +
		"\t\tself.delegationconnector->size() = self.requiredrole->size() + self.providedrole->size()";

	/**
	 * Validates the RoleCount constraint of '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeComponent_RoleCount(CompositeComponent compositeComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentBasedSystemPackage.Literals.COMPOSITE_COMPONENT,
				 compositeComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RoleCount",
				 COMPOSITE_COMPONENT__ROLE_COUNT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(container, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignature(Signature signature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyContext(AssemblyContext assemblyContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assemblyContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationContext(AllocationContext allocationContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allocationContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationConnector_DelegationConnectorRolesType(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationConnector_DelegationConnectorRolesInterface(delegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DelegationConnectorRolesType constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_CONNECTOR__DELEGATION_CONNECTOR_ROLES_TYPE__EEXPRESSION = "\t\t \n" +
		"\t\tself.role->first().oclType() = self.role->last().oclType()";

	/**
	 * Validates the DelegationConnectorRolesType constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector_DelegationConnectorRolesType(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentBasedSystemPackage.Literals.DELEGATION_CONNECTOR,
				 delegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DelegationConnectorRolesType",
				 DELEGATION_CONNECTOR__DELEGATION_CONNECTOR_ROLES_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DelegationConnectorRolesInterface constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_CONNECTOR__DELEGATION_CONNECTOR_ROLES_INTERFACE__EEXPRESSION = "\t\t \n" +
		"\t\tself.role->first().interface = self.role->last().interface";

	/**
	 * Validates the DelegationConnectorRolesInterface constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector_DelegationConnectorRolesInterface(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentBasedSystemPackage.Literals.DELEGATION_CONNECTOR,
				 delegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DelegationConnectorRolesInterface",
				 DELEGATION_CONNECTOR__DELEGATION_CONNECTOR_ROLES_INTERFACE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironment(Environment environment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocation_NestedComponentAllocation(allocation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NestedComponentAllocation constraint of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALLOCATION__NESTED_COMPONENT_ALLOCATION__EEXPRESSION = " \n" +
		"\t\tlet composites : Collection(CompositeComponent) = \n" +
		"\t\tself.allocationcontext->select(a | a.assemblycontext.component.oclIsTypeOf(CompositeComponent)).assemblycontext.component.oclAsType(CompositeComponent)\n" +
		"\t\tin self.allocationcontext.assemblycontext->excludesAll(composites.assemblycontext)";

	/**
	 * Validates the NestedComponentAllocation constraint of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation_NestedComponentAllocation(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentBasedSystemPackage.Literals.ALLOCATION,
				 allocation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NestedComponentAllocation",
				 ALLOCATION__NESTED_COMPONENT_ALLOCATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ComponentBasedSystemValidator
