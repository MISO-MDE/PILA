/*
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.serializer;

import co.edu.uniandes.pagos.Adicion;
import co.edu.uniandes.pagos.Application;
import co.edu.uniandes.pagos.BusinessAttribute;
import co.edu.uniandes.pagos.CalculationTemplate;
import co.edu.uniandes.pagos.ElseSegment;
import co.edu.uniandes.pagos.ExpresionLogica;
import co.edu.uniandes.pagos.Formula;
import co.edu.uniandes.pagos.IfBlock;
import co.edu.uniandes.pagos.IfCondition;
import co.edu.uniandes.pagos.InformationTemplate;
import co.edu.uniandes.pagos.Intermediary;
import co.edu.uniandes.pagos.Multiplicacion;
import co.edu.uniandes.pagos.PagosPackage;
import co.edu.uniandes.pagos.Participant;
import co.edu.uniandes.pagos.Provider;
import co.edu.uniandes.pagos.ReturnBlock;
import co.edu.uniandes.pagos.SuperEntity;
import co.edu.uniandes.pagos.TerminalValue;
import co.edu.uniandes.services.PagosGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PagosSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PagosGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PagosPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PagosPackage.ADICION:
				sequence_Adicion(context, (Adicion) semanticObject); 
				return; 
			case PagosPackage.APPLICATION:
				sequence_Application(context, (Application) semanticObject); 
				return; 
			case PagosPackage.BUSINESS_ATTRIBUTE:
				sequence_BusinessAttribute(context, (BusinessAttribute) semanticObject); 
				return; 
			case PagosPackage.CALCULATION_TEMPLATE:
				sequence_CalculationTemplate(context, (CalculationTemplate) semanticObject); 
				return; 
			case PagosPackage.ELSE_SEGMENT:
				sequence_ElseSegment(context, (ElseSegment) semanticObject); 
				return; 
			case PagosPackage.EXPRESION_LOGICA:
				sequence_ExpresionLogica(context, (ExpresionLogica) semanticObject); 
				return; 
			case PagosPackage.FORMULA:
				sequence_Formula(context, (Formula) semanticObject); 
				return; 
			case PagosPackage.IF_BLOCK:
				sequence_IfBlock(context, (IfBlock) semanticObject); 
				return; 
			case PagosPackage.IF_CONDITION:
				sequence_IfCondition(context, (IfCondition) semanticObject); 
				return; 
			case PagosPackage.INFORMATION_TEMPLATE:
				sequence_InformationTemplate(context, (InformationTemplate) semanticObject); 
				return; 
			case PagosPackage.INTERMEDIARY:
				sequence_Intermediary(context, (Intermediary) semanticObject); 
				return; 
			case PagosPackage.MULTIPLICACION:
				sequence_Multiplicacion(context, (Multiplicacion) semanticObject); 
				return; 
			case PagosPackage.PARTICIPANT:
				sequence_Participant(context, (Participant) semanticObject); 
				return; 
			case PagosPackage.PROVIDER:
				sequence_Provider(context, (Provider) semanticObject); 
				return; 
			case PagosPackage.RETURN_BLOCK:
				sequence_ReturnBlock(context, (ReturnBlock) semanticObject); 
				return; 
			case PagosPackage.SUPER_ENTITY:
				sequence_SuperEntity(context, (SuperEntity) semanticObject); 
				return; 
			case PagosPackage.TERMINAL_VALUE:
				sequence_TerminalValue(context, (TerminalValue) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Adicion returns Adicion
	 *     Adicion.Adicion_1_0 returns Adicion
	 *     Multiplicacion returns Adicion
	 *     Multiplicacion.Multiplicacion_1_0 returns Adicion
	 *     SigleExp returns Adicion
	 *
	 * Constraint:
	 *     (left=Adicion_Adicion_1_0 operator=ADDOP rexp=Multiplicacion)
	 */
	protected void sequence_Adicion(ISerializationContext context, Adicion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PagosPackage.Literals.ADICION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PagosPackage.Literals.ADICION__LEFT));
			if (transientValues.isValueTransient(semanticObject, PagosPackage.Literals.ADICION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PagosPackage.Literals.ADICION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, PagosPackage.Literals.ADICION__REXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PagosPackage.Literals.ADICION__REXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdicionAccess().getAdicionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdicionAccess().getOperatorADDOPTerminalRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getAdicionAccess().getRexpMultiplicacionParserRuleCall_1_2_0(), semanticObject.getRexp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Application returns Application
	 *
	 * Constraint:
	 *     (name=ID intermediary=Intermediary)
	 */
	protected void sequence_Application(ISerializationContext context, Application semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PagosPackage.Literals.APPLICATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PagosPackage.Literals.APPLICATION__NAME));
			if (transientValues.isValueTransient(semanticObject, PagosPackage.Literals.APPLICATION__INTERMEDIARY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PagosPackage.Literals.APPLICATION__INTERMEDIARY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getApplicationAccess().getIntermediaryIntermediaryParserRuleCall_7_0(), semanticObject.getIntermediary());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BusinessAttribute returns BusinessAttribute
	 *
	 * Constraint:
	 *     (name=ID type=TYPE exp=Adicion?)
	 */
	protected void sequence_BusinessAttribute(ISerializationContext context, BusinessAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CalculationTemplate returns CalculationTemplate
	 *
	 * Constraint:
	 *     (name=ID description=STRING attLists+=BusinessAttribute attLists+=BusinessAttribute* formulas+=Formula)
	 */
	protected void sequence_CalculationTemplate(ISerializationContext context, CalculationTemplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ElseSegment returns ElseSegment
	 *
	 * Constraint:
	 *     ifSentence=Formula
	 */
	protected void sequence_ElseSegment(ISerializationContext context, ElseSegment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PagosPackage.Literals.ELSE_SEGMENT__IF_SENTENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PagosPackage.Literals.ELSE_SEGMENT__IF_SENTENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElseSegmentAccess().getIfSentenceFormulaParserRuleCall_2_0(), semanticObject.getIfSentence());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpresionLogica returns ExpresionLogica
	 *
	 * Constraint:
	 *     (variable+=TerminalValue (logOper+=OPERADORLOGICO (variable2+=TerminalValue | literal+=STRING))+ (conOper=LOGICALCONN exp+=ExpresionLogica)?)
	 */
	protected void sequence_ExpresionLogica(ISerializationContext context, ExpresionLogica semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Formula returns Formula
	 *
	 * Constraint:
	 *     (formulaBody+=IfBlock+ | formulaReturn=ReturnBlock)?
	 */
	protected void sequence_Formula(ISerializationContext context, Formula semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IfBlock returns IfBlock
	 *
	 * Constraint:
	 *     (ifSentence=IfCondition elseSentence=ElseSegment?)
	 */
	protected void sequence_IfBlock(ISerializationContext context, IfBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IfCondition returns IfCondition
	 *
	 * Constraint:
	 *     (logExp+=ExpresionLogica expression+=Adicion)
	 */
	protected void sequence_IfCondition(ISerializationContext context, IfCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InformationTemplate returns InformationTemplate
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         attLists+=BusinessAttribute 
	 *         attLists+=BusinessAttribute* 
	 *         (templates+=CalculationTemplate templates+=CalculationTemplate*)? 
	 *         (providers+=Provider providers+=Provider*)?
	 *     )
	 */
	protected void sequence_InformationTemplate(ISerializationContext context, InformationTemplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Intermediary returns Intermediary
	 *
	 * Constraint:
	 *     (name=ID superentities+=SuperEntity superentities+=SuperEntity*)
	 */
	protected void sequence_Intermediary(ISerializationContext context, Intermediary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Adicion returns Multiplicacion
	 *     Adicion.Adicion_1_0 returns Multiplicacion
	 *     Multiplicacion returns Multiplicacion
	 *     Multiplicacion.Multiplicacion_1_0 returns Multiplicacion
	 *     SigleExp returns Multiplicacion
	 *
	 * Constraint:
	 *     (left=Multiplicacion_Multiplicacion_1_0 operator=MULTOP rexp=SigleExp)
	 */
	protected void sequence_Multiplicacion(ISerializationContext context, Multiplicacion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PagosPackage.Literals.MULTIPLICACION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PagosPackage.Literals.MULTIPLICACION__LEFT));
			if (transientValues.isValueTransient(semanticObject, PagosPackage.Literals.MULTIPLICACION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PagosPackage.Literals.MULTIPLICACION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, PagosPackage.Literals.MULTIPLICACION__REXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PagosPackage.Literals.MULTIPLICACION__REXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplicacionAccess().getMultiplicacionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicacionAccess().getOperatorMULTOPTerminalRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getMultiplicacionAccess().getRexpSigleExpParserRuleCall_1_2_0(), semanticObject.getRexp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Participant returns Participant
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         attLists+=BusinessAttribute 
	 *         attLists+=BusinessAttribute* 
	 *         (templatesForms+=InformationTemplate templatesForms+=InformationTemplate*)?
	 *     )
	 */
	protected void sequence_Participant(ISerializationContext context, Participant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Provider returns Provider
	 *
	 * Constraint:
	 *     (name=ID description=STRING attLists+=BusinessAttribute attLists+=BusinessAttribute*)
	 */
	protected void sequence_Provider(ISerializationContext context, Provider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReturnBlock returns ReturnBlock
	 *
	 * Constraint:
	 *     expression+=Adicion
	 */
	protected void sequence_ReturnBlock(ISerializationContext context, ReturnBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SuperEntity returns SuperEntity
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         attLists+=BusinessAttribute 
	 *         attLists+=BusinessAttribute* 
	 *         participants+=Participant 
	 *         participants+=Participant*
	 *     )
	 */
	protected void sequence_SuperEntity(ISerializationContext context, SuperEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Adicion returns TerminalValue
	 *     Adicion.Adicion_1_0 returns TerminalValue
	 *     Multiplicacion returns TerminalValue
	 *     Multiplicacion.Multiplicacion_1_0 returns TerminalValue
	 *     SigleExp returns TerminalValue
	 *     TerminalValue returns TerminalValue
	 *
	 * Constraint:
	 *     (variable=[BusinessAttribute|ID] | valor=Number)
	 */
	protected void sequence_TerminalValue(ISerializationContext context, TerminalValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
