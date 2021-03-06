/**
 */
package componentBasedSystem.impl;

import componentBasedSystem.AssemblyContext;
import componentBasedSystem.ComponentBasedSystemPackage;
import componentBasedSystem.CompositeComponent;

import componentBasedSystem.DelegationConnector;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.impl.CompositeComponentImpl#getAssemblycontext <em>Assemblycontext</em>}</li>
 *   <li>{@link componentBasedSystem.impl.CompositeComponentImpl#getDelegationconnector <em>Delegationconnector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeComponentImpl extends ComponentImpl implements CompositeComponent {
	/**
	 * The cached value of the '{@link #getAssemblycontext() <em>Assemblycontext</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblycontext()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyContext> assemblycontext;

	/**
	 * The cached value of the '{@link #getDelegationconnector() <em>Delegationconnector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationconnector()
	 * @generated
	 * @ordered
	 */
	protected EList<DelegationConnector> delegationconnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentBasedSystemPackage.Literals.COMPOSITE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyContext> getAssemblycontext() {
		if (assemblycontext == null) {
			assemblycontext = new EObjectContainmentEList<AssemblyContext>(AssemblyContext.class, this, ComponentBasedSystemPackage.COMPOSITE_COMPONENT__ASSEMBLYCONTEXT);
		}
		return assemblycontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelegationConnector> getDelegationconnector() {
		if (delegationconnector == null) {
			delegationconnector = new EObjectContainmentEList<DelegationConnector>(DelegationConnector.class, this, ComponentBasedSystemPackage.COMPOSITE_COMPONENT__DELEGATIONCONNECTOR);
		}
		return delegationconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentBasedSystemPackage.COMPOSITE_COMPONENT__ASSEMBLYCONTEXT:
				return ((InternalEList<?>)getAssemblycontext()).basicRemove(otherEnd, msgs);
			case ComponentBasedSystemPackage.COMPOSITE_COMPONENT__DELEGATIONCONNECTOR:
				return ((InternalEList<?>)getDelegationconnector()).basicRemove(otherEnd, msgs);
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
			case ComponentBasedSystemPackage.COMPOSITE_COMPONENT__ASSEMBLYCONTEXT:
				return getAssemblycontext();
			case ComponentBasedSystemPackage.COMPOSITE_COMPONENT__DELEGATIONCONNECTOR:
				return getDelegationconnector();
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
			case ComponentBasedSystemPackage.COMPOSITE_COMPONENT__ASSEMBLYCONTEXT:
				getAssemblycontext().clear();
				getAssemblycontext().addAll((Collection<? extends AssemblyContext>)newValue);
				return;
			case ComponentBasedSystemPackage.COMPOSITE_COMPONENT__DELEGATIONCONNECTOR:
				getDelegationconnector().clear();
				getDelegationconnector().addAll((Collection<? extends DelegationConnector>)newValue);
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
			case ComponentBasedSystemPackage.COMPOSITE_COMPONENT__ASSEMBLYCONTEXT:
				getAssemblycontext().clear();
				return;
			case ComponentBasedSystemPackage.COMPOSITE_COMPONENT__DELEGATIONCONNECTOR:
				getDelegationconnector().clear();
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
			case ComponentBasedSystemPackage.COMPOSITE_COMPONENT__ASSEMBLYCONTEXT:
				return assemblycontext != null && !assemblycontext.isEmpty();
			case ComponentBasedSystemPackage.COMPOSITE_COMPONENT__DELEGATIONCONNECTOR:
				return delegationconnector != null && !delegationconnector.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeComponentImpl
