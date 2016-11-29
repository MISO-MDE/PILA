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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_LBRACE", "RULE_COLON", "RULE_COMMA", "RULE_RBRACE", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_ELSE", "RULE_IF", "RULE_THEN", "RULE_RETURN", "RULE_DOT", "RULE_DASH", "RULE_ID", "RULE_STRING", "RULE_OPERADORLOGICO", "RULE_LOGICALCONN", "RULE_ADDOP", "RULE_MULTOP", "RULE_TYPE", "RULE_INDEX", "RULE_STR_ESC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'name'", "'intermediary'", "'superentities'", "'description'", "'attributes'", "'entities'", "'InformationTemplate'", "'FormAttributes'", "'calculationtemplates'", "'providers'", "'calculationrules'", "'calculationattributes'", "'('", "')'", "':='", "'PA'", "'SU'", "'IT'", "'FU'"
    };
    public static final int T__50=50;
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


    // $ANTLR start "entryRuleNumber"
    // InternalPagos.g:503:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalPagos.g:504:1: ( ruleNumber EOF )
            // InternalPagos.g:505:1: ruleNumber EOF
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
    // InternalPagos.g:512:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:516:2: ( ( ( rule__Number__Alternatives ) ) )
            // InternalPagos.g:517:2: ( ( rule__Number__Alternatives ) )
            {
            // InternalPagos.g:517:2: ( ( rule__Number__Alternatives ) )
            // InternalPagos.g:518:3: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // InternalPagos.g:519:3: ( rule__Number__Alternatives )
            // InternalPagos.g:519:4: rule__Number__Alternatives
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
    // InternalPagos.g:528:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalPagos.g:529:1: ( ruleEDouble EOF )
            // InternalPagos.g:530:1: ruleEDouble EOF
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
    // InternalPagos.g:537:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:541:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalPagos.g:542:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalPagos.g:542:2: ( ( rule__EDouble__Group__0 ) )
            // InternalPagos.g:543:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalPagos.g:544:3: ( rule__EDouble__Group__0 )
            // InternalPagos.g:544:4: rule__EDouble__Group__0
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
    // InternalPagos.g:553:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalPagos.g:554:1: ( ruleInteger EOF )
            // InternalPagos.g:555:1: ruleInteger EOF
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
    // InternalPagos.g:562:1: ruleInteger : ( RULE_INT ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:566:2: ( ( RULE_INT ) )
            // InternalPagos.g:567:2: ( RULE_INT )
            {
            // InternalPagos.g:567:2: ( RULE_INT )
            // InternalPagos.g:568:3: RULE_INT
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
    // InternalPagos.g:577:1: rule__Formula__Alternatives : ( ( ( rule__Formula__Group_0__0 ) ) | ( ( rule__Formula__FormulaReturnAssignment_1 ) ) );
    public final void rule__Formula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:581:1: ( ( ( rule__Formula__Group_0__0 ) ) | ( ( rule__Formula__FormulaReturnAssignment_1 ) ) )
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
                    // InternalPagos.g:582:2: ( ( rule__Formula__Group_0__0 ) )
                    {
                    // InternalPagos.g:582:2: ( ( rule__Formula__Group_0__0 ) )
                    // InternalPagos.g:583:3: ( rule__Formula__Group_0__0 )
                    {
                     before(grammarAccess.getFormulaAccess().getGroup_0()); 
                    // InternalPagos.g:584:3: ( rule__Formula__Group_0__0 )
                    // InternalPagos.g:584:4: rule__Formula__Group_0__0
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
                    // InternalPagos.g:588:2: ( ( rule__Formula__FormulaReturnAssignment_1 ) )
                    {
                    // InternalPagos.g:588:2: ( ( rule__Formula__FormulaReturnAssignment_1 ) )
                    // InternalPagos.g:589:3: ( rule__Formula__FormulaReturnAssignment_1 )
                    {
                     before(grammarAccess.getFormulaAccess().getFormulaReturnAssignment_1()); 
                    // InternalPagos.g:590:3: ( rule__Formula__FormulaReturnAssignment_1 )
                    // InternalPagos.g:590:4: rule__Formula__FormulaReturnAssignment_1
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
    // InternalPagos.g:598:1: rule__ExpresionLogica__Alternatives_1_1 : ( ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) ) | ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) ) );
    public final void rule__ExpresionLogica__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:602:1: ( ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) ) | ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF||LA2_0==RULE_INT||LA2_0==RULE_RBRACE||LA2_0==RULE_RBRACKET||LA2_0==RULE_DOT||LA2_0==RULE_ID||(LA2_0>=RULE_OPERADORLOGICO && LA2_0<=RULE_MULTOP)||LA2_0==RULE_INDEX||LA2_0==45||(LA2_0>=47 && LA2_0<=50)) ) {
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
                    // InternalPagos.g:603:2: ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) )
                    {
                    // InternalPagos.g:603:2: ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) )
                    // InternalPagos.g:604:3: ( rule__ExpresionLogica__Variable2Assignment_1_1_0 )
                    {
                     before(grammarAccess.getExpresionLogicaAccess().getVariable2Assignment_1_1_0()); 
                    // InternalPagos.g:605:3: ( rule__ExpresionLogica__Variable2Assignment_1_1_0 )
                    // InternalPagos.g:605:4: rule__ExpresionLogica__Variable2Assignment_1_1_0
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
                    // InternalPagos.g:609:2: ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) )
                    {
                    // InternalPagos.g:609:2: ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) )
                    // InternalPagos.g:610:3: ( rule__ExpresionLogica__LiteralAssignment_1_1_1 )
                    {
                     before(grammarAccess.getExpresionLogicaAccess().getLiteralAssignment_1_1_1()); 
                    // InternalPagos.g:611:3: ( rule__ExpresionLogica__LiteralAssignment_1_1_1 )
                    // InternalPagos.g:611:4: rule__ExpresionLogica__LiteralAssignment_1_1_1
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
    // InternalPagos.g:619:1: rule__SigleExp__Alternatives : ( ( ruleTerminalValue ) | ( ( rule__SigleExp__Group_1__0 ) ) );
    public final void rule__SigleExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:623:1: ( ( ruleTerminalValue ) | ( ( rule__SigleExp__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==RULE_INT||LA3_0==RULE_RBRACE||LA3_0==RULE_RBRACKET||LA3_0==RULE_DOT||LA3_0==RULE_ID||(LA3_0>=RULE_OPERADORLOGICO && LA3_0<=RULE_MULTOP)||LA3_0==RULE_INDEX||LA3_0==45||(LA3_0>=47 && LA3_0<=50)) ) {
                alt3=1;
            }
            else if ( (LA3_0==44) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPagos.g:624:2: ( ruleTerminalValue )
                    {
                    // InternalPagos.g:624:2: ( ruleTerminalValue )
                    // InternalPagos.g:625:3: ruleTerminalValue
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
                    // InternalPagos.g:630:2: ( ( rule__SigleExp__Group_1__0 ) )
                    {
                    // InternalPagos.g:630:2: ( ( rule__SigleExp__Group_1__0 ) )
                    // InternalPagos.g:631:3: ( rule__SigleExp__Group_1__0 )
                    {
                     before(grammarAccess.getSigleExpAccess().getGroup_1()); 
                    // InternalPagos.g:632:3: ( rule__SigleExp__Group_1__0 )
                    // InternalPagos.g:632:4: rule__SigleExp__Group_1__0
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
    // InternalPagos.g:640:1: rule__TerminalValue__Alternatives : ( ( ( rule__TerminalValue__Group_0__0 ) ) | ( ( rule__TerminalValue__Group_1__0 )? ) | ( ( rule__TerminalValue__Group_2__0 )? ) | ( ( rule__TerminalValue__Group_3__0 )? ) | ( ( rule__TerminalValue__ValorAssignment_4 ) ) );
    public final void rule__TerminalValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:644:1: ( ( ( rule__TerminalValue__Group_0__0 ) ) | ( ( rule__TerminalValue__Group_1__0 )? ) | ( ( rule__TerminalValue__Group_2__0 )? ) | ( ( rule__TerminalValue__Group_3__0 )? ) | ( ( rule__TerminalValue__ValorAssignment_4 ) ) )
            int alt7=5;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalPagos.g:645:2: ( ( rule__TerminalValue__Group_0__0 ) )
                    {
                    // InternalPagos.g:645:2: ( ( rule__TerminalValue__Group_0__0 ) )
                    // InternalPagos.g:646:3: ( rule__TerminalValue__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalValueAccess().getGroup_0()); 
                    // InternalPagos.g:647:3: ( rule__TerminalValue__Group_0__0 )
                    // InternalPagos.g:647:4: rule__TerminalValue__Group_0__0
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
                    // InternalPagos.g:651:2: ( ( rule__TerminalValue__Group_1__0 )? )
                    {
                    // InternalPagos.g:651:2: ( ( rule__TerminalValue__Group_1__0 )? )
                    // InternalPagos.g:652:3: ( rule__TerminalValue__Group_1__0 )?
                    {
                     before(grammarAccess.getTerminalValueAccess().getGroup_1()); 
                    // InternalPagos.g:653:3: ( rule__TerminalValue__Group_1__0 )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==48) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalPagos.g:653:4: rule__TerminalValue__Group_1__0
                            {
                            pushFollow(FOLLOW_2);
                            rule__TerminalValue__Group_1__0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getTerminalValueAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPagos.g:657:2: ( ( rule__TerminalValue__Group_2__0 )? )
                    {
                    // InternalPagos.g:657:2: ( ( rule__TerminalValue__Group_2__0 )? )
                    // InternalPagos.g:658:3: ( rule__TerminalValue__Group_2__0 )?
                    {
                     before(grammarAccess.getTerminalValueAccess().getGroup_2()); 
                    // InternalPagos.g:659:3: ( rule__TerminalValue__Group_2__0 )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==49) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalPagos.g:659:4: rule__TerminalValue__Group_2__0
                            {
                            pushFollow(FOLLOW_2);
                            rule__TerminalValue__Group_2__0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getTerminalValueAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPagos.g:663:2: ( ( rule__TerminalValue__Group_3__0 )? )
                    {
                    // InternalPagos.g:663:2: ( ( rule__TerminalValue__Group_3__0 )? )
                    // InternalPagos.g:664:3: ( rule__TerminalValue__Group_3__0 )?
                    {
                     before(grammarAccess.getTerminalValueAccess().getGroup_3()); 
                    // InternalPagos.g:665:3: ( rule__TerminalValue__Group_3__0 )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==50) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalPagos.g:665:4: rule__TerminalValue__Group_3__0
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
                    // InternalPagos.g:669:2: ( ( rule__TerminalValue__ValorAssignment_4 ) )
                    {
                    // InternalPagos.g:669:2: ( ( rule__TerminalValue__ValorAssignment_4 ) )
                    // InternalPagos.g:670:3: ( rule__TerminalValue__ValorAssignment_4 )
                    {
                     before(grammarAccess.getTerminalValueAccess().getValorAssignment_4()); 
                    // InternalPagos.g:671:3: ( rule__TerminalValue__ValorAssignment_4 )
                    // InternalPagos.g:671:4: rule__TerminalValue__ValorAssignment_4
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


    // $ANTLR start "rule__Number__Alternatives"
    // InternalPagos.g:679:1: rule__Number__Alternatives : ( ( ruleEDouble ) | ( ruleInteger ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:683:1: ( ( ruleEDouble ) | ( ruleInteger ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_DOT) ) {
                    alt8=1;
                }
                else if ( (LA8_1==EOF||LA8_1==RULE_RBRACE||LA8_1==RULE_RBRACKET||(LA8_1>=RULE_OPERADORLOGICO && LA8_1<=RULE_MULTOP)||LA8_1==RULE_INDEX||LA8_1==45) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_DOT) ) {
                alt8=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPagos.g:684:2: ( ruleEDouble )
                    {
                    // InternalPagos.g:684:2: ( ruleEDouble )
                    // InternalPagos.g:685:3: ruleEDouble
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
                    // InternalPagos.g:690:2: ( ruleInteger )
                    {
                    // InternalPagos.g:690:2: ( ruleInteger )
                    // InternalPagos.g:691:3: ruleInteger
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
    // InternalPagos.g:700:1: rule__EDouble__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:704:1: ( ( 'E' ) | ( 'e' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            else if ( (LA9_0==31) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPagos.g:705:2: ( 'E' )
                    {
                    // InternalPagos.g:705:2: ( 'E' )
                    // InternalPagos.g:706:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:711:2: ( 'e' )
                    {
                    // InternalPagos.g:711:2: ( 'e' )
                    // InternalPagos.g:712:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_1()); 
                    match(input,31,FOLLOW_2); 
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
    // InternalPagos.g:721:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:725:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalPagos.g:726:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalPagos.g:733:1: rule__Application__Group__0__Impl : ( RULE_LBRACE ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:737:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:738:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:738:1: ( RULE_LBRACE )
            // InternalPagos.g:739:2: RULE_LBRACE
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
    // InternalPagos.g:748:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:752:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalPagos.g:753:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalPagos.g:760:1: rule__Application__Group__1__Impl : ( 'name' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:764:1: ( ( 'name' ) )
            // InternalPagos.g:765:1: ( 'name' )
            {
            // InternalPagos.g:765:1: ( 'name' )
            // InternalPagos.g:766:2: 'name'
            {
             before(grammarAccess.getApplicationAccess().getNameKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPagos.g:775:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:779:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalPagos.g:780:2: rule__Application__Group__2__Impl rule__Application__Group__3
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
    // InternalPagos.g:787:1: rule__Application__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:791:1: ( ( RULE_COLON ) )
            // InternalPagos.g:792:1: ( RULE_COLON )
            {
            // InternalPagos.g:792:1: ( RULE_COLON )
            // InternalPagos.g:793:2: RULE_COLON
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
    // InternalPagos.g:802:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:806:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalPagos.g:807:2: rule__Application__Group__3__Impl rule__Application__Group__4
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
    // InternalPagos.g:814:1: rule__Application__Group__3__Impl : ( ( rule__Application__NameAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:818:1: ( ( ( rule__Application__NameAssignment_3 ) ) )
            // InternalPagos.g:819:1: ( ( rule__Application__NameAssignment_3 ) )
            {
            // InternalPagos.g:819:1: ( ( rule__Application__NameAssignment_3 ) )
            // InternalPagos.g:820:2: ( rule__Application__NameAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_3()); 
            // InternalPagos.g:821:2: ( rule__Application__NameAssignment_3 )
            // InternalPagos.g:821:3: rule__Application__NameAssignment_3
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
    // InternalPagos.g:829:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:833:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalPagos.g:834:2: rule__Application__Group__4__Impl rule__Application__Group__5
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
    // InternalPagos.g:841:1: rule__Application__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:845:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:846:1: ( RULE_COMMA )
            {
            // InternalPagos.g:846:1: ( RULE_COMMA )
            // InternalPagos.g:847:2: RULE_COMMA
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
    // InternalPagos.g:856:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:860:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalPagos.g:861:2: rule__Application__Group__5__Impl rule__Application__Group__6
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
    // InternalPagos.g:868:1: rule__Application__Group__5__Impl : ( 'intermediary' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:872:1: ( ( 'intermediary' ) )
            // InternalPagos.g:873:1: ( 'intermediary' )
            {
            // InternalPagos.g:873:1: ( 'intermediary' )
            // InternalPagos.g:874:2: 'intermediary'
            {
             before(grammarAccess.getApplicationAccess().getIntermediaryKeyword_5()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPagos.g:883:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:887:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // InternalPagos.g:888:2: rule__Application__Group__6__Impl rule__Application__Group__7
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
    // InternalPagos.g:895:1: rule__Application__Group__6__Impl : ( RULE_COLON ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:899:1: ( ( RULE_COLON ) )
            // InternalPagos.g:900:1: ( RULE_COLON )
            {
            // InternalPagos.g:900:1: ( RULE_COLON )
            // InternalPagos.g:901:2: RULE_COLON
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
    // InternalPagos.g:910:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:914:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // InternalPagos.g:915:2: rule__Application__Group__7__Impl rule__Application__Group__8
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
    // InternalPagos.g:922:1: rule__Application__Group__7__Impl : ( ( rule__Application__IntermediaryAssignment_7 ) ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:926:1: ( ( ( rule__Application__IntermediaryAssignment_7 ) ) )
            // InternalPagos.g:927:1: ( ( rule__Application__IntermediaryAssignment_7 ) )
            {
            // InternalPagos.g:927:1: ( ( rule__Application__IntermediaryAssignment_7 ) )
            // InternalPagos.g:928:2: ( rule__Application__IntermediaryAssignment_7 )
            {
             before(grammarAccess.getApplicationAccess().getIntermediaryAssignment_7()); 
            // InternalPagos.g:929:2: ( rule__Application__IntermediaryAssignment_7 )
            // InternalPagos.g:929:3: rule__Application__IntermediaryAssignment_7
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
    // InternalPagos.g:937:1: rule__Application__Group__8 : rule__Application__Group__8__Impl ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:941:1: ( rule__Application__Group__8__Impl )
            // InternalPagos.g:942:2: rule__Application__Group__8__Impl
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
    // InternalPagos.g:948:1: rule__Application__Group__8__Impl : ( RULE_RBRACE ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:952:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:953:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:953:1: ( RULE_RBRACE )
            // InternalPagos.g:954:2: RULE_RBRACE
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
    // InternalPagos.g:964:1: rule__Intermediary__Group__0 : rule__Intermediary__Group__0__Impl rule__Intermediary__Group__1 ;
    public final void rule__Intermediary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:968:1: ( rule__Intermediary__Group__0__Impl rule__Intermediary__Group__1 )
            // InternalPagos.g:969:2: rule__Intermediary__Group__0__Impl rule__Intermediary__Group__1
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
    // InternalPagos.g:976:1: rule__Intermediary__Group__0__Impl : ( () ) ;
    public final void rule__Intermediary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:980:1: ( ( () ) )
            // InternalPagos.g:981:1: ( () )
            {
            // InternalPagos.g:981:1: ( () )
            // InternalPagos.g:982:2: ()
            {
             before(grammarAccess.getIntermediaryAccess().getIntermediaryAction_0()); 
            // InternalPagos.g:983:2: ()
            // InternalPagos.g:983:3: 
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
    // InternalPagos.g:991:1: rule__Intermediary__Group__1 : rule__Intermediary__Group__1__Impl rule__Intermediary__Group__2 ;
    public final void rule__Intermediary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:995:1: ( rule__Intermediary__Group__1__Impl rule__Intermediary__Group__2 )
            // InternalPagos.g:996:2: rule__Intermediary__Group__1__Impl rule__Intermediary__Group__2
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
    // InternalPagos.g:1003:1: rule__Intermediary__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Intermediary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1007:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:1008:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:1008:1: ( RULE_LBRACE )
            // InternalPagos.g:1009:2: RULE_LBRACE
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
    // InternalPagos.g:1018:1: rule__Intermediary__Group__2 : rule__Intermediary__Group__2__Impl rule__Intermediary__Group__3 ;
    public final void rule__Intermediary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1022:1: ( rule__Intermediary__Group__2__Impl rule__Intermediary__Group__3 )
            // InternalPagos.g:1023:2: rule__Intermediary__Group__2__Impl rule__Intermediary__Group__3
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
    // InternalPagos.g:1030:1: rule__Intermediary__Group__2__Impl : ( 'name' ) ;
    public final void rule__Intermediary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1034:1: ( ( 'name' ) )
            // InternalPagos.g:1035:1: ( 'name' )
            {
            // InternalPagos.g:1035:1: ( 'name' )
            // InternalPagos.g:1036:2: 'name'
            {
             before(grammarAccess.getIntermediaryAccess().getNameKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPagos.g:1045:1: rule__Intermediary__Group__3 : rule__Intermediary__Group__3__Impl rule__Intermediary__Group__4 ;
    public final void rule__Intermediary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1049:1: ( rule__Intermediary__Group__3__Impl rule__Intermediary__Group__4 )
            // InternalPagos.g:1050:2: rule__Intermediary__Group__3__Impl rule__Intermediary__Group__4
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
    // InternalPagos.g:1057:1: rule__Intermediary__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Intermediary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1061:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1062:1: ( RULE_COLON )
            {
            // InternalPagos.g:1062:1: ( RULE_COLON )
            // InternalPagos.g:1063:2: RULE_COLON
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
    // InternalPagos.g:1072:1: rule__Intermediary__Group__4 : rule__Intermediary__Group__4__Impl rule__Intermediary__Group__5 ;
    public final void rule__Intermediary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1076:1: ( rule__Intermediary__Group__4__Impl rule__Intermediary__Group__5 )
            // InternalPagos.g:1077:2: rule__Intermediary__Group__4__Impl rule__Intermediary__Group__5
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
    // InternalPagos.g:1084:1: rule__Intermediary__Group__4__Impl : ( ( rule__Intermediary__NameAssignment_4 ) ) ;
    public final void rule__Intermediary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1088:1: ( ( ( rule__Intermediary__NameAssignment_4 ) ) )
            // InternalPagos.g:1089:1: ( ( rule__Intermediary__NameAssignment_4 ) )
            {
            // InternalPagos.g:1089:1: ( ( rule__Intermediary__NameAssignment_4 ) )
            // InternalPagos.g:1090:2: ( rule__Intermediary__NameAssignment_4 )
            {
             before(grammarAccess.getIntermediaryAccess().getNameAssignment_4()); 
            // InternalPagos.g:1091:2: ( rule__Intermediary__NameAssignment_4 )
            // InternalPagos.g:1091:3: rule__Intermediary__NameAssignment_4
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
    // InternalPagos.g:1099:1: rule__Intermediary__Group__5 : rule__Intermediary__Group__5__Impl rule__Intermediary__Group__6 ;
    public final void rule__Intermediary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1103:1: ( rule__Intermediary__Group__5__Impl rule__Intermediary__Group__6 )
            // InternalPagos.g:1104:2: rule__Intermediary__Group__5__Impl rule__Intermediary__Group__6
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
    // InternalPagos.g:1111:1: rule__Intermediary__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Intermediary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1115:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1116:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1116:1: ( RULE_COMMA )
            // InternalPagos.g:1117:2: RULE_COMMA
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
    // InternalPagos.g:1126:1: rule__Intermediary__Group__6 : rule__Intermediary__Group__6__Impl rule__Intermediary__Group__7 ;
    public final void rule__Intermediary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1130:1: ( rule__Intermediary__Group__6__Impl rule__Intermediary__Group__7 )
            // InternalPagos.g:1131:2: rule__Intermediary__Group__6__Impl rule__Intermediary__Group__7
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
    // InternalPagos.g:1138:1: rule__Intermediary__Group__6__Impl : ( 'superentities' ) ;
    public final void rule__Intermediary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1142:1: ( ( 'superentities' ) )
            // InternalPagos.g:1143:1: ( 'superentities' )
            {
            // InternalPagos.g:1143:1: ( 'superentities' )
            // InternalPagos.g:1144:2: 'superentities'
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitiesKeyword_6()); 
            match(input,34,FOLLOW_2); 
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
    // InternalPagos.g:1153:1: rule__Intermediary__Group__7 : rule__Intermediary__Group__7__Impl rule__Intermediary__Group__8 ;
    public final void rule__Intermediary__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1157:1: ( rule__Intermediary__Group__7__Impl rule__Intermediary__Group__8 )
            // InternalPagos.g:1158:2: rule__Intermediary__Group__7__Impl rule__Intermediary__Group__8
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
    // InternalPagos.g:1165:1: rule__Intermediary__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__Intermediary__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1169:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1170:1: ( RULE_COLON )
            {
            // InternalPagos.g:1170:1: ( RULE_COLON )
            // InternalPagos.g:1171:2: RULE_COLON
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
    // InternalPagos.g:1180:1: rule__Intermediary__Group__8 : rule__Intermediary__Group__8__Impl rule__Intermediary__Group__9 ;
    public final void rule__Intermediary__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1184:1: ( rule__Intermediary__Group__8__Impl rule__Intermediary__Group__9 )
            // InternalPagos.g:1185:2: rule__Intermediary__Group__8__Impl rule__Intermediary__Group__9
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
    // InternalPagos.g:1192:1: rule__Intermediary__Group__8__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Intermediary__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1196:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:1197:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:1197:1: ( RULE_LBRACKET )
            // InternalPagos.g:1198:2: RULE_LBRACKET
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
    // InternalPagos.g:1207:1: rule__Intermediary__Group__9 : rule__Intermediary__Group__9__Impl rule__Intermediary__Group__10 ;
    public final void rule__Intermediary__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1211:1: ( rule__Intermediary__Group__9__Impl rule__Intermediary__Group__10 )
            // InternalPagos.g:1212:2: rule__Intermediary__Group__9__Impl rule__Intermediary__Group__10
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
    // InternalPagos.g:1219:1: rule__Intermediary__Group__9__Impl : ( ( rule__Intermediary__SuperentitiesAssignment_9 ) ) ;
    public final void rule__Intermediary__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1223:1: ( ( ( rule__Intermediary__SuperentitiesAssignment_9 ) ) )
            // InternalPagos.g:1224:1: ( ( rule__Intermediary__SuperentitiesAssignment_9 ) )
            {
            // InternalPagos.g:1224:1: ( ( rule__Intermediary__SuperentitiesAssignment_9 ) )
            // InternalPagos.g:1225:2: ( rule__Intermediary__SuperentitiesAssignment_9 )
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitiesAssignment_9()); 
            // InternalPagos.g:1226:2: ( rule__Intermediary__SuperentitiesAssignment_9 )
            // InternalPagos.g:1226:3: rule__Intermediary__SuperentitiesAssignment_9
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
    // InternalPagos.g:1234:1: rule__Intermediary__Group__10 : rule__Intermediary__Group__10__Impl rule__Intermediary__Group__11 ;
    public final void rule__Intermediary__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1238:1: ( rule__Intermediary__Group__10__Impl rule__Intermediary__Group__11 )
            // InternalPagos.g:1239:2: rule__Intermediary__Group__10__Impl rule__Intermediary__Group__11
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
    // InternalPagos.g:1246:1: rule__Intermediary__Group__10__Impl : ( ( rule__Intermediary__Group_10__0 )* ) ;
    public final void rule__Intermediary__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1250:1: ( ( ( rule__Intermediary__Group_10__0 )* ) )
            // InternalPagos.g:1251:1: ( ( rule__Intermediary__Group_10__0 )* )
            {
            // InternalPagos.g:1251:1: ( ( rule__Intermediary__Group_10__0 )* )
            // InternalPagos.g:1252:2: ( rule__Intermediary__Group_10__0 )*
            {
             before(grammarAccess.getIntermediaryAccess().getGroup_10()); 
            // InternalPagos.g:1253:2: ( rule__Intermediary__Group_10__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPagos.g:1253:3: rule__Intermediary__Group_10__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Intermediary__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalPagos.g:1261:1: rule__Intermediary__Group__11 : rule__Intermediary__Group__11__Impl rule__Intermediary__Group__12 ;
    public final void rule__Intermediary__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1265:1: ( rule__Intermediary__Group__11__Impl rule__Intermediary__Group__12 )
            // InternalPagos.g:1266:2: rule__Intermediary__Group__11__Impl rule__Intermediary__Group__12
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
    // InternalPagos.g:1273:1: rule__Intermediary__Group__11__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Intermediary__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1277:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:1278:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:1278:1: ( RULE_RBRACKET )
            // InternalPagos.g:1279:2: RULE_RBRACKET
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
    // InternalPagos.g:1288:1: rule__Intermediary__Group__12 : rule__Intermediary__Group__12__Impl ;
    public final void rule__Intermediary__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1292:1: ( rule__Intermediary__Group__12__Impl )
            // InternalPagos.g:1293:2: rule__Intermediary__Group__12__Impl
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
    // InternalPagos.g:1299:1: rule__Intermediary__Group__12__Impl : ( RULE_RBRACE ) ;
    public final void rule__Intermediary__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1303:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:1304:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:1304:1: ( RULE_RBRACE )
            // InternalPagos.g:1305:2: RULE_RBRACE
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
    // InternalPagos.g:1315:1: rule__Intermediary__Group_10__0 : rule__Intermediary__Group_10__0__Impl rule__Intermediary__Group_10__1 ;
    public final void rule__Intermediary__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1319:1: ( rule__Intermediary__Group_10__0__Impl rule__Intermediary__Group_10__1 )
            // InternalPagos.g:1320:2: rule__Intermediary__Group_10__0__Impl rule__Intermediary__Group_10__1
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
    // InternalPagos.g:1327:1: rule__Intermediary__Group_10__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Intermediary__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1331:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1332:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1332:1: ( RULE_COMMA )
            // InternalPagos.g:1333:2: RULE_COMMA
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
    // InternalPagos.g:1342:1: rule__Intermediary__Group_10__1 : rule__Intermediary__Group_10__1__Impl ;
    public final void rule__Intermediary__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1346:1: ( rule__Intermediary__Group_10__1__Impl )
            // InternalPagos.g:1347:2: rule__Intermediary__Group_10__1__Impl
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
    // InternalPagos.g:1353:1: rule__Intermediary__Group_10__1__Impl : ( ( rule__Intermediary__SuperentitiesAssignment_10_1 ) ) ;
    public final void rule__Intermediary__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1357:1: ( ( ( rule__Intermediary__SuperentitiesAssignment_10_1 ) ) )
            // InternalPagos.g:1358:1: ( ( rule__Intermediary__SuperentitiesAssignment_10_1 ) )
            {
            // InternalPagos.g:1358:1: ( ( rule__Intermediary__SuperentitiesAssignment_10_1 ) )
            // InternalPagos.g:1359:2: ( rule__Intermediary__SuperentitiesAssignment_10_1 )
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitiesAssignment_10_1()); 
            // InternalPagos.g:1360:2: ( rule__Intermediary__SuperentitiesAssignment_10_1 )
            // InternalPagos.g:1360:3: rule__Intermediary__SuperentitiesAssignment_10_1
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
    // InternalPagos.g:1369:1: rule__SuperEntity__Group__0 : rule__SuperEntity__Group__0__Impl rule__SuperEntity__Group__1 ;
    public final void rule__SuperEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1373:1: ( rule__SuperEntity__Group__0__Impl rule__SuperEntity__Group__1 )
            // InternalPagos.g:1374:2: rule__SuperEntity__Group__0__Impl rule__SuperEntity__Group__1
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
    // InternalPagos.g:1381:1: rule__SuperEntity__Group__0__Impl : ( () ) ;
    public final void rule__SuperEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1385:1: ( ( () ) )
            // InternalPagos.g:1386:1: ( () )
            {
            // InternalPagos.g:1386:1: ( () )
            // InternalPagos.g:1387:2: ()
            {
             before(grammarAccess.getSuperEntityAccess().getSuperEntityAction_0()); 
            // InternalPagos.g:1388:2: ()
            // InternalPagos.g:1388:3: 
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
    // InternalPagos.g:1396:1: rule__SuperEntity__Group__1 : rule__SuperEntity__Group__1__Impl rule__SuperEntity__Group__2 ;
    public final void rule__SuperEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1400:1: ( rule__SuperEntity__Group__1__Impl rule__SuperEntity__Group__2 )
            // InternalPagos.g:1401:2: rule__SuperEntity__Group__1__Impl rule__SuperEntity__Group__2
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
    // InternalPagos.g:1408:1: rule__SuperEntity__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__SuperEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1412:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:1413:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:1413:1: ( RULE_LBRACE )
            // InternalPagos.g:1414:2: RULE_LBRACE
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
    // InternalPagos.g:1423:1: rule__SuperEntity__Group__2 : rule__SuperEntity__Group__2__Impl rule__SuperEntity__Group__3 ;
    public final void rule__SuperEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1427:1: ( rule__SuperEntity__Group__2__Impl rule__SuperEntity__Group__3 )
            // InternalPagos.g:1428:2: rule__SuperEntity__Group__2__Impl rule__SuperEntity__Group__3
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
    // InternalPagos.g:1435:1: rule__SuperEntity__Group__2__Impl : ( 'name' ) ;
    public final void rule__SuperEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1439:1: ( ( 'name' ) )
            // InternalPagos.g:1440:1: ( 'name' )
            {
            // InternalPagos.g:1440:1: ( 'name' )
            // InternalPagos.g:1441:2: 'name'
            {
             before(grammarAccess.getSuperEntityAccess().getNameKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPagos.g:1450:1: rule__SuperEntity__Group__3 : rule__SuperEntity__Group__3__Impl rule__SuperEntity__Group__4 ;
    public final void rule__SuperEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1454:1: ( rule__SuperEntity__Group__3__Impl rule__SuperEntity__Group__4 )
            // InternalPagos.g:1455:2: rule__SuperEntity__Group__3__Impl rule__SuperEntity__Group__4
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
    // InternalPagos.g:1462:1: rule__SuperEntity__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1466:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1467:1: ( RULE_COLON )
            {
            // InternalPagos.g:1467:1: ( RULE_COLON )
            // InternalPagos.g:1468:2: RULE_COLON
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
    // InternalPagos.g:1477:1: rule__SuperEntity__Group__4 : rule__SuperEntity__Group__4__Impl rule__SuperEntity__Group__5 ;
    public final void rule__SuperEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1481:1: ( rule__SuperEntity__Group__4__Impl rule__SuperEntity__Group__5 )
            // InternalPagos.g:1482:2: rule__SuperEntity__Group__4__Impl rule__SuperEntity__Group__5
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
    // InternalPagos.g:1489:1: rule__SuperEntity__Group__4__Impl : ( ( rule__SuperEntity__NameAssignment_4 ) ) ;
    public final void rule__SuperEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1493:1: ( ( ( rule__SuperEntity__NameAssignment_4 ) ) )
            // InternalPagos.g:1494:1: ( ( rule__SuperEntity__NameAssignment_4 ) )
            {
            // InternalPagos.g:1494:1: ( ( rule__SuperEntity__NameAssignment_4 ) )
            // InternalPagos.g:1495:2: ( rule__SuperEntity__NameAssignment_4 )
            {
             before(grammarAccess.getSuperEntityAccess().getNameAssignment_4()); 
            // InternalPagos.g:1496:2: ( rule__SuperEntity__NameAssignment_4 )
            // InternalPagos.g:1496:3: rule__SuperEntity__NameAssignment_4
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
    // InternalPagos.g:1504:1: rule__SuperEntity__Group__5 : rule__SuperEntity__Group__5__Impl rule__SuperEntity__Group__6 ;
    public final void rule__SuperEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1508:1: ( rule__SuperEntity__Group__5__Impl rule__SuperEntity__Group__6 )
            // InternalPagos.g:1509:2: rule__SuperEntity__Group__5__Impl rule__SuperEntity__Group__6
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
    // InternalPagos.g:1516:1: rule__SuperEntity__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1520:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1521:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1521:1: ( RULE_COMMA )
            // InternalPagos.g:1522:2: RULE_COMMA
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
    // InternalPagos.g:1531:1: rule__SuperEntity__Group__6 : rule__SuperEntity__Group__6__Impl rule__SuperEntity__Group__7 ;
    public final void rule__SuperEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1535:1: ( rule__SuperEntity__Group__6__Impl rule__SuperEntity__Group__7 )
            // InternalPagos.g:1536:2: rule__SuperEntity__Group__6__Impl rule__SuperEntity__Group__7
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
    // InternalPagos.g:1543:1: rule__SuperEntity__Group__6__Impl : ( 'description' ) ;
    public final void rule__SuperEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1547:1: ( ( 'description' ) )
            // InternalPagos.g:1548:1: ( 'description' )
            {
            // InternalPagos.g:1548:1: ( 'description' )
            // InternalPagos.g:1549:2: 'description'
            {
             before(grammarAccess.getSuperEntityAccess().getDescriptionKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPagos.g:1558:1: rule__SuperEntity__Group__7 : rule__SuperEntity__Group__7__Impl rule__SuperEntity__Group__8 ;
    public final void rule__SuperEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1562:1: ( rule__SuperEntity__Group__7__Impl rule__SuperEntity__Group__8 )
            // InternalPagos.g:1563:2: rule__SuperEntity__Group__7__Impl rule__SuperEntity__Group__8
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
    // InternalPagos.g:1570:1: rule__SuperEntity__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1574:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1575:1: ( RULE_COLON )
            {
            // InternalPagos.g:1575:1: ( RULE_COLON )
            // InternalPagos.g:1576:2: RULE_COLON
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
    // InternalPagos.g:1585:1: rule__SuperEntity__Group__8 : rule__SuperEntity__Group__8__Impl rule__SuperEntity__Group__9 ;
    public final void rule__SuperEntity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1589:1: ( rule__SuperEntity__Group__8__Impl rule__SuperEntity__Group__9 )
            // InternalPagos.g:1590:2: rule__SuperEntity__Group__8__Impl rule__SuperEntity__Group__9
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
    // InternalPagos.g:1597:1: rule__SuperEntity__Group__8__Impl : ( ( rule__SuperEntity__DescriptionAssignment_8 ) ) ;
    public final void rule__SuperEntity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1601:1: ( ( ( rule__SuperEntity__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:1602:1: ( ( rule__SuperEntity__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:1602:1: ( ( rule__SuperEntity__DescriptionAssignment_8 ) )
            // InternalPagos.g:1603:2: ( rule__SuperEntity__DescriptionAssignment_8 )
            {
             before(grammarAccess.getSuperEntityAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:1604:2: ( rule__SuperEntity__DescriptionAssignment_8 )
            // InternalPagos.g:1604:3: rule__SuperEntity__DescriptionAssignment_8
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
    // InternalPagos.g:1612:1: rule__SuperEntity__Group__9 : rule__SuperEntity__Group__9__Impl rule__SuperEntity__Group__10 ;
    public final void rule__SuperEntity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1616:1: ( rule__SuperEntity__Group__9__Impl rule__SuperEntity__Group__10 )
            // InternalPagos.g:1617:2: rule__SuperEntity__Group__9__Impl rule__SuperEntity__Group__10
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
    // InternalPagos.g:1624:1: rule__SuperEntity__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1628:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1629:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1629:1: ( RULE_COMMA )
            // InternalPagos.g:1630:2: RULE_COMMA
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
    // InternalPagos.g:1639:1: rule__SuperEntity__Group__10 : rule__SuperEntity__Group__10__Impl rule__SuperEntity__Group__11 ;
    public final void rule__SuperEntity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1643:1: ( rule__SuperEntity__Group__10__Impl rule__SuperEntity__Group__11 )
            // InternalPagos.g:1644:2: rule__SuperEntity__Group__10__Impl rule__SuperEntity__Group__11
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
    // InternalPagos.g:1651:1: rule__SuperEntity__Group__10__Impl : ( 'attributes' ) ;
    public final void rule__SuperEntity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1655:1: ( ( 'attributes' ) )
            // InternalPagos.g:1656:1: ( 'attributes' )
            {
            // InternalPagos.g:1656:1: ( 'attributes' )
            // InternalPagos.g:1657:2: 'attributes'
            {
             before(grammarAccess.getSuperEntityAccess().getAttributesKeyword_10()); 
            match(input,36,FOLLOW_2); 
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
    // InternalPagos.g:1666:1: rule__SuperEntity__Group__11 : rule__SuperEntity__Group__11__Impl rule__SuperEntity__Group__12 ;
    public final void rule__SuperEntity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1670:1: ( rule__SuperEntity__Group__11__Impl rule__SuperEntity__Group__12 )
            // InternalPagos.g:1671:2: rule__SuperEntity__Group__11__Impl rule__SuperEntity__Group__12
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
    // InternalPagos.g:1678:1: rule__SuperEntity__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1682:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1683:1: ( RULE_COLON )
            {
            // InternalPagos.g:1683:1: ( RULE_COLON )
            // InternalPagos.g:1684:2: RULE_COLON
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
    // InternalPagos.g:1693:1: rule__SuperEntity__Group__12 : rule__SuperEntity__Group__12__Impl rule__SuperEntity__Group__13 ;
    public final void rule__SuperEntity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1697:1: ( rule__SuperEntity__Group__12__Impl rule__SuperEntity__Group__13 )
            // InternalPagos.g:1698:2: rule__SuperEntity__Group__12__Impl rule__SuperEntity__Group__13
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
    // InternalPagos.g:1705:1: rule__SuperEntity__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__SuperEntity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1709:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:1710:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:1710:1: ( RULE_LBRACKET )
            // InternalPagos.g:1711:2: RULE_LBRACKET
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
    // InternalPagos.g:1720:1: rule__SuperEntity__Group__13 : rule__SuperEntity__Group__13__Impl rule__SuperEntity__Group__14 ;
    public final void rule__SuperEntity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1724:1: ( rule__SuperEntity__Group__13__Impl rule__SuperEntity__Group__14 )
            // InternalPagos.g:1725:2: rule__SuperEntity__Group__13__Impl rule__SuperEntity__Group__14
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
    // InternalPagos.g:1732:1: rule__SuperEntity__Group__13__Impl : ( ( rule__SuperEntity__AttListsAssignment_13 ) ) ;
    public final void rule__SuperEntity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1736:1: ( ( ( rule__SuperEntity__AttListsAssignment_13 ) ) )
            // InternalPagos.g:1737:1: ( ( rule__SuperEntity__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:1737:1: ( ( rule__SuperEntity__AttListsAssignment_13 ) )
            // InternalPagos.g:1738:2: ( rule__SuperEntity__AttListsAssignment_13 )
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:1739:2: ( rule__SuperEntity__AttListsAssignment_13 )
            // InternalPagos.g:1739:3: rule__SuperEntity__AttListsAssignment_13
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
    // InternalPagos.g:1747:1: rule__SuperEntity__Group__14 : rule__SuperEntity__Group__14__Impl rule__SuperEntity__Group__15 ;
    public final void rule__SuperEntity__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1751:1: ( rule__SuperEntity__Group__14__Impl rule__SuperEntity__Group__15 )
            // InternalPagos.g:1752:2: rule__SuperEntity__Group__14__Impl rule__SuperEntity__Group__15
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
    // InternalPagos.g:1759:1: rule__SuperEntity__Group__14__Impl : ( ( rule__SuperEntity__Group_14__0 )* ) ;
    public final void rule__SuperEntity__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1763:1: ( ( ( rule__SuperEntity__Group_14__0 )* ) )
            // InternalPagos.g:1764:1: ( ( rule__SuperEntity__Group_14__0 )* )
            {
            // InternalPagos.g:1764:1: ( ( rule__SuperEntity__Group_14__0 )* )
            // InternalPagos.g:1765:2: ( rule__SuperEntity__Group_14__0 )*
            {
             before(grammarAccess.getSuperEntityAccess().getGroup_14()); 
            // InternalPagos.g:1766:2: ( rule__SuperEntity__Group_14__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPagos.g:1766:3: rule__SuperEntity__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SuperEntity__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalPagos.g:1774:1: rule__SuperEntity__Group__15 : rule__SuperEntity__Group__15__Impl rule__SuperEntity__Group__16 ;
    public final void rule__SuperEntity__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1778:1: ( rule__SuperEntity__Group__15__Impl rule__SuperEntity__Group__16 )
            // InternalPagos.g:1779:2: rule__SuperEntity__Group__15__Impl rule__SuperEntity__Group__16
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
    // InternalPagos.g:1786:1: rule__SuperEntity__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__SuperEntity__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1790:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:1791:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:1791:1: ( RULE_RBRACKET )
            // InternalPagos.g:1792:2: RULE_RBRACKET
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
    // InternalPagos.g:1801:1: rule__SuperEntity__Group__16 : rule__SuperEntity__Group__16__Impl rule__SuperEntity__Group__17 ;
    public final void rule__SuperEntity__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1805:1: ( rule__SuperEntity__Group__16__Impl rule__SuperEntity__Group__17 )
            // InternalPagos.g:1806:2: rule__SuperEntity__Group__16__Impl rule__SuperEntity__Group__17
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
    // InternalPagos.g:1813:1: rule__SuperEntity__Group__16__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1817:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1818:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1818:1: ( RULE_COMMA )
            // InternalPagos.g:1819:2: RULE_COMMA
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
    // InternalPagos.g:1828:1: rule__SuperEntity__Group__17 : rule__SuperEntity__Group__17__Impl rule__SuperEntity__Group__18 ;
    public final void rule__SuperEntity__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1832:1: ( rule__SuperEntity__Group__17__Impl rule__SuperEntity__Group__18 )
            // InternalPagos.g:1833:2: rule__SuperEntity__Group__17__Impl rule__SuperEntity__Group__18
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
    // InternalPagos.g:1840:1: rule__SuperEntity__Group__17__Impl : ( 'entities' ) ;
    public final void rule__SuperEntity__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1844:1: ( ( 'entities' ) )
            // InternalPagos.g:1845:1: ( 'entities' )
            {
            // InternalPagos.g:1845:1: ( 'entities' )
            // InternalPagos.g:1846:2: 'entities'
            {
             before(grammarAccess.getSuperEntityAccess().getEntitiesKeyword_17()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPagos.g:1855:1: rule__SuperEntity__Group__18 : rule__SuperEntity__Group__18__Impl rule__SuperEntity__Group__19 ;
    public final void rule__SuperEntity__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1859:1: ( rule__SuperEntity__Group__18__Impl rule__SuperEntity__Group__19 )
            // InternalPagos.g:1860:2: rule__SuperEntity__Group__18__Impl rule__SuperEntity__Group__19
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
    // InternalPagos.g:1867:1: rule__SuperEntity__Group__18__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1871:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1872:1: ( RULE_COLON )
            {
            // InternalPagos.g:1872:1: ( RULE_COLON )
            // InternalPagos.g:1873:2: RULE_COLON
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
    // InternalPagos.g:1882:1: rule__SuperEntity__Group__19 : rule__SuperEntity__Group__19__Impl rule__SuperEntity__Group__20 ;
    public final void rule__SuperEntity__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1886:1: ( rule__SuperEntity__Group__19__Impl rule__SuperEntity__Group__20 )
            // InternalPagos.g:1887:2: rule__SuperEntity__Group__19__Impl rule__SuperEntity__Group__20
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
    // InternalPagos.g:1894:1: rule__SuperEntity__Group__19__Impl : ( RULE_LBRACKET ) ;
    public final void rule__SuperEntity__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1898:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:1899:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:1899:1: ( RULE_LBRACKET )
            // InternalPagos.g:1900:2: RULE_LBRACKET
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
    // InternalPagos.g:1909:1: rule__SuperEntity__Group__20 : rule__SuperEntity__Group__20__Impl rule__SuperEntity__Group__21 ;
    public final void rule__SuperEntity__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1913:1: ( rule__SuperEntity__Group__20__Impl rule__SuperEntity__Group__21 )
            // InternalPagos.g:1914:2: rule__SuperEntity__Group__20__Impl rule__SuperEntity__Group__21
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
    // InternalPagos.g:1921:1: rule__SuperEntity__Group__20__Impl : ( ( rule__SuperEntity__ParticipantsAssignment_20 ) ) ;
    public final void rule__SuperEntity__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1925:1: ( ( ( rule__SuperEntity__ParticipantsAssignment_20 ) ) )
            // InternalPagos.g:1926:1: ( ( rule__SuperEntity__ParticipantsAssignment_20 ) )
            {
            // InternalPagos.g:1926:1: ( ( rule__SuperEntity__ParticipantsAssignment_20 ) )
            // InternalPagos.g:1927:2: ( rule__SuperEntity__ParticipantsAssignment_20 )
            {
             before(grammarAccess.getSuperEntityAccess().getParticipantsAssignment_20()); 
            // InternalPagos.g:1928:2: ( rule__SuperEntity__ParticipantsAssignment_20 )
            // InternalPagos.g:1928:3: rule__SuperEntity__ParticipantsAssignment_20
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
    // InternalPagos.g:1936:1: rule__SuperEntity__Group__21 : rule__SuperEntity__Group__21__Impl rule__SuperEntity__Group__22 ;
    public final void rule__SuperEntity__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1940:1: ( rule__SuperEntity__Group__21__Impl rule__SuperEntity__Group__22 )
            // InternalPagos.g:1941:2: rule__SuperEntity__Group__21__Impl rule__SuperEntity__Group__22
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
    // InternalPagos.g:1948:1: rule__SuperEntity__Group__21__Impl : ( ( rule__SuperEntity__Group_21__0 )* ) ;
    public final void rule__SuperEntity__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1952:1: ( ( ( rule__SuperEntity__Group_21__0 )* ) )
            // InternalPagos.g:1953:1: ( ( rule__SuperEntity__Group_21__0 )* )
            {
            // InternalPagos.g:1953:1: ( ( rule__SuperEntity__Group_21__0 )* )
            // InternalPagos.g:1954:2: ( rule__SuperEntity__Group_21__0 )*
            {
             before(grammarAccess.getSuperEntityAccess().getGroup_21()); 
            // InternalPagos.g:1955:2: ( rule__SuperEntity__Group_21__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPagos.g:1955:3: rule__SuperEntity__Group_21__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SuperEntity__Group_21__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalPagos.g:1963:1: rule__SuperEntity__Group__22 : rule__SuperEntity__Group__22__Impl rule__SuperEntity__Group__23 ;
    public final void rule__SuperEntity__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1967:1: ( rule__SuperEntity__Group__22__Impl rule__SuperEntity__Group__23 )
            // InternalPagos.g:1968:2: rule__SuperEntity__Group__22__Impl rule__SuperEntity__Group__23
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
    // InternalPagos.g:1975:1: rule__SuperEntity__Group__22__Impl : ( RULE_RBRACKET ) ;
    public final void rule__SuperEntity__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1979:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:1980:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:1980:1: ( RULE_RBRACKET )
            // InternalPagos.g:1981:2: RULE_RBRACKET
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
    // InternalPagos.g:1990:1: rule__SuperEntity__Group__23 : rule__SuperEntity__Group__23__Impl ;
    public final void rule__SuperEntity__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1994:1: ( rule__SuperEntity__Group__23__Impl )
            // InternalPagos.g:1995:2: rule__SuperEntity__Group__23__Impl
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
    // InternalPagos.g:2001:1: rule__SuperEntity__Group__23__Impl : ( RULE_RBRACE ) ;
    public final void rule__SuperEntity__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2005:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:2006:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:2006:1: ( RULE_RBRACE )
            // InternalPagos.g:2007:2: RULE_RBRACE
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
    // InternalPagos.g:2017:1: rule__SuperEntity__Group_14__0 : rule__SuperEntity__Group_14__0__Impl rule__SuperEntity__Group_14__1 ;
    public final void rule__SuperEntity__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2021:1: ( rule__SuperEntity__Group_14__0__Impl rule__SuperEntity__Group_14__1 )
            // InternalPagos.g:2022:2: rule__SuperEntity__Group_14__0__Impl rule__SuperEntity__Group_14__1
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
    // InternalPagos.g:2029:1: rule__SuperEntity__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2033:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2034:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2034:1: ( RULE_COMMA )
            // InternalPagos.g:2035:2: RULE_COMMA
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
    // InternalPagos.g:2044:1: rule__SuperEntity__Group_14__1 : rule__SuperEntity__Group_14__1__Impl ;
    public final void rule__SuperEntity__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2048:1: ( rule__SuperEntity__Group_14__1__Impl )
            // InternalPagos.g:2049:2: rule__SuperEntity__Group_14__1__Impl
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
    // InternalPagos.g:2055:1: rule__SuperEntity__Group_14__1__Impl : ( ( rule__SuperEntity__AttListsAssignment_14_1 ) ) ;
    public final void rule__SuperEntity__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2059:1: ( ( ( rule__SuperEntity__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:2060:1: ( ( rule__SuperEntity__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:2060:1: ( ( rule__SuperEntity__AttListsAssignment_14_1 ) )
            // InternalPagos.g:2061:2: ( rule__SuperEntity__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:2062:2: ( rule__SuperEntity__AttListsAssignment_14_1 )
            // InternalPagos.g:2062:3: rule__SuperEntity__AttListsAssignment_14_1
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
    // InternalPagos.g:2071:1: rule__SuperEntity__Group_21__0 : rule__SuperEntity__Group_21__0__Impl rule__SuperEntity__Group_21__1 ;
    public final void rule__SuperEntity__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2075:1: ( rule__SuperEntity__Group_21__0__Impl rule__SuperEntity__Group_21__1 )
            // InternalPagos.g:2076:2: rule__SuperEntity__Group_21__0__Impl rule__SuperEntity__Group_21__1
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
    // InternalPagos.g:2083:1: rule__SuperEntity__Group_21__0__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2087:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2088:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2088:1: ( RULE_COMMA )
            // InternalPagos.g:2089:2: RULE_COMMA
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
    // InternalPagos.g:2098:1: rule__SuperEntity__Group_21__1 : rule__SuperEntity__Group_21__1__Impl ;
    public final void rule__SuperEntity__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2102:1: ( rule__SuperEntity__Group_21__1__Impl )
            // InternalPagos.g:2103:2: rule__SuperEntity__Group_21__1__Impl
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
    // InternalPagos.g:2109:1: rule__SuperEntity__Group_21__1__Impl : ( ( rule__SuperEntity__ParticipantsAssignment_21_1 ) ) ;
    public final void rule__SuperEntity__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2113:1: ( ( ( rule__SuperEntity__ParticipantsAssignment_21_1 ) ) )
            // InternalPagos.g:2114:1: ( ( rule__SuperEntity__ParticipantsAssignment_21_1 ) )
            {
            // InternalPagos.g:2114:1: ( ( rule__SuperEntity__ParticipantsAssignment_21_1 ) )
            // InternalPagos.g:2115:2: ( rule__SuperEntity__ParticipantsAssignment_21_1 )
            {
             before(grammarAccess.getSuperEntityAccess().getParticipantsAssignment_21_1()); 
            // InternalPagos.g:2116:2: ( rule__SuperEntity__ParticipantsAssignment_21_1 )
            // InternalPagos.g:2116:3: rule__SuperEntity__ParticipantsAssignment_21_1
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
    // InternalPagos.g:2125:1: rule__Participant__Group__0 : rule__Participant__Group__0__Impl rule__Participant__Group__1 ;
    public final void rule__Participant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2129:1: ( rule__Participant__Group__0__Impl rule__Participant__Group__1 )
            // InternalPagos.g:2130:2: rule__Participant__Group__0__Impl rule__Participant__Group__1
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
    // InternalPagos.g:2137:1: rule__Participant__Group__0__Impl : ( () ) ;
    public final void rule__Participant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2141:1: ( ( () ) )
            // InternalPagos.g:2142:1: ( () )
            {
            // InternalPagos.g:2142:1: ( () )
            // InternalPagos.g:2143:2: ()
            {
             before(grammarAccess.getParticipantAccess().getParticipantAction_0()); 
            // InternalPagos.g:2144:2: ()
            // InternalPagos.g:2144:3: 
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
    // InternalPagos.g:2152:1: rule__Participant__Group__1 : rule__Participant__Group__1__Impl rule__Participant__Group__2 ;
    public final void rule__Participant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2156:1: ( rule__Participant__Group__1__Impl rule__Participant__Group__2 )
            // InternalPagos.g:2157:2: rule__Participant__Group__1__Impl rule__Participant__Group__2
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
    // InternalPagos.g:2164:1: rule__Participant__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Participant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2168:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:2169:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:2169:1: ( RULE_LBRACE )
            // InternalPagos.g:2170:2: RULE_LBRACE
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
    // InternalPagos.g:2179:1: rule__Participant__Group__2 : rule__Participant__Group__2__Impl rule__Participant__Group__3 ;
    public final void rule__Participant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2183:1: ( rule__Participant__Group__2__Impl rule__Participant__Group__3 )
            // InternalPagos.g:2184:2: rule__Participant__Group__2__Impl rule__Participant__Group__3
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
    // InternalPagos.g:2191:1: rule__Participant__Group__2__Impl : ( 'name' ) ;
    public final void rule__Participant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2195:1: ( ( 'name' ) )
            // InternalPagos.g:2196:1: ( 'name' )
            {
            // InternalPagos.g:2196:1: ( 'name' )
            // InternalPagos.g:2197:2: 'name'
            {
             before(grammarAccess.getParticipantAccess().getNameKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPagos.g:2206:1: rule__Participant__Group__3 : rule__Participant__Group__3__Impl rule__Participant__Group__4 ;
    public final void rule__Participant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2210:1: ( rule__Participant__Group__3__Impl rule__Participant__Group__4 )
            // InternalPagos.g:2211:2: rule__Participant__Group__3__Impl rule__Participant__Group__4
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
    // InternalPagos.g:2218:1: rule__Participant__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2222:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2223:1: ( RULE_COLON )
            {
            // InternalPagos.g:2223:1: ( RULE_COLON )
            // InternalPagos.g:2224:2: RULE_COLON
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
    // InternalPagos.g:2233:1: rule__Participant__Group__4 : rule__Participant__Group__4__Impl rule__Participant__Group__5 ;
    public final void rule__Participant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2237:1: ( rule__Participant__Group__4__Impl rule__Participant__Group__5 )
            // InternalPagos.g:2238:2: rule__Participant__Group__4__Impl rule__Participant__Group__5
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
    // InternalPagos.g:2245:1: rule__Participant__Group__4__Impl : ( ( rule__Participant__NameAssignment_4 ) ) ;
    public final void rule__Participant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2249:1: ( ( ( rule__Participant__NameAssignment_4 ) ) )
            // InternalPagos.g:2250:1: ( ( rule__Participant__NameAssignment_4 ) )
            {
            // InternalPagos.g:2250:1: ( ( rule__Participant__NameAssignment_4 ) )
            // InternalPagos.g:2251:2: ( rule__Participant__NameAssignment_4 )
            {
             before(grammarAccess.getParticipantAccess().getNameAssignment_4()); 
            // InternalPagos.g:2252:2: ( rule__Participant__NameAssignment_4 )
            // InternalPagos.g:2252:3: rule__Participant__NameAssignment_4
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
    // InternalPagos.g:2260:1: rule__Participant__Group__5 : rule__Participant__Group__5__Impl rule__Participant__Group__6 ;
    public final void rule__Participant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2264:1: ( rule__Participant__Group__5__Impl rule__Participant__Group__6 )
            // InternalPagos.g:2265:2: rule__Participant__Group__5__Impl rule__Participant__Group__6
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
    // InternalPagos.g:2272:1: rule__Participant__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2276:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2277:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2277:1: ( RULE_COMMA )
            // InternalPagos.g:2278:2: RULE_COMMA
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
    // InternalPagos.g:2287:1: rule__Participant__Group__6 : rule__Participant__Group__6__Impl rule__Participant__Group__7 ;
    public final void rule__Participant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2291:1: ( rule__Participant__Group__6__Impl rule__Participant__Group__7 )
            // InternalPagos.g:2292:2: rule__Participant__Group__6__Impl rule__Participant__Group__7
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
    // InternalPagos.g:2299:1: rule__Participant__Group__6__Impl : ( 'description' ) ;
    public final void rule__Participant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2303:1: ( ( 'description' ) )
            // InternalPagos.g:2304:1: ( 'description' )
            {
            // InternalPagos.g:2304:1: ( 'description' )
            // InternalPagos.g:2305:2: 'description'
            {
             before(grammarAccess.getParticipantAccess().getDescriptionKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPagos.g:2314:1: rule__Participant__Group__7 : rule__Participant__Group__7__Impl rule__Participant__Group__8 ;
    public final void rule__Participant__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2318:1: ( rule__Participant__Group__7__Impl rule__Participant__Group__8 )
            // InternalPagos.g:2319:2: rule__Participant__Group__7__Impl rule__Participant__Group__8
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
    // InternalPagos.g:2326:1: rule__Participant__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2330:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2331:1: ( RULE_COLON )
            {
            // InternalPagos.g:2331:1: ( RULE_COLON )
            // InternalPagos.g:2332:2: RULE_COLON
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
    // InternalPagos.g:2341:1: rule__Participant__Group__8 : rule__Participant__Group__8__Impl rule__Participant__Group__9 ;
    public final void rule__Participant__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2345:1: ( rule__Participant__Group__8__Impl rule__Participant__Group__9 )
            // InternalPagos.g:2346:2: rule__Participant__Group__8__Impl rule__Participant__Group__9
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
    // InternalPagos.g:2353:1: rule__Participant__Group__8__Impl : ( ( rule__Participant__DescriptionAssignment_8 ) ) ;
    public final void rule__Participant__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2357:1: ( ( ( rule__Participant__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:2358:1: ( ( rule__Participant__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:2358:1: ( ( rule__Participant__DescriptionAssignment_8 ) )
            // InternalPagos.g:2359:2: ( rule__Participant__DescriptionAssignment_8 )
            {
             before(grammarAccess.getParticipantAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:2360:2: ( rule__Participant__DescriptionAssignment_8 )
            // InternalPagos.g:2360:3: rule__Participant__DescriptionAssignment_8
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
    // InternalPagos.g:2368:1: rule__Participant__Group__9 : rule__Participant__Group__9__Impl rule__Participant__Group__10 ;
    public final void rule__Participant__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2372:1: ( rule__Participant__Group__9__Impl rule__Participant__Group__10 )
            // InternalPagos.g:2373:2: rule__Participant__Group__9__Impl rule__Participant__Group__10
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
    // InternalPagos.g:2380:1: rule__Participant__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2384:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2385:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2385:1: ( RULE_COMMA )
            // InternalPagos.g:2386:2: RULE_COMMA
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
    // InternalPagos.g:2395:1: rule__Participant__Group__10 : rule__Participant__Group__10__Impl rule__Participant__Group__11 ;
    public final void rule__Participant__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2399:1: ( rule__Participant__Group__10__Impl rule__Participant__Group__11 )
            // InternalPagos.g:2400:2: rule__Participant__Group__10__Impl rule__Participant__Group__11
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
    // InternalPagos.g:2407:1: rule__Participant__Group__10__Impl : ( 'attributes' ) ;
    public final void rule__Participant__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2411:1: ( ( 'attributes' ) )
            // InternalPagos.g:2412:1: ( 'attributes' )
            {
            // InternalPagos.g:2412:1: ( 'attributes' )
            // InternalPagos.g:2413:2: 'attributes'
            {
             before(grammarAccess.getParticipantAccess().getAttributesKeyword_10()); 
            match(input,36,FOLLOW_2); 
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
    // InternalPagos.g:2422:1: rule__Participant__Group__11 : rule__Participant__Group__11__Impl rule__Participant__Group__12 ;
    public final void rule__Participant__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2426:1: ( rule__Participant__Group__11__Impl rule__Participant__Group__12 )
            // InternalPagos.g:2427:2: rule__Participant__Group__11__Impl rule__Participant__Group__12
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
    // InternalPagos.g:2434:1: rule__Participant__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2438:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2439:1: ( RULE_COLON )
            {
            // InternalPagos.g:2439:1: ( RULE_COLON )
            // InternalPagos.g:2440:2: RULE_COLON
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
    // InternalPagos.g:2449:1: rule__Participant__Group__12 : rule__Participant__Group__12__Impl rule__Participant__Group__13 ;
    public final void rule__Participant__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2453:1: ( rule__Participant__Group__12__Impl rule__Participant__Group__13 )
            // InternalPagos.g:2454:2: rule__Participant__Group__12__Impl rule__Participant__Group__13
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
    // InternalPagos.g:2461:1: rule__Participant__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Participant__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2465:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:2466:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:2466:1: ( RULE_LBRACKET )
            // InternalPagos.g:2467:2: RULE_LBRACKET
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
    // InternalPagos.g:2476:1: rule__Participant__Group__13 : rule__Participant__Group__13__Impl rule__Participant__Group__14 ;
    public final void rule__Participant__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2480:1: ( rule__Participant__Group__13__Impl rule__Participant__Group__14 )
            // InternalPagos.g:2481:2: rule__Participant__Group__13__Impl rule__Participant__Group__14
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
    // InternalPagos.g:2488:1: rule__Participant__Group__13__Impl : ( ( rule__Participant__AttListsAssignment_13 ) ) ;
    public final void rule__Participant__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2492:1: ( ( ( rule__Participant__AttListsAssignment_13 ) ) )
            // InternalPagos.g:2493:1: ( ( rule__Participant__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:2493:1: ( ( rule__Participant__AttListsAssignment_13 ) )
            // InternalPagos.g:2494:2: ( rule__Participant__AttListsAssignment_13 )
            {
             before(grammarAccess.getParticipantAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:2495:2: ( rule__Participant__AttListsAssignment_13 )
            // InternalPagos.g:2495:3: rule__Participant__AttListsAssignment_13
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
    // InternalPagos.g:2503:1: rule__Participant__Group__14 : rule__Participant__Group__14__Impl rule__Participant__Group__15 ;
    public final void rule__Participant__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2507:1: ( rule__Participant__Group__14__Impl rule__Participant__Group__15 )
            // InternalPagos.g:2508:2: rule__Participant__Group__14__Impl rule__Participant__Group__15
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
    // InternalPagos.g:2515:1: rule__Participant__Group__14__Impl : ( ( rule__Participant__Group_14__0 )* ) ;
    public final void rule__Participant__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2519:1: ( ( ( rule__Participant__Group_14__0 )* ) )
            // InternalPagos.g:2520:1: ( ( rule__Participant__Group_14__0 )* )
            {
            // InternalPagos.g:2520:1: ( ( rule__Participant__Group_14__0 )* )
            // InternalPagos.g:2521:2: ( rule__Participant__Group_14__0 )*
            {
             before(grammarAccess.getParticipantAccess().getGroup_14()); 
            // InternalPagos.g:2522:2: ( rule__Participant__Group_14__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPagos.g:2522:3: rule__Participant__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Participant__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalPagos.g:2530:1: rule__Participant__Group__15 : rule__Participant__Group__15__Impl rule__Participant__Group__16 ;
    public final void rule__Participant__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2534:1: ( rule__Participant__Group__15__Impl rule__Participant__Group__16 )
            // InternalPagos.g:2535:2: rule__Participant__Group__15__Impl rule__Participant__Group__16
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
    // InternalPagos.g:2542:1: rule__Participant__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Participant__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2546:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:2547:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:2547:1: ( RULE_RBRACKET )
            // InternalPagos.g:2548:2: RULE_RBRACKET
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
    // InternalPagos.g:2557:1: rule__Participant__Group__16 : rule__Participant__Group__16__Impl rule__Participant__Group__17 ;
    public final void rule__Participant__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2561:1: ( rule__Participant__Group__16__Impl rule__Participant__Group__17 )
            // InternalPagos.g:2562:2: rule__Participant__Group__16__Impl rule__Participant__Group__17
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
    // InternalPagos.g:2569:1: rule__Participant__Group__16__Impl : ( RULE_RBRACE ) ;
    public final void rule__Participant__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2573:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:2574:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:2574:1: ( RULE_RBRACE )
            // InternalPagos.g:2575:2: RULE_RBRACE
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
    // InternalPagos.g:2584:1: rule__Participant__Group__17 : rule__Participant__Group__17__Impl rule__Participant__Group__18 ;
    public final void rule__Participant__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2588:1: ( rule__Participant__Group__17__Impl rule__Participant__Group__18 )
            // InternalPagos.g:2589:2: rule__Participant__Group__17__Impl rule__Participant__Group__18
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
    // InternalPagos.g:2596:1: rule__Participant__Group__17__Impl : ( ( rule__Participant__Group_17__0 )? ) ;
    public final void rule__Participant__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2600:1: ( ( ( rule__Participant__Group_17__0 )? ) )
            // InternalPagos.g:2601:1: ( ( rule__Participant__Group_17__0 )? )
            {
            // InternalPagos.g:2601:1: ( ( rule__Participant__Group_17__0 )? )
            // InternalPagos.g:2602:2: ( rule__Participant__Group_17__0 )?
            {
             before(grammarAccess.getParticipantAccess().getGroup_17()); 
            // InternalPagos.g:2603:2: ( rule__Participant__Group_17__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_COMMA) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPagos.g:2603:3: rule__Participant__Group_17__0
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
    // InternalPagos.g:2611:1: rule__Participant__Group__18 : rule__Participant__Group__18__Impl ;
    public final void rule__Participant__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2615:1: ( rule__Participant__Group__18__Impl )
            // InternalPagos.g:2616:2: rule__Participant__Group__18__Impl
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
    // InternalPagos.g:2622:1: rule__Participant__Group__18__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Participant__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2626:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:2627:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:2627:1: ( RULE_RBRACKET )
            // InternalPagos.g:2628:2: RULE_RBRACKET
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
    // InternalPagos.g:2638:1: rule__Participant__Group_14__0 : rule__Participant__Group_14__0__Impl rule__Participant__Group_14__1 ;
    public final void rule__Participant__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2642:1: ( rule__Participant__Group_14__0__Impl rule__Participant__Group_14__1 )
            // InternalPagos.g:2643:2: rule__Participant__Group_14__0__Impl rule__Participant__Group_14__1
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
    // InternalPagos.g:2650:1: rule__Participant__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2654:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2655:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2655:1: ( RULE_COMMA )
            // InternalPagos.g:2656:2: RULE_COMMA
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
    // InternalPagos.g:2665:1: rule__Participant__Group_14__1 : rule__Participant__Group_14__1__Impl ;
    public final void rule__Participant__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2669:1: ( rule__Participant__Group_14__1__Impl )
            // InternalPagos.g:2670:2: rule__Participant__Group_14__1__Impl
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
    // InternalPagos.g:2676:1: rule__Participant__Group_14__1__Impl : ( ( rule__Participant__AttListsAssignment_14_1 ) ) ;
    public final void rule__Participant__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2680:1: ( ( ( rule__Participant__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:2681:1: ( ( rule__Participant__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:2681:1: ( ( rule__Participant__AttListsAssignment_14_1 ) )
            // InternalPagos.g:2682:2: ( rule__Participant__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getParticipantAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:2683:2: ( rule__Participant__AttListsAssignment_14_1 )
            // InternalPagos.g:2683:3: rule__Participant__AttListsAssignment_14_1
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
    // InternalPagos.g:2692:1: rule__Participant__Group_17__0 : rule__Participant__Group_17__0__Impl rule__Participant__Group_17__1 ;
    public final void rule__Participant__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2696:1: ( rule__Participant__Group_17__0__Impl rule__Participant__Group_17__1 )
            // InternalPagos.g:2697:2: rule__Participant__Group_17__0__Impl rule__Participant__Group_17__1
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
    // InternalPagos.g:2704:1: rule__Participant__Group_17__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2708:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2709:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2709:1: ( RULE_COMMA )
            // InternalPagos.g:2710:2: RULE_COMMA
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
    // InternalPagos.g:2719:1: rule__Participant__Group_17__1 : rule__Participant__Group_17__1__Impl rule__Participant__Group_17__2 ;
    public final void rule__Participant__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2723:1: ( rule__Participant__Group_17__1__Impl rule__Participant__Group_17__2 )
            // InternalPagos.g:2724:2: rule__Participant__Group_17__1__Impl rule__Participant__Group_17__2
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
    // InternalPagos.g:2731:1: rule__Participant__Group_17__1__Impl : ( 'InformationTemplate' ) ;
    public final void rule__Participant__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2735:1: ( ( 'InformationTemplate' ) )
            // InternalPagos.g:2736:1: ( 'InformationTemplate' )
            {
            // InternalPagos.g:2736:1: ( 'InformationTemplate' )
            // InternalPagos.g:2737:2: 'InformationTemplate'
            {
             before(grammarAccess.getParticipantAccess().getInformationTemplateKeyword_17_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalPagos.g:2746:1: rule__Participant__Group_17__2 : rule__Participant__Group_17__2__Impl rule__Participant__Group_17__3 ;
    public final void rule__Participant__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2750:1: ( rule__Participant__Group_17__2__Impl rule__Participant__Group_17__3 )
            // InternalPagos.g:2751:2: rule__Participant__Group_17__2__Impl rule__Participant__Group_17__3
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
    // InternalPagos.g:2758:1: rule__Participant__Group_17__2__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2762:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2763:1: ( RULE_COLON )
            {
            // InternalPagos.g:2763:1: ( RULE_COLON )
            // InternalPagos.g:2764:2: RULE_COLON
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
    // InternalPagos.g:2773:1: rule__Participant__Group_17__3 : rule__Participant__Group_17__3__Impl rule__Participant__Group_17__4 ;
    public final void rule__Participant__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2777:1: ( rule__Participant__Group_17__3__Impl rule__Participant__Group_17__4 )
            // InternalPagos.g:2778:2: rule__Participant__Group_17__3__Impl rule__Participant__Group_17__4
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
    // InternalPagos.g:2785:1: rule__Participant__Group_17__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Participant__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2789:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:2790:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:2790:1: ( RULE_LBRACKET )
            // InternalPagos.g:2791:2: RULE_LBRACKET
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
    // InternalPagos.g:2800:1: rule__Participant__Group_17__4 : rule__Participant__Group_17__4__Impl rule__Participant__Group_17__5 ;
    public final void rule__Participant__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2804:1: ( rule__Participant__Group_17__4__Impl rule__Participant__Group_17__5 )
            // InternalPagos.g:2805:2: rule__Participant__Group_17__4__Impl rule__Participant__Group_17__5
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
    // InternalPagos.g:2812:1: rule__Participant__Group_17__4__Impl : ( ( rule__Participant__TemplatesFormsAssignment_17_4 ) ) ;
    public final void rule__Participant__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2816:1: ( ( ( rule__Participant__TemplatesFormsAssignment_17_4 ) ) )
            // InternalPagos.g:2817:1: ( ( rule__Participant__TemplatesFormsAssignment_17_4 ) )
            {
            // InternalPagos.g:2817:1: ( ( rule__Participant__TemplatesFormsAssignment_17_4 ) )
            // InternalPagos.g:2818:2: ( rule__Participant__TemplatesFormsAssignment_17_4 )
            {
             before(grammarAccess.getParticipantAccess().getTemplatesFormsAssignment_17_4()); 
            // InternalPagos.g:2819:2: ( rule__Participant__TemplatesFormsAssignment_17_4 )
            // InternalPagos.g:2819:3: rule__Participant__TemplatesFormsAssignment_17_4
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
    // InternalPagos.g:2827:1: rule__Participant__Group_17__5 : rule__Participant__Group_17__5__Impl ;
    public final void rule__Participant__Group_17__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2831:1: ( rule__Participant__Group_17__5__Impl )
            // InternalPagos.g:2832:2: rule__Participant__Group_17__5__Impl
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
    // InternalPagos.g:2838:1: rule__Participant__Group_17__5__Impl : ( ( rule__Participant__Group_17_5__0 )* ) ;
    public final void rule__Participant__Group_17__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2842:1: ( ( ( rule__Participant__Group_17_5__0 )* ) )
            // InternalPagos.g:2843:1: ( ( rule__Participant__Group_17_5__0 )* )
            {
            // InternalPagos.g:2843:1: ( ( rule__Participant__Group_17_5__0 )* )
            // InternalPagos.g:2844:2: ( rule__Participant__Group_17_5__0 )*
            {
             before(grammarAccess.getParticipantAccess().getGroup_17_5()); 
            // InternalPagos.g:2845:2: ( rule__Participant__Group_17_5__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPagos.g:2845:3: rule__Participant__Group_17_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Participant__Group_17_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalPagos.g:2854:1: rule__Participant__Group_17_5__0 : rule__Participant__Group_17_5__0__Impl rule__Participant__Group_17_5__1 ;
    public final void rule__Participant__Group_17_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2858:1: ( rule__Participant__Group_17_5__0__Impl rule__Participant__Group_17_5__1 )
            // InternalPagos.g:2859:2: rule__Participant__Group_17_5__0__Impl rule__Participant__Group_17_5__1
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
    // InternalPagos.g:2866:1: rule__Participant__Group_17_5__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group_17_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2870:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2871:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2871:1: ( RULE_COMMA )
            // InternalPagos.g:2872:2: RULE_COMMA
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
    // InternalPagos.g:2881:1: rule__Participant__Group_17_5__1 : rule__Participant__Group_17_5__1__Impl ;
    public final void rule__Participant__Group_17_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2885:1: ( rule__Participant__Group_17_5__1__Impl )
            // InternalPagos.g:2886:2: rule__Participant__Group_17_5__1__Impl
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
    // InternalPagos.g:2892:1: rule__Participant__Group_17_5__1__Impl : ( ( rule__Participant__TemplatesFormsAssignment_17_5_1 ) ) ;
    public final void rule__Participant__Group_17_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2896:1: ( ( ( rule__Participant__TemplatesFormsAssignment_17_5_1 ) ) )
            // InternalPagos.g:2897:1: ( ( rule__Participant__TemplatesFormsAssignment_17_5_1 ) )
            {
            // InternalPagos.g:2897:1: ( ( rule__Participant__TemplatesFormsAssignment_17_5_1 ) )
            // InternalPagos.g:2898:2: ( rule__Participant__TemplatesFormsAssignment_17_5_1 )
            {
             before(grammarAccess.getParticipantAccess().getTemplatesFormsAssignment_17_5_1()); 
            // InternalPagos.g:2899:2: ( rule__Participant__TemplatesFormsAssignment_17_5_1 )
            // InternalPagos.g:2899:3: rule__Participant__TemplatesFormsAssignment_17_5_1
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
    // InternalPagos.g:2908:1: rule__Provider__Group__0 : rule__Provider__Group__0__Impl rule__Provider__Group__1 ;
    public final void rule__Provider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2912:1: ( rule__Provider__Group__0__Impl rule__Provider__Group__1 )
            // InternalPagos.g:2913:2: rule__Provider__Group__0__Impl rule__Provider__Group__1
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
    // InternalPagos.g:2920:1: rule__Provider__Group__0__Impl : ( () ) ;
    public final void rule__Provider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2924:1: ( ( () ) )
            // InternalPagos.g:2925:1: ( () )
            {
            // InternalPagos.g:2925:1: ( () )
            // InternalPagos.g:2926:2: ()
            {
             before(grammarAccess.getProviderAccess().getProviderAction_0()); 
            // InternalPagos.g:2927:2: ()
            // InternalPagos.g:2927:3: 
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
    // InternalPagos.g:2935:1: rule__Provider__Group__1 : rule__Provider__Group__1__Impl rule__Provider__Group__2 ;
    public final void rule__Provider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2939:1: ( rule__Provider__Group__1__Impl rule__Provider__Group__2 )
            // InternalPagos.g:2940:2: rule__Provider__Group__1__Impl rule__Provider__Group__2
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
    // InternalPagos.g:2947:1: rule__Provider__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Provider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2951:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:2952:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:2952:1: ( RULE_LBRACE )
            // InternalPagos.g:2953:2: RULE_LBRACE
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
    // InternalPagos.g:2962:1: rule__Provider__Group__2 : rule__Provider__Group__2__Impl rule__Provider__Group__3 ;
    public final void rule__Provider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2966:1: ( rule__Provider__Group__2__Impl rule__Provider__Group__3 )
            // InternalPagos.g:2967:2: rule__Provider__Group__2__Impl rule__Provider__Group__3
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
    // InternalPagos.g:2974:1: rule__Provider__Group__2__Impl : ( 'name' ) ;
    public final void rule__Provider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2978:1: ( ( 'name' ) )
            // InternalPagos.g:2979:1: ( 'name' )
            {
            // InternalPagos.g:2979:1: ( 'name' )
            // InternalPagos.g:2980:2: 'name'
            {
             before(grammarAccess.getProviderAccess().getNameKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPagos.g:2989:1: rule__Provider__Group__3 : rule__Provider__Group__3__Impl rule__Provider__Group__4 ;
    public final void rule__Provider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2993:1: ( rule__Provider__Group__3__Impl rule__Provider__Group__4 )
            // InternalPagos.g:2994:2: rule__Provider__Group__3__Impl rule__Provider__Group__4
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
    // InternalPagos.g:3001:1: rule__Provider__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Provider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3005:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3006:1: ( RULE_COLON )
            {
            // InternalPagos.g:3006:1: ( RULE_COLON )
            // InternalPagos.g:3007:2: RULE_COLON
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
    // InternalPagos.g:3016:1: rule__Provider__Group__4 : rule__Provider__Group__4__Impl rule__Provider__Group__5 ;
    public final void rule__Provider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3020:1: ( rule__Provider__Group__4__Impl rule__Provider__Group__5 )
            // InternalPagos.g:3021:2: rule__Provider__Group__4__Impl rule__Provider__Group__5
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
    // InternalPagos.g:3028:1: rule__Provider__Group__4__Impl : ( ( rule__Provider__NameAssignment_4 ) ) ;
    public final void rule__Provider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3032:1: ( ( ( rule__Provider__NameAssignment_4 ) ) )
            // InternalPagos.g:3033:1: ( ( rule__Provider__NameAssignment_4 ) )
            {
            // InternalPagos.g:3033:1: ( ( rule__Provider__NameAssignment_4 ) )
            // InternalPagos.g:3034:2: ( rule__Provider__NameAssignment_4 )
            {
             before(grammarAccess.getProviderAccess().getNameAssignment_4()); 
            // InternalPagos.g:3035:2: ( rule__Provider__NameAssignment_4 )
            // InternalPagos.g:3035:3: rule__Provider__NameAssignment_4
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
    // InternalPagos.g:3043:1: rule__Provider__Group__5 : rule__Provider__Group__5__Impl rule__Provider__Group__6 ;
    public final void rule__Provider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3047:1: ( rule__Provider__Group__5__Impl rule__Provider__Group__6 )
            // InternalPagos.g:3048:2: rule__Provider__Group__5__Impl rule__Provider__Group__6
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
    // InternalPagos.g:3055:1: rule__Provider__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Provider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3059:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3060:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3060:1: ( RULE_COMMA )
            // InternalPagos.g:3061:2: RULE_COMMA
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
    // InternalPagos.g:3070:1: rule__Provider__Group__6 : rule__Provider__Group__6__Impl rule__Provider__Group__7 ;
    public final void rule__Provider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3074:1: ( rule__Provider__Group__6__Impl rule__Provider__Group__7 )
            // InternalPagos.g:3075:2: rule__Provider__Group__6__Impl rule__Provider__Group__7
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
    // InternalPagos.g:3082:1: rule__Provider__Group__6__Impl : ( 'description' ) ;
    public final void rule__Provider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3086:1: ( ( 'description' ) )
            // InternalPagos.g:3087:1: ( 'description' )
            {
            // InternalPagos.g:3087:1: ( 'description' )
            // InternalPagos.g:3088:2: 'description'
            {
             before(grammarAccess.getProviderAccess().getDescriptionKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPagos.g:3097:1: rule__Provider__Group__7 : rule__Provider__Group__7__Impl rule__Provider__Group__8 ;
    public final void rule__Provider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3101:1: ( rule__Provider__Group__7__Impl rule__Provider__Group__8 )
            // InternalPagos.g:3102:2: rule__Provider__Group__7__Impl rule__Provider__Group__8
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
    // InternalPagos.g:3109:1: rule__Provider__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__Provider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3113:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3114:1: ( RULE_COLON )
            {
            // InternalPagos.g:3114:1: ( RULE_COLON )
            // InternalPagos.g:3115:2: RULE_COLON
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
    // InternalPagos.g:3124:1: rule__Provider__Group__8 : rule__Provider__Group__8__Impl rule__Provider__Group__9 ;
    public final void rule__Provider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3128:1: ( rule__Provider__Group__8__Impl rule__Provider__Group__9 )
            // InternalPagos.g:3129:2: rule__Provider__Group__8__Impl rule__Provider__Group__9
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
    // InternalPagos.g:3136:1: rule__Provider__Group__8__Impl : ( ( rule__Provider__DescriptionAssignment_8 ) ) ;
    public final void rule__Provider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3140:1: ( ( ( rule__Provider__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:3141:1: ( ( rule__Provider__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:3141:1: ( ( rule__Provider__DescriptionAssignment_8 ) )
            // InternalPagos.g:3142:2: ( rule__Provider__DescriptionAssignment_8 )
            {
             before(grammarAccess.getProviderAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:3143:2: ( rule__Provider__DescriptionAssignment_8 )
            // InternalPagos.g:3143:3: rule__Provider__DescriptionAssignment_8
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
    // InternalPagos.g:3151:1: rule__Provider__Group__9 : rule__Provider__Group__9__Impl rule__Provider__Group__10 ;
    public final void rule__Provider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3155:1: ( rule__Provider__Group__9__Impl rule__Provider__Group__10 )
            // InternalPagos.g:3156:2: rule__Provider__Group__9__Impl rule__Provider__Group__10
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
    // InternalPagos.g:3163:1: rule__Provider__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__Provider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3167:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3168:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3168:1: ( RULE_COMMA )
            // InternalPagos.g:3169:2: RULE_COMMA
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
    // InternalPagos.g:3178:1: rule__Provider__Group__10 : rule__Provider__Group__10__Impl rule__Provider__Group__11 ;
    public final void rule__Provider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3182:1: ( rule__Provider__Group__10__Impl rule__Provider__Group__11 )
            // InternalPagos.g:3183:2: rule__Provider__Group__10__Impl rule__Provider__Group__11
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
    // InternalPagos.g:3190:1: rule__Provider__Group__10__Impl : ( 'attributes' ) ;
    public final void rule__Provider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3194:1: ( ( 'attributes' ) )
            // InternalPagos.g:3195:1: ( 'attributes' )
            {
            // InternalPagos.g:3195:1: ( 'attributes' )
            // InternalPagos.g:3196:2: 'attributes'
            {
             before(grammarAccess.getProviderAccess().getAttributesKeyword_10()); 
            match(input,36,FOLLOW_2); 
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
    // InternalPagos.g:3205:1: rule__Provider__Group__11 : rule__Provider__Group__11__Impl rule__Provider__Group__12 ;
    public final void rule__Provider__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3209:1: ( rule__Provider__Group__11__Impl rule__Provider__Group__12 )
            // InternalPagos.g:3210:2: rule__Provider__Group__11__Impl rule__Provider__Group__12
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
    // InternalPagos.g:3217:1: rule__Provider__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__Provider__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3221:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3222:1: ( RULE_COLON )
            {
            // InternalPagos.g:3222:1: ( RULE_COLON )
            // InternalPagos.g:3223:2: RULE_COLON
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
    // InternalPagos.g:3232:1: rule__Provider__Group__12 : rule__Provider__Group__12__Impl rule__Provider__Group__13 ;
    public final void rule__Provider__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3236:1: ( rule__Provider__Group__12__Impl rule__Provider__Group__13 )
            // InternalPagos.g:3237:2: rule__Provider__Group__12__Impl rule__Provider__Group__13
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
    // InternalPagos.g:3244:1: rule__Provider__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Provider__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3248:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:3249:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:3249:1: ( RULE_LBRACKET )
            // InternalPagos.g:3250:2: RULE_LBRACKET
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
    // InternalPagos.g:3259:1: rule__Provider__Group__13 : rule__Provider__Group__13__Impl rule__Provider__Group__14 ;
    public final void rule__Provider__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3263:1: ( rule__Provider__Group__13__Impl rule__Provider__Group__14 )
            // InternalPagos.g:3264:2: rule__Provider__Group__13__Impl rule__Provider__Group__14
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
    // InternalPagos.g:3271:1: rule__Provider__Group__13__Impl : ( ( rule__Provider__AttListsAssignment_13 ) ) ;
    public final void rule__Provider__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3275:1: ( ( ( rule__Provider__AttListsAssignment_13 ) ) )
            // InternalPagos.g:3276:1: ( ( rule__Provider__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:3276:1: ( ( rule__Provider__AttListsAssignment_13 ) )
            // InternalPagos.g:3277:2: ( rule__Provider__AttListsAssignment_13 )
            {
             before(grammarAccess.getProviderAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:3278:2: ( rule__Provider__AttListsAssignment_13 )
            // InternalPagos.g:3278:3: rule__Provider__AttListsAssignment_13
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
    // InternalPagos.g:3286:1: rule__Provider__Group__14 : rule__Provider__Group__14__Impl rule__Provider__Group__15 ;
    public final void rule__Provider__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3290:1: ( rule__Provider__Group__14__Impl rule__Provider__Group__15 )
            // InternalPagos.g:3291:2: rule__Provider__Group__14__Impl rule__Provider__Group__15
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
    // InternalPagos.g:3298:1: rule__Provider__Group__14__Impl : ( ( rule__Provider__Group_14__0 )* ) ;
    public final void rule__Provider__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3302:1: ( ( ( rule__Provider__Group_14__0 )* ) )
            // InternalPagos.g:3303:1: ( ( rule__Provider__Group_14__0 )* )
            {
            // InternalPagos.g:3303:1: ( ( rule__Provider__Group_14__0 )* )
            // InternalPagos.g:3304:2: ( rule__Provider__Group_14__0 )*
            {
             before(grammarAccess.getProviderAccess().getGroup_14()); 
            // InternalPagos.g:3305:2: ( rule__Provider__Group_14__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPagos.g:3305:3: rule__Provider__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Provider__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalPagos.g:3313:1: rule__Provider__Group__15 : rule__Provider__Group__15__Impl rule__Provider__Group__16 ;
    public final void rule__Provider__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3317:1: ( rule__Provider__Group__15__Impl rule__Provider__Group__16 )
            // InternalPagos.g:3318:2: rule__Provider__Group__15__Impl rule__Provider__Group__16
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
    // InternalPagos.g:3325:1: rule__Provider__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Provider__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3329:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:3330:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:3330:1: ( RULE_RBRACKET )
            // InternalPagos.g:3331:2: RULE_RBRACKET
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
    // InternalPagos.g:3340:1: rule__Provider__Group__16 : rule__Provider__Group__16__Impl ;
    public final void rule__Provider__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3344:1: ( rule__Provider__Group__16__Impl )
            // InternalPagos.g:3345:2: rule__Provider__Group__16__Impl
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
    // InternalPagos.g:3351:1: rule__Provider__Group__16__Impl : ( RULE_RBRACE ) ;
    public final void rule__Provider__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3355:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:3356:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:3356:1: ( RULE_RBRACE )
            // InternalPagos.g:3357:2: RULE_RBRACE
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
    // InternalPagos.g:3367:1: rule__Provider__Group_14__0 : rule__Provider__Group_14__0__Impl rule__Provider__Group_14__1 ;
    public final void rule__Provider__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3371:1: ( rule__Provider__Group_14__0__Impl rule__Provider__Group_14__1 )
            // InternalPagos.g:3372:2: rule__Provider__Group_14__0__Impl rule__Provider__Group_14__1
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
    // InternalPagos.g:3379:1: rule__Provider__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Provider__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3383:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3384:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3384:1: ( RULE_COMMA )
            // InternalPagos.g:3385:2: RULE_COMMA
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
    // InternalPagos.g:3394:1: rule__Provider__Group_14__1 : rule__Provider__Group_14__1__Impl ;
    public final void rule__Provider__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3398:1: ( rule__Provider__Group_14__1__Impl )
            // InternalPagos.g:3399:2: rule__Provider__Group_14__1__Impl
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
    // InternalPagos.g:3405:1: rule__Provider__Group_14__1__Impl : ( ( rule__Provider__AttListsAssignment_14_1 ) ) ;
    public final void rule__Provider__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3409:1: ( ( ( rule__Provider__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:3410:1: ( ( rule__Provider__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:3410:1: ( ( rule__Provider__AttListsAssignment_14_1 ) )
            // InternalPagos.g:3411:2: ( rule__Provider__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getProviderAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:3412:2: ( rule__Provider__AttListsAssignment_14_1 )
            // InternalPagos.g:3412:3: rule__Provider__AttListsAssignment_14_1
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
    // InternalPagos.g:3421:1: rule__InformationTemplate__Group__0 : rule__InformationTemplate__Group__0__Impl rule__InformationTemplate__Group__1 ;
    public final void rule__InformationTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3425:1: ( rule__InformationTemplate__Group__0__Impl rule__InformationTemplate__Group__1 )
            // InternalPagos.g:3426:2: rule__InformationTemplate__Group__0__Impl rule__InformationTemplate__Group__1
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
    // InternalPagos.g:3433:1: rule__InformationTemplate__Group__0__Impl : ( () ) ;
    public final void rule__InformationTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3437:1: ( ( () ) )
            // InternalPagos.g:3438:1: ( () )
            {
            // InternalPagos.g:3438:1: ( () )
            // InternalPagos.g:3439:2: ()
            {
             before(grammarAccess.getInformationTemplateAccess().getInformationTemplateAction_0()); 
            // InternalPagos.g:3440:2: ()
            // InternalPagos.g:3440:3: 
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
    // InternalPagos.g:3448:1: rule__InformationTemplate__Group__1 : rule__InformationTemplate__Group__1__Impl rule__InformationTemplate__Group__2 ;
    public final void rule__InformationTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3452:1: ( rule__InformationTemplate__Group__1__Impl rule__InformationTemplate__Group__2 )
            // InternalPagos.g:3453:2: rule__InformationTemplate__Group__1__Impl rule__InformationTemplate__Group__2
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
    // InternalPagos.g:3460:1: rule__InformationTemplate__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__InformationTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3464:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:3465:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:3465:1: ( RULE_LBRACE )
            // InternalPagos.g:3466:2: RULE_LBRACE
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
    // InternalPagos.g:3475:1: rule__InformationTemplate__Group__2 : rule__InformationTemplate__Group__2__Impl rule__InformationTemplate__Group__3 ;
    public final void rule__InformationTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3479:1: ( rule__InformationTemplate__Group__2__Impl rule__InformationTemplate__Group__3 )
            // InternalPagos.g:3480:2: rule__InformationTemplate__Group__2__Impl rule__InformationTemplate__Group__3
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
    // InternalPagos.g:3487:1: rule__InformationTemplate__Group__2__Impl : ( 'name' ) ;
    public final void rule__InformationTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3491:1: ( ( 'name' ) )
            // InternalPagos.g:3492:1: ( 'name' )
            {
            // InternalPagos.g:3492:1: ( 'name' )
            // InternalPagos.g:3493:2: 'name'
            {
             before(grammarAccess.getInformationTemplateAccess().getNameKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPagos.g:3502:1: rule__InformationTemplate__Group__3 : rule__InformationTemplate__Group__3__Impl rule__InformationTemplate__Group__4 ;
    public final void rule__InformationTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3506:1: ( rule__InformationTemplate__Group__3__Impl rule__InformationTemplate__Group__4 )
            // InternalPagos.g:3507:2: rule__InformationTemplate__Group__3__Impl rule__InformationTemplate__Group__4
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
    // InternalPagos.g:3514:1: rule__InformationTemplate__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3518:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3519:1: ( RULE_COLON )
            {
            // InternalPagos.g:3519:1: ( RULE_COLON )
            // InternalPagos.g:3520:2: RULE_COLON
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
    // InternalPagos.g:3529:1: rule__InformationTemplate__Group__4 : rule__InformationTemplate__Group__4__Impl rule__InformationTemplate__Group__5 ;
    public final void rule__InformationTemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3533:1: ( rule__InformationTemplate__Group__4__Impl rule__InformationTemplate__Group__5 )
            // InternalPagos.g:3534:2: rule__InformationTemplate__Group__4__Impl rule__InformationTemplate__Group__5
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
    // InternalPagos.g:3541:1: rule__InformationTemplate__Group__4__Impl : ( ( rule__InformationTemplate__NameAssignment_4 ) ) ;
    public final void rule__InformationTemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3545:1: ( ( ( rule__InformationTemplate__NameAssignment_4 ) ) )
            // InternalPagos.g:3546:1: ( ( rule__InformationTemplate__NameAssignment_4 ) )
            {
            // InternalPagos.g:3546:1: ( ( rule__InformationTemplate__NameAssignment_4 ) )
            // InternalPagos.g:3547:2: ( rule__InformationTemplate__NameAssignment_4 )
            {
             before(grammarAccess.getInformationTemplateAccess().getNameAssignment_4()); 
            // InternalPagos.g:3548:2: ( rule__InformationTemplate__NameAssignment_4 )
            // InternalPagos.g:3548:3: rule__InformationTemplate__NameAssignment_4
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
    // InternalPagos.g:3556:1: rule__InformationTemplate__Group__5 : rule__InformationTemplate__Group__5__Impl rule__InformationTemplate__Group__6 ;
    public final void rule__InformationTemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3560:1: ( rule__InformationTemplate__Group__5__Impl rule__InformationTemplate__Group__6 )
            // InternalPagos.g:3561:2: rule__InformationTemplate__Group__5__Impl rule__InformationTemplate__Group__6
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
    // InternalPagos.g:3568:1: rule__InformationTemplate__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3572:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3573:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3573:1: ( RULE_COMMA )
            // InternalPagos.g:3574:2: RULE_COMMA
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
    // InternalPagos.g:3583:1: rule__InformationTemplate__Group__6 : rule__InformationTemplate__Group__6__Impl rule__InformationTemplate__Group__7 ;
    public final void rule__InformationTemplate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3587:1: ( rule__InformationTemplate__Group__6__Impl rule__InformationTemplate__Group__7 )
            // InternalPagos.g:3588:2: rule__InformationTemplate__Group__6__Impl rule__InformationTemplate__Group__7
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
    // InternalPagos.g:3595:1: rule__InformationTemplate__Group__6__Impl : ( 'description' ) ;
    public final void rule__InformationTemplate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3599:1: ( ( 'description' ) )
            // InternalPagos.g:3600:1: ( 'description' )
            {
            // InternalPagos.g:3600:1: ( 'description' )
            // InternalPagos.g:3601:2: 'description'
            {
             before(grammarAccess.getInformationTemplateAccess().getDescriptionKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPagos.g:3610:1: rule__InformationTemplate__Group__7 : rule__InformationTemplate__Group__7__Impl rule__InformationTemplate__Group__8 ;
    public final void rule__InformationTemplate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3614:1: ( rule__InformationTemplate__Group__7__Impl rule__InformationTemplate__Group__8 )
            // InternalPagos.g:3615:2: rule__InformationTemplate__Group__7__Impl rule__InformationTemplate__Group__8
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
    // InternalPagos.g:3622:1: rule__InformationTemplate__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3626:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3627:1: ( RULE_COLON )
            {
            // InternalPagos.g:3627:1: ( RULE_COLON )
            // InternalPagos.g:3628:2: RULE_COLON
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
    // InternalPagos.g:3637:1: rule__InformationTemplate__Group__8 : rule__InformationTemplate__Group__8__Impl rule__InformationTemplate__Group__9 ;
    public final void rule__InformationTemplate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3641:1: ( rule__InformationTemplate__Group__8__Impl rule__InformationTemplate__Group__9 )
            // InternalPagos.g:3642:2: rule__InformationTemplate__Group__8__Impl rule__InformationTemplate__Group__9
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
    // InternalPagos.g:3649:1: rule__InformationTemplate__Group__8__Impl : ( ( rule__InformationTemplate__DescriptionAssignment_8 ) ) ;
    public final void rule__InformationTemplate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3653:1: ( ( ( rule__InformationTemplate__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:3654:1: ( ( rule__InformationTemplate__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:3654:1: ( ( rule__InformationTemplate__DescriptionAssignment_8 ) )
            // InternalPagos.g:3655:2: ( rule__InformationTemplate__DescriptionAssignment_8 )
            {
             before(grammarAccess.getInformationTemplateAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:3656:2: ( rule__InformationTemplate__DescriptionAssignment_8 )
            // InternalPagos.g:3656:3: rule__InformationTemplate__DescriptionAssignment_8
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
    // InternalPagos.g:3664:1: rule__InformationTemplate__Group__9 : rule__InformationTemplate__Group__9__Impl rule__InformationTemplate__Group__10 ;
    public final void rule__InformationTemplate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3668:1: ( rule__InformationTemplate__Group__9__Impl rule__InformationTemplate__Group__10 )
            // InternalPagos.g:3669:2: rule__InformationTemplate__Group__9__Impl rule__InformationTemplate__Group__10
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
    // InternalPagos.g:3676:1: rule__InformationTemplate__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3680:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3681:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3681:1: ( RULE_COMMA )
            // InternalPagos.g:3682:2: RULE_COMMA
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
    // InternalPagos.g:3691:1: rule__InformationTemplate__Group__10 : rule__InformationTemplate__Group__10__Impl rule__InformationTemplate__Group__11 ;
    public final void rule__InformationTemplate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3695:1: ( rule__InformationTemplate__Group__10__Impl rule__InformationTemplate__Group__11 )
            // InternalPagos.g:3696:2: rule__InformationTemplate__Group__10__Impl rule__InformationTemplate__Group__11
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
    // InternalPagos.g:3703:1: rule__InformationTemplate__Group__10__Impl : ( 'FormAttributes' ) ;
    public final void rule__InformationTemplate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3707:1: ( ( 'FormAttributes' ) )
            // InternalPagos.g:3708:1: ( 'FormAttributes' )
            {
            // InternalPagos.g:3708:1: ( 'FormAttributes' )
            // InternalPagos.g:3709:2: 'FormAttributes'
            {
             before(grammarAccess.getInformationTemplateAccess().getFormAttributesKeyword_10()); 
            match(input,39,FOLLOW_2); 
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
    // InternalPagos.g:3718:1: rule__InformationTemplate__Group__11 : rule__InformationTemplate__Group__11__Impl rule__InformationTemplate__Group__12 ;
    public final void rule__InformationTemplate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3722:1: ( rule__InformationTemplate__Group__11__Impl rule__InformationTemplate__Group__12 )
            // InternalPagos.g:3723:2: rule__InformationTemplate__Group__11__Impl rule__InformationTemplate__Group__12
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
    // InternalPagos.g:3730:1: rule__InformationTemplate__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3734:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3735:1: ( RULE_COLON )
            {
            // InternalPagos.g:3735:1: ( RULE_COLON )
            // InternalPagos.g:3736:2: RULE_COLON
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
    // InternalPagos.g:3745:1: rule__InformationTemplate__Group__12 : rule__InformationTemplate__Group__12__Impl rule__InformationTemplate__Group__13 ;
    public final void rule__InformationTemplate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3749:1: ( rule__InformationTemplate__Group__12__Impl rule__InformationTemplate__Group__13 )
            // InternalPagos.g:3750:2: rule__InformationTemplate__Group__12__Impl rule__InformationTemplate__Group__13
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
    // InternalPagos.g:3757:1: rule__InformationTemplate__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__InformationTemplate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3761:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:3762:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:3762:1: ( RULE_LBRACKET )
            // InternalPagos.g:3763:2: RULE_LBRACKET
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
    // InternalPagos.g:3772:1: rule__InformationTemplate__Group__13 : rule__InformationTemplate__Group__13__Impl rule__InformationTemplate__Group__14 ;
    public final void rule__InformationTemplate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3776:1: ( rule__InformationTemplate__Group__13__Impl rule__InformationTemplate__Group__14 )
            // InternalPagos.g:3777:2: rule__InformationTemplate__Group__13__Impl rule__InformationTemplate__Group__14
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
    // InternalPagos.g:3784:1: rule__InformationTemplate__Group__13__Impl : ( ( rule__InformationTemplate__AttListsAssignment_13 ) ) ;
    public final void rule__InformationTemplate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3788:1: ( ( ( rule__InformationTemplate__AttListsAssignment_13 ) ) )
            // InternalPagos.g:3789:1: ( ( rule__InformationTemplate__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:3789:1: ( ( rule__InformationTemplate__AttListsAssignment_13 ) )
            // InternalPagos.g:3790:2: ( rule__InformationTemplate__AttListsAssignment_13 )
            {
             before(grammarAccess.getInformationTemplateAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:3791:2: ( rule__InformationTemplate__AttListsAssignment_13 )
            // InternalPagos.g:3791:3: rule__InformationTemplate__AttListsAssignment_13
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
    // InternalPagos.g:3799:1: rule__InformationTemplate__Group__14 : rule__InformationTemplate__Group__14__Impl rule__InformationTemplate__Group__15 ;
    public final void rule__InformationTemplate__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3803:1: ( rule__InformationTemplate__Group__14__Impl rule__InformationTemplate__Group__15 )
            // InternalPagos.g:3804:2: rule__InformationTemplate__Group__14__Impl rule__InformationTemplate__Group__15
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
    // InternalPagos.g:3811:1: rule__InformationTemplate__Group__14__Impl : ( ( rule__InformationTemplate__Group_14__0 )* ) ;
    public final void rule__InformationTemplate__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3815:1: ( ( ( rule__InformationTemplate__Group_14__0 )* ) )
            // InternalPagos.g:3816:1: ( ( rule__InformationTemplate__Group_14__0 )* )
            {
            // InternalPagos.g:3816:1: ( ( rule__InformationTemplate__Group_14__0 )* )
            // InternalPagos.g:3817:2: ( rule__InformationTemplate__Group_14__0 )*
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_14()); 
            // InternalPagos.g:3818:2: ( rule__InformationTemplate__Group_14__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPagos.g:3818:3: rule__InformationTemplate__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InformationTemplate__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalPagos.g:3826:1: rule__InformationTemplate__Group__15 : rule__InformationTemplate__Group__15__Impl rule__InformationTemplate__Group__16 ;
    public final void rule__InformationTemplate__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3830:1: ( rule__InformationTemplate__Group__15__Impl rule__InformationTemplate__Group__16 )
            // InternalPagos.g:3831:2: rule__InformationTemplate__Group__15__Impl rule__InformationTemplate__Group__16
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
    // InternalPagos.g:3838:1: rule__InformationTemplate__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__InformationTemplate__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3842:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:3843:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:3843:1: ( RULE_RBRACKET )
            // InternalPagos.g:3844:2: RULE_RBRACKET
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
    // InternalPagos.g:3853:1: rule__InformationTemplate__Group__16 : rule__InformationTemplate__Group__16__Impl rule__InformationTemplate__Group__17 ;
    public final void rule__InformationTemplate__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3857:1: ( rule__InformationTemplate__Group__16__Impl rule__InformationTemplate__Group__17 )
            // InternalPagos.g:3858:2: rule__InformationTemplate__Group__16__Impl rule__InformationTemplate__Group__17
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
    // InternalPagos.g:3865:1: rule__InformationTemplate__Group__16__Impl : ( RULE_RBRACE ) ;
    public final void rule__InformationTemplate__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3869:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:3870:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:3870:1: ( RULE_RBRACE )
            // InternalPagos.g:3871:2: RULE_RBRACE
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
    // InternalPagos.g:3880:1: rule__InformationTemplate__Group__17 : rule__InformationTemplate__Group__17__Impl rule__InformationTemplate__Group__18 ;
    public final void rule__InformationTemplate__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3884:1: ( rule__InformationTemplate__Group__17__Impl rule__InformationTemplate__Group__18 )
            // InternalPagos.g:3885:2: rule__InformationTemplate__Group__17__Impl rule__InformationTemplate__Group__18
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
    // InternalPagos.g:3892:1: rule__InformationTemplate__Group__17__Impl : ( ( rule__InformationTemplate__Group_17__0 )? ) ;
    public final void rule__InformationTemplate__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3896:1: ( ( ( rule__InformationTemplate__Group_17__0 )? ) )
            // InternalPagos.g:3897:1: ( ( rule__InformationTemplate__Group_17__0 )? )
            {
            // InternalPagos.g:3897:1: ( ( rule__InformationTemplate__Group_17__0 )? )
            // InternalPagos.g:3898:2: ( rule__InformationTemplate__Group_17__0 )?
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_17()); 
            // InternalPagos.g:3899:2: ( rule__InformationTemplate__Group_17__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_COMMA) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==40) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalPagos.g:3899:3: rule__InformationTemplate__Group_17__0
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
    // InternalPagos.g:3907:1: rule__InformationTemplate__Group__18 : rule__InformationTemplate__Group__18__Impl ;
    public final void rule__InformationTemplate__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3911:1: ( rule__InformationTemplate__Group__18__Impl )
            // InternalPagos.g:3912:2: rule__InformationTemplate__Group__18__Impl
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
    // InternalPagos.g:3918:1: rule__InformationTemplate__Group__18__Impl : ( ( rule__InformationTemplate__Group_18__0 )? ) ;
    public final void rule__InformationTemplate__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3922:1: ( ( ( rule__InformationTemplate__Group_18__0 )? ) )
            // InternalPagos.g:3923:1: ( ( rule__InformationTemplate__Group_18__0 )? )
            {
            // InternalPagos.g:3923:1: ( ( rule__InformationTemplate__Group_18__0 )? )
            // InternalPagos.g:3924:2: ( rule__InformationTemplate__Group_18__0 )?
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_18()); 
            // InternalPagos.g:3925:2: ( rule__InformationTemplate__Group_18__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_COMMA) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==41) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalPagos.g:3925:3: rule__InformationTemplate__Group_18__0
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
    // InternalPagos.g:3934:1: rule__InformationTemplate__Group_14__0 : rule__InformationTemplate__Group_14__0__Impl rule__InformationTemplate__Group_14__1 ;
    public final void rule__InformationTemplate__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3938:1: ( rule__InformationTemplate__Group_14__0__Impl rule__InformationTemplate__Group_14__1 )
            // InternalPagos.g:3939:2: rule__InformationTemplate__Group_14__0__Impl rule__InformationTemplate__Group_14__1
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
    // InternalPagos.g:3946:1: rule__InformationTemplate__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3950:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3951:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3951:1: ( RULE_COMMA )
            // InternalPagos.g:3952:2: RULE_COMMA
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
    // InternalPagos.g:3961:1: rule__InformationTemplate__Group_14__1 : rule__InformationTemplate__Group_14__1__Impl ;
    public final void rule__InformationTemplate__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3965:1: ( rule__InformationTemplate__Group_14__1__Impl )
            // InternalPagos.g:3966:2: rule__InformationTemplate__Group_14__1__Impl
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
    // InternalPagos.g:3972:1: rule__InformationTemplate__Group_14__1__Impl : ( ( rule__InformationTemplate__AttListsAssignment_14_1 ) ) ;
    public final void rule__InformationTemplate__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3976:1: ( ( ( rule__InformationTemplate__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:3977:1: ( ( rule__InformationTemplate__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:3977:1: ( ( rule__InformationTemplate__AttListsAssignment_14_1 ) )
            // InternalPagos.g:3978:2: ( rule__InformationTemplate__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getInformationTemplateAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:3979:2: ( rule__InformationTemplate__AttListsAssignment_14_1 )
            // InternalPagos.g:3979:3: rule__InformationTemplate__AttListsAssignment_14_1
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
    // InternalPagos.g:3988:1: rule__InformationTemplate__Group_17__0 : rule__InformationTemplate__Group_17__0__Impl rule__InformationTemplate__Group_17__1 ;
    public final void rule__InformationTemplate__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3992:1: ( rule__InformationTemplate__Group_17__0__Impl rule__InformationTemplate__Group_17__1 )
            // InternalPagos.g:3993:2: rule__InformationTemplate__Group_17__0__Impl rule__InformationTemplate__Group_17__1
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
    // InternalPagos.g:4000:1: rule__InformationTemplate__Group_17__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4004:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4005:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4005:1: ( RULE_COMMA )
            // InternalPagos.g:4006:2: RULE_COMMA
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
    // InternalPagos.g:4015:1: rule__InformationTemplate__Group_17__1 : rule__InformationTemplate__Group_17__1__Impl rule__InformationTemplate__Group_17__2 ;
    public final void rule__InformationTemplate__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4019:1: ( rule__InformationTemplate__Group_17__1__Impl rule__InformationTemplate__Group_17__2 )
            // InternalPagos.g:4020:2: rule__InformationTemplate__Group_17__1__Impl rule__InformationTemplate__Group_17__2
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
    // InternalPagos.g:4027:1: rule__InformationTemplate__Group_17__1__Impl : ( 'calculationtemplates' ) ;
    public final void rule__InformationTemplate__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4031:1: ( ( 'calculationtemplates' ) )
            // InternalPagos.g:4032:1: ( 'calculationtemplates' )
            {
            // InternalPagos.g:4032:1: ( 'calculationtemplates' )
            // InternalPagos.g:4033:2: 'calculationtemplates'
            {
             before(grammarAccess.getInformationTemplateAccess().getCalculationtemplatesKeyword_17_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalPagos.g:4042:1: rule__InformationTemplate__Group_17__2 : rule__InformationTemplate__Group_17__2__Impl rule__InformationTemplate__Group_17__3 ;
    public final void rule__InformationTemplate__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4046:1: ( rule__InformationTemplate__Group_17__2__Impl rule__InformationTemplate__Group_17__3 )
            // InternalPagos.g:4047:2: rule__InformationTemplate__Group_17__2__Impl rule__InformationTemplate__Group_17__3
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
    // InternalPagos.g:4054:1: rule__InformationTemplate__Group_17__2__Impl : ( ( rule__InformationTemplate__TemplateCalcAssignment_17_2 ) ) ;
    public final void rule__InformationTemplate__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4058:1: ( ( ( rule__InformationTemplate__TemplateCalcAssignment_17_2 ) ) )
            // InternalPagos.g:4059:1: ( ( rule__InformationTemplate__TemplateCalcAssignment_17_2 ) )
            {
            // InternalPagos.g:4059:1: ( ( rule__InformationTemplate__TemplateCalcAssignment_17_2 ) )
            // InternalPagos.g:4060:2: ( rule__InformationTemplate__TemplateCalcAssignment_17_2 )
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplateCalcAssignment_17_2()); 
            // InternalPagos.g:4061:2: ( rule__InformationTemplate__TemplateCalcAssignment_17_2 )
            // InternalPagos.g:4061:3: rule__InformationTemplate__TemplateCalcAssignment_17_2
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
    // InternalPagos.g:4069:1: rule__InformationTemplate__Group_17__3 : rule__InformationTemplate__Group_17__3__Impl rule__InformationTemplate__Group_17__4 ;
    public final void rule__InformationTemplate__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4073:1: ( rule__InformationTemplate__Group_17__3__Impl rule__InformationTemplate__Group_17__4 )
            // InternalPagos.g:4074:2: rule__InformationTemplate__Group_17__3__Impl rule__InformationTemplate__Group_17__4
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
    // InternalPagos.g:4081:1: rule__InformationTemplate__Group_17__3__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4085:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4086:1: ( RULE_COLON )
            {
            // InternalPagos.g:4086:1: ( RULE_COLON )
            // InternalPagos.g:4087:2: RULE_COLON
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
    // InternalPagos.g:4096:1: rule__InformationTemplate__Group_17__4 : rule__InformationTemplate__Group_17__4__Impl rule__InformationTemplate__Group_17__5 ;
    public final void rule__InformationTemplate__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4100:1: ( rule__InformationTemplate__Group_17__4__Impl rule__InformationTemplate__Group_17__5 )
            // InternalPagos.g:4101:2: rule__InformationTemplate__Group_17__4__Impl rule__InformationTemplate__Group_17__5
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
    // InternalPagos.g:4108:1: rule__InformationTemplate__Group_17__4__Impl : ( RULE_LBRACKET ) ;
    public final void rule__InformationTemplate__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4112:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:4113:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:4113:1: ( RULE_LBRACKET )
            // InternalPagos.g:4114:2: RULE_LBRACKET
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
    // InternalPagos.g:4123:1: rule__InformationTemplate__Group_17__5 : rule__InformationTemplate__Group_17__5__Impl rule__InformationTemplate__Group_17__6 ;
    public final void rule__InformationTemplate__Group_17__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4127:1: ( rule__InformationTemplate__Group_17__5__Impl rule__InformationTemplate__Group_17__6 )
            // InternalPagos.g:4128:2: rule__InformationTemplate__Group_17__5__Impl rule__InformationTemplate__Group_17__6
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
    // InternalPagos.g:4135:1: rule__InformationTemplate__Group_17__5__Impl : ( ( rule__InformationTemplate__TemplatesAssignment_17_5 ) ) ;
    public final void rule__InformationTemplate__Group_17__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4139:1: ( ( ( rule__InformationTemplate__TemplatesAssignment_17_5 ) ) )
            // InternalPagos.g:4140:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_5 ) )
            {
            // InternalPagos.g:4140:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_5 ) )
            // InternalPagos.g:4141:2: ( rule__InformationTemplate__TemplatesAssignment_17_5 )
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_5()); 
            // InternalPagos.g:4142:2: ( rule__InformationTemplate__TemplatesAssignment_17_5 )
            // InternalPagos.g:4142:3: rule__InformationTemplate__TemplatesAssignment_17_5
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
    // InternalPagos.g:4150:1: rule__InformationTemplate__Group_17__6 : rule__InformationTemplate__Group_17__6__Impl rule__InformationTemplate__Group_17__7 ;
    public final void rule__InformationTemplate__Group_17__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4154:1: ( rule__InformationTemplate__Group_17__6__Impl rule__InformationTemplate__Group_17__7 )
            // InternalPagos.g:4155:2: rule__InformationTemplate__Group_17__6__Impl rule__InformationTemplate__Group_17__7
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
    // InternalPagos.g:4162:1: rule__InformationTemplate__Group_17__6__Impl : ( ( rule__InformationTemplate__Group_17_6__0 )* ) ;
    public final void rule__InformationTemplate__Group_17__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4166:1: ( ( ( rule__InformationTemplate__Group_17_6__0 )* ) )
            // InternalPagos.g:4167:1: ( ( rule__InformationTemplate__Group_17_6__0 )* )
            {
            // InternalPagos.g:4167:1: ( ( rule__InformationTemplate__Group_17_6__0 )* )
            // InternalPagos.g:4168:2: ( rule__InformationTemplate__Group_17_6__0 )*
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_17_6()); 
            // InternalPagos.g:4169:2: ( rule__InformationTemplate__Group_17_6__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPagos.g:4169:3: rule__InformationTemplate__Group_17_6__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InformationTemplate__Group_17_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalPagos.g:4177:1: rule__InformationTemplate__Group_17__7 : rule__InformationTemplate__Group_17__7__Impl ;
    public final void rule__InformationTemplate__Group_17__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4181:1: ( rule__InformationTemplate__Group_17__7__Impl )
            // InternalPagos.g:4182:2: rule__InformationTemplate__Group_17__7__Impl
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
    // InternalPagos.g:4188:1: rule__InformationTemplate__Group_17__7__Impl : ( RULE_RBRACKET ) ;
    public final void rule__InformationTemplate__Group_17__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4192:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:4193:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:4193:1: ( RULE_RBRACKET )
            // InternalPagos.g:4194:2: RULE_RBRACKET
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
    // InternalPagos.g:4204:1: rule__InformationTemplate__Group_17_6__0 : rule__InformationTemplate__Group_17_6__0__Impl rule__InformationTemplate__Group_17_6__1 ;
    public final void rule__InformationTemplate__Group_17_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4208:1: ( rule__InformationTemplate__Group_17_6__0__Impl rule__InformationTemplate__Group_17_6__1 )
            // InternalPagos.g:4209:2: rule__InformationTemplate__Group_17_6__0__Impl rule__InformationTemplate__Group_17_6__1
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
    // InternalPagos.g:4216:1: rule__InformationTemplate__Group_17_6__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_17_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4220:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4221:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4221:1: ( RULE_COMMA )
            // InternalPagos.g:4222:2: RULE_COMMA
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
    // InternalPagos.g:4231:1: rule__InformationTemplate__Group_17_6__1 : rule__InformationTemplate__Group_17_6__1__Impl ;
    public final void rule__InformationTemplate__Group_17_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4235:1: ( rule__InformationTemplate__Group_17_6__1__Impl )
            // InternalPagos.g:4236:2: rule__InformationTemplate__Group_17_6__1__Impl
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
    // InternalPagos.g:4242:1: rule__InformationTemplate__Group_17_6__1__Impl : ( ( rule__InformationTemplate__TemplatesAssignment_17_6_1 ) ) ;
    public final void rule__InformationTemplate__Group_17_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4246:1: ( ( ( rule__InformationTemplate__TemplatesAssignment_17_6_1 ) ) )
            // InternalPagos.g:4247:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_6_1 ) )
            {
            // InternalPagos.g:4247:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_6_1 ) )
            // InternalPagos.g:4248:2: ( rule__InformationTemplate__TemplatesAssignment_17_6_1 )
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_6_1()); 
            // InternalPagos.g:4249:2: ( rule__InformationTemplate__TemplatesAssignment_17_6_1 )
            // InternalPagos.g:4249:3: rule__InformationTemplate__TemplatesAssignment_17_6_1
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
    // InternalPagos.g:4258:1: rule__InformationTemplate__Group_18__0 : rule__InformationTemplate__Group_18__0__Impl rule__InformationTemplate__Group_18__1 ;
    public final void rule__InformationTemplate__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4262:1: ( rule__InformationTemplate__Group_18__0__Impl rule__InformationTemplate__Group_18__1 )
            // InternalPagos.g:4263:2: rule__InformationTemplate__Group_18__0__Impl rule__InformationTemplate__Group_18__1
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
    // InternalPagos.g:4270:1: rule__InformationTemplate__Group_18__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4274:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4275:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4275:1: ( RULE_COMMA )
            // InternalPagos.g:4276:2: RULE_COMMA
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
    // InternalPagos.g:4285:1: rule__InformationTemplate__Group_18__1 : rule__InformationTemplate__Group_18__1__Impl rule__InformationTemplate__Group_18__2 ;
    public final void rule__InformationTemplate__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4289:1: ( rule__InformationTemplate__Group_18__1__Impl rule__InformationTemplate__Group_18__2 )
            // InternalPagos.g:4290:2: rule__InformationTemplate__Group_18__1__Impl rule__InformationTemplate__Group_18__2
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
    // InternalPagos.g:4297:1: rule__InformationTemplate__Group_18__1__Impl : ( 'providers' ) ;
    public final void rule__InformationTemplate__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4301:1: ( ( 'providers' ) )
            // InternalPagos.g:4302:1: ( 'providers' )
            {
            // InternalPagos.g:4302:1: ( 'providers' )
            // InternalPagos.g:4303:2: 'providers'
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersKeyword_18_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalPagos.g:4312:1: rule__InformationTemplate__Group_18__2 : rule__InformationTemplate__Group_18__2__Impl rule__InformationTemplate__Group_18__3 ;
    public final void rule__InformationTemplate__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4316:1: ( rule__InformationTemplate__Group_18__2__Impl rule__InformationTemplate__Group_18__3 )
            // InternalPagos.g:4317:2: rule__InformationTemplate__Group_18__2__Impl rule__InformationTemplate__Group_18__3
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
    // InternalPagos.g:4324:1: rule__InformationTemplate__Group_18__2__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4328:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4329:1: ( RULE_COLON )
            {
            // InternalPagos.g:4329:1: ( RULE_COLON )
            // InternalPagos.g:4330:2: RULE_COLON
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
    // InternalPagos.g:4339:1: rule__InformationTemplate__Group_18__3 : rule__InformationTemplate__Group_18__3__Impl rule__InformationTemplate__Group_18__4 ;
    public final void rule__InformationTemplate__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4343:1: ( rule__InformationTemplate__Group_18__3__Impl rule__InformationTemplate__Group_18__4 )
            // InternalPagos.g:4344:2: rule__InformationTemplate__Group_18__3__Impl rule__InformationTemplate__Group_18__4
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
    // InternalPagos.g:4351:1: rule__InformationTemplate__Group_18__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__InformationTemplate__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4355:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:4356:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:4356:1: ( RULE_LBRACKET )
            // InternalPagos.g:4357:2: RULE_LBRACKET
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
    // InternalPagos.g:4366:1: rule__InformationTemplate__Group_18__4 : rule__InformationTemplate__Group_18__4__Impl rule__InformationTemplate__Group_18__5 ;
    public final void rule__InformationTemplate__Group_18__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4370:1: ( rule__InformationTemplate__Group_18__4__Impl rule__InformationTemplate__Group_18__5 )
            // InternalPagos.g:4371:2: rule__InformationTemplate__Group_18__4__Impl rule__InformationTemplate__Group_18__5
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
    // InternalPagos.g:4378:1: rule__InformationTemplate__Group_18__4__Impl : ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) ) ;
    public final void rule__InformationTemplate__Group_18__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4382:1: ( ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) ) )
            // InternalPagos.g:4383:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) )
            {
            // InternalPagos.g:4383:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) )
            // InternalPagos.g:4384:2: ( rule__InformationTemplate__ProvidersAssignment_18_4 )
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersAssignment_18_4()); 
            // InternalPagos.g:4385:2: ( rule__InformationTemplate__ProvidersAssignment_18_4 )
            // InternalPagos.g:4385:3: rule__InformationTemplate__ProvidersAssignment_18_4
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
    // InternalPagos.g:4393:1: rule__InformationTemplate__Group_18__5 : rule__InformationTemplate__Group_18__5__Impl rule__InformationTemplate__Group_18__6 ;
    public final void rule__InformationTemplate__Group_18__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4397:1: ( rule__InformationTemplate__Group_18__5__Impl rule__InformationTemplate__Group_18__6 )
            // InternalPagos.g:4398:2: rule__InformationTemplate__Group_18__5__Impl rule__InformationTemplate__Group_18__6
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
    // InternalPagos.g:4405:1: rule__InformationTemplate__Group_18__5__Impl : ( ( rule__InformationTemplate__Group_18_5__0 )* ) ;
    public final void rule__InformationTemplate__Group_18__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4409:1: ( ( ( rule__InformationTemplate__Group_18_5__0 )* ) )
            // InternalPagos.g:4410:1: ( ( rule__InformationTemplate__Group_18_5__0 )* )
            {
            // InternalPagos.g:4410:1: ( ( rule__InformationTemplate__Group_18_5__0 )* )
            // InternalPagos.g:4411:2: ( rule__InformationTemplate__Group_18_5__0 )*
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_18_5()); 
            // InternalPagos.g:4412:2: ( rule__InformationTemplate__Group_18_5__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPagos.g:4412:3: rule__InformationTemplate__Group_18_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InformationTemplate__Group_18_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalPagos.g:4420:1: rule__InformationTemplate__Group_18__6 : rule__InformationTemplate__Group_18__6__Impl ;
    public final void rule__InformationTemplate__Group_18__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4424:1: ( rule__InformationTemplate__Group_18__6__Impl )
            // InternalPagos.g:4425:2: rule__InformationTemplate__Group_18__6__Impl
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
    // InternalPagos.g:4431:1: rule__InformationTemplate__Group_18__6__Impl : ( RULE_RBRACKET ) ;
    public final void rule__InformationTemplate__Group_18__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4435:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:4436:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:4436:1: ( RULE_RBRACKET )
            // InternalPagos.g:4437:2: RULE_RBRACKET
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
    // InternalPagos.g:4447:1: rule__InformationTemplate__Group_18_5__0 : rule__InformationTemplate__Group_18_5__0__Impl rule__InformationTemplate__Group_18_5__1 ;
    public final void rule__InformationTemplate__Group_18_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4451:1: ( rule__InformationTemplate__Group_18_5__0__Impl rule__InformationTemplate__Group_18_5__1 )
            // InternalPagos.g:4452:2: rule__InformationTemplate__Group_18_5__0__Impl rule__InformationTemplate__Group_18_5__1
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
    // InternalPagos.g:4459:1: rule__InformationTemplate__Group_18_5__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_18_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4463:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4464:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4464:1: ( RULE_COMMA )
            // InternalPagos.g:4465:2: RULE_COMMA
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
    // InternalPagos.g:4474:1: rule__InformationTemplate__Group_18_5__1 : rule__InformationTemplate__Group_18_5__1__Impl ;
    public final void rule__InformationTemplate__Group_18_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4478:1: ( rule__InformationTemplate__Group_18_5__1__Impl )
            // InternalPagos.g:4479:2: rule__InformationTemplate__Group_18_5__1__Impl
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
    // InternalPagos.g:4485:1: rule__InformationTemplate__Group_18_5__1__Impl : ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) ) ;
    public final void rule__InformationTemplate__Group_18_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4489:1: ( ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) ) )
            // InternalPagos.g:4490:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) )
            {
            // InternalPagos.g:4490:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) )
            // InternalPagos.g:4491:2: ( rule__InformationTemplate__ProvidersAssignment_18_5_1 )
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersAssignment_18_5_1()); 
            // InternalPagos.g:4492:2: ( rule__InformationTemplate__ProvidersAssignment_18_5_1 )
            // InternalPagos.g:4492:3: rule__InformationTemplate__ProvidersAssignment_18_5_1
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
    // InternalPagos.g:4501:1: rule__CalculationTemplate__Group__0 : rule__CalculationTemplate__Group__0__Impl rule__CalculationTemplate__Group__1 ;
    public final void rule__CalculationTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4505:1: ( rule__CalculationTemplate__Group__0__Impl rule__CalculationTemplate__Group__1 )
            // InternalPagos.g:4506:2: rule__CalculationTemplate__Group__0__Impl rule__CalculationTemplate__Group__1
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
    // InternalPagos.g:4513:1: rule__CalculationTemplate__Group__0__Impl : ( () ) ;
    public final void rule__CalculationTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4517:1: ( ( () ) )
            // InternalPagos.g:4518:1: ( () )
            {
            // InternalPagos.g:4518:1: ( () )
            // InternalPagos.g:4519:2: ()
            {
             before(grammarAccess.getCalculationTemplateAccess().getCalculationTemplateAction_0()); 
            // InternalPagos.g:4520:2: ()
            // InternalPagos.g:4520:3: 
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
    // InternalPagos.g:4528:1: rule__CalculationTemplate__Group__1 : rule__CalculationTemplate__Group__1__Impl rule__CalculationTemplate__Group__2 ;
    public final void rule__CalculationTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4532:1: ( rule__CalculationTemplate__Group__1__Impl rule__CalculationTemplate__Group__2 )
            // InternalPagos.g:4533:2: rule__CalculationTemplate__Group__1__Impl rule__CalculationTemplate__Group__2
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
    // InternalPagos.g:4540:1: rule__CalculationTemplate__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__CalculationTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4544:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:4545:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:4545:1: ( RULE_LBRACE )
            // InternalPagos.g:4546:2: RULE_LBRACE
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
    // InternalPagos.g:4555:1: rule__CalculationTemplate__Group__2 : rule__CalculationTemplate__Group__2__Impl rule__CalculationTemplate__Group__3 ;
    public final void rule__CalculationTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4559:1: ( rule__CalculationTemplate__Group__2__Impl rule__CalculationTemplate__Group__3 )
            // InternalPagos.g:4560:2: rule__CalculationTemplate__Group__2__Impl rule__CalculationTemplate__Group__3
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
    // InternalPagos.g:4567:1: rule__CalculationTemplate__Group__2__Impl : ( 'name' ) ;
    public final void rule__CalculationTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4571:1: ( ( 'name' ) )
            // InternalPagos.g:4572:1: ( 'name' )
            {
            // InternalPagos.g:4572:1: ( 'name' )
            // InternalPagos.g:4573:2: 'name'
            {
             before(grammarAccess.getCalculationTemplateAccess().getNameKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPagos.g:4582:1: rule__CalculationTemplate__Group__3 : rule__CalculationTemplate__Group__3__Impl rule__CalculationTemplate__Group__4 ;
    public final void rule__CalculationTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4586:1: ( rule__CalculationTemplate__Group__3__Impl rule__CalculationTemplate__Group__4 )
            // InternalPagos.g:4587:2: rule__CalculationTemplate__Group__3__Impl rule__CalculationTemplate__Group__4
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
    // InternalPagos.g:4594:1: rule__CalculationTemplate__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4598:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4599:1: ( RULE_COLON )
            {
            // InternalPagos.g:4599:1: ( RULE_COLON )
            // InternalPagos.g:4600:2: RULE_COLON
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
    // InternalPagos.g:4609:1: rule__CalculationTemplate__Group__4 : rule__CalculationTemplate__Group__4__Impl rule__CalculationTemplate__Group__5 ;
    public final void rule__CalculationTemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4613:1: ( rule__CalculationTemplate__Group__4__Impl rule__CalculationTemplate__Group__5 )
            // InternalPagos.g:4614:2: rule__CalculationTemplate__Group__4__Impl rule__CalculationTemplate__Group__5
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
    // InternalPagos.g:4621:1: rule__CalculationTemplate__Group__4__Impl : ( ( rule__CalculationTemplate__NameAssignment_4 ) ) ;
    public final void rule__CalculationTemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4625:1: ( ( ( rule__CalculationTemplate__NameAssignment_4 ) ) )
            // InternalPagos.g:4626:1: ( ( rule__CalculationTemplate__NameAssignment_4 ) )
            {
            // InternalPagos.g:4626:1: ( ( rule__CalculationTemplate__NameAssignment_4 ) )
            // InternalPagos.g:4627:2: ( rule__CalculationTemplate__NameAssignment_4 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getNameAssignment_4()); 
            // InternalPagos.g:4628:2: ( rule__CalculationTemplate__NameAssignment_4 )
            // InternalPagos.g:4628:3: rule__CalculationTemplate__NameAssignment_4
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
    // InternalPagos.g:4636:1: rule__CalculationTemplate__Group__5 : rule__CalculationTemplate__Group__5__Impl rule__CalculationTemplate__Group__6 ;
    public final void rule__CalculationTemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4640:1: ( rule__CalculationTemplate__Group__5__Impl rule__CalculationTemplate__Group__6 )
            // InternalPagos.g:4641:2: rule__CalculationTemplate__Group__5__Impl rule__CalculationTemplate__Group__6
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
    // InternalPagos.g:4648:1: rule__CalculationTemplate__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4652:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4653:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4653:1: ( RULE_COMMA )
            // InternalPagos.g:4654:2: RULE_COMMA
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
    // InternalPagos.g:4663:1: rule__CalculationTemplate__Group__6 : rule__CalculationTemplate__Group__6__Impl rule__CalculationTemplate__Group__7 ;
    public final void rule__CalculationTemplate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4667:1: ( rule__CalculationTemplate__Group__6__Impl rule__CalculationTemplate__Group__7 )
            // InternalPagos.g:4668:2: rule__CalculationTemplate__Group__6__Impl rule__CalculationTemplate__Group__7
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
    // InternalPagos.g:4675:1: rule__CalculationTemplate__Group__6__Impl : ( 'description' ) ;
    public final void rule__CalculationTemplate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4679:1: ( ( 'description' ) )
            // InternalPagos.g:4680:1: ( 'description' )
            {
            // InternalPagos.g:4680:1: ( 'description' )
            // InternalPagos.g:4681:2: 'description'
            {
             before(grammarAccess.getCalculationTemplateAccess().getDescriptionKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPagos.g:4690:1: rule__CalculationTemplate__Group__7 : rule__CalculationTemplate__Group__7__Impl rule__CalculationTemplate__Group__8 ;
    public final void rule__CalculationTemplate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4694:1: ( rule__CalculationTemplate__Group__7__Impl rule__CalculationTemplate__Group__8 )
            // InternalPagos.g:4695:2: rule__CalculationTemplate__Group__7__Impl rule__CalculationTemplate__Group__8
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
    // InternalPagos.g:4702:1: rule__CalculationTemplate__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4706:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4707:1: ( RULE_COLON )
            {
            // InternalPagos.g:4707:1: ( RULE_COLON )
            // InternalPagos.g:4708:2: RULE_COLON
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
    // InternalPagos.g:4717:1: rule__CalculationTemplate__Group__8 : rule__CalculationTemplate__Group__8__Impl rule__CalculationTemplate__Group__9 ;
    public final void rule__CalculationTemplate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4721:1: ( rule__CalculationTemplate__Group__8__Impl rule__CalculationTemplate__Group__9 )
            // InternalPagos.g:4722:2: rule__CalculationTemplate__Group__8__Impl rule__CalculationTemplate__Group__9
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
    // InternalPagos.g:4729:1: rule__CalculationTemplate__Group__8__Impl : ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) ) ;
    public final void rule__CalculationTemplate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4733:1: ( ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:4734:1: ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:4734:1: ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) )
            // InternalPagos.g:4735:2: ( rule__CalculationTemplate__DescriptionAssignment_8 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:4736:2: ( rule__CalculationTemplate__DescriptionAssignment_8 )
            // InternalPagos.g:4736:3: rule__CalculationTemplate__DescriptionAssignment_8
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
    // InternalPagos.g:4744:1: rule__CalculationTemplate__Group__9 : rule__CalculationTemplate__Group__9__Impl rule__CalculationTemplate__Group__10 ;
    public final void rule__CalculationTemplate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4748:1: ( rule__CalculationTemplate__Group__9__Impl rule__CalculationTemplate__Group__10 )
            // InternalPagos.g:4749:2: rule__CalculationTemplate__Group__9__Impl rule__CalculationTemplate__Group__10
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
    // InternalPagos.g:4756:1: rule__CalculationTemplate__Group__9__Impl : ( ( rule__CalculationTemplate__Group_9__0 )? ) ;
    public final void rule__CalculationTemplate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4760:1: ( ( ( rule__CalculationTemplate__Group_9__0 )? ) )
            // InternalPagos.g:4761:1: ( ( rule__CalculationTemplate__Group_9__0 )? )
            {
            // InternalPagos.g:4761:1: ( ( rule__CalculationTemplate__Group_9__0 )? )
            // InternalPagos.g:4762:2: ( rule__CalculationTemplate__Group_9__0 )?
            {
             before(grammarAccess.getCalculationTemplateAccess().getGroup_9()); 
            // InternalPagos.g:4763:2: ( rule__CalculationTemplate__Group_9__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_COMMA) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==43) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalPagos.g:4763:3: rule__CalculationTemplate__Group_9__0
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
    // InternalPagos.g:4771:1: rule__CalculationTemplate__Group__10 : rule__CalculationTemplate__Group__10__Impl rule__CalculationTemplate__Group__11 ;
    public final void rule__CalculationTemplate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4775:1: ( rule__CalculationTemplate__Group__10__Impl rule__CalculationTemplate__Group__11 )
            // InternalPagos.g:4776:2: rule__CalculationTemplate__Group__10__Impl rule__CalculationTemplate__Group__11
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
    // InternalPagos.g:4783:1: rule__CalculationTemplate__Group__10__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4787:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4788:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4788:1: ( RULE_COMMA )
            // InternalPagos.g:4789:2: RULE_COMMA
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
    // InternalPagos.g:4798:1: rule__CalculationTemplate__Group__11 : rule__CalculationTemplate__Group__11__Impl rule__CalculationTemplate__Group__12 ;
    public final void rule__CalculationTemplate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4802:1: ( rule__CalculationTemplate__Group__11__Impl rule__CalculationTemplate__Group__12 )
            // InternalPagos.g:4803:2: rule__CalculationTemplate__Group__11__Impl rule__CalculationTemplate__Group__12
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
    // InternalPagos.g:4810:1: rule__CalculationTemplate__Group__11__Impl : ( 'calculationrules' ) ;
    public final void rule__CalculationTemplate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4814:1: ( ( 'calculationrules' ) )
            // InternalPagos.g:4815:1: ( 'calculationrules' )
            {
            // InternalPagos.g:4815:1: ( 'calculationrules' )
            // InternalPagos.g:4816:2: 'calculationrules'
            {
             before(grammarAccess.getCalculationTemplateAccess().getCalculationrulesKeyword_11()); 
            match(input,42,FOLLOW_2); 
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
    // InternalPagos.g:4825:1: rule__CalculationTemplate__Group__12 : rule__CalculationTemplate__Group__12__Impl rule__CalculationTemplate__Group__13 ;
    public final void rule__CalculationTemplate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4829:1: ( rule__CalculationTemplate__Group__12__Impl rule__CalculationTemplate__Group__13 )
            // InternalPagos.g:4830:2: rule__CalculationTemplate__Group__12__Impl rule__CalculationTemplate__Group__13
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
    // InternalPagos.g:4837:1: rule__CalculationTemplate__Group__12__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4841:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4842:1: ( RULE_COLON )
            {
            // InternalPagos.g:4842:1: ( RULE_COLON )
            // InternalPagos.g:4843:2: RULE_COLON
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
    // InternalPagos.g:4852:1: rule__CalculationTemplate__Group__13 : rule__CalculationTemplate__Group__13__Impl rule__CalculationTemplate__Group__14 ;
    public final void rule__CalculationTemplate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4856:1: ( rule__CalculationTemplate__Group__13__Impl rule__CalculationTemplate__Group__14 )
            // InternalPagos.g:4857:2: rule__CalculationTemplate__Group__13__Impl rule__CalculationTemplate__Group__14
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
    // InternalPagos.g:4864:1: rule__CalculationTemplate__Group__13__Impl : ( ( rule__CalculationTemplate__FormulasAssignment_13 ) ) ;
    public final void rule__CalculationTemplate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4868:1: ( ( ( rule__CalculationTemplate__FormulasAssignment_13 ) ) )
            // InternalPagos.g:4869:1: ( ( rule__CalculationTemplate__FormulasAssignment_13 ) )
            {
            // InternalPagos.g:4869:1: ( ( rule__CalculationTemplate__FormulasAssignment_13 ) )
            // InternalPagos.g:4870:2: ( rule__CalculationTemplate__FormulasAssignment_13 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getFormulasAssignment_13()); 
            // InternalPagos.g:4871:2: ( rule__CalculationTemplate__FormulasAssignment_13 )
            // InternalPagos.g:4871:3: rule__CalculationTemplate__FormulasAssignment_13
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
    // InternalPagos.g:4879:1: rule__CalculationTemplate__Group__14 : rule__CalculationTemplate__Group__14__Impl ;
    public final void rule__CalculationTemplate__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4883:1: ( rule__CalculationTemplate__Group__14__Impl )
            // InternalPagos.g:4884:2: rule__CalculationTemplate__Group__14__Impl
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
    // InternalPagos.g:4890:1: rule__CalculationTemplate__Group__14__Impl : ( RULE_RBRACE ) ;
    public final void rule__CalculationTemplate__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4894:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:4895:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:4895:1: ( RULE_RBRACE )
            // InternalPagos.g:4896:2: RULE_RBRACE
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
    // InternalPagos.g:4906:1: rule__CalculationTemplate__Group_9__0 : rule__CalculationTemplate__Group_9__0__Impl rule__CalculationTemplate__Group_9__1 ;
    public final void rule__CalculationTemplate__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4910:1: ( rule__CalculationTemplate__Group_9__0__Impl rule__CalculationTemplate__Group_9__1 )
            // InternalPagos.g:4911:2: rule__CalculationTemplate__Group_9__0__Impl rule__CalculationTemplate__Group_9__1
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
    // InternalPagos.g:4918:1: rule__CalculationTemplate__Group_9__0__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4922:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4923:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4923:1: ( RULE_COMMA )
            // InternalPagos.g:4924:2: RULE_COMMA
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
    // InternalPagos.g:4933:1: rule__CalculationTemplate__Group_9__1 : rule__CalculationTemplate__Group_9__1__Impl rule__CalculationTemplate__Group_9__2 ;
    public final void rule__CalculationTemplate__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4937:1: ( rule__CalculationTemplate__Group_9__1__Impl rule__CalculationTemplate__Group_9__2 )
            // InternalPagos.g:4938:2: rule__CalculationTemplate__Group_9__1__Impl rule__CalculationTemplate__Group_9__2
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
    // InternalPagos.g:4945:1: rule__CalculationTemplate__Group_9__1__Impl : ( 'calculationattributes' ) ;
    public final void rule__CalculationTemplate__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4949:1: ( ( 'calculationattributes' ) )
            // InternalPagos.g:4950:1: ( 'calculationattributes' )
            {
            // InternalPagos.g:4950:1: ( 'calculationattributes' )
            // InternalPagos.g:4951:2: 'calculationattributes'
            {
             before(grammarAccess.getCalculationTemplateAccess().getCalculationattributesKeyword_9_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPagos.g:4960:1: rule__CalculationTemplate__Group_9__2 : rule__CalculationTemplate__Group_9__2__Impl rule__CalculationTemplate__Group_9__3 ;
    public final void rule__CalculationTemplate__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4964:1: ( rule__CalculationTemplate__Group_9__2__Impl rule__CalculationTemplate__Group_9__3 )
            // InternalPagos.g:4965:2: rule__CalculationTemplate__Group_9__2__Impl rule__CalculationTemplate__Group_9__3
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
    // InternalPagos.g:4972:1: rule__CalculationTemplate__Group_9__2__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4976:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4977:1: ( RULE_COLON )
            {
            // InternalPagos.g:4977:1: ( RULE_COLON )
            // InternalPagos.g:4978:2: RULE_COLON
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
    // InternalPagos.g:4987:1: rule__CalculationTemplate__Group_9__3 : rule__CalculationTemplate__Group_9__3__Impl rule__CalculationTemplate__Group_9__4 ;
    public final void rule__CalculationTemplate__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4991:1: ( rule__CalculationTemplate__Group_9__3__Impl rule__CalculationTemplate__Group_9__4 )
            // InternalPagos.g:4992:2: rule__CalculationTemplate__Group_9__3__Impl rule__CalculationTemplate__Group_9__4
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
    // InternalPagos.g:4999:1: rule__CalculationTemplate__Group_9__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__CalculationTemplate__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5003:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:5004:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:5004:1: ( RULE_LBRACKET )
            // InternalPagos.g:5005:2: RULE_LBRACKET
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
    // InternalPagos.g:5014:1: rule__CalculationTemplate__Group_9__4 : rule__CalculationTemplate__Group_9__4__Impl rule__CalculationTemplate__Group_9__5 ;
    public final void rule__CalculationTemplate__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5018:1: ( rule__CalculationTemplate__Group_9__4__Impl rule__CalculationTemplate__Group_9__5 )
            // InternalPagos.g:5019:2: rule__CalculationTemplate__Group_9__4__Impl rule__CalculationTemplate__Group_9__5
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
    // InternalPagos.g:5026:1: rule__CalculationTemplate__Group_9__4__Impl : ( ( rule__CalculationTemplate__AttListsAssignment_9_4 ) ) ;
    public final void rule__CalculationTemplate__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5030:1: ( ( ( rule__CalculationTemplate__AttListsAssignment_9_4 ) ) )
            // InternalPagos.g:5031:1: ( ( rule__CalculationTemplate__AttListsAssignment_9_4 ) )
            {
            // InternalPagos.g:5031:1: ( ( rule__CalculationTemplate__AttListsAssignment_9_4 ) )
            // InternalPagos.g:5032:2: ( rule__CalculationTemplate__AttListsAssignment_9_4 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_9_4()); 
            // InternalPagos.g:5033:2: ( rule__CalculationTemplate__AttListsAssignment_9_4 )
            // InternalPagos.g:5033:3: rule__CalculationTemplate__AttListsAssignment_9_4
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
    // InternalPagos.g:5041:1: rule__CalculationTemplate__Group_9__5 : rule__CalculationTemplate__Group_9__5__Impl rule__CalculationTemplate__Group_9__6 ;
    public final void rule__CalculationTemplate__Group_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5045:1: ( rule__CalculationTemplate__Group_9__5__Impl rule__CalculationTemplate__Group_9__6 )
            // InternalPagos.g:5046:2: rule__CalculationTemplate__Group_9__5__Impl rule__CalculationTemplate__Group_9__6
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
    // InternalPagos.g:5053:1: rule__CalculationTemplate__Group_9__5__Impl : ( ( rule__CalculationTemplate__Group_9_5__0 )* ) ;
    public final void rule__CalculationTemplate__Group_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5057:1: ( ( ( rule__CalculationTemplate__Group_9_5__0 )* ) )
            // InternalPagos.g:5058:1: ( ( rule__CalculationTemplate__Group_9_5__0 )* )
            {
            // InternalPagos.g:5058:1: ( ( rule__CalculationTemplate__Group_9_5__0 )* )
            // InternalPagos.g:5059:2: ( rule__CalculationTemplate__Group_9_5__0 )*
            {
             before(grammarAccess.getCalculationTemplateAccess().getGroup_9_5()); 
            // InternalPagos.g:5060:2: ( rule__CalculationTemplate__Group_9_5__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPagos.g:5060:3: rule__CalculationTemplate__Group_9_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CalculationTemplate__Group_9_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalPagos.g:5068:1: rule__CalculationTemplate__Group_9__6 : rule__CalculationTemplate__Group_9__6__Impl ;
    public final void rule__CalculationTemplate__Group_9__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5072:1: ( rule__CalculationTemplate__Group_9__6__Impl )
            // InternalPagos.g:5073:2: rule__CalculationTemplate__Group_9__6__Impl
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
    // InternalPagos.g:5079:1: rule__CalculationTemplate__Group_9__6__Impl : ( RULE_RBRACKET ) ;
    public final void rule__CalculationTemplate__Group_9__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5083:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:5084:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:5084:1: ( RULE_RBRACKET )
            // InternalPagos.g:5085:2: RULE_RBRACKET
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
    // InternalPagos.g:5095:1: rule__CalculationTemplate__Group_9_5__0 : rule__CalculationTemplate__Group_9_5__0__Impl rule__CalculationTemplate__Group_9_5__1 ;
    public final void rule__CalculationTemplate__Group_9_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5099:1: ( rule__CalculationTemplate__Group_9_5__0__Impl rule__CalculationTemplate__Group_9_5__1 )
            // InternalPagos.g:5100:2: rule__CalculationTemplate__Group_9_5__0__Impl rule__CalculationTemplate__Group_9_5__1
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
    // InternalPagos.g:5107:1: rule__CalculationTemplate__Group_9_5__0__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group_9_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5111:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:5112:1: ( RULE_COMMA )
            {
            // InternalPagos.g:5112:1: ( RULE_COMMA )
            // InternalPagos.g:5113:2: RULE_COMMA
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
    // InternalPagos.g:5122:1: rule__CalculationTemplate__Group_9_5__1 : rule__CalculationTemplate__Group_9_5__1__Impl ;
    public final void rule__CalculationTemplate__Group_9_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5126:1: ( rule__CalculationTemplate__Group_9_5__1__Impl )
            // InternalPagos.g:5127:2: rule__CalculationTemplate__Group_9_5__1__Impl
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
    // InternalPagos.g:5133:1: rule__CalculationTemplate__Group_9_5__1__Impl : ( ( rule__CalculationTemplate__AttListsAssignment_9_5_1 ) ) ;
    public final void rule__CalculationTemplate__Group_9_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5137:1: ( ( ( rule__CalculationTemplate__AttListsAssignment_9_5_1 ) ) )
            // InternalPagos.g:5138:1: ( ( rule__CalculationTemplate__AttListsAssignment_9_5_1 ) )
            {
            // InternalPagos.g:5138:1: ( ( rule__CalculationTemplate__AttListsAssignment_9_5_1 ) )
            // InternalPagos.g:5139:2: ( rule__CalculationTemplate__AttListsAssignment_9_5_1 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_9_5_1()); 
            // InternalPagos.g:5140:2: ( rule__CalculationTemplate__AttListsAssignment_9_5_1 )
            // InternalPagos.g:5140:3: rule__CalculationTemplate__AttListsAssignment_9_5_1
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
    // InternalPagos.g:5149:1: rule__Formula__Group_0__0 : rule__Formula__Group_0__0__Impl rule__Formula__Group_0__1 ;
    public final void rule__Formula__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5153:1: ( rule__Formula__Group_0__0__Impl rule__Formula__Group_0__1 )
            // InternalPagos.g:5154:2: rule__Formula__Group_0__0__Impl rule__Formula__Group_0__1
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
    // InternalPagos.g:5161:1: rule__Formula__Group_0__0__Impl : ( () ) ;
    public final void rule__Formula__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5165:1: ( ( () ) )
            // InternalPagos.g:5166:1: ( () )
            {
            // InternalPagos.g:5166:1: ( () )
            // InternalPagos.g:5167:2: ()
            {
             before(grammarAccess.getFormulaAccess().getFormulaAction_0_0()); 
            // InternalPagos.g:5168:2: ()
            // InternalPagos.g:5168:3: 
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
    // InternalPagos.g:5176:1: rule__Formula__Group_0__1 : rule__Formula__Group_0__1__Impl ;
    public final void rule__Formula__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5180:1: ( rule__Formula__Group_0__1__Impl )
            // InternalPagos.g:5181:2: rule__Formula__Group_0__1__Impl
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
    // InternalPagos.g:5187:1: rule__Formula__Group_0__1__Impl : ( ( rule__Formula__FormulaBodyAssignment_0_1 )* ) ;
    public final void rule__Formula__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5191:1: ( ( ( rule__Formula__FormulaBodyAssignment_0_1 )* ) )
            // InternalPagos.g:5192:1: ( ( rule__Formula__FormulaBodyAssignment_0_1 )* )
            {
            // InternalPagos.g:5192:1: ( ( rule__Formula__FormulaBodyAssignment_0_1 )* )
            // InternalPagos.g:5193:2: ( rule__Formula__FormulaBodyAssignment_0_1 )*
            {
             before(grammarAccess.getFormulaAccess().getFormulaBodyAssignment_0_1()); 
            // InternalPagos.g:5194:2: ( rule__Formula__FormulaBodyAssignment_0_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_IF) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPagos.g:5194:3: rule__Formula__FormulaBodyAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Formula__FormulaBodyAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalPagos.g:5203:1: rule__IfBlock__Group__0 : rule__IfBlock__Group__0__Impl rule__IfBlock__Group__1 ;
    public final void rule__IfBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5207:1: ( rule__IfBlock__Group__0__Impl rule__IfBlock__Group__1 )
            // InternalPagos.g:5208:2: rule__IfBlock__Group__0__Impl rule__IfBlock__Group__1
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
    // InternalPagos.g:5215:1: rule__IfBlock__Group__0__Impl : ( () ) ;
    public final void rule__IfBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5219:1: ( ( () ) )
            // InternalPagos.g:5220:1: ( () )
            {
            // InternalPagos.g:5220:1: ( () )
            // InternalPagos.g:5221:2: ()
            {
             before(grammarAccess.getIfBlockAccess().getIfBlockAction_0()); 
            // InternalPagos.g:5222:2: ()
            // InternalPagos.g:5222:3: 
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
    // InternalPagos.g:5230:1: rule__IfBlock__Group__1 : rule__IfBlock__Group__1__Impl rule__IfBlock__Group__2 ;
    public final void rule__IfBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5234:1: ( rule__IfBlock__Group__1__Impl rule__IfBlock__Group__2 )
            // InternalPagos.g:5235:2: rule__IfBlock__Group__1__Impl rule__IfBlock__Group__2
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
    // InternalPagos.g:5242:1: rule__IfBlock__Group__1__Impl : ( ( rule__IfBlock__IfSentenceAssignment_1 ) ) ;
    public final void rule__IfBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5246:1: ( ( ( rule__IfBlock__IfSentenceAssignment_1 ) ) )
            // InternalPagos.g:5247:1: ( ( rule__IfBlock__IfSentenceAssignment_1 ) )
            {
            // InternalPagos.g:5247:1: ( ( rule__IfBlock__IfSentenceAssignment_1 ) )
            // InternalPagos.g:5248:2: ( rule__IfBlock__IfSentenceAssignment_1 )
            {
             before(grammarAccess.getIfBlockAccess().getIfSentenceAssignment_1()); 
            // InternalPagos.g:5249:2: ( rule__IfBlock__IfSentenceAssignment_1 )
            // InternalPagos.g:5249:3: rule__IfBlock__IfSentenceAssignment_1
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
    // InternalPagos.g:5257:1: rule__IfBlock__Group__2 : rule__IfBlock__Group__2__Impl ;
    public final void rule__IfBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5261:1: ( rule__IfBlock__Group__2__Impl )
            // InternalPagos.g:5262:2: rule__IfBlock__Group__2__Impl
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
    // InternalPagos.g:5268:1: rule__IfBlock__Group__2__Impl : ( ( rule__IfBlock__Group_2__0 )? ) ;
    public final void rule__IfBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5272:1: ( ( ( rule__IfBlock__Group_2__0 )? ) )
            // InternalPagos.g:5273:1: ( ( rule__IfBlock__Group_2__0 )? )
            {
            // InternalPagos.g:5273:1: ( ( rule__IfBlock__Group_2__0 )? )
            // InternalPagos.g:5274:2: ( rule__IfBlock__Group_2__0 )?
            {
             before(grammarAccess.getIfBlockAccess().getGroup_2()); 
            // InternalPagos.g:5275:2: ( rule__IfBlock__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ELSE) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPagos.g:5275:3: rule__IfBlock__Group_2__0
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
    // InternalPagos.g:5284:1: rule__IfBlock__Group_2__0 : rule__IfBlock__Group_2__0__Impl rule__IfBlock__Group_2__1 ;
    public final void rule__IfBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5288:1: ( rule__IfBlock__Group_2__0__Impl rule__IfBlock__Group_2__1 )
            // InternalPagos.g:5289:2: rule__IfBlock__Group_2__0__Impl rule__IfBlock__Group_2__1
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
    // InternalPagos.g:5296:1: rule__IfBlock__Group_2__0__Impl : ( RULE_ELSE ) ;
    public final void rule__IfBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5300:1: ( ( RULE_ELSE ) )
            // InternalPagos.g:5301:1: ( RULE_ELSE )
            {
            // InternalPagos.g:5301:1: ( RULE_ELSE )
            // InternalPagos.g:5302:2: RULE_ELSE
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
    // InternalPagos.g:5311:1: rule__IfBlock__Group_2__1 : rule__IfBlock__Group_2__1__Impl ;
    public final void rule__IfBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5315:1: ( rule__IfBlock__Group_2__1__Impl )
            // InternalPagos.g:5316:2: rule__IfBlock__Group_2__1__Impl
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
    // InternalPagos.g:5322:1: rule__IfBlock__Group_2__1__Impl : ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) ) ;
    public final void rule__IfBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5326:1: ( ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) ) )
            // InternalPagos.g:5327:1: ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) )
            {
            // InternalPagos.g:5327:1: ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) )
            // InternalPagos.g:5328:2: ( rule__IfBlock__ElseSentenceAssignment_2_1 )
            {
             before(grammarAccess.getIfBlockAccess().getElseSentenceAssignment_2_1()); 
            // InternalPagos.g:5329:2: ( rule__IfBlock__ElseSentenceAssignment_2_1 )
            // InternalPagos.g:5329:3: rule__IfBlock__ElseSentenceAssignment_2_1
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
    // InternalPagos.g:5338:1: rule__IfCondition__Group__0 : rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1 ;
    public final void rule__IfCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5342:1: ( rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1 )
            // InternalPagos.g:5343:2: rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1
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
    // InternalPagos.g:5350:1: rule__IfCondition__Group__0__Impl : ( () ) ;
    public final void rule__IfCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5354:1: ( ( () ) )
            // InternalPagos.g:5355:1: ( () )
            {
            // InternalPagos.g:5355:1: ( () )
            // InternalPagos.g:5356:2: ()
            {
             before(grammarAccess.getIfConditionAccess().getIfConditionAction_0()); 
            // InternalPagos.g:5357:2: ()
            // InternalPagos.g:5357:3: 
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
    // InternalPagos.g:5365:1: rule__IfCondition__Group__1 : rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2 ;
    public final void rule__IfCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5369:1: ( rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2 )
            // InternalPagos.g:5370:2: rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2
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
    // InternalPagos.g:5377:1: rule__IfCondition__Group__1__Impl : ( RULE_IF ) ;
    public final void rule__IfCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5381:1: ( ( RULE_IF ) )
            // InternalPagos.g:5382:1: ( RULE_IF )
            {
            // InternalPagos.g:5382:1: ( RULE_IF )
            // InternalPagos.g:5383:2: RULE_IF
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
    // InternalPagos.g:5392:1: rule__IfCondition__Group__2 : rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3 ;
    public final void rule__IfCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5396:1: ( rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3 )
            // InternalPagos.g:5397:2: rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3
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
    // InternalPagos.g:5404:1: rule__IfCondition__Group__2__Impl : ( RULE_LBRACKET ) ;
    public final void rule__IfCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5408:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:5409:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:5409:1: ( RULE_LBRACKET )
            // InternalPagos.g:5410:2: RULE_LBRACKET
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
    // InternalPagos.g:5419:1: rule__IfCondition__Group__3 : rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4 ;
    public final void rule__IfCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5423:1: ( rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4 )
            // InternalPagos.g:5424:2: rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4
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
    // InternalPagos.g:5431:1: rule__IfCondition__Group__3__Impl : ( ( rule__IfCondition__LogExpAssignment_3 ) ) ;
    public final void rule__IfCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5435:1: ( ( ( rule__IfCondition__LogExpAssignment_3 ) ) )
            // InternalPagos.g:5436:1: ( ( rule__IfCondition__LogExpAssignment_3 ) )
            {
            // InternalPagos.g:5436:1: ( ( rule__IfCondition__LogExpAssignment_3 ) )
            // InternalPagos.g:5437:2: ( rule__IfCondition__LogExpAssignment_3 )
            {
             before(grammarAccess.getIfConditionAccess().getLogExpAssignment_3()); 
            // InternalPagos.g:5438:2: ( rule__IfCondition__LogExpAssignment_3 )
            // InternalPagos.g:5438:3: rule__IfCondition__LogExpAssignment_3
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
    // InternalPagos.g:5446:1: rule__IfCondition__Group__4 : rule__IfCondition__Group__4__Impl rule__IfCondition__Group__5 ;
    public final void rule__IfCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5450:1: ( rule__IfCondition__Group__4__Impl rule__IfCondition__Group__5 )
            // InternalPagos.g:5451:2: rule__IfCondition__Group__4__Impl rule__IfCondition__Group__5
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
    // InternalPagos.g:5458:1: rule__IfCondition__Group__4__Impl : ( RULE_RBRACKET ) ;
    public final void rule__IfCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5462:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:5463:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:5463:1: ( RULE_RBRACKET )
            // InternalPagos.g:5464:2: RULE_RBRACKET
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
    // InternalPagos.g:5473:1: rule__IfCondition__Group__5 : rule__IfCondition__Group__5__Impl rule__IfCondition__Group__6 ;
    public final void rule__IfCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5477:1: ( rule__IfCondition__Group__5__Impl rule__IfCondition__Group__6 )
            // InternalPagos.g:5478:2: rule__IfCondition__Group__5__Impl rule__IfCondition__Group__6
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
    // InternalPagos.g:5485:1: rule__IfCondition__Group__5__Impl : ( RULE_THEN ) ;
    public final void rule__IfCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5489:1: ( ( RULE_THEN ) )
            // InternalPagos.g:5490:1: ( RULE_THEN )
            {
            // InternalPagos.g:5490:1: ( RULE_THEN )
            // InternalPagos.g:5491:2: RULE_THEN
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
    // InternalPagos.g:5500:1: rule__IfCondition__Group__6 : rule__IfCondition__Group__6__Impl rule__IfCondition__Group__7 ;
    public final void rule__IfCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5504:1: ( rule__IfCondition__Group__6__Impl rule__IfCondition__Group__7 )
            // InternalPagos.g:5505:2: rule__IfCondition__Group__6__Impl rule__IfCondition__Group__7
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
    // InternalPagos.g:5512:1: rule__IfCondition__Group__6__Impl : ( RULE_LBRACE ) ;
    public final void rule__IfCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5516:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:5517:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:5517:1: ( RULE_LBRACE )
            // InternalPagos.g:5518:2: RULE_LBRACE
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
    // InternalPagos.g:5527:1: rule__IfCondition__Group__7 : rule__IfCondition__Group__7__Impl rule__IfCondition__Group__8 ;
    public final void rule__IfCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5531:1: ( rule__IfCondition__Group__7__Impl rule__IfCondition__Group__8 )
            // InternalPagos.g:5532:2: rule__IfCondition__Group__7__Impl rule__IfCondition__Group__8
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
    // InternalPagos.g:5539:1: rule__IfCondition__Group__7__Impl : ( ( rule__IfCondition__FormulaReturnAssignment_7 ) ) ;
    public final void rule__IfCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5543:1: ( ( ( rule__IfCondition__FormulaReturnAssignment_7 ) ) )
            // InternalPagos.g:5544:1: ( ( rule__IfCondition__FormulaReturnAssignment_7 ) )
            {
            // InternalPagos.g:5544:1: ( ( rule__IfCondition__FormulaReturnAssignment_7 ) )
            // InternalPagos.g:5545:2: ( rule__IfCondition__FormulaReturnAssignment_7 )
            {
             before(grammarAccess.getIfConditionAccess().getFormulaReturnAssignment_7()); 
            // InternalPagos.g:5546:2: ( rule__IfCondition__FormulaReturnAssignment_7 )
            // InternalPagos.g:5546:3: rule__IfCondition__FormulaReturnAssignment_7
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
    // InternalPagos.g:5554:1: rule__IfCondition__Group__8 : rule__IfCondition__Group__8__Impl ;
    public final void rule__IfCondition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5558:1: ( rule__IfCondition__Group__8__Impl )
            // InternalPagos.g:5559:2: rule__IfCondition__Group__8__Impl
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
    // InternalPagos.g:5565:1: rule__IfCondition__Group__8__Impl : ( RULE_RBRACE ) ;
    public final void rule__IfCondition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5569:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:5570:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:5570:1: ( RULE_RBRACE )
            // InternalPagos.g:5571:2: RULE_RBRACE
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
    // InternalPagos.g:5581:1: rule__ElseSegment__Group__0 : rule__ElseSegment__Group__0__Impl rule__ElseSegment__Group__1 ;
    public final void rule__ElseSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5585:1: ( rule__ElseSegment__Group__0__Impl rule__ElseSegment__Group__1 )
            // InternalPagos.g:5586:2: rule__ElseSegment__Group__0__Impl rule__ElseSegment__Group__1
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
    // InternalPagos.g:5593:1: rule__ElseSegment__Group__0__Impl : ( () ) ;
    public final void rule__ElseSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5597:1: ( ( () ) )
            // InternalPagos.g:5598:1: ( () )
            {
            // InternalPagos.g:5598:1: ( () )
            // InternalPagos.g:5599:2: ()
            {
             before(grammarAccess.getElseSegmentAccess().getElseSegmentAction_0()); 
            // InternalPagos.g:5600:2: ()
            // InternalPagos.g:5600:3: 
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
    // InternalPagos.g:5608:1: rule__ElseSegment__Group__1 : rule__ElseSegment__Group__1__Impl rule__ElseSegment__Group__2 ;
    public final void rule__ElseSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5612:1: ( rule__ElseSegment__Group__1__Impl rule__ElseSegment__Group__2 )
            // InternalPagos.g:5613:2: rule__ElseSegment__Group__1__Impl rule__ElseSegment__Group__2
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
    // InternalPagos.g:5620:1: rule__ElseSegment__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__ElseSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5624:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:5625:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:5625:1: ( RULE_LBRACE )
            // InternalPagos.g:5626:2: RULE_LBRACE
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
    // InternalPagos.g:5635:1: rule__ElseSegment__Group__2 : rule__ElseSegment__Group__2__Impl rule__ElseSegment__Group__3 ;
    public final void rule__ElseSegment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5639:1: ( rule__ElseSegment__Group__2__Impl rule__ElseSegment__Group__3 )
            // InternalPagos.g:5640:2: rule__ElseSegment__Group__2__Impl rule__ElseSegment__Group__3
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
    // InternalPagos.g:5647:1: rule__ElseSegment__Group__2__Impl : ( ( rule__ElseSegment__IfSentenceAssignment_2 ) ) ;
    public final void rule__ElseSegment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5651:1: ( ( ( rule__ElseSegment__IfSentenceAssignment_2 ) ) )
            // InternalPagos.g:5652:1: ( ( rule__ElseSegment__IfSentenceAssignment_2 ) )
            {
            // InternalPagos.g:5652:1: ( ( rule__ElseSegment__IfSentenceAssignment_2 ) )
            // InternalPagos.g:5653:2: ( rule__ElseSegment__IfSentenceAssignment_2 )
            {
             before(grammarAccess.getElseSegmentAccess().getIfSentenceAssignment_2()); 
            // InternalPagos.g:5654:2: ( rule__ElseSegment__IfSentenceAssignment_2 )
            // InternalPagos.g:5654:3: rule__ElseSegment__IfSentenceAssignment_2
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
    // InternalPagos.g:5662:1: rule__ElseSegment__Group__3 : rule__ElseSegment__Group__3__Impl ;
    public final void rule__ElseSegment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5666:1: ( rule__ElseSegment__Group__3__Impl )
            // InternalPagos.g:5667:2: rule__ElseSegment__Group__3__Impl
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
    // InternalPagos.g:5673:1: rule__ElseSegment__Group__3__Impl : ( RULE_RBRACE ) ;
    public final void rule__ElseSegment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5677:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:5678:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:5678:1: ( RULE_RBRACE )
            // InternalPagos.g:5679:2: RULE_RBRACE
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
    // InternalPagos.g:5689:1: rule__ReturnBlock__Group__0 : rule__ReturnBlock__Group__0__Impl rule__ReturnBlock__Group__1 ;
    public final void rule__ReturnBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5693:1: ( rule__ReturnBlock__Group__0__Impl rule__ReturnBlock__Group__1 )
            // InternalPagos.g:5694:2: rule__ReturnBlock__Group__0__Impl rule__ReturnBlock__Group__1
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
    // InternalPagos.g:5701:1: rule__ReturnBlock__Group__0__Impl : ( () ) ;
    public final void rule__ReturnBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5705:1: ( ( () ) )
            // InternalPagos.g:5706:1: ( () )
            {
            // InternalPagos.g:5706:1: ( () )
            // InternalPagos.g:5707:2: ()
            {
             before(grammarAccess.getReturnBlockAccess().getReturnBlockAction_0()); 
            // InternalPagos.g:5708:2: ()
            // InternalPagos.g:5708:3: 
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
    // InternalPagos.g:5716:1: rule__ReturnBlock__Group__1 : rule__ReturnBlock__Group__1__Impl rule__ReturnBlock__Group__2 ;
    public final void rule__ReturnBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5720:1: ( rule__ReturnBlock__Group__1__Impl rule__ReturnBlock__Group__2 )
            // InternalPagos.g:5721:2: rule__ReturnBlock__Group__1__Impl rule__ReturnBlock__Group__2
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
    // InternalPagos.g:5728:1: rule__ReturnBlock__Group__1__Impl : ( RULE_RETURN ) ;
    public final void rule__ReturnBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5732:1: ( ( RULE_RETURN ) )
            // InternalPagos.g:5733:1: ( RULE_RETURN )
            {
            // InternalPagos.g:5733:1: ( RULE_RETURN )
            // InternalPagos.g:5734:2: RULE_RETURN
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
    // InternalPagos.g:5743:1: rule__ReturnBlock__Group__2 : rule__ReturnBlock__Group__2__Impl rule__ReturnBlock__Group__3 ;
    public final void rule__ReturnBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5747:1: ( rule__ReturnBlock__Group__2__Impl rule__ReturnBlock__Group__3 )
            // InternalPagos.g:5748:2: rule__ReturnBlock__Group__2__Impl rule__ReturnBlock__Group__3
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
    // InternalPagos.g:5755:1: rule__ReturnBlock__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__ReturnBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5759:1: ( ( RULE_COLON ) )
            // InternalPagos.g:5760:1: ( RULE_COLON )
            {
            // InternalPagos.g:5760:1: ( RULE_COLON )
            // InternalPagos.g:5761:2: RULE_COLON
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
    // InternalPagos.g:5770:1: rule__ReturnBlock__Group__3 : rule__ReturnBlock__Group__3__Impl ;
    public final void rule__ReturnBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5774:1: ( rule__ReturnBlock__Group__3__Impl )
            // InternalPagos.g:5775:2: rule__ReturnBlock__Group__3__Impl
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
    // InternalPagos.g:5781:1: rule__ReturnBlock__Group__3__Impl : ( ( rule__ReturnBlock__ExpressionAssignment_3 ) ) ;
    public final void rule__ReturnBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5785:1: ( ( ( rule__ReturnBlock__ExpressionAssignment_3 ) ) )
            // InternalPagos.g:5786:1: ( ( rule__ReturnBlock__ExpressionAssignment_3 ) )
            {
            // InternalPagos.g:5786:1: ( ( rule__ReturnBlock__ExpressionAssignment_3 ) )
            // InternalPagos.g:5787:2: ( rule__ReturnBlock__ExpressionAssignment_3 )
            {
             before(grammarAccess.getReturnBlockAccess().getExpressionAssignment_3()); 
            // InternalPagos.g:5788:2: ( rule__ReturnBlock__ExpressionAssignment_3 )
            // InternalPagos.g:5788:3: rule__ReturnBlock__ExpressionAssignment_3
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
    // InternalPagos.g:5797:1: rule__ExpresionLogica__Group__0 : rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 ;
    public final void rule__ExpresionLogica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5801:1: ( rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 )
            // InternalPagos.g:5802:2: rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1
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
    // InternalPagos.g:5809:1: rule__ExpresionLogica__Group__0__Impl : ( ( rule__ExpresionLogica__VariableAssignment_0 ) ) ;
    public final void rule__ExpresionLogica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5813:1: ( ( ( rule__ExpresionLogica__VariableAssignment_0 ) ) )
            // InternalPagos.g:5814:1: ( ( rule__ExpresionLogica__VariableAssignment_0 ) )
            {
            // InternalPagos.g:5814:1: ( ( rule__ExpresionLogica__VariableAssignment_0 ) )
            // InternalPagos.g:5815:2: ( rule__ExpresionLogica__VariableAssignment_0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getVariableAssignment_0()); 
            // InternalPagos.g:5816:2: ( rule__ExpresionLogica__VariableAssignment_0 )
            // InternalPagos.g:5816:3: rule__ExpresionLogica__VariableAssignment_0
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
    // InternalPagos.g:5824:1: rule__ExpresionLogica__Group__1 : rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 ;
    public final void rule__ExpresionLogica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5828:1: ( rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 )
            // InternalPagos.g:5829:2: rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2
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
    // InternalPagos.g:5836:1: rule__ExpresionLogica__Group__1__Impl : ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) ) ;
    public final void rule__ExpresionLogica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5840:1: ( ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) ) )
            // InternalPagos.g:5841:1: ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) )
            {
            // InternalPagos.g:5841:1: ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) )
            // InternalPagos.g:5842:2: ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* )
            {
            // InternalPagos.g:5842:2: ( ( rule__ExpresionLogica__Group_1__0 ) )
            // InternalPagos.g:5843:3: ( rule__ExpresionLogica__Group_1__0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 
            // InternalPagos.g:5844:3: ( rule__ExpresionLogica__Group_1__0 )
            // InternalPagos.g:5844:4: rule__ExpresionLogica__Group_1__0
            {
            pushFollow(FOLLOW_34);
            rule__ExpresionLogica__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 

            }

            // InternalPagos.g:5847:2: ( ( rule__ExpresionLogica__Group_1__0 )* )
            // InternalPagos.g:5848:3: ( rule__ExpresionLogica__Group_1__0 )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 
            // InternalPagos.g:5849:3: ( rule__ExpresionLogica__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_OPERADORLOGICO) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPagos.g:5849:4: rule__ExpresionLogica__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__ExpresionLogica__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalPagos.g:5858:1: rule__ExpresionLogica__Group__2 : rule__ExpresionLogica__Group__2__Impl ;
    public final void rule__ExpresionLogica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5862:1: ( rule__ExpresionLogica__Group__2__Impl )
            // InternalPagos.g:5863:2: rule__ExpresionLogica__Group__2__Impl
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
    // InternalPagos.g:5869:1: rule__ExpresionLogica__Group__2__Impl : ( ( rule__ExpresionLogica__Group_2__0 )? ) ;
    public final void rule__ExpresionLogica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5873:1: ( ( ( rule__ExpresionLogica__Group_2__0 )? ) )
            // InternalPagos.g:5874:1: ( ( rule__ExpresionLogica__Group_2__0 )? )
            {
            // InternalPagos.g:5874:1: ( ( rule__ExpresionLogica__Group_2__0 )? )
            // InternalPagos.g:5875:2: ( rule__ExpresionLogica__Group_2__0 )?
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_2()); 
            // InternalPagos.g:5876:2: ( rule__ExpresionLogica__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_LOGICALCONN) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPagos.g:5876:3: rule__ExpresionLogica__Group_2__0
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
    // InternalPagos.g:5885:1: rule__ExpresionLogica__Group_1__0 : rule__ExpresionLogica__Group_1__0__Impl rule__ExpresionLogica__Group_1__1 ;
    public final void rule__ExpresionLogica__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5889:1: ( rule__ExpresionLogica__Group_1__0__Impl rule__ExpresionLogica__Group_1__1 )
            // InternalPagos.g:5890:2: rule__ExpresionLogica__Group_1__0__Impl rule__ExpresionLogica__Group_1__1
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
    // InternalPagos.g:5897:1: rule__ExpresionLogica__Group_1__0__Impl : ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) ) ;
    public final void rule__ExpresionLogica__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5901:1: ( ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) ) )
            // InternalPagos.g:5902:1: ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) )
            {
            // InternalPagos.g:5902:1: ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) )
            // InternalPagos.g:5903:2: ( rule__ExpresionLogica__LogOperAssignment_1_0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getLogOperAssignment_1_0()); 
            // InternalPagos.g:5904:2: ( rule__ExpresionLogica__LogOperAssignment_1_0 )
            // InternalPagos.g:5904:3: rule__ExpresionLogica__LogOperAssignment_1_0
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
    // InternalPagos.g:5912:1: rule__ExpresionLogica__Group_1__1 : rule__ExpresionLogica__Group_1__1__Impl ;
    public final void rule__ExpresionLogica__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5916:1: ( rule__ExpresionLogica__Group_1__1__Impl )
            // InternalPagos.g:5917:2: rule__ExpresionLogica__Group_1__1__Impl
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
    // InternalPagos.g:5923:1: rule__ExpresionLogica__Group_1__1__Impl : ( ( rule__ExpresionLogica__Alternatives_1_1 ) ) ;
    public final void rule__ExpresionLogica__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5927:1: ( ( ( rule__ExpresionLogica__Alternatives_1_1 ) ) )
            // InternalPagos.g:5928:1: ( ( rule__ExpresionLogica__Alternatives_1_1 ) )
            {
            // InternalPagos.g:5928:1: ( ( rule__ExpresionLogica__Alternatives_1_1 ) )
            // InternalPagos.g:5929:2: ( rule__ExpresionLogica__Alternatives_1_1 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getAlternatives_1_1()); 
            // InternalPagos.g:5930:2: ( rule__ExpresionLogica__Alternatives_1_1 )
            // InternalPagos.g:5930:3: rule__ExpresionLogica__Alternatives_1_1
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
    // InternalPagos.g:5939:1: rule__ExpresionLogica__Group_2__0 : rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1 ;
    public final void rule__ExpresionLogica__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5943:1: ( rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1 )
            // InternalPagos.g:5944:2: rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1
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
    // InternalPagos.g:5951:1: rule__ExpresionLogica__Group_2__0__Impl : ( ( rule__ExpresionLogica__ConOperAssignment_2_0 ) ) ;
    public final void rule__ExpresionLogica__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5955:1: ( ( ( rule__ExpresionLogica__ConOperAssignment_2_0 ) ) )
            // InternalPagos.g:5956:1: ( ( rule__ExpresionLogica__ConOperAssignment_2_0 ) )
            {
            // InternalPagos.g:5956:1: ( ( rule__ExpresionLogica__ConOperAssignment_2_0 ) )
            // InternalPagos.g:5957:2: ( rule__ExpresionLogica__ConOperAssignment_2_0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getConOperAssignment_2_0()); 
            // InternalPagos.g:5958:2: ( rule__ExpresionLogica__ConOperAssignment_2_0 )
            // InternalPagos.g:5958:3: rule__ExpresionLogica__ConOperAssignment_2_0
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
    // InternalPagos.g:5966:1: rule__ExpresionLogica__Group_2__1 : rule__ExpresionLogica__Group_2__1__Impl ;
    public final void rule__ExpresionLogica__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5970:1: ( rule__ExpresionLogica__Group_2__1__Impl )
            // InternalPagos.g:5971:2: rule__ExpresionLogica__Group_2__1__Impl
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
    // InternalPagos.g:5977:1: rule__ExpresionLogica__Group_2__1__Impl : ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) ) ;
    public final void rule__ExpresionLogica__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5981:1: ( ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) ) )
            // InternalPagos.g:5982:1: ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) )
            {
            // InternalPagos.g:5982:1: ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) )
            // InternalPagos.g:5983:2: ( rule__ExpresionLogica__ExpAssignment_2_1 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getExpAssignment_2_1()); 
            // InternalPagos.g:5984:2: ( rule__ExpresionLogica__ExpAssignment_2_1 )
            // InternalPagos.g:5984:3: rule__ExpresionLogica__ExpAssignment_2_1
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
    // InternalPagos.g:5993:1: rule__Adicion__Group__0 : rule__Adicion__Group__0__Impl rule__Adicion__Group__1 ;
    public final void rule__Adicion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5997:1: ( rule__Adicion__Group__0__Impl rule__Adicion__Group__1 )
            // InternalPagos.g:5998:2: rule__Adicion__Group__0__Impl rule__Adicion__Group__1
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
    // InternalPagos.g:6005:1: rule__Adicion__Group__0__Impl : ( ruleMultiplicacion ) ;
    public final void rule__Adicion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6009:1: ( ( ruleMultiplicacion ) )
            // InternalPagos.g:6010:1: ( ruleMultiplicacion )
            {
            // InternalPagos.g:6010:1: ( ruleMultiplicacion )
            // InternalPagos.g:6011:2: ruleMultiplicacion
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
    // InternalPagos.g:6020:1: rule__Adicion__Group__1 : rule__Adicion__Group__1__Impl ;
    public final void rule__Adicion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6024:1: ( rule__Adicion__Group__1__Impl )
            // InternalPagos.g:6025:2: rule__Adicion__Group__1__Impl
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
    // InternalPagos.g:6031:1: rule__Adicion__Group__1__Impl : ( ( rule__Adicion__Group_1__0 )* ) ;
    public final void rule__Adicion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6035:1: ( ( ( rule__Adicion__Group_1__0 )* ) )
            // InternalPagos.g:6036:1: ( ( rule__Adicion__Group_1__0 )* )
            {
            // InternalPagos.g:6036:1: ( ( rule__Adicion__Group_1__0 )* )
            // InternalPagos.g:6037:2: ( rule__Adicion__Group_1__0 )*
            {
             before(grammarAccess.getAdicionAccess().getGroup_1()); 
            // InternalPagos.g:6038:2: ( rule__Adicion__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ADDOP) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPagos.g:6038:3: rule__Adicion__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Adicion__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalPagos.g:6047:1: rule__Adicion__Group_1__0 : rule__Adicion__Group_1__0__Impl rule__Adicion__Group_1__1 ;
    public final void rule__Adicion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6051:1: ( rule__Adicion__Group_1__0__Impl rule__Adicion__Group_1__1 )
            // InternalPagos.g:6052:2: rule__Adicion__Group_1__0__Impl rule__Adicion__Group_1__1
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
    // InternalPagos.g:6059:1: rule__Adicion__Group_1__0__Impl : ( () ) ;
    public final void rule__Adicion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6063:1: ( ( () ) )
            // InternalPagos.g:6064:1: ( () )
            {
            // InternalPagos.g:6064:1: ( () )
            // InternalPagos.g:6065:2: ()
            {
             before(grammarAccess.getAdicionAccess().getAdicionLeftAction_1_0()); 
            // InternalPagos.g:6066:2: ()
            // InternalPagos.g:6066:3: 
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
    // InternalPagos.g:6074:1: rule__Adicion__Group_1__1 : rule__Adicion__Group_1__1__Impl rule__Adicion__Group_1__2 ;
    public final void rule__Adicion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6078:1: ( rule__Adicion__Group_1__1__Impl rule__Adicion__Group_1__2 )
            // InternalPagos.g:6079:2: rule__Adicion__Group_1__1__Impl rule__Adicion__Group_1__2
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
    // InternalPagos.g:6086:1: rule__Adicion__Group_1__1__Impl : ( ( rule__Adicion__OperatorAssignment_1_1 ) ) ;
    public final void rule__Adicion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6090:1: ( ( ( rule__Adicion__OperatorAssignment_1_1 ) ) )
            // InternalPagos.g:6091:1: ( ( rule__Adicion__OperatorAssignment_1_1 ) )
            {
            // InternalPagos.g:6091:1: ( ( rule__Adicion__OperatorAssignment_1_1 ) )
            // InternalPagos.g:6092:2: ( rule__Adicion__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdicionAccess().getOperatorAssignment_1_1()); 
            // InternalPagos.g:6093:2: ( rule__Adicion__OperatorAssignment_1_1 )
            // InternalPagos.g:6093:3: rule__Adicion__OperatorAssignment_1_1
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
    // InternalPagos.g:6101:1: rule__Adicion__Group_1__2 : rule__Adicion__Group_1__2__Impl ;
    public final void rule__Adicion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6105:1: ( rule__Adicion__Group_1__2__Impl )
            // InternalPagos.g:6106:2: rule__Adicion__Group_1__2__Impl
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
    // InternalPagos.g:6112:1: rule__Adicion__Group_1__2__Impl : ( ( rule__Adicion__RexpAssignment_1_2 ) ) ;
    public final void rule__Adicion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6116:1: ( ( ( rule__Adicion__RexpAssignment_1_2 ) ) )
            // InternalPagos.g:6117:1: ( ( rule__Adicion__RexpAssignment_1_2 ) )
            {
            // InternalPagos.g:6117:1: ( ( rule__Adicion__RexpAssignment_1_2 ) )
            // InternalPagos.g:6118:2: ( rule__Adicion__RexpAssignment_1_2 )
            {
             before(grammarAccess.getAdicionAccess().getRexpAssignment_1_2()); 
            // InternalPagos.g:6119:2: ( rule__Adicion__RexpAssignment_1_2 )
            // InternalPagos.g:6119:3: rule__Adicion__RexpAssignment_1_2
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
    // InternalPagos.g:6128:1: rule__Multiplicacion__Group__0 : rule__Multiplicacion__Group__0__Impl rule__Multiplicacion__Group__1 ;
    public final void rule__Multiplicacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6132:1: ( rule__Multiplicacion__Group__0__Impl rule__Multiplicacion__Group__1 )
            // InternalPagos.g:6133:2: rule__Multiplicacion__Group__0__Impl rule__Multiplicacion__Group__1
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
    // InternalPagos.g:6140:1: rule__Multiplicacion__Group__0__Impl : ( ruleSigleExp ) ;
    public final void rule__Multiplicacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6144:1: ( ( ruleSigleExp ) )
            // InternalPagos.g:6145:1: ( ruleSigleExp )
            {
            // InternalPagos.g:6145:1: ( ruleSigleExp )
            // InternalPagos.g:6146:2: ruleSigleExp
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
    // InternalPagos.g:6155:1: rule__Multiplicacion__Group__1 : rule__Multiplicacion__Group__1__Impl ;
    public final void rule__Multiplicacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6159:1: ( rule__Multiplicacion__Group__1__Impl )
            // InternalPagos.g:6160:2: rule__Multiplicacion__Group__1__Impl
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
    // InternalPagos.g:6166:1: rule__Multiplicacion__Group__1__Impl : ( ( rule__Multiplicacion__Group_1__0 )* ) ;
    public final void rule__Multiplicacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6170:1: ( ( ( rule__Multiplicacion__Group_1__0 )* ) )
            // InternalPagos.g:6171:1: ( ( rule__Multiplicacion__Group_1__0 )* )
            {
            // InternalPagos.g:6171:1: ( ( rule__Multiplicacion__Group_1__0 )* )
            // InternalPagos.g:6172:2: ( rule__Multiplicacion__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicacionAccess().getGroup_1()); 
            // InternalPagos.g:6173:2: ( rule__Multiplicacion__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_MULTOP) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPagos.g:6173:3: rule__Multiplicacion__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Multiplicacion__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalPagos.g:6182:1: rule__Multiplicacion__Group_1__0 : rule__Multiplicacion__Group_1__0__Impl rule__Multiplicacion__Group_1__1 ;
    public final void rule__Multiplicacion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6186:1: ( rule__Multiplicacion__Group_1__0__Impl rule__Multiplicacion__Group_1__1 )
            // InternalPagos.g:6187:2: rule__Multiplicacion__Group_1__0__Impl rule__Multiplicacion__Group_1__1
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
    // InternalPagos.g:6194:1: rule__Multiplicacion__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplicacion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6198:1: ( ( () ) )
            // InternalPagos.g:6199:1: ( () )
            {
            // InternalPagos.g:6199:1: ( () )
            // InternalPagos.g:6200:2: ()
            {
             before(grammarAccess.getMultiplicacionAccess().getMultiplicacionLeftAction_1_0()); 
            // InternalPagos.g:6201:2: ()
            // InternalPagos.g:6201:3: 
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
    // InternalPagos.g:6209:1: rule__Multiplicacion__Group_1__1 : rule__Multiplicacion__Group_1__1__Impl rule__Multiplicacion__Group_1__2 ;
    public final void rule__Multiplicacion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6213:1: ( rule__Multiplicacion__Group_1__1__Impl rule__Multiplicacion__Group_1__2 )
            // InternalPagos.g:6214:2: rule__Multiplicacion__Group_1__1__Impl rule__Multiplicacion__Group_1__2
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
    // InternalPagos.g:6221:1: rule__Multiplicacion__Group_1__1__Impl : ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplicacion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6225:1: ( ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) ) )
            // InternalPagos.g:6226:1: ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) )
            {
            // InternalPagos.g:6226:1: ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) )
            // InternalPagos.g:6227:2: ( rule__Multiplicacion__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicacionAccess().getOperatorAssignment_1_1()); 
            // InternalPagos.g:6228:2: ( rule__Multiplicacion__OperatorAssignment_1_1 )
            // InternalPagos.g:6228:3: rule__Multiplicacion__OperatorAssignment_1_1
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
    // InternalPagos.g:6236:1: rule__Multiplicacion__Group_1__2 : rule__Multiplicacion__Group_1__2__Impl ;
    public final void rule__Multiplicacion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6240:1: ( rule__Multiplicacion__Group_1__2__Impl )
            // InternalPagos.g:6241:2: rule__Multiplicacion__Group_1__2__Impl
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
    // InternalPagos.g:6247:1: rule__Multiplicacion__Group_1__2__Impl : ( ( rule__Multiplicacion__RexpAssignment_1_2 ) ) ;
    public final void rule__Multiplicacion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6251:1: ( ( ( rule__Multiplicacion__RexpAssignment_1_2 ) ) )
            // InternalPagos.g:6252:1: ( ( rule__Multiplicacion__RexpAssignment_1_2 ) )
            {
            // InternalPagos.g:6252:1: ( ( rule__Multiplicacion__RexpAssignment_1_2 ) )
            // InternalPagos.g:6253:2: ( rule__Multiplicacion__RexpAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicacionAccess().getRexpAssignment_1_2()); 
            // InternalPagos.g:6254:2: ( rule__Multiplicacion__RexpAssignment_1_2 )
            // InternalPagos.g:6254:3: rule__Multiplicacion__RexpAssignment_1_2
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
    // InternalPagos.g:6263:1: rule__SigleExp__Group_1__0 : rule__SigleExp__Group_1__0__Impl rule__SigleExp__Group_1__1 ;
    public final void rule__SigleExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6267:1: ( rule__SigleExp__Group_1__0__Impl rule__SigleExp__Group_1__1 )
            // InternalPagos.g:6268:2: rule__SigleExp__Group_1__0__Impl rule__SigleExp__Group_1__1
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
    // InternalPagos.g:6275:1: rule__SigleExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SigleExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6279:1: ( ( '(' ) )
            // InternalPagos.g:6280:1: ( '(' )
            {
            // InternalPagos.g:6280:1: ( '(' )
            // InternalPagos.g:6281:2: '('
            {
             before(grammarAccess.getSigleExpAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalPagos.g:6290:1: rule__SigleExp__Group_1__1 : rule__SigleExp__Group_1__1__Impl rule__SigleExp__Group_1__2 ;
    public final void rule__SigleExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6294:1: ( rule__SigleExp__Group_1__1__Impl rule__SigleExp__Group_1__2 )
            // InternalPagos.g:6295:2: rule__SigleExp__Group_1__1__Impl rule__SigleExp__Group_1__2
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
    // InternalPagos.g:6302:1: rule__SigleExp__Group_1__1__Impl : ( ruleAdicion ) ;
    public final void rule__SigleExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6306:1: ( ( ruleAdicion ) )
            // InternalPagos.g:6307:1: ( ruleAdicion )
            {
            // InternalPagos.g:6307:1: ( ruleAdicion )
            // InternalPagos.g:6308:2: ruleAdicion
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
    // InternalPagos.g:6317:1: rule__SigleExp__Group_1__2 : rule__SigleExp__Group_1__2__Impl ;
    public final void rule__SigleExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6321:1: ( rule__SigleExp__Group_1__2__Impl )
            // InternalPagos.g:6322:2: rule__SigleExp__Group_1__2__Impl
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
    // InternalPagos.g:6328:1: rule__SigleExp__Group_1__2__Impl : ( ')' ) ;
    public final void rule__SigleExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6332:1: ( ( ')' ) )
            // InternalPagos.g:6333:1: ( ')' )
            {
            // InternalPagos.g:6333:1: ( ')' )
            // InternalPagos.g:6334:2: ')'
            {
             before(grammarAccess.getSigleExpAccess().getRightParenthesisKeyword_1_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalPagos.g:6344:1: rule__BusinessAttribute__Group__0 : rule__BusinessAttribute__Group__0__Impl rule__BusinessAttribute__Group__1 ;
    public final void rule__BusinessAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6348:1: ( rule__BusinessAttribute__Group__0__Impl rule__BusinessAttribute__Group__1 )
            // InternalPagos.g:6349:2: rule__BusinessAttribute__Group__0__Impl rule__BusinessAttribute__Group__1
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
    // InternalPagos.g:6356:1: rule__BusinessAttribute__Group__0__Impl : ( () ) ;
    public final void rule__BusinessAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6360:1: ( ( () ) )
            // InternalPagos.g:6361:1: ( () )
            {
            // InternalPagos.g:6361:1: ( () )
            // InternalPagos.g:6362:2: ()
            {
             before(grammarAccess.getBusinessAttributeAccess().getBusinessAttributeAction_0()); 
            // InternalPagos.g:6363:2: ()
            // InternalPagos.g:6363:3: 
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
    // InternalPagos.g:6371:1: rule__BusinessAttribute__Group__1 : rule__BusinessAttribute__Group__1__Impl rule__BusinessAttribute__Group__2 ;
    public final void rule__BusinessAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6375:1: ( rule__BusinessAttribute__Group__1__Impl rule__BusinessAttribute__Group__2 )
            // InternalPagos.g:6376:2: rule__BusinessAttribute__Group__1__Impl rule__BusinessAttribute__Group__2
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
    // InternalPagos.g:6383:1: rule__BusinessAttribute__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__BusinessAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6387:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:6388:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:6388:1: ( RULE_LBRACE )
            // InternalPagos.g:6389:2: RULE_LBRACE
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
    // InternalPagos.g:6398:1: rule__BusinessAttribute__Group__2 : rule__BusinessAttribute__Group__2__Impl rule__BusinessAttribute__Group__3 ;
    public final void rule__BusinessAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6402:1: ( rule__BusinessAttribute__Group__2__Impl rule__BusinessAttribute__Group__3 )
            // InternalPagos.g:6403:2: rule__BusinessAttribute__Group__2__Impl rule__BusinessAttribute__Group__3
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
    // InternalPagos.g:6410:1: rule__BusinessAttribute__Group__2__Impl : ( ( rule__BusinessAttribute__NameAssignment_2 ) ) ;
    public final void rule__BusinessAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6414:1: ( ( ( rule__BusinessAttribute__NameAssignment_2 ) ) )
            // InternalPagos.g:6415:1: ( ( rule__BusinessAttribute__NameAssignment_2 ) )
            {
            // InternalPagos.g:6415:1: ( ( rule__BusinessAttribute__NameAssignment_2 ) )
            // InternalPagos.g:6416:2: ( rule__BusinessAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessAttributeAccess().getNameAssignment_2()); 
            // InternalPagos.g:6417:2: ( rule__BusinessAttribute__NameAssignment_2 )
            // InternalPagos.g:6417:3: rule__BusinessAttribute__NameAssignment_2
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
    // InternalPagos.g:6425:1: rule__BusinessAttribute__Group__3 : rule__BusinessAttribute__Group__3__Impl rule__BusinessAttribute__Group__4 ;
    public final void rule__BusinessAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6429:1: ( rule__BusinessAttribute__Group__3__Impl rule__BusinessAttribute__Group__4 )
            // InternalPagos.g:6430:2: rule__BusinessAttribute__Group__3__Impl rule__BusinessAttribute__Group__4
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
    // InternalPagos.g:6437:1: rule__BusinessAttribute__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__BusinessAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6441:1: ( ( RULE_COLON ) )
            // InternalPagos.g:6442:1: ( RULE_COLON )
            {
            // InternalPagos.g:6442:1: ( RULE_COLON )
            // InternalPagos.g:6443:2: RULE_COLON
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
    // InternalPagos.g:6452:1: rule__BusinessAttribute__Group__4 : rule__BusinessAttribute__Group__4__Impl rule__BusinessAttribute__Group__5 ;
    public final void rule__BusinessAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6456:1: ( rule__BusinessAttribute__Group__4__Impl rule__BusinessAttribute__Group__5 )
            // InternalPagos.g:6457:2: rule__BusinessAttribute__Group__4__Impl rule__BusinessAttribute__Group__5
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
    // InternalPagos.g:6464:1: rule__BusinessAttribute__Group__4__Impl : ( ( rule__BusinessAttribute__TypeAssignment_4 ) ) ;
    public final void rule__BusinessAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6468:1: ( ( ( rule__BusinessAttribute__TypeAssignment_4 ) ) )
            // InternalPagos.g:6469:1: ( ( rule__BusinessAttribute__TypeAssignment_4 ) )
            {
            // InternalPagos.g:6469:1: ( ( rule__BusinessAttribute__TypeAssignment_4 ) )
            // InternalPagos.g:6470:2: ( rule__BusinessAttribute__TypeAssignment_4 )
            {
             before(grammarAccess.getBusinessAttributeAccess().getTypeAssignment_4()); 
            // InternalPagos.g:6471:2: ( rule__BusinessAttribute__TypeAssignment_4 )
            // InternalPagos.g:6471:3: rule__BusinessAttribute__TypeAssignment_4
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
    // InternalPagos.g:6479:1: rule__BusinessAttribute__Group__5 : rule__BusinessAttribute__Group__5__Impl rule__BusinessAttribute__Group__6 ;
    public final void rule__BusinessAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6483:1: ( rule__BusinessAttribute__Group__5__Impl rule__BusinessAttribute__Group__6 )
            // InternalPagos.g:6484:2: rule__BusinessAttribute__Group__5__Impl rule__BusinessAttribute__Group__6
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
    // InternalPagos.g:6491:1: rule__BusinessAttribute__Group__5__Impl : ( ( rule__BusinessAttribute__Group_5__0 )? ) ;
    public final void rule__BusinessAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6495:1: ( ( ( rule__BusinessAttribute__Group_5__0 )? ) )
            // InternalPagos.g:6496:1: ( ( rule__BusinessAttribute__Group_5__0 )? )
            {
            // InternalPagos.g:6496:1: ( ( rule__BusinessAttribute__Group_5__0 )? )
            // InternalPagos.g:6497:2: ( rule__BusinessAttribute__Group_5__0 )?
            {
             before(grammarAccess.getBusinessAttributeAccess().getGroup_5()); 
            // InternalPagos.g:6498:2: ( rule__BusinessAttribute__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPagos.g:6498:3: rule__BusinessAttribute__Group_5__0
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
    // InternalPagos.g:6506:1: rule__BusinessAttribute__Group__6 : rule__BusinessAttribute__Group__6__Impl rule__BusinessAttribute__Group__7 ;
    public final void rule__BusinessAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6510:1: ( rule__BusinessAttribute__Group__6__Impl rule__BusinessAttribute__Group__7 )
            // InternalPagos.g:6511:2: rule__BusinessAttribute__Group__6__Impl rule__BusinessAttribute__Group__7
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
    // InternalPagos.g:6518:1: rule__BusinessAttribute__Group__6__Impl : ( ( rule__BusinessAttribute__IsIndexAssignment_6 )? ) ;
    public final void rule__BusinessAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6522:1: ( ( ( rule__BusinessAttribute__IsIndexAssignment_6 )? ) )
            // InternalPagos.g:6523:1: ( ( rule__BusinessAttribute__IsIndexAssignment_6 )? )
            {
            // InternalPagos.g:6523:1: ( ( rule__BusinessAttribute__IsIndexAssignment_6 )? )
            // InternalPagos.g:6524:2: ( rule__BusinessAttribute__IsIndexAssignment_6 )?
            {
             before(grammarAccess.getBusinessAttributeAccess().getIsIndexAssignment_6()); 
            // InternalPagos.g:6525:2: ( rule__BusinessAttribute__IsIndexAssignment_6 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INDEX) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPagos.g:6525:3: rule__BusinessAttribute__IsIndexAssignment_6
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
    // InternalPagos.g:6533:1: rule__BusinessAttribute__Group__7 : rule__BusinessAttribute__Group__7__Impl ;
    public final void rule__BusinessAttribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6537:1: ( rule__BusinessAttribute__Group__7__Impl )
            // InternalPagos.g:6538:2: rule__BusinessAttribute__Group__7__Impl
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
    // InternalPagos.g:6544:1: rule__BusinessAttribute__Group__7__Impl : ( RULE_RBRACE ) ;
    public final void rule__BusinessAttribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6548:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:6549:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:6549:1: ( RULE_RBRACE )
            // InternalPagos.g:6550:2: RULE_RBRACE
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
    // InternalPagos.g:6560:1: rule__BusinessAttribute__Group_5__0 : rule__BusinessAttribute__Group_5__0__Impl rule__BusinessAttribute__Group_5__1 ;
    public final void rule__BusinessAttribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6564:1: ( rule__BusinessAttribute__Group_5__0__Impl rule__BusinessAttribute__Group_5__1 )
            // InternalPagos.g:6565:2: rule__BusinessAttribute__Group_5__0__Impl rule__BusinessAttribute__Group_5__1
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
    // InternalPagos.g:6572:1: rule__BusinessAttribute__Group_5__0__Impl : ( ':=' ) ;
    public final void rule__BusinessAttribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6576:1: ( ( ':=' ) )
            // InternalPagos.g:6577:1: ( ':=' )
            {
            // InternalPagos.g:6577:1: ( ':=' )
            // InternalPagos.g:6578:2: ':='
            {
             before(grammarAccess.getBusinessAttributeAccess().getColonEqualsSignKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalPagos.g:6587:1: rule__BusinessAttribute__Group_5__1 : rule__BusinessAttribute__Group_5__1__Impl ;
    public final void rule__BusinessAttribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6591:1: ( rule__BusinessAttribute__Group_5__1__Impl )
            // InternalPagos.g:6592:2: rule__BusinessAttribute__Group_5__1__Impl
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
    // InternalPagos.g:6598:1: rule__BusinessAttribute__Group_5__1__Impl : ( ( rule__BusinessAttribute__ExpAssignment_5_1 ) ) ;
    public final void rule__BusinessAttribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6602:1: ( ( ( rule__BusinessAttribute__ExpAssignment_5_1 ) ) )
            // InternalPagos.g:6603:1: ( ( rule__BusinessAttribute__ExpAssignment_5_1 ) )
            {
            // InternalPagos.g:6603:1: ( ( rule__BusinessAttribute__ExpAssignment_5_1 ) )
            // InternalPagos.g:6604:2: ( rule__BusinessAttribute__ExpAssignment_5_1 )
            {
             before(grammarAccess.getBusinessAttributeAccess().getExpAssignment_5_1()); 
            // InternalPagos.g:6605:2: ( rule__BusinessAttribute__ExpAssignment_5_1 )
            // InternalPagos.g:6605:3: rule__BusinessAttribute__ExpAssignment_5_1
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
    // InternalPagos.g:6614:1: rule__TerminalValue__Group_0__0 : rule__TerminalValue__Group_0__0__Impl rule__TerminalValue__Group_0__1 ;
    public final void rule__TerminalValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6618:1: ( rule__TerminalValue__Group_0__0__Impl rule__TerminalValue__Group_0__1 )
            // InternalPagos.g:6619:2: rule__TerminalValue__Group_0__0__Impl rule__TerminalValue__Group_0__1
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
    // InternalPagos.g:6626:1: rule__TerminalValue__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6630:1: ( ( () ) )
            // InternalPagos.g:6631:1: ( () )
            {
            // InternalPagos.g:6631:1: ( () )
            // InternalPagos.g:6632:2: ()
            {
             before(grammarAccess.getTerminalValueAccess().getTerminalValueAction_0_0()); 
            // InternalPagos.g:6633:2: ()
            // InternalPagos.g:6633:3: 
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
    // InternalPagos.g:6641:1: rule__TerminalValue__Group_0__1 : rule__TerminalValue__Group_0__1__Impl rule__TerminalValue__Group_0__2 ;
    public final void rule__TerminalValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6645:1: ( rule__TerminalValue__Group_0__1__Impl rule__TerminalValue__Group_0__2 )
            // InternalPagos.g:6646:2: rule__TerminalValue__Group_0__1__Impl rule__TerminalValue__Group_0__2
            {
            pushFollow(FOLLOW_43);
            rule__TerminalValue__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0__2();

            state._fsp--;


            }

        }
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
    // InternalPagos.g:6653:1: rule__TerminalValue__Group_0__1__Impl : ( ( rule__TerminalValue__Group_0_1__0 )? ) ;
    public final void rule__TerminalValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6657:1: ( ( ( rule__TerminalValue__Group_0_1__0 )? ) )
            // InternalPagos.g:6658:1: ( ( rule__TerminalValue__Group_0_1__0 )? )
            {
            // InternalPagos.g:6658:1: ( ( rule__TerminalValue__Group_0_1__0 )? )
            // InternalPagos.g:6659:2: ( rule__TerminalValue__Group_0_1__0 )?
            {
             before(grammarAccess.getTerminalValueAccess().getGroup_0_1()); 
            // InternalPagos.g:6660:2: ( rule__TerminalValue__Group_0_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPagos.g:6660:3: rule__TerminalValue__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalValue__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminalValueAccess().getGroup_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TerminalValue__Group_0__2"
    // InternalPagos.g:6668:1: rule__TerminalValue__Group_0__2 : rule__TerminalValue__Group_0__2__Impl ;
    public final void rule__TerminalValue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6672:1: ( rule__TerminalValue__Group_0__2__Impl )
            // InternalPagos.g:6673:2: rule__TerminalValue__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0__2"


    // $ANTLR start "rule__TerminalValue__Group_0__2__Impl"
    // InternalPagos.g:6679:1: rule__TerminalValue__Group_0__2__Impl : ( ( rule__TerminalValue__VariableAssignment_0_2 ) ) ;
    public final void rule__TerminalValue__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6683:1: ( ( ( rule__TerminalValue__VariableAssignment_0_2 ) ) )
            // InternalPagos.g:6684:1: ( ( rule__TerminalValue__VariableAssignment_0_2 ) )
            {
            // InternalPagos.g:6684:1: ( ( rule__TerminalValue__VariableAssignment_0_2 ) )
            // InternalPagos.g:6685:2: ( rule__TerminalValue__VariableAssignment_0_2 )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableAssignment_0_2()); 
            // InternalPagos.g:6686:2: ( rule__TerminalValue__VariableAssignment_0_2 )
            // InternalPagos.g:6686:3: rule__TerminalValue__VariableAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__VariableAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getVariableAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0__2__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0_1__0"
    // InternalPagos.g:6695:1: rule__TerminalValue__Group_0_1__0 : rule__TerminalValue__Group_0_1__0__Impl rule__TerminalValue__Group_0_1__1 ;
    public final void rule__TerminalValue__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6699:1: ( rule__TerminalValue__Group_0_1__0__Impl rule__TerminalValue__Group_0_1__1 )
            // InternalPagos.g:6700:2: rule__TerminalValue__Group_0_1__0__Impl rule__TerminalValue__Group_0_1__1
            {
            pushFollow(FOLLOW_44);
            rule__TerminalValue__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1__0"


    // $ANTLR start "rule__TerminalValue__Group_0_1__0__Impl"
    // InternalPagos.g:6707:1: rule__TerminalValue__Group_0_1__0__Impl : ( 'PA' ) ;
    public final void rule__TerminalValue__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6711:1: ( ( 'PA' ) )
            // InternalPagos.g:6712:1: ( 'PA' )
            {
            // InternalPagos.g:6712:1: ( 'PA' )
            // InternalPagos.g:6713:2: 'PA'
            {
             before(grammarAccess.getTerminalValueAccess().getPAKeyword_0_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getPAKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1__0__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0_1__1"
    // InternalPagos.g:6722:1: rule__TerminalValue__Group_0_1__1 : rule__TerminalValue__Group_0_1__1__Impl rule__TerminalValue__Group_0_1__2 ;
    public final void rule__TerminalValue__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6726:1: ( rule__TerminalValue__Group_0_1__1__Impl rule__TerminalValue__Group_0_1__2 )
            // InternalPagos.g:6727:2: rule__TerminalValue__Group_0_1__1__Impl rule__TerminalValue__Group_0_1__2
            {
            pushFollow(FOLLOW_5);
            rule__TerminalValue__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1__1"


    // $ANTLR start "rule__TerminalValue__Group_0_1__1__Impl"
    // InternalPagos.g:6734:1: rule__TerminalValue__Group_0_1__1__Impl : ( RULE_DOT ) ;
    public final void rule__TerminalValue__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6738:1: ( ( RULE_DOT ) )
            // InternalPagos.g:6739:1: ( RULE_DOT )
            {
            // InternalPagos.g:6739:1: ( RULE_DOT )
            // InternalPagos.g:6740:2: RULE_DOT
            {
             before(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_0_1_1()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1__1__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0_1__2"
    // InternalPagos.g:6749:1: rule__TerminalValue__Group_0_1__2 : rule__TerminalValue__Group_0_1__2__Impl rule__TerminalValue__Group_0_1__3 ;
    public final void rule__TerminalValue__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6753:1: ( rule__TerminalValue__Group_0_1__2__Impl rule__TerminalValue__Group_0_1__3 )
            // InternalPagos.g:6754:2: rule__TerminalValue__Group_0_1__2__Impl rule__TerminalValue__Group_0_1__3
            {
            pushFollow(FOLLOW_45);
            rule__TerminalValue__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1__2"


    // $ANTLR start "rule__TerminalValue__Group_0_1__2__Impl"
    // InternalPagos.g:6761:1: rule__TerminalValue__Group_0_1__2__Impl : ( ( rule__TerminalValue__ParentAssignment_0_1_2 ) ) ;
    public final void rule__TerminalValue__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6765:1: ( ( ( rule__TerminalValue__ParentAssignment_0_1_2 ) ) )
            // InternalPagos.g:6766:1: ( ( rule__TerminalValue__ParentAssignment_0_1_2 ) )
            {
            // InternalPagos.g:6766:1: ( ( rule__TerminalValue__ParentAssignment_0_1_2 ) )
            // InternalPagos.g:6767:2: ( rule__TerminalValue__ParentAssignment_0_1_2 )
            {
             before(grammarAccess.getTerminalValueAccess().getParentAssignment_0_1_2()); 
            // InternalPagos.g:6768:2: ( rule__TerminalValue__ParentAssignment_0_1_2 )
            // InternalPagos.g:6768:3: rule__TerminalValue__ParentAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__ParentAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getParentAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1__2__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0_1__3"
    // InternalPagos.g:6776:1: rule__TerminalValue__Group_0_1__3 : rule__TerminalValue__Group_0_1__3__Impl ;
    public final void rule__TerminalValue__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6780:1: ( rule__TerminalValue__Group_0_1__3__Impl )
            // InternalPagos.g:6781:2: rule__TerminalValue__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1__3"


    // $ANTLR start "rule__TerminalValue__Group_0_1__3__Impl"
    // InternalPagos.g:6787:1: rule__TerminalValue__Group_0_1__3__Impl : ( RULE_DASH ) ;
    public final void rule__TerminalValue__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6791:1: ( ( RULE_DASH ) )
            // InternalPagos.g:6792:1: ( RULE_DASH )
            {
            // InternalPagos.g:6792:1: ( RULE_DASH )
            // InternalPagos.g:6793:2: RULE_DASH
            {
             before(grammarAccess.getTerminalValueAccess().getDASHTerminalRuleCall_0_1_3()); 
            match(input,RULE_DASH,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDASHTerminalRuleCall_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_0_1__3__Impl"


    // $ANTLR start "rule__TerminalValue__Group_1__0"
    // InternalPagos.g:6803:1: rule__TerminalValue__Group_1__0 : rule__TerminalValue__Group_1__0__Impl rule__TerminalValue__Group_1__1 ;
    public final void rule__TerminalValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6807:1: ( rule__TerminalValue__Group_1__0__Impl rule__TerminalValue__Group_1__1 )
            // InternalPagos.g:6808:2: rule__TerminalValue__Group_1__0__Impl rule__TerminalValue__Group_1__1
            {
            pushFollow(FOLLOW_44);
            rule__TerminalValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1__0"


    // $ANTLR start "rule__TerminalValue__Group_1__0__Impl"
    // InternalPagos.g:6815:1: rule__TerminalValue__Group_1__0__Impl : ( 'SU' ) ;
    public final void rule__TerminalValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6819:1: ( ( 'SU' ) )
            // InternalPagos.g:6820:1: ( 'SU' )
            {
            // InternalPagos.g:6820:1: ( 'SU' )
            // InternalPagos.g:6821:2: 'SU'
            {
             before(grammarAccess.getTerminalValueAccess().getSUKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getSUKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1__0__Impl"


    // $ANTLR start "rule__TerminalValue__Group_1__1"
    // InternalPagos.g:6830:1: rule__TerminalValue__Group_1__1 : rule__TerminalValue__Group_1__1__Impl rule__TerminalValue__Group_1__2 ;
    public final void rule__TerminalValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6834:1: ( rule__TerminalValue__Group_1__1__Impl rule__TerminalValue__Group_1__2 )
            // InternalPagos.g:6835:2: rule__TerminalValue__Group_1__1__Impl rule__TerminalValue__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__TerminalValue__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1__1"


    // $ANTLR start "rule__TerminalValue__Group_1__1__Impl"
    // InternalPagos.g:6842:1: rule__TerminalValue__Group_1__1__Impl : ( RULE_DOT ) ;
    public final void rule__TerminalValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6846:1: ( ( RULE_DOT ) )
            // InternalPagos.g:6847:1: ( RULE_DOT )
            {
            // InternalPagos.g:6847:1: ( RULE_DOT )
            // InternalPagos.g:6848:2: RULE_DOT
            {
             before(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_1_1()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalValue__Group_1__2"
    // InternalPagos.g:6857:1: rule__TerminalValue__Group_1__2 : rule__TerminalValue__Group_1__2__Impl rule__TerminalValue__Group_1__3 ;
    public final void rule__TerminalValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6861:1: ( rule__TerminalValue__Group_1__2__Impl rule__TerminalValue__Group_1__3 )
            // InternalPagos.g:6862:2: rule__TerminalValue__Group_1__2__Impl rule__TerminalValue__Group_1__3
            {
            pushFollow(FOLLOW_45);
            rule__TerminalValue__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1__2"


    // $ANTLR start "rule__TerminalValue__Group_1__2__Impl"
    // InternalPagos.g:6869:1: rule__TerminalValue__Group_1__2__Impl : ( ( rule__TerminalValue__ParentAssignment_1_2 ) ) ;
    public final void rule__TerminalValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6873:1: ( ( ( rule__TerminalValue__ParentAssignment_1_2 ) ) )
            // InternalPagos.g:6874:1: ( ( rule__TerminalValue__ParentAssignment_1_2 ) )
            {
            // InternalPagos.g:6874:1: ( ( rule__TerminalValue__ParentAssignment_1_2 ) )
            // InternalPagos.g:6875:2: ( rule__TerminalValue__ParentAssignment_1_2 )
            {
             before(grammarAccess.getTerminalValueAccess().getParentAssignment_1_2()); 
            // InternalPagos.g:6876:2: ( rule__TerminalValue__ParentAssignment_1_2 )
            // InternalPagos.g:6876:3: rule__TerminalValue__ParentAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__ParentAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getParentAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1__2__Impl"


    // $ANTLR start "rule__TerminalValue__Group_1__3"
    // InternalPagos.g:6884:1: rule__TerminalValue__Group_1__3 : rule__TerminalValue__Group_1__3__Impl rule__TerminalValue__Group_1__4 ;
    public final void rule__TerminalValue__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6888:1: ( rule__TerminalValue__Group_1__3__Impl rule__TerminalValue__Group_1__4 )
            // InternalPagos.g:6889:2: rule__TerminalValue__Group_1__3__Impl rule__TerminalValue__Group_1__4
            {
            pushFollow(FOLLOW_5);
            rule__TerminalValue__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1__3"


    // $ANTLR start "rule__TerminalValue__Group_1__3__Impl"
    // InternalPagos.g:6896:1: rule__TerminalValue__Group_1__3__Impl : ( RULE_DASH ) ;
    public final void rule__TerminalValue__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6900:1: ( ( RULE_DASH ) )
            // InternalPagos.g:6901:1: ( RULE_DASH )
            {
            // InternalPagos.g:6901:1: ( RULE_DASH )
            // InternalPagos.g:6902:2: RULE_DASH
            {
             before(grammarAccess.getTerminalValueAccess().getDASHTerminalRuleCall_1_3()); 
            match(input,RULE_DASH,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDASHTerminalRuleCall_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1__3__Impl"


    // $ANTLR start "rule__TerminalValue__Group_1__4"
    // InternalPagos.g:6911:1: rule__TerminalValue__Group_1__4 : rule__TerminalValue__Group_1__4__Impl ;
    public final void rule__TerminalValue__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6915:1: ( rule__TerminalValue__Group_1__4__Impl )
            // InternalPagos.g:6916:2: rule__TerminalValue__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1__4"


    // $ANTLR start "rule__TerminalValue__Group_1__4__Impl"
    // InternalPagos.g:6922:1: rule__TerminalValue__Group_1__4__Impl : ( ( rule__TerminalValue__VariableAssignment_1_4 ) ) ;
    public final void rule__TerminalValue__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6926:1: ( ( ( rule__TerminalValue__VariableAssignment_1_4 ) ) )
            // InternalPagos.g:6927:1: ( ( rule__TerminalValue__VariableAssignment_1_4 ) )
            {
            // InternalPagos.g:6927:1: ( ( rule__TerminalValue__VariableAssignment_1_4 ) )
            // InternalPagos.g:6928:2: ( rule__TerminalValue__VariableAssignment_1_4 )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableAssignment_1_4()); 
            // InternalPagos.g:6929:2: ( rule__TerminalValue__VariableAssignment_1_4 )
            // InternalPagos.g:6929:3: rule__TerminalValue__VariableAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__VariableAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getVariableAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_1__4__Impl"


    // $ANTLR start "rule__TerminalValue__Group_2__0"
    // InternalPagos.g:6938:1: rule__TerminalValue__Group_2__0 : rule__TerminalValue__Group_2__0__Impl rule__TerminalValue__Group_2__1 ;
    public final void rule__TerminalValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6942:1: ( rule__TerminalValue__Group_2__0__Impl rule__TerminalValue__Group_2__1 )
            // InternalPagos.g:6943:2: rule__TerminalValue__Group_2__0__Impl rule__TerminalValue__Group_2__1
            {
            pushFollow(FOLLOW_44);
            rule__TerminalValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2__0"


    // $ANTLR start "rule__TerminalValue__Group_2__0__Impl"
    // InternalPagos.g:6950:1: rule__TerminalValue__Group_2__0__Impl : ( 'IT' ) ;
    public final void rule__TerminalValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6954:1: ( ( 'IT' ) )
            // InternalPagos.g:6955:1: ( 'IT' )
            {
            // InternalPagos.g:6955:1: ( 'IT' )
            // InternalPagos.g:6956:2: 'IT'
            {
             before(grammarAccess.getTerminalValueAccess().getITKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getITKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2__0__Impl"


    // $ANTLR start "rule__TerminalValue__Group_2__1"
    // InternalPagos.g:6965:1: rule__TerminalValue__Group_2__1 : rule__TerminalValue__Group_2__1__Impl rule__TerminalValue__Group_2__2 ;
    public final void rule__TerminalValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6969:1: ( rule__TerminalValue__Group_2__1__Impl rule__TerminalValue__Group_2__2 )
            // InternalPagos.g:6970:2: rule__TerminalValue__Group_2__1__Impl rule__TerminalValue__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__TerminalValue__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2__1"


    // $ANTLR start "rule__TerminalValue__Group_2__1__Impl"
    // InternalPagos.g:6977:1: rule__TerminalValue__Group_2__1__Impl : ( RULE_DOT ) ;
    public final void rule__TerminalValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6981:1: ( ( RULE_DOT ) )
            // InternalPagos.g:6982:1: ( RULE_DOT )
            {
            // InternalPagos.g:6982:1: ( RULE_DOT )
            // InternalPagos.g:6983:2: RULE_DOT
            {
             before(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_2_1()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2__1__Impl"


    // $ANTLR start "rule__TerminalValue__Group_2__2"
    // InternalPagos.g:6992:1: rule__TerminalValue__Group_2__2 : rule__TerminalValue__Group_2__2__Impl rule__TerminalValue__Group_2__3 ;
    public final void rule__TerminalValue__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6996:1: ( rule__TerminalValue__Group_2__2__Impl rule__TerminalValue__Group_2__3 )
            // InternalPagos.g:6997:2: rule__TerminalValue__Group_2__2__Impl rule__TerminalValue__Group_2__3
            {
            pushFollow(FOLLOW_45);
            rule__TerminalValue__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2__2"


    // $ANTLR start "rule__TerminalValue__Group_2__2__Impl"
    // InternalPagos.g:7004:1: rule__TerminalValue__Group_2__2__Impl : ( ( rule__TerminalValue__ParentAssignment_2_2 ) ) ;
    public final void rule__TerminalValue__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7008:1: ( ( ( rule__TerminalValue__ParentAssignment_2_2 ) ) )
            // InternalPagos.g:7009:1: ( ( rule__TerminalValue__ParentAssignment_2_2 ) )
            {
            // InternalPagos.g:7009:1: ( ( rule__TerminalValue__ParentAssignment_2_2 ) )
            // InternalPagos.g:7010:2: ( rule__TerminalValue__ParentAssignment_2_2 )
            {
             before(grammarAccess.getTerminalValueAccess().getParentAssignment_2_2()); 
            // InternalPagos.g:7011:2: ( rule__TerminalValue__ParentAssignment_2_2 )
            // InternalPagos.g:7011:3: rule__TerminalValue__ParentAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__ParentAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getParentAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2__2__Impl"


    // $ANTLR start "rule__TerminalValue__Group_2__3"
    // InternalPagos.g:7019:1: rule__TerminalValue__Group_2__3 : rule__TerminalValue__Group_2__3__Impl rule__TerminalValue__Group_2__4 ;
    public final void rule__TerminalValue__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7023:1: ( rule__TerminalValue__Group_2__3__Impl rule__TerminalValue__Group_2__4 )
            // InternalPagos.g:7024:2: rule__TerminalValue__Group_2__3__Impl rule__TerminalValue__Group_2__4
            {
            pushFollow(FOLLOW_5);
            rule__TerminalValue__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2__3"


    // $ANTLR start "rule__TerminalValue__Group_2__3__Impl"
    // InternalPagos.g:7031:1: rule__TerminalValue__Group_2__3__Impl : ( RULE_DASH ) ;
    public final void rule__TerminalValue__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7035:1: ( ( RULE_DASH ) )
            // InternalPagos.g:7036:1: ( RULE_DASH )
            {
            // InternalPagos.g:7036:1: ( RULE_DASH )
            // InternalPagos.g:7037:2: RULE_DASH
            {
             before(grammarAccess.getTerminalValueAccess().getDASHTerminalRuleCall_2_3()); 
            match(input,RULE_DASH,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getDASHTerminalRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2__3__Impl"


    // $ANTLR start "rule__TerminalValue__Group_2__4"
    // InternalPagos.g:7046:1: rule__TerminalValue__Group_2__4 : rule__TerminalValue__Group_2__4__Impl ;
    public final void rule__TerminalValue__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7050:1: ( rule__TerminalValue__Group_2__4__Impl )
            // InternalPagos.g:7051:2: rule__TerminalValue__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2__4"


    // $ANTLR start "rule__TerminalValue__Group_2__4__Impl"
    // InternalPagos.g:7057:1: rule__TerminalValue__Group_2__4__Impl : ( ( rule__TerminalValue__VariableAssignment_2_4 ) ) ;
    public final void rule__TerminalValue__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7061:1: ( ( ( rule__TerminalValue__VariableAssignment_2_4 ) ) )
            // InternalPagos.g:7062:1: ( ( rule__TerminalValue__VariableAssignment_2_4 ) )
            {
            // InternalPagos.g:7062:1: ( ( rule__TerminalValue__VariableAssignment_2_4 ) )
            // InternalPagos.g:7063:2: ( rule__TerminalValue__VariableAssignment_2_4 )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableAssignment_2_4()); 
            // InternalPagos.g:7064:2: ( rule__TerminalValue__VariableAssignment_2_4 )
            // InternalPagos.g:7064:3: rule__TerminalValue__VariableAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__VariableAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getVariableAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__Group_2__4__Impl"


    // $ANTLR start "rule__TerminalValue__Group_3__0"
    // InternalPagos.g:7073:1: rule__TerminalValue__Group_3__0 : rule__TerminalValue__Group_3__0__Impl rule__TerminalValue__Group_3__1 ;
    public final void rule__TerminalValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7077:1: ( rule__TerminalValue__Group_3__0__Impl rule__TerminalValue__Group_3__1 )
            // InternalPagos.g:7078:2: rule__TerminalValue__Group_3__0__Impl rule__TerminalValue__Group_3__1
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
    // InternalPagos.g:7085:1: rule__TerminalValue__Group_3__0__Impl : ( 'FU' ) ;
    public final void rule__TerminalValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7089:1: ( ( 'FU' ) )
            // InternalPagos.g:7090:1: ( 'FU' )
            {
            // InternalPagos.g:7090:1: ( 'FU' )
            // InternalPagos.g:7091:2: 'FU'
            {
             before(grammarAccess.getTerminalValueAccess().getFUKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalPagos.g:7100:1: rule__TerminalValue__Group_3__1 : rule__TerminalValue__Group_3__1__Impl rule__TerminalValue__Group_3__2 ;
    public final void rule__TerminalValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7104:1: ( rule__TerminalValue__Group_3__1__Impl rule__TerminalValue__Group_3__2 )
            // InternalPagos.g:7105:2: rule__TerminalValue__Group_3__1__Impl rule__TerminalValue__Group_3__2
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
    // InternalPagos.g:7112:1: rule__TerminalValue__Group_3__1__Impl : ( RULE_DOT ) ;
    public final void rule__TerminalValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7116:1: ( ( RULE_DOT ) )
            // InternalPagos.g:7117:1: ( RULE_DOT )
            {
            // InternalPagos.g:7117:1: ( RULE_DOT )
            // InternalPagos.g:7118:2: RULE_DOT
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
    // InternalPagos.g:7127:1: rule__TerminalValue__Group_3__2 : rule__TerminalValue__Group_3__2__Impl ;
    public final void rule__TerminalValue__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7131:1: ( rule__TerminalValue__Group_3__2__Impl )
            // InternalPagos.g:7132:2: rule__TerminalValue__Group_3__2__Impl
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
    // InternalPagos.g:7138:1: rule__TerminalValue__Group_3__2__Impl : ( ( rule__TerminalValue__ParentAssignment_3_2 ) ) ;
    public final void rule__TerminalValue__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7142:1: ( ( ( rule__TerminalValue__ParentAssignment_3_2 ) ) )
            // InternalPagos.g:7143:1: ( ( rule__TerminalValue__ParentAssignment_3_2 ) )
            {
            // InternalPagos.g:7143:1: ( ( rule__TerminalValue__ParentAssignment_3_2 ) )
            // InternalPagos.g:7144:2: ( rule__TerminalValue__ParentAssignment_3_2 )
            {
             before(grammarAccess.getTerminalValueAccess().getParentAssignment_3_2()); 
            // InternalPagos.g:7145:2: ( rule__TerminalValue__ParentAssignment_3_2 )
            // InternalPagos.g:7145:3: rule__TerminalValue__ParentAssignment_3_2
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
    // InternalPagos.g:7154:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7158:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalPagos.g:7159:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalPagos.g:7166:1: rule__EDouble__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7170:1: ( ( ( RULE_INT )? ) )
            // InternalPagos.g:7171:1: ( ( RULE_INT )? )
            {
            // InternalPagos.g:7171:1: ( ( RULE_INT )? )
            // InternalPagos.g:7172:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            // InternalPagos.g:7173:2: ( RULE_INT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPagos.g:7173:3: RULE_INT
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
    // InternalPagos.g:7181:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7185:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalPagos.g:7186:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalPagos.g:7193:1: rule__EDouble__Group__1__Impl : ( RULE_DOT ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7197:1: ( ( RULE_DOT ) )
            // InternalPagos.g:7198:1: ( RULE_DOT )
            {
            // InternalPagos.g:7198:1: ( RULE_DOT )
            // InternalPagos.g:7199:2: RULE_DOT
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
    // InternalPagos.g:7208:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7212:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalPagos.g:7213:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalPagos.g:7220:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7224:1: ( ( RULE_INT ) )
            // InternalPagos.g:7225:1: ( RULE_INT )
            {
            // InternalPagos.g:7225:1: ( RULE_INT )
            // InternalPagos.g:7226:2: RULE_INT
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
    // InternalPagos.g:7235:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7239:1: ( rule__EDouble__Group__3__Impl )
            // InternalPagos.g:7240:2: rule__EDouble__Group__3__Impl
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
    // InternalPagos.g:7246:1: rule__EDouble__Group__3__Impl : ( ( rule__EDouble__Group_3__0 )? ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7250:1: ( ( ( rule__EDouble__Group_3__0 )? ) )
            // InternalPagos.g:7251:1: ( ( rule__EDouble__Group_3__0 )? )
            {
            // InternalPagos.g:7251:1: ( ( rule__EDouble__Group_3__0 )? )
            // InternalPagos.g:7252:2: ( rule__EDouble__Group_3__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_3()); 
            // InternalPagos.g:7253:2: ( rule__EDouble__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=30 && LA34_0<=31)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPagos.g:7253:3: rule__EDouble__Group_3__0
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
    // InternalPagos.g:7262:1: rule__EDouble__Group_3__0 : rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 ;
    public final void rule__EDouble__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7266:1: ( rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 )
            // InternalPagos.g:7267:2: rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalPagos.g:7274:1: rule__EDouble__Group_3__0__Impl : ( ( rule__EDouble__Alternatives_3_0 ) ) ;
    public final void rule__EDouble__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7278:1: ( ( ( rule__EDouble__Alternatives_3_0 ) ) )
            // InternalPagos.g:7279:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            {
            // InternalPagos.g:7279:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            // InternalPagos.g:7280:2: ( rule__EDouble__Alternatives_3_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 
            // InternalPagos.g:7281:2: ( rule__EDouble__Alternatives_3_0 )
            // InternalPagos.g:7281:3: rule__EDouble__Alternatives_3_0
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
    // InternalPagos.g:7289:1: rule__EDouble__Group_3__1 : rule__EDouble__Group_3__1__Impl ;
    public final void rule__EDouble__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7293:1: ( rule__EDouble__Group_3__1__Impl )
            // InternalPagos.g:7294:2: rule__EDouble__Group_3__1__Impl
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
    // InternalPagos.g:7300:1: rule__EDouble__Group_3__1__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7304:1: ( ( RULE_INT ) )
            // InternalPagos.g:7305:1: ( RULE_INT )
            {
            // InternalPagos.g:7305:1: ( RULE_INT )
            // InternalPagos.g:7306:2: RULE_INT
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
    // InternalPagos.g:7316:1: rule__Application__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7320:1: ( ( RULE_ID ) )
            // InternalPagos.g:7321:2: ( RULE_ID )
            {
            // InternalPagos.g:7321:2: ( RULE_ID )
            // InternalPagos.g:7322:3: RULE_ID
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
    // InternalPagos.g:7331:1: rule__Application__IntermediaryAssignment_7 : ( ruleIntermediary ) ;
    public final void rule__Application__IntermediaryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7335:1: ( ( ruleIntermediary ) )
            // InternalPagos.g:7336:2: ( ruleIntermediary )
            {
            // InternalPagos.g:7336:2: ( ruleIntermediary )
            // InternalPagos.g:7337:3: ruleIntermediary
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
    // InternalPagos.g:7346:1: rule__Intermediary__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Intermediary__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7350:1: ( ( RULE_ID ) )
            // InternalPagos.g:7351:2: ( RULE_ID )
            {
            // InternalPagos.g:7351:2: ( RULE_ID )
            // InternalPagos.g:7352:3: RULE_ID
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
    // InternalPagos.g:7361:1: rule__Intermediary__SuperentitiesAssignment_9 : ( ruleSuperEntity ) ;
    public final void rule__Intermediary__SuperentitiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7365:1: ( ( ruleSuperEntity ) )
            // InternalPagos.g:7366:2: ( ruleSuperEntity )
            {
            // InternalPagos.g:7366:2: ( ruleSuperEntity )
            // InternalPagos.g:7367:3: ruleSuperEntity
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
    // InternalPagos.g:7376:1: rule__Intermediary__SuperentitiesAssignment_10_1 : ( ruleSuperEntity ) ;
    public final void rule__Intermediary__SuperentitiesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7380:1: ( ( ruleSuperEntity ) )
            // InternalPagos.g:7381:2: ( ruleSuperEntity )
            {
            // InternalPagos.g:7381:2: ( ruleSuperEntity )
            // InternalPagos.g:7382:3: ruleSuperEntity
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
    // InternalPagos.g:7391:1: rule__SuperEntity__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__SuperEntity__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7395:1: ( ( RULE_ID ) )
            // InternalPagos.g:7396:2: ( RULE_ID )
            {
            // InternalPagos.g:7396:2: ( RULE_ID )
            // InternalPagos.g:7397:3: RULE_ID
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
    // InternalPagos.g:7406:1: rule__SuperEntity__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__SuperEntity__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7410:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7411:2: ( RULE_STRING )
            {
            // InternalPagos.g:7411:2: ( RULE_STRING )
            // InternalPagos.g:7412:3: RULE_STRING
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
    // InternalPagos.g:7421:1: rule__SuperEntity__AttListsAssignment_13 : ( ruleBusinessAttribute ) ;
    public final void rule__SuperEntity__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7425:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7426:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7426:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7427:3: ruleBusinessAttribute
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
    // InternalPagos.g:7436:1: rule__SuperEntity__AttListsAssignment_14_1 : ( ruleBusinessAttribute ) ;
    public final void rule__SuperEntity__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7440:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7441:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7441:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7442:3: ruleBusinessAttribute
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
    // InternalPagos.g:7451:1: rule__SuperEntity__ParticipantsAssignment_20 : ( ruleParticipant ) ;
    public final void rule__SuperEntity__ParticipantsAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7455:1: ( ( ruleParticipant ) )
            // InternalPagos.g:7456:2: ( ruleParticipant )
            {
            // InternalPagos.g:7456:2: ( ruleParticipant )
            // InternalPagos.g:7457:3: ruleParticipant
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
    // InternalPagos.g:7466:1: rule__SuperEntity__ParticipantsAssignment_21_1 : ( ruleParticipant ) ;
    public final void rule__SuperEntity__ParticipantsAssignment_21_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7470:1: ( ( ruleParticipant ) )
            // InternalPagos.g:7471:2: ( ruleParticipant )
            {
            // InternalPagos.g:7471:2: ( ruleParticipant )
            // InternalPagos.g:7472:3: ruleParticipant
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
    // InternalPagos.g:7481:1: rule__Participant__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Participant__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7485:1: ( ( RULE_ID ) )
            // InternalPagos.g:7486:2: ( RULE_ID )
            {
            // InternalPagos.g:7486:2: ( RULE_ID )
            // InternalPagos.g:7487:3: RULE_ID
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
    // InternalPagos.g:7496:1: rule__Participant__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Participant__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7500:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7501:2: ( RULE_STRING )
            {
            // InternalPagos.g:7501:2: ( RULE_STRING )
            // InternalPagos.g:7502:3: RULE_STRING
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
    // InternalPagos.g:7511:1: rule__Participant__AttListsAssignment_13 : ( ruleBusinessAttribute ) ;
    public final void rule__Participant__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7515:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7516:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7516:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7517:3: ruleBusinessAttribute
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
    // InternalPagos.g:7526:1: rule__Participant__AttListsAssignment_14_1 : ( ruleBusinessAttribute ) ;
    public final void rule__Participant__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7530:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7531:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7531:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7532:3: ruleBusinessAttribute
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
    // InternalPagos.g:7541:1: rule__Participant__TemplatesFormsAssignment_17_4 : ( ruleInformationTemplate ) ;
    public final void rule__Participant__TemplatesFormsAssignment_17_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7545:1: ( ( ruleInformationTemplate ) )
            // InternalPagos.g:7546:2: ( ruleInformationTemplate )
            {
            // InternalPagos.g:7546:2: ( ruleInformationTemplate )
            // InternalPagos.g:7547:3: ruleInformationTemplate
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
    // InternalPagos.g:7556:1: rule__Participant__TemplatesFormsAssignment_17_5_1 : ( ruleInformationTemplate ) ;
    public final void rule__Participant__TemplatesFormsAssignment_17_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7560:1: ( ( ruleInformationTemplate ) )
            // InternalPagos.g:7561:2: ( ruleInformationTemplate )
            {
            // InternalPagos.g:7561:2: ( ruleInformationTemplate )
            // InternalPagos.g:7562:3: ruleInformationTemplate
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
    // InternalPagos.g:7571:1: rule__Provider__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Provider__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7575:1: ( ( RULE_ID ) )
            // InternalPagos.g:7576:2: ( RULE_ID )
            {
            // InternalPagos.g:7576:2: ( RULE_ID )
            // InternalPagos.g:7577:3: RULE_ID
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
    // InternalPagos.g:7586:1: rule__Provider__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Provider__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7590:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7591:2: ( RULE_STRING )
            {
            // InternalPagos.g:7591:2: ( RULE_STRING )
            // InternalPagos.g:7592:3: RULE_STRING
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
    // InternalPagos.g:7601:1: rule__Provider__AttListsAssignment_13 : ( ruleBusinessAttribute ) ;
    public final void rule__Provider__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7605:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7606:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7606:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7607:3: ruleBusinessAttribute
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
    // InternalPagos.g:7616:1: rule__Provider__AttListsAssignment_14_1 : ( ruleBusinessAttribute ) ;
    public final void rule__Provider__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7620:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7621:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7621:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7622:3: ruleBusinessAttribute
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
    // InternalPagos.g:7631:1: rule__InformationTemplate__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__InformationTemplate__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7635:1: ( ( RULE_ID ) )
            // InternalPagos.g:7636:2: ( RULE_ID )
            {
            // InternalPagos.g:7636:2: ( RULE_ID )
            // InternalPagos.g:7637:3: RULE_ID
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
    // InternalPagos.g:7646:1: rule__InformationTemplate__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__InformationTemplate__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7650:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7651:2: ( RULE_STRING )
            {
            // InternalPagos.g:7651:2: ( RULE_STRING )
            // InternalPagos.g:7652:3: RULE_STRING
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
    // InternalPagos.g:7661:1: rule__InformationTemplate__AttListsAssignment_13 : ( ruleBusinessAttribute ) ;
    public final void rule__InformationTemplate__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7665:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7666:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7666:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7667:3: ruleBusinessAttribute
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
    // InternalPagos.g:7676:1: rule__InformationTemplate__AttListsAssignment_14_1 : ( ruleBusinessAttribute ) ;
    public final void rule__InformationTemplate__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7680:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7681:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7681:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7682:3: ruleBusinessAttribute
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
    // InternalPagos.g:7691:1: rule__InformationTemplate__TemplateCalcAssignment_17_2 : ( RULE_ID ) ;
    public final void rule__InformationTemplate__TemplateCalcAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7695:1: ( ( RULE_ID ) )
            // InternalPagos.g:7696:2: ( RULE_ID )
            {
            // InternalPagos.g:7696:2: ( RULE_ID )
            // InternalPagos.g:7697:3: RULE_ID
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
    // InternalPagos.g:7706:1: rule__InformationTemplate__TemplatesAssignment_17_5 : ( ruleCalculationTemplate ) ;
    public final void rule__InformationTemplate__TemplatesAssignment_17_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7710:1: ( ( ruleCalculationTemplate ) )
            // InternalPagos.g:7711:2: ( ruleCalculationTemplate )
            {
            // InternalPagos.g:7711:2: ( ruleCalculationTemplate )
            // InternalPagos.g:7712:3: ruleCalculationTemplate
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
    // InternalPagos.g:7721:1: rule__InformationTemplate__TemplatesAssignment_17_6_1 : ( ruleCalculationTemplate ) ;
    public final void rule__InformationTemplate__TemplatesAssignment_17_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7725:1: ( ( ruleCalculationTemplate ) )
            // InternalPagos.g:7726:2: ( ruleCalculationTemplate )
            {
            // InternalPagos.g:7726:2: ( ruleCalculationTemplate )
            // InternalPagos.g:7727:3: ruleCalculationTemplate
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
    // InternalPagos.g:7736:1: rule__InformationTemplate__ProvidersAssignment_18_4 : ( ruleProvider ) ;
    public final void rule__InformationTemplate__ProvidersAssignment_18_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7740:1: ( ( ruleProvider ) )
            // InternalPagos.g:7741:2: ( ruleProvider )
            {
            // InternalPagos.g:7741:2: ( ruleProvider )
            // InternalPagos.g:7742:3: ruleProvider
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
    // InternalPagos.g:7751:1: rule__InformationTemplate__ProvidersAssignment_18_5_1 : ( ruleProvider ) ;
    public final void rule__InformationTemplate__ProvidersAssignment_18_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7755:1: ( ( ruleProvider ) )
            // InternalPagos.g:7756:2: ( ruleProvider )
            {
            // InternalPagos.g:7756:2: ( ruleProvider )
            // InternalPagos.g:7757:3: ruleProvider
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
    // InternalPagos.g:7766:1: rule__CalculationTemplate__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__CalculationTemplate__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7770:1: ( ( RULE_ID ) )
            // InternalPagos.g:7771:2: ( RULE_ID )
            {
            // InternalPagos.g:7771:2: ( RULE_ID )
            // InternalPagos.g:7772:3: RULE_ID
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
    // InternalPagos.g:7781:1: rule__CalculationTemplate__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__CalculationTemplate__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7785:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7786:2: ( RULE_STRING )
            {
            // InternalPagos.g:7786:2: ( RULE_STRING )
            // InternalPagos.g:7787:3: RULE_STRING
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
    // InternalPagos.g:7796:1: rule__CalculationTemplate__AttListsAssignment_9_4 : ( ruleBusinessAttribute ) ;
    public final void rule__CalculationTemplate__AttListsAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7800:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7801:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7801:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7802:3: ruleBusinessAttribute
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
    // InternalPagos.g:7811:1: rule__CalculationTemplate__AttListsAssignment_9_5_1 : ( ruleBusinessAttribute ) ;
    public final void rule__CalculationTemplate__AttListsAssignment_9_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7815:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7816:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7816:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7817:3: ruleBusinessAttribute
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
    // InternalPagos.g:7826:1: rule__CalculationTemplate__FormulasAssignment_13 : ( ruleFormula ) ;
    public final void rule__CalculationTemplate__FormulasAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7830:1: ( ( ruleFormula ) )
            // InternalPagos.g:7831:2: ( ruleFormula )
            {
            // InternalPagos.g:7831:2: ( ruleFormula )
            // InternalPagos.g:7832:3: ruleFormula
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
    // InternalPagos.g:7841:1: rule__Formula__FormulaBodyAssignment_0_1 : ( ruleIfBlock ) ;
    public final void rule__Formula__FormulaBodyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7845:1: ( ( ruleIfBlock ) )
            // InternalPagos.g:7846:2: ( ruleIfBlock )
            {
            // InternalPagos.g:7846:2: ( ruleIfBlock )
            // InternalPagos.g:7847:3: ruleIfBlock
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
    // InternalPagos.g:7856:1: rule__Formula__FormulaReturnAssignment_1 : ( ruleReturnBlock ) ;
    public final void rule__Formula__FormulaReturnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7860:1: ( ( ruleReturnBlock ) )
            // InternalPagos.g:7861:2: ( ruleReturnBlock )
            {
            // InternalPagos.g:7861:2: ( ruleReturnBlock )
            // InternalPagos.g:7862:3: ruleReturnBlock
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
    // InternalPagos.g:7871:1: rule__IfBlock__IfSentenceAssignment_1 : ( ruleIfCondition ) ;
    public final void rule__IfBlock__IfSentenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7875:1: ( ( ruleIfCondition ) )
            // InternalPagos.g:7876:2: ( ruleIfCondition )
            {
            // InternalPagos.g:7876:2: ( ruleIfCondition )
            // InternalPagos.g:7877:3: ruleIfCondition
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
    // InternalPagos.g:7886:1: rule__IfBlock__ElseSentenceAssignment_2_1 : ( ruleElseSegment ) ;
    public final void rule__IfBlock__ElseSentenceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7890:1: ( ( ruleElseSegment ) )
            // InternalPagos.g:7891:2: ( ruleElseSegment )
            {
            // InternalPagos.g:7891:2: ( ruleElseSegment )
            // InternalPagos.g:7892:3: ruleElseSegment
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
    // InternalPagos.g:7901:1: rule__IfCondition__LogExpAssignment_3 : ( ruleExpresionLogica ) ;
    public final void rule__IfCondition__LogExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7905:1: ( ( ruleExpresionLogica ) )
            // InternalPagos.g:7906:2: ( ruleExpresionLogica )
            {
            // InternalPagos.g:7906:2: ( ruleExpresionLogica )
            // InternalPagos.g:7907:3: ruleExpresionLogica
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
    // InternalPagos.g:7916:1: rule__IfCondition__FormulaReturnAssignment_7 : ( ruleReturnBlock ) ;
    public final void rule__IfCondition__FormulaReturnAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7920:1: ( ( ruleReturnBlock ) )
            // InternalPagos.g:7921:2: ( ruleReturnBlock )
            {
            // InternalPagos.g:7921:2: ( ruleReturnBlock )
            // InternalPagos.g:7922:3: ruleReturnBlock
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
    // InternalPagos.g:7931:1: rule__ElseSegment__IfSentenceAssignment_2 : ( ruleFormula ) ;
    public final void rule__ElseSegment__IfSentenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7935:1: ( ( ruleFormula ) )
            // InternalPagos.g:7936:2: ( ruleFormula )
            {
            // InternalPagos.g:7936:2: ( ruleFormula )
            // InternalPagos.g:7937:3: ruleFormula
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
    // InternalPagos.g:7946:1: rule__ReturnBlock__ExpressionAssignment_3 : ( ruleAdicion ) ;
    public final void rule__ReturnBlock__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7950:1: ( ( ruleAdicion ) )
            // InternalPagos.g:7951:2: ( ruleAdicion )
            {
            // InternalPagos.g:7951:2: ( ruleAdicion )
            // InternalPagos.g:7952:3: ruleAdicion
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
    // InternalPagos.g:7961:1: rule__ExpresionLogica__VariableAssignment_0 : ( ruleTerminalValue ) ;
    public final void rule__ExpresionLogica__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7965:1: ( ( ruleTerminalValue ) )
            // InternalPagos.g:7966:2: ( ruleTerminalValue )
            {
            // InternalPagos.g:7966:2: ( ruleTerminalValue )
            // InternalPagos.g:7967:3: ruleTerminalValue
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
    // InternalPagos.g:7976:1: rule__ExpresionLogica__LogOperAssignment_1_0 : ( RULE_OPERADORLOGICO ) ;
    public final void rule__ExpresionLogica__LogOperAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7980:1: ( ( RULE_OPERADORLOGICO ) )
            // InternalPagos.g:7981:2: ( RULE_OPERADORLOGICO )
            {
            // InternalPagos.g:7981:2: ( RULE_OPERADORLOGICO )
            // InternalPagos.g:7982:3: RULE_OPERADORLOGICO
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
    // InternalPagos.g:7991:1: rule__ExpresionLogica__Variable2Assignment_1_1_0 : ( ruleTerminalValue ) ;
    public final void rule__ExpresionLogica__Variable2Assignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7995:1: ( ( ruleTerminalValue ) )
            // InternalPagos.g:7996:2: ( ruleTerminalValue )
            {
            // InternalPagos.g:7996:2: ( ruleTerminalValue )
            // InternalPagos.g:7997:3: ruleTerminalValue
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
    // InternalPagos.g:8006:1: rule__ExpresionLogica__LiteralAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__ExpresionLogica__LiteralAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8010:1: ( ( RULE_STRING ) )
            // InternalPagos.g:8011:2: ( RULE_STRING )
            {
            // InternalPagos.g:8011:2: ( RULE_STRING )
            // InternalPagos.g:8012:3: RULE_STRING
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
    // InternalPagos.g:8021:1: rule__ExpresionLogica__ConOperAssignment_2_0 : ( RULE_LOGICALCONN ) ;
    public final void rule__ExpresionLogica__ConOperAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8025:1: ( ( RULE_LOGICALCONN ) )
            // InternalPagos.g:8026:2: ( RULE_LOGICALCONN )
            {
            // InternalPagos.g:8026:2: ( RULE_LOGICALCONN )
            // InternalPagos.g:8027:3: RULE_LOGICALCONN
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
    // InternalPagos.g:8036:1: rule__ExpresionLogica__ExpAssignment_2_1 : ( ruleExpresionLogica ) ;
    public final void rule__ExpresionLogica__ExpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8040:1: ( ( ruleExpresionLogica ) )
            // InternalPagos.g:8041:2: ( ruleExpresionLogica )
            {
            // InternalPagos.g:8041:2: ( ruleExpresionLogica )
            // InternalPagos.g:8042:3: ruleExpresionLogica
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
    // InternalPagos.g:8051:1: rule__Adicion__OperatorAssignment_1_1 : ( RULE_ADDOP ) ;
    public final void rule__Adicion__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8055:1: ( ( RULE_ADDOP ) )
            // InternalPagos.g:8056:2: ( RULE_ADDOP )
            {
            // InternalPagos.g:8056:2: ( RULE_ADDOP )
            // InternalPagos.g:8057:3: RULE_ADDOP
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
    // InternalPagos.g:8066:1: rule__Adicion__RexpAssignment_1_2 : ( ruleMultiplicacion ) ;
    public final void rule__Adicion__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8070:1: ( ( ruleMultiplicacion ) )
            // InternalPagos.g:8071:2: ( ruleMultiplicacion )
            {
            // InternalPagos.g:8071:2: ( ruleMultiplicacion )
            // InternalPagos.g:8072:3: ruleMultiplicacion
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
    // InternalPagos.g:8081:1: rule__Multiplicacion__OperatorAssignment_1_1 : ( RULE_MULTOP ) ;
    public final void rule__Multiplicacion__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8085:1: ( ( RULE_MULTOP ) )
            // InternalPagos.g:8086:2: ( RULE_MULTOP )
            {
            // InternalPagos.g:8086:2: ( RULE_MULTOP )
            // InternalPagos.g:8087:3: RULE_MULTOP
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
    // InternalPagos.g:8096:1: rule__Multiplicacion__RexpAssignment_1_2 : ( ruleSigleExp ) ;
    public final void rule__Multiplicacion__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8100:1: ( ( ruleSigleExp ) )
            // InternalPagos.g:8101:2: ( ruleSigleExp )
            {
            // InternalPagos.g:8101:2: ( ruleSigleExp )
            // InternalPagos.g:8102:3: ruleSigleExp
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
    // InternalPagos.g:8111:1: rule__BusinessAttribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8115:1: ( ( RULE_ID ) )
            // InternalPagos.g:8116:2: ( RULE_ID )
            {
            // InternalPagos.g:8116:2: ( RULE_ID )
            // InternalPagos.g:8117:3: RULE_ID
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
    // InternalPagos.g:8126:1: rule__BusinessAttribute__TypeAssignment_4 : ( RULE_TYPE ) ;
    public final void rule__BusinessAttribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8130:1: ( ( RULE_TYPE ) )
            // InternalPagos.g:8131:2: ( RULE_TYPE )
            {
            // InternalPagos.g:8131:2: ( RULE_TYPE )
            // InternalPagos.g:8132:3: RULE_TYPE
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
    // InternalPagos.g:8141:1: rule__BusinessAttribute__ExpAssignment_5_1 : ( ruleAdicion ) ;
    public final void rule__BusinessAttribute__ExpAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8145:1: ( ( ruleAdicion ) )
            // InternalPagos.g:8146:2: ( ruleAdicion )
            {
            // InternalPagos.g:8146:2: ( ruleAdicion )
            // InternalPagos.g:8147:3: ruleAdicion
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
    // InternalPagos.g:8156:1: rule__BusinessAttribute__IsIndexAssignment_6 : ( RULE_INDEX ) ;
    public final void rule__BusinessAttribute__IsIndexAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8160:1: ( ( RULE_INDEX ) )
            // InternalPagos.g:8161:2: ( RULE_INDEX )
            {
            // InternalPagos.g:8161:2: ( RULE_INDEX )
            // InternalPagos.g:8162:3: RULE_INDEX
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


    // $ANTLR start "rule__TerminalValue__ParentAssignment_0_1_2"
    // InternalPagos.g:8171:1: rule__TerminalValue__ParentAssignment_0_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__ParentAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8175:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8176:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8176:2: ( ( RULE_ID ) )
            // InternalPagos.g:8177:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getParentParticipantCrossReference_0_1_2_0()); 
            // InternalPagos.g:8178:3: ( RULE_ID )
            // InternalPagos.g:8179:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getParentParticipantIDTerminalRuleCall_0_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getParentParticipantIDTerminalRuleCall_0_1_2_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getParentParticipantCrossReference_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__ParentAssignment_0_1_2"


    // $ANTLR start "rule__TerminalValue__VariableAssignment_0_2"
    // InternalPagos.g:8190:1: rule__TerminalValue__VariableAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__VariableAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8194:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8195:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8195:2: ( ( RULE_ID ) )
            // InternalPagos.g:8196:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_0_2_0()); 
            // InternalPagos.g:8197:3: ( RULE_ID )
            // InternalPagos.g:8198:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__VariableAssignment_0_2"


    // $ANTLR start "rule__TerminalValue__ParentAssignment_1_2"
    // InternalPagos.g:8209:1: rule__TerminalValue__ParentAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__ParentAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8213:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8214:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8214:2: ( ( RULE_ID ) )
            // InternalPagos.g:8215:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getParentSuperEntityCrossReference_1_2_0()); 
            // InternalPagos.g:8216:3: ( RULE_ID )
            // InternalPagos.g:8217:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getParentSuperEntityIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getParentSuperEntityIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getParentSuperEntityCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__ParentAssignment_1_2"


    // $ANTLR start "rule__TerminalValue__VariableAssignment_1_4"
    // InternalPagos.g:8228:1: rule__TerminalValue__VariableAssignment_1_4 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__VariableAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8232:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8233:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8233:2: ( ( RULE_ID ) )
            // InternalPagos.g:8234:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_1_4_0()); 
            // InternalPagos.g:8235:3: ( RULE_ID )
            // InternalPagos.g:8236:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeIDTerminalRuleCall_1_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeIDTerminalRuleCall_1_4_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__VariableAssignment_1_4"


    // $ANTLR start "rule__TerminalValue__ParentAssignment_2_2"
    // InternalPagos.g:8247:1: rule__TerminalValue__ParentAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__ParentAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8251:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8252:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8252:2: ( ( RULE_ID ) )
            // InternalPagos.g:8253:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getParentInformationTemplateCrossReference_2_2_0()); 
            // InternalPagos.g:8254:3: ( RULE_ID )
            // InternalPagos.g:8255:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getParentInformationTemplateIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getParentInformationTemplateIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getParentInformationTemplateCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__ParentAssignment_2_2"


    // $ANTLR start "rule__TerminalValue__VariableAssignment_2_4"
    // InternalPagos.g:8266:1: rule__TerminalValue__VariableAssignment_2_4 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__VariableAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8270:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8271:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8271:2: ( ( RULE_ID ) )
            // InternalPagos.g:8272:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_2_4_0()); 
            // InternalPagos.g:8273:3: ( RULE_ID )
            // InternalPagos.g:8274:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeIDTerminalRuleCall_2_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeIDTerminalRuleCall_2_4_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__VariableAssignment_2_4"


    // $ANTLR start "rule__TerminalValue__ParentAssignment_3_2"
    // InternalPagos.g:8285:1: rule__TerminalValue__ParentAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__ParentAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8289:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8290:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8290:2: ( ( RULE_ID ) )
            // InternalPagos.g:8291:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getParentCalculationTemplateCrossReference_3_2_0()); 
            // InternalPagos.g:8292:3: ( RULE_ID )
            // InternalPagos.g:8293:4: RULE_ID
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
    // InternalPagos.g:8304:1: rule__TerminalValue__ValorAssignment_4 : ( ruleNumber ) ;
    public final void rule__TerminalValue__ValorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8308:1: ( ( ruleNumber ) )
            // InternalPagos.g:8309:2: ( ruleNumber )
            {
            // InternalPagos.g:8309:2: ( ruleNumber )
            // InternalPagos.g:8310:3: ruleNumber
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


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\3\16\uffff";
    static final String dfa_3s = "\1\4\16\uffff";
    static final String dfa_4s = "\1\62\16\uffff";
    static final String dfa_5s = "\1\uffff\1\1\12\2\1\3\1\4\1\5";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\16\3\uffff\1\7\1\uffff\1\13\4\uffff\1\16\1\uffff\1\1\1\uffff\1\11\1\12\1\5\1\4\1\uffff\1\10\24\uffff\1\6\1\uffff\1\1\1\2\1\14\1\15",
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

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "640:1: rule__TerminalValue__Alternatives : ( ( ( rule__TerminalValue__Group_0__0 ) ) | ( ( rule__TerminalValue__Group_1__0 )? ) | ( ( rule__TerminalValue__Group_2__0 )? ) | ( ( rule__TerminalValue__Group_3__0 )? ) | ( ( rule__TerminalValue__ValorAssignment_4 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0007800000028010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0007900000028010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0007800000068010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400001000100L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00000000C0000000L});

}