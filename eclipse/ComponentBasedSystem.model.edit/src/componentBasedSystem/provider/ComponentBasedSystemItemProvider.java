/**
 */
package componentBasedSystem.provider;


import componentBasedSystem.ComponentBasedSystem;
import componentBasedSystem.ComponentBasedSystemFactory;
import componentBasedSystem.ComponentBasedSystemPackage;

import componentBasedSystem.dataTypes.DataTypesFactory;
import componentBasedSystem.roles.RolesFactory;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link componentBasedSystem.ComponentBasedSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentBasedSystemItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentBasedSystemItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addProvidedrolePropertyDescriptor(object);
			addRequiredrolePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Providedrole feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidedrolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentBasedSystem_providedrole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentBasedSystem_providedrole_feature", "_UI_ComponentBasedSystem_type"),
				 ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__PROVIDEDROLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requiredrole feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredrolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentBasedSystem_requiredrole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentBasedSystem_requiredrole_feature", "_UI_ComponentBasedSystem_type"),
				 ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__REQUIREDROLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__ASSEMBLYCONTEXT);
			childrenFeatures.add(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__TYPE);
			childrenFeatures.add(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__ASSEMBLYCONNECTOR);
			childrenFeatures.add(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__ALLOCATION);
			childrenFeatures.add(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__REPOSITORY);
			childrenFeatures.add(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__ENVIRONMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComponentBasedSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentBasedSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ComponentBasedSystem_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ComponentBasedSystem.class)) {
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONTEXT:
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__TYPE:
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ASSEMBLYCONNECTOR:
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ALLOCATION:
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__REPOSITORY:
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM__ENVIRONMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__ASSEMBLYCONTEXT,
				 ComponentBasedSystemFactory.eINSTANCE.createAssemblyContext()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__TYPE,
				 DataTypesFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__TYPE,
				 DataTypesFactory.eINSTANCE.createParameterType()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__TYPE,
				 DataTypesFactory.eINSTANCE.createSimple()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__TYPE,
				 DataTypesFactory.eINSTANCE.createReturnType()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__TYPE,
				 DataTypesFactory.eINSTANCE.createComplex()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__TYPE,
				 DataTypesFactory.eINSTANCE.createVoid()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__ASSEMBLYCONNECTOR,
				 RolesFactory.eINSTANCE.createAssemblyConnector()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__ALLOCATION,
				 ComponentBasedSystemFactory.eINSTANCE.createAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__REPOSITORY,
				 ComponentBasedSystemFactory.eINSTANCE.createRepository()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentBasedSystemPackage.Literals.COMPONENT_BASED_SYSTEM__ENVIRONMENT,
				 ComponentBasedSystemFactory.eINSTANCE.createEnvironment()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ComponentBasedSystemEditPlugin.INSTANCE;
	}

}
