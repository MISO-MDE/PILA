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

    public InternalPagosLexer() {;} 
    public InternalPagosLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPagosLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPagos.g"; }

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:11:7: ( 'E' )
            // InternalPagos.g:11:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:12:7: ( 'e' )
            // InternalPagos.g:12:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:13:7: ( 'name' )
            // InternalPagos.g:13:9: 'name'
            {
            match("name"); 


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
            // InternalPagos.g:14:7: ( 'intermediary' )
            // InternalPagos.g:14:9: 'intermediary'
            {
            match("intermediary"); 


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
            // InternalPagos.g:15:7: ( 'superentities' )
            // InternalPagos.g:15:9: 'superentities'
            {
            match("superentities"); 


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
            // InternalPagos.g:16:7: ( 'description' )
            // InternalPagos.g:16:9: 'description'
            {
            match("description"); 


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
            // InternalPagos.g:17:7: ( 'attributes' )
            // InternalPagos.g:17:9: 'attributes'
            {
            match("attributes"); 


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
            // InternalPagos.g:18:7: ( 'entities' )
            // InternalPagos.g:18:9: 'entities'
            {
            match("entities"); 


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
            // InternalPagos.g:19:7: ( 'InformationTemplate' )
            // InternalPagos.g:19:9: 'InformationTemplate'
            {
            match("InformationTemplate"); 


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
            // InternalPagos.g:20:7: ( 'FormAttributes' )
            // InternalPagos.g:20:9: 'FormAttributes'
            {
            match("FormAttributes"); 


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
            // InternalPagos.g:21:7: ( 'calculationtemplates' )
            // InternalPagos.g:21:9: 'calculationtemplates'
            {
            match("calculationtemplates"); 


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
            // InternalPagos.g:22:7: ( 'providers' )
            // InternalPagos.g:22:9: 'providers'
            {
            match("providers"); 


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
            // InternalPagos.g:23:7: ( 'calculationattributes' )
            // InternalPagos.g:23:9: 'calculationattributes'
            {
            match("calculationattributes"); 


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
            // InternalPagos.g:24:7: ( 'calculationrules' )
            // InternalPagos.g:24:9: 'calculationrules'
            {
            match("calculationrules"); 


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
            // InternalPagos.g:25:7: ( '(' )
            // InternalPagos.g:25:9: '('
            {
            match('('); 

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
            // InternalPagos.g:26:7: ( ')' )
            // InternalPagos.g:26:9: ')'
            {
            match(')'); 

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
            // InternalPagos.g:27:7: ( ':=' )
            // InternalPagos.g:27:9: ':='
            {
            match(":="); 


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
            // InternalPagos.g:28:7: ( '.' )
            // InternalPagos.g:28:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "RULE_IF"
    public final void mRULE_IF() throws RecognitionException {
        try {
            int _type = RULE_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:7629:9: ( 'SI' )
            // InternalPagos.g:7629:11: 'SI'
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
            // InternalPagos.g:7631:11: ( 'ENTONCES' )
            // InternalPagos.g:7631:13: 'ENTONCES'
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
            // InternalPagos.g:7633:11: ( 'SINO' )
            // InternalPagos.g:7633:13: 'SINO'
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
            // InternalPagos.g:7635:13: ( 'RETORNAR' )
            // InternalPagos.g:7635:15: 'RETORNAR'
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
            // InternalPagos.g:7637:11: ( ( 'String' | 'Integer' | 'Date' | 'Double' ) )
            // InternalPagos.g:7637:13: ( 'String' | 'Integer' | 'Date' | 'Double' )
            {
            // InternalPagos.g:7637:13: ( 'String' | 'Integer' | 'Date' | 'Double' )
            int alt1=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPagos.g:7637:14: 'String'
                    {
                    match("String"); 


                    }
                    break;
                case 2 :
                    // InternalPagos.g:7637:23: 'Integer'
                    {
                    match("Integer"); 


                    }
                    break;
                case 3 :
                    // InternalPagos.g:7637:33: 'Date'
                    {
                    match("Date"); 


                    }
                    break;
                case 4 :
                    // InternalPagos.g:7637:40: 'Double'
                    {
                    match("Double"); 


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
            // InternalPagos.g:7639:13: ( ( '*' | '/' ) )
            // InternalPagos.g:7639:15: ( '*' | '/' )
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
            // InternalPagos.g:7641:12: ( ( '+' | '-' ) )
            // InternalPagos.g:7641:14: ( '+' | '-' )
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
            // InternalPagos.g:7643:18: ( ( '&&' | '||' ) )
            // InternalPagos.g:7643:20: ( '&&' | '||' )
            {
            // InternalPagos.g:7643:20: ( '&&' | '||' )
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
                    // InternalPagos.g:7643:21: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 2 :
                    // InternalPagos.g:7643:26: '||'
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
            // InternalPagos.g:7645:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '.' ( 'Ultima' | 'Primera' | 'Tamano' ) )* )
            // InternalPagos.g:7645:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '.' ( 'Ultima' | 'Primera' | 'Tamano' ) )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPagos.g:7645:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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

            // InternalPagos.g:7645:69: ( '.' ( 'Ultima' | 'Primera' | 'Tamano' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='.') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPagos.g:7645:70: '.' ( 'Ultima' | 'Primera' | 'Tamano' )
            	    {
            	    match('.'); 
            	    // InternalPagos.g:7645:74: ( 'Ultima' | 'Primera' | 'Tamano' )
            	    int alt4=3;
            	    switch ( input.LA(1) ) {
            	    case 'U':
            	        {
            	        alt4=1;
            	        }
            	        break;
            	    case 'P':
            	        {
            	        alt4=2;
            	        }
            	        break;
            	    case 'T':
            	        {
            	        alt4=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt4) {
            	        case 1 :
            	            // InternalPagos.g:7645:75: 'Ultima'
            	            {
            	            match("Ultima"); 


            	            }
            	            break;
            	        case 2 :
            	            // InternalPagos.g:7645:84: 'Primera'
            	            {
            	            match("Primera"); 


            	            }
            	            break;
            	        case 3 :
            	            // InternalPagos.g:7645:94: 'Tamano'
            	            {
            	            match("Tamano"); 


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
            // InternalPagos.g:7647:21: ( ( '<' | '>' | '<=' | '>=' | '=' | '<>' ) )
            // InternalPagos.g:7647:23: ( '<' | '>' | '<=' | '>=' | '=' | '<>' )
            {
            // InternalPagos.g:7647:23: ( '<' | '>' | '<=' | '>=' | '=' | '<>' )
            int alt6=6;
            switch ( input.LA(1) ) {
            case '<':
                {
                switch ( input.LA(2) ) {
                case '=':
                    {
                    alt6=3;
                    }
                    break;
                case '>':
                    {
                    alt6=6;
                    }
                    break;
                default:
                    alt6=1;}

                }
                break;
            case '>':
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2=='=') ) {
                    alt6=4;
                }
                else {
                    alt6=2;}
                }
                break;
            case '=':
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPagos.g:7647:24: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // InternalPagos.g:7647:28: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // InternalPagos.g:7647:32: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // InternalPagos.g:7647:37: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // InternalPagos.g:7647:42: '='
                    {
                    match('='); 

                    }
                    break;
                case 6 :
                    // InternalPagos.g:7647:46: '<>'
                    {
                    match("<>"); 


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
            // InternalPagos.g:7649:13: ( '{' )
            // InternalPagos.g:7649:15: '{'
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
            // InternalPagos.g:7651:13: ( '}' )
            // InternalPagos.g:7651:15: '}'
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
            // InternalPagos.g:7653:15: ( '[' )
            // InternalPagos.g:7653:17: '['
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
            // InternalPagos.g:7655:15: ( ']' )
            // InternalPagos.g:7655:17: ']'
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
            // InternalPagos.g:7657:12: ( ',' )
            // InternalPagos.g:7657:14: ','
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
            // InternalPagos.g:7659:12: ( ':' )
            // InternalPagos.g:7659:14: ':'
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
            // InternalPagos.g:7661:11: ( '#' )
            // InternalPagos.g:7661:13: '#'
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPagos.g:7663:13: ( '\"' ( RULE_STR_ESC | ~ ( ( '\"' | '\\r' | '\\n' | '\\\\' ) ) )* '\"' )
            // InternalPagos.g:7663:15: '\"' ( RULE_STR_ESC | ~ ( ( '\"' | '\\r' | '\\n' | '\\\\' ) ) )* '\"'
            {
            match('\"'); 
            // InternalPagos.g:7663:19: ( RULE_STR_ESC | ~ ( ( '\"' | '\\r' | '\\n' | '\\\\' ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPagos.g:7663:20: RULE_STR_ESC
            	    {
            	    mRULE_STR_ESC(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalPagos.g:7663:33: ~ ( ( '\"' | '\\r' | '\\n' | '\\\\' ) )
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
            	    break loop7;
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
            // InternalPagos.g:7665:23: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\\\' | '$' ) )
            // InternalPagos.g:7665:25: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\\\' | '$' )
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
            // InternalPagos.g:7667:10: ( ( '0' .. '9' )+ )
            // InternalPagos.g:7667:12: ( '0' .. '9' )+
            {
            // InternalPagos.g:7667:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPagos.g:7667:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // InternalPagos.g:7669:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPagos.g:7669:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPagos.g:7669:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPagos.g:7669:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalPagos.g:7671:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPagos.g:7671:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPagos.g:7671:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPagos.g:7671:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalPagos.g:7671:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPagos.g:7671:41: ( '\\r' )? '\\n'
                    {
                    // InternalPagos.g:7671:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalPagos.g:7671:41: '\\r'
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
            // InternalPagos.g:7673:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPagos.g:7673:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPagos.g:7673:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalPagos.g:7675:16: ( . )
            // InternalPagos.g:7675:18: .
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
        // InternalPagos.g:1:8: ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_IF | RULE_THEN | RULE_ELSE | RULE_RETURN | RULE_TYPE | RULE_MULTOP | RULE_ADDOP | RULE_LOGICALCONN | RULE_ID | RULE_OPERADORLOGICO | RULE_LBRACE | RULE_RBRACE | RULE_LBRACKET | RULE_RBRACKET | RULE_COMMA | RULE_COLON | RULE_DASH | RULE_STRING | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=41;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalPagos.g:1:10: T__28
                {
                mT__28(); 

                }
                break;
            case 2 :
                // InternalPagos.g:1:16: T__29
                {
                mT__29(); 

                }
                break;
            case 3 :
                // InternalPagos.g:1:22: T__30
                {
                mT__30(); 

                }
                break;
            case 4 :
                // InternalPagos.g:1:28: T__31
                {
                mT__31(); 

                }
                break;
            case 5 :
                // InternalPagos.g:1:34: T__32
                {
                mT__32(); 

                }
                break;
            case 6 :
                // InternalPagos.g:1:40: T__33
                {
                mT__33(); 

                }
                break;
            case 7 :
                // InternalPagos.g:1:46: T__34
                {
                mT__34(); 

                }
                break;
            case 8 :
                // InternalPagos.g:1:52: T__35
                {
                mT__35(); 

                }
                break;
            case 9 :
                // InternalPagos.g:1:58: T__36
                {
                mT__36(); 

                }
                break;
            case 10 :
                // InternalPagos.g:1:64: T__37
                {
                mT__37(); 

                }
                break;
            case 11 :
                // InternalPagos.g:1:70: T__38
                {
                mT__38(); 

                }
                break;
            case 12 :
                // InternalPagos.g:1:76: T__39
                {
                mT__39(); 

                }
                break;
            case 13 :
                // InternalPagos.g:1:82: T__40
                {
                mT__40(); 

                }
                break;
            case 14 :
                // InternalPagos.g:1:88: T__41
                {
                mT__41(); 

                }
                break;
            case 15 :
                // InternalPagos.g:1:94: T__42
                {
                mT__42(); 

                }
                break;
            case 16 :
                // InternalPagos.g:1:100: T__43
                {
                mT__43(); 

                }
                break;
            case 17 :
                // InternalPagos.g:1:106: T__44
                {
                mT__44(); 

                }
                break;
            case 18 :
                // InternalPagos.g:1:112: T__45
                {
                mT__45(); 

                }
                break;
            case 19 :
                // InternalPagos.g:1:118: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 20 :
                // InternalPagos.g:1:126: RULE_THEN
                {
                mRULE_THEN(); 

                }
                break;
            case 21 :
                // InternalPagos.g:1:136: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 22 :
                // InternalPagos.g:1:146: RULE_RETURN
                {
                mRULE_RETURN(); 

                }
                break;
            case 23 :
                // InternalPagos.g:1:158: RULE_TYPE
                {
                mRULE_TYPE(); 

                }
                break;
            case 24 :
                // InternalPagos.g:1:168: RULE_MULTOP
                {
                mRULE_MULTOP(); 

                }
                break;
            case 25 :
                // InternalPagos.g:1:180: RULE_ADDOP
                {
                mRULE_ADDOP(); 

                }
                break;
            case 26 :
                // InternalPagos.g:1:191: RULE_LOGICALCONN
                {
                mRULE_LOGICALCONN(); 

                }
                break;
            case 27 :
                // InternalPagos.g:1:208: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // InternalPagos.g:1:216: RULE_OPERADORLOGICO
                {
                mRULE_OPERADORLOGICO(); 

                }
                break;
            case 29 :
                // InternalPagos.g:1:236: RULE_LBRACE
                {
                mRULE_LBRACE(); 

                }
                break;
            case 30 :
                // InternalPagos.g:1:248: RULE_RBRACE
                {
                mRULE_RBRACE(); 

                }
                break;
            case 31 :
                // InternalPagos.g:1:260: RULE_LBRACKET
                {
                mRULE_LBRACKET(); 

                }
                break;
            case 32 :
                // InternalPagos.g:1:274: RULE_RBRACKET
                {
                mRULE_RBRACKET(); 

                }
                break;
            case 33 :
                // InternalPagos.g:1:288: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 34 :
                // InternalPagos.g:1:299: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 35 :
                // InternalPagos.g:1:310: RULE_DASH
                {
                mRULE_DASH(); 

                }
                break;
            case 36 :
                // InternalPagos.g:1:320: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalPagos.g:1:332: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // InternalPagos.g:1:341: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 39 :
                // InternalPagos.g:1:357: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // InternalPagos.g:1:373: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // InternalPagos.g:1:381: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\47\1\52\11\50\2\uffff\1\67\1\uffff\3\50\1\100\1\uffff\2\45\12\uffff\1\45\4\uffff\1\50\2\uffff\1\50\1\uffff\11\50\5\uffff\1\132\4\50\17\uffff\15\50\1\uffff\6\50\1\162\11\50\1\174\2\50\1\177\3\50\1\uffff\11\50\1\uffff\2\50\1\uffff\14\50\1\177\1\50\1\177\7\50\1\177\4\50\1\u00a6\1\u00a7\10\50\1\u00b0\2\uffff\7\50\1\u00b8\1\uffff\3\50\1\u00bc\3\50\1\uffff\2\50\1\u00c2\1\uffff\3\50\1\u00c8\1\50\1\uffff\5\50\1\uffff\1\u00cf\5\50\1\uffff\1\50\1\u00d6\4\50\1\uffff\6\50\1\u00e1\3\50\1\uffff\3\50\1\u00e8\2\50\1\uffff\1\u00eb\1\50\1\uffff\1\u00ed\1\uffff";
    static final String DFA14_eofS =
        "\u00ee\uffff";
    static final String DFA14_minS =
        "\1\0\2\56\1\141\1\156\1\165\1\145\1\164\1\156\1\157\1\141\1\162\2\uffff\1\75\1\uffff\1\111\1\105\1\141\1\52\1\uffff\1\46\1\174\12\uffff\1\0\4\uffff\1\124\2\uffff\1\164\1\uffff\1\155\1\164\1\160\1\163\1\164\1\146\1\162\1\154\1\157\5\uffff\1\56\1\162\1\124\1\164\1\165\17\uffff\1\117\1\151\3\145\1\143\1\162\1\157\1\145\1\155\1\143\1\166\1\117\1\uffff\1\151\1\117\1\145\1\142\1\116\1\164\1\56\3\162\1\151\1\162\1\147\1\101\1\165\1\151\1\56\1\156\1\122\1\56\1\154\1\103\1\151\1\uffff\1\155\1\145\1\151\1\142\1\155\1\145\1\164\1\154\1\144\1\uffff\1\147\1\116\1\uffff\1\145\1\105\2\145\1\156\1\160\1\165\1\141\1\162\1\164\1\141\1\145\1\56\1\101\1\56\1\123\1\163\1\144\4\164\1\56\1\162\1\164\1\162\1\122\2\56\3\151\1\145\3\151\1\163\1\56\2\uffff\1\141\1\164\1\157\1\163\1\157\1\142\1\157\1\56\1\uffff\1\162\1\151\1\156\1\56\1\156\1\165\1\156\1\uffff\1\171\1\145\1\56\1\uffff\1\124\1\164\1\141\1\56\1\163\1\uffff\3\145\1\164\1\165\1\uffff\1\56\1\155\1\163\1\155\1\164\1\154\1\uffff\1\160\1\56\1\160\1\162\1\145\1\154\1\uffff\1\154\1\151\1\163\2\141\1\142\1\56\2\164\1\165\1\uffff\2\145\1\164\1\56\1\163\1\145\1\uffff\1\56\1\163\1\uffff\1\56\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\2\172\1\141\1\156\1\165\1\145\1\164\1\156\1\157\1\141\1\162\2\uffff\1\75\1\uffff\1\164\1\105\1\157\1\57\1\uffff\1\46\1\174\12\uffff\1\uffff\4\uffff\1\124\2\uffff\1\164\1\uffff\1\155\1\164\1\160\1\163\2\164\1\162\1\154\1\157\5\uffff\1\172\1\162\1\124\1\164\1\165\17\uffff\1\117\1\151\3\145\1\143\1\162\1\157\1\145\1\155\1\143\1\166\1\117\1\uffff\1\151\1\117\1\145\1\142\1\116\1\164\1\172\3\162\1\151\1\162\1\147\1\101\1\165\1\151\1\172\1\156\1\122\1\172\1\154\1\103\1\151\1\uffff\1\155\1\145\1\151\1\142\1\155\1\145\1\164\1\154\1\144\1\uffff\1\147\1\116\1\uffff\1\145\1\105\2\145\1\156\1\160\1\165\1\141\1\162\1\164\1\141\1\145\1\172\1\101\1\172\1\123\1\163\1\144\4\164\1\172\1\162\1\164\1\162\1\122\2\172\3\151\1\145\3\151\1\163\1\172\2\uffff\1\141\1\164\1\157\1\163\1\157\1\142\1\157\1\172\1\uffff\1\162\1\151\1\156\1\172\1\156\1\165\1\156\1\uffff\1\171\1\145\1\172\1\uffff\1\124\2\164\1\172\1\163\1\uffff\3\145\1\164\1\165\1\uffff\1\172\1\155\1\163\1\155\1\164\1\154\1\uffff\1\160\1\172\1\160\1\162\1\145\1\154\1\uffff\1\154\1\151\1\163\2\141\1\142\1\172\2\164\1\165\1\uffff\2\145\1\164\1\172\1\163\1\145\1\uffff\1\172\1\163\1\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\14\uffff\1\17\1\20\1\uffff\1\22\4\uffff\1\31\2\uffff\1\33\3\34\1\35\1\36\1\37\1\40\1\41\1\43\1\uffff\1\45\1\30\1\50\1\51\1\uffff\1\1\1\33\1\uffff\1\2\11\uffff\1\17\1\20\1\21\1\42\1\22\5\uffff\1\46\1\47\1\30\1\31\1\32\1\34\1\35\1\36\1\37\1\40\1\41\1\43\1\44\1\45\1\50\15\uffff\1\23\27\uffff\1\3\11\uffff\1\25\2\uffff\1\27\46\uffff\1\24\1\10\10\uffff\1\26\7\uffff\1\14\3\uffff\1\7\5\uffff\1\6\5\uffff\1\4\6\uffff\1\5\6\uffff\1\12\12\uffff\1\16\6\uffff\1\11\2\uffff\1\13\1\uffff\1\15";
    static final String DFA14_specialS =
        "\1\1\40\uffff\1\0\u00cc\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\45\1\41\1\40\2\45\1\25\1\45\1\14\1\15\1\43\1\24\1\37\1\24\1\17\1\23\12\42\1\16\1\45\1\30\1\32\1\31\2\45\3\27\1\22\1\1\1\11\2\27\1\10\10\27\1\21\1\20\7\27\1\35\1\45\1\36\1\45\1\27\1\45\1\7\1\27\1\12\1\6\1\2\3\27\1\4\4\27\1\3\1\27\1\13\2\27\1\5\7\27\1\33\1\26\1\34\uff82\45",
            "\1\50\1\uffff\12\50\7\uffff\15\50\1\46\14\50\4\uffff\1\50\1\uffff\32\50",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\51\14\50",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "",
            "\1\66",
            "",
            "\1\71\52\uffff\1\72",
            "\1\73",
            "\1\74\15\uffff\1\75",
            "\1\76\4\uffff\1\77",
            "",
            "\1\102",
            "\1\102",
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
            "\12\112\1\uffff\2\112\1\uffff\ufff2\112",
            "",
            "",
            "",
            "",
            "\1\115",
            "",
            "",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124\15\uffff\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "",
            "",
            "",
            "",
            "\1\50\1\uffff\12\50\7\uffff\15\50\1\131\14\50\4\uffff\1\50\1\uffff\32\50",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
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
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\175",
            "\1\176",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0080",
            "\1\u0081",
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
            "",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009a",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c6\20\uffff\1\u00c7\1\uffff\1\u00c5",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ec",
            "",
            "\1\50\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_IF | RULE_THEN | RULE_ELSE | RULE_RETURN | RULE_TYPE | RULE_MULTOP | RULE_ADDOP | RULE_LOGICALCONN | RULE_ID | RULE_OPERADORLOGICO | RULE_LBRACE | RULE_RBRACE | RULE_LBRACKET | RULE_RBRACKET | RULE_COMMA | RULE_COLON | RULE_DASH | RULE_STRING | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_33 = input.LA(1);

                        s = -1;
                        if ( ((LA14_33>='\u0000' && LA14_33<='\t')||(LA14_33>='\u000B' && LA14_33<='\f')||(LA14_33>='\u000E' && LA14_33<='\uFFFF')) ) {s = 74;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='E') ) {s = 1;}

                        else if ( (LA14_0=='e') ) {s = 2;}

                        else if ( (LA14_0=='n') ) {s = 3;}

                        else if ( (LA14_0=='i') ) {s = 4;}

                        else if ( (LA14_0=='s') ) {s = 5;}

                        else if ( (LA14_0=='d') ) {s = 6;}

                        else if ( (LA14_0=='a') ) {s = 7;}

                        else if ( (LA14_0=='I') ) {s = 8;}

                        else if ( (LA14_0=='F') ) {s = 9;}

                        else if ( (LA14_0=='c') ) {s = 10;}

                        else if ( (LA14_0=='p') ) {s = 11;}

                        else if ( (LA14_0=='(') ) {s = 12;}

                        else if ( (LA14_0==')') ) {s = 13;}

                        else if ( (LA14_0==':') ) {s = 14;}

                        else if ( (LA14_0=='.') ) {s = 15;}

                        else if ( (LA14_0=='S') ) {s = 16;}

                        else if ( (LA14_0=='R') ) {s = 17;}

                        else if ( (LA14_0=='D') ) {s = 18;}

                        else if ( (LA14_0=='/') ) {s = 19;}

                        else if ( (LA14_0=='+'||LA14_0=='-') ) {s = 20;}

                        else if ( (LA14_0=='&') ) {s = 21;}

                        else if ( (LA14_0=='|') ) {s = 22;}

                        else if ( ((LA14_0>='A' && LA14_0<='C')||(LA14_0>='G' && LA14_0<='H')||(LA14_0>='J' && LA14_0<='Q')||(LA14_0>='T' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||(LA14_0>='f' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='m')||LA14_0=='o'||(LA14_0>='q' && LA14_0<='r')||(LA14_0>='t' && LA14_0<='z')) ) {s = 23;}

                        else if ( (LA14_0=='<') ) {s = 24;}

                        else if ( (LA14_0=='>') ) {s = 25;}

                        else if ( (LA14_0=='=') ) {s = 26;}

                        else if ( (LA14_0=='{') ) {s = 27;}

                        else if ( (LA14_0=='}') ) {s = 28;}

                        else if ( (LA14_0=='[') ) {s = 29;}

                        else if ( (LA14_0==']') ) {s = 30;}

                        else if ( (LA14_0==',') ) {s = 31;}

                        else if ( (LA14_0=='#') ) {s = 32;}

                        else if ( (LA14_0=='\"') ) {s = 33;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 34;}

                        else if ( (LA14_0=='*') ) {s = 35;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 36;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='$' && LA14_0<='%')||LA14_0=='\''||LA14_0==';'||(LA14_0>='?' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='^'||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}