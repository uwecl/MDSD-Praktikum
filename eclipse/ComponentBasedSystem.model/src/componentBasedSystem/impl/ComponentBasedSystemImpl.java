/**
 */
package componentBasedSystem.impl;

import componentBasedSystem.Allocation;
import componentBasedSystem.AssemblyContext;
import componentBasedSystem.ComponentBasedSystem;
import componentBasedSystem.ComponentBasedSystemPackage;
import componentBasedSystem.Environment;
import componentBasedSystem.Repository;
import componentBasedSystem.dataTypes.Type;
import componentBasedSystem.roles.AssemblyConnector;
import componentBasedSystem.roles.ProvidedRole;
import componentBasedSystem.roles.RequiredRole;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 *   <li>{@link componentBasedSystem.impl.ComponentBasedSystemImpl#getAssemblycontext <em>Assemblycontext</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentBasedSystemImpl#getType <em>Type</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentBasedSystemImpl#getAssemblyconnector <em>Assemblyconnector</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentBasedSystemImpl#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentBasedSystemImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentBasedSystemImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentBasedSystemImpl#getProvidedrole <em>Providedrole</em>}</li>
 *   <li>{@link componentBasedSystem.impl.ComponentBasedSystemImpl#getRequiredrole <em>Requiredrole</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentBasedSystemImpl extends MinimalEObjectImpl.Container implements ComponentBasedSystem {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> type;

	/**
	 * The cached value of the '{@link #getAssemblyconnector() <em>Assemblyconnector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyconnector()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyConnector> assemblyconnector;

	/**
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected Allocation allocation;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected Repository repository;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The cached value of the '{@link #getProvidedrole() <em>Providedrole</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedrole()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedRole> providedrole;

	/**
	 * The cached value of the '{@link #getRequiredrole() <em>Requiredrole</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredrole()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredRole> requiredrole;

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
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT, oldEnvironment, newEnvironment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedRole> getProvidedrole() {
		if (providedrole == null) {
			providedrole = new EObjectResolvingEList<ProvidedRole>(ProvidedRole.class, this, ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__PROVIDEDROLE);
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
			requiredrole = new EObjectResolvingEList<RequiredRole>(RequiredRole.class, this, ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__REQUIREDROLE);
		}
		return requiredrole;
	}

	/**
	 * The cached invocation delegate for the '{@link #GetContainerOfContext(componentBasedSystem.AssemblyContext) <em>Get Container Of Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GetContainerOfContext(componentBasedSystem.AssemblyContext)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_CONTAINER_OF_CONTEXT_ASSEMBLY_CONTEXT__EINVOCATION_DELEGATE = ((EOperation.Internal)ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM___GET_CONTAINER_OF_CONTEXT__ASSEMBLYCONTEXT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public componentBasedSystem.Container GetContainerOfContext(AssemblyContext context) {
		try {
			return (componentBasedSystem.Container)GET_CONTAINER_OF_CONTEXT_ASSEMBLY_CONTEXT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{context}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
	public EList<AssemblyConnector> getAssemblyconnector() {
		if (assemblyconnector == null) {
			assemblyconnector = new EObjectContainmentEList<AssemblyConnector>(AssemblyConnector.class, this, ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONNECTOR);
		}
		return assemblyconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs) {
		Repository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__REPOSITORY, oldRepository, newRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		if (newRepository != repository) {
			NotificationChain msgs = null;
			if (repository != null)
				msgs = ((InternalEObject)repository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__REPOSITORY, null, msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__REPOSITORY, null, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation getAllocation() {
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocation(Allocation newAllocation, NotificationChain msgs) {
		Allocation oldAllocation = allocation;
		allocation = newAllocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ALLOCATION, oldAllocation, newAllocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocation(Allocation newAllocation) {
		if (newAllocation != allocation) {
			NotificationChain msgs = null;
			if (allocation != null)
				msgs = ((InternalEObject)allocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ALLOCATION, null, msgs);
			if (newAllocation != null)
				msgs = ((InternalEObject)newAllocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ALLOCATION, null, msgs);
			msgs = basicSetAllocation(newAllocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ALLOCATION, newAllocation, newAllocation));
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
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONNECTOR:
				return ((InternalEList<?>)getAssemblyconnector()).basicRemove(otherEnd, msgs);
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ALLOCATION:
				return basicSetAllocation(null, msgs);
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__REPOSITORY:
				return basicSetRepository(null, msgs);
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
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
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONTEXT:
				return getAssemblycontext();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__TYPE:
				return getType();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONNECTOR:
				return getAssemblyconnector();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ALLOCATION:
				return getAllocation();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__REPOSITORY:
				return getRepository();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT:
				return getEnvironment();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__PROVIDEDROLE:
				return getProvidedrole();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__REQUIREDROLE:
				return getRequiredrole();
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
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONTEXT:
				getAssemblycontext().clear();
				getAssemblycontext().addAll((Collection<? extends AssemblyContext>)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Type>)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONNECTOR:
				getAssemblyconnector().clear();
				getAssemblyconnector().addAll((Collection<? extends AssemblyConnector>)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ALLOCATION:
				setAllocation((Allocation)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__REPOSITORY:
				setRepository((Repository)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__PROVIDEDROLE:
				getProvidedrole().clear();
				getProvidedrole().addAll((Collection<? extends ProvidedRole>)newValue);
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__REQUIREDROLE:
				getRequiredrole().clear();
				getRequiredrole().addAll((Collection<? extends RequiredRole>)newValue);
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
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONTEXT:
				getAssemblycontext().clear();
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__TYPE:
				getType().clear();
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONNECTOR:
				getAssemblyconnector().clear();
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ALLOCATION:
				setAllocation((Allocation)null);
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__REPOSITORY:
				setRepository((Repository)null);
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__PROVIDEDROLE:
				getProvidedrole().clear();
				return;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__REQUIREDROLE:
				getRequiredrole().clear();
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
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONTEXT:
				return assemblycontext != null && !assemblycontext.isEmpty();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__TYPE:
				return type != null && !type.isEmpty();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONNECTOR:
				return assemblyconnector != null && !assemblyconnector.isEmpty();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ALLOCATION:
				return allocation != null;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__REPOSITORY:
				return repository != null;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT:
				return environment != null;
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__PROVIDEDROLE:
				return providedrole != null && !providedrole.isEmpty();
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__REQUIREDROLE:
				return requiredrole != null && !requiredrole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM___GET_CONTAINER_OF_CONTEXT__ASSEMBLYCONTEXT:
				return GetContainerOfContext((AssemblyContext)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ComponentBasedSystemImpl
