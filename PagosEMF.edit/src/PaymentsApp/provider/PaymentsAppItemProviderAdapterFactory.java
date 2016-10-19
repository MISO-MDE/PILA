/**
 */
package PaymentsApp.provider;

import PaymentsApp.util.PaymentsAppAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PaymentsAppItemProviderAdapterFactory extends PaymentsAppAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentsAppItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link PaymentsApp.Intermediary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediaryItemProvider intermediaryItemProvider;

	/**
	 * This creates an adapter for a {@link PaymentsApp.Intermediary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntermediaryAdapter() {
		if (intermediaryItemProvider == null) {
			intermediaryItemProvider = new IntermediaryItemProvider(this);
		}

		return intermediaryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link PaymentsApp.ParticipantProfile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantProfileItemProvider participantProfileItemProvider;

	/**
	 * This creates an adapter for a {@link PaymentsApp.ParticipantProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParticipantProfileAdapter() {
		if (participantProfileItemProvider == null) {
			participantProfileItemProvider = new ParticipantProfileItemProvider(this);
		}

		return participantProfileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link PaymentsApp.Provider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderItemProvider providerItemProvider;

	/**
	 * This creates an adapter for a {@link PaymentsApp.Provider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProviderAdapter() {
		if (providerItemProvider == null) {
			providerItemProvider = new ProviderItemProvider(this);
		}

		return providerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link PaymentsApp.BusinessAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessAttributeItemProvider businessAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link PaymentsApp.BusinessAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusinessAttributeAdapter() {
		if (businessAttributeItemProvider == null) {
			businessAttributeItemProvider = new BusinessAttributeItemProvider(this);
		}

		return businessAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link PaymentsApp.BusinessRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessRuleItemProvider businessRuleItemProvider;

	/**
	 * This creates an adapter for a {@link PaymentsApp.BusinessRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusinessRuleAdapter() {
		if (businessRuleItemProvider == null) {
			businessRuleItemProvider = new BusinessRuleItemProvider(this);
		}

		return businessRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link PaymentsApp.BusinessString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessStringItemProvider businessStringItemProvider;

	/**
	 * This creates an adapter for a {@link PaymentsApp.BusinessString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusinessStringAdapter() {
		if (businessStringItemProvider == null) {
			businessStringItemProvider = new BusinessStringItemProvider(this);
		}

		return businessStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link PaymentsApp.BusinessNumber} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessNumberItemProvider businessNumberItemProvider;

	/**
	 * This creates an adapter for a {@link PaymentsApp.BusinessNumber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusinessNumberAdapter() {
		if (businessNumberItemProvider == null) {
			businessNumberItemProvider = new BusinessNumberItemProvider(this);
		}

		return businessNumberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link PaymentsApp.BusinessCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessConditionItemProvider businessConditionItemProvider;

	/**
	 * This creates an adapter for a {@link PaymentsApp.BusinessCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusinessConditionAdapter() {
		if (businessConditionItemProvider == null) {
			businessConditionItemProvider = new BusinessConditionItemProvider(this);
		}

		return businessConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link PaymentsApp.BusinessAttributeCollection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessAttributeCollectionItemProvider businessAttributeCollectionItemProvider;

	/**
	 * This creates an adapter for a {@link PaymentsApp.BusinessAttributeCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusinessAttributeCollectionAdapter() {
		if (businessAttributeCollectionItemProvider == null) {
			businessAttributeCollectionItemProvider = new BusinessAttributeCollectionItemProvider(this);
		}

		return businessAttributeCollectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link PaymentsApp.InformationTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationTemplateItemProvider informationTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link PaymentsApp.InformationTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInformationTemplateAdapter() {
		if (informationTemplateItemProvider == null) {
			informationTemplateItemProvider = new InformationTemplateItemProvider(this);
		}

		return informationTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link PaymentsApp.BusinessCalculation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessCalculationItemProvider businessCalculationItemProvider;

	/**
	 * This creates an adapter for a {@link PaymentsApp.BusinessCalculation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusinessCalculationAdapter() {
		if (businessCalculationItemProvider == null) {
			businessCalculationItemProvider = new BusinessCalculationItemProvider(this);
		}

		return businessCalculationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link PaymentsApp.SuperEntity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperEntityItemProvider superEntityItemProvider;

	/**
	 * This creates an adapter for a {@link PaymentsApp.SuperEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSuperEntityAdapter() {
		if (superEntityItemProvider == null) {
			superEntityItemProvider = new SuperEntityItemProvider(this);
		}

		return superEntityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link PaymentsApp.Participant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantItemProvider participantItemProvider;

	/**
	 * This creates an adapter for a {@link PaymentsApp.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParticipantAdapter() {
		if (participantItemProvider == null) {
			participantItemProvider = new ParticipantItemProvider(this);
		}

		return participantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link PaymentsApp.Application} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationItemProvider applicationItemProvider;

	/**
	 * This creates an adapter for a {@link PaymentsApp.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationAdapter() {
		if (applicationItemProvider == null) {
			applicationItemProvider = new ApplicationItemProvider(this);
		}

		return applicationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (intermediaryItemProvider != null) intermediaryItemProvider.dispose();
		if (participantProfileItemProvider != null) participantProfileItemProvider.dispose();
		if (providerItemProvider != null) providerItemProvider.dispose();
		if (businessAttributeItemProvider != null) businessAttributeItemProvider.dispose();
		if (businessRuleItemProvider != null) businessRuleItemProvider.dispose();
		if (businessStringItemProvider != null) businessStringItemProvider.dispose();
		if (businessNumberItemProvider != null) businessNumberItemProvider.dispose();
		if (businessConditionItemProvider != null) businessConditionItemProvider.dispose();
		if (businessAttributeCollectionItemProvider != null) businessAttributeCollectionItemProvider.dispose();
		if (informationTemplateItemProvider != null) informationTemplateItemProvider.dispose();
		if (businessCalculationItemProvider != null) businessCalculationItemProvider.dispose();
		if (superEntityItemProvider != null) superEntityItemProvider.dispose();
		if (participantItemProvider != null) participantItemProvider.dispose();
		if (applicationItemProvider != null) applicationItemProvider.dispose();
	}

}
