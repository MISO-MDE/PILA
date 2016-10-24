/**
 */
package PaymentsApp.util;

import PaymentsApp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see PaymentsApp.PaymentsAppPackage
 * @generated
 */
public class PaymentsAppAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PaymentsAppPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentsAppAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PaymentsAppPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentsAppSwitch<Adapter> modelSwitch =
		new PaymentsAppSwitch<Adapter>() {
			@Override
			public Adapter caseIntermediary(Intermediary object) {
				return createIntermediaryAdapter();
			}
			@Override
			public Adapter caseParticipantProfile(ParticipantProfile object) {
				return createParticipantProfileAdapter();
			}
			@Override
			public Adapter caseProvider(Provider object) {
				return createProviderAdapter();
			}
			@Override
			public Adapter caseBusinessAttribute(BusinessAttribute object) {
				return createBusinessAttributeAdapter();
			}
			@Override
			public Adapter caseBusinessValue(BusinessValue object) {
				return createBusinessValueAdapter();
			}
			@Override
			public Adapter caseBusinessRule(BusinessRule object) {
				return createBusinessRuleAdapter();
			}
			@Override
			public Adapter caseBusinessString(BusinessString object) {
				return createBusinessStringAdapter();
			}
			@Override
			public Adapter caseBusinessNumber(BusinessNumber object) {
				return createBusinessNumberAdapter();
			}
			@Override
			public Adapter caseBusinessCondition(BusinessCondition object) {
				return createBusinessConditionAdapter();
			}
			@Override
			public Adapter caseBusinessAttributeCollection(BusinessAttributeCollection object) {
				return createBusinessAttributeCollectionAdapter();
			}
			@Override
			public Adapter caseDataForm(DataForm object) {
				return createDataFormAdapter();
			}
			@Override
			public Adapter caseBusinessCalculation(BusinessCalculation object) {
				return createBusinessCalculationAdapter();
			}
			@Override
			public Adapter caseSuperEntity(SuperEntity object) {
				return createSuperEntityAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object) {
				return createParticipantAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.Intermediary <em>Intermediary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.Intermediary
	 * @generated
	 */
	public Adapter createIntermediaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.ParticipantProfile <em>Participant Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.ParticipantProfile
	 * @generated
	 */
	public Adapter createParticipantProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.BusinessAttribute <em>Business Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.BusinessAttribute
	 * @generated
	 */
	public Adapter createBusinessAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.BusinessValue <em>Business Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.BusinessValue
	 * @generated
	 */
	public Adapter createBusinessValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.BusinessRule <em>Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.BusinessRule
	 * @generated
	 */
	public Adapter createBusinessRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.BusinessString <em>Business String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.BusinessString
	 * @generated
	 */
	public Adapter createBusinessStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.BusinessNumber <em>Business Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.BusinessNumber
	 * @generated
	 */
	public Adapter createBusinessNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.BusinessCondition <em>Business Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.BusinessCondition
	 * @generated
	 */
	public Adapter createBusinessConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.BusinessAttributeCollection <em>Business Attribute Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.BusinessAttributeCollection
	 * @generated
	 */
	public Adapter createBusinessAttributeCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.DataForm <em>Data Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.DataForm
	 * @generated
	 */
	public Adapter createDataFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.BusinessCalculation <em>Business Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.BusinessCalculation
	 * @generated
	 */
	public Adapter createBusinessCalculationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.SuperEntity <em>Super Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.SuperEntity
	 * @generated
	 */
	public Adapter createSuperEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PaymentsAppAdapterFactory
