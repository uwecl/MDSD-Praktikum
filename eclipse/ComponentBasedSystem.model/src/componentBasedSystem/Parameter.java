/**
 */
package componentBasedSystem;

import componentBasedSystem.dataTypes.ParameterType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link componentBasedSystem.Parameter#getParametertype <em>Parametertype</em>}</li>
 * </ul>
 *
 * @see componentBasedSystem.ComponentBasedSystemPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentBasedSystem.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parametertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametertype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametertype</em>' reference.
	 * @see #setParametertype(ParameterType)
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getParameter_Parametertype()
	 * @model required="true"
	 * @generated
	 */
	ParameterType getParametertype();

	/**
	 * Sets the value of the '{@link componentBasedSystem.Parameter#getParametertype <em>Parametertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametertype</em>' reference.
	 * @see #getParametertype()
	 * @generated
	 */
	void setParametertype(ParameterType value);

} // Parameter
