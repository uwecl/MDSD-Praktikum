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
 * </ul>
 *
 * @see componentBasedSystem.ComponentBasedSystemPackage#getCompositeComponent()
 * @model
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

} // CompositeComponent
