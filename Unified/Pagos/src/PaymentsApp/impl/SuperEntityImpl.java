/**
 */
package PaymentsApp.impl;

import PaymentsApp.BusinessAttribute;
import PaymentsApp.BusinessAttributeCollection;
import PaymentsApp.Participant;
import PaymentsApp.PaymentsAppPackage;
import PaymentsApp.SuperEntity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.SuperEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.impl.SuperEntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link PaymentsApp.impl.SuperEntityImpl#getAttLists <em>Att Lists</em>}</li>
 *   <li>{@link PaymentsApp.impl.SuperEntityImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link PaymentsApp.impl.SuperEntityImpl#getBusinessFields <em>Business Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperEntityImpl extends EObjectImpl implements SuperEntity {
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
	 * The cached value of the '{@link #getAttLists() <em>Att Lists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttLists()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessAttribute> attLists;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participants;

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
	protected SuperEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentsAppPackage.Literals.SUPER_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.SUPER_ENTITY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.SUPER_ENTITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessAttribute> getAttLists() {
		if (attLists == null) {
			attLists = new EObjectContainmentEList<BusinessAttribute>(BusinessAttribute.class, this, PaymentsAppPackage.SUPER_ENTITY__ATT_LISTS);
		}
		return attLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<Participant>(Participant.class, this, PaymentsAppPackage.SUPER_ENTITY__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessAttributeCollection> getBusinessFields() {
		if (businessFields == null) {
			businessFields = new EObjectContainmentEList<BusinessAttributeCollection>(BusinessAttributeCollection.class, this, PaymentsAppPackage.SUPER_ENTITY__BUSINESS_FIELDS);
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
			case PaymentsAppPackage.SUPER_ENTITY__ATT_LISTS:
				return ((InternalEList<?>)getAttLists()).basicRemove(otherEnd, msgs);
			case PaymentsAppPackage.SUPER_ENTITY__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case PaymentsAppPackage.SUPER_ENTITY__BUSINESS_FIELDS:
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
			case PaymentsAppPackage.SUPER_ENTITY__NAME:
				return getName();
			case PaymentsAppPackage.SUPER_ENTITY__DESCRIPTION:
				return getDescription();
			case PaymentsAppPackage.SUPER_ENTITY__ATT_LISTS:
				return getAttLists();
			case PaymentsAppPackage.SUPER_ENTITY__PARTICIPANTS:
				return getParticipants();
			case PaymentsAppPackage.SUPER_ENTITY__BUSINESS_FIELDS:
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
			case PaymentsAppPackage.SUPER_ENTITY__NAME:
				setName((String)newValue);
				return;
			case PaymentsAppPackage.SUPER_ENTITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PaymentsAppPackage.SUPER_ENTITY__ATT_LISTS:
				getAttLists().clear();
				getAttLists().addAll((Collection<? extends BusinessAttribute>)newValue);
				return;
			case PaymentsAppPackage.SUPER_ENTITY__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant>)newValue);
				return;
			case PaymentsAppPackage.SUPER_ENTITY__BUSINESS_FIELDS:
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
			case PaymentsAppPackage.SUPER_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PaymentsAppPackage.SUPER_ENTITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PaymentsAppPackage.SUPER_ENTITY__ATT_LISTS:
				getAttLists().clear();
				return;
			case PaymentsAppPackage.SUPER_ENTITY__PARTICIPANTS:
				getParticipants().clear();
				return;
			case PaymentsAppPackage.SUPER_ENTITY__BUSINESS_FIELDS:
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
			case PaymentsAppPackage.SUPER_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PaymentsAppPackage.SUPER_ENTITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PaymentsAppPackage.SUPER_ENTITY__ATT_LISTS:
				return attLists != null && !attLists.isEmpty();
			case PaymentsAppPackage.SUPER_ENTITY__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case PaymentsAppPackage.SUPER_ENTITY__BUSINESS_FIELDS:
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

} //SuperEntityImpl
