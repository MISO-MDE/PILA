/**
 */
package PaymentsApp.provider;


import PaymentsApp.Intermediary;
import PaymentsApp.PaymentsAppFactory;
import PaymentsApp.PaymentsAppPackage;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link PaymentsApp.Intermediary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediaryItemProvider 
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
	public IntermediaryItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Intermediary_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intermediary_name_feature", "_UI_Intermediary_type"),
				 PaymentsAppPackage.Literals.INTERMEDIARY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Intermediary_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Intermediary_description_feature", "_UI_Intermediary_type"),
				 PaymentsAppPackage.Literals.INTERMEDIARY__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(PaymentsAppPackage.Literals.INTERMEDIARY__PROVIDERS);
			childrenFeatures.add(PaymentsAppPackage.Literals.INTERMEDIARY__SUPERENTITY);
			childrenFeatures.add(PaymentsAppPackage.Literals.INTERMEDIARY__TEMPLATES);
			childrenFeatures.add(PaymentsAppPackage.Literals.INTERMEDIARY__PARTICIPANT_PROFILES);
			childrenFeatures.add(PaymentsAppPackage.Literals.INTERMEDIARY__INTERMEDIARY_ATTRIBUTES);
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
	 * This returns Intermediary.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Intermediary"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Intermediary)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Intermediary_type") :
			getString("_UI_Intermediary_type") + " " + label;
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

		switch (notification.getFeatureID(Intermediary.class)) {
			case PaymentsAppPackage.INTERMEDIARY__NAME:
			case PaymentsAppPackage.INTERMEDIARY__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PaymentsAppPackage.INTERMEDIARY__PROVIDERS:
			case PaymentsAppPackage.INTERMEDIARY__SUPERENTITY:
			case PaymentsAppPackage.INTERMEDIARY__TEMPLATES:
			case PaymentsAppPackage.INTERMEDIARY__PARTICIPANT_PROFILES:
			case PaymentsAppPackage.INTERMEDIARY__INTERMEDIARY_ATTRIBUTES:
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
				(PaymentsAppPackage.Literals.INTERMEDIARY__PROVIDERS,
				 PaymentsAppFactory.eINSTANCE.createProvider()));

		newChildDescriptors.add
			(createChildParameter
				(PaymentsAppPackage.Literals.INTERMEDIARY__SUPERENTITY,
				 PaymentsAppFactory.eINSTANCE.createSuperEntity()));

		newChildDescriptors.add
			(createChildParameter
				(PaymentsAppPackage.Literals.INTERMEDIARY__TEMPLATES,
				 PaymentsAppFactory.eINSTANCE.createDataForm()));

		newChildDescriptors.add
			(createChildParameter
				(PaymentsAppPackage.Literals.INTERMEDIARY__PARTICIPANT_PROFILES,
				 PaymentsAppFactory.eINSTANCE.createParticipantProfile()));

		newChildDescriptors.add
			(createChildParameter
				(PaymentsAppPackage.Literals.INTERMEDIARY__INTERMEDIARY_ATTRIBUTES,
				 PaymentsAppFactory.eINSTANCE.createBusinessAttributeCollection()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SistemaPagosEditPlugin.INSTANCE;
	}

}
