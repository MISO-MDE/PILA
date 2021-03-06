/**
 */
package PaymentsApp.impl;

import PaymentsApp.BusinessAttributeCollection;
import PaymentsApp.Participant;
import PaymentsApp.ParticipantProfile;
import PaymentsApp.PaymentsAppPackage;

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
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.ParticipantImpl#getParticipantProfiles <em>Participant Profiles</em>}</li>
 *   <li>{@link PaymentsApp.impl.ParticipantImpl#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.impl.ParticipantImpl#getBusinessattributecollection <em>Businessattributecollection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends MinimalEObjectImpl.Container implements Participant {
	/**
	 * The cached value of the '{@link #getParticipantProfiles() <em>Participant Profiles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ParticipantProfile> participantProfiles;

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
	 * The cached value of the '{@link #getBusinessattributecollection() <em>Businessattributecollection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessattributecollection()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessAttributeCollection> businessattributecollection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentsAppPackage.Literals.PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParticipantProfile> getParticipantProfiles() {
		if (participantProfiles == null) {
			participantProfiles = new EObjectResolvingEList<ParticipantProfile>(ParticipantProfile.class, this, PaymentsAppPackage.PARTICIPANT__PARTICIPANT_PROFILES);
		}
		return participantProfiles;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.PARTICIPANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessAttributeCollection> getBusinessattributecollection() {
		if (businessattributecollection == null) {
			businessattributecollection = new EObjectContainmentEList<BusinessAttributeCollection>(BusinessAttributeCollection.class, this, PaymentsAppPackage.PARTICIPANT__BUSINESSATTRIBUTECOLLECTION);
		}
		return businessattributecollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentsAppPackage.PARTICIPANT__BUSINESSATTRIBUTECOLLECTION:
				return ((InternalEList<?>)getBusinessattributecollection()).basicRemove(otherEnd, msgs);
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
			case PaymentsAppPackage.PARTICIPANT__PARTICIPANT_PROFILES:
				return getParticipantProfiles();
			case PaymentsAppPackage.PARTICIPANT__NAME:
				return getName();
			case PaymentsAppPackage.PARTICIPANT__BUSINESSATTRIBUTECOLLECTION:
				return getBusinessattributecollection();
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
			case PaymentsAppPackage.PARTICIPANT__PARTICIPANT_PROFILES:
				getParticipantProfiles().clear();
				getParticipantProfiles().addAll((Collection<? extends ParticipantProfile>)newValue);
				return;
			case PaymentsAppPackage.PARTICIPANT__NAME:
				setName((String)newValue);
				return;
			case PaymentsAppPackage.PARTICIPANT__BUSINESSATTRIBUTECOLLECTION:
				getBusinessattributecollection().clear();
				getBusinessattributecollection().addAll((Collection<? extends BusinessAttributeCollection>)newValue);
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
			case PaymentsAppPackage.PARTICIPANT__PARTICIPANT_PROFILES:
				getParticipantProfiles().clear();
				return;
			case PaymentsAppPackage.PARTICIPANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PaymentsAppPackage.PARTICIPANT__BUSINESSATTRIBUTECOLLECTION:
				getBusinessattributecollection().clear();
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
			case PaymentsAppPackage.PARTICIPANT__PARTICIPANT_PROFILES:
				return participantProfiles != null && !participantProfiles.isEmpty();
			case PaymentsAppPackage.PARTICIPANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PaymentsAppPackage.PARTICIPANT__BUSINESSATTRIBUTECOLLECTION:
				return businessattributecollection != null && !businessattributecollection.isEmpty();
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

} //ParticipantImpl
