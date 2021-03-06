package co.edu.uniandes.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.services.PagosGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPagosParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LBRACE", "RULE_COLON", "RULE_ID", "RULE_COMMA", "RULE_RBRACE", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_STRING", "RULE_ELSE", "RULE_IF", "RULE_THEN", "RULE_RETURN", "RULE_OPERADORLOGICO", "RULE_LOGICALCONN", "RULE_ADDOP", "RULE_MULTOP", "RULE_TYPE", "RULE_INDEX", "RULE_DOT", "RULE_DASH", "RULE_INT", "RULE_STR_ESC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'intermediary'", "'superentities'", "'description'", "'attributes'", "'entities'", "'InformationTemplate'", "'FormAttributes'", "'calculationtemplates'", "'providers'", "'calculationattributes'", "'calculationrules'", "'('", "')'", "':='", "'PA'", "'SU'", "'IT'", "'FU'", "'size()'", "'getCantidadDiasHabiles()'", "'getRiegoTabla2()'", "'E'", "'e'"
    };
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=6;
    public static final int RULE_RETURN=15;
    public static final int RULE_COMMA=7;
    public static final int RULE_THEN=14;
    public static final int RULE_COLON=5;
    public static final int RULE_LOGICALCONN=17;
    public static final int RULE_TYPE=20;
    public static final int RULE_STR_ESC=25;
    public static final int RULE_INT=24;
    public static final int RULE_ML_COMMENT=26;
    public static final int RULE_ELSE=12;
    public static final int RULE_LBRACKET=9;
    public static final int RULE_INDEX=21;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=27;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_DASH=23;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_IF=13;
    public static final int T__36=36;
    public static final int RULE_DOT=22;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_LBRACE=4;
    public static final int RULE_WS=28;
    public static final int RULE_OPERADORLOGICO=16;
    public static final int RULE_ADDOP=18;
    public static final int RULE_ANY_OTHER=29;
    public static final int RULE_RBRACE=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_MULTOP=19;
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

        public InternalPagosParser(TokenStream input, PagosGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Application";
       	}

       	@Override
       	protected PagosGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleApplication"
    // InternalPagos.g:64:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalPagos.g:64:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalPagos.g:65:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalPagos.g:71:1: ruleApplication returns [EObject current=null] : (this_LBRACE_0= RULE_LBRACE otherlv_1= 'name' this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_ID ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'intermediary' this_COLON_6= RULE_COLON ( (lv_intermediary_7_0= ruleIntermediary ) ) this_RBRACE_8= RULE_RBRACE ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token this_LBRACE_0=null;
        Token otherlv_1=null;
        Token this_COLON_2=null;
        Token lv_name_3_0=null;
        Token this_COMMA_4=null;
        Token otherlv_5=null;
        Token this_COLON_6=null;
        Token this_RBRACE_8=null;
        EObject lv_intermediary_7_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:77:2: ( (this_LBRACE_0= RULE_LBRACE otherlv_1= 'name' this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_ID ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'intermediary' this_COLON_6= RULE_COLON ( (lv_intermediary_7_0= ruleIntermediary ) ) this_RBRACE_8= RULE_RBRACE ) )
            // InternalPagos.g:78:2: (this_LBRACE_0= RULE_LBRACE otherlv_1= 'name' this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_ID ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'intermediary' this_COLON_6= RULE_COLON ( (lv_intermediary_7_0= ruleIntermediary ) ) this_RBRACE_8= RULE_RBRACE )
            {
            // InternalPagos.g:78:2: (this_LBRACE_0= RULE_LBRACE otherlv_1= 'name' this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_ID ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'intermediary' this_COLON_6= RULE_COLON ( (lv_intermediary_7_0= ruleIntermediary ) ) this_RBRACE_8= RULE_RBRACE )
            // InternalPagos.g:79:3: this_LBRACE_0= RULE_LBRACE otherlv_1= 'name' this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_ID ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'intermediary' this_COLON_6= RULE_COLON ( (lv_intermediary_7_0= ruleIntermediary ) ) this_RBRACE_8= RULE_RBRACE
            {
            this_LBRACE_0=(Token)match(input,RULE_LBRACE,FOLLOW_3); 

            			newLeafNode(this_LBRACE_0, grammarAccess.getApplicationAccess().getLBRACETerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getNameKeyword_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getApplicationAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalPagos.g:91:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalPagos.g:92:4: (lv_name_3_0= RULE_ID )
            {
            // InternalPagos.g:92:4: (lv_name_3_0= RULE_ID )
            // InternalPagos.g:93:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_3_0, grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"co.edu.uniandes.Pagos.ID");
            				

            }


            }

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_7); 

            			newLeafNode(this_COMMA_4, grammarAccess.getApplicationAccess().getCOMMATerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getApplicationAccess().getIntermediaryKeyword_5());
            		
            this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_8); 

            			newLeafNode(this_COLON_6, grammarAccess.getApplicationAccess().getCOLONTerminalRuleCall_6());
            		
            // InternalPagos.g:121:3: ( (lv_intermediary_7_0= ruleIntermediary ) )
            // InternalPagos.g:122:4: (lv_intermediary_7_0= ruleIntermediary )
            {
            // InternalPagos.g:122:4: (lv_intermediary_7_0= ruleIntermediary )
            // InternalPagos.g:123:5: lv_intermediary_7_0= ruleIntermediary
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getIntermediaryIntermediaryParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_intermediary_7_0=ruleIntermediary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					set(
            						current,
            						"intermediary",
            						lv_intermediary_7_0,
            						"co.edu.uniandes.Pagos.Intermediary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RBRACE_8=(Token)match(input,RULE_RBRACE,FOLLOW_2); 

            			newLeafNode(this_RBRACE_8, grammarAccess.getApplicationAccess().getRBRACETerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleIntermediary"
    // InternalPagos.g:148:1: entryRuleIntermediary returns [EObject current=null] : iv_ruleIntermediary= ruleIntermediary EOF ;
    public final EObject entryRuleIntermediary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntermediary = null;


        try {
            // InternalPagos.g:148:53: (iv_ruleIntermediary= ruleIntermediary EOF )
            // InternalPagos.g:149:2: iv_ruleIntermediary= ruleIntermediary EOF
            {
             newCompositeNode(grammarAccess.getIntermediaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntermediary=ruleIntermediary();

            state._fsp--;

             current =iv_ruleIntermediary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntermediary"


    // $ANTLR start "ruleIntermediary"
    // InternalPagos.g:155:1: ruleIntermediary returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'superentities' this_COLON_7= RULE_COLON this_LBRACKET_8= RULE_LBRACKET ( (lv_superentities_9_0= ruleSuperEntity ) ) (this_COMMA_10= RULE_COMMA ( (lv_superentities_11_0= ruleSuperEntity ) ) )* this_RBRACKET_12= RULE_RBRACKET this_RBRACE_13= RULE_RBRACE ) ;
    public final EObject ruleIntermediary() throws RecognitionException {
        EObject current = null;

        Token this_LBRACE_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token lv_name_4_0=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_LBRACKET_8=null;
        Token this_COMMA_10=null;
        Token this_RBRACKET_12=null;
        Token this_RBRACE_13=null;
        EObject lv_superentities_9_0 = null;

        EObject lv_superentities_11_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:161:2: ( ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'superentities' this_COLON_7= RULE_COLON this_LBRACKET_8= RULE_LBRACKET ( (lv_superentities_9_0= ruleSuperEntity ) ) (this_COMMA_10= RULE_COMMA ( (lv_superentities_11_0= ruleSuperEntity ) ) )* this_RBRACKET_12= RULE_RBRACKET this_RBRACE_13= RULE_RBRACE ) )
            // InternalPagos.g:162:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'superentities' this_COLON_7= RULE_COLON this_LBRACKET_8= RULE_LBRACKET ( (lv_superentities_9_0= ruleSuperEntity ) ) (this_COMMA_10= RULE_COMMA ( (lv_superentities_11_0= ruleSuperEntity ) ) )* this_RBRACKET_12= RULE_RBRACKET this_RBRACE_13= RULE_RBRACE )
            {
            // InternalPagos.g:162:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'superentities' this_COLON_7= RULE_COLON this_LBRACKET_8= RULE_LBRACKET ( (lv_superentities_9_0= ruleSuperEntity ) ) (this_COMMA_10= RULE_COMMA ( (lv_superentities_11_0= ruleSuperEntity ) ) )* this_RBRACKET_12= RULE_RBRACKET this_RBRACE_13= RULE_RBRACE )
            // InternalPagos.g:163:3: () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'superentities' this_COLON_7= RULE_COLON this_LBRACKET_8= RULE_LBRACKET ( (lv_superentities_9_0= ruleSuperEntity ) ) (this_COMMA_10= RULE_COMMA ( (lv_superentities_11_0= ruleSuperEntity ) ) )* this_RBRACKET_12= RULE_RBRACKET this_RBRACE_13= RULE_RBRACE
            {
            // InternalPagos.g:163:3: ()
            // InternalPagos.g:164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntermediaryAccess().getIntermediaryAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_3); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getIntermediaryAccess().getLBRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getIntermediaryAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getIntermediaryAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalPagos.g:182:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalPagos.g:183:4: (lv_name_4_0= RULE_ID )
            {
            // InternalPagos.g:183:4: (lv_name_4_0= RULE_ID )
            // InternalPagos.g:184:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_4_0, grammarAccess.getIntermediaryAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntermediaryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.edu.uniandes.Pagos.ID");
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_10); 

            			newLeafNode(this_COMMA_5, grammarAccess.getIntermediaryAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getIntermediaryAccess().getSuperentitiesKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_7, grammarAccess.getIntermediaryAccess().getCOLONTerminalRuleCall_7());
            		
            this_LBRACKET_8=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

            			newLeafNode(this_LBRACKET_8, grammarAccess.getIntermediaryAccess().getLBRACKETTerminalRuleCall_8());
            		
            // InternalPagos.g:216:3: ( (lv_superentities_9_0= ruleSuperEntity ) )
            // InternalPagos.g:217:4: (lv_superentities_9_0= ruleSuperEntity )
            {
            // InternalPagos.g:217:4: (lv_superentities_9_0= ruleSuperEntity )
            // InternalPagos.g:218:5: lv_superentities_9_0= ruleSuperEntity
            {

            					newCompositeNode(grammarAccess.getIntermediaryAccess().getSuperentitiesSuperEntityParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_12);
            lv_superentities_9_0=ruleSuperEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntermediaryRule());
            					}
            					add(
            						current,
            						"superentities",
            						lv_superentities_9_0,
            						"co.edu.uniandes.Pagos.SuperEntity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:235:3: (this_COMMA_10= RULE_COMMA ( (lv_superentities_11_0= ruleSuperEntity ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPagos.g:236:4: this_COMMA_10= RULE_COMMA ( (lv_superentities_11_0= ruleSuperEntity ) )
            	    {
            	    this_COMMA_10=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_10, grammarAccess.getIntermediaryAccess().getCOMMATerminalRuleCall_10_0());
            	    			
            	    // InternalPagos.g:240:4: ( (lv_superentities_11_0= ruleSuperEntity ) )
            	    // InternalPagos.g:241:5: (lv_superentities_11_0= ruleSuperEntity )
            	    {
            	    // InternalPagos.g:241:5: (lv_superentities_11_0= ruleSuperEntity )
            	    // InternalPagos.g:242:6: lv_superentities_11_0= ruleSuperEntity
            	    {

            	    						newCompositeNode(grammarAccess.getIntermediaryAccess().getSuperentitiesSuperEntityParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_superentities_11_0=ruleSuperEntity();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIntermediaryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"superentities",
            	    							lv_superentities_11_0,
            	    							"co.edu.uniandes.Pagos.SuperEntity");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_RBRACKET_12=(Token)match(input,RULE_RBRACKET,FOLLOW_9); 

            			newLeafNode(this_RBRACKET_12, grammarAccess.getIntermediaryAccess().getRBRACKETTerminalRuleCall_11());
            		
            this_RBRACE_13=(Token)match(input,RULE_RBRACE,FOLLOW_2); 

            			newLeafNode(this_RBRACE_13, grammarAccess.getIntermediaryAccess().getRBRACETerminalRuleCall_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntermediary"


    // $ANTLR start "entryRuleSuperEntity"
    // InternalPagos.g:272:1: entryRuleSuperEntity returns [EObject current=null] : iv_ruleSuperEntity= ruleSuperEntity EOF ;
    public final EObject entryRuleSuperEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperEntity = null;


        try {
            // InternalPagos.g:272:52: (iv_ruleSuperEntity= ruleSuperEntity EOF )
            // InternalPagos.g:273:2: iv_ruleSuperEntity= ruleSuperEntity EOF
            {
             newCompositeNode(grammarAccess.getSuperEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperEntity=ruleSuperEntity();

            state._fsp--;

             current =iv_ruleSuperEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuperEntity"


    // $ANTLR start "ruleSuperEntity"
    // InternalPagos.g:279:1: ruleSuperEntity returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'entities' this_COLON_19= RULE_COLON this_LBRACKET_20= RULE_LBRACKET ( (lv_participants_21_0= ruleParticipant ) ) (this_COMMA_22= RULE_COMMA ( (lv_participants_23_0= ruleParticipant ) ) )* this_RBRACKET_24= RULE_RBRACKET this_RBRACE_25= RULE_RBRACE ) ;
    public final EObject ruleSuperEntity() throws RecognitionException {
        EObject current = null;

        Token this_LBRACE_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token lv_name_4_0=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token lv_description_8_0=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_LBRACKET_12=null;
        Token this_COMMA_14=null;
        Token this_RBRACKET_16=null;
        Token this_COMMA_17=null;
        Token otherlv_18=null;
        Token this_COLON_19=null;
        Token this_LBRACKET_20=null;
        Token this_COMMA_22=null;
        Token this_RBRACKET_24=null;
        Token this_RBRACE_25=null;
        EObject lv_attLists_13_0 = null;

        EObject lv_attLists_15_0 = null;

        EObject lv_participants_21_0 = null;

        EObject lv_participants_23_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:285:2: ( ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'entities' this_COLON_19= RULE_COLON this_LBRACKET_20= RULE_LBRACKET ( (lv_participants_21_0= ruleParticipant ) ) (this_COMMA_22= RULE_COMMA ( (lv_participants_23_0= ruleParticipant ) ) )* this_RBRACKET_24= RULE_RBRACKET this_RBRACE_25= RULE_RBRACE ) )
            // InternalPagos.g:286:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'entities' this_COLON_19= RULE_COLON this_LBRACKET_20= RULE_LBRACKET ( (lv_participants_21_0= ruleParticipant ) ) (this_COMMA_22= RULE_COMMA ( (lv_participants_23_0= ruleParticipant ) ) )* this_RBRACKET_24= RULE_RBRACKET this_RBRACE_25= RULE_RBRACE )
            {
            // InternalPagos.g:286:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'entities' this_COLON_19= RULE_COLON this_LBRACKET_20= RULE_LBRACKET ( (lv_participants_21_0= ruleParticipant ) ) (this_COMMA_22= RULE_COMMA ( (lv_participants_23_0= ruleParticipant ) ) )* this_RBRACKET_24= RULE_RBRACKET this_RBRACE_25= RULE_RBRACE )
            // InternalPagos.g:287:3: () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'entities' this_COLON_19= RULE_COLON this_LBRACKET_20= RULE_LBRACKET ( (lv_participants_21_0= ruleParticipant ) ) (this_COMMA_22= RULE_COMMA ( (lv_participants_23_0= ruleParticipant ) ) )* this_RBRACKET_24= RULE_RBRACKET this_RBRACE_25= RULE_RBRACE
            {
            // InternalPagos.g:287:3: ()
            // InternalPagos.g:288:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSuperEntityAccess().getSuperEntityAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_3); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getSuperEntityAccess().getLBRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSuperEntityAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getSuperEntityAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalPagos.g:306:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalPagos.g:307:4: (lv_name_4_0= RULE_ID )
            {
            // InternalPagos.g:307:4: (lv_name_4_0= RULE_ID )
            // InternalPagos.g:308:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_4_0, grammarAccess.getSuperEntityAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuperEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.edu.uniandes.Pagos.ID");
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_13); 

            			newLeafNode(this_COMMA_5, grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getSuperEntityAccess().getDescriptionKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_14); 

            			newLeafNode(this_COLON_7, grammarAccess.getSuperEntityAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalPagos.g:336:3: ( (lv_description_8_0= RULE_STRING ) )
            // InternalPagos.g:337:4: (lv_description_8_0= RULE_STRING )
            {
            // InternalPagos.g:337:4: (lv_description_8_0= RULE_STRING )
            // InternalPagos.g:338:5: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_description_8_0, grammarAccess.getSuperEntityAccess().getDescriptionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuperEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_8_0,
            						"co.edu.uniandes.Pagos.STRING");
            				

            }


            }

            this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_15); 

            			newLeafNode(this_COMMA_9, grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_9());
            		
            otherlv_10=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getSuperEntityAccess().getAttributesKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_11, grammarAccess.getSuperEntityAccess().getCOLONTerminalRuleCall_11());
            		
            this_LBRACKET_12=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

            			newLeafNode(this_LBRACKET_12, grammarAccess.getSuperEntityAccess().getLBRACKETTerminalRuleCall_12());
            		
            // InternalPagos.g:370:3: ( (lv_attLists_13_0= ruleBusinessAttribute ) )
            // InternalPagos.g:371:4: (lv_attLists_13_0= ruleBusinessAttribute )
            {
            // InternalPagos.g:371:4: (lv_attLists_13_0= ruleBusinessAttribute )
            // InternalPagos.g:372:5: lv_attLists_13_0= ruleBusinessAttribute
            {

            					newCompositeNode(grammarAccess.getSuperEntityAccess().getAttListsBusinessAttributeParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_12);
            lv_attLists_13_0=ruleBusinessAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuperEntityRule());
            					}
            					add(
            						current,
            						"attLists",
            						lv_attLists_13_0,
            						"co.edu.uniandes.Pagos.BusinessAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:389:3: (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPagos.g:390:4: this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) )
            	    {
            	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_14, grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_14_0());
            	    			
            	    // InternalPagos.g:394:4: ( (lv_attLists_15_0= ruleBusinessAttribute ) )
            	    // InternalPagos.g:395:5: (lv_attLists_15_0= ruleBusinessAttribute )
            	    {
            	    // InternalPagos.g:395:5: (lv_attLists_15_0= ruleBusinessAttribute )
            	    // InternalPagos.g:396:6: lv_attLists_15_0= ruleBusinessAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getSuperEntityAccess().getAttListsBusinessAttributeParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_attLists_15_0=ruleBusinessAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSuperEntityRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attLists",
            	    							lv_attLists_15_0,
            	    							"co.edu.uniandes.Pagos.BusinessAttribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            this_RBRACKET_16=(Token)match(input,RULE_RBRACKET,FOLLOW_6); 

            			newLeafNode(this_RBRACKET_16, grammarAccess.getSuperEntityAccess().getRBRACKETTerminalRuleCall_15());
            		
            this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_16); 

            			newLeafNode(this_COMMA_17, grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_16());
            		
            otherlv_18=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getSuperEntityAccess().getEntitiesKeyword_17());
            		
            this_COLON_19=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_19, grammarAccess.getSuperEntityAccess().getCOLONTerminalRuleCall_18());
            		
            this_LBRACKET_20=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

            			newLeafNode(this_LBRACKET_20, grammarAccess.getSuperEntityAccess().getLBRACKETTerminalRuleCall_19());
            		
            // InternalPagos.g:434:3: ( (lv_participants_21_0= ruleParticipant ) )
            // InternalPagos.g:435:4: (lv_participants_21_0= ruleParticipant )
            {
            // InternalPagos.g:435:4: (lv_participants_21_0= ruleParticipant )
            // InternalPagos.g:436:5: lv_participants_21_0= ruleParticipant
            {

            					newCompositeNode(grammarAccess.getSuperEntityAccess().getParticipantsParticipantParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_12);
            lv_participants_21_0=ruleParticipant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuperEntityRule());
            					}
            					add(
            						current,
            						"participants",
            						lv_participants_21_0,
            						"co.edu.uniandes.Pagos.Participant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:453:3: (this_COMMA_22= RULE_COMMA ( (lv_participants_23_0= ruleParticipant ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPagos.g:454:4: this_COMMA_22= RULE_COMMA ( (lv_participants_23_0= ruleParticipant ) )
            	    {
            	    this_COMMA_22=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_22, grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_21_0());
            	    			
            	    // InternalPagos.g:458:4: ( (lv_participants_23_0= ruleParticipant ) )
            	    // InternalPagos.g:459:5: (lv_participants_23_0= ruleParticipant )
            	    {
            	    // InternalPagos.g:459:5: (lv_participants_23_0= ruleParticipant )
            	    // InternalPagos.g:460:6: lv_participants_23_0= ruleParticipant
            	    {

            	    						newCompositeNode(grammarAccess.getSuperEntityAccess().getParticipantsParticipantParserRuleCall_21_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_participants_23_0=ruleParticipant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSuperEntityRule());
            	    						}
            	    						add(
            	    							current,
            	    							"participants",
            	    							lv_participants_23_0,
            	    							"co.edu.uniandes.Pagos.Participant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_RBRACKET_24=(Token)match(input,RULE_RBRACKET,FOLLOW_9); 

            			newLeafNode(this_RBRACKET_24, grammarAccess.getSuperEntityAccess().getRBRACKETTerminalRuleCall_22());
            		
            this_RBRACE_25=(Token)match(input,RULE_RBRACE,FOLLOW_2); 

            			newLeafNode(this_RBRACE_25, grammarAccess.getSuperEntityAccess().getRBRACETerminalRuleCall_23());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuperEntity"


    // $ANTLR start "entryRuleParticipant"
    // InternalPagos.g:490:1: entryRuleParticipant returns [EObject current=null] : iv_ruleParticipant= ruleParticipant EOF ;
    public final EObject entryRuleParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipant = null;


        try {
            // InternalPagos.g:490:52: (iv_ruleParticipant= ruleParticipant EOF )
            // InternalPagos.g:491:2: iv_ruleParticipant= ruleParticipant EOF
            {
             newCompositeNode(grammarAccess.getParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParticipant=ruleParticipant();

            state._fsp--;

             current =iv_ruleParticipant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // InternalPagos.g:497:1: ruleParticipant returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'InformationTemplate' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templatesForms_22_0= ruleInformationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templatesForms_24_0= ruleInformationTemplate ) ) )* )? this_RBRACKET_25= RULE_RBRACKET ) ;
    public final EObject ruleParticipant() throws RecognitionException {
        EObject current = null;

        Token this_LBRACE_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token lv_name_4_0=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token lv_description_8_0=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_LBRACKET_12=null;
        Token this_COMMA_14=null;
        Token this_RBRACKET_16=null;
        Token this_RBRACE_17=null;
        Token this_COMMA_18=null;
        Token otherlv_19=null;
        Token this_COLON_20=null;
        Token this_LBRACKET_21=null;
        Token this_COMMA_23=null;
        Token this_RBRACKET_25=null;
        EObject lv_attLists_13_0 = null;

        EObject lv_attLists_15_0 = null;

        EObject lv_templatesForms_22_0 = null;

        EObject lv_templatesForms_24_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:503:2: ( ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'InformationTemplate' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templatesForms_22_0= ruleInformationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templatesForms_24_0= ruleInformationTemplate ) ) )* )? this_RBRACKET_25= RULE_RBRACKET ) )
            // InternalPagos.g:504:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'InformationTemplate' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templatesForms_22_0= ruleInformationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templatesForms_24_0= ruleInformationTemplate ) ) )* )? this_RBRACKET_25= RULE_RBRACKET )
            {
            // InternalPagos.g:504:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'InformationTemplate' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templatesForms_22_0= ruleInformationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templatesForms_24_0= ruleInformationTemplate ) ) )* )? this_RBRACKET_25= RULE_RBRACKET )
            // InternalPagos.g:505:3: () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'InformationTemplate' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templatesForms_22_0= ruleInformationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templatesForms_24_0= ruleInformationTemplate ) ) )* )? this_RBRACKET_25= RULE_RBRACKET
            {
            // InternalPagos.g:505:3: ()
            // InternalPagos.g:506:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParticipantAccess().getParticipantAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_3); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getParticipantAccess().getLBRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getParticipantAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getParticipantAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalPagos.g:524:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalPagos.g:525:4: (lv_name_4_0= RULE_ID )
            {
            // InternalPagos.g:525:4: (lv_name_4_0= RULE_ID )
            // InternalPagos.g:526:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_4_0, grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.edu.uniandes.Pagos.ID");
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_13); 

            			newLeafNode(this_COMMA_5, grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getParticipantAccess().getDescriptionKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_14); 

            			newLeafNode(this_COLON_7, grammarAccess.getParticipantAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalPagos.g:554:3: ( (lv_description_8_0= RULE_STRING ) )
            // InternalPagos.g:555:4: (lv_description_8_0= RULE_STRING )
            {
            // InternalPagos.g:555:4: (lv_description_8_0= RULE_STRING )
            // InternalPagos.g:556:5: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_description_8_0, grammarAccess.getParticipantAccess().getDescriptionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_8_0,
            						"co.edu.uniandes.Pagos.STRING");
            				

            }


            }

            this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_15); 

            			newLeafNode(this_COMMA_9, grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_9());
            		
            otherlv_10=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getParticipantAccess().getAttributesKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_11, grammarAccess.getParticipantAccess().getCOLONTerminalRuleCall_11());
            		
            this_LBRACKET_12=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

            			newLeafNode(this_LBRACKET_12, grammarAccess.getParticipantAccess().getLBRACKETTerminalRuleCall_12());
            		
            // InternalPagos.g:588:3: ( (lv_attLists_13_0= ruleBusinessAttribute ) )
            // InternalPagos.g:589:4: (lv_attLists_13_0= ruleBusinessAttribute )
            {
            // InternalPagos.g:589:4: (lv_attLists_13_0= ruleBusinessAttribute )
            // InternalPagos.g:590:5: lv_attLists_13_0= ruleBusinessAttribute
            {

            					newCompositeNode(grammarAccess.getParticipantAccess().getAttListsBusinessAttributeParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_12);
            lv_attLists_13_0=ruleBusinessAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParticipantRule());
            					}
            					add(
            						current,
            						"attLists",
            						lv_attLists_13_0,
            						"co.edu.uniandes.Pagos.BusinessAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:607:3: (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPagos.g:608:4: this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) )
            	    {
            	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_14, grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_14_0());
            	    			
            	    // InternalPagos.g:612:4: ( (lv_attLists_15_0= ruleBusinessAttribute ) )
            	    // InternalPagos.g:613:5: (lv_attLists_15_0= ruleBusinessAttribute )
            	    {
            	    // InternalPagos.g:613:5: (lv_attLists_15_0= ruleBusinessAttribute )
            	    // InternalPagos.g:614:6: lv_attLists_15_0= ruleBusinessAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getParticipantAccess().getAttListsBusinessAttributeParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_attLists_15_0=ruleBusinessAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParticipantRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attLists",
            	    							lv_attLists_15_0,
            	    							"co.edu.uniandes.Pagos.BusinessAttribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_RBRACKET_16=(Token)match(input,RULE_RBRACKET,FOLLOW_9); 

            			newLeafNode(this_RBRACKET_16, grammarAccess.getParticipantAccess().getRBRACKETTerminalRuleCall_15());
            		
            this_RBRACE_17=(Token)match(input,RULE_RBRACE,FOLLOW_12); 

            			newLeafNode(this_RBRACE_17, grammarAccess.getParticipantAccess().getRBRACETerminalRuleCall_16());
            		
            // InternalPagos.g:640:3: (this_COMMA_18= RULE_COMMA otherlv_19= 'InformationTemplate' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templatesForms_22_0= ruleInformationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templatesForms_24_0= ruleInformationTemplate ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_COMMA) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPagos.g:641:4: this_COMMA_18= RULE_COMMA otherlv_19= 'InformationTemplate' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templatesForms_22_0= ruleInformationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templatesForms_24_0= ruleInformationTemplate ) ) )*
                    {
                    this_COMMA_18=(Token)match(input,RULE_COMMA,FOLLOW_17); 

                    				newLeafNode(this_COMMA_18, grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_17_0());
                    			
                    otherlv_19=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getParticipantAccess().getInformationTemplateKeyword_17_1());
                    			
                    this_COLON_20=(Token)match(input,RULE_COLON,FOLLOW_11); 

                    				newLeafNode(this_COLON_20, grammarAccess.getParticipantAccess().getCOLONTerminalRuleCall_17_2());
                    			
                    this_LBRACKET_21=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

                    				newLeafNode(this_LBRACKET_21, grammarAccess.getParticipantAccess().getLBRACKETTerminalRuleCall_17_3());
                    			
                    // InternalPagos.g:657:4: ( (lv_templatesForms_22_0= ruleInformationTemplate ) )
                    // InternalPagos.g:658:5: (lv_templatesForms_22_0= ruleInformationTemplate )
                    {
                    // InternalPagos.g:658:5: (lv_templatesForms_22_0= ruleInformationTemplate )
                    // InternalPagos.g:659:6: lv_templatesForms_22_0= ruleInformationTemplate
                    {

                    						newCompositeNode(grammarAccess.getParticipantAccess().getTemplatesFormsInformationTemplateParserRuleCall_17_4_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_templatesForms_22_0=ruleInformationTemplate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParticipantRule());
                    						}
                    						add(
                    							current,
                    							"templatesForms",
                    							lv_templatesForms_22_0,
                    							"co.edu.uniandes.Pagos.InformationTemplate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPagos.g:676:4: (this_COMMA_23= RULE_COMMA ( (lv_templatesForms_24_0= ruleInformationTemplate ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPagos.g:677:5: this_COMMA_23= RULE_COMMA ( (lv_templatesForms_24_0= ruleInformationTemplate ) )
                    	    {
                    	    this_COMMA_23=(Token)match(input,RULE_COMMA,FOLLOW_8); 

                    	    					newLeafNode(this_COMMA_23, grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_17_5_0());
                    	    				
                    	    // InternalPagos.g:681:5: ( (lv_templatesForms_24_0= ruleInformationTemplate ) )
                    	    // InternalPagos.g:682:6: (lv_templatesForms_24_0= ruleInformationTemplate )
                    	    {
                    	    // InternalPagos.g:682:6: (lv_templatesForms_24_0= ruleInformationTemplate )
                    	    // InternalPagos.g:683:7: lv_templatesForms_24_0= ruleInformationTemplate
                    	    {

                    	    							newCompositeNode(grammarAccess.getParticipantAccess().getTemplatesFormsInformationTemplateParserRuleCall_17_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_templatesForms_24_0=ruleInformationTemplate();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParticipantRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"templatesForms",
                    	    								lv_templatesForms_24_0,
                    	    								"co.edu.uniandes.Pagos.InformationTemplate");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            this_RBRACKET_25=(Token)match(input,RULE_RBRACKET,FOLLOW_2); 

            			newLeafNode(this_RBRACKET_25, grammarAccess.getParticipantAccess().getRBRACKETTerminalRuleCall_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleProvider"
    // InternalPagos.g:710:1: entryRuleProvider returns [EObject current=null] : iv_ruleProvider= ruleProvider EOF ;
    public final EObject entryRuleProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvider = null;


        try {
            // InternalPagos.g:710:49: (iv_ruleProvider= ruleProvider EOF )
            // InternalPagos.g:711:2: iv_ruleProvider= ruleProvider EOF
            {
             newCompositeNode(grammarAccess.getProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvider=ruleProvider();

            state._fsp--;

             current =iv_ruleProvider; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvider"


    // $ANTLR start "ruleProvider"
    // InternalPagos.g:717:1: ruleProvider returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE ) ;
    public final EObject ruleProvider() throws RecognitionException {
        EObject current = null;

        Token this_LBRACE_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token lv_name_4_0=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token lv_description_8_0=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_LBRACKET_12=null;
        Token this_COMMA_14=null;
        Token this_RBRACKET_16=null;
        Token this_RBRACE_17=null;
        EObject lv_attLists_13_0 = null;

        EObject lv_attLists_15_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:723:2: ( ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE ) )
            // InternalPagos.g:724:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE )
            {
            // InternalPagos.g:724:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE )
            // InternalPagos.g:725:3: () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE
            {
            // InternalPagos.g:725:3: ()
            // InternalPagos.g:726:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProviderAccess().getProviderAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_3); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getProviderAccess().getLBRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProviderAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getProviderAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalPagos.g:744:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalPagos.g:745:4: (lv_name_4_0= RULE_ID )
            {
            // InternalPagos.g:745:4: (lv_name_4_0= RULE_ID )
            // InternalPagos.g:746:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_4_0, grammarAccess.getProviderAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProviderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.edu.uniandes.Pagos.ID");
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_13); 

            			newLeafNode(this_COMMA_5, grammarAccess.getProviderAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getProviderAccess().getDescriptionKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_14); 

            			newLeafNode(this_COLON_7, grammarAccess.getProviderAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalPagos.g:774:3: ( (lv_description_8_0= RULE_STRING ) )
            // InternalPagos.g:775:4: (lv_description_8_0= RULE_STRING )
            {
            // InternalPagos.g:775:4: (lv_description_8_0= RULE_STRING )
            // InternalPagos.g:776:5: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_description_8_0, grammarAccess.getProviderAccess().getDescriptionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProviderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_8_0,
            						"co.edu.uniandes.Pagos.STRING");
            				

            }


            }

            this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_15); 

            			newLeafNode(this_COMMA_9, grammarAccess.getProviderAccess().getCOMMATerminalRuleCall_9());
            		
            otherlv_10=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getProviderAccess().getAttributesKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_11, grammarAccess.getProviderAccess().getCOLONTerminalRuleCall_11());
            		
            this_LBRACKET_12=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

            			newLeafNode(this_LBRACKET_12, grammarAccess.getProviderAccess().getLBRACKETTerminalRuleCall_12());
            		
            // InternalPagos.g:808:3: ( (lv_attLists_13_0= ruleBusinessAttribute ) )
            // InternalPagos.g:809:4: (lv_attLists_13_0= ruleBusinessAttribute )
            {
            // InternalPagos.g:809:4: (lv_attLists_13_0= ruleBusinessAttribute )
            // InternalPagos.g:810:5: lv_attLists_13_0= ruleBusinessAttribute
            {

            					newCompositeNode(grammarAccess.getProviderAccess().getAttListsBusinessAttributeParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_12);
            lv_attLists_13_0=ruleBusinessAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProviderRule());
            					}
            					add(
            						current,
            						"attLists",
            						lv_attLists_13_0,
            						"co.edu.uniandes.Pagos.BusinessAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:827:3: (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPagos.g:828:4: this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) )
            	    {
            	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_14, grammarAccess.getProviderAccess().getCOMMATerminalRuleCall_14_0());
            	    			
            	    // InternalPagos.g:832:4: ( (lv_attLists_15_0= ruleBusinessAttribute ) )
            	    // InternalPagos.g:833:5: (lv_attLists_15_0= ruleBusinessAttribute )
            	    {
            	    // InternalPagos.g:833:5: (lv_attLists_15_0= ruleBusinessAttribute )
            	    // InternalPagos.g:834:6: lv_attLists_15_0= ruleBusinessAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getProviderAccess().getAttListsBusinessAttributeParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_attLists_15_0=ruleBusinessAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProviderRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attLists",
            	    							lv_attLists_15_0,
            	    							"co.edu.uniandes.Pagos.BusinessAttribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_RBRACKET_16=(Token)match(input,RULE_RBRACKET,FOLLOW_9); 

            			newLeafNode(this_RBRACKET_16, grammarAccess.getProviderAccess().getRBRACKETTerminalRuleCall_15());
            		
            this_RBRACE_17=(Token)match(input,RULE_RBRACE,FOLLOW_2); 

            			newLeafNode(this_RBRACE_17, grammarAccess.getProviderAccess().getRBRACETerminalRuleCall_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProvider"


    // $ANTLR start "entryRuleInformationTemplate"
    // InternalPagos.g:864:1: entryRuleInformationTemplate returns [EObject current=null] : iv_ruleInformationTemplate= ruleInformationTemplate EOF ;
    public final EObject entryRuleInformationTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformationTemplate = null;


        try {
            // InternalPagos.g:864:60: (iv_ruleInformationTemplate= ruleInformationTemplate EOF )
            // InternalPagos.g:865:2: iv_ruleInformationTemplate= ruleInformationTemplate EOF
            {
             newCompositeNode(grammarAccess.getInformationTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInformationTemplate=ruleInformationTemplate();

            state._fsp--;

             current =iv_ruleInformationTemplate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInformationTemplate"


    // $ANTLR start "ruleInformationTemplate"
    // InternalPagos.g:871:1: ruleInformationTemplate returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'FormAttributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' ( (lv_templateCalc_20_0= RULE_ID ) ) this_COLON_21= RULE_COLON this_LBRACKET_22= RULE_LBRACKET ( (lv_templates_23_0= ruleCalculationTemplate ) ) (this_COMMA_24= RULE_COMMA ( (lv_templates_25_0= ruleCalculationTemplate ) ) )* this_RBRACKET_26= RULE_RBRACKET )? (this_COMMA_27= RULE_COMMA otherlv_28= 'providers' this_COLON_29= RULE_COLON this_LBRACKET_30= RULE_LBRACKET ( (lv_providers_31_0= ruleProvider ) ) (this_COMMA_32= RULE_COMMA ( (lv_providers_33_0= ruleProvider ) ) )* this_RBRACKET_34= RULE_RBRACKET )? ) ;
    public final EObject ruleInformationTemplate() throws RecognitionException {
        EObject current = null;

        Token this_LBRACE_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token lv_name_4_0=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token lv_description_8_0=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_LBRACKET_12=null;
        Token this_COMMA_14=null;
        Token this_RBRACKET_16=null;
        Token this_RBRACE_17=null;
        Token this_COMMA_18=null;
        Token otherlv_19=null;
        Token lv_templateCalc_20_0=null;
        Token this_COLON_21=null;
        Token this_LBRACKET_22=null;
        Token this_COMMA_24=null;
        Token this_RBRACKET_26=null;
        Token this_COMMA_27=null;
        Token otherlv_28=null;
        Token this_COLON_29=null;
        Token this_LBRACKET_30=null;
        Token this_COMMA_32=null;
        Token this_RBRACKET_34=null;
        EObject lv_attLists_13_0 = null;

        EObject lv_attLists_15_0 = null;

        EObject lv_templates_23_0 = null;

        EObject lv_templates_25_0 = null;

        EObject lv_providers_31_0 = null;

        EObject lv_providers_33_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:877:2: ( ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'FormAttributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' ( (lv_templateCalc_20_0= RULE_ID ) ) this_COLON_21= RULE_COLON this_LBRACKET_22= RULE_LBRACKET ( (lv_templates_23_0= ruleCalculationTemplate ) ) (this_COMMA_24= RULE_COMMA ( (lv_templates_25_0= ruleCalculationTemplate ) ) )* this_RBRACKET_26= RULE_RBRACKET )? (this_COMMA_27= RULE_COMMA otherlv_28= 'providers' this_COLON_29= RULE_COLON this_LBRACKET_30= RULE_LBRACKET ( (lv_providers_31_0= ruleProvider ) ) (this_COMMA_32= RULE_COMMA ( (lv_providers_33_0= ruleProvider ) ) )* this_RBRACKET_34= RULE_RBRACKET )? ) )
            // InternalPagos.g:878:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'FormAttributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' ( (lv_templateCalc_20_0= RULE_ID ) ) this_COLON_21= RULE_COLON this_LBRACKET_22= RULE_LBRACKET ( (lv_templates_23_0= ruleCalculationTemplate ) ) (this_COMMA_24= RULE_COMMA ( (lv_templates_25_0= ruleCalculationTemplate ) ) )* this_RBRACKET_26= RULE_RBRACKET )? (this_COMMA_27= RULE_COMMA otherlv_28= 'providers' this_COLON_29= RULE_COLON this_LBRACKET_30= RULE_LBRACKET ( (lv_providers_31_0= ruleProvider ) ) (this_COMMA_32= RULE_COMMA ( (lv_providers_33_0= ruleProvider ) ) )* this_RBRACKET_34= RULE_RBRACKET )? )
            {
            // InternalPagos.g:878:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'FormAttributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' ( (lv_templateCalc_20_0= RULE_ID ) ) this_COLON_21= RULE_COLON this_LBRACKET_22= RULE_LBRACKET ( (lv_templates_23_0= ruleCalculationTemplate ) ) (this_COMMA_24= RULE_COMMA ( (lv_templates_25_0= ruleCalculationTemplate ) ) )* this_RBRACKET_26= RULE_RBRACKET )? (this_COMMA_27= RULE_COMMA otherlv_28= 'providers' this_COLON_29= RULE_COLON this_LBRACKET_30= RULE_LBRACKET ( (lv_providers_31_0= ruleProvider ) ) (this_COMMA_32= RULE_COMMA ( (lv_providers_33_0= ruleProvider ) ) )* this_RBRACKET_34= RULE_RBRACKET )? )
            // InternalPagos.g:879:3: () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'FormAttributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' ( (lv_templateCalc_20_0= RULE_ID ) ) this_COLON_21= RULE_COLON this_LBRACKET_22= RULE_LBRACKET ( (lv_templates_23_0= ruleCalculationTemplate ) ) (this_COMMA_24= RULE_COMMA ( (lv_templates_25_0= ruleCalculationTemplate ) ) )* this_RBRACKET_26= RULE_RBRACKET )? (this_COMMA_27= RULE_COMMA otherlv_28= 'providers' this_COLON_29= RULE_COLON this_LBRACKET_30= RULE_LBRACKET ( (lv_providers_31_0= ruleProvider ) ) (this_COMMA_32= RULE_COMMA ( (lv_providers_33_0= ruleProvider ) ) )* this_RBRACKET_34= RULE_RBRACKET )?
            {
            // InternalPagos.g:879:3: ()
            // InternalPagos.g:880:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInformationTemplateAccess().getInformationTemplateAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_3); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getInformationTemplateAccess().getLBRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInformationTemplateAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalPagos.g:898:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalPagos.g:899:4: (lv_name_4_0= RULE_ID )
            {
            // InternalPagos.g:899:4: (lv_name_4_0= RULE_ID )
            // InternalPagos.g:900:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_4_0, grammarAccess.getInformationTemplateAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInformationTemplateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.edu.uniandes.Pagos.ID");
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_13); 

            			newLeafNode(this_COMMA_5, grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getInformationTemplateAccess().getDescriptionKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_14); 

            			newLeafNode(this_COLON_7, grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalPagos.g:928:3: ( (lv_description_8_0= RULE_STRING ) )
            // InternalPagos.g:929:4: (lv_description_8_0= RULE_STRING )
            {
            // InternalPagos.g:929:4: (lv_description_8_0= RULE_STRING )
            // InternalPagos.g:930:5: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_description_8_0, grammarAccess.getInformationTemplateAccess().getDescriptionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInformationTemplateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_8_0,
            						"co.edu.uniandes.Pagos.STRING");
            				

            }


            }

            this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_18); 

            			newLeafNode(this_COMMA_9, grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_9());
            		
            otherlv_10=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getInformationTemplateAccess().getFormAttributesKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_11, grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_11());
            		
            this_LBRACKET_12=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

            			newLeafNode(this_LBRACKET_12, grammarAccess.getInformationTemplateAccess().getLBRACKETTerminalRuleCall_12());
            		
            // InternalPagos.g:962:3: ( (lv_attLists_13_0= ruleBusinessAttribute ) )
            // InternalPagos.g:963:4: (lv_attLists_13_0= ruleBusinessAttribute )
            {
            // InternalPagos.g:963:4: (lv_attLists_13_0= ruleBusinessAttribute )
            // InternalPagos.g:964:5: lv_attLists_13_0= ruleBusinessAttribute
            {

            					newCompositeNode(grammarAccess.getInformationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_12);
            lv_attLists_13_0=ruleBusinessAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInformationTemplateRule());
            					}
            					add(
            						current,
            						"attLists",
            						lv_attLists_13_0,
            						"co.edu.uniandes.Pagos.BusinessAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:981:3: (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPagos.g:982:4: this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) )
            	    {
            	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_14, grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_14_0());
            	    			
            	    // InternalPagos.g:986:4: ( (lv_attLists_15_0= ruleBusinessAttribute ) )
            	    // InternalPagos.g:987:5: (lv_attLists_15_0= ruleBusinessAttribute )
            	    {
            	    // InternalPagos.g:987:5: (lv_attLists_15_0= ruleBusinessAttribute )
            	    // InternalPagos.g:988:6: lv_attLists_15_0= ruleBusinessAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getInformationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_attLists_15_0=ruleBusinessAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInformationTemplateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attLists",
            	    							lv_attLists_15_0,
            	    							"co.edu.uniandes.Pagos.BusinessAttribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_RBRACKET_16=(Token)match(input,RULE_RBRACKET,FOLLOW_9); 

            			newLeafNode(this_RBRACKET_16, grammarAccess.getInformationTemplateAccess().getRBRACKETTerminalRuleCall_15());
            		
            this_RBRACE_17=(Token)match(input,RULE_RBRACE,FOLLOW_19); 

            			newLeafNode(this_RBRACE_17, grammarAccess.getInformationTemplateAccess().getRBRACETerminalRuleCall_16());
            		
            // InternalPagos.g:1014:3: (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' ( (lv_templateCalc_20_0= RULE_ID ) ) this_COLON_21= RULE_COLON this_LBRACKET_22= RULE_LBRACKET ( (lv_templates_23_0= ruleCalculationTemplate ) ) (this_COMMA_24= RULE_COMMA ( (lv_templates_25_0= ruleCalculationTemplate ) ) )* this_RBRACKET_26= RULE_RBRACKET )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_COMMA) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==38) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalPagos.g:1015:4: this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' ( (lv_templateCalc_20_0= RULE_ID ) ) this_COLON_21= RULE_COLON this_LBRACKET_22= RULE_LBRACKET ( (lv_templates_23_0= ruleCalculationTemplate ) ) (this_COMMA_24= RULE_COMMA ( (lv_templates_25_0= ruleCalculationTemplate ) ) )* this_RBRACKET_26= RULE_RBRACKET
                    {
                    this_COMMA_18=(Token)match(input,RULE_COMMA,FOLLOW_20); 

                    				newLeafNode(this_COMMA_18, grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_17_0());
                    			
                    otherlv_19=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_19, grammarAccess.getInformationTemplateAccess().getCalculationtemplatesKeyword_17_1());
                    			
                    // InternalPagos.g:1023:4: ( (lv_templateCalc_20_0= RULE_ID ) )
                    // InternalPagos.g:1024:5: (lv_templateCalc_20_0= RULE_ID )
                    {
                    // InternalPagos.g:1024:5: (lv_templateCalc_20_0= RULE_ID )
                    // InternalPagos.g:1025:6: lv_templateCalc_20_0= RULE_ID
                    {
                    lv_templateCalc_20_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_templateCalc_20_0, grammarAccess.getInformationTemplateAccess().getTemplateCalcIDTerminalRuleCall_17_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInformationTemplateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"templateCalc",
                    							lv_templateCalc_20_0,
                    							"co.edu.uniandes.Pagos.ID");
                    					

                    }


                    }

                    this_COLON_21=(Token)match(input,RULE_COLON,FOLLOW_11); 

                    				newLeafNode(this_COLON_21, grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_17_3());
                    			
                    this_LBRACKET_22=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

                    				newLeafNode(this_LBRACKET_22, grammarAccess.getInformationTemplateAccess().getLBRACKETTerminalRuleCall_17_4());
                    			
                    // InternalPagos.g:1049:4: ( (lv_templates_23_0= ruleCalculationTemplate ) )
                    // InternalPagos.g:1050:5: (lv_templates_23_0= ruleCalculationTemplate )
                    {
                    // InternalPagos.g:1050:5: (lv_templates_23_0= ruleCalculationTemplate )
                    // InternalPagos.g:1051:6: lv_templates_23_0= ruleCalculationTemplate
                    {

                    						newCompositeNode(grammarAccess.getInformationTemplateAccess().getTemplatesCalculationTemplateParserRuleCall_17_5_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_templates_23_0=ruleCalculationTemplate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInformationTemplateRule());
                    						}
                    						add(
                    							current,
                    							"templates",
                    							lv_templates_23_0,
                    							"co.edu.uniandes.Pagos.CalculationTemplate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPagos.g:1068:4: (this_COMMA_24= RULE_COMMA ( (lv_templates_25_0= ruleCalculationTemplate ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_COMMA) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalPagos.g:1069:5: this_COMMA_24= RULE_COMMA ( (lv_templates_25_0= ruleCalculationTemplate ) )
                    	    {
                    	    this_COMMA_24=(Token)match(input,RULE_COMMA,FOLLOW_8); 

                    	    					newLeafNode(this_COMMA_24, grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_17_6_0());
                    	    				
                    	    // InternalPagos.g:1073:5: ( (lv_templates_25_0= ruleCalculationTemplate ) )
                    	    // InternalPagos.g:1074:6: (lv_templates_25_0= ruleCalculationTemplate )
                    	    {
                    	    // InternalPagos.g:1074:6: (lv_templates_25_0= ruleCalculationTemplate )
                    	    // InternalPagos.g:1075:7: lv_templates_25_0= ruleCalculationTemplate
                    	    {

                    	    							newCompositeNode(grammarAccess.getInformationTemplateAccess().getTemplatesCalculationTemplateParserRuleCall_17_6_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_templates_25_0=ruleCalculationTemplate();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInformationTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"templates",
                    	    								lv_templates_25_0,
                    	    								"co.edu.uniandes.Pagos.CalculationTemplate");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    this_RBRACKET_26=(Token)match(input,RULE_RBRACKET,FOLLOW_19); 

                    				newLeafNode(this_RBRACKET_26, grammarAccess.getInformationTemplateAccess().getRBRACKETTerminalRuleCall_17_7());
                    			

                    }
                    break;

            }

            // InternalPagos.g:1098:3: (this_COMMA_27= RULE_COMMA otherlv_28= 'providers' this_COLON_29= RULE_COLON this_LBRACKET_30= RULE_LBRACKET ( (lv_providers_31_0= ruleProvider ) ) (this_COMMA_32= RULE_COMMA ( (lv_providers_33_0= ruleProvider ) ) )* this_RBRACKET_34= RULE_RBRACKET )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_COMMA) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==39) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalPagos.g:1099:4: this_COMMA_27= RULE_COMMA otherlv_28= 'providers' this_COLON_29= RULE_COLON this_LBRACKET_30= RULE_LBRACKET ( (lv_providers_31_0= ruleProvider ) ) (this_COMMA_32= RULE_COMMA ( (lv_providers_33_0= ruleProvider ) ) )* this_RBRACKET_34= RULE_RBRACKET
                    {
                    this_COMMA_27=(Token)match(input,RULE_COMMA,FOLLOW_21); 

                    				newLeafNode(this_COMMA_27, grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_18_0());
                    			
                    otherlv_28=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getInformationTemplateAccess().getProvidersKeyword_18_1());
                    			
                    this_COLON_29=(Token)match(input,RULE_COLON,FOLLOW_11); 

                    				newLeafNode(this_COLON_29, grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_18_2());
                    			
                    this_LBRACKET_30=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

                    				newLeafNode(this_LBRACKET_30, grammarAccess.getInformationTemplateAccess().getLBRACKETTerminalRuleCall_18_3());
                    			
                    // InternalPagos.g:1115:4: ( (lv_providers_31_0= ruleProvider ) )
                    // InternalPagos.g:1116:5: (lv_providers_31_0= ruleProvider )
                    {
                    // InternalPagos.g:1116:5: (lv_providers_31_0= ruleProvider )
                    // InternalPagos.g:1117:6: lv_providers_31_0= ruleProvider
                    {

                    						newCompositeNode(grammarAccess.getInformationTemplateAccess().getProvidersProviderParserRuleCall_18_4_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_providers_31_0=ruleProvider();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInformationTemplateRule());
                    						}
                    						add(
                    							current,
                    							"providers",
                    							lv_providers_31_0,
                    							"co.edu.uniandes.Pagos.Provider");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPagos.g:1134:4: (this_COMMA_32= RULE_COMMA ( (lv_providers_33_0= ruleProvider ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalPagos.g:1135:5: this_COMMA_32= RULE_COMMA ( (lv_providers_33_0= ruleProvider ) )
                    	    {
                    	    this_COMMA_32=(Token)match(input,RULE_COMMA,FOLLOW_8); 

                    	    					newLeafNode(this_COMMA_32, grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_18_5_0());
                    	    				
                    	    // InternalPagos.g:1139:5: ( (lv_providers_33_0= ruleProvider ) )
                    	    // InternalPagos.g:1140:6: (lv_providers_33_0= ruleProvider )
                    	    {
                    	    // InternalPagos.g:1140:6: (lv_providers_33_0= ruleProvider )
                    	    // InternalPagos.g:1141:7: lv_providers_33_0= ruleProvider
                    	    {

                    	    							newCompositeNode(grammarAccess.getInformationTemplateAccess().getProvidersProviderParserRuleCall_18_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_providers_33_0=ruleProvider();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInformationTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providers",
                    	    								lv_providers_33_0,
                    	    								"co.edu.uniandes.Pagos.Provider");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    this_RBRACKET_34=(Token)match(input,RULE_RBRACKET,FOLLOW_2); 

                    				newLeafNode(this_RBRACKET_34, grammarAccess.getInformationTemplateAccess().getRBRACKETTerminalRuleCall_18_6());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInformationTemplate"


    // $ANTLR start "entryRuleCalculationTemplate"
    // InternalPagos.g:1168:1: entryRuleCalculationTemplate returns [EObject current=null] : iv_ruleCalculationTemplate= ruleCalculationTemplate EOF ;
    public final EObject entryRuleCalculationTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculationTemplate = null;


        try {
            // InternalPagos.g:1168:60: (iv_ruleCalculationTemplate= ruleCalculationTemplate EOF )
            // InternalPagos.g:1169:2: iv_ruleCalculationTemplate= ruleCalculationTemplate EOF
            {
             newCompositeNode(grammarAccess.getCalculationTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalculationTemplate=ruleCalculationTemplate();

            state._fsp--;

             current =iv_ruleCalculationTemplate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalculationTemplate"


    // $ANTLR start "ruleCalculationTemplate"
    // InternalPagos.g:1175:1: ruleCalculationTemplate returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) (this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET )? this_COMMA_17= RULE_COMMA otherlv_18= 'calculationrules' this_COLON_19= RULE_COLON ( (lv_formulas_20_0= ruleFormula ) ) this_RBRACE_21= RULE_RBRACE ) ;
    public final EObject ruleCalculationTemplate() throws RecognitionException {
        EObject current = null;

        Token this_LBRACE_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token lv_name_4_0=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token lv_description_8_0=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_LBRACKET_12=null;
        Token this_COMMA_14=null;
        Token this_RBRACKET_16=null;
        Token this_COMMA_17=null;
        Token otherlv_18=null;
        Token this_COLON_19=null;
        Token this_RBRACE_21=null;
        EObject lv_attLists_13_0 = null;

        EObject lv_attLists_15_0 = null;

        EObject lv_formulas_20_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1181:2: ( ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) (this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET )? this_COMMA_17= RULE_COMMA otherlv_18= 'calculationrules' this_COLON_19= RULE_COLON ( (lv_formulas_20_0= ruleFormula ) ) this_RBRACE_21= RULE_RBRACE ) )
            // InternalPagos.g:1182:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) (this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET )? this_COMMA_17= RULE_COMMA otherlv_18= 'calculationrules' this_COLON_19= RULE_COLON ( (lv_formulas_20_0= ruleFormula ) ) this_RBRACE_21= RULE_RBRACE )
            {
            // InternalPagos.g:1182:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) (this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET )? this_COMMA_17= RULE_COMMA otherlv_18= 'calculationrules' this_COLON_19= RULE_COLON ( (lv_formulas_20_0= ruleFormula ) ) this_RBRACE_21= RULE_RBRACE )
            // InternalPagos.g:1183:3: () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) (this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET )? this_COMMA_17= RULE_COMMA otherlv_18= 'calculationrules' this_COLON_19= RULE_COLON ( (lv_formulas_20_0= ruleFormula ) ) this_RBRACE_21= RULE_RBRACE
            {
            // InternalPagos.g:1183:3: ()
            // InternalPagos.g:1184:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCalculationTemplateAccess().getCalculationTemplateAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_3); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getCalculationTemplateAccess().getLBRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCalculationTemplateAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalPagos.g:1202:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalPagos.g:1203:4: (lv_name_4_0= RULE_ID )
            {
            // InternalPagos.g:1203:4: (lv_name_4_0= RULE_ID )
            // InternalPagos.g:1204:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_4_0, grammarAccess.getCalculationTemplateAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCalculationTemplateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.edu.uniandes.Pagos.ID");
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_13); 

            			newLeafNode(this_COMMA_5, grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getCalculationTemplateAccess().getDescriptionKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_14); 

            			newLeafNode(this_COLON_7, grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalPagos.g:1232:3: ( (lv_description_8_0= RULE_STRING ) )
            // InternalPagos.g:1233:4: (lv_description_8_0= RULE_STRING )
            {
            // InternalPagos.g:1233:4: (lv_description_8_0= RULE_STRING )
            // InternalPagos.g:1234:5: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_description_8_0, grammarAccess.getCalculationTemplateAccess().getDescriptionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCalculationTemplateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_8_0,
            						"co.edu.uniandes.Pagos.STRING");
            				

            }


            }

            // InternalPagos.g:1250:3: (this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_COMMA) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==40) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalPagos.g:1251:4: this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET
                    {
                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_22); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_9_0());
                    			
                    otherlv_10=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getCalculationTemplateAccess().getCalculationattributesKeyword_9_1());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_11); 

                    				newLeafNode(this_COLON_11, grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_9_2());
                    			
                    this_LBRACKET_12=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

                    				newLeafNode(this_LBRACKET_12, grammarAccess.getCalculationTemplateAccess().getLBRACKETTerminalRuleCall_9_3());
                    			
                    // InternalPagos.g:1267:4: ( (lv_attLists_13_0= ruleBusinessAttribute ) )
                    // InternalPagos.g:1268:5: (lv_attLists_13_0= ruleBusinessAttribute )
                    {
                    // InternalPagos.g:1268:5: (lv_attLists_13_0= ruleBusinessAttribute )
                    // InternalPagos.g:1269:6: lv_attLists_13_0= ruleBusinessAttribute
                    {

                    						newCompositeNode(grammarAccess.getCalculationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_9_4_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_attLists_13_0=ruleBusinessAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalculationTemplateRule());
                    						}
                    						add(
                    							current,
                    							"attLists",
                    							lv_attLists_13_0,
                    							"co.edu.uniandes.Pagos.BusinessAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPagos.g:1286:4: (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalPagos.g:1287:5: this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) )
                    	    {
                    	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_8); 

                    	    					newLeafNode(this_COMMA_14, grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_9_5_0());
                    	    				
                    	    // InternalPagos.g:1291:5: ( (lv_attLists_15_0= ruleBusinessAttribute ) )
                    	    // InternalPagos.g:1292:6: (lv_attLists_15_0= ruleBusinessAttribute )
                    	    {
                    	    // InternalPagos.g:1292:6: (lv_attLists_15_0= ruleBusinessAttribute )
                    	    // InternalPagos.g:1293:7: lv_attLists_15_0= ruleBusinessAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getCalculationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_9_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_attLists_15_0=ruleBusinessAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCalculationTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attLists",
                    	    								lv_attLists_15_0,
                    	    								"co.edu.uniandes.Pagos.BusinessAttribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    this_RBRACKET_16=(Token)match(input,RULE_RBRACKET,FOLLOW_6); 

                    				newLeafNode(this_RBRACKET_16, grammarAccess.getCalculationTemplateAccess().getRBRACKETTerminalRuleCall_9_6());
                    			

                    }
                    break;

            }

            this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_23); 

            			newLeafNode(this_COMMA_17, grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_10());
            		
            otherlv_18=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getCalculationTemplateAccess().getCalculationrulesKeyword_11());
            		
            this_COLON_19=(Token)match(input,RULE_COLON,FOLLOW_24); 

            			newLeafNode(this_COLON_19, grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_12());
            		
            // InternalPagos.g:1328:3: ( (lv_formulas_20_0= ruleFormula ) )
            // InternalPagos.g:1329:4: (lv_formulas_20_0= ruleFormula )
            {
            // InternalPagos.g:1329:4: (lv_formulas_20_0= ruleFormula )
            // InternalPagos.g:1330:5: lv_formulas_20_0= ruleFormula
            {

            					newCompositeNode(grammarAccess.getCalculationTemplateAccess().getFormulasFormulaParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_formulas_20_0=ruleFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalculationTemplateRule());
            					}
            					set(
            						current,
            						"formulas",
            						lv_formulas_20_0,
            						"co.edu.uniandes.Pagos.Formula");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RBRACE_21=(Token)match(input,RULE_RBRACE,FOLLOW_2); 

            			newLeafNode(this_RBRACE_21, grammarAccess.getCalculationTemplateAccess().getRBRACETerminalRuleCall_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalculationTemplate"


    // $ANTLR start "entryRuleFormula"
    // InternalPagos.g:1355:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalPagos.g:1355:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalPagos.g:1356:2: iv_ruleFormula= ruleFormula EOF
            {
             newCompositeNode(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormula=ruleFormula();

            state._fsp--;

             current =iv_ruleFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // InternalPagos.g:1362:1: ruleFormula returns [EObject current=null] : ( ( () ( (lv_formulaBody_1_0= ruleIfBlock ) )* ) | ( (lv_formulaReturn_2_0= ruleReturnBlock ) ) ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        EObject lv_formulaBody_1_0 = null;

        EObject lv_formulaReturn_2_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1368:2: ( ( ( () ( (lv_formulaBody_1_0= ruleIfBlock ) )* ) | ( (lv_formulaReturn_2_0= ruleReturnBlock ) ) ) )
            // InternalPagos.g:1369:2: ( ( () ( (lv_formulaBody_1_0= ruleIfBlock ) )* ) | ( (lv_formulaReturn_2_0= ruleReturnBlock ) ) )
            {
            // InternalPagos.g:1369:2: ( ( () ( (lv_formulaBody_1_0= ruleIfBlock ) )* ) | ( (lv_formulaReturn_2_0= ruleReturnBlock ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==EOF||LA16_0==RULE_RBRACE||LA16_0==RULE_IF) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_RETURN) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalPagos.g:1370:3: ( () ( (lv_formulaBody_1_0= ruleIfBlock ) )* )
                    {
                    // InternalPagos.g:1370:3: ( () ( (lv_formulaBody_1_0= ruleIfBlock ) )* )
                    // InternalPagos.g:1371:4: () ( (lv_formulaBody_1_0= ruleIfBlock ) )*
                    {
                    // InternalPagos.g:1371:4: ()
                    // InternalPagos.g:1372:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFormulaAccess().getFormulaAction_0_0(),
                    						current);
                    				

                    }

                    // InternalPagos.g:1378:4: ( (lv_formulaBody_1_0= ruleIfBlock ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_IF) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalPagos.g:1379:5: (lv_formulaBody_1_0= ruleIfBlock )
                    	    {
                    	    // InternalPagos.g:1379:5: (lv_formulaBody_1_0= ruleIfBlock )
                    	    // InternalPagos.g:1380:6: lv_formulaBody_1_0= ruleIfBlock
                    	    {

                    	    						newCompositeNode(grammarAccess.getFormulaAccess().getFormulaBodyIfBlockParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_formulaBody_1_0=ruleIfBlock();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFormulaRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"formulaBody",
                    	    							lv_formulaBody_1_0,
                    	    							"co.edu.uniandes.Pagos.IfBlock");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:1399:3: ( (lv_formulaReturn_2_0= ruleReturnBlock ) )
                    {
                    // InternalPagos.g:1399:3: ( (lv_formulaReturn_2_0= ruleReturnBlock ) )
                    // InternalPagos.g:1400:4: (lv_formulaReturn_2_0= ruleReturnBlock )
                    {
                    // InternalPagos.g:1400:4: (lv_formulaReturn_2_0= ruleReturnBlock )
                    // InternalPagos.g:1401:5: lv_formulaReturn_2_0= ruleReturnBlock
                    {

                    					newCompositeNode(grammarAccess.getFormulaAccess().getFormulaReturnReturnBlockParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_formulaReturn_2_0=ruleReturnBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormulaRule());
                    					}
                    					set(
                    						current,
                    						"formulaReturn",
                    						lv_formulaReturn_2_0,
                    						"co.edu.uniandes.Pagos.ReturnBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleIfBlock"
    // InternalPagos.g:1422:1: entryRuleIfBlock returns [EObject current=null] : iv_ruleIfBlock= ruleIfBlock EOF ;
    public final EObject entryRuleIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfBlock = null;


        try {
            // InternalPagos.g:1422:48: (iv_ruleIfBlock= ruleIfBlock EOF )
            // InternalPagos.g:1423:2: iv_ruleIfBlock= ruleIfBlock EOF
            {
             newCompositeNode(grammarAccess.getIfBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfBlock=ruleIfBlock();

            state._fsp--;

             current =iv_ruleIfBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfBlock"


    // $ANTLR start "ruleIfBlock"
    // InternalPagos.g:1429:1: ruleIfBlock returns [EObject current=null] : ( () ( (lv_ifSentence_1_0= ruleIfCondition ) ) (this_ELSE_2= RULE_ELSE ( (lv_elseSentence_3_0= ruleElseSegment ) ) )? ) ;
    public final EObject ruleIfBlock() throws RecognitionException {
        EObject current = null;

        Token this_ELSE_2=null;
        EObject lv_ifSentence_1_0 = null;

        EObject lv_elseSentence_3_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1435:2: ( ( () ( (lv_ifSentence_1_0= ruleIfCondition ) ) (this_ELSE_2= RULE_ELSE ( (lv_elseSentence_3_0= ruleElseSegment ) ) )? ) )
            // InternalPagos.g:1436:2: ( () ( (lv_ifSentence_1_0= ruleIfCondition ) ) (this_ELSE_2= RULE_ELSE ( (lv_elseSentence_3_0= ruleElseSegment ) ) )? )
            {
            // InternalPagos.g:1436:2: ( () ( (lv_ifSentence_1_0= ruleIfCondition ) ) (this_ELSE_2= RULE_ELSE ( (lv_elseSentence_3_0= ruleElseSegment ) ) )? )
            // InternalPagos.g:1437:3: () ( (lv_ifSentence_1_0= ruleIfCondition ) ) (this_ELSE_2= RULE_ELSE ( (lv_elseSentence_3_0= ruleElseSegment ) ) )?
            {
            // InternalPagos.g:1437:3: ()
            // InternalPagos.g:1438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfBlockAccess().getIfBlockAction_0(),
            					current);
            			

            }

            // InternalPagos.g:1444:3: ( (lv_ifSentence_1_0= ruleIfCondition ) )
            // InternalPagos.g:1445:4: (lv_ifSentence_1_0= ruleIfCondition )
            {
            // InternalPagos.g:1445:4: (lv_ifSentence_1_0= ruleIfCondition )
            // InternalPagos.g:1446:5: lv_ifSentence_1_0= ruleIfCondition
            {

            					newCompositeNode(grammarAccess.getIfBlockAccess().getIfSentenceIfConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_ifSentence_1_0=ruleIfCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfBlockRule());
            					}
            					set(
            						current,
            						"ifSentence",
            						lv_ifSentence_1_0,
            						"co.edu.uniandes.Pagos.IfCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:1463:3: (this_ELSE_2= RULE_ELSE ( (lv_elseSentence_3_0= ruleElseSegment ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ELSE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPagos.g:1464:4: this_ELSE_2= RULE_ELSE ( (lv_elseSentence_3_0= ruleElseSegment ) )
                    {
                    this_ELSE_2=(Token)match(input,RULE_ELSE,FOLLOW_8); 

                    				newLeafNode(this_ELSE_2, grammarAccess.getIfBlockAccess().getELSETerminalRuleCall_2_0());
                    			
                    // InternalPagos.g:1468:4: ( (lv_elseSentence_3_0= ruleElseSegment ) )
                    // InternalPagos.g:1469:5: (lv_elseSentence_3_0= ruleElseSegment )
                    {
                    // InternalPagos.g:1469:5: (lv_elseSentence_3_0= ruleElseSegment )
                    // InternalPagos.g:1470:6: lv_elseSentence_3_0= ruleElseSegment
                    {

                    						newCompositeNode(grammarAccess.getIfBlockAccess().getElseSentenceElseSegmentParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseSentence_3_0=ruleElseSegment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfBlockRule());
                    						}
                    						set(
                    							current,
                    							"elseSentence",
                    							lv_elseSentence_3_0,
                    							"co.edu.uniandes.Pagos.ElseSegment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfBlock"


    // $ANTLR start "entryRuleIfCondition"
    // InternalPagos.g:1492:1: entryRuleIfCondition returns [EObject current=null] : iv_ruleIfCondition= ruleIfCondition EOF ;
    public final EObject entryRuleIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCondition = null;


        try {
            // InternalPagos.g:1492:52: (iv_ruleIfCondition= ruleIfCondition EOF )
            // InternalPagos.g:1493:2: iv_ruleIfCondition= ruleIfCondition EOF
            {
             newCompositeNode(grammarAccess.getIfConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfCondition=ruleIfCondition();

            state._fsp--;

             current =iv_ruleIfCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfCondition"


    // $ANTLR start "ruleIfCondition"
    // InternalPagos.g:1499:1: ruleIfCondition returns [EObject current=null] : ( () this_IF_1= RULE_IF this_LBRACKET_2= RULE_LBRACKET ( (lv_logExp_3_0= ruleExpresionLogica ) ) this_RBRACKET_4= RULE_RBRACKET this_THEN_5= RULE_THEN this_LBRACE_6= RULE_LBRACE ( (lv_formulaReturn_7_0= ruleReturnBlock ) ) this_RBRACE_8= RULE_RBRACE ) ;
    public final EObject ruleIfCondition() throws RecognitionException {
        EObject current = null;

        Token this_IF_1=null;
        Token this_LBRACKET_2=null;
        Token this_RBRACKET_4=null;
        Token this_THEN_5=null;
        Token this_LBRACE_6=null;
        Token this_RBRACE_8=null;
        EObject lv_logExp_3_0 = null;

        EObject lv_formulaReturn_7_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1505:2: ( ( () this_IF_1= RULE_IF this_LBRACKET_2= RULE_LBRACKET ( (lv_logExp_3_0= ruleExpresionLogica ) ) this_RBRACKET_4= RULE_RBRACKET this_THEN_5= RULE_THEN this_LBRACE_6= RULE_LBRACE ( (lv_formulaReturn_7_0= ruleReturnBlock ) ) this_RBRACE_8= RULE_RBRACE ) )
            // InternalPagos.g:1506:2: ( () this_IF_1= RULE_IF this_LBRACKET_2= RULE_LBRACKET ( (lv_logExp_3_0= ruleExpresionLogica ) ) this_RBRACKET_4= RULE_RBRACKET this_THEN_5= RULE_THEN this_LBRACE_6= RULE_LBRACE ( (lv_formulaReturn_7_0= ruleReturnBlock ) ) this_RBRACE_8= RULE_RBRACE )
            {
            // InternalPagos.g:1506:2: ( () this_IF_1= RULE_IF this_LBRACKET_2= RULE_LBRACKET ( (lv_logExp_3_0= ruleExpresionLogica ) ) this_RBRACKET_4= RULE_RBRACKET this_THEN_5= RULE_THEN this_LBRACE_6= RULE_LBRACE ( (lv_formulaReturn_7_0= ruleReturnBlock ) ) this_RBRACE_8= RULE_RBRACE )
            // InternalPagos.g:1507:3: () this_IF_1= RULE_IF this_LBRACKET_2= RULE_LBRACKET ( (lv_logExp_3_0= ruleExpresionLogica ) ) this_RBRACKET_4= RULE_RBRACKET this_THEN_5= RULE_THEN this_LBRACE_6= RULE_LBRACE ( (lv_formulaReturn_7_0= ruleReturnBlock ) ) this_RBRACE_8= RULE_RBRACE
            {
            // InternalPagos.g:1507:3: ()
            // InternalPagos.g:1508:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfConditionAccess().getIfConditionAction_0(),
            					current);
            			

            }

            this_IF_1=(Token)match(input,RULE_IF,FOLLOW_11); 

            			newLeafNode(this_IF_1, grammarAccess.getIfConditionAccess().getIFTerminalRuleCall_1());
            		
            this_LBRACKET_2=(Token)match(input,RULE_LBRACKET,FOLLOW_27); 

            			newLeafNode(this_LBRACKET_2, grammarAccess.getIfConditionAccess().getLBRACKETTerminalRuleCall_2());
            		
            // InternalPagos.g:1522:3: ( (lv_logExp_3_0= ruleExpresionLogica ) )
            // InternalPagos.g:1523:4: (lv_logExp_3_0= ruleExpresionLogica )
            {
            // InternalPagos.g:1523:4: (lv_logExp_3_0= ruleExpresionLogica )
            // InternalPagos.g:1524:5: lv_logExp_3_0= ruleExpresionLogica
            {

            					newCompositeNode(grammarAccess.getIfConditionAccess().getLogExpExpresionLogicaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_logExp_3_0=ruleExpresionLogica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfConditionRule());
            					}
            					add(
            						current,
            						"logExp",
            						lv_logExp_3_0,
            						"co.edu.uniandes.Pagos.ExpresionLogica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RBRACKET_4=(Token)match(input,RULE_RBRACKET,FOLLOW_29); 

            			newLeafNode(this_RBRACKET_4, grammarAccess.getIfConditionAccess().getRBRACKETTerminalRuleCall_4());
            		
            this_THEN_5=(Token)match(input,RULE_THEN,FOLLOW_8); 

            			newLeafNode(this_THEN_5, grammarAccess.getIfConditionAccess().getTHENTerminalRuleCall_5());
            		
            this_LBRACE_6=(Token)match(input,RULE_LBRACE,FOLLOW_24); 

            			newLeafNode(this_LBRACE_6, grammarAccess.getIfConditionAccess().getLBRACETerminalRuleCall_6());
            		
            // InternalPagos.g:1553:3: ( (lv_formulaReturn_7_0= ruleReturnBlock ) )
            // InternalPagos.g:1554:4: (lv_formulaReturn_7_0= ruleReturnBlock )
            {
            // InternalPagos.g:1554:4: (lv_formulaReturn_7_0= ruleReturnBlock )
            // InternalPagos.g:1555:5: lv_formulaReturn_7_0= ruleReturnBlock
            {

            					newCompositeNode(grammarAccess.getIfConditionAccess().getFormulaReturnReturnBlockParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_formulaReturn_7_0=ruleReturnBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfConditionRule());
            					}
            					set(
            						current,
            						"formulaReturn",
            						lv_formulaReturn_7_0,
            						"co.edu.uniandes.Pagos.ReturnBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RBRACE_8=(Token)match(input,RULE_RBRACE,FOLLOW_2); 

            			newLeafNode(this_RBRACE_8, grammarAccess.getIfConditionAccess().getRBRACETerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfCondition"


    // $ANTLR start "entryRuleElseSegment"
    // InternalPagos.g:1580:1: entryRuleElseSegment returns [EObject current=null] : iv_ruleElseSegment= ruleElseSegment EOF ;
    public final EObject entryRuleElseSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseSegment = null;


        try {
            // InternalPagos.g:1580:52: (iv_ruleElseSegment= ruleElseSegment EOF )
            // InternalPagos.g:1581:2: iv_ruleElseSegment= ruleElseSegment EOF
            {
             newCompositeNode(grammarAccess.getElseSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElseSegment=ruleElseSegment();

            state._fsp--;

             current =iv_ruleElseSegment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElseSegment"


    // $ANTLR start "ruleElseSegment"
    // InternalPagos.g:1587:1: ruleElseSegment returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE ( (lv_ifSentence_2_0= ruleFormula ) ) this_RBRACE_3= RULE_RBRACE ) ;
    public final EObject ruleElseSegment() throws RecognitionException {
        EObject current = null;

        Token this_LBRACE_1=null;
        Token this_RBRACE_3=null;
        EObject lv_ifSentence_2_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1593:2: ( ( () this_LBRACE_1= RULE_LBRACE ( (lv_ifSentence_2_0= ruleFormula ) ) this_RBRACE_3= RULE_RBRACE ) )
            // InternalPagos.g:1594:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_ifSentence_2_0= ruleFormula ) ) this_RBRACE_3= RULE_RBRACE )
            {
            // InternalPagos.g:1594:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_ifSentence_2_0= ruleFormula ) ) this_RBRACE_3= RULE_RBRACE )
            // InternalPagos.g:1595:3: () this_LBRACE_1= RULE_LBRACE ( (lv_ifSentence_2_0= ruleFormula ) ) this_RBRACE_3= RULE_RBRACE
            {
            // InternalPagos.g:1595:3: ()
            // InternalPagos.g:1596:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElseSegmentAccess().getElseSegmentAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_24); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getElseSegmentAccess().getLBRACETerminalRuleCall_1());
            		
            // InternalPagos.g:1606:3: ( (lv_ifSentence_2_0= ruleFormula ) )
            // InternalPagos.g:1607:4: (lv_ifSentence_2_0= ruleFormula )
            {
            // InternalPagos.g:1607:4: (lv_ifSentence_2_0= ruleFormula )
            // InternalPagos.g:1608:5: lv_ifSentence_2_0= ruleFormula
            {

            					newCompositeNode(grammarAccess.getElseSegmentAccess().getIfSentenceFormulaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_ifSentence_2_0=ruleFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElseSegmentRule());
            					}
            					set(
            						current,
            						"ifSentence",
            						lv_ifSentence_2_0,
            						"co.edu.uniandes.Pagos.Formula");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RBRACE_3=(Token)match(input,RULE_RBRACE,FOLLOW_2); 

            			newLeafNode(this_RBRACE_3, grammarAccess.getElseSegmentAccess().getRBRACETerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElseSegment"


    // $ANTLR start "entryRuleReturnBlock"
    // InternalPagos.g:1633:1: entryRuleReturnBlock returns [EObject current=null] : iv_ruleReturnBlock= ruleReturnBlock EOF ;
    public final EObject entryRuleReturnBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnBlock = null;


        try {
            // InternalPagos.g:1633:52: (iv_ruleReturnBlock= ruleReturnBlock EOF )
            // InternalPagos.g:1634:2: iv_ruleReturnBlock= ruleReturnBlock EOF
            {
             newCompositeNode(grammarAccess.getReturnBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnBlock=ruleReturnBlock();

            state._fsp--;

             current =iv_ruleReturnBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnBlock"


    // $ANTLR start "ruleReturnBlock"
    // InternalPagos.g:1640:1: ruleReturnBlock returns [EObject current=null] : ( () this_RETURN_1= RULE_RETURN this_COLON_2= RULE_COLON ( (lv_expression_3_0= ruleAdicion ) ) ) ;
    public final EObject ruleReturnBlock() throws RecognitionException {
        EObject current = null;

        Token this_RETURN_1=null;
        Token this_COLON_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1646:2: ( ( () this_RETURN_1= RULE_RETURN this_COLON_2= RULE_COLON ( (lv_expression_3_0= ruleAdicion ) ) ) )
            // InternalPagos.g:1647:2: ( () this_RETURN_1= RULE_RETURN this_COLON_2= RULE_COLON ( (lv_expression_3_0= ruleAdicion ) ) )
            {
            // InternalPagos.g:1647:2: ( () this_RETURN_1= RULE_RETURN this_COLON_2= RULE_COLON ( (lv_expression_3_0= ruleAdicion ) ) )
            // InternalPagos.g:1648:3: () this_RETURN_1= RULE_RETURN this_COLON_2= RULE_COLON ( (lv_expression_3_0= ruleAdicion ) )
            {
            // InternalPagos.g:1648:3: ()
            // InternalPagos.g:1649:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReturnBlockAccess().getReturnBlockAction_0(),
            					current);
            			

            }

            this_RETURN_1=(Token)match(input,RULE_RETURN,FOLLOW_4); 

            			newLeafNode(this_RETURN_1, grammarAccess.getReturnBlockAccess().getRETURNTerminalRuleCall_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_30); 

            			newLeafNode(this_COLON_2, grammarAccess.getReturnBlockAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalPagos.g:1663:3: ( (lv_expression_3_0= ruleAdicion ) )
            // InternalPagos.g:1664:4: (lv_expression_3_0= ruleAdicion )
            {
            // InternalPagos.g:1664:4: (lv_expression_3_0= ruleAdicion )
            // InternalPagos.g:1665:5: lv_expression_3_0= ruleAdicion
            {

            					newCompositeNode(grammarAccess.getReturnBlockAccess().getExpressionAdicionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleAdicion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnBlockRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"co.edu.uniandes.Pagos.Adicion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnBlock"


    // $ANTLR start "entryRuleExpresionLogica"
    // InternalPagos.g:1686:1: entryRuleExpresionLogica returns [EObject current=null] : iv_ruleExpresionLogica= ruleExpresionLogica EOF ;
    public final EObject entryRuleExpresionLogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionLogica = null;


        try {
            // InternalPagos.g:1686:56: (iv_ruleExpresionLogica= ruleExpresionLogica EOF )
            // InternalPagos.g:1687:2: iv_ruleExpresionLogica= ruleExpresionLogica EOF
            {
             newCompositeNode(grammarAccess.getExpresionLogicaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionLogica=ruleExpresionLogica();

            state._fsp--;

             current =iv_ruleExpresionLogica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionLogica"


    // $ANTLR start "ruleExpresionLogica"
    // InternalPagos.g:1693:1: ruleExpresionLogica returns [EObject current=null] : ( ( (lv_variable_0_0= ruleTerminalValue ) ) ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+ ( ( (lv_conOper_4_0= RULE_LOGICALCONN ) ) ( (lv_exp_5_0= ruleExpresionLogica ) ) )? ) ;
    public final EObject ruleExpresionLogica() throws RecognitionException {
        EObject current = null;

        Token lv_logOper_1_0=null;
        Token lv_literal_3_0=null;
        Token lv_conOper_4_0=null;
        EObject lv_variable_0_0 = null;

        EObject lv_variable2_2_0 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1699:2: ( ( ( (lv_variable_0_0= ruleTerminalValue ) ) ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+ ( ( (lv_conOper_4_0= RULE_LOGICALCONN ) ) ( (lv_exp_5_0= ruleExpresionLogica ) ) )? ) )
            // InternalPagos.g:1700:2: ( ( (lv_variable_0_0= ruleTerminalValue ) ) ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+ ( ( (lv_conOper_4_0= RULE_LOGICALCONN ) ) ( (lv_exp_5_0= ruleExpresionLogica ) ) )? )
            {
            // InternalPagos.g:1700:2: ( ( (lv_variable_0_0= ruleTerminalValue ) ) ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+ ( ( (lv_conOper_4_0= RULE_LOGICALCONN ) ) ( (lv_exp_5_0= ruleExpresionLogica ) ) )? )
            // InternalPagos.g:1701:3: ( (lv_variable_0_0= ruleTerminalValue ) ) ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+ ( ( (lv_conOper_4_0= RULE_LOGICALCONN ) ) ( (lv_exp_5_0= ruleExpresionLogica ) ) )?
            {
            // InternalPagos.g:1701:3: ( (lv_variable_0_0= ruleTerminalValue ) )
            // InternalPagos.g:1702:4: (lv_variable_0_0= ruleTerminalValue )
            {
            // InternalPagos.g:1702:4: (lv_variable_0_0= ruleTerminalValue )
            // InternalPagos.g:1703:5: lv_variable_0_0= ruleTerminalValue
            {

            					newCompositeNode(grammarAccess.getExpresionLogicaAccess().getVariableTerminalValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_variable_0_0=ruleTerminalValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"co.edu.uniandes.Pagos.TerminalValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:1720:3: ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_OPERADORLOGICO) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPagos.g:1721:4: ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) )
            	    {
            	    // InternalPagos.g:1721:4: ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) )
            	    // InternalPagos.g:1722:5: (lv_logOper_1_0= RULE_OPERADORLOGICO )
            	    {
            	    // InternalPagos.g:1722:5: (lv_logOper_1_0= RULE_OPERADORLOGICO )
            	    // InternalPagos.g:1723:6: lv_logOper_1_0= RULE_OPERADORLOGICO
            	    {
            	    lv_logOper_1_0=(Token)match(input,RULE_OPERADORLOGICO,FOLLOW_32); 

            	    						newLeafNode(lv_logOper_1_0, grammarAccess.getExpresionLogicaAccess().getLogOperOPERADORLOGICOTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExpresionLogicaRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"logOper",
            	    							lv_logOper_1_0,
            	    							"co.edu.uniandes.Pagos.OPERADORLOGICO");
            	    					

            	    }


            	    }

            	    // InternalPagos.g:1739:4: ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==EOF||LA18_0==RULE_ID||LA18_0==RULE_RBRACE||LA18_0==RULE_RBRACKET||(LA18_0>=RULE_OPERADORLOGICO && LA18_0<=RULE_MULTOP)||(LA18_0>=RULE_INDEX && LA18_0<=RULE_DOT)||LA18_0==RULE_INT||LA18_0==43||(LA18_0>=45 && LA18_0<=48)) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==RULE_STRING) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalPagos.g:1740:5: ( (lv_variable2_2_0= ruleTerminalValue ) )
            	            {
            	            // InternalPagos.g:1740:5: ( (lv_variable2_2_0= ruleTerminalValue ) )
            	            // InternalPagos.g:1741:6: (lv_variable2_2_0= ruleTerminalValue )
            	            {
            	            // InternalPagos.g:1741:6: (lv_variable2_2_0= ruleTerminalValue )
            	            // InternalPagos.g:1742:7: lv_variable2_2_0= ruleTerminalValue
            	            {

            	            							newCompositeNode(grammarAccess.getExpresionLogicaAccess().getVariable2TerminalValueParserRuleCall_1_1_0_0());
            	            						
            	            pushFollow(FOLLOW_33);
            	            lv_variable2_2_0=ruleTerminalValue();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
            	            							}
            	            							set(
            	            								current,
            	            								"variable2",
            	            								lv_variable2_2_0,
            	            								"co.edu.uniandes.Pagos.TerminalValue");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPagos.g:1760:5: ( (lv_literal_3_0= RULE_STRING ) )
            	            {
            	            // InternalPagos.g:1760:5: ( (lv_literal_3_0= RULE_STRING ) )
            	            // InternalPagos.g:1761:6: (lv_literal_3_0= RULE_STRING )
            	            {
            	            // InternalPagos.g:1761:6: (lv_literal_3_0= RULE_STRING )
            	            // InternalPagos.g:1762:7: lv_literal_3_0= RULE_STRING
            	            {
            	            lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            	            							newLeafNode(lv_literal_3_0, grammarAccess.getExpresionLogicaAccess().getLiteralSTRINGTerminalRuleCall_1_1_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getExpresionLogicaRule());
            	            							}
            	            							setWithLastConsumed(
            	            								current,
            	            								"literal",
            	            								lv_literal_3_0,
            	            								"co.edu.uniandes.Pagos.STRING");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            // InternalPagos.g:1780:3: ( ( (lv_conOper_4_0= RULE_LOGICALCONN ) ) ( (lv_exp_5_0= ruleExpresionLogica ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_LOGICALCONN) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPagos.g:1781:4: ( (lv_conOper_4_0= RULE_LOGICALCONN ) ) ( (lv_exp_5_0= ruleExpresionLogica ) )
                    {
                    // InternalPagos.g:1781:4: ( (lv_conOper_4_0= RULE_LOGICALCONN ) )
                    // InternalPagos.g:1782:5: (lv_conOper_4_0= RULE_LOGICALCONN )
                    {
                    // InternalPagos.g:1782:5: (lv_conOper_4_0= RULE_LOGICALCONN )
                    // InternalPagos.g:1783:6: lv_conOper_4_0= RULE_LOGICALCONN
                    {
                    lv_conOper_4_0=(Token)match(input,RULE_LOGICALCONN,FOLLOW_27); 

                    						newLeafNode(lv_conOper_4_0, grammarAccess.getExpresionLogicaAccess().getConOperLOGICALCONNTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpresionLogicaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"conOper",
                    							lv_conOper_4_0,
                    							"co.edu.uniandes.Pagos.LOGICALCONN");
                    					

                    }


                    }

                    // InternalPagos.g:1799:4: ( (lv_exp_5_0= ruleExpresionLogica ) )
                    // InternalPagos.g:1800:5: (lv_exp_5_0= ruleExpresionLogica )
                    {
                    // InternalPagos.g:1800:5: (lv_exp_5_0= ruleExpresionLogica )
                    // InternalPagos.g:1801:6: lv_exp_5_0= ruleExpresionLogica
                    {

                    						newCompositeNode(grammarAccess.getExpresionLogicaAccess().getExpExpresionLogicaParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_5_0=ruleExpresionLogica();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_5_0,
                    							"co.edu.uniandes.Pagos.ExpresionLogica");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionLogica"


    // $ANTLR start "entryRuleAdicion"
    // InternalPagos.g:1823:1: entryRuleAdicion returns [EObject current=null] : iv_ruleAdicion= ruleAdicion EOF ;
    public final EObject entryRuleAdicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdicion = null;


        try {
            // InternalPagos.g:1823:48: (iv_ruleAdicion= ruleAdicion EOF )
            // InternalPagos.g:1824:2: iv_ruleAdicion= ruleAdicion EOF
            {
             newCompositeNode(grammarAccess.getAdicionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdicion=ruleAdicion();

            state._fsp--;

             current =iv_ruleAdicion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdicion"


    // $ANTLR start "ruleAdicion"
    // InternalPagos.g:1830:1: ruleAdicion returns [EObject current=null] : (this_Multiplicacion_0= ruleMultiplicacion ( () ( (lv_operator_2_0= RULE_ADDOP ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )* ) ;
    public final EObject ruleAdicion() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_Multiplicacion_0 = null;

        EObject lv_rexp_3_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1836:2: ( (this_Multiplicacion_0= ruleMultiplicacion ( () ( (lv_operator_2_0= RULE_ADDOP ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )* ) )
            // InternalPagos.g:1837:2: (this_Multiplicacion_0= ruleMultiplicacion ( () ( (lv_operator_2_0= RULE_ADDOP ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )* )
            {
            // InternalPagos.g:1837:2: (this_Multiplicacion_0= ruleMultiplicacion ( () ( (lv_operator_2_0= RULE_ADDOP ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )* )
            // InternalPagos.g:1838:3: this_Multiplicacion_0= ruleMultiplicacion ( () ( (lv_operator_2_0= RULE_ADDOP ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdicionAccess().getMultiplicacionParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_Multiplicacion_0=ruleMultiplicacion();

            state._fsp--;


            			current = this_Multiplicacion_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPagos.g:1846:3: ( () ( (lv_operator_2_0= RULE_ADDOP ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ADDOP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPagos.g:1847:4: () ( (lv_operator_2_0= RULE_ADDOP ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) )
            	    {
            	    // InternalPagos.g:1847:4: ()
            	    // InternalPagos.g:1848:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdicionAccess().getAdicionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalPagos.g:1854:4: ( (lv_operator_2_0= RULE_ADDOP ) )
            	    // InternalPagos.g:1855:5: (lv_operator_2_0= RULE_ADDOP )
            	    {
            	    // InternalPagos.g:1855:5: (lv_operator_2_0= RULE_ADDOP )
            	    // InternalPagos.g:1856:6: lv_operator_2_0= RULE_ADDOP
            	    {
            	    lv_operator_2_0=(Token)match(input,RULE_ADDOP,FOLLOW_30); 

            	    						newLeafNode(lv_operator_2_0, grammarAccess.getAdicionAccess().getOperatorADDOPTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAdicionRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"co.edu.uniandes.Pagos.ADDOP");
            	    					

            	    }


            	    }

            	    // InternalPagos.g:1872:4: ( (lv_rexp_3_0= ruleMultiplicacion ) )
            	    // InternalPagos.g:1873:5: (lv_rexp_3_0= ruleMultiplicacion )
            	    {
            	    // InternalPagos.g:1873:5: (lv_rexp_3_0= ruleMultiplicacion )
            	    // InternalPagos.g:1874:6: lv_rexp_3_0= ruleMultiplicacion
            	    {

            	    						newCompositeNode(grammarAccess.getAdicionAccess().getRexpMultiplicacionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_rexp_3_0=ruleMultiplicacion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdicionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rexp",
            	    							lv_rexp_3_0,
            	    							"co.edu.uniandes.Pagos.Multiplicacion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdicion"


    // $ANTLR start "entryRuleMultiplicacion"
    // InternalPagos.g:1896:1: entryRuleMultiplicacion returns [EObject current=null] : iv_ruleMultiplicacion= ruleMultiplicacion EOF ;
    public final EObject entryRuleMultiplicacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacion = null;


        try {
            // InternalPagos.g:1896:55: (iv_ruleMultiplicacion= ruleMultiplicacion EOF )
            // InternalPagos.g:1897:2: iv_ruleMultiplicacion= ruleMultiplicacion EOF
            {
             newCompositeNode(grammarAccess.getMultiplicacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicacion=ruleMultiplicacion();

            state._fsp--;

             current =iv_ruleMultiplicacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicacion"


    // $ANTLR start "ruleMultiplicacion"
    // InternalPagos.g:1903:1: ruleMultiplicacion returns [EObject current=null] : (this_SigleExp_0= ruleSigleExp ( () ( (lv_operator_2_0= RULE_MULTOP ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )* ) ;
    public final EObject ruleMultiplicacion() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_SigleExp_0 = null;

        EObject lv_rexp_3_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1909:2: ( (this_SigleExp_0= ruleSigleExp ( () ( (lv_operator_2_0= RULE_MULTOP ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )* ) )
            // InternalPagos.g:1910:2: (this_SigleExp_0= ruleSigleExp ( () ( (lv_operator_2_0= RULE_MULTOP ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )* )
            {
            // InternalPagos.g:1910:2: (this_SigleExp_0= ruleSigleExp ( () ( (lv_operator_2_0= RULE_MULTOP ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )* )
            // InternalPagos.g:1911:3: this_SigleExp_0= ruleSigleExp ( () ( (lv_operator_2_0= RULE_MULTOP ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicacionAccess().getSigleExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_SigleExp_0=ruleSigleExp();

            state._fsp--;


            			current = this_SigleExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPagos.g:1919:3: ( () ( (lv_operator_2_0= RULE_MULTOP ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_MULTOP) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPagos.g:1920:4: () ( (lv_operator_2_0= RULE_MULTOP ) ) ( (lv_rexp_3_0= ruleSigleExp ) )
            	    {
            	    // InternalPagos.g:1920:4: ()
            	    // InternalPagos.g:1921:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicacionAccess().getMultiplicacionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalPagos.g:1927:4: ( (lv_operator_2_0= RULE_MULTOP ) )
            	    // InternalPagos.g:1928:5: (lv_operator_2_0= RULE_MULTOP )
            	    {
            	    // InternalPagos.g:1928:5: (lv_operator_2_0= RULE_MULTOP )
            	    // InternalPagos.g:1929:6: lv_operator_2_0= RULE_MULTOP
            	    {
            	    lv_operator_2_0=(Token)match(input,RULE_MULTOP,FOLLOW_30); 

            	    						newLeafNode(lv_operator_2_0, grammarAccess.getMultiplicacionAccess().getOperatorMULTOPTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMultiplicacionRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"co.edu.uniandes.Pagos.MULTOP");
            	    					

            	    }


            	    }

            	    // InternalPagos.g:1945:4: ( (lv_rexp_3_0= ruleSigleExp ) )
            	    // InternalPagos.g:1946:5: (lv_rexp_3_0= ruleSigleExp )
            	    {
            	    // InternalPagos.g:1946:5: (lv_rexp_3_0= ruleSigleExp )
            	    // InternalPagos.g:1947:6: lv_rexp_3_0= ruleSigleExp
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicacionAccess().getRexpSigleExpParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_rexp_3_0=ruleSigleExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicacionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rexp",
            	    							lv_rexp_3_0,
            	    							"co.edu.uniandes.Pagos.SigleExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicacion"


    // $ANTLR start "entryRuleSigleExp"
    // InternalPagos.g:1969:1: entryRuleSigleExp returns [EObject current=null] : iv_ruleSigleExp= ruleSigleExp EOF ;
    public final EObject entryRuleSigleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigleExp = null;


        try {
            // InternalPagos.g:1969:49: (iv_ruleSigleExp= ruleSigleExp EOF )
            // InternalPagos.g:1970:2: iv_ruleSigleExp= ruleSigleExp EOF
            {
             newCompositeNode(grammarAccess.getSigleExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSigleExp=ruleSigleExp();

            state._fsp--;

             current =iv_ruleSigleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSigleExp"


    // $ANTLR start "ruleSigleExp"
    // InternalPagos.g:1976:1: ruleSigleExp returns [EObject current=null] : (this_TerminalValue_0= ruleTerminalValue | (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' ) ) ;
    public final EObject ruleSigleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_TerminalValue_0 = null;

        EObject this_Adicion_2 = null;



        	enterRule();

        try {
            // InternalPagos.g:1982:2: ( (this_TerminalValue_0= ruleTerminalValue | (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' ) ) )
            // InternalPagos.g:1983:2: (this_TerminalValue_0= ruleTerminalValue | (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' ) )
            {
            // InternalPagos.g:1983:2: (this_TerminalValue_0= ruleTerminalValue | (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==EOF||LA23_0==RULE_ID||LA23_0==RULE_RBRACE||LA23_0==RULE_RBRACKET||(LA23_0>=RULE_OPERADORLOGICO && LA23_0<=RULE_MULTOP)||(LA23_0>=RULE_INDEX && LA23_0<=RULE_DOT)||LA23_0==RULE_INT||LA23_0==43||(LA23_0>=45 && LA23_0<=48)) ) {
                alt23=1;
            }
            else if ( (LA23_0==42) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalPagos.g:1984:3: this_TerminalValue_0= ruleTerminalValue
                    {

                    			newCompositeNode(grammarAccess.getSigleExpAccess().getTerminalValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TerminalValue_0=ruleTerminalValue();

                    state._fsp--;


                    			current = this_TerminalValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPagos.g:1993:3: (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' )
                    {
                    // InternalPagos.g:1993:3: (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' )
                    // InternalPagos.g:1994:4: otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getSigleExpAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getSigleExpAccess().getAdicionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_36);
                    this_Adicion_2=ruleAdicion();

                    state._fsp--;


                    				current = this_Adicion_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSigleExpAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSigleExp"


    // $ANTLR start "entryRuleBusinessAttribute"
    // InternalPagos.g:2015:1: entryRuleBusinessAttribute returns [EObject current=null] : iv_ruleBusinessAttribute= ruleBusinessAttribute EOF ;
    public final EObject entryRuleBusinessAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessAttribute = null;


        try {
            // InternalPagos.g:2015:58: (iv_ruleBusinessAttribute= ruleBusinessAttribute EOF )
            // InternalPagos.g:2016:2: iv_ruleBusinessAttribute= ruleBusinessAttribute EOF
            {
             newCompositeNode(grammarAccess.getBusinessAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessAttribute=ruleBusinessAttribute();

            state._fsp--;

             current =iv_ruleBusinessAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBusinessAttribute"


    // $ANTLR start "ruleBusinessAttribute"
    // InternalPagos.g:2022:1: ruleBusinessAttribute returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? ( (lv_isIndex_7_0= RULE_INDEX ) )? this_RBRACE_8= RULE_RBRACE ) ;
    public final EObject ruleBusinessAttribute() throws RecognitionException {
        EObject current = null;

        Token this_LBRACE_1=null;
        Token lv_name_2_0=null;
        Token this_COLON_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token lv_isIndex_7_0=null;
        Token this_RBRACE_8=null;
        EObject lv_exp_6_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:2028:2: ( ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? ( (lv_isIndex_7_0= RULE_INDEX ) )? this_RBRACE_8= RULE_RBRACE ) )
            // InternalPagos.g:2029:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? ( (lv_isIndex_7_0= RULE_INDEX ) )? this_RBRACE_8= RULE_RBRACE )
            {
            // InternalPagos.g:2029:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? ( (lv_isIndex_7_0= RULE_INDEX ) )? this_RBRACE_8= RULE_RBRACE )
            // InternalPagos.g:2030:3: () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? ( (lv_isIndex_7_0= RULE_INDEX ) )? this_RBRACE_8= RULE_RBRACE
            {
            // InternalPagos.g:2030:3: ()
            // InternalPagos.g:2031:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBusinessAttributeAccess().getBusinessAttributeAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_5); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getBusinessAttributeAccess().getLBRACETerminalRuleCall_1());
            		
            // InternalPagos.g:2041:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPagos.g:2042:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPagos.g:2042:4: (lv_name_2_0= RULE_ID )
            // InternalPagos.g:2043:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getBusinessAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.edu.uniandes.Pagos.ID");
            				

            }


            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_37); 

            			newLeafNode(this_COLON_3, grammarAccess.getBusinessAttributeAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalPagos.g:2063:3: ( (lv_type_4_0= RULE_TYPE ) )
            // InternalPagos.g:2064:4: (lv_type_4_0= RULE_TYPE )
            {
            // InternalPagos.g:2064:4: (lv_type_4_0= RULE_TYPE )
            // InternalPagos.g:2065:5: lv_type_4_0= RULE_TYPE
            {
            lv_type_4_0=(Token)match(input,RULE_TYPE,FOLLOW_38); 

            					newLeafNode(lv_type_4_0, grammarAccess.getBusinessAttributeAccess().getTypeTYPETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_4_0,
            						"co.edu.uniandes.Pagos.TYPE");
            				

            }


            }

            // InternalPagos.g:2081:3: (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPagos.g:2082:4: otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_5, grammarAccess.getBusinessAttributeAccess().getColonEqualsSignKeyword_5_0());
                    			
                    // InternalPagos.g:2086:4: ( (lv_exp_6_0= ruleAdicion ) )
                    // InternalPagos.g:2087:5: (lv_exp_6_0= ruleAdicion )
                    {
                    // InternalPagos.g:2087:5: (lv_exp_6_0= ruleAdicion )
                    // InternalPagos.g:2088:6: lv_exp_6_0= ruleAdicion
                    {

                    						newCompositeNode(grammarAccess.getBusinessAttributeAccess().getExpAdicionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_exp_6_0=ruleAdicion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBusinessAttributeRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_6_0,
                    							"co.edu.uniandes.Pagos.Adicion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPagos.g:2106:3: ( (lv_isIndex_7_0= RULE_INDEX ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INDEX) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPagos.g:2107:4: (lv_isIndex_7_0= RULE_INDEX )
                    {
                    // InternalPagos.g:2107:4: (lv_isIndex_7_0= RULE_INDEX )
                    // InternalPagos.g:2108:5: lv_isIndex_7_0= RULE_INDEX
                    {
                    lv_isIndex_7_0=(Token)match(input,RULE_INDEX,FOLLOW_9); 

                    					newLeafNode(lv_isIndex_7_0, grammarAccess.getBusinessAttributeAccess().getIsIndexINDEXTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBusinessAttributeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isIndex",
                    						lv_isIndex_7_0,
                    						"co.edu.uniandes.Pagos.INDEX");
                    				

                    }


                    }
                    break;

            }

            this_RBRACE_8=(Token)match(input,RULE_RBRACE,FOLLOW_2); 

            			newLeafNode(this_RBRACE_8, grammarAccess.getBusinessAttributeAccess().getRBRACETerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBusinessAttribute"


    // $ANTLR start "entryRuleTerminalValue"
    // InternalPagos.g:2132:1: entryRuleTerminalValue returns [EObject current=null] : iv_ruleTerminalValue= ruleTerminalValue EOF ;
    public final EObject entryRuleTerminalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalValue = null;


        try {
            // InternalPagos.g:2132:54: (iv_ruleTerminalValue= ruleTerminalValue EOF )
            // InternalPagos.g:2133:2: iv_ruleTerminalValue= ruleTerminalValue EOF
            {
             newCompositeNode(grammarAccess.getTerminalValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalValue=ruleTerminalValue();

            state._fsp--;

             current =iv_ruleTerminalValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalValue"


    // $ANTLR start "ruleTerminalValue"
    // InternalPagos.g:2139:1: ruleTerminalValue returns [EObject current=null] : ( ( () ( ( (otherlv_1= 'PA' this_DOT_2= RULE_DOT ( (otherlv_3= RULE_ID ) ) this_DASH_4= RULE_DASH )? ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'PA' this_DOT_7= RULE_DOT ( (otherlv_8= RULE_ID ) ) this_DOT_9= RULE_DOT ( (lv_method_10_0= ruleMethod ) ) ) ) ) | ( (otherlv_11= 'SU' this_DOT_12= RULE_DOT ( (otherlv_13= RULE_ID ) ) this_DASH_14= RULE_DASH ( (otherlv_15= RULE_ID ) ) )? | (otherlv_16= 'SU' this_DOT_17= RULE_DOT ( (otherlv_18= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_method_20_0= ruleMethod ) ) )? ) | ( (otherlv_21= 'IT' this_DOT_22= RULE_DOT ( (otherlv_23= RULE_ID ) ) this_DASH_24= RULE_DASH ( (otherlv_25= RULE_ID ) ) )? | (otherlv_26= 'IT' this_DOT_27= RULE_DOT ( (otherlv_28= RULE_ID ) ) this_DOT_29= RULE_DOT ( (lv_method_30_0= ruleMethod ) ) ) ) | (otherlv_31= 'FU' this_DOT_32= RULE_DOT ( (otherlv_33= RULE_ID ) ) )? | ( (lv_valor_34_0= ruleNumber ) ) ) ;
    public final EObject ruleTerminalValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_DOT_2=null;
        Token otherlv_3=null;
        Token this_DASH_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_DOT_7=null;
        Token otherlv_8=null;
        Token this_DOT_9=null;
        Token otherlv_11=null;
        Token this_DOT_12=null;
        Token otherlv_13=null;
        Token this_DASH_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token this_DOT_17=null;
        Token otherlv_18=null;
        Token this_DOT_19=null;
        Token otherlv_21=null;
        Token this_DOT_22=null;
        Token otherlv_23=null;
        Token this_DASH_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token this_DOT_27=null;
        Token otherlv_28=null;
        Token this_DOT_29=null;
        Token otherlv_31=null;
        Token this_DOT_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_method_10_0 = null;

        AntlrDatatypeRuleToken lv_method_20_0 = null;

        AntlrDatatypeRuleToken lv_method_30_0 = null;

        AntlrDatatypeRuleToken lv_valor_34_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:2145:2: ( ( ( () ( ( (otherlv_1= 'PA' this_DOT_2= RULE_DOT ( (otherlv_3= RULE_ID ) ) this_DASH_4= RULE_DASH )? ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'PA' this_DOT_7= RULE_DOT ( (otherlv_8= RULE_ID ) ) this_DOT_9= RULE_DOT ( (lv_method_10_0= ruleMethod ) ) ) ) ) | ( (otherlv_11= 'SU' this_DOT_12= RULE_DOT ( (otherlv_13= RULE_ID ) ) this_DASH_14= RULE_DASH ( (otherlv_15= RULE_ID ) ) )? | (otherlv_16= 'SU' this_DOT_17= RULE_DOT ( (otherlv_18= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_method_20_0= ruleMethod ) ) )? ) | ( (otherlv_21= 'IT' this_DOT_22= RULE_DOT ( (otherlv_23= RULE_ID ) ) this_DASH_24= RULE_DASH ( (otherlv_25= RULE_ID ) ) )? | (otherlv_26= 'IT' this_DOT_27= RULE_DOT ( (otherlv_28= RULE_ID ) ) this_DOT_29= RULE_DOT ( (lv_method_30_0= ruleMethod ) ) ) ) | (otherlv_31= 'FU' this_DOT_32= RULE_DOT ( (otherlv_33= RULE_ID ) ) )? | ( (lv_valor_34_0= ruleNumber ) ) ) )
            // InternalPagos.g:2146:2: ( ( () ( ( (otherlv_1= 'PA' this_DOT_2= RULE_DOT ( (otherlv_3= RULE_ID ) ) this_DASH_4= RULE_DASH )? ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'PA' this_DOT_7= RULE_DOT ( (otherlv_8= RULE_ID ) ) this_DOT_9= RULE_DOT ( (lv_method_10_0= ruleMethod ) ) ) ) ) | ( (otherlv_11= 'SU' this_DOT_12= RULE_DOT ( (otherlv_13= RULE_ID ) ) this_DASH_14= RULE_DASH ( (otherlv_15= RULE_ID ) ) )? | (otherlv_16= 'SU' this_DOT_17= RULE_DOT ( (otherlv_18= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_method_20_0= ruleMethod ) ) )? ) | ( (otherlv_21= 'IT' this_DOT_22= RULE_DOT ( (otherlv_23= RULE_ID ) ) this_DASH_24= RULE_DASH ( (otherlv_25= RULE_ID ) ) )? | (otherlv_26= 'IT' this_DOT_27= RULE_DOT ( (otherlv_28= RULE_ID ) ) this_DOT_29= RULE_DOT ( (lv_method_30_0= ruleMethod ) ) ) ) | (otherlv_31= 'FU' this_DOT_32= RULE_DOT ( (otherlv_33= RULE_ID ) ) )? | ( (lv_valor_34_0= ruleNumber ) ) )
            {
            // InternalPagos.g:2146:2: ( ( () ( ( (otherlv_1= 'PA' this_DOT_2= RULE_DOT ( (otherlv_3= RULE_ID ) ) this_DASH_4= RULE_DASH )? ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'PA' this_DOT_7= RULE_DOT ( (otherlv_8= RULE_ID ) ) this_DOT_9= RULE_DOT ( (lv_method_10_0= ruleMethod ) ) ) ) ) | ( (otherlv_11= 'SU' this_DOT_12= RULE_DOT ( (otherlv_13= RULE_ID ) ) this_DASH_14= RULE_DASH ( (otherlv_15= RULE_ID ) ) )? | (otherlv_16= 'SU' this_DOT_17= RULE_DOT ( (otherlv_18= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_method_20_0= ruleMethod ) ) )? ) | ( (otherlv_21= 'IT' this_DOT_22= RULE_DOT ( (otherlv_23= RULE_ID ) ) this_DASH_24= RULE_DASH ( (otherlv_25= RULE_ID ) ) )? | (otherlv_26= 'IT' this_DOT_27= RULE_DOT ( (otherlv_28= RULE_ID ) ) this_DOT_29= RULE_DOT ( (lv_method_30_0= ruleMethod ) ) ) ) | (otherlv_31= 'FU' this_DOT_32= RULE_DOT ( (otherlv_33= RULE_ID ) ) )? | ( (lv_valor_34_0= ruleNumber ) ) )
            int alt34=5;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalPagos.g:2147:3: ( () ( ( (otherlv_1= 'PA' this_DOT_2= RULE_DOT ( (otherlv_3= RULE_ID ) ) this_DASH_4= RULE_DASH )? ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'PA' this_DOT_7= RULE_DOT ( (otherlv_8= RULE_ID ) ) this_DOT_9= RULE_DOT ( (lv_method_10_0= ruleMethod ) ) ) ) )
                    {
                    // InternalPagos.g:2147:3: ( () ( ( (otherlv_1= 'PA' this_DOT_2= RULE_DOT ( (otherlv_3= RULE_ID ) ) this_DASH_4= RULE_DASH )? ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'PA' this_DOT_7= RULE_DOT ( (otherlv_8= RULE_ID ) ) this_DOT_9= RULE_DOT ( (lv_method_10_0= ruleMethod ) ) ) ) )
                    // InternalPagos.g:2148:4: () ( ( (otherlv_1= 'PA' this_DOT_2= RULE_DOT ( (otherlv_3= RULE_ID ) ) this_DASH_4= RULE_DASH )? ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'PA' this_DOT_7= RULE_DOT ( (otherlv_8= RULE_ID ) ) this_DOT_9= RULE_DOT ( (lv_method_10_0= ruleMethod ) ) ) )
                    {
                    // InternalPagos.g:2148:4: ()
                    // InternalPagos.g:2149:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalValueAccess().getTerminalValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalPagos.g:2155:4: ( ( (otherlv_1= 'PA' this_DOT_2= RULE_DOT ( (otherlv_3= RULE_ID ) ) this_DASH_4= RULE_DASH )? ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'PA' this_DOT_7= RULE_DOT ( (otherlv_8= RULE_ID ) ) this_DOT_9= RULE_DOT ( (lv_method_10_0= ruleMethod ) ) ) )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==45) ) {
                        int LA27_1 = input.LA(2);

                        if ( (LA27_1==RULE_DOT) ) {
                            int LA27_3 = input.LA(3);

                            if ( (LA27_3==RULE_ID) ) {
                                int LA27_4 = input.LA(4);

                                if ( (LA27_4==RULE_DASH) ) {
                                    alt27=1;
                                }
                                else if ( (LA27_4==RULE_DOT) ) {
                                    alt27=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 27, 4, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 27, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA27_0==RULE_ID) ) {
                        alt27=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalPagos.g:2156:5: ( (otherlv_1= 'PA' this_DOT_2= RULE_DOT ( (otherlv_3= RULE_ID ) ) this_DASH_4= RULE_DASH )? ( (otherlv_5= RULE_ID ) ) )
                            {
                            // InternalPagos.g:2156:5: ( (otherlv_1= 'PA' this_DOT_2= RULE_DOT ( (otherlv_3= RULE_ID ) ) this_DASH_4= RULE_DASH )? ( (otherlv_5= RULE_ID ) ) )
                            // InternalPagos.g:2157:6: (otherlv_1= 'PA' this_DOT_2= RULE_DOT ( (otherlv_3= RULE_ID ) ) this_DASH_4= RULE_DASH )? ( (otherlv_5= RULE_ID ) )
                            {
                            // InternalPagos.g:2157:6: (otherlv_1= 'PA' this_DOT_2= RULE_DOT ( (otherlv_3= RULE_ID ) ) this_DASH_4= RULE_DASH )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==45) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // InternalPagos.g:2158:7: otherlv_1= 'PA' this_DOT_2= RULE_DOT ( (otherlv_3= RULE_ID ) ) this_DASH_4= RULE_DASH
                                    {
                                    otherlv_1=(Token)match(input,45,FOLLOW_40); 

                                    							newLeafNode(otherlv_1, grammarAccess.getTerminalValueAccess().getPAKeyword_0_1_0_0_0());
                                    						
                                    this_DOT_2=(Token)match(input,RULE_DOT,FOLLOW_5); 

                                    							newLeafNode(this_DOT_2, grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_0_1_0_0_1());
                                    						
                                    // InternalPagos.g:2166:7: ( (otherlv_3= RULE_ID ) )
                                    // InternalPagos.g:2167:8: (otherlv_3= RULE_ID )
                                    {
                                    // InternalPagos.g:2167:8: (otherlv_3= RULE_ID )
                                    // InternalPagos.g:2168:9: otherlv_3= RULE_ID
                                    {

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getTerminalValueRule());
                                    									}
                                    								
                                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_41); 

                                    									newLeafNode(otherlv_3, grammarAccess.getTerminalValueAccess().getParentParticipantCrossReference_0_1_0_0_2_0());
                                    								

                                    }


                                    }

                                    this_DASH_4=(Token)match(input,RULE_DASH,FOLLOW_5); 

                                    							newLeafNode(this_DASH_4, grammarAccess.getTerminalValueAccess().getDASHTerminalRuleCall_0_1_0_0_3());
                                    						

                                    }
                                    break;

                            }

                            // InternalPagos.g:2184:6: ( (otherlv_5= RULE_ID ) )
                            // InternalPagos.g:2185:7: (otherlv_5= RULE_ID )
                            {
                            // InternalPagos.g:2185:7: (otherlv_5= RULE_ID )
                            // InternalPagos.g:2186:8: otherlv_5= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getTerminalValueRule());
                            								}
                            							
                            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                            								newLeafNode(otherlv_5, grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_0_1_0_1_0());
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPagos.g:2199:5: (otherlv_6= 'PA' this_DOT_7= RULE_DOT ( (otherlv_8= RULE_ID ) ) this_DOT_9= RULE_DOT ( (lv_method_10_0= ruleMethod ) ) )
                            {
                            // InternalPagos.g:2199:5: (otherlv_6= 'PA' this_DOT_7= RULE_DOT ( (otherlv_8= RULE_ID ) ) this_DOT_9= RULE_DOT ( (lv_method_10_0= ruleMethod ) ) )
                            // InternalPagos.g:2200:6: otherlv_6= 'PA' this_DOT_7= RULE_DOT ( (otherlv_8= RULE_ID ) ) this_DOT_9= RULE_DOT ( (lv_method_10_0= ruleMethod ) )
                            {
                            otherlv_6=(Token)match(input,45,FOLLOW_40); 

                            						newLeafNode(otherlv_6, grammarAccess.getTerminalValueAccess().getPAKeyword_0_1_1_0());
                            					
                            this_DOT_7=(Token)match(input,RULE_DOT,FOLLOW_5); 

                            						newLeafNode(this_DOT_7, grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_0_1_1_1());
                            					
                            // InternalPagos.g:2208:6: ( (otherlv_8= RULE_ID ) )
                            // InternalPagos.g:2209:7: (otherlv_8= RULE_ID )
                            {
                            // InternalPagos.g:2209:7: (otherlv_8= RULE_ID )
                            // InternalPagos.g:2210:8: otherlv_8= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getTerminalValueRule());
                            								}
                            							
                            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_40); 

                            								newLeafNode(otherlv_8, grammarAccess.getTerminalValueAccess().getParentParticipantCrossReference_0_1_1_2_0());
                            							

                            }


                            }

                            this_DOT_9=(Token)match(input,RULE_DOT,FOLLOW_42); 

                            						newLeafNode(this_DOT_9, grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_0_1_1_3());
                            					
                            // InternalPagos.g:2225:6: ( (lv_method_10_0= ruleMethod ) )
                            // InternalPagos.g:2226:7: (lv_method_10_0= ruleMethod )
                            {
                            // InternalPagos.g:2226:7: (lv_method_10_0= ruleMethod )
                            // InternalPagos.g:2227:8: lv_method_10_0= ruleMethod
                            {

                            								newCompositeNode(grammarAccess.getTerminalValueAccess().getMethodMethodParserRuleCall_0_1_1_4_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_method_10_0=ruleMethod();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTerminalValueRule());
                            								}
                            								set(
                            									current,
                            									"method",
                            									lv_method_10_0,
                            									"co.edu.uniandes.Pagos.Method");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:2248:3: ( (otherlv_11= 'SU' this_DOT_12= RULE_DOT ( (otherlv_13= RULE_ID ) ) this_DASH_14= RULE_DASH ( (otherlv_15= RULE_ID ) ) )? | (otherlv_16= 'SU' this_DOT_17= RULE_DOT ( (otherlv_18= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_method_20_0= ruleMethod ) ) )? )
                    {
                    // InternalPagos.g:2248:3: ( (otherlv_11= 'SU' this_DOT_12= RULE_DOT ( (otherlv_13= RULE_ID ) ) this_DASH_14= RULE_DASH ( (otherlv_15= RULE_ID ) ) )? | (otherlv_16= 'SU' this_DOT_17= RULE_DOT ( (otherlv_18= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_method_20_0= ruleMethod ) ) )? )
                    int alt30=2;
                    alt30 = dfa30.predict(input);
                    switch (alt30) {
                        case 1 :
                            // InternalPagos.g:2249:4: (otherlv_11= 'SU' this_DOT_12= RULE_DOT ( (otherlv_13= RULE_ID ) ) this_DASH_14= RULE_DASH ( (otherlv_15= RULE_ID ) ) )?
                            {
                            // InternalPagos.g:2249:4: (otherlv_11= 'SU' this_DOT_12= RULE_DOT ( (otherlv_13= RULE_ID ) ) this_DASH_14= RULE_DASH ( (otherlv_15= RULE_ID ) ) )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==46) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // InternalPagos.g:2250:5: otherlv_11= 'SU' this_DOT_12= RULE_DOT ( (otherlv_13= RULE_ID ) ) this_DASH_14= RULE_DASH ( (otherlv_15= RULE_ID ) )
                                    {
                                    otherlv_11=(Token)match(input,46,FOLLOW_40); 

                                    					newLeafNode(otherlv_11, grammarAccess.getTerminalValueAccess().getSUKeyword_1_0_0());
                                    				
                                    this_DOT_12=(Token)match(input,RULE_DOT,FOLLOW_5); 

                                    					newLeafNode(this_DOT_12, grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_1_0_1());
                                    				
                                    // InternalPagos.g:2258:5: ( (otherlv_13= RULE_ID ) )
                                    // InternalPagos.g:2259:6: (otherlv_13= RULE_ID )
                                    {
                                    // InternalPagos.g:2259:6: (otherlv_13= RULE_ID )
                                    // InternalPagos.g:2260:7: otherlv_13= RULE_ID
                                    {

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getTerminalValueRule());
                                    							}
                                    						
                                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_41); 

                                    							newLeafNode(otherlv_13, grammarAccess.getTerminalValueAccess().getParentSuperEntityCrossReference_1_0_2_0());
                                    						

                                    }


                                    }

                                    this_DASH_14=(Token)match(input,RULE_DASH,FOLLOW_5); 

                                    					newLeafNode(this_DASH_14, grammarAccess.getTerminalValueAccess().getDASHTerminalRuleCall_1_0_3());
                                    				
                                    // InternalPagos.g:2275:5: ( (otherlv_15= RULE_ID ) )
                                    // InternalPagos.g:2276:6: (otherlv_15= RULE_ID )
                                    {
                                    // InternalPagos.g:2276:6: (otherlv_15= RULE_ID )
                                    // InternalPagos.g:2277:7: otherlv_15= RULE_ID
                                    {

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getTerminalValueRule());
                                    							}
                                    						
                                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_2); 

                                    							newLeafNode(otherlv_15, grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_1_0_4_0());
                                    						

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalPagos.g:2290:4: (otherlv_16= 'SU' this_DOT_17= RULE_DOT ( (otherlv_18= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_method_20_0= ruleMethod ) ) )?
                            {
                            // InternalPagos.g:2290:4: (otherlv_16= 'SU' this_DOT_17= RULE_DOT ( (otherlv_18= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_method_20_0= ruleMethod ) ) )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==46) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // InternalPagos.g:2291:5: otherlv_16= 'SU' this_DOT_17= RULE_DOT ( (otherlv_18= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_method_20_0= ruleMethod ) )
                                    {
                                    otherlv_16=(Token)match(input,46,FOLLOW_40); 

                                    					newLeafNode(otherlv_16, grammarAccess.getTerminalValueAccess().getSUKeyword_1_1_0());
                                    				
                                    this_DOT_17=(Token)match(input,RULE_DOT,FOLLOW_5); 

                                    					newLeafNode(this_DOT_17, grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_1_1_1());
                                    				
                                    // InternalPagos.g:2299:5: ( (otherlv_18= RULE_ID ) )
                                    // InternalPagos.g:2300:6: (otherlv_18= RULE_ID )
                                    {
                                    // InternalPagos.g:2300:6: (otherlv_18= RULE_ID )
                                    // InternalPagos.g:2301:7: otherlv_18= RULE_ID
                                    {

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getTerminalValueRule());
                                    							}
                                    						
                                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_40); 

                                    							newLeafNode(otherlv_18, grammarAccess.getTerminalValueAccess().getParentSuperEntityCrossReference_1_1_2_0());
                                    						

                                    }


                                    }

                                    this_DOT_19=(Token)match(input,RULE_DOT,FOLLOW_42); 

                                    					newLeafNode(this_DOT_19, grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_1_1_3());
                                    				
                                    // InternalPagos.g:2316:5: ( (lv_method_20_0= ruleMethod ) )
                                    // InternalPagos.g:2317:6: (lv_method_20_0= ruleMethod )
                                    {
                                    // InternalPagos.g:2317:6: (lv_method_20_0= ruleMethod )
                                    // InternalPagos.g:2318:7: lv_method_20_0= ruleMethod
                                    {

                                    							newCompositeNode(grammarAccess.getTerminalValueAccess().getMethodMethodParserRuleCall_1_1_4_0());
                                    						
                                    pushFollow(FOLLOW_2);
                                    lv_method_20_0=ruleMethod();

                                    state._fsp--;


                                    							if (current==null) {
                                    								current = createModelElementForParent(grammarAccess.getTerminalValueRule());
                                    							}
                                    							set(
                                    								current,
                                    								"method",
                                    								lv_method_20_0,
                                    								"co.edu.uniandes.Pagos.Method");
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalPagos.g:2338:3: ( (otherlv_21= 'IT' this_DOT_22= RULE_DOT ( (otherlv_23= RULE_ID ) ) this_DASH_24= RULE_DASH ( (otherlv_25= RULE_ID ) ) )? | (otherlv_26= 'IT' this_DOT_27= RULE_DOT ( (otherlv_28= RULE_ID ) ) this_DOT_29= RULE_DOT ( (lv_method_30_0= ruleMethod ) ) ) )
                    {
                    // InternalPagos.g:2338:3: ( (otherlv_21= 'IT' this_DOT_22= RULE_DOT ( (otherlv_23= RULE_ID ) ) this_DASH_24= RULE_DASH ( (otherlv_25= RULE_ID ) ) )? | (otherlv_26= 'IT' this_DOT_27= RULE_DOT ( (otherlv_28= RULE_ID ) ) this_DOT_29= RULE_DOT ( (lv_method_30_0= ruleMethod ) ) ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==47) ) {
                        int LA32_1 = input.LA(2);

                        if ( (LA32_1==RULE_DOT) ) {
                            int LA32_3 = input.LA(3);

                            if ( (LA32_3==RULE_ID) ) {
                                int LA32_4 = input.LA(4);

                                if ( (LA32_4==RULE_DASH) ) {
                                    alt32=1;
                                }
                                else if ( (LA32_4==RULE_DOT) ) {
                                    alt32=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 32, 4, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA32_0==EOF||LA32_0==RULE_RBRACE||LA32_0==RULE_RBRACKET||(LA32_0>=RULE_OPERADORLOGICO && LA32_0<=RULE_MULTOP)||LA32_0==RULE_INDEX||LA32_0==43) ) {
                        alt32=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalPagos.g:2339:4: (otherlv_21= 'IT' this_DOT_22= RULE_DOT ( (otherlv_23= RULE_ID ) ) this_DASH_24= RULE_DASH ( (otherlv_25= RULE_ID ) ) )?
                            {
                            // InternalPagos.g:2339:4: (otherlv_21= 'IT' this_DOT_22= RULE_DOT ( (otherlv_23= RULE_ID ) ) this_DASH_24= RULE_DASH ( (otherlv_25= RULE_ID ) ) )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==47) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // InternalPagos.g:2340:5: otherlv_21= 'IT' this_DOT_22= RULE_DOT ( (otherlv_23= RULE_ID ) ) this_DASH_24= RULE_DASH ( (otherlv_25= RULE_ID ) )
                                    {
                                    otherlv_21=(Token)match(input,47,FOLLOW_40); 

                                    					newLeafNode(otherlv_21, grammarAccess.getTerminalValueAccess().getITKeyword_2_0_0());
                                    				
                                    this_DOT_22=(Token)match(input,RULE_DOT,FOLLOW_5); 

                                    					newLeafNode(this_DOT_22, grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_2_0_1());
                                    				
                                    // InternalPagos.g:2348:5: ( (otherlv_23= RULE_ID ) )
                                    // InternalPagos.g:2349:6: (otherlv_23= RULE_ID )
                                    {
                                    // InternalPagos.g:2349:6: (otherlv_23= RULE_ID )
                                    // InternalPagos.g:2350:7: otherlv_23= RULE_ID
                                    {

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getTerminalValueRule());
                                    							}
                                    						
                                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_41); 

                                    							newLeafNode(otherlv_23, grammarAccess.getTerminalValueAccess().getParentInformationTemplateCrossReference_2_0_2_0());
                                    						

                                    }


                                    }

                                    this_DASH_24=(Token)match(input,RULE_DASH,FOLLOW_5); 

                                    					newLeafNode(this_DASH_24, grammarAccess.getTerminalValueAccess().getDASHTerminalRuleCall_2_0_3());
                                    				
                                    // InternalPagos.g:2365:5: ( (otherlv_25= RULE_ID ) )
                                    // InternalPagos.g:2366:6: (otherlv_25= RULE_ID )
                                    {
                                    // InternalPagos.g:2366:6: (otherlv_25= RULE_ID )
                                    // InternalPagos.g:2367:7: otherlv_25= RULE_ID
                                    {

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getTerminalValueRule());
                                    							}
                                    						
                                    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_2); 

                                    							newLeafNode(otherlv_25, grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_2_0_4_0());
                                    						

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalPagos.g:2380:4: (otherlv_26= 'IT' this_DOT_27= RULE_DOT ( (otherlv_28= RULE_ID ) ) this_DOT_29= RULE_DOT ( (lv_method_30_0= ruleMethod ) ) )
                            {
                            // InternalPagos.g:2380:4: (otherlv_26= 'IT' this_DOT_27= RULE_DOT ( (otherlv_28= RULE_ID ) ) this_DOT_29= RULE_DOT ( (lv_method_30_0= ruleMethod ) ) )
                            // InternalPagos.g:2381:5: otherlv_26= 'IT' this_DOT_27= RULE_DOT ( (otherlv_28= RULE_ID ) ) this_DOT_29= RULE_DOT ( (lv_method_30_0= ruleMethod ) )
                            {
                            otherlv_26=(Token)match(input,47,FOLLOW_40); 

                            					newLeafNode(otherlv_26, grammarAccess.getTerminalValueAccess().getITKeyword_2_1_0());
                            				
                            this_DOT_27=(Token)match(input,RULE_DOT,FOLLOW_5); 

                            					newLeafNode(this_DOT_27, grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_2_1_1());
                            				
                            // InternalPagos.g:2389:5: ( (otherlv_28= RULE_ID ) )
                            // InternalPagos.g:2390:6: (otherlv_28= RULE_ID )
                            {
                            // InternalPagos.g:2390:6: (otherlv_28= RULE_ID )
                            // InternalPagos.g:2391:7: otherlv_28= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTerminalValueRule());
                            							}
                            						
                            otherlv_28=(Token)match(input,RULE_ID,FOLLOW_40); 

                            							newLeafNode(otherlv_28, grammarAccess.getTerminalValueAccess().getParentInformationTemplateCrossReference_2_1_2_0());
                            						

                            }


                            }

                            this_DOT_29=(Token)match(input,RULE_DOT,FOLLOW_42); 

                            					newLeafNode(this_DOT_29, grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_2_1_3());
                            				
                            // InternalPagos.g:2406:5: ( (lv_method_30_0= ruleMethod ) )
                            // InternalPagos.g:2407:6: (lv_method_30_0= ruleMethod )
                            {
                            // InternalPagos.g:2407:6: (lv_method_30_0= ruleMethod )
                            // InternalPagos.g:2408:7: lv_method_30_0= ruleMethod
                            {

                            							newCompositeNode(grammarAccess.getTerminalValueAccess().getMethodMethodParserRuleCall_2_1_4_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_method_30_0=ruleMethod();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTerminalValueRule());
                            							}
                            							set(
                            								current,
                            								"method",
                            								lv_method_30_0,
                            								"co.edu.uniandes.Pagos.Method");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalPagos.g:2428:3: (otherlv_31= 'FU' this_DOT_32= RULE_DOT ( (otherlv_33= RULE_ID ) ) )?
                    {
                    // InternalPagos.g:2428:3: (otherlv_31= 'FU' this_DOT_32= RULE_DOT ( (otherlv_33= RULE_ID ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==48) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalPagos.g:2429:4: otherlv_31= 'FU' this_DOT_32= RULE_DOT ( (otherlv_33= RULE_ID ) )
                            {
                            otherlv_31=(Token)match(input,48,FOLLOW_40); 

                            				newLeafNode(otherlv_31, grammarAccess.getTerminalValueAccess().getFUKeyword_3_0());
                            			
                            this_DOT_32=(Token)match(input,RULE_DOT,FOLLOW_5); 

                            				newLeafNode(this_DOT_32, grammarAccess.getTerminalValueAccess().getDOTTerminalRuleCall_3_1());
                            			
                            // InternalPagos.g:2437:4: ( (otherlv_33= RULE_ID ) )
                            // InternalPagos.g:2438:5: (otherlv_33= RULE_ID )
                            {
                            // InternalPagos.g:2438:5: (otherlv_33= RULE_ID )
                            // InternalPagos.g:2439:6: otherlv_33= RULE_ID
                            {

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTerminalValueRule());
                            						}
                            					
                            otherlv_33=(Token)match(input,RULE_ID,FOLLOW_2); 

                            						newLeafNode(otherlv_33, grammarAccess.getTerminalValueAccess().getParentCalculationTemplateCrossReference_3_2_0());
                            					

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // InternalPagos.g:2452:3: ( (lv_valor_34_0= ruleNumber ) )
                    {
                    // InternalPagos.g:2452:3: ( (lv_valor_34_0= ruleNumber ) )
                    // InternalPagos.g:2453:4: (lv_valor_34_0= ruleNumber )
                    {
                    // InternalPagos.g:2453:4: (lv_valor_34_0= ruleNumber )
                    // InternalPagos.g:2454:5: lv_valor_34_0= ruleNumber
                    {

                    					newCompositeNode(grammarAccess.getTerminalValueAccess().getValorNumberParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_valor_34_0=ruleNumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTerminalValueRule());
                    					}
                    					set(
                    						current,
                    						"valor",
                    						lv_valor_34_0,
                    						"co.edu.uniandes.Pagos.Number");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalValue"


    // $ANTLR start "entryRuleMethod"
    // InternalPagos.g:2475:1: entryRuleMethod returns [String current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final String entryRuleMethod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethod = null;


        try {
            // InternalPagos.g:2475:46: (iv_ruleMethod= ruleMethod EOF )
            // InternalPagos.g:2476:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalPagos.g:2482:1: ruleMethod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'size()' | kw= 'getCantidadDiasHabiles()' | kw= 'getRiegoTabla2()' ) ;
    public final AntlrDatatypeRuleToken ruleMethod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPagos.g:2488:2: ( (kw= 'size()' | kw= 'getCantidadDiasHabiles()' | kw= 'getRiegoTabla2()' ) )
            // InternalPagos.g:2489:2: (kw= 'size()' | kw= 'getCantidadDiasHabiles()' | kw= 'getRiegoTabla2()' )
            {
            // InternalPagos.g:2489:2: (kw= 'size()' | kw= 'getCantidadDiasHabiles()' | kw= 'getRiegoTabla2()' )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt35=1;
                }
                break;
            case 50:
                {
                alt35=2;
                }
                break;
            case 51:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalPagos.g:2490:3: kw= 'size()'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMethodAccess().getSizeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPagos.g:2496:3: kw= 'getCantidadDiasHabiles()'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMethodAccess().getGetCantidadDiasHabilesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPagos.g:2502:3: kw= 'getRiegoTabla2()'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMethodAccess().getGetRiegoTabla2Keyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleNumber"
    // InternalPagos.g:2511:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalPagos.g:2511:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalPagos.g:2512:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalPagos.g:2518:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EDouble_0= ruleEDouble | this_Integer_1= ruleInteger ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EDouble_0 = null;

        AntlrDatatypeRuleToken this_Integer_1 = null;



        	enterRule();

        try {
            // InternalPagos.g:2524:2: ( (this_EDouble_0= ruleEDouble | this_Integer_1= ruleInteger ) )
            // InternalPagos.g:2525:2: (this_EDouble_0= ruleEDouble | this_Integer_1= ruleInteger )
            {
            // InternalPagos.g:2525:2: (this_EDouble_0= ruleEDouble | this_Integer_1= ruleInteger )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==EOF||LA36_1==RULE_RBRACE||LA36_1==RULE_RBRACKET||(LA36_1>=RULE_OPERADORLOGICO && LA36_1<=RULE_MULTOP)||LA36_1==RULE_INDEX||LA36_1==43) ) {
                    alt36=2;
                }
                else if ( (LA36_1==RULE_DOT) ) {
                    alt36=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA36_0==RULE_DOT) ) {
                alt36=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalPagos.g:2526:3: this_EDouble_0= ruleEDouble
                    {

                    			newCompositeNode(grammarAccess.getNumberAccess().getEDoubleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EDouble_0=ruleEDouble();

                    state._fsp--;


                    			current.merge(this_EDouble_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPagos.g:2537:3: this_Integer_1= ruleInteger
                    {

                    			newCompositeNode(grammarAccess.getNumberAccess().getIntegerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Integer_1=ruleInteger();

                    state._fsp--;


                    			current.merge(this_Integer_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleEDouble"
    // InternalPagos.g:2551:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalPagos.g:2551:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalPagos.g:2552:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalPagos.g:2558:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? this_DOT_1= RULE_DOT this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DOT_1=null;
        Token this_INT_2=null;
        Token kw=null;
        Token this_INT_5=null;


        	enterRule();

        try {
            // InternalPagos.g:2564:2: ( ( (this_INT_0= RULE_INT )? this_DOT_1= RULE_DOT this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? ) )
            // InternalPagos.g:2565:2: ( (this_INT_0= RULE_INT )? this_DOT_1= RULE_DOT this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? )
            {
            // InternalPagos.g:2565:2: ( (this_INT_0= RULE_INT )? this_DOT_1= RULE_DOT this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? )
            // InternalPagos.g:2566:3: (this_INT_0= RULE_INT )? this_DOT_1= RULE_DOT this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )?
            {
            // InternalPagos.g:2566:3: (this_INT_0= RULE_INT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPagos.g:2567:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_40); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_43); 

            			current.merge(this_DOT_1);
            		

            			newLeafNode(this_DOT_1, grammarAccess.getEDoubleAccess().getDOTTerminalRuleCall_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_44); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2());
            		
            // InternalPagos.g:2589:3: ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=52 && LA39_0<=53)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPagos.g:2590:4: (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT
                    {
                    // InternalPagos.g:2590:4: (kw= 'E' | kw= 'e' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==52) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==53) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalPagos.g:2591:5: kw= 'E'
                            {
                            kw=(Token)match(input,52,FOLLOW_43); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPagos.g:2597:5: kw= 'e'
                            {
                            kw=(Token)match(input,53,FOLLOW_43); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_5);
                    			

                    				newLeafNode(this_INT_5, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleInteger"
    // InternalPagos.g:2615:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalPagos.g:2615:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalPagos.g:2616:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalPagos.g:2622:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPagos.g:2628:2: (this_INT_0= RULE_INT )
            // InternalPagos.g:2629:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getIntegerAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"

    // Delegated rules


    protected DFA34 dfa34 = new DFA34(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\6\16\uffff";
    static final String dfa_3s = "\1\60\16\uffff";
    static final String dfa_4s = "\1\uffff\1\1\12\2\1\3\1\4\1\5";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\11\1\uffff\1\5\5\uffff\1\3\1\4\1\10\1\7\1\uffff\1\13\1\16\1\uffff\1\16\22\uffff\1\12\1\uffff\1\1\1\2\1\14\1\15",
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
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_6s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2146:2: ( ( () ( ( (otherlv_1= 'PA' this_DOT_2= RULE_DOT ( (otherlv_3= RULE_ID ) ) this_DASH_4= RULE_DASH )? ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'PA' this_DOT_7= RULE_DOT ( (otherlv_8= RULE_ID ) ) this_DOT_9= RULE_DOT ( (lv_method_10_0= ruleMethod ) ) ) ) ) | ( (otherlv_11= 'SU' this_DOT_12= RULE_DOT ( (otherlv_13= RULE_ID ) ) this_DASH_14= RULE_DASH ( (otherlv_15= RULE_ID ) ) )? | (otherlv_16= 'SU' this_DOT_17= RULE_DOT ( (otherlv_18= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_method_20_0= ruleMethod ) ) )? ) | ( (otherlv_21= 'IT' this_DOT_22= RULE_DOT ( (otherlv_23= RULE_ID ) ) this_DASH_24= RULE_DASH ( (otherlv_25= RULE_ID ) ) )? | (otherlv_26= 'IT' this_DOT_27= RULE_DOT ( (otherlv_28= RULE_ID ) ) this_DOT_29= RULE_DOT ( (lv_method_30_0= ruleMethod ) ) ) ) | (otherlv_31= 'FU' this_DOT_32= RULE_DOT ( (otherlv_33= RULE_ID ) ) )? | ( (lv_valor_34_0= ruleNumber ) ) )";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\5\15\uffff";
    static final String dfa_9s = "\1\10\1\26\11\uffff\1\6\1\26\1\uffff";
    static final String dfa_10s = "\1\56\1\26\11\uffff\1\6\1\27\1\uffff";
    static final String dfa_11s = "\2\uffff\11\1\2\uffff\1\2";
    static final String dfa_12s = "\16\uffff}>";
    static final String[] dfa_13s = {
            "\1\10\1\uffff\1\4\5\uffff\1\2\1\3\1\7\1\6\1\uffff\1\12\25\uffff\1\11\2\uffff\1\1",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_13s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2248:3: ( (otherlv_11= 'SU' this_DOT_12= RULE_DOT ( (otherlv_13= RULE_ID ) ) this_DASH_14= RULE_DASH ( (otherlv_15= RULE_ID ) ) )? | (otherlv_16= 'SU' this_DOT_17= RULE_DOT ( (otherlv_18= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_method_20_0= ruleMethod ) ) )? )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000000A100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001E00001410040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001E40001400040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001E00001430840L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000200100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000200100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0030000000000002L});

}