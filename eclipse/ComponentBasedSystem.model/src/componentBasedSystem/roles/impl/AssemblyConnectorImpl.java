/**
 */
package componentBasedSystem.roles.impl;

import componentBasedSystem.roles.AssemblyConnector;
import componentBasedSystem.roles.ProvidedRole;
import componentBasedSystem.roles.RequiredRole;
import componentBasedSystem.roles.RolesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.roles.impl.AssemblyConnectorImpl#getProvidedrole <em>Providedrole</em>}</li>
 *   <li>{@link componentBasedSystem.roles.impl.AssemblyConnectorImpl#getRequiredrole <em>Requiredrole</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyConnectorImpl extends MinimalEObjectImpl.Container implements AssemblyConnector {
	/**
	 * The cached value of the '{@link #getProvidedrole() <em>Providedrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedrole()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole providedrole;

	/**
	 * The cached value of the '{@link #getRequiredrole() <em>Requiredrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredrole()
	 * @generated
	 * @ordered
	 */
	protected RequiredRole requiredrole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RolesPackage.Literals.ASSEMBLY_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole getProvidedrole() {
		if (providedrole != null && providedrole.eIsProxy()) {
			InternalEObject oldProvidedrole = (InternalEObject)providedrole;
			providedrole = (ProvidedRole)eResolveProxy(oldProvidedrole);
			if (providedrole != oldProvidedrole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RolesPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE, oldProvidedrole, providedrole));
			}
		}
		return providedrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetProvidedrole() {
		return providedrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedrole(ProvidedRole newProvidedrole) {
		ProvidedRole oldProvidedrole = providedrole;
		providedrole = newProvidedrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RolesPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE, oldProvidedrole, providedrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole getRequiredrole() {
		if (requiredrole != null && requiredrole.eIsProxy()) {
			InternalEObject oldRequiredrole = (InternalEObject)requiredrole;
			requiredrole = (RequiredRole)eResolveProxy(oldRequiredrole);
			if (requiredrole != oldRequiredrole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RolesPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE, oldRequiredrole, requiredrole));
			}
		}
		return requiredrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole basicGetRequiredrole() {
		return requiredrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredrole(RequiredRole newRequiredrole) {
		RequiredRole oldRequiredrole = requiredrole;
		requiredrole = newRequiredrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RolesPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE, oldRequiredrole, requiredrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RolesPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE:
				if (resolve) return getProvidedrole();
				return basicGetProvidedrole();
			case RolesPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE:
				if (resolve) return getRequiredrole();
				return basicGetRequiredrole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RolesPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE:
				setProvidedrole((ProvidedRole)newValue);
				return;
			case RolesPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE:
				setRequiredrole((RequiredRole)newValue);
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
			case RolesPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE:
				setProvidedrole((ProvidedRole)null);
				return;
			case RolesPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE:
				setRequiredrole((RequiredRole)null);
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
			case RolesPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE:
				return providedrole != null;
			case RolesPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE:
				return requiredrole != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyConnectorImpl
