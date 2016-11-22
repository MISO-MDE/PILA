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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_LBRACE", "RULE_COLON", "RULE_COMMA", "RULE_RBRACE", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_ELSE", "RULE_IF", "RULE_THEN", "RULE_RETURN", "RULE_LOGICALCONN", "RULE_ID", "RULE_STRING", "RULE_OPERADORLOGICO", "RULE_ADDOP", "RULE_MULTOP", "RULE_TYPE", "RULE_DASH", "RULE_STR_ESC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'name'", "'intermediary'", "'superentities'", "'description'", "'attributes'", "'entities'", "'InformationTemplate'", "'FormAttributes'", "'calculationtemplates'", "'providers'", "'calculationattributes'", "'calculationrules'", "'('", "')'", "':='", "'.'"
    };
    public static final int RULE_RETURN=14;
    public static final int RULE_ID=16;
    public static final int RULE_COMMA=7;
    public static final int RULE_THEN=13;
    public static final int RULE_COLON=6;
    public static final int RULE_LOGICALCONN=15;
    public static final int RULE_TYPE=21;
    public static final int RULE_STR_ESC=23;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=24;
    public static final int RULE_ELSE=11;
    public static final int RULE_LBRACKET=9;
    public static final int RULE_STRING=17;
    public static final int RULE_SL_COMMENT=25;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_DASH=22;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_IF=12;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_LBRACE=5;
    public static final int RULE_WS=26;
    public static final int RULE_OPERADORLOGICO=18;
    public static final int RULE_ADDOP=19;
    public static final int RULE_ANY_OTHER=27;
    public static final int RULE_RBRACE=8;
    public static final int T__44=44;
    public static final int RULE_MULTOP=20;
    public static final int T__45=45;
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

            if ( (LA2_0==RULE_INT||LA2_0==RULE_ID||LA2_0==45) ) {
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

            if ( (LA3_0==RULE_INT||LA3_0==RULE_ID||LA3_0==45) ) {
                alt3=1;
            }
            else if ( (LA3_0==42) ) {
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
    // InternalPagos.g:640:1: rule__TerminalValue__Alternatives : ( ( ( rule__TerminalValue__Group_0__0 ) ) | ( ( rule__TerminalValue__ValorAssignment_1 ) ) );
    public final void rule__TerminalValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:644:1: ( ( ( rule__TerminalValue__Group_0__0 ) ) | ( ( rule__TerminalValue__ValorAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT||LA4_0==45) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
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
                    // InternalPagos.g:651:2: ( ( rule__TerminalValue__ValorAssignment_1 ) )
                    {
                    // InternalPagos.g:651:2: ( ( rule__TerminalValue__ValorAssignment_1 ) )
                    // InternalPagos.g:652:3: ( rule__TerminalValue__ValorAssignment_1 )
                    {
                     before(grammarAccess.getTerminalValueAccess().getValorAssignment_1()); 
                    // InternalPagos.g:653:3: ( rule__TerminalValue__ValorAssignment_1 )
                    // InternalPagos.g:653:4: rule__TerminalValue__ValorAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalValue__ValorAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalValueAccess().getValorAssignment_1()); 

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
    // InternalPagos.g:661:1: rule__Number__Alternatives : ( ( ruleEDouble ) | ( ruleInteger ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:665:1: ( ( ruleEDouble ) | ( ruleInteger ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==RULE_RBRACE||LA5_1==RULE_RBRACKET||LA5_1==RULE_LOGICALCONN||(LA5_1>=RULE_OPERADORLOGICO && LA5_1<=RULE_MULTOP)||LA5_1==43) ) {
                    alt5=2;
                }
                else if ( (LA5_1==45) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==45) ) {
                alt5=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPagos.g:666:2: ( ruleEDouble )
                    {
                    // InternalPagos.g:666:2: ( ruleEDouble )
                    // InternalPagos.g:667:3: ruleEDouble
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
                    // InternalPagos.g:672:2: ( ruleInteger )
                    {
                    // InternalPagos.g:672:2: ( ruleInteger )
                    // InternalPagos.g:673:3: ruleInteger
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
    // InternalPagos.g:682:1: rule__EDouble__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:686:1: ( ( 'E' ) | ( 'e' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            else if ( (LA6_0==29) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPagos.g:687:2: ( 'E' )
                    {
                    // InternalPagos.g:687:2: ( 'E' )
                    // InternalPagos.g:688:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:693:2: ( 'e' )
                    {
                    // InternalPagos.g:693:2: ( 'e' )
                    // InternalPagos.g:694:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_1()); 
                    match(input,29,FOLLOW_2); 
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
    // InternalPagos.g:703:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:707:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalPagos.g:708:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalPagos.g:715:1: rule__Application__Group__0__Impl : ( RULE_LBRACE ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:719:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:720:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:720:1: ( RULE_LBRACE )
            // InternalPagos.g:721:2: RULE_LBRACE
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
    // InternalPagos.g:730:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:734:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalPagos.g:735:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalPagos.g:742:1: rule__Application__Group__1__Impl : ( 'name' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:746:1: ( ( 'name' ) )
            // InternalPagos.g:747:1: ( 'name' )
            {
            // InternalPagos.g:747:1: ( 'name' )
            // InternalPagos.g:748:2: 'name'
            {
             before(grammarAccess.getApplicationAccess().getNameKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPagos.g:757:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:761:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalPagos.g:762:2: rule__Application__Group__2__Impl rule__Application__Group__3
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
    // InternalPagos.g:769:1: rule__Application__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:773:1: ( ( RULE_COLON ) )
            // InternalPagos.g:774:1: ( RULE_COLON )
            {
            // InternalPagos.g:774:1: ( RULE_COLON )
            // InternalPagos.g:775:2: RULE_COLON
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
    // InternalPagos.g:784:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:788:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalPagos.g:789:2: rule__Application__Group__3__Impl rule__Application__Group__4
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
    // InternalPagos.g:796:1: rule__Application__Group__3__Impl : ( ( rule__Application__NameAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:800:1: ( ( ( rule__Application__NameAssignment_3 ) ) )
            // InternalPagos.g:801:1: ( ( rule__Application__NameAssignment_3 ) )
            {
            // InternalPagos.g:801:1: ( ( rule__Application__NameAssignment_3 ) )
            // InternalPagos.g:802:2: ( rule__Application__NameAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_3()); 
            // InternalPagos.g:803:2: ( rule__Application__NameAssignment_3 )
            // InternalPagos.g:803:3: rule__Application__NameAssignment_3
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
    // InternalPagos.g:811:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:815:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalPagos.g:816:2: rule__Application__Group__4__Impl rule__Application__Group__5
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
    // InternalPagos.g:823:1: rule__Application__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:827:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:828:1: ( RULE_COMMA )
            {
            // InternalPagos.g:828:1: ( RULE_COMMA )
            // InternalPagos.g:829:2: RULE_COMMA
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
    // InternalPagos.g:838:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:842:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalPagos.g:843:2: rule__Application__Group__5__Impl rule__Application__Group__6
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
    // InternalPagos.g:850:1: rule__Application__Group__5__Impl : ( 'intermediary' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:854:1: ( ( 'intermediary' ) )
            // InternalPagos.g:855:1: ( 'intermediary' )
            {
            // InternalPagos.g:855:1: ( 'intermediary' )
            // InternalPagos.g:856:2: 'intermediary'
            {
             before(grammarAccess.getApplicationAccess().getIntermediaryKeyword_5()); 
            match(input,31,FOLLOW_2); 
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
    // InternalPagos.g:865:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:869:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // InternalPagos.g:870:2: rule__Application__Group__6__Impl rule__Application__Group__7
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
    // InternalPagos.g:877:1: rule__Application__Group__6__Impl : ( RULE_COLON ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:881:1: ( ( RULE_COLON ) )
            // InternalPagos.g:882:1: ( RULE_COLON )
            {
            // InternalPagos.g:882:1: ( RULE_COLON )
            // InternalPagos.g:883:2: RULE_COLON
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
    // InternalPagos.g:892:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:896:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // InternalPagos.g:897:2: rule__Application__Group__7__Impl rule__Application__Group__8
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
    // InternalPagos.g:904:1: rule__Application__Group__7__Impl : ( ( rule__Application__IntermediaryAssignment_7 ) ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:908:1: ( ( ( rule__Application__IntermediaryAssignment_7 ) ) )
            // InternalPagos.g:909:1: ( ( rule__Application__IntermediaryAssignment_7 ) )
            {
            // InternalPagos.g:909:1: ( ( rule__Application__IntermediaryAssignment_7 ) )
            // InternalPagos.g:910:2: ( rule__Application__IntermediaryAssignment_7 )
            {
             before(grammarAccess.getApplicationAccess().getIntermediaryAssignment_7()); 
            // InternalPagos.g:911:2: ( rule__Application__IntermediaryAssignment_7 )
            // InternalPagos.g:911:3: rule__Application__IntermediaryAssignment_7
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
    // InternalPagos.g:919:1: rule__Application__Group__8 : rule__Application__Group__8__Impl ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:923:1: ( rule__Application__Group__8__Impl )
            // InternalPagos.g:924:2: rule__Application__Group__8__Impl
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
    // InternalPagos.g:930:1: rule__Application__Group__8__Impl : ( RULE_RBRACE ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:934:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:935:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:935:1: ( RULE_RBRACE )
            // InternalPagos.g:936:2: RULE_RBRACE
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
    // InternalPagos.g:946:1: rule__Intermediary__Group__0 : rule__Intermediary__Group__0__Impl rule__Intermediary__Group__1 ;
    public final void rule__Intermediary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:950:1: ( rule__Intermediary__Group__0__Impl rule__Intermediary__Group__1 )
            // InternalPagos.g:951:2: rule__Intermediary__Group__0__Impl rule__Intermediary__Group__1
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
    // InternalPagos.g:958:1: rule__Intermediary__Group__0__Impl : ( () ) ;
    public final void rule__Intermediary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:962:1: ( ( () ) )
            // InternalPagos.g:963:1: ( () )
            {
            // InternalPagos.g:963:1: ( () )
            // InternalPagos.g:964:2: ()
            {
             before(grammarAccess.getIntermediaryAccess().getIntermediaryAction_0()); 
            // InternalPagos.g:965:2: ()
            // InternalPagos.g:965:3: 
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
    // InternalPagos.g:973:1: rule__Intermediary__Group__1 : rule__Intermediary__Group__1__Impl rule__Intermediary__Group__2 ;
    public final void rule__Intermediary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:977:1: ( rule__Intermediary__Group__1__Impl rule__Intermediary__Group__2 )
            // InternalPagos.g:978:2: rule__Intermediary__Group__1__Impl rule__Intermediary__Group__2
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
    // InternalPagos.g:985:1: rule__Intermediary__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Intermediary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:989:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:990:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:990:1: ( RULE_LBRACE )
            // InternalPagos.g:991:2: RULE_LBRACE
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
    // InternalPagos.g:1000:1: rule__Intermediary__Group__2 : rule__Intermediary__Group__2__Impl rule__Intermediary__Group__3 ;
    public final void rule__Intermediary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1004:1: ( rule__Intermediary__Group__2__Impl rule__Intermediary__Group__3 )
            // InternalPagos.g:1005:2: rule__Intermediary__Group__2__Impl rule__Intermediary__Group__3
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
    // InternalPagos.g:1012:1: rule__Intermediary__Group__2__Impl : ( 'name' ) ;
    public final void rule__Intermediary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1016:1: ( ( 'name' ) )
            // InternalPagos.g:1017:1: ( 'name' )
            {
            // InternalPagos.g:1017:1: ( 'name' )
            // InternalPagos.g:1018:2: 'name'
            {
             before(grammarAccess.getIntermediaryAccess().getNameKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPagos.g:1027:1: rule__Intermediary__Group__3 : rule__Intermediary__Group__3__Impl rule__Intermediary__Group__4 ;
    public final void rule__Intermediary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1031:1: ( rule__Intermediary__Group__3__Impl rule__Intermediary__Group__4 )
            // InternalPagos.g:1032:2: rule__Intermediary__Group__3__Impl rule__Intermediary__Group__4
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
    // InternalPagos.g:1039:1: rule__Intermediary__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Intermediary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1043:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1044:1: ( RULE_COLON )
            {
            // InternalPagos.g:1044:1: ( RULE_COLON )
            // InternalPagos.g:1045:2: RULE_COLON
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
    // InternalPagos.g:1054:1: rule__Intermediary__Group__4 : rule__Intermediary__Group__4__Impl rule__Intermediary__Group__5 ;
    public final void rule__Intermediary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1058:1: ( rule__Intermediary__Group__4__Impl rule__Intermediary__Group__5 )
            // InternalPagos.g:1059:2: rule__Intermediary__Group__4__Impl rule__Intermediary__Group__5
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
    // InternalPagos.g:1066:1: rule__Intermediary__Group__4__Impl : ( ( rule__Intermediary__NameAssignment_4 ) ) ;
    public final void rule__Intermediary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1070:1: ( ( ( rule__Intermediary__NameAssignment_4 ) ) )
            // InternalPagos.g:1071:1: ( ( rule__Intermediary__NameAssignment_4 ) )
            {
            // InternalPagos.g:1071:1: ( ( rule__Intermediary__NameAssignment_4 ) )
            // InternalPagos.g:1072:2: ( rule__Intermediary__NameAssignment_4 )
            {
             before(grammarAccess.getIntermediaryAccess().getNameAssignment_4()); 
            // InternalPagos.g:1073:2: ( rule__Intermediary__NameAssignment_4 )
            // InternalPagos.g:1073:3: rule__Intermediary__NameAssignment_4
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
    // InternalPagos.g:1081:1: rule__Intermediary__Group__5 : rule__Intermediary__Group__5__Impl rule__Intermediary__Group__6 ;
    public final void rule__Intermediary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1085:1: ( rule__Intermediary__Group__5__Impl rule__Intermediary__Group__6 )
            // InternalPagos.g:1086:2: rule__Intermediary__Group__5__Impl rule__Intermediary__Group__6
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
    // InternalPagos.g:1093:1: rule__Intermediary__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Intermediary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1097:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1098:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1098:1: ( RULE_COMMA )
            // InternalPagos.g:1099:2: RULE_COMMA
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
    // InternalPagos.g:1108:1: rule__Intermediary__Group__6 : rule__Intermediary__Group__6__Impl rule__Intermediary__Group__7 ;
    public final void rule__Intermediary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1112:1: ( rule__Intermediary__Group__6__Impl rule__Intermediary__Group__7 )
            // InternalPagos.g:1113:2: rule__Intermediary__Group__6__Impl rule__Intermediary__Group__7
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
    // InternalPagos.g:1120:1: rule__Intermediary__Group__6__Impl : ( 'superentities' ) ;
    public final void rule__Intermediary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1124:1: ( ( 'superentities' ) )
            // InternalPagos.g:1125:1: ( 'superentities' )
            {
            // InternalPagos.g:1125:1: ( 'superentities' )
            // InternalPagos.g:1126:2: 'superentities'
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitiesKeyword_6()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPagos.g:1135:1: rule__Intermediary__Group__7 : rule__Intermediary__Group__7__Impl rule__Intermediary__Group__8 ;
    public final void rule__Intermediary__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1139:1: ( rule__Intermediary__Group__7__Impl rule__Intermediary__Group__8 )
            // InternalPagos.g:1140:2: rule__Intermediary__Group__7__Impl rule__Intermediary__Group__8
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
    // InternalPagos.g:1147:1: rule__Intermediary__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__Intermediary__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1151:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1152:1: ( RULE_COLON )
            {
            // InternalPagos.g:1152:1: ( RULE_COLON )
            // InternalPagos.g:1153:2: RULE_COLON
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
    // InternalPagos.g:1162:1: rule__Intermediary__Group__8 : rule__Intermediary__Group__8__Impl rule__Intermediary__Group__9 ;
    public final void rule__Intermediary__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1166:1: ( rule__Intermediary__Group__8__Impl rule__Intermediary__Group__9 )
            // InternalPagos.g:1167:2: rule__Intermediary__Group__8__Impl rule__Intermediary__Group__9
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
    // InternalPagos.g:1174:1: rule__Intermediary__Group__8__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Intermediary__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1178:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:1179:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:1179:1: ( RULE_LBRACKET )
            // InternalPagos.g:1180:2: RULE_LBRACKET
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
    // InternalPagos.g:1189:1: rule__Intermediary__Group__9 : rule__Intermediary__Group__9__Impl rule__Intermediary__Group__10 ;
    public final void rule__Intermediary__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1193:1: ( rule__Intermediary__Group__9__Impl rule__Intermediary__Group__10 )
            // InternalPagos.g:1194:2: rule__Intermediary__Group__9__Impl rule__Intermediary__Group__10
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
    // InternalPagos.g:1201:1: rule__Intermediary__Group__9__Impl : ( ( rule__Intermediary__SuperentitiesAssignment_9 ) ) ;
    public final void rule__Intermediary__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1205:1: ( ( ( rule__Intermediary__SuperentitiesAssignment_9 ) ) )
            // InternalPagos.g:1206:1: ( ( rule__Intermediary__SuperentitiesAssignment_9 ) )
            {
            // InternalPagos.g:1206:1: ( ( rule__Intermediary__SuperentitiesAssignment_9 ) )
            // InternalPagos.g:1207:2: ( rule__Intermediary__SuperentitiesAssignment_9 )
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitiesAssignment_9()); 
            // InternalPagos.g:1208:2: ( rule__Intermediary__SuperentitiesAssignment_9 )
            // InternalPagos.g:1208:3: rule__Intermediary__SuperentitiesAssignment_9
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
    // InternalPagos.g:1216:1: rule__Intermediary__Group__10 : rule__Intermediary__Group__10__Impl rule__Intermediary__Group__11 ;
    public final void rule__Intermediary__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1220:1: ( rule__Intermediary__Group__10__Impl rule__Intermediary__Group__11 )
            // InternalPagos.g:1221:2: rule__Intermediary__Group__10__Impl rule__Intermediary__Group__11
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
    // InternalPagos.g:1228:1: rule__Intermediary__Group__10__Impl : ( ( rule__Intermediary__Group_10__0 )* ) ;
    public final void rule__Intermediary__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1232:1: ( ( ( rule__Intermediary__Group_10__0 )* ) )
            // InternalPagos.g:1233:1: ( ( rule__Intermediary__Group_10__0 )* )
            {
            // InternalPagos.g:1233:1: ( ( rule__Intermediary__Group_10__0 )* )
            // InternalPagos.g:1234:2: ( rule__Intermediary__Group_10__0 )*
            {
             before(grammarAccess.getIntermediaryAccess().getGroup_10()); 
            // InternalPagos.g:1235:2: ( rule__Intermediary__Group_10__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPagos.g:1235:3: rule__Intermediary__Group_10__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Intermediary__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalPagos.g:1243:1: rule__Intermediary__Group__11 : rule__Intermediary__Group__11__Impl rule__Intermediary__Group__12 ;
    public final void rule__Intermediary__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1247:1: ( rule__Intermediary__Group__11__Impl rule__Intermediary__Group__12 )
            // InternalPagos.g:1248:2: rule__Intermediary__Group__11__Impl rule__Intermediary__Group__12
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
    // InternalPagos.g:1255:1: rule__Intermediary__Group__11__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Intermediary__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1259:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:1260:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:1260:1: ( RULE_RBRACKET )
            // InternalPagos.g:1261:2: RULE_RBRACKET
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
    // InternalPagos.g:1270:1: rule__Intermediary__Group__12 : rule__Intermediary__Group__12__Impl ;
    public final void rule__Intermediary__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1274:1: ( rule__Intermediary__Group__12__Impl )
            // InternalPagos.g:1275:2: rule__Intermediary__Group__12__Impl
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
    // InternalPagos.g:1281:1: rule__Intermediary__Group__12__Impl : ( RULE_RBRACE ) ;
    public final void rule__Intermediary__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1285:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:1286:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:1286:1: ( RULE_RBRACE )
            // InternalPagos.g:1287:2: RULE_RBRACE
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
    // InternalPagos.g:1297:1: rule__Intermediary__Group_10__0 : rule__Intermediary__Group_10__0__Impl rule__Intermediary__Group_10__1 ;
    public final void rule__Intermediary__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1301:1: ( rule__Intermediary__Group_10__0__Impl rule__Intermediary__Group_10__1 )
            // InternalPagos.g:1302:2: rule__Intermediary__Group_10__0__Impl rule__Intermediary__Group_10__1
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
    // InternalPagos.g:1309:1: rule__Intermediary__Group_10__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Intermediary__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1313:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1314:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1314:1: ( RULE_COMMA )
            // InternalPagos.g:1315:2: RULE_COMMA
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
    // InternalPagos.g:1324:1: rule__Intermediary__Group_10__1 : rule__Intermediary__Group_10__1__Impl ;
    public final void rule__Intermediary__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1328:1: ( rule__Intermediary__Group_10__1__Impl )
            // InternalPagos.g:1329:2: rule__Intermediary__Group_10__1__Impl
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
    // InternalPagos.g:1335:1: rule__Intermediary__Group_10__1__Impl : ( ( rule__Intermediary__SuperentitiesAssignment_10_1 ) ) ;
    public final void rule__Intermediary__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1339:1: ( ( ( rule__Intermediary__SuperentitiesAssignment_10_1 ) ) )
            // InternalPagos.g:1340:1: ( ( rule__Intermediary__SuperentitiesAssignment_10_1 ) )
            {
            // InternalPagos.g:1340:1: ( ( rule__Intermediary__SuperentitiesAssignment_10_1 ) )
            // InternalPagos.g:1341:2: ( rule__Intermediary__SuperentitiesAssignment_10_1 )
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitiesAssignment_10_1()); 
            // InternalPagos.g:1342:2: ( rule__Intermediary__SuperentitiesAssignment_10_1 )
            // InternalPagos.g:1342:3: rule__Intermediary__SuperentitiesAssignment_10_1
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
    // InternalPagos.g:1351:1: rule__SuperEntity__Group__0 : rule__SuperEntity__Group__0__Impl rule__SuperEntity__Group__1 ;
    public final void rule__SuperEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1355:1: ( rule__SuperEntity__Group__0__Impl rule__SuperEntity__Group__1 )
            // InternalPagos.g:1356:2: rule__SuperEntity__Group__0__Impl rule__SuperEntity__Group__1
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
    // InternalPagos.g:1363:1: rule__SuperEntity__Group__0__Impl : ( () ) ;
    public final void rule__SuperEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1367:1: ( ( () ) )
            // InternalPagos.g:1368:1: ( () )
            {
            // InternalPagos.g:1368:1: ( () )
            // InternalPagos.g:1369:2: ()
            {
             before(grammarAccess.getSuperEntityAccess().getSuperEntityAction_0()); 
            // InternalPagos.g:1370:2: ()
            // InternalPagos.g:1370:3: 
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
    // InternalPagos.g:1378:1: rule__SuperEntity__Group__1 : rule__SuperEntity__Group__1__Impl rule__SuperEntity__Group__2 ;
    public final void rule__SuperEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1382:1: ( rule__SuperEntity__Group__1__Impl rule__SuperEntity__Group__2 )
            // InternalPagos.g:1383:2: rule__SuperEntity__Group__1__Impl rule__SuperEntity__Group__2
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
    // InternalPagos.g:1390:1: rule__SuperEntity__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__SuperEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1394:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:1395:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:1395:1: ( RULE_LBRACE )
            // InternalPagos.g:1396:2: RULE_LBRACE
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
    // InternalPagos.g:1405:1: rule__SuperEntity__Group__2 : rule__SuperEntity__Group__2__Impl rule__SuperEntity__Group__3 ;
    public final void rule__SuperEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1409:1: ( rule__SuperEntity__Group__2__Impl rule__SuperEntity__Group__3 )
            // InternalPagos.g:1410:2: rule__SuperEntity__Group__2__Impl rule__SuperEntity__Group__3
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
    // InternalPagos.g:1417:1: rule__SuperEntity__Group__2__Impl : ( 'name' ) ;
    public final void rule__SuperEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1421:1: ( ( 'name' ) )
            // InternalPagos.g:1422:1: ( 'name' )
            {
            // InternalPagos.g:1422:1: ( 'name' )
            // InternalPagos.g:1423:2: 'name'
            {
             before(grammarAccess.getSuperEntityAccess().getNameKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPagos.g:1432:1: rule__SuperEntity__Group__3 : rule__SuperEntity__Group__3__Impl rule__SuperEntity__Group__4 ;
    public final void rule__SuperEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1436:1: ( rule__SuperEntity__Group__3__Impl rule__SuperEntity__Group__4 )
            // InternalPagos.g:1437:2: rule__SuperEntity__Group__3__Impl rule__SuperEntity__Group__4
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
    // InternalPagos.g:1444:1: rule__SuperEntity__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1448:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1449:1: ( RULE_COLON )
            {
            // InternalPagos.g:1449:1: ( RULE_COLON )
            // InternalPagos.g:1450:2: RULE_COLON
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
    // InternalPagos.g:1459:1: rule__SuperEntity__Group__4 : rule__SuperEntity__Group__4__Impl rule__SuperEntity__Group__5 ;
    public final void rule__SuperEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1463:1: ( rule__SuperEntity__Group__4__Impl rule__SuperEntity__Group__5 )
            // InternalPagos.g:1464:2: rule__SuperEntity__Group__4__Impl rule__SuperEntity__Group__5
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
    // InternalPagos.g:1471:1: rule__SuperEntity__Group__4__Impl : ( ( rule__SuperEntity__NameAssignment_4 ) ) ;
    public final void rule__SuperEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1475:1: ( ( ( rule__SuperEntity__NameAssignment_4 ) ) )
            // InternalPagos.g:1476:1: ( ( rule__SuperEntity__NameAssignment_4 ) )
            {
            // InternalPagos.g:1476:1: ( ( rule__SuperEntity__NameAssignment_4 ) )
            // InternalPagos.g:1477:2: ( rule__SuperEntity__NameAssignment_4 )
            {
             before(grammarAccess.getSuperEntityAccess().getNameAssignment_4()); 
            // InternalPagos.g:1478:2: ( rule__SuperEntity__NameAssignment_4 )
            // InternalPagos.g:1478:3: rule__SuperEntity__NameAssignment_4
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
    // InternalPagos.g:1486:1: rule__SuperEntity__Group__5 : rule__SuperEntity__Group__5__Impl rule__SuperEntity__Group__6 ;
    public final void rule__SuperEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1490:1: ( rule__SuperEntity__Group__5__Impl rule__SuperEntity__Group__6 )
            // InternalPagos.g:1491:2: rule__SuperEntity__Group__5__Impl rule__SuperEntity__Group__6
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
    // InternalPagos.g:1498:1: rule__SuperEntity__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1502:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1503:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1503:1: ( RULE_COMMA )
            // InternalPagos.g:1504:2: RULE_COMMA
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
    // InternalPagos.g:1513:1: rule__SuperEntity__Group__6 : rule__SuperEntity__Group__6__Impl rule__SuperEntity__Group__7 ;
    public final void rule__SuperEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1517:1: ( rule__SuperEntity__Group__6__Impl rule__SuperEntity__Group__7 )
            // InternalPagos.g:1518:2: rule__SuperEntity__Group__6__Impl rule__SuperEntity__Group__7
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
    // InternalPagos.g:1525:1: rule__SuperEntity__Group__6__Impl : ( 'description' ) ;
    public final void rule__SuperEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1529:1: ( ( 'description' ) )
            // InternalPagos.g:1530:1: ( 'description' )
            {
            // InternalPagos.g:1530:1: ( 'description' )
            // InternalPagos.g:1531:2: 'description'
            {
             before(grammarAccess.getSuperEntityAccess().getDescriptionKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPagos.g:1540:1: rule__SuperEntity__Group__7 : rule__SuperEntity__Group__7__Impl rule__SuperEntity__Group__8 ;
    public final void rule__SuperEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1544:1: ( rule__SuperEntity__Group__7__Impl rule__SuperEntity__Group__8 )
            // InternalPagos.g:1545:2: rule__SuperEntity__Group__7__Impl rule__SuperEntity__Group__8
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
    // InternalPagos.g:1552:1: rule__SuperEntity__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1556:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1557:1: ( RULE_COLON )
            {
            // InternalPagos.g:1557:1: ( RULE_COLON )
            // InternalPagos.g:1558:2: RULE_COLON
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
    // InternalPagos.g:1567:1: rule__SuperEntity__Group__8 : rule__SuperEntity__Group__8__Impl rule__SuperEntity__Group__9 ;
    public final void rule__SuperEntity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1571:1: ( rule__SuperEntity__Group__8__Impl rule__SuperEntity__Group__9 )
            // InternalPagos.g:1572:2: rule__SuperEntity__Group__8__Impl rule__SuperEntity__Group__9
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
    // InternalPagos.g:1579:1: rule__SuperEntity__Group__8__Impl : ( ( rule__SuperEntity__DescriptionAssignment_8 ) ) ;
    public final void rule__SuperEntity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1583:1: ( ( ( rule__SuperEntity__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:1584:1: ( ( rule__SuperEntity__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:1584:1: ( ( rule__SuperEntity__DescriptionAssignment_8 ) )
            // InternalPagos.g:1585:2: ( rule__SuperEntity__DescriptionAssignment_8 )
            {
             before(grammarAccess.getSuperEntityAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:1586:2: ( rule__SuperEntity__DescriptionAssignment_8 )
            // InternalPagos.g:1586:3: rule__SuperEntity__DescriptionAssignment_8
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
    // InternalPagos.g:1594:1: rule__SuperEntity__Group__9 : rule__SuperEntity__Group__9__Impl rule__SuperEntity__Group__10 ;
    public final void rule__SuperEntity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1598:1: ( rule__SuperEntity__Group__9__Impl rule__SuperEntity__Group__10 )
            // InternalPagos.g:1599:2: rule__SuperEntity__Group__9__Impl rule__SuperEntity__Group__10
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
    // InternalPagos.g:1606:1: rule__SuperEntity__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1610:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1611:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1611:1: ( RULE_COMMA )
            // InternalPagos.g:1612:2: RULE_COMMA
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
    // InternalPagos.g:1621:1: rule__SuperEntity__Group__10 : rule__SuperEntity__Group__10__Impl rule__SuperEntity__Group__11 ;
    public final void rule__SuperEntity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1625:1: ( rule__SuperEntity__Group__10__Impl rule__SuperEntity__Group__11 )
            // InternalPagos.g:1626:2: rule__SuperEntity__Group__10__Impl rule__SuperEntity__Group__11
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
    // InternalPagos.g:1633:1: rule__SuperEntity__Group__10__Impl : ( 'attributes' ) ;
    public final void rule__SuperEntity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1637:1: ( ( 'attributes' ) )
            // InternalPagos.g:1638:1: ( 'attributes' )
            {
            // InternalPagos.g:1638:1: ( 'attributes' )
            // InternalPagos.g:1639:2: 'attributes'
            {
             before(grammarAccess.getSuperEntityAccess().getAttributesKeyword_10()); 
            match(input,34,FOLLOW_2); 
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
    // InternalPagos.g:1648:1: rule__SuperEntity__Group__11 : rule__SuperEntity__Group__11__Impl rule__SuperEntity__Group__12 ;
    public final void rule__SuperEntity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1652:1: ( rule__SuperEntity__Group__11__Impl rule__SuperEntity__Group__12 )
            // InternalPagos.g:1653:2: rule__SuperEntity__Group__11__Impl rule__SuperEntity__Group__12
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
    // InternalPagos.g:1660:1: rule__SuperEntity__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1664:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1665:1: ( RULE_COLON )
            {
            // InternalPagos.g:1665:1: ( RULE_COLON )
            // InternalPagos.g:1666:2: RULE_COLON
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
    // InternalPagos.g:1675:1: rule__SuperEntity__Group__12 : rule__SuperEntity__Group__12__Impl rule__SuperEntity__Group__13 ;
    public final void rule__SuperEntity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1679:1: ( rule__SuperEntity__Group__12__Impl rule__SuperEntity__Group__13 )
            // InternalPagos.g:1680:2: rule__SuperEntity__Group__12__Impl rule__SuperEntity__Group__13
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
    // InternalPagos.g:1687:1: rule__SuperEntity__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__SuperEntity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1691:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:1692:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:1692:1: ( RULE_LBRACKET )
            // InternalPagos.g:1693:2: RULE_LBRACKET
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
    // InternalPagos.g:1702:1: rule__SuperEntity__Group__13 : rule__SuperEntity__Group__13__Impl rule__SuperEntity__Group__14 ;
    public final void rule__SuperEntity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1706:1: ( rule__SuperEntity__Group__13__Impl rule__SuperEntity__Group__14 )
            // InternalPagos.g:1707:2: rule__SuperEntity__Group__13__Impl rule__SuperEntity__Group__14
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
    // InternalPagos.g:1714:1: rule__SuperEntity__Group__13__Impl : ( ( rule__SuperEntity__AttListsAssignment_13 ) ) ;
    public final void rule__SuperEntity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1718:1: ( ( ( rule__SuperEntity__AttListsAssignment_13 ) ) )
            // InternalPagos.g:1719:1: ( ( rule__SuperEntity__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:1719:1: ( ( rule__SuperEntity__AttListsAssignment_13 ) )
            // InternalPagos.g:1720:2: ( rule__SuperEntity__AttListsAssignment_13 )
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:1721:2: ( rule__SuperEntity__AttListsAssignment_13 )
            // InternalPagos.g:1721:3: rule__SuperEntity__AttListsAssignment_13
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
    // InternalPagos.g:1729:1: rule__SuperEntity__Group__14 : rule__SuperEntity__Group__14__Impl rule__SuperEntity__Group__15 ;
    public final void rule__SuperEntity__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1733:1: ( rule__SuperEntity__Group__14__Impl rule__SuperEntity__Group__15 )
            // InternalPagos.g:1734:2: rule__SuperEntity__Group__14__Impl rule__SuperEntity__Group__15
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
    // InternalPagos.g:1741:1: rule__SuperEntity__Group__14__Impl : ( ( rule__SuperEntity__Group_14__0 )* ) ;
    public final void rule__SuperEntity__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1745:1: ( ( ( rule__SuperEntity__Group_14__0 )* ) )
            // InternalPagos.g:1746:1: ( ( rule__SuperEntity__Group_14__0 )* )
            {
            // InternalPagos.g:1746:1: ( ( rule__SuperEntity__Group_14__0 )* )
            // InternalPagos.g:1747:2: ( rule__SuperEntity__Group_14__0 )*
            {
             before(grammarAccess.getSuperEntityAccess().getGroup_14()); 
            // InternalPagos.g:1748:2: ( rule__SuperEntity__Group_14__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPagos.g:1748:3: rule__SuperEntity__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SuperEntity__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalPagos.g:1756:1: rule__SuperEntity__Group__15 : rule__SuperEntity__Group__15__Impl rule__SuperEntity__Group__16 ;
    public final void rule__SuperEntity__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1760:1: ( rule__SuperEntity__Group__15__Impl rule__SuperEntity__Group__16 )
            // InternalPagos.g:1761:2: rule__SuperEntity__Group__15__Impl rule__SuperEntity__Group__16
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
    // InternalPagos.g:1768:1: rule__SuperEntity__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__SuperEntity__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1772:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:1773:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:1773:1: ( RULE_RBRACKET )
            // InternalPagos.g:1774:2: RULE_RBRACKET
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
    // InternalPagos.g:1783:1: rule__SuperEntity__Group__16 : rule__SuperEntity__Group__16__Impl rule__SuperEntity__Group__17 ;
    public final void rule__SuperEntity__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1787:1: ( rule__SuperEntity__Group__16__Impl rule__SuperEntity__Group__17 )
            // InternalPagos.g:1788:2: rule__SuperEntity__Group__16__Impl rule__SuperEntity__Group__17
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
    // InternalPagos.g:1795:1: rule__SuperEntity__Group__16__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1799:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1800:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1800:1: ( RULE_COMMA )
            // InternalPagos.g:1801:2: RULE_COMMA
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
    // InternalPagos.g:1810:1: rule__SuperEntity__Group__17 : rule__SuperEntity__Group__17__Impl rule__SuperEntity__Group__18 ;
    public final void rule__SuperEntity__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1814:1: ( rule__SuperEntity__Group__17__Impl rule__SuperEntity__Group__18 )
            // InternalPagos.g:1815:2: rule__SuperEntity__Group__17__Impl rule__SuperEntity__Group__18
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
    // InternalPagos.g:1822:1: rule__SuperEntity__Group__17__Impl : ( 'entities' ) ;
    public final void rule__SuperEntity__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1826:1: ( ( 'entities' ) )
            // InternalPagos.g:1827:1: ( 'entities' )
            {
            // InternalPagos.g:1827:1: ( 'entities' )
            // InternalPagos.g:1828:2: 'entities'
            {
             before(grammarAccess.getSuperEntityAccess().getEntitiesKeyword_17()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPagos.g:1837:1: rule__SuperEntity__Group__18 : rule__SuperEntity__Group__18__Impl rule__SuperEntity__Group__19 ;
    public final void rule__SuperEntity__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1841:1: ( rule__SuperEntity__Group__18__Impl rule__SuperEntity__Group__19 )
            // InternalPagos.g:1842:2: rule__SuperEntity__Group__18__Impl rule__SuperEntity__Group__19
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
    // InternalPagos.g:1849:1: rule__SuperEntity__Group__18__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1853:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1854:1: ( RULE_COLON )
            {
            // InternalPagos.g:1854:1: ( RULE_COLON )
            // InternalPagos.g:1855:2: RULE_COLON
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
    // InternalPagos.g:1864:1: rule__SuperEntity__Group__19 : rule__SuperEntity__Group__19__Impl rule__SuperEntity__Group__20 ;
    public final void rule__SuperEntity__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1868:1: ( rule__SuperEntity__Group__19__Impl rule__SuperEntity__Group__20 )
            // InternalPagos.g:1869:2: rule__SuperEntity__Group__19__Impl rule__SuperEntity__Group__20
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
    // InternalPagos.g:1876:1: rule__SuperEntity__Group__19__Impl : ( RULE_LBRACKET ) ;
    public final void rule__SuperEntity__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1880:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:1881:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:1881:1: ( RULE_LBRACKET )
            // InternalPagos.g:1882:2: RULE_LBRACKET
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
    // InternalPagos.g:1891:1: rule__SuperEntity__Group__20 : rule__SuperEntity__Group__20__Impl rule__SuperEntity__Group__21 ;
    public final void rule__SuperEntity__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1895:1: ( rule__SuperEntity__Group__20__Impl rule__SuperEntity__Group__21 )
            // InternalPagos.g:1896:2: rule__SuperEntity__Group__20__Impl rule__SuperEntity__Group__21
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
    // InternalPagos.g:1903:1: rule__SuperEntity__Group__20__Impl : ( ( rule__SuperEntity__ParticipantsAssignment_20 ) ) ;
    public final void rule__SuperEntity__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1907:1: ( ( ( rule__SuperEntity__ParticipantsAssignment_20 ) ) )
            // InternalPagos.g:1908:1: ( ( rule__SuperEntity__ParticipantsAssignment_20 ) )
            {
            // InternalPagos.g:1908:1: ( ( rule__SuperEntity__ParticipantsAssignment_20 ) )
            // InternalPagos.g:1909:2: ( rule__SuperEntity__ParticipantsAssignment_20 )
            {
             before(grammarAccess.getSuperEntityAccess().getParticipantsAssignment_20()); 
            // InternalPagos.g:1910:2: ( rule__SuperEntity__ParticipantsAssignment_20 )
            // InternalPagos.g:1910:3: rule__SuperEntity__ParticipantsAssignment_20
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
    // InternalPagos.g:1918:1: rule__SuperEntity__Group__21 : rule__SuperEntity__Group__21__Impl rule__SuperEntity__Group__22 ;
    public final void rule__SuperEntity__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1922:1: ( rule__SuperEntity__Group__21__Impl rule__SuperEntity__Group__22 )
            // InternalPagos.g:1923:2: rule__SuperEntity__Group__21__Impl rule__SuperEntity__Group__22
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
    // InternalPagos.g:1930:1: rule__SuperEntity__Group__21__Impl : ( ( rule__SuperEntity__Group_21__0 )* ) ;
    public final void rule__SuperEntity__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1934:1: ( ( ( rule__SuperEntity__Group_21__0 )* ) )
            // InternalPagos.g:1935:1: ( ( rule__SuperEntity__Group_21__0 )* )
            {
            // InternalPagos.g:1935:1: ( ( rule__SuperEntity__Group_21__0 )* )
            // InternalPagos.g:1936:2: ( rule__SuperEntity__Group_21__0 )*
            {
             before(grammarAccess.getSuperEntityAccess().getGroup_21()); 
            // InternalPagos.g:1937:2: ( rule__SuperEntity__Group_21__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPagos.g:1937:3: rule__SuperEntity__Group_21__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SuperEntity__Group_21__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalPagos.g:1945:1: rule__SuperEntity__Group__22 : rule__SuperEntity__Group__22__Impl rule__SuperEntity__Group__23 ;
    public final void rule__SuperEntity__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1949:1: ( rule__SuperEntity__Group__22__Impl rule__SuperEntity__Group__23 )
            // InternalPagos.g:1950:2: rule__SuperEntity__Group__22__Impl rule__SuperEntity__Group__23
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
    // InternalPagos.g:1957:1: rule__SuperEntity__Group__22__Impl : ( RULE_RBRACKET ) ;
    public final void rule__SuperEntity__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1961:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:1962:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:1962:1: ( RULE_RBRACKET )
            // InternalPagos.g:1963:2: RULE_RBRACKET
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
    // InternalPagos.g:1972:1: rule__SuperEntity__Group__23 : rule__SuperEntity__Group__23__Impl ;
    public final void rule__SuperEntity__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1976:1: ( rule__SuperEntity__Group__23__Impl )
            // InternalPagos.g:1977:2: rule__SuperEntity__Group__23__Impl
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
    // InternalPagos.g:1983:1: rule__SuperEntity__Group__23__Impl : ( RULE_RBRACE ) ;
    public final void rule__SuperEntity__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1987:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:1988:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:1988:1: ( RULE_RBRACE )
            // InternalPagos.g:1989:2: RULE_RBRACE
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
    // InternalPagos.g:1999:1: rule__SuperEntity__Group_14__0 : rule__SuperEntity__Group_14__0__Impl rule__SuperEntity__Group_14__1 ;
    public final void rule__SuperEntity__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2003:1: ( rule__SuperEntity__Group_14__0__Impl rule__SuperEntity__Group_14__1 )
            // InternalPagos.g:2004:2: rule__SuperEntity__Group_14__0__Impl rule__SuperEntity__Group_14__1
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
    // InternalPagos.g:2011:1: rule__SuperEntity__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2015:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2016:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2016:1: ( RULE_COMMA )
            // InternalPagos.g:2017:2: RULE_COMMA
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
    // InternalPagos.g:2026:1: rule__SuperEntity__Group_14__1 : rule__SuperEntity__Group_14__1__Impl ;
    public final void rule__SuperEntity__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2030:1: ( rule__SuperEntity__Group_14__1__Impl )
            // InternalPagos.g:2031:2: rule__SuperEntity__Group_14__1__Impl
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
    // InternalPagos.g:2037:1: rule__SuperEntity__Group_14__1__Impl : ( ( rule__SuperEntity__AttListsAssignment_14_1 ) ) ;
    public final void rule__SuperEntity__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2041:1: ( ( ( rule__SuperEntity__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:2042:1: ( ( rule__SuperEntity__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:2042:1: ( ( rule__SuperEntity__AttListsAssignment_14_1 ) )
            // InternalPagos.g:2043:2: ( rule__SuperEntity__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:2044:2: ( rule__SuperEntity__AttListsAssignment_14_1 )
            // InternalPagos.g:2044:3: rule__SuperEntity__AttListsAssignment_14_1
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
    // InternalPagos.g:2053:1: rule__SuperEntity__Group_21__0 : rule__SuperEntity__Group_21__0__Impl rule__SuperEntity__Group_21__1 ;
    public final void rule__SuperEntity__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2057:1: ( rule__SuperEntity__Group_21__0__Impl rule__SuperEntity__Group_21__1 )
            // InternalPagos.g:2058:2: rule__SuperEntity__Group_21__0__Impl rule__SuperEntity__Group_21__1
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
    // InternalPagos.g:2065:1: rule__SuperEntity__Group_21__0__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2069:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2070:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2070:1: ( RULE_COMMA )
            // InternalPagos.g:2071:2: RULE_COMMA
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
    // InternalPagos.g:2080:1: rule__SuperEntity__Group_21__1 : rule__SuperEntity__Group_21__1__Impl ;
    public final void rule__SuperEntity__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2084:1: ( rule__SuperEntity__Group_21__1__Impl )
            // InternalPagos.g:2085:2: rule__SuperEntity__Group_21__1__Impl
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
    // InternalPagos.g:2091:1: rule__SuperEntity__Group_21__1__Impl : ( ( rule__SuperEntity__ParticipantsAssignment_21_1 ) ) ;
    public final void rule__SuperEntity__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2095:1: ( ( ( rule__SuperEntity__ParticipantsAssignment_21_1 ) ) )
            // InternalPagos.g:2096:1: ( ( rule__SuperEntity__ParticipantsAssignment_21_1 ) )
            {
            // InternalPagos.g:2096:1: ( ( rule__SuperEntity__ParticipantsAssignment_21_1 ) )
            // InternalPagos.g:2097:2: ( rule__SuperEntity__ParticipantsAssignment_21_1 )
            {
             before(grammarAccess.getSuperEntityAccess().getParticipantsAssignment_21_1()); 
            // InternalPagos.g:2098:2: ( rule__SuperEntity__ParticipantsAssignment_21_1 )
            // InternalPagos.g:2098:3: rule__SuperEntity__ParticipantsAssignment_21_1
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
    // InternalPagos.g:2107:1: rule__Participant__Group__0 : rule__Participant__Group__0__Impl rule__Participant__Group__1 ;
    public final void rule__Participant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2111:1: ( rule__Participant__Group__0__Impl rule__Participant__Group__1 )
            // InternalPagos.g:2112:2: rule__Participant__Group__0__Impl rule__Participant__Group__1
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
    // InternalPagos.g:2119:1: rule__Participant__Group__0__Impl : ( () ) ;
    public final void rule__Participant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2123:1: ( ( () ) )
            // InternalPagos.g:2124:1: ( () )
            {
            // InternalPagos.g:2124:1: ( () )
            // InternalPagos.g:2125:2: ()
            {
             before(grammarAccess.getParticipantAccess().getParticipantAction_0()); 
            // InternalPagos.g:2126:2: ()
            // InternalPagos.g:2126:3: 
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
    // InternalPagos.g:2134:1: rule__Participant__Group__1 : rule__Participant__Group__1__Impl rule__Participant__Group__2 ;
    public final void rule__Participant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2138:1: ( rule__Participant__Group__1__Impl rule__Participant__Group__2 )
            // InternalPagos.g:2139:2: rule__Participant__Group__1__Impl rule__Participant__Group__2
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
    // InternalPagos.g:2146:1: rule__Participant__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Participant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2150:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:2151:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:2151:1: ( RULE_LBRACE )
            // InternalPagos.g:2152:2: RULE_LBRACE
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
    // InternalPagos.g:2161:1: rule__Participant__Group__2 : rule__Participant__Group__2__Impl rule__Participant__Group__3 ;
    public final void rule__Participant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2165:1: ( rule__Participant__Group__2__Impl rule__Participant__Group__3 )
            // InternalPagos.g:2166:2: rule__Participant__Group__2__Impl rule__Participant__Group__3
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
    // InternalPagos.g:2173:1: rule__Participant__Group__2__Impl : ( 'name' ) ;
    public final void rule__Participant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2177:1: ( ( 'name' ) )
            // InternalPagos.g:2178:1: ( 'name' )
            {
            // InternalPagos.g:2178:1: ( 'name' )
            // InternalPagos.g:2179:2: 'name'
            {
             before(grammarAccess.getParticipantAccess().getNameKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPagos.g:2188:1: rule__Participant__Group__3 : rule__Participant__Group__3__Impl rule__Participant__Group__4 ;
    public final void rule__Participant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2192:1: ( rule__Participant__Group__3__Impl rule__Participant__Group__4 )
            // InternalPagos.g:2193:2: rule__Participant__Group__3__Impl rule__Participant__Group__4
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
    // InternalPagos.g:2200:1: rule__Participant__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2204:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2205:1: ( RULE_COLON )
            {
            // InternalPagos.g:2205:1: ( RULE_COLON )
            // InternalPagos.g:2206:2: RULE_COLON
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
    // InternalPagos.g:2215:1: rule__Participant__Group__4 : rule__Participant__Group__4__Impl rule__Participant__Group__5 ;
    public final void rule__Participant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2219:1: ( rule__Participant__Group__4__Impl rule__Participant__Group__5 )
            // InternalPagos.g:2220:2: rule__Participant__Group__4__Impl rule__Participant__Group__5
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
    // InternalPagos.g:2227:1: rule__Participant__Group__4__Impl : ( ( rule__Participant__NameAssignment_4 ) ) ;
    public final void rule__Participant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2231:1: ( ( ( rule__Participant__NameAssignment_4 ) ) )
            // InternalPagos.g:2232:1: ( ( rule__Participant__NameAssignment_4 ) )
            {
            // InternalPagos.g:2232:1: ( ( rule__Participant__NameAssignment_4 ) )
            // InternalPagos.g:2233:2: ( rule__Participant__NameAssignment_4 )
            {
             before(grammarAccess.getParticipantAccess().getNameAssignment_4()); 
            // InternalPagos.g:2234:2: ( rule__Participant__NameAssignment_4 )
            // InternalPagos.g:2234:3: rule__Participant__NameAssignment_4
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
    // InternalPagos.g:2242:1: rule__Participant__Group__5 : rule__Participant__Group__5__Impl rule__Participant__Group__6 ;
    public final void rule__Participant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2246:1: ( rule__Participant__Group__5__Impl rule__Participant__Group__6 )
            // InternalPagos.g:2247:2: rule__Participant__Group__5__Impl rule__Participant__Group__6
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
    // InternalPagos.g:2254:1: rule__Participant__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2258:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2259:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2259:1: ( RULE_COMMA )
            // InternalPagos.g:2260:2: RULE_COMMA
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
    // InternalPagos.g:2269:1: rule__Participant__Group__6 : rule__Participant__Group__6__Impl rule__Participant__Group__7 ;
    public final void rule__Participant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2273:1: ( rule__Participant__Group__6__Impl rule__Participant__Group__7 )
            // InternalPagos.g:2274:2: rule__Participant__Group__6__Impl rule__Participant__Group__7
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
    // InternalPagos.g:2281:1: rule__Participant__Group__6__Impl : ( 'description' ) ;
    public final void rule__Participant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2285:1: ( ( 'description' ) )
            // InternalPagos.g:2286:1: ( 'description' )
            {
            // InternalPagos.g:2286:1: ( 'description' )
            // InternalPagos.g:2287:2: 'description'
            {
             before(grammarAccess.getParticipantAccess().getDescriptionKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPagos.g:2296:1: rule__Participant__Group__7 : rule__Participant__Group__7__Impl rule__Participant__Group__8 ;
    public final void rule__Participant__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2300:1: ( rule__Participant__Group__7__Impl rule__Participant__Group__8 )
            // InternalPagos.g:2301:2: rule__Participant__Group__7__Impl rule__Participant__Group__8
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
    // InternalPagos.g:2308:1: rule__Participant__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2312:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2313:1: ( RULE_COLON )
            {
            // InternalPagos.g:2313:1: ( RULE_COLON )
            // InternalPagos.g:2314:2: RULE_COLON
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
    // InternalPagos.g:2323:1: rule__Participant__Group__8 : rule__Participant__Group__8__Impl rule__Participant__Group__9 ;
    public final void rule__Participant__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2327:1: ( rule__Participant__Group__8__Impl rule__Participant__Group__9 )
            // InternalPagos.g:2328:2: rule__Participant__Group__8__Impl rule__Participant__Group__9
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
    // InternalPagos.g:2335:1: rule__Participant__Group__8__Impl : ( ( rule__Participant__DescriptionAssignment_8 ) ) ;
    public final void rule__Participant__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2339:1: ( ( ( rule__Participant__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:2340:1: ( ( rule__Participant__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:2340:1: ( ( rule__Participant__DescriptionAssignment_8 ) )
            // InternalPagos.g:2341:2: ( rule__Participant__DescriptionAssignment_8 )
            {
             before(grammarAccess.getParticipantAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:2342:2: ( rule__Participant__DescriptionAssignment_8 )
            // InternalPagos.g:2342:3: rule__Participant__DescriptionAssignment_8
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
    // InternalPagos.g:2350:1: rule__Participant__Group__9 : rule__Participant__Group__9__Impl rule__Participant__Group__10 ;
    public final void rule__Participant__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2354:1: ( rule__Participant__Group__9__Impl rule__Participant__Group__10 )
            // InternalPagos.g:2355:2: rule__Participant__Group__9__Impl rule__Participant__Group__10
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
    // InternalPagos.g:2362:1: rule__Participant__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2366:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2367:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2367:1: ( RULE_COMMA )
            // InternalPagos.g:2368:2: RULE_COMMA
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
    // InternalPagos.g:2377:1: rule__Participant__Group__10 : rule__Participant__Group__10__Impl rule__Participant__Group__11 ;
    public final void rule__Participant__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2381:1: ( rule__Participant__Group__10__Impl rule__Participant__Group__11 )
            // InternalPagos.g:2382:2: rule__Participant__Group__10__Impl rule__Participant__Group__11
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
    // InternalPagos.g:2389:1: rule__Participant__Group__10__Impl : ( 'attributes' ) ;
    public final void rule__Participant__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2393:1: ( ( 'attributes' ) )
            // InternalPagos.g:2394:1: ( 'attributes' )
            {
            // InternalPagos.g:2394:1: ( 'attributes' )
            // InternalPagos.g:2395:2: 'attributes'
            {
             before(grammarAccess.getParticipantAccess().getAttributesKeyword_10()); 
            match(input,34,FOLLOW_2); 
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
    // InternalPagos.g:2404:1: rule__Participant__Group__11 : rule__Participant__Group__11__Impl rule__Participant__Group__12 ;
    public final void rule__Participant__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2408:1: ( rule__Participant__Group__11__Impl rule__Participant__Group__12 )
            // InternalPagos.g:2409:2: rule__Participant__Group__11__Impl rule__Participant__Group__12
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
    // InternalPagos.g:2416:1: rule__Participant__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2420:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2421:1: ( RULE_COLON )
            {
            // InternalPagos.g:2421:1: ( RULE_COLON )
            // InternalPagos.g:2422:2: RULE_COLON
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
    // InternalPagos.g:2431:1: rule__Participant__Group__12 : rule__Participant__Group__12__Impl rule__Participant__Group__13 ;
    public final void rule__Participant__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2435:1: ( rule__Participant__Group__12__Impl rule__Participant__Group__13 )
            // InternalPagos.g:2436:2: rule__Participant__Group__12__Impl rule__Participant__Group__13
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
    // InternalPagos.g:2443:1: rule__Participant__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Participant__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2447:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:2448:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:2448:1: ( RULE_LBRACKET )
            // InternalPagos.g:2449:2: RULE_LBRACKET
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
    // InternalPagos.g:2458:1: rule__Participant__Group__13 : rule__Participant__Group__13__Impl rule__Participant__Group__14 ;
    public final void rule__Participant__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2462:1: ( rule__Participant__Group__13__Impl rule__Participant__Group__14 )
            // InternalPagos.g:2463:2: rule__Participant__Group__13__Impl rule__Participant__Group__14
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
    // InternalPagos.g:2470:1: rule__Participant__Group__13__Impl : ( ( rule__Participant__AttListsAssignment_13 ) ) ;
    public final void rule__Participant__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2474:1: ( ( ( rule__Participant__AttListsAssignment_13 ) ) )
            // InternalPagos.g:2475:1: ( ( rule__Participant__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:2475:1: ( ( rule__Participant__AttListsAssignment_13 ) )
            // InternalPagos.g:2476:2: ( rule__Participant__AttListsAssignment_13 )
            {
             before(grammarAccess.getParticipantAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:2477:2: ( rule__Participant__AttListsAssignment_13 )
            // InternalPagos.g:2477:3: rule__Participant__AttListsAssignment_13
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
    // InternalPagos.g:2485:1: rule__Participant__Group__14 : rule__Participant__Group__14__Impl rule__Participant__Group__15 ;
    public final void rule__Participant__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2489:1: ( rule__Participant__Group__14__Impl rule__Participant__Group__15 )
            // InternalPagos.g:2490:2: rule__Participant__Group__14__Impl rule__Participant__Group__15
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
    // InternalPagos.g:2497:1: rule__Participant__Group__14__Impl : ( ( rule__Participant__Group_14__0 )* ) ;
    public final void rule__Participant__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2501:1: ( ( ( rule__Participant__Group_14__0 )* ) )
            // InternalPagos.g:2502:1: ( ( rule__Participant__Group_14__0 )* )
            {
            // InternalPagos.g:2502:1: ( ( rule__Participant__Group_14__0 )* )
            // InternalPagos.g:2503:2: ( rule__Participant__Group_14__0 )*
            {
             before(grammarAccess.getParticipantAccess().getGroup_14()); 
            // InternalPagos.g:2504:2: ( rule__Participant__Group_14__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPagos.g:2504:3: rule__Participant__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Participant__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalPagos.g:2512:1: rule__Participant__Group__15 : rule__Participant__Group__15__Impl rule__Participant__Group__16 ;
    public final void rule__Participant__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2516:1: ( rule__Participant__Group__15__Impl rule__Participant__Group__16 )
            // InternalPagos.g:2517:2: rule__Participant__Group__15__Impl rule__Participant__Group__16
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
    // InternalPagos.g:2524:1: rule__Participant__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Participant__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2528:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:2529:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:2529:1: ( RULE_RBRACKET )
            // InternalPagos.g:2530:2: RULE_RBRACKET
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
    // InternalPagos.g:2539:1: rule__Participant__Group__16 : rule__Participant__Group__16__Impl rule__Participant__Group__17 ;
    public final void rule__Participant__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2543:1: ( rule__Participant__Group__16__Impl rule__Participant__Group__17 )
            // InternalPagos.g:2544:2: rule__Participant__Group__16__Impl rule__Participant__Group__17
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
    // InternalPagos.g:2551:1: rule__Participant__Group__16__Impl : ( RULE_RBRACE ) ;
    public final void rule__Participant__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2555:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:2556:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:2556:1: ( RULE_RBRACE )
            // InternalPagos.g:2557:2: RULE_RBRACE
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
    // InternalPagos.g:2566:1: rule__Participant__Group__17 : rule__Participant__Group__17__Impl rule__Participant__Group__18 ;
    public final void rule__Participant__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2570:1: ( rule__Participant__Group__17__Impl rule__Participant__Group__18 )
            // InternalPagos.g:2571:2: rule__Participant__Group__17__Impl rule__Participant__Group__18
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
    // InternalPagos.g:2578:1: rule__Participant__Group__17__Impl : ( ( rule__Participant__Group_17__0 )? ) ;
    public final void rule__Participant__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2582:1: ( ( ( rule__Participant__Group_17__0 )? ) )
            // InternalPagos.g:2583:1: ( ( rule__Participant__Group_17__0 )? )
            {
            // InternalPagos.g:2583:1: ( ( rule__Participant__Group_17__0 )? )
            // InternalPagos.g:2584:2: ( rule__Participant__Group_17__0 )?
            {
             before(grammarAccess.getParticipantAccess().getGroup_17()); 
            // InternalPagos.g:2585:2: ( rule__Participant__Group_17__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_COMMA) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPagos.g:2585:3: rule__Participant__Group_17__0
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
    // InternalPagos.g:2593:1: rule__Participant__Group__18 : rule__Participant__Group__18__Impl ;
    public final void rule__Participant__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2597:1: ( rule__Participant__Group__18__Impl )
            // InternalPagos.g:2598:2: rule__Participant__Group__18__Impl
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
    // InternalPagos.g:2604:1: rule__Participant__Group__18__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Participant__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2608:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:2609:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:2609:1: ( RULE_RBRACKET )
            // InternalPagos.g:2610:2: RULE_RBRACKET
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
    // InternalPagos.g:2620:1: rule__Participant__Group_14__0 : rule__Participant__Group_14__0__Impl rule__Participant__Group_14__1 ;
    public final void rule__Participant__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2624:1: ( rule__Participant__Group_14__0__Impl rule__Participant__Group_14__1 )
            // InternalPagos.g:2625:2: rule__Participant__Group_14__0__Impl rule__Participant__Group_14__1
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
    // InternalPagos.g:2632:1: rule__Participant__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2636:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2637:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2637:1: ( RULE_COMMA )
            // InternalPagos.g:2638:2: RULE_COMMA
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
    // InternalPagos.g:2647:1: rule__Participant__Group_14__1 : rule__Participant__Group_14__1__Impl ;
    public final void rule__Participant__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2651:1: ( rule__Participant__Group_14__1__Impl )
            // InternalPagos.g:2652:2: rule__Participant__Group_14__1__Impl
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
    // InternalPagos.g:2658:1: rule__Participant__Group_14__1__Impl : ( ( rule__Participant__AttListsAssignment_14_1 ) ) ;
    public final void rule__Participant__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2662:1: ( ( ( rule__Participant__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:2663:1: ( ( rule__Participant__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:2663:1: ( ( rule__Participant__AttListsAssignment_14_1 ) )
            // InternalPagos.g:2664:2: ( rule__Participant__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getParticipantAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:2665:2: ( rule__Participant__AttListsAssignment_14_1 )
            // InternalPagos.g:2665:3: rule__Participant__AttListsAssignment_14_1
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
    // InternalPagos.g:2674:1: rule__Participant__Group_17__0 : rule__Participant__Group_17__0__Impl rule__Participant__Group_17__1 ;
    public final void rule__Participant__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2678:1: ( rule__Participant__Group_17__0__Impl rule__Participant__Group_17__1 )
            // InternalPagos.g:2679:2: rule__Participant__Group_17__0__Impl rule__Participant__Group_17__1
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
    // InternalPagos.g:2686:1: rule__Participant__Group_17__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2690:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2691:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2691:1: ( RULE_COMMA )
            // InternalPagos.g:2692:2: RULE_COMMA
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
    // InternalPagos.g:2701:1: rule__Participant__Group_17__1 : rule__Participant__Group_17__1__Impl rule__Participant__Group_17__2 ;
    public final void rule__Participant__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2705:1: ( rule__Participant__Group_17__1__Impl rule__Participant__Group_17__2 )
            // InternalPagos.g:2706:2: rule__Participant__Group_17__1__Impl rule__Participant__Group_17__2
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
    // InternalPagos.g:2713:1: rule__Participant__Group_17__1__Impl : ( 'InformationTemplate' ) ;
    public final void rule__Participant__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2717:1: ( ( 'InformationTemplate' ) )
            // InternalPagos.g:2718:1: ( 'InformationTemplate' )
            {
            // InternalPagos.g:2718:1: ( 'InformationTemplate' )
            // InternalPagos.g:2719:2: 'InformationTemplate'
            {
             before(grammarAccess.getParticipantAccess().getInformationTemplateKeyword_17_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalPagos.g:2728:1: rule__Participant__Group_17__2 : rule__Participant__Group_17__2__Impl rule__Participant__Group_17__3 ;
    public final void rule__Participant__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2732:1: ( rule__Participant__Group_17__2__Impl rule__Participant__Group_17__3 )
            // InternalPagos.g:2733:2: rule__Participant__Group_17__2__Impl rule__Participant__Group_17__3
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
    // InternalPagos.g:2740:1: rule__Participant__Group_17__2__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2744:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2745:1: ( RULE_COLON )
            {
            // InternalPagos.g:2745:1: ( RULE_COLON )
            // InternalPagos.g:2746:2: RULE_COLON
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
    // InternalPagos.g:2755:1: rule__Participant__Group_17__3 : rule__Participant__Group_17__3__Impl rule__Participant__Group_17__4 ;
    public final void rule__Participant__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2759:1: ( rule__Participant__Group_17__3__Impl rule__Participant__Group_17__4 )
            // InternalPagos.g:2760:2: rule__Participant__Group_17__3__Impl rule__Participant__Group_17__4
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
    // InternalPagos.g:2767:1: rule__Participant__Group_17__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Participant__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2771:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:2772:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:2772:1: ( RULE_LBRACKET )
            // InternalPagos.g:2773:2: RULE_LBRACKET
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
    // InternalPagos.g:2782:1: rule__Participant__Group_17__4 : rule__Participant__Group_17__4__Impl rule__Participant__Group_17__5 ;
    public final void rule__Participant__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2786:1: ( rule__Participant__Group_17__4__Impl rule__Participant__Group_17__5 )
            // InternalPagos.g:2787:2: rule__Participant__Group_17__4__Impl rule__Participant__Group_17__5
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
    // InternalPagos.g:2794:1: rule__Participant__Group_17__4__Impl : ( ( rule__Participant__TemplatesFormsAssignment_17_4 ) ) ;
    public final void rule__Participant__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2798:1: ( ( ( rule__Participant__TemplatesFormsAssignment_17_4 ) ) )
            // InternalPagos.g:2799:1: ( ( rule__Participant__TemplatesFormsAssignment_17_4 ) )
            {
            // InternalPagos.g:2799:1: ( ( rule__Participant__TemplatesFormsAssignment_17_4 ) )
            // InternalPagos.g:2800:2: ( rule__Participant__TemplatesFormsAssignment_17_4 )
            {
             before(grammarAccess.getParticipantAccess().getTemplatesFormsAssignment_17_4()); 
            // InternalPagos.g:2801:2: ( rule__Participant__TemplatesFormsAssignment_17_4 )
            // InternalPagos.g:2801:3: rule__Participant__TemplatesFormsAssignment_17_4
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
    // InternalPagos.g:2809:1: rule__Participant__Group_17__5 : rule__Participant__Group_17__5__Impl ;
    public final void rule__Participant__Group_17__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2813:1: ( rule__Participant__Group_17__5__Impl )
            // InternalPagos.g:2814:2: rule__Participant__Group_17__5__Impl
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
    // InternalPagos.g:2820:1: rule__Participant__Group_17__5__Impl : ( ( rule__Participant__Group_17_5__0 )* ) ;
    public final void rule__Participant__Group_17__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2824:1: ( ( ( rule__Participant__Group_17_5__0 )* ) )
            // InternalPagos.g:2825:1: ( ( rule__Participant__Group_17_5__0 )* )
            {
            // InternalPagos.g:2825:1: ( ( rule__Participant__Group_17_5__0 )* )
            // InternalPagos.g:2826:2: ( rule__Participant__Group_17_5__0 )*
            {
             before(grammarAccess.getParticipantAccess().getGroup_17_5()); 
            // InternalPagos.g:2827:2: ( rule__Participant__Group_17_5__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPagos.g:2827:3: rule__Participant__Group_17_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Participant__Group_17_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalPagos.g:2836:1: rule__Participant__Group_17_5__0 : rule__Participant__Group_17_5__0__Impl rule__Participant__Group_17_5__1 ;
    public final void rule__Participant__Group_17_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2840:1: ( rule__Participant__Group_17_5__0__Impl rule__Participant__Group_17_5__1 )
            // InternalPagos.g:2841:2: rule__Participant__Group_17_5__0__Impl rule__Participant__Group_17_5__1
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
    // InternalPagos.g:2848:1: rule__Participant__Group_17_5__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group_17_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2852:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2853:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2853:1: ( RULE_COMMA )
            // InternalPagos.g:2854:2: RULE_COMMA
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
    // InternalPagos.g:2863:1: rule__Participant__Group_17_5__1 : rule__Participant__Group_17_5__1__Impl ;
    public final void rule__Participant__Group_17_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2867:1: ( rule__Participant__Group_17_5__1__Impl )
            // InternalPagos.g:2868:2: rule__Participant__Group_17_5__1__Impl
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
    // InternalPagos.g:2874:1: rule__Participant__Group_17_5__1__Impl : ( ( rule__Participant__TemplatesFormsAssignment_17_5_1 ) ) ;
    public final void rule__Participant__Group_17_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2878:1: ( ( ( rule__Participant__TemplatesFormsAssignment_17_5_1 ) ) )
            // InternalPagos.g:2879:1: ( ( rule__Participant__TemplatesFormsAssignment_17_5_1 ) )
            {
            // InternalPagos.g:2879:1: ( ( rule__Participant__TemplatesFormsAssignment_17_5_1 ) )
            // InternalPagos.g:2880:2: ( rule__Participant__TemplatesFormsAssignment_17_5_1 )
            {
             before(grammarAccess.getParticipantAccess().getTemplatesFormsAssignment_17_5_1()); 
            // InternalPagos.g:2881:2: ( rule__Participant__TemplatesFormsAssignment_17_5_1 )
            // InternalPagos.g:2881:3: rule__Participant__TemplatesFormsAssignment_17_5_1
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
    // InternalPagos.g:2890:1: rule__Provider__Group__0 : rule__Provider__Group__0__Impl rule__Provider__Group__1 ;
    public final void rule__Provider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2894:1: ( rule__Provider__Group__0__Impl rule__Provider__Group__1 )
            // InternalPagos.g:2895:2: rule__Provider__Group__0__Impl rule__Provider__Group__1
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
    // InternalPagos.g:2902:1: rule__Provider__Group__0__Impl : ( () ) ;
    public final void rule__Provider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2906:1: ( ( () ) )
            // InternalPagos.g:2907:1: ( () )
            {
            // InternalPagos.g:2907:1: ( () )
            // InternalPagos.g:2908:2: ()
            {
             before(grammarAccess.getProviderAccess().getProviderAction_0()); 
            // InternalPagos.g:2909:2: ()
            // InternalPagos.g:2909:3: 
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
    // InternalPagos.g:2917:1: rule__Provider__Group__1 : rule__Provider__Group__1__Impl rule__Provider__Group__2 ;
    public final void rule__Provider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2921:1: ( rule__Provider__Group__1__Impl rule__Provider__Group__2 )
            // InternalPagos.g:2922:2: rule__Provider__Group__1__Impl rule__Provider__Group__2
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
    // InternalPagos.g:2929:1: rule__Provider__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Provider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2933:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:2934:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:2934:1: ( RULE_LBRACE )
            // InternalPagos.g:2935:2: RULE_LBRACE
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
    // InternalPagos.g:2944:1: rule__Provider__Group__2 : rule__Provider__Group__2__Impl rule__Provider__Group__3 ;
    public final void rule__Provider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2948:1: ( rule__Provider__Group__2__Impl rule__Provider__Group__3 )
            // InternalPagos.g:2949:2: rule__Provider__Group__2__Impl rule__Provider__Group__3
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
    // InternalPagos.g:2956:1: rule__Provider__Group__2__Impl : ( 'name' ) ;
    public final void rule__Provider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2960:1: ( ( 'name' ) )
            // InternalPagos.g:2961:1: ( 'name' )
            {
            // InternalPagos.g:2961:1: ( 'name' )
            // InternalPagos.g:2962:2: 'name'
            {
             before(grammarAccess.getProviderAccess().getNameKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPagos.g:2971:1: rule__Provider__Group__3 : rule__Provider__Group__3__Impl rule__Provider__Group__4 ;
    public final void rule__Provider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2975:1: ( rule__Provider__Group__3__Impl rule__Provider__Group__4 )
            // InternalPagos.g:2976:2: rule__Provider__Group__3__Impl rule__Provider__Group__4
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
    // InternalPagos.g:2983:1: rule__Provider__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Provider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2987:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2988:1: ( RULE_COLON )
            {
            // InternalPagos.g:2988:1: ( RULE_COLON )
            // InternalPagos.g:2989:2: RULE_COLON
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
    // InternalPagos.g:2998:1: rule__Provider__Group__4 : rule__Provider__Group__4__Impl rule__Provider__Group__5 ;
    public final void rule__Provider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3002:1: ( rule__Provider__Group__4__Impl rule__Provider__Group__5 )
            // InternalPagos.g:3003:2: rule__Provider__Group__4__Impl rule__Provider__Group__5
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
    // InternalPagos.g:3010:1: rule__Provider__Group__4__Impl : ( ( rule__Provider__NameAssignment_4 ) ) ;
    public final void rule__Provider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3014:1: ( ( ( rule__Provider__NameAssignment_4 ) ) )
            // InternalPagos.g:3015:1: ( ( rule__Provider__NameAssignment_4 ) )
            {
            // InternalPagos.g:3015:1: ( ( rule__Provider__NameAssignment_4 ) )
            // InternalPagos.g:3016:2: ( rule__Provider__NameAssignment_4 )
            {
             before(grammarAccess.getProviderAccess().getNameAssignment_4()); 
            // InternalPagos.g:3017:2: ( rule__Provider__NameAssignment_4 )
            // InternalPagos.g:3017:3: rule__Provider__NameAssignment_4
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
    // InternalPagos.g:3025:1: rule__Provider__Group__5 : rule__Provider__Group__5__Impl rule__Provider__Group__6 ;
    public final void rule__Provider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3029:1: ( rule__Provider__Group__5__Impl rule__Provider__Group__6 )
            // InternalPagos.g:3030:2: rule__Provider__Group__5__Impl rule__Provider__Group__6
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
    // InternalPagos.g:3037:1: rule__Provider__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Provider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3041:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3042:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3042:1: ( RULE_COMMA )
            // InternalPagos.g:3043:2: RULE_COMMA
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
    // InternalPagos.g:3052:1: rule__Provider__Group__6 : rule__Provider__Group__6__Impl rule__Provider__Group__7 ;
    public final void rule__Provider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3056:1: ( rule__Provider__Group__6__Impl rule__Provider__Group__7 )
            // InternalPagos.g:3057:2: rule__Provider__Group__6__Impl rule__Provider__Group__7
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
    // InternalPagos.g:3064:1: rule__Provider__Group__6__Impl : ( 'description' ) ;
    public final void rule__Provider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3068:1: ( ( 'description' ) )
            // InternalPagos.g:3069:1: ( 'description' )
            {
            // InternalPagos.g:3069:1: ( 'description' )
            // InternalPagos.g:3070:2: 'description'
            {
             before(grammarAccess.getProviderAccess().getDescriptionKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPagos.g:3079:1: rule__Provider__Group__7 : rule__Provider__Group__7__Impl rule__Provider__Group__8 ;
    public final void rule__Provider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3083:1: ( rule__Provider__Group__7__Impl rule__Provider__Group__8 )
            // InternalPagos.g:3084:2: rule__Provider__Group__7__Impl rule__Provider__Group__8
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
    // InternalPagos.g:3091:1: rule__Provider__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__Provider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3095:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3096:1: ( RULE_COLON )
            {
            // InternalPagos.g:3096:1: ( RULE_COLON )
            // InternalPagos.g:3097:2: RULE_COLON
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
    // InternalPagos.g:3106:1: rule__Provider__Group__8 : rule__Provider__Group__8__Impl rule__Provider__Group__9 ;
    public final void rule__Provider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3110:1: ( rule__Provider__Group__8__Impl rule__Provider__Group__9 )
            // InternalPagos.g:3111:2: rule__Provider__Group__8__Impl rule__Provider__Group__9
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
    // InternalPagos.g:3118:1: rule__Provider__Group__8__Impl : ( ( rule__Provider__DescriptionAssignment_8 ) ) ;
    public final void rule__Provider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3122:1: ( ( ( rule__Provider__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:3123:1: ( ( rule__Provider__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:3123:1: ( ( rule__Provider__DescriptionAssignment_8 ) )
            // InternalPagos.g:3124:2: ( rule__Provider__DescriptionAssignment_8 )
            {
             before(grammarAccess.getProviderAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:3125:2: ( rule__Provider__DescriptionAssignment_8 )
            // InternalPagos.g:3125:3: rule__Provider__DescriptionAssignment_8
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
    // InternalPagos.g:3133:1: rule__Provider__Group__9 : rule__Provider__Group__9__Impl rule__Provider__Group__10 ;
    public final void rule__Provider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3137:1: ( rule__Provider__Group__9__Impl rule__Provider__Group__10 )
            // InternalPagos.g:3138:2: rule__Provider__Group__9__Impl rule__Provider__Group__10
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
    // InternalPagos.g:3145:1: rule__Provider__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__Provider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3149:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3150:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3150:1: ( RULE_COMMA )
            // InternalPagos.g:3151:2: RULE_COMMA
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
    // InternalPagos.g:3160:1: rule__Provider__Group__10 : rule__Provider__Group__10__Impl rule__Provider__Group__11 ;
    public final void rule__Provider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3164:1: ( rule__Provider__Group__10__Impl rule__Provider__Group__11 )
            // InternalPagos.g:3165:2: rule__Provider__Group__10__Impl rule__Provider__Group__11
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
    // InternalPagos.g:3172:1: rule__Provider__Group__10__Impl : ( 'attributes' ) ;
    public final void rule__Provider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3176:1: ( ( 'attributes' ) )
            // InternalPagos.g:3177:1: ( 'attributes' )
            {
            // InternalPagos.g:3177:1: ( 'attributes' )
            // InternalPagos.g:3178:2: 'attributes'
            {
             before(grammarAccess.getProviderAccess().getAttributesKeyword_10()); 
            match(input,34,FOLLOW_2); 
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
    // InternalPagos.g:3187:1: rule__Provider__Group__11 : rule__Provider__Group__11__Impl rule__Provider__Group__12 ;
    public final void rule__Provider__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3191:1: ( rule__Provider__Group__11__Impl rule__Provider__Group__12 )
            // InternalPagos.g:3192:2: rule__Provider__Group__11__Impl rule__Provider__Group__12
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
    // InternalPagos.g:3199:1: rule__Provider__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__Provider__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3203:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3204:1: ( RULE_COLON )
            {
            // InternalPagos.g:3204:1: ( RULE_COLON )
            // InternalPagos.g:3205:2: RULE_COLON
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
    // InternalPagos.g:3214:1: rule__Provider__Group__12 : rule__Provider__Group__12__Impl rule__Provider__Group__13 ;
    public final void rule__Provider__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3218:1: ( rule__Provider__Group__12__Impl rule__Provider__Group__13 )
            // InternalPagos.g:3219:2: rule__Provider__Group__12__Impl rule__Provider__Group__13
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
    // InternalPagos.g:3226:1: rule__Provider__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Provider__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3230:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:3231:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:3231:1: ( RULE_LBRACKET )
            // InternalPagos.g:3232:2: RULE_LBRACKET
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
    // InternalPagos.g:3241:1: rule__Provider__Group__13 : rule__Provider__Group__13__Impl rule__Provider__Group__14 ;
    public final void rule__Provider__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3245:1: ( rule__Provider__Group__13__Impl rule__Provider__Group__14 )
            // InternalPagos.g:3246:2: rule__Provider__Group__13__Impl rule__Provider__Group__14
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
    // InternalPagos.g:3253:1: rule__Provider__Group__13__Impl : ( ( rule__Provider__AttListsAssignment_13 ) ) ;
    public final void rule__Provider__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3257:1: ( ( ( rule__Provider__AttListsAssignment_13 ) ) )
            // InternalPagos.g:3258:1: ( ( rule__Provider__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:3258:1: ( ( rule__Provider__AttListsAssignment_13 ) )
            // InternalPagos.g:3259:2: ( rule__Provider__AttListsAssignment_13 )
            {
             before(grammarAccess.getProviderAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:3260:2: ( rule__Provider__AttListsAssignment_13 )
            // InternalPagos.g:3260:3: rule__Provider__AttListsAssignment_13
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
    // InternalPagos.g:3268:1: rule__Provider__Group__14 : rule__Provider__Group__14__Impl rule__Provider__Group__15 ;
    public final void rule__Provider__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3272:1: ( rule__Provider__Group__14__Impl rule__Provider__Group__15 )
            // InternalPagos.g:3273:2: rule__Provider__Group__14__Impl rule__Provider__Group__15
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
    // InternalPagos.g:3280:1: rule__Provider__Group__14__Impl : ( ( rule__Provider__Group_14__0 )* ) ;
    public final void rule__Provider__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3284:1: ( ( ( rule__Provider__Group_14__0 )* ) )
            // InternalPagos.g:3285:1: ( ( rule__Provider__Group_14__0 )* )
            {
            // InternalPagos.g:3285:1: ( ( rule__Provider__Group_14__0 )* )
            // InternalPagos.g:3286:2: ( rule__Provider__Group_14__0 )*
            {
             before(grammarAccess.getProviderAccess().getGroup_14()); 
            // InternalPagos.g:3287:2: ( rule__Provider__Group_14__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPagos.g:3287:3: rule__Provider__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Provider__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalPagos.g:3295:1: rule__Provider__Group__15 : rule__Provider__Group__15__Impl rule__Provider__Group__16 ;
    public final void rule__Provider__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3299:1: ( rule__Provider__Group__15__Impl rule__Provider__Group__16 )
            // InternalPagos.g:3300:2: rule__Provider__Group__15__Impl rule__Provider__Group__16
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
    // InternalPagos.g:3307:1: rule__Provider__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Provider__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3311:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:3312:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:3312:1: ( RULE_RBRACKET )
            // InternalPagos.g:3313:2: RULE_RBRACKET
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
    // InternalPagos.g:3322:1: rule__Provider__Group__16 : rule__Provider__Group__16__Impl ;
    public final void rule__Provider__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3326:1: ( rule__Provider__Group__16__Impl )
            // InternalPagos.g:3327:2: rule__Provider__Group__16__Impl
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
    // InternalPagos.g:3333:1: rule__Provider__Group__16__Impl : ( RULE_RBRACE ) ;
    public final void rule__Provider__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3337:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:3338:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:3338:1: ( RULE_RBRACE )
            // InternalPagos.g:3339:2: RULE_RBRACE
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
    // InternalPagos.g:3349:1: rule__Provider__Group_14__0 : rule__Provider__Group_14__0__Impl rule__Provider__Group_14__1 ;
    public final void rule__Provider__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3353:1: ( rule__Provider__Group_14__0__Impl rule__Provider__Group_14__1 )
            // InternalPagos.g:3354:2: rule__Provider__Group_14__0__Impl rule__Provider__Group_14__1
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
    // InternalPagos.g:3361:1: rule__Provider__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Provider__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3365:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3366:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3366:1: ( RULE_COMMA )
            // InternalPagos.g:3367:2: RULE_COMMA
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
    // InternalPagos.g:3376:1: rule__Provider__Group_14__1 : rule__Provider__Group_14__1__Impl ;
    public final void rule__Provider__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3380:1: ( rule__Provider__Group_14__1__Impl )
            // InternalPagos.g:3381:2: rule__Provider__Group_14__1__Impl
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
    // InternalPagos.g:3387:1: rule__Provider__Group_14__1__Impl : ( ( rule__Provider__AttListsAssignment_14_1 ) ) ;
    public final void rule__Provider__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3391:1: ( ( ( rule__Provider__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:3392:1: ( ( rule__Provider__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:3392:1: ( ( rule__Provider__AttListsAssignment_14_1 ) )
            // InternalPagos.g:3393:2: ( rule__Provider__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getProviderAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:3394:2: ( rule__Provider__AttListsAssignment_14_1 )
            // InternalPagos.g:3394:3: rule__Provider__AttListsAssignment_14_1
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
    // InternalPagos.g:3403:1: rule__InformationTemplate__Group__0 : rule__InformationTemplate__Group__0__Impl rule__InformationTemplate__Group__1 ;
    public final void rule__InformationTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3407:1: ( rule__InformationTemplate__Group__0__Impl rule__InformationTemplate__Group__1 )
            // InternalPagos.g:3408:2: rule__InformationTemplate__Group__0__Impl rule__InformationTemplate__Group__1
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
    // InternalPagos.g:3415:1: rule__InformationTemplate__Group__0__Impl : ( () ) ;
    public final void rule__InformationTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3419:1: ( ( () ) )
            // InternalPagos.g:3420:1: ( () )
            {
            // InternalPagos.g:3420:1: ( () )
            // InternalPagos.g:3421:2: ()
            {
             before(grammarAccess.getInformationTemplateAccess().getInformationTemplateAction_0()); 
            // InternalPagos.g:3422:2: ()
            // InternalPagos.g:3422:3: 
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
    // InternalPagos.g:3430:1: rule__InformationTemplate__Group__1 : rule__InformationTemplate__Group__1__Impl rule__InformationTemplate__Group__2 ;
    public final void rule__InformationTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3434:1: ( rule__InformationTemplate__Group__1__Impl rule__InformationTemplate__Group__2 )
            // InternalPagos.g:3435:2: rule__InformationTemplate__Group__1__Impl rule__InformationTemplate__Group__2
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
    // InternalPagos.g:3442:1: rule__InformationTemplate__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__InformationTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3446:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:3447:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:3447:1: ( RULE_LBRACE )
            // InternalPagos.g:3448:2: RULE_LBRACE
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
    // InternalPagos.g:3457:1: rule__InformationTemplate__Group__2 : rule__InformationTemplate__Group__2__Impl rule__InformationTemplate__Group__3 ;
    public final void rule__InformationTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3461:1: ( rule__InformationTemplate__Group__2__Impl rule__InformationTemplate__Group__3 )
            // InternalPagos.g:3462:2: rule__InformationTemplate__Group__2__Impl rule__InformationTemplate__Group__3
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
    // InternalPagos.g:3469:1: rule__InformationTemplate__Group__2__Impl : ( 'name' ) ;
    public final void rule__InformationTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3473:1: ( ( 'name' ) )
            // InternalPagos.g:3474:1: ( 'name' )
            {
            // InternalPagos.g:3474:1: ( 'name' )
            // InternalPagos.g:3475:2: 'name'
            {
             before(grammarAccess.getInformationTemplateAccess().getNameKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPagos.g:3484:1: rule__InformationTemplate__Group__3 : rule__InformationTemplate__Group__3__Impl rule__InformationTemplate__Group__4 ;
    public final void rule__InformationTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3488:1: ( rule__InformationTemplate__Group__3__Impl rule__InformationTemplate__Group__4 )
            // InternalPagos.g:3489:2: rule__InformationTemplate__Group__3__Impl rule__InformationTemplate__Group__4
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
    // InternalPagos.g:3496:1: rule__InformationTemplate__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3500:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3501:1: ( RULE_COLON )
            {
            // InternalPagos.g:3501:1: ( RULE_COLON )
            // InternalPagos.g:3502:2: RULE_COLON
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
    // InternalPagos.g:3511:1: rule__InformationTemplate__Group__4 : rule__InformationTemplate__Group__4__Impl rule__InformationTemplate__Group__5 ;
    public final void rule__InformationTemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3515:1: ( rule__InformationTemplate__Group__4__Impl rule__InformationTemplate__Group__5 )
            // InternalPagos.g:3516:2: rule__InformationTemplate__Group__4__Impl rule__InformationTemplate__Group__5
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
    // InternalPagos.g:3523:1: rule__InformationTemplate__Group__4__Impl : ( ( rule__InformationTemplate__NameAssignment_4 ) ) ;
    public final void rule__InformationTemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3527:1: ( ( ( rule__InformationTemplate__NameAssignment_4 ) ) )
            // InternalPagos.g:3528:1: ( ( rule__InformationTemplate__NameAssignment_4 ) )
            {
            // InternalPagos.g:3528:1: ( ( rule__InformationTemplate__NameAssignment_4 ) )
            // InternalPagos.g:3529:2: ( rule__InformationTemplate__NameAssignment_4 )
            {
             before(grammarAccess.getInformationTemplateAccess().getNameAssignment_4()); 
            // InternalPagos.g:3530:2: ( rule__InformationTemplate__NameAssignment_4 )
            // InternalPagos.g:3530:3: rule__InformationTemplate__NameAssignment_4
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
    // InternalPagos.g:3538:1: rule__InformationTemplate__Group__5 : rule__InformationTemplate__Group__5__Impl rule__InformationTemplate__Group__6 ;
    public final void rule__InformationTemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3542:1: ( rule__InformationTemplate__Group__5__Impl rule__InformationTemplate__Group__6 )
            // InternalPagos.g:3543:2: rule__InformationTemplate__Group__5__Impl rule__InformationTemplate__Group__6
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
    // InternalPagos.g:3550:1: rule__InformationTemplate__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3554:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3555:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3555:1: ( RULE_COMMA )
            // InternalPagos.g:3556:2: RULE_COMMA
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
    // InternalPagos.g:3565:1: rule__InformationTemplate__Group__6 : rule__InformationTemplate__Group__6__Impl rule__InformationTemplate__Group__7 ;
    public final void rule__InformationTemplate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3569:1: ( rule__InformationTemplate__Group__6__Impl rule__InformationTemplate__Group__7 )
            // InternalPagos.g:3570:2: rule__InformationTemplate__Group__6__Impl rule__InformationTemplate__Group__7
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
    // InternalPagos.g:3577:1: rule__InformationTemplate__Group__6__Impl : ( 'description' ) ;
    public final void rule__InformationTemplate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3581:1: ( ( 'description' ) )
            // InternalPagos.g:3582:1: ( 'description' )
            {
            // InternalPagos.g:3582:1: ( 'description' )
            // InternalPagos.g:3583:2: 'description'
            {
             before(grammarAccess.getInformationTemplateAccess().getDescriptionKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPagos.g:3592:1: rule__InformationTemplate__Group__7 : rule__InformationTemplate__Group__7__Impl rule__InformationTemplate__Group__8 ;
    public final void rule__InformationTemplate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3596:1: ( rule__InformationTemplate__Group__7__Impl rule__InformationTemplate__Group__8 )
            // InternalPagos.g:3597:2: rule__InformationTemplate__Group__7__Impl rule__InformationTemplate__Group__8
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
    // InternalPagos.g:3604:1: rule__InformationTemplate__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3608:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3609:1: ( RULE_COLON )
            {
            // InternalPagos.g:3609:1: ( RULE_COLON )
            // InternalPagos.g:3610:2: RULE_COLON
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
    // InternalPagos.g:3619:1: rule__InformationTemplate__Group__8 : rule__InformationTemplate__Group__8__Impl rule__InformationTemplate__Group__9 ;
    public final void rule__InformationTemplate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3623:1: ( rule__InformationTemplate__Group__8__Impl rule__InformationTemplate__Group__9 )
            // InternalPagos.g:3624:2: rule__InformationTemplate__Group__8__Impl rule__InformationTemplate__Group__9
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
    // InternalPagos.g:3631:1: rule__InformationTemplate__Group__8__Impl : ( ( rule__InformationTemplate__DescriptionAssignment_8 ) ) ;
    public final void rule__InformationTemplate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3635:1: ( ( ( rule__InformationTemplate__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:3636:1: ( ( rule__InformationTemplate__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:3636:1: ( ( rule__InformationTemplate__DescriptionAssignment_8 ) )
            // InternalPagos.g:3637:2: ( rule__InformationTemplate__DescriptionAssignment_8 )
            {
             before(grammarAccess.getInformationTemplateAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:3638:2: ( rule__InformationTemplate__DescriptionAssignment_8 )
            // InternalPagos.g:3638:3: rule__InformationTemplate__DescriptionAssignment_8
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
    // InternalPagos.g:3646:1: rule__InformationTemplate__Group__9 : rule__InformationTemplate__Group__9__Impl rule__InformationTemplate__Group__10 ;
    public final void rule__InformationTemplate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3650:1: ( rule__InformationTemplate__Group__9__Impl rule__InformationTemplate__Group__10 )
            // InternalPagos.g:3651:2: rule__InformationTemplate__Group__9__Impl rule__InformationTemplate__Group__10
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
    // InternalPagos.g:3658:1: rule__InformationTemplate__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3662:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3663:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3663:1: ( RULE_COMMA )
            // InternalPagos.g:3664:2: RULE_COMMA
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
    // InternalPagos.g:3673:1: rule__InformationTemplate__Group__10 : rule__InformationTemplate__Group__10__Impl rule__InformationTemplate__Group__11 ;
    public final void rule__InformationTemplate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3677:1: ( rule__InformationTemplate__Group__10__Impl rule__InformationTemplate__Group__11 )
            // InternalPagos.g:3678:2: rule__InformationTemplate__Group__10__Impl rule__InformationTemplate__Group__11
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
    // InternalPagos.g:3685:1: rule__InformationTemplate__Group__10__Impl : ( 'FormAttributes' ) ;
    public final void rule__InformationTemplate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3689:1: ( ( 'FormAttributes' ) )
            // InternalPagos.g:3690:1: ( 'FormAttributes' )
            {
            // InternalPagos.g:3690:1: ( 'FormAttributes' )
            // InternalPagos.g:3691:2: 'FormAttributes'
            {
             before(grammarAccess.getInformationTemplateAccess().getFormAttributesKeyword_10()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPagos.g:3700:1: rule__InformationTemplate__Group__11 : rule__InformationTemplate__Group__11__Impl rule__InformationTemplate__Group__12 ;
    public final void rule__InformationTemplate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3704:1: ( rule__InformationTemplate__Group__11__Impl rule__InformationTemplate__Group__12 )
            // InternalPagos.g:3705:2: rule__InformationTemplate__Group__11__Impl rule__InformationTemplate__Group__12
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
    // InternalPagos.g:3712:1: rule__InformationTemplate__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3716:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3717:1: ( RULE_COLON )
            {
            // InternalPagos.g:3717:1: ( RULE_COLON )
            // InternalPagos.g:3718:2: RULE_COLON
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
    // InternalPagos.g:3727:1: rule__InformationTemplate__Group__12 : rule__InformationTemplate__Group__12__Impl rule__InformationTemplate__Group__13 ;
    public final void rule__InformationTemplate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3731:1: ( rule__InformationTemplate__Group__12__Impl rule__InformationTemplate__Group__13 )
            // InternalPagos.g:3732:2: rule__InformationTemplate__Group__12__Impl rule__InformationTemplate__Group__13
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
    // InternalPagos.g:3739:1: rule__InformationTemplate__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__InformationTemplate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3743:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:3744:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:3744:1: ( RULE_LBRACKET )
            // InternalPagos.g:3745:2: RULE_LBRACKET
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
    // InternalPagos.g:3754:1: rule__InformationTemplate__Group__13 : rule__InformationTemplate__Group__13__Impl rule__InformationTemplate__Group__14 ;
    public final void rule__InformationTemplate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3758:1: ( rule__InformationTemplate__Group__13__Impl rule__InformationTemplate__Group__14 )
            // InternalPagos.g:3759:2: rule__InformationTemplate__Group__13__Impl rule__InformationTemplate__Group__14
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
    // InternalPagos.g:3766:1: rule__InformationTemplate__Group__13__Impl : ( ( rule__InformationTemplate__AttListsAssignment_13 ) ) ;
    public final void rule__InformationTemplate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3770:1: ( ( ( rule__InformationTemplate__AttListsAssignment_13 ) ) )
            // InternalPagos.g:3771:1: ( ( rule__InformationTemplate__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:3771:1: ( ( rule__InformationTemplate__AttListsAssignment_13 ) )
            // InternalPagos.g:3772:2: ( rule__InformationTemplate__AttListsAssignment_13 )
            {
             before(grammarAccess.getInformationTemplateAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:3773:2: ( rule__InformationTemplate__AttListsAssignment_13 )
            // InternalPagos.g:3773:3: rule__InformationTemplate__AttListsAssignment_13
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
    // InternalPagos.g:3781:1: rule__InformationTemplate__Group__14 : rule__InformationTemplate__Group__14__Impl rule__InformationTemplate__Group__15 ;
    public final void rule__InformationTemplate__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3785:1: ( rule__InformationTemplate__Group__14__Impl rule__InformationTemplate__Group__15 )
            // InternalPagos.g:3786:2: rule__InformationTemplate__Group__14__Impl rule__InformationTemplate__Group__15
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
    // InternalPagos.g:3793:1: rule__InformationTemplate__Group__14__Impl : ( ( rule__InformationTemplate__Group_14__0 )* ) ;
    public final void rule__InformationTemplate__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3797:1: ( ( ( rule__InformationTemplate__Group_14__0 )* ) )
            // InternalPagos.g:3798:1: ( ( rule__InformationTemplate__Group_14__0 )* )
            {
            // InternalPagos.g:3798:1: ( ( rule__InformationTemplate__Group_14__0 )* )
            // InternalPagos.g:3799:2: ( rule__InformationTemplate__Group_14__0 )*
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_14()); 
            // InternalPagos.g:3800:2: ( rule__InformationTemplate__Group_14__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPagos.g:3800:3: rule__InformationTemplate__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InformationTemplate__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalPagos.g:3808:1: rule__InformationTemplate__Group__15 : rule__InformationTemplate__Group__15__Impl rule__InformationTemplate__Group__16 ;
    public final void rule__InformationTemplate__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3812:1: ( rule__InformationTemplate__Group__15__Impl rule__InformationTemplate__Group__16 )
            // InternalPagos.g:3813:2: rule__InformationTemplate__Group__15__Impl rule__InformationTemplate__Group__16
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
    // InternalPagos.g:3820:1: rule__InformationTemplate__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__InformationTemplate__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3824:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:3825:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:3825:1: ( RULE_RBRACKET )
            // InternalPagos.g:3826:2: RULE_RBRACKET
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
    // InternalPagos.g:3835:1: rule__InformationTemplate__Group__16 : rule__InformationTemplate__Group__16__Impl rule__InformationTemplate__Group__17 ;
    public final void rule__InformationTemplate__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3839:1: ( rule__InformationTemplate__Group__16__Impl rule__InformationTemplate__Group__17 )
            // InternalPagos.g:3840:2: rule__InformationTemplate__Group__16__Impl rule__InformationTemplate__Group__17
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
    // InternalPagos.g:3847:1: rule__InformationTemplate__Group__16__Impl : ( RULE_RBRACE ) ;
    public final void rule__InformationTemplate__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3851:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:3852:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:3852:1: ( RULE_RBRACE )
            // InternalPagos.g:3853:2: RULE_RBRACE
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
    // InternalPagos.g:3862:1: rule__InformationTemplate__Group__17 : rule__InformationTemplate__Group__17__Impl rule__InformationTemplate__Group__18 ;
    public final void rule__InformationTemplate__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3866:1: ( rule__InformationTemplate__Group__17__Impl rule__InformationTemplate__Group__18 )
            // InternalPagos.g:3867:2: rule__InformationTemplate__Group__17__Impl rule__InformationTemplate__Group__18
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
    // InternalPagos.g:3874:1: rule__InformationTemplate__Group__17__Impl : ( ( rule__InformationTemplate__Group_17__0 )? ) ;
    public final void rule__InformationTemplate__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3878:1: ( ( ( rule__InformationTemplate__Group_17__0 )? ) )
            // InternalPagos.g:3879:1: ( ( rule__InformationTemplate__Group_17__0 )? )
            {
            // InternalPagos.g:3879:1: ( ( rule__InformationTemplate__Group_17__0 )? )
            // InternalPagos.g:3880:2: ( rule__InformationTemplate__Group_17__0 )?
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_17()); 
            // InternalPagos.g:3881:2: ( rule__InformationTemplate__Group_17__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_COMMA) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==38) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalPagos.g:3881:3: rule__InformationTemplate__Group_17__0
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
    // InternalPagos.g:3889:1: rule__InformationTemplate__Group__18 : rule__InformationTemplate__Group__18__Impl ;
    public final void rule__InformationTemplate__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3893:1: ( rule__InformationTemplate__Group__18__Impl )
            // InternalPagos.g:3894:2: rule__InformationTemplate__Group__18__Impl
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
    // InternalPagos.g:3900:1: rule__InformationTemplate__Group__18__Impl : ( ( rule__InformationTemplate__Group_18__0 )? ) ;
    public final void rule__InformationTemplate__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3904:1: ( ( ( rule__InformationTemplate__Group_18__0 )? ) )
            // InternalPagos.g:3905:1: ( ( rule__InformationTemplate__Group_18__0 )? )
            {
            // InternalPagos.g:3905:1: ( ( rule__InformationTemplate__Group_18__0 )? )
            // InternalPagos.g:3906:2: ( rule__InformationTemplate__Group_18__0 )?
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_18()); 
            // InternalPagos.g:3907:2: ( rule__InformationTemplate__Group_18__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_COMMA) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==39) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalPagos.g:3907:3: rule__InformationTemplate__Group_18__0
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
    // InternalPagos.g:3916:1: rule__InformationTemplate__Group_14__0 : rule__InformationTemplate__Group_14__0__Impl rule__InformationTemplate__Group_14__1 ;
    public final void rule__InformationTemplate__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3920:1: ( rule__InformationTemplate__Group_14__0__Impl rule__InformationTemplate__Group_14__1 )
            // InternalPagos.g:3921:2: rule__InformationTemplate__Group_14__0__Impl rule__InformationTemplate__Group_14__1
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
    // InternalPagos.g:3928:1: rule__InformationTemplate__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3932:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3933:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3933:1: ( RULE_COMMA )
            // InternalPagos.g:3934:2: RULE_COMMA
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
    // InternalPagos.g:3943:1: rule__InformationTemplate__Group_14__1 : rule__InformationTemplate__Group_14__1__Impl ;
    public final void rule__InformationTemplate__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3947:1: ( rule__InformationTemplate__Group_14__1__Impl )
            // InternalPagos.g:3948:2: rule__InformationTemplate__Group_14__1__Impl
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
    // InternalPagos.g:3954:1: rule__InformationTemplate__Group_14__1__Impl : ( ( rule__InformationTemplate__AttListsAssignment_14_1 ) ) ;
    public final void rule__InformationTemplate__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3958:1: ( ( ( rule__InformationTemplate__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:3959:1: ( ( rule__InformationTemplate__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:3959:1: ( ( rule__InformationTemplate__AttListsAssignment_14_1 ) )
            // InternalPagos.g:3960:2: ( rule__InformationTemplate__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getInformationTemplateAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:3961:2: ( rule__InformationTemplate__AttListsAssignment_14_1 )
            // InternalPagos.g:3961:3: rule__InformationTemplate__AttListsAssignment_14_1
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
    // InternalPagos.g:3970:1: rule__InformationTemplate__Group_17__0 : rule__InformationTemplate__Group_17__0__Impl rule__InformationTemplate__Group_17__1 ;
    public final void rule__InformationTemplate__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3974:1: ( rule__InformationTemplate__Group_17__0__Impl rule__InformationTemplate__Group_17__1 )
            // InternalPagos.g:3975:2: rule__InformationTemplate__Group_17__0__Impl rule__InformationTemplate__Group_17__1
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
    // InternalPagos.g:3982:1: rule__InformationTemplate__Group_17__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3986:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3987:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3987:1: ( RULE_COMMA )
            // InternalPagos.g:3988:2: RULE_COMMA
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
    // InternalPagos.g:3997:1: rule__InformationTemplate__Group_17__1 : rule__InformationTemplate__Group_17__1__Impl rule__InformationTemplate__Group_17__2 ;
    public final void rule__InformationTemplate__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4001:1: ( rule__InformationTemplate__Group_17__1__Impl rule__InformationTemplate__Group_17__2 )
            // InternalPagos.g:4002:2: rule__InformationTemplate__Group_17__1__Impl rule__InformationTemplate__Group_17__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalPagos.g:4009:1: rule__InformationTemplate__Group_17__1__Impl : ( 'calculationtemplates' ) ;
    public final void rule__InformationTemplate__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4013:1: ( ( 'calculationtemplates' ) )
            // InternalPagos.g:4014:1: ( 'calculationtemplates' )
            {
            // InternalPagos.g:4014:1: ( 'calculationtemplates' )
            // InternalPagos.g:4015:2: 'calculationtemplates'
            {
             before(grammarAccess.getInformationTemplateAccess().getCalculationtemplatesKeyword_17_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalPagos.g:4024:1: rule__InformationTemplate__Group_17__2 : rule__InformationTemplate__Group_17__2__Impl rule__InformationTemplate__Group_17__3 ;
    public final void rule__InformationTemplate__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4028:1: ( rule__InformationTemplate__Group_17__2__Impl rule__InformationTemplate__Group_17__3 )
            // InternalPagos.g:4029:2: rule__InformationTemplate__Group_17__2__Impl rule__InformationTemplate__Group_17__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalPagos.g:4036:1: rule__InformationTemplate__Group_17__2__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4040:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4041:1: ( RULE_COLON )
            {
            // InternalPagos.g:4041:1: ( RULE_COLON )
            // InternalPagos.g:4042:2: RULE_COLON
            {
             before(grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_17_2()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_17_2()); 

            }


            }

        }
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
    // InternalPagos.g:4051:1: rule__InformationTemplate__Group_17__3 : rule__InformationTemplate__Group_17__3__Impl rule__InformationTemplate__Group_17__4 ;
    public final void rule__InformationTemplate__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4055:1: ( rule__InformationTemplate__Group_17__3__Impl rule__InformationTemplate__Group_17__4 )
            // InternalPagos.g:4056:2: rule__InformationTemplate__Group_17__3__Impl rule__InformationTemplate__Group_17__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalPagos.g:4063:1: rule__InformationTemplate__Group_17__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__InformationTemplate__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4067:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:4068:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:4068:1: ( RULE_LBRACKET )
            // InternalPagos.g:4069:2: RULE_LBRACKET
            {
             before(grammarAccess.getInformationTemplateAccess().getLBRACKETTerminalRuleCall_17_3()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getLBRACKETTerminalRuleCall_17_3()); 

            }


            }

        }
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
    // InternalPagos.g:4078:1: rule__InformationTemplate__Group_17__4 : rule__InformationTemplate__Group_17__4__Impl rule__InformationTemplate__Group_17__5 ;
    public final void rule__InformationTemplate__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4082:1: ( rule__InformationTemplate__Group_17__4__Impl rule__InformationTemplate__Group_17__5 )
            // InternalPagos.g:4083:2: rule__InformationTemplate__Group_17__4__Impl rule__InformationTemplate__Group_17__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalPagos.g:4090:1: rule__InformationTemplate__Group_17__4__Impl : ( ( rule__InformationTemplate__TemplatesAssignment_17_4 ) ) ;
    public final void rule__InformationTemplate__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4094:1: ( ( ( rule__InformationTemplate__TemplatesAssignment_17_4 ) ) )
            // InternalPagos.g:4095:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_4 ) )
            {
            // InternalPagos.g:4095:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_4 ) )
            // InternalPagos.g:4096:2: ( rule__InformationTemplate__TemplatesAssignment_17_4 )
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_4()); 
            // InternalPagos.g:4097:2: ( rule__InformationTemplate__TemplatesAssignment_17_4 )
            // InternalPagos.g:4097:3: rule__InformationTemplate__TemplatesAssignment_17_4
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__TemplatesAssignment_17_4();

            state._fsp--;


            }

             after(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_4()); 

            }


            }

        }
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
    // InternalPagos.g:4105:1: rule__InformationTemplate__Group_17__5 : rule__InformationTemplate__Group_17__5__Impl rule__InformationTemplate__Group_17__6 ;
    public final void rule__InformationTemplate__Group_17__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4109:1: ( rule__InformationTemplate__Group_17__5__Impl rule__InformationTemplate__Group_17__6 )
            // InternalPagos.g:4110:2: rule__InformationTemplate__Group_17__5__Impl rule__InformationTemplate__Group_17__6
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
    // InternalPagos.g:4117:1: rule__InformationTemplate__Group_17__5__Impl : ( ( rule__InformationTemplate__Group_17_5__0 )* ) ;
    public final void rule__InformationTemplate__Group_17__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4121:1: ( ( ( rule__InformationTemplate__Group_17_5__0 )* ) )
            // InternalPagos.g:4122:1: ( ( rule__InformationTemplate__Group_17_5__0 )* )
            {
            // InternalPagos.g:4122:1: ( ( rule__InformationTemplate__Group_17_5__0 )* )
            // InternalPagos.g:4123:2: ( rule__InformationTemplate__Group_17_5__0 )*
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_17_5()); 
            // InternalPagos.g:4124:2: ( rule__InformationTemplate__Group_17_5__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPagos.g:4124:3: rule__InformationTemplate__Group_17_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InformationTemplate__Group_17_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getInformationTemplateAccess().getGroup_17_5()); 

            }


            }

        }
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
    // InternalPagos.g:4132:1: rule__InformationTemplate__Group_17__6 : rule__InformationTemplate__Group_17__6__Impl ;
    public final void rule__InformationTemplate__Group_17__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4136:1: ( rule__InformationTemplate__Group_17__6__Impl )
            // InternalPagos.g:4137:2: rule__InformationTemplate__Group_17__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_17__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalPagos.g:4143:1: rule__InformationTemplate__Group_17__6__Impl : ( RULE_RBRACKET ) ;
    public final void rule__InformationTemplate__Group_17__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4147:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:4148:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:4148:1: ( RULE_RBRACKET )
            // InternalPagos.g:4149:2: RULE_RBRACKET
            {
             before(grammarAccess.getInformationTemplateAccess().getRBRACKETTerminalRuleCall_17_6()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getRBRACKETTerminalRuleCall_17_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__InformationTemplate__Group_17_5__0"
    // InternalPagos.g:4159:1: rule__InformationTemplate__Group_17_5__0 : rule__InformationTemplate__Group_17_5__0__Impl rule__InformationTemplate__Group_17_5__1 ;
    public final void rule__InformationTemplate__Group_17_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4163:1: ( rule__InformationTemplate__Group_17_5__0__Impl rule__InformationTemplate__Group_17_5__1 )
            // InternalPagos.g:4164:2: rule__InformationTemplate__Group_17_5__0__Impl rule__InformationTemplate__Group_17_5__1
            {
            pushFollow(FOLLOW_8);
            rule__InformationTemplate__Group_17_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_17_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17_5__0"


    // $ANTLR start "rule__InformationTemplate__Group_17_5__0__Impl"
    // InternalPagos.g:4171:1: rule__InformationTemplate__Group_17_5__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_17_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4175:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4176:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4176:1: ( RULE_COMMA )
            // InternalPagos.g:4177:2: RULE_COMMA
            {
             before(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_17_5_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_17_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17_5__0__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_17_5__1"
    // InternalPagos.g:4186:1: rule__InformationTemplate__Group_17_5__1 : rule__InformationTemplate__Group_17_5__1__Impl ;
    public final void rule__InformationTemplate__Group_17_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4190:1: ( rule__InformationTemplate__Group_17_5__1__Impl )
            // InternalPagos.g:4191:2: rule__InformationTemplate__Group_17_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__Group_17_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17_5__1"


    // $ANTLR start "rule__InformationTemplate__Group_17_5__1__Impl"
    // InternalPagos.g:4197:1: rule__InformationTemplate__Group_17_5__1__Impl : ( ( rule__InformationTemplate__TemplatesAssignment_17_5_1 ) ) ;
    public final void rule__InformationTemplate__Group_17_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4201:1: ( ( ( rule__InformationTemplate__TemplatesAssignment_17_5_1 ) ) )
            // InternalPagos.g:4202:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_5_1 ) )
            {
            // InternalPagos.g:4202:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_5_1 ) )
            // InternalPagos.g:4203:2: ( rule__InformationTemplate__TemplatesAssignment_17_5_1 )
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_5_1()); 
            // InternalPagos.g:4204:2: ( rule__InformationTemplate__TemplatesAssignment_17_5_1 )
            // InternalPagos.g:4204:3: rule__InformationTemplate__TemplatesAssignment_17_5_1
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__TemplatesAssignment_17_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__Group_17_5__1__Impl"


    // $ANTLR start "rule__InformationTemplate__Group_18__0"
    // InternalPagos.g:4213:1: rule__InformationTemplate__Group_18__0 : rule__InformationTemplate__Group_18__0__Impl rule__InformationTemplate__Group_18__1 ;
    public final void rule__InformationTemplate__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4217:1: ( rule__InformationTemplate__Group_18__0__Impl rule__InformationTemplate__Group_18__1 )
            // InternalPagos.g:4218:2: rule__InformationTemplate__Group_18__0__Impl rule__InformationTemplate__Group_18__1
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
    // InternalPagos.g:4225:1: rule__InformationTemplate__Group_18__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4229:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4230:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4230:1: ( RULE_COMMA )
            // InternalPagos.g:4231:2: RULE_COMMA
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
    // InternalPagos.g:4240:1: rule__InformationTemplate__Group_18__1 : rule__InformationTemplate__Group_18__1__Impl rule__InformationTemplate__Group_18__2 ;
    public final void rule__InformationTemplate__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4244:1: ( rule__InformationTemplate__Group_18__1__Impl rule__InformationTemplate__Group_18__2 )
            // InternalPagos.g:4245:2: rule__InformationTemplate__Group_18__1__Impl rule__InformationTemplate__Group_18__2
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
    // InternalPagos.g:4252:1: rule__InformationTemplate__Group_18__1__Impl : ( 'providers' ) ;
    public final void rule__InformationTemplate__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4256:1: ( ( 'providers' ) )
            // InternalPagos.g:4257:1: ( 'providers' )
            {
            // InternalPagos.g:4257:1: ( 'providers' )
            // InternalPagos.g:4258:2: 'providers'
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersKeyword_18_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalPagos.g:4267:1: rule__InformationTemplate__Group_18__2 : rule__InformationTemplate__Group_18__2__Impl rule__InformationTemplate__Group_18__3 ;
    public final void rule__InformationTemplate__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4271:1: ( rule__InformationTemplate__Group_18__2__Impl rule__InformationTemplate__Group_18__3 )
            // InternalPagos.g:4272:2: rule__InformationTemplate__Group_18__2__Impl rule__InformationTemplate__Group_18__3
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
    // InternalPagos.g:4279:1: rule__InformationTemplate__Group_18__2__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4283:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4284:1: ( RULE_COLON )
            {
            // InternalPagos.g:4284:1: ( RULE_COLON )
            // InternalPagos.g:4285:2: RULE_COLON
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
    // InternalPagos.g:4294:1: rule__InformationTemplate__Group_18__3 : rule__InformationTemplate__Group_18__3__Impl rule__InformationTemplate__Group_18__4 ;
    public final void rule__InformationTemplate__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4298:1: ( rule__InformationTemplate__Group_18__3__Impl rule__InformationTemplate__Group_18__4 )
            // InternalPagos.g:4299:2: rule__InformationTemplate__Group_18__3__Impl rule__InformationTemplate__Group_18__4
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
    // InternalPagos.g:4306:1: rule__InformationTemplate__Group_18__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__InformationTemplate__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4310:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:4311:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:4311:1: ( RULE_LBRACKET )
            // InternalPagos.g:4312:2: RULE_LBRACKET
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
    // InternalPagos.g:4321:1: rule__InformationTemplate__Group_18__4 : rule__InformationTemplate__Group_18__4__Impl rule__InformationTemplate__Group_18__5 ;
    public final void rule__InformationTemplate__Group_18__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4325:1: ( rule__InformationTemplate__Group_18__4__Impl rule__InformationTemplate__Group_18__5 )
            // InternalPagos.g:4326:2: rule__InformationTemplate__Group_18__4__Impl rule__InformationTemplate__Group_18__5
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
    // InternalPagos.g:4333:1: rule__InformationTemplate__Group_18__4__Impl : ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) ) ;
    public final void rule__InformationTemplate__Group_18__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4337:1: ( ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) ) )
            // InternalPagos.g:4338:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) )
            {
            // InternalPagos.g:4338:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) )
            // InternalPagos.g:4339:2: ( rule__InformationTemplate__ProvidersAssignment_18_4 )
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersAssignment_18_4()); 
            // InternalPagos.g:4340:2: ( rule__InformationTemplate__ProvidersAssignment_18_4 )
            // InternalPagos.g:4340:3: rule__InformationTemplate__ProvidersAssignment_18_4
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
    // InternalPagos.g:4348:1: rule__InformationTemplate__Group_18__5 : rule__InformationTemplate__Group_18__5__Impl rule__InformationTemplate__Group_18__6 ;
    public final void rule__InformationTemplate__Group_18__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4352:1: ( rule__InformationTemplate__Group_18__5__Impl rule__InformationTemplate__Group_18__6 )
            // InternalPagos.g:4353:2: rule__InformationTemplate__Group_18__5__Impl rule__InformationTemplate__Group_18__6
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
    // InternalPagos.g:4360:1: rule__InformationTemplate__Group_18__5__Impl : ( ( rule__InformationTemplate__Group_18_5__0 )* ) ;
    public final void rule__InformationTemplate__Group_18__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4364:1: ( ( ( rule__InformationTemplate__Group_18_5__0 )* ) )
            // InternalPagos.g:4365:1: ( ( rule__InformationTemplate__Group_18_5__0 )* )
            {
            // InternalPagos.g:4365:1: ( ( rule__InformationTemplate__Group_18_5__0 )* )
            // InternalPagos.g:4366:2: ( rule__InformationTemplate__Group_18_5__0 )*
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_18_5()); 
            // InternalPagos.g:4367:2: ( rule__InformationTemplate__Group_18_5__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPagos.g:4367:3: rule__InformationTemplate__Group_18_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InformationTemplate__Group_18_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalPagos.g:4375:1: rule__InformationTemplate__Group_18__6 : rule__InformationTemplate__Group_18__6__Impl ;
    public final void rule__InformationTemplate__Group_18__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4379:1: ( rule__InformationTemplate__Group_18__6__Impl )
            // InternalPagos.g:4380:2: rule__InformationTemplate__Group_18__6__Impl
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
    // InternalPagos.g:4386:1: rule__InformationTemplate__Group_18__6__Impl : ( RULE_RBRACKET ) ;
    public final void rule__InformationTemplate__Group_18__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4390:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:4391:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:4391:1: ( RULE_RBRACKET )
            // InternalPagos.g:4392:2: RULE_RBRACKET
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
    // InternalPagos.g:4402:1: rule__InformationTemplate__Group_18_5__0 : rule__InformationTemplate__Group_18_5__0__Impl rule__InformationTemplate__Group_18_5__1 ;
    public final void rule__InformationTemplate__Group_18_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4406:1: ( rule__InformationTemplate__Group_18_5__0__Impl rule__InformationTemplate__Group_18_5__1 )
            // InternalPagos.g:4407:2: rule__InformationTemplate__Group_18_5__0__Impl rule__InformationTemplate__Group_18_5__1
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
    // InternalPagos.g:4414:1: rule__InformationTemplate__Group_18_5__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_18_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4418:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4419:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4419:1: ( RULE_COMMA )
            // InternalPagos.g:4420:2: RULE_COMMA
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
    // InternalPagos.g:4429:1: rule__InformationTemplate__Group_18_5__1 : rule__InformationTemplate__Group_18_5__1__Impl ;
    public final void rule__InformationTemplate__Group_18_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4433:1: ( rule__InformationTemplate__Group_18_5__1__Impl )
            // InternalPagos.g:4434:2: rule__InformationTemplate__Group_18_5__1__Impl
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
    // InternalPagos.g:4440:1: rule__InformationTemplate__Group_18_5__1__Impl : ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) ) ;
    public final void rule__InformationTemplate__Group_18_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4444:1: ( ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) ) )
            // InternalPagos.g:4445:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) )
            {
            // InternalPagos.g:4445:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) )
            // InternalPagos.g:4446:2: ( rule__InformationTemplate__ProvidersAssignment_18_5_1 )
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersAssignment_18_5_1()); 
            // InternalPagos.g:4447:2: ( rule__InformationTemplate__ProvidersAssignment_18_5_1 )
            // InternalPagos.g:4447:3: rule__InformationTemplate__ProvidersAssignment_18_5_1
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
    // InternalPagos.g:4456:1: rule__CalculationTemplate__Group__0 : rule__CalculationTemplate__Group__0__Impl rule__CalculationTemplate__Group__1 ;
    public final void rule__CalculationTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4460:1: ( rule__CalculationTemplate__Group__0__Impl rule__CalculationTemplate__Group__1 )
            // InternalPagos.g:4461:2: rule__CalculationTemplate__Group__0__Impl rule__CalculationTemplate__Group__1
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
    // InternalPagos.g:4468:1: rule__CalculationTemplate__Group__0__Impl : ( () ) ;
    public final void rule__CalculationTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4472:1: ( ( () ) )
            // InternalPagos.g:4473:1: ( () )
            {
            // InternalPagos.g:4473:1: ( () )
            // InternalPagos.g:4474:2: ()
            {
             before(grammarAccess.getCalculationTemplateAccess().getCalculationTemplateAction_0()); 
            // InternalPagos.g:4475:2: ()
            // InternalPagos.g:4475:3: 
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
    // InternalPagos.g:4483:1: rule__CalculationTemplate__Group__1 : rule__CalculationTemplate__Group__1__Impl rule__CalculationTemplate__Group__2 ;
    public final void rule__CalculationTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4487:1: ( rule__CalculationTemplate__Group__1__Impl rule__CalculationTemplate__Group__2 )
            // InternalPagos.g:4488:2: rule__CalculationTemplate__Group__1__Impl rule__CalculationTemplate__Group__2
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
    // InternalPagos.g:4495:1: rule__CalculationTemplate__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__CalculationTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4499:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:4500:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:4500:1: ( RULE_LBRACE )
            // InternalPagos.g:4501:2: RULE_LBRACE
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
    // InternalPagos.g:4510:1: rule__CalculationTemplate__Group__2 : rule__CalculationTemplate__Group__2__Impl rule__CalculationTemplate__Group__3 ;
    public final void rule__CalculationTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4514:1: ( rule__CalculationTemplate__Group__2__Impl rule__CalculationTemplate__Group__3 )
            // InternalPagos.g:4515:2: rule__CalculationTemplate__Group__2__Impl rule__CalculationTemplate__Group__3
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
    // InternalPagos.g:4522:1: rule__CalculationTemplate__Group__2__Impl : ( 'name' ) ;
    public final void rule__CalculationTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4526:1: ( ( 'name' ) )
            // InternalPagos.g:4527:1: ( 'name' )
            {
            // InternalPagos.g:4527:1: ( 'name' )
            // InternalPagos.g:4528:2: 'name'
            {
             before(grammarAccess.getCalculationTemplateAccess().getNameKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPagos.g:4537:1: rule__CalculationTemplate__Group__3 : rule__CalculationTemplate__Group__3__Impl rule__CalculationTemplate__Group__4 ;
    public final void rule__CalculationTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4541:1: ( rule__CalculationTemplate__Group__3__Impl rule__CalculationTemplate__Group__4 )
            // InternalPagos.g:4542:2: rule__CalculationTemplate__Group__3__Impl rule__CalculationTemplate__Group__4
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
    // InternalPagos.g:4549:1: rule__CalculationTemplate__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4553:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4554:1: ( RULE_COLON )
            {
            // InternalPagos.g:4554:1: ( RULE_COLON )
            // InternalPagos.g:4555:2: RULE_COLON
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
    // InternalPagos.g:4564:1: rule__CalculationTemplate__Group__4 : rule__CalculationTemplate__Group__4__Impl rule__CalculationTemplate__Group__5 ;
    public final void rule__CalculationTemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4568:1: ( rule__CalculationTemplate__Group__4__Impl rule__CalculationTemplate__Group__5 )
            // InternalPagos.g:4569:2: rule__CalculationTemplate__Group__4__Impl rule__CalculationTemplate__Group__5
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
    // InternalPagos.g:4576:1: rule__CalculationTemplate__Group__4__Impl : ( ( rule__CalculationTemplate__NameAssignment_4 ) ) ;
    public final void rule__CalculationTemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4580:1: ( ( ( rule__CalculationTemplate__NameAssignment_4 ) ) )
            // InternalPagos.g:4581:1: ( ( rule__CalculationTemplate__NameAssignment_4 ) )
            {
            // InternalPagos.g:4581:1: ( ( rule__CalculationTemplate__NameAssignment_4 ) )
            // InternalPagos.g:4582:2: ( rule__CalculationTemplate__NameAssignment_4 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getNameAssignment_4()); 
            // InternalPagos.g:4583:2: ( rule__CalculationTemplate__NameAssignment_4 )
            // InternalPagos.g:4583:3: rule__CalculationTemplate__NameAssignment_4
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
    // InternalPagos.g:4591:1: rule__CalculationTemplate__Group__5 : rule__CalculationTemplate__Group__5__Impl rule__CalculationTemplate__Group__6 ;
    public final void rule__CalculationTemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4595:1: ( rule__CalculationTemplate__Group__5__Impl rule__CalculationTemplate__Group__6 )
            // InternalPagos.g:4596:2: rule__CalculationTemplate__Group__5__Impl rule__CalculationTemplate__Group__6
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
    // InternalPagos.g:4603:1: rule__CalculationTemplate__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4607:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4608:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4608:1: ( RULE_COMMA )
            // InternalPagos.g:4609:2: RULE_COMMA
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
    // InternalPagos.g:4618:1: rule__CalculationTemplate__Group__6 : rule__CalculationTemplate__Group__6__Impl rule__CalculationTemplate__Group__7 ;
    public final void rule__CalculationTemplate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4622:1: ( rule__CalculationTemplate__Group__6__Impl rule__CalculationTemplate__Group__7 )
            // InternalPagos.g:4623:2: rule__CalculationTemplate__Group__6__Impl rule__CalculationTemplate__Group__7
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
    // InternalPagos.g:4630:1: rule__CalculationTemplate__Group__6__Impl : ( 'description' ) ;
    public final void rule__CalculationTemplate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4634:1: ( ( 'description' ) )
            // InternalPagos.g:4635:1: ( 'description' )
            {
            // InternalPagos.g:4635:1: ( 'description' )
            // InternalPagos.g:4636:2: 'description'
            {
             before(grammarAccess.getCalculationTemplateAccess().getDescriptionKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPagos.g:4645:1: rule__CalculationTemplate__Group__7 : rule__CalculationTemplate__Group__7__Impl rule__CalculationTemplate__Group__8 ;
    public final void rule__CalculationTemplate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4649:1: ( rule__CalculationTemplate__Group__7__Impl rule__CalculationTemplate__Group__8 )
            // InternalPagos.g:4650:2: rule__CalculationTemplate__Group__7__Impl rule__CalculationTemplate__Group__8
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
    // InternalPagos.g:4657:1: rule__CalculationTemplate__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4661:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4662:1: ( RULE_COLON )
            {
            // InternalPagos.g:4662:1: ( RULE_COLON )
            // InternalPagos.g:4663:2: RULE_COLON
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
    // InternalPagos.g:4672:1: rule__CalculationTemplate__Group__8 : rule__CalculationTemplate__Group__8__Impl rule__CalculationTemplate__Group__9 ;
    public final void rule__CalculationTemplate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4676:1: ( rule__CalculationTemplate__Group__8__Impl rule__CalculationTemplate__Group__9 )
            // InternalPagos.g:4677:2: rule__CalculationTemplate__Group__8__Impl rule__CalculationTemplate__Group__9
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
    // InternalPagos.g:4684:1: rule__CalculationTemplate__Group__8__Impl : ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) ) ;
    public final void rule__CalculationTemplate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4688:1: ( ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:4689:1: ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:4689:1: ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) )
            // InternalPagos.g:4690:2: ( rule__CalculationTemplate__DescriptionAssignment_8 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:4691:2: ( rule__CalculationTemplate__DescriptionAssignment_8 )
            // InternalPagos.g:4691:3: rule__CalculationTemplate__DescriptionAssignment_8
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
    // InternalPagos.g:4699:1: rule__CalculationTemplate__Group__9 : rule__CalculationTemplate__Group__9__Impl rule__CalculationTemplate__Group__10 ;
    public final void rule__CalculationTemplate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4703:1: ( rule__CalculationTemplate__Group__9__Impl rule__CalculationTemplate__Group__10 )
            // InternalPagos.g:4704:2: rule__CalculationTemplate__Group__9__Impl rule__CalculationTemplate__Group__10
            {
            pushFollow(FOLLOW_22);
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
    // InternalPagos.g:4711:1: rule__CalculationTemplate__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4715:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4716:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4716:1: ( RULE_COMMA )
            // InternalPagos.g:4717:2: RULE_COMMA
            {
             before(grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_9()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_9()); 

            }


            }

        }
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
    // InternalPagos.g:4726:1: rule__CalculationTemplate__Group__10 : rule__CalculationTemplate__Group__10__Impl rule__CalculationTemplate__Group__11 ;
    public final void rule__CalculationTemplate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4730:1: ( rule__CalculationTemplate__Group__10__Impl rule__CalculationTemplate__Group__11 )
            // InternalPagos.g:4731:2: rule__CalculationTemplate__Group__10__Impl rule__CalculationTemplate__Group__11
            {
            pushFollow(FOLLOW_4);
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
    // InternalPagos.g:4738:1: rule__CalculationTemplate__Group__10__Impl : ( 'calculationattributes' ) ;
    public final void rule__CalculationTemplate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4742:1: ( ( 'calculationattributes' ) )
            // InternalPagos.g:4743:1: ( 'calculationattributes' )
            {
            // InternalPagos.g:4743:1: ( 'calculationattributes' )
            // InternalPagos.g:4744:2: 'calculationattributes'
            {
             before(grammarAccess.getCalculationTemplateAccess().getCalculationattributesKeyword_10()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCalculationattributesKeyword_10()); 

            }


            }

        }
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
    // InternalPagos.g:4753:1: rule__CalculationTemplate__Group__11 : rule__CalculationTemplate__Group__11__Impl rule__CalculationTemplate__Group__12 ;
    public final void rule__CalculationTemplate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4757:1: ( rule__CalculationTemplate__Group__11__Impl rule__CalculationTemplate__Group__12 )
            // InternalPagos.g:4758:2: rule__CalculationTemplate__Group__11__Impl rule__CalculationTemplate__Group__12
            {
            pushFollow(FOLLOW_11);
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
    // InternalPagos.g:4765:1: rule__CalculationTemplate__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4769:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4770:1: ( RULE_COLON )
            {
            // InternalPagos.g:4770:1: ( RULE_COLON )
            // InternalPagos.g:4771:2: RULE_COLON
            {
             before(grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_11()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_11()); 

            }


            }

        }
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
    // InternalPagos.g:4780:1: rule__CalculationTemplate__Group__12 : rule__CalculationTemplate__Group__12__Impl rule__CalculationTemplate__Group__13 ;
    public final void rule__CalculationTemplate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4784:1: ( rule__CalculationTemplate__Group__12__Impl rule__CalculationTemplate__Group__13 )
            // InternalPagos.g:4785:2: rule__CalculationTemplate__Group__12__Impl rule__CalculationTemplate__Group__13
            {
            pushFollow(FOLLOW_8);
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
    // InternalPagos.g:4792:1: rule__CalculationTemplate__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__CalculationTemplate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4796:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:4797:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:4797:1: ( RULE_LBRACKET )
            // InternalPagos.g:4798:2: RULE_LBRACKET
            {
             before(grammarAccess.getCalculationTemplateAccess().getLBRACKETTerminalRuleCall_12()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getLBRACKETTerminalRuleCall_12()); 

            }


            }

        }
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
    // InternalPagos.g:4807:1: rule__CalculationTemplate__Group__13 : rule__CalculationTemplate__Group__13__Impl rule__CalculationTemplate__Group__14 ;
    public final void rule__CalculationTemplate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4811:1: ( rule__CalculationTemplate__Group__13__Impl rule__CalculationTemplate__Group__14 )
            // InternalPagos.g:4812:2: rule__CalculationTemplate__Group__13__Impl rule__CalculationTemplate__Group__14
            {
            pushFollow(FOLLOW_12);
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
    // InternalPagos.g:4819:1: rule__CalculationTemplate__Group__13__Impl : ( ( rule__CalculationTemplate__AttListsAssignment_13 ) ) ;
    public final void rule__CalculationTemplate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4823:1: ( ( ( rule__CalculationTemplate__AttListsAssignment_13 ) ) )
            // InternalPagos.g:4824:1: ( ( rule__CalculationTemplate__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:4824:1: ( ( rule__CalculationTemplate__AttListsAssignment_13 ) )
            // InternalPagos.g:4825:2: ( rule__CalculationTemplate__AttListsAssignment_13 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:4826:2: ( rule__CalculationTemplate__AttListsAssignment_13 )
            // InternalPagos.g:4826:3: rule__CalculationTemplate__AttListsAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__AttListsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_13()); 

            }


            }

        }
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
    // InternalPagos.g:4834:1: rule__CalculationTemplate__Group__14 : rule__CalculationTemplate__Group__14__Impl rule__CalculationTemplate__Group__15 ;
    public final void rule__CalculationTemplate__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4838:1: ( rule__CalculationTemplate__Group__14__Impl rule__CalculationTemplate__Group__15 )
            // InternalPagos.g:4839:2: rule__CalculationTemplate__Group__14__Impl rule__CalculationTemplate__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__CalculationTemplate__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__15();

            state._fsp--;


            }

        }
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
    // InternalPagos.g:4846:1: rule__CalculationTemplate__Group__14__Impl : ( ( rule__CalculationTemplate__Group_14__0 )* ) ;
    public final void rule__CalculationTemplate__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4850:1: ( ( ( rule__CalculationTemplate__Group_14__0 )* ) )
            // InternalPagos.g:4851:1: ( ( rule__CalculationTemplate__Group_14__0 )* )
            {
            // InternalPagos.g:4851:1: ( ( rule__CalculationTemplate__Group_14__0 )* )
            // InternalPagos.g:4852:2: ( rule__CalculationTemplate__Group_14__0 )*
            {
             before(grammarAccess.getCalculationTemplateAccess().getGroup_14()); 
            // InternalPagos.g:4853:2: ( rule__CalculationTemplate__Group_14__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPagos.g:4853:3: rule__CalculationTemplate__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CalculationTemplate__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getCalculationTemplateAccess().getGroup_14()); 

            }


            }

        }
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


    // $ANTLR start "rule__CalculationTemplate__Group__15"
    // InternalPagos.g:4861:1: rule__CalculationTemplate__Group__15 : rule__CalculationTemplate__Group__15__Impl rule__CalculationTemplate__Group__16 ;
    public final void rule__CalculationTemplate__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4865:1: ( rule__CalculationTemplate__Group__15__Impl rule__CalculationTemplate__Group__16 )
            // InternalPagos.g:4866:2: rule__CalculationTemplate__Group__15__Impl rule__CalculationTemplate__Group__16
            {
            pushFollow(FOLLOW_6);
            rule__CalculationTemplate__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__15"


    // $ANTLR start "rule__CalculationTemplate__Group__15__Impl"
    // InternalPagos.g:4873:1: rule__CalculationTemplate__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__CalculationTemplate__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4877:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:4878:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:4878:1: ( RULE_RBRACKET )
            // InternalPagos.g:4879:2: RULE_RBRACKET
            {
             before(grammarAccess.getCalculationTemplateAccess().getRBRACKETTerminalRuleCall_15()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getRBRACKETTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__15__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__16"
    // InternalPagos.g:4888:1: rule__CalculationTemplate__Group__16 : rule__CalculationTemplate__Group__16__Impl rule__CalculationTemplate__Group__17 ;
    public final void rule__CalculationTemplate__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4892:1: ( rule__CalculationTemplate__Group__16__Impl rule__CalculationTemplate__Group__17 )
            // InternalPagos.g:4893:2: rule__CalculationTemplate__Group__16__Impl rule__CalculationTemplate__Group__17
            {
            pushFollow(FOLLOW_23);
            rule__CalculationTemplate__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__16"


    // $ANTLR start "rule__CalculationTemplate__Group__16__Impl"
    // InternalPagos.g:4900:1: rule__CalculationTemplate__Group__16__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4904:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4905:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4905:1: ( RULE_COMMA )
            // InternalPagos.g:4906:2: RULE_COMMA
            {
             before(grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_16()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__16__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__17"
    // InternalPagos.g:4915:1: rule__CalculationTemplate__Group__17 : rule__CalculationTemplate__Group__17__Impl rule__CalculationTemplate__Group__18 ;
    public final void rule__CalculationTemplate__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4919:1: ( rule__CalculationTemplate__Group__17__Impl rule__CalculationTemplate__Group__18 )
            // InternalPagos.g:4920:2: rule__CalculationTemplate__Group__17__Impl rule__CalculationTemplate__Group__18
            {
            pushFollow(FOLLOW_4);
            rule__CalculationTemplate__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__17"


    // $ANTLR start "rule__CalculationTemplate__Group__17__Impl"
    // InternalPagos.g:4927:1: rule__CalculationTemplate__Group__17__Impl : ( 'calculationrules' ) ;
    public final void rule__CalculationTemplate__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4931:1: ( ( 'calculationrules' ) )
            // InternalPagos.g:4932:1: ( 'calculationrules' )
            {
            // InternalPagos.g:4932:1: ( 'calculationrules' )
            // InternalPagos.g:4933:2: 'calculationrules'
            {
             before(grammarAccess.getCalculationTemplateAccess().getCalculationrulesKeyword_17()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCalculationrulesKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__17__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__18"
    // InternalPagos.g:4942:1: rule__CalculationTemplate__Group__18 : rule__CalculationTemplate__Group__18__Impl rule__CalculationTemplate__Group__19 ;
    public final void rule__CalculationTemplate__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4946:1: ( rule__CalculationTemplate__Group__18__Impl rule__CalculationTemplate__Group__19 )
            // InternalPagos.g:4947:2: rule__CalculationTemplate__Group__18__Impl rule__CalculationTemplate__Group__19
            {
            pushFollow(FOLLOW_24);
            rule__CalculationTemplate__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__18"


    // $ANTLR start "rule__CalculationTemplate__Group__18__Impl"
    // InternalPagos.g:4954:1: rule__CalculationTemplate__Group__18__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4958:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4959:1: ( RULE_COLON )
            {
            // InternalPagos.g:4959:1: ( RULE_COLON )
            // InternalPagos.g:4960:2: RULE_COLON
            {
             before(grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_18()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__18__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__19"
    // InternalPagos.g:4969:1: rule__CalculationTemplate__Group__19 : rule__CalculationTemplate__Group__19__Impl rule__CalculationTemplate__Group__20 ;
    public final void rule__CalculationTemplate__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4973:1: ( rule__CalculationTemplate__Group__19__Impl rule__CalculationTemplate__Group__20 )
            // InternalPagos.g:4974:2: rule__CalculationTemplate__Group__19__Impl rule__CalculationTemplate__Group__20
            {
            pushFollow(FOLLOW_9);
            rule__CalculationTemplate__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__19"


    // $ANTLR start "rule__CalculationTemplate__Group__19__Impl"
    // InternalPagos.g:4981:1: rule__CalculationTemplate__Group__19__Impl : ( ( rule__CalculationTemplate__FormulasAssignment_19 ) ) ;
    public final void rule__CalculationTemplate__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4985:1: ( ( ( rule__CalculationTemplate__FormulasAssignment_19 ) ) )
            // InternalPagos.g:4986:1: ( ( rule__CalculationTemplate__FormulasAssignment_19 ) )
            {
            // InternalPagos.g:4986:1: ( ( rule__CalculationTemplate__FormulasAssignment_19 ) )
            // InternalPagos.g:4987:2: ( rule__CalculationTemplate__FormulasAssignment_19 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getFormulasAssignment_19()); 
            // InternalPagos.g:4988:2: ( rule__CalculationTemplate__FormulasAssignment_19 )
            // InternalPagos.g:4988:3: rule__CalculationTemplate__FormulasAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__FormulasAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getCalculationTemplateAccess().getFormulasAssignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__19__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group__20"
    // InternalPagos.g:4996:1: rule__CalculationTemplate__Group__20 : rule__CalculationTemplate__Group__20__Impl ;
    public final void rule__CalculationTemplate__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5000:1: ( rule__CalculationTemplate__Group__20__Impl )
            // InternalPagos.g:5001:2: rule__CalculationTemplate__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group__20__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__20"


    // $ANTLR start "rule__CalculationTemplate__Group__20__Impl"
    // InternalPagos.g:5007:1: rule__CalculationTemplate__Group__20__Impl : ( RULE_RBRACE ) ;
    public final void rule__CalculationTemplate__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5011:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:5012:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:5012:1: ( RULE_RBRACE )
            // InternalPagos.g:5013:2: RULE_RBRACE
            {
             before(grammarAccess.getCalculationTemplateAccess().getRBRACETerminalRuleCall_20()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getRBRACETerminalRuleCall_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group__20__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group_14__0"
    // InternalPagos.g:5023:1: rule__CalculationTemplate__Group_14__0 : rule__CalculationTemplate__Group_14__0__Impl rule__CalculationTemplate__Group_14__1 ;
    public final void rule__CalculationTemplate__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5027:1: ( rule__CalculationTemplate__Group_14__0__Impl rule__CalculationTemplate__Group_14__1 )
            // InternalPagos.g:5028:2: rule__CalculationTemplate__Group_14__0__Impl rule__CalculationTemplate__Group_14__1
            {
            pushFollow(FOLLOW_8);
            rule__CalculationTemplate__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_14__0"


    // $ANTLR start "rule__CalculationTemplate__Group_14__0__Impl"
    // InternalPagos.g:5035:1: rule__CalculationTemplate__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5039:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:5040:1: ( RULE_COMMA )
            {
            // InternalPagos.g:5040:1: ( RULE_COMMA )
            // InternalPagos.g:5041:2: RULE_COMMA
            {
             before(grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_14_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_14__0__Impl"


    // $ANTLR start "rule__CalculationTemplate__Group_14__1"
    // InternalPagos.g:5050:1: rule__CalculationTemplate__Group_14__1 : rule__CalculationTemplate__Group_14__1__Impl ;
    public final void rule__CalculationTemplate__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5054:1: ( rule__CalculationTemplate__Group_14__1__Impl )
            // InternalPagos.g:5055:2: rule__CalculationTemplate__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_14__1"


    // $ANTLR start "rule__CalculationTemplate__Group_14__1__Impl"
    // InternalPagos.g:5061:1: rule__CalculationTemplate__Group_14__1__Impl : ( ( rule__CalculationTemplate__AttListsAssignment_14_1 ) ) ;
    public final void rule__CalculationTemplate__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5065:1: ( ( ( rule__CalculationTemplate__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:5066:1: ( ( rule__CalculationTemplate__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:5066:1: ( ( rule__CalculationTemplate__AttListsAssignment_14_1 ) )
            // InternalPagos.g:5067:2: ( rule__CalculationTemplate__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:5068:2: ( rule__CalculationTemplate__AttListsAssignment_14_1 )
            // InternalPagos.g:5068:3: rule__CalculationTemplate__AttListsAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__AttListsAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__Group_14__1__Impl"


    // $ANTLR start "rule__Formula__Group_0__0"
    // InternalPagos.g:5077:1: rule__Formula__Group_0__0 : rule__Formula__Group_0__0__Impl rule__Formula__Group_0__1 ;
    public final void rule__Formula__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5081:1: ( rule__Formula__Group_0__0__Impl rule__Formula__Group_0__1 )
            // InternalPagos.g:5082:2: rule__Formula__Group_0__0__Impl rule__Formula__Group_0__1
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
    // InternalPagos.g:5089:1: rule__Formula__Group_0__0__Impl : ( () ) ;
    public final void rule__Formula__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5093:1: ( ( () ) )
            // InternalPagos.g:5094:1: ( () )
            {
            // InternalPagos.g:5094:1: ( () )
            // InternalPagos.g:5095:2: ()
            {
             before(grammarAccess.getFormulaAccess().getFormulaAction_0_0()); 
            // InternalPagos.g:5096:2: ()
            // InternalPagos.g:5096:3: 
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
    // InternalPagos.g:5104:1: rule__Formula__Group_0__1 : rule__Formula__Group_0__1__Impl ;
    public final void rule__Formula__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5108:1: ( rule__Formula__Group_0__1__Impl )
            // InternalPagos.g:5109:2: rule__Formula__Group_0__1__Impl
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
    // InternalPagos.g:5115:1: rule__Formula__Group_0__1__Impl : ( ( rule__Formula__FormulaBodyAssignment_0_1 )* ) ;
    public final void rule__Formula__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5119:1: ( ( ( rule__Formula__FormulaBodyAssignment_0_1 )* ) )
            // InternalPagos.g:5120:1: ( ( rule__Formula__FormulaBodyAssignment_0_1 )* )
            {
            // InternalPagos.g:5120:1: ( ( rule__Formula__FormulaBodyAssignment_0_1 )* )
            // InternalPagos.g:5121:2: ( rule__Formula__FormulaBodyAssignment_0_1 )*
            {
             before(grammarAccess.getFormulaAccess().getFormulaBodyAssignment_0_1()); 
            // InternalPagos.g:5122:2: ( rule__Formula__FormulaBodyAssignment_0_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_IF) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPagos.g:5122:3: rule__Formula__FormulaBodyAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Formula__FormulaBodyAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalPagos.g:5131:1: rule__IfBlock__Group__0 : rule__IfBlock__Group__0__Impl rule__IfBlock__Group__1 ;
    public final void rule__IfBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5135:1: ( rule__IfBlock__Group__0__Impl rule__IfBlock__Group__1 )
            // InternalPagos.g:5136:2: rule__IfBlock__Group__0__Impl rule__IfBlock__Group__1
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
    // InternalPagos.g:5143:1: rule__IfBlock__Group__0__Impl : ( () ) ;
    public final void rule__IfBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5147:1: ( ( () ) )
            // InternalPagos.g:5148:1: ( () )
            {
            // InternalPagos.g:5148:1: ( () )
            // InternalPagos.g:5149:2: ()
            {
             before(grammarAccess.getIfBlockAccess().getIfBlockAction_0()); 
            // InternalPagos.g:5150:2: ()
            // InternalPagos.g:5150:3: 
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
    // InternalPagos.g:5158:1: rule__IfBlock__Group__1 : rule__IfBlock__Group__1__Impl rule__IfBlock__Group__2 ;
    public final void rule__IfBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5162:1: ( rule__IfBlock__Group__1__Impl rule__IfBlock__Group__2 )
            // InternalPagos.g:5163:2: rule__IfBlock__Group__1__Impl rule__IfBlock__Group__2
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
    // InternalPagos.g:5170:1: rule__IfBlock__Group__1__Impl : ( ( rule__IfBlock__IfSentenceAssignment_1 ) ) ;
    public final void rule__IfBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5174:1: ( ( ( rule__IfBlock__IfSentenceAssignment_1 ) ) )
            // InternalPagos.g:5175:1: ( ( rule__IfBlock__IfSentenceAssignment_1 ) )
            {
            // InternalPagos.g:5175:1: ( ( rule__IfBlock__IfSentenceAssignment_1 ) )
            // InternalPagos.g:5176:2: ( rule__IfBlock__IfSentenceAssignment_1 )
            {
             before(grammarAccess.getIfBlockAccess().getIfSentenceAssignment_1()); 
            // InternalPagos.g:5177:2: ( rule__IfBlock__IfSentenceAssignment_1 )
            // InternalPagos.g:5177:3: rule__IfBlock__IfSentenceAssignment_1
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
    // InternalPagos.g:5185:1: rule__IfBlock__Group__2 : rule__IfBlock__Group__2__Impl ;
    public final void rule__IfBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5189:1: ( rule__IfBlock__Group__2__Impl )
            // InternalPagos.g:5190:2: rule__IfBlock__Group__2__Impl
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
    // InternalPagos.g:5196:1: rule__IfBlock__Group__2__Impl : ( ( rule__IfBlock__Group_2__0 )? ) ;
    public final void rule__IfBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5200:1: ( ( ( rule__IfBlock__Group_2__0 )? ) )
            // InternalPagos.g:5201:1: ( ( rule__IfBlock__Group_2__0 )? )
            {
            // InternalPagos.g:5201:1: ( ( rule__IfBlock__Group_2__0 )? )
            // InternalPagos.g:5202:2: ( rule__IfBlock__Group_2__0 )?
            {
             before(grammarAccess.getIfBlockAccess().getGroup_2()); 
            // InternalPagos.g:5203:2: ( rule__IfBlock__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ELSE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPagos.g:5203:3: rule__IfBlock__Group_2__0
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
    // InternalPagos.g:5212:1: rule__IfBlock__Group_2__0 : rule__IfBlock__Group_2__0__Impl rule__IfBlock__Group_2__1 ;
    public final void rule__IfBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5216:1: ( rule__IfBlock__Group_2__0__Impl rule__IfBlock__Group_2__1 )
            // InternalPagos.g:5217:2: rule__IfBlock__Group_2__0__Impl rule__IfBlock__Group_2__1
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
    // InternalPagos.g:5224:1: rule__IfBlock__Group_2__0__Impl : ( RULE_ELSE ) ;
    public final void rule__IfBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5228:1: ( ( RULE_ELSE ) )
            // InternalPagos.g:5229:1: ( RULE_ELSE )
            {
            // InternalPagos.g:5229:1: ( RULE_ELSE )
            // InternalPagos.g:5230:2: RULE_ELSE
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
    // InternalPagos.g:5239:1: rule__IfBlock__Group_2__1 : rule__IfBlock__Group_2__1__Impl ;
    public final void rule__IfBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5243:1: ( rule__IfBlock__Group_2__1__Impl )
            // InternalPagos.g:5244:2: rule__IfBlock__Group_2__1__Impl
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
    // InternalPagos.g:5250:1: rule__IfBlock__Group_2__1__Impl : ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) ) ;
    public final void rule__IfBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5254:1: ( ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) ) )
            // InternalPagos.g:5255:1: ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) )
            {
            // InternalPagos.g:5255:1: ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) )
            // InternalPagos.g:5256:2: ( rule__IfBlock__ElseSentenceAssignment_2_1 )
            {
             before(grammarAccess.getIfBlockAccess().getElseSentenceAssignment_2_1()); 
            // InternalPagos.g:5257:2: ( rule__IfBlock__ElseSentenceAssignment_2_1 )
            // InternalPagos.g:5257:3: rule__IfBlock__ElseSentenceAssignment_2_1
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
    // InternalPagos.g:5266:1: rule__IfCondition__Group__0 : rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1 ;
    public final void rule__IfCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5270:1: ( rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1 )
            // InternalPagos.g:5271:2: rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1
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
    // InternalPagos.g:5278:1: rule__IfCondition__Group__0__Impl : ( () ) ;
    public final void rule__IfCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5282:1: ( ( () ) )
            // InternalPagos.g:5283:1: ( () )
            {
            // InternalPagos.g:5283:1: ( () )
            // InternalPagos.g:5284:2: ()
            {
             before(grammarAccess.getIfConditionAccess().getIfConditionAction_0()); 
            // InternalPagos.g:5285:2: ()
            // InternalPagos.g:5285:3: 
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
    // InternalPagos.g:5293:1: rule__IfCondition__Group__1 : rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2 ;
    public final void rule__IfCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5297:1: ( rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2 )
            // InternalPagos.g:5298:2: rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2
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
    // InternalPagos.g:5305:1: rule__IfCondition__Group__1__Impl : ( RULE_IF ) ;
    public final void rule__IfCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5309:1: ( ( RULE_IF ) )
            // InternalPagos.g:5310:1: ( RULE_IF )
            {
            // InternalPagos.g:5310:1: ( RULE_IF )
            // InternalPagos.g:5311:2: RULE_IF
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
    // InternalPagos.g:5320:1: rule__IfCondition__Group__2 : rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3 ;
    public final void rule__IfCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5324:1: ( rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3 )
            // InternalPagos.g:5325:2: rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3
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
    // InternalPagos.g:5332:1: rule__IfCondition__Group__2__Impl : ( RULE_LBRACKET ) ;
    public final void rule__IfCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5336:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:5337:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:5337:1: ( RULE_LBRACKET )
            // InternalPagos.g:5338:2: RULE_LBRACKET
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
    // InternalPagos.g:5347:1: rule__IfCondition__Group__3 : rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4 ;
    public final void rule__IfCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5351:1: ( rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4 )
            // InternalPagos.g:5352:2: rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4
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
    // InternalPagos.g:5359:1: rule__IfCondition__Group__3__Impl : ( ( rule__IfCondition__LogExpAssignment_3 ) ) ;
    public final void rule__IfCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5363:1: ( ( ( rule__IfCondition__LogExpAssignment_3 ) ) )
            // InternalPagos.g:5364:1: ( ( rule__IfCondition__LogExpAssignment_3 ) )
            {
            // InternalPagos.g:5364:1: ( ( rule__IfCondition__LogExpAssignment_3 ) )
            // InternalPagos.g:5365:2: ( rule__IfCondition__LogExpAssignment_3 )
            {
             before(grammarAccess.getIfConditionAccess().getLogExpAssignment_3()); 
            // InternalPagos.g:5366:2: ( rule__IfCondition__LogExpAssignment_3 )
            // InternalPagos.g:5366:3: rule__IfCondition__LogExpAssignment_3
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
    // InternalPagos.g:5374:1: rule__IfCondition__Group__4 : rule__IfCondition__Group__4__Impl rule__IfCondition__Group__5 ;
    public final void rule__IfCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5378:1: ( rule__IfCondition__Group__4__Impl rule__IfCondition__Group__5 )
            // InternalPagos.g:5379:2: rule__IfCondition__Group__4__Impl rule__IfCondition__Group__5
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
    // InternalPagos.g:5386:1: rule__IfCondition__Group__4__Impl : ( RULE_RBRACKET ) ;
    public final void rule__IfCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5390:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:5391:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:5391:1: ( RULE_RBRACKET )
            // InternalPagos.g:5392:2: RULE_RBRACKET
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
    // InternalPagos.g:5401:1: rule__IfCondition__Group__5 : rule__IfCondition__Group__5__Impl rule__IfCondition__Group__6 ;
    public final void rule__IfCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5405:1: ( rule__IfCondition__Group__5__Impl rule__IfCondition__Group__6 )
            // InternalPagos.g:5406:2: rule__IfCondition__Group__5__Impl rule__IfCondition__Group__6
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
    // InternalPagos.g:5413:1: rule__IfCondition__Group__5__Impl : ( RULE_THEN ) ;
    public final void rule__IfCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5417:1: ( ( RULE_THEN ) )
            // InternalPagos.g:5418:1: ( RULE_THEN )
            {
            // InternalPagos.g:5418:1: ( RULE_THEN )
            // InternalPagos.g:5419:2: RULE_THEN
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
    // InternalPagos.g:5428:1: rule__IfCondition__Group__6 : rule__IfCondition__Group__6__Impl rule__IfCondition__Group__7 ;
    public final void rule__IfCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5432:1: ( rule__IfCondition__Group__6__Impl rule__IfCondition__Group__7 )
            // InternalPagos.g:5433:2: rule__IfCondition__Group__6__Impl rule__IfCondition__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalPagos.g:5440:1: rule__IfCondition__Group__6__Impl : ( RULE_LBRACE ) ;
    public final void rule__IfCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5444:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:5445:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:5445:1: ( RULE_LBRACE )
            // InternalPagos.g:5446:2: RULE_LBRACE
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
    // InternalPagos.g:5455:1: rule__IfCondition__Group__7 : rule__IfCondition__Group__7__Impl rule__IfCondition__Group__8 ;
    public final void rule__IfCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5459:1: ( rule__IfCondition__Group__7__Impl rule__IfCondition__Group__8 )
            // InternalPagos.g:5460:2: rule__IfCondition__Group__7__Impl rule__IfCondition__Group__8
            {
            pushFollow(FOLLOW_4);
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
    // InternalPagos.g:5467:1: rule__IfCondition__Group__7__Impl : ( RULE_RETURN ) ;
    public final void rule__IfCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5471:1: ( ( RULE_RETURN ) )
            // InternalPagos.g:5472:1: ( RULE_RETURN )
            {
            // InternalPagos.g:5472:1: ( RULE_RETURN )
            // InternalPagos.g:5473:2: RULE_RETURN
            {
             before(grammarAccess.getIfConditionAccess().getRETURNTerminalRuleCall_7()); 
            match(input,RULE_RETURN,FOLLOW_2); 
             after(grammarAccess.getIfConditionAccess().getRETURNTerminalRuleCall_7()); 

            }


            }

        }
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
    // InternalPagos.g:5482:1: rule__IfCondition__Group__8 : rule__IfCondition__Group__8__Impl rule__IfCondition__Group__9 ;
    public final void rule__IfCondition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5486:1: ( rule__IfCondition__Group__8__Impl rule__IfCondition__Group__9 )
            // InternalPagos.g:5487:2: rule__IfCondition__Group__8__Impl rule__IfCondition__Group__9
            {
            pushFollow(FOLLOW_32);
            rule__IfCondition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__9();

            state._fsp--;


            }

        }
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
    // InternalPagos.g:5494:1: rule__IfCondition__Group__8__Impl : ( RULE_COLON ) ;
    public final void rule__IfCondition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5498:1: ( ( RULE_COLON ) )
            // InternalPagos.g:5499:1: ( RULE_COLON )
            {
            // InternalPagos.g:5499:1: ( RULE_COLON )
            // InternalPagos.g:5500:2: RULE_COLON
            {
             before(grammarAccess.getIfConditionAccess().getCOLONTerminalRuleCall_8()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getIfConditionAccess().getCOLONTerminalRuleCall_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__IfCondition__Group__9"
    // InternalPagos.g:5509:1: rule__IfCondition__Group__9 : rule__IfCondition__Group__9__Impl rule__IfCondition__Group__10 ;
    public final void rule__IfCondition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5513:1: ( rule__IfCondition__Group__9__Impl rule__IfCondition__Group__10 )
            // InternalPagos.g:5514:2: rule__IfCondition__Group__9__Impl rule__IfCondition__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__IfCondition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__9"


    // $ANTLR start "rule__IfCondition__Group__9__Impl"
    // InternalPagos.g:5521:1: rule__IfCondition__Group__9__Impl : ( ( rule__IfCondition__ExpressionAssignment_9 ) ) ;
    public final void rule__IfCondition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5525:1: ( ( ( rule__IfCondition__ExpressionAssignment_9 ) ) )
            // InternalPagos.g:5526:1: ( ( rule__IfCondition__ExpressionAssignment_9 ) )
            {
            // InternalPagos.g:5526:1: ( ( rule__IfCondition__ExpressionAssignment_9 ) )
            // InternalPagos.g:5527:2: ( rule__IfCondition__ExpressionAssignment_9 )
            {
             before(grammarAccess.getIfConditionAccess().getExpressionAssignment_9()); 
            // InternalPagos.g:5528:2: ( rule__IfCondition__ExpressionAssignment_9 )
            // InternalPagos.g:5528:3: rule__IfCondition__ExpressionAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__IfCondition__ExpressionAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getIfConditionAccess().getExpressionAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__9__Impl"


    // $ANTLR start "rule__IfCondition__Group__10"
    // InternalPagos.g:5536:1: rule__IfCondition__Group__10 : rule__IfCondition__Group__10__Impl ;
    public final void rule__IfCondition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5540:1: ( rule__IfCondition__Group__10__Impl )
            // InternalPagos.g:5541:2: rule__IfCondition__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__10"


    // $ANTLR start "rule__IfCondition__Group__10__Impl"
    // InternalPagos.g:5547:1: rule__IfCondition__Group__10__Impl : ( RULE_RBRACE ) ;
    public final void rule__IfCondition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5551:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:5552:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:5552:1: ( RULE_RBRACE )
            // InternalPagos.g:5553:2: RULE_RBRACE
            {
             before(grammarAccess.getIfConditionAccess().getRBRACETerminalRuleCall_10()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getIfConditionAccess().getRBRACETerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__Group__10__Impl"


    // $ANTLR start "rule__ElseSegment__Group__0"
    // InternalPagos.g:5563:1: rule__ElseSegment__Group__0 : rule__ElseSegment__Group__0__Impl rule__ElseSegment__Group__1 ;
    public final void rule__ElseSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5567:1: ( rule__ElseSegment__Group__0__Impl rule__ElseSegment__Group__1 )
            // InternalPagos.g:5568:2: rule__ElseSegment__Group__0__Impl rule__ElseSegment__Group__1
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
    // InternalPagos.g:5575:1: rule__ElseSegment__Group__0__Impl : ( () ) ;
    public final void rule__ElseSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5579:1: ( ( () ) )
            // InternalPagos.g:5580:1: ( () )
            {
            // InternalPagos.g:5580:1: ( () )
            // InternalPagos.g:5581:2: ()
            {
             before(grammarAccess.getElseSegmentAccess().getElseSegmentAction_0()); 
            // InternalPagos.g:5582:2: ()
            // InternalPagos.g:5582:3: 
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
    // InternalPagos.g:5590:1: rule__ElseSegment__Group__1 : rule__ElseSegment__Group__1__Impl rule__ElseSegment__Group__2 ;
    public final void rule__ElseSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5594:1: ( rule__ElseSegment__Group__1__Impl rule__ElseSegment__Group__2 )
            // InternalPagos.g:5595:2: rule__ElseSegment__Group__1__Impl rule__ElseSegment__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalPagos.g:5602:1: rule__ElseSegment__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__ElseSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5606:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:5607:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:5607:1: ( RULE_LBRACE )
            // InternalPagos.g:5608:2: RULE_LBRACE
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
    // InternalPagos.g:5617:1: rule__ElseSegment__Group__2 : rule__ElseSegment__Group__2__Impl rule__ElseSegment__Group__3 ;
    public final void rule__ElseSegment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5621:1: ( rule__ElseSegment__Group__2__Impl rule__ElseSegment__Group__3 )
            // InternalPagos.g:5622:2: rule__ElseSegment__Group__2__Impl rule__ElseSegment__Group__3
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
    // InternalPagos.g:5629:1: rule__ElseSegment__Group__2__Impl : ( ( rule__ElseSegment__IfSentenceAssignment_2 ) ) ;
    public final void rule__ElseSegment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5633:1: ( ( ( rule__ElseSegment__IfSentenceAssignment_2 ) ) )
            // InternalPagos.g:5634:1: ( ( rule__ElseSegment__IfSentenceAssignment_2 ) )
            {
            // InternalPagos.g:5634:1: ( ( rule__ElseSegment__IfSentenceAssignment_2 ) )
            // InternalPagos.g:5635:2: ( rule__ElseSegment__IfSentenceAssignment_2 )
            {
             before(grammarAccess.getElseSegmentAccess().getIfSentenceAssignment_2()); 
            // InternalPagos.g:5636:2: ( rule__ElseSegment__IfSentenceAssignment_2 )
            // InternalPagos.g:5636:3: rule__ElseSegment__IfSentenceAssignment_2
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
    // InternalPagos.g:5644:1: rule__ElseSegment__Group__3 : rule__ElseSegment__Group__3__Impl ;
    public final void rule__ElseSegment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5648:1: ( rule__ElseSegment__Group__3__Impl )
            // InternalPagos.g:5649:2: rule__ElseSegment__Group__3__Impl
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
    // InternalPagos.g:5655:1: rule__ElseSegment__Group__3__Impl : ( RULE_RBRACE ) ;
    public final void rule__ElseSegment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5659:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:5660:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:5660:1: ( RULE_RBRACE )
            // InternalPagos.g:5661:2: RULE_RBRACE
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
    // InternalPagos.g:5671:1: rule__ReturnBlock__Group__0 : rule__ReturnBlock__Group__0__Impl rule__ReturnBlock__Group__1 ;
    public final void rule__ReturnBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5675:1: ( rule__ReturnBlock__Group__0__Impl rule__ReturnBlock__Group__1 )
            // InternalPagos.g:5676:2: rule__ReturnBlock__Group__0__Impl rule__ReturnBlock__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalPagos.g:5683:1: rule__ReturnBlock__Group__0__Impl : ( () ) ;
    public final void rule__ReturnBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5687:1: ( ( () ) )
            // InternalPagos.g:5688:1: ( () )
            {
            // InternalPagos.g:5688:1: ( () )
            // InternalPagos.g:5689:2: ()
            {
             before(grammarAccess.getReturnBlockAccess().getReturnBlockAction_0()); 
            // InternalPagos.g:5690:2: ()
            // InternalPagos.g:5690:3: 
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
    // InternalPagos.g:5698:1: rule__ReturnBlock__Group__1 : rule__ReturnBlock__Group__1__Impl rule__ReturnBlock__Group__2 ;
    public final void rule__ReturnBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5702:1: ( rule__ReturnBlock__Group__1__Impl rule__ReturnBlock__Group__2 )
            // InternalPagos.g:5703:2: rule__ReturnBlock__Group__1__Impl rule__ReturnBlock__Group__2
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
    // InternalPagos.g:5710:1: rule__ReturnBlock__Group__1__Impl : ( RULE_RETURN ) ;
    public final void rule__ReturnBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5714:1: ( ( RULE_RETURN ) )
            // InternalPagos.g:5715:1: ( RULE_RETURN )
            {
            // InternalPagos.g:5715:1: ( RULE_RETURN )
            // InternalPagos.g:5716:2: RULE_RETURN
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
    // InternalPagos.g:5725:1: rule__ReturnBlock__Group__2 : rule__ReturnBlock__Group__2__Impl rule__ReturnBlock__Group__3 ;
    public final void rule__ReturnBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5729:1: ( rule__ReturnBlock__Group__2__Impl rule__ReturnBlock__Group__3 )
            // InternalPagos.g:5730:2: rule__ReturnBlock__Group__2__Impl rule__ReturnBlock__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalPagos.g:5737:1: rule__ReturnBlock__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__ReturnBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5741:1: ( ( RULE_COLON ) )
            // InternalPagos.g:5742:1: ( RULE_COLON )
            {
            // InternalPagos.g:5742:1: ( RULE_COLON )
            // InternalPagos.g:5743:2: RULE_COLON
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
    // InternalPagos.g:5752:1: rule__ReturnBlock__Group__3 : rule__ReturnBlock__Group__3__Impl ;
    public final void rule__ReturnBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5756:1: ( rule__ReturnBlock__Group__3__Impl )
            // InternalPagos.g:5757:2: rule__ReturnBlock__Group__3__Impl
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
    // InternalPagos.g:5763:1: rule__ReturnBlock__Group__3__Impl : ( ( rule__ReturnBlock__ExpressionAssignment_3 ) ) ;
    public final void rule__ReturnBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5767:1: ( ( ( rule__ReturnBlock__ExpressionAssignment_3 ) ) )
            // InternalPagos.g:5768:1: ( ( rule__ReturnBlock__ExpressionAssignment_3 ) )
            {
            // InternalPagos.g:5768:1: ( ( rule__ReturnBlock__ExpressionAssignment_3 ) )
            // InternalPagos.g:5769:2: ( rule__ReturnBlock__ExpressionAssignment_3 )
            {
             before(grammarAccess.getReturnBlockAccess().getExpressionAssignment_3()); 
            // InternalPagos.g:5770:2: ( rule__ReturnBlock__ExpressionAssignment_3 )
            // InternalPagos.g:5770:3: rule__ReturnBlock__ExpressionAssignment_3
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
    // InternalPagos.g:5779:1: rule__ExpresionLogica__Group__0 : rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 ;
    public final void rule__ExpresionLogica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5783:1: ( rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 )
            // InternalPagos.g:5784:2: rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalPagos.g:5791:1: rule__ExpresionLogica__Group__0__Impl : ( ( rule__ExpresionLogica__VariableAssignment_0 ) ) ;
    public final void rule__ExpresionLogica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5795:1: ( ( ( rule__ExpresionLogica__VariableAssignment_0 ) ) )
            // InternalPagos.g:5796:1: ( ( rule__ExpresionLogica__VariableAssignment_0 ) )
            {
            // InternalPagos.g:5796:1: ( ( rule__ExpresionLogica__VariableAssignment_0 ) )
            // InternalPagos.g:5797:2: ( rule__ExpresionLogica__VariableAssignment_0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getVariableAssignment_0()); 
            // InternalPagos.g:5798:2: ( rule__ExpresionLogica__VariableAssignment_0 )
            // InternalPagos.g:5798:3: rule__ExpresionLogica__VariableAssignment_0
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
    // InternalPagos.g:5806:1: rule__ExpresionLogica__Group__1 : rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 ;
    public final void rule__ExpresionLogica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5810:1: ( rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 )
            // InternalPagos.g:5811:2: rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalPagos.g:5818:1: rule__ExpresionLogica__Group__1__Impl : ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) ) ;
    public final void rule__ExpresionLogica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5822:1: ( ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) ) )
            // InternalPagos.g:5823:1: ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) )
            {
            // InternalPagos.g:5823:1: ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) )
            // InternalPagos.g:5824:2: ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* )
            {
            // InternalPagos.g:5824:2: ( ( rule__ExpresionLogica__Group_1__0 ) )
            // InternalPagos.g:5825:3: ( rule__ExpresionLogica__Group_1__0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 
            // InternalPagos.g:5826:3: ( rule__ExpresionLogica__Group_1__0 )
            // InternalPagos.g:5826:4: rule__ExpresionLogica__Group_1__0
            {
            pushFollow(FOLLOW_35);
            rule__ExpresionLogica__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 

            }

            // InternalPagos.g:5829:2: ( ( rule__ExpresionLogica__Group_1__0 )* )
            // InternalPagos.g:5830:3: ( rule__ExpresionLogica__Group_1__0 )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 
            // InternalPagos.g:5831:3: ( rule__ExpresionLogica__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_OPERADORLOGICO) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPagos.g:5831:4: rule__ExpresionLogica__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__ExpresionLogica__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalPagos.g:5840:1: rule__ExpresionLogica__Group__2 : rule__ExpresionLogica__Group__2__Impl ;
    public final void rule__ExpresionLogica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5844:1: ( rule__ExpresionLogica__Group__2__Impl )
            // InternalPagos.g:5845:2: rule__ExpresionLogica__Group__2__Impl
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
    // InternalPagos.g:5851:1: rule__ExpresionLogica__Group__2__Impl : ( ( rule__ExpresionLogica__Group_2__0 )? ) ;
    public final void rule__ExpresionLogica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5855:1: ( ( ( rule__ExpresionLogica__Group_2__0 )? ) )
            // InternalPagos.g:5856:1: ( ( rule__ExpresionLogica__Group_2__0 )? )
            {
            // InternalPagos.g:5856:1: ( ( rule__ExpresionLogica__Group_2__0 )? )
            // InternalPagos.g:5857:2: ( rule__ExpresionLogica__Group_2__0 )?
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_2()); 
            // InternalPagos.g:5858:2: ( rule__ExpresionLogica__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_LOGICALCONN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPagos.g:5858:3: rule__ExpresionLogica__Group_2__0
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
    // InternalPagos.g:5867:1: rule__ExpresionLogica__Group_1__0 : rule__ExpresionLogica__Group_1__0__Impl rule__ExpresionLogica__Group_1__1 ;
    public final void rule__ExpresionLogica__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5871:1: ( rule__ExpresionLogica__Group_1__0__Impl rule__ExpresionLogica__Group_1__1 )
            // InternalPagos.g:5872:2: rule__ExpresionLogica__Group_1__0__Impl rule__ExpresionLogica__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalPagos.g:5879:1: rule__ExpresionLogica__Group_1__0__Impl : ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) ) ;
    public final void rule__ExpresionLogica__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5883:1: ( ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) ) )
            // InternalPagos.g:5884:1: ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) )
            {
            // InternalPagos.g:5884:1: ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) )
            // InternalPagos.g:5885:2: ( rule__ExpresionLogica__LogOperAssignment_1_0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getLogOperAssignment_1_0()); 
            // InternalPagos.g:5886:2: ( rule__ExpresionLogica__LogOperAssignment_1_0 )
            // InternalPagos.g:5886:3: rule__ExpresionLogica__LogOperAssignment_1_0
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
    // InternalPagos.g:5894:1: rule__ExpresionLogica__Group_1__1 : rule__ExpresionLogica__Group_1__1__Impl ;
    public final void rule__ExpresionLogica__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5898:1: ( rule__ExpresionLogica__Group_1__1__Impl )
            // InternalPagos.g:5899:2: rule__ExpresionLogica__Group_1__1__Impl
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
    // InternalPagos.g:5905:1: rule__ExpresionLogica__Group_1__1__Impl : ( ( rule__ExpresionLogica__Alternatives_1_1 ) ) ;
    public final void rule__ExpresionLogica__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5909:1: ( ( ( rule__ExpresionLogica__Alternatives_1_1 ) ) )
            // InternalPagos.g:5910:1: ( ( rule__ExpresionLogica__Alternatives_1_1 ) )
            {
            // InternalPagos.g:5910:1: ( ( rule__ExpresionLogica__Alternatives_1_1 ) )
            // InternalPagos.g:5911:2: ( rule__ExpresionLogica__Alternatives_1_1 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getAlternatives_1_1()); 
            // InternalPagos.g:5912:2: ( rule__ExpresionLogica__Alternatives_1_1 )
            // InternalPagos.g:5912:3: rule__ExpresionLogica__Alternatives_1_1
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
    // InternalPagos.g:5921:1: rule__ExpresionLogica__Group_2__0 : rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1 ;
    public final void rule__ExpresionLogica__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5925:1: ( rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1 )
            // InternalPagos.g:5926:2: rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1
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
    // InternalPagos.g:5933:1: rule__ExpresionLogica__Group_2__0__Impl : ( RULE_LOGICALCONN ) ;
    public final void rule__ExpresionLogica__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5937:1: ( ( RULE_LOGICALCONN ) )
            // InternalPagos.g:5938:1: ( RULE_LOGICALCONN )
            {
            // InternalPagos.g:5938:1: ( RULE_LOGICALCONN )
            // InternalPagos.g:5939:2: RULE_LOGICALCONN
            {
             before(grammarAccess.getExpresionLogicaAccess().getLOGICALCONNTerminalRuleCall_2_0()); 
            match(input,RULE_LOGICALCONN,FOLLOW_2); 
             after(grammarAccess.getExpresionLogicaAccess().getLOGICALCONNTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalPagos.g:5948:1: rule__ExpresionLogica__Group_2__1 : rule__ExpresionLogica__Group_2__1__Impl ;
    public final void rule__ExpresionLogica__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5952:1: ( rule__ExpresionLogica__Group_2__1__Impl )
            // InternalPagos.g:5953:2: rule__ExpresionLogica__Group_2__1__Impl
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
    // InternalPagos.g:5959:1: rule__ExpresionLogica__Group_2__1__Impl : ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) ) ;
    public final void rule__ExpresionLogica__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5963:1: ( ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) ) )
            // InternalPagos.g:5964:1: ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) )
            {
            // InternalPagos.g:5964:1: ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) )
            // InternalPagos.g:5965:2: ( rule__ExpresionLogica__ExpAssignment_2_1 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getExpAssignment_2_1()); 
            // InternalPagos.g:5966:2: ( rule__ExpresionLogica__ExpAssignment_2_1 )
            // InternalPagos.g:5966:3: rule__ExpresionLogica__ExpAssignment_2_1
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
    // InternalPagos.g:5975:1: rule__Adicion__Group__0 : rule__Adicion__Group__0__Impl rule__Adicion__Group__1 ;
    public final void rule__Adicion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5979:1: ( rule__Adicion__Group__0__Impl rule__Adicion__Group__1 )
            // InternalPagos.g:5980:2: rule__Adicion__Group__0__Impl rule__Adicion__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalPagos.g:5987:1: rule__Adicion__Group__0__Impl : ( ruleMultiplicacion ) ;
    public final void rule__Adicion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5991:1: ( ( ruleMultiplicacion ) )
            // InternalPagos.g:5992:1: ( ruleMultiplicacion )
            {
            // InternalPagos.g:5992:1: ( ruleMultiplicacion )
            // InternalPagos.g:5993:2: ruleMultiplicacion
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
    // InternalPagos.g:6002:1: rule__Adicion__Group__1 : rule__Adicion__Group__1__Impl ;
    public final void rule__Adicion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6006:1: ( rule__Adicion__Group__1__Impl )
            // InternalPagos.g:6007:2: rule__Adicion__Group__1__Impl
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
    // InternalPagos.g:6013:1: rule__Adicion__Group__1__Impl : ( ( rule__Adicion__Group_1__0 )* ) ;
    public final void rule__Adicion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6017:1: ( ( ( rule__Adicion__Group_1__0 )* ) )
            // InternalPagos.g:6018:1: ( ( rule__Adicion__Group_1__0 )* )
            {
            // InternalPagos.g:6018:1: ( ( rule__Adicion__Group_1__0 )* )
            // InternalPagos.g:6019:2: ( rule__Adicion__Group_1__0 )*
            {
             before(grammarAccess.getAdicionAccess().getGroup_1()); 
            // InternalPagos.g:6020:2: ( rule__Adicion__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ADDOP) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPagos.g:6020:3: rule__Adicion__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Adicion__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalPagos.g:6029:1: rule__Adicion__Group_1__0 : rule__Adicion__Group_1__0__Impl rule__Adicion__Group_1__1 ;
    public final void rule__Adicion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6033:1: ( rule__Adicion__Group_1__0__Impl rule__Adicion__Group_1__1 )
            // InternalPagos.g:6034:2: rule__Adicion__Group_1__0__Impl rule__Adicion__Group_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalPagos.g:6041:1: rule__Adicion__Group_1__0__Impl : ( () ) ;
    public final void rule__Adicion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6045:1: ( ( () ) )
            // InternalPagos.g:6046:1: ( () )
            {
            // InternalPagos.g:6046:1: ( () )
            // InternalPagos.g:6047:2: ()
            {
             before(grammarAccess.getAdicionAccess().getAdicionLeftAction_1_0()); 
            // InternalPagos.g:6048:2: ()
            // InternalPagos.g:6048:3: 
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
    // InternalPagos.g:6056:1: rule__Adicion__Group_1__1 : rule__Adicion__Group_1__1__Impl rule__Adicion__Group_1__2 ;
    public final void rule__Adicion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6060:1: ( rule__Adicion__Group_1__1__Impl rule__Adicion__Group_1__2 )
            // InternalPagos.g:6061:2: rule__Adicion__Group_1__1__Impl rule__Adicion__Group_1__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalPagos.g:6068:1: rule__Adicion__Group_1__1__Impl : ( ( rule__Adicion__OperatorAssignment_1_1 ) ) ;
    public final void rule__Adicion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6072:1: ( ( ( rule__Adicion__OperatorAssignment_1_1 ) ) )
            // InternalPagos.g:6073:1: ( ( rule__Adicion__OperatorAssignment_1_1 ) )
            {
            // InternalPagos.g:6073:1: ( ( rule__Adicion__OperatorAssignment_1_1 ) )
            // InternalPagos.g:6074:2: ( rule__Adicion__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdicionAccess().getOperatorAssignment_1_1()); 
            // InternalPagos.g:6075:2: ( rule__Adicion__OperatorAssignment_1_1 )
            // InternalPagos.g:6075:3: rule__Adicion__OperatorAssignment_1_1
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
    // InternalPagos.g:6083:1: rule__Adicion__Group_1__2 : rule__Adicion__Group_1__2__Impl ;
    public final void rule__Adicion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6087:1: ( rule__Adicion__Group_1__2__Impl )
            // InternalPagos.g:6088:2: rule__Adicion__Group_1__2__Impl
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
    // InternalPagos.g:6094:1: rule__Adicion__Group_1__2__Impl : ( ( rule__Adicion__RexpAssignment_1_2 ) ) ;
    public final void rule__Adicion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6098:1: ( ( ( rule__Adicion__RexpAssignment_1_2 ) ) )
            // InternalPagos.g:6099:1: ( ( rule__Adicion__RexpAssignment_1_2 ) )
            {
            // InternalPagos.g:6099:1: ( ( rule__Adicion__RexpAssignment_1_2 ) )
            // InternalPagos.g:6100:2: ( rule__Adicion__RexpAssignment_1_2 )
            {
             before(grammarAccess.getAdicionAccess().getRexpAssignment_1_2()); 
            // InternalPagos.g:6101:2: ( rule__Adicion__RexpAssignment_1_2 )
            // InternalPagos.g:6101:3: rule__Adicion__RexpAssignment_1_2
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
    // InternalPagos.g:6110:1: rule__Multiplicacion__Group__0 : rule__Multiplicacion__Group__0__Impl rule__Multiplicacion__Group__1 ;
    public final void rule__Multiplicacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6114:1: ( rule__Multiplicacion__Group__0__Impl rule__Multiplicacion__Group__1 )
            // InternalPagos.g:6115:2: rule__Multiplicacion__Group__0__Impl rule__Multiplicacion__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalPagos.g:6122:1: rule__Multiplicacion__Group__0__Impl : ( ruleSigleExp ) ;
    public final void rule__Multiplicacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6126:1: ( ( ruleSigleExp ) )
            // InternalPagos.g:6127:1: ( ruleSigleExp )
            {
            // InternalPagos.g:6127:1: ( ruleSigleExp )
            // InternalPagos.g:6128:2: ruleSigleExp
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
    // InternalPagos.g:6137:1: rule__Multiplicacion__Group__1 : rule__Multiplicacion__Group__1__Impl ;
    public final void rule__Multiplicacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6141:1: ( rule__Multiplicacion__Group__1__Impl )
            // InternalPagos.g:6142:2: rule__Multiplicacion__Group__1__Impl
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
    // InternalPagos.g:6148:1: rule__Multiplicacion__Group__1__Impl : ( ( rule__Multiplicacion__Group_1__0 )* ) ;
    public final void rule__Multiplicacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6152:1: ( ( ( rule__Multiplicacion__Group_1__0 )* ) )
            // InternalPagos.g:6153:1: ( ( rule__Multiplicacion__Group_1__0 )* )
            {
            // InternalPagos.g:6153:1: ( ( rule__Multiplicacion__Group_1__0 )* )
            // InternalPagos.g:6154:2: ( rule__Multiplicacion__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicacionAccess().getGroup_1()); 
            // InternalPagos.g:6155:2: ( rule__Multiplicacion__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_MULTOP) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPagos.g:6155:3: rule__Multiplicacion__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Multiplicacion__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalPagos.g:6164:1: rule__Multiplicacion__Group_1__0 : rule__Multiplicacion__Group_1__0__Impl rule__Multiplicacion__Group_1__1 ;
    public final void rule__Multiplicacion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6168:1: ( rule__Multiplicacion__Group_1__0__Impl rule__Multiplicacion__Group_1__1 )
            // InternalPagos.g:6169:2: rule__Multiplicacion__Group_1__0__Impl rule__Multiplicacion__Group_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalPagos.g:6176:1: rule__Multiplicacion__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplicacion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6180:1: ( ( () ) )
            // InternalPagos.g:6181:1: ( () )
            {
            // InternalPagos.g:6181:1: ( () )
            // InternalPagos.g:6182:2: ()
            {
             before(grammarAccess.getMultiplicacionAccess().getMultiplicacionLeftAction_1_0()); 
            // InternalPagos.g:6183:2: ()
            // InternalPagos.g:6183:3: 
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
    // InternalPagos.g:6191:1: rule__Multiplicacion__Group_1__1 : rule__Multiplicacion__Group_1__1__Impl rule__Multiplicacion__Group_1__2 ;
    public final void rule__Multiplicacion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6195:1: ( rule__Multiplicacion__Group_1__1__Impl rule__Multiplicacion__Group_1__2 )
            // InternalPagos.g:6196:2: rule__Multiplicacion__Group_1__1__Impl rule__Multiplicacion__Group_1__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalPagos.g:6203:1: rule__Multiplicacion__Group_1__1__Impl : ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplicacion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6207:1: ( ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) ) )
            // InternalPagos.g:6208:1: ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) )
            {
            // InternalPagos.g:6208:1: ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) )
            // InternalPagos.g:6209:2: ( rule__Multiplicacion__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicacionAccess().getOperatorAssignment_1_1()); 
            // InternalPagos.g:6210:2: ( rule__Multiplicacion__OperatorAssignment_1_1 )
            // InternalPagos.g:6210:3: rule__Multiplicacion__OperatorAssignment_1_1
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
    // InternalPagos.g:6218:1: rule__Multiplicacion__Group_1__2 : rule__Multiplicacion__Group_1__2__Impl ;
    public final void rule__Multiplicacion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6222:1: ( rule__Multiplicacion__Group_1__2__Impl )
            // InternalPagos.g:6223:2: rule__Multiplicacion__Group_1__2__Impl
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
    // InternalPagos.g:6229:1: rule__Multiplicacion__Group_1__2__Impl : ( ( rule__Multiplicacion__RexpAssignment_1_2 ) ) ;
    public final void rule__Multiplicacion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6233:1: ( ( ( rule__Multiplicacion__RexpAssignment_1_2 ) ) )
            // InternalPagos.g:6234:1: ( ( rule__Multiplicacion__RexpAssignment_1_2 ) )
            {
            // InternalPagos.g:6234:1: ( ( rule__Multiplicacion__RexpAssignment_1_2 ) )
            // InternalPagos.g:6235:2: ( rule__Multiplicacion__RexpAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicacionAccess().getRexpAssignment_1_2()); 
            // InternalPagos.g:6236:2: ( rule__Multiplicacion__RexpAssignment_1_2 )
            // InternalPagos.g:6236:3: rule__Multiplicacion__RexpAssignment_1_2
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
    // InternalPagos.g:6245:1: rule__SigleExp__Group_1__0 : rule__SigleExp__Group_1__0__Impl rule__SigleExp__Group_1__1 ;
    public final void rule__SigleExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6249:1: ( rule__SigleExp__Group_1__0__Impl rule__SigleExp__Group_1__1 )
            // InternalPagos.g:6250:2: rule__SigleExp__Group_1__0__Impl rule__SigleExp__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalPagos.g:6257:1: rule__SigleExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SigleExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6261:1: ( ( '(' ) )
            // InternalPagos.g:6262:1: ( '(' )
            {
            // InternalPagos.g:6262:1: ( '(' )
            // InternalPagos.g:6263:2: '('
            {
             before(grammarAccess.getSigleExpAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalPagos.g:6272:1: rule__SigleExp__Group_1__1 : rule__SigleExp__Group_1__1__Impl rule__SigleExp__Group_1__2 ;
    public final void rule__SigleExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6276:1: ( rule__SigleExp__Group_1__1__Impl rule__SigleExp__Group_1__2 )
            // InternalPagos.g:6277:2: rule__SigleExp__Group_1__1__Impl rule__SigleExp__Group_1__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalPagos.g:6284:1: rule__SigleExp__Group_1__1__Impl : ( ruleAdicion ) ;
    public final void rule__SigleExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6288:1: ( ( ruleAdicion ) )
            // InternalPagos.g:6289:1: ( ruleAdicion )
            {
            // InternalPagos.g:6289:1: ( ruleAdicion )
            // InternalPagos.g:6290:2: ruleAdicion
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
    // InternalPagos.g:6299:1: rule__SigleExp__Group_1__2 : rule__SigleExp__Group_1__2__Impl ;
    public final void rule__SigleExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6303:1: ( rule__SigleExp__Group_1__2__Impl )
            // InternalPagos.g:6304:2: rule__SigleExp__Group_1__2__Impl
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
    // InternalPagos.g:6310:1: rule__SigleExp__Group_1__2__Impl : ( ')' ) ;
    public final void rule__SigleExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6314:1: ( ( ')' ) )
            // InternalPagos.g:6315:1: ( ')' )
            {
            // InternalPagos.g:6315:1: ( ')' )
            // InternalPagos.g:6316:2: ')'
            {
             before(grammarAccess.getSigleExpAccess().getRightParenthesisKeyword_1_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPagos.g:6326:1: rule__BusinessAttribute__Group__0 : rule__BusinessAttribute__Group__0__Impl rule__BusinessAttribute__Group__1 ;
    public final void rule__BusinessAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6330:1: ( rule__BusinessAttribute__Group__0__Impl rule__BusinessAttribute__Group__1 )
            // InternalPagos.g:6331:2: rule__BusinessAttribute__Group__0__Impl rule__BusinessAttribute__Group__1
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
    // InternalPagos.g:6338:1: rule__BusinessAttribute__Group__0__Impl : ( () ) ;
    public final void rule__BusinessAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6342:1: ( ( () ) )
            // InternalPagos.g:6343:1: ( () )
            {
            // InternalPagos.g:6343:1: ( () )
            // InternalPagos.g:6344:2: ()
            {
             before(grammarAccess.getBusinessAttributeAccess().getBusinessAttributeAction_0()); 
            // InternalPagos.g:6345:2: ()
            // InternalPagos.g:6345:3: 
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
    // InternalPagos.g:6353:1: rule__BusinessAttribute__Group__1 : rule__BusinessAttribute__Group__1__Impl rule__BusinessAttribute__Group__2 ;
    public final void rule__BusinessAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6357:1: ( rule__BusinessAttribute__Group__1__Impl rule__BusinessAttribute__Group__2 )
            // InternalPagos.g:6358:2: rule__BusinessAttribute__Group__1__Impl rule__BusinessAttribute__Group__2
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
    // InternalPagos.g:6365:1: rule__BusinessAttribute__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__BusinessAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6369:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:6370:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:6370:1: ( RULE_LBRACE )
            // InternalPagos.g:6371:2: RULE_LBRACE
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
    // InternalPagos.g:6380:1: rule__BusinessAttribute__Group__2 : rule__BusinessAttribute__Group__2__Impl rule__BusinessAttribute__Group__3 ;
    public final void rule__BusinessAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6384:1: ( rule__BusinessAttribute__Group__2__Impl rule__BusinessAttribute__Group__3 )
            // InternalPagos.g:6385:2: rule__BusinessAttribute__Group__2__Impl rule__BusinessAttribute__Group__3
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
    // InternalPagos.g:6392:1: rule__BusinessAttribute__Group__2__Impl : ( ( rule__BusinessAttribute__NameAssignment_2 ) ) ;
    public final void rule__BusinessAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6396:1: ( ( ( rule__BusinessAttribute__NameAssignment_2 ) ) )
            // InternalPagos.g:6397:1: ( ( rule__BusinessAttribute__NameAssignment_2 ) )
            {
            // InternalPagos.g:6397:1: ( ( rule__BusinessAttribute__NameAssignment_2 ) )
            // InternalPagos.g:6398:2: ( rule__BusinessAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessAttributeAccess().getNameAssignment_2()); 
            // InternalPagos.g:6399:2: ( rule__BusinessAttribute__NameAssignment_2 )
            // InternalPagos.g:6399:3: rule__BusinessAttribute__NameAssignment_2
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
    // InternalPagos.g:6407:1: rule__BusinessAttribute__Group__3 : rule__BusinessAttribute__Group__3__Impl rule__BusinessAttribute__Group__4 ;
    public final void rule__BusinessAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6411:1: ( rule__BusinessAttribute__Group__3__Impl rule__BusinessAttribute__Group__4 )
            // InternalPagos.g:6412:2: rule__BusinessAttribute__Group__3__Impl rule__BusinessAttribute__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalPagos.g:6419:1: rule__BusinessAttribute__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__BusinessAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6423:1: ( ( RULE_COLON ) )
            // InternalPagos.g:6424:1: ( RULE_COLON )
            {
            // InternalPagos.g:6424:1: ( RULE_COLON )
            // InternalPagos.g:6425:2: RULE_COLON
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
    // InternalPagos.g:6434:1: rule__BusinessAttribute__Group__4 : rule__BusinessAttribute__Group__4__Impl rule__BusinessAttribute__Group__5 ;
    public final void rule__BusinessAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6438:1: ( rule__BusinessAttribute__Group__4__Impl rule__BusinessAttribute__Group__5 )
            // InternalPagos.g:6439:2: rule__BusinessAttribute__Group__4__Impl rule__BusinessAttribute__Group__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalPagos.g:6446:1: rule__BusinessAttribute__Group__4__Impl : ( ( rule__BusinessAttribute__TypeAssignment_4 ) ) ;
    public final void rule__BusinessAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6450:1: ( ( ( rule__BusinessAttribute__TypeAssignment_4 ) ) )
            // InternalPagos.g:6451:1: ( ( rule__BusinessAttribute__TypeAssignment_4 ) )
            {
            // InternalPagos.g:6451:1: ( ( rule__BusinessAttribute__TypeAssignment_4 ) )
            // InternalPagos.g:6452:2: ( rule__BusinessAttribute__TypeAssignment_4 )
            {
             before(grammarAccess.getBusinessAttributeAccess().getTypeAssignment_4()); 
            // InternalPagos.g:6453:2: ( rule__BusinessAttribute__TypeAssignment_4 )
            // InternalPagos.g:6453:3: rule__BusinessAttribute__TypeAssignment_4
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
    // InternalPagos.g:6461:1: rule__BusinessAttribute__Group__5 : rule__BusinessAttribute__Group__5__Impl rule__BusinessAttribute__Group__6 ;
    public final void rule__BusinessAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6465:1: ( rule__BusinessAttribute__Group__5__Impl rule__BusinessAttribute__Group__6 )
            // InternalPagos.g:6466:2: rule__BusinessAttribute__Group__5__Impl rule__BusinessAttribute__Group__6
            {
            pushFollow(FOLLOW_43);
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
    // InternalPagos.g:6473:1: rule__BusinessAttribute__Group__5__Impl : ( ( rule__BusinessAttribute__Group_5__0 )? ) ;
    public final void rule__BusinessAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6477:1: ( ( ( rule__BusinessAttribute__Group_5__0 )? ) )
            // InternalPagos.g:6478:1: ( ( rule__BusinessAttribute__Group_5__0 )? )
            {
            // InternalPagos.g:6478:1: ( ( rule__BusinessAttribute__Group_5__0 )? )
            // InternalPagos.g:6479:2: ( rule__BusinessAttribute__Group_5__0 )?
            {
             before(grammarAccess.getBusinessAttributeAccess().getGroup_5()); 
            // InternalPagos.g:6480:2: ( rule__BusinessAttribute__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPagos.g:6480:3: rule__BusinessAttribute__Group_5__0
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
    // InternalPagos.g:6488:1: rule__BusinessAttribute__Group__6 : rule__BusinessAttribute__Group__6__Impl ;
    public final void rule__BusinessAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6492:1: ( rule__BusinessAttribute__Group__6__Impl )
            // InternalPagos.g:6493:2: rule__BusinessAttribute__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BusinessAttribute__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalPagos.g:6499:1: rule__BusinessAttribute__Group__6__Impl : ( RULE_RBRACE ) ;
    public final void rule__BusinessAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6503:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:6504:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:6504:1: ( RULE_RBRACE )
            // InternalPagos.g:6505:2: RULE_RBRACE
            {
             before(grammarAccess.getBusinessAttributeAccess().getRBRACETerminalRuleCall_6()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getBusinessAttributeAccess().getRBRACETerminalRuleCall_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__BusinessAttribute__Group_5__0"
    // InternalPagos.g:6515:1: rule__BusinessAttribute__Group_5__0 : rule__BusinessAttribute__Group_5__0__Impl rule__BusinessAttribute__Group_5__1 ;
    public final void rule__BusinessAttribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6519:1: ( rule__BusinessAttribute__Group_5__0__Impl rule__BusinessAttribute__Group_5__1 )
            // InternalPagos.g:6520:2: rule__BusinessAttribute__Group_5__0__Impl rule__BusinessAttribute__Group_5__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalPagos.g:6527:1: rule__BusinessAttribute__Group_5__0__Impl : ( ':=' ) ;
    public final void rule__BusinessAttribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6531:1: ( ( ':=' ) )
            // InternalPagos.g:6532:1: ( ':=' )
            {
            // InternalPagos.g:6532:1: ( ':=' )
            // InternalPagos.g:6533:2: ':='
            {
             before(grammarAccess.getBusinessAttributeAccess().getColonEqualsSignKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalPagos.g:6542:1: rule__BusinessAttribute__Group_5__1 : rule__BusinessAttribute__Group_5__1__Impl ;
    public final void rule__BusinessAttribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6546:1: ( rule__BusinessAttribute__Group_5__1__Impl )
            // InternalPagos.g:6547:2: rule__BusinessAttribute__Group_5__1__Impl
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
    // InternalPagos.g:6553:1: rule__BusinessAttribute__Group_5__1__Impl : ( ( rule__BusinessAttribute__ExpAssignment_5_1 ) ) ;
    public final void rule__BusinessAttribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6557:1: ( ( ( rule__BusinessAttribute__ExpAssignment_5_1 ) ) )
            // InternalPagos.g:6558:1: ( ( rule__BusinessAttribute__ExpAssignment_5_1 ) )
            {
            // InternalPagos.g:6558:1: ( ( rule__BusinessAttribute__ExpAssignment_5_1 ) )
            // InternalPagos.g:6559:2: ( rule__BusinessAttribute__ExpAssignment_5_1 )
            {
             before(grammarAccess.getBusinessAttributeAccess().getExpAssignment_5_1()); 
            // InternalPagos.g:6560:2: ( rule__BusinessAttribute__ExpAssignment_5_1 )
            // InternalPagos.g:6560:3: rule__BusinessAttribute__ExpAssignment_5_1
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
    // InternalPagos.g:6569:1: rule__TerminalValue__Group_0__0 : rule__TerminalValue__Group_0__0__Impl rule__TerminalValue__Group_0__1 ;
    public final void rule__TerminalValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6573:1: ( rule__TerminalValue__Group_0__0__Impl rule__TerminalValue__Group_0__1 )
            // InternalPagos.g:6574:2: rule__TerminalValue__Group_0__0__Impl rule__TerminalValue__Group_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalPagos.g:6581:1: rule__TerminalValue__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6585:1: ( ( () ) )
            // InternalPagos.g:6586:1: ( () )
            {
            // InternalPagos.g:6586:1: ( () )
            // InternalPagos.g:6587:2: ()
            {
             before(grammarAccess.getTerminalValueAccess().getTerminalValueAction_0_0()); 
            // InternalPagos.g:6588:2: ()
            // InternalPagos.g:6588:3: 
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
    // InternalPagos.g:6596:1: rule__TerminalValue__Group_0__1 : rule__TerminalValue__Group_0__1__Impl ;
    public final void rule__TerminalValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6600:1: ( rule__TerminalValue__Group_0__1__Impl )
            // InternalPagos.g:6601:2: rule__TerminalValue__Group_0__1__Impl
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
    // InternalPagos.g:6607:1: rule__TerminalValue__Group_0__1__Impl : ( ( rule__TerminalValue__VariableAssignment_0_1 ) ) ;
    public final void rule__TerminalValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6611:1: ( ( ( rule__TerminalValue__VariableAssignment_0_1 ) ) )
            // InternalPagos.g:6612:1: ( ( rule__TerminalValue__VariableAssignment_0_1 ) )
            {
            // InternalPagos.g:6612:1: ( ( rule__TerminalValue__VariableAssignment_0_1 ) )
            // InternalPagos.g:6613:2: ( rule__TerminalValue__VariableAssignment_0_1 )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableAssignment_0_1()); 
            // InternalPagos.g:6614:2: ( rule__TerminalValue__VariableAssignment_0_1 )
            // InternalPagos.g:6614:3: rule__TerminalValue__VariableAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalValue__VariableAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalValueAccess().getVariableAssignment_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalPagos.g:6623:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6627:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalPagos.g:6628:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalPagos.g:6635:1: rule__EDouble__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6639:1: ( ( ( RULE_INT )? ) )
            // InternalPagos.g:6640:1: ( ( RULE_INT )? )
            {
            // InternalPagos.g:6640:1: ( ( RULE_INT )? )
            // InternalPagos.g:6641:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            // InternalPagos.g:6642:2: ( RULE_INT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPagos.g:6642:3: RULE_INT
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
    // InternalPagos.g:6650:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6654:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalPagos.g:6655:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalPagos.g:6662:1: rule__EDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6666:1: ( ( '.' ) )
            // InternalPagos.g:6667:1: ( '.' )
            {
            // InternalPagos.g:6667:1: ( '.' )
            // InternalPagos.g:6668:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 

            }


            }

        }
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
    // InternalPagos.g:6677:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6681:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalPagos.g:6682:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalPagos.g:6689:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6693:1: ( ( RULE_INT ) )
            // InternalPagos.g:6694:1: ( RULE_INT )
            {
            // InternalPagos.g:6694:1: ( RULE_INT )
            // InternalPagos.g:6695:2: RULE_INT
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
    // InternalPagos.g:6704:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6708:1: ( rule__EDouble__Group__3__Impl )
            // InternalPagos.g:6709:2: rule__EDouble__Group__3__Impl
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
    // InternalPagos.g:6715:1: rule__EDouble__Group__3__Impl : ( ( rule__EDouble__Group_3__0 )? ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6719:1: ( ( ( rule__EDouble__Group_3__0 )? ) )
            // InternalPagos.g:6720:1: ( ( rule__EDouble__Group_3__0 )? )
            {
            // InternalPagos.g:6720:1: ( ( rule__EDouble__Group_3__0 )? )
            // InternalPagos.g:6721:2: ( rule__EDouble__Group_3__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_3()); 
            // InternalPagos.g:6722:2: ( rule__EDouble__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=28 && LA28_0<=29)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPagos.g:6722:3: rule__EDouble__Group_3__0
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
    // InternalPagos.g:6731:1: rule__EDouble__Group_3__0 : rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 ;
    public final void rule__EDouble__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6735:1: ( rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 )
            // InternalPagos.g:6736:2: rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalPagos.g:6743:1: rule__EDouble__Group_3__0__Impl : ( ( rule__EDouble__Alternatives_3_0 ) ) ;
    public final void rule__EDouble__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6747:1: ( ( ( rule__EDouble__Alternatives_3_0 ) ) )
            // InternalPagos.g:6748:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            {
            // InternalPagos.g:6748:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            // InternalPagos.g:6749:2: ( rule__EDouble__Alternatives_3_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 
            // InternalPagos.g:6750:2: ( rule__EDouble__Alternatives_3_0 )
            // InternalPagos.g:6750:3: rule__EDouble__Alternatives_3_0
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
    // InternalPagos.g:6758:1: rule__EDouble__Group_3__1 : rule__EDouble__Group_3__1__Impl ;
    public final void rule__EDouble__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6762:1: ( rule__EDouble__Group_3__1__Impl )
            // InternalPagos.g:6763:2: rule__EDouble__Group_3__1__Impl
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
    // InternalPagos.g:6769:1: rule__EDouble__Group_3__1__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6773:1: ( ( RULE_INT ) )
            // InternalPagos.g:6774:1: ( RULE_INT )
            {
            // InternalPagos.g:6774:1: ( RULE_INT )
            // InternalPagos.g:6775:2: RULE_INT
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
    // InternalPagos.g:6785:1: rule__Application__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6789:1: ( ( RULE_ID ) )
            // InternalPagos.g:6790:2: ( RULE_ID )
            {
            // InternalPagos.g:6790:2: ( RULE_ID )
            // InternalPagos.g:6791:3: RULE_ID
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
    // InternalPagos.g:6800:1: rule__Application__IntermediaryAssignment_7 : ( ruleIntermediary ) ;
    public final void rule__Application__IntermediaryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6804:1: ( ( ruleIntermediary ) )
            // InternalPagos.g:6805:2: ( ruleIntermediary )
            {
            // InternalPagos.g:6805:2: ( ruleIntermediary )
            // InternalPagos.g:6806:3: ruleIntermediary
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
    // InternalPagos.g:6815:1: rule__Intermediary__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Intermediary__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6819:1: ( ( RULE_ID ) )
            // InternalPagos.g:6820:2: ( RULE_ID )
            {
            // InternalPagos.g:6820:2: ( RULE_ID )
            // InternalPagos.g:6821:3: RULE_ID
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
    // InternalPagos.g:6830:1: rule__Intermediary__SuperentitiesAssignment_9 : ( ruleSuperEntity ) ;
    public final void rule__Intermediary__SuperentitiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6834:1: ( ( ruleSuperEntity ) )
            // InternalPagos.g:6835:2: ( ruleSuperEntity )
            {
            // InternalPagos.g:6835:2: ( ruleSuperEntity )
            // InternalPagos.g:6836:3: ruleSuperEntity
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
    // InternalPagos.g:6845:1: rule__Intermediary__SuperentitiesAssignment_10_1 : ( ruleSuperEntity ) ;
    public final void rule__Intermediary__SuperentitiesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6849:1: ( ( ruleSuperEntity ) )
            // InternalPagos.g:6850:2: ( ruleSuperEntity )
            {
            // InternalPagos.g:6850:2: ( ruleSuperEntity )
            // InternalPagos.g:6851:3: ruleSuperEntity
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
    // InternalPagos.g:6860:1: rule__SuperEntity__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__SuperEntity__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6864:1: ( ( RULE_ID ) )
            // InternalPagos.g:6865:2: ( RULE_ID )
            {
            // InternalPagos.g:6865:2: ( RULE_ID )
            // InternalPagos.g:6866:3: RULE_ID
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
    // InternalPagos.g:6875:1: rule__SuperEntity__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__SuperEntity__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6879:1: ( ( RULE_STRING ) )
            // InternalPagos.g:6880:2: ( RULE_STRING )
            {
            // InternalPagos.g:6880:2: ( RULE_STRING )
            // InternalPagos.g:6881:3: RULE_STRING
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
    // InternalPagos.g:6890:1: rule__SuperEntity__AttListsAssignment_13 : ( ruleBusinessAttribute ) ;
    public final void rule__SuperEntity__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6894:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:6895:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:6895:2: ( ruleBusinessAttribute )
            // InternalPagos.g:6896:3: ruleBusinessAttribute
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
    // InternalPagos.g:6905:1: rule__SuperEntity__AttListsAssignment_14_1 : ( ruleBusinessAttribute ) ;
    public final void rule__SuperEntity__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6909:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:6910:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:6910:2: ( ruleBusinessAttribute )
            // InternalPagos.g:6911:3: ruleBusinessAttribute
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
    // InternalPagos.g:6920:1: rule__SuperEntity__ParticipantsAssignment_20 : ( ruleParticipant ) ;
    public final void rule__SuperEntity__ParticipantsAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6924:1: ( ( ruleParticipant ) )
            // InternalPagos.g:6925:2: ( ruleParticipant )
            {
            // InternalPagos.g:6925:2: ( ruleParticipant )
            // InternalPagos.g:6926:3: ruleParticipant
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
    // InternalPagos.g:6935:1: rule__SuperEntity__ParticipantsAssignment_21_1 : ( ruleParticipant ) ;
    public final void rule__SuperEntity__ParticipantsAssignment_21_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6939:1: ( ( ruleParticipant ) )
            // InternalPagos.g:6940:2: ( ruleParticipant )
            {
            // InternalPagos.g:6940:2: ( ruleParticipant )
            // InternalPagos.g:6941:3: ruleParticipant
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
    // InternalPagos.g:6950:1: rule__Participant__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Participant__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6954:1: ( ( RULE_ID ) )
            // InternalPagos.g:6955:2: ( RULE_ID )
            {
            // InternalPagos.g:6955:2: ( RULE_ID )
            // InternalPagos.g:6956:3: RULE_ID
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
    // InternalPagos.g:6965:1: rule__Participant__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Participant__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6969:1: ( ( RULE_STRING ) )
            // InternalPagos.g:6970:2: ( RULE_STRING )
            {
            // InternalPagos.g:6970:2: ( RULE_STRING )
            // InternalPagos.g:6971:3: RULE_STRING
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
    // InternalPagos.g:6980:1: rule__Participant__AttListsAssignment_13 : ( ruleBusinessAttribute ) ;
    public final void rule__Participant__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6984:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:6985:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:6985:2: ( ruleBusinessAttribute )
            // InternalPagos.g:6986:3: ruleBusinessAttribute
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
    // InternalPagos.g:6995:1: rule__Participant__AttListsAssignment_14_1 : ( ruleBusinessAttribute ) ;
    public final void rule__Participant__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6999:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7000:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7000:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7001:3: ruleBusinessAttribute
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
    // InternalPagos.g:7010:1: rule__Participant__TemplatesFormsAssignment_17_4 : ( ruleInformationTemplate ) ;
    public final void rule__Participant__TemplatesFormsAssignment_17_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7014:1: ( ( ruleInformationTemplate ) )
            // InternalPagos.g:7015:2: ( ruleInformationTemplate )
            {
            // InternalPagos.g:7015:2: ( ruleInformationTemplate )
            // InternalPagos.g:7016:3: ruleInformationTemplate
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
    // InternalPagos.g:7025:1: rule__Participant__TemplatesFormsAssignment_17_5_1 : ( ruleInformationTemplate ) ;
    public final void rule__Participant__TemplatesFormsAssignment_17_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7029:1: ( ( ruleInformationTemplate ) )
            // InternalPagos.g:7030:2: ( ruleInformationTemplate )
            {
            // InternalPagos.g:7030:2: ( ruleInformationTemplate )
            // InternalPagos.g:7031:3: ruleInformationTemplate
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
    // InternalPagos.g:7040:1: rule__Provider__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Provider__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7044:1: ( ( RULE_ID ) )
            // InternalPagos.g:7045:2: ( RULE_ID )
            {
            // InternalPagos.g:7045:2: ( RULE_ID )
            // InternalPagos.g:7046:3: RULE_ID
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
    // InternalPagos.g:7055:1: rule__Provider__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Provider__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7059:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7060:2: ( RULE_STRING )
            {
            // InternalPagos.g:7060:2: ( RULE_STRING )
            // InternalPagos.g:7061:3: RULE_STRING
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
    // InternalPagos.g:7070:1: rule__Provider__AttListsAssignment_13 : ( ruleBusinessAttribute ) ;
    public final void rule__Provider__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7074:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7075:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7075:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7076:3: ruleBusinessAttribute
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
    // InternalPagos.g:7085:1: rule__Provider__AttListsAssignment_14_1 : ( ruleBusinessAttribute ) ;
    public final void rule__Provider__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7089:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7090:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7090:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7091:3: ruleBusinessAttribute
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
    // InternalPagos.g:7100:1: rule__InformationTemplate__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__InformationTemplate__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7104:1: ( ( RULE_ID ) )
            // InternalPagos.g:7105:2: ( RULE_ID )
            {
            // InternalPagos.g:7105:2: ( RULE_ID )
            // InternalPagos.g:7106:3: RULE_ID
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
    // InternalPagos.g:7115:1: rule__InformationTemplate__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__InformationTemplate__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7119:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7120:2: ( RULE_STRING )
            {
            // InternalPagos.g:7120:2: ( RULE_STRING )
            // InternalPagos.g:7121:3: RULE_STRING
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
    // InternalPagos.g:7130:1: rule__InformationTemplate__AttListsAssignment_13 : ( ruleBusinessAttribute ) ;
    public final void rule__InformationTemplate__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7134:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7135:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7135:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7136:3: ruleBusinessAttribute
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
    // InternalPagos.g:7145:1: rule__InformationTemplate__AttListsAssignment_14_1 : ( ruleBusinessAttribute ) ;
    public final void rule__InformationTemplate__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7149:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7150:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7150:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7151:3: ruleBusinessAttribute
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


    // $ANTLR start "rule__InformationTemplate__TemplatesAssignment_17_4"
    // InternalPagos.g:7160:1: rule__InformationTemplate__TemplatesAssignment_17_4 : ( ruleCalculationTemplate ) ;
    public final void rule__InformationTemplate__TemplatesAssignment_17_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7164:1: ( ( ruleCalculationTemplate ) )
            // InternalPagos.g:7165:2: ( ruleCalculationTemplate )
            {
            // InternalPagos.g:7165:2: ( ruleCalculationTemplate )
            // InternalPagos.g:7166:3: ruleCalculationTemplate
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplatesCalculationTemplateParserRuleCall_17_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCalculationTemplate();

            state._fsp--;

             after(grammarAccess.getInformationTemplateAccess().getTemplatesCalculationTemplateParserRuleCall_17_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__TemplatesAssignment_17_4"


    // $ANTLR start "rule__InformationTemplate__TemplatesAssignment_17_5_1"
    // InternalPagos.g:7175:1: rule__InformationTemplate__TemplatesAssignment_17_5_1 : ( ruleCalculationTemplate ) ;
    public final void rule__InformationTemplate__TemplatesAssignment_17_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7179:1: ( ( ruleCalculationTemplate ) )
            // InternalPagos.g:7180:2: ( ruleCalculationTemplate )
            {
            // InternalPagos.g:7180:2: ( ruleCalculationTemplate )
            // InternalPagos.g:7181:3: ruleCalculationTemplate
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplatesCalculationTemplateParserRuleCall_17_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCalculationTemplate();

            state._fsp--;

             after(grammarAccess.getInformationTemplateAccess().getTemplatesCalculationTemplateParserRuleCall_17_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__TemplatesAssignment_17_5_1"


    // $ANTLR start "rule__InformationTemplate__ProvidersAssignment_18_4"
    // InternalPagos.g:7190:1: rule__InformationTemplate__ProvidersAssignment_18_4 : ( ruleProvider ) ;
    public final void rule__InformationTemplate__ProvidersAssignment_18_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7194:1: ( ( ruleProvider ) )
            // InternalPagos.g:7195:2: ( ruleProvider )
            {
            // InternalPagos.g:7195:2: ( ruleProvider )
            // InternalPagos.g:7196:3: ruleProvider
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
    // InternalPagos.g:7205:1: rule__InformationTemplate__ProvidersAssignment_18_5_1 : ( ruleProvider ) ;
    public final void rule__InformationTemplate__ProvidersAssignment_18_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7209:1: ( ( ruleProvider ) )
            // InternalPagos.g:7210:2: ( ruleProvider )
            {
            // InternalPagos.g:7210:2: ( ruleProvider )
            // InternalPagos.g:7211:3: ruleProvider
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
    // InternalPagos.g:7220:1: rule__CalculationTemplate__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__CalculationTemplate__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7224:1: ( ( RULE_ID ) )
            // InternalPagos.g:7225:2: ( RULE_ID )
            {
            // InternalPagos.g:7225:2: ( RULE_ID )
            // InternalPagos.g:7226:3: RULE_ID
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
    // InternalPagos.g:7235:1: rule__CalculationTemplate__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__CalculationTemplate__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7239:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7240:2: ( RULE_STRING )
            {
            // InternalPagos.g:7240:2: ( RULE_STRING )
            // InternalPagos.g:7241:3: RULE_STRING
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


    // $ANTLR start "rule__CalculationTemplate__AttListsAssignment_13"
    // InternalPagos.g:7250:1: rule__CalculationTemplate__AttListsAssignment_13 : ( ruleBusinessAttribute ) ;
    public final void rule__CalculationTemplate__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7254:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7255:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7255:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7256:3: ruleBusinessAttribute
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleBusinessAttribute();

            state._fsp--;

             after(grammarAccess.getCalculationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__AttListsAssignment_13"


    // $ANTLR start "rule__CalculationTemplate__AttListsAssignment_14_1"
    // InternalPagos.g:7265:1: rule__CalculationTemplate__AttListsAssignment_14_1 : ( ruleBusinessAttribute ) ;
    public final void rule__CalculationTemplate__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7269:1: ( ( ruleBusinessAttribute ) )
            // InternalPagos.g:7270:2: ( ruleBusinessAttribute )
            {
            // InternalPagos.g:7270:2: ( ruleBusinessAttribute )
            // InternalPagos.g:7271:3: ruleBusinessAttribute
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBusinessAttribute();

            state._fsp--;

             after(grammarAccess.getCalculationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__AttListsAssignment_14_1"


    // $ANTLR start "rule__CalculationTemplate__FormulasAssignment_19"
    // InternalPagos.g:7280:1: rule__CalculationTemplate__FormulasAssignment_19 : ( ruleFormula ) ;
    public final void rule__CalculationTemplate__FormulasAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7284:1: ( ( ruleFormula ) )
            // InternalPagos.g:7285:2: ( ruleFormula )
            {
            // InternalPagos.g:7285:2: ( ruleFormula )
            // InternalPagos.g:7286:3: ruleFormula
            {
             before(grammarAccess.getCalculationTemplateAccess().getFormulasFormulaParserRuleCall_19_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getCalculationTemplateAccess().getFormulasFormulaParserRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__FormulasAssignment_19"


    // $ANTLR start "rule__Formula__FormulaBodyAssignment_0_1"
    // InternalPagos.g:7295:1: rule__Formula__FormulaBodyAssignment_0_1 : ( ruleIfBlock ) ;
    public final void rule__Formula__FormulaBodyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7299:1: ( ( ruleIfBlock ) )
            // InternalPagos.g:7300:2: ( ruleIfBlock )
            {
            // InternalPagos.g:7300:2: ( ruleIfBlock )
            // InternalPagos.g:7301:3: ruleIfBlock
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
    // InternalPagos.g:7310:1: rule__Formula__FormulaReturnAssignment_1 : ( ruleReturnBlock ) ;
    public final void rule__Formula__FormulaReturnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7314:1: ( ( ruleReturnBlock ) )
            // InternalPagos.g:7315:2: ( ruleReturnBlock )
            {
            // InternalPagos.g:7315:2: ( ruleReturnBlock )
            // InternalPagos.g:7316:3: ruleReturnBlock
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
    // InternalPagos.g:7325:1: rule__IfBlock__IfSentenceAssignment_1 : ( ruleIfCondition ) ;
    public final void rule__IfBlock__IfSentenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7329:1: ( ( ruleIfCondition ) )
            // InternalPagos.g:7330:2: ( ruleIfCondition )
            {
            // InternalPagos.g:7330:2: ( ruleIfCondition )
            // InternalPagos.g:7331:3: ruleIfCondition
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
    // InternalPagos.g:7340:1: rule__IfBlock__ElseSentenceAssignment_2_1 : ( ruleElseSegment ) ;
    public final void rule__IfBlock__ElseSentenceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7344:1: ( ( ruleElseSegment ) )
            // InternalPagos.g:7345:2: ( ruleElseSegment )
            {
            // InternalPagos.g:7345:2: ( ruleElseSegment )
            // InternalPagos.g:7346:3: ruleElseSegment
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
    // InternalPagos.g:7355:1: rule__IfCondition__LogExpAssignment_3 : ( ruleExpresionLogica ) ;
    public final void rule__IfCondition__LogExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7359:1: ( ( ruleExpresionLogica ) )
            // InternalPagos.g:7360:2: ( ruleExpresionLogica )
            {
            // InternalPagos.g:7360:2: ( ruleExpresionLogica )
            // InternalPagos.g:7361:3: ruleExpresionLogica
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


    // $ANTLR start "rule__IfCondition__ExpressionAssignment_9"
    // InternalPagos.g:7370:1: rule__IfCondition__ExpressionAssignment_9 : ( ruleAdicion ) ;
    public final void rule__IfCondition__ExpressionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7374:1: ( ( ruleAdicion ) )
            // InternalPagos.g:7375:2: ( ruleAdicion )
            {
            // InternalPagos.g:7375:2: ( ruleAdicion )
            // InternalPagos.g:7376:3: ruleAdicion
            {
             before(grammarAccess.getIfConditionAccess().getExpressionAdicionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleAdicion();

            state._fsp--;

             after(grammarAccess.getIfConditionAccess().getExpressionAdicionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCondition__ExpressionAssignment_9"


    // $ANTLR start "rule__ElseSegment__IfSentenceAssignment_2"
    // InternalPagos.g:7385:1: rule__ElseSegment__IfSentenceAssignment_2 : ( ruleFormula ) ;
    public final void rule__ElseSegment__IfSentenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7389:1: ( ( ruleFormula ) )
            // InternalPagos.g:7390:2: ( ruleFormula )
            {
            // InternalPagos.g:7390:2: ( ruleFormula )
            // InternalPagos.g:7391:3: ruleFormula
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
    // InternalPagos.g:7400:1: rule__ReturnBlock__ExpressionAssignment_3 : ( ruleAdicion ) ;
    public final void rule__ReturnBlock__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7404:1: ( ( ruleAdicion ) )
            // InternalPagos.g:7405:2: ( ruleAdicion )
            {
            // InternalPagos.g:7405:2: ( ruleAdicion )
            // InternalPagos.g:7406:3: ruleAdicion
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
    // InternalPagos.g:7415:1: rule__ExpresionLogica__VariableAssignment_0 : ( ruleTerminalValue ) ;
    public final void rule__ExpresionLogica__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7419:1: ( ( ruleTerminalValue ) )
            // InternalPagos.g:7420:2: ( ruleTerminalValue )
            {
            // InternalPagos.g:7420:2: ( ruleTerminalValue )
            // InternalPagos.g:7421:3: ruleTerminalValue
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
    // InternalPagos.g:7430:1: rule__ExpresionLogica__LogOperAssignment_1_0 : ( RULE_OPERADORLOGICO ) ;
    public final void rule__ExpresionLogica__LogOperAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7434:1: ( ( RULE_OPERADORLOGICO ) )
            // InternalPagos.g:7435:2: ( RULE_OPERADORLOGICO )
            {
            // InternalPagos.g:7435:2: ( RULE_OPERADORLOGICO )
            // InternalPagos.g:7436:3: RULE_OPERADORLOGICO
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
    // InternalPagos.g:7445:1: rule__ExpresionLogica__Variable2Assignment_1_1_0 : ( ruleTerminalValue ) ;
    public final void rule__ExpresionLogica__Variable2Assignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7449:1: ( ( ruleTerminalValue ) )
            // InternalPagos.g:7450:2: ( ruleTerminalValue )
            {
            // InternalPagos.g:7450:2: ( ruleTerminalValue )
            // InternalPagos.g:7451:3: ruleTerminalValue
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
    // InternalPagos.g:7460:1: rule__ExpresionLogica__LiteralAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__ExpresionLogica__LiteralAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7464:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7465:2: ( RULE_STRING )
            {
            // InternalPagos.g:7465:2: ( RULE_STRING )
            // InternalPagos.g:7466:3: RULE_STRING
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


    // $ANTLR start "rule__ExpresionLogica__ExpAssignment_2_1"
    // InternalPagos.g:7475:1: rule__ExpresionLogica__ExpAssignment_2_1 : ( ruleExpresionLogica ) ;
    public final void rule__ExpresionLogica__ExpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7479:1: ( ( ruleExpresionLogica ) )
            // InternalPagos.g:7480:2: ( ruleExpresionLogica )
            {
            // InternalPagos.g:7480:2: ( ruleExpresionLogica )
            // InternalPagos.g:7481:3: ruleExpresionLogica
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
    // InternalPagos.g:7490:1: rule__Adicion__OperatorAssignment_1_1 : ( RULE_ADDOP ) ;
    public final void rule__Adicion__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7494:1: ( ( RULE_ADDOP ) )
            // InternalPagos.g:7495:2: ( RULE_ADDOP )
            {
            // InternalPagos.g:7495:2: ( RULE_ADDOP )
            // InternalPagos.g:7496:3: RULE_ADDOP
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
    // InternalPagos.g:7505:1: rule__Adicion__RexpAssignment_1_2 : ( ruleMultiplicacion ) ;
    public final void rule__Adicion__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7509:1: ( ( ruleMultiplicacion ) )
            // InternalPagos.g:7510:2: ( ruleMultiplicacion )
            {
            // InternalPagos.g:7510:2: ( ruleMultiplicacion )
            // InternalPagos.g:7511:3: ruleMultiplicacion
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
    // InternalPagos.g:7520:1: rule__Multiplicacion__OperatorAssignment_1_1 : ( RULE_MULTOP ) ;
    public final void rule__Multiplicacion__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7524:1: ( ( RULE_MULTOP ) )
            // InternalPagos.g:7525:2: ( RULE_MULTOP )
            {
            // InternalPagos.g:7525:2: ( RULE_MULTOP )
            // InternalPagos.g:7526:3: RULE_MULTOP
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
    // InternalPagos.g:7535:1: rule__Multiplicacion__RexpAssignment_1_2 : ( ruleSigleExp ) ;
    public final void rule__Multiplicacion__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7539:1: ( ( ruleSigleExp ) )
            // InternalPagos.g:7540:2: ( ruleSigleExp )
            {
            // InternalPagos.g:7540:2: ( ruleSigleExp )
            // InternalPagos.g:7541:3: ruleSigleExp
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
    // InternalPagos.g:7550:1: rule__BusinessAttribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7554:1: ( ( RULE_ID ) )
            // InternalPagos.g:7555:2: ( RULE_ID )
            {
            // InternalPagos.g:7555:2: ( RULE_ID )
            // InternalPagos.g:7556:3: RULE_ID
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
    // InternalPagos.g:7565:1: rule__BusinessAttribute__TypeAssignment_4 : ( RULE_TYPE ) ;
    public final void rule__BusinessAttribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7569:1: ( ( RULE_TYPE ) )
            // InternalPagos.g:7570:2: ( RULE_TYPE )
            {
            // InternalPagos.g:7570:2: ( RULE_TYPE )
            // InternalPagos.g:7571:3: RULE_TYPE
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
    // InternalPagos.g:7580:1: rule__BusinessAttribute__ExpAssignment_5_1 : ( ruleAdicion ) ;
    public final void rule__BusinessAttribute__ExpAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7584:1: ( ( ruleAdicion ) )
            // InternalPagos.g:7585:2: ( ruleAdicion )
            {
            // InternalPagos.g:7585:2: ( ruleAdicion )
            // InternalPagos.g:7586:3: ruleAdicion
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


    // $ANTLR start "rule__TerminalValue__VariableAssignment_0_1"
    // InternalPagos.g:7595:1: rule__TerminalValue__VariableAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__VariableAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7599:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:7600:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:7600:2: ( ( RULE_ID ) )
            // InternalPagos.g:7601:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_0_1_0()); 
            // InternalPagos.g:7602:3: ( RULE_ID )
            // InternalPagos.g:7603:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__VariableAssignment_0_1"


    // $ANTLR start "rule__TerminalValue__ValorAssignment_1"
    // InternalPagos.g:7614:1: rule__TerminalValue__ValorAssignment_1 : ( ruleNumber ) ;
    public final void rule__TerminalValue__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7618:1: ( ( ruleNumber ) )
            // InternalPagos.g:7619:2: ( ruleNumber )
            {
            // InternalPagos.g:7619:2: ( ruleNumber )
            // InternalPagos.g:7620:3: ruleNumber
            {
             before(grammarAccess.getTerminalValueAccess().getValorNumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getTerminalValueAccess().getValorNumberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalValue__ValorAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000010010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000240000010010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000030010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000100L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000030000000L});

}