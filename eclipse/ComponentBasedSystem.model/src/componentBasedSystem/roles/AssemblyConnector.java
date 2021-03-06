/**
 */
package componentBasedSystem.roles;

import componentBasedSystem.AssemblyContext;
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
 *   <li>{@link componentBasedSystem.roles.AssemblyConnector#getName <em>Name</em>}</li>
 *   <li>{@link componentBasedSystem.roles.AssemblyConnector#getProvidedAssemblyContext <em>Provided Assembly Context</em>}</li>
 *   <li>{@link componentBasedSystem.roles.AssemblyConnector#getRequiredAssemblyContext <em>Required Assembly Context</em>}</li>
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
	 * @see componentBasedSystem.roles.RolesPackage#getAssemblyConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentBasedSystem.roles.AssemblyConnector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provided Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Assembly Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Assembly Context</em>' reference.
	 * @see #setProvidedAssemblyContext(AssemblyContext)
	 * @see componentBasedSystem.roles.RolesPackage#getAssemblyConnector_ProvidedAssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getProvidedAssemblyContext();

	/**
	 * Sets the value of the '{@link componentBasedSystem.roles.AssemblyConnector#getProvidedAssemblyContext <em>Provided Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Assembly Context</em>' reference.
	 * @see #getProvidedAssemblyContext()
	 * @generated
	 */
	void setProvidedAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Required Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Assembly Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Assembly Context</em>' reference.
	 * @see #setRequiredAssemblyContext(AssemblyContext)
	 * @see componentBasedSystem.roles.RolesPackage#getAssemblyConnector_RequiredAssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getRequiredAssemblyContext();

	/**
	 * Sets the value of the '{@link componentBasedSystem.roles.AssemblyConnector#getRequiredAssemblyContext <em>Required Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Assembly Context</em>' reference.
	 * @see #getRequiredAssemblyContext()
	 * @generated
	 */
	void setRequiredAssemblyContext(AssemblyContext value);

} // AssemblyConnector
