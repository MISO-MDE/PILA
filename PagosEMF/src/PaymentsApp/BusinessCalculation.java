/**
 */
package PaymentsApp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Calculation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.BusinessCalculation#getOperation <em>Operation</em>}</li>
 *   <li>{@link PaymentsApp.BusinessCalculation#getCalculationValues <em>Calculation Values</em>}</li>
 *   <li>{@link PaymentsApp.BusinessCalculation#getAdditionalCalculations <em>Additional Calculations</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getBusinessCalculation()
 * @model
 * @generated
 */
public interface BusinessCalculation extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link PaymentsApp.Operations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see PaymentsApp.Operations
	 * @see #setOperation(Operations)
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessCalculation_Operation()
	 * @model
	 * @generated
	 */
	Operations getOperation();

	/**
	 * Sets the value of the '{@link PaymentsApp.BusinessCalculation#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see PaymentsApp.Operations
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operations value);

	/**
	 * Returns the value of the '<em><b>Calculation Values</b></em>' reference list.
	 * The list contents are of type {@link PaymentsApp.BusinessAttributeCollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculation Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation Values</em>' reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessCalculation_CalculationValues()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<BusinessAttributeCollection> getCalculationValues();

	/**
	 * Returns the value of the '<em><b>Additional Calculations</b></em>' reference list.
	 * The list contents are of type {@link PaymentsApp.BusinessCalculation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Calculations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Calculations</em>' reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessCalculation_AdditionalCalculations()
	 * @model
	 * @generated
	 */
	EList<BusinessCalculation> getAdditionalCalculations();

} // BusinessCalculation
