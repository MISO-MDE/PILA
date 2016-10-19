/**
 */
package PaymentsApp.impl;

import PaymentsApp.BusinessAttributeCollection;
import PaymentsApp.BusinessCalculation;
import PaymentsApp.Operations;
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
 * An implementation of the model object '<em><b>Business Calculation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.BusinessCalculationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link PaymentsApp.impl.BusinessCalculationImpl#getCalculationValues <em>Calculation Values</em>}</li>
 *   <li>{@link PaymentsApp.impl.BusinessCalculationImpl#getAdditionalCalculations <em>Additional Calculations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessCalculationImpl extends MinimalEObjectImpl.Container implements BusinessCalculation {
	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final Operations OPERATION_EDEFAULT = Operations.NO_OPERAND;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operations operation = OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCalculationValues() <em>Calculation Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationValues()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessAttributeCollection> calculationValues;

	/**
	 * The cached value of the '{@link #getAdditionalCalculations() <em>Additional Calculations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCalculations()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessCalculation> additionalCalculations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessCalculationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentsAppPackage.Literals.BUSINESS_CALCULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operations getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operations newOperation) {
		Operations oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.BUSINESS_CALCULATION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessAttributeCollection> getCalculationValues() {
		if (calculationValues == null) {
			calculationValues = new EObjectResolvingEList<BusinessAttributeCollection>(BusinessAttributeCollection.class, this, PaymentsAppPackage.BUSINESS_CALCULATION__CALCULATION_VALUES);
		}
		return calculationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessCalculation> getAdditionalCalculations() {
		if (additionalCalculations == null) {
			additionalCalculations = new EObjectResolvingEList<BusinessCalculation>(BusinessCalculation.class, this, PaymentsAppPackage.BUSINESS_CALCULATION__ADDITIONAL_CALCULATIONS);
		}
		return additionalCalculations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentsAppPackage.BUSINESS_CALCULATION__OPERATION:
				return getOperation();
			case PaymentsAppPackage.BUSINESS_CALCULATION__CALCULATION_VALUES:
				return getCalculationValues();
			case PaymentsAppPackage.BUSINESS_CALCULATION__ADDITIONAL_CALCULATIONS:
				return getAdditionalCalculations();
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
			case PaymentsAppPackage.BUSINESS_CALCULATION__OPERATION:
				setOperation((Operations)newValue);
				return;
			case PaymentsAppPackage.BUSINESS_CALCULATION__CALCULATION_VALUES:
				getCalculationValues().clear();
				getCalculationValues().addAll((Collection<? extends BusinessAttributeCollection>)newValue);
				return;
			case PaymentsAppPackage.BUSINESS_CALCULATION__ADDITIONAL_CALCULATIONS:
				getAdditionalCalculations().clear();
				getAdditionalCalculations().addAll((Collection<? extends BusinessCalculation>)newValue);
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
			case PaymentsAppPackage.BUSINESS_CALCULATION__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case PaymentsAppPackage.BUSINESS_CALCULATION__CALCULATION_VALUES:
				getCalculationValues().clear();
				return;
			case PaymentsAppPackage.BUSINESS_CALCULATION__ADDITIONAL_CALCULATIONS:
				getAdditionalCalculations().clear();
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
			case PaymentsAppPackage.BUSINESS_CALCULATION__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case PaymentsAppPackage.BUSINESS_CALCULATION__CALCULATION_VALUES:
				return calculationValues != null && !calculationValues.isEmpty();
			case PaymentsAppPackage.BUSINESS_CALCULATION__ADDITIONAL_CALCULATIONS:
				return additionalCalculations != null && !additionalCalculations.isEmpty();
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
		result.append(" (operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

} //BusinessCalculationImpl
