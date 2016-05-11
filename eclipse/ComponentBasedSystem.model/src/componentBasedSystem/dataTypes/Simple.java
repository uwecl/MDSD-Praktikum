/**
 */
package componentBasedSystem.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.dataTypes.Simple#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see componentBasedSystem.dataTypes.DataTypesPackage#getSimple()
 * @model
 * @generated
 */
public interface Simple extends ParameterType, ReturnType {

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"int"</code>.
	 * The literals are from the enumeration {@link componentBasedSystem.dataTypes.simpleTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see componentBasedSystem.dataTypes.simpleTypes
	 * @see #setKind(simpleTypes)
	 * @see componentBasedSystem.dataTypes.DataTypesPackage#getSimple_Kind()
	 * @model default="int"
	 * @generated
	 */
	simpleTypes getKind();

	/**
	 * Sets the value of the '{@link componentBasedSystem.dataTypes.Simple#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see componentBasedSystem.dataTypes.simpleTypes
	 * @see #getKind()
	 * @generated
	 */
	void setKind(simpleTypes value);
} // Simple
