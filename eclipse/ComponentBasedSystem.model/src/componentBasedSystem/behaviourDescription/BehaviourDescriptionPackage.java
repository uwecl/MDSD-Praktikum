/**
 */
package componentBasedSystem.behaviourDescription;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see componentBasedSystem.behaviourDescription.BehaviourDescriptionFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviourDescriptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviourDescription";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.mdsdpc.componentBasedSystem/behaviourDescription";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behaviourDescription";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourDescriptionPackage eINSTANCE = componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link componentBasedSystem.behaviourDescription.impl.DescriptionElementImpl <em>Description Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.behaviourDescription.impl.DescriptionElementImpl
	 * @see componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionPackageImpl#getDescriptionElement()
	 * @generated
	 */
	int DESCRIPTION_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Description Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Description Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionImpl <em>Behaviour Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionImpl
	 * @see componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionPackageImpl#getBehaviourDescription()
	 * @generated
	 */
	int BEHAVIOUR_DESCRIPTION = 5;

	/**
	 * Returns the meta object for class '{@link componentBasedSystem.behaviourDescription.DescriptionElement <em>Description Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Element</em>'.
	 * @see componentBasedSystem.behaviourDescription.DescriptionElement
	 * @generated
	 */
	EClass getDescriptionElement();

	/**
	 * The meta object id for the '{@link componentBasedSystem.behaviourDescription.impl.InternalActionImpl <em>Internal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.behaviourDescription.impl.InternalActionImpl
	 * @see componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionPackageImpl#getInternalAction()
	 * @generated
	 */
	int INTERNAL_ACTION = 1;

	/**
	 * The number of structural features of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_FEATURE_COUNT = DESCRIPTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_OPERATION_COUNT = DESCRIPTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentBasedSystem.behaviourDescription.impl.ExternalCallImpl <em>External Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.behaviourDescription.impl.ExternalCallImpl
	 * @see componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionPackageImpl#getExternalCall()
	 * @generated
	 */
	int EXTERNAL_CALL = 2;

	/**
	 * The number of structural features of the '<em>External Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_FEATURE_COUNT = DESCRIPTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_OPERATION_COUNT = DESCRIPTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentBasedSystem.behaviourDescription.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.behaviourDescription.impl.LoopImpl
	 * @see componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 3;

	/**
	 * The feature id for the '<em><b>Descriptionelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__DESCRIPTIONELEMENT = DESCRIPTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = DESCRIPTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = DESCRIPTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentBasedSystem.behaviourDescription.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.behaviourDescription.impl.BranchImpl
	 * @see componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 4;

	/**
	 * The feature id for the '<em><b>Descriptionelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DESCRIPTIONELEMENT = DESCRIPTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = DESCRIPTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = DESCRIPTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descriptionelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_DESCRIPTION__DESCRIPTIONELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Behaviour Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behaviour Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_DESCRIPTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link componentBasedSystem.behaviourDescription.BehaviourDescription <em>Behaviour Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour Description</em>'.
	 * @see componentBasedSystem.behaviourDescription.BehaviourDescription
	 * @generated
	 */
	EClass getBehaviourDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link componentBasedSystem.behaviourDescription.BehaviourDescription#getDescriptionelement <em>Descriptionelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptionelement</em>'.
	 * @see componentBasedSystem.behaviourDescription.BehaviourDescription#getDescriptionelement()
	 * @see #getBehaviourDescription()
	 * @generated
	 */
	EReference getBehaviourDescription_Descriptionelement();

	/**
	 * Returns the meta object for class '{@link componentBasedSystem.behaviourDescription.InternalAction <em>Internal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Action</em>'.
	 * @see componentBasedSystem.behaviourDescription.InternalAction
	 * @generated
	 */
	EClass getInternalAction();

	/**
	 * Returns the meta object for class '{@link componentBasedSystem.behaviourDescription.ExternalCall <em>External Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Call</em>'.
	 * @see componentBasedSystem.behaviourDescription.ExternalCall
	 * @generated
	 */
	EClass getExternalCall();

	/**
	 * Returns the meta object for class '{@link componentBasedSystem.behaviourDescription.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see componentBasedSystem.behaviourDescription.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference list '{@link componentBasedSystem.behaviourDescription.Loop#getDescriptionelement <em>Descriptionelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptionelement</em>'.
	 * @see componentBasedSystem.behaviourDescription.Loop#getDescriptionelement()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Descriptionelement();

	/**
	 * Returns the meta object for class '{@link componentBasedSystem.behaviourDescription.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see componentBasedSystem.behaviourDescription.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link componentBasedSystem.behaviourDescription.Branch#getDescriptionelement <em>Descriptionelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptionelement</em>'.
	 * @see componentBasedSystem.behaviourDescription.Branch#getDescriptionelement()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Descriptionelement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviourDescriptionFactory getBehaviourDescriptionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link componentBasedSystem.behaviourDescription.impl.DescriptionElementImpl <em>Description Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.behaviourDescription.impl.DescriptionElementImpl
		 * @see componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionPackageImpl#getDescriptionElement()
		 * @generated
		 */
		EClass DESCRIPTION_ELEMENT = eINSTANCE.getDescriptionElement();

		/**
		 * The meta object literal for the '{@link componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionImpl <em>Behaviour Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionImpl
		 * @see componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionPackageImpl#getBehaviourDescription()
		 * @generated
		 */
		EClass BEHAVIOUR_DESCRIPTION = eINSTANCE.getBehaviourDescription();

		/**
		 * The meta object literal for the '<em><b>Descriptionelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_DESCRIPTION__DESCRIPTIONELEMENT = eINSTANCE.getBehaviourDescription_Descriptionelement();

		/**
		 * The meta object literal for the '{@link componentBasedSystem.behaviourDescription.impl.InternalActionImpl <em>Internal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.behaviourDescription.impl.InternalActionImpl
		 * @see componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionPackageImpl#getInternalAction()
		 * @generated
		 */
		EClass INTERNAL_ACTION = eINSTANCE.getInternalAction();

		/**
		 * The meta object literal for the '{@link componentBasedSystem.behaviourDescription.impl.ExternalCallImpl <em>External Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.behaviourDescription.impl.ExternalCallImpl
		 * @see componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionPackageImpl#getExternalCall()
		 * @generated
		 */
		EClass EXTERNAL_CALL = eINSTANCE.getExternalCall();

		/**
		 * The meta object literal for the '{@link componentBasedSystem.behaviourDescription.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.behaviourDescription.impl.LoopImpl
		 * @see componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Descriptionelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__DESCRIPTIONELEMENT = eINSTANCE.getLoop_Descriptionelement();

		/**
		 * The meta object literal for the '{@link componentBasedSystem.behaviourDescription.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.behaviourDescription.impl.BranchImpl
		 * @see componentBasedSystem.behaviourDescription.impl.BehaviourDescriptionPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Descriptionelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__DESCRIPTIONELEMENT = eINSTANCE.getBranch_Descriptionelement();

	}

} //BehaviourDescriptionPackage
