/**
 */
package componentBasedSystem.impl;

import componentBasedSystem.AssemblyContext;
import componentBasedSystem.ComponentBasedSystem;
import componentBasedSystem.ComponentBasedSystemPackage;
import componentBasedSystem.Environment;
import componentBasedSystem.Interface;

import componentBasedSystem.dataTypes.Type;
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
 * An implementation of the model object '<em><b>Component Based System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.impl.ComponentBasedSystemImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentBasedSystemImpl#getAssemblycontext <em>Assemblycontext</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentBasedSystemImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentBasedSystemImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentBasedSystemImpl extends MinimalEObjectImpl.Container implements ComponentBasedSystem {
	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interface_;

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
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentBasedSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectResolvingEList<Interface>(Interface.class, this, ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyContext> getAssemblycontext() {
		if (assemblycontext == null) {
			assemblycontext = new EObjectContainmentEList<AssemblyContext>(AssemblyContext.class, this, ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONTEXT);
		}
		return assemblycontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironment() {
		if (environment != null && environment.eIsProxy()) {
			InternalEObject oldEnvironment = (InternalEObject)environment;
			environment = (Environment)eResolveProxy(oldEnvironment);
			if (environment != oldEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT, oldEnvironment, environment));
			}
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment basicGetEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<Type>(Type.class, this, ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONTEXT:
				return ((InternalEList<?>)getAssemblycontext()).basicRemove(otherEnd, msgs);
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
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
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__INTERFACE:
				return getInterface();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONTEXT:
				return getAssemblycontext();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__TYPE:
				return getType();
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
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONTEXT:
				getAssemblycontext().clear();
				getAssemblycontext().addAll((Collection<? extends AssemblyContext>)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Type>)newValue);
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
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__INTERFACE:
				getInterface().clear();
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONTEXT:
				getAssemblycontext().clear();
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__TYPE:
				getType().clear();
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
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONTEXT:
				return assemblycontext != null && !assemblycontext.isEmpty();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT:
				return environment != null;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__TYPE:
				return type != null && !type.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentBasedSystemImpl
