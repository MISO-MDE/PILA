/**
 */
package PaymentsApp.impl;

import PaymentsApp.BusinessAttributeCollection;
import PaymentsApp.InformationTemplate;
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.SuperEntityImpl#getSuperEntityAttributes <em>Super Entity Attributes</em>}</li>
 *   <li>{@link PaymentsApp.impl.SuperEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.impl.SuperEntityImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link PaymentsApp.impl.SuperEntityImpl#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperEntityImpl extends MinimalEObjectImpl.Container implements SuperEntity {
	/**
	 * The cached value of the '{@link #getSuperEntityAttributes() <em>Super Entity Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperEntityAttributes()
	 * @generated
	 * @ordered
	 */
	protected BusinessAttributeCollection superEntityAttributes;

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
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationTemplate> templates;

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
	public BusinessAttributeCollection getSuperEntityAttributes() {
		return superEntityAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperEntityAttributes(BusinessAttributeCollection newSuperEntityAttributes, NotificationChain msgs) {
		BusinessAttributeCollection oldSuperEntityAttributes = superEntityAttributes;
		superEntityAttributes = newSuperEntityAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.SUPER_ENTITY__SUPER_ENTITY_ATTRIBUTES, oldSuperEntityAttributes, newSuperEntityAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperEntityAttributes(BusinessAttributeCollection newSuperEntityAttributes) {
		if (newSuperEntityAttributes != superEntityAttributes) {
			NotificationChain msgs = null;
			if (superEntityAttributes != null)
				msgs = ((InternalEObject)superEntityAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.SUPER_ENTITY__SUPER_ENTITY_ATTRIBUTES, null, msgs);
			if (newSuperEntityAttributes != null)
				msgs = ((InternalEObject)newSuperEntityAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.SUPER_ENTITY__SUPER_ENTITY_ATTRIBUTES, null, msgs);
			msgs = basicSetSuperEntityAttributes(newSuperEntityAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.SUPER_ENTITY__SUPER_ENTITY_ATTRIBUTES, newSuperEntityAttributes, newSuperEntityAttributes));
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
	public EList<InformationTemplate> getTemplates() {
		if (templates == null) {
			templates = new EObjectResolvingEList<InformationTemplate>(InformationTemplate.class, this, PaymentsAppPackage.SUPER_ENTITY__TEMPLATES);
		}
		return templates;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentsAppPackage.SUPER_ENTITY__SUPER_ENTITY_ATTRIBUTES:
				return basicSetSuperEntityAttributes(null, msgs);
			case PaymentsAppPackage.SUPER_ENTITY__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
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
			case PaymentsAppPackage.SUPER_ENTITY__SUPER_ENTITY_ATTRIBUTES:
				return getSuperEntityAttributes();
			case PaymentsAppPackage.SUPER_ENTITY__NAME:
				return getName();
			case PaymentsAppPackage.SUPER_ENTITY__TEMPLATES:
				return getTemplates();
			case PaymentsAppPackage.SUPER_ENTITY__PARTICIPANTS:
				return getParticipants();
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
			case PaymentsAppPackage.SUPER_ENTITY__SUPER_ENTITY_ATTRIBUTES:
				setSuperEntityAttributes((BusinessAttributeCollection)newValue);
				return;
			case PaymentsAppPackage.SUPER_ENTITY__NAME:
				setName((String)newValue);
				return;
			case PaymentsAppPackage.SUPER_ENTITY__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends InformationTemplate>)newValue);
				return;
			case PaymentsAppPackage.SUPER_ENTITY__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant>)newValue);
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
			case PaymentsAppPackage.SUPER_ENTITY__SUPER_ENTITY_ATTRIBUTES:
				setSuperEntityAttributes((BusinessAttributeCollection)null);
				return;
			case PaymentsAppPackage.SUPER_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PaymentsAppPackage.SUPER_ENTITY__TEMPLATES:
				getTemplates().clear();
				return;
			case PaymentsAppPackage.SUPER_ENTITY__PARTICIPANTS:
				getParticipants().clear();
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
			case PaymentsAppPackage.SUPER_ENTITY__SUPER_ENTITY_ATTRIBUTES:
				return superEntityAttributes != null;
			case PaymentsAppPackage.SUPER_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PaymentsAppPackage.SUPER_ENTITY__TEMPLATES:
				return templates != null && !templates.isEmpty();
			case PaymentsAppPackage.SUPER_ENTITY__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
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

} //SuperEntityImpl
