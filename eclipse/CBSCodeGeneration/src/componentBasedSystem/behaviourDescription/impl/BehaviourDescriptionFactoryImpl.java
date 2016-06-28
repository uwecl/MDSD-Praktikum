/**
 */
package componentBasedSystem.behaviourDescription.impl;

import componentBasedSystem.behaviourDescription.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourDescriptionFactoryImpl extends EFactoryImpl implements BehaviourDescriptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviourDescriptionFactory init() {
		try {
			BehaviourDescriptionFactory theBehaviourDescriptionFactory = (BehaviourDescriptionFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviourDescriptionPackage.eNS_URI);
			if (theBehaviourDescriptionFactory != null) {
				return theBehaviourDescriptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviourDescriptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourDescriptionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BehaviourDescriptionPackage.DESCRIPTION_ELEMENT: return createDescriptionElement();
			case BehaviourDescriptionPackage.INTERNAL_ACTION: return createInternalAction();
			case BehaviourDescriptionPackage.EXTERNAL_CALL: return createExternalCall();
			case BehaviourDescriptionPackage.LOOP: return createLoop();
			case BehaviourDescriptionPackage.BRANCH: return createBranch();
			case BehaviourDescriptionPackage.BEHAVIOUR_DESCRIPTION: return createBehaviourDescription();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionElement createDescriptionElement() {
		DescriptionElementImpl descriptionElement = new DescriptionElementImpl();
		return descriptionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourDescription createBehaviourDescription() {
		BehaviourDescriptionImpl behaviourDescription = new BehaviourDescriptionImpl();
		return behaviourDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAction createInternalAction() {
		InternalActionImpl internalAction = new InternalActionImpl();
		return internalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalCall createExternalCall() {
		ExternalCallImpl externalCall = new ExternalCallImpl();
		return externalCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourDescriptionPackage getBehaviourDescriptionPackage() {
		return (BehaviourDescriptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviourDescriptionPackage getPackage() {
		return BehaviourDescriptionPackage.eINSTANCE;
	}

} //BehaviourDescriptionFactoryImpl
