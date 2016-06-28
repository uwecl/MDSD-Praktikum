/**
 */
package componentBasedSystem.behaviourDescription;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see componentBasedSystem.behaviourDescription.BehaviourDescriptionPackage
 * @generated
 */
public interface BehaviourDescriptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourDescriptionFactory eINSTANCE = componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Description Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description Element</em>'.
	 * @generated
	 */
	DescriptionElement createDescriptionElement();

	/**
	 * Returns a new object of class '<em>Behaviour Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behaviour Description</em>'.
	 * @generated
	 */
	BehaviourDescription createBehaviourDescription();

	/**
	 * Returns a new object of class '<em>Internal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Action</em>'.
	 * @generated
	 */
	InternalAction createInternalAction();

	/**
	 * Returns a new object of class '<em>External Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Call</em>'.
	 * @generated
	 */
	ExternalCall createExternalCall();

	/**
	 * Returns a new object of class '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop</em>'.
	 * @generated
	 */
	Loop createLoop();

	/**
	 * Returns a new object of class '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch</em>'.
	 * @generated
	 */
	Branch createBranch();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviourDescriptionPackage getBehaviourDescriptionPackage();

} //BehaviourDescriptionFactory
