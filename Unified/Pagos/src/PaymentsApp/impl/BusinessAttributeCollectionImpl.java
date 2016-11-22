/**
 */
package PaymentsApp.impl;

import PaymentsApp.BusinessAttribute;
import PaymentsApp.BusinessAttributeCollection;
import PaymentsApp.PaymentsAppPackage;

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
 * An implementation of the model object '<em><b>Business Attribute Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.BusinessAttributeCollectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.impl.BusinessAttributeCollectionImpl#getBusinessAttributes <em>Business Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessAttributeCollectionImpl extends EObjectImpl implements BusinessAttributeCollection {
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
	 * The cached value of the '{@link #getBusinessAttributes() <em>Business Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessAttribute> businessAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessAttributeCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentsAppPackage.Literals.BUSINESS_ATTRIBUTE_COLLECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.BUSINESS_ATTRIBUTE_COLLECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessAttribute> getBusinessAttributes() {
		if (businessAttributes == null) {
			businessAttributes = new EObjectContainmentEList<BusinessAttribute>(BusinessAttribute.class, this, PaymentsAppPackage.BUSINESS_ATTRIBUTE_COLLECTION__BUSINESS_ATTRIBUTES);
		}
		return businessAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE_COLLECTION__BUSINESS_ATTRIBUTES:
				return ((InternalEList<?>)getBusinessAttributes()).basicRemove(otherEnd, msgs);
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
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE_COLLECTION__NAME:
				return getName();
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE_COLLECTION__BUSINESS_ATTRIBUTES:
				return getBusinessAttributes();
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
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE_COLLECTION__NAME:
				setName((String)newValue);
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE_COLLECTION__BUSINESS_ATTRIBUTES:
				getBusinessAttributes().clear();
				getBusinessAttributes().addAll((Collection<? extends BusinessAttribute>)newValue);
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
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE_COLLECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE_COLLECTION__BUSINESS_ATTRIBUTES:
				getBusinessAttributes().clear();
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
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE_COLLECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE_COLLECTION__BUSINESS_ATTRIBUTES:
				return businessAttributes != null && !businessAttributes.isEmpty();
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

} //BusinessAttributeCollectionImpl
