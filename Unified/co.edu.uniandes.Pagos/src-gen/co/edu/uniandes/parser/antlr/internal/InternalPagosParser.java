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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LBRACE", "RULE_COLON", "RULE_ID", "RULE_COMMA", "RULE_RBRACE", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_STRING", "RULE_ELSE", "RULE_IF", "RULE_THEN", "RULE_RETURN", "RULE_OPERADORLOGICO", "RULE_LOGICALCONN", "RULE_ADDOP", "RULE_MULTOP", "RULE_TYPE", "RULE_INT", "RULE_DASH", "RULE_STR_ESC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'intermediary'", "'superentities'", "'description'", "'attributes'", "'entities'", "'InformationTemplate'", "'FormAttributes'", "'calculationtemplates'", "'providers'", "'calculationattributes'", "'calculationrules'", "'('", "')'", "':='", "'.'", "'E'", "'e'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_RETURN=15;
    public static final int RULE_COMMA=7;
    public static final int RULE_THEN=14;
    public static final int RULE_COLON=5;
    public static final int RULE_LOGICALCONN=17;
    public static final int RULE_TYPE=20;
    public static final int RULE_STR_ESC=23;
    public static final int T__28=28;
    public static final int RULE_INT=21;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=24;
    public static final int RULE_ELSE=12;
    public static final int RULE_LBRACKET=9;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=25;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_DASH=22;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_IF=13;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_LBRACE=4;
    public static final int RULE_WS=26;
    public static final int RULE_OPERADORLOGICO=16;
    public static final int RULE_ADDOP=18;
    public static final int RULE_ANY_OTHER=27;
    public static final int RULE_RBRACE=8;
    public static final int T__44=44;
    public static final int RULE_MULTOP=19;
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
            		
            otherlv_1=(Token)match(input,28,FOLLOW_4); 

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
            		
            otherlv_5=(Token)match(input,29,FOLLOW_4); 

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
            		
            otherlv_2=(Token)match(input,28,FOLLOW_4); 

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
            		
            otherlv_6=(Token)match(input,30,FOLLOW_4); 

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
            		
            otherlv_2=(Token)match(input,28,FOLLOW_4); 

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
            		
            otherlv_6=(Token)match(input,31,FOLLOW_4); 

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
            		
            otherlv_10=(Token)match(input,32,FOLLOW_4); 

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
            		
            otherlv_18=(Token)match(input,33,FOLLOW_4); 

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
            		
            otherlv_2=(Token)match(input,28,FOLLOW_4); 

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
            		
            otherlv_6=(Token)match(input,31,FOLLOW_4); 

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
            		
            otherlv_10=(Token)match(input,32,FOLLOW_4); 

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
                    			
                    otherlv_19=(Token)match(input,34,FOLLOW_4); 

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
            		
            otherlv_2=(Token)match(input,28,FOLLOW_4); 

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
            		
            otherlv_6=(Token)match(input,31,FOLLOW_4); 

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
            		
            otherlv_10=(Token)match(input,32,FOLLOW_4); 

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
    // InternalPagos.g:871:1: ruleInformationTemplate returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'FormAttributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templates_22_0= ruleCalculationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templates_24_0= ruleCalculationTemplate ) ) )* this_RBRACKET_25= RULE_RBRACKET )? (this_COMMA_26= RULE_COMMA otherlv_27= 'providers' this_COLON_28= RULE_COLON this_LBRACKET_29= RULE_LBRACKET ( (lv_providers_30_0= ruleProvider ) ) (this_COMMA_31= RULE_COMMA ( (lv_providers_32_0= ruleProvider ) ) )* this_RBRACKET_33= RULE_RBRACKET )? ) ;
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
        Token this_COLON_20=null;
        Token this_LBRACKET_21=null;
        Token this_COMMA_23=null;
        Token this_RBRACKET_25=null;
        Token this_COMMA_26=null;
        Token otherlv_27=null;
        Token this_COLON_28=null;
        Token this_LBRACKET_29=null;
        Token this_COMMA_31=null;
        Token this_RBRACKET_33=null;
        EObject lv_attLists_13_0 = null;

        EObject lv_attLists_15_0 = null;

        EObject lv_templates_22_0 = null;

        EObject lv_templates_24_0 = null;

        EObject lv_providers_30_0 = null;

        EObject lv_providers_32_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:877:2: ( ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'FormAttributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templates_22_0= ruleCalculationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templates_24_0= ruleCalculationTemplate ) ) )* this_RBRACKET_25= RULE_RBRACKET )? (this_COMMA_26= RULE_COMMA otherlv_27= 'providers' this_COLON_28= RULE_COLON this_LBRACKET_29= RULE_LBRACKET ( (lv_providers_30_0= ruleProvider ) ) (this_COMMA_31= RULE_COMMA ( (lv_providers_32_0= ruleProvider ) ) )* this_RBRACKET_33= RULE_RBRACKET )? ) )
            // InternalPagos.g:878:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'FormAttributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templates_22_0= ruleCalculationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templates_24_0= ruleCalculationTemplate ) ) )* this_RBRACKET_25= RULE_RBRACKET )? (this_COMMA_26= RULE_COMMA otherlv_27= 'providers' this_COLON_28= RULE_COLON this_LBRACKET_29= RULE_LBRACKET ( (lv_providers_30_0= ruleProvider ) ) (this_COMMA_31= RULE_COMMA ( (lv_providers_32_0= ruleProvider ) ) )* this_RBRACKET_33= RULE_RBRACKET )? )
            {
            // InternalPagos.g:878:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'FormAttributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templates_22_0= ruleCalculationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templates_24_0= ruleCalculationTemplate ) ) )* this_RBRACKET_25= RULE_RBRACKET )? (this_COMMA_26= RULE_COMMA otherlv_27= 'providers' this_COLON_28= RULE_COLON this_LBRACKET_29= RULE_LBRACKET ( (lv_providers_30_0= ruleProvider ) ) (this_COMMA_31= RULE_COMMA ( (lv_providers_32_0= ruleProvider ) ) )* this_RBRACKET_33= RULE_RBRACKET )? )
            // InternalPagos.g:879:3: () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'FormAttributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templates_22_0= ruleCalculationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templates_24_0= ruleCalculationTemplate ) ) )* this_RBRACKET_25= RULE_RBRACKET )? (this_COMMA_26= RULE_COMMA otherlv_27= 'providers' this_COLON_28= RULE_COLON this_LBRACKET_29= RULE_LBRACKET ( (lv_providers_30_0= ruleProvider ) ) (this_COMMA_31= RULE_COMMA ( (lv_providers_32_0= ruleProvider ) ) )* this_RBRACKET_33= RULE_RBRACKET )?
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
            		
            otherlv_2=(Token)match(input,28,FOLLOW_4); 

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
            		
            otherlv_6=(Token)match(input,31,FOLLOW_4); 

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
            		
            otherlv_10=(Token)match(input,35,FOLLOW_4); 

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
            		
            // InternalPagos.g:1014:3: (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templates_22_0= ruleCalculationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templates_24_0= ruleCalculationTemplate ) ) )* this_RBRACKET_25= RULE_RBRACKET )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_COMMA) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==36) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalPagos.g:1015:4: this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templates_22_0= ruleCalculationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templates_24_0= ruleCalculationTemplate ) ) )* this_RBRACKET_25= RULE_RBRACKET
                    {
                    this_COMMA_18=(Token)match(input,RULE_COMMA,FOLLOW_20); 

                    				newLeafNode(this_COMMA_18, grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_17_0());
                    			
                    otherlv_19=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getInformationTemplateAccess().getCalculationtemplatesKeyword_17_1());
                    			
                    this_COLON_20=(Token)match(input,RULE_COLON,FOLLOW_11); 

                    				newLeafNode(this_COLON_20, grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_17_2());
                    			
                    this_LBRACKET_21=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

                    				newLeafNode(this_LBRACKET_21, grammarAccess.getInformationTemplateAccess().getLBRACKETTerminalRuleCall_17_3());
                    			
                    // InternalPagos.g:1031:4: ( (lv_templates_22_0= ruleCalculationTemplate ) )
                    // InternalPagos.g:1032:5: (lv_templates_22_0= ruleCalculationTemplate )
                    {
                    // InternalPagos.g:1032:5: (lv_templates_22_0= ruleCalculationTemplate )
                    // InternalPagos.g:1033:6: lv_templates_22_0= ruleCalculationTemplate
                    {

                    						newCompositeNode(grammarAccess.getInformationTemplateAccess().getTemplatesCalculationTemplateParserRuleCall_17_4_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_templates_22_0=ruleCalculationTemplate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInformationTemplateRule());
                    						}
                    						add(
                    							current,
                    							"templates",
                    							lv_templates_22_0,
                    							"co.edu.uniandes.Pagos.CalculationTemplate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPagos.g:1050:4: (this_COMMA_23= RULE_COMMA ( (lv_templates_24_0= ruleCalculationTemplate ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_COMMA) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalPagos.g:1051:5: this_COMMA_23= RULE_COMMA ( (lv_templates_24_0= ruleCalculationTemplate ) )
                    	    {
                    	    this_COMMA_23=(Token)match(input,RULE_COMMA,FOLLOW_8); 

                    	    					newLeafNode(this_COMMA_23, grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_17_5_0());
                    	    				
                    	    // InternalPagos.g:1055:5: ( (lv_templates_24_0= ruleCalculationTemplate ) )
                    	    // InternalPagos.g:1056:6: (lv_templates_24_0= ruleCalculationTemplate )
                    	    {
                    	    // InternalPagos.g:1056:6: (lv_templates_24_0= ruleCalculationTemplate )
                    	    // InternalPagos.g:1057:7: lv_templates_24_0= ruleCalculationTemplate
                    	    {

                    	    							newCompositeNode(grammarAccess.getInformationTemplateAccess().getTemplatesCalculationTemplateParserRuleCall_17_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_templates_24_0=ruleCalculationTemplate();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInformationTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"templates",
                    	    								lv_templates_24_0,
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

                    this_RBRACKET_25=(Token)match(input,RULE_RBRACKET,FOLLOW_19); 

                    				newLeafNode(this_RBRACKET_25, grammarAccess.getInformationTemplateAccess().getRBRACKETTerminalRuleCall_17_6());
                    			

                    }
                    break;

            }

            // InternalPagos.g:1080:3: (this_COMMA_26= RULE_COMMA otherlv_27= 'providers' this_COLON_28= RULE_COLON this_LBRACKET_29= RULE_LBRACKET ( (lv_providers_30_0= ruleProvider ) ) (this_COMMA_31= RULE_COMMA ( (lv_providers_32_0= ruleProvider ) ) )* this_RBRACKET_33= RULE_RBRACKET )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_COMMA) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==37) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalPagos.g:1081:4: this_COMMA_26= RULE_COMMA otherlv_27= 'providers' this_COLON_28= RULE_COLON this_LBRACKET_29= RULE_LBRACKET ( (lv_providers_30_0= ruleProvider ) ) (this_COMMA_31= RULE_COMMA ( (lv_providers_32_0= ruleProvider ) ) )* this_RBRACKET_33= RULE_RBRACKET
                    {
                    this_COMMA_26=(Token)match(input,RULE_COMMA,FOLLOW_21); 

                    				newLeafNode(this_COMMA_26, grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_18_0());
                    			
                    otherlv_27=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_27, grammarAccess.getInformationTemplateAccess().getProvidersKeyword_18_1());
                    			
                    this_COLON_28=(Token)match(input,RULE_COLON,FOLLOW_11); 

                    				newLeafNode(this_COLON_28, grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_18_2());
                    			
                    this_LBRACKET_29=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

                    				newLeafNode(this_LBRACKET_29, grammarAccess.getInformationTemplateAccess().getLBRACKETTerminalRuleCall_18_3());
                    			
                    // InternalPagos.g:1097:4: ( (lv_providers_30_0= ruleProvider ) )
                    // InternalPagos.g:1098:5: (lv_providers_30_0= ruleProvider )
                    {
                    // InternalPagos.g:1098:5: (lv_providers_30_0= ruleProvider )
                    // InternalPagos.g:1099:6: lv_providers_30_0= ruleProvider
                    {

                    						newCompositeNode(grammarAccess.getInformationTemplateAccess().getProvidersProviderParserRuleCall_18_4_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_providers_30_0=ruleProvider();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInformationTemplateRule());
                    						}
                    						add(
                    							current,
                    							"providers",
                    							lv_providers_30_0,
                    							"co.edu.uniandes.Pagos.Provider");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPagos.g:1116:4: (this_COMMA_31= RULE_COMMA ( (lv_providers_32_0= ruleProvider ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalPagos.g:1117:5: this_COMMA_31= RULE_COMMA ( (lv_providers_32_0= ruleProvider ) )
                    	    {
                    	    this_COMMA_31=(Token)match(input,RULE_COMMA,FOLLOW_8); 

                    	    					newLeafNode(this_COMMA_31, grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_18_5_0());
                    	    				
                    	    // InternalPagos.g:1121:5: ( (lv_providers_32_0= ruleProvider ) )
                    	    // InternalPagos.g:1122:6: (lv_providers_32_0= ruleProvider )
                    	    {
                    	    // InternalPagos.g:1122:6: (lv_providers_32_0= ruleProvider )
                    	    // InternalPagos.g:1123:7: lv_providers_32_0= ruleProvider
                    	    {

                    	    							newCompositeNode(grammarAccess.getInformationTemplateAccess().getProvidersProviderParserRuleCall_18_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_providers_32_0=ruleProvider();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInformationTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providers",
                    	    								lv_providers_32_0,
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

                    this_RBRACKET_33=(Token)match(input,RULE_RBRACKET,FOLLOW_2); 

                    				newLeafNode(this_RBRACKET_33, grammarAccess.getInformationTemplateAccess().getRBRACKETTerminalRuleCall_18_6());
                    			

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
    // InternalPagos.g:1150:1: entryRuleCalculationTemplate returns [EObject current=null] : iv_ruleCalculationTemplate= ruleCalculationTemplate EOF ;
    public final EObject entryRuleCalculationTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculationTemplate = null;


        try {
            // InternalPagos.g:1150:60: (iv_ruleCalculationTemplate= ruleCalculationTemplate EOF )
            // InternalPagos.g:1151:2: iv_ruleCalculationTemplate= ruleCalculationTemplate EOF
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
    // InternalPagos.g:1157:1: ruleCalculationTemplate returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'calculationrules' this_COLON_19= RULE_COLON ( (lv_formulas_20_0= ruleFormula ) ) this_RBRACE_21= RULE_RBRACE ) ;
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
            // InternalPagos.g:1163:2: ( ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'calculationrules' this_COLON_19= RULE_COLON ( (lv_formulas_20_0= ruleFormula ) ) this_RBRACE_21= RULE_RBRACE ) )
            // InternalPagos.g:1164:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'calculationrules' this_COLON_19= RULE_COLON ( (lv_formulas_20_0= ruleFormula ) ) this_RBRACE_21= RULE_RBRACE )
            {
            // InternalPagos.g:1164:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'calculationrules' this_COLON_19= RULE_COLON ( (lv_formulas_20_0= ruleFormula ) ) this_RBRACE_21= RULE_RBRACE )
            // InternalPagos.g:1165:3: () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleBusinessAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'calculationrules' this_COLON_19= RULE_COLON ( (lv_formulas_20_0= ruleFormula ) ) this_RBRACE_21= RULE_RBRACE
            {
            // InternalPagos.g:1165:3: ()
            // InternalPagos.g:1166:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCalculationTemplateAccess().getCalculationTemplateAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_3); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getCalculationTemplateAccess().getLBRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCalculationTemplateAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalPagos.g:1184:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalPagos.g:1185:4: (lv_name_4_0= RULE_ID )
            {
            // InternalPagos.g:1185:4: (lv_name_4_0= RULE_ID )
            // InternalPagos.g:1186:5: lv_name_4_0= RULE_ID
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
            		
            otherlv_6=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getCalculationTemplateAccess().getDescriptionKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_14); 

            			newLeafNode(this_COLON_7, grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalPagos.g:1214:3: ( (lv_description_8_0= RULE_STRING ) )
            // InternalPagos.g:1215:4: (lv_description_8_0= RULE_STRING )
            {
            // InternalPagos.g:1215:4: (lv_description_8_0= RULE_STRING )
            // InternalPagos.g:1216:5: lv_description_8_0= RULE_STRING
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

            this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_22); 

            			newLeafNode(this_COMMA_9, grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_9());
            		
            otherlv_10=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getCalculationTemplateAccess().getCalculationattributesKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_11, grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_11());
            		
            this_LBRACKET_12=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

            			newLeafNode(this_LBRACKET_12, grammarAccess.getCalculationTemplateAccess().getLBRACKETTerminalRuleCall_12());
            		
            // InternalPagos.g:1248:3: ( (lv_attLists_13_0= ruleBusinessAttribute ) )
            // InternalPagos.g:1249:4: (lv_attLists_13_0= ruleBusinessAttribute )
            {
            // InternalPagos.g:1249:4: (lv_attLists_13_0= ruleBusinessAttribute )
            // InternalPagos.g:1250:5: lv_attLists_13_0= ruleBusinessAttribute
            {

            					newCompositeNode(grammarAccess.getCalculationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_13_0());
            				
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

            // InternalPagos.g:1267:3: (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPagos.g:1268:4: this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleBusinessAttribute ) )
            	    {
            	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_14, grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_14_0());
            	    			
            	    // InternalPagos.g:1272:4: ( (lv_attLists_15_0= ruleBusinessAttribute ) )
            	    // InternalPagos.g:1273:5: (lv_attLists_15_0= ruleBusinessAttribute )
            	    {
            	    // InternalPagos.g:1273:5: (lv_attLists_15_0= ruleBusinessAttribute )
            	    // InternalPagos.g:1274:6: lv_attLists_15_0= ruleBusinessAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getCalculationTemplateAccess().getAttListsBusinessAttributeParserRuleCall_14_1_0());
            	    					
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

            			newLeafNode(this_RBRACKET_16, grammarAccess.getCalculationTemplateAccess().getRBRACKETTerminalRuleCall_15());
            		
            this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_23); 

            			newLeafNode(this_COMMA_17, grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_16());
            		
            otherlv_18=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getCalculationTemplateAccess().getCalculationrulesKeyword_17());
            		
            this_COLON_19=(Token)match(input,RULE_COLON,FOLLOW_24); 

            			newLeafNode(this_COLON_19, grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_18());
            		
            // InternalPagos.g:1308:3: ( (lv_formulas_20_0= ruleFormula ) )
            // InternalPagos.g:1309:4: (lv_formulas_20_0= ruleFormula )
            {
            // InternalPagos.g:1309:4: (lv_formulas_20_0= ruleFormula )
            // InternalPagos.g:1310:5: lv_formulas_20_0= ruleFormula
            {

            					newCompositeNode(grammarAccess.getCalculationTemplateAccess().getFormulasFormulaParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_9);
            lv_formulas_20_0=ruleFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalculationTemplateRule());
            					}
            					add(
            						current,
            						"formulas",
            						lv_formulas_20_0,
            						"co.edu.uniandes.Pagos.Formula");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RBRACE_21=(Token)match(input,RULE_RBRACE,FOLLOW_2); 

            			newLeafNode(this_RBRACE_21, grammarAccess.getCalculationTemplateAccess().getRBRACETerminalRuleCall_20());
            		

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
    // InternalPagos.g:1335:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalPagos.g:1335:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalPagos.g:1336:2: iv_ruleFormula= ruleFormula EOF
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
    // InternalPagos.g:1342:1: ruleFormula returns [EObject current=null] : ( ( () ( (lv_formulaBody_1_0= ruleIfBlock ) )* ) | ( (lv_formulaReturn_2_0= ruleReturnBlock ) ) ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        EObject lv_formulaBody_1_0 = null;

        EObject lv_formulaReturn_2_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1348:2: ( ( ( () ( (lv_formulaBody_1_0= ruleIfBlock ) )* ) | ( (lv_formulaReturn_2_0= ruleReturnBlock ) ) ) )
            // InternalPagos.g:1349:2: ( ( () ( (lv_formulaBody_1_0= ruleIfBlock ) )* ) | ( (lv_formulaReturn_2_0= ruleReturnBlock ) ) )
            {
            // InternalPagos.g:1349:2: ( ( () ( (lv_formulaBody_1_0= ruleIfBlock ) )* ) | ( (lv_formulaReturn_2_0= ruleReturnBlock ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EOF||LA15_0==RULE_RBRACE||LA15_0==RULE_IF) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_RETURN) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalPagos.g:1350:3: ( () ( (lv_formulaBody_1_0= ruleIfBlock ) )* )
                    {
                    // InternalPagos.g:1350:3: ( () ( (lv_formulaBody_1_0= ruleIfBlock ) )* )
                    // InternalPagos.g:1351:4: () ( (lv_formulaBody_1_0= ruleIfBlock ) )*
                    {
                    // InternalPagos.g:1351:4: ()
                    // InternalPagos.g:1352:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFormulaAccess().getFormulaAction_0_0(),
                    						current);
                    				

                    }

                    // InternalPagos.g:1358:4: ( (lv_formulaBody_1_0= ruleIfBlock ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_IF) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalPagos.g:1359:5: (lv_formulaBody_1_0= ruleIfBlock )
                    	    {
                    	    // InternalPagos.g:1359:5: (lv_formulaBody_1_0= ruleIfBlock )
                    	    // InternalPagos.g:1360:6: lv_formulaBody_1_0= ruleIfBlock
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
                    	    break loop14;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:1379:3: ( (lv_formulaReturn_2_0= ruleReturnBlock ) )
                    {
                    // InternalPagos.g:1379:3: ( (lv_formulaReturn_2_0= ruleReturnBlock ) )
                    // InternalPagos.g:1380:4: (lv_formulaReturn_2_0= ruleReturnBlock )
                    {
                    // InternalPagos.g:1380:4: (lv_formulaReturn_2_0= ruleReturnBlock )
                    // InternalPagos.g:1381:5: lv_formulaReturn_2_0= ruleReturnBlock
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
    // InternalPagos.g:1402:1: entryRuleIfBlock returns [EObject current=null] : iv_ruleIfBlock= ruleIfBlock EOF ;
    public final EObject entryRuleIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfBlock = null;


        try {
            // InternalPagos.g:1402:48: (iv_ruleIfBlock= ruleIfBlock EOF )
            // InternalPagos.g:1403:2: iv_ruleIfBlock= ruleIfBlock EOF
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
    // InternalPagos.g:1409:1: ruleIfBlock returns [EObject current=null] : ( () ( (lv_ifSentence_1_0= ruleIfCondition ) ) (this_ELSE_2= RULE_ELSE ( (lv_elseSentence_3_0= ruleElseSegment ) ) )? ) ;
    public final EObject ruleIfBlock() throws RecognitionException {
        EObject current = null;

        Token this_ELSE_2=null;
        EObject lv_ifSentence_1_0 = null;

        EObject lv_elseSentence_3_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1415:2: ( ( () ( (lv_ifSentence_1_0= ruleIfCondition ) ) (this_ELSE_2= RULE_ELSE ( (lv_elseSentence_3_0= ruleElseSegment ) ) )? ) )
            // InternalPagos.g:1416:2: ( () ( (lv_ifSentence_1_0= ruleIfCondition ) ) (this_ELSE_2= RULE_ELSE ( (lv_elseSentence_3_0= ruleElseSegment ) ) )? )
            {
            // InternalPagos.g:1416:2: ( () ( (lv_ifSentence_1_0= ruleIfCondition ) ) (this_ELSE_2= RULE_ELSE ( (lv_elseSentence_3_0= ruleElseSegment ) ) )? )
            // InternalPagos.g:1417:3: () ( (lv_ifSentence_1_0= ruleIfCondition ) ) (this_ELSE_2= RULE_ELSE ( (lv_elseSentence_3_0= ruleElseSegment ) ) )?
            {
            // InternalPagos.g:1417:3: ()
            // InternalPagos.g:1418:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfBlockAccess().getIfBlockAction_0(),
            					current);
            			

            }

            // InternalPagos.g:1424:3: ( (lv_ifSentence_1_0= ruleIfCondition ) )
            // InternalPagos.g:1425:4: (lv_ifSentence_1_0= ruleIfCondition )
            {
            // InternalPagos.g:1425:4: (lv_ifSentence_1_0= ruleIfCondition )
            // InternalPagos.g:1426:5: lv_ifSentence_1_0= ruleIfCondition
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

            // InternalPagos.g:1443:3: (this_ELSE_2= RULE_ELSE ( (lv_elseSentence_3_0= ruleElseSegment ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ELSE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPagos.g:1444:4: this_ELSE_2= RULE_ELSE ( (lv_elseSentence_3_0= ruleElseSegment ) )
                    {
                    this_ELSE_2=(Token)match(input,RULE_ELSE,FOLLOW_8); 

                    				newLeafNode(this_ELSE_2, grammarAccess.getIfBlockAccess().getELSETerminalRuleCall_2_0());
                    			
                    // InternalPagos.g:1448:4: ( (lv_elseSentence_3_0= ruleElseSegment ) )
                    // InternalPagos.g:1449:5: (lv_elseSentence_3_0= ruleElseSegment )
                    {
                    // InternalPagos.g:1449:5: (lv_elseSentence_3_0= ruleElseSegment )
                    // InternalPagos.g:1450:6: lv_elseSentence_3_0= ruleElseSegment
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
    // InternalPagos.g:1472:1: entryRuleIfCondition returns [EObject current=null] : iv_ruleIfCondition= ruleIfCondition EOF ;
    public final EObject entryRuleIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCondition = null;


        try {
            // InternalPagos.g:1472:52: (iv_ruleIfCondition= ruleIfCondition EOF )
            // InternalPagos.g:1473:2: iv_ruleIfCondition= ruleIfCondition EOF
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
    // InternalPagos.g:1479:1: ruleIfCondition returns [EObject current=null] : ( () this_IF_1= RULE_IF this_LBRACKET_2= RULE_LBRACKET ( (lv_logExp_3_0= ruleExpresionLogica ) ) this_RBRACKET_4= RULE_RBRACKET this_THEN_5= RULE_THEN this_LBRACE_6= RULE_LBRACE this_RETURN_7= RULE_RETURN this_COLON_8= RULE_COLON ( (lv_expression_9_0= ruleAdicion ) ) this_RBRACE_10= RULE_RBRACE ) ;
    public final EObject ruleIfCondition() throws RecognitionException {
        EObject current = null;

        Token this_IF_1=null;
        Token this_LBRACKET_2=null;
        Token this_RBRACKET_4=null;
        Token this_THEN_5=null;
        Token this_LBRACE_6=null;
        Token this_RETURN_7=null;
        Token this_COLON_8=null;
        Token this_RBRACE_10=null;
        EObject lv_logExp_3_0 = null;

        EObject lv_expression_9_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1485:2: ( ( () this_IF_1= RULE_IF this_LBRACKET_2= RULE_LBRACKET ( (lv_logExp_3_0= ruleExpresionLogica ) ) this_RBRACKET_4= RULE_RBRACKET this_THEN_5= RULE_THEN this_LBRACE_6= RULE_LBRACE this_RETURN_7= RULE_RETURN this_COLON_8= RULE_COLON ( (lv_expression_9_0= ruleAdicion ) ) this_RBRACE_10= RULE_RBRACE ) )
            // InternalPagos.g:1486:2: ( () this_IF_1= RULE_IF this_LBRACKET_2= RULE_LBRACKET ( (lv_logExp_3_0= ruleExpresionLogica ) ) this_RBRACKET_4= RULE_RBRACKET this_THEN_5= RULE_THEN this_LBRACE_6= RULE_LBRACE this_RETURN_7= RULE_RETURN this_COLON_8= RULE_COLON ( (lv_expression_9_0= ruleAdicion ) ) this_RBRACE_10= RULE_RBRACE )
            {
            // InternalPagos.g:1486:2: ( () this_IF_1= RULE_IF this_LBRACKET_2= RULE_LBRACKET ( (lv_logExp_3_0= ruleExpresionLogica ) ) this_RBRACKET_4= RULE_RBRACKET this_THEN_5= RULE_THEN this_LBRACE_6= RULE_LBRACE this_RETURN_7= RULE_RETURN this_COLON_8= RULE_COLON ( (lv_expression_9_0= ruleAdicion ) ) this_RBRACE_10= RULE_RBRACE )
            // InternalPagos.g:1487:3: () this_IF_1= RULE_IF this_LBRACKET_2= RULE_LBRACKET ( (lv_logExp_3_0= ruleExpresionLogica ) ) this_RBRACKET_4= RULE_RBRACKET this_THEN_5= RULE_THEN this_LBRACE_6= RULE_LBRACE this_RETURN_7= RULE_RETURN this_COLON_8= RULE_COLON ( (lv_expression_9_0= ruleAdicion ) ) this_RBRACE_10= RULE_RBRACE
            {
            // InternalPagos.g:1487:3: ()
            // InternalPagos.g:1488:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfConditionAccess().getIfConditionAction_0(),
            					current);
            			

            }

            this_IF_1=(Token)match(input,RULE_IF,FOLLOW_11); 

            			newLeafNode(this_IF_1, grammarAccess.getIfConditionAccess().getIFTerminalRuleCall_1());
            		
            this_LBRACKET_2=(Token)match(input,RULE_LBRACKET,FOLLOW_27); 

            			newLeafNode(this_LBRACKET_2, grammarAccess.getIfConditionAccess().getLBRACKETTerminalRuleCall_2());
            		
            // InternalPagos.g:1502:3: ( (lv_logExp_3_0= ruleExpresionLogica ) )
            // InternalPagos.g:1503:4: (lv_logExp_3_0= ruleExpresionLogica )
            {
            // InternalPagos.g:1503:4: (lv_logExp_3_0= ruleExpresionLogica )
            // InternalPagos.g:1504:5: lv_logExp_3_0= ruleExpresionLogica
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
            		
            this_LBRACE_6=(Token)match(input,RULE_LBRACE,FOLLOW_30); 

            			newLeafNode(this_LBRACE_6, grammarAccess.getIfConditionAccess().getLBRACETerminalRuleCall_6());
            		
            this_RETURN_7=(Token)match(input,RULE_RETURN,FOLLOW_4); 

            			newLeafNode(this_RETURN_7, grammarAccess.getIfConditionAccess().getRETURNTerminalRuleCall_7());
            		
            this_COLON_8=(Token)match(input,RULE_COLON,FOLLOW_31); 

            			newLeafNode(this_COLON_8, grammarAccess.getIfConditionAccess().getCOLONTerminalRuleCall_8());
            		
            // InternalPagos.g:1541:3: ( (lv_expression_9_0= ruleAdicion ) )
            // InternalPagos.g:1542:4: (lv_expression_9_0= ruleAdicion )
            {
            // InternalPagos.g:1542:4: (lv_expression_9_0= ruleAdicion )
            // InternalPagos.g:1543:5: lv_expression_9_0= ruleAdicion
            {

            					newCompositeNode(grammarAccess.getIfConditionAccess().getExpressionAdicionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_expression_9_0=ruleAdicion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfConditionRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_9_0,
            						"co.edu.uniandes.Pagos.Adicion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RBRACE_10=(Token)match(input,RULE_RBRACE,FOLLOW_2); 

            			newLeafNode(this_RBRACE_10, grammarAccess.getIfConditionAccess().getRBRACETerminalRuleCall_10());
            		

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
    // InternalPagos.g:1568:1: entryRuleElseSegment returns [EObject current=null] : iv_ruleElseSegment= ruleElseSegment EOF ;
    public final EObject entryRuleElseSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseSegment = null;


        try {
            // InternalPagos.g:1568:52: (iv_ruleElseSegment= ruleElseSegment EOF )
            // InternalPagos.g:1569:2: iv_ruleElseSegment= ruleElseSegment EOF
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
    // InternalPagos.g:1575:1: ruleElseSegment returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE ( (lv_ifSentence_2_0= ruleFormula ) ) this_RBRACE_3= RULE_RBRACE ) ;
    public final EObject ruleElseSegment() throws RecognitionException {
        EObject current = null;

        Token this_LBRACE_1=null;
        Token this_RBRACE_3=null;
        EObject lv_ifSentence_2_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1581:2: ( ( () this_LBRACE_1= RULE_LBRACE ( (lv_ifSentence_2_0= ruleFormula ) ) this_RBRACE_3= RULE_RBRACE ) )
            // InternalPagos.g:1582:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_ifSentence_2_0= ruleFormula ) ) this_RBRACE_3= RULE_RBRACE )
            {
            // InternalPagos.g:1582:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_ifSentence_2_0= ruleFormula ) ) this_RBRACE_3= RULE_RBRACE )
            // InternalPagos.g:1583:3: () this_LBRACE_1= RULE_LBRACE ( (lv_ifSentence_2_0= ruleFormula ) ) this_RBRACE_3= RULE_RBRACE
            {
            // InternalPagos.g:1583:3: ()
            // InternalPagos.g:1584:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElseSegmentAccess().getElseSegmentAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_24); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getElseSegmentAccess().getLBRACETerminalRuleCall_1());
            		
            // InternalPagos.g:1594:3: ( (lv_ifSentence_2_0= ruleFormula ) )
            // InternalPagos.g:1595:4: (lv_ifSentence_2_0= ruleFormula )
            {
            // InternalPagos.g:1595:4: (lv_ifSentence_2_0= ruleFormula )
            // InternalPagos.g:1596:5: lv_ifSentence_2_0= ruleFormula
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
    // InternalPagos.g:1621:1: entryRuleReturnBlock returns [EObject current=null] : iv_ruleReturnBlock= ruleReturnBlock EOF ;
    public final EObject entryRuleReturnBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnBlock = null;


        try {
            // InternalPagos.g:1621:52: (iv_ruleReturnBlock= ruleReturnBlock EOF )
            // InternalPagos.g:1622:2: iv_ruleReturnBlock= ruleReturnBlock EOF
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
    // InternalPagos.g:1628:1: ruleReturnBlock returns [EObject current=null] : ( () this_RETURN_1= RULE_RETURN this_COLON_2= RULE_COLON ( (lv_expression_3_0= ruleAdicion ) ) ) ;
    public final EObject ruleReturnBlock() throws RecognitionException {
        EObject current = null;

        Token this_RETURN_1=null;
        Token this_COLON_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1634:2: ( ( () this_RETURN_1= RULE_RETURN this_COLON_2= RULE_COLON ( (lv_expression_3_0= ruleAdicion ) ) ) )
            // InternalPagos.g:1635:2: ( () this_RETURN_1= RULE_RETURN this_COLON_2= RULE_COLON ( (lv_expression_3_0= ruleAdicion ) ) )
            {
            // InternalPagos.g:1635:2: ( () this_RETURN_1= RULE_RETURN this_COLON_2= RULE_COLON ( (lv_expression_3_0= ruleAdicion ) ) )
            // InternalPagos.g:1636:3: () this_RETURN_1= RULE_RETURN this_COLON_2= RULE_COLON ( (lv_expression_3_0= ruleAdicion ) )
            {
            // InternalPagos.g:1636:3: ()
            // InternalPagos.g:1637:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReturnBlockAccess().getReturnBlockAction_0(),
            					current);
            			

            }

            this_RETURN_1=(Token)match(input,RULE_RETURN,FOLLOW_4); 

            			newLeafNode(this_RETURN_1, grammarAccess.getReturnBlockAccess().getRETURNTerminalRuleCall_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_31); 

            			newLeafNode(this_COLON_2, grammarAccess.getReturnBlockAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalPagos.g:1651:3: ( (lv_expression_3_0= ruleAdicion ) )
            // InternalPagos.g:1652:4: (lv_expression_3_0= ruleAdicion )
            {
            // InternalPagos.g:1652:4: (lv_expression_3_0= ruleAdicion )
            // InternalPagos.g:1653:5: lv_expression_3_0= ruleAdicion
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
    // InternalPagos.g:1674:1: entryRuleExpresionLogica returns [EObject current=null] : iv_ruleExpresionLogica= ruleExpresionLogica EOF ;
    public final EObject entryRuleExpresionLogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionLogica = null;


        try {
            // InternalPagos.g:1674:56: (iv_ruleExpresionLogica= ruleExpresionLogica EOF )
            // InternalPagos.g:1675:2: iv_ruleExpresionLogica= ruleExpresionLogica EOF
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
    // InternalPagos.g:1681:1: ruleExpresionLogica returns [EObject current=null] : ( ( (lv_variable_0_0= ruleTerminalValue ) ) ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+ ( ( (lv_conOper_4_0= RULE_LOGICALCONN ) ) ( (lv_exp_5_0= ruleExpresionLogica ) ) )? ) ;
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
            // InternalPagos.g:1687:2: ( ( ( (lv_variable_0_0= ruleTerminalValue ) ) ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+ ( ( (lv_conOper_4_0= RULE_LOGICALCONN ) ) ( (lv_exp_5_0= ruleExpresionLogica ) ) )? ) )
            // InternalPagos.g:1688:2: ( ( (lv_variable_0_0= ruleTerminalValue ) ) ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+ ( ( (lv_conOper_4_0= RULE_LOGICALCONN ) ) ( (lv_exp_5_0= ruleExpresionLogica ) ) )? )
            {
            // InternalPagos.g:1688:2: ( ( (lv_variable_0_0= ruleTerminalValue ) ) ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+ ( ( (lv_conOper_4_0= RULE_LOGICALCONN ) ) ( (lv_exp_5_0= ruleExpresionLogica ) ) )? )
            // InternalPagos.g:1689:3: ( (lv_variable_0_0= ruleTerminalValue ) ) ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+ ( ( (lv_conOper_4_0= RULE_LOGICALCONN ) ) ( (lv_exp_5_0= ruleExpresionLogica ) ) )?
            {
            // InternalPagos.g:1689:3: ( (lv_variable_0_0= ruleTerminalValue ) )
            // InternalPagos.g:1690:4: (lv_variable_0_0= ruleTerminalValue )
            {
            // InternalPagos.g:1690:4: (lv_variable_0_0= ruleTerminalValue )
            // InternalPagos.g:1691:5: lv_variable_0_0= ruleTerminalValue
            {

            					newCompositeNode(grammarAccess.getExpresionLogicaAccess().getVariableTerminalValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_variable_0_0=ruleTerminalValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
            					}
            					add(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"co.edu.uniandes.Pagos.TerminalValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:1708:3: ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_OPERADORLOGICO) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPagos.g:1709:4: ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) )
            	    {
            	    // InternalPagos.g:1709:4: ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) )
            	    // InternalPagos.g:1710:5: (lv_logOper_1_0= RULE_OPERADORLOGICO )
            	    {
            	    // InternalPagos.g:1710:5: (lv_logOper_1_0= RULE_OPERADORLOGICO )
            	    // InternalPagos.g:1711:6: lv_logOper_1_0= RULE_OPERADORLOGICO
            	    {
            	    lv_logOper_1_0=(Token)match(input,RULE_OPERADORLOGICO,FOLLOW_33); 

            	    						newLeafNode(lv_logOper_1_0, grammarAccess.getExpresionLogicaAccess().getLogOperOPERADORLOGICOTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExpresionLogicaRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"logOper",
            	    							lv_logOper_1_0,
            	    							"co.edu.uniandes.Pagos.OPERADORLOGICO");
            	    					

            	    }


            	    }

            	    // InternalPagos.g:1727:4: ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==RULE_ID||LA17_0==RULE_INT||LA17_0==43) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==RULE_STRING) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalPagos.g:1728:5: ( (lv_variable2_2_0= ruleTerminalValue ) )
            	            {
            	            // InternalPagos.g:1728:5: ( (lv_variable2_2_0= ruleTerminalValue ) )
            	            // InternalPagos.g:1729:6: (lv_variable2_2_0= ruleTerminalValue )
            	            {
            	            // InternalPagos.g:1729:6: (lv_variable2_2_0= ruleTerminalValue )
            	            // InternalPagos.g:1730:7: lv_variable2_2_0= ruleTerminalValue
            	            {

            	            							newCompositeNode(grammarAccess.getExpresionLogicaAccess().getVariable2TerminalValueParserRuleCall_1_1_0_0());
            	            						
            	            pushFollow(FOLLOW_34);
            	            lv_variable2_2_0=ruleTerminalValue();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
            	            							}
            	            							add(
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
            	            // InternalPagos.g:1748:5: ( (lv_literal_3_0= RULE_STRING ) )
            	            {
            	            // InternalPagos.g:1748:5: ( (lv_literal_3_0= RULE_STRING ) )
            	            // InternalPagos.g:1749:6: (lv_literal_3_0= RULE_STRING )
            	            {
            	            // InternalPagos.g:1749:6: (lv_literal_3_0= RULE_STRING )
            	            // InternalPagos.g:1750:7: lv_literal_3_0= RULE_STRING
            	            {
            	            lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	            							newLeafNode(lv_literal_3_0, grammarAccess.getExpresionLogicaAccess().getLiteralSTRINGTerminalRuleCall_1_1_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getExpresionLogicaRule());
            	            							}
            	            							addWithLastConsumed(
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // InternalPagos.g:1768:3: ( ( (lv_conOper_4_0= RULE_LOGICALCONN ) ) ( (lv_exp_5_0= ruleExpresionLogica ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_LOGICALCONN) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPagos.g:1769:4: ( (lv_conOper_4_0= RULE_LOGICALCONN ) ) ( (lv_exp_5_0= ruleExpresionLogica ) )
                    {
                    // InternalPagos.g:1769:4: ( (lv_conOper_4_0= RULE_LOGICALCONN ) )
                    // InternalPagos.g:1770:5: (lv_conOper_4_0= RULE_LOGICALCONN )
                    {
                    // InternalPagos.g:1770:5: (lv_conOper_4_0= RULE_LOGICALCONN )
                    // InternalPagos.g:1771:6: lv_conOper_4_0= RULE_LOGICALCONN
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

                    // InternalPagos.g:1787:4: ( (lv_exp_5_0= ruleExpresionLogica ) )
                    // InternalPagos.g:1788:5: (lv_exp_5_0= ruleExpresionLogica )
                    {
                    // InternalPagos.g:1788:5: (lv_exp_5_0= ruleExpresionLogica )
                    // InternalPagos.g:1789:6: lv_exp_5_0= ruleExpresionLogica
                    {

                    						newCompositeNode(grammarAccess.getExpresionLogicaAccess().getExpExpresionLogicaParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_5_0=ruleExpresionLogica();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
                    						}
                    						add(
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
    // InternalPagos.g:1811:1: entryRuleAdicion returns [EObject current=null] : iv_ruleAdicion= ruleAdicion EOF ;
    public final EObject entryRuleAdicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdicion = null;


        try {
            // InternalPagos.g:1811:48: (iv_ruleAdicion= ruleAdicion EOF )
            // InternalPagos.g:1812:2: iv_ruleAdicion= ruleAdicion EOF
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
    // InternalPagos.g:1818:1: ruleAdicion returns [EObject current=null] : (this_Multiplicacion_0= ruleMultiplicacion ( () ( (lv_operator_2_0= RULE_ADDOP ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )* ) ;
    public final EObject ruleAdicion() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_Multiplicacion_0 = null;

        EObject lv_rexp_3_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1824:2: ( (this_Multiplicacion_0= ruleMultiplicacion ( () ( (lv_operator_2_0= RULE_ADDOP ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )* ) )
            // InternalPagos.g:1825:2: (this_Multiplicacion_0= ruleMultiplicacion ( () ( (lv_operator_2_0= RULE_ADDOP ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )* )
            {
            // InternalPagos.g:1825:2: (this_Multiplicacion_0= ruleMultiplicacion ( () ( (lv_operator_2_0= RULE_ADDOP ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )* )
            // InternalPagos.g:1826:3: this_Multiplicacion_0= ruleMultiplicacion ( () ( (lv_operator_2_0= RULE_ADDOP ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdicionAccess().getMultiplicacionParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_Multiplicacion_0=ruleMultiplicacion();

            state._fsp--;


            			current = this_Multiplicacion_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPagos.g:1834:3: ( () ( (lv_operator_2_0= RULE_ADDOP ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ADDOP) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPagos.g:1835:4: () ( (lv_operator_2_0= RULE_ADDOP ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) )
            	    {
            	    // InternalPagos.g:1835:4: ()
            	    // InternalPagos.g:1836:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdicionAccess().getAdicionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalPagos.g:1842:4: ( (lv_operator_2_0= RULE_ADDOP ) )
            	    // InternalPagos.g:1843:5: (lv_operator_2_0= RULE_ADDOP )
            	    {
            	    // InternalPagos.g:1843:5: (lv_operator_2_0= RULE_ADDOP )
            	    // InternalPagos.g:1844:6: lv_operator_2_0= RULE_ADDOP
            	    {
            	    lv_operator_2_0=(Token)match(input,RULE_ADDOP,FOLLOW_31); 

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

            	    // InternalPagos.g:1860:4: ( (lv_rexp_3_0= ruleMultiplicacion ) )
            	    // InternalPagos.g:1861:5: (lv_rexp_3_0= ruleMultiplicacion )
            	    {
            	    // InternalPagos.g:1861:5: (lv_rexp_3_0= ruleMultiplicacion )
            	    // InternalPagos.g:1862:6: lv_rexp_3_0= ruleMultiplicacion
            	    {

            	    						newCompositeNode(grammarAccess.getAdicionAccess().getRexpMultiplicacionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
            	    break loop20;
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
    // InternalPagos.g:1884:1: entryRuleMultiplicacion returns [EObject current=null] : iv_ruleMultiplicacion= ruleMultiplicacion EOF ;
    public final EObject entryRuleMultiplicacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacion = null;


        try {
            // InternalPagos.g:1884:55: (iv_ruleMultiplicacion= ruleMultiplicacion EOF )
            // InternalPagos.g:1885:2: iv_ruleMultiplicacion= ruleMultiplicacion EOF
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
    // InternalPagos.g:1891:1: ruleMultiplicacion returns [EObject current=null] : (this_SigleExp_0= ruleSigleExp ( () ( (lv_operator_2_0= RULE_MULTOP ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )* ) ;
    public final EObject ruleMultiplicacion() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_SigleExp_0 = null;

        EObject lv_rexp_3_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1897:2: ( (this_SigleExp_0= ruleSigleExp ( () ( (lv_operator_2_0= RULE_MULTOP ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )* ) )
            // InternalPagos.g:1898:2: (this_SigleExp_0= ruleSigleExp ( () ( (lv_operator_2_0= RULE_MULTOP ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )* )
            {
            // InternalPagos.g:1898:2: (this_SigleExp_0= ruleSigleExp ( () ( (lv_operator_2_0= RULE_MULTOP ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )* )
            // InternalPagos.g:1899:3: this_SigleExp_0= ruleSigleExp ( () ( (lv_operator_2_0= RULE_MULTOP ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicacionAccess().getSigleExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_SigleExp_0=ruleSigleExp();

            state._fsp--;


            			current = this_SigleExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPagos.g:1907:3: ( () ( (lv_operator_2_0= RULE_MULTOP ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_MULTOP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPagos.g:1908:4: () ( (lv_operator_2_0= RULE_MULTOP ) ) ( (lv_rexp_3_0= ruleSigleExp ) )
            	    {
            	    // InternalPagos.g:1908:4: ()
            	    // InternalPagos.g:1909:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicacionAccess().getMultiplicacionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalPagos.g:1915:4: ( (lv_operator_2_0= RULE_MULTOP ) )
            	    // InternalPagos.g:1916:5: (lv_operator_2_0= RULE_MULTOP )
            	    {
            	    // InternalPagos.g:1916:5: (lv_operator_2_0= RULE_MULTOP )
            	    // InternalPagos.g:1917:6: lv_operator_2_0= RULE_MULTOP
            	    {
            	    lv_operator_2_0=(Token)match(input,RULE_MULTOP,FOLLOW_31); 

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

            	    // InternalPagos.g:1933:4: ( (lv_rexp_3_0= ruleSigleExp ) )
            	    // InternalPagos.g:1934:5: (lv_rexp_3_0= ruleSigleExp )
            	    {
            	    // InternalPagos.g:1934:5: (lv_rexp_3_0= ruleSigleExp )
            	    // InternalPagos.g:1935:6: lv_rexp_3_0= ruleSigleExp
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicacionAccess().getRexpSigleExpParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
    // $ANTLR end "ruleMultiplicacion"


    // $ANTLR start "entryRuleSigleExp"
    // InternalPagos.g:1957:1: entryRuleSigleExp returns [EObject current=null] : iv_ruleSigleExp= ruleSigleExp EOF ;
    public final EObject entryRuleSigleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigleExp = null;


        try {
            // InternalPagos.g:1957:49: (iv_ruleSigleExp= ruleSigleExp EOF )
            // InternalPagos.g:1958:2: iv_ruleSigleExp= ruleSigleExp EOF
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
    // InternalPagos.g:1964:1: ruleSigleExp returns [EObject current=null] : (this_TerminalValue_0= ruleTerminalValue | (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' ) ) ;
    public final EObject ruleSigleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_TerminalValue_0 = null;

        EObject this_Adicion_2 = null;



        	enterRule();

        try {
            // InternalPagos.g:1970:2: ( (this_TerminalValue_0= ruleTerminalValue | (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' ) ) )
            // InternalPagos.g:1971:2: (this_TerminalValue_0= ruleTerminalValue | (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' ) )
            {
            // InternalPagos.g:1971:2: (this_TerminalValue_0= ruleTerminalValue | (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==RULE_INT||LA22_0==43) ) {
                alt22=1;
            }
            else if ( (LA22_0==40) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPagos.g:1972:3: this_TerminalValue_0= ruleTerminalValue
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
                    // InternalPagos.g:1981:3: (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' )
                    {
                    // InternalPagos.g:1981:3: (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' )
                    // InternalPagos.g:1982:4: otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getSigleExpAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getSigleExpAccess().getAdicionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_37);
                    this_Adicion_2=ruleAdicion();

                    state._fsp--;


                    				current = this_Adicion_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,41,FOLLOW_2); 

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
    // InternalPagos.g:2003:1: entryRuleBusinessAttribute returns [EObject current=null] : iv_ruleBusinessAttribute= ruleBusinessAttribute EOF ;
    public final EObject entryRuleBusinessAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessAttribute = null;


        try {
            // InternalPagos.g:2003:58: (iv_ruleBusinessAttribute= ruleBusinessAttribute EOF )
            // InternalPagos.g:2004:2: iv_ruleBusinessAttribute= ruleBusinessAttribute EOF
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
    // InternalPagos.g:2010:1: ruleBusinessAttribute returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? this_RBRACE_7= RULE_RBRACE ) ;
    public final EObject ruleBusinessAttribute() throws RecognitionException {
        EObject current = null;

        Token this_LBRACE_1=null;
        Token lv_name_2_0=null;
        Token this_COLON_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token this_RBRACE_7=null;
        EObject lv_exp_6_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:2016:2: ( ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? this_RBRACE_7= RULE_RBRACE ) )
            // InternalPagos.g:2017:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? this_RBRACE_7= RULE_RBRACE )
            {
            // InternalPagos.g:2017:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? this_RBRACE_7= RULE_RBRACE )
            // InternalPagos.g:2018:3: () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? this_RBRACE_7= RULE_RBRACE
            {
            // InternalPagos.g:2018:3: ()
            // InternalPagos.g:2019:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBusinessAttributeAccess().getBusinessAttributeAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_5); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getBusinessAttributeAccess().getLBRACETerminalRuleCall_1());
            		
            // InternalPagos.g:2029:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPagos.g:2030:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPagos.g:2030:4: (lv_name_2_0= RULE_ID )
            // InternalPagos.g:2031:5: lv_name_2_0= RULE_ID
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

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_38); 

            			newLeafNode(this_COLON_3, grammarAccess.getBusinessAttributeAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalPagos.g:2051:3: ( (lv_type_4_0= RULE_TYPE ) )
            // InternalPagos.g:2052:4: (lv_type_4_0= RULE_TYPE )
            {
            // InternalPagos.g:2052:4: (lv_type_4_0= RULE_TYPE )
            // InternalPagos.g:2053:5: lv_type_4_0= RULE_TYPE
            {
            lv_type_4_0=(Token)match(input,RULE_TYPE,FOLLOW_39); 

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

            // InternalPagos.g:2069:3: (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPagos.g:2070:4: otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) )
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_5, grammarAccess.getBusinessAttributeAccess().getColonEqualsSignKeyword_5_0());
                    			
                    // InternalPagos.g:2074:4: ( (lv_exp_6_0= ruleAdicion ) )
                    // InternalPagos.g:2075:5: (lv_exp_6_0= ruleAdicion )
                    {
                    // InternalPagos.g:2075:5: (lv_exp_6_0= ruleAdicion )
                    // InternalPagos.g:2076:6: lv_exp_6_0= ruleAdicion
                    {

                    						newCompositeNode(grammarAccess.getBusinessAttributeAccess().getExpAdicionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

            this_RBRACE_7=(Token)match(input,RULE_RBRACE,FOLLOW_2); 

            			newLeafNode(this_RBRACE_7, grammarAccess.getBusinessAttributeAccess().getRBRACETerminalRuleCall_6());
            		

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
    // InternalPagos.g:2102:1: entryRuleTerminalValue returns [EObject current=null] : iv_ruleTerminalValue= ruleTerminalValue EOF ;
    public final EObject entryRuleTerminalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalValue = null;


        try {
            // InternalPagos.g:2102:54: (iv_ruleTerminalValue= ruleTerminalValue EOF )
            // InternalPagos.g:2103:2: iv_ruleTerminalValue= ruleTerminalValue EOF
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
    // InternalPagos.g:2109:1: ruleTerminalValue returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( (lv_valor_2_0= ruleNumber ) ) ) ;
    public final EObject ruleTerminalValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_valor_2_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:2115:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( (lv_valor_2_0= ruleNumber ) ) ) )
            // InternalPagos.g:2116:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( (lv_valor_2_0= ruleNumber ) ) )
            {
            // InternalPagos.g:2116:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( (lv_valor_2_0= ruleNumber ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_INT||LA24_0==43) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPagos.g:2117:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalPagos.g:2117:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    // InternalPagos.g:2118:4: () ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalPagos.g:2118:4: ()
                    // InternalPagos.g:2119:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalValueAccess().getTerminalValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalPagos.g:2125:4: ( (otherlv_1= RULE_ID ) )
                    // InternalPagos.g:2126:5: (otherlv_1= RULE_ID )
                    {
                    // InternalPagos.g:2126:5: (otherlv_1= RULE_ID )
                    // InternalPagos.g:2127:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalValueRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getTerminalValueAccess().getVariableBusinessAttributeCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:2140:3: ( (lv_valor_2_0= ruleNumber ) )
                    {
                    // InternalPagos.g:2140:3: ( (lv_valor_2_0= ruleNumber ) )
                    // InternalPagos.g:2141:4: (lv_valor_2_0= ruleNumber )
                    {
                    // InternalPagos.g:2141:4: (lv_valor_2_0= ruleNumber )
                    // InternalPagos.g:2142:5: lv_valor_2_0= ruleNumber
                    {

                    					newCompositeNode(grammarAccess.getTerminalValueAccess().getValorNumberParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_valor_2_0=ruleNumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTerminalValueRule());
                    					}
                    					set(
                    						current,
                    						"valor",
                    						lv_valor_2_0,
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


    // $ANTLR start "entryRuleNumber"
    // InternalPagos.g:2163:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalPagos.g:2163:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalPagos.g:2164:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalPagos.g:2170:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EDouble_0= ruleEDouble | this_Integer_1= ruleInteger ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EDouble_0 = null;

        AntlrDatatypeRuleToken this_Integer_1 = null;



        	enterRule();

        try {
            // InternalPagos.g:2176:2: ( (this_EDouble_0= ruleEDouble | this_Integer_1= ruleInteger ) )
            // InternalPagos.g:2177:2: (this_EDouble_0= ruleEDouble | this_Integer_1= ruleInteger )
            {
            // InternalPagos.g:2177:2: (this_EDouble_0= ruleEDouble | this_Integer_1= ruleInteger )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==EOF||LA25_1==RULE_RBRACE||LA25_1==RULE_RBRACKET||(LA25_1>=RULE_OPERADORLOGICO && LA25_1<=RULE_MULTOP)||LA25_1==41) ) {
                    alt25=2;
                }
                else if ( (LA25_1==43) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA25_0==43) ) {
                alt25=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalPagos.g:2178:3: this_EDouble_0= ruleEDouble
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
                    // InternalPagos.g:2189:3: this_Integer_1= ruleInteger
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
    // InternalPagos.g:2203:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalPagos.g:2203:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalPagos.g:2204:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalPagos.g:2210:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_5=null;


        	enterRule();

        try {
            // InternalPagos.g:2216:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? ) )
            // InternalPagos.g:2217:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? )
            {
            // InternalPagos.g:2217:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? )
            // InternalPagos.g:2218:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )?
            {
            // InternalPagos.g:2218:3: (this_INT_0= RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPagos.g:2219:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_40); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,43,FOLLOW_41); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_42); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2());
            		
            // InternalPagos.g:2239:3: ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=44 && LA28_0<=45)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPagos.g:2240:4: (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT
                    {
                    // InternalPagos.g:2240:4: (kw= 'E' | kw= 'e' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==44) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==45) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalPagos.g:2241:5: kw= 'E'
                            {
                            kw=(Token)match(input,44,FOLLOW_41); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPagos.g:2247:5: kw= 'e'
                            {
                            kw=(Token)match(input,45,FOLLOW_41); 

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
    // InternalPagos.g:2265:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalPagos.g:2265:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalPagos.g:2266:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalPagos.g:2272:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPagos.g:2278:2: (this_INT_0= RULE_INT )
            // InternalPagos.g:2279:2: this_INT_0= RULE_INT
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000000A100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000200040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000090000200040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000200840L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000300000000002L});

}