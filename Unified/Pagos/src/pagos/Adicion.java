/**
 */
package pagos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adicion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pagos.Adicion#getLeft <em>Left</em>}</li>
 *   <li>{@link pagos.Adicion#getOperator <em>Operator</em>}</li>
 *   <li>{@link pagos.Adicion#getRexp <em>Rexp</em>}</li>
 * </ul>
 *
 * @see pagos.PagosPackage#getAdicion()
 * @model
 * @generated
 */
public interface Adicion extends Expression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see pagos.PagosPackage#getAdicion_Left()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link pagos.Adicion#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see pagos.PagosPackage#getAdicion_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link pagos.Adicion#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Rexp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rexp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rexp</em>' containment reference.
	 * @see #setRexp(Expression)
	 * @see pagos.PagosPackage#getAdicion_Rexp()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRexp();

	/**
	 * Sets the value of the '{@link pagos.Adicion#getRexp <em>Rexp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rexp</em>' containment reference.
	 * @see #getRexp()
	 * @generated
	 */
	void setRexp(Expression value);

} // Adicion
