/**
 */
package componentBasedSystem.roles.impl;

import componentBasedSystem.AssemblyContext;
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
 *   <li>{@link componentBasedSystem.roles.impl.AssemblyConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link componentBasedSystem.roles.impl.AssemblyConnectorImpl#getProvidedAssemblyContext <em>Provided Assembly Context</em>}</li>
 *   <li>{@link componentBasedSystem.roles.impl.AssemblyConnectorImpl#getRequiredAssemblyContext <em>Required Assembly Context</em>}</li>
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
	 * The cached value of the '{@link #getProvidedAssemblyContext() <em>Provided Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext providedAssemblyContext;

	/**
	 * The cached value of the '{@link #getRequiredAssemblyContext() <em>Required Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext requiredAssemblyContext;

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
			eNotify(new ENotificationImpl(this, Notification.SET, RolesPackage.ASSEMBLY_CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getProvidedAssemblyContext() {
		if (providedAssemblyContext != null && providedAssemblyContext.eIsProxy()) {
			InternalEObject oldProvidedAssemblyContext = (InternalEObject)providedAssemblyContext;
			providedAssemblyContext = (AssemblyContext)eResolveProxy(oldProvidedAssemblyContext);
			if (providedAssemblyContext != oldProvidedAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RolesPackage.ASSEMBLY_CONNECTOR__PROVIDED_ASSEMBLY_CONTEXT, oldProvidedAssemblyContext, providedAssemblyContext));
			}
		}
		return providedAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetProvidedAssemblyContext() {
		return providedAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedAssemblyContext(AssemblyContext newProvidedAssemblyContext) {
		AssemblyContext oldProvidedAssemblyContext = providedAssemblyContext;
		providedAssemblyContext = newProvidedAssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RolesPackage.ASSEMBLY_CONNECTOR__PROVIDED_ASSEMBLY_CONTEXT, oldProvidedAssemblyContext, providedAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getRequiredAssemblyContext() {
		if (requiredAssemblyContext != null && requiredAssemblyContext.eIsProxy()) {
			InternalEObject oldRequiredAssemblyContext = (InternalEObject)requiredAssemblyContext;
			requiredAssemblyContext = (AssemblyContext)eResolveProxy(oldRequiredAssemblyContext);
			if (requiredAssemblyContext != oldRequiredAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RolesPackage.ASSEMBLY_CONNECTOR__REQUIRED_ASSEMBLY_CONTEXT, oldRequiredAssemblyContext, requiredAssemblyContext));
			}
		}
		return requiredAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetRequiredAssemblyContext() {
		return requiredAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredAssemblyContext(AssemblyContext newRequiredAssemblyContext) {
		AssemblyContext oldRequiredAssemblyContext = requiredAssemblyContext;
		requiredAssemblyContext = newRequiredAssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RolesPackage.ASSEMBLY_CONNECTOR__REQUIRED_ASSEMBLY_CONTEXT, oldRequiredAssemblyContext, requiredAssemblyContext));
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
			case RolesPackage.ASSEMBLY_CONNECTOR__NAME:
				return getName();
			case RolesPackage.ASSEMBLY_CONNECTOR__PROVIDED_ASSEMBLY_CONTEXT:
				if (resolve) return getProvidedAssemblyContext();
				return basicGetProvidedAssemblyContext();
			case RolesPackage.ASSEMBLY_CONNECTOR__REQUIRED_ASSEMBLY_CONTEXT:
				if (resolve) return getRequiredAssemblyContext();
				return basicGetRequiredAssemblyContext();
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
			case RolesPackage.ASSEMBLY_CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case RolesPackage.ASSEMBLY_CONNECTOR__PROVIDED_ASSEMBLY_CONTEXT:
				setProvidedAssemblyContext((AssemblyContext)newValue);
				return;
			case RolesPackage.ASSEMBLY_CONNECTOR__REQUIRED_ASSEMBLY_CONTEXT:
				setRequiredAssemblyContext((AssemblyContext)newValue);
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
			case RolesPackage.ASSEMBLY_CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RolesPackage.ASSEMBLY_CONNECTOR__PROVIDED_ASSEMBLY_CONTEXT:
				setProvidedAssemblyContext((AssemblyContext)null);
				return;
			case RolesPackage.ASSEMBLY_CONNECTOR__REQUIRED_ASSEMBLY_CONTEXT:
				setRequiredAssemblyContext((AssemblyContext)null);
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
			case RolesPackage.ASSEMBLY_CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RolesPackage.ASSEMBLY_CONNECTOR__PROVIDED_ASSEMBLY_CONTEXT:
				return providedAssemblyContext != null;
			case RolesPackage.ASSEMBLY_CONNECTOR__REQUIRED_ASSEMBLY_CONTEXT:
				return requiredAssemblyContext != null;
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

} //AssemblyConnectorImpl
