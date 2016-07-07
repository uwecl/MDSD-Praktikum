/**
 */
package componentBasedSystem.impl;

import componentBasedSystem.ComponentBasedSystemPackage;
import componentBasedSystem.Environment;
import componentBasedSystem.Link;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentBasedSystem.impl.EnvironmentImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link componentBasedSystem.impl.EnvironmentImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends MinimalEObjectImpl.Container implements Environment {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<componentBasedSystem.Container> container;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentBasedSystemPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<componentBasedSystem.Container> getContainer() {
		if (container == null) {
			container = new EObjectContainmentEList<componentBasedSystem.Container>(componentBasedSystem.Container.class, this, ComponentBasedSystemPackage.ENVIRONMENT__CONTAINER);
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, ComponentBasedSystemPackage.ENVIRONMENT__LINK);
		}
		return link;
	}

	/**
	 * The cached invocation delegate for the '{@link #IsLinked(componentBasedSystem.Container, componentBasedSystem.Container) <em>Is Linked</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IsLinked(componentBasedSystem.Container, componentBasedSystem.Container)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_LINKED_CONTAINER_CONTAINER__EINVOCATION_DELEGATE = ((EOperation.Internal)ComponentBasedSystemPackage.Literals.ENVIRONMENT___IS_LINKED__CONTAINER_CONTAINER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsLinked(componentBasedSystem.Container c1, componentBasedSystem.Container c2) {
		try {
			return (Boolean)IS_LINKED_CONTAINER_CONTAINER__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{c1, c2}));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentBasedSystemPackage.ENVIRONMENT__CONTAINER:
				return ((InternalEList<?>)getContainer()).basicRemove(otherEnd, msgs);
			case ComponentBasedSystemPackage.ENVIRONMENT__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
			case ComponentBasedSystemPackage.ENVIRONMENT__CONTAINER:
				return getContainer();
			case ComponentBasedSystemPackage.ENVIRONMENT__LINK:
				return getLink();
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
			case ComponentBasedSystemPackage.ENVIRONMENT__CONTAINER:
				getContainer().clear();
				getContainer().addAll((Collection<? extends componentBasedSystem.Container>)newValue);
				return;
			case ComponentBasedSystemPackage.ENVIRONMENT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
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
			case ComponentBasedSystemPackage.ENVIRONMENT__CONTAINER:
				getContainer().clear();
				return;
			case ComponentBasedSystemPackage.ENVIRONMENT__LINK:
				getLink().clear();
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
			case ComponentBasedSystemPackage.ENVIRONMENT__CONTAINER:
				return container != null && !container.isEmpty();
			case ComponentBasedSystemPackage.ENVIRONMENT__LINK:
				return link != null && !link.isEmpty();
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
			case ComponentBasedSystemPackage.ENVIRONMENT___IS_LINKED__CONTAINER_CONTAINER:
				return IsLinked((componentBasedSystem.Container)arguments.get(0), (componentBasedSystem.Container)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EnvironmentImpl
