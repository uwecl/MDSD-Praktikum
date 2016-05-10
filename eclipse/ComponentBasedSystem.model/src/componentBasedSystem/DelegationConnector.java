/**
 */
package componentBasedSystem;

import componentBasedSystem.roles.Role;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.DelegationConnector#getRole <em>Role</em>}</li>
 *   <li>{@link componentBasedSystem.DelegationConnector#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see componentBasedSystem.ComponentBasedSystemPackage#getDelegationConnector()
 * @model
 * @generated
 */
public interface DelegationConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getDelegationConnector_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link componentBasedSystem.DelegationConnector#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getDelegationConnector_Interface()
	 * @model required="true"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link componentBasedSystem.DelegationConnector#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // DelegationConnector
