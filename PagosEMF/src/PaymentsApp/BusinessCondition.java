/**
 */
package PaymentsApp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.BusinessCondition#getAdditionalBusinessConditions <em>Additional Business Conditions</em>}</li>
 *   <li>{@link PaymentsApp.BusinessCondition#getComparison <em>Comparison</em>}</li>
 *   <li>{@link PaymentsApp.BusinessCondition#getConditionValues <em>Condition Values</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getBusinessCondition()
 * @model
 * @generated
 */
public interface BusinessCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Additional Business Conditions</b></em>' reference list.
	 * The list contents are of type {@link PaymentsApp.BusinessCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Business Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Business Conditions</em>' reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessCondition_AdditionalBusinessConditions()
	 * @model
	 * @generated
	 */
	EList<BusinessCondition> getAdditionalBusinessConditions();

	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' attribute.
	 * The literals are from the enumeration {@link PaymentsApp.Comparisons}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' attribute.
	 * @see PaymentsApp.Comparisons
	 * @see #setComparison(Comparisons)
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessCondition_Comparison()
	 * @model
	 * @generated
	 */
	Comparisons getComparison();

	/**
	 * Sets the value of the '{@link PaymentsApp.BusinessCondition#getComparison <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison</em>' attribute.
	 * @see PaymentsApp.Comparisons
	 * @see #getComparison()
	 * @generated
	 */
	void setComparison(Comparisons value);

	/**
	 * Returns the value of the '<em><b>Condition Values</b></em>' reference list.
	 * The list contents are of type {@link PaymentsApp.BusinessAttributeCollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Values</em>' reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessCondition_ConditionValues()
	 * @model required="true" upper="2"
	 *        extendedMetaData="name='conditionValues'"
	 * @generated
	 */
	EList<BusinessAttributeCollection> getConditionValues();

} // BusinessCondition
