/**
 */
package componentBasedSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.Allocation#getAllocationcontext <em>Allocationcontext</em>}</li>
 * </ul>
 *
 * @see componentBasedSystem.ComponentBasedSystemPackage#getAllocation()
 * @model
 * @generated
 */
public interface Allocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocationcontext</b></em>' containment reference list.
	 * The list contents are of type {@link componentBasedSystem.AllocationContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocationcontext</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocationcontext</em>' containment reference list.
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getAllocation_Allocationcontext()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AllocationContext> getAllocationcontext();

} // Allocation
