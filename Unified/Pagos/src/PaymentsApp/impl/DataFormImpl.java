/**
 */
package PaymentsApp.impl;

import PaymentsApp.BusinessAttributeCollection;
import PaymentsApp.DataForm;
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
 * An implementation of the model object '<em><b>Data Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.DataFormImpl#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.impl.DataFormImpl#getSuperEntityAttributes <em>Super Entity Attributes</em>}</li>
 *   <li>{@link PaymentsApp.impl.DataFormImpl#getBusinessFields <em>Business Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFormImpl extends EObjectImpl implements DataForm {
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
	 * The cached value of the '{@link #getSuperEntityAttributes() <em>Super Entity Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperEntityAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessAttributeCollection> superEntityAttributes;

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
	protected DataFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentsAppPackage.Literals.DATA_FORM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.DATA_FORM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessAttributeCollection> getSuperEntityAttributes() {
		if (superEntityAttributes == null) {
			superEntityAttributes = new EObjectContainmentEList<BusinessAttributeCollection>(BusinessAttributeCollection.class, this, PaymentsAppPackage.DATA_FORM__SUPER_ENTITY_ATTRIBUTES);
		}
		return superEntityAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessAttributeCollection> getBusinessFields() {
		if (businessFields == null) {
			businessFields = new EObjectContainmentEList<BusinessAttributeCollection>(BusinessAttributeCollection.class, this, PaymentsAppPackage.DATA_FORM__BUSINESS_FIELDS);
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
			case PaymentsAppPackage.DATA_FORM__SUPER_ENTITY_ATTRIBUTES:
				return ((InternalEList<?>)getSuperEntityAttributes()).basicRemove(otherEnd, msgs);
			case PaymentsAppPackage.DATA_FORM__BUSINESS_FIELDS:
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
			case PaymentsAppPackage.DATA_FORM__NAME:
				return getName();
			case PaymentsAppPackage.DATA_FORM__SUPER_ENTITY_ATTRIBUTES:
				return getSuperEntityAttributes();
			case PaymentsAppPackage.DATA_FORM__BUSINESS_FIELDS:
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
			case PaymentsAppPackage.DATA_FORM__NAME:
				setName((String)newValue);
				return;
			case PaymentsAppPackage.DATA_FORM__SUPER_ENTITY_ATTRIBUTES:
				getSuperEntityAttributes().clear();
				getSuperEntityAttributes().addAll((Collection<? extends BusinessAttributeCollection>)newValue);
				return;
			case PaymentsAppPackage.DATA_FORM__BUSINESS_FIELDS:
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
			case PaymentsAppPackage.DATA_FORM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PaymentsAppPackage.DATA_FORM__SUPER_ENTITY_ATTRIBUTES:
				getSuperEntityAttributes().clear();
				return;
			case PaymentsAppPackage.DATA_FORM__BUSINESS_FIELDS:
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
			case PaymentsAppPackage.DATA_FORM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PaymentsAppPackage.DATA_FORM__SUPER_ENTITY_ATTRIBUTES:
				return superEntityAttributes != null && !superEntityAttributes.isEmpty();
			case PaymentsAppPackage.DATA_FORM__BUSINESS_FIELDS:
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
		result.append(')');
		return result.toString();
	}

} //DataFormImpl
