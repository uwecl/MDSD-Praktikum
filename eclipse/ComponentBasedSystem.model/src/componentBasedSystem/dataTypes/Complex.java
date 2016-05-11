/**
 */
package componentBasedSystem.dataTypes;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.dataTypes.Complex#getSimple <em>Simple</em>}</li>
 * </ul>
 *
 * @see componentBasedSystem.dataTypes.DataTypesPackage#getComplex()
 * @model
 * @generated
 */
public interface Complex extends ReturnType, ParameterType {

	/**
	 * Returns the value of the '<em><b>Simple</b></em>' containment reference list.
	 * The list contents are of type {@link componentBasedSystem.dataTypes.Simple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple</em>' containment reference list.
	 * @see componentBasedSystem.dataTypes.DataTypesPackage#getComplex_Simple()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Simple> getSimple();
} // Complex
