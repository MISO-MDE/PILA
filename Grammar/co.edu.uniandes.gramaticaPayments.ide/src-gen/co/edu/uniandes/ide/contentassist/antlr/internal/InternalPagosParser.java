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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_LBRACE", "RULE_COLON", "RULE_COMMA", "RULE_RBRACE", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_LOGICALCONN", "RULE_ID", "RULE_STRING", "RULE_OPERADORLOGICO", "RULE_TYPE", "RULE_ADDOP", "RULE_MULTOP", "RULE_DASH", "RULE_STR_ESC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'name'", "'intermediary'", "'superentities'", "'description'", "'attributes'", "'entities'", "'InformationTemplate'", "'FormAttributes'", "'calculationtemplates'", "'providers'", "'calculationattributes'", "'calculationrules'", "'Si'", "'Entonces'", "'Retornar:'", "'Sino'", "'('", "')'", "':='", "'.'"
    };
    public static final int RULE_ID=12;
    public static final int RULE_COMMA=7;
    public static final int RULE_COLON=6;
    public static final int RULE_LOGICALCONN=11;
    public static final int T__26=26;
    public static final int RULE_TYPE=15;
    public static final int T__27=27;
    public static final int RULE_STR_ESC=19;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=20;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_LBRACKET=9;
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=21;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_DASH=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_LBRACE=5;
    public static final int RULE_WS=22;
    public static final int RULE_OPERADORLOGICO=14;
    public static final int RULE_ADDOP=16;
    public static final int RULE_ANY_OTHER=23;
    public static final int RULE_RBRACE=8;
    public static final int T__44=44;
    public static final int RULE_MULTOP=17;
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
    // InternalPagos.g:237:1: ruleFormula : ( ( rule__Formula__Group__0 ) ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:241:2: ( ( ( rule__Formula__Group__0 ) ) )
            // InternalPagos.g:242:2: ( ( rule__Formula__Group__0 ) )
            {
            // InternalPagos.g:242:2: ( ( rule__Formula__Group__0 ) )
            // InternalPagos.g:243:3: ( rule__Formula__Group__0 )
            {
             before(grammarAccess.getFormulaAccess().getGroup()); 
            // InternalPagos.g:244:3: ( rule__Formula__Group__0 )
            // InternalPagos.g:244:4: rule__Formula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleExpresionLogica"
    // InternalPagos.g:253:1: entryRuleExpresionLogica : ruleExpresionLogica EOF ;
    public final void entryRuleExpresionLogica() throws RecognitionException {
        try {
            // InternalPagos.g:254:1: ( ruleExpresionLogica EOF )
            // InternalPagos.g:255:1: ruleExpresionLogica EOF
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
    // InternalPagos.g:262:1: ruleExpresionLogica : ( ( rule__ExpresionLogica__Group__0 ) ) ;
    public final void ruleExpresionLogica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:266:2: ( ( ( rule__ExpresionLogica__Group__0 ) ) )
            // InternalPagos.g:267:2: ( ( rule__ExpresionLogica__Group__0 ) )
            {
            // InternalPagos.g:267:2: ( ( rule__ExpresionLogica__Group__0 ) )
            // InternalPagos.g:268:3: ( rule__ExpresionLogica__Group__0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup()); 
            // InternalPagos.g:269:3: ( rule__ExpresionLogica__Group__0 )
            // InternalPagos.g:269:4: rule__ExpresionLogica__Group__0
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
    // InternalPagos.g:278:1: entryRuleAdicion : ruleAdicion EOF ;
    public final void entryRuleAdicion() throws RecognitionException {
        try {
            // InternalPagos.g:279:1: ( ruleAdicion EOF )
            // InternalPagos.g:280:1: ruleAdicion EOF
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
    // InternalPagos.g:287:1: ruleAdicion : ( ( rule__Adicion__Group__0 ) ) ;
    public final void ruleAdicion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:291:2: ( ( ( rule__Adicion__Group__0 ) ) )
            // InternalPagos.g:292:2: ( ( rule__Adicion__Group__0 ) )
            {
            // InternalPagos.g:292:2: ( ( rule__Adicion__Group__0 ) )
            // InternalPagos.g:293:3: ( rule__Adicion__Group__0 )
            {
             before(grammarAccess.getAdicionAccess().getGroup()); 
            // InternalPagos.g:294:3: ( rule__Adicion__Group__0 )
            // InternalPagos.g:294:4: rule__Adicion__Group__0
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
    // InternalPagos.g:303:1: entryRuleMultiplicacion : ruleMultiplicacion EOF ;
    public final void entryRuleMultiplicacion() throws RecognitionException {
        try {
            // InternalPagos.g:304:1: ( ruleMultiplicacion EOF )
            // InternalPagos.g:305:1: ruleMultiplicacion EOF
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
    // InternalPagos.g:312:1: ruleMultiplicacion : ( ( rule__Multiplicacion__Group__0 ) ) ;
    public final void ruleMultiplicacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:316:2: ( ( ( rule__Multiplicacion__Group__0 ) ) )
            // InternalPagos.g:317:2: ( ( rule__Multiplicacion__Group__0 ) )
            {
            // InternalPagos.g:317:2: ( ( rule__Multiplicacion__Group__0 ) )
            // InternalPagos.g:318:3: ( rule__Multiplicacion__Group__0 )
            {
             before(grammarAccess.getMultiplicacionAccess().getGroup()); 
            // InternalPagos.g:319:3: ( rule__Multiplicacion__Group__0 )
            // InternalPagos.g:319:4: rule__Multiplicacion__Group__0
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
    // InternalPagos.g:328:1: entryRuleSigleExp : ruleSigleExp EOF ;
    public final void entryRuleSigleExp() throws RecognitionException {
        try {
            // InternalPagos.g:329:1: ( ruleSigleExp EOF )
            // InternalPagos.g:330:1: ruleSigleExp EOF
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
    // InternalPagos.g:337:1: ruleSigleExp : ( ( rule__SigleExp__Alternatives ) ) ;
    public final void ruleSigleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:341:2: ( ( ( rule__SigleExp__Alternatives ) ) )
            // InternalPagos.g:342:2: ( ( rule__SigleExp__Alternatives ) )
            {
            // InternalPagos.g:342:2: ( ( rule__SigleExp__Alternatives ) )
            // InternalPagos.g:343:3: ( rule__SigleExp__Alternatives )
            {
             before(grammarAccess.getSigleExpAccess().getAlternatives()); 
            // InternalPagos.g:344:3: ( rule__SigleExp__Alternatives )
            // InternalPagos.g:344:4: rule__SigleExp__Alternatives
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


    // $ANTLR start "entryRuleSuperEntityAttribute"
    // InternalPagos.g:353:1: entryRuleSuperEntityAttribute : ruleSuperEntityAttribute EOF ;
    public final void entryRuleSuperEntityAttribute() throws RecognitionException {
        try {
            // InternalPagos.g:354:1: ( ruleSuperEntityAttribute EOF )
            // InternalPagos.g:355:1: ruleSuperEntityAttribute EOF
            {
             before(grammarAccess.getSuperEntityAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleSuperEntityAttribute();

            state._fsp--;

             after(grammarAccess.getSuperEntityAttributeRule()); 
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
    // $ANTLR end "entryRuleSuperEntityAttribute"


    // $ANTLR start "ruleSuperEntityAttribute"
    // InternalPagos.g:362:1: ruleSuperEntityAttribute : ( ( rule__SuperEntityAttribute__Group__0 ) ) ;
    public final void ruleSuperEntityAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:366:2: ( ( ( rule__SuperEntityAttribute__Group__0 ) ) )
            // InternalPagos.g:367:2: ( ( rule__SuperEntityAttribute__Group__0 ) )
            {
            // InternalPagos.g:367:2: ( ( rule__SuperEntityAttribute__Group__0 ) )
            // InternalPagos.g:368:3: ( rule__SuperEntityAttribute__Group__0 )
            {
             before(grammarAccess.getSuperEntityAttributeAccess().getGroup()); 
            // InternalPagos.g:369:3: ( rule__SuperEntityAttribute__Group__0 )
            // InternalPagos.g:369:4: rule__SuperEntityAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntityAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSuperEntityAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSuperEntityAttribute"


    // $ANTLR start "entryRuleEntityAttribute"
    // InternalPagos.g:378:1: entryRuleEntityAttribute : ruleEntityAttribute EOF ;
    public final void entryRuleEntityAttribute() throws RecognitionException {
        try {
            // InternalPagos.g:379:1: ( ruleEntityAttribute EOF )
            // InternalPagos.g:380:1: ruleEntityAttribute EOF
            {
             before(grammarAccess.getEntityAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAttributeRule()); 
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
    // $ANTLR end "entryRuleEntityAttribute"


    // $ANTLR start "ruleEntityAttribute"
    // InternalPagos.g:387:1: ruleEntityAttribute : ( ( rule__EntityAttribute__Group__0 ) ) ;
    public final void ruleEntityAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:391:2: ( ( ( rule__EntityAttribute__Group__0 ) ) )
            // InternalPagos.g:392:2: ( ( rule__EntityAttribute__Group__0 ) )
            {
            // InternalPagos.g:392:2: ( ( rule__EntityAttribute__Group__0 ) )
            // InternalPagos.g:393:3: ( rule__EntityAttribute__Group__0 )
            {
             before(grammarAccess.getEntityAttributeAccess().getGroup()); 
            // InternalPagos.g:394:3: ( rule__EntityAttribute__Group__0 )
            // InternalPagos.g:394:4: rule__EntityAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityAttribute"


    // $ANTLR start "entryRuleFormAttribute"
    // InternalPagos.g:403:1: entryRuleFormAttribute : ruleFormAttribute EOF ;
    public final void entryRuleFormAttribute() throws RecognitionException {
        try {
            // InternalPagos.g:404:1: ( ruleFormAttribute EOF )
            // InternalPagos.g:405:1: ruleFormAttribute EOF
            {
             before(grammarAccess.getFormAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleFormAttribute();

            state._fsp--;

             after(grammarAccess.getFormAttributeRule()); 
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
    // $ANTLR end "entryRuleFormAttribute"


    // $ANTLR start "ruleFormAttribute"
    // InternalPagos.g:412:1: ruleFormAttribute : ( ( rule__FormAttribute__Group__0 ) ) ;
    public final void ruleFormAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:416:2: ( ( ( rule__FormAttribute__Group__0 ) ) )
            // InternalPagos.g:417:2: ( ( rule__FormAttribute__Group__0 ) )
            {
            // InternalPagos.g:417:2: ( ( rule__FormAttribute__Group__0 ) )
            // InternalPagos.g:418:3: ( rule__FormAttribute__Group__0 )
            {
             before(grammarAccess.getFormAttributeAccess().getGroup()); 
            // InternalPagos.g:419:3: ( rule__FormAttribute__Group__0 )
            // InternalPagos.g:419:4: rule__FormAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormAttribute"


    // $ANTLR start "entryRuleVariableAttribute"
    // InternalPagos.g:428:1: entryRuleVariableAttribute : ruleVariableAttribute EOF ;
    public final void entryRuleVariableAttribute() throws RecognitionException {
        try {
            // InternalPagos.g:429:1: ( ruleVariableAttribute EOF )
            // InternalPagos.g:430:1: ruleVariableAttribute EOF
            {
             before(grammarAccess.getVariableAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableAttribute();

            state._fsp--;

             after(grammarAccess.getVariableAttributeRule()); 
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
    // $ANTLR end "entryRuleVariableAttribute"


    // $ANTLR start "ruleVariableAttribute"
    // InternalPagos.g:437:1: ruleVariableAttribute : ( ( rule__VariableAttribute__Group__0 ) ) ;
    public final void ruleVariableAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:441:2: ( ( ( rule__VariableAttribute__Group__0 ) ) )
            // InternalPagos.g:442:2: ( ( rule__VariableAttribute__Group__0 ) )
            {
            // InternalPagos.g:442:2: ( ( rule__VariableAttribute__Group__0 ) )
            // InternalPagos.g:443:3: ( rule__VariableAttribute__Group__0 )
            {
             before(grammarAccess.getVariableAttributeAccess().getGroup()); 
            // InternalPagos.g:444:3: ( rule__VariableAttribute__Group__0 )
            // InternalPagos.g:444:4: rule__VariableAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableAttribute"


    // $ANTLR start "entryRuleTerminalValue"
    // InternalPagos.g:453:1: entryRuleTerminalValue : ruleTerminalValue EOF ;
    public final void entryRuleTerminalValue() throws RecognitionException {
        try {
            // InternalPagos.g:454:1: ( ruleTerminalValue EOF )
            // InternalPagos.g:455:1: ruleTerminalValue EOF
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
    // InternalPagos.g:462:1: ruleTerminalValue : ( ( rule__TerminalValue__Alternatives ) ) ;
    public final void ruleTerminalValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:466:2: ( ( ( rule__TerminalValue__Alternatives ) ) )
            // InternalPagos.g:467:2: ( ( rule__TerminalValue__Alternatives ) )
            {
            // InternalPagos.g:467:2: ( ( rule__TerminalValue__Alternatives ) )
            // InternalPagos.g:468:3: ( rule__TerminalValue__Alternatives )
            {
             before(grammarAccess.getTerminalValueAccess().getAlternatives()); 
            // InternalPagos.g:469:3: ( rule__TerminalValue__Alternatives )
            // InternalPagos.g:469:4: rule__TerminalValue__Alternatives
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
    // InternalPagos.g:478:1: entryRulemathADD : rulemathADD EOF ;
    public final void entryRulemathADD() throws RecognitionException {
        try {
            // InternalPagos.g:479:1: ( rulemathADD EOF )
            // InternalPagos.g:480:1: rulemathADD EOF
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
    // InternalPagos.g:487:1: rulemathADD : ( ( rule__MathADD__Group__0 ) ) ;
    public final void rulemathADD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:491:2: ( ( ( rule__MathADD__Group__0 ) ) )
            // InternalPagos.g:492:2: ( ( rule__MathADD__Group__0 ) )
            {
            // InternalPagos.g:492:2: ( ( rule__MathADD__Group__0 ) )
            // InternalPagos.g:493:3: ( rule__MathADD__Group__0 )
            {
             before(grammarAccess.getMathADDAccess().getGroup()); 
            // InternalPagos.g:494:3: ( rule__MathADD__Group__0 )
            // InternalPagos.g:494:4: rule__MathADD__Group__0
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
    // InternalPagos.g:503:1: entryRulemathMULT : rulemathMULT EOF ;
    public final void entryRulemathMULT() throws RecognitionException {
        try {
            // InternalPagos.g:504:1: ( rulemathMULT EOF )
            // InternalPagos.g:505:1: rulemathMULT EOF
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
    // InternalPagos.g:512:1: rulemathMULT : ( ( rule__MathMULT__Group__0 ) ) ;
    public final void rulemathMULT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:516:2: ( ( ( rule__MathMULT__Group__0 ) ) )
            // InternalPagos.g:517:2: ( ( rule__MathMULT__Group__0 ) )
            {
            // InternalPagos.g:517:2: ( ( rule__MathMULT__Group__0 ) )
            // InternalPagos.g:518:3: ( rule__MathMULT__Group__0 )
            {
             before(grammarAccess.getMathMULTAccess().getGroup()); 
            // InternalPagos.g:519:3: ( rule__MathMULT__Group__0 )
            // InternalPagos.g:519:4: rule__MathMULT__Group__0
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


    // $ANTLR start "rule__ExpresionLogica__Alternatives_1_1"
    // InternalPagos.g:602:1: rule__ExpresionLogica__Alternatives_1_1 : ( ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) ) | ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) ) );
    public final void rule__ExpresionLogica__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:606:1: ( ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) ) | ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT||LA1_0==RULE_ID||LA1_0==45) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPagos.g:607:2: ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) )
                    {
                    // InternalPagos.g:607:2: ( ( rule__ExpresionLogica__Variable2Assignment_1_1_0 ) )
                    // InternalPagos.g:608:3: ( rule__ExpresionLogica__Variable2Assignment_1_1_0 )
                    {
                     before(grammarAccess.getExpresionLogicaAccess().getVariable2Assignment_1_1_0()); 
                    // InternalPagos.g:609:3: ( rule__ExpresionLogica__Variable2Assignment_1_1_0 )
                    // InternalPagos.g:609:4: rule__ExpresionLogica__Variable2Assignment_1_1_0
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
                    // InternalPagos.g:613:2: ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) )
                    {
                    // InternalPagos.g:613:2: ( ( rule__ExpresionLogica__LiteralAssignment_1_1_1 ) )
                    // InternalPagos.g:614:3: ( rule__ExpresionLogica__LiteralAssignment_1_1_1 )
                    {
                     before(grammarAccess.getExpresionLogicaAccess().getLiteralAssignment_1_1_1()); 
                    // InternalPagos.g:615:3: ( rule__ExpresionLogica__LiteralAssignment_1_1_1 )
                    // InternalPagos.g:615:4: rule__ExpresionLogica__LiteralAssignment_1_1_1
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
    // InternalPagos.g:623:1: rule__SigleExp__Alternatives : ( ( ruleTerminalValue ) | ( ( rule__SigleExp__Group_1__0 ) ) );
    public final void rule__SigleExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:627:1: ( ( ruleTerminalValue ) | ( ( rule__SigleExp__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||LA2_0==RULE_ID||LA2_0==45) ) {
                alt2=1;
            }
            else if ( (LA2_0==42) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPagos.g:628:2: ( ruleTerminalValue )
                    {
                    // InternalPagos.g:628:2: ( ruleTerminalValue )
                    // InternalPagos.g:629:3: ruleTerminalValue
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
                    // InternalPagos.g:634:2: ( ( rule__SigleExp__Group_1__0 ) )
                    {
                    // InternalPagos.g:634:2: ( ( rule__SigleExp__Group_1__0 ) )
                    // InternalPagos.g:635:3: ( rule__SigleExp__Group_1__0 )
                    {
                     before(grammarAccess.getSigleExpAccess().getGroup_1()); 
                    // InternalPagos.g:636:3: ( rule__SigleExp__Group_1__0 )
                    // InternalPagos.g:636:4: rule__SigleExp__Group_1__0
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
    // InternalPagos.g:644:1: rule__TerminalValue__Alternatives : ( ( ( rule__TerminalValue__Group_0__0 ) ) | ( ( rule__TerminalValue__ValorAssignment_1 ) ) );
    public final void rule__TerminalValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:648:1: ( ( ( rule__TerminalValue__Group_0__0 ) ) | ( ( rule__TerminalValue__ValorAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT||LA3_0==45) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPagos.g:649:2: ( ( rule__TerminalValue__Group_0__0 ) )
                    {
                    // InternalPagos.g:649:2: ( ( rule__TerminalValue__Group_0__0 ) )
                    // InternalPagos.g:650:3: ( rule__TerminalValue__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalValueAccess().getGroup_0()); 
                    // InternalPagos.g:651:3: ( rule__TerminalValue__Group_0__0 )
                    // InternalPagos.g:651:4: rule__TerminalValue__Group_0__0
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
                    // InternalPagos.g:655:2: ( ( rule__TerminalValue__ValorAssignment_1 ) )
                    {
                    // InternalPagos.g:655:2: ( ( rule__TerminalValue__ValorAssignment_1 ) )
                    // InternalPagos.g:656:3: ( rule__TerminalValue__ValorAssignment_1 )
                    {
                     before(grammarAccess.getTerminalValueAccess().getValorAssignment_1()); 
                    // InternalPagos.g:657:3: ( rule__TerminalValue__ValorAssignment_1 )
                    // InternalPagos.g:657:4: rule__TerminalValue__ValorAssignment_1
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
    // InternalPagos.g:665:1: rule__Number__Alternatives : ( ( ruleEDouble ) | ( ruleInteger ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:669:1: ( ( ruleEDouble ) | ( ruleInteger ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==45) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||LA4_1==RULE_RBRACE||(LA4_1>=RULE_RBRACKET && LA4_1<=RULE_LOGICALCONN)||LA4_1==RULE_OPERADORLOGICO||(LA4_1>=RULE_ADDOP && LA4_1<=RULE_MULTOP)||LA4_1==43) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==45) ) {
                alt4=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPagos.g:670:2: ( ruleEDouble )
                    {
                    // InternalPagos.g:670:2: ( ruleEDouble )
                    // InternalPagos.g:671:3: ruleEDouble
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
                    // InternalPagos.g:676:2: ( ruleInteger )
                    {
                    // InternalPagos.g:676:2: ( ruleInteger )
                    // InternalPagos.g:677:3: ruleInteger
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
    // InternalPagos.g:686:1: rule__EDouble__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:690:1: ( ( 'E' ) | ( 'e' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPagos.g:691:2: ( 'E' )
                    {
                    // InternalPagos.g:691:2: ( 'E' )
                    // InternalPagos.g:692:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:697:2: ( 'e' )
                    {
                    // InternalPagos.g:697:2: ( 'e' )
                    // InternalPagos.g:698:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_1()); 
                    match(input,25,FOLLOW_2); 
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
    // InternalPagos.g:707:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:711:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalPagos.g:712:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalPagos.g:719:1: rule__Application__Group__0__Impl : ( RULE_LBRACE ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:723:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:724:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:724:1: ( RULE_LBRACE )
            // InternalPagos.g:725:2: RULE_LBRACE
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
    // InternalPagos.g:734:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:738:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalPagos.g:739:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalPagos.g:746:1: rule__Application__Group__1__Impl : ( 'name' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:750:1: ( ( 'name' ) )
            // InternalPagos.g:751:1: ( 'name' )
            {
            // InternalPagos.g:751:1: ( 'name' )
            // InternalPagos.g:752:2: 'name'
            {
             before(grammarAccess.getApplicationAccess().getNameKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPagos.g:761:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:765:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalPagos.g:766:2: rule__Application__Group__2__Impl rule__Application__Group__3
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
    // InternalPagos.g:773:1: rule__Application__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:777:1: ( ( RULE_COLON ) )
            // InternalPagos.g:778:1: ( RULE_COLON )
            {
            // InternalPagos.g:778:1: ( RULE_COLON )
            // InternalPagos.g:779:2: RULE_COLON
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
    // InternalPagos.g:788:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:792:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalPagos.g:793:2: rule__Application__Group__3__Impl rule__Application__Group__4
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
    // InternalPagos.g:800:1: rule__Application__Group__3__Impl : ( ( rule__Application__NameAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:804:1: ( ( ( rule__Application__NameAssignment_3 ) ) )
            // InternalPagos.g:805:1: ( ( rule__Application__NameAssignment_3 ) )
            {
            // InternalPagos.g:805:1: ( ( rule__Application__NameAssignment_3 ) )
            // InternalPagos.g:806:2: ( rule__Application__NameAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_3()); 
            // InternalPagos.g:807:2: ( rule__Application__NameAssignment_3 )
            // InternalPagos.g:807:3: rule__Application__NameAssignment_3
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
    // InternalPagos.g:815:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:819:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalPagos.g:820:2: rule__Application__Group__4__Impl rule__Application__Group__5
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
    // InternalPagos.g:827:1: rule__Application__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:831:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:832:1: ( RULE_COMMA )
            {
            // InternalPagos.g:832:1: ( RULE_COMMA )
            // InternalPagos.g:833:2: RULE_COMMA
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
    // InternalPagos.g:842:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:846:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalPagos.g:847:2: rule__Application__Group__5__Impl rule__Application__Group__6
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
    // InternalPagos.g:854:1: rule__Application__Group__5__Impl : ( 'intermediary' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:858:1: ( ( 'intermediary' ) )
            // InternalPagos.g:859:1: ( 'intermediary' )
            {
            // InternalPagos.g:859:1: ( 'intermediary' )
            // InternalPagos.g:860:2: 'intermediary'
            {
             before(grammarAccess.getApplicationAccess().getIntermediaryKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPagos.g:869:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:873:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // InternalPagos.g:874:2: rule__Application__Group__6__Impl rule__Application__Group__7
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
    // InternalPagos.g:881:1: rule__Application__Group__6__Impl : ( RULE_COLON ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:885:1: ( ( RULE_COLON ) )
            // InternalPagos.g:886:1: ( RULE_COLON )
            {
            // InternalPagos.g:886:1: ( RULE_COLON )
            // InternalPagos.g:887:2: RULE_COLON
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
    // InternalPagos.g:896:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:900:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // InternalPagos.g:901:2: rule__Application__Group__7__Impl rule__Application__Group__8
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
    // InternalPagos.g:908:1: rule__Application__Group__7__Impl : ( ( rule__Application__IntermediaryAssignment_7 ) ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:912:1: ( ( ( rule__Application__IntermediaryAssignment_7 ) ) )
            // InternalPagos.g:913:1: ( ( rule__Application__IntermediaryAssignment_7 ) )
            {
            // InternalPagos.g:913:1: ( ( rule__Application__IntermediaryAssignment_7 ) )
            // InternalPagos.g:914:2: ( rule__Application__IntermediaryAssignment_7 )
            {
             before(grammarAccess.getApplicationAccess().getIntermediaryAssignment_7()); 
            // InternalPagos.g:915:2: ( rule__Application__IntermediaryAssignment_7 )
            // InternalPagos.g:915:3: rule__Application__IntermediaryAssignment_7
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
    // InternalPagos.g:923:1: rule__Application__Group__8 : rule__Application__Group__8__Impl ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:927:1: ( rule__Application__Group__8__Impl )
            // InternalPagos.g:928:2: rule__Application__Group__8__Impl
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
    // InternalPagos.g:934:1: rule__Application__Group__8__Impl : ( RULE_RBRACE ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:938:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:939:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:939:1: ( RULE_RBRACE )
            // InternalPagos.g:940:2: RULE_RBRACE
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
    // InternalPagos.g:950:1: rule__Intermediary__Group__0 : rule__Intermediary__Group__0__Impl rule__Intermediary__Group__1 ;
    public final void rule__Intermediary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:954:1: ( rule__Intermediary__Group__0__Impl rule__Intermediary__Group__1 )
            // InternalPagos.g:955:2: rule__Intermediary__Group__0__Impl rule__Intermediary__Group__1
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
    // InternalPagos.g:962:1: rule__Intermediary__Group__0__Impl : ( () ) ;
    public final void rule__Intermediary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:966:1: ( ( () ) )
            // InternalPagos.g:967:1: ( () )
            {
            // InternalPagos.g:967:1: ( () )
            // InternalPagos.g:968:2: ()
            {
             before(grammarAccess.getIntermediaryAccess().getIntermediaryAction_0()); 
            // InternalPagos.g:969:2: ()
            // InternalPagos.g:969:3: 
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
    // InternalPagos.g:977:1: rule__Intermediary__Group__1 : rule__Intermediary__Group__1__Impl rule__Intermediary__Group__2 ;
    public final void rule__Intermediary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:981:1: ( rule__Intermediary__Group__1__Impl rule__Intermediary__Group__2 )
            // InternalPagos.g:982:2: rule__Intermediary__Group__1__Impl rule__Intermediary__Group__2
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
    // InternalPagos.g:989:1: rule__Intermediary__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Intermediary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:993:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:994:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:994:1: ( RULE_LBRACE )
            // InternalPagos.g:995:2: RULE_LBRACE
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
    // InternalPagos.g:1004:1: rule__Intermediary__Group__2 : rule__Intermediary__Group__2__Impl rule__Intermediary__Group__3 ;
    public final void rule__Intermediary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1008:1: ( rule__Intermediary__Group__2__Impl rule__Intermediary__Group__3 )
            // InternalPagos.g:1009:2: rule__Intermediary__Group__2__Impl rule__Intermediary__Group__3
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
    // InternalPagos.g:1016:1: rule__Intermediary__Group__2__Impl : ( 'name' ) ;
    public final void rule__Intermediary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1020:1: ( ( 'name' ) )
            // InternalPagos.g:1021:1: ( 'name' )
            {
            // InternalPagos.g:1021:1: ( 'name' )
            // InternalPagos.g:1022:2: 'name'
            {
             before(grammarAccess.getIntermediaryAccess().getNameKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPagos.g:1031:1: rule__Intermediary__Group__3 : rule__Intermediary__Group__3__Impl rule__Intermediary__Group__4 ;
    public final void rule__Intermediary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1035:1: ( rule__Intermediary__Group__3__Impl rule__Intermediary__Group__4 )
            // InternalPagos.g:1036:2: rule__Intermediary__Group__3__Impl rule__Intermediary__Group__4
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
    // InternalPagos.g:1043:1: rule__Intermediary__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Intermediary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1047:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1048:1: ( RULE_COLON )
            {
            // InternalPagos.g:1048:1: ( RULE_COLON )
            // InternalPagos.g:1049:2: RULE_COLON
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
    // InternalPagos.g:1058:1: rule__Intermediary__Group__4 : rule__Intermediary__Group__4__Impl rule__Intermediary__Group__5 ;
    public final void rule__Intermediary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1062:1: ( rule__Intermediary__Group__4__Impl rule__Intermediary__Group__5 )
            // InternalPagos.g:1063:2: rule__Intermediary__Group__4__Impl rule__Intermediary__Group__5
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
    // InternalPagos.g:1070:1: rule__Intermediary__Group__4__Impl : ( ( rule__Intermediary__NameAssignment_4 ) ) ;
    public final void rule__Intermediary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1074:1: ( ( ( rule__Intermediary__NameAssignment_4 ) ) )
            // InternalPagos.g:1075:1: ( ( rule__Intermediary__NameAssignment_4 ) )
            {
            // InternalPagos.g:1075:1: ( ( rule__Intermediary__NameAssignment_4 ) )
            // InternalPagos.g:1076:2: ( rule__Intermediary__NameAssignment_4 )
            {
             before(grammarAccess.getIntermediaryAccess().getNameAssignment_4()); 
            // InternalPagos.g:1077:2: ( rule__Intermediary__NameAssignment_4 )
            // InternalPagos.g:1077:3: rule__Intermediary__NameAssignment_4
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
    // InternalPagos.g:1085:1: rule__Intermediary__Group__5 : rule__Intermediary__Group__5__Impl rule__Intermediary__Group__6 ;
    public final void rule__Intermediary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1089:1: ( rule__Intermediary__Group__5__Impl rule__Intermediary__Group__6 )
            // InternalPagos.g:1090:2: rule__Intermediary__Group__5__Impl rule__Intermediary__Group__6
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
    // InternalPagos.g:1097:1: rule__Intermediary__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Intermediary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1101:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1102:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1102:1: ( RULE_COMMA )
            // InternalPagos.g:1103:2: RULE_COMMA
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
    // InternalPagos.g:1112:1: rule__Intermediary__Group__6 : rule__Intermediary__Group__6__Impl rule__Intermediary__Group__7 ;
    public final void rule__Intermediary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1116:1: ( rule__Intermediary__Group__6__Impl rule__Intermediary__Group__7 )
            // InternalPagos.g:1117:2: rule__Intermediary__Group__6__Impl rule__Intermediary__Group__7
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
    // InternalPagos.g:1124:1: rule__Intermediary__Group__6__Impl : ( 'superentities' ) ;
    public final void rule__Intermediary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1128:1: ( ( 'superentities' ) )
            // InternalPagos.g:1129:1: ( 'superentities' )
            {
            // InternalPagos.g:1129:1: ( 'superentities' )
            // InternalPagos.g:1130:2: 'superentities'
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitiesKeyword_6()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPagos.g:1139:1: rule__Intermediary__Group__7 : rule__Intermediary__Group__7__Impl rule__Intermediary__Group__8 ;
    public final void rule__Intermediary__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1143:1: ( rule__Intermediary__Group__7__Impl rule__Intermediary__Group__8 )
            // InternalPagos.g:1144:2: rule__Intermediary__Group__7__Impl rule__Intermediary__Group__8
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
    // InternalPagos.g:1151:1: rule__Intermediary__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__Intermediary__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1155:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1156:1: ( RULE_COLON )
            {
            // InternalPagos.g:1156:1: ( RULE_COLON )
            // InternalPagos.g:1157:2: RULE_COLON
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
    // InternalPagos.g:1166:1: rule__Intermediary__Group__8 : rule__Intermediary__Group__8__Impl rule__Intermediary__Group__9 ;
    public final void rule__Intermediary__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1170:1: ( rule__Intermediary__Group__8__Impl rule__Intermediary__Group__9 )
            // InternalPagos.g:1171:2: rule__Intermediary__Group__8__Impl rule__Intermediary__Group__9
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
    // InternalPagos.g:1178:1: rule__Intermediary__Group__8__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Intermediary__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1182:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:1183:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:1183:1: ( RULE_LBRACKET )
            // InternalPagos.g:1184:2: RULE_LBRACKET
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
    // InternalPagos.g:1193:1: rule__Intermediary__Group__9 : rule__Intermediary__Group__9__Impl rule__Intermediary__Group__10 ;
    public final void rule__Intermediary__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1197:1: ( rule__Intermediary__Group__9__Impl rule__Intermediary__Group__10 )
            // InternalPagos.g:1198:2: rule__Intermediary__Group__9__Impl rule__Intermediary__Group__10
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
    // InternalPagos.g:1205:1: rule__Intermediary__Group__9__Impl : ( ( rule__Intermediary__SuperentitieAssignment_9 ) ) ;
    public final void rule__Intermediary__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1209:1: ( ( ( rule__Intermediary__SuperentitieAssignment_9 ) ) )
            // InternalPagos.g:1210:1: ( ( rule__Intermediary__SuperentitieAssignment_9 ) )
            {
            // InternalPagos.g:1210:1: ( ( rule__Intermediary__SuperentitieAssignment_9 ) )
            // InternalPagos.g:1211:2: ( rule__Intermediary__SuperentitieAssignment_9 )
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitieAssignment_9()); 
            // InternalPagos.g:1212:2: ( rule__Intermediary__SuperentitieAssignment_9 )
            // InternalPagos.g:1212:3: rule__Intermediary__SuperentitieAssignment_9
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
    // InternalPagos.g:1220:1: rule__Intermediary__Group__10 : rule__Intermediary__Group__10__Impl rule__Intermediary__Group__11 ;
    public final void rule__Intermediary__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1224:1: ( rule__Intermediary__Group__10__Impl rule__Intermediary__Group__11 )
            // InternalPagos.g:1225:2: rule__Intermediary__Group__10__Impl rule__Intermediary__Group__11
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
    // InternalPagos.g:1232:1: rule__Intermediary__Group__10__Impl : ( ( rule__Intermediary__Group_10__0 )* ) ;
    public final void rule__Intermediary__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1236:1: ( ( ( rule__Intermediary__Group_10__0 )* ) )
            // InternalPagos.g:1237:1: ( ( rule__Intermediary__Group_10__0 )* )
            {
            // InternalPagos.g:1237:1: ( ( rule__Intermediary__Group_10__0 )* )
            // InternalPagos.g:1238:2: ( rule__Intermediary__Group_10__0 )*
            {
             before(grammarAccess.getIntermediaryAccess().getGroup_10()); 
            // InternalPagos.g:1239:2: ( rule__Intermediary__Group_10__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPagos.g:1239:3: rule__Intermediary__Group_10__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Intermediary__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalPagos.g:1247:1: rule__Intermediary__Group__11 : rule__Intermediary__Group__11__Impl rule__Intermediary__Group__12 ;
    public final void rule__Intermediary__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1251:1: ( rule__Intermediary__Group__11__Impl rule__Intermediary__Group__12 )
            // InternalPagos.g:1252:2: rule__Intermediary__Group__11__Impl rule__Intermediary__Group__12
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
    // InternalPagos.g:1259:1: rule__Intermediary__Group__11__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Intermediary__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1263:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:1264:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:1264:1: ( RULE_RBRACKET )
            // InternalPagos.g:1265:2: RULE_RBRACKET
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
    // InternalPagos.g:1274:1: rule__Intermediary__Group__12 : rule__Intermediary__Group__12__Impl ;
    public final void rule__Intermediary__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1278:1: ( rule__Intermediary__Group__12__Impl )
            // InternalPagos.g:1279:2: rule__Intermediary__Group__12__Impl
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
    // InternalPagos.g:1285:1: rule__Intermediary__Group__12__Impl : ( RULE_RBRACE ) ;
    public final void rule__Intermediary__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1289:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:1290:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:1290:1: ( RULE_RBRACE )
            // InternalPagos.g:1291:2: RULE_RBRACE
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
    // InternalPagos.g:1301:1: rule__Intermediary__Group_10__0 : rule__Intermediary__Group_10__0__Impl rule__Intermediary__Group_10__1 ;
    public final void rule__Intermediary__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1305:1: ( rule__Intermediary__Group_10__0__Impl rule__Intermediary__Group_10__1 )
            // InternalPagos.g:1306:2: rule__Intermediary__Group_10__0__Impl rule__Intermediary__Group_10__1
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
    // InternalPagos.g:1313:1: rule__Intermediary__Group_10__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Intermediary__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1317:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1318:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1318:1: ( RULE_COMMA )
            // InternalPagos.g:1319:2: RULE_COMMA
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
    // InternalPagos.g:1328:1: rule__Intermediary__Group_10__1 : rule__Intermediary__Group_10__1__Impl ;
    public final void rule__Intermediary__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1332:1: ( rule__Intermediary__Group_10__1__Impl )
            // InternalPagos.g:1333:2: rule__Intermediary__Group_10__1__Impl
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
    // InternalPagos.g:1339:1: rule__Intermediary__Group_10__1__Impl : ( ( rule__Intermediary__SuperentitieAssignment_10_1 ) ) ;
    public final void rule__Intermediary__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1343:1: ( ( ( rule__Intermediary__SuperentitieAssignment_10_1 ) ) )
            // InternalPagos.g:1344:1: ( ( rule__Intermediary__SuperentitieAssignment_10_1 ) )
            {
            // InternalPagos.g:1344:1: ( ( rule__Intermediary__SuperentitieAssignment_10_1 ) )
            // InternalPagos.g:1345:2: ( rule__Intermediary__SuperentitieAssignment_10_1 )
            {
             before(grammarAccess.getIntermediaryAccess().getSuperentitieAssignment_10_1()); 
            // InternalPagos.g:1346:2: ( rule__Intermediary__SuperentitieAssignment_10_1 )
            // InternalPagos.g:1346:3: rule__Intermediary__SuperentitieAssignment_10_1
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
    // InternalPagos.g:1355:1: rule__SuperEntity__Group__0 : rule__SuperEntity__Group__0__Impl rule__SuperEntity__Group__1 ;
    public final void rule__SuperEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1359:1: ( rule__SuperEntity__Group__0__Impl rule__SuperEntity__Group__1 )
            // InternalPagos.g:1360:2: rule__SuperEntity__Group__0__Impl rule__SuperEntity__Group__1
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
    // InternalPagos.g:1367:1: rule__SuperEntity__Group__0__Impl : ( () ) ;
    public final void rule__SuperEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1371:1: ( ( () ) )
            // InternalPagos.g:1372:1: ( () )
            {
            // InternalPagos.g:1372:1: ( () )
            // InternalPagos.g:1373:2: ()
            {
             before(grammarAccess.getSuperEntityAccess().getSuperEntityAction_0()); 
            // InternalPagos.g:1374:2: ()
            // InternalPagos.g:1374:3: 
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
    // InternalPagos.g:1382:1: rule__SuperEntity__Group__1 : rule__SuperEntity__Group__1__Impl rule__SuperEntity__Group__2 ;
    public final void rule__SuperEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1386:1: ( rule__SuperEntity__Group__1__Impl rule__SuperEntity__Group__2 )
            // InternalPagos.g:1387:2: rule__SuperEntity__Group__1__Impl rule__SuperEntity__Group__2
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
    // InternalPagos.g:1394:1: rule__SuperEntity__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__SuperEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1398:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:1399:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:1399:1: ( RULE_LBRACE )
            // InternalPagos.g:1400:2: RULE_LBRACE
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
    // InternalPagos.g:1409:1: rule__SuperEntity__Group__2 : rule__SuperEntity__Group__2__Impl rule__SuperEntity__Group__3 ;
    public final void rule__SuperEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1413:1: ( rule__SuperEntity__Group__2__Impl rule__SuperEntity__Group__3 )
            // InternalPagos.g:1414:2: rule__SuperEntity__Group__2__Impl rule__SuperEntity__Group__3
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
    // InternalPagos.g:1421:1: rule__SuperEntity__Group__2__Impl : ( 'name' ) ;
    public final void rule__SuperEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1425:1: ( ( 'name' ) )
            // InternalPagos.g:1426:1: ( 'name' )
            {
            // InternalPagos.g:1426:1: ( 'name' )
            // InternalPagos.g:1427:2: 'name'
            {
             before(grammarAccess.getSuperEntityAccess().getNameKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPagos.g:1436:1: rule__SuperEntity__Group__3 : rule__SuperEntity__Group__3__Impl rule__SuperEntity__Group__4 ;
    public final void rule__SuperEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1440:1: ( rule__SuperEntity__Group__3__Impl rule__SuperEntity__Group__4 )
            // InternalPagos.g:1441:2: rule__SuperEntity__Group__3__Impl rule__SuperEntity__Group__4
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
    // InternalPagos.g:1448:1: rule__SuperEntity__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1452:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1453:1: ( RULE_COLON )
            {
            // InternalPagos.g:1453:1: ( RULE_COLON )
            // InternalPagos.g:1454:2: RULE_COLON
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
    // InternalPagos.g:1463:1: rule__SuperEntity__Group__4 : rule__SuperEntity__Group__4__Impl rule__SuperEntity__Group__5 ;
    public final void rule__SuperEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1467:1: ( rule__SuperEntity__Group__4__Impl rule__SuperEntity__Group__5 )
            // InternalPagos.g:1468:2: rule__SuperEntity__Group__4__Impl rule__SuperEntity__Group__5
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
    // InternalPagos.g:1475:1: rule__SuperEntity__Group__4__Impl : ( ( rule__SuperEntity__NameAssignment_4 ) ) ;
    public final void rule__SuperEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1479:1: ( ( ( rule__SuperEntity__NameAssignment_4 ) ) )
            // InternalPagos.g:1480:1: ( ( rule__SuperEntity__NameAssignment_4 ) )
            {
            // InternalPagos.g:1480:1: ( ( rule__SuperEntity__NameAssignment_4 ) )
            // InternalPagos.g:1481:2: ( rule__SuperEntity__NameAssignment_4 )
            {
             before(grammarAccess.getSuperEntityAccess().getNameAssignment_4()); 
            // InternalPagos.g:1482:2: ( rule__SuperEntity__NameAssignment_4 )
            // InternalPagos.g:1482:3: rule__SuperEntity__NameAssignment_4
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
    // InternalPagos.g:1490:1: rule__SuperEntity__Group__5 : rule__SuperEntity__Group__5__Impl rule__SuperEntity__Group__6 ;
    public final void rule__SuperEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1494:1: ( rule__SuperEntity__Group__5__Impl rule__SuperEntity__Group__6 )
            // InternalPagos.g:1495:2: rule__SuperEntity__Group__5__Impl rule__SuperEntity__Group__6
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
    // InternalPagos.g:1502:1: rule__SuperEntity__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1506:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1507:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1507:1: ( RULE_COMMA )
            // InternalPagos.g:1508:2: RULE_COMMA
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
    // InternalPagos.g:1517:1: rule__SuperEntity__Group__6 : rule__SuperEntity__Group__6__Impl rule__SuperEntity__Group__7 ;
    public final void rule__SuperEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1521:1: ( rule__SuperEntity__Group__6__Impl rule__SuperEntity__Group__7 )
            // InternalPagos.g:1522:2: rule__SuperEntity__Group__6__Impl rule__SuperEntity__Group__7
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
    // InternalPagos.g:1529:1: rule__SuperEntity__Group__6__Impl : ( 'description' ) ;
    public final void rule__SuperEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1533:1: ( ( 'description' ) )
            // InternalPagos.g:1534:1: ( 'description' )
            {
            // InternalPagos.g:1534:1: ( 'description' )
            // InternalPagos.g:1535:2: 'description'
            {
             before(grammarAccess.getSuperEntityAccess().getDescriptionKeyword_6()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPagos.g:1544:1: rule__SuperEntity__Group__7 : rule__SuperEntity__Group__7__Impl rule__SuperEntity__Group__8 ;
    public final void rule__SuperEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1548:1: ( rule__SuperEntity__Group__7__Impl rule__SuperEntity__Group__8 )
            // InternalPagos.g:1549:2: rule__SuperEntity__Group__7__Impl rule__SuperEntity__Group__8
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
    // InternalPagos.g:1556:1: rule__SuperEntity__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1560:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1561:1: ( RULE_COLON )
            {
            // InternalPagos.g:1561:1: ( RULE_COLON )
            // InternalPagos.g:1562:2: RULE_COLON
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
    // InternalPagos.g:1571:1: rule__SuperEntity__Group__8 : rule__SuperEntity__Group__8__Impl rule__SuperEntity__Group__9 ;
    public final void rule__SuperEntity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1575:1: ( rule__SuperEntity__Group__8__Impl rule__SuperEntity__Group__9 )
            // InternalPagos.g:1576:2: rule__SuperEntity__Group__8__Impl rule__SuperEntity__Group__9
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
    // InternalPagos.g:1583:1: rule__SuperEntity__Group__8__Impl : ( ( rule__SuperEntity__DescriptionAssignment_8 ) ) ;
    public final void rule__SuperEntity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1587:1: ( ( ( rule__SuperEntity__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:1588:1: ( ( rule__SuperEntity__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:1588:1: ( ( rule__SuperEntity__DescriptionAssignment_8 ) )
            // InternalPagos.g:1589:2: ( rule__SuperEntity__DescriptionAssignment_8 )
            {
             before(grammarAccess.getSuperEntityAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:1590:2: ( rule__SuperEntity__DescriptionAssignment_8 )
            // InternalPagos.g:1590:3: rule__SuperEntity__DescriptionAssignment_8
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
    // InternalPagos.g:1598:1: rule__SuperEntity__Group__9 : rule__SuperEntity__Group__9__Impl rule__SuperEntity__Group__10 ;
    public final void rule__SuperEntity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1602:1: ( rule__SuperEntity__Group__9__Impl rule__SuperEntity__Group__10 )
            // InternalPagos.g:1603:2: rule__SuperEntity__Group__9__Impl rule__SuperEntity__Group__10
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
    // InternalPagos.g:1610:1: rule__SuperEntity__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1614:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1615:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1615:1: ( RULE_COMMA )
            // InternalPagos.g:1616:2: RULE_COMMA
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
    // InternalPagos.g:1625:1: rule__SuperEntity__Group__10 : rule__SuperEntity__Group__10__Impl rule__SuperEntity__Group__11 ;
    public final void rule__SuperEntity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1629:1: ( rule__SuperEntity__Group__10__Impl rule__SuperEntity__Group__11 )
            // InternalPagos.g:1630:2: rule__SuperEntity__Group__10__Impl rule__SuperEntity__Group__11
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
    // InternalPagos.g:1637:1: rule__SuperEntity__Group__10__Impl : ( 'attributes' ) ;
    public final void rule__SuperEntity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1641:1: ( ( 'attributes' ) )
            // InternalPagos.g:1642:1: ( 'attributes' )
            {
            // InternalPagos.g:1642:1: ( 'attributes' )
            // InternalPagos.g:1643:2: 'attributes'
            {
             before(grammarAccess.getSuperEntityAccess().getAttributesKeyword_10()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPagos.g:1652:1: rule__SuperEntity__Group__11 : rule__SuperEntity__Group__11__Impl rule__SuperEntity__Group__12 ;
    public final void rule__SuperEntity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1656:1: ( rule__SuperEntity__Group__11__Impl rule__SuperEntity__Group__12 )
            // InternalPagos.g:1657:2: rule__SuperEntity__Group__11__Impl rule__SuperEntity__Group__12
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
    // InternalPagos.g:1664:1: rule__SuperEntity__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1668:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1669:1: ( RULE_COLON )
            {
            // InternalPagos.g:1669:1: ( RULE_COLON )
            // InternalPagos.g:1670:2: RULE_COLON
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
    // InternalPagos.g:1679:1: rule__SuperEntity__Group__12 : rule__SuperEntity__Group__12__Impl rule__SuperEntity__Group__13 ;
    public final void rule__SuperEntity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1683:1: ( rule__SuperEntity__Group__12__Impl rule__SuperEntity__Group__13 )
            // InternalPagos.g:1684:2: rule__SuperEntity__Group__12__Impl rule__SuperEntity__Group__13
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
    // InternalPagos.g:1691:1: rule__SuperEntity__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__SuperEntity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1695:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:1696:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:1696:1: ( RULE_LBRACKET )
            // InternalPagos.g:1697:2: RULE_LBRACKET
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
    // InternalPagos.g:1706:1: rule__SuperEntity__Group__13 : rule__SuperEntity__Group__13__Impl rule__SuperEntity__Group__14 ;
    public final void rule__SuperEntity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1710:1: ( rule__SuperEntity__Group__13__Impl rule__SuperEntity__Group__14 )
            // InternalPagos.g:1711:2: rule__SuperEntity__Group__13__Impl rule__SuperEntity__Group__14
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
    // InternalPagos.g:1718:1: rule__SuperEntity__Group__13__Impl : ( ( rule__SuperEntity__AttListsAssignment_13 ) ) ;
    public final void rule__SuperEntity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1722:1: ( ( ( rule__SuperEntity__AttListsAssignment_13 ) ) )
            // InternalPagos.g:1723:1: ( ( rule__SuperEntity__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:1723:1: ( ( rule__SuperEntity__AttListsAssignment_13 ) )
            // InternalPagos.g:1724:2: ( rule__SuperEntity__AttListsAssignment_13 )
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:1725:2: ( rule__SuperEntity__AttListsAssignment_13 )
            // InternalPagos.g:1725:3: rule__SuperEntity__AttListsAssignment_13
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
    // InternalPagos.g:1733:1: rule__SuperEntity__Group__14 : rule__SuperEntity__Group__14__Impl rule__SuperEntity__Group__15 ;
    public final void rule__SuperEntity__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1737:1: ( rule__SuperEntity__Group__14__Impl rule__SuperEntity__Group__15 )
            // InternalPagos.g:1738:2: rule__SuperEntity__Group__14__Impl rule__SuperEntity__Group__15
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
    // InternalPagos.g:1745:1: rule__SuperEntity__Group__14__Impl : ( ( rule__SuperEntity__Group_14__0 )* ) ;
    public final void rule__SuperEntity__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1749:1: ( ( ( rule__SuperEntity__Group_14__0 )* ) )
            // InternalPagos.g:1750:1: ( ( rule__SuperEntity__Group_14__0 )* )
            {
            // InternalPagos.g:1750:1: ( ( rule__SuperEntity__Group_14__0 )* )
            // InternalPagos.g:1751:2: ( rule__SuperEntity__Group_14__0 )*
            {
             before(grammarAccess.getSuperEntityAccess().getGroup_14()); 
            // InternalPagos.g:1752:2: ( rule__SuperEntity__Group_14__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPagos.g:1752:3: rule__SuperEntity__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SuperEntity__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalPagos.g:1760:1: rule__SuperEntity__Group__15 : rule__SuperEntity__Group__15__Impl rule__SuperEntity__Group__16 ;
    public final void rule__SuperEntity__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1764:1: ( rule__SuperEntity__Group__15__Impl rule__SuperEntity__Group__16 )
            // InternalPagos.g:1765:2: rule__SuperEntity__Group__15__Impl rule__SuperEntity__Group__16
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
    // InternalPagos.g:1772:1: rule__SuperEntity__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__SuperEntity__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1776:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:1777:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:1777:1: ( RULE_RBRACKET )
            // InternalPagos.g:1778:2: RULE_RBRACKET
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
    // InternalPagos.g:1787:1: rule__SuperEntity__Group__16 : rule__SuperEntity__Group__16__Impl rule__SuperEntity__Group__17 ;
    public final void rule__SuperEntity__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1791:1: ( rule__SuperEntity__Group__16__Impl rule__SuperEntity__Group__17 )
            // InternalPagos.g:1792:2: rule__SuperEntity__Group__16__Impl rule__SuperEntity__Group__17
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
    // InternalPagos.g:1799:1: rule__SuperEntity__Group__16__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1803:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:1804:1: ( RULE_COMMA )
            {
            // InternalPagos.g:1804:1: ( RULE_COMMA )
            // InternalPagos.g:1805:2: RULE_COMMA
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
    // InternalPagos.g:1814:1: rule__SuperEntity__Group__17 : rule__SuperEntity__Group__17__Impl rule__SuperEntity__Group__18 ;
    public final void rule__SuperEntity__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1818:1: ( rule__SuperEntity__Group__17__Impl rule__SuperEntity__Group__18 )
            // InternalPagos.g:1819:2: rule__SuperEntity__Group__17__Impl rule__SuperEntity__Group__18
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
    // InternalPagos.g:1826:1: rule__SuperEntity__Group__17__Impl : ( 'entities' ) ;
    public final void rule__SuperEntity__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1830:1: ( ( 'entities' ) )
            // InternalPagos.g:1831:1: ( 'entities' )
            {
            // InternalPagos.g:1831:1: ( 'entities' )
            // InternalPagos.g:1832:2: 'entities'
            {
             before(grammarAccess.getSuperEntityAccess().getEntitiesKeyword_17()); 
            match(input,31,FOLLOW_2); 
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
    // InternalPagos.g:1841:1: rule__SuperEntity__Group__18 : rule__SuperEntity__Group__18__Impl rule__SuperEntity__Group__19 ;
    public final void rule__SuperEntity__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1845:1: ( rule__SuperEntity__Group__18__Impl rule__SuperEntity__Group__19 )
            // InternalPagos.g:1846:2: rule__SuperEntity__Group__18__Impl rule__SuperEntity__Group__19
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
    // InternalPagos.g:1853:1: rule__SuperEntity__Group__18__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntity__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1857:1: ( ( RULE_COLON ) )
            // InternalPagos.g:1858:1: ( RULE_COLON )
            {
            // InternalPagos.g:1858:1: ( RULE_COLON )
            // InternalPagos.g:1859:2: RULE_COLON
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
    // InternalPagos.g:1868:1: rule__SuperEntity__Group__19 : rule__SuperEntity__Group__19__Impl rule__SuperEntity__Group__20 ;
    public final void rule__SuperEntity__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1872:1: ( rule__SuperEntity__Group__19__Impl rule__SuperEntity__Group__20 )
            // InternalPagos.g:1873:2: rule__SuperEntity__Group__19__Impl rule__SuperEntity__Group__20
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
    // InternalPagos.g:1880:1: rule__SuperEntity__Group__19__Impl : ( RULE_LBRACKET ) ;
    public final void rule__SuperEntity__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1884:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:1885:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:1885:1: ( RULE_LBRACKET )
            // InternalPagos.g:1886:2: RULE_LBRACKET
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
    // InternalPagos.g:1895:1: rule__SuperEntity__Group__20 : rule__SuperEntity__Group__20__Impl rule__SuperEntity__Group__21 ;
    public final void rule__SuperEntity__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1899:1: ( rule__SuperEntity__Group__20__Impl rule__SuperEntity__Group__21 )
            // InternalPagos.g:1900:2: rule__SuperEntity__Group__20__Impl rule__SuperEntity__Group__21
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
    // InternalPagos.g:1907:1: rule__SuperEntity__Group__20__Impl : ( ( rule__SuperEntity__ParticipanteAssignment_20 ) ) ;
    public final void rule__SuperEntity__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1911:1: ( ( ( rule__SuperEntity__ParticipanteAssignment_20 ) ) )
            // InternalPagos.g:1912:1: ( ( rule__SuperEntity__ParticipanteAssignment_20 ) )
            {
            // InternalPagos.g:1912:1: ( ( rule__SuperEntity__ParticipanteAssignment_20 ) )
            // InternalPagos.g:1913:2: ( rule__SuperEntity__ParticipanteAssignment_20 )
            {
             before(grammarAccess.getSuperEntityAccess().getParticipanteAssignment_20()); 
            // InternalPagos.g:1914:2: ( rule__SuperEntity__ParticipanteAssignment_20 )
            // InternalPagos.g:1914:3: rule__SuperEntity__ParticipanteAssignment_20
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
    // InternalPagos.g:1922:1: rule__SuperEntity__Group__21 : rule__SuperEntity__Group__21__Impl rule__SuperEntity__Group__22 ;
    public final void rule__SuperEntity__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1926:1: ( rule__SuperEntity__Group__21__Impl rule__SuperEntity__Group__22 )
            // InternalPagos.g:1927:2: rule__SuperEntity__Group__21__Impl rule__SuperEntity__Group__22
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
    // InternalPagos.g:1934:1: rule__SuperEntity__Group__21__Impl : ( ( rule__SuperEntity__Group_21__0 )* ) ;
    public final void rule__SuperEntity__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1938:1: ( ( ( rule__SuperEntity__Group_21__0 )* ) )
            // InternalPagos.g:1939:1: ( ( rule__SuperEntity__Group_21__0 )* )
            {
            // InternalPagos.g:1939:1: ( ( rule__SuperEntity__Group_21__0 )* )
            // InternalPagos.g:1940:2: ( rule__SuperEntity__Group_21__0 )*
            {
             before(grammarAccess.getSuperEntityAccess().getGroup_21()); 
            // InternalPagos.g:1941:2: ( rule__SuperEntity__Group_21__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPagos.g:1941:3: rule__SuperEntity__Group_21__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SuperEntity__Group_21__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalPagos.g:1949:1: rule__SuperEntity__Group__22 : rule__SuperEntity__Group__22__Impl rule__SuperEntity__Group__23 ;
    public final void rule__SuperEntity__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1953:1: ( rule__SuperEntity__Group__22__Impl rule__SuperEntity__Group__23 )
            // InternalPagos.g:1954:2: rule__SuperEntity__Group__22__Impl rule__SuperEntity__Group__23
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
    // InternalPagos.g:1961:1: rule__SuperEntity__Group__22__Impl : ( RULE_RBRACKET ) ;
    public final void rule__SuperEntity__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1965:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:1966:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:1966:1: ( RULE_RBRACKET )
            // InternalPagos.g:1967:2: RULE_RBRACKET
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
    // InternalPagos.g:1976:1: rule__SuperEntity__Group__23 : rule__SuperEntity__Group__23__Impl ;
    public final void rule__SuperEntity__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1980:1: ( rule__SuperEntity__Group__23__Impl )
            // InternalPagos.g:1981:2: rule__SuperEntity__Group__23__Impl
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
    // InternalPagos.g:1987:1: rule__SuperEntity__Group__23__Impl : ( RULE_RBRACE ) ;
    public final void rule__SuperEntity__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:1991:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:1992:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:1992:1: ( RULE_RBRACE )
            // InternalPagos.g:1993:2: RULE_RBRACE
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
    // InternalPagos.g:2003:1: rule__SuperEntity__Group_14__0 : rule__SuperEntity__Group_14__0__Impl rule__SuperEntity__Group_14__1 ;
    public final void rule__SuperEntity__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2007:1: ( rule__SuperEntity__Group_14__0__Impl rule__SuperEntity__Group_14__1 )
            // InternalPagos.g:2008:2: rule__SuperEntity__Group_14__0__Impl rule__SuperEntity__Group_14__1
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
    // InternalPagos.g:2015:1: rule__SuperEntity__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2019:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2020:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2020:1: ( RULE_COMMA )
            // InternalPagos.g:2021:2: RULE_COMMA
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
    // InternalPagos.g:2030:1: rule__SuperEntity__Group_14__1 : rule__SuperEntity__Group_14__1__Impl ;
    public final void rule__SuperEntity__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2034:1: ( rule__SuperEntity__Group_14__1__Impl )
            // InternalPagos.g:2035:2: rule__SuperEntity__Group_14__1__Impl
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
    // InternalPagos.g:2041:1: rule__SuperEntity__Group_14__1__Impl : ( ( rule__SuperEntity__AttListsAssignment_14_1 ) ) ;
    public final void rule__SuperEntity__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2045:1: ( ( ( rule__SuperEntity__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:2046:1: ( ( rule__SuperEntity__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:2046:1: ( ( rule__SuperEntity__AttListsAssignment_14_1 ) )
            // InternalPagos.g:2047:2: ( rule__SuperEntity__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:2048:2: ( rule__SuperEntity__AttListsAssignment_14_1 )
            // InternalPagos.g:2048:3: rule__SuperEntity__AttListsAssignment_14_1
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
    // InternalPagos.g:2057:1: rule__SuperEntity__Group_21__0 : rule__SuperEntity__Group_21__0__Impl rule__SuperEntity__Group_21__1 ;
    public final void rule__SuperEntity__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2061:1: ( rule__SuperEntity__Group_21__0__Impl rule__SuperEntity__Group_21__1 )
            // InternalPagos.g:2062:2: rule__SuperEntity__Group_21__0__Impl rule__SuperEntity__Group_21__1
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
    // InternalPagos.g:2069:1: rule__SuperEntity__Group_21__0__Impl : ( RULE_COMMA ) ;
    public final void rule__SuperEntity__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2073:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2074:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2074:1: ( RULE_COMMA )
            // InternalPagos.g:2075:2: RULE_COMMA
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
    // InternalPagos.g:2084:1: rule__SuperEntity__Group_21__1 : rule__SuperEntity__Group_21__1__Impl ;
    public final void rule__SuperEntity__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2088:1: ( rule__SuperEntity__Group_21__1__Impl )
            // InternalPagos.g:2089:2: rule__SuperEntity__Group_21__1__Impl
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
    // InternalPagos.g:2095:1: rule__SuperEntity__Group_21__1__Impl : ( ( rule__SuperEntity__ParticipanteAssignment_21_1 ) ) ;
    public final void rule__SuperEntity__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2099:1: ( ( ( rule__SuperEntity__ParticipanteAssignment_21_1 ) ) )
            // InternalPagos.g:2100:1: ( ( rule__SuperEntity__ParticipanteAssignment_21_1 ) )
            {
            // InternalPagos.g:2100:1: ( ( rule__SuperEntity__ParticipanteAssignment_21_1 ) )
            // InternalPagos.g:2101:2: ( rule__SuperEntity__ParticipanteAssignment_21_1 )
            {
             before(grammarAccess.getSuperEntityAccess().getParticipanteAssignment_21_1()); 
            // InternalPagos.g:2102:2: ( rule__SuperEntity__ParticipanteAssignment_21_1 )
            // InternalPagos.g:2102:3: rule__SuperEntity__ParticipanteAssignment_21_1
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
    // InternalPagos.g:2111:1: rule__Participant__Group__0 : rule__Participant__Group__0__Impl rule__Participant__Group__1 ;
    public final void rule__Participant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2115:1: ( rule__Participant__Group__0__Impl rule__Participant__Group__1 )
            // InternalPagos.g:2116:2: rule__Participant__Group__0__Impl rule__Participant__Group__1
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
    // InternalPagos.g:2123:1: rule__Participant__Group__0__Impl : ( () ) ;
    public final void rule__Participant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2127:1: ( ( () ) )
            // InternalPagos.g:2128:1: ( () )
            {
            // InternalPagos.g:2128:1: ( () )
            // InternalPagos.g:2129:2: ()
            {
             before(grammarAccess.getParticipantAccess().getParticipantAction_0()); 
            // InternalPagos.g:2130:2: ()
            // InternalPagos.g:2130:3: 
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
    // InternalPagos.g:2138:1: rule__Participant__Group__1 : rule__Participant__Group__1__Impl rule__Participant__Group__2 ;
    public final void rule__Participant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2142:1: ( rule__Participant__Group__1__Impl rule__Participant__Group__2 )
            // InternalPagos.g:2143:2: rule__Participant__Group__1__Impl rule__Participant__Group__2
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
    // InternalPagos.g:2150:1: rule__Participant__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Participant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2154:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:2155:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:2155:1: ( RULE_LBRACE )
            // InternalPagos.g:2156:2: RULE_LBRACE
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
    // InternalPagos.g:2165:1: rule__Participant__Group__2 : rule__Participant__Group__2__Impl rule__Participant__Group__3 ;
    public final void rule__Participant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2169:1: ( rule__Participant__Group__2__Impl rule__Participant__Group__3 )
            // InternalPagos.g:2170:2: rule__Participant__Group__2__Impl rule__Participant__Group__3
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
    // InternalPagos.g:2177:1: rule__Participant__Group__2__Impl : ( 'name' ) ;
    public final void rule__Participant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2181:1: ( ( 'name' ) )
            // InternalPagos.g:2182:1: ( 'name' )
            {
            // InternalPagos.g:2182:1: ( 'name' )
            // InternalPagos.g:2183:2: 'name'
            {
             before(grammarAccess.getParticipantAccess().getNameKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPagos.g:2192:1: rule__Participant__Group__3 : rule__Participant__Group__3__Impl rule__Participant__Group__4 ;
    public final void rule__Participant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2196:1: ( rule__Participant__Group__3__Impl rule__Participant__Group__4 )
            // InternalPagos.g:2197:2: rule__Participant__Group__3__Impl rule__Participant__Group__4
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
    // InternalPagos.g:2204:1: rule__Participant__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2208:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2209:1: ( RULE_COLON )
            {
            // InternalPagos.g:2209:1: ( RULE_COLON )
            // InternalPagos.g:2210:2: RULE_COLON
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
    // InternalPagos.g:2219:1: rule__Participant__Group__4 : rule__Participant__Group__4__Impl rule__Participant__Group__5 ;
    public final void rule__Participant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2223:1: ( rule__Participant__Group__4__Impl rule__Participant__Group__5 )
            // InternalPagos.g:2224:2: rule__Participant__Group__4__Impl rule__Participant__Group__5
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
    // InternalPagos.g:2231:1: rule__Participant__Group__4__Impl : ( ( rule__Participant__NameAssignment_4 ) ) ;
    public final void rule__Participant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2235:1: ( ( ( rule__Participant__NameAssignment_4 ) ) )
            // InternalPagos.g:2236:1: ( ( rule__Participant__NameAssignment_4 ) )
            {
            // InternalPagos.g:2236:1: ( ( rule__Participant__NameAssignment_4 ) )
            // InternalPagos.g:2237:2: ( rule__Participant__NameAssignment_4 )
            {
             before(grammarAccess.getParticipantAccess().getNameAssignment_4()); 
            // InternalPagos.g:2238:2: ( rule__Participant__NameAssignment_4 )
            // InternalPagos.g:2238:3: rule__Participant__NameAssignment_4
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
    // InternalPagos.g:2246:1: rule__Participant__Group__5 : rule__Participant__Group__5__Impl rule__Participant__Group__6 ;
    public final void rule__Participant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2250:1: ( rule__Participant__Group__5__Impl rule__Participant__Group__6 )
            // InternalPagos.g:2251:2: rule__Participant__Group__5__Impl rule__Participant__Group__6
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
    // InternalPagos.g:2258:1: rule__Participant__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2262:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2263:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2263:1: ( RULE_COMMA )
            // InternalPagos.g:2264:2: RULE_COMMA
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
    // InternalPagos.g:2273:1: rule__Participant__Group__6 : rule__Participant__Group__6__Impl rule__Participant__Group__7 ;
    public final void rule__Participant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2277:1: ( rule__Participant__Group__6__Impl rule__Participant__Group__7 )
            // InternalPagos.g:2278:2: rule__Participant__Group__6__Impl rule__Participant__Group__7
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
    // InternalPagos.g:2285:1: rule__Participant__Group__6__Impl : ( 'description' ) ;
    public final void rule__Participant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2289:1: ( ( 'description' ) )
            // InternalPagos.g:2290:1: ( 'description' )
            {
            // InternalPagos.g:2290:1: ( 'description' )
            // InternalPagos.g:2291:2: 'description'
            {
             before(grammarAccess.getParticipantAccess().getDescriptionKeyword_6()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPagos.g:2300:1: rule__Participant__Group__7 : rule__Participant__Group__7__Impl rule__Participant__Group__8 ;
    public final void rule__Participant__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2304:1: ( rule__Participant__Group__7__Impl rule__Participant__Group__8 )
            // InternalPagos.g:2305:2: rule__Participant__Group__7__Impl rule__Participant__Group__8
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
    // InternalPagos.g:2312:1: rule__Participant__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2316:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2317:1: ( RULE_COLON )
            {
            // InternalPagos.g:2317:1: ( RULE_COLON )
            // InternalPagos.g:2318:2: RULE_COLON
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
    // InternalPagos.g:2327:1: rule__Participant__Group__8 : rule__Participant__Group__8__Impl rule__Participant__Group__9 ;
    public final void rule__Participant__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2331:1: ( rule__Participant__Group__8__Impl rule__Participant__Group__9 )
            // InternalPagos.g:2332:2: rule__Participant__Group__8__Impl rule__Participant__Group__9
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
    // InternalPagos.g:2339:1: rule__Participant__Group__8__Impl : ( ( rule__Participant__DescriptionAssignment_8 ) ) ;
    public final void rule__Participant__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2343:1: ( ( ( rule__Participant__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:2344:1: ( ( rule__Participant__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:2344:1: ( ( rule__Participant__DescriptionAssignment_8 ) )
            // InternalPagos.g:2345:2: ( rule__Participant__DescriptionAssignment_8 )
            {
             before(grammarAccess.getParticipantAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:2346:2: ( rule__Participant__DescriptionAssignment_8 )
            // InternalPagos.g:2346:3: rule__Participant__DescriptionAssignment_8
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
    // InternalPagos.g:2354:1: rule__Participant__Group__9 : rule__Participant__Group__9__Impl rule__Participant__Group__10 ;
    public final void rule__Participant__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2358:1: ( rule__Participant__Group__9__Impl rule__Participant__Group__10 )
            // InternalPagos.g:2359:2: rule__Participant__Group__9__Impl rule__Participant__Group__10
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
    // InternalPagos.g:2366:1: rule__Participant__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2370:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2371:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2371:1: ( RULE_COMMA )
            // InternalPagos.g:2372:2: RULE_COMMA
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
    // InternalPagos.g:2381:1: rule__Participant__Group__10 : rule__Participant__Group__10__Impl rule__Participant__Group__11 ;
    public final void rule__Participant__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2385:1: ( rule__Participant__Group__10__Impl rule__Participant__Group__11 )
            // InternalPagos.g:2386:2: rule__Participant__Group__10__Impl rule__Participant__Group__11
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
    // InternalPagos.g:2393:1: rule__Participant__Group__10__Impl : ( 'attributes' ) ;
    public final void rule__Participant__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2397:1: ( ( 'attributes' ) )
            // InternalPagos.g:2398:1: ( 'attributes' )
            {
            // InternalPagos.g:2398:1: ( 'attributes' )
            // InternalPagos.g:2399:2: 'attributes'
            {
             before(grammarAccess.getParticipantAccess().getAttributesKeyword_10()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPagos.g:2408:1: rule__Participant__Group__11 : rule__Participant__Group__11__Impl rule__Participant__Group__12 ;
    public final void rule__Participant__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2412:1: ( rule__Participant__Group__11__Impl rule__Participant__Group__12 )
            // InternalPagos.g:2413:2: rule__Participant__Group__11__Impl rule__Participant__Group__12
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
    // InternalPagos.g:2420:1: rule__Participant__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2424:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2425:1: ( RULE_COLON )
            {
            // InternalPagos.g:2425:1: ( RULE_COLON )
            // InternalPagos.g:2426:2: RULE_COLON
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
    // InternalPagos.g:2435:1: rule__Participant__Group__12 : rule__Participant__Group__12__Impl rule__Participant__Group__13 ;
    public final void rule__Participant__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2439:1: ( rule__Participant__Group__12__Impl rule__Participant__Group__13 )
            // InternalPagos.g:2440:2: rule__Participant__Group__12__Impl rule__Participant__Group__13
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
    // InternalPagos.g:2447:1: rule__Participant__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Participant__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2451:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:2452:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:2452:1: ( RULE_LBRACKET )
            // InternalPagos.g:2453:2: RULE_LBRACKET
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
    // InternalPagos.g:2462:1: rule__Participant__Group__13 : rule__Participant__Group__13__Impl rule__Participant__Group__14 ;
    public final void rule__Participant__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2466:1: ( rule__Participant__Group__13__Impl rule__Participant__Group__14 )
            // InternalPagos.g:2467:2: rule__Participant__Group__13__Impl rule__Participant__Group__14
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
    // InternalPagos.g:2474:1: rule__Participant__Group__13__Impl : ( ( rule__Participant__AttListsAssignment_13 ) ) ;
    public final void rule__Participant__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2478:1: ( ( ( rule__Participant__AttListsAssignment_13 ) ) )
            // InternalPagos.g:2479:1: ( ( rule__Participant__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:2479:1: ( ( rule__Participant__AttListsAssignment_13 ) )
            // InternalPagos.g:2480:2: ( rule__Participant__AttListsAssignment_13 )
            {
             before(grammarAccess.getParticipantAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:2481:2: ( rule__Participant__AttListsAssignment_13 )
            // InternalPagos.g:2481:3: rule__Participant__AttListsAssignment_13
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
    // InternalPagos.g:2489:1: rule__Participant__Group__14 : rule__Participant__Group__14__Impl rule__Participant__Group__15 ;
    public final void rule__Participant__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2493:1: ( rule__Participant__Group__14__Impl rule__Participant__Group__15 )
            // InternalPagos.g:2494:2: rule__Participant__Group__14__Impl rule__Participant__Group__15
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
    // InternalPagos.g:2501:1: rule__Participant__Group__14__Impl : ( ( rule__Participant__Group_14__0 )* ) ;
    public final void rule__Participant__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2505:1: ( ( ( rule__Participant__Group_14__0 )* ) )
            // InternalPagos.g:2506:1: ( ( rule__Participant__Group_14__0 )* )
            {
            // InternalPagos.g:2506:1: ( ( rule__Participant__Group_14__0 )* )
            // InternalPagos.g:2507:2: ( rule__Participant__Group_14__0 )*
            {
             before(grammarAccess.getParticipantAccess().getGroup_14()); 
            // InternalPagos.g:2508:2: ( rule__Participant__Group_14__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPagos.g:2508:3: rule__Participant__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Participant__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalPagos.g:2516:1: rule__Participant__Group__15 : rule__Participant__Group__15__Impl rule__Participant__Group__16 ;
    public final void rule__Participant__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2520:1: ( rule__Participant__Group__15__Impl rule__Participant__Group__16 )
            // InternalPagos.g:2521:2: rule__Participant__Group__15__Impl rule__Participant__Group__16
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
    // InternalPagos.g:2528:1: rule__Participant__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Participant__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2532:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:2533:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:2533:1: ( RULE_RBRACKET )
            // InternalPagos.g:2534:2: RULE_RBRACKET
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
    // InternalPagos.g:2543:1: rule__Participant__Group__16 : rule__Participant__Group__16__Impl rule__Participant__Group__17 ;
    public final void rule__Participant__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2547:1: ( rule__Participant__Group__16__Impl rule__Participant__Group__17 )
            // InternalPagos.g:2548:2: rule__Participant__Group__16__Impl rule__Participant__Group__17
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
    // InternalPagos.g:2555:1: rule__Participant__Group__16__Impl : ( RULE_RBRACE ) ;
    public final void rule__Participant__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2559:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:2560:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:2560:1: ( RULE_RBRACE )
            // InternalPagos.g:2561:2: RULE_RBRACE
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
    // InternalPagos.g:2570:1: rule__Participant__Group__17 : rule__Participant__Group__17__Impl rule__Participant__Group__18 ;
    public final void rule__Participant__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2574:1: ( rule__Participant__Group__17__Impl rule__Participant__Group__18 )
            // InternalPagos.g:2575:2: rule__Participant__Group__17__Impl rule__Participant__Group__18
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
    // InternalPagos.g:2582:1: rule__Participant__Group__17__Impl : ( ( rule__Participant__Group_17__0 )? ) ;
    public final void rule__Participant__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2586:1: ( ( ( rule__Participant__Group_17__0 )? ) )
            // InternalPagos.g:2587:1: ( ( rule__Participant__Group_17__0 )? )
            {
            // InternalPagos.g:2587:1: ( ( rule__Participant__Group_17__0 )? )
            // InternalPagos.g:2588:2: ( rule__Participant__Group_17__0 )?
            {
             before(grammarAccess.getParticipantAccess().getGroup_17()); 
            // InternalPagos.g:2589:2: ( rule__Participant__Group_17__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_COMMA) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPagos.g:2589:3: rule__Participant__Group_17__0
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
    // InternalPagos.g:2597:1: rule__Participant__Group__18 : rule__Participant__Group__18__Impl ;
    public final void rule__Participant__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2601:1: ( rule__Participant__Group__18__Impl )
            // InternalPagos.g:2602:2: rule__Participant__Group__18__Impl
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
    // InternalPagos.g:2608:1: rule__Participant__Group__18__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Participant__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2612:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:2613:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:2613:1: ( RULE_RBRACKET )
            // InternalPagos.g:2614:2: RULE_RBRACKET
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
    // InternalPagos.g:2624:1: rule__Participant__Group_14__0 : rule__Participant__Group_14__0__Impl rule__Participant__Group_14__1 ;
    public final void rule__Participant__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2628:1: ( rule__Participant__Group_14__0__Impl rule__Participant__Group_14__1 )
            // InternalPagos.g:2629:2: rule__Participant__Group_14__0__Impl rule__Participant__Group_14__1
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
    // InternalPagos.g:2636:1: rule__Participant__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2640:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2641:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2641:1: ( RULE_COMMA )
            // InternalPagos.g:2642:2: RULE_COMMA
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
    // InternalPagos.g:2651:1: rule__Participant__Group_14__1 : rule__Participant__Group_14__1__Impl ;
    public final void rule__Participant__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2655:1: ( rule__Participant__Group_14__1__Impl )
            // InternalPagos.g:2656:2: rule__Participant__Group_14__1__Impl
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
    // InternalPagos.g:2662:1: rule__Participant__Group_14__1__Impl : ( ( rule__Participant__AttListsAssignment_14_1 ) ) ;
    public final void rule__Participant__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2666:1: ( ( ( rule__Participant__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:2667:1: ( ( rule__Participant__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:2667:1: ( ( rule__Participant__AttListsAssignment_14_1 ) )
            // InternalPagos.g:2668:2: ( rule__Participant__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getParticipantAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:2669:2: ( rule__Participant__AttListsAssignment_14_1 )
            // InternalPagos.g:2669:3: rule__Participant__AttListsAssignment_14_1
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
    // InternalPagos.g:2678:1: rule__Participant__Group_17__0 : rule__Participant__Group_17__0__Impl rule__Participant__Group_17__1 ;
    public final void rule__Participant__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2682:1: ( rule__Participant__Group_17__0__Impl rule__Participant__Group_17__1 )
            // InternalPagos.g:2683:2: rule__Participant__Group_17__0__Impl rule__Participant__Group_17__1
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
    // InternalPagos.g:2690:1: rule__Participant__Group_17__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2694:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2695:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2695:1: ( RULE_COMMA )
            // InternalPagos.g:2696:2: RULE_COMMA
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
    // InternalPagos.g:2705:1: rule__Participant__Group_17__1 : rule__Participant__Group_17__1__Impl rule__Participant__Group_17__2 ;
    public final void rule__Participant__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2709:1: ( rule__Participant__Group_17__1__Impl rule__Participant__Group_17__2 )
            // InternalPagos.g:2710:2: rule__Participant__Group_17__1__Impl rule__Participant__Group_17__2
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
    // InternalPagos.g:2717:1: rule__Participant__Group_17__1__Impl : ( 'InformationTemplate' ) ;
    public final void rule__Participant__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2721:1: ( ( 'InformationTemplate' ) )
            // InternalPagos.g:2722:1: ( 'InformationTemplate' )
            {
            // InternalPagos.g:2722:1: ( 'InformationTemplate' )
            // InternalPagos.g:2723:2: 'InformationTemplate'
            {
             before(grammarAccess.getParticipantAccess().getInformationTemplateKeyword_17_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPagos.g:2732:1: rule__Participant__Group_17__2 : rule__Participant__Group_17__2__Impl rule__Participant__Group_17__3 ;
    public final void rule__Participant__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2736:1: ( rule__Participant__Group_17__2__Impl rule__Participant__Group_17__3 )
            // InternalPagos.g:2737:2: rule__Participant__Group_17__2__Impl rule__Participant__Group_17__3
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
    // InternalPagos.g:2744:1: rule__Participant__Group_17__2__Impl : ( RULE_COLON ) ;
    public final void rule__Participant__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2748:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2749:1: ( RULE_COLON )
            {
            // InternalPagos.g:2749:1: ( RULE_COLON )
            // InternalPagos.g:2750:2: RULE_COLON
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
    // InternalPagos.g:2759:1: rule__Participant__Group_17__3 : rule__Participant__Group_17__3__Impl rule__Participant__Group_17__4 ;
    public final void rule__Participant__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2763:1: ( rule__Participant__Group_17__3__Impl rule__Participant__Group_17__4 )
            // InternalPagos.g:2764:2: rule__Participant__Group_17__3__Impl rule__Participant__Group_17__4
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
    // InternalPagos.g:2771:1: rule__Participant__Group_17__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Participant__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2775:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:2776:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:2776:1: ( RULE_LBRACKET )
            // InternalPagos.g:2777:2: RULE_LBRACKET
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
    // InternalPagos.g:2786:1: rule__Participant__Group_17__4 : rule__Participant__Group_17__4__Impl rule__Participant__Group_17__5 ;
    public final void rule__Participant__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2790:1: ( rule__Participant__Group_17__4__Impl rule__Participant__Group_17__5 )
            // InternalPagos.g:2791:2: rule__Participant__Group_17__4__Impl rule__Participant__Group_17__5
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
    // InternalPagos.g:2798:1: rule__Participant__Group_17__4__Impl : ( ( rule__Participant__TemplatesFormAssignment_17_4 ) ) ;
    public final void rule__Participant__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2802:1: ( ( ( rule__Participant__TemplatesFormAssignment_17_4 ) ) )
            // InternalPagos.g:2803:1: ( ( rule__Participant__TemplatesFormAssignment_17_4 ) )
            {
            // InternalPagos.g:2803:1: ( ( rule__Participant__TemplatesFormAssignment_17_4 ) )
            // InternalPagos.g:2804:2: ( rule__Participant__TemplatesFormAssignment_17_4 )
            {
             before(grammarAccess.getParticipantAccess().getTemplatesFormAssignment_17_4()); 
            // InternalPagos.g:2805:2: ( rule__Participant__TemplatesFormAssignment_17_4 )
            // InternalPagos.g:2805:3: rule__Participant__TemplatesFormAssignment_17_4
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
    // InternalPagos.g:2813:1: rule__Participant__Group_17__5 : rule__Participant__Group_17__5__Impl ;
    public final void rule__Participant__Group_17__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2817:1: ( rule__Participant__Group_17__5__Impl )
            // InternalPagos.g:2818:2: rule__Participant__Group_17__5__Impl
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
    // InternalPagos.g:2824:1: rule__Participant__Group_17__5__Impl : ( ( rule__Participant__Group_17_5__0 )* ) ;
    public final void rule__Participant__Group_17__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2828:1: ( ( ( rule__Participant__Group_17_5__0 )* ) )
            // InternalPagos.g:2829:1: ( ( rule__Participant__Group_17_5__0 )* )
            {
            // InternalPagos.g:2829:1: ( ( rule__Participant__Group_17_5__0 )* )
            // InternalPagos.g:2830:2: ( rule__Participant__Group_17_5__0 )*
            {
             before(grammarAccess.getParticipantAccess().getGroup_17_5()); 
            // InternalPagos.g:2831:2: ( rule__Participant__Group_17_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPagos.g:2831:3: rule__Participant__Group_17_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Participant__Group_17_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalPagos.g:2840:1: rule__Participant__Group_17_5__0 : rule__Participant__Group_17_5__0__Impl rule__Participant__Group_17_5__1 ;
    public final void rule__Participant__Group_17_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2844:1: ( rule__Participant__Group_17_5__0__Impl rule__Participant__Group_17_5__1 )
            // InternalPagos.g:2845:2: rule__Participant__Group_17_5__0__Impl rule__Participant__Group_17_5__1
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
    // InternalPagos.g:2852:1: rule__Participant__Group_17_5__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Participant__Group_17_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2856:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:2857:1: ( RULE_COMMA )
            {
            // InternalPagos.g:2857:1: ( RULE_COMMA )
            // InternalPagos.g:2858:2: RULE_COMMA
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
    // InternalPagos.g:2867:1: rule__Participant__Group_17_5__1 : rule__Participant__Group_17_5__1__Impl ;
    public final void rule__Participant__Group_17_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2871:1: ( rule__Participant__Group_17_5__1__Impl )
            // InternalPagos.g:2872:2: rule__Participant__Group_17_5__1__Impl
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
    // InternalPagos.g:2878:1: rule__Participant__Group_17_5__1__Impl : ( ( rule__Participant__TemplatesFormAssignment_17_5_1 ) ) ;
    public final void rule__Participant__Group_17_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2882:1: ( ( ( rule__Participant__TemplatesFormAssignment_17_5_1 ) ) )
            // InternalPagos.g:2883:1: ( ( rule__Participant__TemplatesFormAssignment_17_5_1 ) )
            {
            // InternalPagos.g:2883:1: ( ( rule__Participant__TemplatesFormAssignment_17_5_1 ) )
            // InternalPagos.g:2884:2: ( rule__Participant__TemplatesFormAssignment_17_5_1 )
            {
             before(grammarAccess.getParticipantAccess().getTemplatesFormAssignment_17_5_1()); 
            // InternalPagos.g:2885:2: ( rule__Participant__TemplatesFormAssignment_17_5_1 )
            // InternalPagos.g:2885:3: rule__Participant__TemplatesFormAssignment_17_5_1
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
    // InternalPagos.g:2894:1: rule__Provider__Group__0 : rule__Provider__Group__0__Impl rule__Provider__Group__1 ;
    public final void rule__Provider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2898:1: ( rule__Provider__Group__0__Impl rule__Provider__Group__1 )
            // InternalPagos.g:2899:2: rule__Provider__Group__0__Impl rule__Provider__Group__1
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
    // InternalPagos.g:2906:1: rule__Provider__Group__0__Impl : ( () ) ;
    public final void rule__Provider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2910:1: ( ( () ) )
            // InternalPagos.g:2911:1: ( () )
            {
            // InternalPagos.g:2911:1: ( () )
            // InternalPagos.g:2912:2: ()
            {
             before(grammarAccess.getProviderAccess().getProviderAction_0()); 
            // InternalPagos.g:2913:2: ()
            // InternalPagos.g:2913:3: 
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
    // InternalPagos.g:2921:1: rule__Provider__Group__1 : rule__Provider__Group__1__Impl rule__Provider__Group__2 ;
    public final void rule__Provider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2925:1: ( rule__Provider__Group__1__Impl rule__Provider__Group__2 )
            // InternalPagos.g:2926:2: rule__Provider__Group__1__Impl rule__Provider__Group__2
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
    // InternalPagos.g:2933:1: rule__Provider__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Provider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2937:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:2938:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:2938:1: ( RULE_LBRACE )
            // InternalPagos.g:2939:2: RULE_LBRACE
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
    // InternalPagos.g:2948:1: rule__Provider__Group__2 : rule__Provider__Group__2__Impl rule__Provider__Group__3 ;
    public final void rule__Provider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2952:1: ( rule__Provider__Group__2__Impl rule__Provider__Group__3 )
            // InternalPagos.g:2953:2: rule__Provider__Group__2__Impl rule__Provider__Group__3
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
    // InternalPagos.g:2960:1: rule__Provider__Group__2__Impl : ( 'name' ) ;
    public final void rule__Provider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2964:1: ( ( 'name' ) )
            // InternalPagos.g:2965:1: ( 'name' )
            {
            // InternalPagos.g:2965:1: ( 'name' )
            // InternalPagos.g:2966:2: 'name'
            {
             before(grammarAccess.getProviderAccess().getNameKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPagos.g:2975:1: rule__Provider__Group__3 : rule__Provider__Group__3__Impl rule__Provider__Group__4 ;
    public final void rule__Provider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2979:1: ( rule__Provider__Group__3__Impl rule__Provider__Group__4 )
            // InternalPagos.g:2980:2: rule__Provider__Group__3__Impl rule__Provider__Group__4
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
    // InternalPagos.g:2987:1: rule__Provider__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Provider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:2991:1: ( ( RULE_COLON ) )
            // InternalPagos.g:2992:1: ( RULE_COLON )
            {
            // InternalPagos.g:2992:1: ( RULE_COLON )
            // InternalPagos.g:2993:2: RULE_COLON
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
    // InternalPagos.g:3002:1: rule__Provider__Group__4 : rule__Provider__Group__4__Impl rule__Provider__Group__5 ;
    public final void rule__Provider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3006:1: ( rule__Provider__Group__4__Impl rule__Provider__Group__5 )
            // InternalPagos.g:3007:2: rule__Provider__Group__4__Impl rule__Provider__Group__5
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
    // InternalPagos.g:3014:1: rule__Provider__Group__4__Impl : ( ( rule__Provider__NameAssignment_4 ) ) ;
    public final void rule__Provider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3018:1: ( ( ( rule__Provider__NameAssignment_4 ) ) )
            // InternalPagos.g:3019:1: ( ( rule__Provider__NameAssignment_4 ) )
            {
            // InternalPagos.g:3019:1: ( ( rule__Provider__NameAssignment_4 ) )
            // InternalPagos.g:3020:2: ( rule__Provider__NameAssignment_4 )
            {
             before(grammarAccess.getProviderAccess().getNameAssignment_4()); 
            // InternalPagos.g:3021:2: ( rule__Provider__NameAssignment_4 )
            // InternalPagos.g:3021:3: rule__Provider__NameAssignment_4
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
    // InternalPagos.g:3029:1: rule__Provider__Group__5 : rule__Provider__Group__5__Impl rule__Provider__Group__6 ;
    public final void rule__Provider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3033:1: ( rule__Provider__Group__5__Impl rule__Provider__Group__6 )
            // InternalPagos.g:3034:2: rule__Provider__Group__5__Impl rule__Provider__Group__6
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
    // InternalPagos.g:3041:1: rule__Provider__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Provider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3045:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3046:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3046:1: ( RULE_COMMA )
            // InternalPagos.g:3047:2: RULE_COMMA
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
    // InternalPagos.g:3056:1: rule__Provider__Group__6 : rule__Provider__Group__6__Impl rule__Provider__Group__7 ;
    public final void rule__Provider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3060:1: ( rule__Provider__Group__6__Impl rule__Provider__Group__7 )
            // InternalPagos.g:3061:2: rule__Provider__Group__6__Impl rule__Provider__Group__7
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
    // InternalPagos.g:3068:1: rule__Provider__Group__6__Impl : ( 'description' ) ;
    public final void rule__Provider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3072:1: ( ( 'description' ) )
            // InternalPagos.g:3073:1: ( 'description' )
            {
            // InternalPagos.g:3073:1: ( 'description' )
            // InternalPagos.g:3074:2: 'description'
            {
             before(grammarAccess.getProviderAccess().getDescriptionKeyword_6()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPagos.g:3083:1: rule__Provider__Group__7 : rule__Provider__Group__7__Impl rule__Provider__Group__8 ;
    public final void rule__Provider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3087:1: ( rule__Provider__Group__7__Impl rule__Provider__Group__8 )
            // InternalPagos.g:3088:2: rule__Provider__Group__7__Impl rule__Provider__Group__8
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
    // InternalPagos.g:3095:1: rule__Provider__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__Provider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3099:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3100:1: ( RULE_COLON )
            {
            // InternalPagos.g:3100:1: ( RULE_COLON )
            // InternalPagos.g:3101:2: RULE_COLON
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
    // InternalPagos.g:3110:1: rule__Provider__Group__8 : rule__Provider__Group__8__Impl rule__Provider__Group__9 ;
    public final void rule__Provider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3114:1: ( rule__Provider__Group__8__Impl rule__Provider__Group__9 )
            // InternalPagos.g:3115:2: rule__Provider__Group__8__Impl rule__Provider__Group__9
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
    // InternalPagos.g:3122:1: rule__Provider__Group__8__Impl : ( ( rule__Provider__DescriptionAssignment_8 ) ) ;
    public final void rule__Provider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3126:1: ( ( ( rule__Provider__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:3127:1: ( ( rule__Provider__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:3127:1: ( ( rule__Provider__DescriptionAssignment_8 ) )
            // InternalPagos.g:3128:2: ( rule__Provider__DescriptionAssignment_8 )
            {
             before(grammarAccess.getProviderAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:3129:2: ( rule__Provider__DescriptionAssignment_8 )
            // InternalPagos.g:3129:3: rule__Provider__DescriptionAssignment_8
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
    // InternalPagos.g:3137:1: rule__Provider__Group__9 : rule__Provider__Group__9__Impl rule__Provider__Group__10 ;
    public final void rule__Provider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3141:1: ( rule__Provider__Group__9__Impl rule__Provider__Group__10 )
            // InternalPagos.g:3142:2: rule__Provider__Group__9__Impl rule__Provider__Group__10
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
    // InternalPagos.g:3149:1: rule__Provider__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__Provider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3153:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3154:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3154:1: ( RULE_COMMA )
            // InternalPagos.g:3155:2: RULE_COMMA
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
    // InternalPagos.g:3164:1: rule__Provider__Group__10 : rule__Provider__Group__10__Impl rule__Provider__Group__11 ;
    public final void rule__Provider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3168:1: ( rule__Provider__Group__10__Impl rule__Provider__Group__11 )
            // InternalPagos.g:3169:2: rule__Provider__Group__10__Impl rule__Provider__Group__11
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
    // InternalPagos.g:3176:1: rule__Provider__Group__10__Impl : ( 'attributes' ) ;
    public final void rule__Provider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3180:1: ( ( 'attributes' ) )
            // InternalPagos.g:3181:1: ( 'attributes' )
            {
            // InternalPagos.g:3181:1: ( 'attributes' )
            // InternalPagos.g:3182:2: 'attributes'
            {
             before(grammarAccess.getProviderAccess().getAttributesKeyword_10()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPagos.g:3191:1: rule__Provider__Group__11 : rule__Provider__Group__11__Impl rule__Provider__Group__12 ;
    public final void rule__Provider__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3195:1: ( rule__Provider__Group__11__Impl rule__Provider__Group__12 )
            // InternalPagos.g:3196:2: rule__Provider__Group__11__Impl rule__Provider__Group__12
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
    // InternalPagos.g:3203:1: rule__Provider__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__Provider__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3207:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3208:1: ( RULE_COLON )
            {
            // InternalPagos.g:3208:1: ( RULE_COLON )
            // InternalPagos.g:3209:2: RULE_COLON
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
    // InternalPagos.g:3218:1: rule__Provider__Group__12 : rule__Provider__Group__12__Impl rule__Provider__Group__13 ;
    public final void rule__Provider__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3222:1: ( rule__Provider__Group__12__Impl rule__Provider__Group__13 )
            // InternalPagos.g:3223:2: rule__Provider__Group__12__Impl rule__Provider__Group__13
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
    // InternalPagos.g:3230:1: rule__Provider__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Provider__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3234:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:3235:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:3235:1: ( RULE_LBRACKET )
            // InternalPagos.g:3236:2: RULE_LBRACKET
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
    // InternalPagos.g:3245:1: rule__Provider__Group__13 : rule__Provider__Group__13__Impl rule__Provider__Group__14 ;
    public final void rule__Provider__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3249:1: ( rule__Provider__Group__13__Impl rule__Provider__Group__14 )
            // InternalPagos.g:3250:2: rule__Provider__Group__13__Impl rule__Provider__Group__14
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
    // InternalPagos.g:3257:1: rule__Provider__Group__13__Impl : ( ( rule__Provider__AttListsAssignment_13 ) ) ;
    public final void rule__Provider__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3261:1: ( ( ( rule__Provider__AttListsAssignment_13 ) ) )
            // InternalPagos.g:3262:1: ( ( rule__Provider__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:3262:1: ( ( rule__Provider__AttListsAssignment_13 ) )
            // InternalPagos.g:3263:2: ( rule__Provider__AttListsAssignment_13 )
            {
             before(grammarAccess.getProviderAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:3264:2: ( rule__Provider__AttListsAssignment_13 )
            // InternalPagos.g:3264:3: rule__Provider__AttListsAssignment_13
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
    // InternalPagos.g:3272:1: rule__Provider__Group__14 : rule__Provider__Group__14__Impl rule__Provider__Group__15 ;
    public final void rule__Provider__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3276:1: ( rule__Provider__Group__14__Impl rule__Provider__Group__15 )
            // InternalPagos.g:3277:2: rule__Provider__Group__14__Impl rule__Provider__Group__15
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
    // InternalPagos.g:3284:1: rule__Provider__Group__14__Impl : ( ( rule__Provider__Group_14__0 )* ) ;
    public final void rule__Provider__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3288:1: ( ( ( rule__Provider__Group_14__0 )* ) )
            // InternalPagos.g:3289:1: ( ( rule__Provider__Group_14__0 )* )
            {
            // InternalPagos.g:3289:1: ( ( rule__Provider__Group_14__0 )* )
            // InternalPagos.g:3290:2: ( rule__Provider__Group_14__0 )*
            {
             before(grammarAccess.getProviderAccess().getGroup_14()); 
            // InternalPagos.g:3291:2: ( rule__Provider__Group_14__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPagos.g:3291:3: rule__Provider__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Provider__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalPagos.g:3299:1: rule__Provider__Group__15 : rule__Provider__Group__15__Impl rule__Provider__Group__16 ;
    public final void rule__Provider__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3303:1: ( rule__Provider__Group__15__Impl rule__Provider__Group__16 )
            // InternalPagos.g:3304:2: rule__Provider__Group__15__Impl rule__Provider__Group__16
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
    // InternalPagos.g:3311:1: rule__Provider__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Provider__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3315:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:3316:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:3316:1: ( RULE_RBRACKET )
            // InternalPagos.g:3317:2: RULE_RBRACKET
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
    // InternalPagos.g:3326:1: rule__Provider__Group__16 : rule__Provider__Group__16__Impl ;
    public final void rule__Provider__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3330:1: ( rule__Provider__Group__16__Impl )
            // InternalPagos.g:3331:2: rule__Provider__Group__16__Impl
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
    // InternalPagos.g:3337:1: rule__Provider__Group__16__Impl : ( RULE_RBRACE ) ;
    public final void rule__Provider__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3341:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:3342:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:3342:1: ( RULE_RBRACE )
            // InternalPagos.g:3343:2: RULE_RBRACE
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
    // InternalPagos.g:3353:1: rule__Provider__Group_14__0 : rule__Provider__Group_14__0__Impl rule__Provider__Group_14__1 ;
    public final void rule__Provider__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3357:1: ( rule__Provider__Group_14__0__Impl rule__Provider__Group_14__1 )
            // InternalPagos.g:3358:2: rule__Provider__Group_14__0__Impl rule__Provider__Group_14__1
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
    // InternalPagos.g:3365:1: rule__Provider__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Provider__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3369:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3370:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3370:1: ( RULE_COMMA )
            // InternalPagos.g:3371:2: RULE_COMMA
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
    // InternalPagos.g:3380:1: rule__Provider__Group_14__1 : rule__Provider__Group_14__1__Impl ;
    public final void rule__Provider__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3384:1: ( rule__Provider__Group_14__1__Impl )
            // InternalPagos.g:3385:2: rule__Provider__Group_14__1__Impl
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
    // InternalPagos.g:3391:1: rule__Provider__Group_14__1__Impl : ( ( rule__Provider__AttListsAssignment_14_1 ) ) ;
    public final void rule__Provider__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3395:1: ( ( ( rule__Provider__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:3396:1: ( ( rule__Provider__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:3396:1: ( ( rule__Provider__AttListsAssignment_14_1 ) )
            // InternalPagos.g:3397:2: ( rule__Provider__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getProviderAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:3398:2: ( rule__Provider__AttListsAssignment_14_1 )
            // InternalPagos.g:3398:3: rule__Provider__AttListsAssignment_14_1
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
    // InternalPagos.g:3407:1: rule__InformationTemplate__Group__0 : rule__InformationTemplate__Group__0__Impl rule__InformationTemplate__Group__1 ;
    public final void rule__InformationTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3411:1: ( rule__InformationTemplate__Group__0__Impl rule__InformationTemplate__Group__1 )
            // InternalPagos.g:3412:2: rule__InformationTemplate__Group__0__Impl rule__InformationTemplate__Group__1
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
    // InternalPagos.g:3419:1: rule__InformationTemplate__Group__0__Impl : ( () ) ;
    public final void rule__InformationTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3423:1: ( ( () ) )
            // InternalPagos.g:3424:1: ( () )
            {
            // InternalPagos.g:3424:1: ( () )
            // InternalPagos.g:3425:2: ()
            {
             before(grammarAccess.getInformationTemplateAccess().getInformationTemplateAction_0()); 
            // InternalPagos.g:3426:2: ()
            // InternalPagos.g:3426:3: 
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
    // InternalPagos.g:3434:1: rule__InformationTemplate__Group__1 : rule__InformationTemplate__Group__1__Impl rule__InformationTemplate__Group__2 ;
    public final void rule__InformationTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3438:1: ( rule__InformationTemplate__Group__1__Impl rule__InformationTemplate__Group__2 )
            // InternalPagos.g:3439:2: rule__InformationTemplate__Group__1__Impl rule__InformationTemplate__Group__2
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
    // InternalPagos.g:3446:1: rule__InformationTemplate__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__InformationTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3450:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:3451:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:3451:1: ( RULE_LBRACE )
            // InternalPagos.g:3452:2: RULE_LBRACE
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
    // InternalPagos.g:3461:1: rule__InformationTemplate__Group__2 : rule__InformationTemplate__Group__2__Impl rule__InformationTemplate__Group__3 ;
    public final void rule__InformationTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3465:1: ( rule__InformationTemplate__Group__2__Impl rule__InformationTemplate__Group__3 )
            // InternalPagos.g:3466:2: rule__InformationTemplate__Group__2__Impl rule__InformationTemplate__Group__3
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
    // InternalPagos.g:3473:1: rule__InformationTemplate__Group__2__Impl : ( 'name' ) ;
    public final void rule__InformationTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3477:1: ( ( 'name' ) )
            // InternalPagos.g:3478:1: ( 'name' )
            {
            // InternalPagos.g:3478:1: ( 'name' )
            // InternalPagos.g:3479:2: 'name'
            {
             before(grammarAccess.getInformationTemplateAccess().getNameKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPagos.g:3488:1: rule__InformationTemplate__Group__3 : rule__InformationTemplate__Group__3__Impl rule__InformationTemplate__Group__4 ;
    public final void rule__InformationTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3492:1: ( rule__InformationTemplate__Group__3__Impl rule__InformationTemplate__Group__4 )
            // InternalPagos.g:3493:2: rule__InformationTemplate__Group__3__Impl rule__InformationTemplate__Group__4
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
    // InternalPagos.g:3500:1: rule__InformationTemplate__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3504:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3505:1: ( RULE_COLON )
            {
            // InternalPagos.g:3505:1: ( RULE_COLON )
            // InternalPagos.g:3506:2: RULE_COLON
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
    // InternalPagos.g:3515:1: rule__InformationTemplate__Group__4 : rule__InformationTemplate__Group__4__Impl rule__InformationTemplate__Group__5 ;
    public final void rule__InformationTemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3519:1: ( rule__InformationTemplate__Group__4__Impl rule__InformationTemplate__Group__5 )
            // InternalPagos.g:3520:2: rule__InformationTemplate__Group__4__Impl rule__InformationTemplate__Group__5
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
    // InternalPagos.g:3527:1: rule__InformationTemplate__Group__4__Impl : ( ( rule__InformationTemplate__NameAssignment_4 ) ) ;
    public final void rule__InformationTemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3531:1: ( ( ( rule__InformationTemplate__NameAssignment_4 ) ) )
            // InternalPagos.g:3532:1: ( ( rule__InformationTemplate__NameAssignment_4 ) )
            {
            // InternalPagos.g:3532:1: ( ( rule__InformationTemplate__NameAssignment_4 ) )
            // InternalPagos.g:3533:2: ( rule__InformationTemplate__NameAssignment_4 )
            {
             before(grammarAccess.getInformationTemplateAccess().getNameAssignment_4()); 
            // InternalPagos.g:3534:2: ( rule__InformationTemplate__NameAssignment_4 )
            // InternalPagos.g:3534:3: rule__InformationTemplate__NameAssignment_4
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
    // InternalPagos.g:3542:1: rule__InformationTemplate__Group__5 : rule__InformationTemplate__Group__5__Impl rule__InformationTemplate__Group__6 ;
    public final void rule__InformationTemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3546:1: ( rule__InformationTemplate__Group__5__Impl rule__InformationTemplate__Group__6 )
            // InternalPagos.g:3547:2: rule__InformationTemplate__Group__5__Impl rule__InformationTemplate__Group__6
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
    // InternalPagos.g:3554:1: rule__InformationTemplate__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3558:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3559:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3559:1: ( RULE_COMMA )
            // InternalPagos.g:3560:2: RULE_COMMA
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
    // InternalPagos.g:3569:1: rule__InformationTemplate__Group__6 : rule__InformationTemplate__Group__6__Impl rule__InformationTemplate__Group__7 ;
    public final void rule__InformationTemplate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3573:1: ( rule__InformationTemplate__Group__6__Impl rule__InformationTemplate__Group__7 )
            // InternalPagos.g:3574:2: rule__InformationTemplate__Group__6__Impl rule__InformationTemplate__Group__7
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
    // InternalPagos.g:3581:1: rule__InformationTemplate__Group__6__Impl : ( 'description' ) ;
    public final void rule__InformationTemplate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3585:1: ( ( 'description' ) )
            // InternalPagos.g:3586:1: ( 'description' )
            {
            // InternalPagos.g:3586:1: ( 'description' )
            // InternalPagos.g:3587:2: 'description'
            {
             before(grammarAccess.getInformationTemplateAccess().getDescriptionKeyword_6()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPagos.g:3596:1: rule__InformationTemplate__Group__7 : rule__InformationTemplate__Group__7__Impl rule__InformationTemplate__Group__8 ;
    public final void rule__InformationTemplate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3600:1: ( rule__InformationTemplate__Group__7__Impl rule__InformationTemplate__Group__8 )
            // InternalPagos.g:3601:2: rule__InformationTemplate__Group__7__Impl rule__InformationTemplate__Group__8
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
    // InternalPagos.g:3608:1: rule__InformationTemplate__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3612:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3613:1: ( RULE_COLON )
            {
            // InternalPagos.g:3613:1: ( RULE_COLON )
            // InternalPagos.g:3614:2: RULE_COLON
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
    // InternalPagos.g:3623:1: rule__InformationTemplate__Group__8 : rule__InformationTemplate__Group__8__Impl rule__InformationTemplate__Group__9 ;
    public final void rule__InformationTemplate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3627:1: ( rule__InformationTemplate__Group__8__Impl rule__InformationTemplate__Group__9 )
            // InternalPagos.g:3628:2: rule__InformationTemplate__Group__8__Impl rule__InformationTemplate__Group__9
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
    // InternalPagos.g:3635:1: rule__InformationTemplate__Group__8__Impl : ( ( rule__InformationTemplate__DescriptionAssignment_8 ) ) ;
    public final void rule__InformationTemplate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3639:1: ( ( ( rule__InformationTemplate__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:3640:1: ( ( rule__InformationTemplate__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:3640:1: ( ( rule__InformationTemplate__DescriptionAssignment_8 ) )
            // InternalPagos.g:3641:2: ( rule__InformationTemplate__DescriptionAssignment_8 )
            {
             before(grammarAccess.getInformationTemplateAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:3642:2: ( rule__InformationTemplate__DescriptionAssignment_8 )
            // InternalPagos.g:3642:3: rule__InformationTemplate__DescriptionAssignment_8
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
    // InternalPagos.g:3650:1: rule__InformationTemplate__Group__9 : rule__InformationTemplate__Group__9__Impl rule__InformationTemplate__Group__10 ;
    public final void rule__InformationTemplate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3654:1: ( rule__InformationTemplate__Group__9__Impl rule__InformationTemplate__Group__10 )
            // InternalPagos.g:3655:2: rule__InformationTemplate__Group__9__Impl rule__InformationTemplate__Group__10
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
    // InternalPagos.g:3662:1: rule__InformationTemplate__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3666:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3667:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3667:1: ( RULE_COMMA )
            // InternalPagos.g:3668:2: RULE_COMMA
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
    // InternalPagos.g:3677:1: rule__InformationTemplate__Group__10 : rule__InformationTemplate__Group__10__Impl rule__InformationTemplate__Group__11 ;
    public final void rule__InformationTemplate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3681:1: ( rule__InformationTemplate__Group__10__Impl rule__InformationTemplate__Group__11 )
            // InternalPagos.g:3682:2: rule__InformationTemplate__Group__10__Impl rule__InformationTemplate__Group__11
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
    // InternalPagos.g:3689:1: rule__InformationTemplate__Group__10__Impl : ( 'FormAttributes' ) ;
    public final void rule__InformationTemplate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3693:1: ( ( 'FormAttributes' ) )
            // InternalPagos.g:3694:1: ( 'FormAttributes' )
            {
            // InternalPagos.g:3694:1: ( 'FormAttributes' )
            // InternalPagos.g:3695:2: 'FormAttributes'
            {
             before(grammarAccess.getInformationTemplateAccess().getFormAttributesKeyword_10()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPagos.g:3704:1: rule__InformationTemplate__Group__11 : rule__InformationTemplate__Group__11__Impl rule__InformationTemplate__Group__12 ;
    public final void rule__InformationTemplate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3708:1: ( rule__InformationTemplate__Group__11__Impl rule__InformationTemplate__Group__12 )
            // InternalPagos.g:3709:2: rule__InformationTemplate__Group__11__Impl rule__InformationTemplate__Group__12
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
    // InternalPagos.g:3716:1: rule__InformationTemplate__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3720:1: ( ( RULE_COLON ) )
            // InternalPagos.g:3721:1: ( RULE_COLON )
            {
            // InternalPagos.g:3721:1: ( RULE_COLON )
            // InternalPagos.g:3722:2: RULE_COLON
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
    // InternalPagos.g:3731:1: rule__InformationTemplate__Group__12 : rule__InformationTemplate__Group__12__Impl rule__InformationTemplate__Group__13 ;
    public final void rule__InformationTemplate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3735:1: ( rule__InformationTemplate__Group__12__Impl rule__InformationTemplate__Group__13 )
            // InternalPagos.g:3736:2: rule__InformationTemplate__Group__12__Impl rule__InformationTemplate__Group__13
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
    // InternalPagos.g:3743:1: rule__InformationTemplate__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__InformationTemplate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3747:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:3748:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:3748:1: ( RULE_LBRACKET )
            // InternalPagos.g:3749:2: RULE_LBRACKET
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
    // InternalPagos.g:3758:1: rule__InformationTemplate__Group__13 : rule__InformationTemplate__Group__13__Impl rule__InformationTemplate__Group__14 ;
    public final void rule__InformationTemplate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3762:1: ( rule__InformationTemplate__Group__13__Impl rule__InformationTemplate__Group__14 )
            // InternalPagos.g:3763:2: rule__InformationTemplate__Group__13__Impl rule__InformationTemplate__Group__14
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
    // InternalPagos.g:3770:1: rule__InformationTemplate__Group__13__Impl : ( ( rule__InformationTemplate__FormListsAssignment_13 ) ) ;
    public final void rule__InformationTemplate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3774:1: ( ( ( rule__InformationTemplate__FormListsAssignment_13 ) ) )
            // InternalPagos.g:3775:1: ( ( rule__InformationTemplate__FormListsAssignment_13 ) )
            {
            // InternalPagos.g:3775:1: ( ( rule__InformationTemplate__FormListsAssignment_13 ) )
            // InternalPagos.g:3776:2: ( rule__InformationTemplate__FormListsAssignment_13 )
            {
             before(grammarAccess.getInformationTemplateAccess().getFormListsAssignment_13()); 
            // InternalPagos.g:3777:2: ( rule__InformationTemplate__FormListsAssignment_13 )
            // InternalPagos.g:3777:3: rule__InformationTemplate__FormListsAssignment_13
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
    // InternalPagos.g:3785:1: rule__InformationTemplate__Group__14 : rule__InformationTemplate__Group__14__Impl rule__InformationTemplate__Group__15 ;
    public final void rule__InformationTemplate__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3789:1: ( rule__InformationTemplate__Group__14__Impl rule__InformationTemplate__Group__15 )
            // InternalPagos.g:3790:2: rule__InformationTemplate__Group__14__Impl rule__InformationTemplate__Group__15
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
    // InternalPagos.g:3797:1: rule__InformationTemplate__Group__14__Impl : ( ( rule__InformationTemplate__Group_14__0 )* ) ;
    public final void rule__InformationTemplate__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3801:1: ( ( ( rule__InformationTemplate__Group_14__0 )* ) )
            // InternalPagos.g:3802:1: ( ( rule__InformationTemplate__Group_14__0 )* )
            {
            // InternalPagos.g:3802:1: ( ( rule__InformationTemplate__Group_14__0 )* )
            // InternalPagos.g:3803:2: ( rule__InformationTemplate__Group_14__0 )*
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_14()); 
            // InternalPagos.g:3804:2: ( rule__InformationTemplate__Group_14__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPagos.g:3804:3: rule__InformationTemplate__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InformationTemplate__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalPagos.g:3812:1: rule__InformationTemplate__Group__15 : rule__InformationTemplate__Group__15__Impl rule__InformationTemplate__Group__16 ;
    public final void rule__InformationTemplate__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3816:1: ( rule__InformationTemplate__Group__15__Impl rule__InformationTemplate__Group__16 )
            // InternalPagos.g:3817:2: rule__InformationTemplate__Group__15__Impl rule__InformationTemplate__Group__16
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
    // InternalPagos.g:3824:1: rule__InformationTemplate__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__InformationTemplate__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3828:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:3829:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:3829:1: ( RULE_RBRACKET )
            // InternalPagos.g:3830:2: RULE_RBRACKET
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
    // InternalPagos.g:3839:1: rule__InformationTemplate__Group__16 : rule__InformationTemplate__Group__16__Impl rule__InformationTemplate__Group__17 ;
    public final void rule__InformationTemplate__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3843:1: ( rule__InformationTemplate__Group__16__Impl rule__InformationTemplate__Group__17 )
            // InternalPagos.g:3844:2: rule__InformationTemplate__Group__16__Impl rule__InformationTemplate__Group__17
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
    // InternalPagos.g:3851:1: rule__InformationTemplate__Group__16__Impl : ( RULE_RBRACE ) ;
    public final void rule__InformationTemplate__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3855:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:3856:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:3856:1: ( RULE_RBRACE )
            // InternalPagos.g:3857:2: RULE_RBRACE
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
    // InternalPagos.g:3866:1: rule__InformationTemplate__Group__17 : rule__InformationTemplate__Group__17__Impl rule__InformationTemplate__Group__18 ;
    public final void rule__InformationTemplate__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3870:1: ( rule__InformationTemplate__Group__17__Impl rule__InformationTemplate__Group__18 )
            // InternalPagos.g:3871:2: rule__InformationTemplate__Group__17__Impl rule__InformationTemplate__Group__18
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
    // InternalPagos.g:3878:1: rule__InformationTemplate__Group__17__Impl : ( ( rule__InformationTemplate__Group_17__0 )? ) ;
    public final void rule__InformationTemplate__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3882:1: ( ( ( rule__InformationTemplate__Group_17__0 )? ) )
            // InternalPagos.g:3883:1: ( ( rule__InformationTemplate__Group_17__0 )? )
            {
            // InternalPagos.g:3883:1: ( ( rule__InformationTemplate__Group_17__0 )? )
            // InternalPagos.g:3884:2: ( rule__InformationTemplate__Group_17__0 )?
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_17()); 
            // InternalPagos.g:3885:2: ( rule__InformationTemplate__Group_17__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_COMMA) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==34) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalPagos.g:3885:3: rule__InformationTemplate__Group_17__0
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
    // InternalPagos.g:3893:1: rule__InformationTemplate__Group__18 : rule__InformationTemplate__Group__18__Impl ;
    public final void rule__InformationTemplate__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3897:1: ( rule__InformationTemplate__Group__18__Impl )
            // InternalPagos.g:3898:2: rule__InformationTemplate__Group__18__Impl
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
    // InternalPagos.g:3904:1: rule__InformationTemplate__Group__18__Impl : ( ( rule__InformationTemplate__Group_18__0 )? ) ;
    public final void rule__InformationTemplate__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3908:1: ( ( ( rule__InformationTemplate__Group_18__0 )? ) )
            // InternalPagos.g:3909:1: ( ( rule__InformationTemplate__Group_18__0 )? )
            {
            // InternalPagos.g:3909:1: ( ( rule__InformationTemplate__Group_18__0 )? )
            // InternalPagos.g:3910:2: ( rule__InformationTemplate__Group_18__0 )?
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_18()); 
            // InternalPagos.g:3911:2: ( rule__InformationTemplate__Group_18__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_COMMA) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==35) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalPagos.g:3911:3: rule__InformationTemplate__Group_18__0
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
    // InternalPagos.g:3920:1: rule__InformationTemplate__Group_14__0 : rule__InformationTemplate__Group_14__0__Impl rule__InformationTemplate__Group_14__1 ;
    public final void rule__InformationTemplate__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3924:1: ( rule__InformationTemplate__Group_14__0__Impl rule__InformationTemplate__Group_14__1 )
            // InternalPagos.g:3925:2: rule__InformationTemplate__Group_14__0__Impl rule__InformationTemplate__Group_14__1
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
    // InternalPagos.g:3932:1: rule__InformationTemplate__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3936:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3937:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3937:1: ( RULE_COMMA )
            // InternalPagos.g:3938:2: RULE_COMMA
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
    // InternalPagos.g:3947:1: rule__InformationTemplate__Group_14__1 : rule__InformationTemplate__Group_14__1__Impl ;
    public final void rule__InformationTemplate__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3951:1: ( rule__InformationTemplate__Group_14__1__Impl )
            // InternalPagos.g:3952:2: rule__InformationTemplate__Group_14__1__Impl
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
    // InternalPagos.g:3958:1: rule__InformationTemplate__Group_14__1__Impl : ( ( rule__InformationTemplate__FormListsAssignment_14_1 ) ) ;
    public final void rule__InformationTemplate__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3962:1: ( ( ( rule__InformationTemplate__FormListsAssignment_14_1 ) ) )
            // InternalPagos.g:3963:1: ( ( rule__InformationTemplate__FormListsAssignment_14_1 ) )
            {
            // InternalPagos.g:3963:1: ( ( rule__InformationTemplate__FormListsAssignment_14_1 ) )
            // InternalPagos.g:3964:2: ( rule__InformationTemplate__FormListsAssignment_14_1 )
            {
             before(grammarAccess.getInformationTemplateAccess().getFormListsAssignment_14_1()); 
            // InternalPagos.g:3965:2: ( rule__InformationTemplate__FormListsAssignment_14_1 )
            // InternalPagos.g:3965:3: rule__InformationTemplate__FormListsAssignment_14_1
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
    // InternalPagos.g:3974:1: rule__InformationTemplate__Group_17__0 : rule__InformationTemplate__Group_17__0__Impl rule__InformationTemplate__Group_17__1 ;
    public final void rule__InformationTemplate__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3978:1: ( rule__InformationTemplate__Group_17__0__Impl rule__InformationTemplate__Group_17__1 )
            // InternalPagos.g:3979:2: rule__InformationTemplate__Group_17__0__Impl rule__InformationTemplate__Group_17__1
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
    // InternalPagos.g:3986:1: rule__InformationTemplate__Group_17__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:3990:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:3991:1: ( RULE_COMMA )
            {
            // InternalPagos.g:3991:1: ( RULE_COMMA )
            // InternalPagos.g:3992:2: RULE_COMMA
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
    // InternalPagos.g:4001:1: rule__InformationTemplate__Group_17__1 : rule__InformationTemplate__Group_17__1__Impl rule__InformationTemplate__Group_17__2 ;
    public final void rule__InformationTemplate__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4005:1: ( rule__InformationTemplate__Group_17__1__Impl rule__InformationTemplate__Group_17__2 )
            // InternalPagos.g:4006:2: rule__InformationTemplate__Group_17__1__Impl rule__InformationTemplate__Group_17__2
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
    // InternalPagos.g:4013:1: rule__InformationTemplate__Group_17__1__Impl : ( 'calculationtemplates' ) ;
    public final void rule__InformationTemplate__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4017:1: ( ( 'calculationtemplates' ) )
            // InternalPagos.g:4018:1: ( 'calculationtemplates' )
            {
            // InternalPagos.g:4018:1: ( 'calculationtemplates' )
            // InternalPagos.g:4019:2: 'calculationtemplates'
            {
             before(grammarAccess.getInformationTemplateAccess().getCalculationtemplatesKeyword_17_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalPagos.g:4028:1: rule__InformationTemplate__Group_17__2 : rule__InformationTemplate__Group_17__2__Impl rule__InformationTemplate__Group_17__3 ;
    public final void rule__InformationTemplate__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4032:1: ( rule__InformationTemplate__Group_17__2__Impl rule__InformationTemplate__Group_17__3 )
            // InternalPagos.g:4033:2: rule__InformationTemplate__Group_17__2__Impl rule__InformationTemplate__Group_17__3
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
    // InternalPagos.g:4040:1: rule__InformationTemplate__Group_17__2__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4044:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4045:1: ( RULE_COLON )
            {
            // InternalPagos.g:4045:1: ( RULE_COLON )
            // InternalPagos.g:4046:2: RULE_COLON
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
    // InternalPagos.g:4055:1: rule__InformationTemplate__Group_17__3 : rule__InformationTemplate__Group_17__3__Impl rule__InformationTemplate__Group_17__4 ;
    public final void rule__InformationTemplate__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4059:1: ( rule__InformationTemplate__Group_17__3__Impl rule__InformationTemplate__Group_17__4 )
            // InternalPagos.g:4060:2: rule__InformationTemplate__Group_17__3__Impl rule__InformationTemplate__Group_17__4
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
    // InternalPagos.g:4067:1: rule__InformationTemplate__Group_17__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__InformationTemplate__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4071:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:4072:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:4072:1: ( RULE_LBRACKET )
            // InternalPagos.g:4073:2: RULE_LBRACKET
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
    // InternalPagos.g:4082:1: rule__InformationTemplate__Group_17__4 : rule__InformationTemplate__Group_17__4__Impl rule__InformationTemplate__Group_17__5 ;
    public final void rule__InformationTemplate__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4086:1: ( rule__InformationTemplate__Group_17__4__Impl rule__InformationTemplate__Group_17__5 )
            // InternalPagos.g:4087:2: rule__InformationTemplate__Group_17__4__Impl rule__InformationTemplate__Group_17__5
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
    // InternalPagos.g:4094:1: rule__InformationTemplate__Group_17__4__Impl : ( ( rule__InformationTemplate__TemplatesAssignment_17_4 ) ) ;
    public final void rule__InformationTemplate__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4098:1: ( ( ( rule__InformationTemplate__TemplatesAssignment_17_4 ) ) )
            // InternalPagos.g:4099:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_4 ) )
            {
            // InternalPagos.g:4099:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_4 ) )
            // InternalPagos.g:4100:2: ( rule__InformationTemplate__TemplatesAssignment_17_4 )
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_4()); 
            // InternalPagos.g:4101:2: ( rule__InformationTemplate__TemplatesAssignment_17_4 )
            // InternalPagos.g:4101:3: rule__InformationTemplate__TemplatesAssignment_17_4
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
    // InternalPagos.g:4109:1: rule__InformationTemplate__Group_17__5 : rule__InformationTemplate__Group_17__5__Impl rule__InformationTemplate__Group_17__6 ;
    public final void rule__InformationTemplate__Group_17__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4113:1: ( rule__InformationTemplate__Group_17__5__Impl rule__InformationTemplate__Group_17__6 )
            // InternalPagos.g:4114:2: rule__InformationTemplate__Group_17__5__Impl rule__InformationTemplate__Group_17__6
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
    // InternalPagos.g:4121:1: rule__InformationTemplate__Group_17__5__Impl : ( ( rule__InformationTemplate__Group_17_5__0 )* ) ;
    public final void rule__InformationTemplate__Group_17__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4125:1: ( ( ( rule__InformationTemplate__Group_17_5__0 )* ) )
            // InternalPagos.g:4126:1: ( ( rule__InformationTemplate__Group_17_5__0 )* )
            {
            // InternalPagos.g:4126:1: ( ( rule__InformationTemplate__Group_17_5__0 )* )
            // InternalPagos.g:4127:2: ( rule__InformationTemplate__Group_17_5__0 )*
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_17_5()); 
            // InternalPagos.g:4128:2: ( rule__InformationTemplate__Group_17_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPagos.g:4128:3: rule__InformationTemplate__Group_17_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InformationTemplate__Group_17_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalPagos.g:4136:1: rule__InformationTemplate__Group_17__6 : rule__InformationTemplate__Group_17__6__Impl ;
    public final void rule__InformationTemplate__Group_17__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4140:1: ( rule__InformationTemplate__Group_17__6__Impl )
            // InternalPagos.g:4141:2: rule__InformationTemplate__Group_17__6__Impl
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
    // InternalPagos.g:4147:1: rule__InformationTemplate__Group_17__6__Impl : ( RULE_RBRACKET ) ;
    public final void rule__InformationTemplate__Group_17__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4151:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:4152:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:4152:1: ( RULE_RBRACKET )
            // InternalPagos.g:4153:2: RULE_RBRACKET
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
    // InternalPagos.g:4163:1: rule__InformationTemplate__Group_17_5__0 : rule__InformationTemplate__Group_17_5__0__Impl rule__InformationTemplate__Group_17_5__1 ;
    public final void rule__InformationTemplate__Group_17_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4167:1: ( rule__InformationTemplate__Group_17_5__0__Impl rule__InformationTemplate__Group_17_5__1 )
            // InternalPagos.g:4168:2: rule__InformationTemplate__Group_17_5__0__Impl rule__InformationTemplate__Group_17_5__1
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
    // InternalPagos.g:4175:1: rule__InformationTemplate__Group_17_5__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_17_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4179:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4180:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4180:1: ( RULE_COMMA )
            // InternalPagos.g:4181:2: RULE_COMMA
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
    // InternalPagos.g:4190:1: rule__InformationTemplate__Group_17_5__1 : rule__InformationTemplate__Group_17_5__1__Impl ;
    public final void rule__InformationTemplate__Group_17_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4194:1: ( rule__InformationTemplate__Group_17_5__1__Impl )
            // InternalPagos.g:4195:2: rule__InformationTemplate__Group_17_5__1__Impl
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
    // InternalPagos.g:4201:1: rule__InformationTemplate__Group_17_5__1__Impl : ( ( rule__InformationTemplate__TemplatesAssignment_17_5_1 ) ) ;
    public final void rule__InformationTemplate__Group_17_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4205:1: ( ( ( rule__InformationTemplate__TemplatesAssignment_17_5_1 ) ) )
            // InternalPagos.g:4206:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_5_1 ) )
            {
            // InternalPagos.g:4206:1: ( ( rule__InformationTemplate__TemplatesAssignment_17_5_1 ) )
            // InternalPagos.g:4207:2: ( rule__InformationTemplate__TemplatesAssignment_17_5_1 )
            {
             before(grammarAccess.getInformationTemplateAccess().getTemplatesAssignment_17_5_1()); 
            // InternalPagos.g:4208:2: ( rule__InformationTemplate__TemplatesAssignment_17_5_1 )
            // InternalPagos.g:4208:3: rule__InformationTemplate__TemplatesAssignment_17_5_1
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
    // InternalPagos.g:4217:1: rule__InformationTemplate__Group_18__0 : rule__InformationTemplate__Group_18__0__Impl rule__InformationTemplate__Group_18__1 ;
    public final void rule__InformationTemplate__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4221:1: ( rule__InformationTemplate__Group_18__0__Impl rule__InformationTemplate__Group_18__1 )
            // InternalPagos.g:4222:2: rule__InformationTemplate__Group_18__0__Impl rule__InformationTemplate__Group_18__1
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
    // InternalPagos.g:4229:1: rule__InformationTemplate__Group_18__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4233:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4234:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4234:1: ( RULE_COMMA )
            // InternalPagos.g:4235:2: RULE_COMMA
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
    // InternalPagos.g:4244:1: rule__InformationTemplate__Group_18__1 : rule__InformationTemplate__Group_18__1__Impl rule__InformationTemplate__Group_18__2 ;
    public final void rule__InformationTemplate__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4248:1: ( rule__InformationTemplate__Group_18__1__Impl rule__InformationTemplate__Group_18__2 )
            // InternalPagos.g:4249:2: rule__InformationTemplate__Group_18__1__Impl rule__InformationTemplate__Group_18__2
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
    // InternalPagos.g:4256:1: rule__InformationTemplate__Group_18__1__Impl : ( 'providers' ) ;
    public final void rule__InformationTemplate__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4260:1: ( ( 'providers' ) )
            // InternalPagos.g:4261:1: ( 'providers' )
            {
            // InternalPagos.g:4261:1: ( 'providers' )
            // InternalPagos.g:4262:2: 'providers'
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersKeyword_18_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPagos.g:4271:1: rule__InformationTemplate__Group_18__2 : rule__InformationTemplate__Group_18__2__Impl rule__InformationTemplate__Group_18__3 ;
    public final void rule__InformationTemplate__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4275:1: ( rule__InformationTemplate__Group_18__2__Impl rule__InformationTemplate__Group_18__3 )
            // InternalPagos.g:4276:2: rule__InformationTemplate__Group_18__2__Impl rule__InformationTemplate__Group_18__3
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
    // InternalPagos.g:4283:1: rule__InformationTemplate__Group_18__2__Impl : ( RULE_COLON ) ;
    public final void rule__InformationTemplate__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4287:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4288:1: ( RULE_COLON )
            {
            // InternalPagos.g:4288:1: ( RULE_COLON )
            // InternalPagos.g:4289:2: RULE_COLON
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
    // InternalPagos.g:4298:1: rule__InformationTemplate__Group_18__3 : rule__InformationTemplate__Group_18__3__Impl rule__InformationTemplate__Group_18__4 ;
    public final void rule__InformationTemplate__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4302:1: ( rule__InformationTemplate__Group_18__3__Impl rule__InformationTemplate__Group_18__4 )
            // InternalPagos.g:4303:2: rule__InformationTemplate__Group_18__3__Impl rule__InformationTemplate__Group_18__4
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
    // InternalPagos.g:4310:1: rule__InformationTemplate__Group_18__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__InformationTemplate__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4314:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:4315:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:4315:1: ( RULE_LBRACKET )
            // InternalPagos.g:4316:2: RULE_LBRACKET
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
    // InternalPagos.g:4325:1: rule__InformationTemplate__Group_18__4 : rule__InformationTemplate__Group_18__4__Impl rule__InformationTemplate__Group_18__5 ;
    public final void rule__InformationTemplate__Group_18__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4329:1: ( rule__InformationTemplate__Group_18__4__Impl rule__InformationTemplate__Group_18__5 )
            // InternalPagos.g:4330:2: rule__InformationTemplate__Group_18__4__Impl rule__InformationTemplate__Group_18__5
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
    // InternalPagos.g:4337:1: rule__InformationTemplate__Group_18__4__Impl : ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) ) ;
    public final void rule__InformationTemplate__Group_18__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4341:1: ( ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) ) )
            // InternalPagos.g:4342:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) )
            {
            // InternalPagos.g:4342:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_4 ) )
            // InternalPagos.g:4343:2: ( rule__InformationTemplate__ProvidersAssignment_18_4 )
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersAssignment_18_4()); 
            // InternalPagos.g:4344:2: ( rule__InformationTemplate__ProvidersAssignment_18_4 )
            // InternalPagos.g:4344:3: rule__InformationTemplate__ProvidersAssignment_18_4
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
    // InternalPagos.g:4352:1: rule__InformationTemplate__Group_18__5 : rule__InformationTemplate__Group_18__5__Impl rule__InformationTemplate__Group_18__6 ;
    public final void rule__InformationTemplate__Group_18__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4356:1: ( rule__InformationTemplate__Group_18__5__Impl rule__InformationTemplate__Group_18__6 )
            // InternalPagos.g:4357:2: rule__InformationTemplate__Group_18__5__Impl rule__InformationTemplate__Group_18__6
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
    // InternalPagos.g:4364:1: rule__InformationTemplate__Group_18__5__Impl : ( ( rule__InformationTemplate__Group_18_5__0 )* ) ;
    public final void rule__InformationTemplate__Group_18__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4368:1: ( ( ( rule__InformationTemplate__Group_18_5__0 )* ) )
            // InternalPagos.g:4369:1: ( ( rule__InformationTemplate__Group_18_5__0 )* )
            {
            // InternalPagos.g:4369:1: ( ( rule__InformationTemplate__Group_18_5__0 )* )
            // InternalPagos.g:4370:2: ( rule__InformationTemplate__Group_18_5__0 )*
            {
             before(grammarAccess.getInformationTemplateAccess().getGroup_18_5()); 
            // InternalPagos.g:4371:2: ( rule__InformationTemplate__Group_18_5__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPagos.g:4371:3: rule__InformationTemplate__Group_18_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InformationTemplate__Group_18_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalPagos.g:4379:1: rule__InformationTemplate__Group_18__6 : rule__InformationTemplate__Group_18__6__Impl ;
    public final void rule__InformationTemplate__Group_18__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4383:1: ( rule__InformationTemplate__Group_18__6__Impl )
            // InternalPagos.g:4384:2: rule__InformationTemplate__Group_18__6__Impl
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
    // InternalPagos.g:4390:1: rule__InformationTemplate__Group_18__6__Impl : ( RULE_RBRACKET ) ;
    public final void rule__InformationTemplate__Group_18__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4394:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:4395:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:4395:1: ( RULE_RBRACKET )
            // InternalPagos.g:4396:2: RULE_RBRACKET
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
    // InternalPagos.g:4406:1: rule__InformationTemplate__Group_18_5__0 : rule__InformationTemplate__Group_18_5__0__Impl rule__InformationTemplate__Group_18_5__1 ;
    public final void rule__InformationTemplate__Group_18_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4410:1: ( rule__InformationTemplate__Group_18_5__0__Impl rule__InformationTemplate__Group_18_5__1 )
            // InternalPagos.g:4411:2: rule__InformationTemplate__Group_18_5__0__Impl rule__InformationTemplate__Group_18_5__1
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
    // InternalPagos.g:4418:1: rule__InformationTemplate__Group_18_5__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InformationTemplate__Group_18_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4422:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4423:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4423:1: ( RULE_COMMA )
            // InternalPagos.g:4424:2: RULE_COMMA
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
    // InternalPagos.g:4433:1: rule__InformationTemplate__Group_18_5__1 : rule__InformationTemplate__Group_18_5__1__Impl ;
    public final void rule__InformationTemplate__Group_18_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4437:1: ( rule__InformationTemplate__Group_18_5__1__Impl )
            // InternalPagos.g:4438:2: rule__InformationTemplate__Group_18_5__1__Impl
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
    // InternalPagos.g:4444:1: rule__InformationTemplate__Group_18_5__1__Impl : ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) ) ;
    public final void rule__InformationTemplate__Group_18_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4448:1: ( ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) ) )
            // InternalPagos.g:4449:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) )
            {
            // InternalPagos.g:4449:1: ( ( rule__InformationTemplate__ProvidersAssignment_18_5_1 ) )
            // InternalPagos.g:4450:2: ( rule__InformationTemplate__ProvidersAssignment_18_5_1 )
            {
             before(grammarAccess.getInformationTemplateAccess().getProvidersAssignment_18_5_1()); 
            // InternalPagos.g:4451:2: ( rule__InformationTemplate__ProvidersAssignment_18_5_1 )
            // InternalPagos.g:4451:3: rule__InformationTemplate__ProvidersAssignment_18_5_1
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
    // InternalPagos.g:4460:1: rule__CalculationTemplate__Group__0 : rule__CalculationTemplate__Group__0__Impl rule__CalculationTemplate__Group__1 ;
    public final void rule__CalculationTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4464:1: ( rule__CalculationTemplate__Group__0__Impl rule__CalculationTemplate__Group__1 )
            // InternalPagos.g:4465:2: rule__CalculationTemplate__Group__0__Impl rule__CalculationTemplate__Group__1
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
    // InternalPagos.g:4472:1: rule__CalculationTemplate__Group__0__Impl : ( () ) ;
    public final void rule__CalculationTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4476:1: ( ( () ) )
            // InternalPagos.g:4477:1: ( () )
            {
            // InternalPagos.g:4477:1: ( () )
            // InternalPagos.g:4478:2: ()
            {
             before(grammarAccess.getCalculationTemplateAccess().getCalculationTemplateAction_0()); 
            // InternalPagos.g:4479:2: ()
            // InternalPagos.g:4479:3: 
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
    // InternalPagos.g:4487:1: rule__CalculationTemplate__Group__1 : rule__CalculationTemplate__Group__1__Impl rule__CalculationTemplate__Group__2 ;
    public final void rule__CalculationTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4491:1: ( rule__CalculationTemplate__Group__1__Impl rule__CalculationTemplate__Group__2 )
            // InternalPagos.g:4492:2: rule__CalculationTemplate__Group__1__Impl rule__CalculationTemplate__Group__2
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
    // InternalPagos.g:4499:1: rule__CalculationTemplate__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__CalculationTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4503:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:4504:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:4504:1: ( RULE_LBRACE )
            // InternalPagos.g:4505:2: RULE_LBRACE
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
    // InternalPagos.g:4514:1: rule__CalculationTemplate__Group__2 : rule__CalculationTemplate__Group__2__Impl rule__CalculationTemplate__Group__3 ;
    public final void rule__CalculationTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4518:1: ( rule__CalculationTemplate__Group__2__Impl rule__CalculationTemplate__Group__3 )
            // InternalPagos.g:4519:2: rule__CalculationTemplate__Group__2__Impl rule__CalculationTemplate__Group__3
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
    // InternalPagos.g:4526:1: rule__CalculationTemplate__Group__2__Impl : ( 'name' ) ;
    public final void rule__CalculationTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4530:1: ( ( 'name' ) )
            // InternalPagos.g:4531:1: ( 'name' )
            {
            // InternalPagos.g:4531:1: ( 'name' )
            // InternalPagos.g:4532:2: 'name'
            {
             before(grammarAccess.getCalculationTemplateAccess().getNameKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPagos.g:4541:1: rule__CalculationTemplate__Group__3 : rule__CalculationTemplate__Group__3__Impl rule__CalculationTemplate__Group__4 ;
    public final void rule__CalculationTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4545:1: ( rule__CalculationTemplate__Group__3__Impl rule__CalculationTemplate__Group__4 )
            // InternalPagos.g:4546:2: rule__CalculationTemplate__Group__3__Impl rule__CalculationTemplate__Group__4
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
    // InternalPagos.g:4553:1: rule__CalculationTemplate__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4557:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4558:1: ( RULE_COLON )
            {
            // InternalPagos.g:4558:1: ( RULE_COLON )
            // InternalPagos.g:4559:2: RULE_COLON
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
    // InternalPagos.g:4568:1: rule__CalculationTemplate__Group__4 : rule__CalculationTemplate__Group__4__Impl rule__CalculationTemplate__Group__5 ;
    public final void rule__CalculationTemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4572:1: ( rule__CalculationTemplate__Group__4__Impl rule__CalculationTemplate__Group__5 )
            // InternalPagos.g:4573:2: rule__CalculationTemplate__Group__4__Impl rule__CalculationTemplate__Group__5
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
    // InternalPagos.g:4580:1: rule__CalculationTemplate__Group__4__Impl : ( ( rule__CalculationTemplate__NameAssignment_4 ) ) ;
    public final void rule__CalculationTemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4584:1: ( ( ( rule__CalculationTemplate__NameAssignment_4 ) ) )
            // InternalPagos.g:4585:1: ( ( rule__CalculationTemplate__NameAssignment_4 ) )
            {
            // InternalPagos.g:4585:1: ( ( rule__CalculationTemplate__NameAssignment_4 ) )
            // InternalPagos.g:4586:2: ( rule__CalculationTemplate__NameAssignment_4 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getNameAssignment_4()); 
            // InternalPagos.g:4587:2: ( rule__CalculationTemplate__NameAssignment_4 )
            // InternalPagos.g:4587:3: rule__CalculationTemplate__NameAssignment_4
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
    // InternalPagos.g:4595:1: rule__CalculationTemplate__Group__5 : rule__CalculationTemplate__Group__5__Impl rule__CalculationTemplate__Group__6 ;
    public final void rule__CalculationTemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4599:1: ( rule__CalculationTemplate__Group__5__Impl rule__CalculationTemplate__Group__6 )
            // InternalPagos.g:4600:2: rule__CalculationTemplate__Group__5__Impl rule__CalculationTemplate__Group__6
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
    // InternalPagos.g:4607:1: rule__CalculationTemplate__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4611:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4612:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4612:1: ( RULE_COMMA )
            // InternalPagos.g:4613:2: RULE_COMMA
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
    // InternalPagos.g:4622:1: rule__CalculationTemplate__Group__6 : rule__CalculationTemplate__Group__6__Impl rule__CalculationTemplate__Group__7 ;
    public final void rule__CalculationTemplate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4626:1: ( rule__CalculationTemplate__Group__6__Impl rule__CalculationTemplate__Group__7 )
            // InternalPagos.g:4627:2: rule__CalculationTemplate__Group__6__Impl rule__CalculationTemplate__Group__7
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
    // InternalPagos.g:4634:1: rule__CalculationTemplate__Group__6__Impl : ( 'description' ) ;
    public final void rule__CalculationTemplate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4638:1: ( ( 'description' ) )
            // InternalPagos.g:4639:1: ( 'description' )
            {
            // InternalPagos.g:4639:1: ( 'description' )
            // InternalPagos.g:4640:2: 'description'
            {
             before(grammarAccess.getCalculationTemplateAccess().getDescriptionKeyword_6()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPagos.g:4649:1: rule__CalculationTemplate__Group__7 : rule__CalculationTemplate__Group__7__Impl rule__CalculationTemplate__Group__8 ;
    public final void rule__CalculationTemplate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4653:1: ( rule__CalculationTemplate__Group__7__Impl rule__CalculationTemplate__Group__8 )
            // InternalPagos.g:4654:2: rule__CalculationTemplate__Group__7__Impl rule__CalculationTemplate__Group__8
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
    // InternalPagos.g:4661:1: rule__CalculationTemplate__Group__7__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4665:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4666:1: ( RULE_COLON )
            {
            // InternalPagos.g:4666:1: ( RULE_COLON )
            // InternalPagos.g:4667:2: RULE_COLON
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
    // InternalPagos.g:4676:1: rule__CalculationTemplate__Group__8 : rule__CalculationTemplate__Group__8__Impl rule__CalculationTemplate__Group__9 ;
    public final void rule__CalculationTemplate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4680:1: ( rule__CalculationTemplate__Group__8__Impl rule__CalculationTemplate__Group__9 )
            // InternalPagos.g:4681:2: rule__CalculationTemplate__Group__8__Impl rule__CalculationTemplate__Group__9
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
    // InternalPagos.g:4688:1: rule__CalculationTemplate__Group__8__Impl : ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) ) ;
    public final void rule__CalculationTemplate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4692:1: ( ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) ) )
            // InternalPagos.g:4693:1: ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) )
            {
            // InternalPagos.g:4693:1: ( ( rule__CalculationTemplate__DescriptionAssignment_8 ) )
            // InternalPagos.g:4694:2: ( rule__CalculationTemplate__DescriptionAssignment_8 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getDescriptionAssignment_8()); 
            // InternalPagos.g:4695:2: ( rule__CalculationTemplate__DescriptionAssignment_8 )
            // InternalPagos.g:4695:3: rule__CalculationTemplate__DescriptionAssignment_8
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
    // InternalPagos.g:4703:1: rule__CalculationTemplate__Group__9 : rule__CalculationTemplate__Group__9__Impl rule__CalculationTemplate__Group__10 ;
    public final void rule__CalculationTemplate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4707:1: ( rule__CalculationTemplate__Group__9__Impl rule__CalculationTemplate__Group__10 )
            // InternalPagos.g:4708:2: rule__CalculationTemplate__Group__9__Impl rule__CalculationTemplate__Group__10
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
    // InternalPagos.g:4715:1: rule__CalculationTemplate__Group__9__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4719:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4720:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4720:1: ( RULE_COMMA )
            // InternalPagos.g:4721:2: RULE_COMMA
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
    // InternalPagos.g:4730:1: rule__CalculationTemplate__Group__10 : rule__CalculationTemplate__Group__10__Impl rule__CalculationTemplate__Group__11 ;
    public final void rule__CalculationTemplate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4734:1: ( rule__CalculationTemplate__Group__10__Impl rule__CalculationTemplate__Group__11 )
            // InternalPagos.g:4735:2: rule__CalculationTemplate__Group__10__Impl rule__CalculationTemplate__Group__11
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
    // InternalPagos.g:4742:1: rule__CalculationTemplate__Group__10__Impl : ( 'calculationattributes' ) ;
    public final void rule__CalculationTemplate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4746:1: ( ( 'calculationattributes' ) )
            // InternalPagos.g:4747:1: ( 'calculationattributes' )
            {
            // InternalPagos.g:4747:1: ( 'calculationattributes' )
            // InternalPagos.g:4748:2: 'calculationattributes'
            {
             before(grammarAccess.getCalculationTemplateAccess().getCalculationattributesKeyword_10()); 
            match(input,36,FOLLOW_2); 
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
    // InternalPagos.g:4757:1: rule__CalculationTemplate__Group__11 : rule__CalculationTemplate__Group__11__Impl rule__CalculationTemplate__Group__12 ;
    public final void rule__CalculationTemplate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4761:1: ( rule__CalculationTemplate__Group__11__Impl rule__CalculationTemplate__Group__12 )
            // InternalPagos.g:4762:2: rule__CalculationTemplate__Group__11__Impl rule__CalculationTemplate__Group__12
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
    // InternalPagos.g:4769:1: rule__CalculationTemplate__Group__11__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4773:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4774:1: ( RULE_COLON )
            {
            // InternalPagos.g:4774:1: ( RULE_COLON )
            // InternalPagos.g:4775:2: RULE_COLON
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
    // InternalPagos.g:4784:1: rule__CalculationTemplate__Group__12 : rule__CalculationTemplate__Group__12__Impl rule__CalculationTemplate__Group__13 ;
    public final void rule__CalculationTemplate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4788:1: ( rule__CalculationTemplate__Group__12__Impl rule__CalculationTemplate__Group__13 )
            // InternalPagos.g:4789:2: rule__CalculationTemplate__Group__12__Impl rule__CalculationTemplate__Group__13
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
    // InternalPagos.g:4796:1: rule__CalculationTemplate__Group__12__Impl : ( RULE_LBRACKET ) ;
    public final void rule__CalculationTemplate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4800:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:4801:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:4801:1: ( RULE_LBRACKET )
            // InternalPagos.g:4802:2: RULE_LBRACKET
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
    // InternalPagos.g:4811:1: rule__CalculationTemplate__Group__13 : rule__CalculationTemplate__Group__13__Impl rule__CalculationTemplate__Group__14 ;
    public final void rule__CalculationTemplate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4815:1: ( rule__CalculationTemplate__Group__13__Impl rule__CalculationTemplate__Group__14 )
            // InternalPagos.g:4816:2: rule__CalculationTemplate__Group__13__Impl rule__CalculationTemplate__Group__14
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
    // InternalPagos.g:4823:1: rule__CalculationTemplate__Group__13__Impl : ( ( rule__CalculationTemplate__AttListsAssignment_13 ) ) ;
    public final void rule__CalculationTemplate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4827:1: ( ( ( rule__CalculationTemplate__AttListsAssignment_13 ) ) )
            // InternalPagos.g:4828:1: ( ( rule__CalculationTemplate__AttListsAssignment_13 ) )
            {
            // InternalPagos.g:4828:1: ( ( rule__CalculationTemplate__AttListsAssignment_13 ) )
            // InternalPagos.g:4829:2: ( rule__CalculationTemplate__AttListsAssignment_13 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_13()); 
            // InternalPagos.g:4830:2: ( rule__CalculationTemplate__AttListsAssignment_13 )
            // InternalPagos.g:4830:3: rule__CalculationTemplate__AttListsAssignment_13
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
    // InternalPagos.g:4838:1: rule__CalculationTemplate__Group__14 : rule__CalculationTemplate__Group__14__Impl rule__CalculationTemplate__Group__15 ;
    public final void rule__CalculationTemplate__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4842:1: ( rule__CalculationTemplate__Group__14__Impl rule__CalculationTemplate__Group__15 )
            // InternalPagos.g:4843:2: rule__CalculationTemplate__Group__14__Impl rule__CalculationTemplate__Group__15
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
    // InternalPagos.g:4850:1: rule__CalculationTemplate__Group__14__Impl : ( ( rule__CalculationTemplate__Group_14__0 )* ) ;
    public final void rule__CalculationTemplate__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4854:1: ( ( ( rule__CalculationTemplate__Group_14__0 )* ) )
            // InternalPagos.g:4855:1: ( ( rule__CalculationTemplate__Group_14__0 )* )
            {
            // InternalPagos.g:4855:1: ( ( rule__CalculationTemplate__Group_14__0 )* )
            // InternalPagos.g:4856:2: ( rule__CalculationTemplate__Group_14__0 )*
            {
             before(grammarAccess.getCalculationTemplateAccess().getGroup_14()); 
            // InternalPagos.g:4857:2: ( rule__CalculationTemplate__Group_14__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPagos.g:4857:3: rule__CalculationTemplate__Group_14__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CalculationTemplate__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalPagos.g:4865:1: rule__CalculationTemplate__Group__15 : rule__CalculationTemplate__Group__15__Impl rule__CalculationTemplate__Group__16 ;
    public final void rule__CalculationTemplate__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4869:1: ( rule__CalculationTemplate__Group__15__Impl rule__CalculationTemplate__Group__16 )
            // InternalPagos.g:4870:2: rule__CalculationTemplate__Group__15__Impl rule__CalculationTemplate__Group__16
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
    // InternalPagos.g:4877:1: rule__CalculationTemplate__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__CalculationTemplate__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4881:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:4882:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:4882:1: ( RULE_RBRACKET )
            // InternalPagos.g:4883:2: RULE_RBRACKET
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
    // InternalPagos.g:4892:1: rule__CalculationTemplate__Group__16 : rule__CalculationTemplate__Group__16__Impl rule__CalculationTemplate__Group__17 ;
    public final void rule__CalculationTemplate__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4896:1: ( rule__CalculationTemplate__Group__16__Impl rule__CalculationTemplate__Group__17 )
            // InternalPagos.g:4897:2: rule__CalculationTemplate__Group__16__Impl rule__CalculationTemplate__Group__17
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
    // InternalPagos.g:4904:1: rule__CalculationTemplate__Group__16__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4908:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:4909:1: ( RULE_COMMA )
            {
            // InternalPagos.g:4909:1: ( RULE_COMMA )
            // InternalPagos.g:4910:2: RULE_COMMA
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
    // InternalPagos.g:4919:1: rule__CalculationTemplate__Group__17 : rule__CalculationTemplate__Group__17__Impl rule__CalculationTemplate__Group__18 ;
    public final void rule__CalculationTemplate__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4923:1: ( rule__CalculationTemplate__Group__17__Impl rule__CalculationTemplate__Group__18 )
            // InternalPagos.g:4924:2: rule__CalculationTemplate__Group__17__Impl rule__CalculationTemplate__Group__18
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
    // InternalPagos.g:4931:1: rule__CalculationTemplate__Group__17__Impl : ( 'calculationrules' ) ;
    public final void rule__CalculationTemplate__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4935:1: ( ( 'calculationrules' ) )
            // InternalPagos.g:4936:1: ( 'calculationrules' )
            {
            // InternalPagos.g:4936:1: ( 'calculationrules' )
            // InternalPagos.g:4937:2: 'calculationrules'
            {
             before(grammarAccess.getCalculationTemplateAccess().getCalculationrulesKeyword_17()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPagos.g:4946:1: rule__CalculationTemplate__Group__18 : rule__CalculationTemplate__Group__18__Impl rule__CalculationTemplate__Group__19 ;
    public final void rule__CalculationTemplate__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4950:1: ( rule__CalculationTemplate__Group__18__Impl rule__CalculationTemplate__Group__19 )
            // InternalPagos.g:4951:2: rule__CalculationTemplate__Group__18__Impl rule__CalculationTemplate__Group__19
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
    // InternalPagos.g:4958:1: rule__CalculationTemplate__Group__18__Impl : ( RULE_COLON ) ;
    public final void rule__CalculationTemplate__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4962:1: ( ( RULE_COLON ) )
            // InternalPagos.g:4963:1: ( RULE_COLON )
            {
            // InternalPagos.g:4963:1: ( RULE_COLON )
            // InternalPagos.g:4964:2: RULE_COLON
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
    // InternalPagos.g:4973:1: rule__CalculationTemplate__Group__19 : rule__CalculationTemplate__Group__19__Impl rule__CalculationTemplate__Group__20 ;
    public final void rule__CalculationTemplate__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4977:1: ( rule__CalculationTemplate__Group__19__Impl rule__CalculationTemplate__Group__20 )
            // InternalPagos.g:4978:2: rule__CalculationTemplate__Group__19__Impl rule__CalculationTemplate__Group__20
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
    // InternalPagos.g:4985:1: rule__CalculationTemplate__Group__19__Impl : ( ( rule__CalculationTemplate__FormulaAssignment_19 ) ) ;
    public final void rule__CalculationTemplate__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:4989:1: ( ( ( rule__CalculationTemplate__FormulaAssignment_19 ) ) )
            // InternalPagos.g:4990:1: ( ( rule__CalculationTemplate__FormulaAssignment_19 ) )
            {
            // InternalPagos.g:4990:1: ( ( rule__CalculationTemplate__FormulaAssignment_19 ) )
            // InternalPagos.g:4991:2: ( rule__CalculationTemplate__FormulaAssignment_19 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getFormulaAssignment_19()); 
            // InternalPagos.g:4992:2: ( rule__CalculationTemplate__FormulaAssignment_19 )
            // InternalPagos.g:4992:3: rule__CalculationTemplate__FormulaAssignment_19
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
    // InternalPagos.g:5000:1: rule__CalculationTemplate__Group__20 : rule__CalculationTemplate__Group__20__Impl ;
    public final void rule__CalculationTemplate__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5004:1: ( rule__CalculationTemplate__Group__20__Impl )
            // InternalPagos.g:5005:2: rule__CalculationTemplate__Group__20__Impl
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
    // InternalPagos.g:5011:1: rule__CalculationTemplate__Group__20__Impl : ( RULE_RBRACE ) ;
    public final void rule__CalculationTemplate__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5015:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:5016:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:5016:1: ( RULE_RBRACE )
            // InternalPagos.g:5017:2: RULE_RBRACE
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
    // InternalPagos.g:5027:1: rule__CalculationTemplate__Group_14__0 : rule__CalculationTemplate__Group_14__0__Impl rule__CalculationTemplate__Group_14__1 ;
    public final void rule__CalculationTemplate__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5031:1: ( rule__CalculationTemplate__Group_14__0__Impl rule__CalculationTemplate__Group_14__1 )
            // InternalPagos.g:5032:2: rule__CalculationTemplate__Group_14__0__Impl rule__CalculationTemplate__Group_14__1
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
    // InternalPagos.g:5039:1: rule__CalculationTemplate__Group_14__0__Impl : ( RULE_COMMA ) ;
    public final void rule__CalculationTemplate__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5043:1: ( ( RULE_COMMA ) )
            // InternalPagos.g:5044:1: ( RULE_COMMA )
            {
            // InternalPagos.g:5044:1: ( RULE_COMMA )
            // InternalPagos.g:5045:2: RULE_COMMA
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
    // InternalPagos.g:5054:1: rule__CalculationTemplate__Group_14__1 : rule__CalculationTemplate__Group_14__1__Impl ;
    public final void rule__CalculationTemplate__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5058:1: ( rule__CalculationTemplate__Group_14__1__Impl )
            // InternalPagos.g:5059:2: rule__CalculationTemplate__Group_14__1__Impl
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
    // InternalPagos.g:5065:1: rule__CalculationTemplate__Group_14__1__Impl : ( ( rule__CalculationTemplate__AttListsAssignment_14_1 ) ) ;
    public final void rule__CalculationTemplate__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5069:1: ( ( ( rule__CalculationTemplate__AttListsAssignment_14_1 ) ) )
            // InternalPagos.g:5070:1: ( ( rule__CalculationTemplate__AttListsAssignment_14_1 ) )
            {
            // InternalPagos.g:5070:1: ( ( rule__CalculationTemplate__AttListsAssignment_14_1 ) )
            // InternalPagos.g:5071:2: ( rule__CalculationTemplate__AttListsAssignment_14_1 )
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsAssignment_14_1()); 
            // InternalPagos.g:5072:2: ( rule__CalculationTemplate__AttListsAssignment_14_1 )
            // InternalPagos.g:5072:3: rule__CalculationTemplate__AttListsAssignment_14_1
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


    // $ANTLR start "rule__Formula__Group__0"
    // InternalPagos.g:5081:1: rule__Formula__Group__0 : rule__Formula__Group__0__Impl rule__Formula__Group__1 ;
    public final void rule__Formula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5085:1: ( rule__Formula__Group__0__Impl rule__Formula__Group__1 )
            // InternalPagos.g:5086:2: rule__Formula__Group__0__Impl rule__Formula__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Formula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__0"


    // $ANTLR start "rule__Formula__Group__0__Impl"
    // InternalPagos.g:5093:1: rule__Formula__Group__0__Impl : ( () ) ;
    public final void rule__Formula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5097:1: ( ( () ) )
            // InternalPagos.g:5098:1: ( () )
            {
            // InternalPagos.g:5098:1: ( () )
            // InternalPagos.g:5099:2: ()
            {
             before(grammarAccess.getFormulaAccess().getFormulaAction_0()); 
            // InternalPagos.g:5100:2: ()
            // InternalPagos.g:5100:3: 
            {
            }

             after(grammarAccess.getFormulaAccess().getFormulaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__0__Impl"


    // $ANTLR start "rule__Formula__Group__1"
    // InternalPagos.g:5108:1: rule__Formula__Group__1 : rule__Formula__Group__1__Impl rule__Formula__Group__2 ;
    public final void rule__Formula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5112:1: ( rule__Formula__Group__1__Impl rule__Formula__Group__2 )
            // InternalPagos.g:5113:2: rule__Formula__Group__1__Impl rule__Formula__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Formula__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__1"


    // $ANTLR start "rule__Formula__Group__1__Impl"
    // InternalPagos.g:5120:1: rule__Formula__Group__1__Impl : ( 'Si' ) ;
    public final void rule__Formula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5124:1: ( ( 'Si' ) )
            // InternalPagos.g:5125:1: ( 'Si' )
            {
            // InternalPagos.g:5125:1: ( 'Si' )
            // InternalPagos.g:5126:2: 'Si'
            {
             before(grammarAccess.getFormulaAccess().getSiKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getSiKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__1__Impl"


    // $ANTLR start "rule__Formula__Group__2"
    // InternalPagos.g:5135:1: rule__Formula__Group__2 : rule__Formula__Group__2__Impl rule__Formula__Group__3 ;
    public final void rule__Formula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5139:1: ( rule__Formula__Group__2__Impl rule__Formula__Group__3 )
            // InternalPagos.g:5140:2: rule__Formula__Group__2__Impl rule__Formula__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Formula__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__2"


    // $ANTLR start "rule__Formula__Group__2__Impl"
    // InternalPagos.g:5147:1: rule__Formula__Group__2__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Formula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5151:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:5152:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:5152:1: ( RULE_LBRACKET )
            // InternalPagos.g:5153:2: RULE_LBRACKET
            {
             before(grammarAccess.getFormulaAccess().getLBRACKETTerminalRuleCall_2()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getLBRACKETTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__2__Impl"


    // $ANTLR start "rule__Formula__Group__3"
    // InternalPagos.g:5162:1: rule__Formula__Group__3 : rule__Formula__Group__3__Impl rule__Formula__Group__4 ;
    public final void rule__Formula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5166:1: ( rule__Formula__Group__3__Impl rule__Formula__Group__4 )
            // InternalPagos.g:5167:2: rule__Formula__Group__3__Impl rule__Formula__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Formula__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__3"


    // $ANTLR start "rule__Formula__Group__3__Impl"
    // InternalPagos.g:5174:1: rule__Formula__Group__3__Impl : ( ( rule__Formula__LogExpAssignment_3 ) ) ;
    public final void rule__Formula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5178:1: ( ( ( rule__Formula__LogExpAssignment_3 ) ) )
            // InternalPagos.g:5179:1: ( ( rule__Formula__LogExpAssignment_3 ) )
            {
            // InternalPagos.g:5179:1: ( ( rule__Formula__LogExpAssignment_3 ) )
            // InternalPagos.g:5180:2: ( rule__Formula__LogExpAssignment_3 )
            {
             before(grammarAccess.getFormulaAccess().getLogExpAssignment_3()); 
            // InternalPagos.g:5181:2: ( rule__Formula__LogExpAssignment_3 )
            // InternalPagos.g:5181:3: rule__Formula__LogExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Formula__LogExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getLogExpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__3__Impl"


    // $ANTLR start "rule__Formula__Group__4"
    // InternalPagos.g:5189:1: rule__Formula__Group__4 : rule__Formula__Group__4__Impl rule__Formula__Group__5 ;
    public final void rule__Formula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5193:1: ( rule__Formula__Group__4__Impl rule__Formula__Group__5 )
            // InternalPagos.g:5194:2: rule__Formula__Group__4__Impl rule__Formula__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Formula__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__4"


    // $ANTLR start "rule__Formula__Group__4__Impl"
    // InternalPagos.g:5201:1: rule__Formula__Group__4__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Formula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5205:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:5206:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:5206:1: ( RULE_RBRACKET )
            // InternalPagos.g:5207:2: RULE_RBRACKET
            {
             before(grammarAccess.getFormulaAccess().getRBRACKETTerminalRuleCall_4()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getRBRACKETTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__4__Impl"


    // $ANTLR start "rule__Formula__Group__5"
    // InternalPagos.g:5216:1: rule__Formula__Group__5 : rule__Formula__Group__5__Impl rule__Formula__Group__6 ;
    public final void rule__Formula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5220:1: ( rule__Formula__Group__5__Impl rule__Formula__Group__6 )
            // InternalPagos.g:5221:2: rule__Formula__Group__5__Impl rule__Formula__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Formula__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__5"


    // $ANTLR start "rule__Formula__Group__5__Impl"
    // InternalPagos.g:5228:1: rule__Formula__Group__5__Impl : ( 'Entonces' ) ;
    public final void rule__Formula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5232:1: ( ( 'Entonces' ) )
            // InternalPagos.g:5233:1: ( 'Entonces' )
            {
            // InternalPagos.g:5233:1: ( 'Entonces' )
            // InternalPagos.g:5234:2: 'Entonces'
            {
             before(grammarAccess.getFormulaAccess().getEntoncesKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getEntoncesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__5__Impl"


    // $ANTLR start "rule__Formula__Group__6"
    // InternalPagos.g:5243:1: rule__Formula__Group__6 : rule__Formula__Group__6__Impl rule__Formula__Group__7 ;
    public final void rule__Formula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5247:1: ( rule__Formula__Group__6__Impl rule__Formula__Group__7 )
            // InternalPagos.g:5248:2: rule__Formula__Group__6__Impl rule__Formula__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Formula__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__6"


    // $ANTLR start "rule__Formula__Group__6__Impl"
    // InternalPagos.g:5255:1: rule__Formula__Group__6__Impl : ( RULE_LBRACE ) ;
    public final void rule__Formula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5259:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:5260:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:5260:1: ( RULE_LBRACE )
            // InternalPagos.g:5261:2: RULE_LBRACE
            {
             before(grammarAccess.getFormulaAccess().getLBRACETerminalRuleCall_6()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getLBRACETerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__6__Impl"


    // $ANTLR start "rule__Formula__Group__7"
    // InternalPagos.g:5270:1: rule__Formula__Group__7 : rule__Formula__Group__7__Impl rule__Formula__Group__8 ;
    public final void rule__Formula__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5274:1: ( rule__Formula__Group__7__Impl rule__Formula__Group__8 )
            // InternalPagos.g:5275:2: rule__Formula__Group__7__Impl rule__Formula__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__Formula__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__7"


    // $ANTLR start "rule__Formula__Group__7__Impl"
    // InternalPagos.g:5282:1: rule__Formula__Group__7__Impl : ( 'Retornar:' ) ;
    public final void rule__Formula__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5286:1: ( ( 'Retornar:' ) )
            // InternalPagos.g:5287:1: ( 'Retornar:' )
            {
            // InternalPagos.g:5287:1: ( 'Retornar:' )
            // InternalPagos.g:5288:2: 'Retornar:'
            {
             before(grammarAccess.getFormulaAccess().getRetornarKeyword_7()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getRetornarKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__7__Impl"


    // $ANTLR start "rule__Formula__Group__8"
    // InternalPagos.g:5297:1: rule__Formula__Group__8 : rule__Formula__Group__8__Impl rule__Formula__Group__9 ;
    public final void rule__Formula__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5301:1: ( rule__Formula__Group__8__Impl rule__Formula__Group__9 )
            // InternalPagos.g:5302:2: rule__Formula__Group__8__Impl rule__Formula__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Formula__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__8"


    // $ANTLR start "rule__Formula__Group__8__Impl"
    // InternalPagos.g:5309:1: rule__Formula__Group__8__Impl : ( ( rule__Formula__ExpressionAssignment_8 ) ) ;
    public final void rule__Formula__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5313:1: ( ( ( rule__Formula__ExpressionAssignment_8 ) ) )
            // InternalPagos.g:5314:1: ( ( rule__Formula__ExpressionAssignment_8 ) )
            {
            // InternalPagos.g:5314:1: ( ( rule__Formula__ExpressionAssignment_8 ) )
            // InternalPagos.g:5315:2: ( rule__Formula__ExpressionAssignment_8 )
            {
             before(grammarAccess.getFormulaAccess().getExpressionAssignment_8()); 
            // InternalPagos.g:5316:2: ( rule__Formula__ExpressionAssignment_8 )
            // InternalPagos.g:5316:3: rule__Formula__ExpressionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Formula__ExpressionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getExpressionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__8__Impl"


    // $ANTLR start "rule__Formula__Group__9"
    // InternalPagos.g:5324:1: rule__Formula__Group__9 : rule__Formula__Group__9__Impl rule__Formula__Group__10 ;
    public final void rule__Formula__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5328:1: ( rule__Formula__Group__9__Impl rule__Formula__Group__10 )
            // InternalPagos.g:5329:2: rule__Formula__Group__9__Impl rule__Formula__Group__10
            {
            pushFollow(FOLLOW_30);
            rule__Formula__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__9"


    // $ANTLR start "rule__Formula__Group__9__Impl"
    // InternalPagos.g:5336:1: rule__Formula__Group__9__Impl : ( RULE_RBRACE ) ;
    public final void rule__Formula__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5340:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:5341:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:5341:1: ( RULE_RBRACE )
            // InternalPagos.g:5342:2: RULE_RBRACE
            {
             before(grammarAccess.getFormulaAccess().getRBRACETerminalRuleCall_9()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getRBRACETerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__9__Impl"


    // $ANTLR start "rule__Formula__Group__10"
    // InternalPagos.g:5351:1: rule__Formula__Group__10 : rule__Formula__Group__10__Impl ;
    public final void rule__Formula__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5355:1: ( rule__Formula__Group__10__Impl )
            // InternalPagos.g:5356:2: rule__Formula__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__10"


    // $ANTLR start "rule__Formula__Group__10__Impl"
    // InternalPagos.g:5362:1: rule__Formula__Group__10__Impl : ( ( rule__Formula__Group_10__0 )* ) ;
    public final void rule__Formula__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5366:1: ( ( ( rule__Formula__Group_10__0 )* ) )
            // InternalPagos.g:5367:1: ( ( rule__Formula__Group_10__0 )* )
            {
            // InternalPagos.g:5367:1: ( ( rule__Formula__Group_10__0 )* )
            // InternalPagos.g:5368:2: ( rule__Formula__Group_10__0 )*
            {
             before(grammarAccess.getFormulaAccess().getGroup_10()); 
            // InternalPagos.g:5369:2: ( rule__Formula__Group_10__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_LBRACE||LA19_0==38||LA19_0==41) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPagos.g:5369:3: rule__Formula__Group_10__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Formula__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getFormulaAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__10__Impl"


    // $ANTLR start "rule__Formula__Group_10__0"
    // InternalPagos.g:5378:1: rule__Formula__Group_10__0 : rule__Formula__Group_10__0__Impl rule__Formula__Group_10__1 ;
    public final void rule__Formula__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5382:1: ( rule__Formula__Group_10__0__Impl rule__Formula__Group_10__1 )
            // InternalPagos.g:5383:2: rule__Formula__Group_10__0__Impl rule__Formula__Group_10__1
            {
            pushFollow(FOLLOW_30);
            rule__Formula__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10__0"


    // $ANTLR start "rule__Formula__Group_10__0__Impl"
    // InternalPagos.g:5390:1: rule__Formula__Group_10__0__Impl : ( ( 'Sino' )? ) ;
    public final void rule__Formula__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5394:1: ( ( ( 'Sino' )? ) )
            // InternalPagos.g:5395:1: ( ( 'Sino' )? )
            {
            // InternalPagos.g:5395:1: ( ( 'Sino' )? )
            // InternalPagos.g:5396:2: ( 'Sino' )?
            {
             before(grammarAccess.getFormulaAccess().getSinoKeyword_10_0()); 
            // InternalPagos.g:5397:2: ( 'Sino' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPagos.g:5397:3: 'Sino'
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFormulaAccess().getSinoKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10__0__Impl"


    // $ANTLR start "rule__Formula__Group_10__1"
    // InternalPagos.g:5405:1: rule__Formula__Group_10__1 : rule__Formula__Group_10__1__Impl rule__Formula__Group_10__2 ;
    public final void rule__Formula__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5409:1: ( rule__Formula__Group_10__1__Impl rule__Formula__Group_10__2 )
            // InternalPagos.g:5410:2: rule__Formula__Group_10__1__Impl rule__Formula__Group_10__2
            {
            pushFollow(FOLLOW_30);
            rule__Formula__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10__1"


    // $ANTLR start "rule__Formula__Group_10__1__Impl"
    // InternalPagos.g:5417:1: rule__Formula__Group_10__1__Impl : ( ( rule__Formula__Group_10_1__0 )? ) ;
    public final void rule__Formula__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5421:1: ( ( ( rule__Formula__Group_10_1__0 )? ) )
            // InternalPagos.g:5422:1: ( ( rule__Formula__Group_10_1__0 )? )
            {
            // InternalPagos.g:5422:1: ( ( rule__Formula__Group_10_1__0 )? )
            // InternalPagos.g:5423:2: ( rule__Formula__Group_10_1__0 )?
            {
             before(grammarAccess.getFormulaAccess().getGroup_10_1()); 
            // InternalPagos.g:5424:2: ( rule__Formula__Group_10_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPagos.g:5424:3: rule__Formula__Group_10_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formula__Group_10_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormulaAccess().getGroup_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10__1__Impl"


    // $ANTLR start "rule__Formula__Group_10__2"
    // InternalPagos.g:5432:1: rule__Formula__Group_10__2 : rule__Formula__Group_10__2__Impl rule__Formula__Group_10__3 ;
    public final void rule__Formula__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5436:1: ( rule__Formula__Group_10__2__Impl rule__Formula__Group_10__3 )
            // InternalPagos.g:5437:2: rule__Formula__Group_10__2__Impl rule__Formula__Group_10__3
            {
            pushFollow(FOLLOW_28);
            rule__Formula__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10__2"


    // $ANTLR start "rule__Formula__Group_10__2__Impl"
    // InternalPagos.g:5444:1: rule__Formula__Group_10__2__Impl : ( RULE_LBRACE ) ;
    public final void rule__Formula__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5448:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:5449:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:5449:1: ( RULE_LBRACE )
            // InternalPagos.g:5450:2: RULE_LBRACE
            {
             before(grammarAccess.getFormulaAccess().getLBRACETerminalRuleCall_10_2()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getLBRACETerminalRuleCall_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10__2__Impl"


    // $ANTLR start "rule__Formula__Group_10__3"
    // InternalPagos.g:5459:1: rule__Formula__Group_10__3 : rule__Formula__Group_10__3__Impl rule__Formula__Group_10__4 ;
    public final void rule__Formula__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5463:1: ( rule__Formula__Group_10__3__Impl rule__Formula__Group_10__4 )
            // InternalPagos.g:5464:2: rule__Formula__Group_10__3__Impl rule__Formula__Group_10__4
            {
            pushFollow(FOLLOW_29);
            rule__Formula__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10__3"


    // $ANTLR start "rule__Formula__Group_10__3__Impl"
    // InternalPagos.g:5471:1: rule__Formula__Group_10__3__Impl : ( 'Retornar:' ) ;
    public final void rule__Formula__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5475:1: ( ( 'Retornar:' ) )
            // InternalPagos.g:5476:1: ( 'Retornar:' )
            {
            // InternalPagos.g:5476:1: ( 'Retornar:' )
            // InternalPagos.g:5477:2: 'Retornar:'
            {
             before(grammarAccess.getFormulaAccess().getRetornarKeyword_10_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getRetornarKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10__3__Impl"


    // $ANTLR start "rule__Formula__Group_10__4"
    // InternalPagos.g:5486:1: rule__Formula__Group_10__4 : rule__Formula__Group_10__4__Impl rule__Formula__Group_10__5 ;
    public final void rule__Formula__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5490:1: ( rule__Formula__Group_10__4__Impl rule__Formula__Group_10__5 )
            // InternalPagos.g:5491:2: rule__Formula__Group_10__4__Impl rule__Formula__Group_10__5
            {
            pushFollow(FOLLOW_9);
            rule__Formula__Group_10__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_10__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10__4"


    // $ANTLR start "rule__Formula__Group_10__4__Impl"
    // InternalPagos.g:5498:1: rule__Formula__Group_10__4__Impl : ( ( rule__Formula__ExpressionAssignment_10_4 ) ) ;
    public final void rule__Formula__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5502:1: ( ( ( rule__Formula__ExpressionAssignment_10_4 ) ) )
            // InternalPagos.g:5503:1: ( ( rule__Formula__ExpressionAssignment_10_4 ) )
            {
            // InternalPagos.g:5503:1: ( ( rule__Formula__ExpressionAssignment_10_4 ) )
            // InternalPagos.g:5504:2: ( rule__Formula__ExpressionAssignment_10_4 )
            {
             before(grammarAccess.getFormulaAccess().getExpressionAssignment_10_4()); 
            // InternalPagos.g:5505:2: ( rule__Formula__ExpressionAssignment_10_4 )
            // InternalPagos.g:5505:3: rule__Formula__ExpressionAssignment_10_4
            {
            pushFollow(FOLLOW_2);
            rule__Formula__ExpressionAssignment_10_4();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getExpressionAssignment_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10__4__Impl"


    // $ANTLR start "rule__Formula__Group_10__5"
    // InternalPagos.g:5513:1: rule__Formula__Group_10__5 : rule__Formula__Group_10__5__Impl ;
    public final void rule__Formula__Group_10__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5517:1: ( rule__Formula__Group_10__5__Impl )
            // InternalPagos.g:5518:2: rule__Formula__Group_10__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group_10__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10__5"


    // $ANTLR start "rule__Formula__Group_10__5__Impl"
    // InternalPagos.g:5524:1: rule__Formula__Group_10__5__Impl : ( RULE_RBRACE ) ;
    public final void rule__Formula__Group_10__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5528:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:5529:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:5529:1: ( RULE_RBRACE )
            // InternalPagos.g:5530:2: RULE_RBRACE
            {
             before(grammarAccess.getFormulaAccess().getRBRACETerminalRuleCall_10_5()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getRBRACETerminalRuleCall_10_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10__5__Impl"


    // $ANTLR start "rule__Formula__Group_10_1__0"
    // InternalPagos.g:5540:1: rule__Formula__Group_10_1__0 : rule__Formula__Group_10_1__0__Impl rule__Formula__Group_10_1__1 ;
    public final void rule__Formula__Group_10_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5544:1: ( rule__Formula__Group_10_1__0__Impl rule__Formula__Group_10_1__1 )
            // InternalPagos.g:5545:2: rule__Formula__Group_10_1__0__Impl rule__Formula__Group_10_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Formula__Group_10_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_10_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10_1__0"


    // $ANTLR start "rule__Formula__Group_10_1__0__Impl"
    // InternalPagos.g:5552:1: rule__Formula__Group_10_1__0__Impl : ( 'Si' ) ;
    public final void rule__Formula__Group_10_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5556:1: ( ( 'Si' ) )
            // InternalPagos.g:5557:1: ( 'Si' )
            {
            // InternalPagos.g:5557:1: ( 'Si' )
            // InternalPagos.g:5558:2: 'Si'
            {
             before(grammarAccess.getFormulaAccess().getSiKeyword_10_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getSiKeyword_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10_1__0__Impl"


    // $ANTLR start "rule__Formula__Group_10_1__1"
    // InternalPagos.g:5567:1: rule__Formula__Group_10_1__1 : rule__Formula__Group_10_1__1__Impl rule__Formula__Group_10_1__2 ;
    public final void rule__Formula__Group_10_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5571:1: ( rule__Formula__Group_10_1__1__Impl rule__Formula__Group_10_1__2 )
            // InternalPagos.g:5572:2: rule__Formula__Group_10_1__1__Impl rule__Formula__Group_10_1__2
            {
            pushFollow(FOLLOW_25);
            rule__Formula__Group_10_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_10_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10_1__1"


    // $ANTLR start "rule__Formula__Group_10_1__1__Impl"
    // InternalPagos.g:5579:1: rule__Formula__Group_10_1__1__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Formula__Group_10_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5583:1: ( ( RULE_LBRACKET ) )
            // InternalPagos.g:5584:1: ( RULE_LBRACKET )
            {
            // InternalPagos.g:5584:1: ( RULE_LBRACKET )
            // InternalPagos.g:5585:2: RULE_LBRACKET
            {
             before(grammarAccess.getFormulaAccess().getLBRACKETTerminalRuleCall_10_1_1()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getLBRACKETTerminalRuleCall_10_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10_1__1__Impl"


    // $ANTLR start "rule__Formula__Group_10_1__2"
    // InternalPagos.g:5594:1: rule__Formula__Group_10_1__2 : rule__Formula__Group_10_1__2__Impl rule__Formula__Group_10_1__3 ;
    public final void rule__Formula__Group_10_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5598:1: ( rule__Formula__Group_10_1__2__Impl rule__Formula__Group_10_1__3 )
            // InternalPagos.g:5599:2: rule__Formula__Group_10_1__2__Impl rule__Formula__Group_10_1__3
            {
            pushFollow(FOLLOW_26);
            rule__Formula__Group_10_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_10_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10_1__2"


    // $ANTLR start "rule__Formula__Group_10_1__2__Impl"
    // InternalPagos.g:5606:1: rule__Formula__Group_10_1__2__Impl : ( ( rule__Formula__LogExpAssignment_10_1_2 ) ) ;
    public final void rule__Formula__Group_10_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5610:1: ( ( ( rule__Formula__LogExpAssignment_10_1_2 ) ) )
            // InternalPagos.g:5611:1: ( ( rule__Formula__LogExpAssignment_10_1_2 ) )
            {
            // InternalPagos.g:5611:1: ( ( rule__Formula__LogExpAssignment_10_1_2 ) )
            // InternalPagos.g:5612:2: ( rule__Formula__LogExpAssignment_10_1_2 )
            {
             before(grammarAccess.getFormulaAccess().getLogExpAssignment_10_1_2()); 
            // InternalPagos.g:5613:2: ( rule__Formula__LogExpAssignment_10_1_2 )
            // InternalPagos.g:5613:3: rule__Formula__LogExpAssignment_10_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Formula__LogExpAssignment_10_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getLogExpAssignment_10_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10_1__2__Impl"


    // $ANTLR start "rule__Formula__Group_10_1__3"
    // InternalPagos.g:5621:1: rule__Formula__Group_10_1__3 : rule__Formula__Group_10_1__3__Impl rule__Formula__Group_10_1__4 ;
    public final void rule__Formula__Group_10_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5625:1: ( rule__Formula__Group_10_1__3__Impl rule__Formula__Group_10_1__4 )
            // InternalPagos.g:5626:2: rule__Formula__Group_10_1__3__Impl rule__Formula__Group_10_1__4
            {
            pushFollow(FOLLOW_27);
            rule__Formula__Group_10_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_10_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10_1__3"


    // $ANTLR start "rule__Formula__Group_10_1__3__Impl"
    // InternalPagos.g:5633:1: rule__Formula__Group_10_1__3__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Formula__Group_10_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5637:1: ( ( RULE_RBRACKET ) )
            // InternalPagos.g:5638:1: ( RULE_RBRACKET )
            {
            // InternalPagos.g:5638:1: ( RULE_RBRACKET )
            // InternalPagos.g:5639:2: RULE_RBRACKET
            {
             before(grammarAccess.getFormulaAccess().getRBRACKETTerminalRuleCall_10_1_3()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getRBRACKETTerminalRuleCall_10_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10_1__3__Impl"


    // $ANTLR start "rule__Formula__Group_10_1__4"
    // InternalPagos.g:5648:1: rule__Formula__Group_10_1__4 : rule__Formula__Group_10_1__4__Impl ;
    public final void rule__Formula__Group_10_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5652:1: ( rule__Formula__Group_10_1__4__Impl )
            // InternalPagos.g:5653:2: rule__Formula__Group_10_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group_10_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10_1__4"


    // $ANTLR start "rule__Formula__Group_10_1__4__Impl"
    // InternalPagos.g:5659:1: rule__Formula__Group_10_1__4__Impl : ( 'Entonces' ) ;
    public final void rule__Formula__Group_10_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5663:1: ( ( 'Entonces' ) )
            // InternalPagos.g:5664:1: ( 'Entonces' )
            {
            // InternalPagos.g:5664:1: ( 'Entonces' )
            // InternalPagos.g:5665:2: 'Entonces'
            {
             before(grammarAccess.getFormulaAccess().getEntoncesKeyword_10_1_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getEntoncesKeyword_10_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_10_1__4__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__0"
    // InternalPagos.g:5675:1: rule__ExpresionLogica__Group__0 : rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 ;
    public final void rule__ExpresionLogica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5679:1: ( rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 )
            // InternalPagos.g:5680:2: rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1
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
    // InternalPagos.g:5687:1: rule__ExpresionLogica__Group__0__Impl : ( ( rule__ExpresionLogica__VariableAssignment_0 ) ) ;
    public final void rule__ExpresionLogica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5691:1: ( ( ( rule__ExpresionLogica__VariableAssignment_0 ) ) )
            // InternalPagos.g:5692:1: ( ( rule__ExpresionLogica__VariableAssignment_0 ) )
            {
            // InternalPagos.g:5692:1: ( ( rule__ExpresionLogica__VariableAssignment_0 ) )
            // InternalPagos.g:5693:2: ( rule__ExpresionLogica__VariableAssignment_0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getVariableAssignment_0()); 
            // InternalPagos.g:5694:2: ( rule__ExpresionLogica__VariableAssignment_0 )
            // InternalPagos.g:5694:3: rule__ExpresionLogica__VariableAssignment_0
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
    // InternalPagos.g:5702:1: rule__ExpresionLogica__Group__1 : rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 ;
    public final void rule__ExpresionLogica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5706:1: ( rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 )
            // InternalPagos.g:5707:2: rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2
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
    // InternalPagos.g:5714:1: rule__ExpresionLogica__Group__1__Impl : ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) ) ;
    public final void rule__ExpresionLogica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5718:1: ( ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) ) )
            // InternalPagos.g:5719:1: ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) )
            {
            // InternalPagos.g:5719:1: ( ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* ) )
            // InternalPagos.g:5720:2: ( ( rule__ExpresionLogica__Group_1__0 ) ) ( ( rule__ExpresionLogica__Group_1__0 )* )
            {
            // InternalPagos.g:5720:2: ( ( rule__ExpresionLogica__Group_1__0 ) )
            // InternalPagos.g:5721:3: ( rule__ExpresionLogica__Group_1__0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 
            // InternalPagos.g:5722:3: ( rule__ExpresionLogica__Group_1__0 )
            // InternalPagos.g:5722:4: rule__ExpresionLogica__Group_1__0
            {
            pushFollow(FOLLOW_34);
            rule__ExpresionLogica__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 

            }

            // InternalPagos.g:5725:2: ( ( rule__ExpresionLogica__Group_1__0 )* )
            // InternalPagos.g:5726:3: ( rule__ExpresionLogica__Group_1__0 )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_1()); 
            // InternalPagos.g:5727:3: ( rule__ExpresionLogica__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_OPERADORLOGICO) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPagos.g:5727:4: rule__ExpresionLogica__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
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
    // InternalPagos.g:5736:1: rule__ExpresionLogica__Group__2 : rule__ExpresionLogica__Group__2__Impl ;
    public final void rule__ExpresionLogica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5740:1: ( rule__ExpresionLogica__Group__2__Impl )
            // InternalPagos.g:5741:2: rule__ExpresionLogica__Group__2__Impl
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
    // InternalPagos.g:5747:1: rule__ExpresionLogica__Group__2__Impl : ( ( rule__ExpresionLogica__Group_2__0 )? ) ;
    public final void rule__ExpresionLogica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5751:1: ( ( ( rule__ExpresionLogica__Group_2__0 )? ) )
            // InternalPagos.g:5752:1: ( ( rule__ExpresionLogica__Group_2__0 )? )
            {
            // InternalPagos.g:5752:1: ( ( rule__ExpresionLogica__Group_2__0 )? )
            // InternalPagos.g:5753:2: ( rule__ExpresionLogica__Group_2__0 )?
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_2()); 
            // InternalPagos.g:5754:2: ( rule__ExpresionLogica__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_LOGICALCONN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPagos.g:5754:3: rule__ExpresionLogica__Group_2__0
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
    // InternalPagos.g:5763:1: rule__ExpresionLogica__Group_1__0 : rule__ExpresionLogica__Group_1__0__Impl rule__ExpresionLogica__Group_1__1 ;
    public final void rule__ExpresionLogica__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5767:1: ( rule__ExpresionLogica__Group_1__0__Impl rule__ExpresionLogica__Group_1__1 )
            // InternalPagos.g:5768:2: rule__ExpresionLogica__Group_1__0__Impl rule__ExpresionLogica__Group_1__1
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
    // InternalPagos.g:5775:1: rule__ExpresionLogica__Group_1__0__Impl : ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) ) ;
    public final void rule__ExpresionLogica__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5779:1: ( ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) ) )
            // InternalPagos.g:5780:1: ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) )
            {
            // InternalPagos.g:5780:1: ( ( rule__ExpresionLogica__LogOperAssignment_1_0 ) )
            // InternalPagos.g:5781:2: ( rule__ExpresionLogica__LogOperAssignment_1_0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getLogOperAssignment_1_0()); 
            // InternalPagos.g:5782:2: ( rule__ExpresionLogica__LogOperAssignment_1_0 )
            // InternalPagos.g:5782:3: rule__ExpresionLogica__LogOperAssignment_1_0
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
    // InternalPagos.g:5790:1: rule__ExpresionLogica__Group_1__1 : rule__ExpresionLogica__Group_1__1__Impl ;
    public final void rule__ExpresionLogica__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5794:1: ( rule__ExpresionLogica__Group_1__1__Impl )
            // InternalPagos.g:5795:2: rule__ExpresionLogica__Group_1__1__Impl
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
    // InternalPagos.g:5801:1: rule__ExpresionLogica__Group_1__1__Impl : ( ( rule__ExpresionLogica__Alternatives_1_1 ) ) ;
    public final void rule__ExpresionLogica__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5805:1: ( ( ( rule__ExpresionLogica__Alternatives_1_1 ) ) )
            // InternalPagos.g:5806:1: ( ( rule__ExpresionLogica__Alternatives_1_1 ) )
            {
            // InternalPagos.g:5806:1: ( ( rule__ExpresionLogica__Alternatives_1_1 ) )
            // InternalPagos.g:5807:2: ( rule__ExpresionLogica__Alternatives_1_1 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getAlternatives_1_1()); 
            // InternalPagos.g:5808:2: ( rule__ExpresionLogica__Alternatives_1_1 )
            // InternalPagos.g:5808:3: rule__ExpresionLogica__Alternatives_1_1
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
    // InternalPagos.g:5817:1: rule__ExpresionLogica__Group_2__0 : rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1 ;
    public final void rule__ExpresionLogica__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5821:1: ( rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1 )
            // InternalPagos.g:5822:2: rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalPagos.g:5829:1: rule__ExpresionLogica__Group_2__0__Impl : ( RULE_LOGICALCONN ) ;
    public final void rule__ExpresionLogica__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5833:1: ( ( RULE_LOGICALCONN ) )
            // InternalPagos.g:5834:1: ( RULE_LOGICALCONN )
            {
            // InternalPagos.g:5834:1: ( RULE_LOGICALCONN )
            // InternalPagos.g:5835:2: RULE_LOGICALCONN
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
    // InternalPagos.g:5844:1: rule__ExpresionLogica__Group_2__1 : rule__ExpresionLogica__Group_2__1__Impl ;
    public final void rule__ExpresionLogica__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5848:1: ( rule__ExpresionLogica__Group_2__1__Impl )
            // InternalPagos.g:5849:2: rule__ExpresionLogica__Group_2__1__Impl
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
    // InternalPagos.g:5855:1: rule__ExpresionLogica__Group_2__1__Impl : ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) ) ;
    public final void rule__ExpresionLogica__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5859:1: ( ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) ) )
            // InternalPagos.g:5860:1: ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) )
            {
            // InternalPagos.g:5860:1: ( ( rule__ExpresionLogica__ExpAssignment_2_1 ) )
            // InternalPagos.g:5861:2: ( rule__ExpresionLogica__ExpAssignment_2_1 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getExpAssignment_2_1()); 
            // InternalPagos.g:5862:2: ( rule__ExpresionLogica__ExpAssignment_2_1 )
            // InternalPagos.g:5862:3: rule__ExpresionLogica__ExpAssignment_2_1
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
    // InternalPagos.g:5871:1: rule__Adicion__Group__0 : rule__Adicion__Group__0__Impl rule__Adicion__Group__1 ;
    public final void rule__Adicion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5875:1: ( rule__Adicion__Group__0__Impl rule__Adicion__Group__1 )
            // InternalPagos.g:5876:2: rule__Adicion__Group__0__Impl rule__Adicion__Group__1
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
    // InternalPagos.g:5883:1: rule__Adicion__Group__0__Impl : ( ruleMultiplicacion ) ;
    public final void rule__Adicion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5887:1: ( ( ruleMultiplicacion ) )
            // InternalPagos.g:5888:1: ( ruleMultiplicacion )
            {
            // InternalPagos.g:5888:1: ( ruleMultiplicacion )
            // InternalPagos.g:5889:2: ruleMultiplicacion
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
    // InternalPagos.g:5898:1: rule__Adicion__Group__1 : rule__Adicion__Group__1__Impl ;
    public final void rule__Adicion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5902:1: ( rule__Adicion__Group__1__Impl )
            // InternalPagos.g:5903:2: rule__Adicion__Group__1__Impl
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
    // InternalPagos.g:5909:1: rule__Adicion__Group__1__Impl : ( ( rule__Adicion__Group_1__0 )* ) ;
    public final void rule__Adicion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5913:1: ( ( ( rule__Adicion__Group_1__0 )* ) )
            // InternalPagos.g:5914:1: ( ( rule__Adicion__Group_1__0 )* )
            {
            // InternalPagos.g:5914:1: ( ( rule__Adicion__Group_1__0 )* )
            // InternalPagos.g:5915:2: ( rule__Adicion__Group_1__0 )*
            {
             before(grammarAccess.getAdicionAccess().getGroup_1()); 
            // InternalPagos.g:5916:2: ( rule__Adicion__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ADDOP) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPagos.g:5916:3: rule__Adicion__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
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
    // InternalPagos.g:5925:1: rule__Adicion__Group_1__0 : rule__Adicion__Group_1__0__Impl rule__Adicion__Group_1__1 ;
    public final void rule__Adicion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5929:1: ( rule__Adicion__Group_1__0__Impl rule__Adicion__Group_1__1 )
            // InternalPagos.g:5930:2: rule__Adicion__Group_1__0__Impl rule__Adicion__Group_1__1
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
    // InternalPagos.g:5937:1: rule__Adicion__Group_1__0__Impl : ( () ) ;
    public final void rule__Adicion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5941:1: ( ( () ) )
            // InternalPagos.g:5942:1: ( () )
            {
            // InternalPagos.g:5942:1: ( () )
            // InternalPagos.g:5943:2: ()
            {
             before(grammarAccess.getAdicionAccess().getAdicionLeftAction_1_0()); 
            // InternalPagos.g:5944:2: ()
            // InternalPagos.g:5944:3: 
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
    // InternalPagos.g:5952:1: rule__Adicion__Group_1__1 : rule__Adicion__Group_1__1__Impl rule__Adicion__Group_1__2 ;
    public final void rule__Adicion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5956:1: ( rule__Adicion__Group_1__1__Impl rule__Adicion__Group_1__2 )
            // InternalPagos.g:5957:2: rule__Adicion__Group_1__1__Impl rule__Adicion__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalPagos.g:5964:1: rule__Adicion__Group_1__1__Impl : ( ( rule__Adicion__OperatorAssignment_1_1 ) ) ;
    public final void rule__Adicion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5968:1: ( ( ( rule__Adicion__OperatorAssignment_1_1 ) ) )
            // InternalPagos.g:5969:1: ( ( rule__Adicion__OperatorAssignment_1_1 ) )
            {
            // InternalPagos.g:5969:1: ( ( rule__Adicion__OperatorAssignment_1_1 ) )
            // InternalPagos.g:5970:2: ( rule__Adicion__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdicionAccess().getOperatorAssignment_1_1()); 
            // InternalPagos.g:5971:2: ( rule__Adicion__OperatorAssignment_1_1 )
            // InternalPagos.g:5971:3: rule__Adicion__OperatorAssignment_1_1
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
    // InternalPagos.g:5979:1: rule__Adicion__Group_1__2 : rule__Adicion__Group_1__2__Impl ;
    public final void rule__Adicion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5983:1: ( rule__Adicion__Group_1__2__Impl )
            // InternalPagos.g:5984:2: rule__Adicion__Group_1__2__Impl
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
    // InternalPagos.g:5990:1: rule__Adicion__Group_1__2__Impl : ( ( rule__Adicion__RexpAssignment_1_2 ) ) ;
    public final void rule__Adicion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:5994:1: ( ( ( rule__Adicion__RexpAssignment_1_2 ) ) )
            // InternalPagos.g:5995:1: ( ( rule__Adicion__RexpAssignment_1_2 ) )
            {
            // InternalPagos.g:5995:1: ( ( rule__Adicion__RexpAssignment_1_2 ) )
            // InternalPagos.g:5996:2: ( rule__Adicion__RexpAssignment_1_2 )
            {
             before(grammarAccess.getAdicionAccess().getRexpAssignment_1_2()); 
            // InternalPagos.g:5997:2: ( rule__Adicion__RexpAssignment_1_2 )
            // InternalPagos.g:5997:3: rule__Adicion__RexpAssignment_1_2
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
    // InternalPagos.g:6006:1: rule__Multiplicacion__Group__0 : rule__Multiplicacion__Group__0__Impl rule__Multiplicacion__Group__1 ;
    public final void rule__Multiplicacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6010:1: ( rule__Multiplicacion__Group__0__Impl rule__Multiplicacion__Group__1 )
            // InternalPagos.g:6011:2: rule__Multiplicacion__Group__0__Impl rule__Multiplicacion__Group__1
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
    // InternalPagos.g:6018:1: rule__Multiplicacion__Group__0__Impl : ( ruleSigleExp ) ;
    public final void rule__Multiplicacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6022:1: ( ( ruleSigleExp ) )
            // InternalPagos.g:6023:1: ( ruleSigleExp )
            {
            // InternalPagos.g:6023:1: ( ruleSigleExp )
            // InternalPagos.g:6024:2: ruleSigleExp
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
    // InternalPagos.g:6033:1: rule__Multiplicacion__Group__1 : rule__Multiplicacion__Group__1__Impl ;
    public final void rule__Multiplicacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6037:1: ( rule__Multiplicacion__Group__1__Impl )
            // InternalPagos.g:6038:2: rule__Multiplicacion__Group__1__Impl
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
    // InternalPagos.g:6044:1: rule__Multiplicacion__Group__1__Impl : ( ( rule__Multiplicacion__Group_1__0 )* ) ;
    public final void rule__Multiplicacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6048:1: ( ( ( rule__Multiplicacion__Group_1__0 )* ) )
            // InternalPagos.g:6049:1: ( ( rule__Multiplicacion__Group_1__0 )* )
            {
            // InternalPagos.g:6049:1: ( ( rule__Multiplicacion__Group_1__0 )* )
            // InternalPagos.g:6050:2: ( rule__Multiplicacion__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicacionAccess().getGroup_1()); 
            // InternalPagos.g:6051:2: ( rule__Multiplicacion__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_MULTOP) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPagos.g:6051:3: rule__Multiplicacion__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
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
    // InternalPagos.g:6060:1: rule__Multiplicacion__Group_1__0 : rule__Multiplicacion__Group_1__0__Impl rule__Multiplicacion__Group_1__1 ;
    public final void rule__Multiplicacion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6064:1: ( rule__Multiplicacion__Group_1__0__Impl rule__Multiplicacion__Group_1__1 )
            // InternalPagos.g:6065:2: rule__Multiplicacion__Group_1__0__Impl rule__Multiplicacion__Group_1__1
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
    // InternalPagos.g:6072:1: rule__Multiplicacion__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplicacion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6076:1: ( ( () ) )
            // InternalPagos.g:6077:1: ( () )
            {
            // InternalPagos.g:6077:1: ( () )
            // InternalPagos.g:6078:2: ()
            {
             before(grammarAccess.getMultiplicacionAccess().getMultiplicacionLeftAction_1_0()); 
            // InternalPagos.g:6079:2: ()
            // InternalPagos.g:6079:3: 
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
    // InternalPagos.g:6087:1: rule__Multiplicacion__Group_1__1 : rule__Multiplicacion__Group_1__1__Impl rule__Multiplicacion__Group_1__2 ;
    public final void rule__Multiplicacion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6091:1: ( rule__Multiplicacion__Group_1__1__Impl rule__Multiplicacion__Group_1__2 )
            // InternalPagos.g:6092:2: rule__Multiplicacion__Group_1__1__Impl rule__Multiplicacion__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalPagos.g:6099:1: rule__Multiplicacion__Group_1__1__Impl : ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplicacion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6103:1: ( ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) ) )
            // InternalPagos.g:6104:1: ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) )
            {
            // InternalPagos.g:6104:1: ( ( rule__Multiplicacion__OperatorAssignment_1_1 ) )
            // InternalPagos.g:6105:2: ( rule__Multiplicacion__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicacionAccess().getOperatorAssignment_1_1()); 
            // InternalPagos.g:6106:2: ( rule__Multiplicacion__OperatorAssignment_1_1 )
            // InternalPagos.g:6106:3: rule__Multiplicacion__OperatorAssignment_1_1
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
    // InternalPagos.g:6114:1: rule__Multiplicacion__Group_1__2 : rule__Multiplicacion__Group_1__2__Impl ;
    public final void rule__Multiplicacion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6118:1: ( rule__Multiplicacion__Group_1__2__Impl )
            // InternalPagos.g:6119:2: rule__Multiplicacion__Group_1__2__Impl
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
    // InternalPagos.g:6125:1: rule__Multiplicacion__Group_1__2__Impl : ( ( rule__Multiplicacion__RexpAssignment_1_2 ) ) ;
    public final void rule__Multiplicacion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6129:1: ( ( ( rule__Multiplicacion__RexpAssignment_1_2 ) ) )
            // InternalPagos.g:6130:1: ( ( rule__Multiplicacion__RexpAssignment_1_2 ) )
            {
            // InternalPagos.g:6130:1: ( ( rule__Multiplicacion__RexpAssignment_1_2 ) )
            // InternalPagos.g:6131:2: ( rule__Multiplicacion__RexpAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicacionAccess().getRexpAssignment_1_2()); 
            // InternalPagos.g:6132:2: ( rule__Multiplicacion__RexpAssignment_1_2 )
            // InternalPagos.g:6132:3: rule__Multiplicacion__RexpAssignment_1_2
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
    // InternalPagos.g:6141:1: rule__SigleExp__Group_1__0 : rule__SigleExp__Group_1__0__Impl rule__SigleExp__Group_1__1 ;
    public final void rule__SigleExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6145:1: ( rule__SigleExp__Group_1__0__Impl rule__SigleExp__Group_1__1 )
            // InternalPagos.g:6146:2: rule__SigleExp__Group_1__0__Impl rule__SigleExp__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPagos.g:6153:1: rule__SigleExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SigleExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6157:1: ( ( '(' ) )
            // InternalPagos.g:6158:1: ( '(' )
            {
            // InternalPagos.g:6158:1: ( '(' )
            // InternalPagos.g:6159:2: '('
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
    // InternalPagos.g:6168:1: rule__SigleExp__Group_1__1 : rule__SigleExp__Group_1__1__Impl rule__SigleExp__Group_1__2 ;
    public final void rule__SigleExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6172:1: ( rule__SigleExp__Group_1__1__Impl rule__SigleExp__Group_1__2 )
            // InternalPagos.g:6173:2: rule__SigleExp__Group_1__1__Impl rule__SigleExp__Group_1__2
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
    // InternalPagos.g:6180:1: rule__SigleExp__Group_1__1__Impl : ( ruleAdicion ) ;
    public final void rule__SigleExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6184:1: ( ( ruleAdicion ) )
            // InternalPagos.g:6185:1: ( ruleAdicion )
            {
            // InternalPagos.g:6185:1: ( ruleAdicion )
            // InternalPagos.g:6186:2: ruleAdicion
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
    // InternalPagos.g:6195:1: rule__SigleExp__Group_1__2 : rule__SigleExp__Group_1__2__Impl ;
    public final void rule__SigleExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6199:1: ( rule__SigleExp__Group_1__2__Impl )
            // InternalPagos.g:6200:2: rule__SigleExp__Group_1__2__Impl
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
    // InternalPagos.g:6206:1: rule__SigleExp__Group_1__2__Impl : ( ')' ) ;
    public final void rule__SigleExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6210:1: ( ( ')' ) )
            // InternalPagos.g:6211:1: ( ')' )
            {
            // InternalPagos.g:6211:1: ( ')' )
            // InternalPagos.g:6212:2: ')'
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


    // $ANTLR start "rule__SuperEntityAttribute__Group__0"
    // InternalPagos.g:6222:1: rule__SuperEntityAttribute__Group__0 : rule__SuperEntityAttribute__Group__0__Impl rule__SuperEntityAttribute__Group__1 ;
    public final void rule__SuperEntityAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6226:1: ( rule__SuperEntityAttribute__Group__0__Impl rule__SuperEntityAttribute__Group__1 )
            // InternalPagos.g:6227:2: rule__SuperEntityAttribute__Group__0__Impl rule__SuperEntityAttribute__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SuperEntityAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntityAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group__0"


    // $ANTLR start "rule__SuperEntityAttribute__Group__0__Impl"
    // InternalPagos.g:6234:1: rule__SuperEntityAttribute__Group__0__Impl : ( () ) ;
    public final void rule__SuperEntityAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6238:1: ( ( () ) )
            // InternalPagos.g:6239:1: ( () )
            {
            // InternalPagos.g:6239:1: ( () )
            // InternalPagos.g:6240:2: ()
            {
             before(grammarAccess.getSuperEntityAttributeAccess().getSuperEntityAttributeAction_0()); 
            // InternalPagos.g:6241:2: ()
            // InternalPagos.g:6241:3: 
            {
            }

             after(grammarAccess.getSuperEntityAttributeAccess().getSuperEntityAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group__0__Impl"


    // $ANTLR start "rule__SuperEntityAttribute__Group__1"
    // InternalPagos.g:6249:1: rule__SuperEntityAttribute__Group__1 : rule__SuperEntityAttribute__Group__1__Impl rule__SuperEntityAttribute__Group__2 ;
    public final void rule__SuperEntityAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6253:1: ( rule__SuperEntityAttribute__Group__1__Impl rule__SuperEntityAttribute__Group__2 )
            // InternalPagos.g:6254:2: rule__SuperEntityAttribute__Group__1__Impl rule__SuperEntityAttribute__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SuperEntityAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntityAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group__1"


    // $ANTLR start "rule__SuperEntityAttribute__Group__1__Impl"
    // InternalPagos.g:6261:1: rule__SuperEntityAttribute__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__SuperEntityAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6265:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:6266:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:6266:1: ( RULE_LBRACE )
            // InternalPagos.g:6267:2: RULE_LBRACE
            {
             before(grammarAccess.getSuperEntityAttributeAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAttributeAccess().getLBRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group__1__Impl"


    // $ANTLR start "rule__SuperEntityAttribute__Group__2"
    // InternalPagos.g:6276:1: rule__SuperEntityAttribute__Group__2 : rule__SuperEntityAttribute__Group__2__Impl rule__SuperEntityAttribute__Group__3 ;
    public final void rule__SuperEntityAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6280:1: ( rule__SuperEntityAttribute__Group__2__Impl rule__SuperEntityAttribute__Group__3 )
            // InternalPagos.g:6281:2: rule__SuperEntityAttribute__Group__2__Impl rule__SuperEntityAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SuperEntityAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntityAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group__2"


    // $ANTLR start "rule__SuperEntityAttribute__Group__2__Impl"
    // InternalPagos.g:6288:1: rule__SuperEntityAttribute__Group__2__Impl : ( ( rule__SuperEntityAttribute__NameAssignment_2 ) ) ;
    public final void rule__SuperEntityAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6292:1: ( ( ( rule__SuperEntityAttribute__NameAssignment_2 ) ) )
            // InternalPagos.g:6293:1: ( ( rule__SuperEntityAttribute__NameAssignment_2 ) )
            {
            // InternalPagos.g:6293:1: ( ( rule__SuperEntityAttribute__NameAssignment_2 ) )
            // InternalPagos.g:6294:2: ( rule__SuperEntityAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getSuperEntityAttributeAccess().getNameAssignment_2()); 
            // InternalPagos.g:6295:2: ( rule__SuperEntityAttribute__NameAssignment_2 )
            // InternalPagos.g:6295:3: rule__SuperEntityAttribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntityAttribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSuperEntityAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group__2__Impl"


    // $ANTLR start "rule__SuperEntityAttribute__Group__3"
    // InternalPagos.g:6303:1: rule__SuperEntityAttribute__Group__3 : rule__SuperEntityAttribute__Group__3__Impl rule__SuperEntityAttribute__Group__4 ;
    public final void rule__SuperEntityAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6307:1: ( rule__SuperEntityAttribute__Group__3__Impl rule__SuperEntityAttribute__Group__4 )
            // InternalPagos.g:6308:2: rule__SuperEntityAttribute__Group__3__Impl rule__SuperEntityAttribute__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__SuperEntityAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntityAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group__3"


    // $ANTLR start "rule__SuperEntityAttribute__Group__3__Impl"
    // InternalPagos.g:6315:1: rule__SuperEntityAttribute__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__SuperEntityAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6319:1: ( ( RULE_COLON ) )
            // InternalPagos.g:6320:1: ( RULE_COLON )
            {
            // InternalPagos.g:6320:1: ( RULE_COLON )
            // InternalPagos.g:6321:2: RULE_COLON
            {
             before(grammarAccess.getSuperEntityAttributeAccess().getCOLONTerminalRuleCall_3()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAttributeAccess().getCOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group__3__Impl"


    // $ANTLR start "rule__SuperEntityAttribute__Group__4"
    // InternalPagos.g:6330:1: rule__SuperEntityAttribute__Group__4 : rule__SuperEntityAttribute__Group__4__Impl rule__SuperEntityAttribute__Group__5 ;
    public final void rule__SuperEntityAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6334:1: ( rule__SuperEntityAttribute__Group__4__Impl rule__SuperEntityAttribute__Group__5 )
            // InternalPagos.g:6335:2: rule__SuperEntityAttribute__Group__4__Impl rule__SuperEntityAttribute__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__SuperEntityAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntityAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group__4"


    // $ANTLR start "rule__SuperEntityAttribute__Group__4__Impl"
    // InternalPagos.g:6342:1: rule__SuperEntityAttribute__Group__4__Impl : ( ( rule__SuperEntityAttribute__TypeAssignment_4 ) ) ;
    public final void rule__SuperEntityAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6346:1: ( ( ( rule__SuperEntityAttribute__TypeAssignment_4 ) ) )
            // InternalPagos.g:6347:1: ( ( rule__SuperEntityAttribute__TypeAssignment_4 ) )
            {
            // InternalPagos.g:6347:1: ( ( rule__SuperEntityAttribute__TypeAssignment_4 ) )
            // InternalPagos.g:6348:2: ( rule__SuperEntityAttribute__TypeAssignment_4 )
            {
             before(grammarAccess.getSuperEntityAttributeAccess().getTypeAssignment_4()); 
            // InternalPagos.g:6349:2: ( rule__SuperEntityAttribute__TypeAssignment_4 )
            // InternalPagos.g:6349:3: rule__SuperEntityAttribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntityAttribute__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSuperEntityAttributeAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group__4__Impl"


    // $ANTLR start "rule__SuperEntityAttribute__Group__5"
    // InternalPagos.g:6357:1: rule__SuperEntityAttribute__Group__5 : rule__SuperEntityAttribute__Group__5__Impl rule__SuperEntityAttribute__Group__6 ;
    public final void rule__SuperEntityAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6361:1: ( rule__SuperEntityAttribute__Group__5__Impl rule__SuperEntityAttribute__Group__6 )
            // InternalPagos.g:6362:2: rule__SuperEntityAttribute__Group__5__Impl rule__SuperEntityAttribute__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__SuperEntityAttribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntityAttribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group__5"


    // $ANTLR start "rule__SuperEntityAttribute__Group__5__Impl"
    // InternalPagos.g:6369:1: rule__SuperEntityAttribute__Group__5__Impl : ( ( rule__SuperEntityAttribute__Group_5__0 )? ) ;
    public final void rule__SuperEntityAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6373:1: ( ( ( rule__SuperEntityAttribute__Group_5__0 )? ) )
            // InternalPagos.g:6374:1: ( ( rule__SuperEntityAttribute__Group_5__0 )? )
            {
            // InternalPagos.g:6374:1: ( ( rule__SuperEntityAttribute__Group_5__0 )? )
            // InternalPagos.g:6375:2: ( rule__SuperEntityAttribute__Group_5__0 )?
            {
             before(grammarAccess.getSuperEntityAttributeAccess().getGroup_5()); 
            // InternalPagos.g:6376:2: ( rule__SuperEntityAttribute__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPagos.g:6376:3: rule__SuperEntityAttribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SuperEntityAttribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSuperEntityAttributeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group__5__Impl"


    // $ANTLR start "rule__SuperEntityAttribute__Group__6"
    // InternalPagos.g:6384:1: rule__SuperEntityAttribute__Group__6 : rule__SuperEntityAttribute__Group__6__Impl ;
    public final void rule__SuperEntityAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6388:1: ( rule__SuperEntityAttribute__Group__6__Impl )
            // InternalPagos.g:6389:2: rule__SuperEntityAttribute__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntityAttribute__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group__6"


    // $ANTLR start "rule__SuperEntityAttribute__Group__6__Impl"
    // InternalPagos.g:6395:1: rule__SuperEntityAttribute__Group__6__Impl : ( RULE_RBRACE ) ;
    public final void rule__SuperEntityAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6399:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:6400:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:6400:1: ( RULE_RBRACE )
            // InternalPagos.g:6401:2: RULE_RBRACE
            {
             before(grammarAccess.getSuperEntityAttributeAccess().getRBRACETerminalRuleCall_6()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAttributeAccess().getRBRACETerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group__6__Impl"


    // $ANTLR start "rule__SuperEntityAttribute__Group_5__0"
    // InternalPagos.g:6411:1: rule__SuperEntityAttribute__Group_5__0 : rule__SuperEntityAttribute__Group_5__0__Impl rule__SuperEntityAttribute__Group_5__1 ;
    public final void rule__SuperEntityAttribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6415:1: ( rule__SuperEntityAttribute__Group_5__0__Impl rule__SuperEntityAttribute__Group_5__1 )
            // InternalPagos.g:6416:2: rule__SuperEntityAttribute__Group_5__0__Impl rule__SuperEntityAttribute__Group_5__1
            {
            pushFollow(FOLLOW_25);
            rule__SuperEntityAttribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperEntityAttribute__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group_5__0"


    // $ANTLR start "rule__SuperEntityAttribute__Group_5__0__Impl"
    // InternalPagos.g:6423:1: rule__SuperEntityAttribute__Group_5__0__Impl : ( ':=' ) ;
    public final void rule__SuperEntityAttribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6427:1: ( ( ':=' ) )
            // InternalPagos.g:6428:1: ( ':=' )
            {
            // InternalPagos.g:6428:1: ( ':=' )
            // InternalPagos.g:6429:2: ':='
            {
             before(grammarAccess.getSuperEntityAttributeAccess().getColonEqualsSignKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAttributeAccess().getColonEqualsSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group_5__0__Impl"


    // $ANTLR start "rule__SuperEntityAttribute__Group_5__1"
    // InternalPagos.g:6438:1: rule__SuperEntityAttribute__Group_5__1 : rule__SuperEntityAttribute__Group_5__1__Impl ;
    public final void rule__SuperEntityAttribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6442:1: ( rule__SuperEntityAttribute__Group_5__1__Impl )
            // InternalPagos.g:6443:2: rule__SuperEntityAttribute__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SuperEntityAttribute__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group_5__1"


    // $ANTLR start "rule__SuperEntityAttribute__Group_5__1__Impl"
    // InternalPagos.g:6449:1: rule__SuperEntityAttribute__Group_5__1__Impl : ( ruleNumber ) ;
    public final void rule__SuperEntityAttribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6453:1: ( ( ruleNumber ) )
            // InternalPagos.g:6454:1: ( ruleNumber )
            {
            // InternalPagos.g:6454:1: ( ruleNumber )
            // InternalPagos.g:6455:2: ruleNumber
            {
             before(grammarAccess.getSuperEntityAttributeAccess().getNumberParserRuleCall_5_1()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getSuperEntityAttributeAccess().getNumberParserRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__Group_5__1__Impl"


    // $ANTLR start "rule__EntityAttribute__Group__0"
    // InternalPagos.g:6465:1: rule__EntityAttribute__Group__0 : rule__EntityAttribute__Group__0__Impl rule__EntityAttribute__Group__1 ;
    public final void rule__EntityAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6469:1: ( rule__EntityAttribute__Group__0__Impl rule__EntityAttribute__Group__1 )
            // InternalPagos.g:6470:2: rule__EntityAttribute__Group__0__Impl rule__EntityAttribute__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EntityAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__0"


    // $ANTLR start "rule__EntityAttribute__Group__0__Impl"
    // InternalPagos.g:6477:1: rule__EntityAttribute__Group__0__Impl : ( () ) ;
    public final void rule__EntityAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6481:1: ( ( () ) )
            // InternalPagos.g:6482:1: ( () )
            {
            // InternalPagos.g:6482:1: ( () )
            // InternalPagos.g:6483:2: ()
            {
             before(grammarAccess.getEntityAttributeAccess().getEntityAttributeAction_0()); 
            // InternalPagos.g:6484:2: ()
            // InternalPagos.g:6484:3: 
            {
            }

             after(grammarAccess.getEntityAttributeAccess().getEntityAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__0__Impl"


    // $ANTLR start "rule__EntityAttribute__Group__1"
    // InternalPagos.g:6492:1: rule__EntityAttribute__Group__1 : rule__EntityAttribute__Group__1__Impl rule__EntityAttribute__Group__2 ;
    public final void rule__EntityAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6496:1: ( rule__EntityAttribute__Group__1__Impl rule__EntityAttribute__Group__2 )
            // InternalPagos.g:6497:2: rule__EntityAttribute__Group__1__Impl rule__EntityAttribute__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__EntityAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__1"


    // $ANTLR start "rule__EntityAttribute__Group__1__Impl"
    // InternalPagos.g:6504:1: rule__EntityAttribute__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__EntityAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6508:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:6509:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:6509:1: ( RULE_LBRACE )
            // InternalPagos.g:6510:2: RULE_LBRACE
            {
             before(grammarAccess.getEntityAttributeAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getEntityAttributeAccess().getLBRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__1__Impl"


    // $ANTLR start "rule__EntityAttribute__Group__2"
    // InternalPagos.g:6519:1: rule__EntityAttribute__Group__2 : rule__EntityAttribute__Group__2__Impl rule__EntityAttribute__Group__3 ;
    public final void rule__EntityAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6523:1: ( rule__EntityAttribute__Group__2__Impl rule__EntityAttribute__Group__3 )
            // InternalPagos.g:6524:2: rule__EntityAttribute__Group__2__Impl rule__EntityAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__EntityAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__2"


    // $ANTLR start "rule__EntityAttribute__Group__2__Impl"
    // InternalPagos.g:6531:1: rule__EntityAttribute__Group__2__Impl : ( ( rule__EntityAttribute__NameAssignment_2 ) ) ;
    public final void rule__EntityAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6535:1: ( ( ( rule__EntityAttribute__NameAssignment_2 ) ) )
            // InternalPagos.g:6536:1: ( ( rule__EntityAttribute__NameAssignment_2 ) )
            {
            // InternalPagos.g:6536:1: ( ( rule__EntityAttribute__NameAssignment_2 ) )
            // InternalPagos.g:6537:2: ( rule__EntityAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAttributeAccess().getNameAssignment_2()); 
            // InternalPagos.g:6538:2: ( rule__EntityAttribute__NameAssignment_2 )
            // InternalPagos.g:6538:3: rule__EntityAttribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EntityAttribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__2__Impl"


    // $ANTLR start "rule__EntityAttribute__Group__3"
    // InternalPagos.g:6546:1: rule__EntityAttribute__Group__3 : rule__EntityAttribute__Group__3__Impl rule__EntityAttribute__Group__4 ;
    public final void rule__EntityAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6550:1: ( rule__EntityAttribute__Group__3__Impl rule__EntityAttribute__Group__4 )
            // InternalPagos.g:6551:2: rule__EntityAttribute__Group__3__Impl rule__EntityAttribute__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__EntityAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__3"


    // $ANTLR start "rule__EntityAttribute__Group__3__Impl"
    // InternalPagos.g:6558:1: rule__EntityAttribute__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__EntityAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6562:1: ( ( RULE_COLON ) )
            // InternalPagos.g:6563:1: ( RULE_COLON )
            {
            // InternalPagos.g:6563:1: ( RULE_COLON )
            // InternalPagos.g:6564:2: RULE_COLON
            {
             before(grammarAccess.getEntityAttributeAccess().getCOLONTerminalRuleCall_3()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getEntityAttributeAccess().getCOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__3__Impl"


    // $ANTLR start "rule__EntityAttribute__Group__4"
    // InternalPagos.g:6573:1: rule__EntityAttribute__Group__4 : rule__EntityAttribute__Group__4__Impl rule__EntityAttribute__Group__5 ;
    public final void rule__EntityAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6577:1: ( rule__EntityAttribute__Group__4__Impl rule__EntityAttribute__Group__5 )
            // InternalPagos.g:6578:2: rule__EntityAttribute__Group__4__Impl rule__EntityAttribute__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__EntityAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__4"


    // $ANTLR start "rule__EntityAttribute__Group__4__Impl"
    // InternalPagos.g:6585:1: rule__EntityAttribute__Group__4__Impl : ( ( rule__EntityAttribute__TypeAssignment_4 ) ) ;
    public final void rule__EntityAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6589:1: ( ( ( rule__EntityAttribute__TypeAssignment_4 ) ) )
            // InternalPagos.g:6590:1: ( ( rule__EntityAttribute__TypeAssignment_4 ) )
            {
            // InternalPagos.g:6590:1: ( ( rule__EntityAttribute__TypeAssignment_4 ) )
            // InternalPagos.g:6591:2: ( rule__EntityAttribute__TypeAssignment_4 )
            {
             before(grammarAccess.getEntityAttributeAccess().getTypeAssignment_4()); 
            // InternalPagos.g:6592:2: ( rule__EntityAttribute__TypeAssignment_4 )
            // InternalPagos.g:6592:3: rule__EntityAttribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EntityAttribute__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAttributeAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__4__Impl"


    // $ANTLR start "rule__EntityAttribute__Group__5"
    // InternalPagos.g:6600:1: rule__EntityAttribute__Group__5 : rule__EntityAttribute__Group__5__Impl rule__EntityAttribute__Group__6 ;
    public final void rule__EntityAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6604:1: ( rule__EntityAttribute__Group__5__Impl rule__EntityAttribute__Group__6 )
            // InternalPagos.g:6605:2: rule__EntityAttribute__Group__5__Impl rule__EntityAttribute__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__EntityAttribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityAttribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__5"


    // $ANTLR start "rule__EntityAttribute__Group__5__Impl"
    // InternalPagos.g:6612:1: rule__EntityAttribute__Group__5__Impl : ( ( rule__EntityAttribute__Group_5__0 )? ) ;
    public final void rule__EntityAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6616:1: ( ( ( rule__EntityAttribute__Group_5__0 )? ) )
            // InternalPagos.g:6617:1: ( ( rule__EntityAttribute__Group_5__0 )? )
            {
            // InternalPagos.g:6617:1: ( ( rule__EntityAttribute__Group_5__0 )? )
            // InternalPagos.g:6618:2: ( rule__EntityAttribute__Group_5__0 )?
            {
             before(grammarAccess.getEntityAttributeAccess().getGroup_5()); 
            // InternalPagos.g:6619:2: ( rule__EntityAttribute__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPagos.g:6619:3: rule__EntityAttribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntityAttribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAttributeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__5__Impl"


    // $ANTLR start "rule__EntityAttribute__Group__6"
    // InternalPagos.g:6627:1: rule__EntityAttribute__Group__6 : rule__EntityAttribute__Group__6__Impl ;
    public final void rule__EntityAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6631:1: ( rule__EntityAttribute__Group__6__Impl )
            // InternalPagos.g:6632:2: rule__EntityAttribute__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityAttribute__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__6"


    // $ANTLR start "rule__EntityAttribute__Group__6__Impl"
    // InternalPagos.g:6638:1: rule__EntityAttribute__Group__6__Impl : ( RULE_RBRACE ) ;
    public final void rule__EntityAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6642:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:6643:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:6643:1: ( RULE_RBRACE )
            // InternalPagos.g:6644:2: RULE_RBRACE
            {
             before(grammarAccess.getEntityAttributeAccess().getRBRACETerminalRuleCall_6()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getEntityAttributeAccess().getRBRACETerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__6__Impl"


    // $ANTLR start "rule__EntityAttribute__Group_5__0"
    // InternalPagos.g:6654:1: rule__EntityAttribute__Group_5__0 : rule__EntityAttribute__Group_5__0__Impl rule__EntityAttribute__Group_5__1 ;
    public final void rule__EntityAttribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6658:1: ( rule__EntityAttribute__Group_5__0__Impl rule__EntityAttribute__Group_5__1 )
            // InternalPagos.g:6659:2: rule__EntityAttribute__Group_5__0__Impl rule__EntityAttribute__Group_5__1
            {
            pushFollow(FOLLOW_25);
            rule__EntityAttribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityAttribute__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group_5__0"


    // $ANTLR start "rule__EntityAttribute__Group_5__0__Impl"
    // InternalPagos.g:6666:1: rule__EntityAttribute__Group_5__0__Impl : ( ':=' ) ;
    public final void rule__EntityAttribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6670:1: ( ( ':=' ) )
            // InternalPagos.g:6671:1: ( ':=' )
            {
            // InternalPagos.g:6671:1: ( ':=' )
            // InternalPagos.g:6672:2: ':='
            {
             before(grammarAccess.getEntityAttributeAccess().getColonEqualsSignKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEntityAttributeAccess().getColonEqualsSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group_5__0__Impl"


    // $ANTLR start "rule__EntityAttribute__Group_5__1"
    // InternalPagos.g:6681:1: rule__EntityAttribute__Group_5__1 : rule__EntityAttribute__Group_5__1__Impl ;
    public final void rule__EntityAttribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6685:1: ( rule__EntityAttribute__Group_5__1__Impl )
            // InternalPagos.g:6686:2: rule__EntityAttribute__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityAttribute__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group_5__1"


    // $ANTLR start "rule__EntityAttribute__Group_5__1__Impl"
    // InternalPagos.g:6692:1: rule__EntityAttribute__Group_5__1__Impl : ( ruleNumber ) ;
    public final void rule__EntityAttribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6696:1: ( ( ruleNumber ) )
            // InternalPagos.g:6697:1: ( ruleNumber )
            {
            // InternalPagos.g:6697:1: ( ruleNumber )
            // InternalPagos.g:6698:2: ruleNumber
            {
             before(grammarAccess.getEntityAttributeAccess().getNumberParserRuleCall_5_1()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getEntityAttributeAccess().getNumberParserRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group_5__1__Impl"


    // $ANTLR start "rule__FormAttribute__Group__0"
    // InternalPagos.g:6708:1: rule__FormAttribute__Group__0 : rule__FormAttribute__Group__0__Impl rule__FormAttribute__Group__1 ;
    public final void rule__FormAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6712:1: ( rule__FormAttribute__Group__0__Impl rule__FormAttribute__Group__1 )
            // InternalPagos.g:6713:2: rule__FormAttribute__Group__0__Impl rule__FormAttribute__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FormAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group__0"


    // $ANTLR start "rule__FormAttribute__Group__0__Impl"
    // InternalPagos.g:6720:1: rule__FormAttribute__Group__0__Impl : ( () ) ;
    public final void rule__FormAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6724:1: ( ( () ) )
            // InternalPagos.g:6725:1: ( () )
            {
            // InternalPagos.g:6725:1: ( () )
            // InternalPagos.g:6726:2: ()
            {
             before(grammarAccess.getFormAttributeAccess().getFormAttributeAction_0()); 
            // InternalPagos.g:6727:2: ()
            // InternalPagos.g:6727:3: 
            {
            }

             after(grammarAccess.getFormAttributeAccess().getFormAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group__0__Impl"


    // $ANTLR start "rule__FormAttribute__Group__1"
    // InternalPagos.g:6735:1: rule__FormAttribute__Group__1 : rule__FormAttribute__Group__1__Impl rule__FormAttribute__Group__2 ;
    public final void rule__FormAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6739:1: ( rule__FormAttribute__Group__1__Impl rule__FormAttribute__Group__2 )
            // InternalPagos.g:6740:2: rule__FormAttribute__Group__1__Impl rule__FormAttribute__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FormAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group__1"


    // $ANTLR start "rule__FormAttribute__Group__1__Impl"
    // InternalPagos.g:6747:1: rule__FormAttribute__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__FormAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6751:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:6752:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:6752:1: ( RULE_LBRACE )
            // InternalPagos.g:6753:2: RULE_LBRACE
            {
             before(grammarAccess.getFormAttributeAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getFormAttributeAccess().getLBRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group__1__Impl"


    // $ANTLR start "rule__FormAttribute__Group__2"
    // InternalPagos.g:6762:1: rule__FormAttribute__Group__2 : rule__FormAttribute__Group__2__Impl rule__FormAttribute__Group__3 ;
    public final void rule__FormAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6766:1: ( rule__FormAttribute__Group__2__Impl rule__FormAttribute__Group__3 )
            // InternalPagos.g:6767:2: rule__FormAttribute__Group__2__Impl rule__FormAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__FormAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group__2"


    // $ANTLR start "rule__FormAttribute__Group__2__Impl"
    // InternalPagos.g:6774:1: rule__FormAttribute__Group__2__Impl : ( ( rule__FormAttribute__NameAssignment_2 ) ) ;
    public final void rule__FormAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6778:1: ( ( ( rule__FormAttribute__NameAssignment_2 ) ) )
            // InternalPagos.g:6779:1: ( ( rule__FormAttribute__NameAssignment_2 ) )
            {
            // InternalPagos.g:6779:1: ( ( rule__FormAttribute__NameAssignment_2 ) )
            // InternalPagos.g:6780:2: ( rule__FormAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getFormAttributeAccess().getNameAssignment_2()); 
            // InternalPagos.g:6781:2: ( rule__FormAttribute__NameAssignment_2 )
            // InternalPagos.g:6781:3: rule__FormAttribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FormAttribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group__2__Impl"


    // $ANTLR start "rule__FormAttribute__Group__3"
    // InternalPagos.g:6789:1: rule__FormAttribute__Group__3 : rule__FormAttribute__Group__3__Impl rule__FormAttribute__Group__4 ;
    public final void rule__FormAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6793:1: ( rule__FormAttribute__Group__3__Impl rule__FormAttribute__Group__4 )
            // InternalPagos.g:6794:2: rule__FormAttribute__Group__3__Impl rule__FormAttribute__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__FormAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group__3"


    // $ANTLR start "rule__FormAttribute__Group__3__Impl"
    // InternalPagos.g:6801:1: rule__FormAttribute__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__FormAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6805:1: ( ( RULE_COLON ) )
            // InternalPagos.g:6806:1: ( RULE_COLON )
            {
            // InternalPagos.g:6806:1: ( RULE_COLON )
            // InternalPagos.g:6807:2: RULE_COLON
            {
             before(grammarAccess.getFormAttributeAccess().getCOLONTerminalRuleCall_3()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getFormAttributeAccess().getCOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group__3__Impl"


    // $ANTLR start "rule__FormAttribute__Group__4"
    // InternalPagos.g:6816:1: rule__FormAttribute__Group__4 : rule__FormAttribute__Group__4__Impl rule__FormAttribute__Group__5 ;
    public final void rule__FormAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6820:1: ( rule__FormAttribute__Group__4__Impl rule__FormAttribute__Group__5 )
            // InternalPagos.g:6821:2: rule__FormAttribute__Group__4__Impl rule__FormAttribute__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__FormAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group__4"


    // $ANTLR start "rule__FormAttribute__Group__4__Impl"
    // InternalPagos.g:6828:1: rule__FormAttribute__Group__4__Impl : ( ( rule__FormAttribute__TypeAssignment_4 ) ) ;
    public final void rule__FormAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6832:1: ( ( ( rule__FormAttribute__TypeAssignment_4 ) ) )
            // InternalPagos.g:6833:1: ( ( rule__FormAttribute__TypeAssignment_4 ) )
            {
            // InternalPagos.g:6833:1: ( ( rule__FormAttribute__TypeAssignment_4 ) )
            // InternalPagos.g:6834:2: ( rule__FormAttribute__TypeAssignment_4 )
            {
             before(grammarAccess.getFormAttributeAccess().getTypeAssignment_4()); 
            // InternalPagos.g:6835:2: ( rule__FormAttribute__TypeAssignment_4 )
            // InternalPagos.g:6835:3: rule__FormAttribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FormAttribute__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFormAttributeAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group__4__Impl"


    // $ANTLR start "rule__FormAttribute__Group__5"
    // InternalPagos.g:6843:1: rule__FormAttribute__Group__5 : rule__FormAttribute__Group__5__Impl rule__FormAttribute__Group__6 ;
    public final void rule__FormAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6847:1: ( rule__FormAttribute__Group__5__Impl rule__FormAttribute__Group__6 )
            // InternalPagos.g:6848:2: rule__FormAttribute__Group__5__Impl rule__FormAttribute__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__FormAttribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormAttribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group__5"


    // $ANTLR start "rule__FormAttribute__Group__5__Impl"
    // InternalPagos.g:6855:1: rule__FormAttribute__Group__5__Impl : ( ( rule__FormAttribute__Group_5__0 )? ) ;
    public final void rule__FormAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6859:1: ( ( ( rule__FormAttribute__Group_5__0 )? ) )
            // InternalPagos.g:6860:1: ( ( rule__FormAttribute__Group_5__0 )? )
            {
            // InternalPagos.g:6860:1: ( ( rule__FormAttribute__Group_5__0 )? )
            // InternalPagos.g:6861:2: ( rule__FormAttribute__Group_5__0 )?
            {
             before(grammarAccess.getFormAttributeAccess().getGroup_5()); 
            // InternalPagos.g:6862:2: ( rule__FormAttribute__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPagos.g:6862:3: rule__FormAttribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormAttribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormAttributeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group__5__Impl"


    // $ANTLR start "rule__FormAttribute__Group__6"
    // InternalPagos.g:6870:1: rule__FormAttribute__Group__6 : rule__FormAttribute__Group__6__Impl ;
    public final void rule__FormAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6874:1: ( rule__FormAttribute__Group__6__Impl )
            // InternalPagos.g:6875:2: rule__FormAttribute__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormAttribute__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group__6"


    // $ANTLR start "rule__FormAttribute__Group__6__Impl"
    // InternalPagos.g:6881:1: rule__FormAttribute__Group__6__Impl : ( RULE_RBRACE ) ;
    public final void rule__FormAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6885:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:6886:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:6886:1: ( RULE_RBRACE )
            // InternalPagos.g:6887:2: RULE_RBRACE
            {
             before(grammarAccess.getFormAttributeAccess().getRBRACETerminalRuleCall_6()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getFormAttributeAccess().getRBRACETerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group__6__Impl"


    // $ANTLR start "rule__FormAttribute__Group_5__0"
    // InternalPagos.g:6897:1: rule__FormAttribute__Group_5__0 : rule__FormAttribute__Group_5__0__Impl rule__FormAttribute__Group_5__1 ;
    public final void rule__FormAttribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6901:1: ( rule__FormAttribute__Group_5__0__Impl rule__FormAttribute__Group_5__1 )
            // InternalPagos.g:6902:2: rule__FormAttribute__Group_5__0__Impl rule__FormAttribute__Group_5__1
            {
            pushFollow(FOLLOW_29);
            rule__FormAttribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormAttribute__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group_5__0"


    // $ANTLR start "rule__FormAttribute__Group_5__0__Impl"
    // InternalPagos.g:6909:1: rule__FormAttribute__Group_5__0__Impl : ( ':=' ) ;
    public final void rule__FormAttribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6913:1: ( ( ':=' ) )
            // InternalPagos.g:6914:1: ( ':=' )
            {
            // InternalPagos.g:6914:1: ( ':=' )
            // InternalPagos.g:6915:2: ':='
            {
             before(grammarAccess.getFormAttributeAccess().getColonEqualsSignKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFormAttributeAccess().getColonEqualsSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group_5__0__Impl"


    // $ANTLR start "rule__FormAttribute__Group_5__1"
    // InternalPagos.g:6924:1: rule__FormAttribute__Group_5__1 : rule__FormAttribute__Group_5__1__Impl ;
    public final void rule__FormAttribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6928:1: ( rule__FormAttribute__Group_5__1__Impl )
            // InternalPagos.g:6929:2: rule__FormAttribute__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormAttribute__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group_5__1"


    // $ANTLR start "rule__FormAttribute__Group_5__1__Impl"
    // InternalPagos.g:6935:1: rule__FormAttribute__Group_5__1__Impl : ( ( rule__FormAttribute__ExpAssignment_5_1 ) ) ;
    public final void rule__FormAttribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6939:1: ( ( ( rule__FormAttribute__ExpAssignment_5_1 ) ) )
            // InternalPagos.g:6940:1: ( ( rule__FormAttribute__ExpAssignment_5_1 ) )
            {
            // InternalPagos.g:6940:1: ( ( rule__FormAttribute__ExpAssignment_5_1 ) )
            // InternalPagos.g:6941:2: ( rule__FormAttribute__ExpAssignment_5_1 )
            {
             before(grammarAccess.getFormAttributeAccess().getExpAssignment_5_1()); 
            // InternalPagos.g:6942:2: ( rule__FormAttribute__ExpAssignment_5_1 )
            // InternalPagos.g:6942:3: rule__FormAttribute__ExpAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__FormAttribute__ExpAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFormAttributeAccess().getExpAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__Group_5__1__Impl"


    // $ANTLR start "rule__VariableAttribute__Group__0"
    // InternalPagos.g:6951:1: rule__VariableAttribute__Group__0 : rule__VariableAttribute__Group__0__Impl rule__VariableAttribute__Group__1 ;
    public final void rule__VariableAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6955:1: ( rule__VariableAttribute__Group__0__Impl rule__VariableAttribute__Group__1 )
            // InternalPagos.g:6956:2: rule__VariableAttribute__Group__0__Impl rule__VariableAttribute__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__VariableAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__0"


    // $ANTLR start "rule__VariableAttribute__Group__0__Impl"
    // InternalPagos.g:6963:1: rule__VariableAttribute__Group__0__Impl : ( () ) ;
    public final void rule__VariableAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6967:1: ( ( () ) )
            // InternalPagos.g:6968:1: ( () )
            {
            // InternalPagos.g:6968:1: ( () )
            // InternalPagos.g:6969:2: ()
            {
             before(grammarAccess.getVariableAttributeAccess().getVariableAttributeAction_0()); 
            // InternalPagos.g:6970:2: ()
            // InternalPagos.g:6970:3: 
            {
            }

             after(grammarAccess.getVariableAttributeAccess().getVariableAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__0__Impl"


    // $ANTLR start "rule__VariableAttribute__Group__1"
    // InternalPagos.g:6978:1: rule__VariableAttribute__Group__1 : rule__VariableAttribute__Group__1__Impl rule__VariableAttribute__Group__2 ;
    public final void rule__VariableAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6982:1: ( rule__VariableAttribute__Group__1__Impl rule__VariableAttribute__Group__2 )
            // InternalPagos.g:6983:2: rule__VariableAttribute__Group__1__Impl rule__VariableAttribute__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__VariableAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__1"


    // $ANTLR start "rule__VariableAttribute__Group__1__Impl"
    // InternalPagos.g:6990:1: rule__VariableAttribute__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__VariableAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:6994:1: ( ( RULE_LBRACE ) )
            // InternalPagos.g:6995:1: ( RULE_LBRACE )
            {
            // InternalPagos.g:6995:1: ( RULE_LBRACE )
            // InternalPagos.g:6996:2: RULE_LBRACE
            {
             before(grammarAccess.getVariableAttributeAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getVariableAttributeAccess().getLBRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__1__Impl"


    // $ANTLR start "rule__VariableAttribute__Group__2"
    // InternalPagos.g:7005:1: rule__VariableAttribute__Group__2 : rule__VariableAttribute__Group__2__Impl rule__VariableAttribute__Group__3 ;
    public final void rule__VariableAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7009:1: ( rule__VariableAttribute__Group__2__Impl rule__VariableAttribute__Group__3 )
            // InternalPagos.g:7010:2: rule__VariableAttribute__Group__2__Impl rule__VariableAttribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__VariableAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__2"


    // $ANTLR start "rule__VariableAttribute__Group__2__Impl"
    // InternalPagos.g:7017:1: rule__VariableAttribute__Group__2__Impl : ( ( rule__VariableAttribute__NameAssignment_2 ) ) ;
    public final void rule__VariableAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7021:1: ( ( ( rule__VariableAttribute__NameAssignment_2 ) ) )
            // InternalPagos.g:7022:1: ( ( rule__VariableAttribute__NameAssignment_2 ) )
            {
            // InternalPagos.g:7022:1: ( ( rule__VariableAttribute__NameAssignment_2 ) )
            // InternalPagos.g:7023:2: ( rule__VariableAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getVariableAttributeAccess().getNameAssignment_2()); 
            // InternalPagos.g:7024:2: ( rule__VariableAttribute__NameAssignment_2 )
            // InternalPagos.g:7024:3: rule__VariableAttribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableAttribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__2__Impl"


    // $ANTLR start "rule__VariableAttribute__Group__3"
    // InternalPagos.g:7032:1: rule__VariableAttribute__Group__3 : rule__VariableAttribute__Group__3__Impl rule__VariableAttribute__Group__4 ;
    public final void rule__VariableAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7036:1: ( rule__VariableAttribute__Group__3__Impl rule__VariableAttribute__Group__4 )
            // InternalPagos.g:7037:2: rule__VariableAttribute__Group__3__Impl rule__VariableAttribute__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__VariableAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__3"


    // $ANTLR start "rule__VariableAttribute__Group__3__Impl"
    // InternalPagos.g:7044:1: rule__VariableAttribute__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__VariableAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7048:1: ( ( RULE_COLON ) )
            // InternalPagos.g:7049:1: ( RULE_COLON )
            {
            // InternalPagos.g:7049:1: ( RULE_COLON )
            // InternalPagos.g:7050:2: RULE_COLON
            {
             before(grammarAccess.getVariableAttributeAccess().getCOLONTerminalRuleCall_3()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getVariableAttributeAccess().getCOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__3__Impl"


    // $ANTLR start "rule__VariableAttribute__Group__4"
    // InternalPagos.g:7059:1: rule__VariableAttribute__Group__4 : rule__VariableAttribute__Group__4__Impl rule__VariableAttribute__Group__5 ;
    public final void rule__VariableAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7063:1: ( rule__VariableAttribute__Group__4__Impl rule__VariableAttribute__Group__5 )
            // InternalPagos.g:7064:2: rule__VariableAttribute__Group__4__Impl rule__VariableAttribute__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__VariableAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__4"


    // $ANTLR start "rule__VariableAttribute__Group__4__Impl"
    // InternalPagos.g:7071:1: rule__VariableAttribute__Group__4__Impl : ( ( rule__VariableAttribute__TypeAssignment_4 ) ) ;
    public final void rule__VariableAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7075:1: ( ( ( rule__VariableAttribute__TypeAssignment_4 ) ) )
            // InternalPagos.g:7076:1: ( ( rule__VariableAttribute__TypeAssignment_4 ) )
            {
            // InternalPagos.g:7076:1: ( ( rule__VariableAttribute__TypeAssignment_4 ) )
            // InternalPagos.g:7077:2: ( rule__VariableAttribute__TypeAssignment_4 )
            {
             before(grammarAccess.getVariableAttributeAccess().getTypeAssignment_4()); 
            // InternalPagos.g:7078:2: ( rule__VariableAttribute__TypeAssignment_4 )
            // InternalPagos.g:7078:3: rule__VariableAttribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VariableAttribute__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVariableAttributeAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__4__Impl"


    // $ANTLR start "rule__VariableAttribute__Group__5"
    // InternalPagos.g:7086:1: rule__VariableAttribute__Group__5 : rule__VariableAttribute__Group__5__Impl rule__VariableAttribute__Group__6 ;
    public final void rule__VariableAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7090:1: ( rule__VariableAttribute__Group__5__Impl rule__VariableAttribute__Group__6 )
            // InternalPagos.g:7091:2: rule__VariableAttribute__Group__5__Impl rule__VariableAttribute__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__VariableAttribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAttribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__5"


    // $ANTLR start "rule__VariableAttribute__Group__5__Impl"
    // InternalPagos.g:7098:1: rule__VariableAttribute__Group__5__Impl : ( ( rule__VariableAttribute__Group_5__0 )? ) ;
    public final void rule__VariableAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7102:1: ( ( ( rule__VariableAttribute__Group_5__0 )? ) )
            // InternalPagos.g:7103:1: ( ( rule__VariableAttribute__Group_5__0 )? )
            {
            // InternalPagos.g:7103:1: ( ( rule__VariableAttribute__Group_5__0 )? )
            // InternalPagos.g:7104:2: ( rule__VariableAttribute__Group_5__0 )?
            {
             before(grammarAccess.getVariableAttributeAccess().getGroup_5()); 
            // InternalPagos.g:7105:2: ( rule__VariableAttribute__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPagos.g:7105:3: rule__VariableAttribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableAttribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAttributeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__5__Impl"


    // $ANTLR start "rule__VariableAttribute__Group__6"
    // InternalPagos.g:7113:1: rule__VariableAttribute__Group__6 : rule__VariableAttribute__Group__6__Impl ;
    public final void rule__VariableAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7117:1: ( rule__VariableAttribute__Group__6__Impl )
            // InternalPagos.g:7118:2: rule__VariableAttribute__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableAttribute__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__6"


    // $ANTLR start "rule__VariableAttribute__Group__6__Impl"
    // InternalPagos.g:7124:1: rule__VariableAttribute__Group__6__Impl : ( RULE_RBRACE ) ;
    public final void rule__VariableAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7128:1: ( ( RULE_RBRACE ) )
            // InternalPagos.g:7129:1: ( RULE_RBRACE )
            {
            // InternalPagos.g:7129:1: ( RULE_RBRACE )
            // InternalPagos.g:7130:2: RULE_RBRACE
            {
             before(grammarAccess.getVariableAttributeAccess().getRBRACETerminalRuleCall_6()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getVariableAttributeAccess().getRBRACETerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__6__Impl"


    // $ANTLR start "rule__VariableAttribute__Group_5__0"
    // InternalPagos.g:7140:1: rule__VariableAttribute__Group_5__0 : rule__VariableAttribute__Group_5__0__Impl rule__VariableAttribute__Group_5__1 ;
    public final void rule__VariableAttribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7144:1: ( rule__VariableAttribute__Group_5__0__Impl rule__VariableAttribute__Group_5__1 )
            // InternalPagos.g:7145:2: rule__VariableAttribute__Group_5__0__Impl rule__VariableAttribute__Group_5__1
            {
            pushFollow(FOLLOW_29);
            rule__VariableAttribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAttribute__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group_5__0"


    // $ANTLR start "rule__VariableAttribute__Group_5__0__Impl"
    // InternalPagos.g:7152:1: rule__VariableAttribute__Group_5__0__Impl : ( ':=' ) ;
    public final void rule__VariableAttribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7156:1: ( ( ':=' ) )
            // InternalPagos.g:7157:1: ( ':=' )
            {
            // InternalPagos.g:7157:1: ( ':=' )
            // InternalPagos.g:7158:2: ':='
            {
             before(grammarAccess.getVariableAttributeAccess().getColonEqualsSignKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVariableAttributeAccess().getColonEqualsSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group_5__0__Impl"


    // $ANTLR start "rule__VariableAttribute__Group_5__1"
    // InternalPagos.g:7167:1: rule__VariableAttribute__Group_5__1 : rule__VariableAttribute__Group_5__1__Impl ;
    public final void rule__VariableAttribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7171:1: ( rule__VariableAttribute__Group_5__1__Impl )
            // InternalPagos.g:7172:2: rule__VariableAttribute__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableAttribute__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group_5__1"


    // $ANTLR start "rule__VariableAttribute__Group_5__1__Impl"
    // InternalPagos.g:7178:1: rule__VariableAttribute__Group_5__1__Impl : ( ( rule__VariableAttribute__ExpAssignment_5_1 ) ) ;
    public final void rule__VariableAttribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7182:1: ( ( ( rule__VariableAttribute__ExpAssignment_5_1 ) ) )
            // InternalPagos.g:7183:1: ( ( rule__VariableAttribute__ExpAssignment_5_1 ) )
            {
            // InternalPagos.g:7183:1: ( ( rule__VariableAttribute__ExpAssignment_5_1 ) )
            // InternalPagos.g:7184:2: ( rule__VariableAttribute__ExpAssignment_5_1 )
            {
             before(grammarAccess.getVariableAttributeAccess().getExpAssignment_5_1()); 
            // InternalPagos.g:7185:2: ( rule__VariableAttribute__ExpAssignment_5_1 )
            // InternalPagos.g:7185:3: rule__VariableAttribute__ExpAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableAttribute__ExpAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAttributeAccess().getExpAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group_5__1__Impl"


    // $ANTLR start "rule__TerminalValue__Group_0__0"
    // InternalPagos.g:7194:1: rule__TerminalValue__Group_0__0 : rule__TerminalValue__Group_0__0__Impl rule__TerminalValue__Group_0__1 ;
    public final void rule__TerminalValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7198:1: ( rule__TerminalValue__Group_0__0__Impl rule__TerminalValue__Group_0__1 )
            // InternalPagos.g:7199:2: rule__TerminalValue__Group_0__0__Impl rule__TerminalValue__Group_0__1
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
    // InternalPagos.g:7206:1: rule__TerminalValue__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7210:1: ( ( () ) )
            // InternalPagos.g:7211:1: ( () )
            {
            // InternalPagos.g:7211:1: ( () )
            // InternalPagos.g:7212:2: ()
            {
             before(grammarAccess.getTerminalValueAccess().getTerminalValueAction_0_0()); 
            // InternalPagos.g:7213:2: ()
            // InternalPagos.g:7213:3: 
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
    // InternalPagos.g:7221:1: rule__TerminalValue__Group_0__1 : rule__TerminalValue__Group_0__1__Impl ;
    public final void rule__TerminalValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7225:1: ( rule__TerminalValue__Group_0__1__Impl )
            // InternalPagos.g:7226:2: rule__TerminalValue__Group_0__1__Impl
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
    // InternalPagos.g:7232:1: rule__TerminalValue__Group_0__1__Impl : ( ( rule__TerminalValue__VariableAssignment_0_1 ) ) ;
    public final void rule__TerminalValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7236:1: ( ( ( rule__TerminalValue__VariableAssignment_0_1 ) ) )
            // InternalPagos.g:7237:1: ( ( rule__TerminalValue__VariableAssignment_0_1 ) )
            {
            // InternalPagos.g:7237:1: ( ( rule__TerminalValue__VariableAssignment_0_1 ) )
            // InternalPagos.g:7238:2: ( rule__TerminalValue__VariableAssignment_0_1 )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableAssignment_0_1()); 
            // InternalPagos.g:7239:2: ( rule__TerminalValue__VariableAssignment_0_1 )
            // InternalPagos.g:7239:3: rule__TerminalValue__VariableAssignment_0_1
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
    // InternalPagos.g:7248:1: rule__MathADD__Group__0 : rule__MathADD__Group__0__Impl rule__MathADD__Group__1 ;
    public final void rule__MathADD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7252:1: ( rule__MathADD__Group__0__Impl rule__MathADD__Group__1 )
            // InternalPagos.g:7253:2: rule__MathADD__Group__0__Impl rule__MathADD__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalPagos.g:7260:1: rule__MathADD__Group__0__Impl : ( () ) ;
    public final void rule__MathADD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7264:1: ( ( () ) )
            // InternalPagos.g:7265:1: ( () )
            {
            // InternalPagos.g:7265:1: ( () )
            // InternalPagos.g:7266:2: ()
            {
             before(grammarAccess.getMathADDAccess().getMathADDAction_0()); 
            // InternalPagos.g:7267:2: ()
            // InternalPagos.g:7267:3: 
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
    // InternalPagos.g:7275:1: rule__MathADD__Group__1 : rule__MathADD__Group__1__Impl ;
    public final void rule__MathADD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7279:1: ( rule__MathADD__Group__1__Impl )
            // InternalPagos.g:7280:2: rule__MathADD__Group__1__Impl
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
    // InternalPagos.g:7286:1: rule__MathADD__Group__1__Impl : ( ( rule__MathADD__OperadorAssignment_1 ) ) ;
    public final void rule__MathADD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7290:1: ( ( ( rule__MathADD__OperadorAssignment_1 ) ) )
            // InternalPagos.g:7291:1: ( ( rule__MathADD__OperadorAssignment_1 ) )
            {
            // InternalPagos.g:7291:1: ( ( rule__MathADD__OperadorAssignment_1 ) )
            // InternalPagos.g:7292:2: ( rule__MathADD__OperadorAssignment_1 )
            {
             before(grammarAccess.getMathADDAccess().getOperadorAssignment_1()); 
            // InternalPagos.g:7293:2: ( rule__MathADD__OperadorAssignment_1 )
            // InternalPagos.g:7293:3: rule__MathADD__OperadorAssignment_1
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
    // InternalPagos.g:7302:1: rule__MathMULT__Group__0 : rule__MathMULT__Group__0__Impl rule__MathMULT__Group__1 ;
    public final void rule__MathMULT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7306:1: ( rule__MathMULT__Group__0__Impl rule__MathMULT__Group__1 )
            // InternalPagos.g:7307:2: rule__MathMULT__Group__0__Impl rule__MathMULT__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalPagos.g:7314:1: rule__MathMULT__Group__0__Impl : ( () ) ;
    public final void rule__MathMULT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7318:1: ( ( () ) )
            // InternalPagos.g:7319:1: ( () )
            {
            // InternalPagos.g:7319:1: ( () )
            // InternalPagos.g:7320:2: ()
            {
             before(grammarAccess.getMathMULTAccess().getMathMULTAction_0()); 
            // InternalPagos.g:7321:2: ()
            // InternalPagos.g:7321:3: 
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
    // InternalPagos.g:7329:1: rule__MathMULT__Group__1 : rule__MathMULT__Group__1__Impl ;
    public final void rule__MathMULT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7333:1: ( rule__MathMULT__Group__1__Impl )
            // InternalPagos.g:7334:2: rule__MathMULT__Group__1__Impl
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
    // InternalPagos.g:7340:1: rule__MathMULT__Group__1__Impl : ( ( rule__MathMULT__OperadorAssignment_1 ) ) ;
    public final void rule__MathMULT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7344:1: ( ( ( rule__MathMULT__OperadorAssignment_1 ) ) )
            // InternalPagos.g:7345:1: ( ( rule__MathMULT__OperadorAssignment_1 ) )
            {
            // InternalPagos.g:7345:1: ( ( rule__MathMULT__OperadorAssignment_1 ) )
            // InternalPagos.g:7346:2: ( rule__MathMULT__OperadorAssignment_1 )
            {
             before(grammarAccess.getMathMULTAccess().getOperadorAssignment_1()); 
            // InternalPagos.g:7347:2: ( rule__MathMULT__OperadorAssignment_1 )
            // InternalPagos.g:7347:3: rule__MathMULT__OperadorAssignment_1
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
    // InternalPagos.g:7356:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7360:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalPagos.g:7361:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalPagos.g:7368:1: rule__EDouble__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7372:1: ( ( ( RULE_INT )? ) )
            // InternalPagos.g:7373:1: ( ( RULE_INT )? )
            {
            // InternalPagos.g:7373:1: ( ( RULE_INT )? )
            // InternalPagos.g:7374:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            // InternalPagos.g:7375:2: ( RULE_INT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPagos.g:7375:3: RULE_INT
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
    // InternalPagos.g:7383:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7387:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalPagos.g:7388:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalPagos.g:7395:1: rule__EDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7399:1: ( ( '.' ) )
            // InternalPagos.g:7400:1: ( '.' )
            {
            // InternalPagos.g:7400:1: ( '.' )
            // InternalPagos.g:7401:2: '.'
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
    // InternalPagos.g:7410:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7414:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalPagos.g:7415:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalPagos.g:7422:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7426:1: ( ( RULE_INT ) )
            // InternalPagos.g:7427:1: ( RULE_INT )
            {
            // InternalPagos.g:7427:1: ( RULE_INT )
            // InternalPagos.g:7428:2: RULE_INT
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
    // InternalPagos.g:7437:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7441:1: ( rule__EDouble__Group__3__Impl )
            // InternalPagos.g:7442:2: rule__EDouble__Group__3__Impl
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
    // InternalPagos.g:7448:1: rule__EDouble__Group__3__Impl : ( ( rule__EDouble__Group_3__0 )? ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7452:1: ( ( ( rule__EDouble__Group_3__0 )? ) )
            // InternalPagos.g:7453:1: ( ( rule__EDouble__Group_3__0 )? )
            {
            // InternalPagos.g:7453:1: ( ( rule__EDouble__Group_3__0 )? )
            // InternalPagos.g:7454:2: ( rule__EDouble__Group_3__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_3()); 
            // InternalPagos.g:7455:2: ( rule__EDouble__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=24 && LA31_0<=25)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPagos.g:7455:3: rule__EDouble__Group_3__0
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
    // InternalPagos.g:7464:1: rule__EDouble__Group_3__0 : rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 ;
    public final void rule__EDouble__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7468:1: ( rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 )
            // InternalPagos.g:7469:2: rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalPagos.g:7476:1: rule__EDouble__Group_3__0__Impl : ( ( rule__EDouble__Alternatives_3_0 ) ) ;
    public final void rule__EDouble__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7480:1: ( ( ( rule__EDouble__Alternatives_3_0 ) ) )
            // InternalPagos.g:7481:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            {
            // InternalPagos.g:7481:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            // InternalPagos.g:7482:2: ( rule__EDouble__Alternatives_3_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 
            // InternalPagos.g:7483:2: ( rule__EDouble__Alternatives_3_0 )
            // InternalPagos.g:7483:3: rule__EDouble__Alternatives_3_0
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
    // InternalPagos.g:7491:1: rule__EDouble__Group_3__1 : rule__EDouble__Group_3__1__Impl ;
    public final void rule__EDouble__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7495:1: ( rule__EDouble__Group_3__1__Impl )
            // InternalPagos.g:7496:2: rule__EDouble__Group_3__1__Impl
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
    // InternalPagos.g:7502:1: rule__EDouble__Group_3__1__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7506:1: ( ( RULE_INT ) )
            // InternalPagos.g:7507:1: ( RULE_INT )
            {
            // InternalPagos.g:7507:1: ( RULE_INT )
            // InternalPagos.g:7508:2: RULE_INT
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
    // InternalPagos.g:7518:1: rule__Application__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7522:1: ( ( RULE_ID ) )
            // InternalPagos.g:7523:2: ( RULE_ID )
            {
            // InternalPagos.g:7523:2: ( RULE_ID )
            // InternalPagos.g:7524:3: RULE_ID
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
    // InternalPagos.g:7533:1: rule__Application__IntermediaryAssignment_7 : ( ruleIntermediary ) ;
    public final void rule__Application__IntermediaryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7537:1: ( ( ruleIntermediary ) )
            // InternalPagos.g:7538:2: ( ruleIntermediary )
            {
            // InternalPagos.g:7538:2: ( ruleIntermediary )
            // InternalPagos.g:7539:3: ruleIntermediary
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
    // InternalPagos.g:7548:1: rule__Intermediary__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Intermediary__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7552:1: ( ( RULE_ID ) )
            // InternalPagos.g:7553:2: ( RULE_ID )
            {
            // InternalPagos.g:7553:2: ( RULE_ID )
            // InternalPagos.g:7554:3: RULE_ID
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
    // InternalPagos.g:7563:1: rule__Intermediary__SuperentitieAssignment_9 : ( ruleSuperEntity ) ;
    public final void rule__Intermediary__SuperentitieAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7567:1: ( ( ruleSuperEntity ) )
            // InternalPagos.g:7568:2: ( ruleSuperEntity )
            {
            // InternalPagos.g:7568:2: ( ruleSuperEntity )
            // InternalPagos.g:7569:3: ruleSuperEntity
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
    // InternalPagos.g:7578:1: rule__Intermediary__SuperentitieAssignment_10_1 : ( ruleSuperEntity ) ;
    public final void rule__Intermediary__SuperentitieAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7582:1: ( ( ruleSuperEntity ) )
            // InternalPagos.g:7583:2: ( ruleSuperEntity )
            {
            // InternalPagos.g:7583:2: ( ruleSuperEntity )
            // InternalPagos.g:7584:3: ruleSuperEntity
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
    // InternalPagos.g:7593:1: rule__SuperEntity__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__SuperEntity__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7597:1: ( ( RULE_ID ) )
            // InternalPagos.g:7598:2: ( RULE_ID )
            {
            // InternalPagos.g:7598:2: ( RULE_ID )
            // InternalPagos.g:7599:3: RULE_ID
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
    // InternalPagos.g:7608:1: rule__SuperEntity__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__SuperEntity__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7612:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7613:2: ( RULE_STRING )
            {
            // InternalPagos.g:7613:2: ( RULE_STRING )
            // InternalPagos.g:7614:3: RULE_STRING
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
    // InternalPagos.g:7623:1: rule__SuperEntity__AttListsAssignment_13 : ( ruleSuperEntityAttribute ) ;
    public final void rule__SuperEntity__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7627:1: ( ( ruleSuperEntityAttribute ) )
            // InternalPagos.g:7628:2: ( ruleSuperEntityAttribute )
            {
            // InternalPagos.g:7628:2: ( ruleSuperEntityAttribute )
            // InternalPagos.g:7629:3: ruleSuperEntityAttribute
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsSuperEntityAttributeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleSuperEntityAttribute();

            state._fsp--;

             after(grammarAccess.getSuperEntityAccess().getAttListsSuperEntityAttributeParserRuleCall_13_0()); 

            }


            }

        }
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
    // InternalPagos.g:7638:1: rule__SuperEntity__AttListsAssignment_14_1 : ( ruleSuperEntityAttribute ) ;
    public final void rule__SuperEntity__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7642:1: ( ( ruleSuperEntityAttribute ) )
            // InternalPagos.g:7643:2: ( ruleSuperEntityAttribute )
            {
            // InternalPagos.g:7643:2: ( ruleSuperEntityAttribute )
            // InternalPagos.g:7644:3: ruleSuperEntityAttribute
            {
             before(grammarAccess.getSuperEntityAccess().getAttListsSuperEntityAttributeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSuperEntityAttribute();

            state._fsp--;

             after(grammarAccess.getSuperEntityAccess().getAttListsSuperEntityAttributeParserRuleCall_14_1_0()); 

            }


            }

        }
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
    // InternalPagos.g:7653:1: rule__SuperEntity__ParticipanteAssignment_20 : ( ruleParticipant ) ;
    public final void rule__SuperEntity__ParticipanteAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7657:1: ( ( ruleParticipant ) )
            // InternalPagos.g:7658:2: ( ruleParticipant )
            {
            // InternalPagos.g:7658:2: ( ruleParticipant )
            // InternalPagos.g:7659:3: ruleParticipant
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
    // InternalPagos.g:7668:1: rule__SuperEntity__ParticipanteAssignment_21_1 : ( ruleParticipant ) ;
    public final void rule__SuperEntity__ParticipanteAssignment_21_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7672:1: ( ( ruleParticipant ) )
            // InternalPagos.g:7673:2: ( ruleParticipant )
            {
            // InternalPagos.g:7673:2: ( ruleParticipant )
            // InternalPagos.g:7674:3: ruleParticipant
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
    // InternalPagos.g:7683:1: rule__Participant__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Participant__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7687:1: ( ( RULE_ID ) )
            // InternalPagos.g:7688:2: ( RULE_ID )
            {
            // InternalPagos.g:7688:2: ( RULE_ID )
            // InternalPagos.g:7689:3: RULE_ID
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
    // InternalPagos.g:7698:1: rule__Participant__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Participant__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7702:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7703:2: ( RULE_STRING )
            {
            // InternalPagos.g:7703:2: ( RULE_STRING )
            // InternalPagos.g:7704:3: RULE_STRING
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
    // InternalPagos.g:7713:1: rule__Participant__AttListsAssignment_13 : ( ruleEntityAttribute ) ;
    public final void rule__Participant__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7717:1: ( ( ruleEntityAttribute ) )
            // InternalPagos.g:7718:2: ( ruleEntityAttribute )
            {
            // InternalPagos.g:7718:2: ( ruleEntityAttribute )
            // InternalPagos.g:7719:3: ruleEntityAttribute
            {
             before(grammarAccess.getParticipantAccess().getAttListsEntityAttributeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityAttribute();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getAttListsEntityAttributeParserRuleCall_13_0()); 

            }


            }

        }
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
    // InternalPagos.g:7728:1: rule__Participant__AttListsAssignment_14_1 : ( ruleEntityAttribute ) ;
    public final void rule__Participant__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7732:1: ( ( ruleEntityAttribute ) )
            // InternalPagos.g:7733:2: ( ruleEntityAttribute )
            {
            // InternalPagos.g:7733:2: ( ruleEntityAttribute )
            // InternalPagos.g:7734:3: ruleEntityAttribute
            {
             before(grammarAccess.getParticipantAccess().getAttListsEntityAttributeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityAttribute();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getAttListsEntityAttributeParserRuleCall_14_1_0()); 

            }


            }

        }
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
    // InternalPagos.g:7743:1: rule__Participant__TemplatesFormAssignment_17_4 : ( ruleInformationTemplate ) ;
    public final void rule__Participant__TemplatesFormAssignment_17_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7747:1: ( ( ruleInformationTemplate ) )
            // InternalPagos.g:7748:2: ( ruleInformationTemplate )
            {
            // InternalPagos.g:7748:2: ( ruleInformationTemplate )
            // InternalPagos.g:7749:3: ruleInformationTemplate
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
    // InternalPagos.g:7758:1: rule__Participant__TemplatesFormAssignment_17_5_1 : ( ruleInformationTemplate ) ;
    public final void rule__Participant__TemplatesFormAssignment_17_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7762:1: ( ( ruleInformationTemplate ) )
            // InternalPagos.g:7763:2: ( ruleInformationTemplate )
            {
            // InternalPagos.g:7763:2: ( ruleInformationTemplate )
            // InternalPagos.g:7764:3: ruleInformationTemplate
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
    // InternalPagos.g:7773:1: rule__Provider__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Provider__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7777:1: ( ( RULE_ID ) )
            // InternalPagos.g:7778:2: ( RULE_ID )
            {
            // InternalPagos.g:7778:2: ( RULE_ID )
            // InternalPagos.g:7779:3: RULE_ID
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
    // InternalPagos.g:7788:1: rule__Provider__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Provider__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7792:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7793:2: ( RULE_STRING )
            {
            // InternalPagos.g:7793:2: ( RULE_STRING )
            // InternalPagos.g:7794:3: RULE_STRING
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
    // InternalPagos.g:7803:1: rule__Provider__AttListsAssignment_13 : ( ruleSuperEntityAttribute ) ;
    public final void rule__Provider__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7807:1: ( ( ruleSuperEntityAttribute ) )
            // InternalPagos.g:7808:2: ( ruleSuperEntityAttribute )
            {
            // InternalPagos.g:7808:2: ( ruleSuperEntityAttribute )
            // InternalPagos.g:7809:3: ruleSuperEntityAttribute
            {
             before(grammarAccess.getProviderAccess().getAttListsSuperEntityAttributeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleSuperEntityAttribute();

            state._fsp--;

             after(grammarAccess.getProviderAccess().getAttListsSuperEntityAttributeParserRuleCall_13_0()); 

            }


            }

        }
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
    // InternalPagos.g:7818:1: rule__Provider__AttListsAssignment_14_1 : ( ruleSuperEntityAttribute ) ;
    public final void rule__Provider__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7822:1: ( ( ruleSuperEntityAttribute ) )
            // InternalPagos.g:7823:2: ( ruleSuperEntityAttribute )
            {
            // InternalPagos.g:7823:2: ( ruleSuperEntityAttribute )
            // InternalPagos.g:7824:3: ruleSuperEntityAttribute
            {
             before(grammarAccess.getProviderAccess().getAttListsSuperEntityAttributeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSuperEntityAttribute();

            state._fsp--;

             after(grammarAccess.getProviderAccess().getAttListsSuperEntityAttributeParserRuleCall_14_1_0()); 

            }


            }

        }
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
    // InternalPagos.g:7833:1: rule__InformationTemplate__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__InformationTemplate__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7837:1: ( ( RULE_ID ) )
            // InternalPagos.g:7838:2: ( RULE_ID )
            {
            // InternalPagos.g:7838:2: ( RULE_ID )
            // InternalPagos.g:7839:3: RULE_ID
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
    // InternalPagos.g:7848:1: rule__InformationTemplate__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__InformationTemplate__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7852:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7853:2: ( RULE_STRING )
            {
            // InternalPagos.g:7853:2: ( RULE_STRING )
            // InternalPagos.g:7854:3: RULE_STRING
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
    // InternalPagos.g:7863:1: rule__InformationTemplate__FormListsAssignment_13 : ( ruleFormAttribute ) ;
    public final void rule__InformationTemplate__FormListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7867:1: ( ( ruleFormAttribute ) )
            // InternalPagos.g:7868:2: ( ruleFormAttribute )
            {
            // InternalPagos.g:7868:2: ( ruleFormAttribute )
            // InternalPagos.g:7869:3: ruleFormAttribute
            {
             before(grammarAccess.getInformationTemplateAccess().getFormListsFormAttributeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleFormAttribute();

            state._fsp--;

             after(grammarAccess.getInformationTemplateAccess().getFormListsFormAttributeParserRuleCall_13_0()); 

            }


            }

        }
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
    // InternalPagos.g:7878:1: rule__InformationTemplate__FormListsAssignment_14_1 : ( ruleFormAttribute ) ;
    public final void rule__InformationTemplate__FormListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7882:1: ( ( ruleFormAttribute ) )
            // InternalPagos.g:7883:2: ( ruleFormAttribute )
            {
            // InternalPagos.g:7883:2: ( ruleFormAttribute )
            // InternalPagos.g:7884:3: ruleFormAttribute
            {
             before(grammarAccess.getInformationTemplateAccess().getFormListsFormAttributeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormAttribute();

            state._fsp--;

             after(grammarAccess.getInformationTemplateAccess().getFormListsFormAttributeParserRuleCall_14_1_0()); 

            }


            }

        }
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
    // InternalPagos.g:7893:1: rule__InformationTemplate__TemplatesAssignment_17_4 : ( ruleCalculationTemplate ) ;
    public final void rule__InformationTemplate__TemplatesAssignment_17_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7897:1: ( ( ruleCalculationTemplate ) )
            // InternalPagos.g:7898:2: ( ruleCalculationTemplate )
            {
            // InternalPagos.g:7898:2: ( ruleCalculationTemplate )
            // InternalPagos.g:7899:3: ruleCalculationTemplate
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
    // InternalPagos.g:7908:1: rule__InformationTemplate__TemplatesAssignment_17_5_1 : ( ruleCalculationTemplate ) ;
    public final void rule__InformationTemplate__TemplatesAssignment_17_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7912:1: ( ( ruleCalculationTemplate ) )
            // InternalPagos.g:7913:2: ( ruleCalculationTemplate )
            {
            // InternalPagos.g:7913:2: ( ruleCalculationTemplate )
            // InternalPagos.g:7914:3: ruleCalculationTemplate
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
    // InternalPagos.g:7923:1: rule__InformationTemplate__ProvidersAssignment_18_4 : ( ruleProvider ) ;
    public final void rule__InformationTemplate__ProvidersAssignment_18_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7927:1: ( ( ruleProvider ) )
            // InternalPagos.g:7928:2: ( ruleProvider )
            {
            // InternalPagos.g:7928:2: ( ruleProvider )
            // InternalPagos.g:7929:3: ruleProvider
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
    // InternalPagos.g:7938:1: rule__InformationTemplate__ProvidersAssignment_18_5_1 : ( ruleProvider ) ;
    public final void rule__InformationTemplate__ProvidersAssignment_18_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7942:1: ( ( ruleProvider ) )
            // InternalPagos.g:7943:2: ( ruleProvider )
            {
            // InternalPagos.g:7943:2: ( ruleProvider )
            // InternalPagos.g:7944:3: ruleProvider
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
    // InternalPagos.g:7953:1: rule__CalculationTemplate__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__CalculationTemplate__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7957:1: ( ( RULE_ID ) )
            // InternalPagos.g:7958:2: ( RULE_ID )
            {
            // InternalPagos.g:7958:2: ( RULE_ID )
            // InternalPagos.g:7959:3: RULE_ID
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
    // InternalPagos.g:7968:1: rule__CalculationTemplate__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__CalculationTemplate__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7972:1: ( ( RULE_STRING ) )
            // InternalPagos.g:7973:2: ( RULE_STRING )
            {
            // InternalPagos.g:7973:2: ( RULE_STRING )
            // InternalPagos.g:7974:3: RULE_STRING
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
    // InternalPagos.g:7983:1: rule__CalculationTemplate__AttListsAssignment_13 : ( ruleVariableAttribute ) ;
    public final void rule__CalculationTemplate__AttListsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:7987:1: ( ( ruleVariableAttribute ) )
            // InternalPagos.g:7988:2: ( ruleVariableAttribute )
            {
            // InternalPagos.g:7988:2: ( ruleVariableAttribute )
            // InternalPagos.g:7989:3: ruleVariableAttribute
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsVariableAttributeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableAttribute();

            state._fsp--;

             after(grammarAccess.getCalculationTemplateAccess().getAttListsVariableAttributeParserRuleCall_13_0()); 

            }


            }

        }
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
    // InternalPagos.g:7998:1: rule__CalculationTemplate__AttListsAssignment_14_1 : ( ruleVariableAttribute ) ;
    public final void rule__CalculationTemplate__AttListsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8002:1: ( ( ruleVariableAttribute ) )
            // InternalPagos.g:8003:2: ( ruleVariableAttribute )
            {
            // InternalPagos.g:8003:2: ( ruleVariableAttribute )
            // InternalPagos.g:8004:3: ruleVariableAttribute
            {
             before(grammarAccess.getCalculationTemplateAccess().getAttListsVariableAttributeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableAttribute();

            state._fsp--;

             after(grammarAccess.getCalculationTemplateAccess().getAttListsVariableAttributeParserRuleCall_14_1_0()); 

            }


            }

        }
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
    // InternalPagos.g:8013:1: rule__CalculationTemplate__FormulaAssignment_19 : ( ruleFormula ) ;
    public final void rule__CalculationTemplate__FormulaAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8017:1: ( ( ruleFormula ) )
            // InternalPagos.g:8018:2: ( ruleFormula )
            {
            // InternalPagos.g:8018:2: ( ruleFormula )
            // InternalPagos.g:8019:3: ruleFormula
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


    // $ANTLR start "rule__Formula__LogExpAssignment_3"
    // InternalPagos.g:8028:1: rule__Formula__LogExpAssignment_3 : ( ruleExpresionLogica ) ;
    public final void rule__Formula__LogExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8032:1: ( ( ruleExpresionLogica ) )
            // InternalPagos.g:8033:2: ( ruleExpresionLogica )
            {
            // InternalPagos.g:8033:2: ( ruleExpresionLogica )
            // InternalPagos.g:8034:3: ruleExpresionLogica
            {
             before(grammarAccess.getFormulaAccess().getLogExpExpresionLogicaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresionLogica();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getLogExpExpresionLogicaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__LogExpAssignment_3"


    // $ANTLR start "rule__Formula__ExpressionAssignment_8"
    // InternalPagos.g:8043:1: rule__Formula__ExpressionAssignment_8 : ( ruleAdicion ) ;
    public final void rule__Formula__ExpressionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8047:1: ( ( ruleAdicion ) )
            // InternalPagos.g:8048:2: ( ruleAdicion )
            {
            // InternalPagos.g:8048:2: ( ruleAdicion )
            // InternalPagos.g:8049:3: ruleAdicion
            {
             before(grammarAccess.getFormulaAccess().getExpressionAdicionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAdicion();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getExpressionAdicionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__ExpressionAssignment_8"


    // $ANTLR start "rule__Formula__LogExpAssignment_10_1_2"
    // InternalPagos.g:8058:1: rule__Formula__LogExpAssignment_10_1_2 : ( ruleExpresionLogica ) ;
    public final void rule__Formula__LogExpAssignment_10_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8062:1: ( ( ruleExpresionLogica ) )
            // InternalPagos.g:8063:2: ( ruleExpresionLogica )
            {
            // InternalPagos.g:8063:2: ( ruleExpresionLogica )
            // InternalPagos.g:8064:3: ruleExpresionLogica
            {
             before(grammarAccess.getFormulaAccess().getLogExpExpresionLogicaParserRuleCall_10_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresionLogica();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getLogExpExpresionLogicaParserRuleCall_10_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__LogExpAssignment_10_1_2"


    // $ANTLR start "rule__Formula__ExpressionAssignment_10_4"
    // InternalPagos.g:8073:1: rule__Formula__ExpressionAssignment_10_4 : ( ruleAdicion ) ;
    public final void rule__Formula__ExpressionAssignment_10_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8077:1: ( ( ruleAdicion ) )
            // InternalPagos.g:8078:2: ( ruleAdicion )
            {
            // InternalPagos.g:8078:2: ( ruleAdicion )
            // InternalPagos.g:8079:3: ruleAdicion
            {
             before(grammarAccess.getFormulaAccess().getExpressionAdicionParserRuleCall_10_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAdicion();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getExpressionAdicionParserRuleCall_10_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__ExpressionAssignment_10_4"


    // $ANTLR start "rule__ExpresionLogica__VariableAssignment_0"
    // InternalPagos.g:8088:1: rule__ExpresionLogica__VariableAssignment_0 : ( ruleTerminalValue ) ;
    public final void rule__ExpresionLogica__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8092:1: ( ( ruleTerminalValue ) )
            // InternalPagos.g:8093:2: ( ruleTerminalValue )
            {
            // InternalPagos.g:8093:2: ( ruleTerminalValue )
            // InternalPagos.g:8094:3: ruleTerminalValue
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
    // InternalPagos.g:8103:1: rule__ExpresionLogica__LogOperAssignment_1_0 : ( RULE_OPERADORLOGICO ) ;
    public final void rule__ExpresionLogica__LogOperAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8107:1: ( ( RULE_OPERADORLOGICO ) )
            // InternalPagos.g:8108:2: ( RULE_OPERADORLOGICO )
            {
            // InternalPagos.g:8108:2: ( RULE_OPERADORLOGICO )
            // InternalPagos.g:8109:3: RULE_OPERADORLOGICO
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
    // InternalPagos.g:8118:1: rule__ExpresionLogica__Variable2Assignment_1_1_0 : ( ruleTerminalValue ) ;
    public final void rule__ExpresionLogica__Variable2Assignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8122:1: ( ( ruleTerminalValue ) )
            // InternalPagos.g:8123:2: ( ruleTerminalValue )
            {
            // InternalPagos.g:8123:2: ( ruleTerminalValue )
            // InternalPagos.g:8124:3: ruleTerminalValue
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
    // InternalPagos.g:8133:1: rule__ExpresionLogica__LiteralAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__ExpresionLogica__LiteralAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8137:1: ( ( RULE_STRING ) )
            // InternalPagos.g:8138:2: ( RULE_STRING )
            {
            // InternalPagos.g:8138:2: ( RULE_STRING )
            // InternalPagos.g:8139:3: RULE_STRING
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
    // InternalPagos.g:8148:1: rule__ExpresionLogica__ExpAssignment_2_1 : ( ruleExpresionLogica ) ;
    public final void rule__ExpresionLogica__ExpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8152:1: ( ( ruleExpresionLogica ) )
            // InternalPagos.g:8153:2: ( ruleExpresionLogica )
            {
            // InternalPagos.g:8153:2: ( ruleExpresionLogica )
            // InternalPagos.g:8154:3: ruleExpresionLogica
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
    // InternalPagos.g:8163:1: rule__Adicion__OperatorAssignment_1_1 : ( rulemathADD ) ;
    public final void rule__Adicion__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8167:1: ( ( rulemathADD ) )
            // InternalPagos.g:8168:2: ( rulemathADD )
            {
            // InternalPagos.g:8168:2: ( rulemathADD )
            // InternalPagos.g:8169:3: rulemathADD
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
    // InternalPagos.g:8178:1: rule__Adicion__RexpAssignment_1_2 : ( ruleMultiplicacion ) ;
    public final void rule__Adicion__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8182:1: ( ( ruleMultiplicacion ) )
            // InternalPagos.g:8183:2: ( ruleMultiplicacion )
            {
            // InternalPagos.g:8183:2: ( ruleMultiplicacion )
            // InternalPagos.g:8184:3: ruleMultiplicacion
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
    // InternalPagos.g:8193:1: rule__Multiplicacion__OperatorAssignment_1_1 : ( rulemathMULT ) ;
    public final void rule__Multiplicacion__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8197:1: ( ( rulemathMULT ) )
            // InternalPagos.g:8198:2: ( rulemathMULT )
            {
            // InternalPagos.g:8198:2: ( rulemathMULT )
            // InternalPagos.g:8199:3: rulemathMULT
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
    // InternalPagos.g:8208:1: rule__Multiplicacion__RexpAssignment_1_2 : ( ruleSigleExp ) ;
    public final void rule__Multiplicacion__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8212:1: ( ( ruleSigleExp ) )
            // InternalPagos.g:8213:2: ( ruleSigleExp )
            {
            // InternalPagos.g:8213:2: ( ruleSigleExp )
            // InternalPagos.g:8214:3: ruleSigleExp
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


    // $ANTLR start "rule__SuperEntityAttribute__NameAssignment_2"
    // InternalPagos.g:8223:1: rule__SuperEntityAttribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SuperEntityAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8227:1: ( ( RULE_ID ) )
            // InternalPagos.g:8228:2: ( RULE_ID )
            {
            // InternalPagos.g:8228:2: ( RULE_ID )
            // InternalPagos.g:8229:3: RULE_ID
            {
             before(grammarAccess.getSuperEntityAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__NameAssignment_2"


    // $ANTLR start "rule__SuperEntityAttribute__TypeAssignment_4"
    // InternalPagos.g:8238:1: rule__SuperEntityAttribute__TypeAssignment_4 : ( RULE_TYPE ) ;
    public final void rule__SuperEntityAttribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8242:1: ( ( RULE_TYPE ) )
            // InternalPagos.g:8243:2: ( RULE_TYPE )
            {
            // InternalPagos.g:8243:2: ( RULE_TYPE )
            // InternalPagos.g:8244:3: RULE_TYPE
            {
             before(grammarAccess.getSuperEntityAttributeAccess().getTypeTYPETerminalRuleCall_4_0()); 
            match(input,RULE_TYPE,FOLLOW_2); 
             after(grammarAccess.getSuperEntityAttributeAccess().getTypeTYPETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntityAttribute__TypeAssignment_4"


    // $ANTLR start "rule__EntityAttribute__NameAssignment_2"
    // InternalPagos.g:8253:1: rule__EntityAttribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EntityAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8257:1: ( ( RULE_ID ) )
            // InternalPagos.g:8258:2: ( RULE_ID )
            {
            // InternalPagos.g:8258:2: ( RULE_ID )
            // InternalPagos.g:8259:3: RULE_ID
            {
             before(grammarAccess.getEntityAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__NameAssignment_2"


    // $ANTLR start "rule__EntityAttribute__TypeAssignment_4"
    // InternalPagos.g:8268:1: rule__EntityAttribute__TypeAssignment_4 : ( RULE_TYPE ) ;
    public final void rule__EntityAttribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8272:1: ( ( RULE_TYPE ) )
            // InternalPagos.g:8273:2: ( RULE_TYPE )
            {
            // InternalPagos.g:8273:2: ( RULE_TYPE )
            // InternalPagos.g:8274:3: RULE_TYPE
            {
             before(grammarAccess.getEntityAttributeAccess().getTypeTYPETerminalRuleCall_4_0()); 
            match(input,RULE_TYPE,FOLLOW_2); 
             after(grammarAccess.getEntityAttributeAccess().getTypeTYPETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__TypeAssignment_4"


    // $ANTLR start "rule__FormAttribute__NameAssignment_2"
    // InternalPagos.g:8283:1: rule__FormAttribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FormAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8287:1: ( ( RULE_ID ) )
            // InternalPagos.g:8288:2: ( RULE_ID )
            {
            // InternalPagos.g:8288:2: ( RULE_ID )
            // InternalPagos.g:8289:3: RULE_ID
            {
             before(grammarAccess.getFormAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__NameAssignment_2"


    // $ANTLR start "rule__FormAttribute__TypeAssignment_4"
    // InternalPagos.g:8298:1: rule__FormAttribute__TypeAssignment_4 : ( RULE_TYPE ) ;
    public final void rule__FormAttribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8302:1: ( ( RULE_TYPE ) )
            // InternalPagos.g:8303:2: ( RULE_TYPE )
            {
            // InternalPagos.g:8303:2: ( RULE_TYPE )
            // InternalPagos.g:8304:3: RULE_TYPE
            {
             before(grammarAccess.getFormAttributeAccess().getTypeTYPETerminalRuleCall_4_0()); 
            match(input,RULE_TYPE,FOLLOW_2); 
             after(grammarAccess.getFormAttributeAccess().getTypeTYPETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__TypeAssignment_4"


    // $ANTLR start "rule__FormAttribute__ExpAssignment_5_1"
    // InternalPagos.g:8313:1: rule__FormAttribute__ExpAssignment_5_1 : ( ruleAdicion ) ;
    public final void rule__FormAttribute__ExpAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8317:1: ( ( ruleAdicion ) )
            // InternalPagos.g:8318:2: ( ruleAdicion )
            {
            // InternalPagos.g:8318:2: ( ruleAdicion )
            // InternalPagos.g:8319:3: ruleAdicion
            {
             before(grammarAccess.getFormAttributeAccess().getExpAdicionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdicion();

            state._fsp--;

             after(grammarAccess.getFormAttributeAccess().getExpAdicionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormAttribute__ExpAssignment_5_1"


    // $ANTLR start "rule__VariableAttribute__NameAssignment_2"
    // InternalPagos.g:8328:1: rule__VariableAttribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VariableAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8332:1: ( ( RULE_ID ) )
            // InternalPagos.g:8333:2: ( RULE_ID )
            {
            // InternalPagos.g:8333:2: ( RULE_ID )
            // InternalPagos.g:8334:3: RULE_ID
            {
             before(grammarAccess.getVariableAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__NameAssignment_2"


    // $ANTLR start "rule__VariableAttribute__TypeAssignment_4"
    // InternalPagos.g:8343:1: rule__VariableAttribute__TypeAssignment_4 : ( RULE_TYPE ) ;
    public final void rule__VariableAttribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8347:1: ( ( RULE_TYPE ) )
            // InternalPagos.g:8348:2: ( RULE_TYPE )
            {
            // InternalPagos.g:8348:2: ( RULE_TYPE )
            // InternalPagos.g:8349:3: RULE_TYPE
            {
             before(grammarAccess.getVariableAttributeAccess().getTypeTYPETerminalRuleCall_4_0()); 
            match(input,RULE_TYPE,FOLLOW_2); 
             after(grammarAccess.getVariableAttributeAccess().getTypeTYPETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__TypeAssignment_4"


    // $ANTLR start "rule__VariableAttribute__ExpAssignment_5_1"
    // InternalPagos.g:8358:1: rule__VariableAttribute__ExpAssignment_5_1 : ( ruleAdicion ) ;
    public final void rule__VariableAttribute__ExpAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8362:1: ( ( ruleAdicion ) )
            // InternalPagos.g:8363:2: ( ruleAdicion )
            {
            // InternalPagos.g:8363:2: ( ruleAdicion )
            // InternalPagos.g:8364:3: ruleAdicion
            {
             before(grammarAccess.getVariableAttributeAccess().getExpAdicionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdicion();

            state._fsp--;

             after(grammarAccess.getVariableAttributeAccess().getExpAdicionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__ExpAssignment_5_1"


    // $ANTLR start "rule__TerminalValue__VariableAssignment_0_1"
    // InternalPagos.g:8373:1: rule__TerminalValue__VariableAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalValue__VariableAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8377:1: ( ( ( RULE_ID ) ) )
            // InternalPagos.g:8378:2: ( ( RULE_ID ) )
            {
            // InternalPagos.g:8378:2: ( ( RULE_ID ) )
            // InternalPagos.g:8379:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalValueAccess().getVariableCalculationAttributeCrossReference_0_1_0()); 
            // InternalPagos.g:8380:3: ( RULE_ID )
            // InternalPagos.g:8381:4: RULE_ID
            {
             before(grammarAccess.getTerminalValueAccess().getVariableCalculationAttributeIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalValueAccess().getVariableCalculationAttributeIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getTerminalValueAccess().getVariableCalculationAttributeCrossReference_0_1_0()); 

            }


            }

        }
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
    // InternalPagos.g:8392:1: rule__TerminalValue__ValorAssignment_1 : ( ruleNumber ) ;
    public final void rule__TerminalValue__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8396:1: ( ( ruleNumber ) )
            // InternalPagos.g:8397:2: ( ruleNumber )
            {
            // InternalPagos.g:8397:2: ( ruleNumber )
            // InternalPagos.g:8398:3: ruleNumber
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
    // InternalPagos.g:8407:1: rule__MathADD__OperadorAssignment_1 : ( RULE_ADDOP ) ;
    public final void rule__MathADD__OperadorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8411:1: ( ( RULE_ADDOP ) )
            // InternalPagos.g:8412:2: ( RULE_ADDOP )
            {
            // InternalPagos.g:8412:2: ( RULE_ADDOP )
            // InternalPagos.g:8413:3: RULE_ADDOP
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
    // InternalPagos.g:8422:1: rule__MathMULT__OperadorAssignment_1 : ( RULE_MULTOP ) ;
    public final void rule__MathMULT__OperadorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPagos.g:8426:1: ( ( RULE_MULTOP ) )
            // InternalPagos.g:8427:2: ( RULE_MULTOP )
            {
            // InternalPagos.g:8427:2: ( RULE_MULTOP )
            // InternalPagos.g:8428:3: RULE_MULTOP
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000001010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000240000001010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000024000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000024000000022L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000003010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000100L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000003000000L});

}