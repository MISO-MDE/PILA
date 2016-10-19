/**
 */
package PaymentsApp;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.BusinessNumber#getValue <em>Value</em>}</li>
 *   <li>{@link PaymentsApp.BusinessNumber#getBusinessCalculations <em>Business Calculations</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getBusinessNumber()
 * @model
 * @generated
 */
public interface BusinessNumber extends BusinessValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessNumber_Value()
	 * @model
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link PaymentsApp.BusinessNumber#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Business Calculations</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.BusinessCalculation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Calculations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Calculations</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessNumber_BusinessCalculations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessCalculation> getBusinessCalculations();

} // BusinessNumber
