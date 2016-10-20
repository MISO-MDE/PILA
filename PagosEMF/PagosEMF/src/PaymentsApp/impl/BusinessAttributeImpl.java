/**
 */
package PaymentsApp.impl;

import PaymentsApp.BusinessAttribute;
import PaymentsApp.BusinessCategory;
import PaymentsApp.BusinessRule;
import PaymentsApp.BusinessValue;
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
 * An implementation of the model object '<em><b>Business Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.BusinessAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.impl.BusinessAttributeImpl#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link PaymentsApp.impl.BusinessAttributeImpl#getBusinessRules <em>Business Rules</em>}</li>
 *   <li>{@link PaymentsApp.impl.BusinessAttributeImpl#getBusinessValue <em>Business Value</em>}</li>
 *   <li>{@link PaymentsApp.impl.BusinessAttributeImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessAttributeImpl extends MinimalEObjectImpl.Container implements BusinessAttribute {
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
	 * The default value of the '{@link #getBusinessCategory() <em>Business Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessCategory()
	 * @generated
	 * @ordered
	 */
	protected static final BusinessCategory BUSINESS_CATEGORY_EDEFAULT = BusinessCategory.CATEGORY_1;

	/**
	 * The cached value of the '{@link #getBusinessCategory() <em>Business Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessCategory()
	 * @generated
	 * @ordered
	 */
	protected BusinessCategory businessCategory = BUSINESS_CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBusinessRules() <em>Business Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessRules()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessRule> businessRules;

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
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessAttribute> relations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentsAppPackage.Literals.BUSINESS_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.BUSINESS_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessCategory getBusinessCategory() {
		return businessCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessCategory(BusinessCategory newBusinessCategory) {
		BusinessCategory oldBusinessCategory = businessCategory;
		businessCategory = newBusinessCategory == null ? BUSINESS_CATEGORY_EDEFAULT : newBusinessCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_CATEGORY, oldBusinessCategory, businessCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessRule> getBusinessRules() {
		if (businessRules == null) {
			businessRules = new EObjectContainmentEList<BusinessRule>(BusinessRule.class, this, PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_RULES);
		}
		return businessRules;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_VALUE, oldBusinessValue, newBusinessValue);
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
				msgs = ((InternalEObject)businessValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_VALUE, null, msgs);
			if (newBusinessValue != null)
				msgs = ((InternalEObject)newBusinessValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_VALUE, null, msgs);
			msgs = basicSetBusinessValue(newBusinessValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_VALUE, newBusinessValue, newBusinessValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessAttribute> getRelations() {
		if (relations == null) {
			relations = new EObjectResolvingEList<BusinessAttribute>(BusinessAttribute.class, this, PaymentsAppPackage.BUSINESS_ATTRIBUTE__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_RULES:
				return ((InternalEList<?>)getBusinessRules()).basicRemove(otherEnd, msgs);
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_VALUE:
				return basicSetBusinessValue(null, msgs);
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
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__NAME:
				return getName();
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_CATEGORY:
				return getBusinessCategory();
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_RULES:
				return getBusinessRules();
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_VALUE:
				return getBusinessValue();
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__RELATIONS:
				return getRelations();
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
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_CATEGORY:
				setBusinessCategory((BusinessCategory)newValue);
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_RULES:
				getBusinessRules().clear();
				getBusinessRules().addAll((Collection<? extends BusinessRule>)newValue);
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_VALUE:
				setBusinessValue((BusinessValue)newValue);
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends BusinessAttribute>)newValue);
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
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_CATEGORY:
				setBusinessCategory(BUSINESS_CATEGORY_EDEFAULT);
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_RULES:
				getBusinessRules().clear();
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_VALUE:
				setBusinessValue((BusinessValue)null);
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__RELATIONS:
				getRelations().clear();
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
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_CATEGORY:
				return businessCategory != BUSINESS_CATEGORY_EDEFAULT;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_RULES:
				return businessRules != null && !businessRules.isEmpty();
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_VALUE:
				return businessValue != null;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__RELATIONS:
				return relations != null && !relations.isEmpty();
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
		result.append(", businessCategory: ");
		result.append(businessCategory);
		result.append(')');
		return result.toString();
	}

} //BusinessAttributeImpl
