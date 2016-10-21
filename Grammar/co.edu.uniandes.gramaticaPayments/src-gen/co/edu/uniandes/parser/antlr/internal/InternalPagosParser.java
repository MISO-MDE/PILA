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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LBRACE", "RULE_COLON", "RULE_ID", "RULE_COMMA", "RULE_RBRACE", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_STRING", "RULE_OPERADORLOGICO", "RULE_LOGICALCONN", "RULE_TYPE", "RULE_ADDOP", "RULE_MULTOP", "RULE_INT", "RULE_DASH", "RULE_STR_ESC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'intermediary'", "'superentities'", "'description'", "'attributes'", "'entities'", "'InformationTemplate'", "'FormAttributes'", "'calculationtemplates'", "'providers'", "'calculationattributes'", "'calculationrules'", "'Si'", "'Entonces'", "'Retornar:'", "'Sino'", "'('", "')'", "':='", "'.'", "'E'", "'e'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_COMMA=7;
    public static final int RULE_COLON=5;
    public static final int RULE_LOGICALCONN=13;
    public static final int T__26=26;
    public static final int RULE_TYPE=14;
    public static final int T__27=27;
    public static final int RULE_STR_ESC=19;
    public static final int T__28=28;
    public static final int RULE_INT=17;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=20;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_LBRACKET=9;
    public static final int RULE_STRING=11;
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
    public static final int RULE_LBRACE=4;
    public static final int RULE_WS=22;
    public static final int RULE_OPERADORLOGICO=12;
    public static final int RULE_ADDOP=15;
    public static final int RULE_ANY_OTHER=23;
    public static final int RULE_RBRACE=8;
    public static final int T__44=44;
    public static final int RULE_MULTOP=16;
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
            		
            otherlv_1=(Token)match(input,24,FOLLOW_4); 

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
            		
            otherlv_5=(Token)match(input,25,FOLLOW_4); 

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
    // InternalPagos.g:155:1: ruleIntermediary returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'superentities' this_COLON_7= RULE_COLON this_LBRACKET_8= RULE_LBRACKET ( (lv_superentitie_9_0= ruleSuperEntity ) ) (this_COMMA_10= RULE_COMMA ( (lv_superentitie_11_0= ruleSuperEntity ) ) )* this_RBRACKET_12= RULE_RBRACKET this_RBRACE_13= RULE_RBRACE ) ;
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
        EObject lv_superentitie_9_0 = null;

        EObject lv_superentitie_11_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:161:2: ( ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'superentities' this_COLON_7= RULE_COLON this_LBRACKET_8= RULE_LBRACKET ( (lv_superentitie_9_0= ruleSuperEntity ) ) (this_COMMA_10= RULE_COMMA ( (lv_superentitie_11_0= ruleSuperEntity ) ) )* this_RBRACKET_12= RULE_RBRACKET this_RBRACE_13= RULE_RBRACE ) )
            // InternalPagos.g:162:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'superentities' this_COLON_7= RULE_COLON this_LBRACKET_8= RULE_LBRACKET ( (lv_superentitie_9_0= ruleSuperEntity ) ) (this_COMMA_10= RULE_COMMA ( (lv_superentitie_11_0= ruleSuperEntity ) ) )* this_RBRACKET_12= RULE_RBRACKET this_RBRACE_13= RULE_RBRACE )
            {
            // InternalPagos.g:162:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'superentities' this_COLON_7= RULE_COLON this_LBRACKET_8= RULE_LBRACKET ( (lv_superentitie_9_0= ruleSuperEntity ) ) (this_COMMA_10= RULE_COMMA ( (lv_superentitie_11_0= ruleSuperEntity ) ) )* this_RBRACKET_12= RULE_RBRACKET this_RBRACE_13= RULE_RBRACE )
            // InternalPagos.g:163:3: () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'superentities' this_COLON_7= RULE_COLON this_LBRACKET_8= RULE_LBRACKET ( (lv_superentitie_9_0= ruleSuperEntity ) ) (this_COMMA_10= RULE_COMMA ( (lv_superentitie_11_0= ruleSuperEntity ) ) )* this_RBRACKET_12= RULE_RBRACKET this_RBRACE_13= RULE_RBRACE
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
            		
            otherlv_2=(Token)match(input,24,FOLLOW_4); 

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
            		
            otherlv_6=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getIntermediaryAccess().getSuperentitiesKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_7, grammarAccess.getIntermediaryAccess().getCOLONTerminalRuleCall_7());
            		
            this_LBRACKET_8=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

            			newLeafNode(this_LBRACKET_8, grammarAccess.getIntermediaryAccess().getLBRACKETTerminalRuleCall_8());
            		
            // InternalPagos.g:216:3: ( (lv_superentitie_9_0= ruleSuperEntity ) )
            // InternalPagos.g:217:4: (lv_superentitie_9_0= ruleSuperEntity )
            {
            // InternalPagos.g:217:4: (lv_superentitie_9_0= ruleSuperEntity )
            // InternalPagos.g:218:5: lv_superentitie_9_0= ruleSuperEntity
            {

            					newCompositeNode(grammarAccess.getIntermediaryAccess().getSuperentitieSuperEntityParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_12);
            lv_superentitie_9_0=ruleSuperEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntermediaryRule());
            					}
            					add(
            						current,
            						"superentitie",
            						lv_superentitie_9_0,
            						"co.edu.uniandes.Pagos.SuperEntity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:235:3: (this_COMMA_10= RULE_COMMA ( (lv_superentitie_11_0= ruleSuperEntity ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPagos.g:236:4: this_COMMA_10= RULE_COMMA ( (lv_superentitie_11_0= ruleSuperEntity ) )
            	    {
            	    this_COMMA_10=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_10, grammarAccess.getIntermediaryAccess().getCOMMATerminalRuleCall_10_0());
            	    			
            	    // InternalPagos.g:240:4: ( (lv_superentitie_11_0= ruleSuperEntity ) )
            	    // InternalPagos.g:241:5: (lv_superentitie_11_0= ruleSuperEntity )
            	    {
            	    // InternalPagos.g:241:5: (lv_superentitie_11_0= ruleSuperEntity )
            	    // InternalPagos.g:242:6: lv_superentitie_11_0= ruleSuperEntity
            	    {

            	    						newCompositeNode(grammarAccess.getIntermediaryAccess().getSuperentitieSuperEntityParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_superentitie_11_0=ruleSuperEntity();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIntermediaryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"superentitie",
            	    							lv_superentitie_11_0,
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
    // InternalPagos.g:279:1: ruleSuperEntity returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleSuperEntityAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleSuperEntityAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'entities' this_COLON_19= RULE_COLON this_LBRACKET_20= RULE_LBRACKET ( (lv_participante_21_0= ruleParticipant ) ) (this_COMMA_22= RULE_COMMA ( (lv_participante_23_0= ruleParticipant ) ) )* this_RBRACKET_24= RULE_RBRACKET this_RBRACE_25= RULE_RBRACE ) ;
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

        EObject lv_participante_21_0 = null;

        EObject lv_participante_23_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:285:2: ( ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleSuperEntityAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleSuperEntityAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'entities' this_COLON_19= RULE_COLON this_LBRACKET_20= RULE_LBRACKET ( (lv_participante_21_0= ruleParticipant ) ) (this_COMMA_22= RULE_COMMA ( (lv_participante_23_0= ruleParticipant ) ) )* this_RBRACKET_24= RULE_RBRACKET this_RBRACE_25= RULE_RBRACE ) )
            // InternalPagos.g:286:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleSuperEntityAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleSuperEntityAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'entities' this_COLON_19= RULE_COLON this_LBRACKET_20= RULE_LBRACKET ( (lv_participante_21_0= ruleParticipant ) ) (this_COMMA_22= RULE_COMMA ( (lv_participante_23_0= ruleParticipant ) ) )* this_RBRACKET_24= RULE_RBRACKET this_RBRACE_25= RULE_RBRACE )
            {
            // InternalPagos.g:286:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleSuperEntityAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleSuperEntityAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'entities' this_COLON_19= RULE_COLON this_LBRACKET_20= RULE_LBRACKET ( (lv_participante_21_0= ruleParticipant ) ) (this_COMMA_22= RULE_COMMA ( (lv_participante_23_0= ruleParticipant ) ) )* this_RBRACKET_24= RULE_RBRACKET this_RBRACE_25= RULE_RBRACE )
            // InternalPagos.g:287:3: () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleSuperEntityAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleSuperEntityAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'entities' this_COLON_19= RULE_COLON this_LBRACKET_20= RULE_LBRACKET ( (lv_participante_21_0= ruleParticipant ) ) (this_COMMA_22= RULE_COMMA ( (lv_participante_23_0= ruleParticipant ) ) )* this_RBRACKET_24= RULE_RBRACKET this_RBRACE_25= RULE_RBRACE
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
            		
            otherlv_2=(Token)match(input,24,FOLLOW_4); 

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
            		
            otherlv_6=(Token)match(input,27,FOLLOW_4); 

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
            		
            otherlv_10=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getSuperEntityAccess().getAttributesKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_11, grammarAccess.getSuperEntityAccess().getCOLONTerminalRuleCall_11());
            		
            this_LBRACKET_12=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

            			newLeafNode(this_LBRACKET_12, grammarAccess.getSuperEntityAccess().getLBRACKETTerminalRuleCall_12());
            		
            // InternalPagos.g:370:3: ( (lv_attLists_13_0= ruleSuperEntityAttribute ) )
            // InternalPagos.g:371:4: (lv_attLists_13_0= ruleSuperEntityAttribute )
            {
            // InternalPagos.g:371:4: (lv_attLists_13_0= ruleSuperEntityAttribute )
            // InternalPagos.g:372:5: lv_attLists_13_0= ruleSuperEntityAttribute
            {

            					newCompositeNode(grammarAccess.getSuperEntityAccess().getAttListsSuperEntityAttributeParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_12);
            lv_attLists_13_0=ruleSuperEntityAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuperEntityRule());
            					}
            					add(
            						current,
            						"attLists",
            						lv_attLists_13_0,
            						"co.edu.uniandes.Pagos.SuperEntityAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:389:3: (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleSuperEntityAttribute ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPagos.g:390:4: this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleSuperEntityAttribute ) )
            	    {
            	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_14, grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_14_0());
            	    			
            	    // InternalPagos.g:394:4: ( (lv_attLists_15_0= ruleSuperEntityAttribute ) )
            	    // InternalPagos.g:395:5: (lv_attLists_15_0= ruleSuperEntityAttribute )
            	    {
            	    // InternalPagos.g:395:5: (lv_attLists_15_0= ruleSuperEntityAttribute )
            	    // InternalPagos.g:396:6: lv_attLists_15_0= ruleSuperEntityAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getSuperEntityAccess().getAttListsSuperEntityAttributeParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_attLists_15_0=ruleSuperEntityAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSuperEntityRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attLists",
            	    							lv_attLists_15_0,
            	    							"co.edu.uniandes.Pagos.SuperEntityAttribute");
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
            		
            otherlv_18=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getSuperEntityAccess().getEntitiesKeyword_17());
            		
            this_COLON_19=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_19, grammarAccess.getSuperEntityAccess().getCOLONTerminalRuleCall_18());
            		
            this_LBRACKET_20=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

            			newLeafNode(this_LBRACKET_20, grammarAccess.getSuperEntityAccess().getLBRACKETTerminalRuleCall_19());
            		
            // InternalPagos.g:434:3: ( (lv_participante_21_0= ruleParticipant ) )
            // InternalPagos.g:435:4: (lv_participante_21_0= ruleParticipant )
            {
            // InternalPagos.g:435:4: (lv_participante_21_0= ruleParticipant )
            // InternalPagos.g:436:5: lv_participante_21_0= ruleParticipant
            {

            					newCompositeNode(grammarAccess.getSuperEntityAccess().getParticipanteParticipantParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_12);
            lv_participante_21_0=ruleParticipant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuperEntityRule());
            					}
            					add(
            						current,
            						"participante",
            						lv_participante_21_0,
            						"co.edu.uniandes.Pagos.Participant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:453:3: (this_COMMA_22= RULE_COMMA ( (lv_participante_23_0= ruleParticipant ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPagos.g:454:4: this_COMMA_22= RULE_COMMA ( (lv_participante_23_0= ruleParticipant ) )
            	    {
            	    this_COMMA_22=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_22, grammarAccess.getSuperEntityAccess().getCOMMATerminalRuleCall_21_0());
            	    			
            	    // InternalPagos.g:458:4: ( (lv_participante_23_0= ruleParticipant ) )
            	    // InternalPagos.g:459:5: (lv_participante_23_0= ruleParticipant )
            	    {
            	    // InternalPagos.g:459:5: (lv_participante_23_0= ruleParticipant )
            	    // InternalPagos.g:460:6: lv_participante_23_0= ruleParticipant
            	    {

            	    						newCompositeNode(grammarAccess.getSuperEntityAccess().getParticipanteParticipantParserRuleCall_21_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_participante_23_0=ruleParticipant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSuperEntityRule());
            	    						}
            	    						add(
            	    							current,
            	    							"participante",
            	    							lv_participante_23_0,
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
    // InternalPagos.g:497:1: ruleParticipant returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleEntityAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleEntityAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'InformationTemplate' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templatesForm_22_0= ruleInformationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templatesForm_24_0= ruleInformationTemplate ) ) )* )? this_RBRACKET_25= RULE_RBRACKET ) ;
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

        EObject lv_templatesForm_22_0 = null;

        EObject lv_templatesForm_24_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:503:2: ( ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleEntityAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleEntityAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'InformationTemplate' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templatesForm_22_0= ruleInformationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templatesForm_24_0= ruleInformationTemplate ) ) )* )? this_RBRACKET_25= RULE_RBRACKET ) )
            // InternalPagos.g:504:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleEntityAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleEntityAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'InformationTemplate' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templatesForm_22_0= ruleInformationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templatesForm_24_0= ruleInformationTemplate ) ) )* )? this_RBRACKET_25= RULE_RBRACKET )
            {
            // InternalPagos.g:504:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleEntityAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleEntityAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'InformationTemplate' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templatesForm_22_0= ruleInformationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templatesForm_24_0= ruleInformationTemplate ) ) )* )? this_RBRACKET_25= RULE_RBRACKET )
            // InternalPagos.g:505:3: () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleEntityAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleEntityAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'InformationTemplate' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templatesForm_22_0= ruleInformationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templatesForm_24_0= ruleInformationTemplate ) ) )* )? this_RBRACKET_25= RULE_RBRACKET
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
            		
            otherlv_2=(Token)match(input,24,FOLLOW_4); 

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
            		
            otherlv_6=(Token)match(input,27,FOLLOW_4); 

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
            		
            otherlv_10=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getParticipantAccess().getAttributesKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_11, grammarAccess.getParticipantAccess().getCOLONTerminalRuleCall_11());
            		
            this_LBRACKET_12=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

            			newLeafNode(this_LBRACKET_12, grammarAccess.getParticipantAccess().getLBRACKETTerminalRuleCall_12());
            		
            // InternalPagos.g:588:3: ( (lv_attLists_13_0= ruleEntityAttribute ) )
            // InternalPagos.g:589:4: (lv_attLists_13_0= ruleEntityAttribute )
            {
            // InternalPagos.g:589:4: (lv_attLists_13_0= ruleEntityAttribute )
            // InternalPagos.g:590:5: lv_attLists_13_0= ruleEntityAttribute
            {

            					newCompositeNode(grammarAccess.getParticipantAccess().getAttListsEntityAttributeParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_12);
            lv_attLists_13_0=ruleEntityAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParticipantRule());
            					}
            					add(
            						current,
            						"attLists",
            						lv_attLists_13_0,
            						"co.edu.uniandes.Pagos.EntityAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:607:3: (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleEntityAttribute ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPagos.g:608:4: this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleEntityAttribute ) )
            	    {
            	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_14, grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_14_0());
            	    			
            	    // InternalPagos.g:612:4: ( (lv_attLists_15_0= ruleEntityAttribute ) )
            	    // InternalPagos.g:613:5: (lv_attLists_15_0= ruleEntityAttribute )
            	    {
            	    // InternalPagos.g:613:5: (lv_attLists_15_0= ruleEntityAttribute )
            	    // InternalPagos.g:614:6: lv_attLists_15_0= ruleEntityAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getParticipantAccess().getAttListsEntityAttributeParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_attLists_15_0=ruleEntityAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParticipantRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attLists",
            	    							lv_attLists_15_0,
            	    							"co.edu.uniandes.Pagos.EntityAttribute");
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
            		
            // InternalPagos.g:640:3: (this_COMMA_18= RULE_COMMA otherlv_19= 'InformationTemplate' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templatesForm_22_0= ruleInformationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templatesForm_24_0= ruleInformationTemplate ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_COMMA) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPagos.g:641:4: this_COMMA_18= RULE_COMMA otherlv_19= 'InformationTemplate' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templatesForm_22_0= ruleInformationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templatesForm_24_0= ruleInformationTemplate ) ) )*
                    {
                    this_COMMA_18=(Token)match(input,RULE_COMMA,FOLLOW_17); 

                    				newLeafNode(this_COMMA_18, grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_17_0());
                    			
                    otherlv_19=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getParticipantAccess().getInformationTemplateKeyword_17_1());
                    			
                    this_COLON_20=(Token)match(input,RULE_COLON,FOLLOW_11); 

                    				newLeafNode(this_COLON_20, grammarAccess.getParticipantAccess().getCOLONTerminalRuleCall_17_2());
                    			
                    this_LBRACKET_21=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

                    				newLeafNode(this_LBRACKET_21, grammarAccess.getParticipantAccess().getLBRACKETTerminalRuleCall_17_3());
                    			
                    // InternalPagos.g:657:4: ( (lv_templatesForm_22_0= ruleInformationTemplate ) )
                    // InternalPagos.g:658:5: (lv_templatesForm_22_0= ruleInformationTemplate )
                    {
                    // InternalPagos.g:658:5: (lv_templatesForm_22_0= ruleInformationTemplate )
                    // InternalPagos.g:659:6: lv_templatesForm_22_0= ruleInformationTemplate
                    {

                    						newCompositeNode(grammarAccess.getParticipantAccess().getTemplatesFormInformationTemplateParserRuleCall_17_4_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_templatesForm_22_0=ruleInformationTemplate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParticipantRule());
                    						}
                    						add(
                    							current,
                    							"templatesForm",
                    							lv_templatesForm_22_0,
                    							"co.edu.uniandes.Pagos.InformationTemplate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPagos.g:676:4: (this_COMMA_23= RULE_COMMA ( (lv_templatesForm_24_0= ruleInformationTemplate ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPagos.g:677:5: this_COMMA_23= RULE_COMMA ( (lv_templatesForm_24_0= ruleInformationTemplate ) )
                    	    {
                    	    this_COMMA_23=(Token)match(input,RULE_COMMA,FOLLOW_8); 

                    	    					newLeafNode(this_COMMA_23, grammarAccess.getParticipantAccess().getCOMMATerminalRuleCall_17_5_0());
                    	    				
                    	    // InternalPagos.g:681:5: ( (lv_templatesForm_24_0= ruleInformationTemplate ) )
                    	    // InternalPagos.g:682:6: (lv_templatesForm_24_0= ruleInformationTemplate )
                    	    {
                    	    // InternalPagos.g:682:6: (lv_templatesForm_24_0= ruleInformationTemplate )
                    	    // InternalPagos.g:683:7: lv_templatesForm_24_0= ruleInformationTemplate
                    	    {

                    	    							newCompositeNode(grammarAccess.getParticipantAccess().getTemplatesFormInformationTemplateParserRuleCall_17_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_templatesForm_24_0=ruleInformationTemplate();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParticipantRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"templatesForm",
                    	    								lv_templatesForm_24_0,
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
    // InternalPagos.g:717:1: ruleProvider returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleSuperEntityAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleSuperEntityAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE ) ;
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
            // InternalPagos.g:723:2: ( ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleSuperEntityAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleSuperEntityAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE ) )
            // InternalPagos.g:724:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleSuperEntityAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleSuperEntityAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE )
            {
            // InternalPagos.g:724:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleSuperEntityAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleSuperEntityAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE )
            // InternalPagos.g:725:3: () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'attributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleSuperEntityAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleSuperEntityAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE
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
            		
            otherlv_2=(Token)match(input,24,FOLLOW_4); 

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
            		
            otherlv_6=(Token)match(input,27,FOLLOW_4); 

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
            		
            otherlv_10=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getProviderAccess().getAttributesKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_11, grammarAccess.getProviderAccess().getCOLONTerminalRuleCall_11());
            		
            this_LBRACKET_12=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

            			newLeafNode(this_LBRACKET_12, grammarAccess.getProviderAccess().getLBRACKETTerminalRuleCall_12());
            		
            // InternalPagos.g:808:3: ( (lv_attLists_13_0= ruleSuperEntityAttribute ) )
            // InternalPagos.g:809:4: (lv_attLists_13_0= ruleSuperEntityAttribute )
            {
            // InternalPagos.g:809:4: (lv_attLists_13_0= ruleSuperEntityAttribute )
            // InternalPagos.g:810:5: lv_attLists_13_0= ruleSuperEntityAttribute
            {

            					newCompositeNode(grammarAccess.getProviderAccess().getAttListsSuperEntityAttributeParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_12);
            lv_attLists_13_0=ruleSuperEntityAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProviderRule());
            					}
            					add(
            						current,
            						"attLists",
            						lv_attLists_13_0,
            						"co.edu.uniandes.Pagos.SuperEntityAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:827:3: (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleSuperEntityAttribute ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPagos.g:828:4: this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleSuperEntityAttribute ) )
            	    {
            	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_14, grammarAccess.getProviderAccess().getCOMMATerminalRuleCall_14_0());
            	    			
            	    // InternalPagos.g:832:4: ( (lv_attLists_15_0= ruleSuperEntityAttribute ) )
            	    // InternalPagos.g:833:5: (lv_attLists_15_0= ruleSuperEntityAttribute )
            	    {
            	    // InternalPagos.g:833:5: (lv_attLists_15_0= ruleSuperEntityAttribute )
            	    // InternalPagos.g:834:6: lv_attLists_15_0= ruleSuperEntityAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getProviderAccess().getAttListsSuperEntityAttributeParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_attLists_15_0=ruleSuperEntityAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProviderRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attLists",
            	    							lv_attLists_15_0,
            	    							"co.edu.uniandes.Pagos.SuperEntityAttribute");
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
    // InternalPagos.g:871:1: ruleInformationTemplate returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'FormAttributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_formLists_13_0= ruleFormAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_formLists_15_0= ruleFormAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templates_22_0= ruleCalculationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templates_24_0= ruleCalculationTemplate ) ) )* this_RBRACKET_25= RULE_RBRACKET )? (this_COMMA_26= RULE_COMMA otherlv_27= 'providers' this_COLON_28= RULE_COLON this_LBRACKET_29= RULE_LBRACKET ( (lv_providers_30_0= ruleProvider ) ) (this_COMMA_31= RULE_COMMA ( (lv_providers_32_0= ruleProvider ) ) )* this_RBRACKET_33= RULE_RBRACKET )? ) ;
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
        EObject lv_formLists_13_0 = null;

        EObject lv_formLists_15_0 = null;

        EObject lv_templates_22_0 = null;

        EObject lv_templates_24_0 = null;

        EObject lv_providers_30_0 = null;

        EObject lv_providers_32_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:877:2: ( ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'FormAttributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_formLists_13_0= ruleFormAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_formLists_15_0= ruleFormAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templates_22_0= ruleCalculationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templates_24_0= ruleCalculationTemplate ) ) )* this_RBRACKET_25= RULE_RBRACKET )? (this_COMMA_26= RULE_COMMA otherlv_27= 'providers' this_COLON_28= RULE_COLON this_LBRACKET_29= RULE_LBRACKET ( (lv_providers_30_0= ruleProvider ) ) (this_COMMA_31= RULE_COMMA ( (lv_providers_32_0= ruleProvider ) ) )* this_RBRACKET_33= RULE_RBRACKET )? ) )
            // InternalPagos.g:878:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'FormAttributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_formLists_13_0= ruleFormAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_formLists_15_0= ruleFormAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templates_22_0= ruleCalculationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templates_24_0= ruleCalculationTemplate ) ) )* this_RBRACKET_25= RULE_RBRACKET )? (this_COMMA_26= RULE_COMMA otherlv_27= 'providers' this_COLON_28= RULE_COLON this_LBRACKET_29= RULE_LBRACKET ( (lv_providers_30_0= ruleProvider ) ) (this_COMMA_31= RULE_COMMA ( (lv_providers_32_0= ruleProvider ) ) )* this_RBRACKET_33= RULE_RBRACKET )? )
            {
            // InternalPagos.g:878:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'FormAttributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_formLists_13_0= ruleFormAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_formLists_15_0= ruleFormAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templates_22_0= ruleCalculationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templates_24_0= ruleCalculationTemplate ) ) )* this_RBRACKET_25= RULE_RBRACKET )? (this_COMMA_26= RULE_COMMA otherlv_27= 'providers' this_COLON_28= RULE_COLON this_LBRACKET_29= RULE_LBRACKET ( (lv_providers_30_0= ruleProvider ) ) (this_COMMA_31= RULE_COMMA ( (lv_providers_32_0= ruleProvider ) ) )* this_RBRACKET_33= RULE_RBRACKET )? )
            // InternalPagos.g:879:3: () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'FormAttributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_formLists_13_0= ruleFormAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_formLists_15_0= ruleFormAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_RBRACE_17= RULE_RBRACE (this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templates_22_0= ruleCalculationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templates_24_0= ruleCalculationTemplate ) ) )* this_RBRACKET_25= RULE_RBRACKET )? (this_COMMA_26= RULE_COMMA otherlv_27= 'providers' this_COLON_28= RULE_COLON this_LBRACKET_29= RULE_LBRACKET ( (lv_providers_30_0= ruleProvider ) ) (this_COMMA_31= RULE_COMMA ( (lv_providers_32_0= ruleProvider ) ) )* this_RBRACKET_33= RULE_RBRACKET )?
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
            		
            otherlv_2=(Token)match(input,24,FOLLOW_4); 

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
            		
            otherlv_6=(Token)match(input,27,FOLLOW_4); 

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
            		
            otherlv_10=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getInformationTemplateAccess().getFormAttributesKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_11, grammarAccess.getInformationTemplateAccess().getCOLONTerminalRuleCall_11());
            		
            this_LBRACKET_12=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

            			newLeafNode(this_LBRACKET_12, grammarAccess.getInformationTemplateAccess().getLBRACKETTerminalRuleCall_12());
            		
            // InternalPagos.g:962:3: ( (lv_formLists_13_0= ruleFormAttribute ) )
            // InternalPagos.g:963:4: (lv_formLists_13_0= ruleFormAttribute )
            {
            // InternalPagos.g:963:4: (lv_formLists_13_0= ruleFormAttribute )
            // InternalPagos.g:964:5: lv_formLists_13_0= ruleFormAttribute
            {

            					newCompositeNode(grammarAccess.getInformationTemplateAccess().getFormListsFormAttributeParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_12);
            lv_formLists_13_0=ruleFormAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInformationTemplateRule());
            					}
            					add(
            						current,
            						"formLists",
            						lv_formLists_13_0,
            						"co.edu.uniandes.Pagos.FormAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:981:3: (this_COMMA_14= RULE_COMMA ( (lv_formLists_15_0= ruleFormAttribute ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPagos.g:982:4: this_COMMA_14= RULE_COMMA ( (lv_formLists_15_0= ruleFormAttribute ) )
            	    {
            	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_14, grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_14_0());
            	    			
            	    // InternalPagos.g:986:4: ( (lv_formLists_15_0= ruleFormAttribute ) )
            	    // InternalPagos.g:987:5: (lv_formLists_15_0= ruleFormAttribute )
            	    {
            	    // InternalPagos.g:987:5: (lv_formLists_15_0= ruleFormAttribute )
            	    // InternalPagos.g:988:6: lv_formLists_15_0= ruleFormAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getInformationTemplateAccess().getFormListsFormAttributeParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_formLists_15_0=ruleFormAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInformationTemplateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"formLists",
            	    							lv_formLists_15_0,
            	    							"co.edu.uniandes.Pagos.FormAttribute");
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

                if ( (LA10_1==32) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalPagos.g:1015:4: this_COMMA_18= RULE_COMMA otherlv_19= 'calculationtemplates' this_COLON_20= RULE_COLON this_LBRACKET_21= RULE_LBRACKET ( (lv_templates_22_0= ruleCalculationTemplate ) ) (this_COMMA_23= RULE_COMMA ( (lv_templates_24_0= ruleCalculationTemplate ) ) )* this_RBRACKET_25= RULE_RBRACKET
                    {
                    this_COMMA_18=(Token)match(input,RULE_COMMA,FOLLOW_20); 

                    				newLeafNode(this_COMMA_18, grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_17_0());
                    			
                    otherlv_19=(Token)match(input,32,FOLLOW_4); 

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

                if ( (LA12_1==33) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalPagos.g:1081:4: this_COMMA_26= RULE_COMMA otherlv_27= 'providers' this_COLON_28= RULE_COLON this_LBRACKET_29= RULE_LBRACKET ( (lv_providers_30_0= ruleProvider ) ) (this_COMMA_31= RULE_COMMA ( (lv_providers_32_0= ruleProvider ) ) )* this_RBRACKET_33= RULE_RBRACKET
                    {
                    this_COMMA_26=(Token)match(input,RULE_COMMA,FOLLOW_21); 

                    				newLeafNode(this_COMMA_26, grammarAccess.getInformationTemplateAccess().getCOMMATerminalRuleCall_18_0());
                    			
                    otherlv_27=(Token)match(input,33,FOLLOW_4); 

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
    // InternalPagos.g:1157:1: ruleCalculationTemplate returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleVariableAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleVariableAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'calculationrules' this_COLON_19= RULE_COLON ( (lv_formula_20_0= ruleFormula ) ) this_RBRACE_21= RULE_RBRACE ) ;
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

        EObject lv_formula_20_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1163:2: ( ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleVariableAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleVariableAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'calculationrules' this_COLON_19= RULE_COLON ( (lv_formula_20_0= ruleFormula ) ) this_RBRACE_21= RULE_RBRACE ) )
            // InternalPagos.g:1164:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleVariableAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleVariableAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'calculationrules' this_COLON_19= RULE_COLON ( (lv_formula_20_0= ruleFormula ) ) this_RBRACE_21= RULE_RBRACE )
            {
            // InternalPagos.g:1164:2: ( () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleVariableAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleVariableAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'calculationrules' this_COLON_19= RULE_COLON ( (lv_formula_20_0= ruleFormula ) ) this_RBRACE_21= RULE_RBRACE )
            // InternalPagos.g:1165:3: () this_LBRACE_1= RULE_LBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= RULE_ID ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= RULE_STRING ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'calculationattributes' this_COLON_11= RULE_COLON this_LBRACKET_12= RULE_LBRACKET ( (lv_attLists_13_0= ruleVariableAttribute ) ) (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleVariableAttribute ) ) )* this_RBRACKET_16= RULE_RBRACKET this_COMMA_17= RULE_COMMA otherlv_18= 'calculationrules' this_COLON_19= RULE_COLON ( (lv_formula_20_0= ruleFormula ) ) this_RBRACE_21= RULE_RBRACE
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
            		
            otherlv_2=(Token)match(input,24,FOLLOW_4); 

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
            		
            otherlv_6=(Token)match(input,27,FOLLOW_4); 

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
            		
            otherlv_10=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getCalculationTemplateAccess().getCalculationattributesKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_11, grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_11());
            		
            this_LBRACKET_12=(Token)match(input,RULE_LBRACKET,FOLLOW_8); 

            			newLeafNode(this_LBRACKET_12, grammarAccess.getCalculationTemplateAccess().getLBRACKETTerminalRuleCall_12());
            		
            // InternalPagos.g:1248:3: ( (lv_attLists_13_0= ruleVariableAttribute ) )
            // InternalPagos.g:1249:4: (lv_attLists_13_0= ruleVariableAttribute )
            {
            // InternalPagos.g:1249:4: (lv_attLists_13_0= ruleVariableAttribute )
            // InternalPagos.g:1250:5: lv_attLists_13_0= ruleVariableAttribute
            {

            					newCompositeNode(grammarAccess.getCalculationTemplateAccess().getAttListsVariableAttributeParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_12);
            lv_attLists_13_0=ruleVariableAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalculationTemplateRule());
            					}
            					add(
            						current,
            						"attLists",
            						lv_attLists_13_0,
            						"co.edu.uniandes.Pagos.VariableAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPagos.g:1267:3: (this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleVariableAttribute ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPagos.g:1268:4: this_COMMA_14= RULE_COMMA ( (lv_attLists_15_0= ruleVariableAttribute ) )
            	    {
            	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_14, grammarAccess.getCalculationTemplateAccess().getCOMMATerminalRuleCall_14_0());
            	    			
            	    // InternalPagos.g:1272:4: ( (lv_attLists_15_0= ruleVariableAttribute ) )
            	    // InternalPagos.g:1273:5: (lv_attLists_15_0= ruleVariableAttribute )
            	    {
            	    // InternalPagos.g:1273:5: (lv_attLists_15_0= ruleVariableAttribute )
            	    // InternalPagos.g:1274:6: lv_attLists_15_0= ruleVariableAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getCalculationTemplateAccess().getAttListsVariableAttributeParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_attLists_15_0=ruleVariableAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCalculationTemplateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attLists",
            	    							lv_attLists_15_0,
            	    							"co.edu.uniandes.Pagos.VariableAttribute");
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
            		
            otherlv_18=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getCalculationTemplateAccess().getCalculationrulesKeyword_17());
            		
            this_COLON_19=(Token)match(input,RULE_COLON,FOLLOW_24); 

            			newLeafNode(this_COLON_19, grammarAccess.getCalculationTemplateAccess().getCOLONTerminalRuleCall_18());
            		
            // InternalPagos.g:1308:3: ( (lv_formula_20_0= ruleFormula ) )
            // InternalPagos.g:1309:4: (lv_formula_20_0= ruleFormula )
            {
            // InternalPagos.g:1309:4: (lv_formula_20_0= ruleFormula )
            // InternalPagos.g:1310:5: lv_formula_20_0= ruleFormula
            {

            					newCompositeNode(grammarAccess.getCalculationTemplateAccess().getFormulaFormulaParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_9);
            lv_formula_20_0=ruleFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalculationTemplateRule());
            					}
            					add(
            						current,
            						"formula",
            						lv_formula_20_0,
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
    // InternalPagos.g:1342:1: ruleFormula returns [EObject current=null] : ( () otherlv_1= 'Si' this_LBRACKET_2= RULE_LBRACKET ( (lv_logExp_3_0= ruleExpresionLogica ) ) this_RBRACKET_4= RULE_RBRACKET otherlv_5= 'Entonces' this_LBRACE_6= RULE_LBRACE otherlv_7= 'Retornar:' ( (lv_expression_8_0= ruleAdicion ) ) this_RBRACE_9= RULE_RBRACE ( (otherlv_10= 'Sino' )? (otherlv_11= 'Si' this_LBRACKET_12= RULE_LBRACKET ( (lv_logExp_13_0= ruleExpresionLogica ) ) this_RBRACKET_14= RULE_RBRACKET otherlv_15= 'Entonces' )? this_LBRACE_16= RULE_LBRACE otherlv_17= 'Retornar:' ( (lv_expression_18_0= ruleAdicion ) ) this_RBRACE_19= RULE_RBRACE )* ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LBRACKET_2=null;
        Token this_RBRACKET_4=null;
        Token otherlv_5=null;
        Token this_LBRACE_6=null;
        Token otherlv_7=null;
        Token this_RBRACE_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_LBRACKET_12=null;
        Token this_RBRACKET_14=null;
        Token otherlv_15=null;
        Token this_LBRACE_16=null;
        Token otherlv_17=null;
        Token this_RBRACE_19=null;
        EObject lv_logExp_3_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_logExp_13_0 = null;

        EObject lv_expression_18_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1348:2: ( ( () otherlv_1= 'Si' this_LBRACKET_2= RULE_LBRACKET ( (lv_logExp_3_0= ruleExpresionLogica ) ) this_RBRACKET_4= RULE_RBRACKET otherlv_5= 'Entonces' this_LBRACE_6= RULE_LBRACE otherlv_7= 'Retornar:' ( (lv_expression_8_0= ruleAdicion ) ) this_RBRACE_9= RULE_RBRACE ( (otherlv_10= 'Sino' )? (otherlv_11= 'Si' this_LBRACKET_12= RULE_LBRACKET ( (lv_logExp_13_0= ruleExpresionLogica ) ) this_RBRACKET_14= RULE_RBRACKET otherlv_15= 'Entonces' )? this_LBRACE_16= RULE_LBRACE otherlv_17= 'Retornar:' ( (lv_expression_18_0= ruleAdicion ) ) this_RBRACE_19= RULE_RBRACE )* ) )
            // InternalPagos.g:1349:2: ( () otherlv_1= 'Si' this_LBRACKET_2= RULE_LBRACKET ( (lv_logExp_3_0= ruleExpresionLogica ) ) this_RBRACKET_4= RULE_RBRACKET otherlv_5= 'Entonces' this_LBRACE_6= RULE_LBRACE otherlv_7= 'Retornar:' ( (lv_expression_8_0= ruleAdicion ) ) this_RBRACE_9= RULE_RBRACE ( (otherlv_10= 'Sino' )? (otherlv_11= 'Si' this_LBRACKET_12= RULE_LBRACKET ( (lv_logExp_13_0= ruleExpresionLogica ) ) this_RBRACKET_14= RULE_RBRACKET otherlv_15= 'Entonces' )? this_LBRACE_16= RULE_LBRACE otherlv_17= 'Retornar:' ( (lv_expression_18_0= ruleAdicion ) ) this_RBRACE_19= RULE_RBRACE )* )
            {
            // InternalPagos.g:1349:2: ( () otherlv_1= 'Si' this_LBRACKET_2= RULE_LBRACKET ( (lv_logExp_3_0= ruleExpresionLogica ) ) this_RBRACKET_4= RULE_RBRACKET otherlv_5= 'Entonces' this_LBRACE_6= RULE_LBRACE otherlv_7= 'Retornar:' ( (lv_expression_8_0= ruleAdicion ) ) this_RBRACE_9= RULE_RBRACE ( (otherlv_10= 'Sino' )? (otherlv_11= 'Si' this_LBRACKET_12= RULE_LBRACKET ( (lv_logExp_13_0= ruleExpresionLogica ) ) this_RBRACKET_14= RULE_RBRACKET otherlv_15= 'Entonces' )? this_LBRACE_16= RULE_LBRACE otherlv_17= 'Retornar:' ( (lv_expression_18_0= ruleAdicion ) ) this_RBRACE_19= RULE_RBRACE )* )
            // InternalPagos.g:1350:3: () otherlv_1= 'Si' this_LBRACKET_2= RULE_LBRACKET ( (lv_logExp_3_0= ruleExpresionLogica ) ) this_RBRACKET_4= RULE_RBRACKET otherlv_5= 'Entonces' this_LBRACE_6= RULE_LBRACE otherlv_7= 'Retornar:' ( (lv_expression_8_0= ruleAdicion ) ) this_RBRACE_9= RULE_RBRACE ( (otherlv_10= 'Sino' )? (otherlv_11= 'Si' this_LBRACKET_12= RULE_LBRACKET ( (lv_logExp_13_0= ruleExpresionLogica ) ) this_RBRACKET_14= RULE_RBRACKET otherlv_15= 'Entonces' )? this_LBRACE_16= RULE_LBRACE otherlv_17= 'Retornar:' ( (lv_expression_18_0= ruleAdicion ) ) this_RBRACE_19= RULE_RBRACE )*
            {
            // InternalPagos.g:1350:3: ()
            // InternalPagos.g:1351:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFormulaAccess().getFormulaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getFormulaAccess().getSiKeyword_1());
            		
            this_LBRACKET_2=(Token)match(input,RULE_LBRACKET,FOLLOW_25); 

            			newLeafNode(this_LBRACKET_2, grammarAccess.getFormulaAccess().getLBRACKETTerminalRuleCall_2());
            		
            // InternalPagos.g:1365:3: ( (lv_logExp_3_0= ruleExpresionLogica ) )
            // InternalPagos.g:1366:4: (lv_logExp_3_0= ruleExpresionLogica )
            {
            // InternalPagos.g:1366:4: (lv_logExp_3_0= ruleExpresionLogica )
            // InternalPagos.g:1367:5: lv_logExp_3_0= ruleExpresionLogica
            {

            					newCompositeNode(grammarAccess.getFormulaAccess().getLogExpExpresionLogicaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_logExp_3_0=ruleExpresionLogica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormulaRule());
            					}
            					add(
            						current,
            						"logExp",
            						lv_logExp_3_0,
            						"co.edu.uniandes.Pagos.ExpresionLogica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RBRACKET_4=(Token)match(input,RULE_RBRACKET,FOLLOW_27); 

            			newLeafNode(this_RBRACKET_4, grammarAccess.getFormulaAccess().getRBRACKETTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getFormulaAccess().getEntoncesKeyword_5());
            		
            this_LBRACE_6=(Token)match(input,RULE_LBRACE,FOLLOW_28); 

            			newLeafNode(this_LBRACE_6, grammarAccess.getFormulaAccess().getLBRACETerminalRuleCall_6());
            		
            otherlv_7=(Token)match(input,38,FOLLOW_29); 

            			newLeafNode(otherlv_7, grammarAccess.getFormulaAccess().getRetornarKeyword_7());
            		
            // InternalPagos.g:1400:3: ( (lv_expression_8_0= ruleAdicion ) )
            // InternalPagos.g:1401:4: (lv_expression_8_0= ruleAdicion )
            {
            // InternalPagos.g:1401:4: (lv_expression_8_0= ruleAdicion )
            // InternalPagos.g:1402:5: lv_expression_8_0= ruleAdicion
            {

            					newCompositeNode(grammarAccess.getFormulaAccess().getExpressionAdicionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_expression_8_0=ruleAdicion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormulaRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_8_0,
            						"co.edu.uniandes.Pagos.Adicion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RBRACE_9=(Token)match(input,RULE_RBRACE,FOLLOW_30); 

            			newLeafNode(this_RBRACE_9, grammarAccess.getFormulaAccess().getRBRACETerminalRuleCall_9());
            		
            // InternalPagos.g:1423:3: ( (otherlv_10= 'Sino' )? (otherlv_11= 'Si' this_LBRACKET_12= RULE_LBRACKET ( (lv_logExp_13_0= ruleExpresionLogica ) ) this_RBRACKET_14= RULE_RBRACKET otherlv_15= 'Entonces' )? this_LBRACE_16= RULE_LBRACE otherlv_17= 'Retornar:' ( (lv_expression_18_0= ruleAdicion ) ) this_RBRACE_19= RULE_RBRACE )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_LBRACE||LA16_0==36||LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPagos.g:1424:4: (otherlv_10= 'Sino' )? (otherlv_11= 'Si' this_LBRACKET_12= RULE_LBRACKET ( (lv_logExp_13_0= ruleExpresionLogica ) ) this_RBRACKET_14= RULE_RBRACKET otherlv_15= 'Entonces' )? this_LBRACE_16= RULE_LBRACE otherlv_17= 'Retornar:' ( (lv_expression_18_0= ruleAdicion ) ) this_RBRACE_19= RULE_RBRACE
            	    {
            	    // InternalPagos.g:1424:4: (otherlv_10= 'Sino' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==39) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalPagos.g:1425:5: otherlv_10= 'Sino'
            	            {
            	            otherlv_10=(Token)match(input,39,FOLLOW_31); 

            	            					newLeafNode(otherlv_10, grammarAccess.getFormulaAccess().getSinoKeyword_10_0());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalPagos.g:1430:4: (otherlv_11= 'Si' this_LBRACKET_12= RULE_LBRACKET ( (lv_logExp_13_0= ruleExpresionLogica ) ) this_RBRACKET_14= RULE_RBRACKET otherlv_15= 'Entonces' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==36) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalPagos.g:1431:5: otherlv_11= 'Si' this_LBRACKET_12= RULE_LBRACKET ( (lv_logExp_13_0= ruleExpresionLogica ) ) this_RBRACKET_14= RULE_RBRACKET otherlv_15= 'Entonces'
            	            {
            	            otherlv_11=(Token)match(input,36,FOLLOW_11); 

            	            					newLeafNode(otherlv_11, grammarAccess.getFormulaAccess().getSiKeyword_10_1_0());
            	            				
            	            this_LBRACKET_12=(Token)match(input,RULE_LBRACKET,FOLLOW_25); 

            	            					newLeafNode(this_LBRACKET_12, grammarAccess.getFormulaAccess().getLBRACKETTerminalRuleCall_10_1_1());
            	            				
            	            // InternalPagos.g:1439:5: ( (lv_logExp_13_0= ruleExpresionLogica ) )
            	            // InternalPagos.g:1440:6: (lv_logExp_13_0= ruleExpresionLogica )
            	            {
            	            // InternalPagos.g:1440:6: (lv_logExp_13_0= ruleExpresionLogica )
            	            // InternalPagos.g:1441:7: lv_logExp_13_0= ruleExpresionLogica
            	            {

            	            							newCompositeNode(grammarAccess.getFormulaAccess().getLogExpExpresionLogicaParserRuleCall_10_1_2_0());
            	            						
            	            pushFollow(FOLLOW_26);
            	            lv_logExp_13_0=ruleExpresionLogica();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getFormulaRule());
            	            							}
            	            							add(
            	            								current,
            	            								"logExp",
            	            								lv_logExp_13_0,
            	            								"co.edu.uniandes.Pagos.ExpresionLogica");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }

            	            this_RBRACKET_14=(Token)match(input,RULE_RBRACKET,FOLLOW_27); 

            	            					newLeafNode(this_RBRACKET_14, grammarAccess.getFormulaAccess().getRBRACKETTerminalRuleCall_10_1_3());
            	            				
            	            otherlv_15=(Token)match(input,37,FOLLOW_8); 

            	            					newLeafNode(otherlv_15, grammarAccess.getFormulaAccess().getEntoncesKeyword_10_1_4());
            	            				

            	            }
            	            break;

            	    }

            	    this_LBRACE_16=(Token)match(input,RULE_LBRACE,FOLLOW_28); 

            	    				newLeafNode(this_LBRACE_16, grammarAccess.getFormulaAccess().getLBRACETerminalRuleCall_10_2());
            	    			
            	    otherlv_17=(Token)match(input,38,FOLLOW_29); 

            	    				newLeafNode(otherlv_17, grammarAccess.getFormulaAccess().getRetornarKeyword_10_3());
            	    			
            	    // InternalPagos.g:1475:4: ( (lv_expression_18_0= ruleAdicion ) )
            	    // InternalPagos.g:1476:5: (lv_expression_18_0= ruleAdicion )
            	    {
            	    // InternalPagos.g:1476:5: (lv_expression_18_0= ruleAdicion )
            	    // InternalPagos.g:1477:6: lv_expression_18_0= ruleAdicion
            	    {

            	    						newCompositeNode(grammarAccess.getFormulaAccess().getExpressionAdicionParserRuleCall_10_4_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_expression_18_0=ruleAdicion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormulaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expression",
            	    							lv_expression_18_0,
            	    							"co.edu.uniandes.Pagos.Adicion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    this_RBRACE_19=(Token)match(input,RULE_RBRACE,FOLLOW_30); 

            	    				newLeafNode(this_RBRACE_19, grammarAccess.getFormulaAccess().getRBRACETerminalRuleCall_10_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleExpresionLogica"
    // InternalPagos.g:1503:1: entryRuleExpresionLogica returns [EObject current=null] : iv_ruleExpresionLogica= ruleExpresionLogica EOF ;
    public final EObject entryRuleExpresionLogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionLogica = null;


        try {
            // InternalPagos.g:1503:56: (iv_ruleExpresionLogica= ruleExpresionLogica EOF )
            // InternalPagos.g:1504:2: iv_ruleExpresionLogica= ruleExpresionLogica EOF
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
    // InternalPagos.g:1510:1: ruleExpresionLogica returns [EObject current=null] : ( ( (lv_variable_0_0= ruleTerminalValue ) ) ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+ (this_LOGICALCONN_4= RULE_LOGICALCONN ( (lv_exp_5_0= ruleExpresionLogica ) ) )? ) ;
    public final EObject ruleExpresionLogica() throws RecognitionException {
        EObject current = null;

        Token lv_logOper_1_0=null;
        Token lv_literal_3_0=null;
        Token this_LOGICALCONN_4=null;
        EObject lv_variable_0_0 = null;

        EObject lv_variable2_2_0 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1516:2: ( ( ( (lv_variable_0_0= ruleTerminalValue ) ) ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+ (this_LOGICALCONN_4= RULE_LOGICALCONN ( (lv_exp_5_0= ruleExpresionLogica ) ) )? ) )
            // InternalPagos.g:1517:2: ( ( (lv_variable_0_0= ruleTerminalValue ) ) ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+ (this_LOGICALCONN_4= RULE_LOGICALCONN ( (lv_exp_5_0= ruleExpresionLogica ) ) )? )
            {
            // InternalPagos.g:1517:2: ( ( (lv_variable_0_0= ruleTerminalValue ) ) ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+ (this_LOGICALCONN_4= RULE_LOGICALCONN ( (lv_exp_5_0= ruleExpresionLogica ) ) )? )
            // InternalPagos.g:1518:3: ( (lv_variable_0_0= ruleTerminalValue ) ) ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+ (this_LOGICALCONN_4= RULE_LOGICALCONN ( (lv_exp_5_0= ruleExpresionLogica ) ) )?
            {
            // InternalPagos.g:1518:3: ( (lv_variable_0_0= ruleTerminalValue ) )
            // InternalPagos.g:1519:4: (lv_variable_0_0= ruleTerminalValue )
            {
            // InternalPagos.g:1519:4: (lv_variable_0_0= ruleTerminalValue )
            // InternalPagos.g:1520:5: lv_variable_0_0= ruleTerminalValue
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

            // InternalPagos.g:1537:3: ( ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) ) )+
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
            	    // InternalPagos.g:1538:4: ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) ) ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) )
            	    {
            	    // InternalPagos.g:1538:4: ( (lv_logOper_1_0= RULE_OPERADORLOGICO ) )
            	    // InternalPagos.g:1539:5: (lv_logOper_1_0= RULE_OPERADORLOGICO )
            	    {
            	    // InternalPagos.g:1539:5: (lv_logOper_1_0= RULE_OPERADORLOGICO )
            	    // InternalPagos.g:1540:6: lv_logOper_1_0= RULE_OPERADORLOGICO
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

            	    // InternalPagos.g:1556:4: ( ( (lv_variable2_2_0= ruleTerminalValue ) ) | ( (lv_literal_3_0= RULE_STRING ) ) )
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
            	            // InternalPagos.g:1557:5: ( (lv_variable2_2_0= ruleTerminalValue ) )
            	            {
            	            // InternalPagos.g:1557:5: ( (lv_variable2_2_0= ruleTerminalValue ) )
            	            // InternalPagos.g:1558:6: (lv_variable2_2_0= ruleTerminalValue )
            	            {
            	            // InternalPagos.g:1558:6: (lv_variable2_2_0= ruleTerminalValue )
            	            // InternalPagos.g:1559:7: lv_variable2_2_0= ruleTerminalValue
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
            	            // InternalPagos.g:1577:5: ( (lv_literal_3_0= RULE_STRING ) )
            	            {
            	            // InternalPagos.g:1577:5: ( (lv_literal_3_0= RULE_STRING ) )
            	            // InternalPagos.g:1578:6: (lv_literal_3_0= RULE_STRING )
            	            {
            	            // InternalPagos.g:1578:6: (lv_literal_3_0= RULE_STRING )
            	            // InternalPagos.g:1579:7: lv_literal_3_0= RULE_STRING
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

            // InternalPagos.g:1597:3: (this_LOGICALCONN_4= RULE_LOGICALCONN ( (lv_exp_5_0= ruleExpresionLogica ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_LOGICALCONN) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPagos.g:1598:4: this_LOGICALCONN_4= RULE_LOGICALCONN ( (lv_exp_5_0= ruleExpresionLogica ) )
                    {
                    this_LOGICALCONN_4=(Token)match(input,RULE_LOGICALCONN,FOLLOW_25); 

                    				newLeafNode(this_LOGICALCONN_4, grammarAccess.getExpresionLogicaAccess().getLOGICALCONNTerminalRuleCall_2_0());
                    			
                    // InternalPagos.g:1602:4: ( (lv_exp_5_0= ruleExpresionLogica ) )
                    // InternalPagos.g:1603:5: (lv_exp_5_0= ruleExpresionLogica )
                    {
                    // InternalPagos.g:1603:5: (lv_exp_5_0= ruleExpresionLogica )
                    // InternalPagos.g:1604:6: lv_exp_5_0= ruleExpresionLogica
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
    // InternalPagos.g:1626:1: entryRuleAdicion returns [EObject current=null] : iv_ruleAdicion= ruleAdicion EOF ;
    public final EObject entryRuleAdicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdicion = null;


        try {
            // InternalPagos.g:1626:48: (iv_ruleAdicion= ruleAdicion EOF )
            // InternalPagos.g:1627:2: iv_ruleAdicion= ruleAdicion EOF
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
    // InternalPagos.g:1633:1: ruleAdicion returns [EObject current=null] : (this_Multiplicacion_0= ruleMultiplicacion ( () ( (lv_operator_2_0= rulemathADD ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )* ) ;
    public final EObject ruleAdicion() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplicacion_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rexp_3_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1639:2: ( (this_Multiplicacion_0= ruleMultiplicacion ( () ( (lv_operator_2_0= rulemathADD ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )* ) )
            // InternalPagos.g:1640:2: (this_Multiplicacion_0= ruleMultiplicacion ( () ( (lv_operator_2_0= rulemathADD ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )* )
            {
            // InternalPagos.g:1640:2: (this_Multiplicacion_0= ruleMultiplicacion ( () ( (lv_operator_2_0= rulemathADD ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )* )
            // InternalPagos.g:1641:3: this_Multiplicacion_0= ruleMultiplicacion ( () ( (lv_operator_2_0= rulemathADD ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdicionAccess().getMultiplicacionParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_Multiplicacion_0=ruleMultiplicacion();

            state._fsp--;


            			current = this_Multiplicacion_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPagos.g:1649:3: ( () ( (lv_operator_2_0= rulemathADD ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ADDOP) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPagos.g:1650:4: () ( (lv_operator_2_0= rulemathADD ) ) ( (lv_rexp_3_0= ruleMultiplicacion ) )
            	    {
            	    // InternalPagos.g:1650:4: ()
            	    // InternalPagos.g:1651:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdicionAccess().getAdicionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalPagos.g:1657:4: ( (lv_operator_2_0= rulemathADD ) )
            	    // InternalPagos.g:1658:5: (lv_operator_2_0= rulemathADD )
            	    {
            	    // InternalPagos.g:1658:5: (lv_operator_2_0= rulemathADD )
            	    // InternalPagos.g:1659:6: lv_operator_2_0= rulemathADD
            	    {

            	    						newCompositeNode(grammarAccess.getAdicionAccess().getOperatorMathADDParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_operator_2_0=rulemathADD();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdicionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"co.edu.uniandes.Pagos.mathADD");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPagos.g:1676:4: ( (lv_rexp_3_0= ruleMultiplicacion ) )
            	    // InternalPagos.g:1677:5: (lv_rexp_3_0= ruleMultiplicacion )
            	    {
            	    // InternalPagos.g:1677:5: (lv_rexp_3_0= ruleMultiplicacion )
            	    // InternalPagos.g:1678:6: lv_rexp_3_0= ruleMultiplicacion
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
    // InternalPagos.g:1700:1: entryRuleMultiplicacion returns [EObject current=null] : iv_ruleMultiplicacion= ruleMultiplicacion EOF ;
    public final EObject entryRuleMultiplicacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacion = null;


        try {
            // InternalPagos.g:1700:55: (iv_ruleMultiplicacion= ruleMultiplicacion EOF )
            // InternalPagos.g:1701:2: iv_ruleMultiplicacion= ruleMultiplicacion EOF
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
    // InternalPagos.g:1707:1: ruleMultiplicacion returns [EObject current=null] : (this_SigleExp_0= ruleSigleExp ( () ( (lv_operator_2_0= rulemathMULT ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )* ) ;
    public final EObject ruleMultiplicacion() throws RecognitionException {
        EObject current = null;

        EObject this_SigleExp_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rexp_3_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:1713:2: ( (this_SigleExp_0= ruleSigleExp ( () ( (lv_operator_2_0= rulemathMULT ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )* ) )
            // InternalPagos.g:1714:2: (this_SigleExp_0= ruleSigleExp ( () ( (lv_operator_2_0= rulemathMULT ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )* )
            {
            // InternalPagos.g:1714:2: (this_SigleExp_0= ruleSigleExp ( () ( (lv_operator_2_0= rulemathMULT ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )* )
            // InternalPagos.g:1715:3: this_SigleExp_0= ruleSigleExp ( () ( (lv_operator_2_0= rulemathMULT ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicacionAccess().getSigleExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_SigleExp_0=ruleSigleExp();

            state._fsp--;


            			current = this_SigleExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPagos.g:1723:3: ( () ( (lv_operator_2_0= rulemathMULT ) ) ( (lv_rexp_3_0= ruleSigleExp ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_MULTOP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPagos.g:1724:4: () ( (lv_operator_2_0= rulemathMULT ) ) ( (lv_rexp_3_0= ruleSigleExp ) )
            	    {
            	    // InternalPagos.g:1724:4: ()
            	    // InternalPagos.g:1725:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicacionAccess().getMultiplicacionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalPagos.g:1731:4: ( (lv_operator_2_0= rulemathMULT ) )
            	    // InternalPagos.g:1732:5: (lv_operator_2_0= rulemathMULT )
            	    {
            	    // InternalPagos.g:1732:5: (lv_operator_2_0= rulemathMULT )
            	    // InternalPagos.g:1733:6: lv_operator_2_0= rulemathMULT
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicacionAccess().getOperatorMathMULTParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_operator_2_0=rulemathMULT();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicacionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"co.edu.uniandes.Pagos.mathMULT");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPagos.g:1750:4: ( (lv_rexp_3_0= ruleSigleExp ) )
            	    // InternalPagos.g:1751:5: (lv_rexp_3_0= ruleSigleExp )
            	    {
            	    // InternalPagos.g:1751:5: (lv_rexp_3_0= ruleSigleExp )
            	    // InternalPagos.g:1752:6: lv_rexp_3_0= ruleSigleExp
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
    // InternalPagos.g:1774:1: entryRuleSigleExp returns [EObject current=null] : iv_ruleSigleExp= ruleSigleExp EOF ;
    public final EObject entryRuleSigleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigleExp = null;


        try {
            // InternalPagos.g:1774:49: (iv_ruleSigleExp= ruleSigleExp EOF )
            // InternalPagos.g:1775:2: iv_ruleSigleExp= ruleSigleExp EOF
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
    // InternalPagos.g:1781:1: ruleSigleExp returns [EObject current=null] : (this_TerminalValue_0= ruleTerminalValue | (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' ) ) ;
    public final EObject ruleSigleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_TerminalValue_0 = null;

        EObject this_Adicion_2 = null;



        	enterRule();

        try {
            // InternalPagos.g:1787:2: ( (this_TerminalValue_0= ruleTerminalValue | (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' ) ) )
            // InternalPagos.g:1788:2: (this_TerminalValue_0= ruleTerminalValue | (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' ) )
            {
            // InternalPagos.g:1788:2: (this_TerminalValue_0= ruleTerminalValue | (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' ) )
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
                    // InternalPagos.g:1789:3: this_TerminalValue_0= ruleTerminalValue
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
                    // InternalPagos.g:1798:3: (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' )
                    {
                    // InternalPagos.g:1798:3: (otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')' )
                    // InternalPagos.g:1799:4: otherlv_1= '(' this_Adicion_2= ruleAdicion otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_29); 

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


    // $ANTLR start "entryRuleSuperEntityAttribute"
    // InternalPagos.g:1820:1: entryRuleSuperEntityAttribute returns [EObject current=null] : iv_ruleSuperEntityAttribute= ruleSuperEntityAttribute EOF ;
    public final EObject entryRuleSuperEntityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperEntityAttribute = null;


        try {
            // InternalPagos.g:1820:61: (iv_ruleSuperEntityAttribute= ruleSuperEntityAttribute EOF )
            // InternalPagos.g:1821:2: iv_ruleSuperEntityAttribute= ruleSuperEntityAttribute EOF
            {
             newCompositeNode(grammarAccess.getSuperEntityAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperEntityAttribute=ruleSuperEntityAttribute();

            state._fsp--;

             current =iv_ruleSuperEntityAttribute; 
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
    // $ANTLR end "entryRuleSuperEntityAttribute"


    // $ANTLR start "ruleSuperEntityAttribute"
    // InternalPagos.g:1827:1: ruleSuperEntityAttribute returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ruleNumber )? this_RBRACE_7= RULE_RBRACE ) ;
    public final EObject ruleSuperEntityAttribute() throws RecognitionException {
        EObject current = null;

        Token this_LBRACE_1=null;
        Token lv_name_2_0=null;
        Token this_COLON_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token this_RBRACE_7=null;


        	enterRule();

        try {
            // InternalPagos.g:1833:2: ( ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ruleNumber )? this_RBRACE_7= RULE_RBRACE ) )
            // InternalPagos.g:1834:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ruleNumber )? this_RBRACE_7= RULE_RBRACE )
            {
            // InternalPagos.g:1834:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ruleNumber )? this_RBRACE_7= RULE_RBRACE )
            // InternalPagos.g:1835:3: () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ruleNumber )? this_RBRACE_7= RULE_RBRACE
            {
            // InternalPagos.g:1835:3: ()
            // InternalPagos.g:1836:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSuperEntityAttributeAccess().getSuperEntityAttributeAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_5); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getSuperEntityAttributeAccess().getLBRACETerminalRuleCall_1());
            		
            // InternalPagos.g:1846:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPagos.g:1847:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPagos.g:1847:4: (lv_name_2_0= RULE_ID )
            // InternalPagos.g:1848:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSuperEntityAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuperEntityAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.edu.uniandes.Pagos.ID");
            				

            }


            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_38); 

            			newLeafNode(this_COLON_3, grammarAccess.getSuperEntityAttributeAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalPagos.g:1868:3: ( (lv_type_4_0= RULE_TYPE ) )
            // InternalPagos.g:1869:4: (lv_type_4_0= RULE_TYPE )
            {
            // InternalPagos.g:1869:4: (lv_type_4_0= RULE_TYPE )
            // InternalPagos.g:1870:5: lv_type_4_0= RULE_TYPE
            {
            lv_type_4_0=(Token)match(input,RULE_TYPE,FOLLOW_39); 

            					newLeafNode(lv_type_4_0, grammarAccess.getSuperEntityAttributeAccess().getTypeTYPETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuperEntityAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_4_0,
            						"co.edu.uniandes.Pagos.TYPE");
            				

            }


            }

            // InternalPagos.g:1886:3: (otherlv_5= ':=' ruleNumber )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPagos.g:1887:4: otherlv_5= ':=' ruleNumber
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getSuperEntityAttributeAccess().getColonEqualsSignKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getSuperEntityAttributeAccess().getNumberParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_9);
                    ruleNumber();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            this_RBRACE_7=(Token)match(input,RULE_RBRACE,FOLLOW_2); 

            			newLeafNode(this_RBRACE_7, grammarAccess.getSuperEntityAttributeAccess().getRBRACETerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleSuperEntityAttribute"


    // $ANTLR start "entryRuleEntityAttribute"
    // InternalPagos.g:1907:1: entryRuleEntityAttribute returns [EObject current=null] : iv_ruleEntityAttribute= ruleEntityAttribute EOF ;
    public final EObject entryRuleEntityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityAttribute = null;


        try {
            // InternalPagos.g:1907:56: (iv_ruleEntityAttribute= ruleEntityAttribute EOF )
            // InternalPagos.g:1908:2: iv_ruleEntityAttribute= ruleEntityAttribute EOF
            {
             newCompositeNode(grammarAccess.getEntityAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityAttribute=ruleEntityAttribute();

            state._fsp--;

             current =iv_ruleEntityAttribute; 
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
    // $ANTLR end "entryRuleEntityAttribute"


    // $ANTLR start "ruleEntityAttribute"
    // InternalPagos.g:1914:1: ruleEntityAttribute returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ruleNumber )? this_RBRACE_7= RULE_RBRACE ) ;
    public final EObject ruleEntityAttribute() throws RecognitionException {
        EObject current = null;

        Token this_LBRACE_1=null;
        Token lv_name_2_0=null;
        Token this_COLON_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token this_RBRACE_7=null;


        	enterRule();

        try {
            // InternalPagos.g:1920:2: ( ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ruleNumber )? this_RBRACE_7= RULE_RBRACE ) )
            // InternalPagos.g:1921:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ruleNumber )? this_RBRACE_7= RULE_RBRACE )
            {
            // InternalPagos.g:1921:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ruleNumber )? this_RBRACE_7= RULE_RBRACE )
            // InternalPagos.g:1922:3: () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ruleNumber )? this_RBRACE_7= RULE_RBRACE
            {
            // InternalPagos.g:1922:3: ()
            // InternalPagos.g:1923:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAttributeAccess().getEntityAttributeAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_5); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getEntityAttributeAccess().getLBRACETerminalRuleCall_1());
            		
            // InternalPagos.g:1933:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPagos.g:1934:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPagos.g:1934:4: (lv_name_2_0= RULE_ID )
            // InternalPagos.g:1935:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEntityAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.edu.uniandes.Pagos.ID");
            				

            }


            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_38); 

            			newLeafNode(this_COLON_3, grammarAccess.getEntityAttributeAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalPagos.g:1955:3: ( (lv_type_4_0= RULE_TYPE ) )
            // InternalPagos.g:1956:4: (lv_type_4_0= RULE_TYPE )
            {
            // InternalPagos.g:1956:4: (lv_type_4_0= RULE_TYPE )
            // InternalPagos.g:1957:5: lv_type_4_0= RULE_TYPE
            {
            lv_type_4_0=(Token)match(input,RULE_TYPE,FOLLOW_39); 

            					newLeafNode(lv_type_4_0, grammarAccess.getEntityAttributeAccess().getTypeTYPETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_4_0,
            						"co.edu.uniandes.Pagos.TYPE");
            				

            }


            }

            // InternalPagos.g:1973:3: (otherlv_5= ':=' ruleNumber )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPagos.g:1974:4: otherlv_5= ':=' ruleNumber
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityAttributeAccess().getColonEqualsSignKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getEntityAttributeAccess().getNumberParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_9);
                    ruleNumber();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            this_RBRACE_7=(Token)match(input,RULE_RBRACE,FOLLOW_2); 

            			newLeafNode(this_RBRACE_7, grammarAccess.getEntityAttributeAccess().getRBRACETerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleEntityAttribute"


    // $ANTLR start "entryRuleFormAttribute"
    // InternalPagos.g:1994:1: entryRuleFormAttribute returns [EObject current=null] : iv_ruleFormAttribute= ruleFormAttribute EOF ;
    public final EObject entryRuleFormAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormAttribute = null;


        try {
            // InternalPagos.g:1994:54: (iv_ruleFormAttribute= ruleFormAttribute EOF )
            // InternalPagos.g:1995:2: iv_ruleFormAttribute= ruleFormAttribute EOF
            {
             newCompositeNode(grammarAccess.getFormAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormAttribute=ruleFormAttribute();

            state._fsp--;

             current =iv_ruleFormAttribute; 
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
    // $ANTLR end "entryRuleFormAttribute"


    // $ANTLR start "ruleFormAttribute"
    // InternalPagos.g:2001:1: ruleFormAttribute returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? this_RBRACE_7= RULE_RBRACE ) ;
    public final EObject ruleFormAttribute() throws RecognitionException {
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
            // InternalPagos.g:2007:2: ( ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? this_RBRACE_7= RULE_RBRACE ) )
            // InternalPagos.g:2008:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? this_RBRACE_7= RULE_RBRACE )
            {
            // InternalPagos.g:2008:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? this_RBRACE_7= RULE_RBRACE )
            // InternalPagos.g:2009:3: () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? this_RBRACE_7= RULE_RBRACE
            {
            // InternalPagos.g:2009:3: ()
            // InternalPagos.g:2010:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFormAttributeAccess().getFormAttributeAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_5); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getFormAttributeAccess().getLBRACETerminalRuleCall_1());
            		
            // InternalPagos.g:2020:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPagos.g:2021:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPagos.g:2021:4: (lv_name_2_0= RULE_ID )
            // InternalPagos.g:2022:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFormAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.edu.uniandes.Pagos.ID");
            				

            }


            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_38); 

            			newLeafNode(this_COLON_3, grammarAccess.getFormAttributeAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalPagos.g:2042:3: ( (lv_type_4_0= RULE_TYPE ) )
            // InternalPagos.g:2043:4: (lv_type_4_0= RULE_TYPE )
            {
            // InternalPagos.g:2043:4: (lv_type_4_0= RULE_TYPE )
            // InternalPagos.g:2044:5: lv_type_4_0= RULE_TYPE
            {
            lv_type_4_0=(Token)match(input,RULE_TYPE,FOLLOW_39); 

            					newLeafNode(lv_type_4_0, grammarAccess.getFormAttributeAccess().getTypeTYPETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_4_0,
            						"co.edu.uniandes.Pagos.TYPE");
            				

            }


            }

            // InternalPagos.g:2060:3: (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPagos.g:2061:4: otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) )
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_5, grammarAccess.getFormAttributeAccess().getColonEqualsSignKeyword_5_0());
                    			
                    // InternalPagos.g:2065:4: ( (lv_exp_6_0= ruleAdicion ) )
                    // InternalPagos.g:2066:5: (lv_exp_6_0= ruleAdicion )
                    {
                    // InternalPagos.g:2066:5: (lv_exp_6_0= ruleAdicion )
                    // InternalPagos.g:2067:6: lv_exp_6_0= ruleAdicion
                    {

                    						newCompositeNode(grammarAccess.getFormAttributeAccess().getExpAdicionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_exp_6_0=ruleAdicion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormAttributeRule());
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

            			newLeafNode(this_RBRACE_7, grammarAccess.getFormAttributeAccess().getRBRACETerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleFormAttribute"


    // $ANTLR start "entryRuleVariableAttribute"
    // InternalPagos.g:2093:1: entryRuleVariableAttribute returns [EObject current=null] : iv_ruleVariableAttribute= ruleVariableAttribute EOF ;
    public final EObject entryRuleVariableAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAttribute = null;


        try {
            // InternalPagos.g:2093:58: (iv_ruleVariableAttribute= ruleVariableAttribute EOF )
            // InternalPagos.g:2094:2: iv_ruleVariableAttribute= ruleVariableAttribute EOF
            {
             newCompositeNode(grammarAccess.getVariableAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableAttribute=ruleVariableAttribute();

            state._fsp--;

             current =iv_ruleVariableAttribute; 
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
    // $ANTLR end "entryRuleVariableAttribute"


    // $ANTLR start "ruleVariableAttribute"
    // InternalPagos.g:2100:1: ruleVariableAttribute returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? this_RBRACE_7= RULE_RBRACE ) ;
    public final EObject ruleVariableAttribute() throws RecognitionException {
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
            // InternalPagos.g:2106:2: ( ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? this_RBRACE_7= RULE_RBRACE ) )
            // InternalPagos.g:2107:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? this_RBRACE_7= RULE_RBRACE )
            {
            // InternalPagos.g:2107:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? this_RBRACE_7= RULE_RBRACE )
            // InternalPagos.g:2108:3: () this_LBRACE_1= RULE_LBRACE ( (lv_name_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_type_4_0= RULE_TYPE ) ) (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )? this_RBRACE_7= RULE_RBRACE
            {
            // InternalPagos.g:2108:3: ()
            // InternalPagos.g:2109:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAttributeAccess().getVariableAttributeAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_5); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getVariableAttributeAccess().getLBRACETerminalRuleCall_1());
            		
            // InternalPagos.g:2119:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPagos.g:2120:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPagos.g:2120:4: (lv_name_2_0= RULE_ID )
            // InternalPagos.g:2121:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVariableAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.edu.uniandes.Pagos.ID");
            				

            }


            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_38); 

            			newLeafNode(this_COLON_3, grammarAccess.getVariableAttributeAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalPagos.g:2141:3: ( (lv_type_4_0= RULE_TYPE ) )
            // InternalPagos.g:2142:4: (lv_type_4_0= RULE_TYPE )
            {
            // InternalPagos.g:2142:4: (lv_type_4_0= RULE_TYPE )
            // InternalPagos.g:2143:5: lv_type_4_0= RULE_TYPE
            {
            lv_type_4_0=(Token)match(input,RULE_TYPE,FOLLOW_39); 

            					newLeafNode(lv_type_4_0, grammarAccess.getVariableAttributeAccess().getTypeTYPETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_4_0,
            						"co.edu.uniandes.Pagos.TYPE");
            				

            }


            }

            // InternalPagos.g:2159:3: (otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPagos.g:2160:4: otherlv_5= ':=' ( (lv_exp_6_0= ruleAdicion ) )
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_5, grammarAccess.getVariableAttributeAccess().getColonEqualsSignKeyword_5_0());
                    			
                    // InternalPagos.g:2164:4: ( (lv_exp_6_0= ruleAdicion ) )
                    // InternalPagos.g:2165:5: (lv_exp_6_0= ruleAdicion )
                    {
                    // InternalPagos.g:2165:5: (lv_exp_6_0= ruleAdicion )
                    // InternalPagos.g:2166:6: lv_exp_6_0= ruleAdicion
                    {

                    						newCompositeNode(grammarAccess.getVariableAttributeAccess().getExpAdicionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_exp_6_0=ruleAdicion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableAttributeRule());
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

            			newLeafNode(this_RBRACE_7, grammarAccess.getVariableAttributeAccess().getRBRACETerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleVariableAttribute"


    // $ANTLR start "entryRuleTerminalValue"
    // InternalPagos.g:2192:1: entryRuleTerminalValue returns [EObject current=null] : iv_ruleTerminalValue= ruleTerminalValue EOF ;
    public final EObject entryRuleTerminalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalValue = null;


        try {
            // InternalPagos.g:2192:54: (iv_ruleTerminalValue= ruleTerminalValue EOF )
            // InternalPagos.g:2193:2: iv_ruleTerminalValue= ruleTerminalValue EOF
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
    // InternalPagos.g:2199:1: ruleTerminalValue returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( (lv_valor_2_0= ruleNumber ) ) ) ;
    public final EObject ruleTerminalValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_valor_2_0 = null;



        	enterRule();

        try {
            // InternalPagos.g:2205:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( (lv_valor_2_0= ruleNumber ) ) ) )
            // InternalPagos.g:2206:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( (lv_valor_2_0= ruleNumber ) ) )
            {
            // InternalPagos.g:2206:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( (lv_valor_2_0= ruleNumber ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_INT||LA27_0==43) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalPagos.g:2207:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalPagos.g:2207:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    // InternalPagos.g:2208:4: () ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalPagos.g:2208:4: ()
                    // InternalPagos.g:2209:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalValueAccess().getTerminalValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalPagos.g:2215:4: ( (otherlv_1= RULE_ID ) )
                    // InternalPagos.g:2216:5: (otherlv_1= RULE_ID )
                    {
                    // InternalPagos.g:2216:5: (otherlv_1= RULE_ID )
                    // InternalPagos.g:2217:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalValueRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getTerminalValueAccess().getVariableCalculationAttributeCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPagos.g:2230:3: ( (lv_valor_2_0= ruleNumber ) )
                    {
                    // InternalPagos.g:2230:3: ( (lv_valor_2_0= ruleNumber ) )
                    // InternalPagos.g:2231:4: (lv_valor_2_0= ruleNumber )
                    {
                    // InternalPagos.g:2231:4: (lv_valor_2_0= ruleNumber )
                    // InternalPagos.g:2232:5: lv_valor_2_0= ruleNumber
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


    // $ANTLR start "entryRulemathADD"
    // InternalPagos.g:2253:1: entryRulemathADD returns [EObject current=null] : iv_rulemathADD= rulemathADD EOF ;
    public final EObject entryRulemathADD() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemathADD = null;


        try {
            // InternalPagos.g:2253:48: (iv_rulemathADD= rulemathADD EOF )
            // InternalPagos.g:2254:2: iv_rulemathADD= rulemathADD EOF
            {
             newCompositeNode(grammarAccess.getMathADDRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemathADD=rulemathADD();

            state._fsp--;

             current =iv_rulemathADD; 
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
    // $ANTLR end "entryRulemathADD"


    // $ANTLR start "rulemathADD"
    // InternalPagos.g:2260:1: rulemathADD returns [EObject current=null] : ( () ( (lv_operador_1_0= RULE_ADDOP ) ) ) ;
    public final EObject rulemathADD() throws RecognitionException {
        EObject current = null;

        Token lv_operador_1_0=null;


        	enterRule();

        try {
            // InternalPagos.g:2266:2: ( ( () ( (lv_operador_1_0= RULE_ADDOP ) ) ) )
            // InternalPagos.g:2267:2: ( () ( (lv_operador_1_0= RULE_ADDOP ) ) )
            {
            // InternalPagos.g:2267:2: ( () ( (lv_operador_1_0= RULE_ADDOP ) ) )
            // InternalPagos.g:2268:3: () ( (lv_operador_1_0= RULE_ADDOP ) )
            {
            // InternalPagos.g:2268:3: ()
            // InternalPagos.g:2269:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMathADDAccess().getMathADDAction_0(),
            					current);
            			

            }

            // InternalPagos.g:2275:3: ( (lv_operador_1_0= RULE_ADDOP ) )
            // InternalPagos.g:2276:4: (lv_operador_1_0= RULE_ADDOP )
            {
            // InternalPagos.g:2276:4: (lv_operador_1_0= RULE_ADDOP )
            // InternalPagos.g:2277:5: lv_operador_1_0= RULE_ADDOP
            {
            lv_operador_1_0=(Token)match(input,RULE_ADDOP,FOLLOW_2); 

            					newLeafNode(lv_operador_1_0, grammarAccess.getMathADDAccess().getOperadorADDOPTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMathADDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operador",
            						lv_operador_1_0,
            						"co.edu.uniandes.Pagos.ADDOP");
            				

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
    // $ANTLR end "rulemathADD"


    // $ANTLR start "entryRulemathMULT"
    // InternalPagos.g:2297:1: entryRulemathMULT returns [EObject current=null] : iv_rulemathMULT= rulemathMULT EOF ;
    public final EObject entryRulemathMULT() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemathMULT = null;


        try {
            // InternalPagos.g:2297:49: (iv_rulemathMULT= rulemathMULT EOF )
            // InternalPagos.g:2298:2: iv_rulemathMULT= rulemathMULT EOF
            {
             newCompositeNode(grammarAccess.getMathMULTRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemathMULT=rulemathMULT();

            state._fsp--;

             current =iv_rulemathMULT; 
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
    // $ANTLR end "entryRulemathMULT"


    // $ANTLR start "rulemathMULT"
    // InternalPagos.g:2304:1: rulemathMULT returns [EObject current=null] : ( () ( (lv_operador_1_0= RULE_MULTOP ) ) ) ;
    public final EObject rulemathMULT() throws RecognitionException {
        EObject current = null;

        Token lv_operador_1_0=null;


        	enterRule();

        try {
            // InternalPagos.g:2310:2: ( ( () ( (lv_operador_1_0= RULE_MULTOP ) ) ) )
            // InternalPagos.g:2311:2: ( () ( (lv_operador_1_0= RULE_MULTOP ) ) )
            {
            // InternalPagos.g:2311:2: ( () ( (lv_operador_1_0= RULE_MULTOP ) ) )
            // InternalPagos.g:2312:3: () ( (lv_operador_1_0= RULE_MULTOP ) )
            {
            // InternalPagos.g:2312:3: ()
            // InternalPagos.g:2313:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMathMULTAccess().getMathMULTAction_0(),
            					current);
            			

            }

            // InternalPagos.g:2319:3: ( (lv_operador_1_0= RULE_MULTOP ) )
            // InternalPagos.g:2320:4: (lv_operador_1_0= RULE_MULTOP )
            {
            // InternalPagos.g:2320:4: (lv_operador_1_0= RULE_MULTOP )
            // InternalPagos.g:2321:5: lv_operador_1_0= RULE_MULTOP
            {
            lv_operador_1_0=(Token)match(input,RULE_MULTOP,FOLLOW_2); 

            					newLeafNode(lv_operador_1_0, grammarAccess.getMathMULTAccess().getOperadorMULTOPTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMathMULTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operador",
            						lv_operador_1_0,
            						"co.edu.uniandes.Pagos.MULTOP");
            				

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
    // $ANTLR end "rulemathMULT"


    // $ANTLR start "entryRuleNumber"
    // InternalPagos.g:2341:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalPagos.g:2341:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalPagos.g:2342:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalPagos.g:2348:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EDouble_0= ruleEDouble | this_Integer_1= ruleInteger ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EDouble_0 = null;

        AntlrDatatypeRuleToken this_Integer_1 = null;



        	enterRule();

        try {
            // InternalPagos.g:2354:2: ( (this_EDouble_0= ruleEDouble | this_Integer_1= ruleInteger ) )
            // InternalPagos.g:2355:2: (this_EDouble_0= ruleEDouble | this_Integer_1= ruleInteger )
            {
            // InternalPagos.g:2355:2: (this_EDouble_0= ruleEDouble | this_Integer_1= ruleInteger )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==EOF||LA28_1==RULE_RBRACE||LA28_1==RULE_RBRACKET||(LA28_1>=RULE_OPERADORLOGICO && LA28_1<=RULE_LOGICALCONN)||(LA28_1>=RULE_ADDOP && LA28_1<=RULE_MULTOP)||LA28_1==41) ) {
                    alt28=2;
                }
                else if ( (LA28_1==43) ) {
                    alt28=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA28_0==43) ) {
                alt28=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalPagos.g:2356:3: this_EDouble_0= ruleEDouble
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
                    // InternalPagos.g:2367:3: this_Integer_1= ruleInteger
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
    // InternalPagos.g:2381:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalPagos.g:2381:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalPagos.g:2382:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalPagos.g:2388:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_5=null;


        	enterRule();

        try {
            // InternalPagos.g:2394:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? ) )
            // InternalPagos.g:2395:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? )
            {
            // InternalPagos.g:2395:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? )
            // InternalPagos.g:2396:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )?
            {
            // InternalPagos.g:2396:3: (this_INT_0= RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPagos.g:2397:4: this_INT_0= RULE_INT
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
            		
            // InternalPagos.g:2417:3: ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=44 && LA31_0<=45)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPagos.g:2418:4: (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT
                    {
                    // InternalPagos.g:2418:4: (kw= 'E' | kw= 'e' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==44) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==45) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalPagos.g:2419:5: kw= 'E'
                            {
                            kw=(Token)match(input,44,FOLLOW_41); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPagos.g:2425:5: kw= 'e'
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
    // InternalPagos.g:2443:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalPagos.g:2443:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalPagos.g:2444:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalPagos.g:2450:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPagos.g:2456:2: (this_INT_0= RULE_INT )
            // InternalPagos.g:2457:2: this_INT_0= RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000020040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000090000020040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000009000000012L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000020840L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000300000000002L});

}