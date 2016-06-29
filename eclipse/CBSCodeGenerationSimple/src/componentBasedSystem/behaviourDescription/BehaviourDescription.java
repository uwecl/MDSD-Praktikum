/**
 */
package componentBasedSystem.behaviourDescription;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.behaviourDescription.BehaviourDescription#getDescriptionelement <em>Descriptionelement</em>}</li>
 * </ul>
 *
 * @see componentBasedSystem.behaviourDescription.BehaviourDescriptionPackage#getBehaviourDescription()
 * @model
 * @generated
 */
public interface BehaviourDescription extends EObject {

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
	 * @see componentBasedSystem.behaviourDescription.BehaviourDescriptionPackage#getBehaviourDescription_Descriptionelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<DescriptionElement> getDescriptionelement();
} // BehaviourDescription
