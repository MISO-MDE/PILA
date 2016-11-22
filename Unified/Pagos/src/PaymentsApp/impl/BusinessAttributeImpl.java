/**
 */
package PaymentsApp.impl;

import PaymentsApp.BusinessAttribute;
import PaymentsApp.BusinessValue;
import PaymentsApp.Expression;
import PaymentsApp.PaymentsAppPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.BusinessAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.impl.BusinessAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link PaymentsApp.impl.BusinessAttributeImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link PaymentsApp.impl.BusinessAttributeImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link PaymentsApp.impl.BusinessAttributeImpl#getBusinessValue <em>Business Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessAttributeImpl extends EObjectImpl implements BusinessAttribute {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp()
	 * @generated
	 * @ordered
	 */
	protected Expression exp;

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
	 * The cached value of the '{@link #getBusinessValue() <em>Business Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessValue()
	 * @generated
	 * @ordered
	 */
	protected BusinessValue businessValue;

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
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.BUSINESS_ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExp() {
		return exp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExp(Expression newExp, NotificationChain msgs) {
		Expression oldExp = exp;
		exp = newExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.BUSINESS_ATTRIBUTE__EXP, oldExp, newExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExp(Expression newExp) {
		if (newExp != exp) {
			NotificationChain msgs = null;
			if (exp != null)
				msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.BUSINESS_ATTRIBUTE__EXP, null, msgs);
			if (newExp != null)
				msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.BUSINESS_ATTRIBUTE__EXP, null, msgs);
			msgs = basicSetExp(newExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.BUSINESS_ATTRIBUTE__EXP, newExp, newExp));
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
	public BusinessValue getBusinessValue() {
		if (businessValue != null && businessValue.eIsProxy()) {
			InternalEObject oldBusinessValue = (InternalEObject)businessValue;
			businessValue = (BusinessValue)eResolveProxy(oldBusinessValue);
			if (businessValue != oldBusinessValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_VALUE, oldBusinessValue, businessValue));
			}
		}
		return businessValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessValue basicGetBusinessValue() {
		return businessValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessValue(BusinessValue newBusinessValue) {
		BusinessValue oldBusinessValue = businessValue;
		businessValue = newBusinessValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_VALUE, oldBusinessValue, businessValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__EXP:
				return basicSetExp(null, msgs);
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
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__TYPE:
				return getType();
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__EXP:
				return getExp();
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__RELATIONS:
				return getRelations();
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_VALUE:
				if (resolve) return getBusinessValue();
				return basicGetBusinessValue();
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
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__TYPE:
				setType((String)newValue);
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__EXP:
				setExp((Expression)newValue);
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends BusinessAttribute>)newValue);
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_VALUE:
				setBusinessValue((BusinessValue)newValue);
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
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__EXP:
				setExp((Expression)null);
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__RELATIONS:
				getRelations().clear();
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_VALUE:
				setBusinessValue((BusinessValue)null);
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
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__EXP:
				return exp != null;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__RELATIONS:
				return relations != null && !relations.isEmpty();
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE__BUSINESS_VALUE:
				return businessValue != null;
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //BusinessAttributeImpl
