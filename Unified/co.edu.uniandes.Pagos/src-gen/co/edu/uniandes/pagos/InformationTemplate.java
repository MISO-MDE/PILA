/**
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.pagos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.pagos.InformationTemplate#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.InformationTemplate#getDescription <em>Description</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.InformationTemplate#getAttLists <em>Att Lists</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.InformationTemplate#getTemplateCalc <em>Template Calc</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.InformationTemplate#getTemplates <em>Templates</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.InformationTemplate#getProviders <em>Providers</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.pagos.PagosPackage#getInformationTemplate()
 * @model
 * @generated
 */
public interface InformationTemplate extends EObject
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
	 * @see co.edu.uniandes.pagos.PagosPackage#getInformationTemplate_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link co.edu.uniandes.pagos.InformationTemplate#getName <em>Name</em>}' attribute.
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
	 * @see co.edu.uniandes.pagos.PagosPackage#getInformationTemplate_Description()
	 * @model
	 * @generated
	 */
  String getDescription();

  /**
	 * Sets the value of the '{@link co.edu.uniandes.pagos.InformationTemplate#getDescription <em>Description</em>}' attribute.
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
	 * @see co.edu.uniandes.pagos.PagosPackage#getInformationTemplate_AttLists()
	 * @model containment="true"
	 * @generated
	 */
  EList<BusinessAttribute> getAttLists();

  /**
	 * Returns the value of the '<em><b>Template Calc</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Calc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Calc</em>' attribute.
	 * @see #setTemplateCalc(String)
	 * @see co.edu.uniandes.pagos.PagosPackage#getInformationTemplate_TemplateCalc()
	 * @model
	 * @generated
	 */
  String getTemplateCalc();

  /**
	 * Sets the value of the '{@link co.edu.uniandes.pagos.InformationTemplate#getTemplateCalc <em>Template Calc</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Calc</em>' attribute.
	 * @see #getTemplateCalc()
	 * @generated
	 */
  void setTemplateCalc(String value);

  /**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.pagos.CalculationTemplate}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see co.edu.uniandes.pagos.PagosPackage#getInformationTemplate_Templates()
	 * @model containment="true"
	 * @generated
	 */
  EList<CalculationTemplate> getTemplates();

  /**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.pagos.Provider}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Providers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see co.edu.uniandes.pagos.PagosPackage#getInformationTemplate_Providers()
	 * @model containment="true"
	 * @generated
	 */
  EList<Provider> getProviders();

} // InformationTemplate
