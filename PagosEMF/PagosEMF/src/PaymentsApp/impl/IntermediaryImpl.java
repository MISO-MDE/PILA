/**
 */
package PaymentsApp.impl;

import PaymentsApp.InformationTemplate;
import PaymentsApp.Intermediary;
import PaymentsApp.ParticipantProfile;
import PaymentsApp.PaymentsAppPackage;
import PaymentsApp.Provider;
import PaymentsApp.SuperEntity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.IntermediaryImpl#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.impl.IntermediaryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link PaymentsApp.impl.IntermediaryImpl#getProviders <em>Providers</em>}</li>
 *   <li>{@link PaymentsApp.impl.IntermediaryImpl#getSuperentity <em>Superentity</em>}</li>
 *   <li>{@link PaymentsApp.impl.IntermediaryImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link PaymentsApp.impl.IntermediaryImpl#getParticipantprofiles <em>Participantprofiles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermediaryImpl extends MinimalEObjectImpl.Container implements Intermediary {
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
	 * The cached value of the '{@link #getProviders() <em>Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<Provider> providers;

	/**
	 * The cached value of the '{@link #getSuperentity() <em>Superentity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperentity()
	 * @generated
	 * @ordered
	 */
	protected EList<SuperEntity> superentity;

	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationTemplate> templates;

	/**
	 * The cached value of the '{@link #getParticipantprofiles() <em>Participantprofiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantprofiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ParticipantProfile> participantprofiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentsAppPackage.Literals.INTERMEDIARY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.INTERMEDIARY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.INTERMEDIARY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provider> getProviders() {
		if (providers == null) {
			providers = new EObjectContainmentEList<Provider>(Provider.class, this, PaymentsAppPackage.INTERMEDIARY__PROVIDERS);
		}
		return providers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuperEntity> getSuperentity() {
		if (superentity == null) {
			superentity = new EObjectContainmentEList<SuperEntity>(SuperEntity.class, this, PaymentsAppPackage.INTERMEDIARY__SUPERENTITY);
		}
		return superentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationTemplate> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<InformationTemplate>(InformationTemplate.class, this, PaymentsAppPackage.INTERMEDIARY__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParticipantProfile> getParticipantprofiles() {
		if (participantprofiles == null) {
			participantprofiles = new EObjectContainmentEList<ParticipantProfile>(ParticipantProfile.class, this, PaymentsAppPackage.INTERMEDIARY__PARTICIPANTPROFILES);
		}
		return participantprofiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentsAppPackage.INTERMEDIARY__PROVIDERS:
				return ((InternalEList<?>)getProviders()).basicRemove(otherEnd, msgs);
			case PaymentsAppPackage.INTERMEDIARY__SUPERENTITY:
				return ((InternalEList<?>)getSuperentity()).basicRemove(otherEnd, msgs);
			case PaymentsAppPackage.INTERMEDIARY__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
			case PaymentsAppPackage.INTERMEDIARY__PARTICIPANTPROFILES:
				return ((InternalEList<?>)getParticipantprofiles()).basicRemove(otherEnd, msgs);
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
			case PaymentsAppPackage.INTERMEDIARY__NAME:
				return getName();
			case PaymentsAppPackage.INTERMEDIARY__DESCRIPTION:
				return getDescription();
			case PaymentsAppPackage.INTERMEDIARY__PROVIDERS:
				return getProviders();
			case PaymentsAppPackage.INTERMEDIARY__SUPERENTITY:
				return getSuperentity();
			case PaymentsAppPackage.INTERMEDIARY__TEMPLATES:
				return getTemplates();
			case PaymentsAppPackage.INTERMEDIARY__PARTICIPANTPROFILES:
				return getParticipantprofiles();
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
			case PaymentsAppPackage.INTERMEDIARY__NAME:
				setName((String)newValue);
				return;
			case PaymentsAppPackage.INTERMEDIARY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PaymentsAppPackage.INTERMEDIARY__PROVIDERS:
				getProviders().clear();
				getProviders().addAll((Collection<? extends Provider>)newValue);
				return;
			case PaymentsAppPackage.INTERMEDIARY__SUPERENTITY:
				getSuperentity().clear();
				getSuperentity().addAll((Collection<? extends SuperEntity>)newValue);
				return;
			case PaymentsAppPackage.INTERMEDIARY__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends InformationTemplate>)newValue);
				return;
			case PaymentsAppPackage.INTERMEDIARY__PARTICIPANTPROFILES:
				getParticipantprofiles().clear();
				getParticipantprofiles().addAll((Collection<? extends ParticipantProfile>)newValue);
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
			case PaymentsAppPackage.INTERMEDIARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PaymentsAppPackage.INTERMEDIARY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PaymentsAppPackage.INTERMEDIARY__PROVIDERS:
				getProviders().clear();
				return;
			case PaymentsAppPackage.INTERMEDIARY__SUPERENTITY:
				getSuperentity().clear();
				return;
			case PaymentsAppPackage.INTERMEDIARY__TEMPLATES:
				getTemplates().clear();
				return;
			case PaymentsAppPackage.INTERMEDIARY__PARTICIPANTPROFILES:
				getParticipantprofiles().clear();
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
			case PaymentsAppPackage.INTERMEDIARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PaymentsAppPackage.INTERMEDIARY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PaymentsAppPackage.INTERMEDIARY__PROVIDERS:
				return providers != null && !providers.isEmpty();
			case PaymentsAppPackage.INTERMEDIARY__SUPERENTITY:
				return superentity != null && !superentity.isEmpty();
			case PaymentsAppPackage.INTERMEDIARY__TEMPLATES:
				return templates != null && !templates.isEmpty();
			case PaymentsAppPackage.INTERMEDIARY__PARTICIPANTPROFILES:
				return participantprofiles != null && !participantprofiles.isEmpty();
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

} //IntermediaryImpl
