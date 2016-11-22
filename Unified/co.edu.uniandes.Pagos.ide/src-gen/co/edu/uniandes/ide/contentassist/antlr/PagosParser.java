/*
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.ide.contentassist.antlr;

import co.edu.uniandes.ide.contentassist.antlr.internal.InternalPagosParser;
import co.edu.uniandes.services.PagosGrammarAccess;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class PagosParser extends AbstractContentAssistParser {

	@Inject
	private PagosGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalPagosParser createParser() {
		InternalPagosParser result = new InternalPagosParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFormulaAccess().getAlternatives(), "rule__Formula__Alternatives");
					put(grammarAccess.getExpresionLogicaAccess().getAlternatives_1_1(), "rule__ExpresionLogica__Alternatives_1_1");
					put(grammarAccess.getSigleExpAccess().getAlternatives(), "rule__SigleExp__Alternatives");
					put(grammarAccess.getTerminalValueAccess().getAlternatives(), "rule__TerminalValue__Alternatives");
					put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
					put(grammarAccess.getEDoubleAccess().getAlternatives_3_0(), "rule__EDouble__Alternatives_3_0");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getApplicationAccess().getGroup(), "rule__Application__Group__0");
					put(grammarAccess.getIntermediaryAccess().getGroup(), "rule__Intermediary__Group__0");
					put(grammarAccess.getIntermediaryAccess().getGroup_10(), "rule__Intermediary__Group_10__0");
					put(grammarAccess.getSuperEntityAccess().getGroup(), "rule__SuperEntity__Group__0");
					put(grammarAccess.getSuperEntityAccess().getGroup_14(), "rule__SuperEntity__Group_14__0");
					put(grammarAccess.getSuperEntityAccess().getGroup_21(), "rule__SuperEntity__Group_21__0");
					put(grammarAccess.getParticipantAccess().getGroup(), "rule__Participant__Group__0");
					put(grammarAccess.getParticipantAccess().getGroup_14(), "rule__Participant__Group_14__0");
					put(grammarAccess.getParticipantAccess().getGroup_17(), "rule__Participant__Group_17__0");
					put(grammarAccess.getParticipantAccess().getGroup_17_5(), "rule__Participant__Group_17_5__0");
					put(grammarAccess.getProviderAccess().getGroup(), "rule__Provider__Group__0");
					put(grammarAccess.getProviderAccess().getGroup_14(), "rule__Provider__Group_14__0");
					put(grammarAccess.getInformationTemplateAccess().getGroup(), "rule__InformationTemplate__Group__0");
					put(grammarAccess.getInformationTemplateAccess().getGroup_14(), "rule__InformationTemplate__Group_14__0");
					put(grammarAccess.getInformationTemplateAccess().getGroup_17(), "rule__InformationTemplate__Group_17__0");
					put(grammarAccess.getInformationTemplateAccess().getGroup_17_5(), "rule__InformationTemplate__Group_17_5__0");
					put(grammarAccess.getInformationTemplateAccess().getGroup_18(), "rule__InformationTemplate__Group_18__0");
					put(grammarAccess.getInformationTemplateAccess().getGroup_18_5(), "rule__InformationTemplate__Group_18_5__0");
					put(grammarAccess.getCalculationTemplateAccess().getGroup(), "rule__CalculationTemplate__Group__0");
					put(grammarAccess.getCalculationTemplateAccess().getGroup_14(), "rule__CalculationTemplate__Group_14__0");
					put(grammarAccess.getFormulaAccess().getGroup_0(), "rule__Formula__Group_0__0");
					put(grammarAccess.getIfBlockAccess().getGroup(), "rule__IfBlock__Group__0");
					put(grammarAccess.getIfBlockAccess().getGroup_2(), "rule__IfBlock__Group_2__0");
					put(grammarAccess.getIfConditionAccess().getGroup(), "rule__IfCondition__Group__0");
					put(grammarAccess.getElseSegmentAccess().getGroup(), "rule__ElseSegment__Group__0");
					put(grammarAccess.getReturnBlockAccess().getGroup(), "rule__ReturnBlock__Group__0");
					put(grammarAccess.getExpresionLogicaAccess().getGroup(), "rule__ExpresionLogica__Group__0");
					put(grammarAccess.getExpresionLogicaAccess().getGroup_1(), "rule__ExpresionLogica__Group_1__0");
					put(grammarAccess.getExpresionLogicaAccess().getGroup_2(), "rule__ExpresionLogica__Group_2__0");
					put(grammarAccess.getAdicionAccess().getGroup(), "rule__Adicion__Group__0");
					put(grammarAccess.getAdicionAccess().getGroup_1(), "rule__Adicion__Group_1__0");
					put(grammarAccess.getMultiplicacionAccess().getGroup(), "rule__Multiplicacion__Group__0");
					put(grammarAccess.getMultiplicacionAccess().getGroup_1(), "rule__Multiplicacion__Group_1__0");
					put(grammarAccess.getSigleExpAccess().getGroup_1(), "rule__SigleExp__Group_1__0");
					put(grammarAccess.getBusinessAttributeAccess().getGroup(), "rule__BusinessAttribute__Group__0");
					put(grammarAccess.getBusinessAttributeAccess().getGroup_5(), "rule__BusinessAttribute__Group_5__0");
					put(grammarAccess.getTerminalValueAccess().getGroup_0(), "rule__TerminalValue__Group_0__0");
					put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup_3(), "rule__EDouble__Group_3__0");
					put(grammarAccess.getApplicationAccess().getNameAssignment_3(), "rule__Application__NameAssignment_3");
					put(grammarAccess.getApplicationAccess().getIntermediaryAssignment_7(), "rule__Application__IntermediaryAssignment_7");
					put(grammarAccess.getIntermediaryAccess().getNameAssignment_4(), "rule__Intermediary__NameAssignment_4");
					put(grammarAccess.getIntermediaryAccess().getSuperentitiesAssignment_9(), "rule__Intermediary__SuperentitiesAssignment_9");
					put(grammarAccess.getIntermediaryAccess().getSuperentitiesAssignment_10_1(), "rule__Intermediary__SuperentitiesAssignment_10_1");
					put(grammarAccess.getSuperEntityAccess().getNameAssignment_4(), "rule__SuperEntity__NameAssignment_4");
					put(grammarAccess.getSuperEntityAccess().getDescriptionAssignment_8(), "rule__SuperEntity__DescriptionAssignment_8");
					put(grammarAccess.getSuperEntityAccess().getAttListsAssignment_13(), "rule__SuperEntity__AttListsAssignment_13");
					put(grammarAccess.getSuperEntityAccess().getAttListsAssignment_14_1(), "rule__SuperEntity__AttListsAssignment_14_1");
					put(grammarAccess.getSuperEntityAccess().getParticipantsAssignment_20(), "rule__SuperEntity__ParticipantsAssignment_20");
					put(grammarAccess.getSuperEntityAccess().getParticipantsAssignment_21_1(), "rule__SuperEntity__ParticipantsAssignment_21_1");
					put(grammarAccess.getParticipantAccess().getNameAssignment_4(), "rule__Participant__NameAssignment_4");
					put(grammarAccess.getParticipantAccess().getDescriptionAssignment_8(), "rule__Participant__DescriptionAssignment_8");
					put(grammarAccess.getParticipantAccess().getAttListsAssignment_13(), "rule__Participant__AttListsAssignment_13");
					put(grammarAccess.getParticipantAccess().getAttListsAssignment_14_1(), "rule__Participant__AttListsAssignment_14_1");
					put(grammarAccess.getParticipantAccess().getTemplatesFormsAssignment_17_4(), "rule__Participant__TemplatesFormsAssignment_17_4");
					put(grammarAccess.getParticipantAccess().getTemplatesFormsAssignment_17_5_1(), "rule__Participant__TemplatesFormsAssignment_17_5_1");
					put(grammarAccess.getProviderAccess().getNameAssignment_4(), "rule__Provider__NameAssignment_4");
					put(grammarAccess.getProviderAccess().getDescriptionAssignment_8(), "rule__Provider__DescriptionAssignment_8");
					put(grammarAccess.getProviderAccess().getAttListsAssignment_13(), "rule__Provider__AttListsAssignment_13");
					put(grammarAccess.getProviderAccess().getAttListsAssignment_14_1(), "rule__Provider__AttListsAssignment_14_1");
					put(grammarAccess.getInformationTemplateAccess().getNameAssignment_4(), "rule__InformationTemplate__NameAssignment_4");
					put(grammarAccess.getInformationTemplateAccess().getDescriptionAssignment_8(), "rule__InformationTemplate__DescriptionAssignment_8");
					put(grammarAccess.getInformationTemplateAccess().getAttListsAssignment_13(), "rule__InformationTemplate__AttListsAssignment_13");
					put(grammarAccess.getInformationTemplateAccess().getAttListsAssignment_14_1(), "rule__InformationTemplate__AttListsAssignment_14_1");
					put(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_4(), "rule__InformationTemplate__TemplatesAssignment_17_4");
					put(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_5_1(), "rule__InformationTemplate__TemplatesAssignment_17_5_1");
					put(grammarAccess.getInformationTemplateAccess().getProvidersAssignment_18_4(), "rule__InformationTemplate__ProvidersAssignment_18_4");
					put(grammarAccess.getInformationTemplateAccess().getProvidersAssignment_18_5_1(), "rule__InformationTemplate__ProvidersAssignment_18_5_1");
					put(grammarAccess.getCalculationTemplateAccess().getNameAssignment_4(), "rule__CalculationTemplate__NameAssignment_4");
					put(grammarAccess.getCalculationTemplateAccess().getDescriptionAssignment_8(), "rule__CalculationTemplate__DescriptionAssignment_8");
					put(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_13(), "rule__CalculationTemplate__AttListsAssignment_13");
					put(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_14_1(), "rule__CalculationTemplate__AttListsAssignment_14_1");
					put(grammarAccess.getCalculationTemplateAccess().getFormulasAssignment_19(), "rule__CalculationTemplate__FormulasAssignment_19");
					put(grammarAccess.getFormulaAccess().getFormulaBodyAssignment_0_1(), "rule__Formula__FormulaBodyAssignment_0_1");
					put(grammarAccess.getFormulaAccess().getFormulaReturnAssignment_1(), "rule__Formula__FormulaReturnAssignment_1");
					put(grammarAccess.getIfBlockAccess().getIfSentenceAssignment_1(), "rule__IfBlock__IfSentenceAssignment_1");
					put(grammarAccess.getIfBlockAccess().getElseSentenceAssignment_2_1(), "rule__IfBlock__ElseSentenceAssignment_2_1");
					put(grammarAccess.getIfConditionAccess().getLogExpAssignment_3(), "rule__IfCondition__LogExpAssignment_3");
					put(grammarAccess.getIfConditionAccess().getExpressionAssignment_9(), "rule__IfCondition__ExpressionAssignment_9");
					put(grammarAccess.getElseSegmentAccess().getIfSentenceAssignment_2(), "rule__ElseSegment__IfSentenceAssignment_2");
					put(grammarAccess.getReturnBlockAccess().getExpressionAssignment_3(), "rule__ReturnBlock__ExpressionAssignment_3");
					put(grammarAccess.getExpresionLogicaAccess().getVariableAssignment_0(), "rule__ExpresionLogica__VariableAssignment_0");
					put(grammarAccess.getExpresionLogicaAccess().getLogOperAssignment_1_0(), "rule__ExpresionLogica__LogOperAssignment_1_0");
					put(grammarAccess.getExpresionLogicaAccess().getVariable2Assignment_1_1_0(), "rule__ExpresionLogica__Variable2Assignment_1_1_0");
					put(grammarAccess.getExpresionLogicaAccess().getLiteralAssignment_1_1_1(), "rule__ExpresionLogica__LiteralAssignment_1_1_1");
					put(grammarAccess.getExpresionLogicaAccess().getExpAssignment_2_1(), "rule__ExpresionLogica__ExpAssignment_2_1");
					put(grammarAccess.getAdicionAccess().getOperatorAssignment_1_1(), "rule__Adicion__OperatorAssignment_1_1");
					put(grammarAccess.getAdicionAccess().getRexpAssignment_1_2(), "rule__Adicion__RexpAssignment_1_2");
					put(grammarAccess.getMultiplicacionAccess().getOperatorAssignment_1_1(), "rule__Multiplicacion__OperatorAssignment_1_1");
					put(grammarAccess.getMultiplicacionAccess().getRexpAssignment_1_2(), "rule__Multiplicacion__RexpAssignment_1_2");
					put(grammarAccess.getBusinessAttributeAccess().getNameAssignment_2(), "rule__BusinessAttribute__NameAssignment_2");
					put(grammarAccess.getBusinessAttributeAccess().getTypeAssignment_4(), "rule__BusinessAttribute__TypeAssignment_4");
					put(grammarAccess.getBusinessAttributeAccess().getExpAssignment_5_1(), "rule__BusinessAttribute__ExpAssignment_5_1");
					put(grammarAccess.getTerminalValueAccess().getVariableAssignment_0_1(), "rule__TerminalValue__VariableAssignment_0_1");
					put(grammarAccess.getTerminalValueAccess().getValorAssignment_1(), "rule__TerminalValue__ValorAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalPagosParser typedParser = (InternalPagosParser) parser;
			typedParser.entryRuleApplication();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PagosGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PagosGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
