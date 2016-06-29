/**
 */
package componentBasedSystem.behaviourDescription;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.behaviourDescription.Branch#getDescriptionelement <em>Descriptionelement</em>}</li>
 * </ul>
 *
 * @see componentBasedSystem.behaviourDescription.BehaviourDescriptionPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends DescriptionElement {

	/**
	 * Returns the value of the '<em><b>Descriptionelement</b></em>' containment reference list.
	 * The list contents are of type {@link componentBasedSystem.behaviourDescription.DescriptionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptionelement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptionelement</em>' containment reference list.
	 * @see componentBasedSystem.behaviourDescription.BehaviourDescriptionPackage#getBranch_Descriptionelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<DescriptionElement> getDescriptionelement();
} // Branch
