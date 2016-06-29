/**
 */
package componentBasedSystem.behaviourDescription.impl;

import componentBasedSystem.ComponentBasedSystemPackage;

import componentBasedSystem.behaviourDescription.BehaviourDescription;
import componentBasedSystem.behaviourDescription.BehaviourDescriptionFactory;
import componentBasedSystem.behaviourDescription.BehaviourDescriptionPackage;
import componentBasedSystem.behaviourDescription.Branch;
import componentBasedSystem.behaviourDescription.DescriptionElement;
import componentBasedSystem.behaviourDescription.ExternalCall;
import componentBasedSystem.behaviourDescription.InternalAction;
import componentBasedSystem.behaviourDescription.Loop;

import componentBasedSystem.dataTypes.DataTypesPackage;

import componentBasedSystem.dataTypes.impl.DataTypesPackageImpl;

import componentBasedSystem.impl.ComponentBasedSystemPackageImpl;

import componentBasedSystem.roles.RolesPackage;

import componentBasedSystem.roles.impl.RolesPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourDescriptionPackageImpl extends EPackageImpl implements BehaviourDescriptionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviourDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see componentBasedSystem.behaviourDescription.BehaviourDescriptionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviourDescriptionPackageImpl() {
		super(eNS_URI, BehaviourDescriptionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BehaviourDescriptionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviourDescriptionPackage init() {
		if (isInited) return (BehaviourDescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviourDescriptionPackage.eNS_URI);

		// Obtain or create and register package
		BehaviourDescriptionPackageImpl theBehaviourDescriptionPackage = (BehaviourDescriptionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BehaviourDescriptionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BehaviourDescriptionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ComponentBasedSystemPackageImpl theComponentBasedSystemPackage = (ComponentBasedSystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentBasedSystemPackage.eNS_URI) instanceof ComponentBasedSystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentBasedSystemPackage.eNS_URI) : ComponentBasedSystemPackage.eINSTANCE);
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		RolesPackageImpl theRolesPackage = (RolesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) instanceof RolesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) : RolesPackage.eINSTANCE);

		// Create package meta-data objects
		theBehaviourDescriptionPackage.createPackageContents();
		theComponentBasedSystemPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theRolesPackage.createPackageContents();

		// Initialize created meta-data
		theBehaviourDescriptionPackage.initializePackageContents();
		theComponentBasedSystemPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theRolesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBehaviourDescriptionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehaviourDescriptionPackage.eNS_URI, theBehaviourDescriptionPackage);
		return theBehaviourDescriptionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionElement() {
		return descriptionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviourDescription() {
		return behaviourDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviourDescription_Descriptionelement() {
		return (EReference)behaviourDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalAction() {
		return internalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalCall() {
		return externalCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_Descriptionelement() {
		return (EReference)loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_Descriptionelement() {
		return (EReference)branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourDescriptionFactory getBehaviourDescriptionFactory() {
		return (BehaviourDescriptionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		descriptionElementEClass = createEClass(DESCRIPTION_ELEMENT);

		internalActionEClass = createEClass(INTERNAL_ACTION);

		externalCallEClass = createEClass(EXTERNAL_CALL);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__DESCRIPTIONELEMENT);

		branchEClass = createEClass(BRANCH);
		createEReference(branchEClass, BRANCH__DESCRIPTIONELEMENT);

		behaviourDescriptionEClass = createEClass(BEHAVIOUR_DESCRIPTION);
		createEReference(behaviourDescriptionEClass, BEHAVIOUR_DESCRIPTION__DESCRIPTIONELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		internalActionEClass.getESuperTypes().add(this.getDescriptionElement());
		externalCallEClass.getESuperTypes().add(this.getDescriptionElement());
		loopEClass.getESuperTypes().add(this.getDescriptionElement());
		branchEClass.getESuperTypes().add(this.getDescriptionElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(descriptionElementEClass, DescriptionElement.class, "DescriptionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(internalActionEClass, InternalAction.class, "InternalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalCallEClass, ExternalCall.class, "ExternalCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_Descriptionelement(), this.getDescriptionElement(), null, "descriptionelement", null, 0, -1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranch_Descriptionelement(), this.getDescriptionElement(), null, "descriptionelement", null, 0, -1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviourDescriptionEClass, BehaviourDescription.class, "BehaviourDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviourDescription_Descriptionelement(), this.getDescriptionElement(), null, "descriptionelement", null, 0, -1, BehaviourDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //BehaviourDescriptionPackageImpl
