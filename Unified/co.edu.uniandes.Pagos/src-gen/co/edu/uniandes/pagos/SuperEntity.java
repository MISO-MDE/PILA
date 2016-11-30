/**
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.pagos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.pagos.SuperEntity#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.SuperEntity#getDescription <em>Description</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.SuperEntity#getAttLists <em>Att Lists</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.SuperEntity#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.pagos.PagosPackage#getSuperEntity()
 * @model
 * @generated
 */
public interface SuperEntity extends EObject
{
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
	 * @see co.edu.uniandes.pagos.PagosPackage#getSuperEntity_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link co.edu.uniandes.pagos.SuperEntity#getName <em>Name</em>}' attribute.
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
	 * @see co.edu.uniandes.pagos.PagosPackage#getSuperEntity_Description()
	 * @model
	 * @generated
	 */
  String getDescription();

  /**
	 * Sets the value of the '{@link co.edu.uniandes.pagos.SuperEntity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(String value);

  /**
	 * Returns the value of the '<em><b>Att Lists</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.pagos.BusinessAttribute}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Att Lists</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Att Lists</em>' containment reference list.
	 * @see co.edu.uniandes.pagos.PagosPackage#getSuperEntity_AttLists()
	 * @model containment="true"
	 * @generated
	 */
  EList<BusinessAttribute> getAttLists();

  /**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.pagos.Participant}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see co.edu.uniandes.pagos.PagosPackage#getSuperEntity_Participants()
	 * @model containment="true"
	 * @generated
	 */
  EList<Participant> getParticipants();

} // SuperEntity
