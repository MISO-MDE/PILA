/**
 */
package PaymentsApp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.TerminalValue#getVariable <em>Variable</em>}</li>
 *   <li>{@link PaymentsApp.TerminalValue#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getTerminalValue()
 * @model
 * @generated
 */
public interface TerminalValue extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(BusinessAttribute)
	 * @see PaymentsApp.PaymentsAppPackage#getTerminalValue_Variable()
	 * @model
	 * @generated
	 */
	BusinessAttribute getVariable();

	/**
	 * Sets the value of the '{@link PaymentsApp.TerminalValue#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(BusinessAttribute value);

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(String)
	 * @see PaymentsApp.PaymentsAppPackage#getTerminalValue_Valor()
	 * @model
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link PaymentsApp.TerminalValue#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(String value);

} // TerminalValue
