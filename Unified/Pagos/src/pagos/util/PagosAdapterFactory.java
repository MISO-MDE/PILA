/**
 */
package pagos.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pagos.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pagos.PagosPackage
 * @generated
 */
public class PagosAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PagosPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagosAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PagosPackage.eINSTANCE;
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
	protected PagosSwitch<Adapter> modelSwitch =
		new PagosSwitch<Adapter>() {
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseIntermediary(Intermediary object) {
				return createIntermediaryAdapter();
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
	 * Creates a new adapter for an object of class '{@link pagos.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.Intermediary <em>Intermediary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.Intermediary
	 * @generated
	 */
	public Adapter createIntermediaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.SuperEntity <em>Super Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.SuperEntity
	 * @generated
	 */
	public Adapter createSuperEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.InformationTemplate <em>Information Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.InformationTemplate
	 * @generated
	 */
	public Adapter createInformationTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.CalculationTemplate <em>Calculation Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.CalculationTemplate
	 * @generated
	 */
	public Adapter createCalculationTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.Formula
	 * @generated
	 */
	public Adapter createFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.IfBlock <em>If Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.IfBlock
	 * @generated
	 */
	public Adapter createIfBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.IfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.IfCondition
	 * @generated
	 */
	public Adapter createIfConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.ElseSegment <em>Else Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.ElseSegment
	 * @generated
	 */
	public Adapter createElseSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.ReturnBlock <em>Return Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.ReturnBlock
	 * @generated
	 */
	public Adapter createReturnBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.ExpresionLogica <em>Expresion Logica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.ExpresionLogica
	 * @generated
	 */
	public Adapter createExpresionLogicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.BusinessAttribute <em>Business Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.BusinessAttribute
	 * @generated
	 */
	public Adapter createBusinessAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.TerminalValue <em>Terminal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.TerminalValue
	 * @generated
	 */
	public Adapter createTerminalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.Adicion <em>Adicion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.Adicion
	 * @generated
	 */
	public Adapter createAdicionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.Multiplicacion <em>Multiplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.Multiplicacion
	 * @generated
	 */
	public Adapter createMultiplicacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pagos.BusinessAttributeCollection <em>Business Attribute Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pagos.BusinessAttributeCollection
	 * @generated
	 */
	public Adapter createBusinessAttributeCollectionAdapter() {
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

} //PagosAdapterFactory
