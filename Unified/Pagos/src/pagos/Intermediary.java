/**
 */
package pagos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pagos.Intermediary#getName <em>Name</em>}</li>
 *   <li>{@link pagos.Intermediary#getSuperentities <em>Superentities</em>}</li>
 *   <li>{@link pagos.Intermediary#getIntermediaryAttributes <em>Intermediary Attributes</em>}</li>
 * </ul>
 *
 * @see pagos.PagosPackage#getIntermediary()
 * @model
 * @generated
 */
public interface Intermediary extends EObject {
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
	 * @see pagos.PagosPackage#getIntermediary_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pagos.Intermediary#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Superentities</b></em>' containment reference list.
	 * The list contents are of type {@link pagos.SuperEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superentities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superentities</em>' containment reference list.
	 * @see pagos.PagosPackage#getIntermediary_Superentities()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperEntity> getSuperentities();

	/**
	 * Returns the value of the '<em><b>Intermediary Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link pagos.BusinessAttributeCollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediary Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediary Attributes</em>' containment reference list.
	 * @see pagos.PagosPackage#getIntermediary_IntermediaryAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessAttributeCollection> getIntermediaryAttributes();

} // Intermediary
