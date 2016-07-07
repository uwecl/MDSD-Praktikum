/**
 */
package componentBasedSystem.impl;

import componentBasedSystem.Component;
import componentBasedSystem.ComponentBasedSystemPackage;
import componentBasedSystem.Service;
import componentBasedSystem.behaviourDescription.BehaviourDescription;

import componentBasedSystem.roles.ProvidedRole;
import componentBasedSystem.roles.RequiredRole;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentImpl#getBehaviourdescription <em>Behaviourdescription</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentImpl#getService <em>Service</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentImpl#getRequiredrole <em>Requiredrole</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentImpl#getProvidedrole <em>Providedrole</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBehaviourdescription() <em>Behaviourdescription</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviourdescription()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviourDescription> behaviourdescription;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * The cached value of the '{@link #getRequiredrole() <em>Requiredrole</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredrole()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredRole> requiredrole;

	/**
	 * The cached value of the '{@link #getProvidedrole() <em>Providedrole</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedrole()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedRole> providedrole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentBasedSystemPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentBasedSystemPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviourDescription> getBehaviourdescription() {
		if (behaviourdescription == null) {
			behaviourdescription = new EObjectContainmentEList<BehaviourDescription>(BehaviourDescription.class, this, ComponentBasedSystemPackage.COMPONENT__BEHAVIOURDESCRIPTION);
		}
		return behaviourdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Service>(Service.class, this, ComponentBasedSystemPackage.COMPONENT__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedRole> getProvidedrole() {
		if (providedrole == null) {
			providedrole = new EObjectContainmentEList<ProvidedRole>(ProvidedRole.class, this, ComponentBasedSystemPackage.COMPONENT__PROVIDEDROLE);
		}
		return providedrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredRole> getRequiredrole() {
		if (requiredrole == null) {
			requiredrole = new EObjectContainmentEList<RequiredRole>(RequiredRole.class, this, ComponentBasedSystemPackage.COMPONENT__REQUIREDROLE);
		}
		return requiredrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentBasedSystemPackage.COMPONENT__BEHAVIOURDESCRIPTION:
				return ((InternalEList<?>)getBehaviourdescription()).basicRemove(otherEnd, msgs);
			case ComponentBasedSystemPackage.COMPONENT__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case ComponentBasedSystemPackage.COMPONENT__REQUIREDROLE:
				return ((InternalEList<?>)getRequiredrole()).basicRemove(otherEnd, msgs);
			case ComponentBasedSystemPackage.COMPONENT__PROVIDEDROLE:
				return ((InternalEList<?>)getProvidedrole()).basicRemove(otherEnd, msgs);
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
			case ComponentBasedSystemPackage.COMPONENT__NAME:
				return getName();
			case ComponentBasedSystemPackage.COMPONENT__BEHAVIOURDESCRIPTION:
				return getBehaviourdescription();
			case ComponentBasedSystemPackage.COMPONENT__SERVICE:
				return getService();
			case ComponentBasedSystemPackage.COMPONENT__REQUIREDROLE:
				return getRequiredrole();
			case ComponentBasedSystemPackage.COMPONENT__PROVIDEDROLE:
				return getProvidedrole();
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
			case ComponentBasedSystemPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT__BEHAVIOURDESCRIPTION:
				getBehaviourdescription().clear();
				getBehaviourdescription().addAll((Collection<? extends BehaviourDescription>)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends Service>)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT__REQUIREDROLE:
				getRequiredrole().clear();
				getRequiredrole().addAll((Collection<? extends RequiredRole>)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT__PROVIDEDROLE:
				getProvidedrole().clear();
				getProvidedrole().addAll((Collection<? extends ProvidedRole>)newValue);
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
			case ComponentBasedSystemPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentBasedSystemPackage.COMPONENT__BEHAVIOURDESCRIPTION:
				getBehaviourdescription().clear();
				return;
			case ComponentBasedSystemPackage.COMPONENT__SERVICE:
				getService().clear();
				return;
			case ComponentBasedSystemPackage.COMPONENT__REQUIREDROLE:
				getRequiredrole().clear();
				return;
			case ComponentBasedSystemPackage.COMPONENT__PROVIDEDROLE:
				getProvidedrole().clear();
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
			case ComponentBasedSystemPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentBasedSystemPackage.COMPONENT__BEHAVIOURDESCRIPTION:
				return behaviourdescription != null && !behaviourdescription.isEmpty();
			case ComponentBasedSystemPackage.COMPONENT__SERVICE:
				return service != null && !service.isEmpty();
			case ComponentBasedSystemPackage.COMPONENT__REQUIREDROLE:
				return requiredrole != null && !requiredrole.isEmpty();
			case ComponentBasedSystemPackage.COMPONENT__PROVIDEDROLE:
				return providedrole != null && !providedrole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
