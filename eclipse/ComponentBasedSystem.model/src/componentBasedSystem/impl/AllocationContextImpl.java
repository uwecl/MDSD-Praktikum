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
 *   <li>{@link componentBasedSystem.impl.AllocationContextImpl#getAllocationcontext <em>Allocationcontext</em>}</li>
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
	 * The cached value of the '{@link #getAllocationcontext() <em>Allocationcontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationcontext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext allocationcontext;

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
	public AssemblyContext getAllocationcontext() {
		if (allocationcontext != null && allocationcontext.eIsProxy()) {
			InternalEObject oldAllocationcontext = (InternalEObject)allocationcontext;
			allocationcontext = (AssemblyContext)eResolveProxy(oldAllocationcontext);
			if (allocationcontext != oldAllocationcontext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentBasedSystemPackage.ALLOCATION_CONTEXT__ALLOCATIONCONTEXT, oldAllocationcontext, allocationcontext));
			}
		}
		return allocationcontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAllocationcontext() {
		return allocationcontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationcontext(AssemblyContext newAllocationcontext) {
		AssemblyContext oldAllocationcontext = allocationcontext;
		allocationcontext = newAllocationcontext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentBasedSystemPackage.ALLOCATION_CONTEXT__ALLOCATIONCONTEXT, oldAllocationcontext, allocationcontext));
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
			case ComponentBasedSystemPackage.ALLOCATION_CONTEXT__ALLOCATIONCONTEXT:
				if (resolve) return getAllocationcontext();
				return basicGetAllocationcontext();
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
			case ComponentBasedSystemPackage.ALLOCATION_CONTEXT__ALLOCATIONCONTEXT:
				setAllocationcontext((AssemblyContext)newValue);
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
			case ComponentBasedSystemPackage.ALLOCATION_CONTEXT__ALLOCATIONCONTEXT:
				setAllocationcontext((AssemblyContext)null);
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
			case ComponentBasedSystemPackage.ALLOCATION_CONTEXT__ALLOCATIONCONTEXT:
				return allocationcontext != null;
		}
		return super.eIsSet(featureID);
	}

} //AllocationContextImpl
