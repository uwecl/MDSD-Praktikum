/**
 */
package componentBasedSystem.dataTypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see componentBasedSystem.dataTypes.DataTypesPackage
 * @generated
 */
public interface DataTypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTypesFactory eINSTANCE = componentBasedSystem.dataTypes.impl.DataTypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple</em>'.
	 * @generated
	 */
	Simple createSimple();

	/**
	 * Returns a new object of class '<em>Complex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex</em>'.
	 * @generated
	 */
	Complex createComplex();

	/**
	 * Returns a new object of class '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Type</em>'.
	 * @generated
	 */
	ParameterType createParameterType();

	/**
	 * Returns a new object of class '<em>Void</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void</em>'.
	 * @generated
	 */
	Void createVoid();

	/**
	 * Returns a new object of class '<em>Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type</em>'.
	 * @generated
	 */
	ReturnType createReturnType();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataTypesPackage getDataTypesPackage();

} //DataTypesFactory
