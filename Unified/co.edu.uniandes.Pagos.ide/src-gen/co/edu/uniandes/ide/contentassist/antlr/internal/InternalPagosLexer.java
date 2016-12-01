package co.edu.uniandes.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPagosLexer extends Lexer {
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

    public InternalPagosLexer() {;} 
    public InternalPagosLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPagosLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPagos.g"; }

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:11:7: ( 'size()' )
            // InternalPagos.g:11:9: 'size()'
            {
            match("size()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:12:7: ( 'getCantidadDiasHabiles()' )
            // InternalPagos.g:12:9: 'getCantidadDiasHabiles()'
            {
            match("getCantidadDiasHabiles()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:13:7: ( 'getRiegoTabla2()' )
            // InternalPagos.g:13:9: 'getRiegoTabla2()'
            {
            match("getRiegoTabla2()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:14:7: ( 'E' )
            // InternalPagos.g:14:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:15:7: ( 'e' )
            // InternalPagos.g:15:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:16:7: ( 'name' )
            // InternalPagos.g:16:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:17:7: ( 'intermediary' )
            // InternalPagos.g:17:9: 'intermediary'
            {
            match("intermediary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:18:7: ( 'superentities' )
            // InternalPagos.g:18:9: 'superentities'
            {
            match("superentities"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:19:7: ( 'description' )
            // InternalPagos.g:19:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:20:7: ( 'attributes' )
            // InternalPagos.g:20:9: 'attributes'
            {
            match("attributes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:21:7: ( 'entities' )
            // InternalPagos.g:21:9: 'entities'
            {
            match("entities"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:22:7: ( 'InformationTemplate' )
            // InternalPagos.g:22:9: 'InformationTemplate'
            {
            match("InformationTemplate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:23:7: ( 'FormAttributes' )
            // InternalPagos.g:23:9: 'FormAttributes'
            {
            match("FormAttributes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:24:7: ( 'calculationtemplates' )
            // InternalPagos.g:24:9: 'calculationtemplates'
            {
            match("calculationtemplates"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:25:7: ( 'providers' )
            // InternalPagos.g:25:9: 'providers'
            {
            match("providers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:26:7: ( 'calculationrules' )
            // InternalPagos.g:26:9: 'calculationrules'
            {
            match("calculationrules"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:27:7: ( 'calculationattributes' )
            // InternalPagos.g:27:9: 'calculationattributes'
            {
            match("calculationattributes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:28:7: ( '(' )
            // InternalPagos.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:29:7: ( ')' )
            // InternalPagos.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:30:7: ( ':=' )
            // InternalPagos.g:30:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:31:7: ( 'PA' )
            // InternalPagos.g:31:9: 'PA'
            {
            match("PA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:32:7: ( 'SU' )
            // InternalPagos.g:32:9: 'SU'
            {
            match("SU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:33:7: ( 'IT' )
            // InternalPagos.g:33:9: 'IT'
            {
            match("IT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:34:7: ( 'FU' )
            // InternalPagos.g:34:9: 'FU'
            {
            match("FU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "RULE_INDEX"
    public final void mRULE_INDEX() throws RecognitionException {
        try {
            int _type = RULE_INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8968:12: ( '@Indice' )
            // InternalPagos.g:8968:14: '@Indice'
            {
            match("@Indice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INDEX"

    // $ANTLR start "RULE_IF"
    public final void mRULE_IF() throws RecognitionException {
        try {
            int _type = RULE_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8970:9: ( 'SI' )
            // InternalPagos.g:8970:11: 'SI'
            {
            match("SI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IF"

    // $ANTLR start "RULE_THEN"
    public final void mRULE_THEN() throws RecognitionException {
        try {
            int _type = RULE_THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8972:11: ( 'ENTONCES' )
            // InternalPagos.g:8972:13: 'ENTONCES'
            {
            match("ENTONCES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THEN"

    // $ANTLR start "RULE_ELSE"
    public final void mRULE_ELSE() throws RecognitionException {
        try {
            int _type = RULE_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8974:11: ( 'SINO' )
            // InternalPagos.g:8974:13: 'SINO'
            {
            match("SINO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELSE"

    // $ANTLR start "RULE_RETURN"
    public final void mRULE_RETURN() throws RecognitionException {
        try {
            int _type = RULE_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8976:13: ( 'RETORNAR' )
            // InternalPagos.g:8976:15: 'RETORNAR'
            {
            match("RETORNAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RETURN"

    // $ANTLR start "RULE_TYPE"
    public final void mRULE_TYPE() throws RecognitionException {
        try {
            int _type = RULE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8978:11: ( ( 'String' | 'Integer' | 'Date' | 'Double' | 'Long' ) )
            // InternalPagos.g:8978:13: ( 'String' | 'Integer' | 'Date' | 'Double' | 'Long' )
            {
            // InternalPagos.g:8978:13: ( 'String' | 'Integer' | 'Date' | 'Double' | 'Long' )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 'S':
                {
                alt1=1;
                }
                break;
            case 'I':
                {
                alt1=2;
                }
                break;
            case 'D':
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='a') ) {
                    alt1=3;
                }
                else if ( (LA1_3=='o') ) {
                    alt1=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 'L':
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPagos.g:8978:14: 'String'
                    {
                    match("String"); 


                    }
                    break;
                case 2 :
                    // InternalPagos.g:8978:23: 'Integer'
                    {
                    match("Integer"); 


                    }
                    break;
                case 3 :
                    // InternalPagos.g:8978:33: 'Date'
                    {
                    match("Date"); 


                    }
                    break;
                case 4 :
                    // InternalPagos.g:8978:40: 'Double'
                    {
                    match("Double"); 


                    }
                    break;
                case 5 :
                    // InternalPagos.g:8978:49: 'Long'
                    {
                    match("Long"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE"

    // $ANTLR start "RULE_MULTOP"
    public final void mRULE_MULTOP() throws RecognitionException {
        try {
            int _type = RULE_MULTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8980:13: ( ( '*' | '/' ) )
            // InternalPagos.g:8980:15: ( '*' | '/' )
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTOP"

    // $ANTLR start "RULE_ADDOP"
    public final void mRULE_ADDOP() throws RecognitionException {
        try {
            int _type = RULE_ADDOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8982:12: ( ( '+' | '-' ) )
            // InternalPagos.g:8982:14: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADDOP"

    // $ANTLR start "RULE_LOGICALCONN"
    public final void mRULE_LOGICALCONN() throws RecognitionException {
        try {
            int _type = RULE_LOGICALCONN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8984:18: ( ( '&&' | '||' ) )
            // InternalPagos.g:8984:20: ( '&&' | '||' )
            {
            // InternalPagos.g:8984:20: ( '&&' | '||' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='&') ) {
                alt2=1;
            }
            else if ( (LA2_0=='|') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPagos.g:8984:21: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 2 :
                    // InternalPagos.g:8984:26: '||'
                    {
                    match("||"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOGICALCONN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8986:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPagos.g:8986:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPagos.g:8986:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPagos.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_OPERADORLOGICO"
    public final void mRULE_OPERADORLOGICO() throws RecognitionException {
        try {
            int _type = RULE_OPERADORLOGICO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8988:21: ( ( '<' | '>' | '<=' | '>=' | '==' | '<>' | '!=' ) )
            // InternalPagos.g:8988:23: ( '<' | '>' | '<=' | '>=' | '==' | '<>' | '!=' )
            {
            // InternalPagos.g:8988:23: ( '<' | '>' | '<=' | '>=' | '==' | '<>' | '!=' )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalPagos.g:8988:24: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // InternalPagos.g:8988:28: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // InternalPagos.g:8988:32: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // InternalPagos.g:8988:37: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // InternalPagos.g:8988:42: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 6 :
                    // InternalPagos.g:8988:47: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 7 :
                    // InternalPagos.g:8988:52: '!='
                    {
                    match("!="); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPERADORLOGICO"

    // $ANTLR start "RULE_LBRACE"
    public final void mRULE_LBRACE() throws RecognitionException {
        try {
            int _type = RULE_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8990:13: ( '{' )
            // InternalPagos.g:8990:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACE"

    // $ANTLR start "RULE_RBRACE"
    public final void mRULE_RBRACE() throws RecognitionException {
        try {
            int _type = RULE_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8992:13: ( '}' )
            // InternalPagos.g:8992:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACE"

    // $ANTLR start "RULE_LBRACKET"
    public final void mRULE_LBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8994:15: ( '[' )
            // InternalPagos.g:8994:17: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACKET"

    // $ANTLR start "RULE_RBRACKET"
    public final void mRULE_RBRACKET() throws RecognitionException {
        try {
            int _type = RULE_RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8996:15: ( ']' )
            // InternalPagos.g:8996:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACKET"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:8998:12: ( ',' )
            // InternalPagos.g:8998:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:9000:12: ( ':' )
            // InternalPagos.g:9000:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_DASH"
    public final void mRULE_DASH() throws RecognitionException {
        try {
            int _type = RULE_DASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:9002:11: ( '#' )
            // InternalPagos.g:9002:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DASH"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:9004:10: ( '.' )
            // InternalPagos.g:9004:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:9006:13: ( '\"' ( RULE_STR_ESC | ~ ( ( '\"' | '\\r' | '\\n' | '\\\\' ) ) )* '\"' )
            // InternalPagos.g:9006:15: '\"' ( RULE_STR_ESC | ~ ( ( '\"' | '\\r' | '\\n' | '\\\\' ) ) )* '\"'
            {
            match('\"'); 
            // InternalPagos.g:9006:19: ( RULE_STR_ESC | ~ ( ( '\"' | '\\r' | '\\n' | '\\\\' ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPagos.g:9006:20: RULE_STR_ESC
            	    {
            	    mRULE_STR_ESC(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalPagos.g:9006:33: ~ ( ( '\"' | '\\r' | '\\n' | '\\\\' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_STR_ESC"
    public final void mRULE_STR_ESC() throws RecognitionException {
        try {
            // InternalPagos.g:9008:23: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\\\' | '$' ) )
            // InternalPagos.g:9008:25: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\\\' | '$' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='$'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_STR_ESC"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:9010:10: ( ( '0' .. '9' )+ )
            // InternalPagos.g:9010:12: ( '0' .. '9' )+
            {
            // InternalPagos.g:9010:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPagos.g:9010:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:9012:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPagos.g:9012:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPagos.g:9012:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPagos.g:9012:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:9014:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPagos.g:9014:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPagos.g:9014:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPagos.g:9014:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalPagos.g:9014:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPagos.g:9014:41: ( '\\r' )? '\\n'
                    {
                    // InternalPagos.g:9014:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPagos.g:9014:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:9016:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPagos.g:9016:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPagos.g:9016:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPagos.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:9018:16: ( . )
            // InternalPagos.g:9018:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPagos.g:1:8: ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_INDEX | RULE_IF | RULE_THEN | RULE_ELSE | RULE_RETURN | RULE_TYPE | RULE_MULTOP | RULE_ADDOP | RULE_LOGICALCONN | RULE_ID | RULE_OPERADORLOGICO | RULE_LBRACE | RULE_RBRACE | RULE_LBRACKET | RULE_RBRACKET | RULE_COMMA | RULE_COLON | RULE_DASH | RULE_DOT | RULE_STRING | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=49;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalPagos.g:1:10: T__30
                {
                mT__30(); 

                }
                break;
            case 2 :
                // InternalPagos.g:1:16: T__31
                {
                mT__31(); 

                }
                break;
            case 3 :
                // InternalPagos.g:1:22: T__32
                {
                mT__32(); 

                }
                break;
            case 4 :
                // InternalPagos.g:1:28: T__33
                {
                mT__33(); 

                }
                break;
            case 5 :
                // InternalPagos.g:1:34: T__34
                {
                mT__34(); 

                }
                break;
            case 6 :
                // InternalPagos.g:1:40: T__35
                {
                mT__35(); 

                }
                break;
            case 7 :
                // InternalPagos.g:1:46: T__36
                {
                mT__36(); 

                }
                break;
            case 8 :
                // InternalPagos.g:1:52: T__37
                {
                mT__37(); 

                }
                break;
            case 9 :
                // InternalPagos.g:1:58: T__38
                {
                mT__38(); 

                }
                break;
            case 10 :
                // InternalPagos.g:1:64: T__39
                {
                mT__39(); 

                }
                break;
            case 11 :
                // InternalPagos.g:1:70: T__40
                {
                mT__40(); 

                }
                break;
            case 12 :
                // InternalPagos.g:1:76: T__41
                {
                mT__41(); 

                }
                break;
            case 13 :
                // InternalPagos.g:1:82: T__42
                {
                mT__42(); 

                }
                break;
            case 14 :
                // InternalPagos.g:1:88: T__43
                {
                mT__43(); 

                }
                break;
            case 15 :
                // InternalPagos.g:1:94: T__44
                {
                mT__44(); 

                }
                break;
            case 16 :
                // InternalPagos.g:1:100: T__45
                {
                mT__45(); 

                }
                break;
            case 17 :
                // InternalPagos.g:1:106: T__46
                {
                mT__46(); 

                }
                break;
            case 18 :
                // InternalPagos.g:1:112: T__47
                {
                mT__47(); 

                }
                break;
            case 19 :
                // InternalPagos.g:1:118: T__48
                {
                mT__48(); 

                }
                break;
            case 20 :
                // InternalPagos.g:1:124: T__49
                {
                mT__49(); 

                }
                break;
            case 21 :
                // InternalPagos.g:1:130: T__50
                {
                mT__50(); 

                }
                break;
            case 22 :
                // InternalPagos.g:1:136: T__51
                {
                mT__51(); 

                }
                break;
            case 23 :
                // InternalPagos.g:1:142: T__52
                {
                mT__52(); 

                }
                break;
            case 24 :
                // InternalPagos.g:1:148: T__53
                {
                mT__53(); 

                }
                break;
            case 25 :
                // InternalPagos.g:1:154: RULE_INDEX
                {
                mRULE_INDEX(); 

                }
                break;
            case 26 :
                // InternalPagos.g:1:165: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 27 :
                // InternalPagos.g:1:173: RULE_THEN
                {
                mRULE_THEN(); 

                }
                break;
            case 28 :
                // InternalPagos.g:1:183: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 29 :
                // InternalPagos.g:1:193: RULE_RETURN
                {
                mRULE_RETURN(); 

                }
                break;
            case 30 :
                // InternalPagos.g:1:205: RULE_TYPE
                {
                mRULE_TYPE(); 

                }
                break;
            case 31 :
                // InternalPagos.g:1:215: RULE_MULTOP
                {
                mRULE_MULTOP(); 

                }
                break;
            case 32 :
                // InternalPagos.g:1:227: RULE_ADDOP
                {
                mRULE_ADDOP(); 

                }
                break;
            case 33 :
                // InternalPagos.g:1:238: RULE_LOGICALCONN
                {
                mRULE_LOGICALCONN(); 

                }
                break;
            case 34 :
                // InternalPagos.g:1:255: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalPagos.g:1:263: RULE_OPERADORLOGICO
                {
                mRULE_OPERADORLOGICO(); 

                }
                break;
            case 36 :
                // InternalPagos.g:1:283: RULE_LBRACE
                {
                mRULE_LBRACE(); 

                }
                break;
            case 37 :
                // InternalPagos.g:1:295: RULE_RBRACE
                {
                mRULE_RBRACE(); 

                }
                break;
            case 38 :
                // InternalPagos.g:1:307: RULE_LBRACKET
                {
                mRULE_LBRACKET(); 

                }
                break;
            case 39 :
                // InternalPagos.g:1:321: RULE_RBRACKET
                {
                mRULE_RBRACKET(); 

                }
                break;
            case 40 :
                // InternalPagos.g:1:335: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 41 :
                // InternalPagos.g:1:346: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 42 :
                // InternalPagos.g:1:357: RULE_DASH
                {
                mRULE_DASH(); 

                }
                break;
            case 43 :
                // InternalPagos.g:1:367: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 44 :
                // InternalPagos.g:1:376: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 45 :
                // InternalPagos.g:1:388: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 46 :
                // InternalPagos.g:1:397: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 47 :
                // InternalPagos.g:1:413: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 48 :
                // InternalPagos.g:1:429: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 49 :
                // InternalPagos.g:1:437: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA4_eotS =
        "\1\uffff\1\7\1\11\7\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\1\41\2\75\7\uffff";
    static final String DFA4_maxS =
        "\2\76\1\75\7\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\5\1\7\1\3\1\6\1\1\1\4\1\2";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\4\32\uffff\1\1\1\3\1\2",
            "\1\5\1\6",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "8988:23: ( '<' | '>' | '<=' | '>=' | '==' | '<>' | '!=' )";
        }
    }
    static final String DFA12_eotS =
        "\1\uffff\2\55\1\60\1\62\10\55\2\uffff\1\100\2\55\1\52\3\55\1\114\1\uffff\2\52\3\uffff\2\52\7\uffff\1\52\4\uffff\2\55\1\uffff\2\55\1\uffff\1\55\1\uffff\5\55\1\145\1\55\1\147\2\55\4\uffff\1\152\1\153\1\155\1\55\1\uffff\4\55\20\uffff\13\55\1\uffff\1\55\1\uffff\2\55\2\uffff\1\55\1\uffff\13\55\1\u008e\10\55\1\u0097\2\55\1\u009a\1\55\1\u009a\1\uffff\5\55\1\uffff\10\55\1\uffff\2\55\1\uffff\16\55\1\u009a\1\55\1\u009a\11\55\1\u009a\7\55\1\u00ca\1\u00cb\7\55\1\u00d3\3\55\2\uffff\6\55\1\u00dd\1\uffff\5\55\1\u00e3\3\55\1\uffff\4\55\1\u00eb\1\uffff\6\55\1\u00f4\1\uffff\5\55\1\u00fa\2\55\1\uffff\5\55\1\uffff\3\55\1\u0105\4\55\1\uffff\1\55\1\uffff\6\55\1\u0111\4\55\1\uffff\6\55\1\u011c\3\55\1\uffff\1\u0120\2\55\1\uffff\1\u0123\1\55\2\uffff";
    static final String DFA12_eofS =
        "\u0125\uffff";
    static final String DFA12_minS =
        "\1\0\1\151\1\145\2\60\1\141\1\156\1\145\1\164\1\124\1\125\1\141\1\162\2\uffff\1\75\1\101\2\111\1\105\1\141\1\157\1\52\1\uffff\1\46\1\174\3\uffff\2\75\7\uffff\1\0\4\uffff\1\172\1\160\1\uffff\1\164\1\124\1\uffff\1\164\1\uffff\1\155\1\164\1\163\1\164\1\146\1\60\1\162\1\60\1\154\1\157\4\uffff\3\60\1\162\1\uffff\1\124\1\164\1\165\1\156\20\uffff\2\145\1\103\1\117\1\151\2\145\1\143\1\162\1\157\1\145\1\uffff\1\155\1\uffff\1\143\1\166\2\uffff\1\117\1\uffff\1\151\1\117\1\145\1\142\1\147\1\50\1\162\1\141\1\151\1\116\1\164\1\60\2\162\1\151\1\162\1\147\1\101\1\165\1\151\1\60\1\156\1\122\1\60\1\154\1\60\1\uffff\1\145\1\156\1\145\1\103\1\151\1\uffff\1\155\1\151\1\142\1\155\1\145\1\164\1\154\1\144\1\uffff\1\147\1\116\1\uffff\1\145\1\156\1\164\1\147\1\105\2\145\1\160\1\165\1\141\1\162\1\164\1\141\1\145\1\60\1\101\1\60\1\164\1\151\1\157\1\123\1\163\1\144\3\164\1\60\1\162\1\164\1\162\1\122\1\151\1\144\1\124\2\60\2\151\1\145\3\151\1\163\1\60\1\164\2\141\2\uffff\1\141\1\157\1\163\1\157\1\142\1\157\1\60\1\uffff\1\151\1\144\1\142\1\162\1\156\1\60\1\156\1\165\1\156\1\uffff\1\145\1\104\1\154\1\171\1\60\1\uffff\1\124\1\164\1\141\1\163\1\151\1\141\1\60\1\uffff\3\145\1\165\1\164\1\60\1\141\1\62\1\uffff\1\155\1\163\1\155\1\154\1\164\1\uffff\1\163\1\50\1\160\1\60\1\160\1\145\1\162\1\110\1\uffff\1\154\1\uffff\1\154\1\163\1\151\3\141\1\60\2\142\2\164\1\uffff\1\165\1\151\2\145\1\164\1\154\1\60\1\163\2\145\1\uffff\1\60\2\163\1\uffff\1\60\1\50\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\165\1\145\2\172\1\141\1\156\1\145\1\164\1\156\1\157\1\141\1\162\2\uffff\1\75\1\101\1\164\1\111\1\105\2\157\1\57\1\uffff\1\46\1\174\3\uffff\2\75\7\uffff\1\uffff\4\uffff\1\172\1\160\1\uffff\1\164\1\124\1\uffff\1\164\1\uffff\1\155\1\164\1\163\2\164\1\172\1\162\1\172\1\154\1\157\4\uffff\3\172\1\162\1\uffff\1\124\1\164\1\165\1\156\20\uffff\2\145\1\122\1\117\1\151\2\145\1\143\1\162\1\157\1\145\1\uffff\1\155\1\uffff\1\143\1\166\2\uffff\1\117\1\uffff\1\151\1\117\1\145\1\142\1\147\1\50\1\162\1\141\1\151\1\116\1\164\1\172\2\162\1\151\1\162\1\147\1\101\1\165\1\151\1\172\1\156\1\122\1\172\1\154\1\172\1\uffff\1\145\1\156\1\145\1\103\1\151\1\uffff\1\155\1\151\1\142\1\155\1\145\1\164\1\154\1\144\1\uffff\1\147\1\116\1\uffff\1\145\1\156\1\164\1\147\1\105\2\145\1\160\1\165\1\141\1\162\1\164\1\141\1\145\1\172\1\101\1\172\1\164\1\151\1\157\1\123\1\163\1\144\3\164\1\172\1\162\1\164\1\162\1\122\1\151\1\144\1\124\2\172\2\151\1\145\3\151\1\163\1\172\1\164\2\141\2\uffff\1\141\1\157\1\163\1\157\1\142\1\157\1\172\1\uffff\1\151\1\144\1\142\1\162\1\156\1\172\1\156\1\165\1\156\1\uffff\1\145\1\104\1\154\1\171\1\172\1\uffff\1\124\2\164\1\163\1\151\1\141\1\172\1\uffff\3\145\1\165\1\164\1\172\1\141\1\62\1\uffff\1\155\1\163\1\155\1\154\1\164\1\uffff\1\163\1\50\1\160\1\172\1\160\1\145\1\162\1\110\1\uffff\1\154\1\uffff\1\154\1\163\1\151\3\141\1\172\2\142\2\164\1\uffff\1\165\1\151\2\145\1\164\1\154\1\172\1\163\2\145\1\uffff\1\172\2\163\1\uffff\1\172\1\50\2\uffff";
    static final String DFA12_acceptS =
        "\15\uffff\1\22\1\23\10\uffff\1\40\2\uffff\1\42\2\43\2\uffff\1\44\1\45\1\46\1\47\1\50\1\52\1\53\1\uffff\1\55\1\37\1\60\1\61\2\uffff\1\42\2\uffff\1\4\1\uffff\1\5\12\uffff\1\22\1\23\1\24\1\51\4\uffff\1\31\4\uffff\1\56\1\57\1\37\1\40\1\41\1\43\1\44\1\45\1\46\1\47\1\50\1\52\1\53\1\54\1\55\1\60\13\uffff\1\27\1\uffff\1\30\2\uffff\1\25\1\26\1\uffff\1\32\32\uffff\1\1\5\uffff\1\6\10\uffff\1\34\2\uffff\1\36\57\uffff\1\33\1\13\7\uffff\1\35\11\uffff\1\17\5\uffff\1\12\7\uffff\1\11\10\uffff\1\7\5\uffff\1\10\10\uffff\1\3\1\uffff\1\15\13\uffff\1\20\12\uffff\1\14\3\uffff\1\16\2\uffff\1\21\1\2";
    static final String DFA12_specialS =
        "\1\1\45\uffff\1\0\u00fe\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\36\1\46\1\44\2\52\1\30\1\52\1\15\1\16\1\50\1\27\1\43\1\27\1\45\1\26\12\47\1\17\1\52\1\33\1\35\1\34\1\52\1\22\3\32\1\24\1\3\1\12\2\32\1\11\2\32\1\25\3\32\1\20\1\32\1\23\1\21\7\32\1\41\1\52\1\42\1\52\1\32\1\52\1\10\1\32\1\13\1\7\1\4\1\32\1\2\1\32\1\6\4\32\1\5\1\32\1\14\2\32\1\1\7\32\1\37\1\31\1\40\uff82\52",
            "\1\53\13\uffff\1\54",
            "\1\56",
            "\12\55\7\uffff\15\55\1\57\14\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\61\14\55",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\70\31\uffff\1\67",
            "\1\72\31\uffff\1\71",
            "\1\73",
            "\1\74",
            "",
            "",
            "\1\77",
            "\1\101",
            "\1\103\13\uffff\1\102\36\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\107\15\uffff\1\110",
            "\1\111",
            "\1\112\4\uffff\1\113",
            "",
            "\1\116",
            "\1\116",
            "",
            "",
            "",
            "\1\117",
            "\1\117",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\127\1\uffff\2\127\1\uffff\ufff2\127",
            "",
            "",
            "",
            "",
            "\1\132",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143\15\uffff\1\144",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\146",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\150",
            "\1\151",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\15\55\1\154\14\55\4\uffff\1\55\1\uffff\32\55",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
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
            "",
            "",
            "",
            "\1\163",
            "\1\164",
            "\1\165\16\uffff\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "",
            "\1\u0080",
            "\1\u0081",
            "",
            "",
            "\1\u0082",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0098",
            "\1\u0099",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u009b",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00f0\20\uffff\1\u00ef\1\uffff\1\u00ee",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010a",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0121",
            "\1\u0122",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0124",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_INDEX | RULE_IF | RULE_THEN | RULE_ELSE | RULE_RETURN | RULE_TYPE | RULE_MULTOP | RULE_ADDOP | RULE_LOGICALCONN | RULE_ID | RULE_OPERADORLOGICO | RULE_LBRACE | RULE_RBRACE | RULE_LBRACKET | RULE_RBRACKET | RULE_COMMA | RULE_COLON | RULE_DASH | RULE_DOT | RULE_STRING | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_38 = input.LA(1);

                        s = -1;
                        if ( ((LA12_38>='\u0000' && LA12_38<='\t')||(LA12_38>='\u000B' && LA12_38<='\f')||(LA12_38>='\u000E' && LA12_38<='\uFFFF')) ) {s = 87;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='s') ) {s = 1;}

                        else if ( (LA12_0=='g') ) {s = 2;}

                        else if ( (LA12_0=='E') ) {s = 3;}

                        else if ( (LA12_0=='e') ) {s = 4;}

                        else if ( (LA12_0=='n') ) {s = 5;}

                        else if ( (LA12_0=='i') ) {s = 6;}

                        else if ( (LA12_0=='d') ) {s = 7;}

                        else if ( (LA12_0=='a') ) {s = 8;}

                        else if ( (LA12_0=='I') ) {s = 9;}

                        else if ( (LA12_0=='F') ) {s = 10;}

                        else if ( (LA12_0=='c') ) {s = 11;}

                        else if ( (LA12_0=='p') ) {s = 12;}

                        else if ( (LA12_0=='(') ) {s = 13;}

                        else if ( (LA12_0==')') ) {s = 14;}

                        else if ( (LA12_0==':') ) {s = 15;}

                        else if ( (LA12_0=='P') ) {s = 16;}

                        else if ( (LA12_0=='S') ) {s = 17;}

                        else if ( (LA12_0=='@') ) {s = 18;}

                        else if ( (LA12_0=='R') ) {s = 19;}

                        else if ( (LA12_0=='D') ) {s = 20;}

                        else if ( (LA12_0=='L') ) {s = 21;}

                        else if ( (LA12_0=='/') ) {s = 22;}

                        else if ( (LA12_0=='+'||LA12_0=='-') ) {s = 23;}

                        else if ( (LA12_0=='&') ) {s = 24;}

                        else if ( (LA12_0=='|') ) {s = 25;}

                        else if ( ((LA12_0>='A' && LA12_0<='C')||(LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='O')||LA12_0=='Q'||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='f'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='m')||LA12_0=='o'||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='z')) ) {s = 26;}

                        else if ( (LA12_0=='<') ) {s = 27;}

                        else if ( (LA12_0=='>') ) {s = 28;}

                        else if ( (LA12_0=='=') ) {s = 29;}

                        else if ( (LA12_0=='!') ) {s = 30;}

                        else if ( (LA12_0=='{') ) {s = 31;}

                        else if ( (LA12_0=='}') ) {s = 32;}

                        else if ( (LA12_0=='[') ) {s = 33;}

                        else if ( (LA12_0==']') ) {s = 34;}

                        else if ( (LA12_0==',') ) {s = 35;}

                        else if ( (LA12_0=='#') ) {s = 36;}

                        else if ( (LA12_0=='.') ) {s = 37;}

                        else if ( (LA12_0=='\"') ) {s = 38;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 39;}

                        else if ( (LA12_0=='*') ) {s = 40;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 41;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='$' && LA12_0<='%')||LA12_0=='\''||LA12_0==';'||LA12_0=='?'||LA12_0=='\\'||LA12_0=='^'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}