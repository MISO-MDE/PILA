/**
 */
package PaymentsApp.impl;

import PaymentsApp.BusinessAttributeCollection;
import PaymentsApp.BusinessValue;
import PaymentsApp.DataForm;
import PaymentsApp.Intermediary;
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
 * An implementation of the model object '<em><b>Intermediary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.IntermediaryImpl#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.impl.IntermediaryImpl#getSuperentities <em>Superentities</em>}</li>
 *   <li>{@link PaymentsApp.impl.IntermediaryImpl#getBusinessValue <em>Business Value</em>}</li>
 *   <li>{@link PaymentsApp.impl.IntermediaryImpl#getIntermediaryAttributes <em>Intermediary Attributes</em>}</li>
 *   <li>{@link PaymentsApp.impl.IntermediaryImpl#getTemplates <em>Templates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermediaryImpl extends EObjectImpl implements Intermediary {
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
	 * The cached value of the '{@link #getSuperentities() <em>Superentities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperentities()
	 * @generated
	 * @ordered
	 */
	protected EList<SuperEntity> superentities;

	/**
	 * The cached value of the '{@link #getBusinessValue() <em>Business Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessValue()
	 * @generated
	 * @ordered
	 */
	protected BusinessValue businessValue;

	/**
	 * The cached value of the '{@link #getIntermediaryAttributes() <em>Intermediary Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediaryAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessAttributeCollection> intermediaryAttributes;

	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<DataForm> templates;

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
	public EList<SuperEntity> getSuperentities() {
		if (superentities == null) {
			superentities = new EObjectContainmentEList<SuperEntity>(SuperEntity.class, this, PaymentsAppPackage.INTERMEDIARY__SUPERENTITIES);
		}
		return superentities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessValue getBusinessValue() {
		return businessValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessValue(BusinessValue newBusinessValue, NotificationChain msgs) {
		BusinessValue oldBusinessValue = businessValue;
		businessValue = newBusinessValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.INTERMEDIARY__BUSINESS_VALUE, oldBusinessValue, newBusinessValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessValue(BusinessValue newBusinessValue) {
		if (newBusinessValue != businessValue) {
			NotificationChain msgs = null;
			if (businessValue != null)
				msgs = ((InternalEObject)businessValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.INTERMEDIARY__BUSINESS_VALUE, null, msgs);
			if (newBusinessValue != null)
				msgs = ((InternalEObject)newBusinessValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.INTERMEDIARY__BUSINESS_VALUE, null, msgs);
			msgs = basicSetBusinessValue(newBusinessValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.INTERMEDIARY__BUSINESS_VALUE, newBusinessValue, newBusinessValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessAttributeCollection> getIntermediaryAttributes() {
		if (intermediaryAttributes == null) {
			intermediaryAttributes = new EObjectContainmentEList<BusinessAttributeCollection>(BusinessAttributeCollection.class, this, PaymentsAppPackage.INTERMEDIARY__INTERMEDIARY_ATTRIBUTES);
		}
		return intermediaryAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataForm> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<DataForm>(DataForm.class, this, PaymentsAppPackage.INTERMEDIARY__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentsAppPackage.INTERMEDIARY__SUPERENTITIES:
				return ((InternalEList<?>)getSuperentities()).basicRemove(otherEnd, msgs);
			case PaymentsAppPackage.INTERMEDIARY__BUSINESS_VALUE:
				return basicSetBusinessValue(null, msgs);
			case PaymentsAppPackage.INTERMEDIARY__INTERMEDIARY_ATTRIBUTES:
				return ((InternalEList<?>)getIntermediaryAttributes()).basicRemove(otherEnd, msgs);
			case PaymentsAppPackage.INTERMEDIARY__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
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
			case PaymentsAppPackage.INTERMEDIARY__SUPERENTITIES:
				return getSuperentities();
			case PaymentsAppPackage.INTERMEDIARY__BUSINESS_VALUE:
				return getBusinessValue();
			case PaymentsAppPackage.INTERMEDIARY__INTERMEDIARY_ATTRIBUTES:
				return getIntermediaryAttributes();
			case PaymentsAppPackage.INTERMEDIARY__TEMPLATES:
				return getTemplates();
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
			case PaymentsAppPackage.INTERMEDIARY__SUPERENTITIES:
				getSuperentities().clear();
				getSuperentities().addAll((Collection<? extends SuperEntity>)newValue);
				return;
			case PaymentsAppPackage.INTERMEDIARY__BUSINESS_VALUE:
				setBusinessValue((BusinessValue)newValue);
				return;
			case PaymentsAppPackage.INTERMEDIARY__INTERMEDIARY_ATTRIBUTES:
				getIntermediaryAttributes().clear();
				getIntermediaryAttributes().addAll((Collection<? extends BusinessAttributeCollection>)newValue);
				return;
			case PaymentsAppPackage.INTERMEDIARY__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends DataForm>)newValue);
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
			case PaymentsAppPackage.INTERMEDIARY__SUPERENTITIES:
				getSuperentities().clear();
				return;
			case PaymentsAppPackage.INTERMEDIARY__BUSINESS_VALUE:
				setBusinessValue((BusinessValue)null);
				return;
			case PaymentsAppPackage.INTERMEDIARY__INTERMEDIARY_ATTRIBUTES:
				getIntermediaryAttributes().clear();
				return;
			case PaymentsAppPackage.INTERMEDIARY__TEMPLATES:
				getTemplates().clear();
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
			case PaymentsAppPackage.INTERMEDIARY__SUPERENTITIES:
				return superentities != null && !superentities.isEmpty();
			case PaymentsAppPackage.INTERMEDIARY__BUSINESS_VALUE:
				return businessValue != null;
			case PaymentsAppPackage.INTERMEDIARY__INTERMEDIARY_ATTRIBUTES:
				return intermediaryAttributes != null && !intermediaryAttributes.isEmpty();
			case PaymentsAppPackage.INTERMEDIARY__TEMPLATES:
				return templates != null && !templates.isEmpty();
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

} //IntermediaryImpl
