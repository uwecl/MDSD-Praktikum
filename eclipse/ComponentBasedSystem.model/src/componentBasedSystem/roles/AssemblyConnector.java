/**
 */
package componentBasedSystem.roles;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.roles.AssemblyConnector#getProvidedrole <em>Providedrole</em>}</li>
 *   <li>{@link componentBasedSystem.roles.AssemblyConnector#getRequiredrole <em>Requiredrole</em>}</li>
 * </ul>
 *
 * @see componentBasedSystem.roles.RolesPackage#getAssemblyConnector()
 * @model
 * @generated
 */
public interface AssemblyConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providedrole</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providedrole</em>' reference.
	 * @see #setProvidedrole(ProvidedRole)
	 * @see componentBasedSystem.roles.RolesPackage#getAssemblyConnector_Providedrole()
	 * @model required="true"
	 * @generated
	 */
	ProvidedRole getProvidedrole();

	/**
	 * Sets the value of the '{@link componentBasedSystem.roles.AssemblyConnector#getProvidedrole <em>Providedrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providedrole</em>' reference.
	 * @see #getProvidedrole()
	 * @generated
	 */
	void setProvidedrole(ProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Requiredrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requiredrole</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiredrole</em>' reference.
	 * @see #setRequiredrole(RequiredRole)
	 * @see componentBasedSystem.roles.RolesPackage#getAssemblyConnector_Requiredrole()
	 * @model required="true"
	 * @generated
	 */
	RequiredRole getRequiredrole();

	/**
	 * Sets the value of the '{@link componentBasedSystem.roles.AssemblyConnector#getRequiredrole <em>Requiredrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requiredrole</em>' reference.
	 * @see #getRequiredrole()
	 * @generated
	 */
	void setRequiredrole(RequiredRole value);

} // AssemblyConnector