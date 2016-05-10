/**
 */
package componentBasedSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.AllocationContext#getContainer <em>Container</em>}</li>
 *   <li>{@link componentBasedSystem.AllocationContext#getAllocationcontext <em>Allocationcontext</em>}</li>
 * </ul>
 *
 * @see componentBasedSystem.ComponentBasedSystemPackage#getAllocationContext()
 * @model
 * @generated
 */
public interface AllocationContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Container)
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getAllocationContext_Container()
	 * @model required="true"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link componentBasedSystem.AllocationContext#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Allocationcontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocationcontext</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocationcontext</em>' reference.
	 * @see #setAllocationcontext(AssemblyContext)
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getAllocationContext_Allocationcontext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getAllocationcontext();

	/**
	 * Sets the value of the '{@link componentBasedSystem.AllocationContext#getAllocationcontext <em>Allocationcontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocationcontext</em>' reference.
	 * @see #getAllocationcontext()
	 * @generated
	 */
	void setAllocationcontext(AssemblyContext value);

} // AllocationContext
