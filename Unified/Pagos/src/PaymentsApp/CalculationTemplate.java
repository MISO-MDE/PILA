/**
 */
package PaymentsApp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculation Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.CalculationTemplate#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.CalculationTemplate#getDescription <em>Description</em>}</li>
 *   <li>{@link PaymentsApp.CalculationTemplate#getAttLists <em>Att Lists</em>}</li>
 *   <li>{@link PaymentsApp.CalculationTemplate#getFormulas <em>Formulas</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getCalculationTemplate()
 * @model
 * @generated
 */
public interface CalculationTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PaymentsApp.PaymentsAppPackage#getCalculationTemplate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PaymentsApp.CalculationTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see PaymentsApp.PaymentsAppPackage#getCalculationTemplate_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link PaymentsApp.CalculationTemplate#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Att Lists</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.BusinessAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att Lists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att Lists</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getCalculationTemplate_AttLists()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessAttribute> getAttLists();

	/**
	 * Returns the value of the '<em><b>Formulas</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.Formula}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formulas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulas</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getCalculationTemplate_Formulas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Formula> getFormulas();

} // CalculationTemplate
