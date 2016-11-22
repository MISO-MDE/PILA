/**
 */
package pagos.impl;

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

import pagos.BusinessAttributeCollection;
import pagos.Intermediary;
import pagos.PagosPackage;
import pagos.SuperEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pagos.impl.IntermediaryImpl#getName <em>Name</em>}</li>
 *   <li>{@link pagos.impl.IntermediaryImpl#getSuperentities <em>Superentities</em>}</li>
 *   <li>{@link pagos.impl.IntermediaryImpl#getIntermediaryAttributes <em>Intermediary Attributes</em>}</li>
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
	 * The cached value of the '{@link #getIntermediaryAttributes() <em>Intermediary Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediaryAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessAttributeCollection> intermediaryAttributes;

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
		return PagosPackage.Literals.INTERMEDIARY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.INTERMEDIARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuperEntity> getSuperentities() {
		if (superentities == null) {
			superentities = new EObjectContainmentEList<SuperEntity>(SuperEntity.class, this, PagosPackage.INTERMEDIARY__SUPERENTITIES);
		}
		return superentities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessAttributeCollection> getIntermediaryAttributes() {
		if (intermediaryAttributes == null) {
			intermediaryAttributes = new EObjectContainmentEList<BusinessAttributeCollection>(BusinessAttributeCollection.class, this, PagosPackage.INTERMEDIARY__INTERMEDIARY_ATTRIBUTES);
		}
		return intermediaryAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PagosPackage.INTERMEDIARY__SUPERENTITIES:
				return ((InternalEList<?>)getSuperentities()).basicRemove(otherEnd, msgs);
			case PagosPackage.INTERMEDIARY__INTERMEDIARY_ATTRIBUTES:
				return ((InternalEList<?>)getIntermediaryAttributes()).basicRemove(otherEnd, msgs);
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
			case PagosPackage.INTERMEDIARY__NAME:
				return getName();
			case PagosPackage.INTERMEDIARY__SUPERENTITIES:
				return getSuperentities();
			case PagosPackage.INTERMEDIARY__INTERMEDIARY_ATTRIBUTES:
				return getIntermediaryAttributes();
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
			case PagosPackage.INTERMEDIARY__NAME:
				setName((String)newValue);
				return;
			case PagosPackage.INTERMEDIARY__SUPERENTITIES:
				getSuperentities().clear();
				getSuperentities().addAll((Collection<? extends SuperEntity>)newValue);
				return;
			case PagosPackage.INTERMEDIARY__INTERMEDIARY_ATTRIBUTES:
				getIntermediaryAttributes().clear();
				getIntermediaryAttributes().addAll((Collection<? extends BusinessAttributeCollection>)newValue);
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
			case PagosPackage.INTERMEDIARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PagosPackage.INTERMEDIARY__SUPERENTITIES:
				getSuperentities().clear();
				return;
			case PagosPackage.INTERMEDIARY__INTERMEDIARY_ATTRIBUTES:
				getIntermediaryAttributes().clear();
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
			case PagosPackage.INTERMEDIARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PagosPackage.INTERMEDIARY__SUPERENTITIES:
				return superentities != null && !superentities.isEmpty();
			case PagosPackage.INTERMEDIARY__INTERMEDIARY_ATTRIBUTES:
				return intermediaryAttributes != null && !intermediaryAttributes.isEmpty();
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
