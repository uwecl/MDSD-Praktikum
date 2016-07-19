/**
 */
package componentBasedSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.Interface#getName <em>Name</em>}</li>
 *   <li>{@link componentBasedSystem.Interface#getSignature <em>Signature</em>}</li>
 *   <li>{@link componentBasedSystem.Interface#getInherited <em>Inherited</em>}</li>
 * </ul>
 *
 * @see componentBasedSystem.ComponentBasedSystemPackage#getInterface()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InterfaceInheritanceCyclicDependency'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InterfaceInheritanceCyclicDependency='\n\t\tself.isInterfaceInInherited(inherited, self->asOrderedSet()) = false'"
 * @generated
 */
public interface Interface extends EObject {
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
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getInterface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentBasedSystem.Interface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link componentBasedSystem.Signature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getInterface_Signature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signature> getSignature();

	/**
	 * Returns the value of the '<em><b>Inherited</b></em>' reference list.
	 * The list contents are of type {@link componentBasedSystem.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited</em>' reference list.
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getInterface_Inherited()
	 * @model
	 * @generated
	 */
	EList<Interface> getInherited();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * recursive operation to check whether any of the interfaces in 'items' is in the interface array 'list'
	 * <!-- end-model-doc -->
	 * @model listMany="true" itemsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif list->size() = 0 then false\n\t\t\telse\n\t\t\t\tif (items->exists( i | list->includes(i)))  then true\n\t\t\t\telse \n\t\t\t\t/* call operation and append current interface to items, thus preventing a nested loop \052/\n\t\t\t\tlist->exists(inter | isInterfaceInInherited(inter.inherited,items->append(inter)))\n\t\t\t\tendif\n\t\t\tendif'"
	 * @generated
	 */
	boolean isInterfaceInInherited(EList<Interface> list, EList<Interface> items);

} // Interface
