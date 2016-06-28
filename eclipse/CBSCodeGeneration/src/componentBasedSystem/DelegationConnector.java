/**
 */
package componentBasedSystem;

import componentBasedSystem.roles.Role;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link componentBasedSystem.DelegationConnector#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see componentBasedSystem.ComponentBasedSystemPackage#getDelegationConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DelegationConnectorRolesType DelegationConnectorRolesInterface'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot DelegationConnectorRolesType='\t\t \n\t\tself.role->first().oclType() = self.role->last().oclType()' DelegationConnectorRolesInterface='\t\t \n\t\tself.role->first().interface = self.role->last().interface'"
 * @generated
 */
public interface DelegationConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link componentBasedSystem.roles.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getDelegationConnector_Role()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Role> getRole();

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
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getDelegationConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentBasedSystem.DelegationConnector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DelegationConnector
