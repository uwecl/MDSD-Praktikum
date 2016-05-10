/**
 */
package componentBasedSystem.dataTypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see componentBasedSystem.dataTypes.DataTypesFactory
 * @model kind="package"
 * @generated
 */
public interface DataTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.mdsdpc.componentBasedSystem/dataTypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dataTypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTypesPackage eINSTANCE = componentBasedSystem.dataTypes.impl.DataTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link componentBasedSystem.dataTypes.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.dataTypes.impl.TypeImpl
	 * @see componentBasedSystem.dataTypes.impl.DataTypesPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentBasedSystem.dataTypes.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.dataTypes.impl.ParameterTypeImpl
	 * @see componentBasedSystem.dataTypes.impl.DataTypesPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentBasedSystem.dataTypes.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.dataTypes.impl.SimpleImpl
	 * @see componentBasedSystem.dataTypes.impl.DataTypesPackageImpl#getSimple()
	 * @generated
	 */
	int SIMPLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__NAME = PARAMETER_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentBasedSystem.dataTypes.impl.ReturnTypeImpl <em>Return Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.dataTypes.impl.ReturnTypeImpl
	 * @see componentBasedSystem.dataTypes.impl.DataTypesPackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentBasedSystem.dataTypes.impl.ComplexImpl <em>Complex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.dataTypes.impl.ComplexImpl
	 * @see componentBasedSystem.dataTypes.impl.DataTypesPackageImpl#getComplex()
	 * @generated
	 */
	int COMPLEX = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX__NAME = RETURN_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FEATURE_COUNT = RETURN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPERATION_COUNT = RETURN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentBasedSystem.dataTypes.impl.VoidImpl <em>Void</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.dataTypes.impl.VoidImpl
	 * @see componentBasedSystem.dataTypes.impl.DataTypesPackageImpl#getVoid()
	 * @generated
	 */
	int VOID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID__NAME = RETURN_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_FEATURE_COUNT = RETURN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATION_COUNT = RETURN_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link componentBasedSystem.dataTypes.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see componentBasedSystem.dataTypes.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for class '{@link componentBasedSystem.dataTypes.Complex <em>Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex</em>'.
	 * @see componentBasedSystem.dataTypes.Complex
	 * @generated
	 */
	EClass getComplex();

	/**
	 * Returns the meta object for class '{@link componentBasedSystem.dataTypes.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see componentBasedSystem.dataTypes.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for class '{@link componentBasedSystem.dataTypes.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void</em>'.
	 * @see componentBasedSystem.dataTypes.Void
	 * @generated
	 */
	EClass getVoid();

	/**
	 * Returns the meta object for class '{@link componentBasedSystem.dataTypes.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type</em>'.
	 * @see componentBasedSystem.dataTypes.ReturnType
	 * @generated
	 */
	EClass getReturnType();

	/**
	 * Returns the meta object for class '{@link componentBasedSystem.dataTypes.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see componentBasedSystem.dataTypes.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link componentBasedSystem.dataTypes.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentBasedSystem.dataTypes.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataTypesFactory getDataTypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link componentBasedSystem.dataTypes.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.dataTypes.impl.SimpleImpl
		 * @see componentBasedSystem.dataTypes.impl.DataTypesPackageImpl#getSimple()
		 * @generated
		 */
		EClass SIMPLE = eINSTANCE.getSimple();

		/**
		 * The meta object literal for the '{@link componentBasedSystem.dataTypes.impl.ComplexImpl <em>Complex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.dataTypes.impl.ComplexImpl
		 * @see componentBasedSystem.dataTypes.impl.DataTypesPackageImpl#getComplex()
		 * @generated
		 */
		EClass COMPLEX = eINSTANCE.getComplex();

		/**
		 * The meta object literal for the '{@link componentBasedSystem.dataTypes.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.dataTypes.impl.ParameterTypeImpl
		 * @see componentBasedSystem.dataTypes.impl.DataTypesPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link componentBasedSystem.dataTypes.impl.VoidImpl <em>Void</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.dataTypes.impl.VoidImpl
		 * @see componentBasedSystem.dataTypes.impl.DataTypesPackageImpl#getVoid()
		 * @generated
		 */
		EClass VOID = eINSTANCE.getVoid();

		/**
		 * The meta object literal for the '{@link componentBasedSystem.dataTypes.impl.ReturnTypeImpl <em>Return Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.dataTypes.impl.ReturnTypeImpl
		 * @see componentBasedSystem.dataTypes.impl.DataTypesPackageImpl#getReturnType()
		 * @generated
		 */
		EClass RETURN_TYPE = eINSTANCE.getReturnType();

		/**
		 * The meta object literal for the '{@link componentBasedSystem.dataTypes.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.dataTypes.impl.TypeImpl
		 * @see componentBasedSystem.dataTypes.impl.DataTypesPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

	}

} //DataTypesPackage
