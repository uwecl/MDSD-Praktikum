/**
 */
package componentBasedSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.CompositeComponent#getAssemblycontext <em>Assemblycontext</em>}</li>
 *   <li>{@link componentBasedSystem.CompositeComponent#getDelegationconnector <em>Delegationconnector</em>}</li>
 * </ul>
 *
 * @see componentBasedSystem.ComponentBasedSystemPackage#getCompositeComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SameInterfaceDelegated RoleCount'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SameInterfaceDelegated='\n\t\tself.delegationconnector->\n\t\tforAll( d | d.role->includes(providedrole) or d.role->includesAll(requiredrole))' RoleCount='\n\t\tself.delegationconnector->size() = self.requiredrole->size() + self.providedrole->size()'"
 * @generated
 */
public interface CompositeComponent extends Component {
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
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getCompositeComponent_Assemblycontext()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<AssemblyContext> getAssemblycontext();

	/**
	 * Returns the value of the '<em><b>Delegationconnector</b></em>' containment reference list.
	 * The list contents are of type {@link componentBasedSystem.DelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegationconnector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegationconnector</em>' containment reference list.
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getCompositeComponent_Delegationconnector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DelegationConnector> getDelegationconnector();

} // CompositeComponent
