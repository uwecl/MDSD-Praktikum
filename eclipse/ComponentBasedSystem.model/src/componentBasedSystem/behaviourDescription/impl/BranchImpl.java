/**
 */
package componentBasedSystem.behaviourDescription.impl;

import componentBasedSystem.behaviourDescription.BehaviourDescriptionPackage;
import componentBasedSystem.behaviourDescription.Branch;

import componentBasedSystem.behaviourDescription.DescriptionElement;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.behaviourDescription.impl.BranchImpl#getDescriptionelement <em>Descriptionelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchImpl extends DescriptionElementImpl implements Branch {
	/**
	 * The cached value of the '{@link #getDescriptionelement() <em>Descriptionelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionelement()
	 * @generated
	 * @ordered
	 */
	protected EList<DescriptionElement> descriptionelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourDescriptionPackage.Literals.BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionElement> getDescriptionelement() {
		if (descriptionelement == null) {
			descriptionelement = new EObjectContainmentEList<DescriptionElement>(DescriptionElement.class, this, BehaviourDescriptionPackage.BRANCH__DESCRIPTIONELEMENT);
		}
		return descriptionelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourDescriptionPackage.BRANCH__DESCRIPTIONELEMENT:
				return ((InternalEList<?>)getDescriptionelement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviourDescriptionPackage.BRANCH__DESCRIPTIONELEMENT:
				return getDescriptionelement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviourDescriptionPackage.BRANCH__DESCRIPTIONELEMENT:
				getDescriptionelement().clear();
				getDescriptionelement().addAll((Collection<? extends DescriptionElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BehaviourDescriptionPackage.BRANCH__DESCRIPTIONELEMENT:
				getDescriptionelement().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BehaviourDescriptionPackage.BRANCH__DESCRIPTIONELEMENT:
				return descriptionelement != null && !descriptionelement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BranchImpl
