/**
 */
package PaymentsApp.impl;

import PaymentsApp.BusinessAttributeCollection;
import PaymentsApp.ParticipantProfile;
import PaymentsApp.PaymentsAppPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.ParticipantProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.impl.ParticipantProfileImpl#getParticipantAttributes <em>Participant Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantProfileImpl extends MinimalEObjectImpl.Container implements ParticipantProfile {
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
	 * The cached value of the '{@link #getParticipantAttributes() <em>Participant Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantAttributes()
	 * @generated
	 * @ordered
	 */
	protected BusinessAttributeCollection participantAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentsAppPackage.Literals.PARTICIPANT_PROFILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.PARTICIPANT_PROFILE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessAttributeCollection getParticipantAttributes() {
		return participantAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantAttributes(BusinessAttributeCollection newParticipantAttributes, NotificationChain msgs) {
		BusinessAttributeCollection oldParticipantAttributes = participantAttributes;
		participantAttributes = newParticipantAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.PARTICIPANT_PROFILE__PARTICIPANT_ATTRIBUTES, oldParticipantAttributes, newParticipantAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantAttributes(BusinessAttributeCollection newParticipantAttributes) {
		if (newParticipantAttributes != participantAttributes) {
			NotificationChain msgs = null;
			if (participantAttributes != null)
				msgs = ((InternalEObject)participantAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.PARTICIPANT_PROFILE__PARTICIPANT_ATTRIBUTES, null, msgs);
			if (newParticipantAttributes != null)
				msgs = ((InternalEObject)newParticipantAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.PARTICIPANT_PROFILE__PARTICIPANT_ATTRIBUTES, null, msgs);
			msgs = basicSetParticipantAttributes(newParticipantAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.PARTICIPANT_PROFILE__PARTICIPANT_ATTRIBUTES, newParticipantAttributes, newParticipantAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentsAppPackage.PARTICIPANT_PROFILE__PARTICIPANT_ATTRIBUTES:
				return basicSetParticipantAttributes(null, msgs);
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
			case PaymentsAppPackage.PARTICIPANT_PROFILE__NAME:
				return getName();
			case PaymentsAppPackage.PARTICIPANT_PROFILE__PARTICIPANT_ATTRIBUTES:
				return getParticipantAttributes();
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
			case PaymentsAppPackage.PARTICIPANT_PROFILE__NAME:
				setName((String)newValue);
				return;
			case PaymentsAppPackage.PARTICIPANT_PROFILE__PARTICIPANT_ATTRIBUTES:
				setParticipantAttributes((BusinessAttributeCollection)newValue);
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
			case PaymentsAppPackage.PARTICIPANT_PROFILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PaymentsAppPackage.PARTICIPANT_PROFILE__PARTICIPANT_ATTRIBUTES:
				setParticipantAttributes((BusinessAttributeCollection)null);
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
			case PaymentsAppPackage.PARTICIPANT_PROFILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PaymentsAppPackage.PARTICIPANT_PROFILE__PARTICIPANT_ATTRIBUTES:
				return participantAttributes != null;
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

} //ParticipantProfileImpl
