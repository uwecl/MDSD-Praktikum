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
 *   <li>{@link componentBasedSystem.AllocationContext#getAssemblycontext <em>Assemblycontext</em>}</li>
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
	 * Returns the value of the '<em><b>Assemblycontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assemblycontext</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assemblycontext</em>' reference.
	 * @see #setAssemblycontext(AssemblyContext)
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getAllocationContext_Assemblycontext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getAssemblycontext();

	/**
	 * Sets the value of the '{@link componentBasedSystem.AllocationContext#getAssemblycontext <em>Assemblycontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assemblycontext</em>' reference.
	 * @see #getAssemblycontext()
	 * @generated
	 */
	void setAssemblycontext(AssemblyContext value);

} // AllocationContext
