/**
 */
package componentBasedSystem.dataTypes.impl;

import componentBasedSystem.ComponentBasedSystemPackage;

import componentBasedSystem.behaviourDescription.BehaviourDescriptionPackage;

import componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionPackageImpl;

import componentBasedSystem.dataTypes.Complex;
import componentBasedSystem.dataTypes.DataTypesFactory;
import componentBasedSystem.dataTypes.DataTypesPackage;
import componentBasedSystem.dataTypes.ParameterType;
import componentBasedSystem.dataTypes.ReturnType;
import componentBasedSystem.dataTypes.Simple;
import componentBasedSystem.dataTypes.Type;

import componentBasedSystem.dataTypes.simpleTypes;
import componentBasedSystem.impl.ComponentBasedSystemPackageImpl;

import componentBasedSystem.roles.RolesPackage;

import componentBasedSystem.roles.impl.RolesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypesPackageImpl extends EPackageImpl implements DataTypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum simpleTypesEEnum = null;

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
	 * @see componentBasedSystem.dataTypes.DataTypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataTypesPackageImpl() {
		super(eNS_URI, DataTypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataTypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataTypesPackage init() {
		if (isInited) return (DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI);

		// Obtain or create and register package
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataTypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ComponentBasedSystemPackageImpl theComponentBasedSystemPackage = (ComponentBasedSystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentBasedSystemPackage.eNS_URI) instanceof ComponentBasedSystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentBasedSystemPackage.eNS_URI) : ComponentBasedSystemPackage.eINSTANCE);
		BehaviourDescriptionPackageImpl theBehaviourDescriptionPackage = (BehaviourDescriptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviourDescriptionPackage.eNS_URI) instanceof BehaviourDescriptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviourDescriptionPackage.eNS_URI) : BehaviourDescriptionPackage.eINSTANCE);
		RolesPackageImpl theRolesPackage = (RolesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) instanceof RolesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) : RolesPackage.eINSTANCE);

		// Create package meta-data objects
		theDataTypesPackage.createPackageContents();
		theComponentBasedSystemPackage.createPackageContents();
		theBehaviourDescriptionPackage.createPackageContents();
		theRolesPackage.createPackageContents();

		// Initialize created meta-data
		theDataTypesPackage.initializePackageContents();
		theComponentBasedSystemPackage.initializePackageContents();
		theBehaviourDescriptionPackage.initializePackageContents();
		theRolesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataTypesPackage.eNS_URI, theDataTypesPackage);
		return theDataTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimple() {
		return simpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimple_Kind() {
		return (EAttribute)simpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplex() {
		return complexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplex_Simple() {
		return (EReference)complexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterType() {
		return parameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoid() {
		return voidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnType() {
		return returnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Name() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getsimpleTypes() {
		return simpleTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesFactory getDataTypesFactory() {
		return (DataTypesFactory)getEFactoryInstance();
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
		simpleEClass = createEClass(SIMPLE);
		createEAttribute(simpleEClass, SIMPLE__KIND);

		complexEClass = createEClass(COMPLEX);
		createEReference(complexEClass, COMPLEX__SIMPLE);

		parameterTypeEClass = createEClass(PARAMETER_TYPE);

		voidEClass = createEClass(VOID);

		returnTypeEClass = createEClass(RETURN_TYPE);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__NAME);

		// Create enums
		simpleTypesEEnum = createEEnum(SIMPLE_TYPES);
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
		simpleEClass.getESuperTypes().add(this.getParameterType());
		simpleEClass.getESuperTypes().add(this.getReturnType());
		complexEClass.getESuperTypes().add(this.getReturnType());
		complexEClass.getESuperTypes().add(this.getParameterType());
		parameterTypeEClass.getESuperTypes().add(this.getType());
		voidEClass.getESuperTypes().add(this.getReturnType());
		returnTypeEClass.getESuperTypes().add(this.getType());

		// Initialize classes, features, and operations; add parameters
		initEClass(simpleEClass, Simple.class, "Simple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimple_Kind(), this.getsimpleTypes(), "kind", "int", 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexEClass, Complex.class, "Complex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplex_Simple(), this.getSimple(), null, "simple", null, 2, -1, Complex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(voidEClass, componentBasedSystem.dataTypes.Void.class, "Void", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnTypeEClass, ReturnType.class, "ReturnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(simpleTypesEEnum, simpleTypes.class, "simpleTypes");
		addEEnumLiteral(simpleTypesEEnum, simpleTypes.INT);
		addEEnumLiteral(simpleTypesEEnum, simpleTypes.BOOLEAN);
		addEEnumLiteral(simpleTypesEEnum, simpleTypes.CHAR);
		addEEnumLiteral(simpleTypesEEnum, simpleTypes.DATE);
		addEEnumLiteral(simpleTypesEEnum, simpleTypes.DOUBLE);
		addEEnumLiteral(simpleTypesEEnum, simpleTypes.FLOAT);
		addEEnumLiteral(simpleTypesEEnum, simpleTypes.LIST);
		addEEnumLiteral(simpleTypesEEnum, simpleTypes.LONG);
		addEEnumLiteral(simpleTypesEEnum, simpleTypes.MAP);
		addEEnumLiteral(simpleTypesEEnum, simpleTypes.STRING);
	}

} //DataTypesPackageImpl
