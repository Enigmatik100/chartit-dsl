package fr.unice.cotedazur.l3ia2023.mycs.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.unice.cotedazur.l3ia2023.mycs.services.ChartDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChartDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'Begin'", "'End'", "'Chart'", "'{'", "'title'", "'type'", "'xAxis'", "'('", "','", "')'", "'yAxis'", "'Filter'", "'['", "'and'", "']'", "'}'", "'Load'", "'data'", "'from'", "'header'", "'types'", "'delimiter'", "'Select'", "'Columns'", "'index:'", "'as'", "'-'", "'int'", "'str'", "'double'", "'.'", "'E'", "'e'", "'true'", "'false'", "'BAR'", "'PIE'", "'SCATTER'", "'LINE'", "'MIXED'", "'BUBBLE'", "'RADAR'", "'AREA'", "'DONUT'", "'=='", "'>'", "'<'", "'!='", "'>='", "'<='"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalChartDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalChartDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalChartDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalChartDsl.g"; }



     	private ChartDslGrammarAccess grammarAccess;

        public InternalChartDslParser(TokenStream input, ChartDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected ChartDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalChartDsl.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalChartDsl.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalChartDsl.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalChartDsl.g:72:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Begin' ( (lv_CsvFile_3_0= ruleDataFile ) ) ( (lv_chart_4_0= ruleChart ) ) ( (lv_chart_5_0= ruleChart ) )* otherlv_6= 'End' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_CsvFile_3_0 = null;

        EObject lv_chart_4_0 = null;

        EObject lv_chart_5_0 = null;



        	enterRule();

        try {
            // InternalChartDsl.g:78:2: ( (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Begin' ( (lv_CsvFile_3_0= ruleDataFile ) ) ( (lv_chart_4_0= ruleChart ) ) ( (lv_chart_5_0= ruleChart ) )* otherlv_6= 'End' ) )
            // InternalChartDsl.g:79:2: (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Begin' ( (lv_CsvFile_3_0= ruleDataFile ) ) ( (lv_chart_4_0= ruleChart ) ) ( (lv_chart_5_0= ruleChart ) )* otherlv_6= 'End' )
            {
            // InternalChartDsl.g:79:2: (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Begin' ( (lv_CsvFile_3_0= ruleDataFile ) ) ( (lv_chart_4_0= ruleChart ) ) ( (lv_chart_5_0= ruleChart ) )* otherlv_6= 'End' )
            // InternalChartDsl.g:80:3: otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Begin' ( (lv_CsvFile_3_0= ruleDataFile ) ) ( (lv_chart_4_0= ruleChart ) ) ( (lv_chart_5_0= ruleChart ) )* otherlv_6= 'End'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalChartDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalChartDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalChartDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalChartDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getBeginKeyword_2());
            		
            // InternalChartDsl.g:107:3: ( (lv_CsvFile_3_0= ruleDataFile ) )
            // InternalChartDsl.g:108:4: (lv_CsvFile_3_0= ruleDataFile )
            {
            // InternalChartDsl.g:108:4: (lv_CsvFile_3_0= ruleDataFile )
            // InternalChartDsl.g:109:5: lv_CsvFile_3_0= ruleDataFile
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getCsvFileDataFileParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_CsvFile_3_0=ruleDataFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"CsvFile",
            						lv_CsvFile_3_0,
            						"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.DataFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChartDsl.g:126:3: ( (lv_chart_4_0= ruleChart ) )
            // InternalChartDsl.g:127:4: (lv_chart_4_0= ruleChart )
            {
            // InternalChartDsl.g:127:4: (lv_chart_4_0= ruleChart )
            // InternalChartDsl.g:128:5: lv_chart_4_0= ruleChart
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getChartChartParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_chart_4_0=ruleChart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					add(
            						current,
            						"chart",
            						lv_chart_4_0,
            						"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.Chart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChartDsl.g:145:3: ( (lv_chart_5_0= ruleChart ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalChartDsl.g:146:4: (lv_chart_5_0= ruleChart )
            	    {
            	    // InternalChartDsl.g:146:4: (lv_chart_5_0= ruleChart )
            	    // InternalChartDsl.g:147:5: lv_chart_5_0= ruleChart
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getChartChartParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_chart_5_0=ruleChart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"chart",
            	    						lv_chart_5_0,
            	    						"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.Chart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleConstant"
    // InternalChartDsl.g:172:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalChartDsl.g:172:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalChartDsl.g:173:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalChartDsl.g:179:1: ruleConstant returns [EObject current=null] : (this_IntVariable_0= ruleIntVariable | this_StringVariable_1= ruleStringVariable | this_DoubleVariable_2= ruleDoubleVariable ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        EObject this_IntVariable_0 = null;

        EObject this_StringVariable_1 = null;

        EObject this_DoubleVariable_2 = null;



        	enterRule();

        try {
            // InternalChartDsl.g:185:2: ( (this_IntVariable_0= ruleIntVariable | this_StringVariable_1= ruleStringVariable | this_DoubleVariable_2= ruleDoubleVariable ) )
            // InternalChartDsl.g:186:2: (this_IntVariable_0= ruleIntVariable | this_StringVariable_1= ruleStringVariable | this_DoubleVariable_2= ruleDoubleVariable )
            {
            // InternalChartDsl.g:186:2: (this_IntVariable_0= ruleIntVariable | this_StringVariable_1= ruleStringVariable | this_DoubleVariable_2= ruleDoubleVariable )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt2=1;
                }
                break;
            case 40:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalChartDsl.g:187:3: this_IntVariable_0= ruleIntVariable
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getIntVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntVariable_0=ruleIntVariable();

                    state._fsp--;


                    			current = this_IntVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalChartDsl.g:196:3: this_StringVariable_1= ruleStringVariable
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getStringVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringVariable_1=ruleStringVariable();

                    state._fsp--;


                    			current = this_StringVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalChartDsl.g:205:3: this_DoubleVariable_2= ruleDoubleVariable
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getDoubleVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleVariable_2=ruleDoubleVariable();

                    state._fsp--;


                    			current = this_DoubleVariable_2;
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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleEString"
    // InternalChartDsl.g:217:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalChartDsl.g:217:47: (iv_ruleEString= ruleEString EOF )
            // InternalChartDsl.g:218:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalChartDsl.g:224:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalChartDsl.g:230:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalChartDsl.g:231:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalChartDsl.g:231:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalChartDsl.g:232:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalChartDsl.g:240:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleChart"
    // InternalChartDsl.g:251:1: entryRuleChart returns [EObject current=null] : iv_ruleChart= ruleChart EOF ;
    public final EObject entryRuleChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChart = null;


        try {
            // InternalChartDsl.g:251:46: (iv_ruleChart= ruleChart EOF )
            // InternalChartDsl.g:252:2: iv_ruleChart= ruleChart EOF
            {
             newCompositeNode(grammarAccess.getChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChart=ruleChart();

            state._fsp--;

             current =iv_ruleChart; 
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
    // $ANTLR end "entryRuleChart"


    // $ANTLR start "ruleChart"
    // InternalChartDsl.g:258:1: ruleChart returns [EObject current=null] : ( () otherlv_1= 'Chart' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleChartType ) ) )? (otherlv_7= 'xAxis' otherlv_8= '(' ( (lv_xVariable_9_0= ruleColumnRef ) ) (otherlv_10= ',' ( (lv_xVariable_11_0= ruleColumnRef ) ) )* otherlv_12= ')' )? (otherlv_13= 'yAxis' otherlv_14= '(' ( (lv_yVariable_15_0= ruleColumnRef ) ) (otherlv_16= ',' ( (lv_yVariable_17_0= ruleColumnRef ) ) )* otherlv_18= ')' )? (otherlv_19= 'Filter' otherlv_20= '[' ( (lv_Filter_21_0= ruleCondition ) ) (otherlv_22= 'and' ( (lv_Filter_23_0= ruleCondition ) ) )* otherlv_24= ']' )? otherlv_25= '}' ) ;
    public final EObject ruleChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        Enumerator lv_type_6_0 = null;

        EObject lv_xVariable_9_0 = null;

        EObject lv_xVariable_11_0 = null;

        EObject lv_yVariable_15_0 = null;

        EObject lv_yVariable_17_0 = null;

        EObject lv_Filter_21_0 = null;

        EObject lv_Filter_23_0 = null;



        	enterRule();

        try {
            // InternalChartDsl.g:264:2: ( ( () otherlv_1= 'Chart' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleChartType ) ) )? (otherlv_7= 'xAxis' otherlv_8= '(' ( (lv_xVariable_9_0= ruleColumnRef ) ) (otherlv_10= ',' ( (lv_xVariable_11_0= ruleColumnRef ) ) )* otherlv_12= ')' )? (otherlv_13= 'yAxis' otherlv_14= '(' ( (lv_yVariable_15_0= ruleColumnRef ) ) (otherlv_16= ',' ( (lv_yVariable_17_0= ruleColumnRef ) ) )* otherlv_18= ')' )? (otherlv_19= 'Filter' otherlv_20= '[' ( (lv_Filter_21_0= ruleCondition ) ) (otherlv_22= 'and' ( (lv_Filter_23_0= ruleCondition ) ) )* otherlv_24= ']' )? otherlv_25= '}' ) )
            // InternalChartDsl.g:265:2: ( () otherlv_1= 'Chart' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleChartType ) ) )? (otherlv_7= 'xAxis' otherlv_8= '(' ( (lv_xVariable_9_0= ruleColumnRef ) ) (otherlv_10= ',' ( (lv_xVariable_11_0= ruleColumnRef ) ) )* otherlv_12= ')' )? (otherlv_13= 'yAxis' otherlv_14= '(' ( (lv_yVariable_15_0= ruleColumnRef ) ) (otherlv_16= ',' ( (lv_yVariable_17_0= ruleColumnRef ) ) )* otherlv_18= ')' )? (otherlv_19= 'Filter' otherlv_20= '[' ( (lv_Filter_21_0= ruleCondition ) ) (otherlv_22= 'and' ( (lv_Filter_23_0= ruleCondition ) ) )* otherlv_24= ']' )? otherlv_25= '}' )
            {
            // InternalChartDsl.g:265:2: ( () otherlv_1= 'Chart' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleChartType ) ) )? (otherlv_7= 'xAxis' otherlv_8= '(' ( (lv_xVariable_9_0= ruleColumnRef ) ) (otherlv_10= ',' ( (lv_xVariable_11_0= ruleColumnRef ) ) )* otherlv_12= ')' )? (otherlv_13= 'yAxis' otherlv_14= '(' ( (lv_yVariable_15_0= ruleColumnRef ) ) (otherlv_16= ',' ( (lv_yVariable_17_0= ruleColumnRef ) ) )* otherlv_18= ')' )? (otherlv_19= 'Filter' otherlv_20= '[' ( (lv_Filter_21_0= ruleCondition ) ) (otherlv_22= 'and' ( (lv_Filter_23_0= ruleCondition ) ) )* otherlv_24= ']' )? otherlv_25= '}' )
            // InternalChartDsl.g:266:3: () otherlv_1= 'Chart' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleChartType ) ) )? (otherlv_7= 'xAxis' otherlv_8= '(' ( (lv_xVariable_9_0= ruleColumnRef ) ) (otherlv_10= ',' ( (lv_xVariable_11_0= ruleColumnRef ) ) )* otherlv_12= ')' )? (otherlv_13= 'yAxis' otherlv_14= '(' ( (lv_yVariable_15_0= ruleColumnRef ) ) (otherlv_16= ',' ( (lv_yVariable_17_0= ruleColumnRef ) ) )* otherlv_18= ')' )? (otherlv_19= 'Filter' otherlv_20= '[' ( (lv_Filter_21_0= ruleCondition ) ) (otherlv_22= 'and' ( (lv_Filter_23_0= ruleCondition ) ) )* otherlv_24= ']' )? otherlv_25= '}'
            {
            // InternalChartDsl.g:266:3: ()
            // InternalChartDsl.g:267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChartAccess().getChartAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getChartAccess().getChartKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getChartAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalChartDsl.g:281:3: (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalChartDsl.g:282:4: otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getChartAccess().getTitleKeyword_3_0());
                    			
                    // InternalChartDsl.g:286:4: ( (lv_title_4_0= ruleEString ) )
                    // InternalChartDsl.g:287:5: (lv_title_4_0= ruleEString )
                    {
                    // InternalChartDsl.g:287:5: (lv_title_4_0= ruleEString )
                    // InternalChartDsl.g:288:6: lv_title_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getChartAccess().getTitleEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_title_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChartRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_4_0,
                    							"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalChartDsl.g:306:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleChartType ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalChartDsl.g:307:4: otherlv_5= 'type' ( (lv_type_6_0= ruleChartType ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getChartAccess().getTypeKeyword_4_0());
                    			
                    // InternalChartDsl.g:311:4: ( (lv_type_6_0= ruleChartType ) )
                    // InternalChartDsl.g:312:5: (lv_type_6_0= ruleChartType )
                    {
                    // InternalChartDsl.g:312:5: (lv_type_6_0= ruleChartType )
                    // InternalChartDsl.g:313:6: lv_type_6_0= ruleChartType
                    {

                    						newCompositeNode(grammarAccess.getChartAccess().getTypeChartTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_type_6_0=ruleChartType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChartRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.ChartType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalChartDsl.g:331:3: (otherlv_7= 'xAxis' otherlv_8= '(' ( (lv_xVariable_9_0= ruleColumnRef ) ) (otherlv_10= ',' ( (lv_xVariable_11_0= ruleColumnRef ) ) )* otherlv_12= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalChartDsl.g:332:4: otherlv_7= 'xAxis' otherlv_8= '(' ( (lv_xVariable_9_0= ruleColumnRef ) ) (otherlv_10= ',' ( (lv_xVariable_11_0= ruleColumnRef ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getChartAccess().getXAxisKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getChartAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalChartDsl.g:340:4: ( (lv_xVariable_9_0= ruleColumnRef ) )
                    // InternalChartDsl.g:341:5: (lv_xVariable_9_0= ruleColumnRef )
                    {
                    // InternalChartDsl.g:341:5: (lv_xVariable_9_0= ruleColumnRef )
                    // InternalChartDsl.g:342:6: lv_xVariable_9_0= ruleColumnRef
                    {

                    						newCompositeNode(grammarAccess.getChartAccess().getXVariableColumnRefParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_xVariable_9_0=ruleColumnRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChartRule());
                    						}
                    						add(
                    							current,
                    							"xVariable",
                    							lv_xVariable_9_0,
                    							"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.ColumnRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChartDsl.g:359:4: (otherlv_10= ',' ( (lv_xVariable_11_0= ruleColumnRef ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==20) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalChartDsl.g:360:5: otherlv_10= ',' ( (lv_xVariable_11_0= ruleColumnRef ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getChartAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalChartDsl.g:364:5: ( (lv_xVariable_11_0= ruleColumnRef ) )
                    	    // InternalChartDsl.g:365:6: (lv_xVariable_11_0= ruleColumnRef )
                    	    {
                    	    // InternalChartDsl.g:365:6: (lv_xVariable_11_0= ruleColumnRef )
                    	    // InternalChartDsl.g:366:7: lv_xVariable_11_0= ruleColumnRef
                    	    {

                    	    							newCompositeNode(grammarAccess.getChartAccess().getXVariableColumnRefParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_xVariable_11_0=ruleColumnRef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChartRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"xVariable",
                    	    								lv_xVariable_11_0,
                    	    								"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.ColumnRef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_12, grammarAccess.getChartAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalChartDsl.g:389:3: (otherlv_13= 'yAxis' otherlv_14= '(' ( (lv_yVariable_15_0= ruleColumnRef ) ) (otherlv_16= ',' ( (lv_yVariable_17_0= ruleColumnRef ) ) )* otherlv_18= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalChartDsl.g:390:4: otherlv_13= 'yAxis' otherlv_14= '(' ( (lv_yVariable_15_0= ruleColumnRef ) ) (otherlv_16= ',' ( (lv_yVariable_17_0= ruleColumnRef ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getChartAccess().getYAxisKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getChartAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalChartDsl.g:398:4: ( (lv_yVariable_15_0= ruleColumnRef ) )
                    // InternalChartDsl.g:399:5: (lv_yVariable_15_0= ruleColumnRef )
                    {
                    // InternalChartDsl.g:399:5: (lv_yVariable_15_0= ruleColumnRef )
                    // InternalChartDsl.g:400:6: lv_yVariable_15_0= ruleColumnRef
                    {

                    						newCompositeNode(grammarAccess.getChartAccess().getYVariableColumnRefParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_yVariable_15_0=ruleColumnRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChartRule());
                    						}
                    						add(
                    							current,
                    							"yVariable",
                    							lv_yVariable_15_0,
                    							"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.ColumnRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChartDsl.g:417:4: (otherlv_16= ',' ( (lv_yVariable_17_0= ruleColumnRef ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==20) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalChartDsl.g:418:5: otherlv_16= ',' ( (lv_yVariable_17_0= ruleColumnRef ) )
                    	    {
                    	    otherlv_16=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getChartAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalChartDsl.g:422:5: ( (lv_yVariable_17_0= ruleColumnRef ) )
                    	    // InternalChartDsl.g:423:6: (lv_yVariable_17_0= ruleColumnRef )
                    	    {
                    	    // InternalChartDsl.g:423:6: (lv_yVariable_17_0= ruleColumnRef )
                    	    // InternalChartDsl.g:424:7: lv_yVariable_17_0= ruleColumnRef
                    	    {

                    	    							newCompositeNode(grammarAccess.getChartAccess().getYVariableColumnRefParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_yVariable_17_0=ruleColumnRef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChartRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"yVariable",
                    	    								lv_yVariable_17_0,
                    	    								"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.ColumnRef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_18, grammarAccess.getChartAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalChartDsl.g:447:3: (otherlv_19= 'Filter' otherlv_20= '[' ( (lv_Filter_21_0= ruleCondition ) ) (otherlv_22= 'and' ( (lv_Filter_23_0= ruleCondition ) ) )* otherlv_24= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalChartDsl.g:448:4: otherlv_19= 'Filter' otherlv_20= '[' ( (lv_Filter_21_0= ruleCondition ) ) (otherlv_22= 'and' ( (lv_Filter_23_0= ruleCondition ) ) )* otherlv_24= ']'
                    {
                    otherlv_19=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_19, grammarAccess.getChartAccess().getFilterKeyword_7_0());
                    			
                    otherlv_20=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_20, grammarAccess.getChartAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalChartDsl.g:456:4: ( (lv_Filter_21_0= ruleCondition ) )
                    // InternalChartDsl.g:457:5: (lv_Filter_21_0= ruleCondition )
                    {
                    // InternalChartDsl.g:457:5: (lv_Filter_21_0= ruleCondition )
                    // InternalChartDsl.g:458:6: lv_Filter_21_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getChartAccess().getFilterConditionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_Filter_21_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChartRule());
                    						}
                    						add(
                    							current,
                    							"Filter",
                    							lv_Filter_21_0,
                    							"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChartDsl.g:475:4: (otherlv_22= 'and' ( (lv_Filter_23_0= ruleCondition ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==25) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalChartDsl.g:476:5: otherlv_22= 'and' ( (lv_Filter_23_0= ruleCondition ) )
                    	    {
                    	    otherlv_22=(Token)match(input,25,FOLLOW_13); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getChartAccess().getAndKeyword_7_3_0());
                    	    				
                    	    // InternalChartDsl.g:480:5: ( (lv_Filter_23_0= ruleCondition ) )
                    	    // InternalChartDsl.g:481:6: (lv_Filter_23_0= ruleCondition )
                    	    {
                    	    // InternalChartDsl.g:481:6: (lv_Filter_23_0= ruleCondition )
                    	    // InternalChartDsl.g:482:7: lv_Filter_23_0= ruleCondition
                    	    {

                    	    							newCompositeNode(grammarAccess.getChartAccess().getFilterConditionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_Filter_23_0=ruleCondition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChartRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"Filter",
                    	    								lv_Filter_23_0,
                    	    								"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.Condition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_24, grammarAccess.getChartAccess().getRightSquareBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getChartAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleChart"


    // $ANTLR start "entryRuleDataFile"
    // InternalChartDsl.g:513:1: entryRuleDataFile returns [EObject current=null] : iv_ruleDataFile= ruleDataFile EOF ;
    public final EObject entryRuleDataFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFile = null;


        try {
            // InternalChartDsl.g:513:49: (iv_ruleDataFile= ruleDataFile EOF )
            // InternalChartDsl.g:514:2: iv_ruleDataFile= ruleDataFile EOF
            {
             newCompositeNode(grammarAccess.getDataFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataFile=ruleDataFile();

            state._fsp--;

             current =iv_ruleDataFile; 
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
    // $ANTLR end "entryRuleDataFile"


    // $ANTLR start "ruleDataFile"
    // InternalChartDsl.g:520:1: ruleDataFile returns [EObject current=null] : ( (otherlv_0= 'Load' otherlv_1= 'data' otherlv_2= 'from' ( (lv_filePath_3_0= ruleEString ) ) )? (otherlv_4= 'header' ( (lv_hasHeader_5_0= ruleEBoolean ) ) )? (otherlv_6= 'types' ( (lv_hasType_7_0= ruleEBoolean ) ) )? (otherlv_8= 'delimiter' ( (lv_separator_9_0= ruleEString ) ) )? otherlv_10= 'Select' otherlv_11= 'Columns' otherlv_12= '[' ( (lv_UsedColumn_13_0= ruleColumn ) ) (otherlv_14= ',' ( (lv_UsedColumn_15_0= ruleColumn ) ) )* otherlv_16= ']' ) ;
    public final EObject ruleDataFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_filePath_3_0 = null;

        AntlrDatatypeRuleToken lv_hasHeader_5_0 = null;

        AntlrDatatypeRuleToken lv_hasType_7_0 = null;

        AntlrDatatypeRuleToken lv_separator_9_0 = null;

        EObject lv_UsedColumn_13_0 = null;

        EObject lv_UsedColumn_15_0 = null;



        	enterRule();

        try {
            // InternalChartDsl.g:526:2: ( ( (otherlv_0= 'Load' otherlv_1= 'data' otherlv_2= 'from' ( (lv_filePath_3_0= ruleEString ) ) )? (otherlv_4= 'header' ( (lv_hasHeader_5_0= ruleEBoolean ) ) )? (otherlv_6= 'types' ( (lv_hasType_7_0= ruleEBoolean ) ) )? (otherlv_8= 'delimiter' ( (lv_separator_9_0= ruleEString ) ) )? otherlv_10= 'Select' otherlv_11= 'Columns' otherlv_12= '[' ( (lv_UsedColumn_13_0= ruleColumn ) ) (otherlv_14= ',' ( (lv_UsedColumn_15_0= ruleColumn ) ) )* otherlv_16= ']' ) )
            // InternalChartDsl.g:527:2: ( (otherlv_0= 'Load' otherlv_1= 'data' otherlv_2= 'from' ( (lv_filePath_3_0= ruleEString ) ) )? (otherlv_4= 'header' ( (lv_hasHeader_5_0= ruleEBoolean ) ) )? (otherlv_6= 'types' ( (lv_hasType_7_0= ruleEBoolean ) ) )? (otherlv_8= 'delimiter' ( (lv_separator_9_0= ruleEString ) ) )? otherlv_10= 'Select' otherlv_11= 'Columns' otherlv_12= '[' ( (lv_UsedColumn_13_0= ruleColumn ) ) (otherlv_14= ',' ( (lv_UsedColumn_15_0= ruleColumn ) ) )* otherlv_16= ']' )
            {
            // InternalChartDsl.g:527:2: ( (otherlv_0= 'Load' otherlv_1= 'data' otherlv_2= 'from' ( (lv_filePath_3_0= ruleEString ) ) )? (otherlv_4= 'header' ( (lv_hasHeader_5_0= ruleEBoolean ) ) )? (otherlv_6= 'types' ( (lv_hasType_7_0= ruleEBoolean ) ) )? (otherlv_8= 'delimiter' ( (lv_separator_9_0= ruleEString ) ) )? otherlv_10= 'Select' otherlv_11= 'Columns' otherlv_12= '[' ( (lv_UsedColumn_13_0= ruleColumn ) ) (otherlv_14= ',' ( (lv_UsedColumn_15_0= ruleColumn ) ) )* otherlv_16= ']' )
            // InternalChartDsl.g:528:3: (otherlv_0= 'Load' otherlv_1= 'data' otherlv_2= 'from' ( (lv_filePath_3_0= ruleEString ) ) )? (otherlv_4= 'header' ( (lv_hasHeader_5_0= ruleEBoolean ) ) )? (otherlv_6= 'types' ( (lv_hasType_7_0= ruleEBoolean ) ) )? (otherlv_8= 'delimiter' ( (lv_separator_9_0= ruleEString ) ) )? otherlv_10= 'Select' otherlv_11= 'Columns' otherlv_12= '[' ( (lv_UsedColumn_13_0= ruleColumn ) ) (otherlv_14= ',' ( (lv_UsedColumn_15_0= ruleColumn ) ) )* otherlv_16= ']'
            {
            // InternalChartDsl.g:528:3: (otherlv_0= 'Load' otherlv_1= 'data' otherlv_2= 'from' ( (lv_filePath_3_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalChartDsl.g:529:4: otherlv_0= 'Load' otherlv_1= 'data' otherlv_2= 'from' ( (lv_filePath_3_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_0, grammarAccess.getDataFileAccess().getLoadKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,29,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getDataFileAccess().getDataKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataFileAccess().getFromKeyword_0_2());
                    			
                    // InternalChartDsl.g:541:4: ( (lv_filePath_3_0= ruleEString ) )
                    // InternalChartDsl.g:542:5: (lv_filePath_3_0= ruleEString )
                    {
                    // InternalChartDsl.g:542:5: (lv_filePath_3_0= ruleEString )
                    // InternalChartDsl.g:543:6: lv_filePath_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataFileAccess().getFilePathEStringParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_filePath_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataFileRule());
                    						}
                    						set(
                    							current,
                    							"filePath",
                    							lv_filePath_3_0,
                    							"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalChartDsl.g:561:3: (otherlv_4= 'header' ( (lv_hasHeader_5_0= ruleEBoolean ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalChartDsl.g:562:4: otherlv_4= 'header' ( (lv_hasHeader_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataFileAccess().getHeaderKeyword_1_0());
                    			
                    // InternalChartDsl.g:566:4: ( (lv_hasHeader_5_0= ruleEBoolean ) )
                    // InternalChartDsl.g:567:5: (lv_hasHeader_5_0= ruleEBoolean )
                    {
                    // InternalChartDsl.g:567:5: (lv_hasHeader_5_0= ruleEBoolean )
                    // InternalChartDsl.g:568:6: lv_hasHeader_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getDataFileAccess().getHasHeaderEBooleanParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_hasHeader_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataFileRule());
                    						}
                    						set(
                    							current,
                    							"hasHeader",
                    							lv_hasHeader_5_0,
                    							"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalChartDsl.g:586:3: (otherlv_6= 'types' ( (lv_hasType_7_0= ruleEBoolean ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalChartDsl.g:587:4: otherlv_6= 'types' ( (lv_hasType_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataFileAccess().getTypesKeyword_2_0());
                    			
                    // InternalChartDsl.g:591:4: ( (lv_hasType_7_0= ruleEBoolean ) )
                    // InternalChartDsl.g:592:5: (lv_hasType_7_0= ruleEBoolean )
                    {
                    // InternalChartDsl.g:592:5: (lv_hasType_7_0= ruleEBoolean )
                    // InternalChartDsl.g:593:6: lv_hasType_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getDataFileAccess().getHasTypeEBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_hasType_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataFileRule());
                    						}
                    						set(
                    							current,
                    							"hasType",
                    							lv_hasType_7_0,
                    							"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalChartDsl.g:611:3: (otherlv_8= 'delimiter' ( (lv_separator_9_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalChartDsl.g:612:4: otherlv_8= 'delimiter' ( (lv_separator_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getDataFileAccess().getDelimiterKeyword_3_0());
                    			
                    // InternalChartDsl.g:616:4: ( (lv_separator_9_0= ruleEString ) )
                    // InternalChartDsl.g:617:5: (lv_separator_9_0= ruleEString )
                    {
                    // InternalChartDsl.g:617:5: (lv_separator_9_0= ruleEString )
                    // InternalChartDsl.g:618:6: lv_separator_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataFileAccess().getSeparatorEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_separator_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataFileRule());
                    						}
                    						set(
                    							current,
                    							"separator",
                    							lv_separator_9_0,
                    							"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_10, grammarAccess.getDataFileAccess().getSelectKeyword_4());
            		
            otherlv_11=(Token)match(input,35,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getDataFileAccess().getColumnsKeyword_5());
            		
            otherlv_12=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getDataFileAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalChartDsl.g:648:3: ( (lv_UsedColumn_13_0= ruleColumn ) )
            // InternalChartDsl.g:649:4: (lv_UsedColumn_13_0= ruleColumn )
            {
            // InternalChartDsl.g:649:4: (lv_UsedColumn_13_0= ruleColumn )
            // InternalChartDsl.g:650:5: lv_UsedColumn_13_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getDataFileAccess().getUsedColumnColumnParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_28);
            lv_UsedColumn_13_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataFileRule());
            					}
            					add(
            						current,
            						"UsedColumn",
            						lv_UsedColumn_13_0,
            						"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChartDsl.g:667:3: (otherlv_14= ',' ( (lv_UsedColumn_15_0= ruleColumn ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalChartDsl.g:668:4: otherlv_14= ',' ( (lv_UsedColumn_15_0= ruleColumn ) )
            	    {
            	    otherlv_14=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_14, grammarAccess.getDataFileAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalChartDsl.g:672:4: ( (lv_UsedColumn_15_0= ruleColumn ) )
            	    // InternalChartDsl.g:673:5: (lv_UsedColumn_15_0= ruleColumn )
            	    {
            	    // InternalChartDsl.g:673:5: (lv_UsedColumn_15_0= ruleColumn )
            	    // InternalChartDsl.g:674:6: lv_UsedColumn_15_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getDataFileAccess().getUsedColumnColumnParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_UsedColumn_15_0=ruleColumn();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataFileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"UsedColumn",
            	    							lv_UsedColumn_15_0,
            	    							"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.Column");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_16=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getDataFileAccess().getRightSquareBracketKeyword_9());
            		

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
    // $ANTLR end "ruleDataFile"


    // $ANTLR start "entryRuleColumnRef"
    // InternalChartDsl.g:700:1: entryRuleColumnRef returns [EObject current=null] : iv_ruleColumnRef= ruleColumnRef EOF ;
    public final EObject entryRuleColumnRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnRef = null;


        try {
            // InternalChartDsl.g:700:50: (iv_ruleColumnRef= ruleColumnRef EOF )
            // InternalChartDsl.g:701:2: iv_ruleColumnRef= ruleColumnRef EOF
            {
             newCompositeNode(grammarAccess.getColumnRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnRef=ruleColumnRef();

            state._fsp--;

             current =iv_ruleColumnRef; 
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
    // $ANTLR end "entryRuleColumnRef"


    // $ANTLR start "ruleColumnRef"
    // InternalChartDsl.g:707:1: ruleColumnRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleColumnRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalChartDsl.g:713:2: ( ( ( ruleEString ) ) )
            // InternalChartDsl.g:714:2: ( ( ruleEString ) )
            {
            // InternalChartDsl.g:714:2: ( ( ruleEString ) )
            // InternalChartDsl.g:715:3: ( ruleEString )
            {
            // InternalChartDsl.g:715:3: ( ruleEString )
            // InternalChartDsl.g:716:4: ruleEString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColumnRefRule());
            				}
            			

            				newCompositeNode(grammarAccess.getColumnRefAccess().getMakeRefToColumnCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleColumnRef"


    // $ANTLR start "entryRuleCondition"
    // InternalChartDsl.g:733:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalChartDsl.g:733:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalChartDsl.g:734:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalChartDsl.g:740:1: ruleCondition returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftElement_1_0= ruleColumnRef ) ) ( (lv_operator_2_0= ruleCompOperator ) )? ( (lv_rightElement_3_0= ruleConstant ) ) otherlv_4= ')' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_leftElement_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightElement_3_0 = null;



        	enterRule();

        try {
            // InternalChartDsl.g:746:2: ( (otherlv_0= '(' ( (lv_leftElement_1_0= ruleColumnRef ) ) ( (lv_operator_2_0= ruleCompOperator ) )? ( (lv_rightElement_3_0= ruleConstant ) ) otherlv_4= ')' ) )
            // InternalChartDsl.g:747:2: (otherlv_0= '(' ( (lv_leftElement_1_0= ruleColumnRef ) ) ( (lv_operator_2_0= ruleCompOperator ) )? ( (lv_rightElement_3_0= ruleConstant ) ) otherlv_4= ')' )
            {
            // InternalChartDsl.g:747:2: (otherlv_0= '(' ( (lv_leftElement_1_0= ruleColumnRef ) ) ( (lv_operator_2_0= ruleCompOperator ) )? ( (lv_rightElement_3_0= ruleConstant ) ) otherlv_4= ')' )
            // InternalChartDsl.g:748:3: otherlv_0= '(' ( (lv_leftElement_1_0= ruleColumnRef ) ) ( (lv_operator_2_0= ruleCompOperator ) )? ( (lv_rightElement_3_0= ruleConstant ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalChartDsl.g:752:3: ( (lv_leftElement_1_0= ruleColumnRef ) )
            // InternalChartDsl.g:753:4: (lv_leftElement_1_0= ruleColumnRef )
            {
            // InternalChartDsl.g:753:4: (lv_leftElement_1_0= ruleColumnRef )
            // InternalChartDsl.g:754:5: lv_leftElement_1_0= ruleColumnRef
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getLeftElementColumnRefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_leftElement_1_0=ruleColumnRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"leftElement",
            						lv_leftElement_1_0,
            						"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.ColumnRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChartDsl.g:771:3: ( (lv_operator_2_0= ruleCompOperator ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=56 && LA17_0<=61)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalChartDsl.g:772:4: (lv_operator_2_0= ruleCompOperator )
                    {
                    // InternalChartDsl.g:772:4: (lv_operator_2_0= ruleCompOperator )
                    // InternalChartDsl.g:773:5: lv_operator_2_0= ruleCompOperator
                    {

                    					newCompositeNode(grammarAccess.getConditionAccess().getOperatorCompOperatorEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_operator_2_0=ruleCompOperator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionRule());
                    					}
                    					set(
                    						current,
                    						"operator",
                    						lv_operator_2_0,
                    						"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.CompOperator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalChartDsl.g:790:3: ( (lv_rightElement_3_0= ruleConstant ) )
            // InternalChartDsl.g:791:4: (lv_rightElement_3_0= ruleConstant )
            {
            // InternalChartDsl.g:791:4: (lv_rightElement_3_0= ruleConstant )
            // InternalChartDsl.g:792:5: lv_rightElement_3_0= ruleConstant
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getRightElementConstantParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_rightElement_3_0=ruleConstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"rightElement",
            						lv_rightElement_3_0,
            						"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.Constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleColumn"
    // InternalChartDsl.g:817:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalChartDsl.g:817:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalChartDsl.g:818:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalChartDsl.g:824:1: ruleColumn returns [EObject current=null] : ( () otherlv_1= '(' (otherlv_2= 'index:' ( (lv_index_3_0= ruleEInt ) ) )? otherlv_4= 'as' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ')' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_index_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;



        	enterRule();

        try {
            // InternalChartDsl.g:830:2: ( ( () otherlv_1= '(' (otherlv_2= 'index:' ( (lv_index_3_0= ruleEInt ) ) )? otherlv_4= 'as' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ')' ) )
            // InternalChartDsl.g:831:2: ( () otherlv_1= '(' (otherlv_2= 'index:' ( (lv_index_3_0= ruleEInt ) ) )? otherlv_4= 'as' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ')' )
            {
            // InternalChartDsl.g:831:2: ( () otherlv_1= '(' (otherlv_2= 'index:' ( (lv_index_3_0= ruleEInt ) ) )? otherlv_4= 'as' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ')' )
            // InternalChartDsl.g:832:3: () otherlv_1= '(' (otherlv_2= 'index:' ( (lv_index_3_0= ruleEInt ) ) )? otherlv_4= 'as' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ')'
            {
            // InternalChartDsl.g:832:3: ()
            // InternalChartDsl.g:833:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getLeftParenthesisKeyword_1());
            		
            // InternalChartDsl.g:843:3: (otherlv_2= 'index:' ( (lv_index_3_0= ruleEInt ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalChartDsl.g:844:4: otherlv_2= 'index:' ( (lv_index_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_32); 

                    				newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getIndexKeyword_2_0());
                    			
                    // InternalChartDsl.g:848:4: ( (lv_index_3_0= ruleEInt ) )
                    // InternalChartDsl.g:849:5: (lv_index_3_0= ruleEInt )
                    {
                    // InternalChartDsl.g:849:5: (lv_index_3_0= ruleEInt )
                    // InternalChartDsl.g:850:6: lv_index_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getIndexEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_index_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnRule());
                    						}
                    						set(
                    							current,
                    							"index",
                    							lv_index_3_0,
                    							"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getAsKeyword_3());
            		
            // InternalChartDsl.g:872:3: ( (lv_name_5_0= ruleEString ) )
            // InternalChartDsl.g:873:4: (lv_name_5_0= ruleEString )
            {
            // InternalChartDsl.g:873:4: (lv_name_5_0= ruleEString )
            // InternalChartDsl.g:874:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getColumnAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleEInt"
    // InternalChartDsl.g:899:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalChartDsl.g:899:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalChartDsl.g:900:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalChartDsl.g:906:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalChartDsl.g:912:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalChartDsl.g:913:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalChartDsl.g:913:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalChartDsl.g:914:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalChartDsl.g:914:3: (kw= '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalChartDsl.g:915:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_34); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleIntVariable"
    // InternalChartDsl.g:932:1: entryRuleIntVariable returns [EObject current=null] : iv_ruleIntVariable= ruleIntVariable EOF ;
    public final EObject entryRuleIntVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVariable = null;


        try {
            // InternalChartDsl.g:932:52: (iv_ruleIntVariable= ruleIntVariable EOF )
            // InternalChartDsl.g:933:2: iv_ruleIntVariable= ruleIntVariable EOF
            {
             newCompositeNode(grammarAccess.getIntVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntVariable=ruleIntVariable();

            state._fsp--;

             current =iv_ruleIntVariable; 
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
    // $ANTLR end "entryRuleIntVariable"


    // $ANTLR start "ruleIntVariable"
    // InternalChartDsl.g:939:1: ruleIntVariable returns [EObject current=null] : ( () otherlv_1= 'int' otherlv_2= '(' ( (lv_initialValue_3_0= ruleEInt ) )? otherlv_4= ')' ) ;
    public final EObject ruleIntVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_initialValue_3_0 = null;



        	enterRule();

        try {
            // InternalChartDsl.g:945:2: ( ( () otherlv_1= 'int' otherlv_2= '(' ( (lv_initialValue_3_0= ruleEInt ) )? otherlv_4= ')' ) )
            // InternalChartDsl.g:946:2: ( () otherlv_1= 'int' otherlv_2= '(' ( (lv_initialValue_3_0= ruleEInt ) )? otherlv_4= ')' )
            {
            // InternalChartDsl.g:946:2: ( () otherlv_1= 'int' otherlv_2= '(' ( (lv_initialValue_3_0= ruleEInt ) )? otherlv_4= ')' )
            // InternalChartDsl.g:947:3: () otherlv_1= 'int' otherlv_2= '(' ( (lv_initialValue_3_0= ruleEInt ) )? otherlv_4= ')'
            {
            // InternalChartDsl.g:947:3: ()
            // InternalChartDsl.g:948:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntVariableAccess().getIntVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIntVariableAccess().getIntKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getIntVariableAccess().getLeftParenthesisKeyword_2());
            		
            // InternalChartDsl.g:962:3: ( (lv_initialValue_3_0= ruleEInt ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT||LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalChartDsl.g:963:4: (lv_initialValue_3_0= ruleEInt )
                    {
                    // InternalChartDsl.g:963:4: (lv_initialValue_3_0= ruleEInt )
                    // InternalChartDsl.g:964:5: lv_initialValue_3_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getIntVariableAccess().getInitialValueEIntParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_initialValue_3_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIntVariableRule());
                    					}
                    					set(
                    						current,
                    						"initialValue",
                    						lv_initialValue_3_0,
                    						"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIntVariableAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleIntVariable"


    // $ANTLR start "entryRuleStringVariable"
    // InternalChartDsl.g:989:1: entryRuleStringVariable returns [EObject current=null] : iv_ruleStringVariable= ruleStringVariable EOF ;
    public final EObject entryRuleStringVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariable = null;


        try {
            // InternalChartDsl.g:989:55: (iv_ruleStringVariable= ruleStringVariable EOF )
            // InternalChartDsl.g:990:2: iv_ruleStringVariable= ruleStringVariable EOF
            {
             newCompositeNode(grammarAccess.getStringVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringVariable=ruleStringVariable();

            state._fsp--;

             current =iv_ruleStringVariable; 
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
    // $ANTLR end "entryRuleStringVariable"


    // $ANTLR start "ruleStringVariable"
    // InternalChartDsl.g:996:1: ruleStringVariable returns [EObject current=null] : ( () otherlv_1= 'str' otherlv_2= '(' ( (lv_initialValue_3_0= ruleEString ) )? otherlv_4= ')' ) ;
    public final EObject ruleStringVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_initialValue_3_0 = null;



        	enterRule();

        try {
            // InternalChartDsl.g:1002:2: ( ( () otherlv_1= 'str' otherlv_2= '(' ( (lv_initialValue_3_0= ruleEString ) )? otherlv_4= ')' ) )
            // InternalChartDsl.g:1003:2: ( () otherlv_1= 'str' otherlv_2= '(' ( (lv_initialValue_3_0= ruleEString ) )? otherlv_4= ')' )
            {
            // InternalChartDsl.g:1003:2: ( () otherlv_1= 'str' otherlv_2= '(' ( (lv_initialValue_3_0= ruleEString ) )? otherlv_4= ')' )
            // InternalChartDsl.g:1004:3: () otherlv_1= 'str' otherlv_2= '(' ( (lv_initialValue_3_0= ruleEString ) )? otherlv_4= ')'
            {
            // InternalChartDsl.g:1004:3: ()
            // InternalChartDsl.g:1005:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringVariableAccess().getStringVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getStringVariableAccess().getStrKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getStringVariableAccess().getLeftParenthesisKeyword_2());
            		
            // InternalChartDsl.g:1019:3: ( (lv_initialValue_3_0= ruleEString ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalChartDsl.g:1020:4: (lv_initialValue_3_0= ruleEString )
                    {
                    // InternalChartDsl.g:1020:4: (lv_initialValue_3_0= ruleEString )
                    // InternalChartDsl.g:1021:5: lv_initialValue_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getStringVariableAccess().getInitialValueEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_initialValue_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStringVariableRule());
                    					}
                    					set(
                    						current,
                    						"initialValue",
                    						lv_initialValue_3_0,
                    						"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStringVariableAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleStringVariable"


    // $ANTLR start "entryRuleDoubleVariable"
    // InternalChartDsl.g:1046:1: entryRuleDoubleVariable returns [EObject current=null] : iv_ruleDoubleVariable= ruleDoubleVariable EOF ;
    public final EObject entryRuleDoubleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleVariable = null;


        try {
            // InternalChartDsl.g:1046:55: (iv_ruleDoubleVariable= ruleDoubleVariable EOF )
            // InternalChartDsl.g:1047:2: iv_ruleDoubleVariable= ruleDoubleVariable EOF
            {
             newCompositeNode(grammarAccess.getDoubleVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleVariable=ruleDoubleVariable();

            state._fsp--;

             current =iv_ruleDoubleVariable; 
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
    // $ANTLR end "entryRuleDoubleVariable"


    // $ANTLR start "ruleDoubleVariable"
    // InternalChartDsl.g:1053:1: ruleDoubleVariable returns [EObject current=null] : ( () otherlv_1= 'double' otherlv_2= '(' ( (lv_initialValue_3_0= ruleEDouble ) )? otherlv_4= ')' ) ;
    public final EObject ruleDoubleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_initialValue_3_0 = null;



        	enterRule();

        try {
            // InternalChartDsl.g:1059:2: ( ( () otherlv_1= 'double' otherlv_2= '(' ( (lv_initialValue_3_0= ruleEDouble ) )? otherlv_4= ')' ) )
            // InternalChartDsl.g:1060:2: ( () otherlv_1= 'double' otherlv_2= '(' ( (lv_initialValue_3_0= ruleEDouble ) )? otherlv_4= ')' )
            {
            // InternalChartDsl.g:1060:2: ( () otherlv_1= 'double' otherlv_2= '(' ( (lv_initialValue_3_0= ruleEDouble ) )? otherlv_4= ')' )
            // InternalChartDsl.g:1061:3: () otherlv_1= 'double' otherlv_2= '(' ( (lv_initialValue_3_0= ruleEDouble ) )? otherlv_4= ')'
            {
            // InternalChartDsl.g:1061:3: ()
            // InternalChartDsl.g:1062:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDoubleVariableAccess().getDoubleVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDoubleVariableAccess().getDoubleKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getDoubleVariableAccess().getLeftParenthesisKeyword_2());
            		
            // InternalChartDsl.g:1076:3: ( (lv_initialValue_3_0= ruleEDouble ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT||LA22_0==38||LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalChartDsl.g:1077:4: (lv_initialValue_3_0= ruleEDouble )
                    {
                    // InternalChartDsl.g:1077:4: (lv_initialValue_3_0= ruleEDouble )
                    // InternalChartDsl.g:1078:5: lv_initialValue_3_0= ruleEDouble
                    {

                    					newCompositeNode(grammarAccess.getDoubleVariableAccess().getInitialValueEDoubleParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_initialValue_3_0=ruleEDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDoubleVariableRule());
                    					}
                    					set(
                    						current,
                    						"initialValue",
                    						lv_initialValue_3_0,
                    						"fr.unice.cotedazur.l3ia2023.mycs.ChartDsl.EDouble");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDoubleVariableAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleDoubleVariable"


    // $ANTLR start "entryRuleEDouble"
    // InternalChartDsl.g:1103:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalChartDsl.g:1103:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalChartDsl.g:1104:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalChartDsl.g:1110:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalChartDsl.g:1116:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalChartDsl.g:1117:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalChartDsl.g:1117:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalChartDsl.g:1118:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalChartDsl.g:1118:3: (kw= '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalChartDsl.g:1119:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalChartDsl.g:1125:3: (this_INT_1= RULE_INT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalChartDsl.g:1126:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_39); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,42,FOLLOW_34); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_40); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalChartDsl.g:1146:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=43 && LA27_0<=44)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalChartDsl.g:1147:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalChartDsl.g:1147:4: (kw= 'E' | kw= 'e' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==43) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==44) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalChartDsl.g:1148:5: kw= 'E'
                            {
                            kw=(Token)match(input,43,FOLLOW_32); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalChartDsl.g:1154:5: kw= 'e'
                            {
                            kw=(Token)match(input,44,FOLLOW_32); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalChartDsl.g:1160:4: (kw= '-' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==38) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalChartDsl.g:1161:5: kw= '-'
                            {
                            kw=(Token)match(input,38,FOLLOW_34); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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


    // $ANTLR start "entryRuleEBoolean"
    // InternalChartDsl.g:1179:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalChartDsl.g:1179:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalChartDsl.g:1180:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalChartDsl.g:1186:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalChartDsl.g:1192:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalChartDsl.g:1193:2: (kw= 'true' | kw= 'false' )
            {
            // InternalChartDsl.g:1193:2: (kw= 'true' | kw= 'false' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            else if ( (LA28_0==46) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalChartDsl.g:1194:3: kw= 'true'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalChartDsl.g:1200:3: kw= 'false'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleChartType"
    // InternalChartDsl.g:1209:1: ruleChartType returns [Enumerator current=null] : ( (enumLiteral_0= 'BAR' ) | (enumLiteral_1= 'PIE' ) | (enumLiteral_2= 'SCATTER' ) | (enumLiteral_3= 'LINE' ) | (enumLiteral_4= 'MIXED' ) | (enumLiteral_5= 'BUBBLE' ) | (enumLiteral_6= 'RADAR' ) | (enumLiteral_7= 'AREA' ) | (enumLiteral_8= 'DONUT' ) ) ;
    public final Enumerator ruleChartType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalChartDsl.g:1215:2: ( ( (enumLiteral_0= 'BAR' ) | (enumLiteral_1= 'PIE' ) | (enumLiteral_2= 'SCATTER' ) | (enumLiteral_3= 'LINE' ) | (enumLiteral_4= 'MIXED' ) | (enumLiteral_5= 'BUBBLE' ) | (enumLiteral_6= 'RADAR' ) | (enumLiteral_7= 'AREA' ) | (enumLiteral_8= 'DONUT' ) ) )
            // InternalChartDsl.g:1216:2: ( (enumLiteral_0= 'BAR' ) | (enumLiteral_1= 'PIE' ) | (enumLiteral_2= 'SCATTER' ) | (enumLiteral_3= 'LINE' ) | (enumLiteral_4= 'MIXED' ) | (enumLiteral_5= 'BUBBLE' ) | (enumLiteral_6= 'RADAR' ) | (enumLiteral_7= 'AREA' ) | (enumLiteral_8= 'DONUT' ) )
            {
            // InternalChartDsl.g:1216:2: ( (enumLiteral_0= 'BAR' ) | (enumLiteral_1= 'PIE' ) | (enumLiteral_2= 'SCATTER' ) | (enumLiteral_3= 'LINE' ) | (enumLiteral_4= 'MIXED' ) | (enumLiteral_5= 'BUBBLE' ) | (enumLiteral_6= 'RADAR' ) | (enumLiteral_7= 'AREA' ) | (enumLiteral_8= 'DONUT' ) )
            int alt29=9;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt29=1;
                }
                break;
            case 48:
                {
                alt29=2;
                }
                break;
            case 49:
                {
                alt29=3;
                }
                break;
            case 50:
                {
                alt29=4;
                }
                break;
            case 51:
                {
                alt29=5;
                }
                break;
            case 52:
                {
                alt29=6;
                }
                break;
            case 53:
                {
                alt29=7;
                }
                break;
            case 54:
                {
                alt29=8;
                }
                break;
            case 55:
                {
                alt29=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalChartDsl.g:1217:3: (enumLiteral_0= 'BAR' )
                    {
                    // InternalChartDsl.g:1217:3: (enumLiteral_0= 'BAR' )
                    // InternalChartDsl.g:1218:4: enumLiteral_0= 'BAR'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getBAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getChartTypeAccess().getBAREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChartDsl.g:1225:3: (enumLiteral_1= 'PIE' )
                    {
                    // InternalChartDsl.g:1225:3: (enumLiteral_1= 'PIE' )
                    // InternalChartDsl.g:1226:4: enumLiteral_1= 'PIE'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getPIEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getChartTypeAccess().getPIEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalChartDsl.g:1233:3: (enumLiteral_2= 'SCATTER' )
                    {
                    // InternalChartDsl.g:1233:3: (enumLiteral_2= 'SCATTER' )
                    // InternalChartDsl.g:1234:4: enumLiteral_2= 'SCATTER'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getSCATTEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getChartTypeAccess().getSCATTEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalChartDsl.g:1241:3: (enumLiteral_3= 'LINE' )
                    {
                    // InternalChartDsl.g:1241:3: (enumLiteral_3= 'LINE' )
                    // InternalChartDsl.g:1242:4: enumLiteral_3= 'LINE'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getLINEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getChartTypeAccess().getLINEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalChartDsl.g:1249:3: (enumLiteral_4= 'MIXED' )
                    {
                    // InternalChartDsl.g:1249:3: (enumLiteral_4= 'MIXED' )
                    // InternalChartDsl.g:1250:4: enumLiteral_4= 'MIXED'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getMIXEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getChartTypeAccess().getMIXEDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalChartDsl.g:1257:3: (enumLiteral_5= 'BUBBLE' )
                    {
                    // InternalChartDsl.g:1257:3: (enumLiteral_5= 'BUBBLE' )
                    // InternalChartDsl.g:1258:4: enumLiteral_5= 'BUBBLE'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getBUBBLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getChartTypeAccess().getBUBBLEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalChartDsl.g:1265:3: (enumLiteral_6= 'RADAR' )
                    {
                    // InternalChartDsl.g:1265:3: (enumLiteral_6= 'RADAR' )
                    // InternalChartDsl.g:1266:4: enumLiteral_6= 'RADAR'
                    {
                    enumLiteral_6=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getRADAREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getChartTypeAccess().getRADAREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalChartDsl.g:1273:3: (enumLiteral_7= 'AREA' )
                    {
                    // InternalChartDsl.g:1273:3: (enumLiteral_7= 'AREA' )
                    // InternalChartDsl.g:1274:4: enumLiteral_7= 'AREA'
                    {
                    enumLiteral_7=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getAREAEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getChartTypeAccess().getAREAEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalChartDsl.g:1281:3: (enumLiteral_8= 'DONUT' )
                    {
                    // InternalChartDsl.g:1281:3: (enumLiteral_8= 'DONUT' )
                    // InternalChartDsl.g:1282:4: enumLiteral_8= 'DONUT'
                    {
                    enumLiteral_8=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getDONUTEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getChartTypeAccess().getDONUTEnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "ruleChartType"


    // $ANTLR start "ruleCompOperator"
    // InternalChartDsl.g:1292:1: ruleCompOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) ;
    public final Enumerator ruleCompOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalChartDsl.g:1298:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) )
            // InternalChartDsl.g:1299:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            {
            // InternalChartDsl.g:1299:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt30=1;
                }
                break;
            case 57:
                {
                alt30=2;
                }
                break;
            case 58:
                {
                alt30=3;
                }
                break;
            case 59:
                {
                alt30=4;
                }
                break;
            case 60:
                {
                alt30=5;
                }
                break;
            case 61:
                {
                alt30=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalChartDsl.g:1300:3: (enumLiteral_0= '==' )
                    {
                    // InternalChartDsl.g:1300:3: (enumLiteral_0= '==' )
                    // InternalChartDsl.g:1301:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChartDsl.g:1308:3: (enumLiteral_1= '>' )
                    {
                    // InternalChartDsl.g:1308:3: (enumLiteral_1= '>' )
                    // InternalChartDsl.g:1309:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalChartDsl.g:1316:3: (enumLiteral_2= '<' )
                    {
                    // InternalChartDsl.g:1316:3: (enumLiteral_2= '<' )
                    // InternalChartDsl.g:1317:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalChartDsl.g:1324:3: (enumLiteral_3= '!=' )
                    {
                    // InternalChartDsl.g:1324:3: (enumLiteral_3= '!=' )
                    // InternalChartDsl.g:1325:4: enumLiteral_3= '!='
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalChartDsl.g:1332:3: (enumLiteral_4= '>=' )
                    {
                    // InternalChartDsl.g:1332:3: (enumLiteral_4= '>=' )
                    // InternalChartDsl.g:1333:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCompOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalChartDsl.g:1340:3: (enumLiteral_5= '<=' )
                    {
                    // InternalChartDsl.g:1340:3: (enumLiteral_5= '<=' )
                    // InternalChartDsl.g:1341:4: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getCompOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleCompOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000790000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008C70000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008C60000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00FF800000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008C40000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x3F00038000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000200040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000044000200040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000180000000002L});

}