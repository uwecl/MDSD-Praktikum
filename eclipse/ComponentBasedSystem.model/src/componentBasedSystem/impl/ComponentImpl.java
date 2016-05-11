/**
 */
package componentBasedSystem.impl;

import componentBasedSystem.Component;
import componentBasedSystem.ComponentBasedSystemPackage;
import componentBasedSystem.Interface;

import componentBasedSystem.Service;
import componentBasedSystem.behaviourDescription.BehaviourDescription;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link componentBasedSystem.impl.ComponentImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentImpl#getService <em>Service</em>}</li>
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
	 * The cached value of the '{@link #getProvided() <em>Provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected Interface provided;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> required;

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
	public Interface getProvided() {
		if (provided != null && provided.eIsProxy()) {
			InternalEObject oldProvided = (InternalEObject)provided;
			provided = (Interface)eResolveProxy(oldProvided);
			if (provided != oldProvided) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentBasedSystemPackage.COMPONENT__PROVIDED, oldProvided, provided));
			}
		}
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetProvided() {
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvided(Interface newProvided) {
		Interface oldProvided = provided;
		provided = newProvided;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentBasedSystemPackage.COMPONENT__PROVIDED, oldProvided, provided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequired() {
		if (required == null) {
			required = new EObjectResolvingEList<Interface>(Interface.class, this, ComponentBasedSystemPackage.COMPONENT__REQUIRED);
		}
		return required;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentBasedSystemPackage.COMPONENT__BEHAVIOURDESCRIPTION:
				return ((InternalEList<?>)getBehaviourdescription()).basicRemove(otherEnd, msgs);
			case ComponentBasedSystemPackage.COMPONENT__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
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
			case ComponentBasedSystemPackage.COMPONENT__PROVIDED:
				if (resolve) return getProvided();
				return basicGetProvided();
			case ComponentBasedSystemPackage.COMPONENT__REQUIRED:
				return getRequired();
			case ComponentBasedSystemPackage.COMPONENT__SERVICE:
				return getService();
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
			case ComponentBasedSystemPackage.COMPONENT__PROVIDED:
				setProvided((Interface)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT__REQUIRED:
				getRequired().clear();
				getRequired().addAll((Collection<? extends Interface>)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends Service>)newValue);
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
			case ComponentBasedSystemPackage.COMPONENT__PROVIDED:
				setProvided((Interface)null);
				return;
			case ComponentBasedSystemPackage.COMPONENT__REQUIRED:
				getRequired().clear();
				return;
			case ComponentBasedSystemPackage.COMPONENT__SERVICE:
				getService().clear();
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
			case ComponentBasedSystemPackage.COMPONENT__PROVIDED:
				return provided != null;
			case ComponentBasedSystemPackage.COMPONENT__REQUIRED:
				return required != null && !required.isEmpty();
			case ComponentBasedSystemPackage.COMPONENT__SERVICE:
				return service != null && !service.isEmpty();
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
