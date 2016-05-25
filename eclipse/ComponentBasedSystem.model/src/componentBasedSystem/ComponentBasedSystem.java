/**
 */
package componentBasedSystem;

import componentBasedSystem.dataTypes.Type;
import componentBasedSystem.roles.AssemblyConnector;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Based System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.ComponentBasedSystem#getInterface <em>Interface</em>}</li>
 *   <li>{@link componentBasedSystem.ComponentBasedSystem#getAssemblycontext <em>Assemblycontext</em>}</li>
 *   <li>{@link componentBasedSystem.ComponentBasedSystem#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link componentBasedSystem.ComponentBasedSystem#getType <em>Type</em>}</li>
 *   <li>{@link componentBasedSystem.ComponentBasedSystem#getAssemblyconnector <em>Assemblyconnector</em>}</li>
 *   <li>{@link componentBasedSystem.ComponentBasedSystem#getRepository <em>Repository</em>}</li>
 *   <li>{@link componentBasedSystem.ComponentBasedSystem#getAllocation <em>Allocation</em>}</li>
 * </ul>
 *
 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponentBasedSystem()
 * @model
 * @generated
 */
public interface ComponentBasedSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference list.
	 * The list contents are of type {@link componentBasedSystem.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference list.
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponentBasedSystem_Interface()
	 * @model required="true"
	 * @generated
	 */
	EList<Interface> getInterface();

	/**
	 * Returns the value of the '<em><b>Assemblycontext</b></em>' containment reference list.
	 * The list contents are of type {@link componentBasedSystem.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assemblycontext</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assemblycontext</em>' containment reference list.
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponentBasedSystem_Assemblycontext()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssemblyContext> getAssemblycontext();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see #setEnvironment(Environment)
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponentBasedSystem_Environment()
	 * @model required="true"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link componentBasedSystem.ComponentBasedSystem#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link componentBasedSystem.dataTypes.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponentBasedSystem_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getType();

	/**
	 * Returns the value of the '<em><b>Assemblyconnector</b></em>' containment reference list.
	 * The list contents are of type {@link componentBasedSystem.roles.AssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assemblyconnector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assemblyconnector</em>' containment reference list.
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponentBasedSystem_Assemblyconnector()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssemblyConnector> getAssemblyconnector();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(Repository)
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponentBasedSystem_Repository()
	 * @model
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link componentBasedSystem.ComponentBasedSystem#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation</em>' reference.
	 * @see #setAllocation(Allocation)
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getComponentBasedSystem_Allocation()
	 * @model
	 * @generated
	 */
	Allocation getAllocation();

	/**
	 * Sets the value of the '{@link componentBasedSystem.ComponentBasedSystem#getAllocation <em>Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation</em>' reference.
	 * @see #getAllocation()
	 * @generated
	 */
	void setAllocation(Allocation value);

} // ComponentBasedSystem
