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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_LBRACE", "RULE_COLON", "RULE_COMMA", "RULE_RBRACE", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_ELSE", "RULE_IF", "RULE_THEN", "RULE_RETURN", "RULE_LOGICALCONN", "RULE_ID", "RULE_STRING", "RULE_OPERADORLOGICO", "RULE_TYPE", "RULE_ADDOP", "RULE_MULTOP", "RULE_DASH", "RULE_STR_ESC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'name'", "'intermediary'", "'superentities'", "'description'", "'attributes'", "'entities'", "'InformationTemplate'", "'FormAttributes'", "'calculationtemplates'", "'providers'", "'calculationattributes'", "'calculationrules'", "'('", "')'", "':='", "'.'"
    };
    public static final int RULE_RETURN=14;
    public static final int RULE_ID=16;
    public static final int RULE_COMMA=7;
    public static final int RULE_THEN=13;
    public static final int RULE_COLON=6;
    public static final int RULE_LOGICALCONN=15;
    public static final int RULE_TYPE=19;
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
    public static final int RULE_ADDOP=20;
    public static final int RULE_ANY_OTHER=27;
    public static final int RULE_RBRACE=8;
    public static final int T__44=44;
    public static final int RULE_MULTOP=21;
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


    // $ANTLR start "entryRuleAttribute"
    // InternalPagos.g:453:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalPagos.g:454:1: ( ruleAttribute EOF )
            // InternalPagos.g:455:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalPagos.g:462:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:466:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalPagos.g:467:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalPagos.g:467:2: ( ( rule__Attribute__Group__0 ) )
            // InternalPagos.g:468:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalPagos.g:469:3: ( rule__Attribute__Group__0 )
            // InternalPagos.g:469:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


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


    // $ANTLR start "entryRulemathADD"
    // InternalPagos.g:503:1: entryRulemathADD : rulemathADD EOF ;
    public final void entryRulemathADD() throws RecognitionException {
        try {
            // InternalPagos.g:504:1: ( rulemathADD EOF )
            // InternalPagos.g:505:1: rulemathADD EOF
            {
             before(grammarAccess.getMathADDRule()); 
            pushFollow(FOLLOW_1);
            rulemathADD();

            state._fsp--;

             after(grammarAccess.getMathADDRule()); 
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
    // $ANTLR end "entryRulemathADD"


    // $ANTLR start "rulemathADD"
    // InternalPagos.g:512:1: rulemathADD : ( ( rule__MathADD__Group__0 ) ) ;
    public final void rulemathADD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:516:2: ( ( ( rule__MathADD__Group__0 ) ) )
            // InternalPagos.g:517:2: ( ( rule__MathADD__Group__0 ) )
            {
            // InternalPagos.g:517:2: ( ( rule__MathADD__Group__0 ) )
            // InternalPagos.g:518:3: ( rule__MathADD__Group__0 )
            {
             before(grammarAccess.getMathADDAccess().getGroup()); 
            // InternalPagos.g:519:3: ( rule__MathADD__Group__0 )
            // InternalPagos.g:519:4: rule__MathADD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MathADD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathADDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemathADD"


    // $ANTLR start "entryRulemathMULT"
    // InternalPagos.g:528:1: entryRulemathMULT : rulemathMULT EOF ;
    public final void entryRulemathMULT() throws RecognitionException {
        try {
            // InternalPagos.g:529:1: ( rulemathMULT EOF )
            // InternalPagos.g:530:1: rulemathMULT EOF
            {
             before(grammarAccess.getMathMULTRule()); 
            pushFollow(FOLLOW_1);
            rulemathMULT();

            state._fsp--;

             after(grammarAccess.getMathMULTRule()); 
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
    // $ANTLR end "entryRulemathMULT"


    // $ANTLR start "rulemathMULT"
    // InternalPagos.g:537:1: rulemathMULT : ( ( rule__MathMULT__Group__0 ) ) ;
    public final void rulemathMULT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:541:2: ( ( ( rule__MathMULT__Group__0 ) ) )
            // InternalPagos.g:542:2: ( ( rule__MathMULT__Group__0 ) )
            {
            // InternalPagos.g:542:2: ( ( rule__MathMULT__Group__0 ) )
            // InternalPagos.g:543:3: ( rule__MathMULT__Group__0 )
            {
             before(grammarAccess.getMathMULTAccess().getGroup()); 
            // InternalPagos.g:544:3: ( rule__MathMULT__Group__0 )
            // InternalPagos.g:544:4: rule__MathMULT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MathMULT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathMULTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemathMULT"


    // $ANTLR start "entryRuleNumber"
    // InternalPagos.g:553:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalPagos.g:554:1: ( ruleNumber EOF )
            // InternalPagos.g:555:1: ruleNumber EOF
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
    // InternalPagos.g:562:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:566:2: ( ( ( rule__Number__Alternatives ) ) )
            // InternalPagos.g:567:2: ( ( rule__Number__Alternatives ) )
            {
            // InternalPagos.g:567:2: ( ( rule__Number__Alternatives ) )
            // InternalPagos.g:568:3: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // InternalPagos.g:569:3: ( rule__Number__Alternatives )
            // InternalPagos.g:569:4: rule__Number__Alternatives
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
    // InternalPagos.g:578:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalPagos.g:579:1: ( ruleEDouble EOF )
            // InternalPagos.g:580:1: ruleEDouble EOF
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
    // InternalPagos.g:587:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:591:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalPagos.g:592:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalPagos.g:592:2: ( ( rule__EDouble__Group__0 ) )
            // InternalPagos.g:593:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalPagos.g:594:3: ( rule__EDouble__Group__0 )
            // InternalPagos.g:594:4: rule__EDouble__Group__0
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
    // InternalPagos.g:603:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalPagos.g:604:1: ( ruleInteger EOF )
            // InternalPagos.g:605:1: ruleInteger EOF
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
    // InternalPagos.g:612:1: ruleInteger : ( RULE_INT ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:616:2: ( ( RULE_INT ) )
            // InternalPagos.g:617:2: ( RULE_INT )
            {
            // InternalPagos.g:617:2: ( RULE_INT )
            // InternalPagos.g:618:3: RULE_INT
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
    // InternalPagos.g:627:1: rule__Formula__Alternatives : ( ( ( rule__Formula__Group_0__0 ) ) | ( ( rule__Formula__FormulaReturnAssignment_1 ) ) );
    public final void rule__Formula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:631:1: ( ( ( rule__Formula__Group_0__0 ) ) | ( ( rule__Formula__FormulaReturnAssignment_1 ) ) )
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
                    // InternalPagos.g:632:2: ( ( rule__Formula__Group_0__0 ) )
                    {
                    // InternalPagos.g:632:2: ( ( rule__Formula__Group_0__0 ) )
                    // InternalPagos.g:633:3: ( rule__Formula__Group_0__0 )
                    {
                     before(grammarAccess.getFormulaAccess().getGroup_0()); 
                    // InternalPagos.g:634:3: ( rule__Formula__Group_0__0 )
                    // InternalPagos.g:634:4: rule__Formula__Group_0__0
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
                    // InternalPagos.g:638:2: ( ( rule__Formula__FormulaReturnAssignment_1 ) )
                    {
                    // InternalPagos.g:638:2: ( ( rule__Formula__FormulaReturnAssignment_1 ) )
                    // InternalPagos.g:639:3: ( rule__Formula__FormulaReturnAssignment_1 )
                    {
                     before(grammarAccess.getFormulaAccess().getFormulaReturnAssignment_1()); 
                    // InternalPagos.g:640:3: ( rule__Formula__FormulaReturnAssignment_1 )
                    // InternalPagos.g:640:4: rule__Formula__FormulaReturnAssignment_1
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
    // InternalPagos.g:648:1: rule__ExpresionLogica__Alternatives_1_1 : ( ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) ) | ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) ) );
    public final void rule__ExpresionLogica__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:652:1: ( ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) ) | ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) ) )
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
                    // InternalPagos.g:653:2: ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) )
                    {
                    // InternalPagos.g:653:2: ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) )
                    // InternalPagos.g:654:3: ( rule__ExpresionLogica__Variable2Assignment_1_1_0 )
                    {
                     before(grammarAccess.getExpresionLogicaAccess().getVariable2Assignment_1_1_0()); 
                    // InternalPagos.g:655:3: ( rule__ExpresionLogica__Variable2Assignment_1_1_0 )
                    // InternalPagos.g:655:4: rule__ExpresionLogica__Variable2Assignment_1_1_0
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
                    // InternalPagos.g:659:2: ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) )
                    {
                    // InternalPagos.g:659:2: ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) )
                    // InternalPagos.g:660:3: ( rule__ExpresionLogica__LiteralAssignment_1_1_1 )
                    {
                     before(grammarAccess.getExpresionLogicaAccess().getLiteralAssignment_1_1_1()); 
                    // InternalPagos.g:661:3: ( rule__ExpresionLogica__LiteralAssignment_1_1_1 )
                    // InternalPagos.g:661:4: rule__ExpresionLogica__LiteralAssignment_1_1_1
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
    // InternalPagos.g:669:1: rule__SigleExp__Alternatives : ( ( ruleTerminalValue ) | ( ( rule__SigleExp__Group_1__0 ) ) );
    public final void rule__SigleExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:673:1: ( ( ruleTerminalValue ) | ( ( rule__SigleExp__Group_1__0 ) ) )
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
                    // InternalPagos.g:674:2: ( ruleTerminalValue )
                    {
                    // InternalPagos.g:674:2: ( ruleTerminalValue )
                    // InternalPagos.g:675:3: ruleTerminalValue
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
                    // InternalPagos.g:680:2: ( ( rule__SigleExp__Group_1__0 ) )
                    {
                    // InternalPagos.g:680:2: ( ( rule__SigleExp__Group_1__0 ) )
                    // InternalPagos.g:681:3: ( rule__SigleExp__Group_1__0 )
                    {
                     before(grammarAccess.getSigleExpAccess().getGroup_1()); 
                    // InternalPagos.g:682:3: ( rule__SigleExp__Group_1__0 )
                    // InternalPagos.g:682:4: rule__SigleExp__Group_1__0
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
    // InternalPagos.g:690:1: rule__TerminalValue__Alternatives : ( ( ( rule__TerminalValue__Group_0__0 ) ) | ( ( rule__TerminalValue__ValorAssignment_1 ) ) );
    public final void rule__TerminalValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:694:1: ( ( ( rule__TerminalValue__Group_0__0 ) ) | ( ( rule__TerminalValue__ValorAssignment_1 ) ) )
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
                    // InternalPagos.g:695:2: ( ( rule__TerminalValue__Group_0__0 ) )
                    {
                    // InternalPagos.g:695:2: ( ( rule__TerminalValue__Group_0__0 ) )
                    // InternalPagos.g:696:3: ( rule__TerminalValue__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalValueAccess().getGroup_0()); 
                    // InternalPagos.g:697:3: ( rule__TerminalValue__Group_0__0 )
                    // InternalPagos.g:697:4: rule__TerminalValue__Group_0__0
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
                    // InternalPagos.g:701:2: ( ( rule__TerminalValue__ValorAssignment_1 ) )
                    {
                    // InternalPagos.g:701:2: ( ( rule__TerminalValue__ValorAssignment_1 ) )
                    // InternalPagos.g:702:3: ( rule__TerminalValue__ValorAssignment_1 )
                    {
                     before(grammarAccess.getTerminalValueAccess().getValorAssignment_1()); 
                    // InternalPagos.g:703:3: ( rule__TerminalValue__ValorAssignment_1 )
                    // InternalPagos.g:703:4: rule__TerminalValue__ValorAssignment_1
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
    // InternalPagos.g:711:1: rule__Number__Alternatives : ( ( ruleEDouble ) | ( ruleInteger ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:715:1: ( ( ruleEDouble ) | ( ruleInteger ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==45) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||LA5_1==RULE_RBRACE||LA5_1==RULE_RBRACKET||LA5_1==RULE_LOGICALCONN||LA5_1==RULE_OPERADORLOGICO||(LA5_1>=RULE_ADDOP && LA5_1<=RULE_MULTOP)||LA5_1==43) ) {
                    alt5=2;
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
                    // InternalPagos.g:716:2: ( ruleEDouble )
                    {
                    // InternalPagos.g:716:2: ( ruleEDouble )
                    // InternalPagos.g:717:3: ruleEDouble
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
                    // InternalPagos.g:722:2: ( ruleInteger )
                    {
                    // InternalPagos.g:722:2: ( ruleInteger )
                    // InternalPagos.g:723:3: ruleInteger
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
    // InternalPagos.g:732:1: rule__EDouble__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:736:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalPagos.g:737:2: ( 'E' )
                    {
                    // InternalPagos.g:737:2: ( 'E' )
                    // InternalPagos.g:738:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:743:2: ( 'e' )
                    {
                    // InternalPagos.g:743:2: ( 'e' )
                    // InternalPagos.g:744:3: 'e'
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
    // InternalPagos.g:753:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:757:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalPagos.g:758:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalPagos.g:765:1: rule__Application__Group__0__Impl : ( RULE_LBRACE ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:769:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:770:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:770:1: ( RULE_LBRACE )
            // InternalPagos.g:771:2: RULE_LBRACE
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
    // InternalPagos.g:780:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:784:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalPagos.g:785:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalPagos.g:792:1: rule__Application__Group__1__Impl : ( 'name' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:796:1: ( ( 'name' ) )
            // InternalPagos.g:797:1: ( 'name' )
            {
            // InternalPagos.g:797:1: ( 'name' )
            // InternalPagos.g:798:2: 'name'
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
    // InternalPagos.g:807:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:811:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalPagos.g:812:2: rule__Application__Group__2__Impl rule__Application__Group__3
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
    // InternalPagos.g:819:1: rule__Application__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:823:1: ( ( RULE_COLON ) )
            // InternalPagos.g:824:1: ( RULE_COLON )
            {
            // InternalPagos.g:824:1: ( RULE_COLON )
            // InternalPagos.g:825:2: RULE_COLON
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
    // InternalPagos.g:834:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:838:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalPagos.g:839:2: rule__Application__Group__3__Impl rule__Application__Group__4
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
    // InternalPagos.g:846:1: rule__Application__Group__3__Impl : ( ( rule__Application__NameAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:850:1: ( ( ( rule__Application__NameAssignment_3 ) ) )
            // InternalPagos.g:851:1: ( ( rule__Application__NameAssignment_3 ) )
            {
            // InternalPagos.g:851:1: ( ( rule__Application__NameAssignment_3 ) )
            // InternalPagos.g:852:2: ( rule__Application__NameAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_3()); 
            // InternalPagos.g:853:2: ( rule__Application__NameAssignment_3 )
            // InternalPagos.g:853:3: rule__Application__NameAssignment_3
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
    // InternalPagos.g:861:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:865:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalPagos.g:866:2: rule__Application__Group__4__Impl rule__Application__Group__5
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
    // InternalPagos.g:873:1: rule__Application__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:877:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:878:1: ( RULE_COMMA )
            {
            // InternalPagos.g:878:1: ( RULE_COMMA )
            // InternalPagos.g:879:2: RULE_COMMA
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
    // InternalPagos.g:888:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:892:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalPagos.g:893:2: rule__Application__Group__5__Impl rule__Application__Group__6
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
    // InternalPagos.g:900:1: rule__Application__Group__5__Impl : ( 'intermediary' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:904:1: ( ( 'intermediary' ) )
            // InternalPagos.g:905:1: ( 'intermediary' )
            {
            // InternalPagos.g:905:1: ( 'intermediary' )
            // InternalPagos.g:906:2: 'intermediary'
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
    // InternalPagos.g:915:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:919:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // InternalPagos.g:920:2: rule__Application__Group__6__Impl rule__Application__Group__7
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
    // InternalPagos.g:927:1: rule__Application__Group__6__Impl : ( RULE_COLON ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:931:1: ( ( RULE_COLON ) )
            // InternalPagos.g:932:1: ( RULE_COLON )
            {
            // InternalPagos.g:932:1: ( RULE_COLON )
            // InternalPagos.g:933:2: RULE_COLON
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
    // InternalPagos.g:942:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:946:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // InternalPagos.g:947:2: rule__Application__Group__7__Impl rule__Application__Group__8
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
    // InternalPagos.g:954:1: rule__Application__Group__7__Impl : ( ( rule__Application__IntermediaryAssignment_7 ) ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:958:1: ( ( ( rule__Application__IntermediaryAssignment_7 ) ) )
            // InternalPagos.g:959:1: ( ( rule__Application__IntermediaryAssignment_7 ) )
            {
            // InternalPagos.g:959:1: ( ( rule__Application__IntermediaryAssignment_7 ) )
            // InternalPagos.g:960:2: ( rule__Application__IntermediaryAssignment_7 )
            {
             before(grammarAccess.getApplicationAccess().getIntermediaryAssignment_7()); 
            // InternalPagos.g:961:2: ( rule__Application__IntermediaryAssignment_7 )
            // InternalPagos.g:961:3: rule__Application__IntermediaryAssignment_7
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
    // InternalPagos.g:969:1: rule__Application__Group__8 : rule__Application__Group__8__Impl ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:973:1: ( rule__Application__Group__8__Impl )
            // InternalPagos.g:974:2: rule__Application__Group__8__Impl
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
    // InternalPagos.g:980:1: rule__Application__Group__8__Impl : ( RULE_RBRACE ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:984:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:985:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:985:1: ( RULE_RBRACE )
            // InternalPagos.g:986:2: RULE_RBRACE
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
    // InternalPagos.g:996:1: rule__Intermediary__Group__0 : rule__Intermediary__Group__0__Impl rule__Intermediary__Group__1 ;
    public final void rule__Intermediary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1000:1: ( rule__Intermediary__Group__0__Impl rule__Intermediary__Group__1 )
            // InternalPagos.g:1001:2: rule__Intermediary__Group__0__Impl rule__Intermediary__Group__1
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
    // InternalPagos.g:1008:1: rule__Intermediary__Group__0__Impl : ( () ) ;
    public final void rule__Intermediary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1012:1: ( ( () ) )
            // InternalPagos.g:1013:1: ( () )
            {
            // InternalPagos.g:1013:1: ( () )
            // InternalPagos.g:1014:2: ()
            {
             before(grammarAccess.getIntermediaryAccess().getIntermediaryAction_0()); 
            // InternalPagos.g:1015:2: ()
            // InternalPagos.g:1015:3: 
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
    // InternalPagos.g:1023:1: rule__Intermediary__Group__1 : rule__Intermediary__Group__1__Impl rule__Intermediary__Group__2 ;
    public final void rule__Intermediary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1027:1: ( rule__Intermediary__Group__1__Impl rule__Intermediary__Group__2 )
            // InternalPagos.g:1028:2: rule__Intermediary__Group__1__Impl rule__Intermediary__Group__2
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
    // InternalPagos.g:1035:1: rule__Intermediary__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Intermediary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1039:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:1040:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:1040:1: ( RULE_LBRACE )
            // InternalPagos.g:1041:2: RULE_LBRACE
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
    // InternalPagos.g:1050:1: rule__Intermediary__Group__2 : rule__Intermediary__Group__2__Impl rule__Intermediary__Group__3 ;
    public final void rule__Intermediary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1054:1: ( rule__Intermediary__Group__2__Impl rule__Intermediary__Group__3 )
            // InternalPagos.g:1055:2: rule__Intermediary__Group__2__Impl rule__Intermediary__Group__3
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
    // InternalPagos.g:1062:1: rule__Intermediary__Group__2__Impl : ( 'name' ) ;
    public final void rule__Intermediary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1066:1: ( ( 'name' ) )
            // InternalPagos.g:1067:1: ( 'name' )
            {
            // InternalPagos.g:1067:1: ( 'name' )
            // InternalPagos.g:1068:2: 'name'
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
    // InternalPagos.g:1077:1: rule__Intermediary__Group__3 : rule__Intermediary__Group__3__Impl rule__Intermediary__Group__4 ;
    public final void rule__Intermediary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1081:1: ( rule__Intermediary__Group__3__Impl rule__Intermediary__Group__4 )
            // InternalPagos.g:1082:2: rule__Intermediary__Group__3__Impl rule__Intermediary__Group__4
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
    // InternalPagos.g:1089:1: rule__Intermediary__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Intermediary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1093:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1094:1: ( RULE_COLON )
            {
            // InternalPagos.g:1094:1: ( RULE_COLON )
            // InternalPagos.g:1095:2: RULE_COLON
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
    // InternalPagos.g:1104:1: rule__Intermediary__Group__4 : rule__Intermediary__Group__4__Impl rule__Intermediary__Group__5 ;
    public final void rule__Intermediary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1108:1: ( rule__Intermediary__Group__4__Impl rule__Intermediary__Group__5 )
            // InternalPagos.g:1109:2: rule__Intermediary__Group__4__Impl rule__Intermediary__Group__5
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
    // InternalPagos.g:1116:1: rule__Intermediary__Group__4__Impl : ( ( rule__Intermediary__NameAssignment_4 ) ) ;
    public final void rule__Intermediary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1120:1: ( ( ( rule__Intermediary__NameAssignment_4 ) ) )
            // InternalPagos.g:1121:1: ( ( rule__Intermediary__NameAssignment_4 ) )
            {
            // InternalPagos.g:1121:1: ( ( rule__Intermediary__NameAssignment_4 ) )
            // InternalPagos.g:1122:2: ( rule__Intermediary__NameAssignment_4 )
            {
             before(grammarAccess.getIntermediaryAccess().getNameAssignment_4()); 
            // InternalPagos.g:1123:2: ( rule__Intermediary__NameAssignment_4 )
            // InternalPagos.g:1123:3: rule__Intermediary__NameAssignment_4
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
    // InternalPagos.g:1131:1: rule__Intermediary__Group__5 : rule__Intermediary__Group__5__Impl rule__Intermediary__Group__6 ;
    public final void rule__Intermediary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1135:1: ( rule__Intermediary__Group__5__Impl rule__Intermediary__Group__6 )
            // InternalPagos.g:1136:2: rule__Intermediary__Group__5__Impl rule__Intermediary__Group__6
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
    // InternalPagos.g:1143:1: rule__Intermediary__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Intermediary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1147:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1148:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1148:1: ( RULE_COMMA )
            // InternalPagos.g:1149:2: RULE_COMMA
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
    // InternalPagos.g:1158:1: rule__Intermediary__Group__6 : rule__Intermediary__Group__6__Impl rule__Intermediary__Group__7 ;
    public final void rule__Intermediary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1162:1: ( rule__Intermediary__Group__6__Impl rule__Intermediary__Group__7 )
            // InternalPagos.g:1163:2: rule__Intermediary__Group__6__Impl rule__Intermediary__Group__7
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
    // InternalPagos.g:1170:1: rule__Intermediary__Group__6__Impl : ( 'superentities' ) ;
    public final void rule__Intermediary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1174:1: ( ( 'superentities' ) )
            // InternalPagos.g:1175:1: ( 'superentities' )
            {
            // InternalPagos.g:1175:1: ( 'superentities' )
            // InternalPagos.g:1176:2: 'superentities'
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
    // InternalPagos.g:1185:1: rule__Intermediary__Group__7 : rule__Intermediary__Group__7__Impl rule__Intermediary__Group__8 ;
    public final void rule__Intermediary__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1189:1: ( rule__Intermediary__Group__7__Impl rule__Intermediary__Group__8 )
            // InternalPagos.g:1190:2: rule__Intermediary__Group__7__Impl rule__Intermediary__Group__8
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
    // InternalPagos.g:1197:1: rule__Intermediary__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__Intermediary__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1201:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1202:1: ( RULE_COLON )
            {
            // InternalPagos.g:1202:1: ( RULE_COLON )
            // InternalPagos.g:1203:2: RULE_COLON
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
    // InternalPagos.g:1212:1: rule__Intermediary__Group__8 : rule__Intermediary__Group__8__Impl rule__Intermediary__Group__9 ;
    public final void rule__Intermediary__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1216:1: ( rule__Intermediary__Group__8__Impl rule__Intermediary__Group__9 )
            // InternalPagos.g:1217:2: rule__Intermediary__Group__8__Impl rule__Intermediary__Group__9
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
    // InternalPagos.g:1224:1: rule__Intermediary__Group__8__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Intermediary__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1228:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:1229:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:1229:1: ( RULE_LBRACKET )
            // InternalPagos.g:1230:2: RULE_LBRACKET
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
    // InternalPagos.g:1239:1: rule__Intermediary__Group__9 : rule__Intermediary__Group__9__Impl rule__Intermediary__Group__10 ;
    public final void rule__Intermediary__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1243:1: ( rule__Intermediary__Group__9__Impl rule__Intermediary__Group__10 )
            // InternalPagos.g:1244:2: rule__Intermediary__Group__9__Impl rule__Intermediary__Group__10
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
    // InternalPagos.g:1251:1: rule__Intermediary__Group__9__Impl : ( ( rule__Intermediary__SuperentitieAssignment_9 ) ) ;
    public final void rule__Intermediary__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1255:1: ( ( ( rule__Intermediary__SuperentitieAssignment_9 ) ) )
            // InternalPagos.g:1256:1: ( ( rule__Intermediary__SuperentitieAssignment_9 ) )
            {
            // InternalPagos.g:1256:1: ( ( rule__Intermediary__SuperentitieAssignment_9 ) )
            // InternalPagos.g:1257:2: ( rule__Intermediary__SuperentitieAssignment_9 )
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitieAssignment_9()); 
            // InternalPagos.g:1258:2: ( rule__Intermediary__SuperentitieAssignment_9 )
            // InternalPagos.g:1258:3: rule__Intermediary__SuperentitieAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Intermediary__SuperentitieAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getIntermediaryAccess().getSuperentitieAssignment_9()); 

            }


            }

        }
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
    // InternalPagos.g:1266:1: rule__Intermediary__Group__10 : rule__Intermediary__Group__10__Impl rule__Intermediary__Group__11 ;
    public final void rule__Intermediary__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1270:1: ( rule__Intermediary__Group__10__Impl rule__Intermediary__Group__11 )
            // InternalPagos.g:1271:2: rule__Intermediary__Group__10__Impl rule__Intermediary__Group__11
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
    // InternalPagos.g:1278:1: rule__Intermediary__Group__10__Impl : ( ( rule__Intermediary__Group_10__0 )* ) ;
    public final void rule__Intermediary__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1282:1: ( ( ( rule__Intermediary__Group_10__0 )* ) )
            // InternalPagos.g:1283:1: ( ( rule__Intermediary__Group_10__0 )* )
            {
            // InternalPagos.g:1283:1: ( ( rule__Intermediary__Group_10__0 )* )
            // InternalPagos.g:1284:2: ( rule__Intermediary__Group_10__0 )*
            {
             before(grammarAccess.getIntermediaryAccess().getGroup_10()); 
            // InternalPagos.g:1285:2: ( rule__Intermediary__Group_10__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPagos.g:1285:3: rule__Intermediary__Group_10__0
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
    // InternalPagos.g:1293:1: rule__Intermediary__Group__11 : rule__Intermediary__Group__11__Impl rule__Intermediary__Group__12 ;
    public final void rule__Intermediary__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1297:1: ( rule__Intermediary__Group__11__Impl rule__Intermediary__Group__12 )
            // InternalPagos.g:1298:2: rule__Intermediary__Group__11__Impl rule__Intermediary__Group__12
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
    // InternalPagos.g:1305:1: rule__Intermediary__Group__11__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Intermediary__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1309:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:1310:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:1310:1: ( RULE_RBRACKET )
            // InternalPagos.g:1311:2: RULE_RBRACKET
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
    // InternalPagos.g:1320:1: rule__Intermediary__Group__12 : rule__Intermediary__Group__12__Impl ;
    public final void rule__Intermediary__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1324:1: ( rule__Intermediary__Group__12__Impl )
            // InternalPagos.g:1325:2: rule__Intermediary__Group__12__Impl
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
    // InternalPagos.g:1331:1: rule__Intermediary__Group__12__Impl : ( RULE_RBRACE ) ;
    public final void rule__Intermediary__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1335:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:1336:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:1336:1: ( RULE_RBRACE )
            // InternalPagos.g:1337:2: RULE_RBRACE
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
    // InternalPagos.g:1347:1: rule__Intermediary__Group_10__0 : rule__Intermediary__Group_10__0__Impl rule__Intermediary__Group_10__1 ;
    public final void rule__Intermediary__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1351:1: ( rule__Intermediary__Group_10__0__Impl rule__Intermediary__Group_10__1 )
            // InternalPagos.g:1352:2: rule__Intermediary__Group_10__0__Impl rule__Intermediary__Group_10__1
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
    // InternalPagos.g:1359:1: rule__Intermediary__Group_10__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Intermediary__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1363:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1364:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1364:1: ( RULE_COMMA )
            // InternalPagos.g:1365:2: RULE_COMMA
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
    // InternalPagos.g:1374:1: rule__Intermediary__Group_10__1 : rule__Intermediary__Group_10__1__Impl ;
    public final void rule__Intermediary__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1378:1: ( rule__Intermediary__Group_10__1__Impl )
            // InternalPagos.g:1379:2: rule__Intermediary__Group_10__1__Impl
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
    // InternalPagos.g:1385:1: rule__Intermediary__Group_10__1__Impl : ( ( rule__Intermediary__SuperentitieAssignment_10_1 ) ) ;
    public final void rule__Intermediary__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1389:1: ( ( ( rule__Intermediary__SuperentitieAssignment_10_1 ) ) )
            // InternalPagos.g:1390:1: ( ( rule__Intermediary__SuperentitieAssignment_10_1 ) )
            {
            // InternalPagos.g:1390:1: ( ( rule__Intermediary__SuperentitieAssignment_10_1 ) )
            // InternalPagos.g:1391:2: ( rule__Intermediary__SuperentitieAssignment_10_1 )
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitieAssignment_10_1()); 
            // InternalPagos.g:1392:2: ( rule__Intermediary__SuperentitieAssignment_10_1 )
            // InternalPagos.g:1392:3: rule__Intermediary__SuperentitieAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Intermediary__SuperentitieAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getIntermediaryAccess().getSuperentitieAssignment_10_1()); 

            }


            }

        }
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
    // InternalPagos.g:1401:1: rule__SuperEntity__Group__0 : rule__SuperEntity__Group__0__Impl rule__SuperEntity__Group__1 ;
    public final void rule__SuperEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1405:1: ( rule__SuperEntity__Group__0__Impl rule__SuperEntity__Group__1 )
            // InternalPagos.g:1406:2: rule__SuperEntity__Group__0__Impl rule__SuperEntity__Group__1
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
    // InternalPagos.g:1413:1: rule__SuperEntity__Group__0__Impl : ( () ) ;
    public final void rule__SuperEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1417:1: ( ( () ) )
            // InternalPagos.g:1418:1: ( () )
            {
            // InternalPagos.g:1418:1: ( () )
            // InternalPagos.g:1419:2: ()
            {
             before(grammarAccess.getSuperEntityAccess().getSuperEntityAction_0()); 
            // InternalPagos.g:1420:2: ()
            // InternalPagos.g:1420:3: 
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
    // InternalPagos.g:1428:1: rule__SuperEntity__Group__1 : rule__SuperEntity__Group__1__Impl rule__SuperEntity__Group__2 ;
    public final void rule__SuperEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1432:1: ( rule__SuperEntity__Group__1__Impl rule__SuperEntity__Group__2 )
            // InternalPagos.g:1433:2: rule__SuperEntity__Group__1__Impl rule__SuperEntity__Group__2
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
    // InternalPagos.g:1440:1: rule__SuperEntity__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__SuperEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1444:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:1445:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:1445:1: ( RULE_LBRACE )
            // InternalPagos.g:1446:2: RULE_LBRACE
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
    // InternalPagos.g:1455:1: rule__SuperEntity__Group__2 : rule__SuperEntity__Group__2__Impl rule__SuperEntity__Group__3 ;
    public final void rule__SuperEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1459:1: ( rule__SuperEntity__Group__2__Impl rule__SuperEntity__Group__3 )
            // InternalPagos.g:1460:2: rule__SuperEntity__Group__2__Impl rule__SuperEntity__Group__3
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
    // InternalPagos.g:1467:1: rule__SuperEntity__Group__2__Impl : ( 'name' ) ;
    public final void rule__SuperEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1471:1: ( ( 'name' ) )
            // InternalPagos.g:1472:1: ( 'name' )
            {
            // InternalPagos.g:1472:1: ( 'name' )
            // InternalPagos.g:1473:2: 'name'
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
    // InternalPagos.g:1482:1: rule__SuperEntity__Group__3 : rule__SuperEntity__Group__3__Impl rule__SuperEntity__Group__4 ;
    public final void rule__SuperEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1486:1: ( rule__SuperEntity__Group__3__Impl rule__SuperEntity__Group__4 )
            // InternalPagos.g:1487:2: rule__SuperEntity__Group__3__Impl rule__SuperEntity__Group__4
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
    // InternalPagos.g:1494:1: rule__SuperEntity__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1498:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1499:1: ( RULE_COLON )
            {
            // InternalPagos.g:1499:1: ( RULE_COLON )
            // InternalPagos.g:1500:2: RULE_COLON
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
    // InternalPagos.g:1509:1: rule__SuperEntity__Group__4 : rule__SuperEntity__Group__4__Impl rule__SuperEntity__Group__5 ;
    public final void rule__SuperEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1513:1: ( rule__SuperEntity__Group__4__Impl rule__SuperEntity__Group__5 )
            // InternalPagos.g:1514:2: rule__SuperEntity__Group__4__Impl rule__SuperEntity__Group__5
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
    // InternalPagos.g:1521:1: rule__SuperEntity__Group__4__Impl : ( ( rule__SuperEntity__NameAssignment_4 ) ) ;
    public final void rule__SuperEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1525:1: ( ( ( rule__SuperEntity__NameAssignment_4 ) ) )
            // InternalPagos.g:1526:1: ( ( rule__SuperEntity__NameAssignment_4 ) )
            {
            // InternalPagos.g:1526:1: ( ( rule__SuperEntity__NameAssignment_4 ) )
            // InternalPagos.g:1527:2: ( rule__SuperEntity__NameAssignment_4 )
            {
             before(grammarAccess.getSuperEntityAccess().getNameAssignment_4()); 
            // InternalPagos.g:1528:2: ( rule__SuperEntity__NameAssignment_4 )
            // InternalPagos.g:1528:3: rule__SuperEntity__NameAssignment_4
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
    // InternalPagos.g:1536:1: rule__SuperEntity__Group__5 : rule__SuperEntity__Group__5__Impl rule__SuperEntity__Group__6 ;
    public final void rule__SuperEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1540:1: ( rule__SuperEntity__Group__5__Impl rule__SuperEntity__Group__6 )
            // InternalPagos.g:1541:2: rule__SuperEntity__Group__5__Impl rule__SuperEntity__Group__6
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
    // InternalPagos.g:1548:1: rule__SuperEntity__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1552:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1553:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1553:1: ( RULE_COMMA )
            // InternalPagos.g:1554:2: RULE_COMMA
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
    // InternalPagos.g:1563:1: rule__SuperEntity__Group__6 : rule__SuperEntity__Group__6__Impl rule__SuperEntity__Group__7 ;
    public final void rule__SuperEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1567:1: ( rule__SuperEntity__Group__6__Impl rule__SuperEntity__Group__7 )
            // InternalPagos.g:1568:2: rule__SuperEntity__Group__6__Impl rule__SuperEntity__Group__7
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
    // InternalPagos.g:1575:1: rule__SuperEntity__Group__6__Impl : ( 'description' ) ;
    public final void rule__SuperEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1579:1: ( ( 'description' ) )
            // InternalPagos.g:1580:1: ( 'description' )
            {
            // InternalPagos.g:1580:1: ( 'description' )
            // InternalPagos.g:1581:2: 'description'
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
    // InternalPagos.g:1590:1: rule__SuperEntity__Group__7 : rule__SuperEntity__Group__7__Impl rule__SuperEntity__Group__8 ;
    public final void rule__SuperEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1594:1: ( rule__SuperEntity__Group__7__Impl rule__SuperEntity__Group__8 )
            // InternalPagos.g:1595:2: rule__SuperEntity__Group__7__Impl rule__SuperEntity__Group__8
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
    // InternalPagos.g:1602:1: rule__SuperEntity__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1606:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1607:1: ( RULE_COLON )
            {
            // InternalPagos.g:1607:1: ( RULE_COLON )
            // InternalPagos.g:1608:2: RULE_COLON
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
    // InternalPagos.g:1617:1: rule__SuperEntity__Group__8 : rule__SuperEntity__Group__8__Impl rule__SuperEntity__Group__9 ;
    public final void rule__SuperEntity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1621:1: ( rule__SuperEntity__Group__8__Impl rule__SuperEntity__Group__9 )
            // InternalPagos.g:1622:2: rule__SuperEntity__Group__8__Impl rule__SuperEntity__Group__9
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
    // InternalPagos.g:1629:1: rule__SuperEntity__Group__8__Impl : ( ( rule__SuperEntity__DescriptionAssignment_8 ) ) ;
    public final void rule__SuperEntity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1633:1: ( ( ( rule__SuperEntity__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:1634:1: ( ( rule__SuperEntity__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:1634:1: ( ( rule__SuperEntity__DescriptionAssignment_8 ) )
            // InternalPagos.g:1635:2: ( rule__SuperEntity__DescriptionAssignment_8 )
            {
             before(grammarAccess.getSuperEntityAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:1636:2: ( rule__SuperEntity__DescriptionAssignment_8 )
            // InternalPagos.g:1636:3: rule__SuperEntity__DescriptionAssignment_8
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
    // InternalPagos.g:1644:1: rule__SuperEntity__Group__9 : rule__SuperEntity__Group__9__Impl rule__SuperEntity__Group__10 ;
    public final void rule__SuperEntity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1648:1: ( rule__SuperEntity__Group__9__Impl rule__SuperEntity__Group__10 )
            // InternalPagos.g:1649:2: rule__SuperEntity__Group__9__Impl rule__SuperEntity__Group__10
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
    // InternalPagos.g:1656:1: rule__SuperEntity__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1660:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1661:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1661:1: ( RULE_COMMA )
            // InternalPagos.g:1662:2: RULE_COMMA
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
    // InternalPagos.g:1671:1: rule__SuperEntity__Group__10 : rule__SuperEntity__Group__10__Impl rule__SuperEntity__Group__11 ;
    public final void rule__SuperEntity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1675:1: ( rule__SuperEntity__Group__10__Impl rule__SuperEntity__Group__11 )
            // InternalPagos.g:1676:2: rule__SuperEntity__Group__10__Impl rule__SuperEntity__Group__11
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
    // InternalPagos.g:1683:1: rule__SuperEntity__Group__10__Impl : ( 'attributes' ) ;
    public final void rule__SuperEntity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1687:1: ( ( 'attributes' ) )
            // InternalPagos.g:1688:1: ( 'attributes' )
            {
            // InternalPagos.g:1688:1: ( 'attributes' )
            // InternalPagos.g:1689:2: 'attributes'
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
    // InternalPagos.g:1698:1: rule__SuperEntity__Group__11 : rule__SuperEntity__Group__11__Impl rule__SuperEntity__Group__12 ;
    public final void rule__SuperEntity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1702:1: ( rule__SuperEntity__Group__11__Impl rule__SuperEntity__Group__12 )
            // InternalPagos.g:1703:2: rule__SuperEntity__Group__11__Impl rule__SuperEntity__Group__12
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
    // InternalPagos.g:1710:1: rule__SuperEntity__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1714:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1715:1: ( RULE_COLON )
            {
            // InternalPagos.g:1715:1: ( RULE_COLON )
            // InternalPagos.g:1716:2: RULE_COLON
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
    // InternalPagos.g:1725:1: rule__SuperEntity__Group__12 : rule__SuperEntity__Group__12__Impl rule__SuperEntity__Group__13 ;
    public final void rule__SuperEntity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1729:1: ( rule__SuperEntity__Group__12__Impl rule__SuperEntity__Group__13 )
            // InternalPagos.g:1730:2: rule__SuperEntity__Group__12__Impl rule__SuperEntity__Group__13
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
    // InternalPagos.g:1737:1: rule__SuperEntity__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__SuperEntity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1741:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:1742:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:1742:1: ( RULE_LBRACKET )
            // InternalPagos.g:1743:2: RULE_LBRACKET
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
    // InternalPagos.g:1752:1: rule__SuperEntity__Group__13 : rule__SuperEntity__Group__13__Impl rule__SuperEntity__Group__14 ;
    public final void rule__SuperEntity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1756:1: ( rule__SuperEntity__Group__13__Impl rule__SuperEntity__Group__14 )
            // InternalPagos.g:1757:2: rule__SuperEntity__Group__13__Impl rule__SuperEntity__Group__14
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
    // InternalPagos.g:1764:1: rule__SuperEntity__Group__13__Impl : ( ( rule__SuperEntity__AttListsAssignment_13 ) ) ;
    public final void rule__SuperEntity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1768:1: ( ( ( rule__SuperEntity__AttListsAssignment_13 ) ) )
            // InternalPagos.g:1769:1: ( ( rule__SuperEntity__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:1769:1: ( ( rule__SuperEntity__AttListsAssignment_13 ) )
            // InternalPagos.g:1770:2: ( rule__SuperEntity__AttListsAssignment_13 )
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:1771:2: ( rule__SuperEntity__AttListsAssignment_13 )
            // InternalPagos.g:1771:3: rule__SuperEntity__AttListsAssignment_13
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
    // InternalPagos.g:1779:1: rule__SuperEntity__Group__14 : rule__SuperEntity__Group__14__Impl rule__SuperEntity__Group__15 ;
    public final void rule__SuperEntity__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1783:1: ( rule__SuperEntity__Group__14__Impl rule__SuperEntity__Group__15 )
            // InternalPagos.g:1784:2: rule__SuperEntity__Group__14__Impl rule__SuperEntity__Group__15
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
    // InternalPagos.g:1791:1: rule__SuperEntity__Group__14__Impl : ( ( rule__SuperEntity__Group_14__0 )* ) ;
    public final void rule__SuperEntity__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1795:1: ( ( ( rule__SuperEntity__Group_14__0 )* ) )
            // InternalPagos.g:1796:1: ( ( rule__SuperEntity__Group_14__0 )* )
            {
            // InternalPagos.g:1796:1: ( ( rule__SuperEntity__Group_14__0 )* )
            // InternalPagos.g:1797:2: ( rule__SuperEntity__Group_14__0 )*
            {
             before(grammarAccess.getSuperEntityAccess().getGroup_14()); 
            // InternalPagos.g:1798:2: ( rule__SuperEntity__Group_14__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPagos.g:1798:3: rule__SuperEntity__Group_14__0
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
    // InternalPagos.g:1806:1: rule__SuperEntity__Group__15 : rule__SuperEntity__Group__15__Impl rule__SuperEntity__Group__16 ;
    public final void rule__SuperEntity__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1810:1: ( rule__SuperEntity__Group__15__Impl rule__SuperEntity__Group__16 )
            // InternalPagos.g:1811:2: rule__SuperEntity__Group__15__Impl rule__SuperEntity__Group__16
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
    // InternalPagos.g:1818:1: rule__SuperEntity__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__SuperEntity__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1822:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:1823:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:1823:1: ( RULE_RBRACKET )
            // InternalPagos.g:1824:2: RULE_RBRACKET
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
    // InternalPagos.g:1833:1: rule__SuperEntity__Group__16 : rule__SuperEntity__Group__16__Impl rule__SuperEntity__Group__17 ;
    public final void rule__SuperEntity__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1837:1: ( rule__SuperEntity__Group__16__Impl rule__SuperEntity__Group__17 )
            // InternalPagos.g:1838:2: rule__SuperEntity__Group__16__Impl rule__SuperEntity__Group__17
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
    // InternalPagos.g:1845:1: rule__SuperEntity__Group__16__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1849:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1850:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1850:1: ( RULE_COMMA )
            // InternalPagos.g:1851:2: RULE_COMMA
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
    // InternalPagos.g:1860:1: rule__SuperEntity__Group__17 : rule__SuperEntity__Group__17__Impl rule__SuperEntity__Group__18 ;
    public final void rule__SuperEntity__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1864:1: ( rule__SuperEntity__Group__17__Impl rule__SuperEntity__Group__18 )
            // InternalPagos.g:1865:2: rule__SuperEntity__Group__17__Impl rule__SuperEntity__Group__18
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
    // InternalPagos.g:1872:1: rule__SuperEntity__Group__17__Impl : ( 'entities' ) ;
    public final void rule__SuperEntity__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1876:1: ( ( 'entities' ) )
            // InternalPagos.g:1877:1: ( 'entities' )
            {
            // InternalPagos.g:1877:1: ( 'entities' )
            // InternalPagos.g:1878:2: 'entities'
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
    // InternalPagos.g:1887:1: rule__SuperEntity__Group__18 : rule__SuperEntity__Group__18__Impl rule__SuperEntity__Group__19 ;
    public final void rule__SuperEntity__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1891:1: ( rule__SuperEntity__Group__18__Impl rule__SuperEntity__Group__19 )
            // InternalPagos.g:1892:2: rule__SuperEntity__Group__18__Impl rule__SuperEntity__Group__19
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
    // InternalPagos.g:1899:1: rule__SuperEntity__Group__18__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1903:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1904:1: ( RULE_COLON )
            {
            // InternalPagos.g:1904:1: ( RULE_COLON )
            // InternalPagos.g:1905:2: RULE_COLON
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
    // InternalPagos.g:1914:1: rule__SuperEntity__Group__19 : rule__SuperEntity__Group__19__Impl rule__SuperEntity__Group__20 ;
    public final void rule__SuperEntity__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1918:1: ( rule__SuperEntity__Group__19__Impl rule__SuperEntity__Group__20 )
            // InternalPagos.g:1919:2: rule__SuperEntity__Group__19__Impl rule__SuperEntity__Group__20
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
    // InternalPagos.g:1926:1: rule__SuperEntity__Group__19__Impl : ( RULE_LBRACKET ) ;
    public final void rule__SuperEntity__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1930:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:1931:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:1931:1: ( RULE_LBRACKET )
            // InternalPagos.g:1932:2: RULE_LBRACKET
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
    // InternalPagos.g:1941:1: rule__SuperEntity__Group__20 : rule__SuperEntity__Group__20__Impl rule__SuperEntity__Group__21 ;
    public final void rule__SuperEntity__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1945:1: ( rule__SuperEntity__Group__20__Impl rule__SuperEntity__Group__21 )
            // InternalPagos.g:1946:2: rule__SuperEntity__Group__20__Impl rule__SuperEntity__Group__21
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
    // InternalPagos.g:1953:1: rule__SuperEntity__Group__20__Impl : ( ( rule__SuperEntity__ParticipanteAssignment_20 ) ) ;
    public final void rule__SuperEntity__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1957:1: ( ( ( rule__SuperEntity__ParticipanteAssignment_20 ) ) )
            // InternalPagos.g:1958:1: ( ( rule__SuperEntity__ParticipanteAssignment_20 ) )
            {
            // InternalPagos.g:1958:1: ( ( rule__SuperEntity__ParticipanteAssignment_20 ) )
            // InternalPagos.g:1959:2: ( rule__SuperEntity__ParticipanteAssignment_20 )
            {
             before(grammarAccess.getSuperEntityAccess().getParticipanteAssignment_20()); 
            // InternalPagos.g:1960:2: ( rule__SuperEntity__ParticipanteAssignment_20 )
            // InternalPagos.g:1960:3: rule__SuperEntity__ParticipanteAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntity__ParticipanteAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getSuperEntityAccess().getParticipanteAssignment_20()); 

            }


            }

        }
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
    // InternalPagos.g:1968:1: rule__SuperEntity__Group__21 : rule__SuperEntity__Group__21__Impl rule__SuperEntity__Group__22 ;
    public final void rule__SuperEntity__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1972:1: ( rule__SuperEntity__Group__21__Impl rule__SuperEntity__Group__22 )
            // InternalPagos.g:1973:2: rule__SuperEntity__Group__21__Impl rule__SuperEntity__Group__22
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
    // InternalPagos.g:1980:1: rule__SuperEntity__Group__21__Impl : ( ( rule__SuperEntity__Group_21__0 )* ) ;
    public final void rule__SuperEntity__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1984:1: ( ( ( rule__SuperEntity__Group_21__0 )* ) )
            // InternalPagos.g:1985:1: ( ( rule__SuperEntity__Group_21__0 )* )
            {
            // InternalPagos.g:1985:1: ( ( rule__SuperEntity__Group_21__0 )* )
            // InternalPagos.g:1986:2: ( rule__SuperEntity__Group_21__0 )*
            {
             before(grammarAccess.getSuperEntityAccess().getGroup_21()); 
            // InternalPagos.g:1987:2: ( rule__SuperEntity__Group_21__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPagos.g:1987:3: rule__SuperEntity__Group_21__0
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
    // InternalPagos.g:1995:1: rule__SuperEntity__Group__22 : rule__SuperEntity__Group__22__Impl rule__SuperEntity__Group__23 ;
    public final void rule__SuperEntity__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1999:1: ( rule__SuperEntity__Group__22__Impl rule__SuperEntity__Group__23 )
            // InternalPagos.g:2000:2: rule__SuperEntity__Group__22__Impl rule__SuperEntity__Group__23
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
    // InternalPagos.g:2007:1: rule__SuperEntity__Group__22__Impl : ( RULE_RBRACKET ) ;
    public final void rule__SuperEntity__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2011:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:2012:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:2012:1: ( RULE_RBRACKET )
            // InternalPagos.g:2013:2: RULE_RBRACKET
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
    // InternalPagos.g:2022:1: rule__SuperEntity__Group__23 : rule__SuperEntity__Group__23__Impl ;
    public final void rule__SuperEntity__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2026:1: ( rule__SuperEntity__Group__23__Impl )
            // InternalPagos.g:2027:2: rule__SuperEntity__Group__23__Impl
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
    // InternalPagos.g:2033:1: rule__SuperEntity__Group__23__Impl : ( RULE_RBRACE ) ;
    public final void rule__SuperEntity__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2037:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:2038:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:2038:1: ( RULE_RBRACE )
            // InternalPagos.g:2039:2: RULE_RBRACE
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
    // InternalPagos.g:2049:1: rule__SuperEntity__Group_14__0 : rule__SuperEntity__Group_14__0__Impl rule__SuperEntity__Group_14__1 ;
    public final void rule__SuperEntity__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2053:1: ( rule__SuperEntity__Group_14__0__Impl rule__SuperEntity__Group_14__1 )
            // InternalPagos.g:2054:2: rule__SuperEntity__Group_14__0__Impl rule__SuperEntity__Group_14__1
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
    // InternalPagos.g:2061:1: rule__SuperEntity__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2065:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2066:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2066:1: ( RULE_COMMA )
            // InternalPagos.g:2067:2: RULE_COMMA
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
    // InternalPagos.g:2076:1: rule__SuperEntity__Group_14__1 : rule__SuperEntity__Group_14__1__Impl ;
    public final void rule__SuperEntity__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2080:1: ( rule__SuperEntity__Group_14__1__Impl )
            // InternalPagos.g:2081:2: rule__SuperEntity__Group_14__1__Impl
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
    // InternalPagos.g:2087:1: rule__SuperEntity__Group_14__1__Impl : ( ( rule__SuperEntity__AttListsAssignment_14_1 ) ) ;
    public final void rule__SuperEntity__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2091:1: ( ( ( rule__SuperEntity__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:2092:1: ( ( rule__SuperEntity__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:2092:1: ( ( rule__SuperEntity__AttListsAssignment_14_1 ) )
            // InternalPagos.g:2093:2: ( rule__SuperEntity__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:2094:2: ( rule__SuperEntity__AttListsAssignment_14_1 )
            // InternalPagos.g:2094:3: rule__SuperEntity__AttListsAssignment_14_1
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
    // InternalPagos.g:2103:1: rule__SuperEntity__Group_21__0 : rule__SuperEntity__Group_21__0__Impl rule__SuperEntity__Group_21__1 ;
    public final void rule__SuperEntity__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2107:1: ( rule__SuperEntity__Group_21__0__Impl rule__SuperEntity__Group_21__1 )
            // InternalPagos.g:2108:2: rule__SuperEntity__Group_21__0__Impl rule__SuperEntity__Group_21__1
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
    // InternalPagos.g:2115:1: rule__SuperEntity__Group_21__0__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2119:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2120:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2120:1: ( RULE_COMMA )
            // InternalPagos.g:2121:2: RULE_COMMA
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
    // InternalPagos.g:2130:1: rule__SuperEntity__Group_21__1 : rule__SuperEntity__Group_21__1__Impl ;
    public final void rule__SuperEntity__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2134:1: ( rule__SuperEntity__Group_21__1__Impl )
            // InternalPagos.g:2135:2: rule__SuperEntity__Group_21__1__Impl
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
    // InternalPagos.g:2141:1: rule__SuperEntity__Group_21__1__Impl : ( ( rule__SuperEntity__ParticipanteAssignment_21_1 ) ) ;
    public final void rule__SuperEntity__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2145:1: ( ( ( rule__SuperEntity__ParticipanteAssignment_21_1 ) ) )
            // InternalPagos.g:2146:1: ( ( rule__SuperEntity__ParticipanteAssignment_21_1 ) )
            {
            // InternalPagos.g:2146:1: ( ( rule__SuperEntity__ParticipanteAssignment_21_1 ) )
            // InternalPagos.g:2147:2: ( rule__SuperEntity__ParticipanteAssignment_21_1 )
            {
             before(grammarAccess.getSuperEntityAccess().getParticipanteAssignment_21_1()); 
            // InternalPagos.g:2148:2: ( rule__SuperEntity__ParticipanteAssignment_21_1 )
            // InternalPagos.g:2148:3: rule__SuperEntity__ParticipanteAssignment_21_1
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntity__ParticipanteAssignment_21_1();

            state._fsp--;


            }

             after(grammarAccess.getSuperEntityAccess().getParticipanteAssignment_21_1()); 

            }


            }

        }
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
    // InternalPagos.g:2157:1: rule__Participant__Group__0 : rule__Participant__Group__0__Impl rule__Participant__Group__1 ;
    public final void rule__Participant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2161:1: ( rule__Participant__Group__0__Impl rule__Participant__Group__1 )
            // InternalPagos.g:2162:2: rule__Participant__Group__0__Impl rule__Participant__Group__1
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
    // InternalPagos.g:2169:1: rule__Participant__Group__0__Impl : ( () ) ;
    public final void rule__Participant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2173:1: ( ( () ) )
            // InternalPagos.g:2174:1: ( () )
            {
            // InternalPagos.g:2174:1: ( () )
            // InternalPagos.g:2175:2: ()
            {
             before(grammarAccess.getParticipantAccess().getParticipantAction_0()); 
            // InternalPagos.g:2176:2: ()
            // InternalPagos.g:2176:3: 
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
    // InternalPagos.g:2184:1: rule__Participant__Group__1 : rule__Participant__Group__1__Impl rule__Participant__Group__2 ;
    public final void rule__Participant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2188:1: ( rule__Participant__Group__1__Impl rule__Participant__Group__2 )
            // InternalPagos.g:2189:2: rule__Participant__Group__1__Impl rule__Participant__Group__2
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
    // InternalPagos.g:2196:1: rule__Participant__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Participant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2200:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:2201:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:2201:1: ( RULE_LBRACE )
            // InternalPagos.g:2202:2: RULE_LBRACE
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
    // InternalPagos.g:2211:1: rule__Participant__Group__2 : rule__Participant__Group__2__Impl rule__Participant__Group__3 ;
    public final void rule__Participant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2215:1: ( rule__Participant__Group__2__Impl rule__Participant__Group__3 )
            // InternalPagos.g:2216:2: rule__Participant__Group__2__Impl rule__Participant__Group__3
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
    // InternalPagos.g:2223:1: rule__Participant__Group__2__Impl : ( 'name' ) ;
    public final void rule__Participant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2227:1: ( ( 'name' ) )
            // InternalPagos.g:2228:1: ( 'name' )
            {
            // InternalPagos.g:2228:1: ( 'name' )
            // InternalPagos.g:2229:2: 'name'
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
    // InternalPagos.g:2238:1: rule__Participant__Group__3 : rule__Participant__Group__3__Impl rule__Participant__Group__4 ;
    public final void rule__Participant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2242:1: ( rule__Participant__Group__3__Impl rule__Participant__Group__4 )
            // InternalPagos.g:2243:2: rule__Participant__Group__3__Impl rule__Participant__Group__4
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
    // InternalPagos.g:2250:1: rule__Participant__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2254:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2255:1: ( RULE_COLON )
            {
            // InternalPagos.g:2255:1: ( RULE_COLON )
            // InternalPagos.g:2256:2: RULE_COLON
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
    // InternalPagos.g:2265:1: rule__Participant__Group__4 : rule__Participant__Group__4__Impl rule__Participant__Group__5 ;
    public final void rule__Participant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2269:1: ( rule__Participant__Group__4__Impl rule__Participant__Group__5 )
            // InternalPagos.g:2270:2: rule__Participant__Group__4__Impl rule__Participant__Group__5
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
    // InternalPagos.g:2277:1: rule__Participant__Group__4__Impl : ( ( rule__Participant__NameAssignment_4 ) ) ;
    public final void rule__Participant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2281:1: ( ( ( rule__Participant__NameAssignment_4 ) ) )
            // InternalPagos.g:2282:1: ( ( rule__Participant__NameAssignment_4 ) )
            {
            // InternalPagos.g:2282:1: ( ( rule__Participant__NameAssignment_4 ) )
            // InternalPagos.g:2283:2: ( rule__Participant__NameAssignment_4 )
            {
             before(grammarAccess.getParticipantAccess().getNameAssignment_4()); 
            // InternalPagos.g:2284:2: ( rule__Participant__NameAssignment_4 )
            // InternalPagos.g:2284:3: rule__Participant__NameAssignment_4
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
    // InternalPagos.g:2292:1: rule__Participant__Group__5 : rule__Participant__Group__5__Impl rule__Participant__Group__6 ;
    public final void rule__Participant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2296:1: ( rule__Participant__Group__5__Impl rule__Participant__Group__6 )
            // InternalPagos.g:2297:2: rule__Participant__Group__5__Impl rule__Participant__Group__6
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
    // InternalPagos.g:2304:1: rule__Participant__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2308:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2309:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2309:1: ( RULE_COMMA )
            // InternalPagos.g:2310:2: RULE_COMMA
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
    // InternalPagos.g:2319:1: rule__Participant__Group__6 : rule__Participant__Group__6__Impl rule__Participant__Group__7 ;
    public final void rule__Participant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2323:1: ( rule__Participant__Group__6__Impl rule__Participant__Group__7 )
            // InternalPagos.g:2324:2: rule__Participant__Group__6__Impl rule__Participant__Group__7
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
    // InternalPagos.g:2331:1: rule__Participant__Group__6__Impl : ( 'description' ) ;
    public final void rule__Participant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2335:1: ( ( 'description' ) )
            // InternalPagos.g:2336:1: ( 'description' )
            {
            // InternalPagos.g:2336:1: ( 'description' )
            // InternalPagos.g:2337:2: 'description'
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
    // InternalPagos.g:2346:1: rule__Participant__Group__7 : rule__Participant__Group__7__Impl rule__Participant__Group__8 ;
    public final void rule__Participant__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2350:1: ( rule__Participant__Group__7__Impl rule__Participant__Group__8 )
            // InternalPagos.g:2351:2: rule__Participant__Group__7__Impl rule__Participant__Group__8
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
    // InternalPagos.g:2358:1: rule__Participant__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2362:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2363:1: ( RULE_COLON )
            {
            // InternalPagos.g:2363:1: ( RULE_COLON )
            // InternalPagos.g:2364:2: RULE_COLON
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
    // InternalPagos.g:2373:1: rule__Participant__Group__8 : rule__Participant__Group__8__Impl rule__Participant__Group__9 ;
    public final void rule__Participant__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2377:1: ( rule__Participant__Group__8__Impl rule__Participant__Group__9 )
            // InternalPagos.g:2378:2: rule__Participant__Group__8__Impl rule__Participant__Group__9
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
    // InternalPagos.g:2385:1: rule__Participant__Group__8__Impl : ( ( rule__Participant__DescriptionAssignment_8 ) ) ;
    public final void rule__Participant__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2389:1: ( ( ( rule__Participant__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:2390:1: ( ( rule__Participant__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:2390:1: ( ( rule__Participant__DescriptionAssignment_8 ) )
            // InternalPagos.g:2391:2: ( rule__Participant__DescriptionAssignment_8 )
            {
             before(grammarAccess.getParticipantAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:2392:2: ( rule__Participant__DescriptionAssignment_8 )
            // InternalPagos.g:2392:3: rule__Participant__DescriptionAssignment_8
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
    // InternalPagos.g:2400:1: rule__Participant__Group__9 : rule__Participant__Group__9__Impl rule__Participant__Group__10 ;
    public final void rule__Participant__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2404:1: ( rule__Participant__Group__9__Impl rule__Participant__Group__10 )
            // InternalPagos.g:2405:2: rule__Participant__Group__9__Impl rule__Participant__Group__10
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
    // InternalPagos.g:2412:1: rule__Participant__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2416:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2417:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2417:1: ( RULE_COMMA )
            // InternalPagos.g:2418:2: RULE_COMMA
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
    // InternalPagos.g:2427:1: rule__Participant__Group__10 : rule__Participant__Group__10__Impl rule__Participant__Group__11 ;
    public final void rule__Participant__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2431:1: ( rule__Participant__Group__10__Impl rule__Participant__Group__11 )
            // InternalPagos.g:2432:2: rule__Participant__Group__10__Impl rule__Participant__Group__11
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
    // InternalPagos.g:2439:1: rule__Participant__Group__10__Impl : ( 'attributes' ) ;
    public final void rule__Participant__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2443:1: ( ( 'attributes' ) )
            // InternalPagos.g:2444:1: ( 'attributes' )
            {
            // InternalPagos.g:2444:1: ( 'attributes' )
            // InternalPagos.g:2445:2: 'attributes'
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
    // InternalPagos.g:2454:1: rule__Participant__Group__11 : rule__Participant__Group__11__Impl rule__Participant__Group__12 ;
    public final void rule__Participant__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2458:1: ( rule__Participant__Group__11__Impl rule__Participant__Group__12 )
            // InternalPagos.g:2459:2: rule__Participant__Group__11__Impl rule__Participant__Group__12
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
    // InternalPagos.g:2466:1: rule__Participant__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2470:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2471:1: ( RULE_COLON )
            {
            // InternalPagos.g:2471:1: ( RULE_COLON )
            // InternalPagos.g:2472:2: RULE_COLON
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
    // InternalPagos.g:2481:1: rule__Participant__Group__12 : rule__Participant__Group__12__Impl rule__Participant__Group__13 ;
    public final void rule__Participant__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2485:1: ( rule__Participant__Group__12__Impl rule__Participant__Group__13 )
            // InternalPagos.g:2486:2: rule__Participant__Group__12__Impl rule__Participant__Group__13
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
    // InternalPagos.g:2493:1: rule__Participant__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Participant__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2497:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:2498:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:2498:1: ( RULE_LBRACKET )
            // InternalPagos.g:2499:2: RULE_LBRACKET
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
    // InternalPagos.g:2508:1: rule__Participant__Group__13 : rule__Participant__Group__13__Impl rule__Participant__Group__14 ;
    public final void rule__Participant__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2512:1: ( rule__Participant__Group__13__Impl rule__Participant__Group__14 )
            // InternalPagos.g:2513:2: rule__Participant__Group__13__Impl rule__Participant__Group__14
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
    // InternalPagos.g:2520:1: rule__Participant__Group__13__Impl : ( ( rule__Participant__AttListsAssignment_13 ) ) ;
    public final void rule__Participant__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2524:1: ( ( ( rule__Participant__AttListsAssignment_13 ) ) )
            // InternalPagos.g:2525:1: ( ( rule__Participant__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:2525:1: ( ( rule__Participant__AttListsAssignment_13 ) )
            // InternalPagos.g:2526:2: ( rule__Participant__AttListsAssignment_13 )
            {
             before(grammarAccess.getParticipantAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:2527:2: ( rule__Participant__AttListsAssignment_13 )
            // InternalPagos.g:2527:3: rule__Participant__AttListsAssignment_13
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
    // InternalPagos.g:2535:1: rule__Participant__Group__14 : rule__Participant__Group__14__Impl rule__Participant__Group__15 ;
    public final void rule__Participant__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2539:1: ( rule__Participant__Group__14__Impl rule__Participant__Group__15 )
            // InternalPagos.g:2540:2: rule__Participant__Group__14__Impl rule__Participant__Group__15
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
    // InternalPagos.g:2547:1: rule__Participant__Group__14__Impl : ( ( rule__Participant__Group_14__0 )* ) ;
    public final void rule__Participant__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2551:1: ( ( ( rule__Participant__Group_14__0 )* ) )
            // InternalPagos.g:2552:1: ( ( rule__Participant__Group_14__0 )* )
            {
            // InternalPagos.g:2552:1: ( ( rule__Participant__Group_14__0 )* )
            // InternalPagos.g:2553:2: ( rule__Participant__Group_14__0 )*
            {
             before(grammarAccess.getParticipantAccess().getGroup_14()); 
            // InternalPagos.g:2554:2: ( rule__Participant__Group_14__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPagos.g:2554:3: rule__Participant__Group_14__0
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
    // InternalPagos.g:2562:1: rule__Participant__Group__15 : rule__Participant__Group__15__Impl rule__Participant__Group__16 ;
    public final void rule__Participant__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2566:1: ( rule__Participant__Group__15__Impl rule__Participant__Group__16 )
            // InternalPagos.g:2567:2: rule__Participant__Group__15__Impl rule__Participant__Group__16
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
    // InternalPagos.g:2574:1: rule__Participant__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Participant__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2578:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:2579:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:2579:1: ( RULE_RBRACKET )
            // InternalPagos.g:2580:2: RULE_RBRACKET
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
    // InternalPagos.g:2589:1: rule__Participant__Group__16 : rule__Participant__Group__16__Impl rule__Participant__Group__17 ;
    public final void rule__Participant__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2593:1: ( rule__Participant__Group__16__Impl rule__Participant__Group__17 )
            // InternalPagos.g:2594:2: rule__Participant__Group__16__Impl rule__Participant__Group__17
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
    // InternalPagos.g:2601:1: rule__Participant__Group__16__Impl : ( RULE_RBRACE ) ;
    public final void rule__Participant__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2605:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:2606:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:2606:1: ( RULE_RBRACE )
            // InternalPagos.g:2607:2: RULE_RBRACE
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
    // InternalPagos.g:2616:1: rule__Participant__Group__17 : rule__Participant__Group__17__Impl rule__Participant__Group__18 ;
    public final void rule__Participant__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2620:1: ( rule__Participant__Group__17__Impl rule__Participant__Group__18 )
            // InternalPagos.g:2621:2: rule__Participant__Group__17__Impl rule__Participant__Group__18
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
    // InternalPagos.g:2628:1: rule__Participant__Group__17__Impl : ( ( rule__Participant__Group_17__0 )? ) ;
    public final void rule__Participant__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2632:1: ( ( ( rule__Participant__Group_17__0 )? ) )
            // InternalPagos.g:2633:1: ( ( rule__Participant__Group_17__0 )? )
            {
            // InternalPagos.g:2633:1: ( ( rule__Participant__Group_17__0 )? )
            // InternalPagos.g:2634:2: ( rule__Participant__Group_17__0 )?
            {
             before(grammarAccess.getParticipantAccess().getGroup_17()); 
            // InternalPagos.g:2635:2: ( rule__Participant__Group_17__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_COMMA) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPagos.g:2635:3: rule__Participant__Group_17__0
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
    // InternalPagos.g:2643:1: rule__Participant__Group__18 : rule__Participant__Group__18__Impl ;
    public final void rule__Participant__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2647:1: ( rule__Participant__Group__18__Impl )
            // InternalPagos.g:2648:2: rule__Participant__Group__18__Impl
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
    // InternalPagos.g:2654:1: rule__Participant__Group__18__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Participant__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2658:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:2659:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:2659:1: ( RULE_RBRACKET )
            // InternalPagos.g:2660:2: RULE_RBRACKET
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
    // InternalPagos.g:2670:1: rule__Participant__Group_14__0 : rule__Participant__Group_14__0__Impl rule__Participant__Group_14__1 ;
    public final void rule__Participant__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2674:1: ( rule__Participant__Group_14__0__Impl rule__Participant__Group_14__1 )
            // InternalPagos.g:2675:2: rule__Participant__Group_14__0__Impl rule__Participant__Group_14__1
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
    // InternalPagos.g:2682:1: rule__Participant__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2686:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2687:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2687:1: ( RULE_COMMA )
            // InternalPagos.g:2688:2: RULE_COMMA
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
    // InternalPagos.g:2697:1: rule__Participant__Group_14__1 : rule__Participant__Group_14__1__Impl ;
    public final void rule__Participant__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2701:1: ( rule__Participant__Group_14__1__Impl )
            // InternalPagos.g:2702:2: rule__Participant__Group_14__1__Impl
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
    // InternalPagos.g:2708:1: rule__Participant__Group_14__1__Impl : ( ( rule__Participant__AttListsAssignment_14_1 ) ) ;
    public final void rule__Participant__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2712:1: ( ( ( rule__Participant__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:2713:1: ( ( rule__Participant__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:2713:1: ( ( rule__Participant__AttListsAssignment_14_1 ) )
            // InternalPagos.g:2714:2: ( rule__Participant__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getParticipantAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:2715:2: ( rule__Participant__AttListsAssignment_14_1 )
            // InternalPagos.g:2715:3: rule__Participant__AttListsAssignment_14_1
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
    // InternalPagos.g:2724:1: rule__Participant__Group_17__0 : rule__Participant__Group_17__0__Impl rule__Participant__Group_17__1 ;
    public final void rule__Participant__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2728:1: ( rule__Participant__Group_17__0__Impl rule__Participant__Group_17__1 )
            // InternalPagos.g:2729:2: rule__Participant__Group_17__0__Impl rule__Participant__Group_17__1
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
    // InternalPagos.g:2736:1: rule__Participant__Group_17__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2740:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2741:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2741:1: ( RULE_COMMA )
            // InternalPagos.g:2742:2: RULE_COMMA
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
    // InternalPagos.g:2751:1: rule__Participant__Group_17__1 : rule__Participant__Group_17__1__Impl rule__Participant__Group_17__2 ;
    public final void rule__Participant__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2755:1: ( rule__Participant__Group_17__1__Impl rule__Participant__Group_17__2 )
            // InternalPagos.g:2756:2: rule__Participant__Group_17__1__Impl rule__Participant__Group_17__2
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
    // InternalPagos.g:2763:1: rule__Participant__Group_17__1__Impl : ( 'InformationTemplate' ) ;
    public final void rule__Participant__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2767:1: ( ( 'InformationTemplate' ) )
            // InternalPagos.g:2768:1: ( 'InformationTemplate' )
            {
            // InternalPagos.g:2768:1: ( 'InformationTemplate' )
            // InternalPagos.g:2769:2: 'InformationTemplate'
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
    // InternalPagos.g:2778:1: rule__Participant__Group_17__2 : rule__Participant__Group_17__2__Impl rule__Participant__Group_17__3 ;
    public final void rule__Participant__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2782:1: ( rule__Participant__Group_17__2__Impl rule__Participant__Group_17__3 )
            // InternalPagos.g:2783:2: rule__Participant__Group_17__2__Impl rule__Participant__Group_17__3
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
    // InternalPagos.g:2790:1: rule__Participant__Group_17__2__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2794:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2795:1: ( RULE_COLON )
            {
            // InternalPagos.g:2795:1: ( RULE_COLON )
            // InternalPagos.g:2796:2: RULE_COLON
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
    // InternalPagos.g:2805:1: rule__Participant__Group_17__3 : rule__Participant__Group_17__3__Impl rule__Participant__Group_17__4 ;
    public final void rule__Participant__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2809:1: ( rule__Participant__Group_17__3__Impl rule__Participant__Group_17__4 )
            // InternalPagos.g:2810:2: rule__Participant__Group_17__3__Impl rule__Participant__Group_17__4
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
    // InternalPagos.g:2817:1: rule__Participant__Group_17__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Participant__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2821:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:2822:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:2822:1: ( RULE_LBRACKET )
            // InternalPagos.g:2823:2: RULE_LBRACKET
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
    // InternalPagos.g:2832:1: rule__Participant__Group_17__4 : rule__Participant__Group_17__4__Impl rule__Participant__Group_17__5 ;
    public final void rule__Participant__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2836:1: ( rule__Participant__Group_17__4__Impl rule__Participant__Group_17__5 )
            // InternalPagos.g:2837:2: rule__Participant__Group_17__4__Impl rule__Participant__Group_17__5
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
    // InternalPagos.g:2844:1: rule__Participant__Group_17__4__Impl : ( ( rule__Participant__TemplatesFormAssignment_17_4 ) ) ;
    public final void rule__Participant__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2848:1: ( ( ( rule__Participant__TemplatesFormAssignment_17_4 ) ) )
            // InternalPagos.g:2849:1: ( ( rule__Participant__TemplatesFormAssignment_17_4 ) )
            {
            // InternalPagos.g:2849:1: ( ( rule__Participant__TemplatesFormAssignment_17_4 ) )
            // InternalPagos.g:2850:2: ( rule__Participant__TemplatesFormAssignment_17_4 )
            {
             before(grammarAccess.getParticipantAccess().getTemplatesFormAssignment_17_4()); 
            // InternalPagos.g:2851:2: ( rule__Participant__TemplatesFormAssignment_17_4 )
            // InternalPagos.g:2851:3: rule__Participant__TemplatesFormAssignment_17_4
            {
            pushFollow(FOLLOW_2);
            rule__Participant__TemplatesFormAssignment_17_4();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getTemplatesFormAssignment_17_4()); 

            }


            }

        }
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
    // InternalPagos.g:2859:1: rule__Participant__Group_17__5 : rule__Participant__Group_17__5__Impl ;
    public final void rule__Participant__Group_17__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2863:1: ( rule__Participant__Group_17__5__Impl )
            // InternalPagos.g:2864:2: rule__Participant__Group_17__5__Impl
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
    // InternalPagos.g:2870:1: rule__Participant__Group_17__5__Impl : ( ( rule__Participant__Group_17_5__0 )* ) ;
    public final void rule__Participant__Group_17__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2874:1: ( ( ( rule__Participant__Group_17_5__0 )* ) )
            // InternalPagos.g:2875:1: ( ( rule__Participant__Group_17_5__0 )* )
            {
            // InternalPagos.g:2875:1: ( ( rule__Participant__Group_17_5__0 )* )
            // InternalPagos.g:2876:2: ( rule__Participant__Group_17_5__0 )*
            {
             before(grammarAccess.getParticipantAccess().getGroup_17_5()); 
            // InternalPagos.g:2877:2: ( rule__Participant__Group_17_5__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPagos.g:2877:3: rule__Participant__Group_17_5__0
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
    // InternalPagos.g:2886:1: rule__Participant__Group_17_5__0 : rule__Participant__Group_17_5__0__Impl rule__Participant__Group_17_5__1 ;
    public final void rule__Participant__Group_17_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2890:1: ( rule__Participant__Group_17_5__0__Impl rule__Participant__Group_17_5__1 )
            // InternalPagos.g:2891:2: rule__Participant__Group_17_5__0__Impl rule__Participant__Group_17_5__1
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
    // InternalPagos.g:2898:1: rule__Participant__Group_17_5__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group_17_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2902:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2903:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2903:1: ( RULE_COMMA )
            // InternalPagos.g:2904:2: RULE_COMMA
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
    // InternalPagos.g:2913:1: rule__Participant__Group_17_5__1 : rule__Participant__Group_17_5__1__Impl ;
    public final void rule__Participant__Group_17_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2917:1: ( rule__Participant__Group_17_5__1__Impl )
            // InternalPagos.g:2918:2: rule__Participant__Group_17_5__1__Impl
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
    // InternalPagos.g:2924:1: rule__Participant__Group_17_5__1__Impl : ( ( rule__Participant__TemplatesFormAssignment_17_5_1 ) ) ;
    public final void rule__Participant__Group_17_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2928:1: ( ( ( rule__Participant__TemplatesFormAssignment_17_5_1 ) ) )
            // InternalPagos.g:2929:1: ( ( rule__Participant__TemplatesFormAssignment_17_5_1 ) )
            {
            // InternalPagos.g:2929:1: ( ( rule__Participant__TemplatesFormAssignment_17_5_1 ) )
            // InternalPagos.g:2930:2: ( rule__Participant__TemplatesFormAssignment_17_5_1 )
            {
             before(grammarAccess.getParticipantAccess().getTemplatesFormAssignment_17_5_1()); 
            // InternalPagos.g:2931:2: ( rule__Participant__TemplatesFormAssignment_17_5_1 )
            // InternalPagos.g:2931:3: rule__Participant__TemplatesFormAssignment_17_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Participant__TemplatesFormAssignment_17_5_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getTemplatesFormAssignment_17_5_1()); 

            }


            }

        }
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
    // InternalPagos.g:2940:1: rule__Provider__Group__0 : rule__Provider__Group__0__Impl rule__Provider__Group__1 ;
    public final void rule__Provider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2944:1: ( rule__Provider__Group__0__Impl rule__Provider__Group__1 )
            // InternalPagos.g:2945:2: rule__Provider__Group__0__Impl rule__Provider__Group__1
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
    // InternalPagos.g:2952:1: rule__Provider__Group__0__Impl : ( () ) ;
    public final void rule__Provider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2956:1: ( ( () ) )
            // InternalPagos.g:2957:1: ( () )
            {
            // InternalPagos.g:2957:1: ( () )
            // InternalPagos.g:2958:2: ()
            {
             before(grammarAccess.getProviderAccess().getProviderAction_0()); 
            // InternalPagos.g:2959:2: ()
            // InternalPagos.g:2959:3: 
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
    // InternalPagos.g:2967:1: rule__Provider__Group__1 : rule__Provider__Group__1__Impl rule__Provider__Group__2 ;
    public final void rule__Provider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2971:1: ( rule__Provider__Group__1__Impl rule__Provider__Group__2 )
            // InternalPagos.g:2972:2: rule__Provider__Group__1__Impl rule__Provider__Group__2
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
    // InternalPagos.g:2979:1: rule__Provider__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Provider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2983:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:2984:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:2984:1: ( RULE_LBRACE )
            // InternalPagos.g:2985:2: RULE_LBRACE
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
    // InternalPagos.g:2994:1: rule__Provider__Group__2 : rule__Provider__Group__2__Impl rule__Provider__Group__3 ;
    public final void rule__Provider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2998:1: ( rule__Provider__Group__2__Impl rule__Provider__Group__3 )
            // InternalPagos.g:2999:2: rule__Provider__Group__2__Impl rule__Provider__Group__3
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
    // InternalPagos.g:3006:1: rule__Provider__Group__2__Impl : ( 'name' ) ;
    public final void rule__Provider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3010:1: ( ( 'name' ) )
            // InternalPagos.g:3011:1: ( 'name' )
            {
            // InternalPagos.g:3011:1: ( 'name' )
            // InternalPagos.g:3012:2: 'name'
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
    // InternalPagos.g:3021:1: rule__Provider__Group__3 : rule__Provider__Group__3__Impl rule__Provider__Group__4 ;
    public final void rule__Provider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3025:1: ( rule__Provider__Group__3__Impl rule__Provider__Group__4 )
            // InternalPagos.g:3026:2: rule__Provider__Group__3__Impl rule__Provider__Group__4
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
    // InternalPagos.g:3033:1: rule__Provider__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Provider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3037:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3038:1: ( RULE_COLON )
            {
            // InternalPagos.g:3038:1: ( RULE_COLON )
            // InternalPagos.g:3039:2: RULE_COLON
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
    // InternalPagos.g:3048:1: rule__Provider__Group__4 : rule__Provider__Group__4__Impl rule__Provider__Group__5 ;
    public final void rule__Provider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3052:1: ( rule__Provider__Group__4__Impl rule__Provider__Group__5 )
            // InternalPagos.g:3053:2: rule__Provider__Group__4__Impl rule__Provider__Group__5
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
    // InternalPagos.g:3060:1: rule__Provider__Group__4__Impl : ( ( rule__Provider__NameAssignment_4 ) ) ;
    public final void rule__Provider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3064:1: ( ( ( rule__Provider__NameAssignment_4 ) ) )
            // InternalPagos.g:3065:1: ( ( rule__Provider__NameAssignment_4 ) )
            {
            // InternalPagos.g:3065:1: ( ( rule__Provider__NameAssignment_4 ) )
            // InternalPagos.g:3066:2: ( rule__Provider__NameAssignment_4 )
            {
             before(grammarAccess.getProviderAccess().getNameAssignment_4()); 
            // InternalPagos.g:3067:2: ( rule__Provider__NameAssignment_4 )
            // InternalPagos.g:3067:3: rule__Provider__NameAssignment_4
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
    // InternalPagos.g:3075:1: rule__Provider__Group__5 : rule__Provider__Group__5__Impl rule__Provider__Group__6 ;
    public final void rule__Provider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3079:1: ( rule__Provider__Group__5__Impl rule__Provider__Group__6 )
            // InternalPagos.g:3080:2: rule__Provider__Group__5__Impl rule__Provider__Group__6
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
    // InternalPagos.g:3087:1: rule__Provider__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Provider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3091:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3092:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3092:1: ( RULE_COMMA )
            // InternalPagos.g:3093:2: RULE_COMMA
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
    // InternalPagos.g:3102:1: rule__Provider__Group__6 : rule__Provider__Group__6__Impl rule__Provider__Group__7 ;
    public final void rule__Provider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3106:1: ( rule__Provider__Group__6__Impl rule__Provider__Group__7 )
            // InternalPagos.g:3107:2: rule__Provider__Group__6__Impl rule__Provider__Group__7
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
    // InternalPagos.g:3114:1: rule__Provider__Group__6__Impl : ( 'description' ) ;
    public final void rule__Provider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3118:1: ( ( 'description' ) )
            // InternalPagos.g:3119:1: ( 'description' )
            {
            // InternalPagos.g:3119:1: ( 'description' )
            // InternalPagos.g:3120:2: 'description'
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
    // InternalPagos.g:3129:1: rule__Provider__Group__7 : rule__Provider__Group__7__Impl rule__Provider__Group__8 ;
    public final void rule__Provider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3133:1: ( rule__Provider__Group__7__Impl rule__Provider__Group__8 )
            // InternalPagos.g:3134:2: rule__Provider__Group__7__Impl rule__Provider__Group__8
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
    // InternalPagos.g:3141:1: rule__Provider__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__Provider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3145:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3146:1: ( RULE_COLON )
            {
            // InternalPagos.g:3146:1: ( RULE_COLON )
            // InternalPagos.g:3147:2: RULE_COLON
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
    // InternalPagos.g:3156:1: rule__Provider__Group__8 : rule__Provider__Group__8__Impl rule__Provider__Group__9 ;
    public final void rule__Provider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3160:1: ( rule__Provider__Group__8__Impl rule__Provider__Group__9 )
            // InternalPagos.g:3161:2: rule__Provider__Group__8__Impl rule__Provider__Group__9
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
    // InternalPagos.g:3168:1: rule__Provider__Group__8__Impl : ( ( rule__Provider__DescriptionAssignment_8 ) ) ;
    public final void rule__Provider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3172:1: ( ( ( rule__Provider__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:3173:1: ( ( rule__Provider__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:3173:1: ( ( rule__Provider__DescriptionAssignment_8 ) )
            // InternalPagos.g:3174:2: ( rule__Provider__DescriptionAssignment_8 )
            {
             before(grammarAccess.getProviderAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:3175:2: ( rule__Provider__DescriptionAssignment_8 )
            // InternalPagos.g:3175:3: rule__Provider__DescriptionAssignment_8
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
    // InternalPagos.g:3183:1: rule__Provider__Group__9 : rule__Provider__Group__9__Impl rule__Provider__Group__10 ;
    public final void rule__Provider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3187:1: ( rule__Provider__Group__9__Impl rule__Provider__Group__10 )
            // InternalPagos.g:3188:2: rule__Provider__Group__9__Impl rule__Provider__Group__10
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
    // InternalPagos.g:3195:1: rule__Provider__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__Provider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3199:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3200:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3200:1: ( RULE_COMMA )
            // InternalPagos.g:3201:2: RULE_COMMA
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
    // InternalPagos.g:3210:1: rule__Provider__Group__10 : rule__Provider__Group__10__Impl rule__Provider__Group__11 ;
    public final void rule__Provider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3214:1: ( rule__Provider__Group__10__Impl rule__Provider__Group__11 )
            // InternalPagos.g:3215:2: rule__Provider__Group__10__Impl rule__Provider__Group__11
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
    // InternalPagos.g:3222:1: rule__Provider__Group__10__Impl : ( 'attributes' ) ;
    public final void rule__Provider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3226:1: ( ( 'attributes' ) )
            // InternalPagos.g:3227:1: ( 'attributes' )
            {
            // InternalPagos.g:3227:1: ( 'attributes' )
            // InternalPagos.g:3228:2: 'attributes'
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
    // InternalPagos.g:3237:1: rule__Provider__Group__11 : rule__Provider__Group__11__Impl rule__Provider__Group__12 ;
    public final void rule__Provider__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3241:1: ( rule__Provider__Group__11__Impl rule__Provider__Group__12 )
            // InternalPagos.g:3242:2: rule__Provider__Group__11__Impl rule__Provider__Group__12
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
    // InternalPagos.g:3249:1: rule__Provider__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__Provider__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3253:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3254:1: ( RULE_COLON )
            {
            // InternalPagos.g:3254:1: ( RULE_COLON )
            // InternalPagos.g:3255:2: RULE_COLON
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
    // InternalPagos.g:3264:1: rule__Provider__Group__12 : rule__Provider__Group__12__Impl rule__Provider__Group__13 ;
    public final void rule__Provider__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3268:1: ( rule__Provider__Group__12__Impl rule__Provider__Group__13 )
            // InternalPagos.g:3269:2: rule__Provider__Group__12__Impl rule__Provider__Group__13
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
    // InternalPagos.g:3276:1: rule__Provider__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Provider__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3280:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:3281:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:3281:1: ( RULE_LBRACKET )
            // InternalPagos.g:3282:2: RULE_LBRACKET
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
    // InternalPagos.g:3291:1: rule__Provider__Group__13 : rule__Provider__Group__13__Impl rule__Provider__Group__14 ;
    public final void rule__Provider__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3295:1: ( rule__Provider__Group__13__Impl rule__Provider__Group__14 )
            // InternalPagos.g:3296:2: rule__Provider__Group__13__Impl rule__Provider__Group__14
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
    // InternalPagos.g:3303:1: rule__Provider__Group__13__Impl : ( ( rule__Provider__AttListsAssignment_13 ) ) ;
    public final void rule__Provider__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3307:1: ( ( ( rule__Provider__AttListsAssignment_13 ) ) )
            // InternalPagos.g:3308:1: ( ( rule__Provider__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:3308:1: ( ( rule__Provider__AttListsAssignment_13 ) )
            // InternalPagos.g:3309:2: ( rule__Provider__AttListsAssignment_13 )
            {
             before(grammarAccess.getProviderAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:3310:2: ( rule__Provider__AttListsAssignment_13 )
            // InternalPagos.g:3310:3: rule__Provider__AttListsAssignment_13
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
    // InternalPagos.g:3318:1: rule__Provider__Group__14 : rule__Provider__Group__14__Impl rule__Provider__Group__15 ;
    public final void rule__Provider__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3322:1: ( rule__Provider__Group__14__Impl rule__Provider__Group__15 )
            // InternalPagos.g:3323:2: rule__Provider__Group__14__Impl rule__Provider__Group__15
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
    // InternalPagos.g:3330:1: rule__Provider__Group__14__Impl : ( ( rule__Provider__Group_14__0 )* ) ;
    public final void rule__Provider__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3334:1: ( ( ( rule__Provider__Group_14__0 )* ) )
            // InternalPagos.g:3335:1: ( ( rule__Provider__Group_14__0 )* )
            {
            // InternalPagos.g:3335:1: ( ( rule__Provider__Group_14__0 )* )
            // InternalPagos.g:3336:2: ( rule__Provider__Group_14__0 )*
            {
             before(grammarAccess.getProviderAccess().getGroup_14()); 
            // InternalPagos.g:3337:2: ( rule__Provider__Group_14__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPagos.g:3337:3: rule__Provider__Group_14__0
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
    // InternalPagos.g:3345:1: rule__Provider__Group__15 : rule__Provider__Group__15__Impl rule__Provider__Group__16 ;
    public final void rule__Provider__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3349:1: ( rule__Provider__Group__15__Impl rule__Provider__Group__16 )
            // InternalPagos.g:3350:2: rule__Provider__Group__15__Impl rule__Provider__Group__16
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
    // InternalPagos.g:3357:1: rule__Provider__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Provider__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3361:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:3362:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:3362:1: ( RULE_RBRACKET )
            // InternalPagos.g:3363:2: RULE_RBRACKET
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
    // InternalPagos.g:3372:1: rule__Provider__Group__16 : rule__Provider__Group__16__Impl ;
    public final void rule__Provider__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3376:1: ( rule__Provider__Group__16__Impl )
            // InternalPagos.g:3377:2: rule__Provider__Group__16__Impl
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
    // InternalPagos.g:3383:1: rule__Provider__Group__16__Impl : ( RULE_RBRACE ) ;
    public final void rule__Provider__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3387:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:3388:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:3388:1: ( RULE_RBRACE )
            // InternalPagos.g:3389:2: RULE_RBRACE
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
    // InternalPagos.g:3399:1: rule__Provider__Group_14__0 : rule__Provider__Group_14__0__Impl rule__Provider__Group_14__1 ;
    public final void rule__Provider__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3403:1: ( rule__Provider__Group_14__0__Impl rule__Provider__Group_14__1 )
            // InternalPagos.g:3404:2: rule__Provider__Group_14__0__Impl rule__Provider__Group_14__1
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
    // InternalPagos.g:3411:1: rule__Provider__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Provider__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3415:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3416:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3416:1: ( RULE_COMMA )
            // InternalPagos.g:3417:2: RULE_COMMA
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
    // InternalPagos.g:3426:1: rule__Provider__Group_14__1 : rule__Provider__Group_14__1__Impl ;
    public final void rule__Provider__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3430:1: ( rule__Provider__Group_14__1__Impl )
            // InternalPagos.g:3431:2: rule__Provider__Group_14__1__Impl
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
    // InternalPagos.g:3437:1: rule__Provider__Group_14__1__Impl : ( ( rule__Provider__AttListsAssignment_14_1 ) ) ;
    public final void rule__Provider__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3441:1: ( ( ( rule__Provider__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:3442:1: ( ( rule__Provider__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:3442:1: ( ( rule__Provider__AttListsAssignment_14_1 ) )
            // InternalPagos.g:3443:2: ( rule__Provider__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getProviderAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:3444:2: ( rule__Provider__AttListsAssignment_14_1 )
            // InternalPagos.g:3444:3: rule__Provider__AttListsAssignment_14_1
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
    // InternalPagos.g:3453:1: rule__InformationTemplate__Group__0 : rule__InformationTemplate__Group__0__Impl rule__InformationTemplate__Group__1 ;
    public final void rule__InformationTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3457:1: ( rule__InformationTemplate__Group__0__Impl rule__InformationTemplate__Group__1 )
            // InternalPagos.g:3458:2: rule__InformationTemplate__Group__0__Impl rule__InformationTemplate__Group__1
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
    // InternalPagos.g:3465:1: rule__InformationTemplate__Group__0__Impl : ( () ) ;
    public final void rule__InformationTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3469:1: ( ( () ) )
            // InternalPagos.g:3470:1: ( () )
            {
            // InternalPagos.g:3470:1: ( () )
            // InternalPagos.g:3471:2: ()
            {
             before(grammarAccess.getInformationTemplateAccess().getInformationTemplateAction_0()); 
            // InternalPagos.g:3472:2: ()
            // InternalPagos.g:3472:3: 
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
    // InternalPagos.g:3480:1: rule__InformationTemplate__Group__1 : rule__InformationTemplate__Group__1__Impl rule__InformationTemplate__Group__2 ;
    public final void rule__InformationTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3484:1: ( rule__InformationTemplate__Group__1__Impl rule__InformationTemplate__Group__2 )
            // InternalPagos.g:3485:2: rule__InformationTemplate__Group__1__Impl rule__InformationTemplate__Group__2
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
    // InternalPagos.g:3492:1: rule__InformationTemplate__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__InformationTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3496:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:3497:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:3497:1: ( RULE_LBRACE )
            // InternalPagos.g:3498:2: RULE_LBRACE
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
    // InternalPagos.g:3507:1: rule__InformationTemplate__Group__2 : rule__InformationTemplate__Group__2__Impl rule__InformationTemplate__Group__3 ;
    public final void rule__InformationTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3511:1: ( rule__InformationTemplate__Group__2__Impl rule__InformationTemplate__Group__3 )
            // InternalPagos.g:3512:2: rule__InformationTemplate__Group__2__Impl rule__InformationTemplate__Group__3
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
    // InternalPagos.g:3519:1: rule__InformationTemplate__Group__2__Impl : ( 'name' ) ;
    public final void rule__InformationTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3523:1: ( ( 'name' ) )
            // InternalPagos.g:3524:1: ( 'name' )
            {
            // InternalPagos.g:3524:1: ( 'name' )
            // InternalPagos.g:3525:2: 'name'
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
    // InternalPagos.g:3534:1: rule__InformationTemplate__Group__3 : rule__InformationTemplate__Group__3__Impl rule__InformationTemplate__Group__4 ;
    public final void rule__InformationTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3538:1: ( rule__InformationTemplate__Group__3__Impl rule__InformationTemplate__Group__4 )
            // InternalPagos.g:3539:2: rule__InformationTemplate__Group__3__Impl rule__InformationTemplate__Group__4
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
    // InternalPagos.g:3546:1: rule__InformationTemplate__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3550:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3551:1: ( RULE_COLON )
            {
            // InternalPagos.g:3551:1: ( RULE_COLON )
            // InternalPagos.g:3552:2: RULE_COLON
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
    // InternalPagos.g:3561:1: rule__InformationTemplate__Group__4 : rule__InformationTemplate__Group__4__Impl rule__InformationTemplate__Group__5 ;
    public final void rule__InformationTemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3565:1: ( rule__InformationTemplate__Group__4__Impl rule__InformationTemplate__Group__5 )
            // InternalPagos.g:3566:2: rule__InformationTemplate__Group__4__Impl rule__InformationTemplate__Group__5
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
    // InternalPagos.g:3573:1: rule__InformationTemplate__Group__4__Impl : ( ( rule__InformationTemplate__NameAssignment_4 ) ) ;
    public final void rule__InformationTemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3577:1: ( ( ( rule__InformationTemplate__NameAssignment_4 ) ) )
            // InternalPagos.g:3578:1: ( ( rule__InformationTemplate__NameAssignment_4 ) )
            {
            // InternalPagos.g:3578:1: ( ( rule__InformationTemplate__NameAssignment_4 ) )
            // InternalPagos.g:3579:2: ( rule__InformationTemplate__NameAssignment_4 )
            {
             before(grammarAccess.getInformationTemplateAccess().getNameAssignment_4()); 
            // InternalPagos.g:3580:2: ( rule__InformationTemplate__NameAssignment_4 )
            // InternalPagos.g:3580:3: rule__InformationTemplate__NameAssignment_4
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
    // InternalPagos.g:3588:1: rule__InformationTemplate__Group__5 : rule__InformationTemplate__Group__5__Impl rule__InformationTemplate__Group__6 ;
    public final void rule__InformationTemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3592:1: ( rule__InformationTemplate__Group__5__Impl rule__InformationTemplate__Group__6 )
            // InternalPagos.g:3593:2: rule__InformationTemplate__Group__5__Impl rule__InformationTemplate__Group__6
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
    // InternalPagos.g:3600:1: rule__InformationTemplate__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3604:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3605:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3605:1: ( RULE_COMMA )
            // InternalPagos.g:3606:2: RULE_COMMA
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
    // InternalPagos.g:3615:1: rule__InformationTemplate__Group__6 : rule__InformationTemplate__Group__6__Impl rule__InformationTemplate__Group__7 ;
    public final void rule__InformationTemplate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3619:1: ( rule__InformationTemplate__Group__6__Impl rule__InformationTemplate__Group__7 )
            // InternalPagos.g:3620:2: rule__InformationTemplate__Group__6__Impl rule__InformationTemplate__Group__7
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
    // InternalPagos.g:3627:1: rule__InformationTemplate__Group__6__Impl : ( 'description' ) ;
    public final void rule__InformationTemplate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3631:1: ( ( 'description' ) )
            // InternalPagos.g:3632:1: ( 'description' )
            {
            // InternalPagos.g:3632:1: ( 'description' )
            // InternalPagos.g:3633:2: 'description'
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
    // InternalPagos.g:3642:1: rule__InformationTemplate__Group__7 : rule__InformationTemplate__Group__7__Impl rule__InformationTemplate__Group__8 ;
    public final void rule__InformationTemplate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3646:1: ( rule__InformationTemplate__Group__7__Impl rule__InformationTemplate__Group__8 )
            // InternalPagos.g:3647:2: rule__InformationTemplate__Group__7__Impl rule__InformationTemplate__Group__8
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
    // InternalPagos.g:3654:1: rule__InformationTemplate__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3658:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3659:1: ( RULE_COLON )
            {
            // InternalPagos.g:3659:1: ( RULE_COLON )
            // InternalPagos.g:3660:2: RULE_COLON
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
    // InternalPagos.g:3669:1: rule__InformationTemplate__Group__8 : rule__InformationTemplate__Group__8__Impl rule__InformationTemplate__Group__9 ;
    public final void rule__InformationTemplate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3673:1: ( rule__InformationTemplate__Group__8__Impl rule__InformationTemplate__Group__9 )
            // InternalPagos.g:3674:2: rule__InformationTemplate__Group__8__Impl rule__InformationTemplate__Group__9
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
    // InternalPagos.g:3681:1: rule__InformationTemplate__Group__8__Impl : ( ( rule__InformationTemplate__DescriptionAssignment_8 ) ) ;
    public final void rule__InformationTemplate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3685:1: ( ( ( rule__InformationTemplate__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:3686:1: ( ( rule__InformationTemplate__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:3686:1: ( ( rule__InformationTemplate__DescriptionAssignment_8 ) )
            // InternalPagos.g:3687:2: ( rule__InformationTemplate__DescriptionAssignment_8 )
            {
             before(grammarAccess.getInformationTemplateAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:3688:2: ( rule__InformationTemplate__DescriptionAssignment_8 )
            // InternalPagos.g:3688:3: rule__InformationTemplate__DescriptionAssignment_8
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
    // InternalPagos.g:3696:1: rule__InformationTemplate__Group__9 : rule__InformationTemplate__Group__9__Impl rule__InformationTemplate__Group__10 ;
    public final void rule__InformationTemplate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3700:1: ( rule__InformationTemplate__Group__9__Impl rule__InformationTemplate__Group__10 )
            // InternalPagos.g:3701:2: rule__InformationTemplate__Group__9__Impl rule__InformationTemplate__Group__10
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
    // InternalPagos.g:3708:1: rule__InformationTemplate__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3712:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3713:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3713:1: ( RULE_COMMA )
            // InternalPagos.g:3714:2: RULE_COMMA
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
    // InternalPagos.g:3723:1: rule__InformationTemplate__Group__10 : rule__InformationTemplate__Group__10__Impl rule__InformationTemplate__Group__11 ;
    public final void rule__InformationTemplate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3727:1: ( rule__InformationTemplate__Group__10__Impl rule__InformationTemplate__Group__11 )
            // InternalPagos.g:3728:2: rule__InformationTemplate__Group__10__Impl rule__InformationTemplate__Group__11
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
    // InternalPagos.g:3735:1: rule__InformationTemplate__Group__10__Impl : ( 'FormAttributes' ) ;
    public final void rule__InformationTemplate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3739:1: ( ( 'FormAttributes' ) )
            // InternalPagos.g:3740:1: ( 'FormAttributes' )
            {
            // InternalPagos.g:3740:1: ( 'FormAttributes' )
            // InternalPagos.g:3741:2: 'FormAttributes'
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
    // InternalPagos.g:3750:1: rule__InformationTemplate__Group__11 : rule__InformationTemplate__Group__11__Impl rule__InformationTemplate__Group__12 ;
    public final void rule__InformationTemplate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3754:1: ( rule__InformationTemplate__Group__11__Impl rule__InformationTemplate__Group__12 )
            // InternalPagos.g:3755:2: rule__InformationTemplate__Group__11__Impl rule__InformationTemplate__Group__12
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
    // InternalPagos.g:3762:1: rule__InformationTemplate__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3766:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3767:1: ( RULE_COLON )
            {
            // InternalPagos.g:3767:1: ( RULE_COLON )
            // InternalPagos.g:3768:2: RULE_COLON
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
    // InternalPagos.g:3777:1: rule__InformationTemplate__Group__12 : rule__InformationTemplate__Group__12__Impl rule__InformationTemplate__Group__13 ;
    public final void rule__InformationTemplate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3781:1: ( rule__InformationTemplate__Group__12__Impl rule__InformationTemplate__Group__13 )
            // InternalPagos.g:3782:2: rule__InformationTemplate__Group__12__Impl rule__InformationTemplate__Group__13
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
    // InternalPagos.g:3789:1: rule__InformationTemplate__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__InformationTemplate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3793:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:3794:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:3794:1: ( RULE_LBRACKET )
            // InternalPagos.g:3795:2: RULE_LBRACKET
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
    // InternalPagos.g:3804:1: rule__InformationTemplate__Group__13 : rule__InformationTemplate__Group__13__Impl rule__InformationTemplate__Group__14 ;
    public final void rule__InformationTemplate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3808:1: ( rule__InformationTemplate__Group__13__Impl rule__InformationTemplate__Group__14 )
            // InternalPagos.g:3809:2: rule__InformationTemplate__Group__13__Impl rule__InformationTemplate__Group__14
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
    // InternalPagos.g:3816:1: rule__InformationTemplate__Group__13__Impl : ( ( rule__InformationTemplate__FormListsAssignment_13 ) ) ;
    public final void rule__InformationTemplate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3820:1: ( ( ( rule__InformationTemplate__FormListsAssignment_13 ) ) )
            // InternalPagos.g:3821:1: ( ( rule__InformationTemplate__FormListsAssignment_13 ) )
            {
            // InternalPagos.g:3821:1: ( ( rule__InformationTemplate__FormListsAssignment_13 ) )
            // InternalPagos.g:3822:2: ( rule__InformationTemplate__FormListsAssignment_13 )
            {
             before(grammarAccess.getInformationTemplateAccess().getFormListsAssignment_13()); 
            // InternalPagos.g:3823:2: ( rule__InformationTemplate__FormListsAssignment_13 )
            // InternalPagos.g:3823:3: rule__InformationTemplate__FormListsAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__FormListsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getInformationTemplateAccess().getFormListsAssignment_13()); 

            }


            }

        }
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
    // InternalPagos.g:3831:1: rule__InformationTemplate__Group__14 : rule__InformationTemplate__Group__14__Impl rule__InformationTemplate__Group__15 ;
    public final void rule__InformationTemplate__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3835:1: ( rule__InformationTemplate__Group__14__Impl rule__InformationTemplate__Group__15 )
            // InternalPagos.g:3836:2: rule__InformationTemplate__Group__14__Impl rule__InformationTemplate__Group__15
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
    // InternalPagos.g:3843:1: rule__InformationTemplate__Group__14__Impl : ( ( rule__InformationTemplate__Group_14__0 )* ) ;
    public final void rule__InformationTemplate__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3847:1: ( ( ( rule__InformationTemplate__Group_14__0 )* ) )
            // InternalPagos.g:3848:1: ( ( rule__InformationTemplate__Group_14__0 )* )
            {
            // InternalPagos.g:3848:1: ( ( rule__InformationTemplate__Group_14__0 )* )
            // InternalPagos.g:3849:2: ( rule__InformationTemplate__Group_14__0 )*
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_14()); 
            // InternalPagos.g:3850:2: ( rule__InformationTemplate__Group_14__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPagos.g:3850:3: rule__InformationTemplate__Group_14__0
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
    // InternalPagos.g:3858:1: rule__InformationTemplate__Group__15 : rule__InformationTemplate__Group__15__Impl rule__InformationTemplate__Group__16 ;
    public final void rule__InformationTemplate__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3862:1: ( rule__InformationTemplate__Group__15__Impl rule__InformationTemplate__Group__16 )
            // InternalPagos.g:3863:2: rule__InformationTemplate__Group__15__Impl rule__InformationTemplate__Group__16
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
    // InternalPagos.g:3870:1: rule__InformationTemplate__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__InformationTemplate__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3874:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:3875:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:3875:1: ( RULE_RBRACKET )
            // InternalPagos.g:3876:2: RULE_RBRACKET
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
    // InternalPagos.g:3885:1: rule__InformationTemplate__Group__16 : rule__InformationTemplate__Group__16__Impl rule__InformationTemplate__Group__17 ;
    public final void rule__InformationTemplate__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3889:1: ( rule__InformationTemplate__Group__16__Impl rule__InformationTemplate__Group__17 )
            // InternalPagos.g:3890:2: rule__InformationTemplate__Group__16__Impl rule__InformationTemplate__Group__17
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
    // InternalPagos.g:3897:1: rule__InformationTemplate__Group__16__Impl : ( RULE_RBRACE ) ;
    public final void rule__InformationTemplate__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3901:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:3902:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:3902:1: ( RULE_RBRACE )
            // InternalPagos.g:3903:2: RULE_RBRACE
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
    // InternalPagos.g:3912:1: rule__InformationTemplate__Group__17 : rule__InformationTemplate__Group__17__Impl rule__InformationTemplate__Group__18 ;
    public final void rule__InformationTemplate__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3916:1: ( rule__InformationTemplate__Group__17__Impl rule__InformationTemplate__Group__18 )
            // InternalPagos.g:3917:2: rule__InformationTemplate__Group__17__Impl rule__InformationTemplate__Group__18
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
    // InternalPagos.g:3924:1: rule__InformationTemplate__Group__17__Impl : ( ( rule__InformationTemplate__Group_17__0 )? ) ;
    public final void rule__InformationTemplate__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3928:1: ( ( ( rule__InformationTemplate__Group_17__0 )? ) )
            // InternalPagos.g:3929:1: ( ( rule__InformationTemplate__Group_17__0 )? )
            {
            // InternalPagos.g:3929:1: ( ( rule__InformationTemplate__Group_17__0 )? )
            // InternalPagos.g:3930:2: ( rule__InformationTemplate__Group_17__0 )?
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_17()); 
            // InternalPagos.g:3931:2: ( rule__InformationTemplate__Group_17__0 )?
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
                    // InternalPagos.g:3931:3: rule__InformationTemplate__Group_17__0
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
    // InternalPagos.g:3939:1: rule__InformationTemplate__Group__18 : rule__InformationTemplate__Group__18__Impl ;
    public final void rule__InformationTemplate__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3943:1: ( rule__InformationTemplate__Group__18__Impl )
            // InternalPagos.g:3944:2: rule__InformationTemplate__Group__18__Impl
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
    // InternalPagos.g:3950:1: rule__InformationTemplate__Group__18__Impl : ( ( rule__InformationTemplate__Group_18__0 )? ) ;
    public final void rule__InformationTemplate__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3954:1: ( ( ( rule__InformationTemplate__Group_18__0 )? ) )
            // InternalPagos.g:3955:1: ( ( rule__InformationTemplate__Group_18__0 )? )
            {
            // InternalPagos.g:3955:1: ( ( rule__InformationTemplate__Group_18__0 )? )
            // InternalPagos.g:3956:2: ( rule__InformationTemplate__Group_18__0 )?
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_18()); 
            // InternalPagos.g:3957:2: ( rule__InformationTemplate__Group_18__0 )?
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
                    // InternalPagos.g:3957:3: rule__InformationTemplate__Group_18__0
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
    // InternalPagos.g:3966:1: rule__InformationTemplate__Group_14__0 : rule__InformationTemplate__Group_14__0__Impl rule__InformationTemplate__Group_14__1 ;
    public final void rule__InformationTemplate__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3970:1: ( rule__InformationTemplate__Group_14__0__Impl rule__InformationTemplate__Group_14__1 )
            // InternalPagos.g:3971:2: rule__InformationTemplate__Group_14__0__Impl rule__InformationTemplate__Group_14__1
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
    // InternalPagos.g:3978:1: rule__InformationTemplate__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3982:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3983:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3983:1: ( RULE_COMMA )
            // InternalPagos.g:3984:2: RULE_COMMA
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
    // InternalPagos.g:3993:1: rule__InformationTemplate__Group_14__1 : rule__InformationTemplate__Group_14__1__Impl ;
    public final void rule__InformationTemplate__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3997:1: ( rule__InformationTemplate__Group_14__1__Impl )
            // InternalPagos.g:3998:2: rule__InformationTemplate__Group_14__1__Impl
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
    // InternalPagos.g:4004:1: rule__InformationTemplate__Group_14__1__Impl : ( ( rule__InformationTemplate__FormListsAssignment_14_1 ) ) ;
    public final void rule__InformationTemplate__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4008:1: ( ( ( rule__InformationTemplate__FormListsAssignment_14_1 ) ) )
            // InternalPagos.g:4009:1: ( ( rule__InformationTemplate__FormListsAssignment_14_1 ) )
            {
            // InternalPagos.g:4009:1: ( ( rule__InformationTemplate__FormListsAssignment_14_1 ) )
            // InternalPagos.g:4010:2: ( rule__InformationTemplate__FormListsAssignment_14_1 )
            {
             before(grammarAccess.getInformationTemplateAccess().getFormListsAssignment_14_1()); 
            // InternalPagos.g:4011:2: ( rule__InformationTemplate__FormListsAssignment_14_1 )
            // InternalPagos.g:4011:3: rule__InformationTemplate__FormListsAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__InformationTemplate__FormListsAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getInformationTemplateAccess().getFormListsAssignment_14_1()); 

            }


            }

        }
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
    // InternalPagos.g:4020:1: rule__InformationTemplate__Group_17__0 : rule__InformationTemplate__Group_17__0__Impl rule__InformationTemplate__Group_17__1 ;
    public final void rule__InformationTemplate__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4024:1: ( rule__InformationTemplate__Group_17__0__Impl rule__InformationTemplate__Group_17__1 )
            // InternalPagos.g:4025:2: rule__InformationTemplate__Group_17__0__Impl rule__InformationTemplate__Group_17__1
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
    // InternalPagos.g:4032:1: rule__InformationTemplate__Group_17__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4036:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4037:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4037:1: ( RULE_COMMA )
            // InternalPagos.g:4038:2: RULE_COMMA
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
    // InternalPagos.g:4047:1: rule__InformationTemplate__Group_17__1 : rule__InformationTemplate__Group_17__1__Impl rule__InformationTemplate__Group_17__2 ;
    public final void rule__InformationTemplate__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4051:1: ( rule__InformationTemplate__Group_17__1__Impl rule__InformationTemplate__Group_17__2 )
            // InternalPagos.g:4052:2: rule__InformationTemplate__Group_17__1__Impl rule__InformationTemplate__Group_17__2
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
    // InternalPagos.g:4059:1: rule__InformationTemplate__Group_17__1__Impl : ( 'calculationtemplates' ) ;
    public final void rule__InformationTemplate__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4063:1: ( ( 'calculationtemplates' ) )
            // InternalPagos.g:4064:1: ( 'calculationtemplates' )
            {
            // InternalPagos.g:4064:1: ( 'calculationtemplates' )
            // InternalPagos.g:4065:2: 'calculationtemplates'
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
    // InternalPagos.g:4074:1: rule__InformationTemplate__Group_17__2 : rule__InformationTemplate__Group_17__2__Impl rule__InformationTemplate__Group_17__3 ;
    public final void rule__InformationTemplate__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4078:1: ( rule__InformationTemplate__Group_17__2__Impl rule__InformationTemplate__Group_17__3 )
            // InternalPagos.g:4079:2: rule__InformationTemplate__Group_17__2__Impl rule__InformationTemplate__Group_17__3
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
    // InternalPagos.g:4086:1: rule__InformationTemplate__Group_17__2__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4090:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4091:1: ( RULE_COLON )
            {
            // InternalPagos.g:4091:1: ( RULE_COLON )
            // InternalPagos.g:4092:2: RULE_COLON
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
    // InternalPagos.g:4101:1: rule__InformationTemplate__Group_17__3 : rule__InformationTemplate__Group_17__3__Impl rule__InformationTemplate__Group_17__4 ;
    public final void rule__InformationTemplate__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4105:1: ( rule__InformationTemplate__Group_17__3__Impl rule__InformationTemplate__Group_17__4 )
            // InternalPagos.g:4106:2: rule__InformationTemplate__Group_17__3__Impl rule__InformationTemplate__Group_17__4
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
    // InternalPagos.g:4113:1: rule__InformationTemplate__Group_17__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__InformationTemplate__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4117:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:4118:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:4118:1: ( RULE_LBRACKET )
            // InternalPagos.g:4119:2: RULE_LBRACKET
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
    // InternalPagos.g:4128:1: rule__InformationTemplate__Group_17__4 : rule__InformationTemplate__Group_17__4__Impl rule__InformationTemplate__Group_17__5 ;
    public final void rule__InformationTemplate__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4132:1: ( rule__InformationTemplate__Group_17__4__Impl rule__InformationTemplate__Group_17__5 )
            // InternalPagos.g:4133:2: rule__InformationTemplate__Group_17__4__Impl rule__InformationTemplate__Group_17__5
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
    // InternalPagos.g:4140:1: rule__InformationTemplate__Group_17__4__Impl : ( ( rule__InformationTemplate__TemplatesAssignment_17_4 ) ) ;
    public final void rule__InformationTemplate__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4144:1: ( ( ( rule__InformationTemplate__TemplatesAssignment_17_4 ) ) )
            // InternalPagos.g:4145:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_4 ) )
            {
            // InternalPagos.g:4145:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_4 ) )
            // InternalPagos.g:4146:2: ( rule__InformationTemplate__TemplatesAssignment_17_4 )
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_4()); 
            // InternalPagos.g:4147:2: ( rule__InformationTemplate__TemplatesAssignment_17_4 )
            // InternalPagos.g:4147:3: rule__InformationTemplate__TemplatesAssignment_17_4
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
    // InternalPagos.g:4155:1: rule__InformationTemplate__Group_17__5 : rule__InformationTemplate__Group_17__5__Impl rule__InformationTemplate__Group_17__6 ;
    public final void rule__InformationTemplate__Group_17__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4159:1: ( rule__InformationTemplate__Group_17__5__Impl rule__InformationTemplate__Group_17__6 )
            // InternalPagos.g:4160:2: rule__InformationTemplate__Group_17__5__Impl rule__InformationTemplate__Group_17__6
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
    // InternalPagos.g:4167:1: rule__InformationTemplate__Group_17__5__Impl : ( ( rule__InformationTemplate__Group_17_5__0 )* ) ;
    public final void rule__InformationTemplate__Group_17__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4171:1: ( ( ( rule__InformationTemplate__Group_17_5__0 )* ) )
            // InternalPagos.g:4172:1: ( ( rule__InformationTemplate__Group_17_5__0 )* )
            {
            // InternalPagos.g:4172:1: ( ( rule__InformationTemplate__Group_17_5__0 )* )
            // InternalPagos.g:4173:2: ( rule__InformationTemplate__Group_17_5__0 )*
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_17_5()); 
            // InternalPagos.g:4174:2: ( rule__InformationTemplate__Group_17_5__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPagos.g:4174:3: rule__InformationTemplate__Group_17_5__0
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
    // InternalPagos.g:4182:1: rule__InformationTemplate__Group_17__6 : rule__InformationTemplate__Group_17__6__Impl ;
    public final void rule__InformationTemplate__Group_17__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4186:1: ( rule__InformationTemplate__Group_17__6__Impl )
            // InternalPagos.g:4187:2: rule__InformationTemplate__Group_17__6__Impl
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
    // InternalPagos.g:4193:1: rule__InformationTemplate__Group_17__6__Impl : ( RULE_RBRACKET ) ;
    public final void rule__InformationTemplate__Group_17__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4197:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:4198:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:4198:1: ( RULE_RBRACKET )
            // InternalPagos.g:4199:2: RULE_RBRACKET
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
    // InternalPagos.g:4209:1: rule__InformationTemplate__Group_17_5__0 : rule__InformationTemplate__Group_17_5__0__Impl rule__InformationTemplate__Group_17_5__1 ;
    public final void rule__InformationTemplate__Group_17_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4213:1: ( rule__InformationTemplate__Group_17_5__0__Impl rule__InformationTemplate__Group_17_5__1 )
            // InternalPagos.g:4214:2: rule__InformationTemplate__Group_17_5__0__Impl rule__InformationTemplate__Group_17_5__1
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
    // InternalPagos.g:4221:1: rule__InformationTemplate__Group_17_5__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_17_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4225:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4226:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4226:1: ( RULE_COMMA )
            // InternalPagos.g:4227:2: RULE_COMMA
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
    // InternalPagos.g:4236:1: rule__InformationTemplate__Group_17_5__1 : rule__InformationTemplate__Group_17_5__1__Impl ;
    public final void rule__InformationTemplate__Group_17_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4240:1: ( rule__InformationTemplate__Group_17_5__1__Impl )
            // InternalPagos.g:4241:2: rule__InformationTemplate__Group_17_5__1__Impl
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
    // InternalPagos.g:4247:1: rule__InformationTemplate__Group_17_5__1__Impl : ( ( rule__InformationTemplate__TemplatesAssignment_17_5_1 ) ) ;
    public final void rule__InformationTemplate__Group_17_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4251:1: ( ( ( rule__InformationTemplate__TemplatesAssignment_17_5_1 ) ) )
            // InternalPagos.g:4252:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_5_1 ) )
            {
            // InternalPagos.g:4252:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_5_1 ) )
            // InternalPagos.g:4253:2: ( rule__InformationTemplate__TemplatesAssignment_17_5_1 )
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_5_1()); 
            // InternalPagos.g:4254:2: ( rule__InformationTemplate__TemplatesAssignment_17_5_1 )
            // InternalPagos.g:4254:3: rule__InformationTemplate__TemplatesAssignment_17_5_1
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
    // InternalPagos.g:4263:1: rule__InformationTemplate__Group_18__0 : rule__InformationTemplate__Group_18__0__Impl rule__InformationTemplate__Group_18__1 ;
    public final void rule__InformationTemplate__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4267:1: ( rule__InformationTemplate__Group_18__0__Impl rule__InformationTemplate__Group_18__1 )
            // InternalPagos.g:4268:2: rule__InformationTemplate__Group_18__0__Impl rule__InformationTemplate__Group_18__1
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
    // InternalPagos.g:4275:1: rule__InformationTemplate__Group_18__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4279:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4280:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4280:1: ( RULE_COMMA )
            // InternalPagos.g:4281:2: RULE_COMMA
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
    // InternalPagos.g:4290:1: rule__InformationTemplate__Group_18__1 : rule__InformationTemplate__Group_18__1__Impl rule__InformationTemplate__Group_18__2 ;
    public final void rule__InformationTemplate__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4294:1: ( rule__InformationTemplate__Group_18__1__Impl rule__InformationTemplate__Group_18__2 )
            // InternalPagos.g:4295:2: rule__InformationTemplate__Group_18__1__Impl rule__InformationTemplate__Group_18__2
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
    // InternalPagos.g:4302:1: rule__InformationTemplate__Group_18__1__Impl : ( 'providers' ) ;
    public final void rule__InformationTemplate__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4306:1: ( ( 'providers' ) )
            // InternalPagos.g:4307:1: ( 'providers' )
            {
            // InternalPagos.g:4307:1: ( 'providers' )
            // InternalPagos.g:4308:2: 'providers'
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
    // InternalPagos.g:4317:1: rule__InformationTemplate__Group_18__2 : rule__InformationTemplate__Group_18__2__Impl rule__InformationTemplate__Group_18__3 ;
    public final void rule__InformationTemplate__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4321:1: ( rule__InformationTemplate__Group_18__2__Impl rule__InformationTemplate__Group_18__3 )
            // InternalPagos.g:4322:2: rule__InformationTemplate__Group_18__2__Impl rule__InformationTemplate__Group_18__3
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
    // InternalPagos.g:4329:1: rule__InformationTemplate__Group_18__2__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4333:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4334:1: ( RULE_COLON )
            {
            // InternalPagos.g:4334:1: ( RULE_COLON )
            // InternalPagos.g:4335:2: RULE_COLON
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
    // InternalPagos.g:4344:1: rule__InformationTemplate__Group_18__3 : rule__InformationTemplate__Group_18__3__Impl rule__InformationTemplate__Group_18__4 ;
    public final void rule__InformationTemplate__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4348:1: ( rule__InformationTemplate__Group_18__3__Impl rule__InformationTemplate__Group_18__4 )
            // InternalPagos.g:4349:2: rule__InformationTemplate__Group_18__3__Impl rule__InformationTemplate__Group_18__4
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
    // InternalPagos.g:4356:1: rule__InformationTemplate__Group_18__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__InformationTemplate__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4360:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:4361:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:4361:1: ( RULE_LBRACKET )
            // InternalPagos.g:4362:2: RULE_LBRACKET
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
    // InternalPagos.g:4371:1: rule__InformationTemplate__Group_18__4 : rule__InformationTemplate__Group_18__4__Impl rule__InformationTemplate__Group_18__5 ;
    public final void rule__InformationTemplate__Group_18__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4375:1: ( rule__InformationTemplate__Group_18__4__Impl rule__InformationTemplate__Group_18__5 )
            // InternalPagos.g:4376:2: rule__InformationTemplate__Group_18__4__Impl rule__InformationTemplate__Group_18__5
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
    // InternalPagos.g:4383:1: rule__InformationTemplate__Group_18__4__Impl : ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) ) ;
    public final void rule__InformationTemplate__Group_18__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4387:1: ( ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) ) )
            // InternalPagos.g:4388:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) )
            {
            // InternalPagos.g:4388:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) )
            // InternalPagos.g:4389:2: ( rule__InformationTemplate__ProvidersAssignment_18_4 )
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersAssignment_18_4()); 
            // InternalPagos.g:4390:2: ( rule__InformationTemplate__ProvidersAssignment_18_4 )
            // InternalPagos.g:4390:3: rule__InformationTemplate__ProvidersAssignment_18_4
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
    // InternalPagos.g:4398:1: rule__InformationTemplate__Group_18__5 : rule__InformationTemplate__Group_18__5__Impl rule__InformationTemplate__Group_18__6 ;
    public final void rule__InformationTemplate__Group_18__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4402:1: ( rule__InformationTemplate__Group_18__5__Impl rule__InformationTemplate__Group_18__6 )
            // InternalPagos.g:4403:2: rule__InformationTemplate__Group_18__5__Impl rule__InformationTemplate__Group_18__6
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
    // InternalPagos.g:4410:1: rule__InformationTemplate__Group_18__5__Impl : ( ( rule__InformationTemplate__Group_18_5__0 )* ) ;
    public final void rule__InformationTemplate__Group_18__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4414:1: ( ( ( rule__InformationTemplate__Group_18_5__0 )* ) )
            // InternalPagos.g:4415:1: ( ( rule__InformationTemplate__Group_18_5__0 )* )
            {
            // InternalPagos.g:4415:1: ( ( rule__InformationTemplate__Group_18_5__0 )* )
            // InternalPagos.g:4416:2: ( rule__InformationTemplate__Group_18_5__0 )*
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_18_5()); 
            // InternalPagos.g:4417:2: ( rule__InformationTemplate__Group_18_5__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPagos.g:4417:3: rule__InformationTemplate__Group_18_5__0
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
    // InternalPagos.g:4425:1: rule__InformationTemplate__Group_18__6 : rule__InformationTemplate__Group_18__6__Impl ;
    public final void rule__InformationTemplate__Group_18__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4429:1: ( rule__InformationTemplate__Group_18__6__Impl )
            // InternalPagos.g:4430:2: rule__InformationTemplate__Group_18__6__Impl
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
    // InternalPagos.g:4436:1: rule__InformationTemplate__Group_18__6__Impl : ( RULE_RBRACKET ) ;
    public final void rule__InformationTemplate__Group_18__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4440:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:4441:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:4441:1: ( RULE_RBRACKET )
            // InternalPagos.g:4442:2: RULE_RBRACKET
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
    // InternalPagos.g:4452:1: rule__InformationTemplate__Group_18_5__0 : rule__InformationTemplate__Group_18_5__0__Impl rule__InformationTemplate__Group_18_5__1 ;
    public final void rule__InformationTemplate__Group_18_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4456:1: ( rule__InformationTemplate__Group_18_5__0__Impl rule__InformationTemplate__Group_18_5__1 )
            // InternalPagos.g:4457:2: rule__InformationTemplate__Group_18_5__0__Impl rule__InformationTemplate__Group_18_5__1
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
    // InternalPagos.g:4464:1: rule__InformationTemplate__Group_18_5__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_18_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4468:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4469:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4469:1: ( RULE_COMMA )
            // InternalPagos.g:4470:2: RULE_COMMA
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
    // InternalPagos.g:4479:1: rule__InformationTemplate__Group_18_5__1 : rule__InformationTemplate__Group_18_5__1__Impl ;
    public final void rule__InformationTemplate__Group_18_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4483:1: ( rule__InformationTemplate__Group_18_5__1__Impl )
            // InternalPagos.g:4484:2: rule__InformationTemplate__Group_18_5__1__Impl
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
    // InternalPagos.g:4490:1: rule__InformationTemplate__Group_18_5__1__Impl : ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) ) ;
    public final void rule__InformationTemplate__Group_18_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4494:1: ( ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) ) )
            // InternalPagos.g:4495:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) )
            {
            // InternalPagos.g:4495:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) )
            // InternalPagos.g:4496:2: ( rule__InformationTemplate__ProvidersAssignment_18_5_1 )
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersAssignment_18_5_1()); 
            // InternalPagos.g:4497:2: ( rule__InformationTemplate__ProvidersAssignment_18_5_1 )
            // InternalPagos.g:4497:3: rule__InformationTemplate__ProvidersAssignment_18_5_1
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
    // InternalPagos.g:4506:1: rule__CalculationTemplate__Group__0 : rule__CalculationTemplate__Group__0__Impl rule__CalculationTemplate__Group__1 ;
    public final void rule__CalculationTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4510:1: ( rule__CalculationTemplate__Group__0__Impl rule__CalculationTemplate__Group__1 )
            // InternalPagos.g:4511:2: rule__CalculationTemplate__Group__0__Impl rule__CalculationTemplate__Group__1
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
    // InternalPagos.g:4518:1: rule__CalculationTemplate__Group__0__Impl : ( () ) ;
    public final void rule__CalculationTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4522:1: ( ( () ) )
            // InternalPagos.g:4523:1: ( () )
            {
            // InternalPagos.g:4523:1: ( () )
            // InternalPagos.g:4524:2: ()
            {
             before(grammarAccess.getCalculationTemplateAccess().getCalculationTemplateAction_0()); 
            // InternalPagos.g:4525:2: ()
            // InternalPagos.g:4525:3: 
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
    // InternalPagos.g:4533:1: rule__CalculationTemplate__Group__1 : rule__CalculationTemplate__Group__1__Impl rule__CalculationTemplate__Group__2 ;
    public final void rule__CalculationTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4537:1: ( rule__CalculationTemplate__Group__1__Impl rule__CalculationTemplate__Group__2 )
            // InternalPagos.g:4538:2: rule__CalculationTemplate__Group__1__Impl rule__CalculationTemplate__Group__2
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
    // InternalPagos.g:4545:1: rule__CalculationTemplate__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__CalculationTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4549:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:4550:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:4550:1: ( RULE_LBRACE )
            // InternalPagos.g:4551:2: RULE_LBRACE
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
    // InternalPagos.g:4560:1: rule__CalculationTemplate__Group__2 : rule__CalculationTemplate__Group__2__Impl rule__CalculationTemplate__Group__3 ;
    public final void rule__CalculationTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4564:1: ( rule__CalculationTemplate__Group__2__Impl rule__CalculationTemplate__Group__3 )
            // InternalPagos.g:4565:2: rule__CalculationTemplate__Group__2__Impl rule__CalculationTemplate__Group__3
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
    // InternalPagos.g:4572:1: rule__CalculationTemplate__Group__2__Impl : ( 'name' ) ;
    public final void rule__CalculationTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4576:1: ( ( 'name' ) )
            // InternalPagos.g:4577:1: ( 'name' )
            {
            // InternalPagos.g:4577:1: ( 'name' )
            // InternalPagos.g:4578:2: 'name'
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
    // InternalPagos.g:4587:1: rule__CalculationTemplate__Group__3 : rule__CalculationTemplate__Group__3__Impl rule__CalculationTemplate__Group__4 ;
    public final void rule__CalculationTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4591:1: ( rule__CalculationTemplate__Group__3__Impl rule__CalculationTemplate__Group__4 )
            // InternalPagos.g:4592:2: rule__CalculationTemplate__Group__3__Impl rule__CalculationTemplate__Group__4
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
    // InternalPagos.g:4599:1: rule__CalculationTemplate__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4603:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4604:1: ( RULE_COLON )
            {
            // InternalPagos.g:4604:1: ( RULE_COLON )
            // InternalPagos.g:4605:2: RULE_COLON
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
    // InternalPagos.g:4614:1: rule__CalculationTemplate__Group__4 : rule__CalculationTemplate__Group__4__Impl rule__CalculationTemplate__Group__5 ;
    public final void rule__CalculationTemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4618:1: ( rule__CalculationTemplate__Group__4__Impl rule__CalculationTemplate__Group__5 )
            // InternalPagos.g:4619:2: rule__CalculationTemplate__Group__4__Impl rule__CalculationTemplate__Group__5
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
    // InternalPagos.g:4626:1: rule__CalculationTemplate__Group__4__Impl : ( ( rule__CalculationTemplate__NameAssignment_4 ) ) ;
    public final void rule__CalculationTemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4630:1: ( ( ( rule__CalculationTemplate__NameAssignment_4 ) ) )
            // InternalPagos.g:4631:1: ( ( rule__CalculationTemplate__NameAssignment_4 ) )
            {
            // InternalPagos.g:4631:1: ( ( rule__CalculationTemplate__NameAssignment_4 ) )
            // InternalPagos.g:4632:2: ( rule__CalculationTemplate__NameAssignment_4 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getNameAssignment_4()); 
            // InternalPagos.g:4633:2: ( rule__CalculationTemplate__NameAssignment_4 )
            // InternalPagos.g:4633:3: rule__CalculationTemplate__NameAssignment_4
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
    // InternalPagos.g:4641:1: rule__CalculationTemplate__Group__5 : rule__CalculationTemplate__Group__5__Impl rule__CalculationTemplate__Group__6 ;
    public final void rule__CalculationTemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4645:1: ( rule__CalculationTemplate__Group__5__Impl rule__CalculationTemplate__Group__6 )
            // InternalPagos.g:4646:2: rule__CalculationTemplate__Group__5__Impl rule__CalculationTemplate__Group__6
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
    // InternalPagos.g:4653:1: rule__CalculationTemplate__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4657:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4658:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4658:1: ( RULE_COMMA )
            // InternalPagos.g:4659:2: RULE_COMMA
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
    // InternalPagos.g:4668:1: rule__CalculationTemplate__Group__6 : rule__CalculationTemplate__Group__6__Impl rule__CalculationTemplate__Group__7 ;
    public final void rule__CalculationTemplate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4672:1: ( rule__CalculationTemplate__Group__6__Impl rule__CalculationTemplate__Group__7 )
            // InternalPagos.g:4673:2: rule__CalculationTemplate__Group__6__Impl rule__CalculationTemplate__Group__7
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
    // InternalPagos.g:4680:1: rule__CalculationTemplate__Group__6__Impl : ( 'description' ) ;
    public final void rule__CalculationTemplate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4684:1: ( ( 'description' ) )
            // InternalPagos.g:4685:1: ( 'description' )
            {
            // InternalPagos.g:4685:1: ( 'description' )
            // InternalPagos.g:4686:2: 'description'
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
    // InternalPagos.g:4695:1: rule__CalculationTemplate__Group__7 : rule__CalculationTemplate__Group__7__Impl rule__CalculationTemplate__Group__8 ;
    public final void rule__CalculationTemplate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4699:1: ( rule__CalculationTemplate__Group__7__Impl rule__CalculationTemplate__Group__8 )
            // InternalPagos.g:4700:2: rule__CalculationTemplate__Group__7__Impl rule__CalculationTemplate__Group__8
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
    // InternalPagos.g:4707:1: rule__CalculationTemplate__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4711:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4712:1: ( RULE_COLON )
            {
            // InternalPagos.g:4712:1: ( RULE_COLON )
            // InternalPagos.g:4713:2: RULE_COLON
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
    // InternalPagos.g:4722:1: rule__CalculationTemplate__Group__8 : rule__CalculationTemplate__Group__8__Impl rule__CalculationTemplate__Group__9 ;
    public final void rule__CalculationTemplate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4726:1: ( rule__CalculationTemplate__Group__8__Impl rule__CalculationTemplate__Group__9 )
            // InternalPagos.g:4727:2: rule__CalculationTemplate__Group__8__Impl rule__CalculationTemplate__Group__9
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
    // InternalPagos.g:4734:1: rule__CalculationTemplate__Group__8__Impl : ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) ) ;
    public final void rule__CalculationTemplate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4738:1: ( ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:4739:1: ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:4739:1: ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) )
            // InternalPagos.g:4740:2: ( rule__CalculationTemplate__DescriptionAssignment_8 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:4741:2: ( rule__CalculationTemplate__DescriptionAssignment_8 )
            // InternalPagos.g:4741:3: rule__CalculationTemplate__DescriptionAssignment_8
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
    // InternalPagos.g:4749:1: rule__CalculationTemplate__Group__9 : rule__CalculationTemplate__Group__9__Impl rule__CalculationTemplate__Group__10 ;
    public final void rule__CalculationTemplate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4753:1: ( rule__CalculationTemplate__Group__9__Impl rule__CalculationTemplate__Group__10 )
            // InternalPagos.g:4754:2: rule__CalculationTemplate__Group__9__Impl rule__CalculationTemplate__Group__10
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
    // InternalPagos.g:4761:1: rule__CalculationTemplate__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4765:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4766:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4766:1: ( RULE_COMMA )
            // InternalPagos.g:4767:2: RULE_COMMA
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
    // InternalPagos.g:4776:1: rule__CalculationTemplate__Group__10 : rule__CalculationTemplate__Group__10__Impl rule__CalculationTemplate__Group__11 ;
    public final void rule__CalculationTemplate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4780:1: ( rule__CalculationTemplate__Group__10__Impl rule__CalculationTemplate__Group__11 )
            // InternalPagos.g:4781:2: rule__CalculationTemplate__Group__10__Impl rule__CalculationTemplate__Group__11
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
    // InternalPagos.g:4788:1: rule__CalculationTemplate__Group__10__Impl : ( 'calculationattributes' ) ;
    public final void rule__CalculationTemplate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4792:1: ( ( 'calculationattributes' ) )
            // InternalPagos.g:4793:1: ( 'calculationattributes' )
            {
            // InternalPagos.g:4793:1: ( 'calculationattributes' )
            // InternalPagos.g:4794:2: 'calculationattributes'
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
    // InternalPagos.g:4803:1: rule__CalculationTemplate__Group__11 : rule__CalculationTemplate__Group__11__Impl rule__CalculationTemplate__Group__12 ;
    public final void rule__CalculationTemplate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4807:1: ( rule__CalculationTemplate__Group__11__Impl rule__CalculationTemplate__Group__12 )
            // InternalPagos.g:4808:2: rule__CalculationTemplate__Group__11__Impl rule__CalculationTemplate__Group__12
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
    // InternalPagos.g:4815:1: rule__CalculationTemplate__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4819:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4820:1: ( RULE_COLON )
            {
            // InternalPagos.g:4820:1: ( RULE_COLON )
            // InternalPagos.g:4821:2: RULE_COLON
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
    // InternalPagos.g:4830:1: rule__CalculationTemplate__Group__12 : rule__CalculationTemplate__Group__12__Impl rule__CalculationTemplate__Group__13 ;
    public final void rule__CalculationTemplate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4834:1: ( rule__CalculationTemplate__Group__12__Impl rule__CalculationTemplate__Group__13 )
            // InternalPagos.g:4835:2: rule__CalculationTemplate__Group__12__Impl rule__CalculationTemplate__Group__13
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
    // InternalPagos.g:4842:1: rule__CalculationTemplate__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__CalculationTemplate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4846:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:4847:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:4847:1: ( RULE_LBRACKET )
            // InternalPagos.g:4848:2: RULE_LBRACKET
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
    // InternalPagos.g:4857:1: rule__CalculationTemplate__Group__13 : rule__CalculationTemplate__Group__13__Impl rule__CalculationTemplate__Group__14 ;
    public final void rule__CalculationTemplate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4861:1: ( rule__CalculationTemplate__Group__13__Impl rule__CalculationTemplate__Group__14 )
            // InternalPagos.g:4862:2: rule__CalculationTemplate__Group__13__Impl rule__CalculationTemplate__Group__14
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
    // InternalPagos.g:4869:1: rule__CalculationTemplate__Group__13__Impl : ( ( rule__CalculationTemplate__AttListsAssignment_13 ) ) ;
    public final void rule__CalculationTemplate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4873:1: ( ( ( rule__CalculationTemplate__AttListsAssignment_13 ) ) )
            // InternalPagos.g:4874:1: ( ( rule__CalculationTemplate__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:4874:1: ( ( rule__CalculationTemplate__AttListsAssignment_13 ) )
            // InternalPagos.g:4875:2: ( rule__CalculationTemplate__AttListsAssignment_13 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:4876:2: ( rule__CalculationTemplate__AttListsAssignment_13 )
            // InternalPagos.g:4876:3: rule__CalculationTemplate__AttListsAssignment_13
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
    // InternalPagos.g:4884:1: rule__CalculationTemplate__Group__14 : rule__CalculationTemplate__Group__14__Impl rule__CalculationTemplate__Group__15 ;
    public final void rule__CalculationTemplate__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4888:1: ( rule__CalculationTemplate__Group__14__Impl rule__CalculationTemplate__Group__15 )
            // InternalPagos.g:4889:2: rule__CalculationTemplate__Group__14__Impl rule__CalculationTemplate__Group__15
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
    // InternalPagos.g:4896:1: rule__CalculationTemplate__Group__14__Impl : ( ( rule__CalculationTemplate__Group_14__0 )* ) ;
    public final void rule__CalculationTemplate__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4900:1: ( ( ( rule__CalculationTemplate__Group_14__0 )* ) )
            // InternalPagos.g:4901:1: ( ( rule__CalculationTemplate__Group_14__0 )* )
            {
            // InternalPagos.g:4901:1: ( ( rule__CalculationTemplate__Group_14__0 )* )
            // InternalPagos.g:4902:2: ( rule__CalculationTemplate__Group_14__0 )*
            {
             before(grammarAccess.getCalculationTemplateAccess().getGroup_14()); 
            // InternalPagos.g:4903:2: ( rule__CalculationTemplate__Group_14__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPagos.g:4903:3: rule__CalculationTemplate__Group_14__0
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
    // InternalPagos.g:4911:1: rule__CalculationTemplate__Group__15 : rule__CalculationTemplate__Group__15__Impl rule__CalculationTemplate__Group__16 ;
    public final void rule__CalculationTemplate__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4915:1: ( rule__CalculationTemplate__Group__15__Impl rule__CalculationTemplate__Group__16 )
            // InternalPagos.g:4916:2: rule__CalculationTemplate__Group__15__Impl rule__CalculationTemplate__Group__16
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
    // InternalPagos.g:4923:1: rule__CalculationTemplate__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__CalculationTemplate__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4927:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:4928:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:4928:1: ( RULE_RBRACKET )
            // InternalPagos.g:4929:2: RULE_RBRACKET
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
    // InternalPagos.g:4938:1: rule__CalculationTemplate__Group__16 : rule__CalculationTemplate__Group__16__Impl rule__CalculationTemplate__Group__17 ;
    public final void rule__CalculationTemplate__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4942:1: ( rule__CalculationTemplate__Group__16__Impl rule__CalculationTemplate__Group__17 )
            // InternalPagos.g:4943:2: rule__CalculationTemplate__Group__16__Impl rule__CalculationTemplate__Group__17
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
    // InternalPagos.g:4950:1: rule__CalculationTemplate__Group__16__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4954:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4955:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4955:1: ( RULE_COMMA )
            // InternalPagos.g:4956:2: RULE_COMMA
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
    // InternalPagos.g:4965:1: rule__CalculationTemplate__Group__17 : rule__CalculationTemplate__Group__17__Impl rule__CalculationTemplate__Group__18 ;
    public final void rule__CalculationTemplate__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4969:1: ( rule__CalculationTemplate__Group__17__Impl rule__CalculationTemplate__Group__18 )
            // InternalPagos.g:4970:2: rule__CalculationTemplate__Group__17__Impl rule__CalculationTemplate__Group__18
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
    // InternalPagos.g:4977:1: rule__CalculationTemplate__Group__17__Impl : ( 'calculationrules' ) ;
    public final void rule__CalculationTemplate__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4981:1: ( ( 'calculationrules' ) )
            // InternalPagos.g:4982:1: ( 'calculationrules' )
            {
            // InternalPagos.g:4982:1: ( 'calculationrules' )
            // InternalPagos.g:4983:2: 'calculationrules'
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
    // InternalPagos.g:4992:1: rule__CalculationTemplate__Group__18 : rule__CalculationTemplate__Group__18__Impl rule__CalculationTemplate__Group__19 ;
    public final void rule__CalculationTemplate__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4996:1: ( rule__CalculationTemplate__Group__18__Impl rule__CalculationTemplate__Group__19 )
            // InternalPagos.g:4997:2: rule__CalculationTemplate__Group__18__Impl rule__CalculationTemplate__Group__19
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
    // InternalPagos.g:5004:1: rule__CalculationTemplate__Group__18__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5008:1: ( ( RULE_COLON ) )
            // InternalPagos.g:5009:1: ( RULE_COLON )
            {
            // InternalPagos.g:5009:1: ( RULE_COLON )
            // InternalPagos.g:5010:2: RULE_COLON
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
    // InternalPagos.g:5019:1: rule__CalculationTemplate__Group__19 : rule__CalculationTemplate__Group__19__Impl rule__CalculationTemplate__Group__20 ;
    public final void rule__CalculationTemplate__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5023:1: ( rule__CalculationTemplate__Group__19__Impl rule__CalculationTemplate__Group__20 )
            // InternalPagos.g:5024:2: rule__CalculationTemplate__Group__19__Impl rule__CalculationTemplate__Group__20
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
    // InternalPagos.g:5031:1: rule__CalculationTemplate__Group__19__Impl : ( ( rule__CalculationTemplate__FormulaAssignment_19 ) ) ;
    public final void rule__CalculationTemplate__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5035:1: ( ( ( rule__CalculationTemplate__FormulaAssignment_19 ) ) )
            // InternalPagos.g:5036:1: ( ( rule__CalculationTemplate__FormulaAssignment_19 ) )
            {
            // InternalPagos.g:5036:1: ( ( rule__CalculationTemplate__FormulaAssignment_19 ) )
            // InternalPagos.g:5037:2: ( rule__CalculationTemplate__FormulaAssignment_19 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getFormulaAssignment_19()); 
            // InternalPagos.g:5038:2: ( rule__CalculationTemplate__FormulaAssignment_19 )
            // InternalPagos.g:5038:3: rule__CalculationTemplate__FormulaAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__CalculationTemplate__FormulaAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getCalculationTemplateAccess().getFormulaAssignment_19()); 

            }


            }

        }
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
    // InternalPagos.g:5046:1: rule__CalculationTemplate__Group__20 : rule__CalculationTemplate__Group__20__Impl ;
    public final void rule__CalculationTemplate__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5050:1: ( rule__CalculationTemplate__Group__20__Impl )
            // InternalPagos.g:5051:2: rule__CalculationTemplate__Group__20__Impl
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
    // InternalPagos.g:5057:1: rule__CalculationTemplate__Group__20__Impl : ( RULE_RBRACE ) ;
    public final void rule__CalculationTemplate__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5061:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:5062:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:5062:1: ( RULE_RBRACE )
            // InternalPagos.g:5063:2: RULE_RBRACE
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
    // InternalPagos.g:5073:1: rule__CalculationTemplate__Group_14__0 : rule__CalculationTemplate__Group_14__0__Impl rule__CalculationTemplate__Group_14__1 ;
    public final void rule__CalculationTemplate__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5077:1: ( rule__CalculationTemplate__Group_14__0__Impl rule__CalculationTemplate__Group_14__1 )
            // InternalPagos.g:5078:2: rule__CalculationTemplate__Group_14__0__Impl rule__CalculationTemplate__Group_14__1
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
    // InternalPagos.g:5085:1: rule__CalculationTemplate__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5089:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:5090:1: ( RULE_COMMA )
            {
            // InternalPagos.g:5090:1: ( RULE_COMMA )
            // InternalPagos.g:5091:2: RULE_COMMA
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
    // InternalPagos.g:5100:1: rule__CalculationTemplate__Group_14__1 : rule__CalculationTemplate__Group_14__1__Impl ;
    public final void rule__CalculationTemplate__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5104:1: ( rule__CalculationTemplate__Group_14__1__Impl )
            // InternalPagos.g:5105:2: rule__CalculationTemplate__Group_14__1__Impl
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
    // InternalPagos.g:5111:1: rule__CalculationTemplate__Group_14__1__Impl : ( ( rule__CalculationTemplate__AttListsAssignment_14_1 ) ) ;
    public final void rule__CalculationTemplate__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5115:1: ( ( ( rule__CalculationTemplate__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:5116:1: ( ( rule__CalculationTemplate__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:5116:1: ( ( rule__CalculationTemplate__AttListsAssignment_14_1 ) )
            // InternalPagos.g:5117:2: ( rule__CalculationTemplate__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:5118:2: ( rule__CalculationTemplate__AttListsAssignment_14_1 )
            // InternalPagos.g:5118:3: rule__CalculationTemplate__AttListsAssignment_14_1
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
    // InternalPagos.g:5127:1: rule__Formula__Group_0__0 : rule__Formula__Group_0__0__Impl rule__Formula__Group_0__1 ;
    public final void rule__Formula__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5131:1: ( rule__Formula__Group_0__0__Impl rule__Formula__Group_0__1 )
            // InternalPagos.g:5132:2: rule__Formula__Group_0__0__Impl rule__Formula__Group_0__1
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
    // InternalPagos.g:5139:1: rule__Formula__Group_0__0__Impl : ( () ) ;
    public final void rule__Formula__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5143:1: ( ( () ) )
            // InternalPagos.g:5144:1: ( () )
            {
            // InternalPagos.g:5144:1: ( () )
            // InternalPagos.g:5145:2: ()
            {
             before(grammarAccess.getFormulaAccess().getFormulaAction_0_0()); 
            // InternalPagos.g:5146:2: ()
            // InternalPagos.g:5146:3: 
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
    // InternalPagos.g:5154:1: rule__Formula__Group_0__1 : rule__Formula__Group_0__1__Impl ;
    public final void rule__Formula__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5158:1: ( rule__Formula__Group_0__1__Impl )
            // InternalPagos.g:5159:2: rule__Formula__Group_0__1__Impl
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
    // InternalPagos.g:5165:1: rule__Formula__Group_0__1__Impl : ( ( rule__Formula__FormulaBodyAssignment_0_1 )* ) ;
    public final void rule__Formula__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5169:1: ( ( ( rule__Formula__FormulaBodyAssignment_0_1 )* ) )
            // InternalPagos.g:5170:1: ( ( rule__Formula__FormulaBodyAssignment_0_1 )* )
            {
            // InternalPagos.g:5170:1: ( ( rule__Formula__FormulaBodyAssignment_0_1 )* )
            // InternalPagos.g:5171:2: ( rule__Formula__FormulaBodyAssignment_0_1 )*
            {
             before(grammarAccess.getFormulaAccess().getFormulaBodyAssignment_0_1()); 
            // InternalPagos.g:5172:2: ( rule__Formula__FormulaBodyAssignment_0_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_IF) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPagos.g:5172:3: rule__Formula__FormulaBodyAssignment_0_1
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
    // InternalPagos.g:5181:1: rule__IfBlock__Group__0 : rule__IfBlock__Group__0__Impl rule__IfBlock__Group__1 ;
    public final void rule__IfBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5185:1: ( rule__IfBlock__Group__0__Impl rule__IfBlock__Group__1 )
            // InternalPagos.g:5186:2: rule__IfBlock__Group__0__Impl rule__IfBlock__Group__1
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
    // InternalPagos.g:5193:1: rule__IfBlock__Group__0__Impl : ( () ) ;
    public final void rule__IfBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5197:1: ( ( () ) )
            // InternalPagos.g:5198:1: ( () )
            {
            // InternalPagos.g:5198:1: ( () )
            // InternalPagos.g:5199:2: ()
            {
             before(grammarAccess.getIfBlockAccess().getIfBlockAction_0()); 
            // InternalPagos.g:5200:2: ()
            // InternalPagos.g:5200:3: 
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
    // InternalPagos.g:5208:1: rule__IfBlock__Group__1 : rule__IfBlock__Group__1__Impl rule__IfBlock__Group__2 ;
    public final void rule__IfBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5212:1: ( rule__IfBlock__Group__1__Impl rule__IfBlock__Group__2 )
            // InternalPagos.g:5213:2: rule__IfBlock__Group__1__Impl rule__IfBlock__Group__2
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
    // InternalPagos.g:5220:1: rule__IfBlock__Group__1__Impl : ( ( rule__IfBlock__IfSentenceAssignment_1 ) ) ;
    public final void rule__IfBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5224:1: ( ( ( rule__IfBlock__IfSentenceAssignment_1 ) ) )
            // InternalPagos.g:5225:1: ( ( rule__IfBlock__IfSentenceAssignment_1 ) )
            {
            // InternalPagos.g:5225:1: ( ( rule__IfBlock__IfSentenceAssignment_1 ) )
            // InternalPagos.g:5226:2: ( rule__IfBlock__IfSentenceAssignment_1 )
            {
             before(grammarAccess.getIfBlockAccess().getIfSentenceAssignment_1()); 
            // InternalPagos.g:5227:2: ( rule__IfBlock__IfSentenceAssignment_1 )
            // InternalPagos.g:5227:3: rule__IfBlock__IfSentenceAssignment_1
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
    // InternalPagos.g:5235:1: rule__IfBlock__Group__2 : rule__IfBlock__Group__2__Impl ;
    public final void rule__IfBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5239:1: ( rule__IfBlock__Group__2__Impl )
            // InternalPagos.g:5240:2: rule__IfBlock__Group__2__Impl
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
    // InternalPagos.g:5246:1: rule__IfBlock__Group__2__Impl : ( ( rule__IfBlock__Group_2__0 )? ) ;
    public final void rule__IfBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5250:1: ( ( ( rule__IfBlock__Group_2__0 )? ) )
            // InternalPagos.g:5251:1: ( ( rule__IfBlock__Group_2__0 )? )
            {
            // InternalPagos.g:5251:1: ( ( rule__IfBlock__Group_2__0 )? )
            // InternalPagos.g:5252:2: ( rule__IfBlock__Group_2__0 )?
            {
             before(grammarAccess.getIfBlockAccess().getGroup_2()); 
            // InternalPagos.g:5253:2: ( rule__IfBlock__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ELSE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPagos.g:5253:3: rule__IfBlock__Group_2__0
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
    // InternalPagos.g:5262:1: rule__IfBlock__Group_2__0 : rule__IfBlock__Group_2__0__Impl rule__IfBlock__Group_2__1 ;
    public final void rule__IfBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5266:1: ( rule__IfBlock__Group_2__0__Impl rule__IfBlock__Group_2__1 )
            // InternalPagos.g:5267:2: rule__IfBlock__Group_2__0__Impl rule__IfBlock__Group_2__1
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
    // InternalPagos.g:5274:1: rule__IfBlock__Group_2__0__Impl : ( RULE_ELSE ) ;
    public final void rule__IfBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5278:1: ( ( RULE_ELSE ) )
            // InternalPagos.g:5279:1: ( RULE_ELSE )
            {
            // InternalPagos.g:5279:1: ( RULE_ELSE )
            // InternalPagos.g:5280:2: RULE_ELSE
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
    // InternalPagos.g:5289:1: rule__IfBlock__Group_2__1 : rule__IfBlock__Group_2__1__Impl ;
    public final void rule__IfBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5293:1: ( rule__IfBlock__Group_2__1__Impl )
            // InternalPagos.g:5294:2: rule__IfBlock__Group_2__1__Impl
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
    // InternalPagos.g:5300:1: rule__IfBlock__Group_2__1__Impl : ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) ) ;
    public final void rule__IfBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5304:1: ( ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) ) )
            // InternalPagos.g:5305:1: ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) )
            {
            // InternalPagos.g:5305:1: ( ( rule__IfBlock__ElseSentenceAssignment_2_1 ) )
            // InternalPagos.g:5306:2: ( rule__IfBlock__ElseSentenceAssignment_2_1 )
            {
             before(grammarAccess.getIfBlockAccess().getElseSentenceAssignment_2_1()); 
            // InternalPagos.g:5307:2: ( rule__IfBlock__ElseSentenceAssignment_2_1 )
            // InternalPagos.g:5307:3: rule__IfBlock__ElseSentenceAssignment_2_1
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
    // InternalPagos.g:5316:1: rule__IfCondition__Group__0 : rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1 ;
    public final void rule__IfCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5320:1: ( rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1 )
            // InternalPagos.g:5321:2: rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1
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
    // InternalPagos.g:5328:1: rule__IfCondition__Group__0__Impl : ( () ) ;
    public final void rule__IfCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5332:1: ( ( () ) )
            // InternalPagos.g:5333:1: ( () )
            {
            // InternalPagos.g:5333:1: ( () )
            // InternalPagos.g:5334:2: ()
            {
             before(grammarAccess.getIfConditionAccess().getIfConditionAction_0()); 
            // InternalPagos.g:5335:2: ()
            // InternalPagos.g:5335:3: 
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
    // InternalPagos.g:5343:1: rule__IfCondition__Group__1 : rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2 ;
    public final void rule__IfCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5347:1: ( rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2 )
            // InternalPagos.g:5348:2: rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2
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
    // InternalPagos.g:5355:1: rule__IfCondition__Group__1__Impl : ( RULE_IF ) ;
    public final void rule__IfCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5359:1: ( ( RULE_IF ) )
            // InternalPagos.g:5360:1: ( RULE_IF )
            {
            // InternalPagos.g:5360:1: ( RULE_IF )
            // InternalPagos.g:5361:2: RULE_IF
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
    // InternalPagos.g:5370:1: rule__IfCondition__Group__2 : rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3 ;
    public final void rule__IfCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5374:1: ( rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3 )
            // InternalPagos.g:5375:2: rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3
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
    // InternalPagos.g:5382:1: rule__IfCondition__Group__2__Impl : ( RULE_LBRACKET ) ;
    public final void rule__IfCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5386:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:5387:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:5387:1: ( RULE_LBRACKET )
            // InternalPagos.g:5388:2: RULE_LBRACKET
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
    // InternalPagos.g:5397:1: rule__IfCondition__Group__3 : rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4 ;
    public final void rule__IfCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5401:1: ( rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4 )
            // InternalPagos.g:5402:2: rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4
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
    // InternalPagos.g:5409:1: rule__IfCondition__Group__3__Impl : ( ( rule__IfCondition__LogExpAssignment_3 ) ) ;
    public final void rule__IfCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5413:1: ( ( ( rule__IfCondition__LogExpAssignment_3 ) ) )
            // InternalPagos.g:5414:1: ( ( rule__IfCondition__LogExpAssignment_3 ) )
            {
            // InternalPagos.g:5414:1: ( ( rule__IfCondition__LogExpAssignment_3 ) )
            // InternalPagos.g:5415:2: ( rule__IfCondition__LogExpAssignment_3 )
            {
             before(grammarAccess.getIfConditionAccess().getLogExpAssignment_3()); 
            // InternalPagos.g:5416:2: ( rule__IfCondition__LogExpAssignment_3 )
            // InternalPagos.g:5416:3: rule__IfCondition__LogExpAssignment_3
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
    // InternalPagos.g:5424:1: rule__IfCondition__Group__4 : rule__IfCondition__Group__4__Impl rule__IfCondition__Group__5 ;
    public final void rule__IfCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5428:1: ( rule__IfCondition__Group__4__Impl rule__IfCondition__Group__5 )
            // InternalPagos.g:5429:2: rule__IfCondition__Group__4__Impl rule__IfCondition__Group__5
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
    // InternalPagos.g:5436:1: rule__IfCondition__Group__4__Impl : ( RULE_RBRACKET ) ;
    public final void rule__IfCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5440:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:5441:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:5441:1: ( RULE_RBRACKET )
            // InternalPagos.g:5442:2: RULE_RBRACKET
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
    // InternalPagos.g:5451:1: rule__IfCondition__Group__5 : rule__IfCondition__Group__5__Impl rule__IfCondition__Group__6 ;
    public final void rule__IfCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5455:1: ( rule__IfCondition__Group__5__Impl rule__IfCondition__Group__6 )
            // InternalPagos.g:5456:2: rule__IfCondition__Group__5__Impl rule__IfCondition__Group__6
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
    // InternalPagos.g:5463:1: rule__IfCondition__Group__5__Impl : ( RULE_THEN ) ;
    public final void rule__IfCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5467:1: ( ( RULE_THEN ) )
            // InternalPagos.g:5468:1: ( RULE_THEN )
            {
            // InternalPagos.g:5468:1: ( RULE_THEN )
            // InternalPagos.g:5469:2: RULE_THEN
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
    // InternalPagos.g:5478:1: rule__IfCondition__Group__6 : rule__IfCondition__Group__6__Impl rule__IfCondition__Group__7 ;
    public final void rule__IfCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5482:1: ( rule__IfCondition__Group__6__Impl rule__IfCondition__Group__7 )
            // InternalPagos.g:5483:2: rule__IfCondition__Group__6__Impl rule__IfCondition__Group__7
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
    // InternalPagos.g:5490:1: rule__IfCondition__Group__6__Impl : ( RULE_LBRACE ) ;
    public final void rule__IfCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5494:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:5495:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:5495:1: ( RULE_LBRACE )
            // InternalPagos.g:5496:2: RULE_LBRACE
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
    // InternalPagos.g:5505:1: rule__IfCondition__Group__7 : rule__IfCondition__Group__7__Impl rule__IfCondition__Group__8 ;
    public final void rule__IfCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5509:1: ( rule__IfCondition__Group__7__Impl rule__IfCondition__Group__8 )
            // InternalPagos.g:5510:2: rule__IfCondition__Group__7__Impl rule__IfCondition__Group__8
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
    // InternalPagos.g:5517:1: rule__IfCondition__Group__7__Impl : ( RULE_RETURN ) ;
    public final void rule__IfCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5521:1: ( ( RULE_RETURN ) )
            // InternalPagos.g:5522:1: ( RULE_RETURN )
            {
            // InternalPagos.g:5522:1: ( RULE_RETURN )
            // InternalPagos.g:5523:2: RULE_RETURN
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
    // InternalPagos.g:5532:1: rule__IfCondition__Group__8 : rule__IfCondition__Group__8__Impl rule__IfCondition__Group__9 ;
    public final void rule__IfCondition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5536:1: ( rule__IfCondition__Group__8__Impl rule__IfCondition__Group__9 )
            // InternalPagos.g:5537:2: rule__IfCondition__Group__8__Impl rule__IfCondition__Group__9
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
    // InternalPagos.g:5544:1: rule__IfCondition__Group__8__Impl : ( RULE_COLON ) ;
    public final void rule__IfCondition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5548:1: ( ( RULE_COLON ) )
            // InternalPagos.g:5549:1: ( RULE_COLON )
            {
            // InternalPagos.g:5549:1: ( RULE_COLON )
            // InternalPagos.g:5550:2: RULE_COLON
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
    // InternalPagos.g:5559:1: rule__IfCondition__Group__9 : rule__IfCondition__Group__9__Impl rule__IfCondition__Group__10 ;
    public final void rule__IfCondition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5563:1: ( rule__IfCondition__Group__9__Impl rule__IfCondition__Group__10 )
            // InternalPagos.g:5564:2: rule__IfCondition__Group__9__Impl rule__IfCondition__Group__10
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
    // InternalPagos.g:5571:1: rule__IfCondition__Group__9__Impl : ( ( rule__IfCondition__ExpressionAssignment_9 ) ) ;
    public final void rule__IfCondition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5575:1: ( ( ( rule__IfCondition__ExpressionAssignment_9 ) ) )
            // InternalPagos.g:5576:1: ( ( rule__IfCondition__ExpressionAssignment_9 ) )
            {
            // InternalPagos.g:5576:1: ( ( rule__IfCondition__ExpressionAssignment_9 ) )
            // InternalPagos.g:5577:2: ( rule__IfCondition__ExpressionAssignment_9 )
            {
             before(grammarAccess.getIfConditionAccess().getExpressionAssignment_9()); 
            // InternalPagos.g:5578:2: ( rule__IfCondition__ExpressionAssignment_9 )
            // InternalPagos.g:5578:3: rule__IfCondition__ExpressionAssignment_9
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
    // InternalPagos.g:5586:1: rule__IfCondition__Group__10 : rule__IfCondition__Group__10__Impl ;
    public final void rule__IfCondition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5590:1: ( rule__IfCondition__Group__10__Impl )
            // InternalPagos.g:5591:2: rule__IfCondition__Group__10__Impl
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
    // InternalPagos.g:5597:1: rule__IfCondition__Group__10__Impl : ( RULE_RBRACE ) ;
    public final void rule__IfCondition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5601:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:5602:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:5602:1: ( RULE_RBRACE )
            // InternalPagos.g:5603:2: RULE_RBRACE
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
    // InternalPagos.g:5613:1: rule__ElseSegment__Group__0 : rule__ElseSegment__Group__0__Impl rule__ElseSegment__Group__1 ;
    public final void rule__ElseSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5617:1: ( rule__ElseSegment__Group__0__Impl rule__ElseSegment__Group__1 )
            // InternalPagos.g:5618:2: rule__ElseSegment__Group__0__Impl rule__ElseSegment__Group__1
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
    // InternalPagos.g:5625:1: rule__ElseSegment__Group__0__Impl : ( () ) ;
    public final void rule__ElseSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5629:1: ( ( () ) )
            // InternalPagos.g:5630:1: ( () )
            {
            // InternalPagos.g:5630:1: ( () )
            // InternalPagos.g:5631:2: ()
            {
             before(grammarAccess.getElseSegmentAccess().getElseSegmentAction_0()); 
            // InternalPagos.g:5632:2: ()
            // InternalPagos.g:5632:3: 
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
    // InternalPagos.g:5640:1: rule__ElseSegment__Group__1 : rule__ElseSegment__Group__1__Impl rule__ElseSegment__Group__2 ;
    public final void rule__ElseSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5644:1: ( rule__ElseSegment__Group__1__Impl rule__ElseSegment__Group__2 )
            // InternalPagos.g:5645:2: rule__ElseSegment__Group__1__Impl rule__ElseSegment__Group__2
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
    // InternalPagos.g:5652:1: rule__ElseSegment__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__ElseSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5656:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:5657:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:5657:1: ( RULE_LBRACE )
            // InternalPagos.g:5658:2: RULE_LBRACE
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
    // InternalPagos.g:5667:1: rule__ElseSegment__Group__2 : rule__ElseSegment__Group__2__Impl rule__ElseSegment__Group__3 ;
    public final void rule__ElseSegment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5671:1: ( rule__ElseSegment__Group__2__Impl rule__ElseSegment__Group__3 )
            // InternalPagos.g:5672:2: rule__ElseSegment__Group__2__Impl rule__ElseSegment__Group__3
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
    // InternalPagos.g:5679:1: rule__ElseSegment__Group__2__Impl : ( ( rule__ElseSegment__IfSentenceAssignment_2 ) ) ;
    public final void rule__ElseSegment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5683:1: ( ( ( rule__ElseSegment__IfSentenceAssignment_2 ) ) )
            // InternalPagos.g:5684:1: ( ( rule__ElseSegment__IfSentenceAssignment_2 ) )
            {
            // InternalPagos.g:5684:1: ( ( rule__ElseSegment__IfSentenceAssignment_2 ) )
            // InternalPagos.g:5685:2: ( rule__ElseSegment__IfSentenceAssignment_2 )
            {
             before(grammarAccess.getElseSegmentAccess().getIfSentenceAssignment_2()); 
            // InternalPagos.g:5686:2: ( rule__ElseSegment__IfSentenceAssignment_2 )
            // InternalPagos.g:5686:3: rule__ElseSegment__IfSentenceAssignment_2
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
    // InternalPagos.g:5694:1: rule__ElseSegment__Group__3 : rule__ElseSegment__Group__3__Impl ;
    public final void rule__ElseSegment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5698:1: ( rule__ElseSegment__Group__3__Impl )
            // InternalPagos.g:5699:2: rule__ElseSegment__Group__3__Impl
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
    // InternalPagos.g:5705:1: rule__ElseSegment__Group__3__Impl : ( RULE_RBRACE ) ;
    public final void rule__ElseSegment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5709:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:5710:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:5710:1: ( RULE_RBRACE )
            // InternalPagos.g:5711:2: RULE_RBRACE
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
    // InternalPagos.g:5721:1: rule__ReturnBlock__Group__0 : rule__ReturnBlock__Group__0__Impl rule__ReturnBlock__Group__1 ;
    public final void rule__ReturnBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5725:1: ( rule__ReturnBlock__Group__0__Impl rule__ReturnBlock__Group__1 )
            // InternalPagos.g:5726:2: rule__ReturnBlock__Group__0__Impl rule__ReturnBlock__Group__1
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
    // InternalPagos.g:5733:1: rule__ReturnBlock__Group__0__Impl : ( () ) ;
    public final void rule__ReturnBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5737:1: ( ( () ) )
            // InternalPagos.g:5738:1: ( () )
            {
            // InternalPagos.g:5738:1: ( () )
            // InternalPagos.g:5739:2: ()
            {
             before(grammarAccess.getReturnBlockAccess().getReturnBlockAction_0()); 
            // InternalPagos.g:5740:2: ()
            // InternalPagos.g:5740:3: 
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
    // InternalPagos.g:5748:1: rule__ReturnBlock__Group__1 : rule__ReturnBlock__Group__1__Impl rule__ReturnBlock__Group__2 ;
    public final void rule__ReturnBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5752:1: ( rule__ReturnBlock__Group__1__Impl rule__ReturnBlock__Group__2 )
            // InternalPagos.g:5753:2: rule__ReturnBlock__Group__1__Impl rule__ReturnBlock__Group__2
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
    // InternalPagos.g:5760:1: rule__ReturnBlock__Group__1__Impl : ( RULE_RETURN ) ;
    public final void rule__ReturnBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5764:1: ( ( RULE_RETURN ) )
            // InternalPagos.g:5765:1: ( RULE_RETURN )
            {
            // InternalPagos.g:5765:1: ( RULE_RETURN )
            // InternalPagos.g:5766:2: RULE_RETURN
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
    // InternalPagos.g:5775:1: rule__ReturnBlock__Group__2 : rule__ReturnBlock__Group__2__Impl rule__ReturnBlock__Group__3 ;
    public final void rule__ReturnBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5779:1: ( rule__ReturnBlock__Group__2__Impl rule__ReturnBlock__Group__3 )
            // InternalPagos.g:5780:2: rule__ReturnBlock__Group__2__Impl rule__ReturnBlock__Group__3
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
    // InternalPagos.g:5787:1: rule__ReturnBlock__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__ReturnBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5791:1: ( ( RULE_COLON ) )
            // InternalPagos.g:5792:1: ( RULE_COLON )
            {
            // InternalPagos.g:5792:1: ( RULE_COLON )
            // InternalPagos.g:5793:2: RULE_COLON
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
    // InternalPagos.g:5802:1: rule__ReturnBlock__Group__3 : rule__ReturnBlock__Group__3__Impl ;
    public final void rule__ReturnBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5806:1: ( rule__ReturnBlock__Group__3__Impl )
            // InternalPagos.g:5807:2: rule__ReturnBlock__Group__3__Impl
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
    // InternalPagos.g:5813:1: rule__ReturnBlock__Group__3__Impl : ( ( rule__ReturnBlock__ExpressionAssignment_3 ) ) ;
    public final void rule__ReturnBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5817:1: ( ( ( rule__ReturnBlock__ExpressionAssignment_3 ) ) )
            // InternalPagos.g:5818:1: ( ( rule__ReturnBlock__ExpressionAssignment_3 ) )
            {
            // InternalPagos.g:5818:1: ( ( rule__ReturnBlock__ExpressionAssignment_3 ) )
            // InternalPagos.g:5819:2: ( rule__ReturnBlock__ExpressionAssignment_3 )
            {
             before(grammarAccess.getReturnBlockAccess().getExpressionAssignment_3()); 
            // InternalPagos.g:5820:2: ( rule__ReturnBlock__ExpressionAssignment_3 )
            // InternalPagos.g:5820:3: rule__ReturnBlock__ExpressionAssignment_3
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
    // InternalPagos.g:5829:1: rule__ExpresionLogica__Group__0 : rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 ;
    public final void rule__ExpresionLogica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5833:1: ( rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 )
            // InternalPagos.g:5834:2: rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1
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
    // InternalPagos.g:5841:1: rule__ExpresionLogica__Group__0__Impl : ( ( rule__ExpresionLogica__VariableAssignment_0 ) ) ;
    public final void rule__ExpresionLogica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5845:1: ( ( ( rule__ExpresionLogica__VariableAssignment_0 ) ) )
            // InternalPagos.g:5846:1: ( ( rule__ExpresionLogica__VariableAssignment_0 ) )
            {
            // InternalPagos.g:5846:1: ( ( rule__ExpresionLogica__VariableAssignment_0 ) )
            // InternalPagos.g:5847:2: ( rule__ExpresionLogica__VariableAssignment_0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getVariableAssignment_0()); 
            // InternalPagos.g:5848:2: ( rule__ExpresionLogica__VariableAssignment_0 )
            // InternalPagos.g:5848:3: rule__ExpresionLogica__VariableAssignment_0
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
    // InternalPagos.g:5856:1: rule__ExpresionLogica__Group__1 : rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 ;
    public final void rule__ExpresionLogica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5860:1: ( rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 )
            // InternalPagos.g:5861:2: rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2
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
    // InternalPagos.g:5868:1: rule__ExpresionLogica__Group__1__Impl : ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) ) ;
    public final void rule__ExpresionLogica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5872:1: ( ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) ) )
            // InternalPagos.g:5873:1: ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) )
            {
            // InternalPagos.g:5873:1: ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) )
            // InternalPagos.g:5874:2: ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* )
            {
            // InternalPagos.g:5874:2: ( ( rule__ExpresionLogica__Group_1__0 ) )
            // InternalPagos.g:5875:3: ( rule__ExpresionLogica__Group_1__0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 
            // InternalPagos.g:5876:3: ( rule__ExpresionLogica__Group_1__0 )
            // InternalPagos.g:5876:4: rule__ExpresionLogica__Group_1__0
            {
            pushFollow(FOLLOW_35);
            rule__ExpresionLogica__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 

            }

            // InternalPagos.g:5879:2: ( ( rule__ExpresionLogica__Group_1__0 )* )
            // InternalPagos.g:5880:3: ( rule__ExpresionLogica__Group_1__0 )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 
            // InternalPagos.g:5881:3: ( rule__ExpresionLogica__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_OPERADORLOGICO) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPagos.g:5881:4: rule__ExpresionLogica__Group_1__0
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
    // InternalPagos.g:5890:1: rule__ExpresionLogica__Group__2 : rule__ExpresionLogica__Group__2__Impl ;
    public final void rule__ExpresionLogica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5894:1: ( rule__ExpresionLogica__Group__2__Impl )
            // InternalPagos.g:5895:2: rule__ExpresionLogica__Group__2__Impl
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
    // InternalPagos.g:5901:1: rule__ExpresionLogica__Group__2__Impl : ( ( rule__ExpresionLogica__Group_2__0 )? ) ;
    public final void rule__ExpresionLogica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5905:1: ( ( ( rule__ExpresionLogica__Group_2__0 )? ) )
            // InternalPagos.g:5906:1: ( ( rule__ExpresionLogica__Group_2__0 )? )
            {
            // InternalPagos.g:5906:1: ( ( rule__ExpresionLogica__Group_2__0 )? )
            // InternalPagos.g:5907:2: ( rule__ExpresionLogica__Group_2__0 )?
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_2()); 
            // InternalPagos.g:5908:2: ( rule__ExpresionLogica__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_LOGICALCONN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPagos.g:5908:3: rule__ExpresionLogica__Group_2__0
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
    // InternalPagos.g:5917:1: rule__ExpresionLogica__Group_1__0 : rule__ExpresionLogica__Group_1__0__Impl rule__ExpresionLogica__Group_1__1 ;
    public final void rule__ExpresionLogica__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5921:1: ( rule__ExpresionLogica__Group_1__0__Impl rule__ExpresionLogica__Group_1__1 )
            // InternalPagos.g:5922:2: rule__ExpresionLogica__Group_1__0__Impl rule__ExpresionLogica__Group_1__1
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
    // InternalPagos.g:5929:1: rule__ExpresionLogica__Group_1__0__Impl : ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) ) ;
    public final void rule__ExpresionLogica__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5933:1: ( ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) ) )
            // InternalPagos.g:5934:1: ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) )
            {
            // InternalPagos.g:5934:1: ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) )
            // InternalPagos.g:5935:2: ( rule__ExpresionLogica__LogOperAssignment_1_0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getLogOperAssignment_1_0()); 
            // InternalPagos.g:5936:2: ( rule__ExpresionLogica__LogOperAssignment_1_0 )
            // InternalPagos.g:5936:3: rule__ExpresionLogica__LogOperAssignment_1_0
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
    // InternalPagos.g:5944:1: rule__ExpresionLogica__Group_1__1 : rule__ExpresionLogica__Group_1__1__Impl ;
    public final void rule__ExpresionLogica__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5948:1: ( rule__ExpresionLogica__Group_1__1__Impl )
            // InternalPagos.g:5949:2: rule__ExpresionLogica__Group_1__1__Impl
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
    // InternalPagos.g:5955:1: rule__ExpresionLogica__Group_1__1__Impl : ( ( rule__ExpresionLogica__Alternatives_1_1 ) ) ;
    public final void rule__ExpresionLogica__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5959:1: ( ( ( rule__ExpresionLogica__Alternatives_1_1 ) ) )
            // InternalPagos.g:5960:1: ( ( rule__ExpresionLogica__Alternatives_1_1 ) )
            {
            // InternalPagos.g:5960:1: ( ( rule__ExpresionLogica__Alternatives_1_1 ) )
            // InternalPagos.g:5961:2: ( rule__ExpresionLogica__Alternatives_1_1 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getAlternatives_1_1()); 
            // InternalPagos.g:5962:2: ( rule__ExpresionLogica__Alternatives_1_1 )
            // InternalPagos.g:5962:3: rule__ExpresionLogica__Alternatives_1_1
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
    // InternalPagos.g:5971:1: rule__ExpresionLogica__Group_2__0 : rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1 ;
    public final void rule__ExpresionLogica__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5975:1: ( rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1 )
            // InternalPagos.g:5976:2: rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1
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
    // InternalPagos.g:5983:1: rule__ExpresionLogica__Group_2__0__Impl : ( RULE_LOGICALCONN ) ;
    public final void rule__ExpresionLogica__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5987:1: ( ( RULE_LOGICALCONN ) )
            // InternalPagos.g:5988:1: ( RULE_LOGICALCONN )
            {
            // InternalPagos.g:5988:1: ( RULE_LOGICALCONN )
            // InternalPagos.g:5989:2: RULE_LOGICALCONN
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
    // InternalPagos.g:5998:1: rule__ExpresionLogica__Group_2__1 : rule__ExpresionLogica__Group_2__1__Impl ;
    public final void rule__ExpresionLogica__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6002:1: ( rule__ExpresionLogica__Group_2__1__Impl )
            // InternalPagos.g:6003:2: rule__ExpresionLogica__Group_2__1__Impl
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
    // InternalPagos.g:6009:1: rule__ExpresionLogica__Group_2__1__Impl : ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) ) ;
    public final void rule__ExpresionLogica__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6013:1: ( ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) ) )
            // InternalPagos.g:6014:1: ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) )
            {
            // InternalPagos.g:6014:1: ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) )
            // InternalPagos.g:6015:2: ( rule__ExpresionLogica__ExpAssignment_2_1 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getExpAssignment_2_1()); 
            // InternalPagos.g:6016:2: ( rule__ExpresionLogica__ExpAssignment_2_1 )
            // InternalPagos.g:6016:3: rule__ExpresionLogica__ExpAssignment_2_1
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
    // InternalPagos.g:6025:1: rule__Adicion__Group__0 : rule__Adicion__Group__0__Impl rule__Adicion__Group__1 ;
    public final void rule__Adicion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6029:1: ( rule__Adicion__Group__0__Impl rule__Adicion__Group__1 )
            // InternalPagos.g:6030:2: rule__Adicion__Group__0__Impl rule__Adicion__Group__1
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
    // InternalPagos.g:6037:1: rule__Adicion__Group__0__Impl : ( ruleMultiplicacion ) ;
    public final void rule__Adicion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6041:1: ( ( ruleMultiplicacion ) )
            // InternalPagos.g:6042:1: ( ruleMultiplicacion )
            {
            // InternalPagos.g:6042:1: ( ruleMultiplicacion )
            // InternalPagos.g:6043:2: ruleMultiplicacion
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
    // InternalPagos.g:6052:1: rule__Adicion__Group__1 : rule__Adicion__Group__1__Impl ;
    public final void rule__Adicion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6056:1: ( rule__Adicion__Group__1__Impl )
            // InternalPagos.g:6057:2: rule__Adicion__Group__1__Impl
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
    // InternalPagos.g:6063:1: rule__Adicion__Group__1__Impl : ( ( rule__Adicion__Group_1__0 )* ) ;
    public final void rule__Adicion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6067:1: ( ( ( rule__Adicion__Group_1__0 )* ) )
            // InternalPagos.g:6068:1: ( ( rule__Adicion__Group_1__0 )* )
            {
            // InternalPagos.g:6068:1: ( ( rule__Adicion__Group_1__0 )* )
            // InternalPagos.g:6069:2: ( rule__Adicion__Group_1__0 )*
            {
             before(grammarAccess.getAdicionAccess().getGroup_1()); 
            // InternalPagos.g:6070:2: ( rule__Adicion__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ADDOP) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPagos.g:6070:3: rule__Adicion__Group_1__0
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
    // InternalPagos.g:6079:1: rule__Adicion__Group_1__0 : rule__Adicion__Group_1__0__Impl rule__Adicion__Group_1__1 ;
    public final void rule__Adicion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6083:1: ( rule__Adicion__Group_1__0__Impl rule__Adicion__Group_1__1 )
            // InternalPagos.g:6084:2: rule__Adicion__Group_1__0__Impl rule__Adicion__Group_1__1
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
    // InternalPagos.g:6091:1: rule__Adicion__Group_1__0__Impl : ( () ) ;
    public final void rule__Adicion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6095:1: ( ( () ) )
            // InternalPagos.g:6096:1: ( () )
            {
            // InternalPagos.g:6096:1: ( () )
            // InternalPagos.g:6097:2: ()
            {
             before(grammarAccess.getAdicionAccess().getAdicionLeftAction_1_0()); 
            // InternalPagos.g:6098:2: ()
            // InternalPagos.g:6098:3: 
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
    // InternalPagos.g:6106:1: rule__Adicion__Group_1__1 : rule__Adicion__Group_1__1__Impl rule__Adicion__Group_1__2 ;
    public final void rule__Adicion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6110:1: ( rule__Adicion__Group_1__1__Impl rule__Adicion__Group_1__2 )
            // InternalPagos.g:6111:2: rule__Adicion__Group_1__1__Impl rule__Adicion__Group_1__2
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
    // InternalPagos.g:6118:1: rule__Adicion__Group_1__1__Impl : ( ( rule__Adicion__OperatorAssignment_1_1 ) ) ;
    public final void rule__Adicion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6122:1: ( ( ( rule__Adicion__OperatorAssignment_1_1 ) ) )
            // InternalPagos.g:6123:1: ( ( rule__Adicion__OperatorAssignment_1_1 ) )
            {
            // InternalPagos.g:6123:1: ( ( rule__Adicion__OperatorAssignment_1_1 ) )
            // InternalPagos.g:6124:2: ( rule__Adicion__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdicionAccess().getOperatorAssignment_1_1()); 
            // InternalPagos.g:6125:2: ( rule__Adicion__OperatorAssignment_1_1 )
            // InternalPagos.g:6125:3: rule__Adicion__OperatorAssignment_1_1
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
    // InternalPagos.g:6133:1: rule__Adicion__Group_1__2 : rule__Adicion__Group_1__2__Impl ;
    public final void rule__Adicion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6137:1: ( rule__Adicion__Group_1__2__Impl )
            // InternalPagos.g:6138:2: rule__Adicion__Group_1__2__Impl
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
    // InternalPagos.g:6144:1: rule__Adicion__Group_1__2__Impl : ( ( rule__Adicion__RexpAssignment_1_2 ) ) ;
    public final void rule__Adicion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6148:1: ( ( ( rule__Adicion__RexpAssignment_1_2 ) ) )
            // InternalPagos.g:6149:1: ( ( rule__Adicion__RexpAssignment_1_2 ) )
            {
            // InternalPagos.g:6149:1: ( ( rule__Adicion__RexpAssignment_1_2 ) )
            // InternalPagos.g:6150:2: ( rule__Adicion__RexpAssignment_1_2 )
            {
             before(grammarAccess.getAdicionAccess().getRexpAssignment_1_2()); 
            // InternalPagos.g:6151:2: ( rule__Adicion__RexpAssignment_1_2 )
            // InternalPagos.g:6151:3: rule__Adicion__RexpAssignment_1_2
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
    // InternalPagos.g:6160:1: rule__Multiplicacion__Group__0 : rule__Multiplicacion__Group__0__Impl rule__Multiplicacion__Group__1 ;
    public final void rule__Multiplicacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6164:1: ( rule__Multiplicacion__Group__0__Impl rule__Multiplicacion__Group__1 )
            // InternalPagos.g:6165:2: rule__Multiplicacion__Group__0__Impl rule__Multiplicacion__Group__1
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
    // InternalPagos.g:6172:1: rule__Multiplicacion__Group__0__Impl : ( ruleSigleExp ) ;
    public final void rule__Multiplicacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6176:1: ( ( ruleSigleExp ) )
            // InternalPagos.g:6177:1: ( ruleSigleExp )
            {
            // InternalPagos.g:6177:1: ( ruleSigleExp )
            // InternalPagos.g:6178:2: ruleSigleExp
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
    // InternalPagos.g:6187:1: rule__Multiplicacion__Group__1 : rule__Multiplicacion__Group__1__Impl ;
    public final void rule__Multiplicacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6191:1: ( rule__Multiplicacion__Group__1__Impl )
            // InternalPagos.g:6192:2: rule__Multiplicacion__Group__1__Impl
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
    // InternalPagos.g:6198:1: rule__Multiplicacion__Group__1__Impl : ( ( rule__Multiplicacion__Group_1__0 )* ) ;
    public final void rule__Multiplicacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6202:1: ( ( ( rule__Multiplicacion__Group_1__0 )* ) )
            // InternalPagos.g:6203:1: ( ( rule__Multiplicacion__Group_1__0 )* )
            {
            // InternalPagos.g:6203:1: ( ( rule__Multiplicacion__Group_1__0 )* )
            // InternalPagos.g:6204:2: ( rule__Multiplicacion__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicacionAccess().getGroup_1()); 
            // InternalPagos.g:6205:2: ( rule__Multiplicacion__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_MULTOP) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPagos.g:6205:3: rule__Multiplicacion__Group_1__0
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
    // InternalPagos.g:6214:1: rule__Multiplicacion__Group_1__0 : rule__Multiplicacion__Group_1__0__Impl rule__Multiplicacion__Group_1__1 ;
    public final void rule__Multiplicacion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6218:1: ( rule__Multiplicacion__Group_1__0__Impl rule__Multiplicacion__Group_1__1 )
            // InternalPagos.g:6219:2: rule__Multiplicacion__Group_1__0__Impl rule__Multiplicacion__Group_1__1
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
    // InternalPagos.g:6226:1: rule__Multiplicacion__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplicacion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6230:1: ( ( () ) )
            // InternalPagos.g:6231:1: ( () )
            {
            // InternalPagos.g:6231:1: ( () )
            // InternalPagos.g:6232:2: ()
            {
             before(grammarAccess.getMultiplicacionAccess().getMultiplicacionLeftAction_1_0()); 
            // InternalPagos.g:6233:2: ()
            // InternalPagos.g:6233:3: 
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
    // InternalPagos.g:6241:1: rule__Multiplicacion__Group_1__1 : rule__Multiplicacion__Group_1__1__Impl rule__Multiplicacion__Group_1__2 ;
    public final void rule__Multiplicacion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6245:1: ( rule__Multiplicacion__Group_1__1__Impl rule__Multiplicacion__Group_1__2 )
            // InternalPagos.g:6246:2: rule__Multiplicacion__Group_1__1__Impl rule__Multiplicacion__Group_1__2
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
    // InternalPagos.g:6253:1: rule__Multiplicacion__Group_1__1__Impl : ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplicacion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6257:1: ( ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) ) )
            // InternalPagos.g:6258:1: ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) )
            {
            // InternalPagos.g:6258:1: ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) )
            // InternalPagos.g:6259:2: ( rule__Multiplicacion__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicacionAccess().getOperatorAssignment_1_1()); 
            // InternalPagos.g:6260:2: ( rule__Multiplicacion__OperatorAssignment_1_1 )
            // InternalPagos.g:6260:3: rule__Multiplicacion__OperatorAssignment_1_1
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
    // InternalPagos.g:6268:1: rule__Multiplicacion__Group_1__2 : rule__Multiplicacion__Group_1__2__Impl ;
    public final void rule__Multiplicacion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6272:1: ( rule__Multiplicacion__Group_1__2__Impl )
            // InternalPagos.g:6273:2: rule__Multiplicacion__Group_1__2__Impl
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
    // InternalPagos.g:6279:1: rule__Multiplicacion__Group_1__2__Impl : ( ( rule__Multiplicacion__RexpAssignment_1_2 ) ) ;
    public final void rule__Multiplicacion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6283:1: ( ( ( rule__Multiplicacion__RexpAssignment_1_2 ) ) )
            // InternalPagos.g:6284:1: ( ( rule__Multiplicacion__RexpAssignment_1_2 ) )
            {
            // InternalPagos.g:6284:1: ( ( rule__Multiplicacion__RexpAssignment_1_2 ) )
            // InternalPagos.g:6285:2: ( rule__Multiplicacion__RexpAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicacionAccess().getRexpAssignment_1_2()); 
            // InternalPagos.g:6286:2: ( rule__Multiplicacion__RexpAssignment_1_2 )
            // InternalPagos.g:6286:3: rule__Multiplicacion__RexpAssignment_1_2
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
    // InternalPagos.g:6295:1: rule__SigleExp__Group_1__0 : rule__SigleExp__Group_1__0__Impl rule__SigleExp__Group_1__1 ;
    public final void rule__SigleExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6299:1: ( rule__SigleExp__Group_1__0__Impl rule__SigleExp__Group_1__1 )
            // InternalPagos.g:6300:2: rule__SigleExp__Group_1__0__Impl rule__SigleExp__Group_1__1
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
    // InternalPagos.g:6307:1: rule__SigleExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SigleExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6311:1: ( ( '(' ) )
            // InternalPagos.g:6312:1: ( '(' )
            {
            // InternalPagos.g:6312:1: ( '(' )
            // InternalPagos.g:6313:2: '('
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
    // InternalPagos.g:6322:1: rule__SigleExp__Group_1__1 : rule__SigleExp__Group_1__1__Impl rule__SigleExp__Group_1__2 ;
    public final void rule__SigleExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6326:1: ( rule__SigleExp__Group_1__1__Impl rule__SigleExp__Group_1__2 )
            // InternalPagos.g:6327:2: rule__SigleExp__Group_1__1__Impl rule__SigleExp__Group_1__2
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
    // InternalPagos.g:6334:1: rule__SigleExp__Group_1__1__Impl : ( ruleAdicion ) ;
    public final void rule__SigleExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6338:1: ( ( ruleAdicion ) )
            // InternalPagos.g:6339:1: ( ruleAdicion )
            {
            // InternalPagos.g:6339:1: ( ruleAdicion )
            // InternalPagos.g:6340:2: ruleAdicion
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
    // InternalPagos.g:6349:1: rule__SigleExp__Group_1__2 : rule__SigleExp__Group_1__2__Impl ;
    public final void rule__SigleExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6353:1: ( rule__SigleExp__Group_1__2__Impl )
            // InternalPagos.g:6354:2: rule__SigleExp__Group_1__2__Impl
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
    // InternalPagos.g:6360:1: rule__SigleExp__Group_1__2__Impl : ( ')' ) ;
    public final void rule__SigleExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6364:1: ( ( ')' ) )
            // InternalPagos.g:6365:1: ( ')' )
            {
            // InternalPagos.g:6365:1: ( ')' )
            // InternalPagos.g:6366:2: ')'
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


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalPagos.g:6376:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6380:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalPagos.g:6381:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalPagos.g:6388:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6392:1: ( ( () ) )
            // InternalPagos.g:6393:1: ( () )
            {
            // InternalPagos.g:6393:1: ( () )
            // InternalPagos.g:6394:2: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalPagos.g:6395:2: ()
            // InternalPagos.g:6395:3: 
            {
            }

             after(grammarAccess.getAttributeAccess().getAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalPagos.g:6403:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6407:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalPagos.g:6408:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalPagos.g:6415:1: rule__Attribute__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6419:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:6420:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:6420:1: ( RULE_LBRACE )
            // InternalPagos.g:6421:2: RULE_LBRACE
            {
             before(grammarAccess.getAttributeAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLBRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalPagos.g:6430:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6434:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalPagos.g:6435:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalPagos.g:6442:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6446:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // InternalPagos.g:6447:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // InternalPagos.g:6447:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // InternalPagos.g:6448:2: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // InternalPagos.g:6449:2: ( rule__Attribute__NameAssignment_2 )
            // InternalPagos.g:6449:3: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalPagos.g:6457:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6461:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalPagos.g:6462:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalPagos.g:6469:1: rule__Attribute__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6473:1: ( ( RULE_COLON ) )
            // InternalPagos.g:6474:1: ( RULE_COLON )
            {
            // InternalPagos.g:6474:1: ( RULE_COLON )
            // InternalPagos.g:6475:2: RULE_COLON
            {
             before(grammarAccess.getAttributeAccess().getCOLONTerminalRuleCall_3()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalPagos.g:6484:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6488:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalPagos.g:6489:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalPagos.g:6496:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6500:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // InternalPagos.g:6501:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // InternalPagos.g:6501:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // InternalPagos.g:6502:2: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // InternalPagos.g:6503:2: ( rule__Attribute__TypeAssignment_4 )
            // InternalPagos.g:6503:3: rule__Attribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalPagos.g:6511:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6515:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalPagos.g:6516:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_43);
            rule__Attribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalPagos.g:6523:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6527:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalPagos.g:6528:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalPagos.g:6528:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalPagos.g:6529:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalPagos.g:6530:2: ( rule__Attribute__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPagos.g:6530:3: rule__Attribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__6"
    // InternalPagos.g:6538:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6542:1: ( rule__Attribute__Group__6__Impl )
            // InternalPagos.g:6543:2: rule__Attribute__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // InternalPagos.g:6549:1: rule__Attribute__Group__6__Impl : ( RULE_RBRACE ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6553:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:6554:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:6554:1: ( RULE_RBRACE )
            // InternalPagos.g:6555:2: RULE_RBRACE
            {
             before(grammarAccess.getAttributeAccess().getRBRACETerminalRuleCall_6()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRBRACETerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group_5__0"
    // InternalPagos.g:6565:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6569:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalPagos.g:6570:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_32);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__0"


    // $ANTLR start "rule__Attribute__Group_5__0__Impl"
    // InternalPagos.g:6577:1: rule__Attribute__Group_5__0__Impl : ( ':=' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6581:1: ( ( ':=' ) )
            // InternalPagos.g:6582:1: ( ':=' )
            {
            // InternalPagos.g:6582:1: ( ':=' )
            // InternalPagos.g:6583:2: ':='
            {
             before(grammarAccess.getAttributeAccess().getColonEqualsSignKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonEqualsSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5__1"
    // InternalPagos.g:6592:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6596:1: ( rule__Attribute__Group_5__1__Impl )
            // InternalPagos.g:6597:2: rule__Attribute__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__1"


    // $ANTLR start "rule__Attribute__Group_5__1__Impl"
    // InternalPagos.g:6603:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__ExpAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6607:1: ( ( ( rule__Attribute__ExpAssignment_5_1 ) ) )
            // InternalPagos.g:6608:1: ( ( rule__Attribute__ExpAssignment_5_1 ) )
            {
            // InternalPagos.g:6608:1: ( ( rule__Attribute__ExpAssignment_5_1 ) )
            // InternalPagos.g:6609:2: ( rule__Attribute__ExpAssignment_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getExpAssignment_5_1()); 
            // InternalPagos.g:6610:2: ( rule__Attribute__ExpAssignment_5_1 )
            // InternalPagos.g:6610:3: rule__Attribute__ExpAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ExpAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getExpAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__1__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0__0"
    // InternalPagos.g:6619:1: rule__TerminalValue__Group_0__0 : rule__TerminalValue__Group_0__0__Impl rule__TerminalValue__Group_0__1 ;
    public final void rule__TerminalValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6623:1: ( rule__TerminalValue__Group_0__0__Impl rule__TerminalValue__Group_0__1 )
            // InternalPagos.g:6624:2: rule__TerminalValue__Group_0__0__Impl rule__TerminalValue__Group_0__1
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
    // InternalPagos.g:6631:1: rule__TerminalValue__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6635:1: ( ( () ) )
            // InternalPagos.g:6636:1: ( () )
            {
            // InternalPagos.g:6636:1: ( () )
            // InternalPagos.g:6637:2: ()
            {
             before(grammarAccess.getTerminalValueAccess().getTerminalValueAction_0_0()); 
            // InternalPagos.g:6638:2: ()
            // InternalPagos.g:6638:3: 
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
    // InternalPagos.g:6646:1: rule__TerminalValue__Group_0__1 : rule__TerminalValue__Group_0__1__Impl ;
    public final void rule__TerminalValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6650:1: ( rule__TerminalValue__Group_0__1__Impl )
            // InternalPagos.g:6651:2: rule__TerminalValue__Group_0__1__Impl
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
    // InternalPagos.g:6657:1: rule__TerminalValue__Group_0__1__Impl : ( ( rule__TerminalValue__VariableAssignment_0_1 ) ) ;
    public final void rule__TerminalValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6661:1: ( ( ( rule__TerminalValue__VariableAssignment_0_1 ) ) )
            // InternalPagos.g:6662:1: ( ( rule__TerminalValue__VariableAssignment_0_1 ) )
            {
            // InternalPagos.g:6662:1: ( ( rule__TerminalValue__VariableAssignment_0_1 ) )
            // InternalPagos.g:6663:2: ( rule__TerminalValue__VariableAssignment_0_1 )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableAssignment_0_1()); 
            // InternalPagos.g:6664:2: ( rule__TerminalValue__VariableAssignment_0_1 )
            // InternalPagos.g:6664:3: rule__TerminalValue__VariableAssignment_0_1
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


    // $ANTLR start "rule__MathADD__Group__0"
    // InternalPagos.g:6673:1: rule__MathADD__Group__0 : rule__MathADD__Group__0__Impl rule__MathADD__Group__1 ;
    public final void rule__MathADD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6677:1: ( rule__MathADD__Group__0__Impl rule__MathADD__Group__1 )
            // InternalPagos.g:6678:2: rule__MathADD__Group__0__Impl rule__MathADD__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__MathADD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathADD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathADD__Group__0"


    // $ANTLR start "rule__MathADD__Group__0__Impl"
    // InternalPagos.g:6685:1: rule__MathADD__Group__0__Impl : ( () ) ;
    public final void rule__MathADD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6689:1: ( ( () ) )
            // InternalPagos.g:6690:1: ( () )
            {
            // InternalPagos.g:6690:1: ( () )
            // InternalPagos.g:6691:2: ()
            {
             before(grammarAccess.getMathADDAccess().getMathADDAction_0()); 
            // InternalPagos.g:6692:2: ()
            // InternalPagos.g:6692:3: 
            {
            }

             after(grammarAccess.getMathADDAccess().getMathADDAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathADD__Group__0__Impl"


    // $ANTLR start "rule__MathADD__Group__1"
    // InternalPagos.g:6700:1: rule__MathADD__Group__1 : rule__MathADD__Group__1__Impl ;
    public final void rule__MathADD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6704:1: ( rule__MathADD__Group__1__Impl )
            // InternalPagos.g:6705:2: rule__MathADD__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathADD__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathADD__Group__1"


    // $ANTLR start "rule__MathADD__Group__1__Impl"
    // InternalPagos.g:6711:1: rule__MathADD__Group__1__Impl : ( ( rule__MathADD__OperadorAssignment_1 ) ) ;
    public final void rule__MathADD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6715:1: ( ( ( rule__MathADD__OperadorAssignment_1 ) ) )
            // InternalPagos.g:6716:1: ( ( rule__MathADD__OperadorAssignment_1 ) )
            {
            // InternalPagos.g:6716:1: ( ( rule__MathADD__OperadorAssignment_1 ) )
            // InternalPagos.g:6717:2: ( rule__MathADD__OperadorAssignment_1 )
            {
             before(grammarAccess.getMathADDAccess().getOperadorAssignment_1()); 
            // InternalPagos.g:6718:2: ( rule__MathADD__OperadorAssignment_1 )
            // InternalPagos.g:6718:3: rule__MathADD__OperadorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MathADD__OperadorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMathADDAccess().getOperadorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathADD__Group__1__Impl"


    // $ANTLR start "rule__MathMULT__Group__0"
    // InternalPagos.g:6727:1: rule__MathMULT__Group__0 : rule__MathMULT__Group__0__Impl rule__MathMULT__Group__1 ;
    public final void rule__MathMULT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6731:1: ( rule__MathMULT__Group__0__Impl rule__MathMULT__Group__1 )
            // InternalPagos.g:6732:2: rule__MathMULT__Group__0__Impl rule__MathMULT__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__MathMULT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathMULT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathMULT__Group__0"


    // $ANTLR start "rule__MathMULT__Group__0__Impl"
    // InternalPagos.g:6739:1: rule__MathMULT__Group__0__Impl : ( () ) ;
    public final void rule__MathMULT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6743:1: ( ( () ) )
            // InternalPagos.g:6744:1: ( () )
            {
            // InternalPagos.g:6744:1: ( () )
            // InternalPagos.g:6745:2: ()
            {
             before(grammarAccess.getMathMULTAccess().getMathMULTAction_0()); 
            // InternalPagos.g:6746:2: ()
            // InternalPagos.g:6746:3: 
            {
            }

             after(grammarAccess.getMathMULTAccess().getMathMULTAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathMULT__Group__0__Impl"


    // $ANTLR start "rule__MathMULT__Group__1"
    // InternalPagos.g:6754:1: rule__MathMULT__Group__1 : rule__MathMULT__Group__1__Impl ;
    public final void rule__MathMULT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6758:1: ( rule__MathMULT__Group__1__Impl )
            // InternalPagos.g:6759:2: rule__MathMULT__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathMULT__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathMULT__Group__1"


    // $ANTLR start "rule__MathMULT__Group__1__Impl"
    // InternalPagos.g:6765:1: rule__MathMULT__Group__1__Impl : ( ( rule__MathMULT__OperadorAssignment_1 ) ) ;
    public final void rule__MathMULT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6769:1: ( ( ( rule__MathMULT__OperadorAssignment_1 ) ) )
            // InternalPagos.g:6770:1: ( ( rule__MathMULT__OperadorAssignment_1 ) )
            {
            // InternalPagos.g:6770:1: ( ( rule__MathMULT__OperadorAssignment_1 ) )
            // InternalPagos.g:6771:2: ( rule__MathMULT__OperadorAssignment_1 )
            {
             before(grammarAccess.getMathMULTAccess().getOperadorAssignment_1()); 
            // InternalPagos.g:6772:2: ( rule__MathMULT__OperadorAssignment_1 )
            // InternalPagos.g:6772:3: rule__MathMULT__OperadorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MathMULT__OperadorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMathMULTAccess().getOperadorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathMULT__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalPagos.g:6781:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6785:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalPagos.g:6786:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
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
    // InternalPagos.g:6793:1: rule__EDouble__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6797:1: ( ( ( RULE_INT )? ) )
            // InternalPagos.g:6798:1: ( ( RULE_INT )? )
            {
            // InternalPagos.g:6798:1: ( ( RULE_INT )? )
            // InternalPagos.g:6799:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            // InternalPagos.g:6800:2: ( RULE_INT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPagos.g:6800:3: RULE_INT
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
    // InternalPagos.g:6808:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6812:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalPagos.g:6813:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
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
    // InternalPagos.g:6820:1: rule__EDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6824:1: ( ( '.' ) )
            // InternalPagos.g:6825:1: ( '.' )
            {
            // InternalPagos.g:6825:1: ( '.' )
            // InternalPagos.g:6826:2: '.'
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
    // InternalPagos.g:6835:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6839:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalPagos.g:6840:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
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
    // InternalPagos.g:6847:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6851:1: ( ( RULE_INT ) )
            // InternalPagos.g:6852:1: ( RULE_INT )
            {
            // InternalPagos.g:6852:1: ( RULE_INT )
            // InternalPagos.g:6853:2: RULE_INT
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
    // InternalPagos.g:6862:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6866:1: ( rule__EDouble__Group__3__Impl )
            // InternalPagos.g:6867:2: rule__EDouble__Group__3__Impl
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
    // InternalPagos.g:6873:1: rule__EDouble__Group__3__Impl : ( ( rule__EDouble__Group_3__0 )? ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6877:1: ( ( ( rule__EDouble__Group_3__0 )? ) )
            // InternalPagos.g:6878:1: ( ( rule__EDouble__Group_3__0 )? )
            {
            // InternalPagos.g:6878:1: ( ( rule__EDouble__Group_3__0 )? )
            // InternalPagos.g:6879:2: ( rule__EDouble__Group_3__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_3()); 
            // InternalPagos.g:6880:2: ( rule__EDouble__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=28 && LA28_0<=29)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPagos.g:6880:3: rule__EDouble__Group_3__0
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
    // InternalPagos.g:6889:1: rule__EDouble__Group_3__0 : rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 ;
    public final void rule__EDouble__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6893:1: ( rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 )
            // InternalPagos.g:6894:2: rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1
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
    // InternalPagos.g:6901:1: rule__EDouble__Group_3__0__Impl : ( ( rule__EDouble__Alternatives_3_0 ) ) ;
    public final void rule__EDouble__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6905:1: ( ( ( rule__EDouble__Alternatives_3_0 ) ) )
            // InternalPagos.g:6906:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            {
            // InternalPagos.g:6906:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            // InternalPagos.g:6907:2: ( rule__EDouble__Alternatives_3_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 
            // InternalPagos.g:6908:2: ( rule__EDouble__Alternatives_3_0 )
            // InternalPagos.g:6908:3: rule__EDouble__Alternatives_3_0
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
    // InternalPagos.g:6916:1: rule__EDouble__Group_3__1 : rule__EDouble__Group_3__1__Impl ;
    public final void rule__EDouble__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6920:1: ( rule__EDouble__Group_3__1__Impl )
            // InternalPagos.g:6921:2: rule__EDouble__Group_3__1__Impl
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
    // InternalPagos.g:6927:1: rule__EDouble__Group_3__1__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6931:1: ( ( RULE_INT ) )
            // InternalPagos.g:6932:1: ( RULE_INT )
            {
            // InternalPagos.g:6932:1: ( RULE_INT )
            // InternalPagos.g:6933:2: RULE_INT
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
    // InternalPagos.g:6943:1: rule__Application__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6947:1: ( ( RULE_ID ) )
            // InternalPagos.g:6948:2: ( RULE_ID )
            {
            // InternalPagos.g:6948:2: ( RULE_ID )
            // InternalPagos.g:6949:3: RULE_ID
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
    // InternalPagos.g:6958:1: rule__Application__IntermediaryAssignment_7 : ( ruleIntermediary ) ;
    public final void rule__Application__IntermediaryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6962:1: ( ( ruleIntermediary ) )
            // InternalPagos.g:6963:2: ( ruleIntermediary )
            {
            // InternalPagos.g:6963:2: ( ruleIntermediary )
            // InternalPagos.g:6964:3: ruleIntermediary
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
    // InternalPagos.g:6973:1: rule__Intermediary__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Intermediary__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6977:1: ( ( RULE_ID ) )
            // InternalPagos.g:6978:2: ( RULE_ID )
            {
            // InternalPagos.g:6978:2: ( RULE_ID )
            // InternalPagos.g:6979:3: RULE_ID
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


    // $ANTLR start "rule__Intermediary__SuperentitieAssignment_9"
    // InternalPagos.g:6988:1: rule__Intermediary__SuperentitieAssignment_9 : ( ruleSuperEntity ) ;
    public final void rule__Intermediary__SuperentitieAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6992:1: ( ( ruleSuperEntity ) )
            // InternalPagos.g:6993:2: ( ruleSuperEntity )
            {
            // InternalPagos.g:6993:2: ( ruleSuperEntity )
            // InternalPagos.g:6994:3: ruleSuperEntity
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitieSuperEntityParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleSuperEntity();

            state._fsp--;

             after(grammarAccess.getIntermediaryAccess().getSuperentitieSuperEntityParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__SuperentitieAssignment_9"


    // $ANTLR start "rule__Intermediary__SuperentitieAssignment_10_1"
    // InternalPagos.g:7003:1: rule__Intermediary__SuperentitieAssignment_10_1 : ( ruleSuperEntity ) ;
    public final void rule__Intermediary__SuperentitieAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7007:1: ( ( ruleSuperEntity ) )
            // InternalPagos.g:7008:2: ( ruleSuperEntity )
            {
            // InternalPagos.g:7008:2: ( ruleSuperEntity )
            // InternalPagos.g:7009:3: ruleSuperEntity
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitieSuperEntityParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSuperEntity();

            state._fsp--;

             after(grammarAccess.getIntermediaryAccess().getSuperentitieSuperEntityParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intermediary__SuperentitieAssignment_10_1"


    // $ANTLR start "rule__SuperEntity__NameAssignment_4"
    // InternalPagos.g:7018:1: rule__SuperEntity__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__SuperEntity__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7022:1: ( ( RULE_ID ) )
            // InternalPagos.g:7023:2: ( RULE_ID )
            {
            // InternalPagos.g:7023:2: ( RULE_ID )
            // InternalPagos.g:7024:3: RULE_ID
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
    // InternalPagos.g:7033:1: rule__SuperEntity__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__SuperEntity__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7037:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7038:2: ( RULE_STRING )
            {
            // InternalPagos.g:7038:2: ( RULE_STRING )
            // InternalPagos.g:7039:3: RULE_STRING
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
    // InternalPagos.g:7048:1: rule__SuperEntity__AttListsAssignment_13 : ( ruleAttribute ) ;
    public final void rule__SuperEntity__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7052:1: ( ( ruleAttribute ) )
            // InternalPagos.g:7053:2: ( ruleAttribute )
            {
            // InternalPagos.g:7053:2: ( ruleAttribute )
            // InternalPagos.g:7054:3: ruleAttribute
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsAttributeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSuperEntityAccess().getAttListsAttributeParserRuleCall_13_0()); 

            }


            }

        }
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
    // InternalPagos.g:7063:1: rule__SuperEntity__AttListsAssignment_14_1 : ( ruleAttribute ) ;
    public final void rule__SuperEntity__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7067:1: ( ( ruleAttribute ) )
            // InternalPagos.g:7068:2: ( ruleAttribute )
            {
            // InternalPagos.g:7068:2: ( ruleAttribute )
            // InternalPagos.g:7069:3: ruleAttribute
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsAttributeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSuperEntityAccess().getAttListsAttributeParserRuleCall_14_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SuperEntity__ParticipanteAssignment_20"
    // InternalPagos.g:7078:1: rule__SuperEntity__ParticipanteAssignment_20 : ( ruleParticipant ) ;
    public final void rule__SuperEntity__ParticipanteAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7082:1: ( ( ruleParticipant ) )
            // InternalPagos.g:7083:2: ( ruleParticipant )
            {
            // InternalPagos.g:7083:2: ( ruleParticipant )
            // InternalPagos.g:7084:3: ruleParticipant
            {
             before(grammarAccess.getSuperEntityAccess().getParticipanteParticipantParserRuleCall_20_0()); 
            pushFollow(FOLLOW_2);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getSuperEntityAccess().getParticipanteParticipantParserRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__ParticipanteAssignment_20"


    // $ANTLR start "rule__SuperEntity__ParticipanteAssignment_21_1"
    // InternalPagos.g:7093:1: rule__SuperEntity__ParticipanteAssignment_21_1 : ( ruleParticipant ) ;
    public final void rule__SuperEntity__ParticipanteAssignment_21_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7097:1: ( ( ruleParticipant ) )
            // InternalPagos.g:7098:2: ( ruleParticipant )
            {
            // InternalPagos.g:7098:2: ( ruleParticipant )
            // InternalPagos.g:7099:3: ruleParticipant
            {
             before(grammarAccess.getSuperEntityAccess().getParticipanteParticipantParserRuleCall_21_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getSuperEntityAccess().getParticipanteParticipantParserRuleCall_21_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__ParticipanteAssignment_21_1"


    // $ANTLR start "rule__Participant__NameAssignment_4"
    // InternalPagos.g:7108:1: rule__Participant__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Participant__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7112:1: ( ( RULE_ID ) )
            // InternalPagos.g:7113:2: ( RULE_ID )
            {
            // InternalPagos.g:7113:2: ( RULE_ID )
            // InternalPagos.g:7114:3: RULE_ID
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
    // InternalPagos.g:7123:1: rule__Participant__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Participant__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7127:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7128:2: ( RULE_STRING )
            {
            // InternalPagos.g:7128:2: ( RULE_STRING )
            // InternalPagos.g:7129:3: RULE_STRING
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
    // InternalPagos.g:7138:1: rule__Participant__AttListsAssignment_13 : ( ruleAttribute ) ;
    public final void rule__Participant__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7142:1: ( ( ruleAttribute ) )
            // InternalPagos.g:7143:2: ( ruleAttribute )
            {
            // InternalPagos.g:7143:2: ( ruleAttribute )
            // InternalPagos.g:7144:3: ruleAttribute
            {
             before(grammarAccess.getParticipantAccess().getAttListsAttributeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getAttListsAttributeParserRuleCall_13_0()); 

            }


            }

        }
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
    // InternalPagos.g:7153:1: rule__Participant__AttListsAssignment_14_1 : ( ruleAttribute ) ;
    public final void rule__Participant__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7157:1: ( ( ruleAttribute ) )
            // InternalPagos.g:7158:2: ( ruleAttribute )
            {
            // InternalPagos.g:7158:2: ( ruleAttribute )
            // InternalPagos.g:7159:3: ruleAttribute
            {
             before(grammarAccess.getParticipantAccess().getAttListsAttributeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getAttListsAttributeParserRuleCall_14_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Participant__TemplatesFormAssignment_17_4"
    // InternalPagos.g:7168:1: rule__Participant__TemplatesFormAssignment_17_4 : ( ruleInformationTemplate ) ;
    public final void rule__Participant__TemplatesFormAssignment_17_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7172:1: ( ( ruleInformationTemplate ) )
            // InternalPagos.g:7173:2: ( ruleInformationTemplate )
            {
            // InternalPagos.g:7173:2: ( ruleInformationTemplate )
            // InternalPagos.g:7174:3: ruleInformationTemplate
            {
             before(grammarAccess.getParticipantAccess().getTemplatesFormInformationTemplateParserRuleCall_17_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInformationTemplate();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getTemplatesFormInformationTemplateParserRuleCall_17_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__TemplatesFormAssignment_17_4"


    // $ANTLR start "rule__Participant__TemplatesFormAssignment_17_5_1"
    // InternalPagos.g:7183:1: rule__Participant__TemplatesFormAssignment_17_5_1 : ( ruleInformationTemplate ) ;
    public final void rule__Participant__TemplatesFormAssignment_17_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7187:1: ( ( ruleInformationTemplate ) )
            // InternalPagos.g:7188:2: ( ruleInformationTemplate )
            {
            // InternalPagos.g:7188:2: ( ruleInformationTemplate )
            // InternalPagos.g:7189:3: ruleInformationTemplate
            {
             before(grammarAccess.getParticipantAccess().getTemplatesFormInformationTemplateParserRuleCall_17_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInformationTemplate();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getTemplatesFormInformationTemplateParserRuleCall_17_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__TemplatesFormAssignment_17_5_1"


    // $ANTLR start "rule__Provider__NameAssignment_4"
    // InternalPagos.g:7198:1: rule__Provider__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Provider__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7202:1: ( ( RULE_ID ) )
            // InternalPagos.g:7203:2: ( RULE_ID )
            {
            // InternalPagos.g:7203:2: ( RULE_ID )
            // InternalPagos.g:7204:3: RULE_ID
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
    // InternalPagos.g:7213:1: rule__Provider__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Provider__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7217:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7218:2: ( RULE_STRING )
            {
            // InternalPagos.g:7218:2: ( RULE_STRING )
            // InternalPagos.g:7219:3: RULE_STRING
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
    // InternalPagos.g:7228:1: rule__Provider__AttListsAssignment_13 : ( ruleAttribute ) ;
    public final void rule__Provider__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7232:1: ( ( ruleAttribute ) )
            // InternalPagos.g:7233:2: ( ruleAttribute )
            {
            // InternalPagos.g:7233:2: ( ruleAttribute )
            // InternalPagos.g:7234:3: ruleAttribute
            {
             before(grammarAccess.getProviderAccess().getAttListsAttributeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getProviderAccess().getAttListsAttributeParserRuleCall_13_0()); 

            }


            }

        }
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
    // InternalPagos.g:7243:1: rule__Provider__AttListsAssignment_14_1 : ( ruleAttribute ) ;
    public final void rule__Provider__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7247:1: ( ( ruleAttribute ) )
            // InternalPagos.g:7248:2: ( ruleAttribute )
            {
            // InternalPagos.g:7248:2: ( ruleAttribute )
            // InternalPagos.g:7249:3: ruleAttribute
            {
             before(grammarAccess.getProviderAccess().getAttListsAttributeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getProviderAccess().getAttListsAttributeParserRuleCall_14_1_0()); 

            }


            }

        }
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
    // InternalPagos.g:7258:1: rule__InformationTemplate__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__InformationTemplate__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7262:1: ( ( RULE_ID ) )
            // InternalPagos.g:7263:2: ( RULE_ID )
            {
            // InternalPagos.g:7263:2: ( RULE_ID )
            // InternalPagos.g:7264:3: RULE_ID
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
    // InternalPagos.g:7273:1: rule__InformationTemplate__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__InformationTemplate__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7277:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7278:2: ( RULE_STRING )
            {
            // InternalPagos.g:7278:2: ( RULE_STRING )
            // InternalPagos.g:7279:3: RULE_STRING
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


    // $ANTLR start "rule__InformationTemplate__FormListsAssignment_13"
    // InternalPagos.g:7288:1: rule__InformationTemplate__FormListsAssignment_13 : ( ruleAttribute ) ;
    public final void rule__InformationTemplate__FormListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7292:1: ( ( ruleAttribute ) )
            // InternalPagos.g:7293:2: ( ruleAttribute )
            {
            // InternalPagos.g:7293:2: ( ruleAttribute )
            // InternalPagos.g:7294:3: ruleAttribute
            {
             before(grammarAccess.getInformationTemplateAccess().getFormListsAttributeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getInformationTemplateAccess().getFormListsAttributeParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__FormListsAssignment_13"


    // $ANTLR start "rule__InformationTemplate__FormListsAssignment_14_1"
    // InternalPagos.g:7303:1: rule__InformationTemplate__FormListsAssignment_14_1 : ( ruleAttribute ) ;
    public final void rule__InformationTemplate__FormListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7307:1: ( ( ruleAttribute ) )
            // InternalPagos.g:7308:2: ( ruleAttribute )
            {
            // InternalPagos.g:7308:2: ( ruleAttribute )
            // InternalPagos.g:7309:3: ruleAttribute
            {
             before(grammarAccess.getInformationTemplateAccess().getFormListsAttributeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getInformationTemplateAccess().getFormListsAttributeParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationTemplate__FormListsAssignment_14_1"


    // $ANTLR start "rule__InformationTemplate__TemplatesAssignment_17_4"
    // InternalPagos.g:7318:1: rule__InformationTemplate__TemplatesAssignment_17_4 : ( ruleCalculationTemplate ) ;
    public final void rule__InformationTemplate__TemplatesAssignment_17_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7322:1: ( ( ruleCalculationTemplate ) )
            // InternalPagos.g:7323:2: ( ruleCalculationTemplate )
            {
            // InternalPagos.g:7323:2: ( ruleCalculationTemplate )
            // InternalPagos.g:7324:3: ruleCalculationTemplate
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
    // InternalPagos.g:7333:1: rule__InformationTemplate__TemplatesAssignment_17_5_1 : ( ruleCalculationTemplate ) ;
    public final void rule__InformationTemplate__TemplatesAssignment_17_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7337:1: ( ( ruleCalculationTemplate ) )
            // InternalPagos.g:7338:2: ( ruleCalculationTemplate )
            {
            // InternalPagos.g:7338:2: ( ruleCalculationTemplate )
            // InternalPagos.g:7339:3: ruleCalculationTemplate
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
    // InternalPagos.g:7348:1: rule__InformationTemplate__ProvidersAssignment_18_4 : ( ruleProvider ) ;
    public final void rule__InformationTemplate__ProvidersAssignment_18_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7352:1: ( ( ruleProvider ) )
            // InternalPagos.g:7353:2: ( ruleProvider )
            {
            // InternalPagos.g:7353:2: ( ruleProvider )
            // InternalPagos.g:7354:3: ruleProvider
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
    // InternalPagos.g:7363:1: rule__InformationTemplate__ProvidersAssignment_18_5_1 : ( ruleProvider ) ;
    public final void rule__InformationTemplate__ProvidersAssignment_18_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7367:1: ( ( ruleProvider ) )
            // InternalPagos.g:7368:2: ( ruleProvider )
            {
            // InternalPagos.g:7368:2: ( ruleProvider )
            // InternalPagos.g:7369:3: ruleProvider
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
    // InternalPagos.g:7378:1: rule__CalculationTemplate__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__CalculationTemplate__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7382:1: ( ( RULE_ID ) )
            // InternalPagos.g:7383:2: ( RULE_ID )
            {
            // InternalPagos.g:7383:2: ( RULE_ID )
            // InternalPagos.g:7384:3: RULE_ID
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
    // InternalPagos.g:7393:1: rule__CalculationTemplate__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__CalculationTemplate__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7397:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7398:2: ( RULE_STRING )
            {
            // InternalPagos.g:7398:2: ( RULE_STRING )
            // InternalPagos.g:7399:3: RULE_STRING
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
    // InternalPagos.g:7408:1: rule__CalculationTemplate__AttListsAssignment_13 : ( ruleAttribute ) ;
    public final void rule__CalculationTemplate__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7412:1: ( ( ruleAttribute ) )
            // InternalPagos.g:7413:2: ( ruleAttribute )
            {
            // InternalPagos.g:7413:2: ( ruleAttribute )
            // InternalPagos.g:7414:3: ruleAttribute
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsAttributeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getCalculationTemplateAccess().getAttListsAttributeParserRuleCall_13_0()); 

            }


            }

        }
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
    // InternalPagos.g:7423:1: rule__CalculationTemplate__AttListsAssignment_14_1 : ( ruleAttribute ) ;
    public final void rule__CalculationTemplate__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7427:1: ( ( ruleAttribute ) )
            // InternalPagos.g:7428:2: ( ruleAttribute )
            {
            // InternalPagos.g:7428:2: ( ruleAttribute )
            // InternalPagos.g:7429:3: ruleAttribute
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsAttributeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getCalculationTemplateAccess().getAttListsAttributeParserRuleCall_14_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__CalculationTemplate__FormulaAssignment_19"
    // InternalPagos.g:7438:1: rule__CalculationTemplate__FormulaAssignment_19 : ( ruleFormula ) ;
    public final void rule__CalculationTemplate__FormulaAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7442:1: ( ( ruleFormula ) )
            // InternalPagos.g:7443:2: ( ruleFormula )
            {
            // InternalPagos.g:7443:2: ( ruleFormula )
            // InternalPagos.g:7444:3: ruleFormula
            {
             before(grammarAccess.getCalculationTemplateAccess().getFormulaFormulaParserRuleCall_19_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getCalculationTemplateAccess().getFormulaFormulaParserRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculationTemplate__FormulaAssignment_19"


    // $ANTLR start "rule__Formula__FormulaBodyAssignment_0_1"
    // InternalPagos.g:7453:1: rule__Formula__FormulaBodyAssignment_0_1 : ( ruleIfBlock ) ;
    public final void rule__Formula__FormulaBodyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7457:1: ( ( ruleIfBlock ) )
            // InternalPagos.g:7458:2: ( ruleIfBlock )
            {
            // InternalPagos.g:7458:2: ( ruleIfBlock )
            // InternalPagos.g:7459:3: ruleIfBlock
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
    // InternalPagos.g:7468:1: rule__Formula__FormulaReturnAssignment_1 : ( ruleReturnBlock ) ;
    public final void rule__Formula__FormulaReturnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7472:1: ( ( ruleReturnBlock ) )
            // InternalPagos.g:7473:2: ( ruleReturnBlock )
            {
            // InternalPagos.g:7473:2: ( ruleReturnBlock )
            // InternalPagos.g:7474:3: ruleReturnBlock
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
    // InternalPagos.g:7483:1: rule__IfBlock__IfSentenceAssignment_1 : ( ruleIfCondition ) ;
    public final void rule__IfBlock__IfSentenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7487:1: ( ( ruleIfCondition ) )
            // InternalPagos.g:7488:2: ( ruleIfCondition )
            {
            // InternalPagos.g:7488:2: ( ruleIfCondition )
            // InternalPagos.g:7489:3: ruleIfCondition
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
    // InternalPagos.g:7498:1: rule__IfBlock__ElseSentenceAssignment_2_1 : ( ruleElseSegment ) ;
    public final void rule__IfBlock__ElseSentenceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7502:1: ( ( ruleElseSegment ) )
            // InternalPagos.g:7503:2: ( ruleElseSegment )
            {
            // InternalPagos.g:7503:2: ( ruleElseSegment )
            // InternalPagos.g:7504:3: ruleElseSegment
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
    // InternalPagos.g:7513:1: rule__IfCondition__LogExpAssignment_3 : ( ruleExpresionLogica ) ;
    public final void rule__IfCondition__LogExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7517:1: ( ( ruleExpresionLogica ) )
            // InternalPagos.g:7518:2: ( ruleExpresionLogica )
            {
            // InternalPagos.g:7518:2: ( ruleExpresionLogica )
            // InternalPagos.g:7519:3: ruleExpresionLogica
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
    // InternalPagos.g:7528:1: rule__IfCondition__ExpressionAssignment_9 : ( ruleAdicion ) ;
    public final void rule__IfCondition__ExpressionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7532:1: ( ( ruleAdicion ) )
            // InternalPagos.g:7533:2: ( ruleAdicion )
            {
            // InternalPagos.g:7533:2: ( ruleAdicion )
            // InternalPagos.g:7534:3: ruleAdicion
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
    // InternalPagos.g:7543:1: rule__ElseSegment__IfSentenceAssignment_2 : ( ruleFormula ) ;
    public final void rule__ElseSegment__IfSentenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7547:1: ( ( ruleFormula ) )
            // InternalPagos.g:7548:2: ( ruleFormula )
            {
            // InternalPagos.g:7548:2: ( ruleFormula )
            // InternalPagos.g:7549:3: ruleFormula
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
    // InternalPagos.g:7558:1: rule__ReturnBlock__ExpressionAssignment_3 : ( ruleAdicion ) ;
    public final void rule__ReturnBlock__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7562:1: ( ( ruleAdicion ) )
            // InternalPagos.g:7563:2: ( ruleAdicion )
            {
            // InternalPagos.g:7563:2: ( ruleAdicion )
            // InternalPagos.g:7564:3: ruleAdicion
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
    // InternalPagos.g:7573:1: rule__ExpresionLogica__VariableAssignment_0 : ( ruleTerminalValue ) ;
    public final void rule__ExpresionLogica__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7577:1: ( ( ruleTerminalValue ) )
            // InternalPagos.g:7578:2: ( ruleTerminalValue )
            {
            // InternalPagos.g:7578:2: ( ruleTerminalValue )
            // InternalPagos.g:7579:3: ruleTerminalValue
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
    // InternalPagos.g:7588:1: rule__ExpresionLogica__LogOperAssignment_1_0 : ( RULE_OPERADORLOGICO ) ;
    public final void rule__ExpresionLogica__LogOperAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7592:1: ( ( RULE_OPERADORLOGICO ) )
            // InternalPagos.g:7593:2: ( RULE_OPERADORLOGICO )
            {
            // InternalPagos.g:7593:2: ( RULE_OPERADORLOGICO )
            // InternalPagos.g:7594:3: RULE_OPERADORLOGICO
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
    // InternalPagos.g:7603:1: rule__ExpresionLogica__Variable2Assignment_1_1_0 : ( ruleTerminalValue ) ;
    public final void rule__ExpresionLogica__Variable2Assignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7607:1: ( ( ruleTerminalValue ) )
            // InternalPagos.g:7608:2: ( ruleTerminalValue )
            {
            // InternalPagos.g:7608:2: ( ruleTerminalValue )
            // InternalPagos.g:7609:3: ruleTerminalValue
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
    // InternalPagos.g:7618:1: rule__ExpresionLogica__LiteralAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__ExpresionLogica__LiteralAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7622:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7623:2: ( RULE_STRING )
            {
            // InternalPagos.g:7623:2: ( RULE_STRING )
            // InternalPagos.g:7624:3: RULE_STRING
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
    // InternalPagos.g:7633:1: rule__ExpresionLogica__ExpAssignment_2_1 : ( ruleExpresionLogica ) ;
    public final void rule__ExpresionLogica__ExpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7637:1: ( ( ruleExpresionLogica ) )
            // InternalPagos.g:7638:2: ( ruleExpresionLogica )
            {
            // InternalPagos.g:7638:2: ( ruleExpresionLogica )
            // InternalPagos.g:7639:3: ruleExpresionLogica
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
    // InternalPagos.g:7648:1: rule__Adicion__OperatorAssignment_1_1 : ( rulemathADD ) ;
    public final void rule__Adicion__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7652:1: ( ( rulemathADD ) )
            // InternalPagos.g:7653:2: ( rulemathADD )
            {
            // InternalPagos.g:7653:2: ( rulemathADD )
            // InternalPagos.g:7654:3: rulemathADD
            {
             before(grammarAccess.getAdicionAccess().getOperatorMathADDParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulemathADD();

            state._fsp--;

             after(grammarAccess.getAdicionAccess().getOperatorMathADDParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalPagos.g:7663:1: rule__Adicion__RexpAssignment_1_2 : ( ruleMultiplicacion ) ;
    public final void rule__Adicion__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7667:1: ( ( ruleMultiplicacion ) )
            // InternalPagos.g:7668:2: ( ruleMultiplicacion )
            {
            // InternalPagos.g:7668:2: ( ruleMultiplicacion )
            // InternalPagos.g:7669:3: ruleMultiplicacion
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
    // InternalPagos.g:7678:1: rule__Multiplicacion__OperatorAssignment_1_1 : ( rulemathMULT ) ;
    public final void rule__Multiplicacion__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7682:1: ( ( rulemathMULT ) )
            // InternalPagos.g:7683:2: ( rulemathMULT )
            {
            // InternalPagos.g:7683:2: ( rulemathMULT )
            // InternalPagos.g:7684:3: rulemathMULT
            {
             before(grammarAccess.getMultiplicacionAccess().getOperatorMathMULTParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulemathMULT();

            state._fsp--;

             after(grammarAccess.getMultiplicacionAccess().getOperatorMathMULTParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalPagos.g:7693:1: rule__Multiplicacion__RexpAssignment_1_2 : ( ruleSigleExp ) ;
    public final void rule__Multiplicacion__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7697:1: ( ( ruleSigleExp ) )
            // InternalPagos.g:7698:2: ( ruleSigleExp )
            {
            // InternalPagos.g:7698:2: ( ruleSigleExp )
            // InternalPagos.g:7699:3: ruleSigleExp
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


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // InternalPagos.g:7708:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7712:1: ( ( RULE_ID ) )
            // InternalPagos.g:7713:2: ( RULE_ID )
            {
            // InternalPagos.g:7713:2: ( RULE_ID )
            // InternalPagos.g:7714:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__Attribute__TypeAssignment_4"
    // InternalPagos.g:7723:1: rule__Attribute__TypeAssignment_4 : ( RULE_TYPE ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7727:1: ( ( RULE_TYPE ) )
            // InternalPagos.g:7728:2: ( RULE_TYPE )
            {
            // InternalPagos.g:7728:2: ( RULE_TYPE )
            // InternalPagos.g:7729:3: RULE_TYPE
            {
             before(grammarAccess.getAttributeAccess().getTypeTYPETerminalRuleCall_4_0()); 
            match(input,RULE_TYPE,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeTYPETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_4"


    // $ANTLR start "rule__Attribute__ExpAssignment_5_1"
    // InternalPagos.g:7738:1: rule__Attribute__ExpAssignment_5_1 : ( ruleAdicion ) ;
    public final void rule__Attribute__ExpAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7742:1: ( ( ruleAdicion ) )
            // InternalPagos.g:7743:2: ( ruleAdicion )
            {
            // InternalPagos.g:7743:2: ( ruleAdicion )
            // InternalPagos.g:7744:3: ruleAdicion
            {
             before(grammarAccess.getAttributeAccess().getExpAdicionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdicion();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getExpAdicionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ExpAssignment_5_1"


    // $ANTLR start "rule__TerminalValue__VariableAssignment_0_1"
    // InternalPagos.g:7753:1: rule__TerminalValue__VariableAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__VariableAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7757:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:7758:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:7758:2: ( ( RULE_ID ) )
            // InternalPagos.g:7759:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableAttributeCrossReference_0_1_0()); 
            // InternalPagos.g:7760:3: ( RULE_ID )
            // InternalPagos.g:7761:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getVariableAttributeIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getVariableAttributeIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getVariableAttributeCrossReference_0_1_0()); 

            }


            }

        }
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
    // InternalPagos.g:7772:1: rule__TerminalValue__ValorAssignment_1 : ( ruleNumber ) ;
    public final void rule__TerminalValue__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7776:1: ( ( ruleNumber ) )
            // InternalPagos.g:7777:2: ( ruleNumber )
            {
            // InternalPagos.g:7777:2: ( ruleNumber )
            // InternalPagos.g:7778:3: ruleNumber
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


    // $ANTLR start "rule__MathADD__OperadorAssignment_1"
    // InternalPagos.g:7787:1: rule__MathADD__OperadorAssignment_1 : ( RULE_ADDOP ) ;
    public final void rule__MathADD__OperadorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7791:1: ( ( RULE_ADDOP ) )
            // InternalPagos.g:7792:2: ( RULE_ADDOP )
            {
            // InternalPagos.g:7792:2: ( RULE_ADDOP )
            // InternalPagos.g:7793:3: RULE_ADDOP
            {
             before(grammarAccess.getMathADDAccess().getOperadorADDOPTerminalRuleCall_1_0()); 
            match(input,RULE_ADDOP,FOLLOW_2); 
             after(grammarAccess.getMathADDAccess().getOperadorADDOPTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathADD__OperadorAssignment_1"


    // $ANTLR start "rule__MathMULT__OperadorAssignment_1"
    // InternalPagos.g:7802:1: rule__MathMULT__OperadorAssignment_1 : ( RULE_MULTOP ) ;
    public final void rule__MathMULT__OperadorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7806:1: ( ( RULE_MULTOP ) )
            // InternalPagos.g:7807:2: ( RULE_MULTOP )
            {
            // InternalPagos.g:7807:2: ( RULE_MULTOP )
            // InternalPagos.g:7808:3: RULE_MULTOP
            {
             before(grammarAccess.getMathMULTAccess().getOperadorMULTOPTerminalRuleCall_1_0()); 
            match(input,RULE_MULTOP,FOLLOW_2); 
             after(grammarAccess.getMathMULTAccess().getOperadorMULTOPTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathMULT__OperadorAssignment_1"

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
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000100L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000030000000L});

}