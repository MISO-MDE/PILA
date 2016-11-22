/**
 */
package PaymentsApp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.Application#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.Application#getIntermediary <em>Intermediary</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
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
	 * @see PaymentsApp.PaymentsAppPackage#getApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PaymentsApp.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Intermediary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediary</em>' containment reference.
	 * @see #setIntermediary(Intermediary)
	 * @see PaymentsApp.PaymentsAppPackage#getApplication_Intermediary()
	 * @model containment="true"
	 * @generated
	 */
	Intermediary getIntermediary();

	/**
	 * Sets the value of the '{@link PaymentsApp.Application#getIntermediary <em>Intermediary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermediary</em>' containment reference.
	 * @see #getIntermediary()
	 * @generated
	 */
	void setIntermediary(Intermediary value);

} // Application
