package co.edu.uniandes.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import co.edu.uniandes.services.PagosGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPagosParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_LBRACE", "RULE_COLON", "RULE_COMMA", "RULE_RBRACE", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_ELSE", "RULE_IF", "RULE_THEN", "RULE_RETURN", "RULE_DOT", "RULE_DASH", "RULE_ID", "RULE_STRING", "RULE_OPERADORLOGICO", "RULE_LOGICALCONN", "RULE_ADDOP", "RULE_MULTOP", "RULE_TYPE", "RULE_INDEX", "RULE_STR_ESC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'size()'", "'getCantidadDiasHabiles()'", "'getRiegoTabla2()'", "'E'", "'e'", "'name'", "'intermediary'", "'superentities'", "'description'", "'attributes'", "'entities'", "'InformationTemplate'", "'FormAttributes'", "'calculationtemplates'", "'providers'", "'calculationrules'", "'calculationattributes'", "'('", "')'", "':='", "'PA'", "'SU'", "'IT'", "'FU'"
    };
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_RETURN=14;
    public static final int RULE_ID=17;
    public static final int RULE_COMMA=7;
    public static final int RULE_THEN=13;
    public static final int RULE_COLON=6;
    public static final int RULE_LOGICALCONN=20;
    public static final int RULE_TYPE=23;
    public static final int RULE_STR_ESC=25;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=26;
    public static final int RULE_ELSE=11;
    public static final int RULE_LBRACKET=9;
    public static final int RULE_INDEX=24;
    public static final int RULE_STRING=18;
    public static final int RULE_SL_COMMENT=27;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_DASH=16;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_IF=12;
    public static final int T__36=36;
    public static final int RULE_DOT=15;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_LBRACE=5;
    public static final int RULE_WS=28;
    public static final int RULE_OPERADORLOGICO=19;
    public static final int RULE_ADDOP=21;
    public static final int RULE_ANY_OTHER=29;
    public static final int RULE_RBRACE=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_MULTOP=22;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_RBRACKET=10;

    // delegates
    // delegators


        public InternalPagosParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPagosParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPagosParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPagos.g"; }


    	private PagosGrammarAccess grammarAccess;

    	public void setGrammarAccess(PagosGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleApplication"
    // InternalPagos.g:53:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalPagos.g:54:1: ( ruleApplication EOF )
            // InternalPagos.g:55:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalPagos.g:62:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:66:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalPagos.g:67:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalPagos.g:67:2: ( ( rule__Application__Group__0 ) )
            // InternalPagos.g:68:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalPagos.g:69:3: ( rule__Application__Group__0 )
            // InternalPagos.g:69:4: rule__Application__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleIntermediary"
    // InternalPagos.g:78:1: entryRuleIntermediary : ruleIntermediary EOF ;
    public final void entryRuleIntermediary() throws RecognitionException {
        try {
            // InternalPagos.g:79:1: ( ruleIntermediary EOF )
            // InternalPagos.g:80:1: ruleIntermediary EOF
            {
             before(grammarAccess.getIntermediaryRule()); 
            pushFollow(FOLLOW_1);
            ruleIntermediary();

            state._fsp--;

             after(grammarAccess.getIntermediaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntermediary"


    // $ANTLR start "ruleIntermediary"
    // InternalPagos.g:87:1: ruleIntermediary : ( ( rule__Intermediary__Group__0 ) ) ;
    public final void ruleIntermediary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:91:2: ( ( ( rule__Intermediary__Group__0 ) ) )
            // InternalPagos.g:92:2: ( ( rule__Intermediary__Group__0 ) )
            {
            // InternalPagos.g:92:2: ( ( rule__Intermediary__Group__0 ) )
            // InternalPagos.g:93:3: ( rule__Intermediary__Group__0 )
            {
             before(grammarAccess.getIntermediaryAccess().getGroup()); 
            // InternalPagos.g:94:3: ( rule__Intermediary__Group__0 )
            // InternalPagos.g:94:4: rule__Intermediary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Intermediary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntermediaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntermediary"


    // $ANTLR start "entryRuleSuperEntity"
    // InternalPagos.g:103:1: entryRuleSuperEntity : ruleSuperEntity EOF ;
    public final void entryRuleSuperEntity() throws RecognitionException {
        try {
            // InternalPagos.g:104:1: ( ruleSuperEntity EOF )
            // InternalPagos.g:105:1: ruleSuperEntity EOF
            {
             before(grammarAccess.getSuperEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleSuperEntity();

            state._fsp--;

             after(grammarAccess.getSuperEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSuperEntity"


    // $ANTLR start "ruleSuperEntity"
    // InternalPagos.g:112:1: ruleSuperEntity : ( ( rule__SuperEntity__Group__0 ) ) ;
    public final void ruleSuperEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:116:2: ( ( ( rule__SuperEntity__Group__0 ) ) )
            // InternalPagos.g:117:2: ( ( rule__SuperEntity__Group__0 ) )
            {
            // InternalPagos.g:117:2: ( ( rule__SuperEntity__Group__0 ) )
            // InternalPagos.g:118:3: ( rule__SuperEntity__Group__0 )
            {
             before(grammarAccess.getSuperEntityAccess().getGroup()); 
            // InternalPagos.g:119:3: ( rule__SuperEntity__Group__0 )
            // InternalPagos.g:119:4: rule__SuperEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSuperEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSuperEntity"


    // $ANTLR start "entryRuleParticipant"
    // InternalPagos.g:128:1: entryRuleParticipant : ruleParticipant EOF ;
    public final void entryRuleParticipant() throws RecognitionException {
        try {
            // InternalPagos.g:129:1: ( ruleParticipant EOF )
            // InternalPagos.g:130:1: ruleParticipant EOF
            {
             before(grammarAccess.getParticipantRule()); 
            pushFollow(FOLLOW_1);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getParticipantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // InternalPagos.g:137:1: ruleParticipant : ( ( rule__Participant__Group__0 ) ) ;
    public final void ruleParticipant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:141:2: ( ( ( rule__Participant__Group__0 ) ) )
            // InternalPagos.g:142:2: ( ( rule__Participant__Group__0 ) )
            {
            // InternalPagos.g:142:2: ( ( rule__Participant__Group__0 ) )
            // InternalPagos.g:143:3: ( rule__Participant__Group__0 )
            {
             before(grammarAccess.getParticipantAccess().getGroup()); 
            // InternalPagos.g:144:3: ( rule__Participant__Group__0 )
            // InternalPagos.g:144:4: rule__Participant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Participant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleProvider"
    // InternalPagos.g:153:1: entryRuleProvider : ruleProvider EOF ;
    public final void entryRuleProvider() throws RecognitionException {
        try {
            // InternalPagos.g:154:1: ( ruleProvider EOF )
            // InternalPagos.g:155:1: ruleProvider EOF
            {
             before(grammarAccess.getProviderRule()); 
            pushFollow(FOLLOW_1);
            ruleProvider();

            state._fsp--;

             after(grammarAccess.getProviderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProvider"


    // $ANTLR start "ruleProvider"
    // InternalPagos.g:162:1: ruleProvider : ( ( rule__Provider__Group__0 ) ) ;
    public final void ruleProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:166:2: ( ( ( rule__Provider__Group__0 ) ) )
            // InternalPagos.g:167:2: ( ( rule__Provider__Group__0 ) )
            {
            // InternalPagos.g:167:2: ( ( rule__Provider__Group__0 ) )
            // InternalPagos.g:168:3: ( rule__Provider__Group__0 )
            {
             before(grammarAccess.getProviderAccess().getGroup()); 
            // InternalPagos.g:169:3: ( rule__Provider__Group__0 )
            // InternalPagos.g:169:4: rule__Provider__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Provider__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProviderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProvider"


    // $ANTLR start "entryRuleInformationTemplate"
    // InternalPagos.g:178:1: entryRuleInformationTemplate : ruleInformationTemplate EOF ;
    public final void entryRuleInformationTemplate() throws RecognitionException {
        try {
            // InternalPagos.g:179:1: ( ruleInformationTemplate EOF )
            // InternalPagos.g:180:1: ruleInformationTemplate EOF
            {
             before(grammarAccess.getInformationTemplateRule()); 
            pushFollow(FOLLOW_1);
            ruleInformationTemplate();

            state._fsp--;

             after(grammarAccess.getInformationTemplateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInformationTemplate"


    // $ANTLR start "ruleInformationTemplate"
    // InternalPagos.g:187:1: ruleInformationTemplate : ( ( rule__InformationTemplate__Group__0 ) ) ;
    public final void ruleInformationTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:191:2: ( ( ( rule__InformationTemplate__Group__0 ) ) )
            // InternalPagos.g:192:2: ( ( rule__InformationTemplate__Group__0 ) )
            {
            // InternalPagos.g:192:2: ( ( rule__InformationTemplate__Group__0 ) )
            // InternalPagos.g:193:3: ( rule__InformationTemplate__Group__0 )
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup()); 
            // InternalPagos.g:194:3: ( rule__InformationTemplate__Group__0 )
            // InternalPagos.g:194:4: rule__InformationTemplate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInformationTemplateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInformationTemplate"


    // $ANTLR start "entryRuleCalculationTemplate"
    // InternalPagos.g:203:1: entryRuleCalculationTemplate : ruleCalculationTemplate EOF ;
    public final void entryRuleCalculationTemplate() throws RecognitionException {
        try {
            // InternalPagos.g:204:1: ( ruleCalculationTemplate EOF )
            // InternalPagos.g:205:1: ruleCalculationTemplate EOF
            {
             before(grammarAccess.getCalculationTemplateRule()); 
            pushFollow(FOLLOW_1);
            ruleCalculationTemplate();

            state._fsp--;

             after(grammarAccess.getCalculationTemplateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalculationTemplate"


    // $ANTLR start "ruleCalculationTemplate"
    // InternalPagos.g:212:1: ruleCalculationTemplate : ( ( rule__CalculationTemplate__Group__0 ) ) ;
    public final void ruleCalculationTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:216:2: ( ( ( rule__CalculationTemplate__Group__0 ) ) )
            // InternalPagos.g:217:2: ( ( rule__CalculationTemplate__Group__0 ) )
            {
            // InternalPagos.g:217:2: ( ( rule__CalculationTemplate__Group__0 ) )
            // InternalPagos.g:218:3: ( rule__CalculationTemplate__Group__0 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getGroup()); 
            // InternalPagos.g:219:3: ( rule__CalculationTemplate__Group__0 )
            // InternalPagos.g:219:4: rule__CalculationTemplate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalculationTemplateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalculationTemplate"


    // $ANTLR start "entryRuleFormula"
    // InternalPagos.g:228:1: entryRuleFormula : ruleFormula EOF ;
    public final void entryRuleFormula() throws RecognitionException {
        try {
            // InternalPagos.g:229:1: ( ruleFormula EOF )
            // InternalPagos.g:230:1: ruleFormula EOF
            {
             before(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getFormulaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // InternalPagos.g:237:1: ruleFormula : ( ( rule__Formula__Alternatives ) ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:241:2: ( ( ( rule__Formula__Alternatives ) ) )
            // InternalPagos.g:242:2: ( ( rule__Formula__Alternatives ) )
            {
            // InternalPagos.g:242:2: ( ( rule__Formula__Alternatives ) )
            // InternalPagos.g:243:3: ( rule__Formula__Alternatives )
            {
             before(grammarAccess.getFormulaAccess().getAlternatives()); 
            // InternalPagos.g:244:3: ( rule__Formula__Alternatives )
            // InternalPagos.g:244:4: rule__Formula__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleIfBlock"
    // InternalPagos.g:253:1: entryRuleIfBlock : ruleIfBlock EOF ;
    public final void entryRuleIfBlock() throws RecognitionException {
        try {
            // InternalPagos.g:254:1: ( ruleIfBlock EOF )
            // InternalPagos.g:255:1: ruleIfBlock EOF
            {
             before(grammarAccess.getIfBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleIfBlock();

            state._fsp--;

             after(grammarAccess.getIfBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfBlock"


    // $ANTLR start "ruleIfBlock"
    // InternalPagos.g:262:1: ruleIfBlock : ( ( rule__IfBlock__Group__0 ) ) ;
    public final void ruleIfBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:266:2: ( ( ( rule__IfBlock__Group__0 ) ) )
            // InternalPagos.g:267:2: ( ( rule__IfBlock__Group__0 ) )
            {
            // InternalPagos.g:267:2: ( ( rule__IfBlock__Group__0 ) )
            // InternalPagos.g:268:3: ( rule__IfBlock__Group__0 )
            {
             before(grammarAccess.getIfBlockAccess().getGroup()); 
            // InternalPagos.g:269:3: ( rule__IfBlock__Group__0 )
            // InternalPagos.g:269:4: rule__IfBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfBlock"


    // $ANTLR start "entryRuleIfCondition"
    // InternalPagos.g:278:1: entryRuleIfCondition : ruleIfCondition EOF ;
    public final void entryRuleIfCondition() throws RecognitionException {
        try {
            // InternalPagos.g:279:1: ( ruleIfCondition EOF )
            // InternalPagos.g:280:1: ruleIfCondition EOF
            {
             before(grammarAccess.getIfConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleIfCondition();

            state._fsp--;

             after(grammarAccess.getIfConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfCondition"


    // $ANTLR start "ruleIfCondition"
    // InternalPagos.g:287:1: ruleIfCondition : ( ( rule__IfCondition__Group__0 ) ) ;
    public final void ruleIfCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:291:2: ( ( ( rule__IfCondition__Group__0 ) ) )
            // InternalPagos.g:292:2: ( ( rule__IfCondition__Group__0 ) )
            {
            // InternalPagos.g:292:2: ( ( rule__IfCondition__Group__0 ) )
            // InternalPagos.g:293:3: ( rule__IfCondition__Group__0 )
            {
             before(grammarAccess.getIfConditionAccess().getGroup()); 
            // InternalPagos.g:294:3: ( rule__IfCondition__Group__0 )
            // InternalPagos.g:294:4: rule__IfCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfCondition"


    // $ANTLR start "entryRuleElseSegment"
    // InternalPagos.g:303:1: entryRuleElseSegment : ruleElseSegment EOF ;
    public final void entryRuleElseSegment() throws RecognitionException {
        try {
            // InternalPagos.g:304:1: ( ruleElseSegment EOF )
            // InternalPagos.g:305:1: ruleElseSegment EOF
            {
             before(grammarAccess.getElseSegmentRule()); 
            pushFollow(FOLLOW_1);
            ruleElseSegment();

            state._fsp--;

             after(grammarAccess.getElseSegmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElseSegment"


    // $ANTLR start "ruleElseSegment"
    // InternalPagos.g:312:1: ruleElseSegment : ( ( rule__ElseSegment__Group__0 ) ) ;
    public final void ruleElseSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:316:2: ( ( ( rule__ElseSegment__Group__0 ) ) )
            // InternalPagos.g:317:2: ( ( rule__ElseSegment__Group__0 ) )
            {
            // InternalPagos.g:317:2: ( ( rule__ElseSegment__Group__0 ) )
            // InternalPagos.g:318:3: ( rule__ElseSegment__Group__0 )
            {
             before(grammarAccess.getElseSegmentAccess().getGroup()); 
            // InternalPagos.g:319:3: ( rule__ElseSegment__Group__0 )
            // InternalPagos.g:319:4: rule__ElseSegment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElseSegment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseSegmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElseSegment"


    // $ANTLR start "entryRuleReturnBlock"
    // InternalPagos.g:328:1: entryRuleReturnBlock : ruleReturnBlock EOF ;
    public final void entryRuleReturnBlock() throws RecognitionException {
        try {
            // InternalPagos.g:329:1: ( ruleReturnBlock EOF )
            // InternalPagos.g:330:1: ruleReturnBlock EOF
            {
             before(grammarAccess.getReturnBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleReturnBlock();

            state._fsp--;

             after(grammarAccess.getReturnBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturnBlock"


    // $ANTLR start "ruleReturnBlock"
    // InternalPagos.g:337:1: ruleReturnBlock : ( ( rule__ReturnBlock__Group__0 ) ) ;
    public final void ruleReturnBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:341:2: ( ( ( rule__ReturnBlock__Group__0 ) ) )
            // InternalPagos.g:342:2: ( ( rule__ReturnBlock__Group__0 ) )
            {
            // InternalPagos.g:342:2: ( ( rule__ReturnBlock__Group__0 ) )
            // InternalPagos.g:343:3: ( rule__ReturnBlock__Group__0 )
            {
             before(grammarAccess.getReturnBlockAccess().getGroup()); 
            // InternalPagos.g:344:3: ( rule__ReturnBlock__Group__0 )
            // InternalPagos.g:344:4: rule__ReturnBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnBlock"


    // $ANTLR start "entryRuleExpresionLogica"
    // InternalPagos.g:353:1: entryRuleExpresionLogica : ruleExpresionLogica EOF ;
    public final void entryRuleExpresionLogica() throws RecognitionException {
        try {
            // InternalPagos.g:354:1: ( ruleExpresionLogica EOF )
            // InternalPagos.g:355:1: ruleExpresionLogica EOF
            {
             before(grammarAccess.getExpresionLogicaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionLogica();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionLogica"


    // $ANTLR start "ruleExpresionLogica"
    // InternalPagos.g:362:1: ruleExpresionLogica : ( ( rule__ExpresionLogica__Group__0 ) ) ;
    public final void ruleExpresionLogica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:366:2: ( ( ( rule__ExpresionLogica__Group__0 ) ) )
            // InternalPagos.g:367:2: ( ( rule__ExpresionLogica__Group__0 ) )
            {
            // InternalPagos.g:367:2: ( ( rule__ExpresionLogica__Group__0 ) )
            // InternalPagos.g:368:3: ( rule__ExpresionLogica__Group__0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup()); 
            // InternalPagos.g:369:3: ( rule__ExpresionLogica__Group__0 )
            // InternalPagos.g:369:4: rule__ExpresionLogica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionLogica"


    // $ANTLR start "entryRuleAdicion"
    // InternalPagos.g:378:1: entryRuleAdicion : ruleAdicion EOF ;
    public final void entryRuleAdicion() throws RecognitionException {
        try {
            // InternalPagos.g:379:1: ( ruleAdicion EOF )
            // InternalPagos.g:380:1: ruleAdicion EOF
            {
             before(grammarAccess.getAdicionRule()); 
            pushFollow(FOLLOW_1);
            ruleAdicion();

            state._fsp--;

             after(grammarAccess.getAdicionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdicion"


    // $ANTLR start "ruleAdicion"
    // InternalPagos.g:387:1: ruleAdicion : ( ( rule__Adicion__Group__0 ) ) ;
    public final void ruleAdicion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:391:2: ( ( ( rule__Adicion__Group__0 ) ) )
            // InternalPagos.g:392:2: ( ( rule__Adicion__Group__0 ) )
            {
            // InternalPagos.g:392:2: ( ( rule__Adicion__Group__0 ) )
            // InternalPagos.g:393:3: ( rule__Adicion__Group__0 )
            {
             before(grammarAccess.getAdicionAccess().getGroup()); 
            // InternalPagos.g:394:3: ( rule__Adicion__Group__0 )
            // InternalPagos.g:394:4: rule__Adicion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Adicion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdicionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdicion"


    // $ANTLR start "entryRuleMultiplicacion"
    // InternalPagos.g:403:1: entryRuleMultiplicacion : ruleMultiplicacion EOF ;
    public final void entryRuleMultiplicacion() throws RecognitionException {
        try {
            // InternalPagos.g:404:1: ( ruleMultiplicacion EOF )
            // InternalPagos.g:405:1: ruleMultiplicacion EOF
            {
             before(grammarAccess.getMultiplicacionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicacion();

            state._fsp--;

             after(grammarAccess.getMultiplicacionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicacion"


    // $ANTLR start "ruleMultiplicacion"
    // InternalPagos.g:412:1: ruleMultiplicacion : ( ( rule__Multiplicacion__Group__0 ) ) ;
    public final void ruleMultiplicacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:416:2: ( ( ( rule__Multiplicacion__Group__0 ) ) )
            // InternalPagos.g:417:2: ( ( rule__Multiplicacion__Group__0 ) )
            {
            // InternalPagos.g:417:2: ( ( rule__Multiplicacion__Group__0 ) )
            // InternalPagos.g:418:3: ( rule__Multiplicacion__Group__0 )
            {
             before(grammarAccess.getMultiplicacionAccess().getGroup()); 
            // InternalPagos.g:419:3: ( rule__Multiplicacion__Group__0 )
            // InternalPagos.g:419:4: rule__Multiplicacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicacion"


    // $ANTLR start "entryRuleSigleExp"
    // InternalPagos.g:428:1: entryRuleSigleExp : ruleSigleExp EOF ;
    public final void entryRuleSigleExp() throws RecognitionException {
        try {
            // InternalPagos.g:429:1: ( ruleSigleExp EOF )
            // InternalPagos.g:430:1: ruleSigleExp EOF
            {
             before(grammarAccess.getSigleExpRule()); 
            pushFollow(FOLLOW_1);
            ruleSigleExp();

            state._fsp--;

             after(grammarAccess.getSigleExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSigleExp"


    // $ANTLR start "ruleSigleExp"
    // InternalPagos.g:437:1: ruleSigleExp : ( ( rule__SigleExp__Alternatives ) ) ;
    public final void ruleSigleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:441:2: ( ( ( rule__SigleExp__Alternatives ) ) )
            // InternalPagos.g:442:2: ( ( rule__SigleExp__Alternatives ) )
            {
            // InternalPagos.g:442:2: ( ( rule__SigleExp__Alternatives ) )
            // InternalPagos.g:443:3: ( rule__SigleExp__Alternatives )
            {
             before(grammarAccess.getSigleExpAccess().getAlternatives()); 
            // InternalPagos.g:444:3: ( rule__SigleExp__Alternatives )
            // InternalPagos.g:444:4: rule__SigleExp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SigleExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSigleExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSigleExp"


    // $ANTLR start "entryRuleBusinessAttribute"
    // InternalPagos.g:453:1: entryRuleBusinessAttribute : ruleBusinessAttribute EOF ;
    public final void entryRuleBusinessAttribute() throws RecognitionException {
        try {
            // InternalPagos.g:454:1: ( ruleBusinessAttribute EOF )
            // InternalPagos.g:455:1: ruleBusinessAttribute EOF
            {
             before(grammarAccess.getBusinessAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleBusinessAttribute();

            state._fsp--;

             after(grammarAccess.getBusinessAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBusinessAttribute"


    // $ANTLR start "ruleBusinessAttribute"
    // InternalPagos.g:462:1: ruleBusinessAttribute : ( ( rule__BusinessAttribute__Group__0 ) ) ;
    public final void ruleBusinessAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:466:2: ( ( ( rule__BusinessAttribute__Group__0 ) ) )
            // InternalPagos.g:467:2: ( ( rule__BusinessAttribute__Group__0 ) )
            {
            // InternalPagos.g:467:2: ( ( rule__BusinessAttribute__Group__0 ) )
            // InternalPagos.g:468:3: ( rule__BusinessAttribute__Group__0 )
            {
             before(grammarAccess.getBusinessAttributeAccess().getGroup()); 
            // InternalPagos.g:469:3: ( rule__BusinessAttribute__Group__0 )
            // InternalPagos.g:469:4: rule__BusinessAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BusinessAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBusinessAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBusinessAttribute"


    // $ANTLR start "entryRuleTerminalValue"
    // InternalPagos.g:478:1: entryRuleTerminalValue : ruleTerminalValue EOF ;
    public final void entryRuleTerminalValue() throws RecognitionException {
        try {
            // InternalPagos.g:479:1: ( ruleTerminalValue EOF )
            // InternalPagos.g:480:1: ruleTerminalValue EOF
            {
             before(grammarAccess.getTerminalValueRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminalValue();

            state._fsp--;

             after(grammarAccess.getTerminalValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalValue"


    // $ANTLR start "ruleTerminalValue"
    // InternalPagos.g:487:1: ruleTerminalValue : ( ( rule__TerminalValue__Alternatives ) ) ;
    public final void ruleTerminalValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:491:2: ( ( ( rule__TerminalValue__Alternatives ) ) )
            // InternalPagos.g:492:2: ( ( rule__TerminalValue__Alternatives ) )
            {
            // InternalPagos.g:492:2: ( ( rule__TerminalValue__Alternatives ) )
            // InternalPagos.g:493:3: ( rule__TerminalValue__Alternatives )
            {
             before(grammarAccess.getTerminalValueAccess().getAlternatives()); 
            // InternalPagos.g:494:3: ( rule__TerminalValue__Alternatives )
            // InternalPagos.g:494:4: rule__TerminalValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalValue"


    // $ANTLR start "entryRuleMethod"
    // InternalPagos.g:503:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalPagos.g:504:1: ( ruleMethod EOF )
            // InternalPagos.g:505:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalPagos.g:512:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:516:2: ( ( ( rule__Method__Alternatives ) ) )
            // InternalPagos.g:517:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalPagos.g:517:2: ( ( rule__Method__Alternatives ) )
            // InternalPagos.g:518:3: ( rule__Method__Alternatives )
            {
             before(grammarAccess.getMethodAccess().getAlternatives()); 
            // InternalPagos.g:519:3: ( rule__Method__Alternatives )
            // InternalPagos.g:519:4: rule__Method__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Method__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleNumber"
    // InternalPagos.g:528:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalPagos.g:529:1: ( ruleNumber EOF )
            // InternalPagos.g:530:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalPagos.g:537:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:541:2: ( ( ( rule__Number__Alternatives ) ) )
            // InternalPagos.g:542:2: ( ( rule__Number__Alternatives ) )
            {
            // InternalPagos.g:542:2: ( ( rule__Number__Alternatives ) )
            // InternalPagos.g:543:3: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // InternalPagos.g:544:3: ( rule__Number__Alternatives )
            // InternalPagos.g:544:4: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleEDouble"
    // InternalPagos.g:553:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalPagos.g:554:1: ( ruleEDouble EOF )
            // InternalPagos.g:555:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalPagos.g:562:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:566:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalPagos.g:567:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalPagos.g:567:2: ( ( rule__EDouble__Group__0 ) )
            // InternalPagos.g:568:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalPagos.g:569:3: ( rule__EDouble__Group__0 )
            // InternalPagos.g:569:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleInteger"
    // InternalPagos.g:578:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalPagos.g:579:1: ( ruleInteger EOF )
            // InternalPagos.g:580:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalPagos.g:587:1: ruleInteger : ( RULE_INT ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:591:2: ( ( RULE_INT ) )
            // InternalPagos.g:592:2: ( RULE_INT )
            {
            // InternalPagos.g:592:2: ( RULE_INT )
            // InternalPagos.g:593:3: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "rule__Formula__Alternatives"
    // InternalPagos.g:602:1: rule__Formula__Alternatives : ( ( ( rule__Formula__Group_0__0 ) ) | ( ( rule__Formula__FormulaReturnAssignment_1 ) ) );
    public final void rule__Formula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:606:1: ( ( ( rule__Formula__Group_0__0 ) ) | ( ( rule__Formula__FormulaReturnAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EOF||LA1_0==RULE_RBRACE||LA1_0==RULE_IF) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_RETURN) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPagos.g:607:2: ( ( rule__Formula__Group_0__0 ) )
                    {
                    // InternalPagos.g:607:2: ( ( rule__Formula__Group_0__0 ) )
                    // InternalPagos.g:608:3: ( rule__Formula__Group_0__0 )
                    {
                     before(grammarAccess.getFormulaAccess().getGroup_0()); 
                    // InternalPagos.g:609:3: ( rule__Formula__Group_0__0 )
                    // InternalPagos.g:609:4: rule__Formula__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formula__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:613:2: ( ( rule__Formula__FormulaReturnAssignment_1 ) )
                    {
                    // InternalPagos.g:613:2: ( ( rule__Formula__FormulaReturnAssignment_1 ) )
                    // InternalPagos.g:614:3: ( rule__Formula__FormulaReturnAssignment_1 )
                    {
                     before(grammarAccess.getFormulaAccess().getFormulaReturnAssignment_1()); 
                    // InternalPagos.g:615:3: ( rule__Formula__FormulaReturnAssignment_1 )
                    // InternalPagos.g:615:4: rule__Formula__FormulaReturnAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formula__FormulaReturnAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaAccess().getFormulaReturnAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Alternatives"


    // $ANTLR start "rule__ExpresionLogica__Alternatives_1_1"
    // InternalPagos.g:623:1: rule__ExpresionLogica__Alternatives_1_1 : ( ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) ) | ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) ) );
    public final void rule__ExpresionLogica__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:627:1: ( ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) ) | ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF||LA2_0==RULE_INT||LA2_0==RULE_RBRACE||LA2_0==RULE_RBRACKET||LA2_0==RULE_DOT||LA2_0==RULE_ID||(LA2_0>=RULE_OPERADORLOGICO && LA2_0<=RULE_MULTOP)||LA2_0==RULE_INDEX||LA2_0==48||(LA2_0>=50 && LA2_0<=53)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPagos.g:628:2: ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) )
                    {
                    // InternalPagos.g:628:2: ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) )
                    // InternalPagos.g:629:3: ( rule__ExpresionLogica__Variable2Assignment_1_1_0 )
                    {
                     before(grammarAccess.getExpresionLogicaAccess().getVariable2Assignment_1_1_0()); 
                    // InternalPagos.g:630:3: ( rule__ExpresionLogica__Variable2Assignment_1_1_0 )
                    // InternalPagos.g:630:4: rule__ExpresionLogica__Variable2Assignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionLogica__Variable2Assignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpresionLogicaAccess().getVariable2Assignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:634:2: ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) )
                    {
                    // InternalPagos.g:634:2: ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) )
                    // InternalPagos.g:635:3: ( rule__ExpresionLogica__LiteralAssignment_1_1_1 )
                    {
                     before(grammarAccess.getExpresionLogicaAccess().getLiteralAssignment_1_1_1()); 
                    // InternalPagos.g:636:3: ( rule__ExpresionLogica__LiteralAssignment_1_1_1 )
                    // InternalPagos.g:636:4: rule__ExpresionLogica__LiteralAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionLogica__LiteralAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpresionLogicaAccess().getLiteralAssignment_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Alternatives_1_1"


    // $ANTLR start "rule__SigleExp__Alternatives"
    // InternalPagos.g:644:1: rule__SigleExp__Alternatives : ( ( ruleTerminalValue ) | ( ( rule__SigleExp__Group_1__0 ) ) );
    public final void rule__SigleExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:648:1: ( ( ruleTerminalValue ) | ( ( rule__SigleExp__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==RULE_INT||LA3_0==RULE_RBRACE||LA3_0==RULE_RBRACKET||LA3_0==RULE_DOT||LA3_0==RULE_ID||(LA3_0>=RULE_OPERADORLOGICO && LA3_0<=RULE_MULTOP)||LA3_0==RULE_INDEX||LA3_0==48||(LA3_0>=50 && LA3_0<=53)) ) {
                alt3=1;
            }
            else if ( (LA3_0==47) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPagos.g:649:2: ( ruleTerminalValue )
                    {
                    // InternalPagos.g:649:2: ( ruleTerminalValue )
                    // InternalPagos.g:650:3: ruleTerminalValue
                    {
                     before(grammarAccess.getSigleExpAccess().getTerminalValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTerminalValue();

                    state._fsp--;

                     after(grammarAccess.getSigleExpAccess().getTerminalValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:655:2: ( ( rule__SigleExp__Group_1__0 ) )
                    {
                    // InternalPagos.g:655:2: ( ( rule__SigleExp__Group_1__0 ) )
                    // InternalPagos.g:656:3: ( rule__SigleExp__Group_1__0 )
                    {
                     before(grammarAccess.getSigleExpAccess().getGroup_1()); 
                    // InternalPagos.g:657:3: ( rule__SigleExp__Group_1__0 )
                    // InternalPagos.g:657:4: rule__SigleExp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SigleExp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigleExpAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigleExp__Alternatives"


    // $ANTLR start "rule__TerminalValue__Alternatives"
    // InternalPagos.g:665:1: rule__TerminalValue__Alternatives : ( ( ( rule__TerminalValue__Group_0__0 ) ) | ( ( rule__TerminalValue__Alternatives_1 ) ) | ( ( rule__TerminalValue__Alternatives_2 ) ) | ( ( rule__TerminalValue__Group_3__0 )? ) | ( ( rule__TerminalValue__ValorAssignment_4 ) ) );
    public final void rule__TerminalValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:669:1: ( ( ( rule__TerminalValue__Group_0__0 ) ) | ( ( rule__TerminalValue__Alternatives_1 ) ) | ( ( rule__TerminalValue__Alternatives_2 ) ) | ( ( rule__TerminalValue__Group_3__0 )? ) | ( ( rule__TerminalValue__ValorAssignment_4 ) ) )
            int alt5=5;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalPagos.g:670:2: ( ( rule__TerminalValue__Group_0__0 ) )
                    {
                    // InternalPagos.g:670:2: ( ( rule__TerminalValue__Group_0__0 ) )
                    // InternalPagos.g:671:3: ( rule__TerminalValue__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalValueAccess().getGroup_0()); 
                    // InternalPagos.g:672:3: ( rule__TerminalValue__Group_0__0 )
                    // InternalPagos.g:672:4: rule__TerminalValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:676:2: ( ( rule__TerminalValue__Alternatives_1 ) )
                    {
                    // InternalPagos.g:676:2: ( ( rule__TerminalValue__Alternatives_1 ) )
                    // InternalPagos.g:677:3: ( rule__TerminalValue__Alternatives_1 )
                    {
                     before(grammarAccess.getTerminalValueAccess().getAlternatives_1()); 
                    // InternalPagos.g:678:3: ( rule__TerminalValue__Alternatives_1 )
                    // InternalPagos.g:678:4: rule__TerminalValue__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalValue__Alternatives_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalValueAccess().getAlternatives_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPagos.g:682:2: ( ( rule__TerminalValue__Alternatives_2 ) )
                    {
                    // InternalPagos.g:682:2: ( ( rule__TerminalValue__Alternatives_2 ) )
                    // InternalPagos.g:683:3: ( rule__TerminalValue__Alternatives_2 )
                    {
                     before(grammarAccess.getTerminalValueAccess().getAlternatives_2()); 
                    // InternalPagos.g:684:3: ( rule__TerminalValue__Alternatives_2 )
                    // InternalPagos.g:684:4: rule__TerminalValue__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalValue__Alternatives_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalValueAccess().getAlternatives_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPagos.g:688:2: ( ( rule__TerminalValue__Group_3__0 )? )
                    {
                    // InternalPagos.g:688:2: ( ( rule__TerminalValue__Group_3__0 )? )
                    // InternalPagos.g:689:3: ( rule__TerminalValue__Group_3__0 )?
                    {
                     before(grammarAccess.getTerminalValueAccess().getGroup_3()); 
                    // InternalPagos.g:690:3: ( rule__TerminalValue__Group_3__0 )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==53) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalPagos.g:690:4: rule__TerminalValue__Group_3__0
                            {
                            pushFollow(FOLLOW_2);
                            rule__TerminalValue__Group_3__0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getTerminalValueAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPagos.g:694:2: ( ( rule__TerminalValue__ValorAssignment_4 ) )
                    {
                    // InternalPagos.g:694:2: ( ( rule__TerminalValue__ValorAssignment_4 ) )
                    // InternalPagos.g:695:3: ( rule__TerminalValue__ValorAssignment_4 )
                    {
                     before(grammarAccess.getTerminalValueAccess().getValorAssignment_4()); 
                    // InternalPagos.g:696:3: ( rule__TerminalValue__ValorAssignment_4 )
                    // InternalPagos.g:696:4: rule__TerminalValue__ValorAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalValue__ValorAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalValueAccess().getValorAssignment_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Alternatives"


    // $ANTLR start "rule__TerminalValue__Alternatives_0_1"
    // InternalPagos.g:704:1: rule__TerminalValue__Alternatives_0_1 : ( ( ( rule__TerminalValue__Group_0_1_0__0 ) ) | ( ( rule__TerminalValue__Group_0_1_1__0 ) ) );
    public final void rule__TerminalValue__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:708:1: ( ( ( rule__TerminalValue__Group_0_1_0__0 ) ) | ( ( rule__TerminalValue__Group_0_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==50) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_DOT) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==RULE_ID) ) {
                        int LA6_4 = input.LA(4);

                        if ( (LA6_4==RULE_DASH) ) {
                            alt6=1;
                        }
                        else if ( (LA6_4==RULE_DOT) ) {
                            alt6=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPagos.g:709:2: ( ( rule__TerminalValue__Group_0_1_0__0 ) )
                    {
                    // InternalPagos.g:709:2: ( ( rule__TerminalValue__Group_0_1_0__0 ) )
                    // InternalPagos.g:710:3: ( rule__TerminalValue__Group_0_1_0__0 )
                    {
                     before(grammarAccess.getTerminalValueAccess().getGroup_0_1_0()); 
                    // InternalPagos.g:711:3: ( rule__TerminalValue__Group_0_1_0__0 )
                    // InternalPagos.g:711:4: rule__TerminalValue__Group_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalValue__Group_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalValueAccess().getGroup_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:715:2: ( ( rule__TerminalValue__Group_0_1_1__0 ) )
                    {
                    // InternalPagos.g:715:2: ( ( rule__TerminalValue__Group_0_1_1__0 ) )
                    // InternalPagos.g:716:3: ( rule__TerminalValue__Group_0_1_1__0 )
                    {
                     before(grammarAccess.getTerminalValueAccess().getGroup_0_1_1()); 
                    // InternalPagos.g:717:3: ( rule__TerminalValue__Group_0_1_1__0 )
                    // InternalPagos.g:717:4: rule__TerminalValue__Group_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalValue__Group_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalValueAccess().getGroup_0_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Alternatives_0_1"


    // $ANTLR start "rule__TerminalValue__Alternatives_1"
    // InternalPagos.g:725:1: rule__TerminalValue__Alternatives_1 : ( ( ( rule__TerminalValue__Group_1_0__0 )? ) | ( ( rule__TerminalValue__Group_1_1__0 )? ) );
    public final void rule__TerminalValue__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:729:1: ( ( ( rule__TerminalValue__Group_1_0__0 )? ) | ( ( rule__TerminalValue__Group_1_1__0 )? ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalPagos.g:730:2: ( ( rule__TerminalValue__Group_1_0__0 )? )
                    {
                    // InternalPagos.g:730:2: ( ( rule__TerminalValue__Group_1_0__0 )? )
                    // InternalPagos.g:731:3: ( rule__TerminalValue__Group_1_0__0 )?
                    {
                     before(grammarAccess.getTerminalValueAccess().getGroup_1_0()); 
                    // InternalPagos.g:732:3: ( rule__TerminalValue__Group_1_0__0 )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==51) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalPagos.g:732:4: rule__TerminalValue__Group_1_0__0
                            {
                            pushFollow(FOLLOW_2);
                            rule__TerminalValue__Group_1_0__0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getTerminalValueAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:736:2: ( ( rule__TerminalValue__Group_1_1__0 )? )
                    {
                    // InternalPagos.g:736:2: ( ( rule__TerminalValue__Group_1_1__0 )? )
                    // InternalPagos.g:737:3: ( rule__TerminalValue__Group_1_1__0 )?
                    {
                     before(grammarAccess.getTerminalValueAccess().getGroup_1_1()); 
                    // InternalPagos.g:738:3: ( rule__TerminalValue__Group_1_1__0 )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==51) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalPagos.g:738:4: rule__TerminalValue__Group_1_1__0
                            {
                            pushFollow(FOLLOW_2);
                            rule__TerminalValue__Group_1_1__0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getTerminalValueAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Alternatives_1"


    // $ANTLR start "rule__TerminalValue__Alternatives_2"
    // InternalPagos.g:746:1: rule__TerminalValue__Alternatives_2 : ( ( ( rule__TerminalValue__Group_2_0__0 )? ) | ( ( rule__TerminalValue__Group_2_1__0 ) ) );
    public final void rule__TerminalValue__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:750:1: ( ( ( rule__TerminalValue__Group_2_0__0 )? ) | ( ( rule__TerminalValue__Group_2_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==52) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_DOT) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==RULE_ID) ) {
                        int LA11_4 = input.LA(4);

                        if ( (LA11_4==RULE_DASH) ) {
                            alt11=1;
                        }
                        else if ( (LA11_4==RULE_DOT) ) {
                            alt11=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==EOF||LA11_0==RULE_RBRACE||LA11_0==RULE_RBRACKET||(LA11_0>=RULE_OPERADORLOGICO && LA11_0<=RULE_MULTOP)||LA11_0==RULE_INDEX||LA11_0==48) ) {
                alt11=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPagos.g:751:2: ( ( rule__TerminalValue__Group_2_0__0 )? )
                    {
                    // InternalPagos.g:751:2: ( ( rule__TerminalValue__Group_2_0__0 )? )
                    // InternalPagos.g:752:3: ( rule__TerminalValue__Group_2_0__0 )?
                    {
                     before(grammarAccess.getTerminalValueAccess().getGroup_2_0()); 
                    // InternalPagos.g:753:3: ( rule__TerminalValue__Group_2_0__0 )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==52) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalPagos.g:753:4: rule__TerminalValue__Group_2_0__0
                            {
                            pushFollow(FOLLOW_2);
                            rule__TerminalValue__Group_2_0__0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getTerminalValueAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:757:2: ( ( rule__TerminalValue__Group_2_1__0 ) )
                    {
                    // InternalPagos.g:757:2: ( ( rule__TerminalValue__Group_2_1__0 ) )
                    // InternalPagos.g:758:3: ( rule__TerminalValue__Group_2_1__0 )
                    {
                     before(grammarAccess.getTerminalValueAccess().getGroup_2_1()); 
                    // InternalPagos.g:759:3: ( rule__TerminalValue__Group_2_1__0 )
                    // InternalPagos.g:759:4: rule__TerminalValue__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalValue__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalValueAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Alternatives_2"


    // $ANTLR start "rule__Method__Alternatives"
    // InternalPagos.g:767:1: rule__Method__Alternatives : ( ( 'size()' ) | ( 'getCantidadDiasHabiles()' ) | ( 'getRiegoTabla2()' ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:771:1: ( ( 'size()' ) | ( 'getCantidadDiasHabiles()' ) | ( 'getRiegoTabla2()' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 32:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPagos.g:772:2: ( 'size()' )
                    {
                    // InternalPagos.g:772:2: ( 'size()' )
                    // InternalPagos.g:773:3: 'size()'
                    {
                     before(grammarAccess.getMethodAccess().getSizeKeyword_0()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getMethodAccess().getSizeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:778:2: ( 'getCantidadDiasHabiles()' )
                    {
                    // InternalPagos.g:778:2: ( 'getCantidadDiasHabiles()' )
                    // InternalPagos.g:779:3: 'getCantidadDiasHabiles()'
                    {
                     before(grammarAccess.getMethodAccess().getGetCantidadDiasHabilesKeyword_1()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getMethodAccess().getGetCantidadDiasHabilesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPagos.g:784:2: ( 'getRiegoTabla2()' )
                    {
                    // InternalPagos.g:784:2: ( 'getRiegoTabla2()' )
                    // InternalPagos.g:785:3: 'getRiegoTabla2()'
                    {
                     before(grammarAccess.getMethodAccess().getGetRiegoTabla2Keyword_2()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getMethodAccess().getGetRiegoTabla2Keyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Alternatives"


    // $ANTLR start "rule__Number__Alternatives"
    // InternalPagos.g:794:1: rule__Number__Alternatives : ( ( ruleEDouble ) | ( ruleInteger ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:798:1: ( ( ruleEDouble ) | ( ruleInteger ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||LA13_1==RULE_RBRACE||LA13_1==RULE_RBRACKET||(LA13_1>=RULE_OPERADORLOGICO && LA13_1<=RULE_MULTOP)||LA13_1==RULE_INDEX||LA13_1==48) ) {
                    alt13=2;
                }
                else if ( (LA13_1==RULE_DOT) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==RULE_DOT) ) {
                alt13=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalPagos.g:799:2: ( ruleEDouble )
                    {
                    // InternalPagos.g:799:2: ( ruleEDouble )
                    // InternalPagos.g:800:3: ruleEDouble
                    {
                     before(grammarAccess.getNumberAccess().getEDoubleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEDouble();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getEDoubleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:805:2: ( ruleInteger )
                    {
                    // InternalPagos.g:805:2: ( ruleInteger )
                    // InternalPagos.g:806:3: ruleInteger
                    {
                     before(grammarAccess.getNumberAccess().getIntegerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getIntegerParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_3_0"
    // InternalPagos.g:815:1: rule__EDouble__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:819:1: ( ( 'E' ) | ( 'e' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPagos.g:820:2: ( 'E' )
                    {
                    // InternalPagos.g:820:2: ( 'E' )
                    // InternalPagos.g:821:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:826:2: ( 'e' )
                    {
                    // InternalPagos.g:826:2: ( 'e' )
                    // InternalPagos.g:827:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_3_0"


    // $ANTLR start "rule__Application__Group__0"
    // InternalPagos.g:836:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:840:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalPagos.g:841:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // InternalPagos.g:848:1: rule__Application__Group__0__Impl : ( RULE_LBRACE ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:852:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:853:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:853:1: ( RULE_LBRACE )
            // InternalPagos.g:854:2: RULE_LBRACE
            {
             before(grammarAccess.getApplicationAccess().getLBRACETerminalRuleCall_0()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLBRACETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // InternalPagos.g:863:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:867:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalPagos.g:868:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // InternalPagos.g:875:1: rule__Application__Group__1__Impl : ( 'name' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:879:1: ( ( 'name' ) )
            // InternalPagos.g:880:1: ( 'name' )
            {
            // InternalPagos.g:880:1: ( 'name' )
            // InternalPagos.g:881:2: 'name'
            {
             before(grammarAccess.getApplicationAccess().getNameKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // InternalPagos.g:890:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:894:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalPagos.g:895:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // InternalPagos.g:902:1: rule__Application__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:906:1: ( ( RULE_COLON ) )
            // InternalPagos.g:907:1: ( RULE_COLON )
            {
            // InternalPagos.g:907:1: ( RULE_COLON )
            // InternalPagos.g:908:2: RULE_COLON
            {
             before(grammarAccess.getApplicationAccess().getCOLONTerminalRuleCall_2()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCOLONTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__3"
    // InternalPagos.g:917:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:921:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalPagos.g:922:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3"


    // $ANTLR start "rule__Application__Group__3__Impl"
    // InternalPagos.g:929:1: rule__Application__Group__3__Impl : ( ( rule__Application__NameAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:933:1: ( ( ( rule__Application__NameAssignment_3 ) ) )
            // InternalPagos.g:934:1: ( ( rule__Application__NameAssignment_3 ) )
            {
            // InternalPagos.g:934:1: ( ( rule__Application__NameAssignment_3 ) )
            // InternalPagos.g:935:2: ( rule__Application__NameAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_3()); 
            // InternalPagos.g:936:2: ( rule__Application__NameAssignment_3 )
            // InternalPagos.g:936:3: rule__Application__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Application__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3__Impl"


    // $ANTLR start "rule__Application__Group__4"
    // InternalPagos.g:944:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:948:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalPagos.g:949:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Application__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4"


    // $ANTLR start "rule__Application__Group__4__Impl"
    // InternalPagos.g:956:1: rule__Application__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:960:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:961:1: ( RULE_COMMA )
            {
            // InternalPagos.g:961:1: ( RULE_COMMA )
            // InternalPagos.g:962:2: RULE_COMMA
            {
             before(grammarAccess.getApplicationAccess().getCOMMATerminalRuleCall_4()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCOMMATerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4__Impl"


    // $ANTLR start "rule__Application__Group__5"
    // InternalPagos.g:971:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:975:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalPagos.g:976:2: rule__Application__Group__5__Impl rule__Application__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__5"


    // $ANTLR start "rule__Application__Group__5__Impl"
    // InternalPagos.g:983:1: rule__Application__Group__5__Impl : ( 'intermediary' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:987:1: ( ( 'intermediary' ) )
            // InternalPagos.g:988:1: ( 'intermediary' )
            {
            // InternalPagos.g:988:1: ( 'intermediary' )
            // InternalPagos.g:989:2: 'intermediary'
            {
             before(grammarAccess.getApplicationAccess().getIntermediaryKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getIntermediaryKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__5__Impl"


    // $ANTLR start "rule__Application__Group__6"
    // InternalPagos.g:998:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1002:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // InternalPagos.g:1003:2: rule__Application__Group__6__Impl rule__Application__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Application__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__6"


    // $ANTLR start "rule__Application__Group__6__Impl"
    // InternalPagos.g:1010:1: rule__Application__Group__6__Impl : ( RULE_COLON ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1014:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1015:1: ( RULE_COLON )
            {
            // InternalPagos.g:1015:1: ( RULE_COLON )
            // InternalPagos.g:1016:2: RULE_COLON
            {
             before(grammarAccess.getApplicationAccess().getCOLONTerminalRuleCall_6()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCOLONTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__6__Impl"


    // $ANTLR start "rule__Application__Group__7"
    // InternalPagos.g:1025:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1029:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // InternalPagos.g:1030:2: rule__Application__Group__7__Impl rule__Application__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Application__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__7"


    // $ANTLR start "rule__Application__Group__7__Impl"
    // InternalPagos.g:1037:1: rule__Application__Group__7__Impl : ( ( rule__Application__IntermediaryAssignment_7 ) ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1041:1: ( ( ( rule__Application__IntermediaryAssignment_7 ) ) )
            // InternalPagos.g:1042:1: ( ( rule__Application__IntermediaryAssignment_7 ) )
            {
            // InternalPagos.g:1042:1: ( ( rule__Application__IntermediaryAssignment_7 ) )
            // InternalPagos.g:1043:2: ( rule__Application__IntermediaryAssignment_7 )
            {
             before(grammarAccess.getApplicationAccess().getIntermediaryAssignment_7()); 
            // InternalPagos.g:1044:2: ( rule__Application__IntermediaryAssignment_7 )
            // InternalPagos.g:1044:3: rule__Application__IntermediaryAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Application__IntermediaryAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getIntermediaryAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__7__Impl"


    // $ANTLR start "rule__Application__Group__8"
    // InternalPagos.g:1052:1: rule__Application__Group__8 : rule__Application__Group__8__Impl ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1056:1: ( rule__Application__Group__8__Impl )
            // InternalPagos.g:1057:2: rule__Application__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__8"


    // $ANTLR start "rule__Application__Group__8__Impl"
    // InternalPagos.g:1063:1: rule__Application__Group__8__Impl : ( RULE_RBRACE ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1067:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:1068:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:1068:1: ( RULE_RBRACE )
            // InternalPagos.g:1069:2: RULE_RBRACE
            {
             before(grammarAccess.getApplicationAccess().getRBRACETerminalRuleCall_8()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRBRACETerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__8__Impl"


    // $ANTLR start "rule__Intermediary__Group__0"
    // InternalPagos.g:1079:1: rule__Intermediary__Group__0 : rule__Intermediary__Group__0__Impl rule__Intermediary__Group__1 ;
    public final void rule__Intermediary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1083:1: ( rule__Intermediary__Group__0__Impl rule__Intermediary__Group__1 )
            // InternalPagos.g:1084:2: rule__Intermediary__Group__0__Impl rule__Intermediary__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Intermediary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intermediary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__0"


    // $ANTLR start "rule__Intermediary__Group__0__Impl"
    // InternalPagos.g:1091:1: rule__Intermediary__Group__0__Impl : ( () ) ;
    public final void rule__Intermediary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1095:1: ( ( () ) )
            // InternalPagos.g:1096:1: ( () )
            {
            // InternalPagos.g:1096:1: ( () )
            // InternalPagos.g:1097:2: ()
            {
             before(grammarAccess.getIntermediaryAccess().getIntermediaryAction_0()); 
            // InternalPagos.g:1098:2: ()
            // InternalPagos.g:1098:3: 
            {
            }

             after(grammarAccess.getIntermediaryAccess().getIntermediaryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__0__Impl"


    // $ANTLR start "rule__Intermediary__Group__1"
    // InternalPagos.g:1106:1: rule__Intermediary__Group__1 : rule__Intermediary__Group__1__Impl rule__Intermediary__Group__2 ;
    public final void rule__Intermediary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1110:1: ( rule__Intermediary__Group__1__Impl rule__Intermediary__Group__2 )
            // InternalPagos.g:1111:2: rule__Intermediary__Group__1__Impl rule__Intermediary__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Intermediary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intermediary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__1"


    // $ANTLR start "rule__Intermediary__Group__1__Impl"
    // InternalPagos.g:1118:1: rule__Intermediary__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Intermediary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1122:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:1123:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:1123:1: ( RULE_LBRACE )
            // InternalPagos.g:1124:2: RULE_LBRACE
            {
             before(grammarAccess.getIntermediaryAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getIntermediaryAccess().getLBRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__1__Impl"


    // $ANTLR start "rule__Intermediary__Group__2"
    // InternalPagos.g:1133:1: rule__Intermediary__Group__2 : rule__Intermediary__Group__2__Impl rule__Intermediary__Group__3 ;
    public final void rule__Intermediary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1137:1: ( rule__Intermediary__Group__2__Impl rule__Intermediary__Group__3 )
            // InternalPagos.g:1138:2: rule__Intermediary__Group__2__Impl rule__Intermediary__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Intermediary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intermediary__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__2"


    // $ANTLR start "rule__Intermediary__Group__2__Impl"
    // InternalPagos.g:1145:1: rule__Intermediary__Group__2__Impl : ( 'name' ) ;
    public final void rule__Intermediary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1149:1: ( ( 'name' ) )
            // InternalPagos.g:1150:1: ( 'name' )
            {
            // InternalPagos.g:1150:1: ( 'name' )
            // InternalPagos.g:1151:2: 'name'
            {
             before(grammarAccess.getIntermediaryAccess().getNameKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIntermediaryAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__2__Impl"


    // $ANTLR start "rule__Intermediary__Group__3"
    // InternalPagos.g:1160:1: rule__Intermediary__Group__3 : rule__Intermediary__Group__3__Impl rule__Intermediary__Group__4 ;
    public final void rule__Intermediary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1164:1: ( rule__Intermediary__Group__3__Impl rule__Intermediary__Group__4 )
            // InternalPagos.g:1165:2: rule__Intermediary__Group__3__Impl rule__Intermediary__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Intermediary__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intermediary__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__3"


    // $ANTLR start "rule__Intermediary__Group__3__Impl"
    // InternalPagos.g:1172:1: rule__Intermediary__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Intermediary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1176:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1177:1: ( RULE_COLON )
            {
            // InternalPagos.g:1177:1: ( RULE_COLON )
            // InternalPagos.g:1178:2: RULE_COLON
            {
             before(grammarAccess.getIntermediaryAccess().getCOLONTerminalRuleCall_3()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getIntermediaryAccess().getCOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__3__Impl"


    // $ANTLR start "rule__Intermediary__Group__4"
    // InternalPagos.g:1187:1: rule__Intermediary__Group__4 : rule__Intermediary__Group__4__Impl rule__Intermediary__Group__5 ;
    public final void rule__Intermediary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1191:1: ( rule__Intermediary__Group__4__Impl rule__Intermediary__Group__5 )
            // InternalPagos.g:1192:2: rule__Intermediary__Group__4__Impl rule__Intermediary__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Intermediary__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intermediary__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__4"


    // $ANTLR start "rule__Intermediary__Group__4__Impl"
    // InternalPagos.g:1199:1: rule__Intermediary__Group__4__Impl : ( ( rule__Intermediary__NameAssignment_4 ) ) ;
    public final void rule__Intermediary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1203:1: ( ( ( rule__Intermediary__NameAssignment_4 ) ) )
            // InternalPagos.g:1204:1: ( ( rule__Intermediary__NameAssignment_4 ) )
            {
            // InternalPagos.g:1204:1: ( ( rule__Intermediary__NameAssignment_4 ) )
            // InternalPagos.g:1205:2: ( rule__Intermediary__NameAssignment_4 )
            {
             before(grammarAccess.getIntermediaryAccess().getNameAssignment_4()); 
            // InternalPagos.g:1206:2: ( rule__Intermediary__NameAssignment_4 )
            // InternalPagos.g:1206:3: rule__Intermediary__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Intermediary__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntermediaryAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__4__Impl"


    // $ANTLR start "rule__Intermediary__Group__5"
    // InternalPagos.g:1214:1: rule__Intermediary__Group__5 : rule__Intermediary__Group__5__Impl rule__Intermediary__Group__6 ;
    public final void rule__Intermediary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1218:1: ( rule__Intermediary__Group__5__Impl rule__Intermediary__Group__6 )
            // InternalPagos.g:1219:2: rule__Intermediary__Group__5__Impl rule__Intermediary__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Intermediary__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intermediary__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__5"


    // $ANTLR start "rule__Intermediary__Group__5__Impl"
    // InternalPagos.g:1226:1: rule__Intermediary__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Intermediary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1230:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1231:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1231:1: ( RULE_COMMA )
            // InternalPagos.g:1232:2: RULE_COMMA
            {
             before(grammarAccess.getIntermediaryAccess().getCOMMATerminalRuleCall_5()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getIntermediaryAccess().getCOMMATerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__5__Impl"


    // $ANTLR start "rule__Intermediary__Group__6"
    // InternalPagos.g:1241:1: rule__Intermediary__Group__6 : rule__Intermediary__Group__6__Impl rule__Intermediary__Group__7 ;
    public final void rule__Intermediary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1245:1: ( rule__Intermediary__Group__6__Impl rule__Intermediary__Group__7 )
            // InternalPagos.g:1246:2: rule__Intermediary__Group__6__Impl rule__Intermediary__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Intermediary__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intermediary__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__6"


    // $ANTLR start "rule__Intermediary__Group__6__Impl"
    // InternalPagos.g:1253:1: rule__Intermediary__Group__6__Impl : ( 'superentities' ) ;
    public final void rule__Intermediary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1257:1: ( ( 'superentities' ) )
            // InternalPagos.g:1258:1: ( 'superentities' )
            {
            // InternalPagos.g:1258:1: ( 'superentities' )
            // InternalPagos.g:1259:2: 'superentities'
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitiesKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getIntermediaryAccess().getSuperentitiesKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__6__Impl"


    // $ANTLR start "rule__Intermediary__Group__7"
    // InternalPagos.g:1268:1: rule__Intermediary__Group__7 : rule__Intermediary__Group__7__Impl rule__Intermediary__Group__8 ;
    public final void rule__Intermediary__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1272:1: ( rule__Intermediary__Group__7__Impl rule__Intermediary__Group__8 )
            // InternalPagos.g:1273:2: rule__Intermediary__Group__7__Impl rule__Intermediary__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Intermediary__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intermediary__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__7"


    // $ANTLR start "rule__Intermediary__Group__7__Impl"
    // InternalPagos.g:1280:1: rule__Intermediary__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__Intermediary__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1284:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1285:1: ( RULE_COLON )
            {
            // InternalPagos.g:1285:1: ( RULE_COLON )
            // InternalPagos.g:1286:2: RULE_COLON
            {
             before(grammarAccess.getIntermediaryAccess().getCOLONTerminalRuleCall_7()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getIntermediaryAccess().getCOLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__7__Impl"


    // $ANTLR start "rule__Intermediary__Group__8"
    // InternalPagos.g:1295:1: rule__Intermediary__Group__8 : rule__Intermediary__Group__8__Impl rule__Intermediary__Group__9 ;
    public final void rule__Intermediary__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1299:1: ( rule__Intermediary__Group__8__Impl rule__Intermediary__Group__9 )
            // InternalPagos.g:1300:2: rule__Intermediary__Group__8__Impl rule__Intermediary__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Intermediary__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intermediary__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__8"


    // $ANTLR start "rule__Intermediary__Group__8__Impl"
    // InternalPagos.g:1307:1: rule__Intermediary__Group__8__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Intermediary__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1311:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:1312:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:1312:1: ( RULE_LBRACKET )
            // InternalPagos.g:1313:2: RULE_LBRACKET
            {
             before(grammarAccess.getIntermediaryAccess().getLBRACKETTerminalRuleCall_8()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getIntermediaryAccess().getLBRACKETTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__8__Impl"


    // $ANTLR start "rule__Intermediary__Group__9"
    // InternalPagos.g:1322:1: rule__Intermediary__Group__9 : rule__Intermediary__Group__9__Impl rule__Intermediary__Group__10 ;
    public final void rule__Intermediary__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1326:1: ( rule__Intermediary__Group__9__Impl rule__Intermediary__Group__10 )
            // InternalPagos.g:1327:2: rule__Intermediary__Group__9__Impl rule__Intermediary__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Intermediary__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intermediary__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__9"


    // $ANTLR start "rule__Intermediary__Group__9__Impl"
    // InternalPagos.g:1334:1: rule__Intermediary__Group__9__Impl : ( ( rule__Intermediary__SuperentitiesAssignment_9 ) ) ;
    public final void rule__Intermediary__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1338:1: ( ( ( rule__Intermediary__SuperentitiesAssignment_9 ) ) )
            // InternalPagos.g:1339:1: ( ( rule__Intermediary__SuperentitiesAssignment_9 ) )
            {
            // InternalPagos.g:1339:1: ( ( rule__Intermediary__SuperentitiesAssignment_9 ) )
            // InternalPagos.g:1340:2: ( rule__Intermediary__SuperentitiesAssignment_9 )
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitiesAssignment_9()); 
            // InternalPagos.g:1341:2: ( rule__Intermediary__SuperentitiesAssignment_9 )
            // InternalPagos.g:1341:3: rule__Intermediary__SuperentitiesAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Intermediary__SuperentitiesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getIntermediaryAccess().getSuperentitiesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__9__Impl"


    // $ANTLR start "rule__Intermediary__Group__10"
    // InternalPagos.g:1349:1: rule__Intermediary__Group__10 : rule__Intermediary__Group__10__Impl rule__Intermediary__Group__11 ;
    public final void rule__Intermediary__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1353:1: ( rule__Intermediary__Group__10__Impl rule__Intermediary__Group__11 )
            // InternalPagos.g:1354:2: rule__Intermediary__Group__10__Impl rule__Intermediary__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Intermediary__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intermediary__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__10"


    // $ANTLR start "rule__Intermediary__Group__10__Impl"
    // InternalPagos.g:1361:1: rule__Intermediary__Group__10__Impl : ( ( rule__Intermediary__Group_10__0 )* ) ;
    public final void rule__Intermediary__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1365:1: ( ( ( rule__Intermediary__Group_10__0 )* ) )
            // InternalPagos.g:1366:1: ( ( rule__Intermediary__Group_10__0 )* )
            {
            // InternalPagos.g:1366:1: ( ( rule__Intermediary__Group_10__0 )* )
            // InternalPagos.g:1367:2: ( rule__Intermediary__Group_10__0 )*
            {
             before(grammarAccess.getIntermediaryAccess().getGroup_10()); 
            // InternalPagos.g:1368:2: ( rule__Intermediary__Group_10__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPagos.g:1368:3: rule__Intermediary__Group_10__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Intermediary__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getIntermediaryAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__10__Impl"


    // $ANTLR start "rule__Intermediary__Group__11"
    // InternalPagos.g:1376:1: rule__Intermediary__Group__11 : rule__Intermediary__Group__11__Impl rule__Intermediary__Group__12 ;
    public final void rule__Intermediary__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1380:1: ( rule__Intermediary__Group__11__Impl rule__Intermediary__Group__12 )
            // InternalPagos.g:1381:2: rule__Intermediary__Group__11__Impl rule__Intermediary__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Intermediary__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intermediary__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__11"


    // $ANTLR start "rule__Intermediary__Group__11__Impl"
    // InternalPagos.g:1388:1: rule__Intermediary__Group__11__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Intermediary__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1392:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:1393:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:1393:1: ( RULE_RBRACKET )
            // InternalPagos.g:1394:2: RULE_RBRACKET
            {
             before(grammarAccess.getIntermediaryAccess().getRBRACKETTerminalRuleCall_11()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getIntermediaryAccess().getRBRACKETTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__11__Impl"


    // $ANTLR start "rule__Intermediary__Group__12"
    // InternalPagos.g:1403:1: rule__Intermediary__Group__12 : rule__Intermediary__Group__12__Impl ;
    public final void rule__Intermediary__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1407:1: ( rule__Intermediary__Group__12__Impl )
            // InternalPagos.g:1408:2: rule__Intermediary__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intermediary__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__12"


    // $ANTLR start "rule__Intermediary__Group__12__Impl"
    // InternalPagos.g:1414:1: rule__Intermediary__Group__12__Impl : ( RULE_RBRACE ) ;
    public final void rule__Intermediary__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1418:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:1419:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:1419:1: ( RULE_RBRACE )
            // InternalPagos.g:1420:2: RULE_RBRACE
            {
             before(grammarAccess.getIntermediaryAccess().getRBRACETerminalRuleCall_12()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getIntermediaryAccess().getRBRACETerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group__12__Impl"


    // $ANTLR start "rule__Intermediary__Group_10__0"
    // InternalPagos.g:1430:1: rule__Intermediary__Group_10__0 : rule__Intermediary__Group_10__0__Impl rule__Intermediary__Group_10__1 ;
    public final void rule__Intermediary__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1434:1: ( rule__Intermediary__Group_10__0__Impl rule__Intermediary__Group_10__1 )
            // InternalPagos.g:1435:2: rule__Intermediary__Group_10__0__Impl rule__Intermediary__Group_10__1
            {
            pushFollow(FOLLOW_8);
            rule__Intermediary__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intermediary__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group_10__0"


    // $ANTLR start "rule__Intermediary__Group_10__0__Impl"
    // InternalPagos.g:1442:1: rule__Intermediary__Group_10__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Intermediary__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1446:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1447:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1447:1: ( RULE_COMMA )
            // InternalPagos.g:1448:2: RULE_COMMA
            {
             before(grammarAccess.getIntermediaryAccess().getCOMMATerminalRuleCall_10_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getIntermediaryAccess().getCOMMATerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group_10__0__Impl"


    // $ANTLR start "rule__Intermediary__Group_10__1"
    // InternalPagos.g:1457:1: rule__Intermediary__Group_10__1 : rule__Intermediary__Group_10__1__Impl ;
    public final void rule__Intermediary__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1461:1: ( rule__Intermediary__Group_10__1__Impl )
            // InternalPagos.g:1462:2: rule__Intermediary__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intermediary__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group_10__1"


    // $ANTLR start "rule__Intermediary__Group_10__1__Impl"
    // InternalPagos.g:1468:1: rule__Intermediary__Group_10__1__Impl : ( ( rule__Intermediary__SuperentitiesAssignment_10_1 ) ) ;
    public final void rule__Intermediary__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1472:1: ( ( ( rule__Intermediary__SuperentitiesAssignment_10_1 ) ) )
            // InternalPagos.g:1473:1: ( ( rule__Intermediary__SuperentitiesAssignment_10_1 ) )
            {
            // InternalPagos.g:1473:1: ( ( rule__Intermediary__SuperentitiesAssignment_10_1 ) )
            // InternalPagos.g:1474:2: ( rule__Intermediary__SuperentitiesAssignment_10_1 )
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitiesAssignment_10_1()); 
            // InternalPagos.g:1475:2: ( rule__Intermediary__SuperentitiesAssignment_10_1 )
            // InternalPagos.g:1475:3: rule__Intermediary__SuperentitiesAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Intermediary__SuperentitiesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getIntermediaryAccess().getSuperentitiesAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__Group_10__1__Impl"


    // $ANTLR start "rule__SuperEntity__Group__0"
    // InternalPagos.g:1484:1: rule__SuperEntity__Group__0 : rule__SuperEntity__Group__0__Impl rule__SuperEntity__Group__1 ;
    public final void rule__SuperEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1488:1: ( rule__SuperEntity__Group__0__Impl rule__SuperEntity__Group__1 )
            // InternalPagos.g:1489:2: rule__SuperEntity__Group__0__Impl rule__SuperEntity__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SuperEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__0"


    // $ANTLR start "rule__SuperEntity__Group__0__Impl"
    // InternalPagos.g:1496:1: rule__SuperEntity__Group__0__Impl : ( () ) ;
    public final void rule__SuperEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1500:1: ( ( () ) )
            // InternalPagos.g:1501:1: ( () )
            {
            // InternalPagos.g:1501:1: ( () )
            // InternalPagos.g:1502:2: ()
            {
             before(grammarAccess.getSuperEntityAccess().getSuperEntityAction_0()); 
            // InternalPagos.g:1503:2: ()
            // InternalPagos.g:1503:3: 
            {
            }

             after(grammarAccess.getSuperEntityAccess().getSuperEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__0__Impl"


    // $ANTLR start "rule__SuperEntity__Group__1"
    // InternalPagos.g:1511:1: rule__SuperEntity__Group__1 : rule__SuperEntity__Group__1__Impl rule__SuperEntity__Group__2 ;
    public final void rule__SuperEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1515:1: ( rule__SuperEntity__Group__1__Impl rule__SuperEntity__Group__2 )
            // InternalPagos.g:1516:2: rule__SuperEntity__Group__1__Impl rule__SuperEntity__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SuperEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__1"


    // $ANTLR start "rule__SuperEntity__Group__1__Impl"
    // InternalPagos.g:1523:1: rule__SuperEntity__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__SuperEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1527:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:1528:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:1528:1: ( RULE_LBRACE )
            // InternalPagos.g:1529:2: RULE_LBRACE
            {
             before(grammarAccess.getSuperEntityAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getLBRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__1__Impl"


    // $ANTLR start "rule__SuperEntity__Group__2"
    // InternalPagos.g:1538:1: rule__SuperEntity__Group__2 : rule__SuperEntity__Group__2__Impl rule__SuperEntity__Group__3 ;
    public final void rule__SuperEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1542:1: ( rule__SuperEntity__Group__2__Impl rule__SuperEntity__Group__3 )
            // InternalPagos.g:1543:2: rule__SuperEntity__Group__2__Impl rule__SuperEntity__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SuperEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__2"


    // $ANTLR start "rule__SuperEntity__Group__2__Impl"
    // InternalPagos.g:1550:1: rule__SuperEntity__Group__2__Impl : ( 'name' ) ;
    public final void rule__SuperEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1554:1: ( ( 'name' ) )
            // InternalPagos.g:1555:1: ( 'name' )
            {
            // InternalPagos.g:1555:1: ( 'name' )
            // InternalPagos.g:1556:2: 'name'
            {
             before(grammarAccess.getSuperEntityAccess().getNameKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__2__Impl"


    // $ANTLR start "rule__SuperEntity__Group__3"
    // InternalPagos.g:1565:1: rule__SuperEntity__Group__3 : rule__SuperEntity__Group__3__Impl rule__SuperEntity__Group__4 ;
    public final void rule__SuperEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1569:1: ( rule__SuperEntity__Group__3__Impl rule__SuperEntity__Group__4 )
            // InternalPagos.g:1570:2: rule__SuperEntity__Group__3__Impl rule__SuperEntity__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SuperEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__3"


    // $ANTLR start "rule__SuperEntity__Group__3__Impl"
    // InternalPagos.g:1577:1: rule__SuperEntity__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1581:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1582:1: ( RULE_COLON )
            {
            // InternalPagos.g:1582:1: ( RULE_COLON )
            // InternalPagos.g:1583:2: RULE_COLON
            {
             before(grammarAccess.getSuperEntityAccess().getCOLONTerminalRuleCall_3()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getCOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__3__Impl"


    // $ANTLR start "rule__SuperEntity__Group__4"
    // InternalPagos.g:1592:1: rule__SuperEntity__Group__4 : rule__SuperEntity__Group__4__Impl rule__SuperEntity__Group__5 ;
    public final void rule__SuperEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1596:1: ( rule__SuperEntity__Group__4__Impl rule__SuperEntity__Group__5 )
            // InternalPagos.g:1597:2: rule__SuperEntity__Group__4__Impl rule__SuperEntity__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__SuperEntity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__4"


    // $ANTLR start "rule__SuperEntity__Group__4__Impl"
    // InternalPagos.g:1604:1: rule__SuperEntity__Group__4__Impl : ( ( rule__SuperEntity__NameAssignment_4 ) ) ;
    public final void rule__SuperEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1608:1: ( ( ( rule__SuperEntity__NameAssignment_4 ) ) )
            // InternalPagos.g:1609:1: ( ( rule__SuperEntity__NameAssignment_4 ) )
            {
            // InternalPagos.g:1609:1: ( ( rule__SuperEntity__NameAssignment_4 ) )
            // InternalPagos.g:1610:2: ( rule__SuperEntity__NameAssignment_4 )
            {
             before(grammarAccess.getSuperEntityAccess().getNameAssignment_4()); 
            // InternalPagos.g:1611:2: ( rule__SuperEntity__NameAssignment_4 )
            // InternalPagos.g:1611:3: rule__SuperEntity__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntity__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSuperEntityAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__4__Impl"


    // $ANTLR start "rule__SuperEntity__Group__5"
    // InternalPagos.g:1619:1: rule__SuperEntity__Group__5 : rule__SuperEntity__Group__5__Impl rule__SuperEntity__Group__6 ;
    public final void rule__SuperEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1623:1: ( rule__SuperEntity__Group__5__Impl rule__SuperEntity__Group__6 )
            // InternalPagos.g:1624:2: rule__SuperEntity__Group__5__Impl rule__SuperEntity__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__SuperEntity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__5"


    // $ANTLR start "rule__SuperEntity__Group__5__Impl"
    // InternalPagos.g:1631:1: rule__SuperEntity__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1635:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1636:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1636:1: ( RULE_COMMA )
            // InternalPagos.g:1637:2: RULE_COMMA
            {
             before(grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_5()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__5__Impl"


    // $ANTLR start "rule__SuperEntity__Group__6"
    // InternalPagos.g:1646:1: rule__SuperEntity__Group__6 : rule__SuperEntity__Group__6__Impl rule__SuperEntity__Group__7 ;
    public final void rule__SuperEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1650:1: ( rule__SuperEntity__Group__6__Impl rule__SuperEntity__Group__7 )
            // InternalPagos.g:1651:2: rule__SuperEntity__Group__6__Impl rule__SuperEntity__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__SuperEntity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__6"


    // $ANTLR start "rule__SuperEntity__Group__6__Impl"
    // InternalPagos.g:1658:1: rule__SuperEntity__Group__6__Impl : ( 'description' ) ;
    public final void rule__SuperEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1662:1: ( ( 'description' ) )
            // InternalPagos.g:1663:1: ( 'description' )
            {
            // InternalPagos.g:1663:1: ( 'description' )
            // InternalPagos.g:1664:2: 'description'
            {
             before(grammarAccess.getSuperEntityAccess().getDescriptionKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getDescriptionKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__6__Impl"


    // $ANTLR start "rule__SuperEntity__Group__7"
    // InternalPagos.g:1673:1: rule__SuperEntity__Group__7 : rule__SuperEntity__Group__7__Impl rule__SuperEntity__Group__8 ;
    public final void rule__SuperEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1677:1: ( rule__SuperEntity__Group__7__Impl rule__SuperEntity__Group__8 )
            // InternalPagos.g:1678:2: rule__SuperEntity__Group__7__Impl rule__SuperEntity__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__SuperEntity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__7"


    // $ANTLR start "rule__SuperEntity__Group__7__Impl"
    // InternalPagos.g:1685:1: rule__SuperEntity__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1689:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1690:1: ( RULE_COLON )
            {
            // InternalPagos.g:1690:1: ( RULE_COLON )
            // InternalPagos.g:1691:2: RULE_COLON
            {
             before(grammarAccess.getSuperEntityAccess().getCOLONTerminalRuleCall_7()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getCOLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__7__Impl"


    // $ANTLR start "rule__SuperEntity__Group__8"
    // InternalPagos.g:1700:1: rule__SuperEntity__Group__8 : rule__SuperEntity__Group__8__Impl rule__SuperEntity__Group__9 ;
    public final void rule__SuperEntity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1704:1: ( rule__SuperEntity__Group__8__Impl rule__SuperEntity__Group__9 )
            // InternalPagos.g:1705:2: rule__SuperEntity__Group__8__Impl rule__SuperEntity__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__SuperEntity__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__8"


    // $ANTLR start "rule__SuperEntity__Group__8__Impl"
    // InternalPagos.g:1712:1: rule__SuperEntity__Group__8__Impl : ( ( rule__SuperEntity__DescriptionAssignment_8 ) ) ;
    public final void rule__SuperEntity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1716:1: ( ( ( rule__SuperEntity__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:1717:1: ( ( rule__SuperEntity__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:1717:1: ( ( rule__SuperEntity__DescriptionAssignment_8 ) )
            // InternalPagos.g:1718:2: ( rule__SuperEntity__DescriptionAssignment_8 )
            {
             before(grammarAccess.getSuperEntityAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:1719:2: ( rule__SuperEntity__DescriptionAssignment_8 )
            // InternalPagos.g:1719:3: rule__SuperEntity__DescriptionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntity__DescriptionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSuperEntityAccess().getDescriptionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__8__Impl"


    // $ANTLR start "rule__SuperEntity__Group__9"
    // InternalPagos.g:1727:1: rule__SuperEntity__Group__9 : rule__SuperEntity__Group__9__Impl rule__SuperEntity__Group__10 ;
    public final void rule__SuperEntity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1731:1: ( rule__SuperEntity__Group__9__Impl rule__SuperEntity__Group__10 )
            // InternalPagos.g:1732:2: rule__SuperEntity__Group__9__Impl rule__SuperEntity__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__SuperEntity__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__9"


    // $ANTLR start "rule__SuperEntity__Group__9__Impl"
    // InternalPagos.g:1739:1: rule__SuperEntity__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1743:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1744:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1744:1: ( RULE_COMMA )
            // InternalPagos.g:1745:2: RULE_COMMA
            {
             before(grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_9()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__9__Impl"


    // $ANTLR start "rule__SuperEntity__Group__10"
    // InternalPagos.g:1754:1: rule__SuperEntity__Group__10 : rule__SuperEntity__Group__10__Impl rule__SuperEntity__Group__11 ;
    public final void rule__SuperEntity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1758:1: ( rule__SuperEntity__Group__10__Impl rule__SuperEntity__Group__11 )
            // InternalPagos.g:1759:2: rule__SuperEntity__Group__10__Impl rule__SuperEntity__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__SuperEntity__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__10"


    // $ANTLR start "rule__SuperEntity__Group__10__Impl"
    // InternalPagos.g:1766:1: rule__SuperEntity__Group__10__Impl : ( 'attributes' ) ;
    public final void rule__SuperEntity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1770:1: ( ( 'attributes' ) )
            // InternalPagos.g:1771:1: ( 'attributes' )
            {
            // InternalPagos.g:1771:1: ( 'attributes' )
            // InternalPagos.g:1772:2: 'attributes'
            {
             before(grammarAccess.getSuperEntityAccess().getAttributesKeyword_10()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getAttributesKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__10__Impl"


    // $ANTLR start "rule__SuperEntity__Group__11"
    // InternalPagos.g:1781:1: rule__SuperEntity__Group__11 : rule__SuperEntity__Group__11__Impl rule__SuperEntity__Group__12 ;
    public final void rule__SuperEntity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1785:1: ( rule__SuperEntity__Group__11__Impl rule__SuperEntity__Group__12 )
            // InternalPagos.g:1786:2: rule__SuperEntity__Group__11__Impl rule__SuperEntity__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__SuperEntity__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__11"


    // $ANTLR start "rule__SuperEntity__Group__11__Impl"
    // InternalPagos.g:1793:1: rule__SuperEntity__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1797:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1798:1: ( RULE_COLON )
            {
            // InternalPagos.g:1798:1: ( RULE_COLON )
            // InternalPagos.g:1799:2: RULE_COLON
            {
             before(grammarAccess.getSuperEntityAccess().getCOLONTerminalRuleCall_11()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getCOLONTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__11__Impl"


    // $ANTLR start "rule__SuperEntity__Group__12"
    // InternalPagos.g:1808:1: rule__SuperEntity__Group__12 : rule__SuperEntity__Group__12__Impl rule__SuperEntity__Group__13 ;
    public final void rule__SuperEntity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1812:1: ( rule__SuperEntity__Group__12__Impl rule__SuperEntity__Group__13 )
            // InternalPagos.g:1813:2: rule__SuperEntity__Group__12__Impl rule__SuperEntity__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__SuperEntity__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__12"


    // $ANTLR start "rule__SuperEntity__Group__12__Impl"
    // InternalPagos.g:1820:1: rule__SuperEntity__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__SuperEntity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1824:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:1825:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:1825:1: ( RULE_LBRACKET )
            // InternalPagos.g:1826:2: RULE_LBRACKET
            {
             before(grammarAccess.getSuperEntityAccess().getLBRACKETTerminalRuleCall_12()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getLBRACKETTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__12__Impl"


    // $ANTLR start "rule__SuperEntity__Group__13"
    // InternalPagos.g:1835:1: rule__SuperEntity__Group__13 : rule__SuperEntity__Group__13__Impl rule__SuperEntity__Group__14 ;
    public final void rule__SuperEntity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1839:1: ( rule__SuperEntity__Group__13__Impl rule__SuperEntity__Group__14 )
            // InternalPagos.g:1840:2: rule__SuperEntity__Group__13__Impl rule__SuperEntity__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__SuperEntity__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__13"


    // $ANTLR start "rule__SuperEntity__Group__13__Impl"
    // InternalPagos.g:1847:1: rule__SuperEntity__Group__13__Impl : ( ( rule__SuperEntity__AttListsAssignment_13 ) ) ;
    public final void rule__SuperEntity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1851:1: ( ( ( rule__SuperEntity__AttListsAssignment_13 ) ) )
            // InternalPagos.g:1852:1: ( ( rule__SuperEntity__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:1852:1: ( ( rule__SuperEntity__AttListsAssignment_13 ) )
            // InternalPagos.g:1853:2: ( rule__SuperEntity__AttListsAssignment_13 )
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:1854:2: ( rule__SuperEntity__AttListsAssignment_13 )
            // InternalPagos.g:1854:3: rule__SuperEntity__AttListsAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntity__AttListsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getSuperEntityAccess().getAttListsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__13__Impl"


    // $ANTLR start "rule__SuperEntity__Group__14"
    // InternalPagos.g:1862:1: rule__SuperEntity__Group__14 : rule__SuperEntity__Group__14__Impl rule__SuperEntity__Group__15 ;
    public final void rule__SuperEntity__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1866:1: ( rule__SuperEntity__Group__14__Impl rule__SuperEntity__Group__15 )
            // InternalPagos.g:1867:2: rule__SuperEntity__Group__14__Impl rule__SuperEntity__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__SuperEntity__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__14"


    // $ANTLR start "rule__SuperEntity__Group__14__Impl"
    // InternalPagos.g:1874:1: rule__SuperEntity__Group__14__Impl : ( ( rule__SuperEntity__Group_14__0 )* ) ;
    public final void rule__SuperEntity__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1878:1: ( ( ( rule__SuperEntity__Group_14__0 )* ) )
            // InternalPagos.g:1879:1: ( ( rule__SuperEntity__Group_14__0 )* )
            {
            // InternalPagos.g:1879:1: ( ( rule__SuperEntity__Group_14__0 )* )
            // InternalPagos.g:1880:2: ( rule__SuperEntity__Group_14__0 )*
            {
             before(grammarAccess.getSuperEntityAccess().getGroup_14()); 
            // InternalPagos.g:1881:2: ( rule__SuperEntity__Group_14__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPagos.g:1881:3: rule__SuperEntity__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SuperEntity__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSuperEntityAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__14__Impl"


    // $ANTLR start "rule__SuperEntity__Group__15"
    // InternalPagos.g:1889:1: rule__SuperEntity__Group__15 : rule__SuperEntity__Group__15__Impl rule__SuperEntity__Group__16 ;
    public final void rule__SuperEntity__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1893:1: ( rule__SuperEntity__Group__15__Impl rule__SuperEntity__Group__16 )
            // InternalPagos.g:1894:2: rule__SuperEntity__Group__15__Impl rule__SuperEntity__Group__16
            {
            pushFollow(FOLLOW_6);
            rule__SuperEntity__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__15"


    // $ANTLR start "rule__SuperEntity__Group__15__Impl"
    // InternalPagos.g:1901:1: rule__SuperEntity__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__SuperEntity__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1905:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:1906:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:1906:1: ( RULE_RBRACKET )
            // InternalPagos.g:1907:2: RULE_RBRACKET
            {
             before(grammarAccess.getSuperEntityAccess().getRBRACKETTerminalRuleCall_15()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getRBRACKETTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__15__Impl"


    // $ANTLR start "rule__SuperEntity__Group__16"
    // InternalPagos.g:1916:1: rule__SuperEntity__Group__16 : rule__SuperEntity__Group__16__Impl rule__SuperEntity__Group__17 ;
    public final void rule__SuperEntity__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1920:1: ( rule__SuperEntity__Group__16__Impl rule__SuperEntity__Group__17 )
            // InternalPagos.g:1921:2: rule__SuperEntity__Group__16__Impl rule__SuperEntity__Group__17
            {
            pushFollow(FOLLOW_17);
            rule__SuperEntity__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__16"


    // $ANTLR start "rule__SuperEntity__Group__16__Impl"
    // InternalPagos.g:1928:1: rule__SuperEntity__Group__16__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1932:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1933:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1933:1: ( RULE_COMMA )
            // InternalPagos.g:1934:2: RULE_COMMA
            {
             before(grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_16()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__16__Impl"


    // $ANTLR start "rule__SuperEntity__Group__17"
    // InternalPagos.g:1943:1: rule__SuperEntity__Group__17 : rule__SuperEntity__Group__17__Impl rule__SuperEntity__Group__18 ;
    public final void rule__SuperEntity__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1947:1: ( rule__SuperEntity__Group__17__Impl rule__SuperEntity__Group__18 )
            // InternalPagos.g:1948:2: rule__SuperEntity__Group__17__Impl rule__SuperEntity__Group__18
            {
            pushFollow(FOLLOW_4);
            rule__SuperEntity__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__17"


    // $ANTLR start "rule__SuperEntity__Group__17__Impl"
    // InternalPagos.g:1955:1: rule__SuperEntity__Group__17__Impl : ( 'entities' ) ;
    public final void rule__SuperEntity__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1959:1: ( ( 'entities' ) )
            // InternalPagos.g:1960:1: ( 'entities' )
            {
            // InternalPagos.g:1960:1: ( 'entities' )
            // InternalPagos.g:1961:2: 'entities'
            {
             before(grammarAccess.getSuperEntityAccess().getEntitiesKeyword_17()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getEntitiesKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__17__Impl"


    // $ANTLR start "rule__SuperEntity__Group__18"
    // InternalPagos.g:1970:1: rule__SuperEntity__Group__18 : rule__SuperEntity__Group__18__Impl rule__SuperEntity__Group__19 ;
    public final void rule__SuperEntity__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1974:1: ( rule__SuperEntity__Group__18__Impl rule__SuperEntity__Group__19 )
            // InternalPagos.g:1975:2: rule__SuperEntity__Group__18__Impl rule__SuperEntity__Group__19
            {
            pushFollow(FOLLOW_11);
            rule__SuperEntity__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__18"


    // $ANTLR start "rule__SuperEntity__Group__18__Impl"
    // InternalPagos.g:1982:1: rule__SuperEntity__Group__18__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1986:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1987:1: ( RULE_COLON )
            {
            // InternalPagos.g:1987:1: ( RULE_COLON )
            // InternalPagos.g:1988:2: RULE_COLON
            {
             before(grammarAccess.getSuperEntityAccess().getCOLONTerminalRuleCall_18()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getCOLONTerminalRuleCall_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__18__Impl"


    // $ANTLR start "rule__SuperEntity__Group__19"
    // InternalPagos.g:1997:1: rule__SuperEntity__Group__19 : rule__SuperEntity__Group__19__Impl rule__SuperEntity__Group__20 ;
    public final void rule__SuperEntity__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2001:1: ( rule__SuperEntity__Group__19__Impl rule__SuperEntity__Group__20 )
            // InternalPagos.g:2002:2: rule__SuperEntity__Group__19__Impl rule__SuperEntity__Group__20
            {
            pushFollow(FOLLOW_8);
            rule__SuperEntity__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__19"


    // $ANTLR start "rule__SuperEntity__Group__19__Impl"
    // InternalPagos.g:2009:1: rule__SuperEntity__Group__19__Impl : ( RULE_LBRACKET ) ;
    public final void rule__SuperEntity__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2013:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:2014:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:2014:1: ( RULE_LBRACKET )
            // InternalPagos.g:2015:2: RULE_LBRACKET
            {
             before(grammarAccess.getSuperEntityAccess().getLBRACKETTerminalRuleCall_19()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getLBRACKETTerminalRuleCall_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__19__Impl"


    // $ANTLR start "rule__SuperEntity__Group__20"
    // InternalPagos.g:2024:1: rule__SuperEntity__Group__20 : rule__SuperEntity__Group__20__Impl rule__SuperEntity__Group__21 ;
    public final void rule__SuperEntity__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2028:1: ( rule__SuperEntity__Group__20__Impl rule__SuperEntity__Group__21 )
            // InternalPagos.g:2029:2: rule__SuperEntity__Group__20__Impl rule__SuperEntity__Group__21
            {
            pushFollow(FOLLOW_12);
            rule__SuperEntity__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__20"


    // $ANTLR start "rule__SuperEntity__Group__20__Impl"
    // InternalPagos.g:2036:1: rule__SuperEntity__Group__20__Impl : ( ( rule__SuperEntity__ParticipantsAssignment_20 ) ) ;
    public final void rule__SuperEntity__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2040:1: ( ( ( rule__SuperEntity__ParticipantsAssignment_20 ) ) )
            // InternalPagos.g:2041:1: ( ( rule__SuperEntity__ParticipantsAssignment_20 ) )
            {
            // InternalPagos.g:2041:1: ( ( rule__SuperEntity__ParticipantsAssignment_20 ) )
            // InternalPagos.g:2042:2: ( rule__SuperEntity__ParticipantsAssignment_20 )
            {
             before(grammarAccess.getSuperEntityAccess().getParticipantsAssignment_20()); 
            // InternalPagos.g:2043:2: ( rule__SuperEntity__ParticipantsAssignment_20 )
            // InternalPagos.g:2043:3: rule__SuperEntity__ParticipantsAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntity__ParticipantsAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getSuperEntityAccess().getParticipantsAssignment_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__20__Impl"


    // $ANTLR start "rule__SuperEntity__Group__21"
    // InternalPagos.g:2051:1: rule__SuperEntity__Group__21 : rule__SuperEntity__Group__21__Impl rule__SuperEntity__Group__22 ;
    public final void rule__SuperEntity__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2055:1: ( rule__SuperEntity__Group__21__Impl rule__SuperEntity__Group__22 )
            // InternalPagos.g:2056:2: rule__SuperEntity__Group__21__Impl rule__SuperEntity__Group__22
            {
            pushFollow(FOLLOW_12);
            rule__SuperEntity__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__21"


    // $ANTLR start "rule__SuperEntity__Group__21__Impl"
    // InternalPagos.g:2063:1: rule__SuperEntity__Group__21__Impl : ( ( rule__SuperEntity__Group_21__0 )* ) ;
    public final void rule__SuperEntity__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2067:1: ( ( ( rule__SuperEntity__Group_21__0 )* ) )
            // InternalPagos.g:2068:1: ( ( rule__SuperEntity__Group_21__0 )* )
            {
            // InternalPagos.g:2068:1: ( ( rule__SuperEntity__Group_21__0 )* )
            // InternalPagos.g:2069:2: ( rule__SuperEntity__Group_21__0 )*
            {
             before(grammarAccess.getSuperEntityAccess().getGroup_21()); 
            // InternalPagos.g:2070:2: ( rule__SuperEntity__Group_21__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPagos.g:2070:3: rule__SuperEntity__Group_21__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SuperEntity__Group_21__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSuperEntityAccess().getGroup_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__21__Impl"


    // $ANTLR start "rule__SuperEntity__Group__22"
    // InternalPagos.g:2078:1: rule__SuperEntity__Group__22 : rule__SuperEntity__Group__22__Impl rule__SuperEntity__Group__23 ;
    public final void rule__SuperEntity__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2082:1: ( rule__SuperEntity__Group__22__Impl rule__SuperEntity__Group__23 )
            // InternalPagos.g:2083:2: rule__SuperEntity__Group__22__Impl rule__SuperEntity__Group__23
            {
            pushFollow(FOLLOW_9);
            rule__SuperEntity__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__22"


    // $ANTLR start "rule__SuperEntity__Group__22__Impl"
    // InternalPagos.g:2090:1: rule__SuperEntity__Group__22__Impl : ( RULE_RBRACKET ) ;
    public final void rule__SuperEntity__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2094:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:2095:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:2095:1: ( RULE_RBRACKET )
            // InternalPagos.g:2096:2: RULE_RBRACKET
            {
             before(grammarAccess.getSuperEntityAccess().getRBRACKETTerminalRuleCall_22()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getRBRACKETTerminalRuleCall_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__22__Impl"


    // $ANTLR start "rule__SuperEntity__Group__23"
    // InternalPagos.g:2105:1: rule__SuperEntity__Group__23 : rule__SuperEntity__Group__23__Impl ;
    public final void rule__SuperEntity__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2109:1: ( rule__SuperEntity__Group__23__Impl )
            // InternalPagos.g:2110:2: rule__SuperEntity__Group__23__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group__23__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__23"


    // $ANTLR start "rule__SuperEntity__Group__23__Impl"
    // InternalPagos.g:2116:1: rule__SuperEntity__Group__23__Impl : ( RULE_RBRACE ) ;
    public final void rule__SuperEntity__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2120:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:2121:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:2121:1: ( RULE_RBRACE )
            // InternalPagos.g:2122:2: RULE_RBRACE
            {
             before(grammarAccess.getSuperEntityAccess().getRBRACETerminalRuleCall_23()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getRBRACETerminalRuleCall_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group__23__Impl"


    // $ANTLR start "rule__SuperEntity__Group_14__0"
    // InternalPagos.g:2132:1: rule__SuperEntity__Group_14__0 : rule__SuperEntity__Group_14__0__Impl rule__SuperEntity__Group_14__1 ;
    public final void rule__SuperEntity__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2136:1: ( rule__SuperEntity__Group_14__0__Impl rule__SuperEntity__Group_14__1 )
            // InternalPagos.g:2137:2: rule__SuperEntity__Group_14__0__Impl rule__SuperEntity__Group_14__1
            {
            pushFollow(FOLLOW_8);
            rule__SuperEntity__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group_14__0"


    // $ANTLR start "rule__SuperEntity__Group_14__0__Impl"
    // InternalPagos.g:2144:1: rule__SuperEntity__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2148:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2149:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2149:1: ( RULE_COMMA )
            // InternalPagos.g:2150:2: RULE_COMMA
            {
             before(grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_14_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group_14__0__Impl"


    // $ANTLR start "rule__SuperEntity__Group_14__1"
    // InternalPagos.g:2159:1: rule__SuperEntity__Group_14__1 : rule__SuperEntity__Group_14__1__Impl ;
    public final void rule__SuperEntity__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2163:1: ( rule__SuperEntity__Group_14__1__Impl )
            // InternalPagos.g:2164:2: rule__SuperEntity__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group_14__1"


    // $ANTLR start "rule__SuperEntity__Group_14__1__Impl"
    // InternalPagos.g:2170:1: rule__SuperEntity__Group_14__1__Impl : ( ( rule__SuperEntity__AttListsAssignment_14_1 ) ) ;
    public final void rule__SuperEntity__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2174:1: ( ( ( rule__SuperEntity__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:2175:1: ( ( rule__SuperEntity__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:2175:1: ( ( rule__SuperEntity__AttListsAssignment_14_1 ) )
            // InternalPagos.g:2176:2: ( rule__SuperEntity__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:2177:2: ( rule__SuperEntity__AttListsAssignment_14_1 )
            // InternalPagos.g:2177:3: rule__SuperEntity__AttListsAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntity__AttListsAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getSuperEntityAccess().getAttListsAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group_14__1__Impl"


    // $ANTLR start "rule__SuperEntity__Group_21__0"
    // InternalPagos.g:2186:1: rule__SuperEntity__Group_21__0 : rule__SuperEntity__Group_21__0__Impl rule__SuperEntity__Group_21__1 ;
    public final void rule__SuperEntity__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2190:1: ( rule__SuperEntity__Group_21__0__Impl rule__SuperEntity__Group_21__1 )
            // InternalPagos.g:2191:2: rule__SuperEntity__Group_21__0__Impl rule__SuperEntity__Group_21__1
            {
            pushFollow(FOLLOW_8);
            rule__SuperEntity__Group_21__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group_21__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group_21__0"


    // $ANTLR start "rule__SuperEntity__Group_21__0__Impl"
    // InternalPagos.g:2198:1: rule__SuperEntity__Group_21__0__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2202:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2203:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2203:1: ( RULE_COMMA )
            // InternalPagos.g:2204:2: RULE_COMMA
            {
             before(grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_21_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group_21__0__Impl"


    // $ANTLR start "rule__SuperEntity__Group_21__1"
    // InternalPagos.g:2213:1: rule__SuperEntity__Group_21__1 : rule__SuperEntity__Group_21__1__Impl ;
    public final void rule__SuperEntity__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2217:1: ( rule__SuperEntity__Group_21__1__Impl )
            // InternalPagos.g:2218:2: rule__SuperEntity__Group_21__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntity__Group_21__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group_21__1"


    // $ANTLR start "rule__SuperEntity__Group_21__1__Impl"
    // InternalPagos.g:2224:1: rule__SuperEntity__Group_21__1__Impl : ( ( rule__SuperEntity__ParticipantsAssignment_21_1 ) ) ;
    public final void rule__SuperEntity__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2228:1: ( ( ( rule__SuperEntity__ParticipantsAssignment_21_1 ) ) )
            // InternalPagos.g:2229:1: ( ( rule__SuperEntity__ParticipantsAssignment_21_1 ) )
            {
            // InternalPagos.g:2229:1: ( ( rule__SuperEntity__ParticipantsAssignment_21_1 ) )
            // InternalPagos.g:2230:2: ( rule__SuperEntity__ParticipantsAssignment_21_1 )
            {
             before(grammarAccess.getSuperEntityAccess().getParticipantsAssignment_21_1()); 
            // InternalPagos.g:2231:2: ( rule__SuperEntity__ParticipantsAssignment_21_1 )
            // InternalPagos.g:2231:3: rule__SuperEntity__ParticipantsAssignment_21_1
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntity__ParticipantsAssignment_21_1();

            state._fsp--;


            }

             after(grammarAccess.getSuperEntityAccess().getParticipantsAssignment_21_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__Group_21__1__Impl"


    // $ANTLR start "rule__Participant__Group__0"
    // InternalPagos.g:2240:1: rule__Participant__Group__0 : rule__Participant__Group__0__Impl rule__Participant__Group__1 ;
    public final void rule__Participant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2244:1: ( rule__Participant__Group__0__Impl rule__Participant__Group__1 )
            // InternalPagos.g:2245:2: rule__Participant__Group__0__Impl rule__Participant__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Participant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__0"


    // $ANTLR start "rule__Participant__Group__0__Impl"
    // InternalPagos.g:2252:1: rule__Participant__Group__0__Impl : ( () ) ;
    public final void rule__Participant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2256:1: ( ( () ) )
            // InternalPagos.g:2257:1: ( () )
            {
            // InternalPagos.g:2257:1: ( () )
            // InternalPagos.g:2258:2: ()
            {
             before(grammarAccess.getParticipantAccess().getParticipantAction_0()); 
            // InternalPagos.g:2259:2: ()
            // InternalPagos.g:2259:3: 
            {
            }

             after(grammarAccess.getParticipantAccess().getParticipantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__0__Impl"


    // $ANTLR start "rule__Participant__Group__1"
    // InternalPagos.g:2267:1: rule__Participant__Group__1 : rule__Participant__Group__1__Impl rule__Participant__Group__2 ;
    public final void rule__Participant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2271:1: ( rule__Participant__Group__1__Impl rule__Participant__Group__2 )
            // InternalPagos.g:2272:2: rule__Participant__Group__1__Impl rule__Participant__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Participant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__1"


    // $ANTLR start "rule__Participant__Group__1__Impl"
    // InternalPagos.g:2279:1: rule__Participant__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Participant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2283:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:2284:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:2284:1: ( RULE_LBRACE )
            // InternalPagos.g:2285:2: RULE_LBRACE
            {
             before(grammarAccess.getParticipantAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getLBRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__1__Impl"


    // $ANTLR start "rule__Participant__Group__2"
    // InternalPagos.g:2294:1: rule__Participant__Group__2 : rule__Participant__Group__2__Impl rule__Participant__Group__3 ;
    public final void rule__Participant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2298:1: ( rule__Participant__Group__2__Impl rule__Participant__Group__3 )
            // InternalPagos.g:2299:2: rule__Participant__Group__2__Impl rule__Participant__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Participant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__2"


    // $ANTLR start "rule__Participant__Group__2__Impl"
    // InternalPagos.g:2306:1: rule__Participant__Group__2__Impl : ( 'name' ) ;
    public final void rule__Participant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2310:1: ( ( 'name' ) )
            // InternalPagos.g:2311:1: ( 'name' )
            {
            // InternalPagos.g:2311:1: ( 'name' )
            // InternalPagos.g:2312:2: 'name'
            {
             before(grammarAccess.getParticipantAccess().getNameKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__2__Impl"


    // $ANTLR start "rule__Participant__Group__3"
    // InternalPagos.g:2321:1: rule__Participant__Group__3 : rule__Participant__Group__3__Impl rule__Participant__Group__4 ;
    public final void rule__Participant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2325:1: ( rule__Participant__Group__3__Impl rule__Participant__Group__4 )
            // InternalPagos.g:2326:2: rule__Participant__Group__3__Impl rule__Participant__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Participant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__3"


    // $ANTLR start "rule__Participant__Group__3__Impl"
    // InternalPagos.g:2333:1: rule__Participant__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2337:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2338:1: ( RULE_COLON )
            {
            // InternalPagos.g:2338:1: ( RULE_COLON )
            // InternalPagos.g:2339:2: RULE_COLON
            {
             before(grammarAccess.getParticipantAccess().getCOLONTerminalRuleCall_3()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getCOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__3__Impl"


    // $ANTLR start "rule__Participant__Group__4"
    // InternalPagos.g:2348:1: rule__Participant__Group__4 : rule__Participant__Group__4__Impl rule__Participant__Group__5 ;
    public final void rule__Participant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2352:1: ( rule__Participant__Group__4__Impl rule__Participant__Group__5 )
            // InternalPagos.g:2353:2: rule__Participant__Group__4__Impl rule__Participant__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Participant__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__4"


    // $ANTLR start "rule__Participant__Group__4__Impl"
    // InternalPagos.g:2360:1: rule__Participant__Group__4__Impl : ( ( rule__Participant__NameAssignment_4 ) ) ;
    public final void rule__Participant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2364:1: ( ( ( rule__Participant__NameAssignment_4 ) ) )
            // InternalPagos.g:2365:1: ( ( rule__Participant__NameAssignment_4 ) )
            {
            // InternalPagos.g:2365:1: ( ( rule__Participant__NameAssignment_4 ) )
            // InternalPagos.g:2366:2: ( rule__Participant__NameAssignment_4 )
            {
             before(grammarAccess.getParticipantAccess().getNameAssignment_4()); 
            // InternalPagos.g:2367:2: ( rule__Participant__NameAssignment_4 )
            // InternalPagos.g:2367:3: rule__Participant__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Participant__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__4__Impl"


    // $ANTLR start "rule__Participant__Group__5"
    // InternalPagos.g:2375:1: rule__Participant__Group__5 : rule__Participant__Group__5__Impl rule__Participant__Group__6 ;
    public final void rule__Participant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2379:1: ( rule__Participant__Group__5__Impl rule__Participant__Group__6 )
            // InternalPagos.g:2380:2: rule__Participant__Group__5__Impl rule__Participant__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Participant__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__5"


    // $ANTLR start "rule__Participant__Group__5__Impl"
    // InternalPagos.g:2387:1: rule__Participant__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2391:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2392:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2392:1: ( RULE_COMMA )
            // InternalPagos.g:2393:2: RULE_COMMA
            {
             before(grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_5()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__5__Impl"


    // $ANTLR start "rule__Participant__Group__6"
    // InternalPagos.g:2402:1: rule__Participant__Group__6 : rule__Participant__Group__6__Impl rule__Participant__Group__7 ;
    public final void rule__Participant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2406:1: ( rule__Participant__Group__6__Impl rule__Participant__Group__7 )
            // InternalPagos.g:2407:2: rule__Participant__Group__6__Impl rule__Participant__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Participant__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__6"


    // $ANTLR start "rule__Participant__Group__6__Impl"
    // InternalPagos.g:2414:1: rule__Participant__Group__6__Impl : ( 'description' ) ;
    public final void rule__Participant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2418:1: ( ( 'description' ) )
            // InternalPagos.g:2419:1: ( 'description' )
            {
            // InternalPagos.g:2419:1: ( 'description' )
            // InternalPagos.g:2420:2: 'description'
            {
             before(grammarAccess.getParticipantAccess().getDescriptionKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getDescriptionKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__6__Impl"


    // $ANTLR start "rule__Participant__Group__7"
    // InternalPagos.g:2429:1: rule__Participant__Group__7 : rule__Participant__Group__7__Impl rule__Participant__Group__8 ;
    public final void rule__Participant__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2433:1: ( rule__Participant__Group__7__Impl rule__Participant__Group__8 )
            // InternalPagos.g:2434:2: rule__Participant__Group__7__Impl rule__Participant__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Participant__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__7"


    // $ANTLR start "rule__Participant__Group__7__Impl"
    // InternalPagos.g:2441:1: rule__Participant__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2445:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2446:1: ( RULE_COLON )
            {
            // InternalPagos.g:2446:1: ( RULE_COLON )
            // InternalPagos.g:2447:2: RULE_COLON
            {
             before(grammarAccess.getParticipantAccess().getCOLONTerminalRuleCall_7()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getCOLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__7__Impl"


    // $ANTLR start "rule__Participant__Group__8"
    // InternalPagos.g:2456:1: rule__Participant__Group__8 : rule__Participant__Group__8__Impl rule__Participant__Group__9 ;
    public final void rule__Participant__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2460:1: ( rule__Participant__Group__8__Impl rule__Participant__Group__9 )
            // InternalPagos.g:2461:2: rule__Participant__Group__8__Impl rule__Participant__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Participant__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__8"


    // $ANTLR start "rule__Participant__Group__8__Impl"
    // InternalPagos.g:2468:1: rule__Participant__Group__8__Impl : ( ( rule__Participant__DescriptionAssignment_8 ) ) ;
    public final void rule__Participant__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2472:1: ( ( ( rule__Participant__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:2473:1: ( ( rule__Participant__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:2473:1: ( ( rule__Participant__DescriptionAssignment_8 ) )
            // InternalPagos.g:2474:2: ( rule__Participant__DescriptionAssignment_8 )
            {
             before(grammarAccess.getParticipantAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:2475:2: ( rule__Participant__DescriptionAssignment_8 )
            // InternalPagos.g:2475:3: rule__Participant__DescriptionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Participant__DescriptionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getDescriptionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__8__Impl"


    // $ANTLR start "rule__Participant__Group__9"
    // InternalPagos.g:2483:1: rule__Participant__Group__9 : rule__Participant__Group__9__Impl rule__Participant__Group__10 ;
    public final void rule__Participant__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2487:1: ( rule__Participant__Group__9__Impl rule__Participant__Group__10 )
            // InternalPagos.g:2488:2: rule__Participant__Group__9__Impl rule__Participant__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Participant__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__9"


    // $ANTLR start "rule__Participant__Group__9__Impl"
    // InternalPagos.g:2495:1: rule__Participant__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2499:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2500:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2500:1: ( RULE_COMMA )
            // InternalPagos.g:2501:2: RULE_COMMA
            {
             before(grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_9()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__9__Impl"


    // $ANTLR start "rule__Participant__Group__10"
    // InternalPagos.g:2510:1: rule__Participant__Group__10 : rule__Participant__Group__10__Impl rule__Participant__Group__11 ;
    public final void rule__Participant__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2514:1: ( rule__Participant__Group__10__Impl rule__Participant__Group__11 )
            // InternalPagos.g:2515:2: rule__Participant__Group__10__Impl rule__Participant__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Participant__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__10"


    // $ANTLR start "rule__Participant__Group__10__Impl"
    // InternalPagos.g:2522:1: rule__Participant__Group__10__Impl : ( 'attributes' ) ;
    public final void rule__Participant__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2526:1: ( ( 'attributes' ) )
            // InternalPagos.g:2527:1: ( 'attributes' )
            {
            // InternalPagos.g:2527:1: ( 'attributes' )
            // InternalPagos.g:2528:2: 'attributes'
            {
             before(grammarAccess.getParticipantAccess().getAttributesKeyword_10()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getAttributesKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__10__Impl"


    // $ANTLR start "rule__Participant__Group__11"
    // InternalPagos.g:2537:1: rule__Participant__Group__11 : rule__Participant__Group__11__Impl rule__Participant__Group__12 ;
    public final void rule__Participant__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2541:1: ( rule__Participant__Group__11__Impl rule__Participant__Group__12 )
            // InternalPagos.g:2542:2: rule__Participant__Group__11__Impl rule__Participant__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__Participant__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__11"


    // $ANTLR start "rule__Participant__Group__11__Impl"
    // InternalPagos.g:2549:1: rule__Participant__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2553:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2554:1: ( RULE_COLON )
            {
            // InternalPagos.g:2554:1: ( RULE_COLON )
            // InternalPagos.g:2555:2: RULE_COLON
            {
             before(grammarAccess.getParticipantAccess().getCOLONTerminalRuleCall_11()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getCOLONTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__11__Impl"


    // $ANTLR start "rule__Participant__Group__12"
    // InternalPagos.g:2564:1: rule__Participant__Group__12 : rule__Participant__Group__12__Impl rule__Participant__Group__13 ;
    public final void rule__Participant__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2568:1: ( rule__Participant__Group__12__Impl rule__Participant__Group__13 )
            // InternalPagos.g:2569:2: rule__Participant__Group__12__Impl rule__Participant__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__Participant__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__12"


    // $ANTLR start "rule__Participant__Group__12__Impl"
    // InternalPagos.g:2576:1: rule__Participant__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Participant__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2580:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:2581:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:2581:1: ( RULE_LBRACKET )
            // InternalPagos.g:2582:2: RULE_LBRACKET
            {
             before(grammarAccess.getParticipantAccess().getLBRACKETTerminalRuleCall_12()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getLBRACKETTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__12__Impl"


    // $ANTLR start "rule__Participant__Group__13"
    // InternalPagos.g:2591:1: rule__Participant__Group__13 : rule__Participant__Group__13__Impl rule__Participant__Group__14 ;
    public final void rule__Participant__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2595:1: ( rule__Participant__Group__13__Impl rule__Participant__Group__14 )
            // InternalPagos.g:2596:2: rule__Participant__Group__13__Impl rule__Participant__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__Participant__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__13"


    // $ANTLR start "rule__Participant__Group__13__Impl"
    // InternalPagos.g:2603:1: rule__Participant__Group__13__Impl : ( ( rule__Participant__AttListsAssignment_13 ) ) ;
    public final void rule__Participant__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2607:1: ( ( ( rule__Participant__AttListsAssignment_13 ) ) )
            // InternalPagos.g:2608:1: ( ( rule__Participant__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:2608:1: ( ( rule__Participant__AttListsAssignment_13 ) )
            // InternalPagos.g:2609:2: ( rule__Participant__AttListsAssignment_13 )
            {
             before(grammarAccess.getParticipantAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:2610:2: ( rule__Participant__AttListsAssignment_13 )
            // InternalPagos.g:2610:3: rule__Participant__AttListsAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Participant__AttListsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getAttListsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__13__Impl"


    // $ANTLR start "rule__Participant__Group__14"
    // InternalPagos.g:2618:1: rule__Participant__Group__14 : rule__Participant__Group__14__Impl rule__Participant__Group__15 ;
    public final void rule__Participant__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2622:1: ( rule__Participant__Group__14__Impl rule__Participant__Group__15 )
            // InternalPagos.g:2623:2: rule__Participant__Group__14__Impl rule__Participant__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__Participant__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__14"


    // $ANTLR start "rule__Participant__Group__14__Impl"
    // InternalPagos.g:2630:1: rule__Participant__Group__14__Impl : ( ( rule__Participant__Group_14__0 )* ) ;
    public final void rule__Participant__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2634:1: ( ( ( rule__Participant__Group_14__0 )* ) )
            // InternalPagos.g:2635:1: ( ( rule__Participant__Group_14__0 )* )
            {
            // InternalPagos.g:2635:1: ( ( rule__Participant__Group_14__0 )* )
            // InternalPagos.g:2636:2: ( rule__Participant__Group_14__0 )*
            {
             before(grammarAccess.getParticipantAccess().getGroup_14()); 
            // InternalPagos.g:2637:2: ( rule__Participant__Group_14__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPagos.g:2637:3: rule__Participant__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Participant__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getParticipantAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__14__Impl"


    // $ANTLR start "rule__Participant__Group__15"
    // InternalPagos.g:2645:1: rule__Participant__Group__15 : rule__Participant__Group__15__Impl rule__Participant__Group__16 ;
    public final void rule__Participant__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2649:1: ( rule__Participant__Group__15__Impl rule__Participant__Group__16 )
            // InternalPagos.g:2650:2: rule__Participant__Group__15__Impl rule__Participant__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__Participant__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__15"


    // $ANTLR start "rule__Participant__Group__15__Impl"
    // InternalPagos.g:2657:1: rule__Participant__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Participant__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2661:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:2662:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:2662:1: ( RULE_RBRACKET )
            // InternalPagos.g:2663:2: RULE_RBRACKET
            {
             before(grammarAccess.getParticipantAccess().getRBRACKETTerminalRuleCall_15()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getRBRACKETTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__15__Impl"


    // $ANTLR start "rule__Participant__Group__16"
    // InternalPagos.g:2672:1: rule__Participant__Group__16 : rule__Participant__Group__16__Impl rule__Participant__Group__17 ;
    public final void rule__Participant__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2676:1: ( rule__Participant__Group__16__Impl rule__Participant__Group__17 )
            // InternalPagos.g:2677:2: rule__Participant__Group__16__Impl rule__Participant__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__Participant__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__16"


    // $ANTLR start "rule__Participant__Group__16__Impl"
    // InternalPagos.g:2684:1: rule__Participant__Group__16__Impl : ( RULE_RBRACE ) ;
    public final void rule__Participant__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2688:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:2689:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:2689:1: ( RULE_RBRACE )
            // InternalPagos.g:2690:2: RULE_RBRACE
            {
             before(grammarAccess.getParticipantAccess().getRBRACETerminalRuleCall_16()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getRBRACETerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__16__Impl"


    // $ANTLR start "rule__Participant__Group__17"
    // InternalPagos.g:2699:1: rule__Participant__Group__17 : rule__Participant__Group__17__Impl rule__Participant__Group__18 ;
    public final void rule__Participant__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2703:1: ( rule__Participant__Group__17__Impl rule__Participant__Group__18 )
            // InternalPagos.g:2704:2: rule__Participant__Group__17__Impl rule__Participant__Group__18
            {
            pushFollow(FOLLOW_12);
            rule__Participant__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__17"


    // $ANTLR start "rule__Participant__Group__17__Impl"
    // InternalPagos.g:2711:1: rule__Participant__Group__17__Impl : ( ( rule__Participant__Group_17__0 )? ) ;
    public final void rule__Participant__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2715:1: ( ( ( rule__Participant__Group_17__0 )? ) )
            // InternalPagos.g:2716:1: ( ( rule__Participant__Group_17__0 )? )
            {
            // InternalPagos.g:2716:1: ( ( rule__Participant__Group_17__0 )? )
            // InternalPagos.g:2717:2: ( rule__Participant__Group_17__0 )?
            {
             before(grammarAccess.getParticipantAccess().getGroup_17()); 
            // InternalPagos.g:2718:2: ( rule__Participant__Group_17__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_COMMA) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPagos.g:2718:3: rule__Participant__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Participant__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParticipantAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__17__Impl"


    // $ANTLR start "rule__Participant__Group__18"
    // InternalPagos.g:2726:1: rule__Participant__Group__18 : rule__Participant__Group__18__Impl ;
    public final void rule__Participant__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2730:1: ( rule__Participant__Group__18__Impl )
            // InternalPagos.g:2731:2: rule__Participant__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Participant__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__18"


    // $ANTLR start "rule__Participant__Group__18__Impl"
    // InternalPagos.g:2737:1: rule__Participant__Group__18__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Participant__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2741:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:2742:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:2742:1: ( RULE_RBRACKET )
            // InternalPagos.g:2743:2: RULE_RBRACKET
            {
             before(grammarAccess.getParticipantAccess().getRBRACKETTerminalRuleCall_18()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getRBRACKETTerminalRuleCall_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__18__Impl"


    // $ANTLR start "rule__Participant__Group_14__0"
    // InternalPagos.g:2753:1: rule__Participant__Group_14__0 : rule__Participant__Group_14__0__Impl rule__Participant__Group_14__1 ;
    public final void rule__Participant__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2757:1: ( rule__Participant__Group_14__0__Impl rule__Participant__Group_14__1 )
            // InternalPagos.g:2758:2: rule__Participant__Group_14__0__Impl rule__Participant__Group_14__1
            {
            pushFollow(FOLLOW_8);
            rule__Participant__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_14__0"


    // $ANTLR start "rule__Participant__Group_14__0__Impl"
    // InternalPagos.g:2765:1: rule__Participant__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2769:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2770:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2770:1: ( RULE_COMMA )
            // InternalPagos.g:2771:2: RULE_COMMA
            {
             before(grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_14_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_14__0__Impl"


    // $ANTLR start "rule__Participant__Group_14__1"
    // InternalPagos.g:2780:1: rule__Participant__Group_14__1 : rule__Participant__Group_14__1__Impl ;
    public final void rule__Participant__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2784:1: ( rule__Participant__Group_14__1__Impl )
            // InternalPagos.g:2785:2: rule__Participant__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Participant__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_14__1"


    // $ANTLR start "rule__Participant__Group_14__1__Impl"
    // InternalPagos.g:2791:1: rule__Participant__Group_14__1__Impl : ( ( rule__Participant__AttListsAssignment_14_1 ) ) ;
    public final void rule__Participant__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2795:1: ( ( ( rule__Participant__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:2796:1: ( ( rule__Participant__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:2796:1: ( ( rule__Participant__AttListsAssignment_14_1 ) )
            // InternalPagos.g:2797:2: ( rule__Participant__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getParticipantAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:2798:2: ( rule__Participant__AttListsAssignment_14_1 )
            // InternalPagos.g:2798:3: rule__Participant__AttListsAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Participant__AttListsAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getAttListsAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_14__1__Impl"


    // $ANTLR start "rule__Participant__Group_17__0"
    // InternalPagos.g:2807:1: rule__Participant__Group_17__0 : rule__Participant__Group_17__0__Impl rule__Participant__Group_17__1 ;
    public final void rule__Participant__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2811:1: ( rule__Participant__Group_17__0__Impl rule__Participant__Group_17__1 )
            // InternalPagos.g:2812:2: rule__Participant__Group_17__0__Impl rule__Participant__Group_17__1
            {
            pushFollow(FOLLOW_18);
            rule__Participant__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17__0"


    // $ANTLR start "rule__Participant__Group_17__0__Impl"
    // InternalPagos.g:2819:1: rule__Participant__Group_17__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2823:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2824:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2824:1: ( RULE_COMMA )
            // InternalPagos.g:2825:2: RULE_COMMA
            {
             before(grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_17_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17__0__Impl"


    // $ANTLR start "rule__Participant__Group_17__1"
    // InternalPagos.g:2834:1: rule__Participant__Group_17__1 : rule__Participant__Group_17__1__Impl rule__Participant__Group_17__2 ;
    public final void rule__Participant__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2838:1: ( rule__Participant__Group_17__1__Impl rule__Participant__Group_17__2 )
            // InternalPagos.g:2839:2: rule__Participant__Group_17__1__Impl rule__Participant__Group_17__2
            {
            pushFollow(FOLLOW_4);
            rule__Participant__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17__1"


    // $ANTLR start "rule__Participant__Group_17__1__Impl"
    // InternalPagos.g:2846:1: rule__Participant__Group_17__1__Impl : ( 'InformationTemplate' ) ;
    public final void rule__Participant__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2850:1: ( ( 'InformationTemplate' ) )
            // InternalPagos.g:2851:1: ( 'InformationTemplate' )
            {
            // InternalPagos.g:2851:1: ( 'InformationTemplate' )
            // InternalPagos.g:2852:2: 'InformationTemplate'
            {
             before(grammarAccess.getParticipantAccess().getInformationTemplateKeyword_17_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getInformationTemplateKeyword_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17__1__Impl"


    // $ANTLR start "rule__Participant__Group_17__2"
    // InternalPagos.g:2861:1: rule__Participant__Group_17__2 : rule__Participant__Group_17__2__Impl rule__Participant__Group_17__3 ;
    public final void rule__Participant__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2865:1: ( rule__Participant__Group_17__2__Impl rule__Participant__Group_17__3 )
            // InternalPagos.g:2866:2: rule__Participant__Group_17__2__Impl rule__Participant__Group_17__3
            {
            pushFollow(FOLLOW_11);
            rule__Participant__Group_17__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group_17__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17__2"


    // $ANTLR start "rule__Participant__Group_17__2__Impl"
    // InternalPagos.g:2873:1: rule__Participant__Group_17__2__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2877:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2878:1: ( RULE_COLON )
            {
            // InternalPagos.g:2878:1: ( RULE_COLON )
            // InternalPagos.g:2879:2: RULE_COLON
            {
             before(grammarAccess.getParticipantAccess().getCOLONTerminalRuleCall_17_2()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getCOLONTerminalRuleCall_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17__2__Impl"


    // $ANTLR start "rule__Participant__Group_17__3"
    // InternalPagos.g:2888:1: rule__Participant__Group_17__3 : rule__Participant__Group_17__3__Impl rule__Participant__Group_17__4 ;
    public final void rule__Participant__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2892:1: ( rule__Participant__Group_17__3__Impl rule__Participant__Group_17__4 )
            // InternalPagos.g:2893:2: rule__Participant__Group_17__3__Impl rule__Participant__Group_17__4
            {
            pushFollow(FOLLOW_8);
            rule__Participant__Group_17__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group_17__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17__3"


    // $ANTLR start "rule__Participant__Group_17__3__Impl"
    // InternalPagos.g:2900:1: rule__Participant__Group_17__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Participant__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2904:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:2905:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:2905:1: ( RULE_LBRACKET )
            // InternalPagos.g:2906:2: RULE_LBRACKET
            {
             before(grammarAccess.getParticipantAccess().getLBRACKETTerminalRuleCall_17_3()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getLBRACKETTerminalRuleCall_17_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17__3__Impl"


    // $ANTLR start "rule__Participant__Group_17__4"
    // InternalPagos.g:2915:1: rule__Participant__Group_17__4 : rule__Participant__Group_17__4__Impl rule__Participant__Group_17__5 ;
    public final void rule__Participant__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2919:1: ( rule__Participant__Group_17__4__Impl rule__Participant__Group_17__5 )
            // InternalPagos.g:2920:2: rule__Participant__Group_17__4__Impl rule__Participant__Group_17__5
            {
            pushFollow(FOLLOW_6);
            rule__Participant__Group_17__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group_17__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17__4"


    // $ANTLR start "rule__Participant__Group_17__4__Impl"
    // InternalPagos.g:2927:1: rule__Participant__Group_17__4__Impl : ( ( rule__Participant__TemplatesFormsAssignment_17_4 ) ) ;
    public final void rule__Participant__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2931:1: ( ( ( rule__Participant__TemplatesFormsAssignment_17_4 ) ) )
            // InternalPagos.g:2932:1: ( ( rule__Participant__TemplatesFormsAssignment_17_4 ) )
            {
            // InternalPagos.g:2932:1: ( ( rule__Participant__TemplatesFormsAssignment_17_4 ) )
            // InternalPagos.g:2933:2: ( rule__Participant__TemplatesFormsAssignment_17_4 )
            {
             before(grammarAccess.getParticipantAccess().getTemplatesFormsAssignment_17_4()); 
            // InternalPagos.g:2934:2: ( rule__Participant__TemplatesFormsAssignment_17_4 )
            // InternalPagos.g:2934:3: rule__Participant__TemplatesFormsAssignment_17_4
            {
            pushFollow(FOLLOW_2);
            rule__Participant__TemplatesFormsAssignment_17_4();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getTemplatesFormsAssignment_17_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17__4__Impl"


    // $ANTLR start "rule__Participant__Group_17__5"
    // InternalPagos.g:2942:1: rule__Participant__Group_17__5 : rule__Participant__Group_17__5__Impl ;
    public final void rule__Participant__Group_17__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2946:1: ( rule__Participant__Group_17__5__Impl )
            // InternalPagos.g:2947:2: rule__Participant__Group_17__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Participant__Group_17__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17__5"


    // $ANTLR start "rule__Participant__Group_17__5__Impl"
    // InternalPagos.g:2953:1: rule__Participant__Group_17__5__Impl : ( ( rule__Participant__Group_17_5__0 )* ) ;
    public final void rule__Participant__Group_17__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2957:1: ( ( ( rule__Participant__Group_17_5__0 )* ) )
            // InternalPagos.g:2958:1: ( ( rule__Participant__Group_17_5__0 )* )
            {
            // InternalPagos.g:2958:1: ( ( rule__Participant__Group_17_5__0 )* )
            // InternalPagos.g:2959:2: ( rule__Participant__Group_17_5__0 )*
            {
             before(grammarAccess.getParticipantAccess().getGroup_17_5()); 
            // InternalPagos.g:2960:2: ( rule__Participant__Group_17_5__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPagos.g:2960:3: rule__Participant__Group_17_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Participant__Group_17_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getParticipantAccess().getGroup_17_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17__5__Impl"


    // $ANTLR start "rule__Participant__Group_17_5__0"
    // InternalPagos.g:2969:1: rule__Participant__Group_17_5__0 : rule__Participant__Group_17_5__0__Impl rule__Participant__Group_17_5__1 ;
    public final void rule__Participant__Group_17_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2973:1: ( rule__Participant__Group_17_5__0__Impl rule__Participant__Group_17_5__1 )
            // InternalPagos.g:2974:2: rule__Participant__Group_17_5__0__Impl rule__Participant__Group_17_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Participant__Group_17_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group_17_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17_5__0"


    // $ANTLR start "rule__Participant__Group_17_5__0__Impl"
    // InternalPagos.g:2981:1: rule__Participant__Group_17_5__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group_17_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2985:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2986:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2986:1: ( RULE_COMMA )
            // InternalPagos.g:2987:2: RULE_COMMA
            {
             before(grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_17_5_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_17_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17_5__0__Impl"


    // $ANTLR start "rule__Participant__Group_17_5__1"
    // InternalPagos.g:2996:1: rule__Participant__Group_17_5__1 : rule__Participant__Group_17_5__1__Impl ;
    public final void rule__Participant__Group_17_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3000:1: ( rule__Participant__Group_17_5__1__Impl )
            // InternalPagos.g:3001:2: rule__Participant__Group_17_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Participant__Group_17_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17_5__1"


    // $ANTLR start "rule__Participant__Group_17_5__1__Impl"
    // InternalPagos.g:3007:1: rule__Participant__Group_17_5__1__Impl : ( ( rule__Participant__TemplatesFormsAssignment_17_5_1 ) ) ;
    public final void rule__Participant__Group_17_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3011:1: ( ( ( rule__Participant__TemplatesFormsAssignment_17_5_1 ) ) )
            // InternalPagos.g:3012:1: ( ( rule__Participant__TemplatesFormsAssignment_17_5_1 ) )
            {
            // InternalPagos.g:3012:1: ( ( rule__Participant__TemplatesFormsAssignment_17_5_1 ) )
            // InternalPagos.g:3013:2: ( rule__Participant__TemplatesFormsAssignment_17_5_1 )
            {
             before(grammarAccess.getParticipantAccess().getTemplatesFormsAssignment_17_5_1()); 
            // InternalPagos.g:3014:2: ( rule__Participant__TemplatesFormsAssignment_17_5_1 )
            // InternalPagos.g:3014:3: rule__Participant__TemplatesFormsAssignment_17_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Participant__TemplatesFormsAssignment_17_5_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getTemplatesFormsAssignment_17_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_17_5__1__Impl"


    // $ANTLR start "rule__Provider__Group__0"
    // InternalPagos.g:3023:1: rule__Provider__Group__0 : rule__Provider__Group__0__Impl rule__Provider__Group__1 ;
    public final void rule__Provider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3027:1: ( rule__Provider__Group__0__Impl rule__Provider__Group__1 )
            // InternalPagos.g:3028:2: rule__Provider__Group__0__Impl rule__Provider__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Provider__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__0"


    // $ANTLR start "rule__Provider__Group__0__Impl"
    // InternalPagos.g:3035:1: rule__Provider__Group__0__Impl : ( () ) ;
    public final void rule__Provider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3039:1: ( ( () ) )
            // InternalPagos.g:3040:1: ( () )
            {
            // InternalPagos.g:3040:1: ( () )
            // InternalPagos.g:3041:2: ()
            {
             before(grammarAccess.getProviderAccess().getProviderAction_0()); 
            // InternalPagos.g:3042:2: ()
            // InternalPagos.g:3042:3: 
            {
            }

             after(grammarAccess.getProviderAccess().getProviderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__0__Impl"


    // $ANTLR start "rule__Provider__Group__1"
    // InternalPagos.g:3050:1: rule__Provider__Group__1 : rule__Provider__Group__1__Impl rule__Provider__Group__2 ;
    public final void rule__Provider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3054:1: ( rule__Provider__Group__1__Impl rule__Provider__Group__2 )
            // InternalPagos.g:3055:2: rule__Provider__Group__1__Impl rule__Provider__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Provider__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__1"


    // $ANTLR start "rule__Provider__Group__1__Impl"
    // InternalPagos.g:3062:1: rule__Provider__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Provider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3066:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:3067:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:3067:1: ( RULE_LBRACE )
            // InternalPagos.g:3068:2: RULE_LBRACE
            {
             before(grammarAccess.getProviderAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getLBRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__1__Impl"


    // $ANTLR start "rule__Provider__Group__2"
    // InternalPagos.g:3077:1: rule__Provider__Group__2 : rule__Provider__Group__2__Impl rule__Provider__Group__3 ;
    public final void rule__Provider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3081:1: ( rule__Provider__Group__2__Impl rule__Provider__Group__3 )
            // InternalPagos.g:3082:2: rule__Provider__Group__2__Impl rule__Provider__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Provider__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__2"


    // $ANTLR start "rule__Provider__Group__2__Impl"
    // InternalPagos.g:3089:1: rule__Provider__Group__2__Impl : ( 'name' ) ;
    public final void rule__Provider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3093:1: ( ( 'name' ) )
            // InternalPagos.g:3094:1: ( 'name' )
            {
            // InternalPagos.g:3094:1: ( 'name' )
            // InternalPagos.g:3095:2: 'name'
            {
             before(grammarAccess.getProviderAccess().getNameKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__2__Impl"


    // $ANTLR start "rule__Provider__Group__3"
    // InternalPagos.g:3104:1: rule__Provider__Group__3 : rule__Provider__Group__3__Impl rule__Provider__Group__4 ;
    public final void rule__Provider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3108:1: ( rule__Provider__Group__3__Impl rule__Provider__Group__4 )
            // InternalPagos.g:3109:2: rule__Provider__Group__3__Impl rule__Provider__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Provider__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__3"


    // $ANTLR start "rule__Provider__Group__3__Impl"
    // InternalPagos.g:3116:1: rule__Provider__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Provider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3120:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3121:1: ( RULE_COLON )
            {
            // InternalPagos.g:3121:1: ( RULE_COLON )
            // InternalPagos.g:3122:2: RULE_COLON
            {
             before(grammarAccess.getProviderAccess().getCOLONTerminalRuleCall_3()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getCOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__3__Impl"


    // $ANTLR start "rule__Provider__Group__4"
    // InternalPagos.g:3131:1: rule__Provider__Group__4 : rule__Provider__Group__4__Impl rule__Provider__Group__5 ;
    public final void rule__Provider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3135:1: ( rule__Provider__Group__4__Impl rule__Provider__Group__5 )
            // InternalPagos.g:3136:2: rule__Provider__Group__4__Impl rule__Provider__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Provider__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__4"


    // $ANTLR start "rule__Provider__Group__4__Impl"
    // InternalPagos.g:3143:1: rule__Provider__Group__4__Impl : ( ( rule__Provider__NameAssignment_4 ) ) ;
    public final void rule__Provider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3147:1: ( ( ( rule__Provider__NameAssignment_4 ) ) )
            // InternalPagos.g:3148:1: ( ( rule__Provider__NameAssignment_4 ) )
            {
            // InternalPagos.g:3148:1: ( ( rule__Provider__NameAssignment_4 ) )
            // InternalPagos.g:3149:2: ( rule__Provider__NameAssignment_4 )
            {
             before(grammarAccess.getProviderAccess().getNameAssignment_4()); 
            // InternalPagos.g:3150:2: ( rule__Provider__NameAssignment_4 )
            // InternalPagos.g:3150:3: rule__Provider__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Provider__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProviderAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__4__Impl"


    // $ANTLR start "rule__Provider__Group__5"
    // InternalPagos.g:3158:1: rule__Provider__Group__5 : rule__Provider__Group__5__Impl rule__Provider__Group__6 ;
    public final void rule__Provider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3162:1: ( rule__Provider__Group__5__Impl rule__Provider__Group__6 )
            // InternalPagos.g:3163:2: rule__Provider__Group__5__Impl rule__Provider__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Provider__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__5"


    // $ANTLR start "rule__Provider__Group__5__Impl"
    // InternalPagos.g:3170:1: rule__Provider__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Provider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3174:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3175:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3175:1: ( RULE_COMMA )
            // InternalPagos.g:3176:2: RULE_COMMA
            {
             before(grammarAccess.getProviderAccess().getCOMMATerminalRuleCall_5()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getCOMMATerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__5__Impl"


    // $ANTLR start "rule__Provider__Group__6"
    // InternalPagos.g:3185:1: rule__Provider__Group__6 : rule__Provider__Group__6__Impl rule__Provider__Group__7 ;
    public final void rule__Provider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3189:1: ( rule__Provider__Group__6__Impl rule__Provider__Group__7 )
            // InternalPagos.g:3190:2: rule__Provider__Group__6__Impl rule__Provider__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Provider__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__6"


    // $ANTLR start "rule__Provider__Group__6__Impl"
    // InternalPagos.g:3197:1: rule__Provider__Group__6__Impl : ( 'description' ) ;
    public final void rule__Provider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3201:1: ( ( 'description' ) )
            // InternalPagos.g:3202:1: ( 'description' )
            {
            // InternalPagos.g:3202:1: ( 'description' )
            // InternalPagos.g:3203:2: 'description'
            {
             before(grammarAccess.getProviderAccess().getDescriptionKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getDescriptionKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__6__Impl"


    // $ANTLR start "rule__Provider__Group__7"
    // InternalPagos.g:3212:1: rule__Provider__Group__7 : rule__Provider__Group__7__Impl rule__Provider__Group__8 ;
    public final void rule__Provider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3216:1: ( rule__Provider__Group__7__Impl rule__Provider__Group__8 )
            // InternalPagos.g:3217:2: rule__Provider__Group__7__Impl rule__Provider__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Provider__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__7"


    // $ANTLR start "rule__Provider__Group__7__Impl"
    // InternalPagos.g:3224:1: rule__Provider__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__Provider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3228:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3229:1: ( RULE_COLON )
            {
            // InternalPagos.g:3229:1: ( RULE_COLON )
            // InternalPagos.g:3230:2: RULE_COLON
            {
             before(grammarAccess.getProviderAccess().getCOLONTerminalRuleCall_7()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getCOLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__7__Impl"


    // $ANTLR start "rule__Provider__Group__8"
    // InternalPagos.g:3239:1: rule__Provider__Group__8 : rule__Provider__Group__8__Impl rule__Provider__Group__9 ;
    public final void rule__Provider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3243:1: ( rule__Provider__Group__8__Impl rule__Provider__Group__9 )
            // InternalPagos.g:3244:2: rule__Provider__Group__8__Impl rule__Provider__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Provider__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__8"


    // $ANTLR start "rule__Provider__Group__8__Impl"
    // InternalPagos.g:3251:1: rule__Provider__Group__8__Impl : ( ( rule__Provider__DescriptionAssignment_8 ) ) ;
    public final void rule__Provider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3255:1: ( ( ( rule__Provider__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:3256:1: ( ( rule__Provider__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:3256:1: ( ( rule__Provider__DescriptionAssignment_8 ) )
            // InternalPagos.g:3257:2: ( rule__Provider__DescriptionAssignment_8 )
            {
             before(grammarAccess.getProviderAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:3258:2: ( rule__Provider__DescriptionAssignment_8 )
            // InternalPagos.g:3258:3: rule__Provider__DescriptionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Provider__DescriptionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProviderAccess().getDescriptionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__8__Impl"


    // $ANTLR start "rule__Provider__Group__9"
    // InternalPagos.g:3266:1: rule__Provider__Group__9 : rule__Provider__Group__9__Impl rule__Provider__Group__10 ;
    public final void rule__Provider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3270:1: ( rule__Provider__Group__9__Impl rule__Provider__Group__10 )
            // InternalPagos.g:3271:2: rule__Provider__Group__9__Impl rule__Provider__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Provider__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__9"


    // $ANTLR start "rule__Provider__Group__9__Impl"
    // InternalPagos.g:3278:1: rule__Provider__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__Provider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3282:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3283:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3283:1: ( RULE_COMMA )
            // InternalPagos.g:3284:2: RULE_COMMA
            {
             before(grammarAccess.getProviderAccess().getCOMMATerminalRuleCall_9()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getCOMMATerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__9__Impl"


    // $ANTLR start "rule__Provider__Group__10"
    // InternalPagos.g:3293:1: rule__Provider__Group__10 : rule__Provider__Group__10__Impl rule__Provider__Group__11 ;
    public final void rule__Provider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3297:1: ( rule__Provider__Group__10__Impl rule__Provider__Group__11 )
            // InternalPagos.g:3298:2: rule__Provider__Group__10__Impl rule__Provider__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Provider__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__10"


    // $ANTLR start "rule__Provider__Group__10__Impl"
    // InternalPagos.g:3305:1: rule__Provider__Group__10__Impl : ( 'attributes' ) ;
    public final void rule__Provider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3309:1: ( ( 'attributes' ) )
            // InternalPagos.g:3310:1: ( 'attributes' )
            {
            // InternalPagos.g:3310:1: ( 'attributes' )
            // InternalPagos.g:3311:2: 'attributes'
            {
             before(grammarAccess.getProviderAccess().getAttributesKeyword_10()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getAttributesKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__10__Impl"


    // $ANTLR start "rule__Provider__Group__11"
    // InternalPagos.g:3320:1: rule__Provider__Group__11 : rule__Provider__Group__11__Impl rule__Provider__Group__12 ;
    public final void rule__Provider__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3324:1: ( rule__Provider__Group__11__Impl rule__Provider__Group__12 )
            // InternalPagos.g:3325:2: rule__Provider__Group__11__Impl rule__Provider__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__Provider__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__11"


    // $ANTLR start "rule__Provider__Group__11__Impl"
    // InternalPagos.g:3332:1: rule__Provider__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__Provider__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3336:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3337:1: ( RULE_COLON )
            {
            // InternalPagos.g:3337:1: ( RULE_COLON )
            // InternalPagos.g:3338:2: RULE_COLON
            {
             before(grammarAccess.getProviderAccess().getCOLONTerminalRuleCall_11()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getCOLONTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__11__Impl"


    // $ANTLR start "rule__Provider__Group__12"
    // InternalPagos.g:3347:1: rule__Provider__Group__12 : rule__Provider__Group__12__Impl rule__Provider__Group__13 ;
    public final void rule__Provider__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3351:1: ( rule__Provider__Group__12__Impl rule__Provider__Group__13 )
            // InternalPagos.g:3352:2: rule__Provider__Group__12__Impl rule__Provider__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__Provider__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__12"


    // $ANTLR start "rule__Provider__Group__12__Impl"
    // InternalPagos.g:3359:1: rule__Provider__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Provider__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3363:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:3364:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:3364:1: ( RULE_LBRACKET )
            // InternalPagos.g:3365:2: RULE_LBRACKET
            {
             before(grammarAccess.getProviderAccess().getLBRACKETTerminalRuleCall_12()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getLBRACKETTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__12__Impl"


    // $ANTLR start "rule__Provider__Group__13"
    // InternalPagos.g:3374:1: rule__Provider__Group__13 : rule__Provider__Group__13__Impl rule__Provider__Group__14 ;
    public final void rule__Provider__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3378:1: ( rule__Provider__Group__13__Impl rule__Provider__Group__14 )
            // InternalPagos.g:3379:2: rule__Provider__Group__13__Impl rule__Provider__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__Provider__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__13"


    // $ANTLR start "rule__Provider__Group__13__Impl"
    // InternalPagos.g:3386:1: rule__Provider__Group__13__Impl : ( ( rule__Provider__AttListsAssignment_13 ) ) ;
    public final void rule__Provider__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3390:1: ( ( ( rule__Provider__AttListsAssignment_13 ) ) )
            // InternalPagos.g:3391:1: ( ( rule__Provider__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:3391:1: ( ( rule__Provider__AttListsAssignment_13 ) )
            // InternalPagos.g:3392:2: ( rule__Provider__AttListsAssignment_13 )
            {
             before(grammarAccess.getProviderAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:3393:2: ( rule__Provider__AttListsAssignment_13 )
            // InternalPagos.g:3393:3: rule__Provider__AttListsAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Provider__AttListsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getProviderAccess().getAttListsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__13__Impl"


    // $ANTLR start "rule__Provider__Group__14"
    // InternalPagos.g:3401:1: rule__Provider__Group__14 : rule__Provider__Group__14__Impl rule__Provider__Group__15 ;
    public final void rule__Provider__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3405:1: ( rule__Provider__Group__14__Impl rule__Provider__Group__15 )
            // InternalPagos.g:3406:2: rule__Provider__Group__14__Impl rule__Provider__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__Provider__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__14"


    // $ANTLR start "rule__Provider__Group__14__Impl"
    // InternalPagos.g:3413:1: rule__Provider__Group__14__Impl : ( ( rule__Provider__Group_14__0 )* ) ;
    public final void rule__Provider__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3417:1: ( ( ( rule__Provider__Group_14__0 )* ) )
            // InternalPagos.g:3418:1: ( ( rule__Provider__Group_14__0 )* )
            {
            // InternalPagos.g:3418:1: ( ( rule__Provider__Group_14__0 )* )
            // InternalPagos.g:3419:2: ( rule__Provider__Group_14__0 )*
            {
             before(grammarAccess.getProviderAccess().getGroup_14()); 
            // InternalPagos.g:3420:2: ( rule__Provider__Group_14__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPagos.g:3420:3: rule__Provider__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Provider__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getProviderAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__14__Impl"


    // $ANTLR start "rule__Provider__Group__15"
    // InternalPagos.g:3428:1: rule__Provider__Group__15 : rule__Provider__Group__15__Impl rule__Provider__Group__16 ;
    public final void rule__Provider__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3432:1: ( rule__Provider__Group__15__Impl rule__Provider__Group__16 )
            // InternalPagos.g:3433:2: rule__Provider__Group__15__Impl rule__Provider__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__Provider__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__15"


    // $ANTLR start "rule__Provider__Group__15__Impl"
    // InternalPagos.g:3440:1: rule__Provider__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Provider__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3444:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:3445:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:3445:1: ( RULE_RBRACKET )
            // InternalPagos.g:3446:2: RULE_RBRACKET
            {
             before(grammarAccess.getProviderAccess().getRBRACKETTerminalRuleCall_15()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getRBRACKETTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__15__Impl"


    // $ANTLR start "rule__Provider__Group__16"
    // InternalPagos.g:3455:1: rule__Provider__Group__16 : rule__Provider__Group__16__Impl ;
    public final void rule__Provider__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3459:1: ( rule__Provider__Group__16__Impl )
            // InternalPagos.g:3460:2: rule__Provider__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Provider__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__16"


    // $ANTLR start "rule__Provider__Group__16__Impl"
    // InternalPagos.g:3466:1: rule__Provider__Group__16__Impl : ( RULE_RBRACE ) ;
    public final void rule__Provider__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3470:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:3471:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:3471:1: ( RULE_RBRACE )
            // InternalPagos.g:3472:2: RULE_RBRACE
            {
             before(grammarAccess.getProviderAccess().getRBRACETerminalRuleCall_16()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getRBRACETerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group__16__Impl"


    // $ANTLR start "rule__Provider__Group_14__0"
    // InternalPagos.g:3482:1: rule__Provider__Group_14__0 : rule__Provider__Group_14__0__Impl rule__Provider__Group_14__1 ;
    public final void rule__Provider__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3486:1: ( rule__Provider__Group_14__0__Impl rule__Provider__Group_14__1 )
            // InternalPagos.g:3487:2: rule__Provider__Group_14__0__Impl rule__Provider__Group_14__1
            {
            pushFollow(FOLLOW_8);
            rule__Provider__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provider__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group_14__0"


    // $ANTLR start "rule__Provider__Group_14__0__Impl"
    // InternalPagos.g:3494:1: rule__Provider__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Provider__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3498:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3499:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3499:1: ( RULE_COMMA )
            // InternalPagos.g:3500:2: RULE_COMMA
            {
             before(grammarAccess.getProviderAccess().getCOMMATerminalRuleCall_14_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getCOMMATerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group_14__0__Impl"


    // $ANTLR start "rule__Provider__Group_14__1"
    // InternalPagos.g:3509:1: rule__Provider__Group_14__1 : rule__Provider__Group_14__1__Impl ;
    public final void rule__Provider__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3513:1: ( rule__Provider__Group_14__1__Impl )
            // InternalPagos.g:3514:2: rule__Provider__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Provider__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group_14__1"


    // $ANTLR start "rule__Provider__Group_14__1__Impl"
    // InternalPagos.g:3520:1: rule__Provider__Group_14__1__Impl : ( ( rule__Provider__AttListsAssignment_14_1 ) ) ;
    public final void rule__Provider__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3524:1: ( ( ( rule__Provider__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:3525:1: ( ( rule__Provider__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:3525:1: ( ( rule__Provider__AttListsAssignment_14_1 ) )
            // InternalPagos.g:3526:2: ( rule__Provider__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getProviderAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:3527:2: ( rule__Provider__AttListsAssignment_14_1 )
            // InternalPagos.g:3527:3: rule__Provider__AttListsAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Provider__AttListsAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getProviderAccess().getAttListsAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__Group_14__1__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__0"
    // InternalPagos.g:3536:1: rule__InformationTemplate__Group__0 : rule__InformationTemplate__Group__0__Impl rule__InformationTemplate__Group__1 ;
    public final void rule__InformationTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3540:1: ( rule__InformationTemplate__Group__0__Impl rule__InformationTemplate__Group__1 )
            // InternalPagos.g:3541:2: rule__InformationTemplate__Group__0__Impl rule__InformationTemplate__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__InformationTemplate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__0"


    // $ANTLR start "rule__InformationTemplate__Group__0__Impl"
    // InternalPagos.g:3548:1: rule__InformationTemplate__Group__0__Impl : ( () ) ;
    public final void rule__InformationTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3552:1: ( ( () ) )
            // InternalPagos.g:3553:1: ( () )
            {
            // InternalPagos.g:3553:1: ( () )
            // InternalPagos.g:3554:2: ()
            {
             before(grammarAccess.getInformationTemplateAccess().getInformationTemplateAction_0()); 
            // InternalPagos.g:3555:2: ()
            // InternalPagos.g:3555:3: 
            {
            }

             after(grammarAccess.getInformationTemplateAccess().getInformationTemplateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__0__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__1"
    // InternalPagos.g:3563:1: rule__InformationTemplate__Group__1 : rule__InformationTemplate__Group__1__Impl rule__InformationTemplate__Group__2 ;
    public final void rule__InformationTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3567:1: ( rule__InformationTemplate__Group__1__Impl rule__InformationTemplate__Group__2 )
            // InternalPagos.g:3568:2: rule__InformationTemplate__Group__1__Impl rule__InformationTemplate__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__InformationTemplate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__1"


    // $ANTLR start "rule__InformationTemplate__Group__1__Impl"
    // InternalPagos.g:3575:1: rule__InformationTemplate__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__InformationTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3579:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:3580:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:3580:1: ( RULE_LBRACE )
            // InternalPagos.g:3581:2: RULE_LBRACE
            {
             before(grammarAccess.getInformationTemplateAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getLBRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__1__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__2"
    // InternalPagos.g:3590:1: rule__InformationTemplate__Group__2 : rule__InformationTemplate__Group__2__Impl rule__InformationTemplate__Group__3 ;
    public final void rule__InformationTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3594:1: ( rule__InformationTemplate__Group__2__Impl rule__InformationTemplate__Group__3 )
            // InternalPagos.g:3595:2: rule__InformationTemplate__Group__2__Impl rule__InformationTemplate__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__InformationTemplate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__2"


    // $ANTLR start "rule__InformationTemplate__Group__2__Impl"
    // InternalPagos.g:3602:1: rule__InformationTemplate__Group__2__Impl : ( 'name' ) ;
    public final void rule__InformationTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3606:1: ( ( 'name' ) )
            // InternalPagos.g:3607:1: ( 'name' )
            {
            // InternalPagos.g:3607:1: ( 'name' )
            // InternalPagos.g:3608:2: 'name'
            {
             before(grammarAccess.getInformationTemplateAccess().getNameKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__2__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__3"
    // InternalPagos.g:3617:1: rule__InformationTemplate__Group__3 : rule__InformationTemplate__Group__3__Impl rule__InformationTemplate__Group__4 ;
    public final void rule__InformationTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3621:1: ( rule__InformationTemplate__Group__3__Impl rule__InformationTemplate__Group__4 )
            // InternalPagos.g:3622:2: rule__InformationTemplate__Group__3__Impl rule__InformationTemplate__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__InformationTemplate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__3"


    // $ANTLR start "rule__InformationTemplate__Group__3__Impl"
    // InternalPagos.g:3629:1: rule__InformationTemplate__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3633:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3634:1: ( RULE_COLON )
            {
            // InternalPagos.g:3634:1: ( RULE_COLON )
            // InternalPagos.g:3635:2: RULE_COLON
            {
             before(grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_3()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__3__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__4"
    // InternalPagos.g:3644:1: rule__InformationTemplate__Group__4 : rule__InformationTemplate__Group__4__Impl rule__InformationTemplate__Group__5 ;
    public final void rule__InformationTemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3648:1: ( rule__InformationTemplate__Group__4__Impl rule__InformationTemplate__Group__5 )
            // InternalPagos.g:3649:2: rule__InformationTemplate__Group__4__Impl rule__InformationTemplate__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__InformationTemplate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__4"


    // $ANTLR start "rule__InformationTemplate__Group__4__Impl"
    // InternalPagos.g:3656:1: rule__InformationTemplate__Group__4__Impl : ( ( rule__InformationTemplate__NameAssignment_4 ) ) ;
    public final void rule__InformationTemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3660:1: ( ( ( rule__InformationTemplate__NameAssignment_4 ) ) )
            // InternalPagos.g:3661:1: ( ( rule__InformationTemplate__NameAssignment_4 ) )
            {
            // InternalPagos.g:3661:1: ( ( rule__InformationTemplate__NameAssignment_4 ) )
            // InternalPagos.g:3662:2: ( rule__InformationTemplate__NameAssignment_4 )
            {
             before(grammarAccess.getInformationTemplateAccess().getNameAssignment_4()); 
            // InternalPagos.g:3663:2: ( rule__InformationTemplate__NameAssignment_4 )
            // InternalPagos.g:3663:3: rule__InformationTemplate__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInformationTemplateAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__4__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__5"
    // InternalPagos.g:3671:1: rule__InformationTemplate__Group__5 : rule__InformationTemplate__Group__5__Impl rule__InformationTemplate__Group__6 ;
    public final void rule__InformationTemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3675:1: ( rule__InformationTemplate__Group__5__Impl rule__InformationTemplate__Group__6 )
            // InternalPagos.g:3676:2: rule__InformationTemplate__Group__5__Impl rule__InformationTemplate__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__InformationTemplate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__5"


    // $ANTLR start "rule__InformationTemplate__Group__5__Impl"
    // InternalPagos.g:3683:1: rule__InformationTemplate__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3687:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3688:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3688:1: ( RULE_COMMA )
            // InternalPagos.g:3689:2: RULE_COMMA
            {
             before(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_5()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__5__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__6"
    // InternalPagos.g:3698:1: rule__InformationTemplate__Group__6 : rule__InformationTemplate__Group__6__Impl rule__InformationTemplate__Group__7 ;
    public final void rule__InformationTemplate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3702:1: ( rule__InformationTemplate__Group__6__Impl rule__InformationTemplate__Group__7 )
            // InternalPagos.g:3703:2: rule__InformationTemplate__Group__6__Impl rule__InformationTemplate__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__InformationTemplate__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__6"


    // $ANTLR start "rule__InformationTemplate__Group__6__Impl"
    // InternalPagos.g:3710:1: rule__InformationTemplate__Group__6__Impl : ( 'description' ) ;
    public final void rule__InformationTemplate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3714:1: ( ( 'description' ) )
            // InternalPagos.g:3715:1: ( 'description' )
            {
            // InternalPagos.g:3715:1: ( 'description' )
            // InternalPagos.g:3716:2: 'description'
            {
             before(grammarAccess.getInformationTemplateAccess().getDescriptionKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getDescriptionKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__6__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__7"
    // InternalPagos.g:3725:1: rule__InformationTemplate__Group__7 : rule__InformationTemplate__Group__7__Impl rule__InformationTemplate__Group__8 ;
    public final void rule__InformationTemplate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3729:1: ( rule__InformationTemplate__Group__7__Impl rule__InformationTemplate__Group__8 )
            // InternalPagos.g:3730:2: rule__InformationTemplate__Group__7__Impl rule__InformationTemplate__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__InformationTemplate__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__7"


    // $ANTLR start "rule__InformationTemplate__Group__7__Impl"
    // InternalPagos.g:3737:1: rule__InformationTemplate__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3741:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3742:1: ( RULE_COLON )
            {
            // InternalPagos.g:3742:1: ( RULE_COLON )
            // InternalPagos.g:3743:2: RULE_COLON
            {
             before(grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_7()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__7__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__8"
    // InternalPagos.g:3752:1: rule__InformationTemplate__Group__8 : rule__InformationTemplate__Group__8__Impl rule__InformationTemplate__Group__9 ;
    public final void rule__InformationTemplate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3756:1: ( rule__InformationTemplate__Group__8__Impl rule__InformationTemplate__Group__9 )
            // InternalPagos.g:3757:2: rule__InformationTemplate__Group__8__Impl rule__InformationTemplate__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__InformationTemplate__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__8"


    // $ANTLR start "rule__InformationTemplate__Group__8__Impl"
    // InternalPagos.g:3764:1: rule__InformationTemplate__Group__8__Impl : ( ( rule__InformationTemplate__DescriptionAssignment_8 ) ) ;
    public final void rule__InformationTemplate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3768:1: ( ( ( rule__InformationTemplate__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:3769:1: ( ( rule__InformationTemplate__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:3769:1: ( ( rule__InformationTemplate__DescriptionAssignment_8 ) )
            // InternalPagos.g:3770:2: ( rule__InformationTemplate__DescriptionAssignment_8 )
            {
             before(grammarAccess.getInformationTemplateAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:3771:2: ( rule__InformationTemplate__DescriptionAssignment_8 )
            // InternalPagos.g:3771:3: rule__InformationTemplate__DescriptionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__DescriptionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getInformationTemplateAccess().getDescriptionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__8__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__9"
    // InternalPagos.g:3779:1: rule__InformationTemplate__Group__9 : rule__InformationTemplate__Group__9__Impl rule__InformationTemplate__Group__10 ;
    public final void rule__InformationTemplate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3783:1: ( rule__InformationTemplate__Group__9__Impl rule__InformationTemplate__Group__10 )
            // InternalPagos.g:3784:2: rule__InformationTemplate__Group__9__Impl rule__InformationTemplate__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__InformationTemplate__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__9"


    // $ANTLR start "rule__InformationTemplate__Group__9__Impl"
    // InternalPagos.g:3791:1: rule__InformationTemplate__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3795:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3796:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3796:1: ( RULE_COMMA )
            // InternalPagos.g:3797:2: RULE_COMMA
            {
             before(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_9()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__9__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__10"
    // InternalPagos.g:3806:1: rule__InformationTemplate__Group__10 : rule__InformationTemplate__Group__10__Impl rule__InformationTemplate__Group__11 ;
    public final void rule__InformationTemplate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3810:1: ( rule__InformationTemplate__Group__10__Impl rule__InformationTemplate__Group__11 )
            // InternalPagos.g:3811:2: rule__InformationTemplate__Group__10__Impl rule__InformationTemplate__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__InformationTemplate__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__10"


    // $ANTLR start "rule__InformationTemplate__Group__10__Impl"
    // InternalPagos.g:3818:1: rule__InformationTemplate__Group__10__Impl : ( 'FormAttributes' ) ;
    public final void rule__InformationTemplate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3822:1: ( ( 'FormAttributes' ) )
            // InternalPagos.g:3823:1: ( 'FormAttributes' )
            {
            // InternalPagos.g:3823:1: ( 'FormAttributes' )
            // InternalPagos.g:3824:2: 'FormAttributes'
            {
             before(grammarAccess.getInformationTemplateAccess().getFormAttributesKeyword_10()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getFormAttributesKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__10__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__11"
    // InternalPagos.g:3833:1: rule__InformationTemplate__Group__11 : rule__InformationTemplate__Group__11__Impl rule__InformationTemplate__Group__12 ;
    public final void rule__InformationTemplate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3837:1: ( rule__InformationTemplate__Group__11__Impl rule__InformationTemplate__Group__12 )
            // InternalPagos.g:3838:2: rule__InformationTemplate__Group__11__Impl rule__InformationTemplate__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__InformationTemplate__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__11"


    // $ANTLR start "rule__InformationTemplate__Group__11__Impl"
    // InternalPagos.g:3845:1: rule__InformationTemplate__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3849:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3850:1: ( RULE_COLON )
            {
            // InternalPagos.g:3850:1: ( RULE_COLON )
            // InternalPagos.g:3851:2: RULE_COLON
            {
             before(grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_11()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__11__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__12"
    // InternalPagos.g:3860:1: rule__InformationTemplate__Group__12 : rule__InformationTemplate__Group__12__Impl rule__InformationTemplate__Group__13 ;
    public final void rule__InformationTemplate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3864:1: ( rule__InformationTemplate__Group__12__Impl rule__InformationTemplate__Group__13 )
            // InternalPagos.g:3865:2: rule__InformationTemplate__Group__12__Impl rule__InformationTemplate__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__InformationTemplate__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__12"


    // $ANTLR start "rule__InformationTemplate__Group__12__Impl"
    // InternalPagos.g:3872:1: rule__InformationTemplate__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__InformationTemplate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3876:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:3877:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:3877:1: ( RULE_LBRACKET )
            // InternalPagos.g:3878:2: RULE_LBRACKET
            {
             before(grammarAccess.getInformationTemplateAccess().getLBRACKETTerminalRuleCall_12()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getLBRACKETTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__12__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__13"
    // InternalPagos.g:3887:1: rule__InformationTemplate__Group__13 : rule__InformationTemplate__Group__13__Impl rule__InformationTemplate__Group__14 ;
    public final void rule__InformationTemplate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3891:1: ( rule__InformationTemplate__Group__13__Impl rule__InformationTemplate__Group__14 )
            // InternalPagos.g:3892:2: rule__InformationTemplate__Group__13__Impl rule__InformationTemplate__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__InformationTemplate__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__13"


    // $ANTLR start "rule__InformationTemplate__Group__13__Impl"
    // InternalPagos.g:3899:1: rule__InformationTemplate__Group__13__Impl : ( ( rule__InformationTemplate__AttListsAssignment_13 ) ) ;
    public final void rule__InformationTemplate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3903:1: ( ( ( rule__InformationTemplate__AttListsAssignment_13 ) ) )
            // InternalPagos.g:3904:1: ( ( rule__InformationTemplate__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:3904:1: ( ( rule__InformationTemplate__AttListsAssignment_13 ) )
            // InternalPagos.g:3905:2: ( rule__InformationTemplate__AttListsAssignment_13 )
            {
             before(grammarAccess.getInformationTemplateAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:3906:2: ( rule__InformationTemplate__AttListsAssignment_13 )
            // InternalPagos.g:3906:3: rule__InformationTemplate__AttListsAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__AttListsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getInformationTemplateAccess().getAttListsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__13__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__14"
    // InternalPagos.g:3914:1: rule__InformationTemplate__Group__14 : rule__InformationTemplate__Group__14__Impl rule__InformationTemplate__Group__15 ;
    public final void rule__InformationTemplate__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3918:1: ( rule__InformationTemplate__Group__14__Impl rule__InformationTemplate__Group__15 )
            // InternalPagos.g:3919:2: rule__InformationTemplate__Group__14__Impl rule__InformationTemplate__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__InformationTemplate__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__14"


    // $ANTLR start "rule__InformationTemplate__Group__14__Impl"
    // InternalPagos.g:3926:1: rule__InformationTemplate__Group__14__Impl : ( ( rule__InformationTemplate__Group_14__0 )* ) ;
    public final void rule__InformationTemplate__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3930:1: ( ( ( rule__InformationTemplate__Group_14__0 )* ) )
            // InternalPagos.g:3931:1: ( ( rule__InformationTemplate__Group_14__0 )* )
            {
            // InternalPagos.g:3931:1: ( ( rule__InformationTemplate__Group_14__0 )* )
            // InternalPagos.g:3932:2: ( rule__InformationTemplate__Group_14__0 )*
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_14()); 
            // InternalPagos.g:3933:2: ( rule__InformationTemplate__Group_14__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPagos.g:3933:3: rule__InformationTemplate__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InformationTemplate__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getInformationTemplateAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__14__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__15"
    // InternalPagos.g:3941:1: rule__InformationTemplate__Group__15 : rule__InformationTemplate__Group__15__Impl rule__InformationTemplate__Group__16 ;
    public final void rule__InformationTemplate__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3945:1: ( rule__InformationTemplate__Group__15__Impl rule__InformationTemplate__Group__16 )
            // InternalPagos.g:3946:2: rule__InformationTemplate__Group__15__Impl rule__InformationTemplate__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__InformationTemplate__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__15"


    // $ANTLR start "rule__InformationTemplate__Group__15__Impl"
    // InternalPagos.g:3953:1: rule__InformationTemplate__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__InformationTemplate__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3957:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:3958:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:3958:1: ( RULE_RBRACKET )
            // InternalPagos.g:3959:2: RULE_RBRACKET
            {
             before(grammarAccess.getInformationTemplateAccess().getRBRACKETTerminalRuleCall_15()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getRBRACKETTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__15__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__16"
    // InternalPagos.g:3968:1: rule__InformationTemplate__Group__16 : rule__InformationTemplate__Group__16__Impl rule__InformationTemplate__Group__17 ;
    public final void rule__InformationTemplate__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3972:1: ( rule__InformationTemplate__Group__16__Impl rule__InformationTemplate__Group__17 )
            // InternalPagos.g:3973:2: rule__InformationTemplate__Group__16__Impl rule__InformationTemplate__Group__17
            {
            pushFollow(FOLLOW_6);
            rule__InformationTemplate__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__16"


    // $ANTLR start "rule__InformationTemplate__Group__16__Impl"
    // InternalPagos.g:3980:1: rule__InformationTemplate__Group__16__Impl : ( RULE_RBRACE ) ;
    public final void rule__InformationTemplate__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3984:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:3985:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:3985:1: ( RULE_RBRACE )
            // InternalPagos.g:3986:2: RULE_RBRACE
            {
             before(grammarAccess.getInformationTemplateAccess().getRBRACETerminalRuleCall_16()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getRBRACETerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__16__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__17"
    // InternalPagos.g:3995:1: rule__InformationTemplate__Group__17 : rule__InformationTemplate__Group__17__Impl rule__InformationTemplate__Group__18 ;
    public final void rule__InformationTemplate__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3999:1: ( rule__InformationTemplate__Group__17__Impl rule__InformationTemplate__Group__18 )
            // InternalPagos.g:4000:2: rule__InformationTemplate__Group__17__Impl rule__InformationTemplate__Group__18
            {
            pushFollow(FOLLOW_6);
            rule__InformationTemplate__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__17"


    // $ANTLR start "rule__InformationTemplate__Group__17__Impl"
    // InternalPagos.g:4007:1: rule__InformationTemplate__Group__17__Impl : ( ( rule__InformationTemplate__Group_17__0 )? ) ;
    public final void rule__InformationTemplate__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4011:1: ( ( ( rule__InformationTemplate__Group_17__0 )? ) )
            // InternalPagos.g:4012:1: ( ( rule__InformationTemplate__Group_17__0 )? )
            {
            // InternalPagos.g:4012:1: ( ( rule__InformationTemplate__Group_17__0 )? )
            // InternalPagos.g:4013:2: ( rule__InformationTemplate__Group_17__0 )?
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_17()); 
            // InternalPagos.g:4014:2: ( rule__InformationTemplate__Group_17__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_COMMA) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==43) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalPagos.g:4014:3: rule__InformationTemplate__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InformationTemplate__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInformationTemplateAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__17__Impl"


    // $ANTLR start "rule__InformationTemplate__Group__18"
    // InternalPagos.g:4022:1: rule__InformationTemplate__Group__18 : rule__InformationTemplate__Group__18__Impl ;
    public final void rule__InformationTemplate__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4026:1: ( rule__InformationTemplate__Group__18__Impl )
            // InternalPagos.g:4027:2: rule__InformationTemplate__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__18"


    // $ANTLR start "rule__InformationTemplate__Group__18__Impl"
    // InternalPagos.g:4033:1: rule__InformationTemplate__Group__18__Impl : ( ( rule__InformationTemplate__Group_18__0 )? ) ;
    public final void rule__InformationTemplate__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4037:1: ( ( ( rule__InformationTemplate__Group_18__0 )? ) )
            // InternalPagos.g:4038:1: ( ( rule__InformationTemplate__Group_18__0 )? )
            {
            // InternalPagos.g:4038:1: ( ( rule__InformationTemplate__Group_18__0 )? )
            // InternalPagos.g:4039:2: ( rule__InformationTemplate__Group_18__0 )?
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_18()); 
            // InternalPagos.g:4040:2: ( rule__InformationTemplate__Group_18__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_COMMA) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==44) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalPagos.g:4040:3: rule__InformationTemplate__Group_18__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InformationTemplate__Group_18__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInformationTemplateAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group__18__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_14__0"
    // InternalPagos.g:4049:1: rule__InformationTemplate__Group_14__0 : rule__InformationTemplate__Group_14__0__Impl rule__InformationTemplate__Group_14__1 ;
    public final void rule__InformationTemplate__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4053:1: ( rule__InformationTemplate__Group_14__0__Impl rule__InformationTemplate__Group_14__1 )
            // InternalPagos.g:4054:2: rule__InformationTemplate__Group_14__0__Impl rule__InformationTemplate__Group_14__1
            {
            pushFollow(FOLLOW_8);
            rule__InformationTemplate__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_14__0"


    // $ANTLR start "rule__InformationTemplate__Group_14__0__Impl"
    // InternalPagos.g:4061:1: rule__InformationTemplate__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4065:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4066:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4066:1: ( RULE_COMMA )
            // InternalPagos.g:4067:2: RULE_COMMA
            {
             before(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_14_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_14__0__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_14__1"
    // InternalPagos.g:4076:1: rule__InformationTemplate__Group_14__1 : rule__InformationTemplate__Group_14__1__Impl ;
    public final void rule__InformationTemplate__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4080:1: ( rule__InformationTemplate__Group_14__1__Impl )
            // InternalPagos.g:4081:2: rule__InformationTemplate__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_14__1"


    // $ANTLR start "rule__InformationTemplate__Group_14__1__Impl"
    // InternalPagos.g:4087:1: rule__InformationTemplate__Group_14__1__Impl : ( ( rule__InformationTemplate__AttListsAssignment_14_1 ) ) ;
    public final void rule__InformationTemplate__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4091:1: ( ( ( rule__InformationTemplate__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:4092:1: ( ( rule__InformationTemplate__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:4092:1: ( ( rule__InformationTemplate__AttListsAssignment_14_1 ) )
            // InternalPagos.g:4093:2: ( rule__InformationTemplate__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getInformationTemplateAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:4094:2: ( rule__InformationTemplate__AttListsAssignment_14_1 )
            // InternalPagos.g:4094:3: rule__InformationTemplate__AttListsAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__AttListsAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getInformationTemplateAccess().getAttListsAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_14__1__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_17__0"
    // InternalPagos.g:4103:1: rule__InformationTemplate__Group_17__0 : rule__InformationTemplate__Group_17__0__Impl rule__InformationTemplate__Group_17__1 ;
    public final void rule__InformationTemplate__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4107:1: ( rule__InformationTemplate__Group_17__0__Impl rule__InformationTemplate__Group_17__1 )
            // InternalPagos.g:4108:2: rule__InformationTemplate__Group_17__0__Impl rule__InformationTemplate__Group_17__1
            {
            pushFollow(FOLLOW_20);
            rule__InformationTemplate__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__0"


    // $ANTLR start "rule__InformationTemplate__Group_17__0__Impl"
    // InternalPagos.g:4115:1: rule__InformationTemplate__Group_17__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4119:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4120:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4120:1: ( RULE_COMMA )
            // InternalPagos.g:4121:2: RULE_COMMA
            {
             before(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_17_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__0__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_17__1"
    // InternalPagos.g:4130:1: rule__InformationTemplate__Group_17__1 : rule__InformationTemplate__Group_17__1__Impl rule__InformationTemplate__Group_17__2 ;
    public final void rule__InformationTemplate__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4134:1: ( rule__InformationTemplate__Group_17__1__Impl rule__InformationTemplate__Group_17__2 )
            // InternalPagos.g:4135:2: rule__InformationTemplate__Group_17__1__Impl rule__InformationTemplate__Group_17__2
            {
            pushFollow(FOLLOW_5);
            rule__InformationTemplate__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__1"


    // $ANTLR start "rule__InformationTemplate__Group_17__1__Impl"
    // InternalPagos.g:4142:1: rule__InformationTemplate__Group_17__1__Impl : ( 'calculationtemplates' ) ;
    public final void rule__InformationTemplate__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4146:1: ( ( 'calculationtemplates' ) )
            // InternalPagos.g:4147:1: ( 'calculationtemplates' )
            {
            // InternalPagos.g:4147:1: ( 'calculationtemplates' )
            // InternalPagos.g:4148:2: 'calculationtemplates'
            {
             before(grammarAccess.getInformationTemplateAccess().getCalculationtemplatesKeyword_17_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getCalculationtemplatesKeyword_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__1__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_17__2"
    // InternalPagos.g:4157:1: rule__InformationTemplate__Group_17__2 : rule__InformationTemplate__Group_17__2__Impl rule__InformationTemplate__Group_17__3 ;
    public final void rule__InformationTemplate__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4161:1: ( rule__InformationTemplate__Group_17__2__Impl rule__InformationTemplate__Group_17__3 )
            // InternalPagos.g:4162:2: rule__InformationTemplate__Group_17__2__Impl rule__InformationTemplate__Group_17__3
            {
            pushFollow(FOLLOW_4);
            rule__InformationTemplate__Group_17__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_17__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__2"


    // $ANTLR start "rule__InformationTemplate__Group_17__2__Impl"
    // InternalPagos.g:4169:1: rule__InformationTemplate__Group_17__2__Impl : ( ( rule__InformationTemplate__TemplateCalcAssignment_17_2 ) ) ;
    public final void rule__InformationTemplate__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4173:1: ( ( ( rule__InformationTemplate__TemplateCalcAssignment_17_2 ) ) )
            // InternalPagos.g:4174:1: ( ( rule__InformationTemplate__TemplateCalcAssignment_17_2 ) )
            {
            // InternalPagos.g:4174:1: ( ( rule__InformationTemplate__TemplateCalcAssignment_17_2 ) )
            // InternalPagos.g:4175:2: ( rule__InformationTemplate__TemplateCalcAssignment_17_2 )
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplateCalcAssignment_17_2()); 
            // InternalPagos.g:4176:2: ( rule__InformationTemplate__TemplateCalcAssignment_17_2 )
            // InternalPagos.g:4176:3: rule__InformationTemplate__TemplateCalcAssignment_17_2
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__TemplateCalcAssignment_17_2();

            state._fsp--;


            }

             after(grammarAccess.getInformationTemplateAccess().getTemplateCalcAssignment_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__2__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_17__3"
    // InternalPagos.g:4184:1: rule__InformationTemplate__Group_17__3 : rule__InformationTemplate__Group_17__3__Impl rule__InformationTemplate__Group_17__4 ;
    public final void rule__InformationTemplate__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4188:1: ( rule__InformationTemplate__Group_17__3__Impl rule__InformationTemplate__Group_17__4 )
            // InternalPagos.g:4189:2: rule__InformationTemplate__Group_17__3__Impl rule__InformationTemplate__Group_17__4
            {
            pushFollow(FOLLOW_11);
            rule__InformationTemplate__Group_17__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_17__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__3"


    // $ANTLR start "rule__InformationTemplate__Group_17__3__Impl"
    // InternalPagos.g:4196:1: rule__InformationTemplate__Group_17__3__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4200:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4201:1: ( RULE_COLON )
            {
            // InternalPagos.g:4201:1: ( RULE_COLON )
            // InternalPagos.g:4202:2: RULE_COLON
            {
             before(grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_17_3()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_17_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__3__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_17__4"
    // InternalPagos.g:4211:1: rule__InformationTemplate__Group_17__4 : rule__InformationTemplate__Group_17__4__Impl rule__InformationTemplate__Group_17__5 ;
    public final void rule__InformationTemplate__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4215:1: ( rule__InformationTemplate__Group_17__4__Impl rule__InformationTemplate__Group_17__5 )
            // InternalPagos.g:4216:2: rule__InformationTemplate__Group_17__4__Impl rule__InformationTemplate__Group_17__5
            {
            pushFollow(FOLLOW_8);
            rule__InformationTemplate__Group_17__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_17__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__4"


    // $ANTLR start "rule__InformationTemplate__Group_17__4__Impl"
    // InternalPagos.g:4223:1: rule__InformationTemplate__Group_17__4__Impl : ( RULE_LBRACKET ) ;
    public final void rule__InformationTemplate__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4227:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:4228:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:4228:1: ( RULE_LBRACKET )
            // InternalPagos.g:4229:2: RULE_LBRACKET
            {
             before(grammarAccess.getInformationTemplateAccess().getLBRACKETTerminalRuleCall_17_4()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getLBRACKETTerminalRuleCall_17_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__4__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_17__5"
    // InternalPagos.g:4238:1: rule__InformationTemplate__Group_17__5 : rule__InformationTemplate__Group_17__5__Impl rule__InformationTemplate__Group_17__6 ;
    public final void rule__InformationTemplate__Group_17__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4242:1: ( rule__InformationTemplate__Group_17__5__Impl rule__InformationTemplate__Group_17__6 )
            // InternalPagos.g:4243:2: rule__InformationTemplate__Group_17__5__Impl rule__InformationTemplate__Group_17__6
            {
            pushFollow(FOLLOW_12);
            rule__InformationTemplate__Group_17__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_17__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__5"


    // $ANTLR start "rule__InformationTemplate__Group_17__5__Impl"
    // InternalPagos.g:4250:1: rule__InformationTemplate__Group_17__5__Impl : ( ( rule__InformationTemplate__TemplatesAssignment_17_5 ) ) ;
    public final void rule__InformationTemplate__Group_17__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4254:1: ( ( ( rule__InformationTemplate__TemplatesAssignment_17_5 ) ) )
            // InternalPagos.g:4255:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_5 ) )
            {
            // InternalPagos.g:4255:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_5 ) )
            // InternalPagos.g:4256:2: ( rule__InformationTemplate__TemplatesAssignment_17_5 )
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_5()); 
            // InternalPagos.g:4257:2: ( rule__InformationTemplate__TemplatesAssignment_17_5 )
            // InternalPagos.g:4257:3: rule__InformationTemplate__TemplatesAssignment_17_5
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__TemplatesAssignment_17_5();

            state._fsp--;


            }

             after(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__5__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_17__6"
    // InternalPagos.g:4265:1: rule__InformationTemplate__Group_17__6 : rule__InformationTemplate__Group_17__6__Impl rule__InformationTemplate__Group_17__7 ;
    public final void rule__InformationTemplate__Group_17__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4269:1: ( rule__InformationTemplate__Group_17__6__Impl rule__InformationTemplate__Group_17__7 )
            // InternalPagos.g:4270:2: rule__InformationTemplate__Group_17__6__Impl rule__InformationTemplate__Group_17__7
            {
            pushFollow(FOLLOW_12);
            rule__InformationTemplate__Group_17__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_17__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__6"


    // $ANTLR start "rule__InformationTemplate__Group_17__6__Impl"
    // InternalPagos.g:4277:1: rule__InformationTemplate__Group_17__6__Impl : ( ( rule__InformationTemplate__Group_17_6__0 )* ) ;
    public final void rule__InformationTemplate__Group_17__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4281:1: ( ( ( rule__InformationTemplate__Group_17_6__0 )* ) )
            // InternalPagos.g:4282:1: ( ( rule__InformationTemplate__Group_17_6__0 )* )
            {
            // InternalPagos.g:4282:1: ( ( rule__InformationTemplate__Group_17_6__0 )* )
            // InternalPagos.g:4283:2: ( rule__InformationTemplate__Group_17_6__0 )*
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_17_6()); 
            // InternalPagos.g:4284:2: ( rule__InformationTemplate__Group_17_6__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPagos.g:4284:3: rule__InformationTemplate__Group_17_6__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InformationTemplate__Group_17_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getInformationTemplateAccess().getGroup_17_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__6__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_17__7"
    // InternalPagos.g:4292:1: rule__InformationTemplate__Group_17__7 : rule__InformationTemplate__Group_17__7__Impl ;
    public final void rule__InformationTemplate__Group_17__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4296:1: ( rule__InformationTemplate__Group_17__7__Impl )
            // InternalPagos.g:4297:2: rule__InformationTemplate__Group_17__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_17__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__7"


    // $ANTLR start "rule__InformationTemplate__Group_17__7__Impl"
    // InternalPagos.g:4303:1: rule__InformationTemplate__Group_17__7__Impl : ( RULE_RBRACKET ) ;
    public final void rule__InformationTemplate__Group_17__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4307:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:4308:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:4308:1: ( RULE_RBRACKET )
            // InternalPagos.g:4309:2: RULE_RBRACKET
            {
             before(grammarAccess.getInformationTemplateAccess().getRBRACKETTerminalRuleCall_17_7()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getRBRACKETTerminalRuleCall_17_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17__7__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_17_6__0"
    // InternalPagos.g:4319:1: rule__InformationTemplate__Group_17_6__0 : rule__InformationTemplate__Group_17_6__0__Impl rule__InformationTemplate__Group_17_6__1 ;
    public final void rule__InformationTemplate__Group_17_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4323:1: ( rule__InformationTemplate__Group_17_6__0__Impl rule__InformationTemplate__Group_17_6__1 )
            // InternalPagos.g:4324:2: rule__InformationTemplate__Group_17_6__0__Impl rule__InformationTemplate__Group_17_6__1
            {
            pushFollow(FOLLOW_8);
            rule__InformationTemplate__Group_17_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_17_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17_6__0"


    // $ANTLR start "rule__InformationTemplate__Group_17_6__0__Impl"
    // InternalPagos.g:4331:1: rule__InformationTemplate__Group_17_6__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_17_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4335:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4336:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4336:1: ( RULE_COMMA )
            // InternalPagos.g:4337:2: RULE_COMMA
            {
             before(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_17_6_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_17_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17_6__0__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_17_6__1"
    // InternalPagos.g:4346:1: rule__InformationTemplate__Group_17_6__1 : rule__InformationTemplate__Group_17_6__1__Impl ;
    public final void rule__InformationTemplate__Group_17_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4350:1: ( rule__InformationTemplate__Group_17_6__1__Impl )
            // InternalPagos.g:4351:2: rule__InformationTemplate__Group_17_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_17_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17_6__1"


    // $ANTLR start "rule__InformationTemplate__Group_17_6__1__Impl"
    // InternalPagos.g:4357:1: rule__InformationTemplate__Group_17_6__1__Impl : ( ( rule__InformationTemplate__TemplatesAssignment_17_6_1 ) ) ;
    public final void rule__InformationTemplate__Group_17_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4361:1: ( ( ( rule__InformationTemplate__TemplatesAssignment_17_6_1 ) ) )
            // InternalPagos.g:4362:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_6_1 ) )
            {
            // InternalPagos.g:4362:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_6_1 ) )
            // InternalPagos.g:4363:2: ( rule__InformationTemplate__TemplatesAssignment_17_6_1 )
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_6_1()); 
            // InternalPagos.g:4364:2: ( rule__InformationTemplate__TemplatesAssignment_17_6_1 )
            // InternalPagos.g:4364:3: rule__InformationTemplate__TemplatesAssignment_17_6_1
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__TemplatesAssignment_17_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17_6__1__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_18__0"
    // InternalPagos.g:4373:1: rule__InformationTemplate__Group_18__0 : rule__InformationTemplate__Group_18__0__Impl rule__InformationTemplate__Group_18__1 ;
    public final void rule__InformationTemplate__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4377:1: ( rule__InformationTemplate__Group_18__0__Impl rule__InformationTemplate__Group_18__1 )
            // InternalPagos.g:4378:2: rule__InformationTemplate__Group_18__0__Impl rule__InformationTemplate__Group_18__1
            {
            pushFollow(FOLLOW_21);
            rule__InformationTemplate__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18__0"


    // $ANTLR start "rule__InformationTemplate__Group_18__0__Impl"
    // InternalPagos.g:4385:1: rule__InformationTemplate__Group_18__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4389:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4390:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4390:1: ( RULE_COMMA )
            // InternalPagos.g:4391:2: RULE_COMMA
            {
             before(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_18_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18__0__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_18__1"
    // InternalPagos.g:4400:1: rule__InformationTemplate__Group_18__1 : rule__InformationTemplate__Group_18__1__Impl rule__InformationTemplate__Group_18__2 ;
    public final void rule__InformationTemplate__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4404:1: ( rule__InformationTemplate__Group_18__1__Impl rule__InformationTemplate__Group_18__2 )
            // InternalPagos.g:4405:2: rule__InformationTemplate__Group_18__1__Impl rule__InformationTemplate__Group_18__2
            {
            pushFollow(FOLLOW_4);
            rule__InformationTemplate__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_18__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18__1"


    // $ANTLR start "rule__InformationTemplate__Group_18__1__Impl"
    // InternalPagos.g:4412:1: rule__InformationTemplate__Group_18__1__Impl : ( 'providers' ) ;
    public final void rule__InformationTemplate__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4416:1: ( ( 'providers' ) )
            // InternalPagos.g:4417:1: ( 'providers' )
            {
            // InternalPagos.g:4417:1: ( 'providers' )
            // InternalPagos.g:4418:2: 'providers'
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersKeyword_18_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getProvidersKeyword_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18__1__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_18__2"
    // InternalPagos.g:4427:1: rule__InformationTemplate__Group_18__2 : rule__InformationTemplate__Group_18__2__Impl rule__InformationTemplate__Group_18__3 ;
    public final void rule__InformationTemplate__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4431:1: ( rule__InformationTemplate__Group_18__2__Impl rule__InformationTemplate__Group_18__3 )
            // InternalPagos.g:4432:2: rule__InformationTemplate__Group_18__2__Impl rule__InformationTemplate__Group_18__3
            {
            pushFollow(FOLLOW_11);
            rule__InformationTemplate__Group_18__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_18__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18__2"


    // $ANTLR start "rule__InformationTemplate__Group_18__2__Impl"
    // InternalPagos.g:4439:1: rule__InformationTemplate__Group_18__2__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4443:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4444:1: ( RULE_COLON )
            {
            // InternalPagos.g:4444:1: ( RULE_COLON )
            // InternalPagos.g:4445:2: RULE_COLON
            {
             before(grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_18_2()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_18_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18__2__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_18__3"
    // InternalPagos.g:4454:1: rule__InformationTemplate__Group_18__3 : rule__InformationTemplate__Group_18__3__Impl rule__InformationTemplate__Group_18__4 ;
    public final void rule__InformationTemplate__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4458:1: ( rule__InformationTemplate__Group_18__3__Impl rule__InformationTemplate__Group_18__4 )
            // InternalPagos.g:4459:2: rule__InformationTemplate__Group_18__3__Impl rule__InformationTemplate__Group_18__4
            {
            pushFollow(FOLLOW_8);
            rule__InformationTemplate__Group_18__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_18__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18__3"


    // $ANTLR start "rule__InformationTemplate__Group_18__3__Impl"
    // InternalPagos.g:4466:1: rule__InformationTemplate__Group_18__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__InformationTemplate__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4470:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:4471:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:4471:1: ( RULE_LBRACKET )
            // InternalPagos.g:4472:2: RULE_LBRACKET
            {
             before(grammarAccess.getInformationTemplateAccess().getLBRACKETTerminalRuleCall_18_3()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getLBRACKETTerminalRuleCall_18_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18__3__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_18__4"
    // InternalPagos.g:4481:1: rule__InformationTemplate__Group_18__4 : rule__InformationTemplate__Group_18__4__Impl rule__InformationTemplate__Group_18__5 ;
    public final void rule__InformationTemplate__Group_18__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4485:1: ( rule__InformationTemplate__Group_18__4__Impl rule__InformationTemplate__Group_18__5 )
            // InternalPagos.g:4486:2: rule__InformationTemplate__Group_18__4__Impl rule__InformationTemplate__Group_18__5
            {
            pushFollow(FOLLOW_12);
            rule__InformationTemplate__Group_18__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_18__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18__4"


    // $ANTLR start "rule__InformationTemplate__Group_18__4__Impl"
    // InternalPagos.g:4493:1: rule__InformationTemplate__Group_18__4__Impl : ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) ) ;
    public final void rule__InformationTemplate__Group_18__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4497:1: ( ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) ) )
            // InternalPagos.g:4498:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) )
            {
            // InternalPagos.g:4498:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) )
            // InternalPagos.g:4499:2: ( rule__InformationTemplate__ProvidersAssignment_18_4 )
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersAssignment_18_4()); 
            // InternalPagos.g:4500:2: ( rule__InformationTemplate__ProvidersAssignment_18_4 )
            // InternalPagos.g:4500:3: rule__InformationTemplate__ProvidersAssignment_18_4
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__ProvidersAssignment_18_4();

            state._fsp--;


            }

             after(grammarAccess.getInformationTemplateAccess().getProvidersAssignment_18_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18__4__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_18__5"
    // InternalPagos.g:4508:1: rule__InformationTemplate__Group_18__5 : rule__InformationTemplate__Group_18__5__Impl rule__InformationTemplate__Group_18__6 ;
    public final void rule__InformationTemplate__Group_18__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4512:1: ( rule__InformationTemplate__Group_18__5__Impl rule__InformationTemplate__Group_18__6 )
            // InternalPagos.g:4513:2: rule__InformationTemplate__Group_18__5__Impl rule__InformationTemplate__Group_18__6
            {
            pushFollow(FOLLOW_12);
            rule__InformationTemplate__Group_18__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_18__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18__5"


    // $ANTLR start "rule__InformationTemplate__Group_18__5__Impl"
    // InternalPagos.g:4520:1: rule__InformationTemplate__Group_18__5__Impl : ( ( rule__InformationTemplate__Group_18_5__0 )* ) ;
    public final void rule__InformationTemplate__Group_18__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4524:1: ( ( ( rule__InformationTemplate__Group_18_5__0 )* ) )
            // InternalPagos.g:4525:1: ( ( rule__InformationTemplate__Group_18_5__0 )* )
            {
            // InternalPagos.g:4525:1: ( ( rule__InformationTemplate__Group_18_5__0 )* )
            // InternalPagos.g:4526:2: ( rule__InformationTemplate__Group_18_5__0 )*
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_18_5()); 
            // InternalPagos.g:4527:2: ( rule__InformationTemplate__Group_18_5__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPagos.g:4527:3: rule__InformationTemplate__Group_18_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InformationTemplate__Group_18_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getInformationTemplateAccess().getGroup_18_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18__5__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_18__6"
    // InternalPagos.g:4535:1: rule__InformationTemplate__Group_18__6 : rule__InformationTemplate__Group_18__6__Impl ;
    public final void rule__InformationTemplate__Group_18__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4539:1: ( rule__InformationTemplate__Group_18__6__Impl )
            // InternalPagos.g:4540:2: rule__InformationTemplate__Group_18__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_18__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18__6"


    // $ANTLR start "rule__InformationTemplate__Group_18__6__Impl"
    // InternalPagos.g:4546:1: rule__InformationTemplate__Group_18__6__Impl : ( RULE_RBRACKET ) ;
    public final void rule__InformationTemplate__Group_18__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4550:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:4551:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:4551:1: ( RULE_RBRACKET )
            // InternalPagos.g:4552:2: RULE_RBRACKET
            {
             before(grammarAccess.getInformationTemplateAccess().getRBRACKETTerminalRuleCall_18_6()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getRBRACKETTerminalRuleCall_18_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18__6__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_18_5__0"
    // InternalPagos.g:4562:1: rule__InformationTemplate__Group_18_5__0 : rule__InformationTemplate__Group_18_5__0__Impl rule__InformationTemplate__Group_18_5__1 ;
    public final void rule__InformationTemplate__Group_18_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4566:1: ( rule__InformationTemplate__Group_18_5__0__Impl rule__InformationTemplate__Group_18_5__1 )
            // InternalPagos.g:4567:2: rule__InformationTemplate__Group_18_5__0__Impl rule__InformationTemplate__Group_18_5__1
            {
            pushFollow(FOLLOW_8);
            rule__InformationTemplate__Group_18_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_18_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18_5__0"


    // $ANTLR start "rule__InformationTemplate__Group_18_5__0__Impl"
    // InternalPagos.g:4574:1: rule__InformationTemplate__Group_18_5__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_18_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4578:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4579:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4579:1: ( RULE_COMMA )
            // InternalPagos.g:4580:2: RULE_COMMA
            {
             before(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_18_5_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_18_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18_5__0__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_18_5__1"
    // InternalPagos.g:4589:1: rule__InformationTemplate__Group_18_5__1 : rule__InformationTemplate__Group_18_5__1__Impl ;
    public final void rule__InformationTemplate__Group_18_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4593:1: ( rule__InformationTemplate__Group_18_5__1__Impl )
            // InternalPagos.g:4594:2: rule__InformationTemplate__Group_18_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_18_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18_5__1"


    // $ANTLR start "rule__InformationTemplate__Group_18_5__1__Impl"
    // InternalPagos.g:4600:1: rule__InformationTemplate__Group_18_5__1__Impl : ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) ) ;
    public final void rule__InformationTemplate__Group_18_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4604:1: ( ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) ) )
            // InternalPagos.g:4605:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) )
            {
            // InternalPagos.g:4605:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) )
            // InternalPagos.g:4606:2: ( rule__InformationTemplate__ProvidersAssignment_18_5_1 )
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersAssignment_18_5_1()); 
            // InternalPagos.g:4607:2: ( rule__InformationTemplate__ProvidersAssignment_18_5_1 )
            // InternalPagos.g:4607:3: rule__InformationTemplate__ProvidersAssignment_18_5_1
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__ProvidersAssignment_18_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInformationTemplateAccess().getProvidersAssignment_18_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_18_5__1__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__0"
    // InternalPagos.g:4616:1: rule__CalculationTemplate__Group__0 : rule__CalculationTemplate__Group__0__Impl rule__CalculationTemplate__Group__1 ;
    public final void rule__CalculationTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4620:1: ( rule__CalculationTemplate__Group__0__Impl rule__CalculationTemplate__Group__1 )
            // InternalPagos.g:4621:2: rule__CalculationTemplate__Group__0__Impl rule__CalculationTemplate__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__CalculationTemplate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__0"


    // $ANTLR start "rule__CalculationTemplate__Group__0__Impl"
    // InternalPagos.g:4628:1: rule__CalculationTemplate__Group__0__Impl : ( () ) ;
    public final void rule__CalculationTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4632:1: ( ( () ) )
            // InternalPagos.g:4633:1: ( () )
            {
            // InternalPagos.g:4633:1: ( () )
            // InternalPagos.g:4634:2: ()
            {
             before(grammarAccess.getCalculationTemplateAccess().getCalculationTemplateAction_0()); 
            // InternalPagos.g:4635:2: ()
            // InternalPagos.g:4635:3: 
            {
            }

             after(grammarAccess.getCalculationTemplateAccess().getCalculationTemplateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__0__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__1"
    // InternalPagos.g:4643:1: rule__CalculationTemplate__Group__1 : rule__CalculationTemplate__Group__1__Impl rule__CalculationTemplate__Group__2 ;
    public final void rule__CalculationTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4647:1: ( rule__CalculationTemplate__Group__1__Impl rule__CalculationTemplate__Group__2 )
            // InternalPagos.g:4648:2: rule__CalculationTemplate__Group__1__Impl rule__CalculationTemplate__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__CalculationTemplate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__1"


    // $ANTLR start "rule__CalculationTemplate__Group__1__Impl"
    // InternalPagos.g:4655:1: rule__CalculationTemplate__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__CalculationTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4659:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:4660:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:4660:1: ( RULE_LBRACE )
            // InternalPagos.g:4661:2: RULE_LBRACE
            {
             before(grammarAccess.getCalculationTemplateAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getLBRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__1__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__2"
    // InternalPagos.g:4670:1: rule__CalculationTemplate__Group__2 : rule__CalculationTemplate__Group__2__Impl rule__CalculationTemplate__Group__3 ;
    public final void rule__CalculationTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4674:1: ( rule__CalculationTemplate__Group__2__Impl rule__CalculationTemplate__Group__3 )
            // InternalPagos.g:4675:2: rule__CalculationTemplate__Group__2__Impl rule__CalculationTemplate__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CalculationTemplate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__2"


    // $ANTLR start "rule__CalculationTemplate__Group__2__Impl"
    // InternalPagos.g:4682:1: rule__CalculationTemplate__Group__2__Impl : ( 'name' ) ;
    public final void rule__CalculationTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4686:1: ( ( 'name' ) )
            // InternalPagos.g:4687:1: ( 'name' )
            {
            // InternalPagos.g:4687:1: ( 'name' )
            // InternalPagos.g:4688:2: 'name'
            {
             before(grammarAccess.getCalculationTemplateAccess().getNameKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__2__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__3"
    // InternalPagos.g:4697:1: rule__CalculationTemplate__Group__3 : rule__CalculationTemplate__Group__3__Impl rule__CalculationTemplate__Group__4 ;
    public final void rule__CalculationTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4701:1: ( rule__CalculationTemplate__Group__3__Impl rule__CalculationTemplate__Group__4 )
            // InternalPagos.g:4702:2: rule__CalculationTemplate__Group__3__Impl rule__CalculationTemplate__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__CalculationTemplate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__3"


    // $ANTLR start "rule__CalculationTemplate__Group__3__Impl"
    // InternalPagos.g:4709:1: rule__CalculationTemplate__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4713:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4714:1: ( RULE_COLON )
            {
            // InternalPagos.g:4714:1: ( RULE_COLON )
            // InternalPagos.g:4715:2: RULE_COLON
            {
             before(grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_3()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__3__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__4"
    // InternalPagos.g:4724:1: rule__CalculationTemplate__Group__4 : rule__CalculationTemplate__Group__4__Impl rule__CalculationTemplate__Group__5 ;
    public final void rule__CalculationTemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4728:1: ( rule__CalculationTemplate__Group__4__Impl rule__CalculationTemplate__Group__5 )
            // InternalPagos.g:4729:2: rule__CalculationTemplate__Group__4__Impl rule__CalculationTemplate__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__CalculationTemplate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__4"


    // $ANTLR start "rule__CalculationTemplate__Group__4__Impl"
    // InternalPagos.g:4736:1: rule__CalculationTemplate__Group__4__Impl : ( ( rule__CalculationTemplate__NameAssignment_4 ) ) ;
    public final void rule__CalculationTemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4740:1: ( ( ( rule__CalculationTemplate__NameAssignment_4 ) ) )
            // InternalPagos.g:4741:1: ( ( rule__CalculationTemplate__NameAssignment_4 ) )
            {
            // InternalPagos.g:4741:1: ( ( rule__CalculationTemplate__NameAssignment_4 ) )
            // InternalPagos.g:4742:2: ( rule__CalculationTemplate__NameAssignment_4 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getNameAssignment_4()); 
            // InternalPagos.g:4743:2: ( rule__CalculationTemplate__NameAssignment_4 )
            // InternalPagos.g:4743:3: rule__CalculationTemplate__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCalculationTemplateAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__4__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__5"
    // InternalPagos.g:4751:1: rule__CalculationTemplate__Group__5 : rule__CalculationTemplate__Group__5__Impl rule__CalculationTemplate__Group__6 ;
    public final void rule__CalculationTemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4755:1: ( rule__CalculationTemplate__Group__5__Impl rule__CalculationTemplate__Group__6 )
            // InternalPagos.g:4756:2: rule__CalculationTemplate__Group__5__Impl rule__CalculationTemplate__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__CalculationTemplate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__5"


    // $ANTLR start "rule__CalculationTemplate__Group__5__Impl"
    // InternalPagos.g:4763:1: rule__CalculationTemplate__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4767:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4768:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4768:1: ( RULE_COMMA )
            // InternalPagos.g:4769:2: RULE_COMMA
            {
             before(grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_5()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__5__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__6"
    // InternalPagos.g:4778:1: rule__CalculationTemplate__Group__6 : rule__CalculationTemplate__Group__6__Impl rule__CalculationTemplate__Group__7 ;
    public final void rule__CalculationTemplate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4782:1: ( rule__CalculationTemplate__Group__6__Impl rule__CalculationTemplate__Group__7 )
            // InternalPagos.g:4783:2: rule__CalculationTemplate__Group__6__Impl rule__CalculationTemplate__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__CalculationTemplate__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__6"


    // $ANTLR start "rule__CalculationTemplate__Group__6__Impl"
    // InternalPagos.g:4790:1: rule__CalculationTemplate__Group__6__Impl : ( 'description' ) ;
    public final void rule__CalculationTemplate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4794:1: ( ( 'description' ) )
            // InternalPagos.g:4795:1: ( 'description' )
            {
            // InternalPagos.g:4795:1: ( 'description' )
            // InternalPagos.g:4796:2: 'description'
            {
             before(grammarAccess.getCalculationTemplateAccess().getDescriptionKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getDescriptionKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__6__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__7"
    // InternalPagos.g:4805:1: rule__CalculationTemplate__Group__7 : rule__CalculationTemplate__Group__7__Impl rule__CalculationTemplate__Group__8 ;
    public final void rule__CalculationTemplate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4809:1: ( rule__CalculationTemplate__Group__7__Impl rule__CalculationTemplate__Group__8 )
            // InternalPagos.g:4810:2: rule__CalculationTemplate__Group__7__Impl rule__CalculationTemplate__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__CalculationTemplate__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__7"


    // $ANTLR start "rule__CalculationTemplate__Group__7__Impl"
    // InternalPagos.g:4817:1: rule__CalculationTemplate__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4821:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4822:1: ( RULE_COLON )
            {
            // InternalPagos.g:4822:1: ( RULE_COLON )
            // InternalPagos.g:4823:2: RULE_COLON
            {
             before(grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_7()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__7__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__8"
    // InternalPagos.g:4832:1: rule__CalculationTemplate__Group__8 : rule__CalculationTemplate__Group__8__Impl rule__CalculationTemplate__Group__9 ;
    public final void rule__CalculationTemplate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4836:1: ( rule__CalculationTemplate__Group__8__Impl rule__CalculationTemplate__Group__9 )
            // InternalPagos.g:4837:2: rule__CalculationTemplate__Group__8__Impl rule__CalculationTemplate__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__CalculationTemplate__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__8"


    // $ANTLR start "rule__CalculationTemplate__Group__8__Impl"
    // InternalPagos.g:4844:1: rule__CalculationTemplate__Group__8__Impl : ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) ) ;
    public final void rule__CalculationTemplate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4848:1: ( ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:4849:1: ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:4849:1: ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) )
            // InternalPagos.g:4850:2: ( rule__CalculationTemplate__DescriptionAssignment_8 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:4851:2: ( rule__CalculationTemplate__DescriptionAssignment_8 )
            // InternalPagos.g:4851:3: rule__CalculationTemplate__DescriptionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__DescriptionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCalculationTemplateAccess().getDescriptionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__8__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__9"
    // InternalPagos.g:4859:1: rule__CalculationTemplate__Group__9 : rule__CalculationTemplate__Group__9__Impl rule__CalculationTemplate__Group__10 ;
    public final void rule__CalculationTemplate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4863:1: ( rule__CalculationTemplate__Group__9__Impl rule__CalculationTemplate__Group__10 )
            // InternalPagos.g:4864:2: rule__CalculationTemplate__Group__9__Impl rule__CalculationTemplate__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__CalculationTemplate__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__9"


    // $ANTLR start "rule__CalculationTemplate__Group__9__Impl"
    // InternalPagos.g:4871:1: rule__CalculationTemplate__Group__9__Impl : ( ( rule__CalculationTemplate__Group_9__0 )? ) ;
    public final void rule__CalculationTemplate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4875:1: ( ( ( rule__CalculationTemplate__Group_9__0 )? ) )
            // InternalPagos.g:4876:1: ( ( rule__CalculationTemplate__Group_9__0 )? )
            {
            // InternalPagos.g:4876:1: ( ( rule__CalculationTemplate__Group_9__0 )? )
            // InternalPagos.g:4877:2: ( rule__CalculationTemplate__Group_9__0 )?
            {
             before(grammarAccess.getCalculationTemplateAccess().getGroup_9()); 
            // InternalPagos.g:4878:2: ( rule__CalculationTemplate__Group_9__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_COMMA) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==46) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalPagos.g:4878:3: rule__CalculationTemplate__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CalculationTemplate__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalculationTemplateAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__9__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__10"
    // InternalPagos.g:4886:1: rule__CalculationTemplate__Group__10 : rule__CalculationTemplate__Group__10__Impl rule__CalculationTemplate__Group__11 ;
    public final void rule__CalculationTemplate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4890:1: ( rule__CalculationTemplate__Group__10__Impl rule__CalculationTemplate__Group__11 )
            // InternalPagos.g:4891:2: rule__CalculationTemplate__Group__10__Impl rule__CalculationTemplate__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__CalculationTemplate__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__10"


    // $ANTLR start "rule__CalculationTemplate__Group__10__Impl"
    // InternalPagos.g:4898:1: rule__CalculationTemplate__Group__10__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4902:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4903:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4903:1: ( RULE_COMMA )
            // InternalPagos.g:4904:2: RULE_COMMA
            {
             before(grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_10()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__10__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__11"
    // InternalPagos.g:4913:1: rule__CalculationTemplate__Group__11 : rule__CalculationTemplate__Group__11__Impl rule__CalculationTemplate__Group__12 ;
    public final void rule__CalculationTemplate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4917:1: ( rule__CalculationTemplate__Group__11__Impl rule__CalculationTemplate__Group__12 )
            // InternalPagos.g:4918:2: rule__CalculationTemplate__Group__11__Impl rule__CalculationTemplate__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__CalculationTemplate__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__11"


    // $ANTLR start "rule__CalculationTemplate__Group__11__Impl"
    // InternalPagos.g:4925:1: rule__CalculationTemplate__Group__11__Impl : ( 'calculationrules' ) ;
    public final void rule__CalculationTemplate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4929:1: ( ( 'calculationrules' ) )
            // InternalPagos.g:4930:1: ( 'calculationrules' )
            {
            // InternalPagos.g:4930:1: ( 'calculationrules' )
            // InternalPagos.g:4931:2: 'calculationrules'
            {
             before(grammarAccess.getCalculationTemplateAccess().getCalculationrulesKeyword_11()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCalculationrulesKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__11__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__12"
    // InternalPagos.g:4940:1: rule__CalculationTemplate__Group__12 : rule__CalculationTemplate__Group__12__Impl rule__CalculationTemplate__Group__13 ;
    public final void rule__CalculationTemplate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4944:1: ( rule__CalculationTemplate__Group__12__Impl rule__CalculationTemplate__Group__13 )
            // InternalPagos.g:4945:2: rule__CalculationTemplate__Group__12__Impl rule__CalculationTemplate__Group__13
            {
            pushFollow(FOLLOW_23);
            rule__CalculationTemplate__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__12"


    // $ANTLR start "rule__CalculationTemplate__Group__12__Impl"
    // InternalPagos.g:4952:1: rule__CalculationTemplate__Group__12__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4956:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4957:1: ( RULE_COLON )
            {
            // InternalPagos.g:4957:1: ( RULE_COLON )
            // InternalPagos.g:4958:2: RULE_COLON
            {
             before(grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_12()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__12__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__13"
    // InternalPagos.g:4967:1: rule__CalculationTemplate__Group__13 : rule__CalculationTemplate__Group__13__Impl rule__CalculationTemplate__Group__14 ;
    public final void rule__CalculationTemplate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4971:1: ( rule__CalculationTemplate__Group__13__Impl rule__CalculationTemplate__Group__14 )
            // InternalPagos.g:4972:2: rule__CalculationTemplate__Group__13__Impl rule__CalculationTemplate__Group__14
            {
            pushFollow(FOLLOW_9);
            rule__CalculationTemplate__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__13"


    // $ANTLR start "rule__CalculationTemplate__Group__13__Impl"
    // InternalPagos.g:4979:1: rule__CalculationTemplate__Group__13__Impl : ( ( rule__CalculationTemplate__FormulasAssignment_13 ) ) ;
    public final void rule__CalculationTemplate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4983:1: ( ( ( rule__CalculationTemplate__FormulasAssignment_13 ) ) )
            // InternalPagos.g:4984:1: ( ( rule__CalculationTemplate__FormulasAssignment_13 ) )
            {
            // InternalPagos.g:4984:1: ( ( rule__CalculationTemplate__FormulasAssignment_13 ) )
            // InternalPagos.g:4985:2: ( rule__CalculationTemplate__FormulasAssignment_13 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getFormulasAssignment_13()); 
            // InternalPagos.g:4986:2: ( rule__CalculationTemplate__FormulasAssignment_13 )
            // InternalPagos.g:4986:3: rule__CalculationTemplate__FormulasAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__FormulasAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getCalculationTemplateAccess().getFormulasAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__13__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__14"
    // InternalPagos.g:4994:1: rule__CalculationTemplate__Group__14 : rule__CalculationTemplate__Group__14__Impl ;
    public final void rule__CalculationTemplate__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4998:1: ( rule__CalculationTemplate__Group__14__Impl )
            // InternalPagos.g:4999:2: rule__CalculationTemplate__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__14"


    // $ANTLR start "rule__CalculationTemplate__Group__14__Impl"
    // InternalPagos.g:5005:1: rule__CalculationTemplate__Group__14__Impl : ( RULE_RBRACE ) ;
    public final void rule__CalculationTemplate__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5009:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:5010:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:5010:1: ( RULE_RBRACE )
            // InternalPagos.g:5011:2: RULE_RBRACE
            {
             before(grammarAccess.getCalculationTemplateAccess().getRBRACETerminalRuleCall_14()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getRBRACETerminalRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__14__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group_9__0"
    // InternalPagos.g:5021:1: rule__CalculationTemplate__Group_9__0 : rule__CalculationTemplate__Group_9__0__Impl rule__CalculationTemplate__Group_9__1 ;
    public final void rule__CalculationTemplate__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5025:1: ( rule__CalculationTemplate__Group_9__0__Impl rule__CalculationTemplate__Group_9__1 )
            // InternalPagos.g:5026:2: rule__CalculationTemplate__Group_9__0__Impl rule__CalculationTemplate__Group_9__1
            {
            pushFollow(FOLLOW_24);
            rule__CalculationTemplate__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9__0"


    // $ANTLR start "rule__CalculationTemplate__Group_9__0__Impl"
    // InternalPagos.g:5033:1: rule__CalculationTemplate__Group_9__0__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5037:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:5038:1: ( RULE_COMMA )
            {
            // InternalPagos.g:5038:1: ( RULE_COMMA )
            // InternalPagos.g:5039:2: RULE_COMMA
            {
             before(grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_9_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9__0__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group_9__1"
    // InternalPagos.g:5048:1: rule__CalculationTemplate__Group_9__1 : rule__CalculationTemplate__Group_9__1__Impl rule__CalculationTemplate__Group_9__2 ;
    public final void rule__CalculationTemplate__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5052:1: ( rule__CalculationTemplate__Group_9__1__Impl rule__CalculationTemplate__Group_9__2 )
            // InternalPagos.g:5053:2: rule__CalculationTemplate__Group_9__1__Impl rule__CalculationTemplate__Group_9__2
            {
            pushFollow(FOLLOW_4);
            rule__CalculationTemplate__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9__1"


    // $ANTLR start "rule__CalculationTemplate__Group_9__1__Impl"
    // InternalPagos.g:5060:1: rule__CalculationTemplate__Group_9__1__Impl : ( 'calculationattributes' ) ;
    public final void rule__CalculationTemplate__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5064:1: ( ( 'calculationattributes' ) )
            // InternalPagos.g:5065:1: ( 'calculationattributes' )
            {
            // InternalPagos.g:5065:1: ( 'calculationattributes' )
            // InternalPagos.g:5066:2: 'calculationattributes'
            {
             before(grammarAccess.getCalculationTemplateAccess().getCalculationattributesKeyword_9_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCalculationattributesKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9__1__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group_9__2"
    // InternalPagos.g:5075:1: rule__CalculationTemplate__Group_9__2 : rule__CalculationTemplate__Group_9__2__Impl rule__CalculationTemplate__Group_9__3 ;
    public final void rule__CalculationTemplate__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5079:1: ( rule__CalculationTemplate__Group_9__2__Impl rule__CalculationTemplate__Group_9__3 )
            // InternalPagos.g:5080:2: rule__CalculationTemplate__Group_9__2__Impl rule__CalculationTemplate__Group_9__3
            {
            pushFollow(FOLLOW_11);
            rule__CalculationTemplate__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9__2"


    // $ANTLR start "rule__CalculationTemplate__Group_9__2__Impl"
    // InternalPagos.g:5087:1: rule__CalculationTemplate__Group_9__2__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5091:1: ( ( RULE_COLON ) )
            // InternalPagos.g:5092:1: ( RULE_COLON )
            {
            // InternalPagos.g:5092:1: ( RULE_COLON )
            // InternalPagos.g:5093:2: RULE_COLON
            {
             before(grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_9_2()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9__2__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group_9__3"
    // InternalPagos.g:5102:1: rule__CalculationTemplate__Group_9__3 : rule__CalculationTemplate__Group_9__3__Impl rule__CalculationTemplate__Group_9__4 ;
    public final void rule__CalculationTemplate__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5106:1: ( rule__CalculationTemplate__Group_9__3__Impl rule__CalculationTemplate__Group_9__4 )
            // InternalPagos.g:5107:2: rule__CalculationTemplate__Group_9__3__Impl rule__CalculationTemplate__Group_9__4
            {
            pushFollow(FOLLOW_8);
            rule__CalculationTemplate__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9__3"


    // $ANTLR start "rule__CalculationTemplate__Group_9__3__Impl"
    // InternalPagos.g:5114:1: rule__CalculationTemplate__Group_9__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__CalculationTemplate__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5118:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:5119:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:5119:1: ( RULE_LBRACKET )
            // InternalPagos.g:5120:2: RULE_LBRACKET
            {
             before(grammarAccess.getCalculationTemplateAccess().getLBRACKETTerminalRuleCall_9_3()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getLBRACKETTerminalRuleCall_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9__3__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group_9__4"
    // InternalPagos.g:5129:1: rule__CalculationTemplate__Group_9__4 : rule__CalculationTemplate__Group_9__4__Impl rule__CalculationTemplate__Group_9__5 ;
    public final void rule__CalculationTemplate__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5133:1: ( rule__CalculationTemplate__Group_9__4__Impl rule__CalculationTemplate__Group_9__5 )
            // InternalPagos.g:5134:2: rule__CalculationTemplate__Group_9__4__Impl rule__CalculationTemplate__Group_9__5
            {
            pushFollow(FOLLOW_12);
            rule__CalculationTemplate__Group_9__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group_9__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9__4"


    // $ANTLR start "rule__CalculationTemplate__Group_9__4__Impl"
    // InternalPagos.g:5141:1: rule__CalculationTemplate__Group_9__4__Impl : ( ( rule__CalculationTemplate__AttListsAssignment_9_4 ) ) ;
    public final void rule__CalculationTemplate__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5145:1: ( ( ( rule__CalculationTemplate__AttListsAssignment_9_4 ) ) )
            // InternalPagos.g:5146:1: ( ( rule__CalculationTemplate__AttListsAssignment_9_4 ) )
            {
            // InternalPagos.g:5146:1: ( ( rule__CalculationTemplate__AttListsAssignment_9_4 ) )
            // InternalPagos.g:5147:2: ( rule__CalculationTemplate__AttListsAssignment_9_4 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_9_4()); 
            // InternalPagos.g:5148:2: ( rule__CalculationTemplate__AttListsAssignment_9_4 )
            // InternalPagos.g:5148:3: rule__CalculationTemplate__AttListsAssignment_9_4
            {
            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__AttListsAssignment_9_4();

            state._fsp--;


            }

             after(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9__4__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group_9__5"
    // InternalPagos.g:5156:1: rule__CalculationTemplate__Group_9__5 : rule__CalculationTemplate__Group_9__5__Impl rule__CalculationTemplate__Group_9__6 ;
    public final void rule__CalculationTemplate__Group_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5160:1: ( rule__CalculationTemplate__Group_9__5__Impl rule__CalculationTemplate__Group_9__6 )
            // InternalPagos.g:5161:2: rule__CalculationTemplate__Group_9__5__Impl rule__CalculationTemplate__Group_9__6
            {
            pushFollow(FOLLOW_12);
            rule__CalculationTemplate__Group_9__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group_9__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9__5"


    // $ANTLR start "rule__CalculationTemplate__Group_9__5__Impl"
    // InternalPagos.g:5168:1: rule__CalculationTemplate__Group_9__5__Impl : ( ( rule__CalculationTemplate__Group_9_5__0 )* ) ;
    public final void rule__CalculationTemplate__Group_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5172:1: ( ( ( rule__CalculationTemplate__Group_9_5__0 )* ) )
            // InternalPagos.g:5173:1: ( ( rule__CalculationTemplate__Group_9_5__0 )* )
            {
            // InternalPagos.g:5173:1: ( ( rule__CalculationTemplate__Group_9_5__0 )* )
            // InternalPagos.g:5174:2: ( rule__CalculationTemplate__Group_9_5__0 )*
            {
             before(grammarAccess.getCalculationTemplateAccess().getGroup_9_5()); 
            // InternalPagos.g:5175:2: ( rule__CalculationTemplate__Group_9_5__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_COMMA) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPagos.g:5175:3: rule__CalculationTemplate__Group_9_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CalculationTemplate__Group_9_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getCalculationTemplateAccess().getGroup_9_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9__5__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group_9__6"
    // InternalPagos.g:5183:1: rule__CalculationTemplate__Group_9__6 : rule__CalculationTemplate__Group_9__6__Impl ;
    public final void rule__CalculationTemplate__Group_9__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5187:1: ( rule__CalculationTemplate__Group_9__6__Impl )
            // InternalPagos.g:5188:2: rule__CalculationTemplate__Group_9__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group_9__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9__6"


    // $ANTLR start "rule__CalculationTemplate__Group_9__6__Impl"
    // InternalPagos.g:5194:1: rule__CalculationTemplate__Group_9__6__Impl : ( RULE_RBRACKET ) ;
    public final void rule__CalculationTemplate__Group_9__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5198:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:5199:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:5199:1: ( RULE_RBRACKET )
            // InternalPagos.g:5200:2: RULE_RBRACKET
            {
             before(grammarAccess.getCalculationTemplateAccess().getRBRACKETTerminalRuleCall_9_6()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getRBRACKETTerminalRuleCall_9_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9__6__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group_9_5__0"
    // InternalPagos.g:5210:1: rule__CalculationTemplate__Group_9_5__0 : rule__CalculationTemplate__Group_9_5__0__Impl rule__CalculationTemplate__Group_9_5__1 ;
    public final void rule__CalculationTemplate__Group_9_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5214:1: ( rule__CalculationTemplate__Group_9_5__0__Impl rule__CalculationTemplate__Group_9_5__1 )
            // InternalPagos.g:5215:2: rule__CalculationTemplate__Group_9_5__0__Impl rule__CalculationTemplate__Group_9_5__1
            {
            pushFollow(FOLLOW_8);
            rule__CalculationTemplate__Group_9_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group_9_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9_5__0"


    // $ANTLR start "rule__CalculationTemplate__Group_9_5__0__Impl"
    // InternalPagos.g:5222:1: rule__CalculationTemplate__Group_9_5__0__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group_9_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5226:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:5227:1: ( RULE_COMMA )
            {
            // InternalPagos.g:5227:1: ( RULE_COMMA )
            // InternalPagos.g:5228:2: RULE_COMMA
            {
             before(grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_9_5_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_9_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9_5__0__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group_9_5__1"
    // InternalPagos.g:5237:1: rule__CalculationTemplate__Group_9_5__1 : rule__CalculationTemplate__Group_9_5__1__Impl ;
    public final void rule__CalculationTemplate__Group_9_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5241:1: ( rule__CalculationTemplate__Group_9_5__1__Impl )
            // InternalPagos.g:5242:2: rule__CalculationTemplate__Group_9_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group_9_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9_5__1"


    // $ANTLR start "rule__CalculationTemplate__Group_9_5__1__Impl"
    // InternalPagos.g:5248:1: rule__CalculationTemplate__Group_9_5__1__Impl : ( ( rule__CalculationTemplate__AttListsAssignment_9_5_1 ) ) ;
    public final void rule__CalculationTemplate__Group_9_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5252:1: ( ( ( rule__CalculationTemplate__AttListsAssignment_9_5_1 ) ) )
            // InternalPagos.g:5253:1: ( ( rule__CalculationTemplate__AttListsAssignment_9_5_1 ) )
            {
            // InternalPagos.g:5253:1: ( ( rule__CalculationTemplate__AttListsAssignment_9_5_1 ) )
            // InternalPagos.g:5254:2: ( rule__CalculationTemplate__AttListsAssignment_9_5_1 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_9_5_1()); 
            // InternalPagos.g:5255:2: ( rule__CalculationTemplate__AttListsAssignment_9_5_1 )
            // InternalPagos.g:5255:3: rule__CalculationTemplate__AttListsAssignment_9_5_1
            {
            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__AttListsAssignment_9_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_9_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_9_5__1__Impl"


    // $ANTLR start "rule__Formula__Group_0__0"
    // InternalPagos.g:5264:1: rule__Formula__Group_0__0 : rule__Formula__Group_0__0__Impl rule__Formula__Group_0__1 ;
    public final void rule__Formula__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5268:1: ( rule__Formula__Group_0__0__Impl rule__Formula__Group_0__1 )
            // InternalPagos.g:5269:2: rule__Formula__Group_0__0__Impl rule__Formula__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__Formula__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_0__0"


    // $ANTLR start "rule__Formula__Group_0__0__Impl"
    // InternalPagos.g:5276:1: rule__Formula__Group_0__0__Impl : ( () ) ;
    public final void rule__Formula__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5280:1: ( ( () ) )
            // InternalPagos.g:5281:1: ( () )
            {
            // InternalPagos.g:5281:1: ( () )
            // InternalPagos.g:5282:2: ()
            {
             before(grammarAccess.getFormulaAccess().getFormulaAction_0_0()); 
            // InternalPagos.g:5283:2: ()
            // InternalPagos.g:5283:3: 
            {
            }

             after(grammarAccess.getFormulaAccess().getFormulaAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_0__0__Impl"


    // $ANTLR start "rule__Formula__Group_0__1"
    // InternalPagos.g:5291:1: rule__Formula__Group_0__1 : rule__Formula__Group_0__1__Impl ;
    public final void rule__Formula__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5295:1: ( rule__Formula__Group_0__1__Impl )
            // InternalPagos.g:5296:2: rule__Formula__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_0__1"


    // $ANTLR start "rule__Formula__Group_0__1__Impl"
    // InternalPagos.g:5302:1: rule__Formula__Group_0__1__Impl : ( ( rule__Formula__FormulaBodyAssignment_0_1 )* ) ;
    public final void rule__Formula__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5306:1: ( ( ( rule__Formula__FormulaBodyAssignment_0_1 )* ) )
            // InternalPagos.g:5307:1: ( ( rule__Formula__FormulaBodyAssignment_0_1 )* )
            {
            // InternalPagos.g:5307:1: ( ( rule__Formula__FormulaBodyAssignment_0_1 )* )
            // InternalPagos.g:5308:2: ( rule__Formula__FormulaBodyAssignment_0_1 )*
            {
             before(grammarAccess.getFormulaAccess().getFormulaBodyAssignment_0_1()); 
            // InternalPagos.g:5309:2: ( rule__Formula__FormulaBodyAssignment_0_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_IF) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPagos.g:5309:3: rule__Formula__FormulaBodyAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Formula__FormulaBodyAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getFormulaAccess().getFormulaBodyAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_0__1__Impl"


    // $ANTLR start "rule__IfBlock__Group__0"
    // InternalPagos.g:5318:1: rule__IfBlock__Group__0 : rule__IfBlock__Group__0__Impl rule__IfBlock__Group__1 ;
    public final void rule__IfBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5322:1: ( rule__IfBlock__Group__0__Impl rule__IfBlock__Group__1 )
            // InternalPagos.g:5323:2: rule__IfBlock__Group__0__Impl rule__IfBlock__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__IfBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__0"


    // $ANTLR start "rule__IfBlock__Group__0__Impl"
    // InternalPagos.g:5330:1: rule__IfBlock__Group__0__Impl : ( () ) ;
    public final void rule__IfBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5334:1: ( ( () ) )
            // InternalPagos.g:5335:1: ( () )
            {
            // InternalPagos.g:5335:1: ( () )
            // InternalPagos.g:5336:2: ()
            {
             before(grammarAccess.getIfBlockAccess().getIfBlockAction_0()); 
            // InternalPagos.g:5337:2: ()
            // InternalPagos.g:5337:3: 
            {
            }

             after(grammarAccess.getIfBlockAccess().getIfBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__0__Impl"


    // $ANTLR start "rule__IfBlock__Group__1"
    // InternalPagos.g:5345:1: rule__IfBlock__Group__1 : rule__IfBlock__Group__1__Impl rule__IfBlock__Group__2 ;
    public final void rule__IfBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5349:1: ( rule__IfBlock__Group__1__Impl rule__IfBlock__Group__2 )
            // InternalPagos.g:5350:2: rule__IfBlock__Group__1__Impl rule__IfBlock__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__IfBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__1"


    // $ANTLR start "rule__IfBlock__Group__1__Impl"
    // InternalPagos.g:5357:1: rule__IfBlock__Group__1__Impl : ( ( rule__IfBlock__IfSentenceAssignment_1 ) ) ;
    public final void rule__IfBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5361:1: ( ( ( rule__IfBlock__IfSentenceAssignment_1 ) ) )
            // InternalPagos.g:5362:1: ( ( rule__IfBlock__IfSentenceAssignment_1 ) )
            {
            // InternalPagos.g:5362:1: ( ( rule__IfBlock__IfSentenceAssignment_1 ) )
            // InternalPagos.g:5363:2: ( rule__IfBlock__IfSentenceAssignment_1 )
            {
             before(grammarAccess.getIfBlockAccess().getIfSentenceAssignment_1()); 
            // InternalPagos.g:5364:2: ( rule__IfBlock__IfSentenceAssignment_1 )
            // InternalPagos.g:5364:3: rule__IfBlock__IfSentenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfBlock__IfSentenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfBlockAccess().getIfSentenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__1__Impl"


    // $ANTLR start "rule__IfBlock__Group__2"
    // InternalPagos.g:5372:1: rule__IfBlock__Group__2 : rule__IfBlock__Group__2__Impl ;
    public final void rule__IfBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5376:1: ( rule__IfBlock__Group__2__Impl )
            // InternalPagos.g:5377:2: rule__IfBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfBlock__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__2"


    // $ANTLR start "rule__IfBlock__Group__2__Impl"
    // InternalPagos.g:5383:1: rule__IfBlock__Group__2__Impl : ( ( rule__IfBlock__Group_2__0 )? ) ;
    public final void rule__IfBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5387:1: ( ( ( rule__IfBlock__Group_2__0 )? ) )
            // InternalPagos.g:5388:1: ( ( rule__IfBlock__Group_2__0 )? )
            {
            // InternalPagos.g:5388:1: ( ( rule__IfBlock__Group_2__0 )? )
            // InternalPagos.g:5389:2: ( rule__IfBlock__Group_2__0 )?
            {
             before(grammarAccess.getIfBlockAccess().getGroup_2()); 
            // InternalPagos.g:5390:2: ( rule__IfBlock__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ELSE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPagos.g:5390:3: rule__IfBlock__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfBlock__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfBlockAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__2__Impl"


    // $ANTLR start "rule__IfBlock__Group_2__0"
    // InternalPagos.g:5399:1: rule__IfBlock__Group_2__0 : rule__IfBlock__Group_2__0__Impl rule__IfBlock__Group_2__1 ;
    public final void rule__IfBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5403:1: ( rule__IfBlock__Group_2__0__Impl rule__IfBlock__Group_2__1 )
            // InternalPagos.g:5404:2: rule__IfBlock__Group_2__0__Impl rule__IfBlock__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__IfBlock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfBlock__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group_2__0"


    // $ANTLR start "rule__IfBlock__Group_2__0__Impl"
    // InternalPagos.g:5411:1: rule__IfBlock__Group_2__0__Impl : ( RULE_ELSE ) ;
    public final void rule__IfBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5415:1: ( ( RULE_ELSE ) )
            // InternalPagos.g:5416:1: ( RULE_ELSE )
            {
            // InternalPagos.g:5416:1: ( RULE_ELSE )
            // InternalPagos.g:5417:2: RULE_ELSE
            {
             before(grammarAccess.getIfBlockAccess().getELSETerminalRuleCall_2_0()); 
            match(input,RULE_ELSE,FOLLOW_2); 
             after(grammarAccess.getIfBlockAccess().getELSETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group_2__0__Impl"


    // $ANTLR start "rule__IfBlock__Group_2__1"
    // InternalPagos.g:5426:1: rule__IfBlock__Group_2__1 : rule__IfBlock__Group_2__1__Impl ;
    public final void rule__IfBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5430:1: ( rule__IfBlock__Group_2__1__Impl )
            // InternalPagos.g:5431:2: rule__IfBlock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfBlock__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group_2__1"


    // $ANTLR start "rule__IfBlock__Group_2__1__Impl"
    // InternalPagos.g:5437:1: rule__IfBlock__Group_2__1__Impl : ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) ) ;
    public final void rule__IfBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5441:1: ( ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) ) )
            // InternalPagos.g:5442:1: ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) )
            {
            // InternalPagos.g:5442:1: ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) )
            // InternalPagos.g:5443:2: ( rule__IfBlock__ElseSentenceAssignment_2_1 )
            {
             before(grammarAccess.getIfBlockAccess().getElseSentenceAssignment_2_1()); 
            // InternalPagos.g:5444:2: ( rule__IfBlock__ElseSentenceAssignment_2_1 )
            // InternalPagos.g:5444:3: rule__IfBlock__ElseSentenceAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__IfBlock__ElseSentenceAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIfBlockAccess().getElseSentenceAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group_2__1__Impl"


    // $ANTLR start "rule__IfCondition__Group__0"
    // InternalPagos.g:5453:1: rule__IfCondition__Group__0 : rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1 ;
    public final void rule__IfCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5457:1: ( rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1 )
            // InternalPagos.g:5458:2: rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__IfCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__0"


    // $ANTLR start "rule__IfCondition__Group__0__Impl"
    // InternalPagos.g:5465:1: rule__IfCondition__Group__0__Impl : ( () ) ;
    public final void rule__IfCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5469:1: ( ( () ) )
            // InternalPagos.g:5470:1: ( () )
            {
            // InternalPagos.g:5470:1: ( () )
            // InternalPagos.g:5471:2: ()
            {
             before(grammarAccess.getIfConditionAccess().getIfConditionAction_0()); 
            // InternalPagos.g:5472:2: ()
            // InternalPagos.g:5472:3: 
            {
            }

             after(grammarAccess.getIfConditionAccess().getIfConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__0__Impl"


    // $ANTLR start "rule__IfCondition__Group__1"
    // InternalPagos.g:5480:1: rule__IfCondition__Group__1 : rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2 ;
    public final void rule__IfCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5484:1: ( rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2 )
            // InternalPagos.g:5485:2: rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__IfCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__1"


    // $ANTLR start "rule__IfCondition__Group__1__Impl"
    // InternalPagos.g:5492:1: rule__IfCondition__Group__1__Impl : ( RULE_IF ) ;
    public final void rule__IfCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5496:1: ( ( RULE_IF ) )
            // InternalPagos.g:5497:1: ( RULE_IF )
            {
            // InternalPagos.g:5497:1: ( RULE_IF )
            // InternalPagos.g:5498:2: RULE_IF
            {
             before(grammarAccess.getIfConditionAccess().getIFTerminalRuleCall_1()); 
            match(input,RULE_IF,FOLLOW_2); 
             after(grammarAccess.getIfConditionAccess().getIFTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__1__Impl"


    // $ANTLR start "rule__IfCondition__Group__2"
    // InternalPagos.g:5507:1: rule__IfCondition__Group__2 : rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3 ;
    public final void rule__IfCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5511:1: ( rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3 )
            // InternalPagos.g:5512:2: rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__IfCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__2"


    // $ANTLR start "rule__IfCondition__Group__2__Impl"
    // InternalPagos.g:5519:1: rule__IfCondition__Group__2__Impl : ( RULE_LBRACKET ) ;
    public final void rule__IfCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5523:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:5524:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:5524:1: ( RULE_LBRACKET )
            // InternalPagos.g:5525:2: RULE_LBRACKET
            {
             before(grammarAccess.getIfConditionAccess().getLBRACKETTerminalRuleCall_2()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getIfConditionAccess().getLBRACKETTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__2__Impl"


    // $ANTLR start "rule__IfCondition__Group__3"
    // InternalPagos.g:5534:1: rule__IfCondition__Group__3 : rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4 ;
    public final void rule__IfCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5538:1: ( rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4 )
            // InternalPagos.g:5539:2: rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__IfCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__3"


    // $ANTLR start "rule__IfCondition__Group__3__Impl"
    // InternalPagos.g:5546:1: rule__IfCondition__Group__3__Impl : ( ( rule__IfCondition__LogExpAssignment_3 ) ) ;
    public final void rule__IfCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5550:1: ( ( ( rule__IfCondition__LogExpAssignment_3 ) ) )
            // InternalPagos.g:5551:1: ( ( rule__IfCondition__LogExpAssignment_3 ) )
            {
            // InternalPagos.g:5551:1: ( ( rule__IfCondition__LogExpAssignment_3 ) )
            // InternalPagos.g:5552:2: ( rule__IfCondition__LogExpAssignment_3 )
            {
             before(grammarAccess.getIfConditionAccess().getLogExpAssignment_3()); 
            // InternalPagos.g:5553:2: ( rule__IfCondition__LogExpAssignment_3 )
            // InternalPagos.g:5553:3: rule__IfCondition__LogExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfCondition__LogExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfConditionAccess().getLogExpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__3__Impl"


    // $ANTLR start "rule__IfCondition__Group__4"
    // InternalPagos.g:5561:1: rule__IfCondition__Group__4 : rule__IfCondition__Group__4__Impl rule__IfCondition__Group__5 ;
    public final void rule__IfCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5565:1: ( rule__IfCondition__Group__4__Impl rule__IfCondition__Group__5 )
            // InternalPagos.g:5566:2: rule__IfCondition__Group__4__Impl rule__IfCondition__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__IfCondition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__4"


    // $ANTLR start "rule__IfCondition__Group__4__Impl"
    // InternalPagos.g:5573:1: rule__IfCondition__Group__4__Impl : ( RULE_RBRACKET ) ;
    public final void rule__IfCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5577:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:5578:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:5578:1: ( RULE_RBRACKET )
            // InternalPagos.g:5579:2: RULE_RBRACKET
            {
             before(grammarAccess.getIfConditionAccess().getRBRACKETTerminalRuleCall_4()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getIfConditionAccess().getRBRACKETTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__4__Impl"


    // $ANTLR start "rule__IfCondition__Group__5"
    // InternalPagos.g:5588:1: rule__IfCondition__Group__5 : rule__IfCondition__Group__5__Impl rule__IfCondition__Group__6 ;
    public final void rule__IfCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5592:1: ( rule__IfCondition__Group__5__Impl rule__IfCondition__Group__6 )
            // InternalPagos.g:5593:2: rule__IfCondition__Group__5__Impl rule__IfCondition__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__IfCondition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__5"


    // $ANTLR start "rule__IfCondition__Group__5__Impl"
    // InternalPagos.g:5600:1: rule__IfCondition__Group__5__Impl : ( RULE_THEN ) ;
    public final void rule__IfCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5604:1: ( ( RULE_THEN ) )
            // InternalPagos.g:5605:1: ( RULE_THEN )
            {
            // InternalPagos.g:5605:1: ( RULE_THEN )
            // InternalPagos.g:5606:2: RULE_THEN
            {
             before(grammarAccess.getIfConditionAccess().getTHENTerminalRuleCall_5()); 
            match(input,RULE_THEN,FOLLOW_2); 
             after(grammarAccess.getIfConditionAccess().getTHENTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__5__Impl"


    // $ANTLR start "rule__IfCondition__Group__6"
    // InternalPagos.g:5615:1: rule__IfCondition__Group__6 : rule__IfCondition__Group__6__Impl rule__IfCondition__Group__7 ;
    public final void rule__IfCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5619:1: ( rule__IfCondition__Group__6__Impl rule__IfCondition__Group__7 )
            // InternalPagos.g:5620:2: rule__IfCondition__Group__6__Impl rule__IfCondition__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__IfCondition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__6"


    // $ANTLR start "rule__IfCondition__Group__6__Impl"
    // InternalPagos.g:5627:1: rule__IfCondition__Group__6__Impl : ( RULE_LBRACE ) ;
    public final void rule__IfCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5631:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:5632:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:5632:1: ( RULE_LBRACE )
            // InternalPagos.g:5633:2: RULE_LBRACE
            {
             before(grammarAccess.getIfConditionAccess().getLBRACETerminalRuleCall_6()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getIfConditionAccess().getLBRACETerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__6__Impl"


    // $ANTLR start "rule__IfCondition__Group__7"
    // InternalPagos.g:5642:1: rule__IfCondition__Group__7 : rule__IfCondition__Group__7__Impl rule__IfCondition__Group__8 ;
    public final void rule__IfCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5646:1: ( rule__IfCondition__Group__7__Impl rule__IfCondition__Group__8 )
            // InternalPagos.g:5647:2: rule__IfCondition__Group__7__Impl rule__IfCondition__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__IfCondition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__7"


    // $ANTLR start "rule__IfCondition__Group__7__Impl"
    // InternalPagos.g:5654:1: rule__IfCondition__Group__7__Impl : ( ( rule__IfCondition__FormulaReturnAssignment_7 ) ) ;
    public final void rule__IfCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5658:1: ( ( ( rule__IfCondition__FormulaReturnAssignment_7 ) ) )
            // InternalPagos.g:5659:1: ( ( rule__IfCondition__FormulaReturnAssignment_7 ) )
            {
            // InternalPagos.g:5659:1: ( ( rule__IfCondition__FormulaReturnAssignment_7 ) )
            // InternalPagos.g:5660:2: ( rule__IfCondition__FormulaReturnAssignment_7 )
            {
             before(grammarAccess.getIfConditionAccess().getFormulaReturnAssignment_7()); 
            // InternalPagos.g:5661:2: ( rule__IfCondition__FormulaReturnAssignment_7 )
            // InternalPagos.g:5661:3: rule__IfCondition__FormulaReturnAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__IfCondition__FormulaReturnAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getIfConditionAccess().getFormulaReturnAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__7__Impl"


    // $ANTLR start "rule__IfCondition__Group__8"
    // InternalPagos.g:5669:1: rule__IfCondition__Group__8 : rule__IfCondition__Group__8__Impl ;
    public final void rule__IfCondition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5673:1: ( rule__IfCondition__Group__8__Impl )
            // InternalPagos.g:5674:2: rule__IfCondition__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__8"


    // $ANTLR start "rule__IfCondition__Group__8__Impl"
    // InternalPagos.g:5680:1: rule__IfCondition__Group__8__Impl : ( RULE_RBRACE ) ;
    public final void rule__IfCondition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5684:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:5685:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:5685:1: ( RULE_RBRACE )
            // InternalPagos.g:5686:2: RULE_RBRACE
            {
             before(grammarAccess.getIfConditionAccess().getRBRACETerminalRuleCall_8()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getIfConditionAccess().getRBRACETerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__8__Impl"


    // $ANTLR start "rule__ElseSegment__Group__0"
    // InternalPagos.g:5696:1: rule__ElseSegment__Group__0 : rule__ElseSegment__Group__0__Impl rule__ElseSegment__Group__1 ;
    public final void rule__ElseSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5700:1: ( rule__ElseSegment__Group__0__Impl rule__ElseSegment__Group__1 )
            // InternalPagos.g:5701:2: rule__ElseSegment__Group__0__Impl rule__ElseSegment__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ElseSegment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseSegment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSegment__Group__0"


    // $ANTLR start "rule__ElseSegment__Group__0__Impl"
    // InternalPagos.g:5708:1: rule__ElseSegment__Group__0__Impl : ( () ) ;
    public final void rule__ElseSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5712:1: ( ( () ) )
            // InternalPagos.g:5713:1: ( () )
            {
            // InternalPagos.g:5713:1: ( () )
            // InternalPagos.g:5714:2: ()
            {
             before(grammarAccess.getElseSegmentAccess().getElseSegmentAction_0()); 
            // InternalPagos.g:5715:2: ()
            // InternalPagos.g:5715:3: 
            {
            }

             after(grammarAccess.getElseSegmentAccess().getElseSegmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSegment__Group__0__Impl"


    // $ANTLR start "rule__ElseSegment__Group__1"
    // InternalPagos.g:5723:1: rule__ElseSegment__Group__1 : rule__ElseSegment__Group__1__Impl rule__ElseSegment__Group__2 ;
    public final void rule__ElseSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5727:1: ( rule__ElseSegment__Group__1__Impl rule__ElseSegment__Group__2 )
            // InternalPagos.g:5728:2: rule__ElseSegment__Group__1__Impl rule__ElseSegment__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ElseSegment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseSegment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSegment__Group__1"


    // $ANTLR start "rule__ElseSegment__Group__1__Impl"
    // InternalPagos.g:5735:1: rule__ElseSegment__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__ElseSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5739:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:5740:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:5740:1: ( RULE_LBRACE )
            // InternalPagos.g:5741:2: RULE_LBRACE
            {
             before(grammarAccess.getElseSegmentAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getElseSegmentAccess().getLBRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSegment__Group__1__Impl"


    // $ANTLR start "rule__ElseSegment__Group__2"
    // InternalPagos.g:5750:1: rule__ElseSegment__Group__2 : rule__ElseSegment__Group__2__Impl rule__ElseSegment__Group__3 ;
    public final void rule__ElseSegment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5754:1: ( rule__ElseSegment__Group__2__Impl rule__ElseSegment__Group__3 )
            // InternalPagos.g:5755:2: rule__ElseSegment__Group__2__Impl rule__ElseSegment__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ElseSegment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseSegment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSegment__Group__2"


    // $ANTLR start "rule__ElseSegment__Group__2__Impl"
    // InternalPagos.g:5762:1: rule__ElseSegment__Group__2__Impl : ( ( rule__ElseSegment__IfSentenceAssignment_2 ) ) ;
    public final void rule__ElseSegment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5766:1: ( ( ( rule__ElseSegment__IfSentenceAssignment_2 ) ) )
            // InternalPagos.g:5767:1: ( ( rule__ElseSegment__IfSentenceAssignment_2 ) )
            {
            // InternalPagos.g:5767:1: ( ( rule__ElseSegment__IfSentenceAssignment_2 ) )
            // InternalPagos.g:5768:2: ( rule__ElseSegment__IfSentenceAssignment_2 )
            {
             before(grammarAccess.getElseSegmentAccess().getIfSentenceAssignment_2()); 
            // InternalPagos.g:5769:2: ( rule__ElseSegment__IfSentenceAssignment_2 )
            // InternalPagos.g:5769:3: rule__ElseSegment__IfSentenceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElseSegment__IfSentenceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElseSegmentAccess().getIfSentenceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSegment__Group__2__Impl"


    // $ANTLR start "rule__ElseSegment__Group__3"
    // InternalPagos.g:5777:1: rule__ElseSegment__Group__3 : rule__ElseSegment__Group__3__Impl ;
    public final void rule__ElseSegment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5781:1: ( rule__ElseSegment__Group__3__Impl )
            // InternalPagos.g:5782:2: rule__ElseSegment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseSegment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSegment__Group__3"


    // $ANTLR start "rule__ElseSegment__Group__3__Impl"
    // InternalPagos.g:5788:1: rule__ElseSegment__Group__3__Impl : ( RULE_RBRACE ) ;
    public final void rule__ElseSegment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5792:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:5793:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:5793:1: ( RULE_RBRACE )
            // InternalPagos.g:5794:2: RULE_RBRACE
            {
             before(grammarAccess.getElseSegmentAccess().getRBRACETerminalRuleCall_3()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getElseSegmentAccess().getRBRACETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSegment__Group__3__Impl"


    // $ANTLR start "rule__ReturnBlock__Group__0"
    // InternalPagos.g:5804:1: rule__ReturnBlock__Group__0 : rule__ReturnBlock__Group__0__Impl rule__ReturnBlock__Group__1 ;
    public final void rule__ReturnBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5808:1: ( rule__ReturnBlock__Group__0__Impl rule__ReturnBlock__Group__1 )
            // InternalPagos.g:5809:2: rule__ReturnBlock__Group__0__Impl rule__ReturnBlock__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ReturnBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnBlock__Group__0"


    // $ANTLR start "rule__ReturnBlock__Group__0__Impl"
    // InternalPagos.g:5816:1: rule__ReturnBlock__Group__0__Impl : ( () ) ;
    public final void rule__ReturnBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5820:1: ( ( () ) )
            // InternalPagos.g:5821:1: ( () )
            {
            // InternalPagos.g:5821:1: ( () )
            // InternalPagos.g:5822:2: ()
            {
             before(grammarAccess.getReturnBlockAccess().getReturnBlockAction_0()); 
            // InternalPagos.g:5823:2: ()
            // InternalPagos.g:5823:3: 
            {
            }

             after(grammarAccess.getReturnBlockAccess().getReturnBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnBlock__Group__0__Impl"


    // $ANTLR start "rule__ReturnBlock__Group__1"
    // InternalPagos.g:5831:1: rule__ReturnBlock__Group__1 : rule__ReturnBlock__Group__1__Impl rule__ReturnBlock__Group__2 ;
    public final void rule__ReturnBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5835:1: ( rule__ReturnBlock__Group__1__Impl rule__ReturnBlock__Group__2 )
            // InternalPagos.g:5836:2: rule__ReturnBlock__Group__1__Impl rule__ReturnBlock__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ReturnBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnBlock__Group__1"


    // $ANTLR start "rule__ReturnBlock__Group__1__Impl"
    // InternalPagos.g:5843:1: rule__ReturnBlock__Group__1__Impl : ( RULE_RETURN ) ;
    public final void rule__ReturnBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5847:1: ( ( RULE_RETURN ) )
            // InternalPagos.g:5848:1: ( RULE_RETURN )
            {
            // InternalPagos.g:5848:1: ( RULE_RETURN )
            // InternalPagos.g:5849:2: RULE_RETURN
            {
             before(grammarAccess.getReturnBlockAccess().getRETURNTerminalRuleCall_1()); 
            match(input,RULE_RETURN,FOLLOW_2); 
             after(grammarAccess.getReturnBlockAccess().getRETURNTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnBlock__Group__1__Impl"


    // $ANTLR start "rule__ReturnBlock__Group__2"
    // InternalPagos.g:5858:1: rule__ReturnBlock__Group__2 : rule__ReturnBlock__Group__2__Impl rule__ReturnBlock__Group__3 ;
    public final void rule__ReturnBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5862:1: ( rule__ReturnBlock__Group__2__Impl rule__ReturnBlock__Group__3 )
            // InternalPagos.g:5863:2: rule__ReturnBlock__Group__2__Impl rule__ReturnBlock__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__ReturnBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnBlock__Group__2"


    // $ANTLR start "rule__ReturnBlock__Group__2__Impl"
    // InternalPagos.g:5870:1: rule__ReturnBlock__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__ReturnBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5874:1: ( ( RULE_COLON ) )
            // InternalPagos.g:5875:1: ( RULE_COLON )
            {
            // InternalPagos.g:5875:1: ( RULE_COLON )
            // InternalPagos.g:5876:2: RULE_COLON
            {
             before(grammarAccess.getReturnBlockAccess().getCOLONTerminalRuleCall_2()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getReturnBlockAccess().getCOLONTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnBlock__Group__2__Impl"


    // $ANTLR start "rule__ReturnBlock__Group__3"
    // InternalPagos.g:5885:1: rule__ReturnBlock__Group__3 : rule__ReturnBlock__Group__3__Impl ;
    public final void rule__ReturnBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5889:1: ( rule__ReturnBlock__Group__3__Impl )
            // InternalPagos.g:5890:2: rule__ReturnBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnBlock__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnBlock__Group__3"


    // $ANTLR start "rule__ReturnBlock__Group__3__Impl"
    // InternalPagos.g:5896:1: rule__ReturnBlock__Group__3__Impl : ( ( rule__ReturnBlock__ExpressionAssignment_3 ) ) ;
    public final void rule__ReturnBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5900:1: ( ( ( rule__ReturnBlock__ExpressionAssignment_3 ) ) )
            // InternalPagos.g:5901:1: ( ( rule__ReturnBlock__ExpressionAssignment_3 ) )
            {
            // InternalPagos.g:5901:1: ( ( rule__ReturnBlock__ExpressionAssignment_3 ) )
            // InternalPagos.g:5902:2: ( rule__ReturnBlock__ExpressionAssignment_3 )
            {
             before(grammarAccess.getReturnBlockAccess().getExpressionAssignment_3()); 
            // InternalPagos.g:5903:2: ( rule__ReturnBlock__ExpressionAssignment_3 )
            // InternalPagos.g:5903:3: rule__ReturnBlock__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReturnBlock__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReturnBlockAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnBlock__Group__3__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__0"
    // InternalPagos.g:5912:1: rule__ExpresionLogica__Group__0 : rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 ;
    public final void rule__ExpresionLogica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5916:1: ( rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 )
            // InternalPagos.g:5917:2: rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__ExpresionLogica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__0"


    // $ANTLR start "rule__ExpresionLogica__Group__0__Impl"
    // InternalPagos.g:5924:1: rule__ExpresionLogica__Group__0__Impl : ( ( rule__ExpresionLogica__VariableAssignment_0 ) ) ;
    public final void rule__ExpresionLogica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5928:1: ( ( ( rule__ExpresionLogica__VariableAssignment_0 ) ) )
            // InternalPagos.g:5929:1: ( ( rule__ExpresionLogica__VariableAssignment_0 ) )
            {
            // InternalPagos.g:5929:1: ( ( rule__ExpresionLogica__VariableAssignment_0 ) )
            // InternalPagos.g:5930:2: ( rule__ExpresionLogica__VariableAssignment_0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getVariableAssignment_0()); 
            // InternalPagos.g:5931:2: ( rule__ExpresionLogica__VariableAssignment_0 )
            // InternalPagos.g:5931:3: rule__ExpresionLogica__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getVariableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__0__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__1"
    // InternalPagos.g:5939:1: rule__ExpresionLogica__Group__1 : rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 ;
    public final void rule__ExpresionLogica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5943:1: ( rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 )
            // InternalPagos.g:5944:2: rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__ExpresionLogica__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__1"


    // $ANTLR start "rule__ExpresionLogica__Group__1__Impl"
    // InternalPagos.g:5951:1: rule__ExpresionLogica__Group__1__Impl : ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) ) ;
    public final void rule__ExpresionLogica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5955:1: ( ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) ) )
            // InternalPagos.g:5956:1: ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) )
            {
            // InternalPagos.g:5956:1: ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) )
            // InternalPagos.g:5957:2: ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* )
            {
            // InternalPagos.g:5957:2: ( ( rule__ExpresionLogica__Group_1__0 ) )
            // InternalPagos.g:5958:3: ( rule__ExpresionLogica__Group_1__0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 
            // InternalPagos.g:5959:3: ( rule__ExpresionLogica__Group_1__0 )
            // InternalPagos.g:5959:4: rule__ExpresionLogica__Group_1__0
            {
            pushFollow(FOLLOW_34);
            rule__ExpresionLogica__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 

            }

            // InternalPagos.g:5962:2: ( ( rule__ExpresionLogica__Group_1__0 )* )
            // InternalPagos.g:5963:3: ( rule__ExpresionLogica__Group_1__0 )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 
            // InternalPagos.g:5964:3: ( rule__ExpresionLogica__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_OPERADORLOGICO) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPagos.g:5964:4: rule__ExpresionLogica__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__ExpresionLogica__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__1__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__2"
    // InternalPagos.g:5973:1: rule__ExpresionLogica__Group__2 : rule__ExpresionLogica__Group__2__Impl ;
    public final void rule__ExpresionLogica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5977:1: ( rule__ExpresionLogica__Group__2__Impl )
            // InternalPagos.g:5978:2: rule__ExpresionLogica__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__2"


    // $ANTLR start "rule__ExpresionLogica__Group__2__Impl"
    // InternalPagos.g:5984:1: rule__ExpresionLogica__Group__2__Impl : ( ( rule__ExpresionLogica__Group_2__0 )? ) ;
    public final void rule__ExpresionLogica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5988:1: ( ( ( rule__ExpresionLogica__Group_2__0 )? ) )
            // InternalPagos.g:5989:1: ( ( rule__ExpresionLogica__Group_2__0 )? )
            {
            // InternalPagos.g:5989:1: ( ( rule__ExpresionLogica__Group_2__0 )? )
            // InternalPagos.g:5990:2: ( rule__ExpresionLogica__Group_2__0 )?
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_2()); 
            // InternalPagos.g:5991:2: ( rule__ExpresionLogica__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_LOGICALCONN) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPagos.g:5991:3: rule__ExpresionLogica__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionLogica__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionLogicaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__2__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group_1__0"
    // InternalPagos.g:6000:1: rule__ExpresionLogica__Group_1__0 : rule__ExpresionLogica__Group_1__0__Impl rule__ExpresionLogica__Group_1__1 ;
    public final void rule__ExpresionLogica__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6004:1: ( rule__ExpresionLogica__Group_1__0__Impl rule__ExpresionLogica__Group_1__1 )
            // InternalPagos.g:6005:2: rule__ExpresionLogica__Group_1__0__Impl rule__ExpresionLogica__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__ExpresionLogica__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group_1__0"


    // $ANTLR start "rule__ExpresionLogica__Group_1__0__Impl"
    // InternalPagos.g:6012:1: rule__ExpresionLogica__Group_1__0__Impl : ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) ) ;
    public final void rule__ExpresionLogica__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6016:1: ( ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) ) )
            // InternalPagos.g:6017:1: ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) )
            {
            // InternalPagos.g:6017:1: ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) )
            // InternalPagos.g:6018:2: ( rule__ExpresionLogica__LogOperAssignment_1_0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getLogOperAssignment_1_0()); 
            // InternalPagos.g:6019:2: ( rule__ExpresionLogica__LogOperAssignment_1_0 )
            // InternalPagos.g:6019:3: rule__ExpresionLogica__LogOperAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__LogOperAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getLogOperAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group_1__0__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group_1__1"
    // InternalPagos.g:6027:1: rule__ExpresionLogica__Group_1__1 : rule__ExpresionLogica__Group_1__1__Impl ;
    public final void rule__ExpresionLogica__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6031:1: ( rule__ExpresionLogica__Group_1__1__Impl )
            // InternalPagos.g:6032:2: rule__ExpresionLogica__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group_1__1"


    // $ANTLR start "rule__ExpresionLogica__Group_1__1__Impl"
    // InternalPagos.g:6038:1: rule__ExpresionLogica__Group_1__1__Impl : ( ( rule__ExpresionLogica__Alternatives_1_1 ) ) ;
    public final void rule__ExpresionLogica__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6042:1: ( ( ( rule__ExpresionLogica__Alternatives_1_1 ) ) )
            // InternalPagos.g:6043:1: ( ( rule__ExpresionLogica__Alternatives_1_1 ) )
            {
            // InternalPagos.g:6043:1: ( ( rule__ExpresionLogica__Alternatives_1_1 ) )
            // InternalPagos.g:6044:2: ( rule__ExpresionLogica__Alternatives_1_1 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getAlternatives_1_1()); 
            // InternalPagos.g:6045:2: ( rule__ExpresionLogica__Alternatives_1_1 )
            // InternalPagos.g:6045:3: rule__ExpresionLogica__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group_1__1__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group_2__0"
    // InternalPagos.g:6054:1: rule__ExpresionLogica__Group_2__0 : rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1 ;
    public final void rule__ExpresionLogica__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6058:1: ( rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1 )
            // InternalPagos.g:6059:2: rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__ExpresionLogica__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group_2__0"


    // $ANTLR start "rule__ExpresionLogica__Group_2__0__Impl"
    // InternalPagos.g:6066:1: rule__ExpresionLogica__Group_2__0__Impl : ( ( rule__ExpresionLogica__ConOperAssignment_2_0 ) ) ;
    public final void rule__ExpresionLogica__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6070:1: ( ( ( rule__ExpresionLogica__ConOperAssignment_2_0 ) ) )
            // InternalPagos.g:6071:1: ( ( rule__ExpresionLogica__ConOperAssignment_2_0 ) )
            {
            // InternalPagos.g:6071:1: ( ( rule__ExpresionLogica__ConOperAssignment_2_0 ) )
            // InternalPagos.g:6072:2: ( rule__ExpresionLogica__ConOperAssignment_2_0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getConOperAssignment_2_0()); 
            // InternalPagos.g:6073:2: ( rule__ExpresionLogica__ConOperAssignment_2_0 )
            // InternalPagos.g:6073:3: rule__ExpresionLogica__ConOperAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__ConOperAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getConOperAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group_2__0__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group_2__1"
    // InternalPagos.g:6081:1: rule__ExpresionLogica__Group_2__1 : rule__ExpresionLogica__Group_2__1__Impl ;
    public final void rule__ExpresionLogica__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6085:1: ( rule__ExpresionLogica__Group_2__1__Impl )
            // InternalPagos.g:6086:2: rule__ExpresionLogica__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group_2__1"


    // $ANTLR start "rule__ExpresionLogica__Group_2__1__Impl"
    // InternalPagos.g:6092:1: rule__ExpresionLogica__Group_2__1__Impl : ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) ) ;
    public final void rule__ExpresionLogica__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6096:1: ( ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) ) )
            // InternalPagos.g:6097:1: ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) )
            {
            // InternalPagos.g:6097:1: ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) )
            // InternalPagos.g:6098:2: ( rule__ExpresionLogica__ExpAssignment_2_1 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getExpAssignment_2_1()); 
            // InternalPagos.g:6099:2: ( rule__ExpresionLogica__ExpAssignment_2_1 )
            // InternalPagos.g:6099:3: rule__ExpresionLogica__ExpAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__ExpAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getExpAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group_2__1__Impl"


    // $ANTLR start "rule__Adicion__Group__0"
    // InternalPagos.g:6108:1: rule__Adicion__Group__0 : rule__Adicion__Group__0__Impl rule__Adicion__Group__1 ;
    public final void rule__Adicion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6112:1: ( rule__Adicion__Group__0__Impl rule__Adicion__Group__1 )
            // InternalPagos.g:6113:2: rule__Adicion__Group__0__Impl rule__Adicion__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Adicion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Adicion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adicion__Group__0"


    // $ANTLR start "rule__Adicion__Group__0__Impl"
    // InternalPagos.g:6120:1: rule__Adicion__Group__0__Impl : ( ruleMultiplicacion ) ;
    public final void rule__Adicion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6124:1: ( ( ruleMultiplicacion ) )
            // InternalPagos.g:6125:1: ( ruleMultiplicacion )
            {
            // InternalPagos.g:6125:1: ( ruleMultiplicacion )
            // InternalPagos.g:6126:2: ruleMultiplicacion
            {
             before(grammarAccess.getAdicionAccess().getMultiplicacionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicacion();

            state._fsp--;

             after(grammarAccess.getAdicionAccess().getMultiplicacionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adicion__Group__0__Impl"


    // $ANTLR start "rule__Adicion__Group__1"
    // InternalPagos.g:6135:1: rule__Adicion__Group__1 : rule__Adicion__Group__1__Impl ;
    public final void rule__Adicion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6139:1: ( rule__Adicion__Group__1__Impl )
            // InternalPagos.g:6140:2: rule__Adicion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Adicion__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adicion__Group__1"


    // $ANTLR start "rule__Adicion__Group__1__Impl"
    // InternalPagos.g:6146:1: rule__Adicion__Group__1__Impl : ( ( rule__Adicion__Group_1__0 )* ) ;
    public final void rule__Adicion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6150:1: ( ( ( rule__Adicion__Group_1__0 )* ) )
            // InternalPagos.g:6151:1: ( ( rule__Adicion__Group_1__0 )* )
            {
            // InternalPagos.g:6151:1: ( ( rule__Adicion__Group_1__0 )* )
            // InternalPagos.g:6152:2: ( rule__Adicion__Group_1__0 )*
            {
             before(grammarAccess.getAdicionAccess().getGroup_1()); 
            // InternalPagos.g:6153:2: ( rule__Adicion__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ADDOP) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPagos.g:6153:3: rule__Adicion__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Adicion__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getAdicionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adicion__Group__1__Impl"


    // $ANTLR start "rule__Adicion__Group_1__0"
    // InternalPagos.g:6162:1: rule__Adicion__Group_1__0 : rule__Adicion__Group_1__0__Impl rule__Adicion__Group_1__1 ;
    public final void rule__Adicion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6166:1: ( rule__Adicion__Group_1__0__Impl rule__Adicion__Group_1__1 )
            // InternalPagos.g:6167:2: rule__Adicion__Group_1__0__Impl rule__Adicion__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Adicion__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Adicion__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adicion__Group_1__0"


    // $ANTLR start "rule__Adicion__Group_1__0__Impl"
    // InternalPagos.g:6174:1: rule__Adicion__Group_1__0__Impl : ( () ) ;
    public final void rule__Adicion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6178:1: ( ( () ) )
            // InternalPagos.g:6179:1: ( () )
            {
            // InternalPagos.g:6179:1: ( () )
            // InternalPagos.g:6180:2: ()
            {
             before(grammarAccess.getAdicionAccess().getAdicionLeftAction_1_0()); 
            // InternalPagos.g:6181:2: ()
            // InternalPagos.g:6181:3: 
            {
            }

             after(grammarAccess.getAdicionAccess().getAdicionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adicion__Group_1__0__Impl"


    // $ANTLR start "rule__Adicion__Group_1__1"
    // InternalPagos.g:6189:1: rule__Adicion__Group_1__1 : rule__Adicion__Group_1__1__Impl rule__Adicion__Group_1__2 ;
    public final void rule__Adicion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6193:1: ( rule__Adicion__Group_1__1__Impl rule__Adicion__Group_1__2 )
            // InternalPagos.g:6194:2: rule__Adicion__Group_1__1__Impl rule__Adicion__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__Adicion__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Adicion__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adicion__Group_1__1"


    // $ANTLR start "rule__Adicion__Group_1__1__Impl"
    // InternalPagos.g:6201:1: rule__Adicion__Group_1__1__Impl : ( ( rule__Adicion__OperatorAssignment_1_1 ) ) ;
    public final void rule__Adicion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6205:1: ( ( ( rule__Adicion__OperatorAssignment_1_1 ) ) )
            // InternalPagos.g:6206:1: ( ( rule__Adicion__OperatorAssignment_1_1 ) )
            {
            // InternalPagos.g:6206:1: ( ( rule__Adicion__OperatorAssignment_1_1 ) )
            // InternalPagos.g:6207:2: ( rule__Adicion__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdicionAccess().getOperatorAssignment_1_1()); 
            // InternalPagos.g:6208:2: ( rule__Adicion__OperatorAssignment_1_1 )
            // InternalPagos.g:6208:3: rule__Adicion__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Adicion__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdicionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adicion__Group_1__1__Impl"


    // $ANTLR start "rule__Adicion__Group_1__2"
    // InternalPagos.g:6216:1: rule__Adicion__Group_1__2 : rule__Adicion__Group_1__2__Impl ;
    public final void rule__Adicion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6220:1: ( rule__Adicion__Group_1__2__Impl )
            // InternalPagos.g:6221:2: rule__Adicion__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Adicion__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adicion__Group_1__2"


    // $ANTLR start "rule__Adicion__Group_1__2__Impl"
    // InternalPagos.g:6227:1: rule__Adicion__Group_1__2__Impl : ( ( rule__Adicion__RexpAssignment_1_2 ) ) ;
    public final void rule__Adicion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6231:1: ( ( ( rule__Adicion__RexpAssignment_1_2 ) ) )
            // InternalPagos.g:6232:1: ( ( rule__Adicion__RexpAssignment_1_2 ) )
            {
            // InternalPagos.g:6232:1: ( ( rule__Adicion__RexpAssignment_1_2 ) )
            // InternalPagos.g:6233:2: ( rule__Adicion__RexpAssignment_1_2 )
            {
             before(grammarAccess.getAdicionAccess().getRexpAssignment_1_2()); 
            // InternalPagos.g:6234:2: ( rule__Adicion__RexpAssignment_1_2 )
            // InternalPagos.g:6234:3: rule__Adicion__RexpAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Adicion__RexpAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdicionAccess().getRexpAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adicion__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplicacion__Group__0"
    // InternalPagos.g:6243:1: rule__Multiplicacion__Group__0 : rule__Multiplicacion__Group__0__Impl rule__Multiplicacion__Group__1 ;
    public final void rule__Multiplicacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6247:1: ( rule__Multiplicacion__Group__0__Impl rule__Multiplicacion__Group__1 )
            // InternalPagos.g:6248:2: rule__Multiplicacion__Group__0__Impl rule__Multiplicacion__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Multiplicacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicacion__Group__0"


    // $ANTLR start "rule__Multiplicacion__Group__0__Impl"
    // InternalPagos.g:6255:1: rule__Multiplicacion__Group__0__Impl : ( ruleSigleExp ) ;
    public final void rule__Multiplicacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6259:1: ( ( ruleSigleExp ) )
            // InternalPagos.g:6260:1: ( ruleSigleExp )
            {
            // InternalPagos.g:6260:1: ( ruleSigleExp )
            // InternalPagos.g:6261:2: ruleSigleExp
            {
             before(grammarAccess.getMultiplicacionAccess().getSigleExpParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSigleExp();

            state._fsp--;

             after(grammarAccess.getMultiplicacionAccess().getSigleExpParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicacion__Group__0__Impl"


    // $ANTLR start "rule__Multiplicacion__Group__1"
    // InternalPagos.g:6270:1: rule__Multiplicacion__Group__1 : rule__Multiplicacion__Group__1__Impl ;
    public final void rule__Multiplicacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6274:1: ( rule__Multiplicacion__Group__1__Impl )
            // InternalPagos.g:6275:2: rule__Multiplicacion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicacion__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicacion__Group__1"


    // $ANTLR start "rule__Multiplicacion__Group__1__Impl"
    // InternalPagos.g:6281:1: rule__Multiplicacion__Group__1__Impl : ( ( rule__Multiplicacion__Group_1__0 )* ) ;
    public final void rule__Multiplicacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6285:1: ( ( ( rule__Multiplicacion__Group_1__0 )* ) )
            // InternalPagos.g:6286:1: ( ( rule__Multiplicacion__Group_1__0 )* )
            {
            // InternalPagos.g:6286:1: ( ( rule__Multiplicacion__Group_1__0 )* )
            // InternalPagos.g:6287:2: ( rule__Multiplicacion__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicacionAccess().getGroup_1()); 
            // InternalPagos.g:6288:2: ( rule__Multiplicacion__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_MULTOP) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPagos.g:6288:3: rule__Multiplicacion__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Multiplicacion__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getMultiplicacionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicacion__Group__1__Impl"


    // $ANTLR start "rule__Multiplicacion__Group_1__0"
    // InternalPagos.g:6297:1: rule__Multiplicacion__Group_1__0 : rule__Multiplicacion__Group_1__0__Impl rule__Multiplicacion__Group_1__1 ;
    public final void rule__Multiplicacion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6301:1: ( rule__Multiplicacion__Group_1__0__Impl rule__Multiplicacion__Group_1__1 )
            // InternalPagos.g:6302:2: rule__Multiplicacion__Group_1__0__Impl rule__Multiplicacion__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Multiplicacion__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicacion__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicacion__Group_1__0"


    // $ANTLR start "rule__Multiplicacion__Group_1__0__Impl"
    // InternalPagos.g:6309:1: rule__Multiplicacion__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplicacion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6313:1: ( ( () ) )
            // InternalPagos.g:6314:1: ( () )
            {
            // InternalPagos.g:6314:1: ( () )
            // InternalPagos.g:6315:2: ()
            {
             before(grammarAccess.getMultiplicacionAccess().getMultiplicacionLeftAction_1_0()); 
            // InternalPagos.g:6316:2: ()
            // InternalPagos.g:6316:3: 
            {
            }

             after(grammarAccess.getMultiplicacionAccess().getMultiplicacionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicacion__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplicacion__Group_1__1"
    // InternalPagos.g:6324:1: rule__Multiplicacion__Group_1__1 : rule__Multiplicacion__Group_1__1__Impl rule__Multiplicacion__Group_1__2 ;
    public final void rule__Multiplicacion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6328:1: ( rule__Multiplicacion__Group_1__1__Impl rule__Multiplicacion__Group_1__2 )
            // InternalPagos.g:6329:2: rule__Multiplicacion__Group_1__1__Impl rule__Multiplicacion__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__Multiplicacion__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicacion__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicacion__Group_1__1"


    // $ANTLR start "rule__Multiplicacion__Group_1__1__Impl"
    // InternalPagos.g:6336:1: rule__Multiplicacion__Group_1__1__Impl : ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplicacion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6340:1: ( ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) ) )
            // InternalPagos.g:6341:1: ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) )
            {
            // InternalPagos.g:6341:1: ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) )
            // InternalPagos.g:6342:2: ( rule__Multiplicacion__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicacionAccess().getOperatorAssignment_1_1()); 
            // InternalPagos.g:6343:2: ( rule__Multiplicacion__OperatorAssignment_1_1 )
            // InternalPagos.g:6343:3: rule__Multiplicacion__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicacion__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicacionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicacion__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplicacion__Group_1__2"
    // InternalPagos.g:6351:1: rule__Multiplicacion__Group_1__2 : rule__Multiplicacion__Group_1__2__Impl ;
    public final void rule__Multiplicacion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6355:1: ( rule__Multiplicacion__Group_1__2__Impl )
            // InternalPagos.g:6356:2: rule__Multiplicacion__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicacion__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicacion__Group_1__2"


    // $ANTLR start "rule__Multiplicacion__Group_1__2__Impl"
    // InternalPagos.g:6362:1: rule__Multiplicacion__Group_1__2__Impl : ( ( rule__Multiplicacion__RexpAssignment_1_2 ) ) ;
    public final void rule__Multiplicacion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6366:1: ( ( ( rule__Multiplicacion__RexpAssignment_1_2 ) ) )
            // InternalPagos.g:6367:1: ( ( rule__Multiplicacion__RexpAssignment_1_2 ) )
            {
            // InternalPagos.g:6367:1: ( ( rule__Multiplicacion__RexpAssignment_1_2 ) )
            // InternalPagos.g:6368:2: ( rule__Multiplicacion__RexpAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicacionAccess().getRexpAssignment_1_2()); 
            // InternalPagos.g:6369:2: ( rule__Multiplicacion__RexpAssignment_1_2 )
            // InternalPagos.g:6369:3: rule__Multiplicacion__RexpAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicacion__RexpAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicacionAccess().getRexpAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicacion__Group_1__2__Impl"


    // $ANTLR start "rule__SigleExp__Group_1__0"
    // InternalPagos.g:6378:1: rule__SigleExp__Group_1__0 : rule__SigleExp__Group_1__0__Impl rule__SigleExp__Group_1__1 ;
    public final void rule__SigleExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6382:1: ( rule__SigleExp__Group_1__0__Impl rule__SigleExp__Group_1__1 )
            // InternalPagos.g:6383:2: rule__SigleExp__Group_1__0__Impl rule__SigleExp__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__SigleExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SigleExp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigleExp__Group_1__0"


    // $ANTLR start "rule__SigleExp__Group_1__0__Impl"
    // InternalPagos.g:6390:1: rule__SigleExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SigleExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6394:1: ( ( '(' ) )
            // InternalPagos.g:6395:1: ( '(' )
            {
            // InternalPagos.g:6395:1: ( '(' )
            // InternalPagos.g:6396:2: '('
            {
             before(grammarAccess.getSigleExpAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSigleExpAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigleExp__Group_1__0__Impl"


    // $ANTLR start "rule__SigleExp__Group_1__1"
    // InternalPagos.g:6405:1: rule__SigleExp__Group_1__1 : rule__SigleExp__Group_1__1__Impl rule__SigleExp__Group_1__2 ;
    public final void rule__SigleExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6409:1: ( rule__SigleExp__Group_1__1__Impl rule__SigleExp__Group_1__2 )
            // InternalPagos.g:6410:2: rule__SigleExp__Group_1__1__Impl rule__SigleExp__Group_1__2
            {
            pushFollow(FOLLOW_40);
            rule__SigleExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SigleExp__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigleExp__Group_1__1"


    // $ANTLR start "rule__SigleExp__Group_1__1__Impl"
    // InternalPagos.g:6417:1: rule__SigleExp__Group_1__1__Impl : ( ruleAdicion ) ;
    public final void rule__SigleExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6421:1: ( ( ruleAdicion ) )
            // InternalPagos.g:6422:1: ( ruleAdicion )
            {
            // InternalPagos.g:6422:1: ( ruleAdicion )
            // InternalPagos.g:6423:2: ruleAdicion
            {
             before(grammarAccess.getSigleExpAccess().getAdicionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleAdicion();

            state._fsp--;

             after(grammarAccess.getSigleExpAccess().getAdicionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigleExp__Group_1__1__Impl"


    // $ANTLR start "rule__SigleExp__Group_1__2"
    // InternalPagos.g:6432:1: rule__SigleExp__Group_1__2 : rule__SigleExp__Group_1__2__Impl ;
    public final void rule__SigleExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6436:1: ( rule__SigleExp__Group_1__2__Impl )
            // InternalPagos.g:6437:2: rule__SigleExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SigleExp__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigleExp__Group_1__2"


    // $ANTLR start "rule__SigleExp__Group_1__2__Impl"
    // InternalPagos.g:6443:1: rule__SigleExp__Group_1__2__Impl : ( ')' ) ;
    public final void rule__SigleExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6447:1: ( ( ')' ) )
            // InternalPagos.g:6448:1: ( ')' )
            {
            // InternalPagos.g:6448:1: ( ')' )
            // InternalPagos.g:6449:2: ')'
            {
             before(grammarAccess.getSigleExpAccess().getRightParenthesisKeyword_1_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSigleExpAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigleExp__Group_1__2__Impl"


    // $ANTLR start "rule__BusinessAttribute__Group__0"
    // InternalPagos.g:6459:1: rule__BusinessAttribute__Group__0 : rule__BusinessAttribute__Group__0__Impl rule__BusinessAttribute__Group__1 ;
    public final void rule__BusinessAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6463:1: ( rule__BusinessAttribute__Group__0__Impl rule__BusinessAttribute__Group__1 )
            // InternalPagos.g:6464:2: rule__BusinessAttribute__Group__0__Impl rule__BusinessAttribute__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__BusinessAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__0"


    // $ANTLR start "rule__BusinessAttribute__Group__0__Impl"
    // InternalPagos.g:6471:1: rule__BusinessAttribute__Group__0__Impl : ( () ) ;
    public final void rule__BusinessAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6475:1: ( ( () ) )
            // InternalPagos.g:6476:1: ( () )
            {
            // InternalPagos.g:6476:1: ( () )
            // InternalPagos.g:6477:2: ()
            {
             before(grammarAccess.getBusinessAttributeAccess().getBusinessAttributeAction_0()); 
            // InternalPagos.g:6478:2: ()
            // InternalPagos.g:6478:3: 
            {
            }

             after(grammarAccess.getBusinessAttributeAccess().getBusinessAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__0__Impl"


    // $ANTLR start "rule__BusinessAttribute__Group__1"
    // InternalPagos.g:6486:1: rule__BusinessAttribute__Group__1 : rule__BusinessAttribute__Group__1__Impl rule__BusinessAttribute__Group__2 ;
    public final void rule__BusinessAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6490:1: ( rule__BusinessAttribute__Group__1__Impl rule__BusinessAttribute__Group__2 )
            // InternalPagos.g:6491:2: rule__BusinessAttribute__Group__1__Impl rule__BusinessAttribute__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__BusinessAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__1"


    // $ANTLR start "rule__BusinessAttribute__Group__1__Impl"
    // InternalPagos.g:6498:1: rule__BusinessAttribute__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__BusinessAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6502:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:6503:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:6503:1: ( RULE_LBRACE )
            // InternalPagos.g:6504:2: RULE_LBRACE
            {
             before(grammarAccess.getBusinessAttributeAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getBusinessAttributeAccess().getLBRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__1__Impl"


    // $ANTLR start "rule__BusinessAttribute__Group__2"
    // InternalPagos.g:6513:1: rule__BusinessAttribute__Group__2 : rule__BusinessAttribute__Group__2__Impl rule__BusinessAttribute__Group__3 ;
    public final void rule__BusinessAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6517:1: ( rule__BusinessAttribute__Group__2__Impl rule__BusinessAttribute__Group__3 )
            // InternalPagos.g:6518:2: rule__BusinessAttribute__Group__2__Impl rule__BusinessAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__BusinessAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__2"


    // $ANTLR start "rule__BusinessAttribute__Group__2__Impl"
    // InternalPagos.g:6525:1: rule__BusinessAttribute__Group__2__Impl : ( ( rule__BusinessAttribute__NameAssignment_2 ) ) ;
    public final void rule__BusinessAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6529:1: ( ( ( rule__BusinessAttribute__NameAssignment_2 ) ) )
            // InternalPagos.g:6530:1: ( ( rule__BusinessAttribute__NameAssignment_2 ) )
            {
            // InternalPagos.g:6530:1: ( ( rule__BusinessAttribute__NameAssignment_2 ) )
            // InternalPagos.g:6531:2: ( rule__BusinessAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessAttributeAccess().getNameAssignment_2()); 
            // InternalPagos.g:6532:2: ( rule__BusinessAttribute__NameAssignment_2 )
            // InternalPagos.g:6532:3: rule__BusinessAttribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BusinessAttribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBusinessAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__2__Impl"


    // $ANTLR start "rule__BusinessAttribute__Group__3"
    // InternalPagos.g:6540:1: rule__BusinessAttribute__Group__3 : rule__BusinessAttribute__Group__3__Impl rule__BusinessAttribute__Group__4 ;
    public final void rule__BusinessAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6544:1: ( rule__BusinessAttribute__Group__3__Impl rule__BusinessAttribute__Group__4 )
            // InternalPagos.g:6545:2: rule__BusinessAttribute__Group__3__Impl rule__BusinessAttribute__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__BusinessAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__3"


    // $ANTLR start "rule__BusinessAttribute__Group__3__Impl"
    // InternalPagos.g:6552:1: rule__BusinessAttribute__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__BusinessAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6556:1: ( ( RULE_COLON ) )
            // InternalPagos.g:6557:1: ( RULE_COLON )
            {
            // InternalPagos.g:6557:1: ( RULE_COLON )
            // InternalPagos.g:6558:2: RULE_COLON
            {
             before(grammarAccess.getBusinessAttributeAccess().getCOLONTerminalRuleCall_3()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getBusinessAttributeAccess().getCOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__3__Impl"


    // $ANTLR start "rule__BusinessAttribute__Group__4"
    // InternalPagos.g:6567:1: rule__BusinessAttribute__Group__4 : rule__BusinessAttribute__Group__4__Impl rule__BusinessAttribute__Group__5 ;
    public final void rule__BusinessAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6571:1: ( rule__BusinessAttribute__Group__4__Impl rule__BusinessAttribute__Group__5 )
            // InternalPagos.g:6572:2: rule__BusinessAttribute__Group__4__Impl rule__BusinessAttribute__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__BusinessAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__4"


    // $ANTLR start "rule__BusinessAttribute__Group__4__Impl"
    // InternalPagos.g:6579:1: rule__BusinessAttribute__Group__4__Impl : ( ( rule__BusinessAttribute__TypeAssignment_4 ) ) ;
    public final void rule__BusinessAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6583:1: ( ( ( rule__BusinessAttribute__TypeAssignment_4 ) ) )
            // InternalPagos.g:6584:1: ( ( rule__BusinessAttribute__TypeAssignment_4 ) )
            {
            // InternalPagos.g:6584:1: ( ( rule__BusinessAttribute__TypeAssignment_4 ) )
            // InternalPagos.g:6585:2: ( rule__BusinessAttribute__TypeAssignment_4 )
            {
             before(grammarAccess.getBusinessAttributeAccess().getTypeAssignment_4()); 
            // InternalPagos.g:6586:2: ( rule__BusinessAttribute__TypeAssignment_4 )
            // InternalPagos.g:6586:3: rule__BusinessAttribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BusinessAttribute__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBusinessAttributeAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__4__Impl"


    // $ANTLR start "rule__BusinessAttribute__Group__5"
    // InternalPagos.g:6594:1: rule__BusinessAttribute__Group__5 : rule__BusinessAttribute__Group__5__Impl rule__BusinessAttribute__Group__6 ;
    public final void rule__BusinessAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6598:1: ( rule__BusinessAttribute__Group__5__Impl rule__BusinessAttribute__Group__6 )
            // InternalPagos.g:6599:2: rule__BusinessAttribute__Group__5__Impl rule__BusinessAttribute__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__BusinessAttribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessAttribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__5"


    // $ANTLR start "rule__BusinessAttribute__Group__5__Impl"
    // InternalPagos.g:6606:1: rule__BusinessAttribute__Group__5__Impl : ( ( rule__BusinessAttribute__Group_5__0 )? ) ;
    public final void rule__BusinessAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6610:1: ( ( ( rule__BusinessAttribute__Group_5__0 )? ) )
            // InternalPagos.g:6611:1: ( ( rule__BusinessAttribute__Group_5__0 )? )
            {
            // InternalPagos.g:6611:1: ( ( rule__BusinessAttribute__Group_5__0 )? )
            // InternalPagos.g:6612:2: ( rule__BusinessAttribute__Group_5__0 )?
            {
             before(grammarAccess.getBusinessAttributeAccess().getGroup_5()); 
            // InternalPagos.g:6613:2: ( rule__BusinessAttribute__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPagos.g:6613:3: rule__BusinessAttribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BusinessAttribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessAttributeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__5__Impl"


    // $ANTLR start "rule__BusinessAttribute__Group__6"
    // InternalPagos.g:6621:1: rule__BusinessAttribute__Group__6 : rule__BusinessAttribute__Group__6__Impl rule__BusinessAttribute__Group__7 ;
    public final void rule__BusinessAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6625:1: ( rule__BusinessAttribute__Group__6__Impl rule__BusinessAttribute__Group__7 )
            // InternalPagos.g:6626:2: rule__BusinessAttribute__Group__6__Impl rule__BusinessAttribute__Group__7
            {
            pushFollow(FOLLOW_42);
            rule__BusinessAttribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessAttribute__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__6"


    // $ANTLR start "rule__BusinessAttribute__Group__6__Impl"
    // InternalPagos.g:6633:1: rule__BusinessAttribute__Group__6__Impl : ( ( rule__BusinessAttribute__IsIndexAssignment_6 )? ) ;
    public final void rule__BusinessAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6637:1: ( ( ( rule__BusinessAttribute__IsIndexAssignment_6 )? ) )
            // InternalPagos.g:6638:1: ( ( rule__BusinessAttribute__IsIndexAssignment_6 )? )
            {
            // InternalPagos.g:6638:1: ( ( rule__BusinessAttribute__IsIndexAssignment_6 )? )
            // InternalPagos.g:6639:2: ( rule__BusinessAttribute__IsIndexAssignment_6 )?
            {
             before(grammarAccess.getBusinessAttributeAccess().getIsIndexAssignment_6()); 
            // InternalPagos.g:6640:2: ( rule__BusinessAttribute__IsIndexAssignment_6 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INDEX) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPagos.g:6640:3: rule__BusinessAttribute__IsIndexAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__BusinessAttribute__IsIndexAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessAttributeAccess().getIsIndexAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__6__Impl"


    // $ANTLR start "rule__BusinessAttribute__Group__7"
    // InternalPagos.g:6648:1: rule__BusinessAttribute__Group__7 : rule__BusinessAttribute__Group__7__Impl ;
    public final void rule__BusinessAttribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6652:1: ( rule__BusinessAttribute__Group__7__Impl )
            // InternalPagos.g:6653:2: rule__BusinessAttribute__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BusinessAttribute__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__7"


    // $ANTLR start "rule__BusinessAttribute__Group__7__Impl"
    // InternalPagos.g:6659:1: rule__BusinessAttribute__Group__7__Impl : ( RULE_RBRACE ) ;
    public final void rule__BusinessAttribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6663:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:6664:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:6664:1: ( RULE_RBRACE )
            // InternalPagos.g:6665:2: RULE_RBRACE
            {
             before(grammarAccess.getBusinessAttributeAccess().getRBRACETerminalRuleCall_7()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getBusinessAttributeAccess().getRBRACETerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group__7__Impl"


    // $ANTLR start "rule__BusinessAttribute__Group_5__0"
    // InternalPagos.g:6675:1: rule__BusinessAttribute__Group_5__0 : rule__BusinessAttribute__Group_5__0__Impl rule__BusinessAttribute__Group_5__1 ;
    public final void rule__BusinessAttribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6679:1: ( rule__BusinessAttribute__Group_5__0__Impl rule__BusinessAttribute__Group_5__1 )
            // InternalPagos.g:6680:2: rule__BusinessAttribute__Group_5__0__Impl rule__BusinessAttribute__Group_5__1
            {
            pushFollow(FOLLOW_31);
            rule__BusinessAttribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessAttribute__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group_5__0"


    // $ANTLR start "rule__BusinessAttribute__Group_5__0__Impl"
    // InternalPagos.g:6687:1: rule__BusinessAttribute__Group_5__0__Impl : ( ':=' ) ;
    public final void rule__BusinessAttribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6691:1: ( ( ':=' ) )
            // InternalPagos.g:6692:1: ( ':=' )
            {
            // InternalPagos.g:6692:1: ( ':=' )
            // InternalPagos.g:6693:2: ':='
            {
             before(grammarAccess.getBusinessAttributeAccess().getColonEqualsSignKeyword_5_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getBusinessAttributeAccess().getColonEqualsSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group_5__0__Impl"


    // $ANTLR start "rule__BusinessAttribute__Group_5__1"
    // InternalPagos.g:6702:1: rule__BusinessAttribute__Group_5__1 : rule__BusinessAttribute__Group_5__1__Impl ;
    public final void rule__BusinessAttribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6706:1: ( rule__BusinessAttribute__Group_5__1__Impl )
            // InternalPagos.g:6707:2: rule__BusinessAttribute__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BusinessAttribute__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group_5__1"


    // $ANTLR start "rule__BusinessAttribute__Group_5__1__Impl"
    // InternalPagos.g:6713:1: rule__BusinessAttribute__Group_5__1__Impl : ( ( rule__BusinessAttribute__ExpAssignment_5_1 ) ) ;
    public final void rule__BusinessAttribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6717:1: ( ( ( rule__BusinessAttribute__ExpAssignment_5_1 ) ) )
            // InternalPagos.g:6718:1: ( ( rule__BusinessAttribute__ExpAssignment_5_1 ) )
            {
            // InternalPagos.g:6718:1: ( ( rule__BusinessAttribute__ExpAssignment_5_1 ) )
            // InternalPagos.g:6719:2: ( rule__BusinessAttribute__ExpAssignment_5_1 )
            {
             before(grammarAccess.getBusinessAttributeAccess().getExpAssignment_5_1()); 
            // InternalPagos.g:6720:2: ( rule__BusinessAttribute__ExpAssignment_5_1 )
            // InternalPagos.g:6720:3: rule__BusinessAttribute__ExpAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BusinessAttribute__ExpAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBusinessAttributeAccess().getExpAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__Group_5__1__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0__0"
    // InternalPagos.g:6729:1: rule__TerminalValue__Group_0__0 : rule__TerminalValue__Group_0__0__Impl rule__TerminalValue__Group_0__1 ;
    public final void rule__TerminalValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6733:1: ( rule__TerminalValue__Group_0__0__Impl rule__TerminalValue__Group_0__1 )
            // InternalPagos.g:6734:2: rule__TerminalValue__Group_0__0__Impl rule__TerminalValue__Group_0__1
            {
            pushFollow(FOLLOW_43);
            rule__TerminalValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0__0"


    // $ANTLR start "rule__TerminalValue__Group_0__0__Impl"
    // InternalPagos.g:6741:1: rule__TerminalValue__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6745:1: ( ( () ) )
            // InternalPagos.g:6746:1: ( () )
            {
            // InternalPagos.g:6746:1: ( () )
            // InternalPagos.g:6747:2: ()
            {
             before(grammarAccess.getTerminalValueAccess().getTerminalValueAction_0_0()); 
            // InternalPagos.g:6748:2: ()
            // InternalPagos.g:6748:3: 
            {
            }

             after(grammarAccess.getTerminalValueAccess().getTerminalValueAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0__1"
    // InternalPagos.g:6756:1: rule__TerminalValue__Group_0__1 : rule__TerminalValue__Group_0__1__Impl ;
    public final void rule__TerminalValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6760:1: ( rule__TerminalValue__Group_0__1__Impl )
            // InternalPagos.g:6761:2: rule__TerminalValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0__1"


    // $ANTLR start "rule__TerminalValue__Group_0__1__Impl"
    // InternalPagos.g:6767:1: rule__TerminalValue__Group_0__1__Impl : ( ( rule__TerminalValue__Alternatives_0_1 ) ) ;
    public final void rule__TerminalValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6771:1: ( ( ( rule__TerminalValue__Alternatives_0_1 ) ) )
            // InternalPagos.g:6772:1: ( ( rule__TerminalValue__Alternatives_0_1 ) )
            {
            // InternalPagos.g:6772:1: ( ( rule__TerminalValue__Alternatives_0_1 ) )
            // InternalPagos.g:6773:2: ( rule__TerminalValue__Alternatives_0_1 )
            {
             before(grammarAccess.getTerminalValueAccess().getAlternatives_0_1()); 
            // InternalPagos.g:6774:2: ( rule__TerminalValue__Alternatives_0_1 )
            // InternalPagos.g:6774:3: rule__TerminalValue__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getAlternatives_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0_1_0__0"
    // InternalPagos.g:6783:1: rule__TerminalValue__Group_0_1_0__0 : rule__TerminalValue__Group_0_1_0__0__Impl rule__TerminalValue__Group_0_1_0__1 ;
    public final void rule__TerminalValue__Group_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6787:1: ( rule__TerminalValue__Group_0_1_0__0__Impl rule__TerminalValue__Group_0_1_0__1 )
            // InternalPagos.g:6788:2: rule__TerminalValue__Group_0_1_0__0__Impl rule__TerminalValue__Group_0_1_0__1
            {
            pushFollow(FOLLOW_43);
            rule__TerminalValue__Group_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_0__0"


    // $ANTLR start "rule__TerminalValue__Group_0_1_0__0__Impl"
    // InternalPagos.g:6795:1: rule__TerminalValue__Group_0_1_0__0__Impl : ( ( rule__TerminalValue__Group_0_1_0_0__0 )? ) ;
    public final void rule__TerminalValue__Group_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6799:1: ( ( ( rule__TerminalValue__Group_0_1_0_0__0 )? ) )
            // InternalPagos.g:6800:1: ( ( rule__TerminalValue__Group_0_1_0_0__0 )? )
            {
            // InternalPagos.g:6800:1: ( ( rule__TerminalValue__Group_0_1_0_0__0 )? )
            // InternalPagos.g:6801:2: ( rule__TerminalValue__Group_0_1_0_0__0 )?
            {
             before(grammarAccess.getTerminalValueAccess().getGroup_0_1_0_0()); 
            // InternalPagos.g:6802:2: ( rule__TerminalValue__Group_0_1_0_0__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPagos.g:6802:3: rule__TerminalValue__Group_0_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalValue__Group_0_1_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminalValueAccess().getGroup_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_0__0__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0_1_0__1"
    // InternalPagos.g:6810:1: rule__TerminalValue__Group_0_1_0__1 : rule__TerminalValue__Group_0_1_0__1__Impl ;
    public final void rule__TerminalValue__Group_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6814:1: ( rule__TerminalValue__Group_0_1_0__1__Impl )
            // InternalPagos.g:6815:2: rule__TerminalValue__Group_0_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_0__1"


    // $ANTLR start "rule__TerminalValue__Group_0_1_0__1__Impl"
    // InternalPagos.g:6821:1: rule__TerminalValue__Group_0_1_0__1__Impl : ( ( rule__TerminalValue__VariableAssignment_0_1_0_1 ) ) ;
    public final void rule__TerminalValue__Group_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6825:1: ( ( ( rule__TerminalValue__VariableAssignment_0_1_0_1 ) ) )
            // InternalPagos.g:6826:1: ( ( rule__TerminalValue__VariableAssignment_0_1_0_1 ) )
            {
            // InternalPagos.g:6826:1: ( ( rule__TerminalValue__VariableAssignment_0_1_0_1 ) )
            // InternalPagos.g:6827:2: ( rule__TerminalValue__VariableAssignment_0_1_0_1 )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableAssignment_0_1_0_1()); 
            // InternalPagos.g:6828:2: ( rule__TerminalValue__VariableAssignment_0_1_0_1 )
            // InternalPagos.g:6828:3: rule__TerminalValue__VariableAssignment_0_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__VariableAssignment_0_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getVariableAssignment_0_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_0__1__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0_1_0_0__0"
    // InternalPagos.g:6837:1: rule__TerminalValue__Group_0_1_0_0__0 : rule__TerminalValue__Group_0_1_0_0__0__Impl rule__TerminalValue__Group_0_1_0_0__1 ;
    public final void rule__TerminalValue__Group_0_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6841:1: ( rule__TerminalValue__Group_0_1_0_0__0__Impl rule__TerminalValue__Group_0_1_0_0__1 )
            // InternalPagos.g:6842:2: rule__TerminalValue__Group_0_1_0_0__0__Impl rule__TerminalValue__Group_0_1_0_0__1
            {
            pushFollow(FOLLOW_44);
            rule__TerminalValue__Group_0_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_0_0__0"


    // $ANTLR start "rule__TerminalValue__Group_0_1_0_0__0__Impl"
    // InternalPagos.g:6849:1: rule__TerminalValue__Group_0_1_0_0__0__Impl : ( 'PA' ) ;
    public final void rule__TerminalValue__Group_0_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6853:1: ( ( 'PA' ) )
            // InternalPagos.g:6854:1: ( 'PA' )
            {
            // InternalPagos.g:6854:1: ( 'PA' )
            // InternalPagos.g:6855:2: 'PA'
            {
             before(grammarAccess.getTerminalValueAccess().getPAKeyword_0_1_0_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getPAKeyword_0_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_0_0__0__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0_1_0_0__1"
    // InternalPagos.g:6864:1: rule__TerminalValue__Group_0_1_0_0__1 : rule__TerminalValue__Group_0_1_0_0__1__Impl rule__TerminalValue__Group_0_1_0_0__2 ;
    public final void rule__TerminalValue__Group_0_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6868:1: ( rule__TerminalValue__Group_0_1_0_0__1__Impl rule__TerminalValue__Group_0_1_0_0__2 )
            // InternalPagos.g:6869:2: rule__TerminalValue__Group_0_1_0_0__1__Impl rule__TerminalValue__Group_0_1_0_0__2
            {
            pushFollow(FOLLOW_5);
            rule__TerminalValue__Group_0_1_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0_1_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_0_0__1"


    // $ANTLR start "rule__TerminalValue__Group_0_1_0_0__1__Impl"
    // InternalPagos.g:6876:1: rule__TerminalValue__Group_0_1_0_0__1__Impl : ( RULE_DOT ) ;
    public final void rule__TerminalValue__Group_0_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6880:1: ( ( RULE_DOT ) )
            // InternalPagos.g:6881:1: ( RULE_DOT )
            {
            // InternalPagos.g:6881:1: ( RULE_DOT )
            // InternalPagos.g:6882:2: RULE_DOT
            {
             before(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_0_1_0_0_1()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_0_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_0_0__1__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0_1_0_0__2"
    // InternalPagos.g:6891:1: rule__TerminalValue__Group_0_1_0_0__2 : rule__TerminalValue__Group_0_1_0_0__2__Impl rule__TerminalValue__Group_0_1_0_0__3 ;
    public final void rule__TerminalValue__Group_0_1_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6895:1: ( rule__TerminalValue__Group_0_1_0_0__2__Impl rule__TerminalValue__Group_0_1_0_0__3 )
            // InternalPagos.g:6896:2: rule__TerminalValue__Group_0_1_0_0__2__Impl rule__TerminalValue__Group_0_1_0_0__3
            {
            pushFollow(FOLLOW_45);
            rule__TerminalValue__Group_0_1_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0_1_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_0_0__2"


    // $ANTLR start "rule__TerminalValue__Group_0_1_0_0__2__Impl"
    // InternalPagos.g:6903:1: rule__TerminalValue__Group_0_1_0_0__2__Impl : ( ( rule__TerminalValue__ParentAssignment_0_1_0_0_2 ) ) ;
    public final void rule__TerminalValue__Group_0_1_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6907:1: ( ( ( rule__TerminalValue__ParentAssignment_0_1_0_0_2 ) ) )
            // InternalPagos.g:6908:1: ( ( rule__TerminalValue__ParentAssignment_0_1_0_0_2 ) )
            {
            // InternalPagos.g:6908:1: ( ( rule__TerminalValue__ParentAssignment_0_1_0_0_2 ) )
            // InternalPagos.g:6909:2: ( rule__TerminalValue__ParentAssignment_0_1_0_0_2 )
            {
             before(grammarAccess.getTerminalValueAccess().getParentAssignment_0_1_0_0_2()); 
            // InternalPagos.g:6910:2: ( rule__TerminalValue__ParentAssignment_0_1_0_0_2 )
            // InternalPagos.g:6910:3: rule__TerminalValue__ParentAssignment_0_1_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__ParentAssignment_0_1_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getParentAssignment_0_1_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_0_0__2__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0_1_0_0__3"
    // InternalPagos.g:6918:1: rule__TerminalValue__Group_0_1_0_0__3 : rule__TerminalValue__Group_0_1_0_0__3__Impl ;
    public final void rule__TerminalValue__Group_0_1_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6922:1: ( rule__TerminalValue__Group_0_1_0_0__3__Impl )
            // InternalPagos.g:6923:2: rule__TerminalValue__Group_0_1_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0_1_0_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_0_0__3"


    // $ANTLR start "rule__TerminalValue__Group_0_1_0_0__3__Impl"
    // InternalPagos.g:6929:1: rule__TerminalValue__Group_0_1_0_0__3__Impl : ( RULE_DASH ) ;
    public final void rule__TerminalValue__Group_0_1_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6933:1: ( ( RULE_DASH ) )
            // InternalPagos.g:6934:1: ( RULE_DASH )
            {
            // InternalPagos.g:6934:1: ( RULE_DASH )
            // InternalPagos.g:6935:2: RULE_DASH
            {
             before(grammarAccess.getTerminalValueAccess().getDASHTerminalRuleCall_0_1_0_0_3()); 
            match(input,RULE_DASH,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDASHTerminalRuleCall_0_1_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_0_0__3__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0_1_1__0"
    // InternalPagos.g:6945:1: rule__TerminalValue__Group_0_1_1__0 : rule__TerminalValue__Group_0_1_1__0__Impl rule__TerminalValue__Group_0_1_1__1 ;
    public final void rule__TerminalValue__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6949:1: ( rule__TerminalValue__Group_0_1_1__0__Impl rule__TerminalValue__Group_0_1_1__1 )
            // InternalPagos.g:6950:2: rule__TerminalValue__Group_0_1_1__0__Impl rule__TerminalValue__Group_0_1_1__1
            {
            pushFollow(FOLLOW_44);
            rule__TerminalValue__Group_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_1__0"


    // $ANTLR start "rule__TerminalValue__Group_0_1_1__0__Impl"
    // InternalPagos.g:6957:1: rule__TerminalValue__Group_0_1_1__0__Impl : ( 'PA' ) ;
    public final void rule__TerminalValue__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6961:1: ( ( 'PA' ) )
            // InternalPagos.g:6962:1: ( 'PA' )
            {
            // InternalPagos.g:6962:1: ( 'PA' )
            // InternalPagos.g:6963:2: 'PA'
            {
             before(grammarAccess.getTerminalValueAccess().getPAKeyword_0_1_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getPAKeyword_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_1__0__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0_1_1__1"
    // InternalPagos.g:6972:1: rule__TerminalValue__Group_0_1_1__1 : rule__TerminalValue__Group_0_1_1__1__Impl rule__TerminalValue__Group_0_1_1__2 ;
    public final void rule__TerminalValue__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6976:1: ( rule__TerminalValue__Group_0_1_1__1__Impl rule__TerminalValue__Group_0_1_1__2 )
            // InternalPagos.g:6977:2: rule__TerminalValue__Group_0_1_1__1__Impl rule__TerminalValue__Group_0_1_1__2
            {
            pushFollow(FOLLOW_5);
            rule__TerminalValue__Group_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_1__1"


    // $ANTLR start "rule__TerminalValue__Group_0_1_1__1__Impl"
    // InternalPagos.g:6984:1: rule__TerminalValue__Group_0_1_1__1__Impl : ( RULE_DOT ) ;
    public final void rule__TerminalValue__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6988:1: ( ( RULE_DOT ) )
            // InternalPagos.g:6989:1: ( RULE_DOT )
            {
            // InternalPagos.g:6989:1: ( RULE_DOT )
            // InternalPagos.g:6990:2: RULE_DOT
            {
             before(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_0_1_1_1()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_1__1__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0_1_1__2"
    // InternalPagos.g:6999:1: rule__TerminalValue__Group_0_1_1__2 : rule__TerminalValue__Group_0_1_1__2__Impl rule__TerminalValue__Group_0_1_1__3 ;
    public final void rule__TerminalValue__Group_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7003:1: ( rule__TerminalValue__Group_0_1_1__2__Impl rule__TerminalValue__Group_0_1_1__3 )
            // InternalPagos.g:7004:2: rule__TerminalValue__Group_0_1_1__2__Impl rule__TerminalValue__Group_0_1_1__3
            {
            pushFollow(FOLLOW_44);
            rule__TerminalValue__Group_0_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_1__2"


    // $ANTLR start "rule__TerminalValue__Group_0_1_1__2__Impl"
    // InternalPagos.g:7011:1: rule__TerminalValue__Group_0_1_1__2__Impl : ( ( rule__TerminalValue__ParentAssignment_0_1_1_2 ) ) ;
    public final void rule__TerminalValue__Group_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7015:1: ( ( ( rule__TerminalValue__ParentAssignment_0_1_1_2 ) ) )
            // InternalPagos.g:7016:1: ( ( rule__TerminalValue__ParentAssignment_0_1_1_2 ) )
            {
            // InternalPagos.g:7016:1: ( ( rule__TerminalValue__ParentAssignment_0_1_1_2 ) )
            // InternalPagos.g:7017:2: ( rule__TerminalValue__ParentAssignment_0_1_1_2 )
            {
             before(grammarAccess.getTerminalValueAccess().getParentAssignment_0_1_1_2()); 
            // InternalPagos.g:7018:2: ( rule__TerminalValue__ParentAssignment_0_1_1_2 )
            // InternalPagos.g:7018:3: rule__TerminalValue__ParentAssignment_0_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__ParentAssignment_0_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getParentAssignment_0_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_1__2__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0_1_1__3"
    // InternalPagos.g:7026:1: rule__TerminalValue__Group_0_1_1__3 : rule__TerminalValue__Group_0_1_1__3__Impl rule__TerminalValue__Group_0_1_1__4 ;
    public final void rule__TerminalValue__Group_0_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7030:1: ( rule__TerminalValue__Group_0_1_1__3__Impl rule__TerminalValue__Group_0_1_1__4 )
            // InternalPagos.g:7031:2: rule__TerminalValue__Group_0_1_1__3__Impl rule__TerminalValue__Group_0_1_1__4
            {
            pushFollow(FOLLOW_46);
            rule__TerminalValue__Group_0_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0_1_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_1__3"


    // $ANTLR start "rule__TerminalValue__Group_0_1_1__3__Impl"
    // InternalPagos.g:7038:1: rule__TerminalValue__Group_0_1_1__3__Impl : ( RULE_DOT ) ;
    public final void rule__TerminalValue__Group_0_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7042:1: ( ( RULE_DOT ) )
            // InternalPagos.g:7043:1: ( RULE_DOT )
            {
            // InternalPagos.g:7043:1: ( RULE_DOT )
            // InternalPagos.g:7044:2: RULE_DOT
            {
             before(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_0_1_1_3()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_0_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_1__3__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0_1_1__4"
    // InternalPagos.g:7053:1: rule__TerminalValue__Group_0_1_1__4 : rule__TerminalValue__Group_0_1_1__4__Impl ;
    public final void rule__TerminalValue__Group_0_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7057:1: ( rule__TerminalValue__Group_0_1_1__4__Impl )
            // InternalPagos.g:7058:2: rule__TerminalValue__Group_0_1_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0_1_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_1__4"


    // $ANTLR start "rule__TerminalValue__Group_0_1_1__4__Impl"
    // InternalPagos.g:7064:1: rule__TerminalValue__Group_0_1_1__4__Impl : ( ( rule__TerminalValue__MethodAssignment_0_1_1_4 ) ) ;
    public final void rule__TerminalValue__Group_0_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7068:1: ( ( ( rule__TerminalValue__MethodAssignment_0_1_1_4 ) ) )
            // InternalPagos.g:7069:1: ( ( rule__TerminalValue__MethodAssignment_0_1_1_4 ) )
            {
            // InternalPagos.g:7069:1: ( ( rule__TerminalValue__MethodAssignment_0_1_1_4 ) )
            // InternalPagos.g:7070:2: ( rule__TerminalValue__MethodAssignment_0_1_1_4 )
            {
             before(grammarAccess.getTerminalValueAccess().getMethodAssignment_0_1_1_4()); 
            // InternalPagos.g:7071:2: ( rule__TerminalValue__MethodAssignment_0_1_1_4 )
            // InternalPagos.g:7071:3: rule__TerminalValue__MethodAssignment_0_1_1_4
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__MethodAssignment_0_1_1_4();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getMethodAssignment_0_1_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1_1__4__Impl"


    // $ANTLR start "rule__TerminalValue__Group_1_0__0"
    // InternalPagos.g:7080:1: rule__TerminalValue__Group_1_0__0 : rule__TerminalValue__Group_1_0__0__Impl rule__TerminalValue__Group_1_0__1 ;
    public final void rule__TerminalValue__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7084:1: ( rule__TerminalValue__Group_1_0__0__Impl rule__TerminalValue__Group_1_0__1 )
            // InternalPagos.g:7085:2: rule__TerminalValue__Group_1_0__0__Impl rule__TerminalValue__Group_1_0__1
            {
            pushFollow(FOLLOW_44);
            rule__TerminalValue__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_0__0"


    // $ANTLR start "rule__TerminalValue__Group_1_0__0__Impl"
    // InternalPagos.g:7092:1: rule__TerminalValue__Group_1_0__0__Impl : ( 'SU' ) ;
    public final void rule__TerminalValue__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7096:1: ( ( 'SU' ) )
            // InternalPagos.g:7097:1: ( 'SU' )
            {
            // InternalPagos.g:7097:1: ( 'SU' )
            // InternalPagos.g:7098:2: 'SU'
            {
             before(grammarAccess.getTerminalValueAccess().getSUKeyword_1_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getSUKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_0__0__Impl"


    // $ANTLR start "rule__TerminalValue__Group_1_0__1"
    // InternalPagos.g:7107:1: rule__TerminalValue__Group_1_0__1 : rule__TerminalValue__Group_1_0__1__Impl rule__TerminalValue__Group_1_0__2 ;
    public final void rule__TerminalValue__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7111:1: ( rule__TerminalValue__Group_1_0__1__Impl rule__TerminalValue__Group_1_0__2 )
            // InternalPagos.g:7112:2: rule__TerminalValue__Group_1_0__1__Impl rule__TerminalValue__Group_1_0__2
            {
            pushFollow(FOLLOW_5);
            rule__TerminalValue__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_0__1"


    // $ANTLR start "rule__TerminalValue__Group_1_0__1__Impl"
    // InternalPagos.g:7119:1: rule__TerminalValue__Group_1_0__1__Impl : ( RULE_DOT ) ;
    public final void rule__TerminalValue__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7123:1: ( ( RULE_DOT ) )
            // InternalPagos.g:7124:1: ( RULE_DOT )
            {
            // InternalPagos.g:7124:1: ( RULE_DOT )
            // InternalPagos.g:7125:2: RULE_DOT
            {
             before(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_1_0_1()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_0__1__Impl"


    // $ANTLR start "rule__TerminalValue__Group_1_0__2"
    // InternalPagos.g:7134:1: rule__TerminalValue__Group_1_0__2 : rule__TerminalValue__Group_1_0__2__Impl rule__TerminalValue__Group_1_0__3 ;
    public final void rule__TerminalValue__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7138:1: ( rule__TerminalValue__Group_1_0__2__Impl rule__TerminalValue__Group_1_0__3 )
            // InternalPagos.g:7139:2: rule__TerminalValue__Group_1_0__2__Impl rule__TerminalValue__Group_1_0__3
            {
            pushFollow(FOLLOW_45);
            rule__TerminalValue__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_0__2"


    // $ANTLR start "rule__TerminalValue__Group_1_0__2__Impl"
    // InternalPagos.g:7146:1: rule__TerminalValue__Group_1_0__2__Impl : ( ( rule__TerminalValue__ParentAssignment_1_0_2 ) ) ;
    public final void rule__TerminalValue__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7150:1: ( ( ( rule__TerminalValue__ParentAssignment_1_0_2 ) ) )
            // InternalPagos.g:7151:1: ( ( rule__TerminalValue__ParentAssignment_1_0_2 ) )
            {
            // InternalPagos.g:7151:1: ( ( rule__TerminalValue__ParentAssignment_1_0_2 ) )
            // InternalPagos.g:7152:2: ( rule__TerminalValue__ParentAssignment_1_0_2 )
            {
             before(grammarAccess.getTerminalValueAccess().getParentAssignment_1_0_2()); 
            // InternalPagos.g:7153:2: ( rule__TerminalValue__ParentAssignment_1_0_2 )
            // InternalPagos.g:7153:3: rule__TerminalValue__ParentAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__ParentAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getParentAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_0__2__Impl"


    // $ANTLR start "rule__TerminalValue__Group_1_0__3"
    // InternalPagos.g:7161:1: rule__TerminalValue__Group_1_0__3 : rule__TerminalValue__Group_1_0__3__Impl rule__TerminalValue__Group_1_0__4 ;
    public final void rule__TerminalValue__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7165:1: ( rule__TerminalValue__Group_1_0__3__Impl rule__TerminalValue__Group_1_0__4 )
            // InternalPagos.g:7166:2: rule__TerminalValue__Group_1_0__3__Impl rule__TerminalValue__Group_1_0__4
            {
            pushFollow(FOLLOW_5);
            rule__TerminalValue__Group_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_1_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_0__3"


    // $ANTLR start "rule__TerminalValue__Group_1_0__3__Impl"
    // InternalPagos.g:7173:1: rule__TerminalValue__Group_1_0__3__Impl : ( RULE_DASH ) ;
    public final void rule__TerminalValue__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7177:1: ( ( RULE_DASH ) )
            // InternalPagos.g:7178:1: ( RULE_DASH )
            {
            // InternalPagos.g:7178:1: ( RULE_DASH )
            // InternalPagos.g:7179:2: RULE_DASH
            {
             before(grammarAccess.getTerminalValueAccess().getDASHTerminalRuleCall_1_0_3()); 
            match(input,RULE_DASH,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDASHTerminalRuleCall_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_0__3__Impl"


    // $ANTLR start "rule__TerminalValue__Group_1_0__4"
    // InternalPagos.g:7188:1: rule__TerminalValue__Group_1_0__4 : rule__TerminalValue__Group_1_0__4__Impl ;
    public final void rule__TerminalValue__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7192:1: ( rule__TerminalValue__Group_1_0__4__Impl )
            // InternalPagos.g:7193:2: rule__TerminalValue__Group_1_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_1_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_0__4"


    // $ANTLR start "rule__TerminalValue__Group_1_0__4__Impl"
    // InternalPagos.g:7199:1: rule__TerminalValue__Group_1_0__4__Impl : ( ( rule__TerminalValue__VariableAssignment_1_0_4 ) ) ;
    public final void rule__TerminalValue__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7203:1: ( ( ( rule__TerminalValue__VariableAssignment_1_0_4 ) ) )
            // InternalPagos.g:7204:1: ( ( rule__TerminalValue__VariableAssignment_1_0_4 ) )
            {
            // InternalPagos.g:7204:1: ( ( rule__TerminalValue__VariableAssignment_1_0_4 ) )
            // InternalPagos.g:7205:2: ( rule__TerminalValue__VariableAssignment_1_0_4 )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableAssignment_1_0_4()); 
            // InternalPagos.g:7206:2: ( rule__TerminalValue__VariableAssignment_1_0_4 )
            // InternalPagos.g:7206:3: rule__TerminalValue__VariableAssignment_1_0_4
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__VariableAssignment_1_0_4();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getVariableAssignment_1_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_0__4__Impl"


    // $ANTLR start "rule__TerminalValue__Group_1_1__0"
    // InternalPagos.g:7215:1: rule__TerminalValue__Group_1_1__0 : rule__TerminalValue__Group_1_1__0__Impl rule__TerminalValue__Group_1_1__1 ;
    public final void rule__TerminalValue__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7219:1: ( rule__TerminalValue__Group_1_1__0__Impl rule__TerminalValue__Group_1_1__1 )
            // InternalPagos.g:7220:2: rule__TerminalValue__Group_1_1__0__Impl rule__TerminalValue__Group_1_1__1
            {
            pushFollow(FOLLOW_44);
            rule__TerminalValue__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_1__0"


    // $ANTLR start "rule__TerminalValue__Group_1_1__0__Impl"
    // InternalPagos.g:7227:1: rule__TerminalValue__Group_1_1__0__Impl : ( 'SU' ) ;
    public final void rule__TerminalValue__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7231:1: ( ( 'SU' ) )
            // InternalPagos.g:7232:1: ( 'SU' )
            {
            // InternalPagos.g:7232:1: ( 'SU' )
            // InternalPagos.g:7233:2: 'SU'
            {
             before(grammarAccess.getTerminalValueAccess().getSUKeyword_1_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getSUKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_1__0__Impl"


    // $ANTLR start "rule__TerminalValue__Group_1_1__1"
    // InternalPagos.g:7242:1: rule__TerminalValue__Group_1_1__1 : rule__TerminalValue__Group_1_1__1__Impl rule__TerminalValue__Group_1_1__2 ;
    public final void rule__TerminalValue__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7246:1: ( rule__TerminalValue__Group_1_1__1__Impl rule__TerminalValue__Group_1_1__2 )
            // InternalPagos.g:7247:2: rule__TerminalValue__Group_1_1__1__Impl rule__TerminalValue__Group_1_1__2
            {
            pushFollow(FOLLOW_5);
            rule__TerminalValue__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_1__1"


    // $ANTLR start "rule__TerminalValue__Group_1_1__1__Impl"
    // InternalPagos.g:7254:1: rule__TerminalValue__Group_1_1__1__Impl : ( RULE_DOT ) ;
    public final void rule__TerminalValue__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7258:1: ( ( RULE_DOT ) )
            // InternalPagos.g:7259:1: ( RULE_DOT )
            {
            // InternalPagos.g:7259:1: ( RULE_DOT )
            // InternalPagos.g:7260:2: RULE_DOT
            {
             before(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_1_1_1()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_1__1__Impl"


    // $ANTLR start "rule__TerminalValue__Group_1_1__2"
    // InternalPagos.g:7269:1: rule__TerminalValue__Group_1_1__2 : rule__TerminalValue__Group_1_1__2__Impl rule__TerminalValue__Group_1_1__3 ;
    public final void rule__TerminalValue__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7273:1: ( rule__TerminalValue__Group_1_1__2__Impl rule__TerminalValue__Group_1_1__3 )
            // InternalPagos.g:7274:2: rule__TerminalValue__Group_1_1__2__Impl rule__TerminalValue__Group_1_1__3
            {
            pushFollow(FOLLOW_44);
            rule__TerminalValue__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_1__2"


    // $ANTLR start "rule__TerminalValue__Group_1_1__2__Impl"
    // InternalPagos.g:7281:1: rule__TerminalValue__Group_1_1__2__Impl : ( ( rule__TerminalValue__ParentAssignment_1_1_2 ) ) ;
    public final void rule__TerminalValue__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7285:1: ( ( ( rule__TerminalValue__ParentAssignment_1_1_2 ) ) )
            // InternalPagos.g:7286:1: ( ( rule__TerminalValue__ParentAssignment_1_1_2 ) )
            {
            // InternalPagos.g:7286:1: ( ( rule__TerminalValue__ParentAssignment_1_1_2 ) )
            // InternalPagos.g:7287:2: ( rule__TerminalValue__ParentAssignment_1_1_2 )
            {
             before(grammarAccess.getTerminalValueAccess().getParentAssignment_1_1_2()); 
            // InternalPagos.g:7288:2: ( rule__TerminalValue__ParentAssignment_1_1_2 )
            // InternalPagos.g:7288:3: rule__TerminalValue__ParentAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__ParentAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getParentAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_1__2__Impl"


    // $ANTLR start "rule__TerminalValue__Group_1_1__3"
    // InternalPagos.g:7296:1: rule__TerminalValue__Group_1_1__3 : rule__TerminalValue__Group_1_1__3__Impl rule__TerminalValue__Group_1_1__4 ;
    public final void rule__TerminalValue__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7300:1: ( rule__TerminalValue__Group_1_1__3__Impl rule__TerminalValue__Group_1_1__4 )
            // InternalPagos.g:7301:2: rule__TerminalValue__Group_1_1__3__Impl rule__TerminalValue__Group_1_1__4
            {
            pushFollow(FOLLOW_46);
            rule__TerminalValue__Group_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_1_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_1__3"


    // $ANTLR start "rule__TerminalValue__Group_1_1__3__Impl"
    // InternalPagos.g:7308:1: rule__TerminalValue__Group_1_1__3__Impl : ( RULE_DOT ) ;
    public final void rule__TerminalValue__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7312:1: ( ( RULE_DOT ) )
            // InternalPagos.g:7313:1: ( RULE_DOT )
            {
            // InternalPagos.g:7313:1: ( RULE_DOT )
            // InternalPagos.g:7314:2: RULE_DOT
            {
             before(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_1_1_3()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_1__3__Impl"


    // $ANTLR start "rule__TerminalValue__Group_1_1__4"
    // InternalPagos.g:7323:1: rule__TerminalValue__Group_1_1__4 : rule__TerminalValue__Group_1_1__4__Impl ;
    public final void rule__TerminalValue__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7327:1: ( rule__TerminalValue__Group_1_1__4__Impl )
            // InternalPagos.g:7328:2: rule__TerminalValue__Group_1_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_1_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_1__4"


    // $ANTLR start "rule__TerminalValue__Group_1_1__4__Impl"
    // InternalPagos.g:7334:1: rule__TerminalValue__Group_1_1__4__Impl : ( ( rule__TerminalValue__MethodAssignment_1_1_4 ) ) ;
    public final void rule__TerminalValue__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7338:1: ( ( ( rule__TerminalValue__MethodAssignment_1_1_4 ) ) )
            // InternalPagos.g:7339:1: ( ( rule__TerminalValue__MethodAssignment_1_1_4 ) )
            {
            // InternalPagos.g:7339:1: ( ( rule__TerminalValue__MethodAssignment_1_1_4 ) )
            // InternalPagos.g:7340:2: ( rule__TerminalValue__MethodAssignment_1_1_4 )
            {
             before(grammarAccess.getTerminalValueAccess().getMethodAssignment_1_1_4()); 
            // InternalPagos.g:7341:2: ( rule__TerminalValue__MethodAssignment_1_1_4 )
            // InternalPagos.g:7341:3: rule__TerminalValue__MethodAssignment_1_1_4
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__MethodAssignment_1_1_4();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getMethodAssignment_1_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1_1__4__Impl"


    // $ANTLR start "rule__TerminalValue__Group_2_0__0"
    // InternalPagos.g:7350:1: rule__TerminalValue__Group_2_0__0 : rule__TerminalValue__Group_2_0__0__Impl rule__TerminalValue__Group_2_0__1 ;
    public final void rule__TerminalValue__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7354:1: ( rule__TerminalValue__Group_2_0__0__Impl rule__TerminalValue__Group_2_0__1 )
            // InternalPagos.g:7355:2: rule__TerminalValue__Group_2_0__0__Impl rule__TerminalValue__Group_2_0__1
            {
            pushFollow(FOLLOW_44);
            rule__TerminalValue__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_0__0"


    // $ANTLR start "rule__TerminalValue__Group_2_0__0__Impl"
    // InternalPagos.g:7362:1: rule__TerminalValue__Group_2_0__0__Impl : ( 'IT' ) ;
    public final void rule__TerminalValue__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7366:1: ( ( 'IT' ) )
            // InternalPagos.g:7367:1: ( 'IT' )
            {
            // InternalPagos.g:7367:1: ( 'IT' )
            // InternalPagos.g:7368:2: 'IT'
            {
             before(grammarAccess.getTerminalValueAccess().getITKeyword_2_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getITKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_0__0__Impl"


    // $ANTLR start "rule__TerminalValue__Group_2_0__1"
    // InternalPagos.g:7377:1: rule__TerminalValue__Group_2_0__1 : rule__TerminalValue__Group_2_0__1__Impl rule__TerminalValue__Group_2_0__2 ;
    public final void rule__TerminalValue__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7381:1: ( rule__TerminalValue__Group_2_0__1__Impl rule__TerminalValue__Group_2_0__2 )
            // InternalPagos.g:7382:2: rule__TerminalValue__Group_2_0__1__Impl rule__TerminalValue__Group_2_0__2
            {
            pushFollow(FOLLOW_5);
            rule__TerminalValue__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_0__1"


    // $ANTLR start "rule__TerminalValue__Group_2_0__1__Impl"
    // InternalPagos.g:7389:1: rule__TerminalValue__Group_2_0__1__Impl : ( RULE_DOT ) ;
    public final void rule__TerminalValue__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7393:1: ( ( RULE_DOT ) )
            // InternalPagos.g:7394:1: ( RULE_DOT )
            {
            // InternalPagos.g:7394:1: ( RULE_DOT )
            // InternalPagos.g:7395:2: RULE_DOT
            {
             before(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_2_0_1()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_0__1__Impl"


    // $ANTLR start "rule__TerminalValue__Group_2_0__2"
    // InternalPagos.g:7404:1: rule__TerminalValue__Group_2_0__2 : rule__TerminalValue__Group_2_0__2__Impl rule__TerminalValue__Group_2_0__3 ;
    public final void rule__TerminalValue__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7408:1: ( rule__TerminalValue__Group_2_0__2__Impl rule__TerminalValue__Group_2_0__3 )
            // InternalPagos.g:7409:2: rule__TerminalValue__Group_2_0__2__Impl rule__TerminalValue__Group_2_0__3
            {
            pushFollow(FOLLOW_45);
            rule__TerminalValue__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_2_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_0__2"


    // $ANTLR start "rule__TerminalValue__Group_2_0__2__Impl"
    // InternalPagos.g:7416:1: rule__TerminalValue__Group_2_0__2__Impl : ( ( rule__TerminalValue__ParentAssignment_2_0_2 ) ) ;
    public final void rule__TerminalValue__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7420:1: ( ( ( rule__TerminalValue__ParentAssignment_2_0_2 ) ) )
            // InternalPagos.g:7421:1: ( ( rule__TerminalValue__ParentAssignment_2_0_2 ) )
            {
            // InternalPagos.g:7421:1: ( ( rule__TerminalValue__ParentAssignment_2_0_2 ) )
            // InternalPagos.g:7422:2: ( rule__TerminalValue__ParentAssignment_2_0_2 )
            {
             before(grammarAccess.getTerminalValueAccess().getParentAssignment_2_0_2()); 
            // InternalPagos.g:7423:2: ( rule__TerminalValue__ParentAssignment_2_0_2 )
            // InternalPagos.g:7423:3: rule__TerminalValue__ParentAssignment_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__ParentAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getParentAssignment_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_0__2__Impl"


    // $ANTLR start "rule__TerminalValue__Group_2_0__3"
    // InternalPagos.g:7431:1: rule__TerminalValue__Group_2_0__3 : rule__TerminalValue__Group_2_0__3__Impl rule__TerminalValue__Group_2_0__4 ;
    public final void rule__TerminalValue__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7435:1: ( rule__TerminalValue__Group_2_0__3__Impl rule__TerminalValue__Group_2_0__4 )
            // InternalPagos.g:7436:2: rule__TerminalValue__Group_2_0__3__Impl rule__TerminalValue__Group_2_0__4
            {
            pushFollow(FOLLOW_5);
            rule__TerminalValue__Group_2_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_2_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_0__3"


    // $ANTLR start "rule__TerminalValue__Group_2_0__3__Impl"
    // InternalPagos.g:7443:1: rule__TerminalValue__Group_2_0__3__Impl : ( RULE_DASH ) ;
    public final void rule__TerminalValue__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7447:1: ( ( RULE_DASH ) )
            // InternalPagos.g:7448:1: ( RULE_DASH )
            {
            // InternalPagos.g:7448:1: ( RULE_DASH )
            // InternalPagos.g:7449:2: RULE_DASH
            {
             before(grammarAccess.getTerminalValueAccess().getDASHTerminalRuleCall_2_0_3()); 
            match(input,RULE_DASH,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDASHTerminalRuleCall_2_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_0__3__Impl"


    // $ANTLR start "rule__TerminalValue__Group_2_0__4"
    // InternalPagos.g:7458:1: rule__TerminalValue__Group_2_0__4 : rule__TerminalValue__Group_2_0__4__Impl ;
    public final void rule__TerminalValue__Group_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7462:1: ( rule__TerminalValue__Group_2_0__4__Impl )
            // InternalPagos.g:7463:2: rule__TerminalValue__Group_2_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_2_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_0__4"


    // $ANTLR start "rule__TerminalValue__Group_2_0__4__Impl"
    // InternalPagos.g:7469:1: rule__TerminalValue__Group_2_0__4__Impl : ( ( rule__TerminalValue__VariableAssignment_2_0_4 ) ) ;
    public final void rule__TerminalValue__Group_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7473:1: ( ( ( rule__TerminalValue__VariableAssignment_2_0_4 ) ) )
            // InternalPagos.g:7474:1: ( ( rule__TerminalValue__VariableAssignment_2_0_4 ) )
            {
            // InternalPagos.g:7474:1: ( ( rule__TerminalValue__VariableAssignment_2_0_4 ) )
            // InternalPagos.g:7475:2: ( rule__TerminalValue__VariableAssignment_2_0_4 )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableAssignment_2_0_4()); 
            // InternalPagos.g:7476:2: ( rule__TerminalValue__VariableAssignment_2_0_4 )
            // InternalPagos.g:7476:3: rule__TerminalValue__VariableAssignment_2_0_4
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__VariableAssignment_2_0_4();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getVariableAssignment_2_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_0__4__Impl"


    // $ANTLR start "rule__TerminalValue__Group_2_1__0"
    // InternalPagos.g:7485:1: rule__TerminalValue__Group_2_1__0 : rule__TerminalValue__Group_2_1__0__Impl rule__TerminalValue__Group_2_1__1 ;
    public final void rule__TerminalValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7489:1: ( rule__TerminalValue__Group_2_1__0__Impl rule__TerminalValue__Group_2_1__1 )
            // InternalPagos.g:7490:2: rule__TerminalValue__Group_2_1__0__Impl rule__TerminalValue__Group_2_1__1
            {
            pushFollow(FOLLOW_44);
            rule__TerminalValue__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_1__0"


    // $ANTLR start "rule__TerminalValue__Group_2_1__0__Impl"
    // InternalPagos.g:7497:1: rule__TerminalValue__Group_2_1__0__Impl : ( 'IT' ) ;
    public final void rule__TerminalValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7501:1: ( ( 'IT' ) )
            // InternalPagos.g:7502:1: ( 'IT' )
            {
            // InternalPagos.g:7502:1: ( 'IT' )
            // InternalPagos.g:7503:2: 'IT'
            {
             before(grammarAccess.getTerminalValueAccess().getITKeyword_2_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getITKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_1__0__Impl"


    // $ANTLR start "rule__TerminalValue__Group_2_1__1"
    // InternalPagos.g:7512:1: rule__TerminalValue__Group_2_1__1 : rule__TerminalValue__Group_2_1__1__Impl rule__TerminalValue__Group_2_1__2 ;
    public final void rule__TerminalValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7516:1: ( rule__TerminalValue__Group_2_1__1__Impl rule__TerminalValue__Group_2_1__2 )
            // InternalPagos.g:7517:2: rule__TerminalValue__Group_2_1__1__Impl rule__TerminalValue__Group_2_1__2
            {
            pushFollow(FOLLOW_5);
            rule__TerminalValue__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_1__1"


    // $ANTLR start "rule__TerminalValue__Group_2_1__1__Impl"
    // InternalPagos.g:7524:1: rule__TerminalValue__Group_2_1__1__Impl : ( RULE_DOT ) ;
    public final void rule__TerminalValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7528:1: ( ( RULE_DOT ) )
            // InternalPagos.g:7529:1: ( RULE_DOT )
            {
            // InternalPagos.g:7529:1: ( RULE_DOT )
            // InternalPagos.g:7530:2: RULE_DOT
            {
             before(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_2_1_1()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_1__1__Impl"


    // $ANTLR start "rule__TerminalValue__Group_2_1__2"
    // InternalPagos.g:7539:1: rule__TerminalValue__Group_2_1__2 : rule__TerminalValue__Group_2_1__2__Impl rule__TerminalValue__Group_2_1__3 ;
    public final void rule__TerminalValue__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7543:1: ( rule__TerminalValue__Group_2_1__2__Impl rule__TerminalValue__Group_2_1__3 )
            // InternalPagos.g:7544:2: rule__TerminalValue__Group_2_1__2__Impl rule__TerminalValue__Group_2_1__3
            {
            pushFollow(FOLLOW_44);
            rule__TerminalValue__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_1__2"


    // $ANTLR start "rule__TerminalValue__Group_2_1__2__Impl"
    // InternalPagos.g:7551:1: rule__TerminalValue__Group_2_1__2__Impl : ( ( rule__TerminalValue__ParentAssignment_2_1_2 ) ) ;
    public final void rule__TerminalValue__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7555:1: ( ( ( rule__TerminalValue__ParentAssignment_2_1_2 ) ) )
            // InternalPagos.g:7556:1: ( ( rule__TerminalValue__ParentAssignment_2_1_2 ) )
            {
            // InternalPagos.g:7556:1: ( ( rule__TerminalValue__ParentAssignment_2_1_2 ) )
            // InternalPagos.g:7557:2: ( rule__TerminalValue__ParentAssignment_2_1_2 )
            {
             before(grammarAccess.getTerminalValueAccess().getParentAssignment_2_1_2()); 
            // InternalPagos.g:7558:2: ( rule__TerminalValue__ParentAssignment_2_1_2 )
            // InternalPagos.g:7558:3: rule__TerminalValue__ParentAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__ParentAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getParentAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_1__2__Impl"


    // $ANTLR start "rule__TerminalValue__Group_2_1__3"
    // InternalPagos.g:7566:1: rule__TerminalValue__Group_2_1__3 : rule__TerminalValue__Group_2_1__3__Impl rule__TerminalValue__Group_2_1__4 ;
    public final void rule__TerminalValue__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7570:1: ( rule__TerminalValue__Group_2_1__3__Impl rule__TerminalValue__Group_2_1__4 )
            // InternalPagos.g:7571:2: rule__TerminalValue__Group_2_1__3__Impl rule__TerminalValue__Group_2_1__4
            {
            pushFollow(FOLLOW_46);
            rule__TerminalValue__Group_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_2_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_1__3"


    // $ANTLR start "rule__TerminalValue__Group_2_1__3__Impl"
    // InternalPagos.g:7578:1: rule__TerminalValue__Group_2_1__3__Impl : ( RULE_DOT ) ;
    public final void rule__TerminalValue__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7582:1: ( ( RULE_DOT ) )
            // InternalPagos.g:7583:1: ( RULE_DOT )
            {
            // InternalPagos.g:7583:1: ( RULE_DOT )
            // InternalPagos.g:7584:2: RULE_DOT
            {
             before(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_2_1_3()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_1__3__Impl"


    // $ANTLR start "rule__TerminalValue__Group_2_1__4"
    // InternalPagos.g:7593:1: rule__TerminalValue__Group_2_1__4 : rule__TerminalValue__Group_2_1__4__Impl ;
    public final void rule__TerminalValue__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7597:1: ( rule__TerminalValue__Group_2_1__4__Impl )
            // InternalPagos.g:7598:2: rule__TerminalValue__Group_2_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_2_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_1__4"


    // $ANTLR start "rule__TerminalValue__Group_2_1__4__Impl"
    // InternalPagos.g:7604:1: rule__TerminalValue__Group_2_1__4__Impl : ( ( rule__TerminalValue__MethodAssignment_2_1_4 ) ) ;
    public final void rule__TerminalValue__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7608:1: ( ( ( rule__TerminalValue__MethodAssignment_2_1_4 ) ) )
            // InternalPagos.g:7609:1: ( ( rule__TerminalValue__MethodAssignment_2_1_4 ) )
            {
            // InternalPagos.g:7609:1: ( ( rule__TerminalValue__MethodAssignment_2_1_4 ) )
            // InternalPagos.g:7610:2: ( rule__TerminalValue__MethodAssignment_2_1_4 )
            {
             before(grammarAccess.getTerminalValueAccess().getMethodAssignment_2_1_4()); 
            // InternalPagos.g:7611:2: ( rule__TerminalValue__MethodAssignment_2_1_4 )
            // InternalPagos.g:7611:3: rule__TerminalValue__MethodAssignment_2_1_4
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__MethodAssignment_2_1_4();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getMethodAssignment_2_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2_1__4__Impl"


    // $ANTLR start "rule__TerminalValue__Group_3__0"
    // InternalPagos.g:7620:1: rule__TerminalValue__Group_3__0 : rule__TerminalValue__Group_3__0__Impl rule__TerminalValue__Group_3__1 ;
    public final void rule__TerminalValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7624:1: ( rule__TerminalValue__Group_3__0__Impl rule__TerminalValue__Group_3__1 )
            // InternalPagos.g:7625:2: rule__TerminalValue__Group_3__0__Impl rule__TerminalValue__Group_3__1
            {
            pushFollow(FOLLOW_44);
            rule__TerminalValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_3__0"


    // $ANTLR start "rule__TerminalValue__Group_3__0__Impl"
    // InternalPagos.g:7632:1: rule__TerminalValue__Group_3__0__Impl : ( 'FU' ) ;
    public final void rule__TerminalValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7636:1: ( ( 'FU' ) )
            // InternalPagos.g:7637:1: ( 'FU' )
            {
            // InternalPagos.g:7637:1: ( 'FU' )
            // InternalPagos.g:7638:2: 'FU'
            {
             before(grammarAccess.getTerminalValueAccess().getFUKeyword_3_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getFUKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_3__0__Impl"


    // $ANTLR start "rule__TerminalValue__Group_3__1"
    // InternalPagos.g:7647:1: rule__TerminalValue__Group_3__1 : rule__TerminalValue__Group_3__1__Impl rule__TerminalValue__Group_3__2 ;
    public final void rule__TerminalValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7651:1: ( rule__TerminalValue__Group_3__1__Impl rule__TerminalValue__Group_3__2 )
            // InternalPagos.g:7652:2: rule__TerminalValue__Group_3__1__Impl rule__TerminalValue__Group_3__2
            {
            pushFollow(FOLLOW_5);
            rule__TerminalValue__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_3__1"


    // $ANTLR start "rule__TerminalValue__Group_3__1__Impl"
    // InternalPagos.g:7659:1: rule__TerminalValue__Group_3__1__Impl : ( RULE_DOT ) ;
    public final void rule__TerminalValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7663:1: ( ( RULE_DOT ) )
            // InternalPagos.g:7664:1: ( RULE_DOT )
            {
            // InternalPagos.g:7664:1: ( RULE_DOT )
            // InternalPagos.g:7665:2: RULE_DOT
            {
             before(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_3_1()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_3__1__Impl"


    // $ANTLR start "rule__TerminalValue__Group_3__2"
    // InternalPagos.g:7674:1: rule__TerminalValue__Group_3__2 : rule__TerminalValue__Group_3__2__Impl ;
    public final void rule__TerminalValue__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7678:1: ( rule__TerminalValue__Group_3__2__Impl )
            // InternalPagos.g:7679:2: rule__TerminalValue__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_3__2"


    // $ANTLR start "rule__TerminalValue__Group_3__2__Impl"
    // InternalPagos.g:7685:1: rule__TerminalValue__Group_3__2__Impl : ( ( rule__TerminalValue__ParentAssignment_3_2 ) ) ;
    public final void rule__TerminalValue__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7689:1: ( ( ( rule__TerminalValue__ParentAssignment_3_2 ) ) )
            // InternalPagos.g:7690:1: ( ( rule__TerminalValue__ParentAssignment_3_2 ) )
            {
            // InternalPagos.g:7690:1: ( ( rule__TerminalValue__ParentAssignment_3_2 ) )
            // InternalPagos.g:7691:2: ( rule__TerminalValue__ParentAssignment_3_2 )
            {
             before(grammarAccess.getTerminalValueAccess().getParentAssignment_3_2()); 
            // InternalPagos.g:7692:2: ( rule__TerminalValue__ParentAssignment_3_2 )
            // InternalPagos.g:7692:3: rule__TerminalValue__ParentAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__ParentAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getParentAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_3__2__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalPagos.g:7701:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7705:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalPagos.g:7706:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalPagos.g:7713:1: rule__EDouble__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7717:1: ( ( ( RULE_INT )? ) )
            // InternalPagos.g:7718:1: ( ( RULE_INT )? )
            {
            // InternalPagos.g:7718:1: ( ( RULE_INT )? )
            // InternalPagos.g:7719:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            // InternalPagos.g:7720:2: ( RULE_INT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPagos.g:7720:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalPagos.g:7728:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7732:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalPagos.g:7733:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalPagos.g:7740:1: rule__EDouble__Group__1__Impl : ( RULE_DOT ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7744:1: ( ( RULE_DOT ) )
            // InternalPagos.g:7745:1: ( RULE_DOT )
            {
            // InternalPagos.g:7745:1: ( RULE_DOT )
            // InternalPagos.g:7746:2: RULE_DOT
            {
             before(grammarAccess.getEDoubleAccess().getDOTTerminalRuleCall_1()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getDOTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalPagos.g:7755:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7759:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalPagos.g:7760:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalPagos.g:7767:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7771:1: ( ( RULE_INT ) )
            // InternalPagos.g:7772:1: ( RULE_INT )
            {
            // InternalPagos.g:7772:1: ( RULE_INT )
            // InternalPagos.g:7773:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalPagos.g:7782:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7786:1: ( rule__EDouble__Group__3__Impl )
            // InternalPagos.g:7787:2: rule__EDouble__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalPagos.g:7793:1: rule__EDouble__Group__3__Impl : ( ( rule__EDouble__Group_3__0 )? ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7797:1: ( ( ( rule__EDouble__Group_3__0 )? ) )
            // InternalPagos.g:7798:1: ( ( rule__EDouble__Group_3__0 )? )
            {
            // InternalPagos.g:7798:1: ( ( rule__EDouble__Group_3__0 )? )
            // InternalPagos.g:7799:2: ( rule__EDouble__Group_3__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_3()); 
            // InternalPagos.g:7800:2: ( rule__EDouble__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=33 && LA39_0<=34)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPagos.g:7800:3: rule__EDouble__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group_3__0"
    // InternalPagos.g:7809:1: rule__EDouble__Group_3__0 : rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 ;
    public final void rule__EDouble__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7813:1: ( rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 )
            // InternalPagos.g:7814:2: rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1
            {
            pushFollow(FOLLOW_48);
            rule__EDouble__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_3__0"


    // $ANTLR start "rule__EDouble__Group_3__0__Impl"
    // InternalPagos.g:7821:1: rule__EDouble__Group_3__0__Impl : ( ( rule__EDouble__Alternatives_3_0 ) ) ;
    public final void rule__EDouble__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7825:1: ( ( ( rule__EDouble__Alternatives_3_0 ) ) )
            // InternalPagos.g:7826:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            {
            // InternalPagos.g:7826:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            // InternalPagos.g:7827:2: ( rule__EDouble__Alternatives_3_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 
            // InternalPagos.g:7828:2: ( rule__EDouble__Alternatives_3_0 )
            // InternalPagos.g:7828:3: rule__EDouble__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_3__0__Impl"


    // $ANTLR start "rule__EDouble__Group_3__1"
    // InternalPagos.g:7836:1: rule__EDouble__Group_3__1 : rule__EDouble__Group_3__1__Impl ;
    public final void rule__EDouble__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7840:1: ( rule__EDouble__Group_3__1__Impl )
            // InternalPagos.g:7841:2: rule__EDouble__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_3__1"


    // $ANTLR start "rule__EDouble__Group_3__1__Impl"
    // InternalPagos.g:7847:1: rule__EDouble__Group_3__1__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7851:1: ( ( RULE_INT ) )
            // InternalPagos.g:7852:1: ( RULE_INT )
            {
            // InternalPagos.g:7852:1: ( RULE_INT )
            // InternalPagos.g:7853:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_3__1__Impl"


    // $ANTLR start "rule__Application__NameAssignment_3"
    // InternalPagos.g:7863:1: rule__Application__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7867:1: ( ( RULE_ID ) )
            // InternalPagos.g:7868:2: ( RULE_ID )
            {
            // InternalPagos.g:7868:2: ( RULE_ID )
            // InternalPagos.g:7869:3: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__NameAssignment_3"


    // $ANTLR start "rule__Application__IntermediaryAssignment_7"
    // InternalPagos.g:7878:1: rule__Application__IntermediaryAssignment_7 : ( ruleIntermediary ) ;
    public final void rule__Application__IntermediaryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7882:1: ( ( ruleIntermediary ) )
            // InternalPagos.g:7883:2: ( ruleIntermediary )
            {
            // InternalPagos.g:7883:2: ( ruleIntermediary )
            // InternalPagos.g:7884:3: ruleIntermediary
            {
             before(grammarAccess.getApplicationAccess().getIntermediaryIntermediaryParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleIntermediary();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getIntermediaryIntermediaryParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__IntermediaryAssignment_7"


    // $ANTLR start "rule__Intermediary__NameAssignment_4"
    // InternalPagos.g:7893:1: rule__Intermediary__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Intermediary__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7897:1: ( ( RULE_ID ) )
            // InternalPagos.g:7898:2: ( RULE_ID )
            {
            // InternalPagos.g:7898:2: ( RULE_ID )
            // InternalPagos.g:7899:3: RULE_ID
            {
             before(grammarAccess.getIntermediaryAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntermediaryAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__NameAssignment_4"


    // $ANTLR start "rule__Intermediary__SuperentitiesAssignment_9"
    // InternalPagos.g:7908:1: rule__Intermediary__SuperentitiesAssignment_9 : ( ruleSuperEntity ) ;
    public final void rule__Intermediary__SuperentitiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7912:1: ( ( ruleSuperEntity ) )
            // InternalPagos.g:7913:2: ( ruleSuperEntity )
            {
            // InternalPagos.g:7913:2: ( ruleSuperEntity )
            // InternalPagos.g:7914:3: ruleSuperEntity
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitiesSuperEntityParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleSuperEntity();

            state._fsp--;

             after(grammarAccess.getIntermediaryAccess().getSuperentitiesSuperEntityParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__SuperentitiesAssignment_9"


    // $ANTLR start "rule__Intermediary__SuperentitiesAssignment_10_1"
    // InternalPagos.g:7923:1: rule__Intermediary__SuperentitiesAssignment_10_1 : ( ruleSuperEntity ) ;
    public final void rule__Intermediary__SuperentitiesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7927:1: ( ( ruleSuperEntity ) )
            // InternalPagos.g:7928:2: ( ruleSuperEntity )
            {
            // InternalPagos.g:7928:2: ( ruleSuperEntity )
            // InternalPagos.g:7929:3: ruleSuperEntity
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitiesSuperEntityParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSuperEntity();

            state._fsp--;

             after(grammarAccess.getIntermediaryAccess().getSuperentitiesSuperEntityParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__SuperentitiesAssignment_10_1"


    // $ANTLR start "rule__SuperEntity__NameAssignment_4"
    // InternalPagos.g:7938:1: rule__SuperEntity__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__SuperEntity__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7942:1: ( ( RULE_ID ) )
            // InternalPagos.g:7943:2: ( RULE_ID )
            {
            // InternalPagos.g:7943:2: ( RULE_ID )
            // InternalPagos.g:7944:3: RULE_ID
            {
             before(grammarAccess.getSuperEntityAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__NameAssignment_4"


    // $ANTLR start "rule__SuperEntity__DescriptionAssignment_8"
    // InternalPagos.g:7953:1: rule__SuperEntity__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__SuperEntity__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7957:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7958:2: ( RULE_STRING )
            {
            // InternalPagos.g:7958:2: ( RULE_STRING )
            // InternalPagos.g:7959:3: RULE_STRING
            {
             before(grammarAccess.getSuperEntityAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__DescriptionAssignment_8"


    // $ANTLR start "rule__SuperEntity__AttListsAssignment_13"
    // InternalPagos.g:7968:1: rule__SuperEntity__AttListsAssignment_13 : ( ruleBusinessAttribute ) ;
    public final void rule__SuperEntity__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7972:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7973:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7973:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7974:3: ruleBusinessAttribute
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsBusinessAttributeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleBusinessAttribute();

            state._fsp--;

             after(grammarAccess.getSuperEntityAccess().getAttListsBusinessAttributeParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__AttListsAssignment_13"


    // $ANTLR start "rule__SuperEntity__AttListsAssignment_14_1"
    // InternalPagos.g:7983:1: rule__SuperEntity__AttListsAssignment_14_1 : ( ruleBusinessAttribute ) ;
    public final void rule__SuperEntity__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7987:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7988:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7988:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7989:3: ruleBusinessAttribute
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsBusinessAttributeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBusinessAttribute();

            state._fsp--;

             after(grammarAccess.getSuperEntityAccess().getAttListsBusinessAttributeParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__AttListsAssignment_14_1"


    // $ANTLR start "rule__SuperEntity__ParticipantsAssignment_20"
    // InternalPagos.g:7998:1: rule__SuperEntity__ParticipantsAssignment_20 : ( ruleParticipant ) ;
    public final void rule__SuperEntity__ParticipantsAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8002:1: ( ( ruleParticipant ) )
            // InternalPagos.g:8003:2: ( ruleParticipant )
            {
            // InternalPagos.g:8003:2: ( ruleParticipant )
            // InternalPagos.g:8004:3: ruleParticipant
            {
             before(grammarAccess.getSuperEntityAccess().getParticipantsParticipantParserRuleCall_20_0()); 
            pushFollow(FOLLOW_2);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getSuperEntityAccess().getParticipantsParticipantParserRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__ParticipantsAssignment_20"


    // $ANTLR start "rule__SuperEntity__ParticipantsAssignment_21_1"
    // InternalPagos.g:8013:1: rule__SuperEntity__ParticipantsAssignment_21_1 : ( ruleParticipant ) ;
    public final void rule__SuperEntity__ParticipantsAssignment_21_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8017:1: ( ( ruleParticipant ) )
            // InternalPagos.g:8018:2: ( ruleParticipant )
            {
            // InternalPagos.g:8018:2: ( ruleParticipant )
            // InternalPagos.g:8019:3: ruleParticipant
            {
             before(grammarAccess.getSuperEntityAccess().getParticipantsParticipantParserRuleCall_21_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getSuperEntityAccess().getParticipantsParticipantParserRuleCall_21_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__ParticipantsAssignment_21_1"


    // $ANTLR start "rule__Participant__NameAssignment_4"
    // InternalPagos.g:8028:1: rule__Participant__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Participant__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8032:1: ( ( RULE_ID ) )
            // InternalPagos.g:8033:2: ( RULE_ID )
            {
            // InternalPagos.g:8033:2: ( RULE_ID )
            // InternalPagos.g:8034:3: RULE_ID
            {
             before(grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__NameAssignment_4"


    // $ANTLR start "rule__Participant__DescriptionAssignment_8"
    // InternalPagos.g:8043:1: rule__Participant__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Participant__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8047:1: ( ( RULE_STRING ) )
            // InternalPagos.g:8048:2: ( RULE_STRING )
            {
            // InternalPagos.g:8048:2: ( RULE_STRING )
            // InternalPagos.g:8049:3: RULE_STRING
            {
             before(grammarAccess.getParticipantAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__DescriptionAssignment_8"


    // $ANTLR start "rule__Participant__AttListsAssignment_13"
    // InternalPagos.g:8058:1: rule__Participant__AttListsAssignment_13 : ( ruleBusinessAttribute ) ;
    public final void rule__Participant__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8062:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:8063:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:8063:2: ( ruleBusinessAttribute )
            // InternalPagos.g:8064:3: ruleBusinessAttribute
            {
             before(grammarAccess.getParticipantAccess().getAttListsBusinessAttributeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleBusinessAttribute();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getAttListsBusinessAttributeParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__AttListsAssignment_13"


    // $ANTLR start "rule__Participant__AttListsAssignment_14_1"
    // InternalPagos.g:8073:1: rule__Participant__AttListsAssignment_14_1 : ( ruleBusinessAttribute ) ;
    public final void rule__Participant__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8077:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:8078:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:8078:2: ( ruleBusinessAttribute )
            // InternalPagos.g:8079:3: ruleBusinessAttribute
            {
             before(grammarAccess.getParticipantAccess().getAttListsBusinessAttributeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBusinessAttribute();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getAttListsBusinessAttributeParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__AttListsAssignment_14_1"


    // $ANTLR start "rule__Participant__TemplatesFormsAssignment_17_4"
    // InternalPagos.g:8088:1: rule__Participant__TemplatesFormsAssignment_17_4 : ( ruleInformationTemplate ) ;
    public final void rule__Participant__TemplatesFormsAssignment_17_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8092:1: ( ( ruleInformationTemplate ) )
            // InternalPagos.g:8093:2: ( ruleInformationTemplate )
            {
            // InternalPagos.g:8093:2: ( ruleInformationTemplate )
            // InternalPagos.g:8094:3: ruleInformationTemplate
            {
             before(grammarAccess.getParticipantAccess().getTemplatesFormsInformationTemplateParserRuleCall_17_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInformationTemplate();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getTemplatesFormsInformationTemplateParserRuleCall_17_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__TemplatesFormsAssignment_17_4"


    // $ANTLR start "rule__Participant__TemplatesFormsAssignment_17_5_1"
    // InternalPagos.g:8103:1: rule__Participant__TemplatesFormsAssignment_17_5_1 : ( ruleInformationTemplate ) ;
    public final void rule__Participant__TemplatesFormsAssignment_17_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8107:1: ( ( ruleInformationTemplate ) )
            // InternalPagos.g:8108:2: ( ruleInformationTemplate )
            {
            // InternalPagos.g:8108:2: ( ruleInformationTemplate )
            // InternalPagos.g:8109:3: ruleInformationTemplate
            {
             before(grammarAccess.getParticipantAccess().getTemplatesFormsInformationTemplateParserRuleCall_17_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInformationTemplate();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getTemplatesFormsInformationTemplateParserRuleCall_17_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__TemplatesFormsAssignment_17_5_1"


    // $ANTLR start "rule__Provider__NameAssignment_4"
    // InternalPagos.g:8118:1: rule__Provider__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Provider__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8122:1: ( ( RULE_ID ) )
            // InternalPagos.g:8123:2: ( RULE_ID )
            {
            // InternalPagos.g:8123:2: ( RULE_ID )
            // InternalPagos.g:8124:3: RULE_ID
            {
             before(grammarAccess.getProviderAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__NameAssignment_4"


    // $ANTLR start "rule__Provider__DescriptionAssignment_8"
    // InternalPagos.g:8133:1: rule__Provider__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Provider__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8137:1: ( ( RULE_STRING ) )
            // InternalPagos.g:8138:2: ( RULE_STRING )
            {
            // InternalPagos.g:8138:2: ( RULE_STRING )
            // InternalPagos.g:8139:3: RULE_STRING
            {
             before(grammarAccess.getProviderAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__DescriptionAssignment_8"


    // $ANTLR start "rule__Provider__AttListsAssignment_13"
    // InternalPagos.g:8148:1: rule__Provider__AttListsAssignment_13 : ( ruleBusinessAttribute ) ;
    public final void rule__Provider__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8152:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:8153:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:8153:2: ( ruleBusinessAttribute )
            // InternalPagos.g:8154:3: ruleBusinessAttribute
            {
             before(grammarAccess.getProviderAccess().getAttListsBusinessAttributeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleBusinessAttribute();

            state._fsp--;

             after(grammarAccess.getProviderAccess().getAttListsBusinessAttributeParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__AttListsAssignment_13"


    // $ANTLR start "rule__Provider__AttListsAssignment_14_1"
    // InternalPagos.g:8163:1: rule__Provider__AttListsAssignment_14_1 : ( ruleBusinessAttribute ) ;
    public final void rule__Provider__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8167:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:8168:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:8168:2: ( ruleBusinessAttribute )
            // InternalPagos.g:8169:3: ruleBusinessAttribute
            {
             before(grammarAccess.getProviderAccess().getAttListsBusinessAttributeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBusinessAttribute();

            state._fsp--;

             after(grammarAccess.getProviderAccess().getAttListsBusinessAttributeParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__AttListsAssignment_14_1"


    // $ANTLR start "rule__InformationTemplate__NameAssignment_4"
    // InternalPagos.g:8178:1: rule__InformationTemplate__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__InformationTemplate__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8182:1: ( ( RULE_ID ) )
            // InternalPagos.g:8183:2: ( RULE_ID )
            {
            // InternalPagos.g:8183:2: ( RULE_ID )
            // InternalPagos.g:8184:3: RULE_ID
            {
             before(grammarAccess.getInformationTemplateAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__NameAssignment_4"


    // $ANTLR start "rule__InformationTemplate__DescriptionAssignment_8"
    // InternalPagos.g:8193:1: rule__InformationTemplate__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__InformationTemplate__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8197:1: ( ( RULE_STRING ) )
            // InternalPagos.g:8198:2: ( RULE_STRING )
            {
            // InternalPagos.g:8198:2: ( RULE_STRING )
            // InternalPagos.g:8199:3: RULE_STRING
            {
             before(grammarAccess.getInformationTemplateAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__DescriptionAssignment_8"


    // $ANTLR start "rule__InformationTemplate__AttListsAssignment_13"
    // InternalPagos.g:8208:1: rule__InformationTemplate__AttListsAssignment_13 : ( ruleBusinessAttribute ) ;
    public final void rule__InformationTemplate__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8212:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:8213:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:8213:2: ( ruleBusinessAttribute )
            // InternalPagos.g:8214:3: ruleBusinessAttribute
            {
             before(grammarAccess.getInformationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleBusinessAttribute();

            state._fsp--;

             after(grammarAccess.getInformationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__AttListsAssignment_13"


    // $ANTLR start "rule__InformationTemplate__AttListsAssignment_14_1"
    // InternalPagos.g:8223:1: rule__InformationTemplate__AttListsAssignment_14_1 : ( ruleBusinessAttribute ) ;
    public final void rule__InformationTemplate__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8227:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:8228:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:8228:2: ( ruleBusinessAttribute )
            // InternalPagos.g:8229:3: ruleBusinessAttribute
            {
             before(grammarAccess.getInformationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBusinessAttribute();

            state._fsp--;

             after(grammarAccess.getInformationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__AttListsAssignment_14_1"


    // $ANTLR start "rule__InformationTemplate__TemplateCalcAssignment_17_2"
    // InternalPagos.g:8238:1: rule__InformationTemplate__TemplateCalcAssignment_17_2 : ( RULE_ID ) ;
    public final void rule__InformationTemplate__TemplateCalcAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8242:1: ( ( RULE_ID ) )
            // InternalPagos.g:8243:2: ( RULE_ID )
            {
            // InternalPagos.g:8243:2: ( RULE_ID )
            // InternalPagos.g:8244:3: RULE_ID
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplateCalcIDTerminalRuleCall_17_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getTemplateCalcIDTerminalRuleCall_17_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__TemplateCalcAssignment_17_2"


    // $ANTLR start "rule__InformationTemplate__TemplatesAssignment_17_5"
    // InternalPagos.g:8253:1: rule__InformationTemplate__TemplatesAssignment_17_5 : ( ruleCalculationTemplate ) ;
    public final void rule__InformationTemplate__TemplatesAssignment_17_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8257:1: ( ( ruleCalculationTemplate ) )
            // InternalPagos.g:8258:2: ( ruleCalculationTemplate )
            {
            // InternalPagos.g:8258:2: ( ruleCalculationTemplate )
            // InternalPagos.g:8259:3: ruleCalculationTemplate
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplatesCalculationTemplateParserRuleCall_17_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCalculationTemplate();

            state._fsp--;

             after(grammarAccess.getInformationTemplateAccess().getTemplatesCalculationTemplateParserRuleCall_17_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__TemplatesAssignment_17_5"


    // $ANTLR start "rule__InformationTemplate__TemplatesAssignment_17_6_1"
    // InternalPagos.g:8268:1: rule__InformationTemplate__TemplatesAssignment_17_6_1 : ( ruleCalculationTemplate ) ;
    public final void rule__InformationTemplate__TemplatesAssignment_17_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8272:1: ( ( ruleCalculationTemplate ) )
            // InternalPagos.g:8273:2: ( ruleCalculationTemplate )
            {
            // InternalPagos.g:8273:2: ( ruleCalculationTemplate )
            // InternalPagos.g:8274:3: ruleCalculationTemplate
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplatesCalculationTemplateParserRuleCall_17_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCalculationTemplate();

            state._fsp--;

             after(grammarAccess.getInformationTemplateAccess().getTemplatesCalculationTemplateParserRuleCall_17_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__TemplatesAssignment_17_6_1"


    // $ANTLR start "rule__InformationTemplate__ProvidersAssignment_18_4"
    // InternalPagos.g:8283:1: rule__InformationTemplate__ProvidersAssignment_18_4 : ( ruleProvider ) ;
    public final void rule__InformationTemplate__ProvidersAssignment_18_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8287:1: ( ( ruleProvider ) )
            // InternalPagos.g:8288:2: ( ruleProvider )
            {
            // InternalPagos.g:8288:2: ( ruleProvider )
            // InternalPagos.g:8289:3: ruleProvider
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersProviderParserRuleCall_18_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProvider();

            state._fsp--;

             after(grammarAccess.getInformationTemplateAccess().getProvidersProviderParserRuleCall_18_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__ProvidersAssignment_18_4"


    // $ANTLR start "rule__InformationTemplate__ProvidersAssignment_18_5_1"
    // InternalPagos.g:8298:1: rule__InformationTemplate__ProvidersAssignment_18_5_1 : ( ruleProvider ) ;
    public final void rule__InformationTemplate__ProvidersAssignment_18_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8302:1: ( ( ruleProvider ) )
            // InternalPagos.g:8303:2: ( ruleProvider )
            {
            // InternalPagos.g:8303:2: ( ruleProvider )
            // InternalPagos.g:8304:3: ruleProvider
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersProviderParserRuleCall_18_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProvider();

            state._fsp--;

             after(grammarAccess.getInformationTemplateAccess().getProvidersProviderParserRuleCall_18_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__ProvidersAssignment_18_5_1"


    // $ANTLR start "rule__CalculationTemplate__NameAssignment_4"
    // InternalPagos.g:8313:1: rule__CalculationTemplate__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__CalculationTemplate__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8317:1: ( ( RULE_ID ) )
            // InternalPagos.g:8318:2: ( RULE_ID )
            {
            // InternalPagos.g:8318:2: ( RULE_ID )
            // InternalPagos.g:8319:3: RULE_ID
            {
             before(grammarAccess.getCalculationTemplateAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__NameAssignment_4"


    // $ANTLR start "rule__CalculationTemplate__DescriptionAssignment_8"
    // InternalPagos.g:8328:1: rule__CalculationTemplate__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__CalculationTemplate__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8332:1: ( ( RULE_STRING ) )
            // InternalPagos.g:8333:2: ( RULE_STRING )
            {
            // InternalPagos.g:8333:2: ( RULE_STRING )
            // InternalPagos.g:8334:3: RULE_STRING
            {
             before(grammarAccess.getCalculationTemplateAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__DescriptionAssignment_8"


    // $ANTLR start "rule__CalculationTemplate__AttListsAssignment_9_4"
    // InternalPagos.g:8343:1: rule__CalculationTemplate__AttListsAssignment_9_4 : ( ruleBusinessAttribute ) ;
    public final void rule__CalculationTemplate__AttListsAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8347:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:8348:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:8348:2: ( ruleBusinessAttribute )
            // InternalPagos.g:8349:3: ruleBusinessAttribute
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_9_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBusinessAttribute();

            state._fsp--;

             after(grammarAccess.getCalculationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_9_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__AttListsAssignment_9_4"


    // $ANTLR start "rule__CalculationTemplate__AttListsAssignment_9_5_1"
    // InternalPagos.g:8358:1: rule__CalculationTemplate__AttListsAssignment_9_5_1 : ( ruleBusinessAttribute ) ;
    public final void rule__CalculationTemplate__AttListsAssignment_9_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8362:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:8363:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:8363:2: ( ruleBusinessAttribute )
            // InternalPagos.g:8364:3: ruleBusinessAttribute
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_9_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBusinessAttribute();

            state._fsp--;

             after(grammarAccess.getCalculationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_9_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__AttListsAssignment_9_5_1"


    // $ANTLR start "rule__CalculationTemplate__FormulasAssignment_13"
    // InternalPagos.g:8373:1: rule__CalculationTemplate__FormulasAssignment_13 : ( ruleFormula ) ;
    public final void rule__CalculationTemplate__FormulasAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8377:1: ( ( ruleFormula ) )
            // InternalPagos.g:8378:2: ( ruleFormula )
            {
            // InternalPagos.g:8378:2: ( ruleFormula )
            // InternalPagos.g:8379:3: ruleFormula
            {
             before(grammarAccess.getCalculationTemplateAccess().getFormulasFormulaParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getCalculationTemplateAccess().getFormulasFormulaParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__FormulasAssignment_13"


    // $ANTLR start "rule__Formula__FormulaBodyAssignment_0_1"
    // InternalPagos.g:8388:1: rule__Formula__FormulaBodyAssignment_0_1 : ( ruleIfBlock ) ;
    public final void rule__Formula__FormulaBodyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8392:1: ( ( ruleIfBlock ) )
            // InternalPagos.g:8393:2: ( ruleIfBlock )
            {
            // InternalPagos.g:8393:2: ( ruleIfBlock )
            // InternalPagos.g:8394:3: ruleIfBlock
            {
             before(grammarAccess.getFormulaAccess().getFormulaBodyIfBlockParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIfBlock();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getFormulaBodyIfBlockParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__FormulaBodyAssignment_0_1"


    // $ANTLR start "rule__Formula__FormulaReturnAssignment_1"
    // InternalPagos.g:8403:1: rule__Formula__FormulaReturnAssignment_1 : ( ruleReturnBlock ) ;
    public final void rule__Formula__FormulaReturnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8407:1: ( ( ruleReturnBlock ) )
            // InternalPagos.g:8408:2: ( ruleReturnBlock )
            {
            // InternalPagos.g:8408:2: ( ruleReturnBlock )
            // InternalPagos.g:8409:3: ruleReturnBlock
            {
             before(grammarAccess.getFormulaAccess().getFormulaReturnReturnBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReturnBlock();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getFormulaReturnReturnBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__FormulaReturnAssignment_1"


    // $ANTLR start "rule__IfBlock__IfSentenceAssignment_1"
    // InternalPagos.g:8418:1: rule__IfBlock__IfSentenceAssignment_1 : ( ruleIfCondition ) ;
    public final void rule__IfBlock__IfSentenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8422:1: ( ( ruleIfCondition ) )
            // InternalPagos.g:8423:2: ( ruleIfCondition )
            {
            // InternalPagos.g:8423:2: ( ruleIfCondition )
            // InternalPagos.g:8424:3: ruleIfCondition
            {
             before(grammarAccess.getIfBlockAccess().getIfSentenceIfConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIfCondition();

            state._fsp--;

             after(grammarAccess.getIfBlockAccess().getIfSentenceIfConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__IfSentenceAssignment_1"


    // $ANTLR start "rule__IfBlock__ElseSentenceAssignment_2_1"
    // InternalPagos.g:8433:1: rule__IfBlock__ElseSentenceAssignment_2_1 : ( ruleElseSegment ) ;
    public final void rule__IfBlock__ElseSentenceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8437:1: ( ( ruleElseSegment ) )
            // InternalPagos.g:8438:2: ( ruleElseSegment )
            {
            // InternalPagos.g:8438:2: ( ruleElseSegment )
            // InternalPagos.g:8439:3: ruleElseSegment
            {
             before(grammarAccess.getIfBlockAccess().getElseSentenceElseSegmentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElseSegment();

            state._fsp--;

             after(grammarAccess.getIfBlockAccess().getElseSentenceElseSegmentParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__ElseSentenceAssignment_2_1"


    // $ANTLR start "rule__IfCondition__LogExpAssignment_3"
    // InternalPagos.g:8448:1: rule__IfCondition__LogExpAssignment_3 : ( ruleExpresionLogica ) ;
    public final void rule__IfCondition__LogExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8452:1: ( ( ruleExpresionLogica ) )
            // InternalPagos.g:8453:2: ( ruleExpresionLogica )
            {
            // InternalPagos.g:8453:2: ( ruleExpresionLogica )
            // InternalPagos.g:8454:3: ruleExpresionLogica
            {
             before(grammarAccess.getIfConditionAccess().getLogExpExpresionLogicaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresionLogica();

            state._fsp--;

             after(grammarAccess.getIfConditionAccess().getLogExpExpresionLogicaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__LogExpAssignment_3"


    // $ANTLR start "rule__IfCondition__FormulaReturnAssignment_7"
    // InternalPagos.g:8463:1: rule__IfCondition__FormulaReturnAssignment_7 : ( ruleReturnBlock ) ;
    public final void rule__IfCondition__FormulaReturnAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8467:1: ( ( ruleReturnBlock ) )
            // InternalPagos.g:8468:2: ( ruleReturnBlock )
            {
            // InternalPagos.g:8468:2: ( ruleReturnBlock )
            // InternalPagos.g:8469:3: ruleReturnBlock
            {
             before(grammarAccess.getIfConditionAccess().getFormulaReturnReturnBlockParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleReturnBlock();

            state._fsp--;

             after(grammarAccess.getIfConditionAccess().getFormulaReturnReturnBlockParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__FormulaReturnAssignment_7"


    // $ANTLR start "rule__ElseSegment__IfSentenceAssignment_2"
    // InternalPagos.g:8478:1: rule__ElseSegment__IfSentenceAssignment_2 : ( ruleFormula ) ;
    public final void rule__ElseSegment__IfSentenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8482:1: ( ( ruleFormula ) )
            // InternalPagos.g:8483:2: ( ruleFormula )
            {
            // InternalPagos.g:8483:2: ( ruleFormula )
            // InternalPagos.g:8484:3: ruleFormula
            {
             before(grammarAccess.getElseSegmentAccess().getIfSentenceFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getElseSegmentAccess().getIfSentenceFormulaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSegment__IfSentenceAssignment_2"


    // $ANTLR start "rule__ReturnBlock__ExpressionAssignment_3"
    // InternalPagos.g:8493:1: rule__ReturnBlock__ExpressionAssignment_3 : ( ruleAdicion ) ;
    public final void rule__ReturnBlock__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8497:1: ( ( ruleAdicion ) )
            // InternalPagos.g:8498:2: ( ruleAdicion )
            {
            // InternalPagos.g:8498:2: ( ruleAdicion )
            // InternalPagos.g:8499:3: ruleAdicion
            {
             before(grammarAccess.getReturnBlockAccess().getExpressionAdicionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAdicion();

            state._fsp--;

             after(grammarAccess.getReturnBlockAccess().getExpressionAdicionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnBlock__ExpressionAssignment_3"


    // $ANTLR start "rule__ExpresionLogica__VariableAssignment_0"
    // InternalPagos.g:8508:1: rule__ExpresionLogica__VariableAssignment_0 : ( ruleTerminalValue ) ;
    public final void rule__ExpresionLogica__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8512:1: ( ( ruleTerminalValue ) )
            // InternalPagos.g:8513:2: ( ruleTerminalValue )
            {
            // InternalPagos.g:8513:2: ( ruleTerminalValue )
            // InternalPagos.g:8514:3: ruleTerminalValue
            {
             before(grammarAccess.getExpresionLogicaAccess().getVariableTerminalValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalValue();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getVariableTerminalValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__VariableAssignment_0"


    // $ANTLR start "rule__ExpresionLogica__LogOperAssignment_1_0"
    // InternalPagos.g:8523:1: rule__ExpresionLogica__LogOperAssignment_1_0 : ( RULE_OPERADORLOGICO ) ;
    public final void rule__ExpresionLogica__LogOperAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8527:1: ( ( RULE_OPERADORLOGICO ) )
            // InternalPagos.g:8528:2: ( RULE_OPERADORLOGICO )
            {
            // InternalPagos.g:8528:2: ( RULE_OPERADORLOGICO )
            // InternalPagos.g:8529:3: RULE_OPERADORLOGICO
            {
             before(grammarAccess.getExpresionLogicaAccess().getLogOperOPERADORLOGICOTerminalRuleCall_1_0_0()); 
            match(input,RULE_OPERADORLOGICO,FOLLOW_2); 
             after(grammarAccess.getExpresionLogicaAccess().getLogOperOPERADORLOGICOTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__LogOperAssignment_1_0"


    // $ANTLR start "rule__ExpresionLogica__Variable2Assignment_1_1_0"
    // InternalPagos.g:8538:1: rule__ExpresionLogica__Variable2Assignment_1_1_0 : ( ruleTerminalValue ) ;
    public final void rule__ExpresionLogica__Variable2Assignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8542:1: ( ( ruleTerminalValue ) )
            // InternalPagos.g:8543:2: ( ruleTerminalValue )
            {
            // InternalPagos.g:8543:2: ( ruleTerminalValue )
            // InternalPagos.g:8544:3: ruleTerminalValue
            {
             before(grammarAccess.getExpresionLogicaAccess().getVariable2TerminalValueParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalValue();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getVariable2TerminalValueParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Variable2Assignment_1_1_0"


    // $ANTLR start "rule__ExpresionLogica__LiteralAssignment_1_1_1"
    // InternalPagos.g:8553:1: rule__ExpresionLogica__LiteralAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__ExpresionLogica__LiteralAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8557:1: ( ( RULE_STRING ) )
            // InternalPagos.g:8558:2: ( RULE_STRING )
            {
            // InternalPagos.g:8558:2: ( RULE_STRING )
            // InternalPagos.g:8559:3: RULE_STRING
            {
             before(grammarAccess.getExpresionLogicaAccess().getLiteralSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExpresionLogicaAccess().getLiteralSTRINGTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__LiteralAssignment_1_1_1"


    // $ANTLR start "rule__ExpresionLogica__ConOperAssignment_2_0"
    // InternalPagos.g:8568:1: rule__ExpresionLogica__ConOperAssignment_2_0 : ( RULE_LOGICALCONN ) ;
    public final void rule__ExpresionLogica__ConOperAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8572:1: ( ( RULE_LOGICALCONN ) )
            // InternalPagos.g:8573:2: ( RULE_LOGICALCONN )
            {
            // InternalPagos.g:8573:2: ( RULE_LOGICALCONN )
            // InternalPagos.g:8574:3: RULE_LOGICALCONN
            {
             before(grammarAccess.getExpresionLogicaAccess().getConOperLOGICALCONNTerminalRuleCall_2_0_0()); 
            match(input,RULE_LOGICALCONN,FOLLOW_2); 
             after(grammarAccess.getExpresionLogicaAccess().getConOperLOGICALCONNTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__ConOperAssignment_2_0"


    // $ANTLR start "rule__ExpresionLogica__ExpAssignment_2_1"
    // InternalPagos.g:8583:1: rule__ExpresionLogica__ExpAssignment_2_1 : ( ruleExpresionLogica ) ;
    public final void rule__ExpresionLogica__ExpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8587:1: ( ( ruleExpresionLogica ) )
            // InternalPagos.g:8588:2: ( ruleExpresionLogica )
            {
            // InternalPagos.g:8588:2: ( ruleExpresionLogica )
            // InternalPagos.g:8589:3: ruleExpresionLogica
            {
             before(grammarAccess.getExpresionLogicaAccess().getExpExpresionLogicaParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresionLogica();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getExpExpresionLogicaParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__ExpAssignment_2_1"


    // $ANTLR start "rule__Adicion__OperatorAssignment_1_1"
    // InternalPagos.g:8598:1: rule__Adicion__OperatorAssignment_1_1 : ( RULE_ADDOP ) ;
    public final void rule__Adicion__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8602:1: ( ( RULE_ADDOP ) )
            // InternalPagos.g:8603:2: ( RULE_ADDOP )
            {
            // InternalPagos.g:8603:2: ( RULE_ADDOP )
            // InternalPagos.g:8604:3: RULE_ADDOP
            {
             before(grammarAccess.getAdicionAccess().getOperatorADDOPTerminalRuleCall_1_1_0()); 
            match(input,RULE_ADDOP,FOLLOW_2); 
             after(grammarAccess.getAdicionAccess().getOperatorADDOPTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adicion__OperatorAssignment_1_1"


    // $ANTLR start "rule__Adicion__RexpAssignment_1_2"
    // InternalPagos.g:8613:1: rule__Adicion__RexpAssignment_1_2 : ( ruleMultiplicacion ) ;
    public final void rule__Adicion__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8617:1: ( ( ruleMultiplicacion ) )
            // InternalPagos.g:8618:2: ( ruleMultiplicacion )
            {
            // InternalPagos.g:8618:2: ( ruleMultiplicacion )
            // InternalPagos.g:8619:3: ruleMultiplicacion
            {
             before(grammarAccess.getAdicionAccess().getRexpMultiplicacionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicacion();

            state._fsp--;

             after(grammarAccess.getAdicionAccess().getRexpMultiplicacionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adicion__RexpAssignment_1_2"


    // $ANTLR start "rule__Multiplicacion__OperatorAssignment_1_1"
    // InternalPagos.g:8628:1: rule__Multiplicacion__OperatorAssignment_1_1 : ( RULE_MULTOP ) ;
    public final void rule__Multiplicacion__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8632:1: ( ( RULE_MULTOP ) )
            // InternalPagos.g:8633:2: ( RULE_MULTOP )
            {
            // InternalPagos.g:8633:2: ( RULE_MULTOP )
            // InternalPagos.g:8634:3: RULE_MULTOP
            {
             before(grammarAccess.getMultiplicacionAccess().getOperatorMULTOPTerminalRuleCall_1_1_0()); 
            match(input,RULE_MULTOP,FOLLOW_2); 
             after(grammarAccess.getMultiplicacionAccess().getOperatorMULTOPTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicacion__OperatorAssignment_1_1"


    // $ANTLR start "rule__Multiplicacion__RexpAssignment_1_2"
    // InternalPagos.g:8643:1: rule__Multiplicacion__RexpAssignment_1_2 : ( ruleSigleExp ) ;
    public final void rule__Multiplicacion__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8647:1: ( ( ruleSigleExp ) )
            // InternalPagos.g:8648:2: ( ruleSigleExp )
            {
            // InternalPagos.g:8648:2: ( ruleSigleExp )
            // InternalPagos.g:8649:3: ruleSigleExp
            {
             before(grammarAccess.getMultiplicacionAccess().getRexpSigleExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSigleExp();

            state._fsp--;

             after(grammarAccess.getMultiplicacionAccess().getRexpSigleExpParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicacion__RexpAssignment_1_2"


    // $ANTLR start "rule__BusinessAttribute__NameAssignment_2"
    // InternalPagos.g:8658:1: rule__BusinessAttribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8662:1: ( ( RULE_ID ) )
            // InternalPagos.g:8663:2: ( RULE_ID )
            {
            // InternalPagos.g:8663:2: ( RULE_ID )
            // InternalPagos.g:8664:3: RULE_ID
            {
             before(grammarAccess.getBusinessAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBusinessAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__NameAssignment_2"


    // $ANTLR start "rule__BusinessAttribute__TypeAssignment_4"
    // InternalPagos.g:8673:1: rule__BusinessAttribute__TypeAssignment_4 : ( RULE_TYPE ) ;
    public final void rule__BusinessAttribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8677:1: ( ( RULE_TYPE ) )
            // InternalPagos.g:8678:2: ( RULE_TYPE )
            {
            // InternalPagos.g:8678:2: ( RULE_TYPE )
            // InternalPagos.g:8679:3: RULE_TYPE
            {
             before(grammarAccess.getBusinessAttributeAccess().getTypeTYPETerminalRuleCall_4_0()); 
            match(input,RULE_TYPE,FOLLOW_2); 
             after(grammarAccess.getBusinessAttributeAccess().getTypeTYPETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__TypeAssignment_4"


    // $ANTLR start "rule__BusinessAttribute__ExpAssignment_5_1"
    // InternalPagos.g:8688:1: rule__BusinessAttribute__ExpAssignment_5_1 : ( ruleAdicion ) ;
    public final void rule__BusinessAttribute__ExpAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8692:1: ( ( ruleAdicion ) )
            // InternalPagos.g:8693:2: ( ruleAdicion )
            {
            // InternalPagos.g:8693:2: ( ruleAdicion )
            // InternalPagos.g:8694:3: ruleAdicion
            {
             before(grammarAccess.getBusinessAttributeAccess().getExpAdicionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdicion();

            state._fsp--;

             after(grammarAccess.getBusinessAttributeAccess().getExpAdicionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__ExpAssignment_5_1"


    // $ANTLR start "rule__BusinessAttribute__IsIndexAssignment_6"
    // InternalPagos.g:8703:1: rule__BusinessAttribute__IsIndexAssignment_6 : ( RULE_INDEX ) ;
    public final void rule__BusinessAttribute__IsIndexAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8707:1: ( ( RULE_INDEX ) )
            // InternalPagos.g:8708:2: ( RULE_INDEX )
            {
            // InternalPagos.g:8708:2: ( RULE_INDEX )
            // InternalPagos.g:8709:3: RULE_INDEX
            {
             before(grammarAccess.getBusinessAttributeAccess().getIsIndexINDEXTerminalRuleCall_6_0()); 
            match(input,RULE_INDEX,FOLLOW_2); 
             after(grammarAccess.getBusinessAttributeAccess().getIsIndexINDEXTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessAttribute__IsIndexAssignment_6"


    // $ANTLR start "rule__TerminalValue__ParentAssignment_0_1_0_0_2"
    // InternalPagos.g:8718:1: rule__TerminalValue__ParentAssignment_0_1_0_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__ParentAssignment_0_1_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8722:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8723:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8723:2: ( ( RULE_ID ) )
            // InternalPagos.g:8724:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getParentParticipantCrossReference_0_1_0_0_2_0()); 
            // InternalPagos.g:8725:3: ( RULE_ID )
            // InternalPagos.g:8726:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getParentParticipantIDTerminalRuleCall_0_1_0_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getParentParticipantIDTerminalRuleCall_0_1_0_0_2_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getParentParticipantCrossReference_0_1_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__ParentAssignment_0_1_0_0_2"


    // $ANTLR start "rule__TerminalValue__VariableAssignment_0_1_0_1"
    // InternalPagos.g:8737:1: rule__TerminalValue__VariableAssignment_0_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__VariableAssignment_0_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8741:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8742:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8742:2: ( ( RULE_ID ) )
            // InternalPagos.g:8743:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_0_1_0_1_0()); 
            // InternalPagos.g:8744:3: ( RULE_ID )
            // InternalPagos.g:8745:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeIDTerminalRuleCall_0_1_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeIDTerminalRuleCall_0_1_0_1_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_0_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__VariableAssignment_0_1_0_1"


    // $ANTLR start "rule__TerminalValue__ParentAssignment_0_1_1_2"
    // InternalPagos.g:8756:1: rule__TerminalValue__ParentAssignment_0_1_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__ParentAssignment_0_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8760:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8761:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8761:2: ( ( RULE_ID ) )
            // InternalPagos.g:8762:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getParentParticipantCrossReference_0_1_1_2_0()); 
            // InternalPagos.g:8763:3: ( RULE_ID )
            // InternalPagos.g:8764:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getParentParticipantIDTerminalRuleCall_0_1_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getParentParticipantIDTerminalRuleCall_0_1_1_2_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getParentParticipantCrossReference_0_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__ParentAssignment_0_1_1_2"


    // $ANTLR start "rule__TerminalValue__MethodAssignment_0_1_1_4"
    // InternalPagos.g:8775:1: rule__TerminalValue__MethodAssignment_0_1_1_4 : ( ruleMethod ) ;
    public final void rule__TerminalValue__MethodAssignment_0_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8779:1: ( ( ruleMethod ) )
            // InternalPagos.g:8780:2: ( ruleMethod )
            {
            // InternalPagos.g:8780:2: ( ruleMethod )
            // InternalPagos.g:8781:3: ruleMethod
            {
             before(grammarAccess.getTerminalValueAccess().getMethodMethodParserRuleCall_0_1_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getTerminalValueAccess().getMethodMethodParserRuleCall_0_1_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__MethodAssignment_0_1_1_4"


    // $ANTLR start "rule__TerminalValue__ParentAssignment_1_0_2"
    // InternalPagos.g:8790:1: rule__TerminalValue__ParentAssignment_1_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__ParentAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8794:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8795:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8795:2: ( ( RULE_ID ) )
            // InternalPagos.g:8796:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getParentSuperEntityCrossReference_1_0_2_0()); 
            // InternalPagos.g:8797:3: ( RULE_ID )
            // InternalPagos.g:8798:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getParentSuperEntityIDTerminalRuleCall_1_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getParentSuperEntityIDTerminalRuleCall_1_0_2_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getParentSuperEntityCrossReference_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__ParentAssignment_1_0_2"


    // $ANTLR start "rule__TerminalValue__VariableAssignment_1_0_4"
    // InternalPagos.g:8809:1: rule__TerminalValue__VariableAssignment_1_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__VariableAssignment_1_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8813:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8814:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8814:2: ( ( RULE_ID ) )
            // InternalPagos.g:8815:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_1_0_4_0()); 
            // InternalPagos.g:8816:3: ( RULE_ID )
            // InternalPagos.g:8817:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeIDTerminalRuleCall_1_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeIDTerminalRuleCall_1_0_4_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_1_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__VariableAssignment_1_0_4"


    // $ANTLR start "rule__TerminalValue__ParentAssignment_1_1_2"
    // InternalPagos.g:8828:1: rule__TerminalValue__ParentAssignment_1_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__ParentAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8832:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8833:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8833:2: ( ( RULE_ID ) )
            // InternalPagos.g:8834:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getParentSuperEntityCrossReference_1_1_2_0()); 
            // InternalPagos.g:8835:3: ( RULE_ID )
            // InternalPagos.g:8836:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getParentSuperEntityIDTerminalRuleCall_1_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getParentSuperEntityIDTerminalRuleCall_1_1_2_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getParentSuperEntityCrossReference_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__ParentAssignment_1_1_2"


    // $ANTLR start "rule__TerminalValue__MethodAssignment_1_1_4"
    // InternalPagos.g:8847:1: rule__TerminalValue__MethodAssignment_1_1_4 : ( ruleMethod ) ;
    public final void rule__TerminalValue__MethodAssignment_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8851:1: ( ( ruleMethod ) )
            // InternalPagos.g:8852:2: ( ruleMethod )
            {
            // InternalPagos.g:8852:2: ( ruleMethod )
            // InternalPagos.g:8853:3: ruleMethod
            {
             before(grammarAccess.getTerminalValueAccess().getMethodMethodParserRuleCall_1_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getTerminalValueAccess().getMethodMethodParserRuleCall_1_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__MethodAssignment_1_1_4"


    // $ANTLR start "rule__TerminalValue__ParentAssignment_2_0_2"
    // InternalPagos.g:8862:1: rule__TerminalValue__ParentAssignment_2_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__ParentAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8866:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8867:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8867:2: ( ( RULE_ID ) )
            // InternalPagos.g:8868:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getParentInformationTemplateCrossReference_2_0_2_0()); 
            // InternalPagos.g:8869:3: ( RULE_ID )
            // InternalPagos.g:8870:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getParentInformationTemplateIDTerminalRuleCall_2_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getParentInformationTemplateIDTerminalRuleCall_2_0_2_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getParentInformationTemplateCrossReference_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__ParentAssignment_2_0_2"


    // $ANTLR start "rule__TerminalValue__VariableAssignment_2_0_4"
    // InternalPagos.g:8881:1: rule__TerminalValue__VariableAssignment_2_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__VariableAssignment_2_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8885:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8886:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8886:2: ( ( RULE_ID ) )
            // InternalPagos.g:8887:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_2_0_4_0()); 
            // InternalPagos.g:8888:3: ( RULE_ID )
            // InternalPagos.g:8889:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeIDTerminalRuleCall_2_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeIDTerminalRuleCall_2_0_4_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_2_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__VariableAssignment_2_0_4"


    // $ANTLR start "rule__TerminalValue__ParentAssignment_2_1_2"
    // InternalPagos.g:8900:1: rule__TerminalValue__ParentAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__ParentAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8904:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8905:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8905:2: ( ( RULE_ID ) )
            // InternalPagos.g:8906:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getParentInformationTemplateCrossReference_2_1_2_0()); 
            // InternalPagos.g:8907:3: ( RULE_ID )
            // InternalPagos.g:8908:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getParentInformationTemplateIDTerminalRuleCall_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getParentInformationTemplateIDTerminalRuleCall_2_1_2_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getParentInformationTemplateCrossReference_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__ParentAssignment_2_1_2"


    // $ANTLR start "rule__TerminalValue__MethodAssignment_2_1_4"
    // InternalPagos.g:8919:1: rule__TerminalValue__MethodAssignment_2_1_4 : ( ruleMethod ) ;
    public final void rule__TerminalValue__MethodAssignment_2_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8923:1: ( ( ruleMethod ) )
            // InternalPagos.g:8924:2: ( ruleMethod )
            {
            // InternalPagos.g:8924:2: ( ruleMethod )
            // InternalPagos.g:8925:3: ruleMethod
            {
             before(grammarAccess.getTerminalValueAccess().getMethodMethodParserRuleCall_2_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getTerminalValueAccess().getMethodMethodParserRuleCall_2_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__MethodAssignment_2_1_4"


    // $ANTLR start "rule__TerminalValue__ParentAssignment_3_2"
    // InternalPagos.g:8934:1: rule__TerminalValue__ParentAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__ParentAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8938:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8939:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8939:2: ( ( RULE_ID ) )
            // InternalPagos.g:8940:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getParentCalculationTemplateCrossReference_3_2_0()); 
            // InternalPagos.g:8941:3: ( RULE_ID )
            // InternalPagos.g:8942:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getParentCalculationTemplateIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getParentCalculationTemplateIDTerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getParentCalculationTemplateCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__ParentAssignment_3_2"


    // $ANTLR start "rule__TerminalValue__ValorAssignment_4"
    // InternalPagos.g:8953:1: rule__TerminalValue__ValorAssignment_4 : ( ruleNumber ) ;
    public final void rule__TerminalValue__ValorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8957:1: ( ( ruleNumber ) )
            // InternalPagos.g:8958:2: ( ruleNumber )
            {
            // InternalPagos.g:8958:2: ( ruleNumber )
            // InternalPagos.g:8959:3: ruleNumber
            {
             before(grammarAccess.getTerminalValueAccess().getValorNumberParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getTerminalValueAccess().getValorNumberParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__ValorAssignment_4"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\3\16\uffff";
    static final String dfa_3s = "\1\4\16\uffff";
    static final String dfa_4s = "\1\65\16\uffff";
    static final String dfa_5s = "\1\uffff\1\1\12\2\1\3\1\4\1\5";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\16\3\uffff\1\7\1\uffff\1\13\4\uffff\1\16\1\uffff\1\1\1\uffff\1\11\1\12\1\5\1\4\1\uffff\1\10\27\uffff\1\6\1\uffff\1\1\1\2\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "665:1: rule__TerminalValue__Alternatives : ( ( ( rule__TerminalValue__Group_0__0 ) ) | ( ( rule__TerminalValue__Alternatives_1 ) ) | ( ( rule__TerminalValue__Alternatives_2 ) ) | ( ( rule__TerminalValue__Group_3__0 )? ) | ( ( rule__TerminalValue__ValorAssignment_4 ) ) );";
        }
    }
    static final String dfa_8s = "\16\uffff";
    static final String dfa_9s = "\1\2\15\uffff";
    static final String dfa_10s = "\1\10\1\17\11\uffff\1\21\1\17\1\uffff";
    static final String dfa_11s = "\1\63\1\17\11\uffff\1\21\1\20\1\uffff";
    static final String dfa_12s = "\2\uffff\11\1\2\uffff\1\2";
    static final String dfa_13s = "\16\uffff}>";
    static final String[] dfa_14s = {
            "\1\6\1\uffff\1\12\10\uffff\1\10\1\11\1\4\1\3\1\uffff\1\7\27\uffff\1\5\2\uffff\1\1",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14",
            "\1\15\1\12",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "725:1: rule__TerminalValue__Alternatives_1 : ( ( ( rule__TerminalValue__Group_1_0__0 )? ) | ( ( rule__TerminalValue__Group_1_1__0 )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x003C000000028010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x003C800000028010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x003C000000068010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000001000100L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000600000000L});

}