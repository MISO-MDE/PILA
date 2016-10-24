/**
 */
package PaymentsApp.util;

import PaymentsApp.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see PaymentsApp.PaymentsAppPackage
 * @generated
 */
public class PaymentsAppSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PaymentsAppPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentsAppSwitch() {
		if (modelPackage == null) {
			modelPackage = PaymentsAppPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PaymentsAppPackage.INTERMEDIARY: {
				Intermediary intermediary = (Intermediary)theEObject;
				T result = caseIntermediary(intermediary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentsAppPackage.PARTICIPANT_PROFILE: {
				ParticipantProfile participantProfile = (ParticipantProfile)theEObject;
				T result = caseParticipantProfile(participantProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentsAppPackage.PROVIDER: {
				Provider provider = (Provider)theEObject;
				T result = caseProvider(provider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE: {
				BusinessAttribute businessAttribute = (BusinessAttribute)theEObject;
				T result = caseBusinessAttribute(businessAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentsAppPackage.BUSINESS_VALUE: {
				BusinessValue businessValue = (BusinessValue)theEObject;
				T result = caseBusinessValue(businessValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentsAppPackage.BUSINESS_RULE: {
				BusinessRule businessRule = (BusinessRule)theEObject;
				T result = caseBusinessRule(businessRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentsAppPackage.BUSINESS_STRING: {
				BusinessString businessString = (BusinessString)theEObject;
				T result = caseBusinessString(businessString);
				if (result == null) result = caseBusinessValue(businessString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentsAppPackage.BUSINESS_NUMBER: {
				BusinessNumber businessNumber = (BusinessNumber)theEObject;
				T result = caseBusinessNumber(businessNumber);
				if (result == null) result = caseBusinessValue(businessNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentsAppPackage.BUSINESS_CONDITION: {
				BusinessCondition businessCondition = (BusinessCondition)theEObject;
				T result = caseBusinessCondition(businessCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE_COLLECTION: {
				BusinessAttributeCollection businessAttributeCollection = (BusinessAttributeCollection)theEObject;
				T result = caseBusinessAttributeCollection(businessAttributeCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentsAppPackage.DATA_FORM: {
				DataForm dataForm = (DataForm)theEObject;
				T result = caseDataForm(dataForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentsAppPackage.BUSINESS_CALCULATION: {
				BusinessCalculation businessCalculation = (BusinessCalculation)theEObject;
				T result = caseBusinessCalculation(businessCalculation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentsAppPackage.SUPER_ENTITY: {
				SuperEntity superEntity = (SuperEntity)theEObject;
				T result = caseSuperEntity(superEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentsAppPackage.PARTICIPANT: {
				Participant participant = (Participant)theEObject;
				T result = caseParticipant(participant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentsAppPackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediary(Intermediary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantProfile(ParticipantProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider(Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessAttribute(BusinessAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessValue(BusinessValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessRule(BusinessRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessString(BusinessString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessNumber(BusinessNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessCondition(BusinessCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Attribute Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Attribute Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessAttributeCollection(BusinessAttributeCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataForm(DataForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Calculation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Calculation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessCalculation(BusinessCalculation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperEntity(SuperEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PaymentsAppSwitch
