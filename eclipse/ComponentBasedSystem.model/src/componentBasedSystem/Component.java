/**
 */
package componentBasedSystem;

import componentBasedSystem.behaviourDescription.BehaviourDescription;

import componentBasedSystem.roles.ProvidedRole;
import componentBasedSystem.roles.RequiredRole;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.Component#getName <em>Name</em>}</li>
 *   <li>{@link componentBasedSystem.Component#getBehaviourdescription <em>Behaviourdescription</em>}</li>
 *   <li>{@link componentBasedSystem.Component#getService <em>Service</em>}</li>
 *   <li>{@link componentBasedSystem.Component#getRequiredrole <em>Requiredrole</em>}</li>
 *   <li>{@link componentBasedSystem.Component#getProvidedrole <em>Providedrole</em>}</li>
 * </ul>
 *
 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
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
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentBasedSystem.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Behaviourdescription</b></em>' containment reference list.
	 * The list contents are of type {@link componentBasedSystem.behaviourDescription.BehaviourDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviourdescription</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviourdescription</em>' containment reference list.
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponent_Behaviourdescription()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehaviourDescription> getBehaviourdescription();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link componentBasedSystem.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponent_Service()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Providedrole</b></em>' containment reference list.
	 * The list contents are of type {@link componentBasedSystem.roles.ProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providedrole</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providedrole</em>' containment reference list.
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponent_Providedrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProvidedRole> getProvidedrole();

	/**
	 * Returns the value of the '<em><b>Requiredrole</b></em>' containment reference list.
	 * The list contents are of type {@link componentBasedSystem.roles.RequiredRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requiredrole</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiredrole</em>' containment reference list.
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponent_Requiredrole()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredRole> getRequiredrole();

} // Component
