/**
 */
package PaymentsApp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.Provider#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.Provider#getProviderAttributes <em>Provider Attributes</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends EObject {
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
	 * @see PaymentsApp.PaymentsAppPackage#getProvider_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PaymentsApp.Provider#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provider Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Attributes</em>' containment reference.
	 * @see #setProviderAttributes(BusinessAttributeCollection)
	 * @see PaymentsApp.PaymentsAppPackage#getProvider_ProviderAttributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BusinessAttributeCollection getProviderAttributes();

	/**
	 * Sets the value of the '{@link PaymentsApp.Provider#getProviderAttributes <em>Provider Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Attributes</em>' containment reference.
	 * @see #getProviderAttributes()
	 * @generated
	 */
	void setProviderAttributes(BusinessAttributeCollection value);

} // Provider
