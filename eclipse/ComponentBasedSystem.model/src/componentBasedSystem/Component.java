/**
 */
package componentBasedSystem;

import componentBasedSystem.behaviourDescription.BehaviourDescription;

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
 *   <li>{@link componentBasedSystem.Component#getProvided <em>Provided</em>}</li>
 *   <li>{@link componentBasedSystem.Component#getRequired <em>Required</em>}</li>
 *   <li>{@link componentBasedSystem.Component#getService <em>Service</em>}</li>
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
	 * Returns the value of the '<em><b>Provided</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' reference.
	 * @see #setProvided(Interface)
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponent_Provided()
	 * @model required="true"
	 * @generated
	 */
	Interface getProvided();

	/**
	 * Sets the value of the '{@link componentBasedSystem.Component#getProvided <em>Provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided</em>' reference.
	 * @see #getProvided()
	 * @generated
	 */
	void setProvided(Interface value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link componentBasedSystem.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponent_Required()
	 * @model
	 * @generated
	 */
	EList<Interface> getRequired();

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

} // Component
