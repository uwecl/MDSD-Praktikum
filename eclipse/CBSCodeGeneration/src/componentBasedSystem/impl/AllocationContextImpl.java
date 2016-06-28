/**
 */
package componentBasedSystem.impl;

import componentBasedSystem.AllocationContext;
import componentBasedSystem.AssemblyContext;
import componentBasedSystem.ComponentBasedSystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.impl.AllocationContextImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link componentBasedSystem.impl.AllocationContextImpl#getAssemblycontext <em>Assemblycontext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationContextImpl extends MinimalEObjectImpl.Container implements AllocationContext {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected componentBasedSystem.Container container;

	/**
	 * The cached value of the '{@link #getAssemblycontext() <em>Assemblycontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblycontext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext assemblycontext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentBasedSystemPackage.Literals.ALLOCATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public componentBasedSystem.Container getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (componentBasedSystem.Container)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentBasedSystemPackage.ALLOCATION_CONTEXT__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public componentBasedSystem.Container basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(componentBasedSystem.Container newContainer) {
		componentBasedSystem.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentBasedSystemPackage.ALLOCATION_CONTEXT__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssemblycontext() {
		if (assemblycontext != null && assemblycontext.eIsProxy()) {
			InternalEObject oldAssemblycontext = (InternalEObject)assemblycontext;
			assemblycontext = (AssemblyContext)eResolveProxy(oldAssemblycontext);
			if (assemblycontext != oldAssemblycontext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentBasedSystemPackage.ALLOCATION_CONTEXT__ASSEMBLYCONTEXT, oldAssemblycontext, assemblycontext));
			}
		}
		return assemblycontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssemblycontext() {
		return assemblycontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblycontext(AssemblyContext newAssemblycontext) {
		AssemblyContext oldAssemblycontext = assemblycontext;
		assemblycontext = newAssemblycontext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentBasedSystemPackage.ALLOCATION_CONTEXT__ASSEMBLYCONTEXT, oldAssemblycontext, assemblycontext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentBasedSystemPackage.ALLOCATION_CONTEXT__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
			case ComponentBasedSystemPackage.ALLOCATION_CONTEXT__ASSEMBLYCONTEXT:
				if (resolve) return getAssemblycontext();
				return basicGetAssemblycontext();
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
			case ComponentBasedSystemPackage.ALLOCATION_CONTEXT__CONTAINER:
				setContainer((componentBasedSystem.Container)newValue);
				return;
			case ComponentBasedSystemPackage.ALLOCATION_CONTEXT__ASSEMBLYCONTEXT:
				setAssemblycontext((AssemblyContext)newValue);
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
			case ComponentBasedSystemPackage.ALLOCATION_CONTEXT__CONTAINER:
				setContainer((componentBasedSystem.Container)null);
				return;
			case ComponentBasedSystemPackage.ALLOCATION_CONTEXT__ASSEMBLYCONTEXT:
				setAssemblycontext((AssemblyContext)null);
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
			case ComponentBasedSystemPackage.ALLOCATION_CONTEXT__CONTAINER:
				return container != null;
			case ComponentBasedSystemPackage.ALLOCATION_CONTEXT__ASSEMBLYCONTEXT:
				return assemblycontext != null;
		}
		return super.eIsSet(featureID);
	}

} //AllocationContextImpl
