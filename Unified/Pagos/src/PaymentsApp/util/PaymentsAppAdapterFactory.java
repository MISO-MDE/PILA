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
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseIntermediary(Intermediary object) {
				return createIntermediaryAdapter();
			}
			@Override
			public Adapter caseBusinessValue(BusinessValue object) {
				return createBusinessValueAdapter();
			}
			@Override
			public Adapter caseSuperEntity(SuperEntity object) {
				return createSuperEntityAdapter();
			}
			@Override
			public Adapter caseBusinessString(BusinessString object) {
				return createBusinessStringAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object) {
				return createParticipantAdapter();
			}
			@Override
			public Adapter caseProvider(Provider object) {
				return createProviderAdapter();
			}
			@Override
			public Adapter caseInformationTemplate(InformationTemplate object) {
				return createInformationTemplateAdapter();
			}
			@Override
			public Adapter caseCalculationTemplate(CalculationTemplate object) {
				return createCalculationTemplateAdapter();
			}
			@Override
			public Adapter caseFormula(Formula object) {
				return createFormulaAdapter();
			}
			@Override
			public Adapter caseIfBlock(IfBlock object) {
				return createIfBlockAdapter();
			}
			@Override
			public Adapter caseIfCondition(IfCondition object) {
				return createIfConditionAdapter();
			}
			@Override
			public Adapter caseElseSegment(ElseSegment object) {
				return createElseSegmentAdapter();
			}
			@Override
			public Adapter caseReturnBlock(ReturnBlock object) {
				return createReturnBlockAdapter();
			}
			@Override
			public Adapter caseExpresionLogica(ExpresionLogica object) {
				return createExpresionLogicaAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseBusinessAttribute(BusinessAttribute object) {
				return createBusinessAttributeAdapter();
			}
			@Override
			public Adapter caseTerminalValue(TerminalValue object) {
				return createTerminalValueAdapter();
			}
			@Override
			public Adapter caseAdicion(Adicion object) {
				return createAdicionAdapter();
			}
			@Override
			public Adapter caseMultiplicacion(Multiplicacion object) {
				return createMultiplicacionAdapter();
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
	 * Creates a new adapter for an object of class '{@link PaymentsApp.InformationTemplate <em>Information Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.InformationTemplate
	 * @generated
	 */
	public Adapter createInformationTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.CalculationTemplate <em>Calculation Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.CalculationTemplate
	 * @generated
	 */
	public Adapter createCalculationTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.Formula
	 * @generated
	 */
	public Adapter createFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.IfBlock <em>If Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.IfBlock
	 * @generated
	 */
	public Adapter createIfBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.IfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.IfCondition
	 * @generated
	 */
	public Adapter createIfConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.ElseSegment <em>Else Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.ElseSegment
	 * @generated
	 */
	public Adapter createElseSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.ReturnBlock <em>Return Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.ReturnBlock
	 * @generated
	 */
	public Adapter createReturnBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.ExpresionLogica <em>Expresion Logica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.ExpresionLogica
	 * @generated
	 */
	public Adapter createExpresionLogicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PaymentsApp.TerminalValue <em>Terminal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.TerminalValue
	 * @generated
	 */
	public Adapter createTerminalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.Adicion <em>Adicion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.Adicion
	 * @generated
	 */
	public Adapter createAdicionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PaymentsApp.Multiplicacion <em>Multiplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PaymentsApp.Multiplicacion
	 * @generated
	 */
	public Adapter createMultiplicacionAdapter() {
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
