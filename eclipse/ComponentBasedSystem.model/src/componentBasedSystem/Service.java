/**
 */
package componentBasedSystem;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.Service#getCorrespondingSignatures <em>Corresponding Signatures</em>}</li>
 * </ul>
 *
 * @see componentBasedSystem.ComponentBasedSystemPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {

	/**
	 * Returns the value of the '<em><b>Corresponding Signatures</b></em>' reference list.
	 * The list contents are of type {@link componentBasedSystem.Signature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Signatures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Signatures</em>' reference list.
	 * @see componentBasedSystem.ComponentBasedSystemPackage#getService_CorrespondingSignatures()
	 * @model required="true"
	 * @generated
	 */
	EList<Signature> getCorrespondingSignatures();
} // Service
