/**
 */
package PaymentsApp.impl;

import PaymentsApp.BusinessAttributeCollection;
import PaymentsApp.BusinessCondition;
import PaymentsApp.Comparisons;
import PaymentsApp.PaymentsAppPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.BusinessConditionImpl#getAdditionalBusinessConditions <em>Additional Business Conditions</em>}</li>
 *   <li>{@link PaymentsApp.impl.BusinessConditionImpl#getComparison <em>Comparison</em>}</li>
 *   <li>{@link PaymentsApp.impl.BusinessConditionImpl#getConditionValues <em>Condition Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessConditionImpl extends MinimalEObjectImpl.Container implements BusinessCondition {
	/**
	 * The cached value of the '{@link #getAdditionalBusinessConditions() <em>Additional Business Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalBusinessConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessCondition> additionalBusinessConditions;

	/**
	 * The default value of the '{@link #getComparison() <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
	protected static final Comparisons COMPARISON_EDEFAULT = Comparisons.LESS_THAN;

	/**
	 * The cached value of the '{@link #getComparison() <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
	protected Comparisons comparison = COMPARISON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditionValues() <em>Condition Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionValues()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessAttributeCollection> conditionValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentsAppPackage.Literals.BUSINESS_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessCondition> getAdditionalBusinessConditions() {
		if (additionalBusinessConditions == null) {
			additionalBusinessConditions = new EObjectResolvingEList<BusinessCondition>(BusinessCondition.class, this, PaymentsAppPackage.BUSINESS_CONDITION__ADDITIONAL_BUSINESS_CONDITIONS);
		}
		return additionalBusinessConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparisons getComparison() {
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparison(Comparisons newComparison) {
		Comparisons oldComparison = comparison;
		comparison = newComparison == null ? COMPARISON_EDEFAULT : newComparison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.BUSINESS_CONDITION__COMPARISON, oldComparison, comparison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessAttributeCollection> getConditionValues() {
		if (conditionValues == null) {
			conditionValues = new EObjectResolvingEList<BusinessAttributeCollection>(BusinessAttributeCollection.class, this, PaymentsAppPackage.BUSINESS_CONDITION__CONDITION_VALUES);
		}
		return conditionValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentsAppPackage.BUSINESS_CONDITION__ADDITIONAL_BUSINESS_CONDITIONS:
				return getAdditionalBusinessConditions();
			case PaymentsAppPackage.BUSINESS_CONDITION__COMPARISON:
				return getComparison();
			case PaymentsAppPackage.BUSINESS_CONDITION__CONDITION_VALUES:
				return getConditionValues();
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
			case PaymentsAppPackage.BUSINESS_CONDITION__ADDITIONAL_BUSINESS_CONDITIONS:
				getAdditionalBusinessConditions().clear();
				getAdditionalBusinessConditions().addAll((Collection<? extends BusinessCondition>)newValue);
				return;
			case PaymentsAppPackage.BUSINESS_CONDITION__COMPARISON:
				setComparison((Comparisons)newValue);
				return;
			case PaymentsAppPackage.BUSINESS_CONDITION__CONDITION_VALUES:
				getConditionValues().clear();
				getConditionValues().addAll((Collection<? extends BusinessAttributeCollection>)newValue);
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
			case PaymentsAppPackage.BUSINESS_CONDITION__ADDITIONAL_BUSINESS_CONDITIONS:
				getAdditionalBusinessConditions().clear();
				return;
			case PaymentsAppPackage.BUSINESS_CONDITION__COMPARISON:
				setComparison(COMPARISON_EDEFAULT);
				return;
			case PaymentsAppPackage.BUSINESS_CONDITION__CONDITION_VALUES:
				getConditionValues().clear();
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
			case PaymentsAppPackage.BUSINESS_CONDITION__ADDITIONAL_BUSINESS_CONDITIONS:
				return additionalBusinessConditions != null && !additionalBusinessConditions.isEmpty();
			case PaymentsAppPackage.BUSINESS_CONDITION__COMPARISON:
				return comparison != COMPARISON_EDEFAULT;
			case PaymentsAppPackage.BUSINESS_CONDITION__CONDITION_VALUES:
				return conditionValues != null && !conditionValues.isEmpty();
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
		result.append(" (comparison: ");
		result.append(comparison);
		result.append(')');
		return result.toString();
	}

} //BusinessConditionImpl
