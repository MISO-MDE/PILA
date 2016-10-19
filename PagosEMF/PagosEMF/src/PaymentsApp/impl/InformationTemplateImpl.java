/**
 */
package PaymentsApp.impl;

import PaymentsApp.BusinessAttributeCollection;
import PaymentsApp.InformationTemplate;
import PaymentsApp.ParticipantProfile;
import PaymentsApp.PaymentsAppPackage;
import PaymentsApp.Provider;

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
 * An implementation of the model object '<em><b>Information Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.InformationTemplateImpl#getParticipantsFields <em>Participants Fields</em>}</li>
 *   <li>{@link PaymentsApp.impl.InformationTemplateImpl#getProvidersFields <em>Providers Fields</em>}</li>
 *   <li>{@link PaymentsApp.impl.InformationTemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.impl.InformationTemplateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link PaymentsApp.impl.InformationTemplateImpl#getBusinessFields <em>Business Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationTemplateImpl extends MinimalEObjectImpl.Container implements InformationTemplate {
	/**
	 * The cached value of the '{@link #getParticipantsFields() <em>Participants Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantsFields()
	 * @generated
	 * @ordered
	 */
	protected EList<ParticipantProfile> participantsFields;

	/**
	 * The cached value of the '{@link #getProvidersFields() <em>Providers Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidersFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Provider> providersFields;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBusinessFields() <em>Business Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessFields()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessAttributeCollection> businessFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentsAppPackage.Literals.INFORMATION_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParticipantProfile> getParticipantsFields() {
		if (participantsFields == null) {
			participantsFields = new EObjectResolvingEList<ParticipantProfile>(ParticipantProfile.class, this, PaymentsAppPackage.INFORMATION_TEMPLATE__PARTICIPANTS_FIELDS);
		}
		return participantsFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provider> getProvidersFields() {
		if (providersFields == null) {
			providersFields = new EObjectResolvingEList<Provider>(Provider.class, this, PaymentsAppPackage.INFORMATION_TEMPLATE__PROVIDERS_FIELDS);
		}
		return providersFields;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.INFORMATION_TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.INFORMATION_TEMPLATE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessAttributeCollection> getBusinessFields() {
		if (businessFields == null) {
			businessFields = new EObjectContainmentEList<BusinessAttributeCollection>(BusinessAttributeCollection.class, this, PaymentsAppPackage.INFORMATION_TEMPLATE__BUSINESS_FIELDS);
		}
		return businessFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentsAppPackage.INFORMATION_TEMPLATE__BUSINESS_FIELDS:
				return ((InternalEList<?>)getBusinessFields()).basicRemove(otherEnd, msgs);
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
			case PaymentsAppPackage.INFORMATION_TEMPLATE__PARTICIPANTS_FIELDS:
				return getParticipantsFields();
			case PaymentsAppPackage.INFORMATION_TEMPLATE__PROVIDERS_FIELDS:
				return getProvidersFields();
			case PaymentsAppPackage.INFORMATION_TEMPLATE__NAME:
				return getName();
			case PaymentsAppPackage.INFORMATION_TEMPLATE__DESCRIPTION:
				return getDescription();
			case PaymentsAppPackage.INFORMATION_TEMPLATE__BUSINESS_FIELDS:
				return getBusinessFields();
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
			case PaymentsAppPackage.INFORMATION_TEMPLATE__PARTICIPANTS_FIELDS:
				getParticipantsFields().clear();
				getParticipantsFields().addAll((Collection<? extends ParticipantProfile>)newValue);
				return;
			case PaymentsAppPackage.INFORMATION_TEMPLATE__PROVIDERS_FIELDS:
				getProvidersFields().clear();
				getProvidersFields().addAll((Collection<? extends Provider>)newValue);
				return;
			case PaymentsAppPackage.INFORMATION_TEMPLATE__NAME:
				setName((String)newValue);
				return;
			case PaymentsAppPackage.INFORMATION_TEMPLATE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PaymentsAppPackage.INFORMATION_TEMPLATE__BUSINESS_FIELDS:
				getBusinessFields().clear();
				getBusinessFields().addAll((Collection<? extends BusinessAttributeCollection>)newValue);
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
			case PaymentsAppPackage.INFORMATION_TEMPLATE__PARTICIPANTS_FIELDS:
				getParticipantsFields().clear();
				return;
			case PaymentsAppPackage.INFORMATION_TEMPLATE__PROVIDERS_FIELDS:
				getProvidersFields().clear();
				return;
			case PaymentsAppPackage.INFORMATION_TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PaymentsAppPackage.INFORMATION_TEMPLATE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PaymentsAppPackage.INFORMATION_TEMPLATE__BUSINESS_FIELDS:
				getBusinessFields().clear();
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
			case PaymentsAppPackage.INFORMATION_TEMPLATE__PARTICIPANTS_FIELDS:
				return participantsFields != null && !participantsFields.isEmpty();
			case PaymentsAppPackage.INFORMATION_TEMPLATE__PROVIDERS_FIELDS:
				return providersFields != null && !providersFields.isEmpty();
			case PaymentsAppPackage.INFORMATION_TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PaymentsAppPackage.INFORMATION_TEMPLATE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PaymentsAppPackage.INFORMATION_TEMPLATE__BUSINESS_FIELDS:
				return businessFields != null && !businessFields.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //InformationTemplateImpl
