package fr.unice.cotedazur.l3ia2023.mycs.ide.contentassist.antlr.internal;

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
import fr.unice.cotedazur.l3ia2023.mycs.services.ChartDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChartDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'true'", "'false'", "'BAR'", "'PIE'", "'SCATTER'", "'LINE'", "'MIXED'", "'BUBBLE'", "'RADAR'", "'AREA'", "'DONUT'", "'=='", "'>'", "'<'", "'!='", "'>='", "'<='", "'Program'", "'Begin'", "'End'", "'Chart'", "'{'", "'}'", "'title'", "'type'", "'xAxis'", "'('", "')'", "','", "'yAxis'", "'Filter'", "'['", "']'", "'and'", "'Select'", "'Columns'", "'Load'", "'data'", "'from'", "'header'", "'types'", "'delimiter'", "'as'", "'index:'", "'-'", "'int'", "'str'", "'double'", "'.'"
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

    	public void setGrammarAccess(ChartDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalChartDsl.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalChartDsl.g:54:1: ( ruleProgram EOF )
            // InternalChartDsl.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalChartDsl.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalChartDsl.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalChartDsl.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalChartDsl.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalChartDsl.g:69:3: ( rule__Program__Group__0 )
            // InternalChartDsl.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleConstant"
    // InternalChartDsl.g:78:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalChartDsl.g:79:1: ( ruleConstant EOF )
            // InternalChartDsl.g:80:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalChartDsl.g:87:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:91:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalChartDsl.g:92:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalChartDsl.g:92:2: ( ( rule__Constant__Alternatives ) )
            // InternalChartDsl.g:93:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalChartDsl.g:94:3: ( rule__Constant__Alternatives )
            // InternalChartDsl.g:94:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleEString"
    // InternalChartDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalChartDsl.g:104:1: ( ruleEString EOF )
            // InternalChartDsl.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalChartDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalChartDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalChartDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalChartDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalChartDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalChartDsl.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleChart"
    // InternalChartDsl.g:128:1: entryRuleChart : ruleChart EOF ;
    public final void entryRuleChart() throws RecognitionException {
        try {
            // InternalChartDsl.g:129:1: ( ruleChart EOF )
            // InternalChartDsl.g:130:1: ruleChart EOF
            {
             before(grammarAccess.getChartRule()); 
            pushFollow(FOLLOW_1);
            ruleChart();

            state._fsp--;

             after(grammarAccess.getChartRule()); 
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
    // $ANTLR end "entryRuleChart"


    // $ANTLR start "ruleChart"
    // InternalChartDsl.g:137:1: ruleChart : ( ( rule__Chart__Group__0 ) ) ;
    public final void ruleChart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:141:2: ( ( ( rule__Chart__Group__0 ) ) )
            // InternalChartDsl.g:142:2: ( ( rule__Chart__Group__0 ) )
            {
            // InternalChartDsl.g:142:2: ( ( rule__Chart__Group__0 ) )
            // InternalChartDsl.g:143:3: ( rule__Chart__Group__0 )
            {
             before(grammarAccess.getChartAccess().getGroup()); 
            // InternalChartDsl.g:144:3: ( rule__Chart__Group__0 )
            // InternalChartDsl.g:144:4: rule__Chart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChart"


    // $ANTLR start "entryRuleDataFile"
    // InternalChartDsl.g:153:1: entryRuleDataFile : ruleDataFile EOF ;
    public final void entryRuleDataFile() throws RecognitionException {
        try {
            // InternalChartDsl.g:154:1: ( ruleDataFile EOF )
            // InternalChartDsl.g:155:1: ruleDataFile EOF
            {
             before(grammarAccess.getDataFileRule()); 
            pushFollow(FOLLOW_1);
            ruleDataFile();

            state._fsp--;

             after(grammarAccess.getDataFileRule()); 
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
    // $ANTLR end "entryRuleDataFile"


    // $ANTLR start "ruleDataFile"
    // InternalChartDsl.g:162:1: ruleDataFile : ( ( rule__DataFile__Group__0 ) ) ;
    public final void ruleDataFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:166:2: ( ( ( rule__DataFile__Group__0 ) ) )
            // InternalChartDsl.g:167:2: ( ( rule__DataFile__Group__0 ) )
            {
            // InternalChartDsl.g:167:2: ( ( rule__DataFile__Group__0 ) )
            // InternalChartDsl.g:168:3: ( rule__DataFile__Group__0 )
            {
             before(grammarAccess.getDataFileAccess().getGroup()); 
            // InternalChartDsl.g:169:3: ( rule__DataFile__Group__0 )
            // InternalChartDsl.g:169:4: rule__DataFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataFile"


    // $ANTLR start "entryRuleColumnRef"
    // InternalChartDsl.g:178:1: entryRuleColumnRef : ruleColumnRef EOF ;
    public final void entryRuleColumnRef() throws RecognitionException {
        try {
            // InternalChartDsl.g:179:1: ( ruleColumnRef EOF )
            // InternalChartDsl.g:180:1: ruleColumnRef EOF
            {
             before(grammarAccess.getColumnRefRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnRef();

            state._fsp--;

             after(grammarAccess.getColumnRefRule()); 
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
    // $ANTLR end "entryRuleColumnRef"


    // $ANTLR start "ruleColumnRef"
    // InternalChartDsl.g:187:1: ruleColumnRef : ( ( rule__ColumnRef__MakeRefToAssignment ) ) ;
    public final void ruleColumnRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:191:2: ( ( ( rule__ColumnRef__MakeRefToAssignment ) ) )
            // InternalChartDsl.g:192:2: ( ( rule__ColumnRef__MakeRefToAssignment ) )
            {
            // InternalChartDsl.g:192:2: ( ( rule__ColumnRef__MakeRefToAssignment ) )
            // InternalChartDsl.g:193:3: ( rule__ColumnRef__MakeRefToAssignment )
            {
             before(grammarAccess.getColumnRefAccess().getMakeRefToAssignment()); 
            // InternalChartDsl.g:194:3: ( rule__ColumnRef__MakeRefToAssignment )
            // InternalChartDsl.g:194:4: rule__ColumnRef__MakeRefToAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ColumnRef__MakeRefToAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColumnRefAccess().getMakeRefToAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnRef"


    // $ANTLR start "entryRuleCondition"
    // InternalChartDsl.g:203:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalChartDsl.g:204:1: ( ruleCondition EOF )
            // InternalChartDsl.g:205:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalChartDsl.g:212:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:216:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalChartDsl.g:217:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalChartDsl.g:217:2: ( ( rule__Condition__Group__0 ) )
            // InternalChartDsl.g:218:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalChartDsl.g:219:3: ( rule__Condition__Group__0 )
            // InternalChartDsl.g:219:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleColumn"
    // InternalChartDsl.g:228:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalChartDsl.g:229:1: ( ruleColumn EOF )
            // InternalChartDsl.g:230:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalChartDsl.g:237:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:241:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalChartDsl.g:242:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalChartDsl.g:242:2: ( ( rule__Column__Group__0 ) )
            // InternalChartDsl.g:243:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalChartDsl.g:244:3: ( rule__Column__Group__0 )
            // InternalChartDsl.g:244:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleEInt"
    // InternalChartDsl.g:253:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalChartDsl.g:254:1: ( ruleEInt EOF )
            // InternalChartDsl.g:255:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalChartDsl.g:262:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:266:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalChartDsl.g:267:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalChartDsl.g:267:2: ( ( rule__EInt__Group__0 ) )
            // InternalChartDsl.g:268:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalChartDsl.g:269:3: ( rule__EInt__Group__0 )
            // InternalChartDsl.g:269:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleIntVariable"
    // InternalChartDsl.g:278:1: entryRuleIntVariable : ruleIntVariable EOF ;
    public final void entryRuleIntVariable() throws RecognitionException {
        try {
            // InternalChartDsl.g:279:1: ( ruleIntVariable EOF )
            // InternalChartDsl.g:280:1: ruleIntVariable EOF
            {
             before(grammarAccess.getIntVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleIntVariable();

            state._fsp--;

             after(grammarAccess.getIntVariableRule()); 
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
    // $ANTLR end "entryRuleIntVariable"


    // $ANTLR start "ruleIntVariable"
    // InternalChartDsl.g:287:1: ruleIntVariable : ( ( rule__IntVariable__Group__0 ) ) ;
    public final void ruleIntVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:291:2: ( ( ( rule__IntVariable__Group__0 ) ) )
            // InternalChartDsl.g:292:2: ( ( rule__IntVariable__Group__0 ) )
            {
            // InternalChartDsl.g:292:2: ( ( rule__IntVariable__Group__0 ) )
            // InternalChartDsl.g:293:3: ( rule__IntVariable__Group__0 )
            {
             before(grammarAccess.getIntVariableAccess().getGroup()); 
            // InternalChartDsl.g:294:3: ( rule__IntVariable__Group__0 )
            // InternalChartDsl.g:294:4: rule__IntVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntVariable"


    // $ANTLR start "entryRuleStringVariable"
    // InternalChartDsl.g:303:1: entryRuleStringVariable : ruleStringVariable EOF ;
    public final void entryRuleStringVariable() throws RecognitionException {
        try {
            // InternalChartDsl.g:304:1: ( ruleStringVariable EOF )
            // InternalChartDsl.g:305:1: ruleStringVariable EOF
            {
             before(grammarAccess.getStringVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleStringVariable();

            state._fsp--;

             after(grammarAccess.getStringVariableRule()); 
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
    // $ANTLR end "entryRuleStringVariable"


    // $ANTLR start "ruleStringVariable"
    // InternalChartDsl.g:312:1: ruleStringVariable : ( ( rule__StringVariable__Group__0 ) ) ;
    public final void ruleStringVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:316:2: ( ( ( rule__StringVariable__Group__0 ) ) )
            // InternalChartDsl.g:317:2: ( ( rule__StringVariable__Group__0 ) )
            {
            // InternalChartDsl.g:317:2: ( ( rule__StringVariable__Group__0 ) )
            // InternalChartDsl.g:318:3: ( rule__StringVariable__Group__0 )
            {
             before(grammarAccess.getStringVariableAccess().getGroup()); 
            // InternalChartDsl.g:319:3: ( rule__StringVariable__Group__0 )
            // InternalChartDsl.g:319:4: rule__StringVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringVariable"


    // $ANTLR start "entryRuleDoubleVariable"
    // InternalChartDsl.g:328:1: entryRuleDoubleVariable : ruleDoubleVariable EOF ;
    public final void entryRuleDoubleVariable() throws RecognitionException {
        try {
            // InternalChartDsl.g:329:1: ( ruleDoubleVariable EOF )
            // InternalChartDsl.g:330:1: ruleDoubleVariable EOF
            {
             before(grammarAccess.getDoubleVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDoubleVariable();

            state._fsp--;

             after(grammarAccess.getDoubleVariableRule()); 
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
    // $ANTLR end "entryRuleDoubleVariable"


    // $ANTLR start "ruleDoubleVariable"
    // InternalChartDsl.g:337:1: ruleDoubleVariable : ( ( rule__DoubleVariable__Group__0 ) ) ;
    public final void ruleDoubleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:341:2: ( ( ( rule__DoubleVariable__Group__0 ) ) )
            // InternalChartDsl.g:342:2: ( ( rule__DoubleVariable__Group__0 ) )
            {
            // InternalChartDsl.g:342:2: ( ( rule__DoubleVariable__Group__0 ) )
            // InternalChartDsl.g:343:3: ( rule__DoubleVariable__Group__0 )
            {
             before(grammarAccess.getDoubleVariableAccess().getGroup()); 
            // InternalChartDsl.g:344:3: ( rule__DoubleVariable__Group__0 )
            // InternalChartDsl.g:344:4: rule__DoubleVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleVariable"


    // $ANTLR start "entryRuleEDouble"
    // InternalChartDsl.g:353:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalChartDsl.g:354:1: ( ruleEDouble EOF )
            // InternalChartDsl.g:355:1: ruleEDouble EOF
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
    // InternalChartDsl.g:362:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:366:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalChartDsl.g:367:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalChartDsl.g:367:2: ( ( rule__EDouble__Group__0 ) )
            // InternalChartDsl.g:368:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalChartDsl.g:369:3: ( rule__EDouble__Group__0 )
            // InternalChartDsl.g:369:4: rule__EDouble__Group__0
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalChartDsl.g:378:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalChartDsl.g:379:1: ( ruleEBoolean EOF )
            // InternalChartDsl.g:380:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalChartDsl.g:387:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:391:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalChartDsl.g:392:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalChartDsl.g:392:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalChartDsl.g:393:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalChartDsl.g:394:3: ( rule__EBoolean__Alternatives )
            // InternalChartDsl.g:394:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleChartType"
    // InternalChartDsl.g:403:1: ruleChartType : ( ( rule__ChartType__Alternatives ) ) ;
    public final void ruleChartType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:407:1: ( ( ( rule__ChartType__Alternatives ) ) )
            // InternalChartDsl.g:408:2: ( ( rule__ChartType__Alternatives ) )
            {
            // InternalChartDsl.g:408:2: ( ( rule__ChartType__Alternatives ) )
            // InternalChartDsl.g:409:3: ( rule__ChartType__Alternatives )
            {
             before(grammarAccess.getChartTypeAccess().getAlternatives()); 
            // InternalChartDsl.g:410:3: ( rule__ChartType__Alternatives )
            // InternalChartDsl.g:410:4: rule__ChartType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ChartType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChartTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChartType"


    // $ANTLR start "ruleCompOperator"
    // InternalChartDsl.g:419:1: ruleCompOperator : ( ( rule__CompOperator__Alternatives ) ) ;
    public final void ruleCompOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:423:1: ( ( ( rule__CompOperator__Alternatives ) ) )
            // InternalChartDsl.g:424:2: ( ( rule__CompOperator__Alternatives ) )
            {
            // InternalChartDsl.g:424:2: ( ( rule__CompOperator__Alternatives ) )
            // InternalChartDsl.g:425:3: ( rule__CompOperator__Alternatives )
            {
             before(grammarAccess.getCompOperatorAccess().getAlternatives()); 
            // InternalChartDsl.g:426:3: ( rule__CompOperator__Alternatives )
            // InternalChartDsl.g:426:4: rule__CompOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompOperator"


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalChartDsl.g:434:1: rule__Constant__Alternatives : ( ( ruleIntVariable ) | ( ruleStringVariable ) | ( ruleDoubleVariable ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:438:1: ( ( ruleIntVariable ) | ( ruleStringVariable ) | ( ruleDoubleVariable ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt1=1;
                }
                break;
            case 59:
                {
                alt1=2;
                }
                break;
            case 60:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalChartDsl.g:439:2: ( ruleIntVariable )
                    {
                    // InternalChartDsl.g:439:2: ( ruleIntVariable )
                    // InternalChartDsl.g:440:3: ruleIntVariable
                    {
                     before(grammarAccess.getConstantAccess().getIntVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntVariable();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getIntVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChartDsl.g:445:2: ( ruleStringVariable )
                    {
                    // InternalChartDsl.g:445:2: ( ruleStringVariable )
                    // InternalChartDsl.g:446:3: ruleStringVariable
                    {
                     before(grammarAccess.getConstantAccess().getStringVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringVariable();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getStringVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChartDsl.g:451:2: ( ruleDoubleVariable )
                    {
                    // InternalChartDsl.g:451:2: ( ruleDoubleVariable )
                    // InternalChartDsl.g:452:3: ruleDoubleVariable
                    {
                     before(grammarAccess.getConstantAccess().getDoubleVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDoubleVariable();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getDoubleVariableParserRuleCall_2()); 

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
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalChartDsl.g:461:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:465:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalChartDsl.g:466:2: ( RULE_STRING )
                    {
                    // InternalChartDsl.g:466:2: ( RULE_STRING )
                    // InternalChartDsl.g:467:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChartDsl.g:472:2: ( RULE_ID )
                    {
                    // InternalChartDsl.g:472:2: ( RULE_ID )
                    // InternalChartDsl.g:473:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalChartDsl.g:482:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:486:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalChartDsl.g:487:2: ( 'E' )
                    {
                    // InternalChartDsl.g:487:2: ( 'E' )
                    // InternalChartDsl.g:488:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChartDsl.g:493:2: ( 'e' )
                    {
                    // InternalChartDsl.g:493:2: ( 'e' )
                    // InternalChartDsl.g:494:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalChartDsl.g:503:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:507:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalChartDsl.g:508:2: ( 'true' )
                    {
                    // InternalChartDsl.g:508:2: ( 'true' )
                    // InternalChartDsl.g:509:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChartDsl.g:514:2: ( 'false' )
                    {
                    // InternalChartDsl.g:514:2: ( 'false' )
                    // InternalChartDsl.g:515:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__ChartType__Alternatives"
    // InternalChartDsl.g:524:1: rule__ChartType__Alternatives : ( ( ( 'BAR' ) ) | ( ( 'PIE' ) ) | ( ( 'SCATTER' ) ) | ( ( 'LINE' ) ) | ( ( 'MIXED' ) ) | ( ( 'BUBBLE' ) ) | ( ( 'RADAR' ) ) | ( ( 'AREA' ) ) | ( ( 'DONUT' ) ) );
    public final void rule__ChartType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:528:1: ( ( ( 'BAR' ) ) | ( ( 'PIE' ) ) | ( ( 'SCATTER' ) ) | ( ( 'LINE' ) ) | ( ( 'MIXED' ) ) | ( ( 'BUBBLE' ) ) | ( ( 'RADAR' ) ) | ( ( 'AREA' ) ) | ( ( 'DONUT' ) ) )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            case 21:
                {
                alt5=7;
                }
                break;
            case 22:
                {
                alt5=8;
                }
                break;
            case 23:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalChartDsl.g:529:2: ( ( 'BAR' ) )
                    {
                    // InternalChartDsl.g:529:2: ( ( 'BAR' ) )
                    // InternalChartDsl.g:530:3: ( 'BAR' )
                    {
                     before(grammarAccess.getChartTypeAccess().getBAREnumLiteralDeclaration_0()); 
                    // InternalChartDsl.g:531:3: ( 'BAR' )
                    // InternalChartDsl.g:531:4: 'BAR'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getBAREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChartDsl.g:535:2: ( ( 'PIE' ) )
                    {
                    // InternalChartDsl.g:535:2: ( ( 'PIE' ) )
                    // InternalChartDsl.g:536:3: ( 'PIE' )
                    {
                     before(grammarAccess.getChartTypeAccess().getPIEEnumLiteralDeclaration_1()); 
                    // InternalChartDsl.g:537:3: ( 'PIE' )
                    // InternalChartDsl.g:537:4: 'PIE'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getPIEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChartDsl.g:541:2: ( ( 'SCATTER' ) )
                    {
                    // InternalChartDsl.g:541:2: ( ( 'SCATTER' ) )
                    // InternalChartDsl.g:542:3: ( 'SCATTER' )
                    {
                     before(grammarAccess.getChartTypeAccess().getSCATTEREnumLiteralDeclaration_2()); 
                    // InternalChartDsl.g:543:3: ( 'SCATTER' )
                    // InternalChartDsl.g:543:4: 'SCATTER'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getSCATTEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChartDsl.g:547:2: ( ( 'LINE' ) )
                    {
                    // InternalChartDsl.g:547:2: ( ( 'LINE' ) )
                    // InternalChartDsl.g:548:3: ( 'LINE' )
                    {
                     before(grammarAccess.getChartTypeAccess().getLINEEnumLiteralDeclaration_3()); 
                    // InternalChartDsl.g:549:3: ( 'LINE' )
                    // InternalChartDsl.g:549:4: 'LINE'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getLINEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChartDsl.g:553:2: ( ( 'MIXED' ) )
                    {
                    // InternalChartDsl.g:553:2: ( ( 'MIXED' ) )
                    // InternalChartDsl.g:554:3: ( 'MIXED' )
                    {
                     before(grammarAccess.getChartTypeAccess().getMIXEDEnumLiteralDeclaration_4()); 
                    // InternalChartDsl.g:555:3: ( 'MIXED' )
                    // InternalChartDsl.g:555:4: 'MIXED'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getMIXEDEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalChartDsl.g:559:2: ( ( 'BUBBLE' ) )
                    {
                    // InternalChartDsl.g:559:2: ( ( 'BUBBLE' ) )
                    // InternalChartDsl.g:560:3: ( 'BUBBLE' )
                    {
                     before(grammarAccess.getChartTypeAccess().getBUBBLEEnumLiteralDeclaration_5()); 
                    // InternalChartDsl.g:561:3: ( 'BUBBLE' )
                    // InternalChartDsl.g:561:4: 'BUBBLE'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getBUBBLEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalChartDsl.g:565:2: ( ( 'RADAR' ) )
                    {
                    // InternalChartDsl.g:565:2: ( ( 'RADAR' ) )
                    // InternalChartDsl.g:566:3: ( 'RADAR' )
                    {
                     before(grammarAccess.getChartTypeAccess().getRADAREnumLiteralDeclaration_6()); 
                    // InternalChartDsl.g:567:3: ( 'RADAR' )
                    // InternalChartDsl.g:567:4: 'RADAR'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getRADAREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalChartDsl.g:571:2: ( ( 'AREA' ) )
                    {
                    // InternalChartDsl.g:571:2: ( ( 'AREA' ) )
                    // InternalChartDsl.g:572:3: ( 'AREA' )
                    {
                     before(grammarAccess.getChartTypeAccess().getAREAEnumLiteralDeclaration_7()); 
                    // InternalChartDsl.g:573:3: ( 'AREA' )
                    // InternalChartDsl.g:573:4: 'AREA'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getAREAEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalChartDsl.g:577:2: ( ( 'DONUT' ) )
                    {
                    // InternalChartDsl.g:577:2: ( ( 'DONUT' ) )
                    // InternalChartDsl.g:578:3: ( 'DONUT' )
                    {
                     before(grammarAccess.getChartTypeAccess().getDONUTEnumLiteralDeclaration_8()); 
                    // InternalChartDsl.g:579:3: ( 'DONUT' )
                    // InternalChartDsl.g:579:4: 'DONUT'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getDONUTEnumLiteralDeclaration_8()); 

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
    // $ANTLR end "rule__ChartType__Alternatives"


    // $ANTLR start "rule__CompOperator__Alternatives"
    // InternalChartDsl.g:587:1: rule__CompOperator__Alternatives : ( ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__CompOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:591:1: ( ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 28:
                {
                alt6=5;
                }
                break;
            case 29:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalChartDsl.g:592:2: ( ( '==' ) )
                    {
                    // InternalChartDsl.g:592:2: ( ( '==' ) )
                    // InternalChartDsl.g:593:3: ( '==' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalChartDsl.g:594:3: ( '==' )
                    // InternalChartDsl.g:594:4: '=='
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChartDsl.g:598:2: ( ( '>' ) )
                    {
                    // InternalChartDsl.g:598:2: ( ( '>' ) )
                    // InternalChartDsl.g:599:3: ( '>' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    // InternalChartDsl.g:600:3: ( '>' )
                    // InternalChartDsl.g:600:4: '>'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChartDsl.g:604:2: ( ( '<' ) )
                    {
                    // InternalChartDsl.g:604:2: ( ( '<' ) )
                    // InternalChartDsl.g:605:3: ( '<' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_2()); 
                    // InternalChartDsl.g:606:3: ( '<' )
                    // InternalChartDsl.g:606:4: '<'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChartDsl.g:610:2: ( ( '!=' ) )
                    {
                    // InternalChartDsl.g:610:2: ( ( '!=' ) )
                    // InternalChartDsl.g:611:3: ( '!=' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3()); 
                    // InternalChartDsl.g:612:3: ( '!=' )
                    // InternalChartDsl.g:612:4: '!='
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChartDsl.g:616:2: ( ( '>=' ) )
                    {
                    // InternalChartDsl.g:616:2: ( ( '>=' ) )
                    // InternalChartDsl.g:617:3: ( '>=' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4()); 
                    // InternalChartDsl.g:618:3: ( '>=' )
                    // InternalChartDsl.g:618:4: '>='
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalChartDsl.g:622:2: ( ( '<=' ) )
                    {
                    // InternalChartDsl.g:622:2: ( ( '<=' ) )
                    // InternalChartDsl.g:623:3: ( '<=' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_5()); 
                    // InternalChartDsl.g:624:3: ( '<=' )
                    // InternalChartDsl.g:624:4: '<='
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__CompOperator__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalChartDsl.g:632:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:636:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalChartDsl.g:637:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalChartDsl.g:644:1: rule__Program__Group__0__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:648:1: ( ( 'Program' ) )
            // InternalChartDsl.g:649:1: ( 'Program' )
            {
            // InternalChartDsl.g:649:1: ( 'Program' )
            // InternalChartDsl.g:650:2: 'Program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalChartDsl.g:659:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:663:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalChartDsl.g:664:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalChartDsl.g:671:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:675:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalChartDsl.g:676:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalChartDsl.g:676:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalChartDsl.g:677:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalChartDsl.g:678:2: ( rule__Program__NameAssignment_1 )
            // InternalChartDsl.g:678:3: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalChartDsl.g:686:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:690:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalChartDsl.g:691:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalChartDsl.g:698:1: rule__Program__Group__2__Impl : ( 'Begin' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:702:1: ( ( 'Begin' ) )
            // InternalChartDsl.g:703:1: ( 'Begin' )
            {
            // InternalChartDsl.g:703:1: ( 'Begin' )
            // InternalChartDsl.g:704:2: 'Begin'
            {
             before(grammarAccess.getProgramAccess().getBeginKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getBeginKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalChartDsl.g:713:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:717:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalChartDsl.g:718:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalChartDsl.g:725:1: rule__Program__Group__3__Impl : ( ( rule__Program__CsvFileAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:729:1: ( ( ( rule__Program__CsvFileAssignment_3 ) ) )
            // InternalChartDsl.g:730:1: ( ( rule__Program__CsvFileAssignment_3 ) )
            {
            // InternalChartDsl.g:730:1: ( ( rule__Program__CsvFileAssignment_3 ) )
            // InternalChartDsl.g:731:2: ( rule__Program__CsvFileAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getCsvFileAssignment_3()); 
            // InternalChartDsl.g:732:2: ( rule__Program__CsvFileAssignment_3 )
            // InternalChartDsl.g:732:3: rule__Program__CsvFileAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Program__CsvFileAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getCsvFileAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // InternalChartDsl.g:740:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:744:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalChartDsl.g:745:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // InternalChartDsl.g:752:1: rule__Program__Group__4__Impl : ( ( rule__Program__ChartAssignment_4 ) ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:756:1: ( ( ( rule__Program__ChartAssignment_4 ) ) )
            // InternalChartDsl.g:757:1: ( ( rule__Program__ChartAssignment_4 ) )
            {
            // InternalChartDsl.g:757:1: ( ( rule__Program__ChartAssignment_4 ) )
            // InternalChartDsl.g:758:2: ( rule__Program__ChartAssignment_4 )
            {
             before(grammarAccess.getProgramAccess().getChartAssignment_4()); 
            // InternalChartDsl.g:759:2: ( rule__Program__ChartAssignment_4 )
            // InternalChartDsl.g:759:3: rule__Program__ChartAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Program__ChartAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getChartAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group__5"
    // InternalChartDsl.g:767:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:771:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // InternalChartDsl.g:772:2: rule__Program__Group__5__Impl rule__Program__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5"


    // $ANTLR start "rule__Program__Group__5__Impl"
    // InternalChartDsl.g:779:1: rule__Program__Group__5__Impl : ( ( rule__Program__ChartAssignment_5 )* ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:783:1: ( ( ( rule__Program__ChartAssignment_5 )* ) )
            // InternalChartDsl.g:784:1: ( ( rule__Program__ChartAssignment_5 )* )
            {
            // InternalChartDsl.g:784:1: ( ( rule__Program__ChartAssignment_5 )* )
            // InternalChartDsl.g:785:2: ( rule__Program__ChartAssignment_5 )*
            {
             before(grammarAccess.getProgramAccess().getChartAssignment_5()); 
            // InternalChartDsl.g:786:2: ( rule__Program__ChartAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalChartDsl.g:786:3: rule__Program__ChartAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Program__ChartAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getChartAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5__Impl"


    // $ANTLR start "rule__Program__Group__6"
    // InternalChartDsl.g:794:1: rule__Program__Group__6 : rule__Program__Group__6__Impl ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:798:1: ( rule__Program__Group__6__Impl )
            // InternalChartDsl.g:799:2: rule__Program__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__6"


    // $ANTLR start "rule__Program__Group__6__Impl"
    // InternalChartDsl.g:805:1: rule__Program__Group__6__Impl : ( 'End' ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:809:1: ( ( 'End' ) )
            // InternalChartDsl.g:810:1: ( 'End' )
            {
            // InternalChartDsl.g:810:1: ( 'End' )
            // InternalChartDsl.g:811:2: 'End'
            {
             before(grammarAccess.getProgramAccess().getEndKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getEndKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__6__Impl"


    // $ANTLR start "rule__Chart__Group__0"
    // InternalChartDsl.g:821:1: rule__Chart__Group__0 : rule__Chart__Group__0__Impl rule__Chart__Group__1 ;
    public final void rule__Chart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:825:1: ( rule__Chart__Group__0__Impl rule__Chart__Group__1 )
            // InternalChartDsl.g:826:2: rule__Chart__Group__0__Impl rule__Chart__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Chart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__0"


    // $ANTLR start "rule__Chart__Group__0__Impl"
    // InternalChartDsl.g:833:1: rule__Chart__Group__0__Impl : ( () ) ;
    public final void rule__Chart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:837:1: ( ( () ) )
            // InternalChartDsl.g:838:1: ( () )
            {
            // InternalChartDsl.g:838:1: ( () )
            // InternalChartDsl.g:839:2: ()
            {
             before(grammarAccess.getChartAccess().getChartAction_0()); 
            // InternalChartDsl.g:840:2: ()
            // InternalChartDsl.g:840:3: 
            {
            }

             after(grammarAccess.getChartAccess().getChartAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__0__Impl"


    // $ANTLR start "rule__Chart__Group__1"
    // InternalChartDsl.g:848:1: rule__Chart__Group__1 : rule__Chart__Group__1__Impl rule__Chart__Group__2 ;
    public final void rule__Chart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:852:1: ( rule__Chart__Group__1__Impl rule__Chart__Group__2 )
            // InternalChartDsl.g:853:2: rule__Chart__Group__1__Impl rule__Chart__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Chart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__1"


    // $ANTLR start "rule__Chart__Group__1__Impl"
    // InternalChartDsl.g:860:1: rule__Chart__Group__1__Impl : ( 'Chart' ) ;
    public final void rule__Chart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:864:1: ( ( 'Chart' ) )
            // InternalChartDsl.g:865:1: ( 'Chart' )
            {
            // InternalChartDsl.g:865:1: ( 'Chart' )
            // InternalChartDsl.g:866:2: 'Chart'
            {
             before(grammarAccess.getChartAccess().getChartKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getChartKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__1__Impl"


    // $ANTLR start "rule__Chart__Group__2"
    // InternalChartDsl.g:875:1: rule__Chart__Group__2 : rule__Chart__Group__2__Impl rule__Chart__Group__3 ;
    public final void rule__Chart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:879:1: ( rule__Chart__Group__2__Impl rule__Chart__Group__3 )
            // InternalChartDsl.g:880:2: rule__Chart__Group__2__Impl rule__Chart__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Chart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__2"


    // $ANTLR start "rule__Chart__Group__2__Impl"
    // InternalChartDsl.g:887:1: rule__Chart__Group__2__Impl : ( '{' ) ;
    public final void rule__Chart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:891:1: ( ( '{' ) )
            // InternalChartDsl.g:892:1: ( '{' )
            {
            // InternalChartDsl.g:892:1: ( '{' )
            // InternalChartDsl.g:893:2: '{'
            {
             before(grammarAccess.getChartAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__2__Impl"


    // $ANTLR start "rule__Chart__Group__3"
    // InternalChartDsl.g:902:1: rule__Chart__Group__3 : rule__Chart__Group__3__Impl rule__Chart__Group__4 ;
    public final void rule__Chart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:906:1: ( rule__Chart__Group__3__Impl rule__Chart__Group__4 )
            // InternalChartDsl.g:907:2: rule__Chart__Group__3__Impl rule__Chart__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Chart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__3"


    // $ANTLR start "rule__Chart__Group__3__Impl"
    // InternalChartDsl.g:914:1: rule__Chart__Group__3__Impl : ( ( rule__Chart__Group_3__0 )? ) ;
    public final void rule__Chart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:918:1: ( ( ( rule__Chart__Group_3__0 )? ) )
            // InternalChartDsl.g:919:1: ( ( rule__Chart__Group_3__0 )? )
            {
            // InternalChartDsl.g:919:1: ( ( rule__Chart__Group_3__0 )? )
            // InternalChartDsl.g:920:2: ( rule__Chart__Group_3__0 )?
            {
             before(grammarAccess.getChartAccess().getGroup_3()); 
            // InternalChartDsl.g:921:2: ( rule__Chart__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalChartDsl.g:921:3: rule__Chart__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chart__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChartAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__3__Impl"


    // $ANTLR start "rule__Chart__Group__4"
    // InternalChartDsl.g:929:1: rule__Chart__Group__4 : rule__Chart__Group__4__Impl rule__Chart__Group__5 ;
    public final void rule__Chart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:933:1: ( rule__Chart__Group__4__Impl rule__Chart__Group__5 )
            // InternalChartDsl.g:934:2: rule__Chart__Group__4__Impl rule__Chart__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Chart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__4"


    // $ANTLR start "rule__Chart__Group__4__Impl"
    // InternalChartDsl.g:941:1: rule__Chart__Group__4__Impl : ( ( rule__Chart__Group_4__0 )? ) ;
    public final void rule__Chart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:945:1: ( ( ( rule__Chart__Group_4__0 )? ) )
            // InternalChartDsl.g:946:1: ( ( rule__Chart__Group_4__0 )? )
            {
            // InternalChartDsl.g:946:1: ( ( rule__Chart__Group_4__0 )? )
            // InternalChartDsl.g:947:2: ( rule__Chart__Group_4__0 )?
            {
             before(grammarAccess.getChartAccess().getGroup_4()); 
            // InternalChartDsl.g:948:2: ( rule__Chart__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalChartDsl.g:948:3: rule__Chart__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chart__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChartAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__4__Impl"


    // $ANTLR start "rule__Chart__Group__5"
    // InternalChartDsl.g:956:1: rule__Chart__Group__5 : rule__Chart__Group__5__Impl rule__Chart__Group__6 ;
    public final void rule__Chart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:960:1: ( rule__Chart__Group__5__Impl rule__Chart__Group__6 )
            // InternalChartDsl.g:961:2: rule__Chart__Group__5__Impl rule__Chart__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Chart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__5"


    // $ANTLR start "rule__Chart__Group__5__Impl"
    // InternalChartDsl.g:968:1: rule__Chart__Group__5__Impl : ( ( rule__Chart__Group_5__0 )? ) ;
    public final void rule__Chart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:972:1: ( ( ( rule__Chart__Group_5__0 )? ) )
            // InternalChartDsl.g:973:1: ( ( rule__Chart__Group_5__0 )? )
            {
            // InternalChartDsl.g:973:1: ( ( rule__Chart__Group_5__0 )? )
            // InternalChartDsl.g:974:2: ( rule__Chart__Group_5__0 )?
            {
             before(grammarAccess.getChartAccess().getGroup_5()); 
            // InternalChartDsl.g:975:2: ( rule__Chart__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalChartDsl.g:975:3: rule__Chart__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chart__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChartAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__5__Impl"


    // $ANTLR start "rule__Chart__Group__6"
    // InternalChartDsl.g:983:1: rule__Chart__Group__6 : rule__Chart__Group__6__Impl rule__Chart__Group__7 ;
    public final void rule__Chart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:987:1: ( rule__Chart__Group__6__Impl rule__Chart__Group__7 )
            // InternalChartDsl.g:988:2: rule__Chart__Group__6__Impl rule__Chart__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Chart__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__6"


    // $ANTLR start "rule__Chart__Group__6__Impl"
    // InternalChartDsl.g:995:1: rule__Chart__Group__6__Impl : ( ( rule__Chart__Group_6__0 )? ) ;
    public final void rule__Chart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:999:1: ( ( ( rule__Chart__Group_6__0 )? ) )
            // InternalChartDsl.g:1000:1: ( ( rule__Chart__Group_6__0 )? )
            {
            // InternalChartDsl.g:1000:1: ( ( rule__Chart__Group_6__0 )? )
            // InternalChartDsl.g:1001:2: ( rule__Chart__Group_6__0 )?
            {
             before(grammarAccess.getChartAccess().getGroup_6()); 
            // InternalChartDsl.g:1002:2: ( rule__Chart__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalChartDsl.g:1002:3: rule__Chart__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chart__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChartAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__6__Impl"


    // $ANTLR start "rule__Chart__Group__7"
    // InternalChartDsl.g:1010:1: rule__Chart__Group__7 : rule__Chart__Group__7__Impl rule__Chart__Group__8 ;
    public final void rule__Chart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1014:1: ( rule__Chart__Group__7__Impl rule__Chart__Group__8 )
            // InternalChartDsl.g:1015:2: rule__Chart__Group__7__Impl rule__Chart__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Chart__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__7"


    // $ANTLR start "rule__Chart__Group__7__Impl"
    // InternalChartDsl.g:1022:1: rule__Chart__Group__7__Impl : ( ( rule__Chart__Group_7__0 )? ) ;
    public final void rule__Chart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1026:1: ( ( ( rule__Chart__Group_7__0 )? ) )
            // InternalChartDsl.g:1027:1: ( ( rule__Chart__Group_7__0 )? )
            {
            // InternalChartDsl.g:1027:1: ( ( rule__Chart__Group_7__0 )? )
            // InternalChartDsl.g:1028:2: ( rule__Chart__Group_7__0 )?
            {
             before(grammarAccess.getChartAccess().getGroup_7()); 
            // InternalChartDsl.g:1029:2: ( rule__Chart__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==43) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalChartDsl.g:1029:3: rule__Chart__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chart__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChartAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__7__Impl"


    // $ANTLR start "rule__Chart__Group__8"
    // InternalChartDsl.g:1037:1: rule__Chart__Group__8 : rule__Chart__Group__8__Impl ;
    public final void rule__Chart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1041:1: ( rule__Chart__Group__8__Impl )
            // InternalChartDsl.g:1042:2: rule__Chart__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chart__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__8"


    // $ANTLR start "rule__Chart__Group__8__Impl"
    // InternalChartDsl.g:1048:1: rule__Chart__Group__8__Impl : ( '}' ) ;
    public final void rule__Chart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1052:1: ( ( '}' ) )
            // InternalChartDsl.g:1053:1: ( '}' )
            {
            // InternalChartDsl.g:1053:1: ( '}' )
            // InternalChartDsl.g:1054:2: '}'
            {
             before(grammarAccess.getChartAccess().getRightCurlyBracketKeyword_8()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__8__Impl"


    // $ANTLR start "rule__Chart__Group_3__0"
    // InternalChartDsl.g:1064:1: rule__Chart__Group_3__0 : rule__Chart__Group_3__0__Impl rule__Chart__Group_3__1 ;
    public final void rule__Chart__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1068:1: ( rule__Chart__Group_3__0__Impl rule__Chart__Group_3__1 )
            // InternalChartDsl.g:1069:2: rule__Chart__Group_3__0__Impl rule__Chart__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Chart__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_3__0"


    // $ANTLR start "rule__Chart__Group_3__0__Impl"
    // InternalChartDsl.g:1076:1: rule__Chart__Group_3__0__Impl : ( 'title' ) ;
    public final void rule__Chart__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1080:1: ( ( 'title' ) )
            // InternalChartDsl.g:1081:1: ( 'title' )
            {
            // InternalChartDsl.g:1081:1: ( 'title' )
            // InternalChartDsl.g:1082:2: 'title'
            {
             before(grammarAccess.getChartAccess().getTitleKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getTitleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_3__0__Impl"


    // $ANTLR start "rule__Chart__Group_3__1"
    // InternalChartDsl.g:1091:1: rule__Chart__Group_3__1 : rule__Chart__Group_3__1__Impl ;
    public final void rule__Chart__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1095:1: ( rule__Chart__Group_3__1__Impl )
            // InternalChartDsl.g:1096:2: rule__Chart__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chart__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_3__1"


    // $ANTLR start "rule__Chart__Group_3__1__Impl"
    // InternalChartDsl.g:1102:1: rule__Chart__Group_3__1__Impl : ( ( rule__Chart__TitleAssignment_3_1 ) ) ;
    public final void rule__Chart__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1106:1: ( ( ( rule__Chart__TitleAssignment_3_1 ) ) )
            // InternalChartDsl.g:1107:1: ( ( rule__Chart__TitleAssignment_3_1 ) )
            {
            // InternalChartDsl.g:1107:1: ( ( rule__Chart__TitleAssignment_3_1 ) )
            // InternalChartDsl.g:1108:2: ( rule__Chart__TitleAssignment_3_1 )
            {
             before(grammarAccess.getChartAccess().getTitleAssignment_3_1()); 
            // InternalChartDsl.g:1109:2: ( rule__Chart__TitleAssignment_3_1 )
            // InternalChartDsl.g:1109:3: rule__Chart__TitleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Chart__TitleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getTitleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_3__1__Impl"


    // $ANTLR start "rule__Chart__Group_4__0"
    // InternalChartDsl.g:1118:1: rule__Chart__Group_4__0 : rule__Chart__Group_4__0__Impl rule__Chart__Group_4__1 ;
    public final void rule__Chart__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1122:1: ( rule__Chart__Group_4__0__Impl rule__Chart__Group_4__1 )
            // InternalChartDsl.g:1123:2: rule__Chart__Group_4__0__Impl rule__Chart__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Chart__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_4__0"


    // $ANTLR start "rule__Chart__Group_4__0__Impl"
    // InternalChartDsl.g:1130:1: rule__Chart__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Chart__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1134:1: ( ( 'type' ) )
            // InternalChartDsl.g:1135:1: ( 'type' )
            {
            // InternalChartDsl.g:1135:1: ( 'type' )
            // InternalChartDsl.g:1136:2: 'type'
            {
             before(grammarAccess.getChartAccess().getTypeKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_4__0__Impl"


    // $ANTLR start "rule__Chart__Group_4__1"
    // InternalChartDsl.g:1145:1: rule__Chart__Group_4__1 : rule__Chart__Group_4__1__Impl ;
    public final void rule__Chart__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1149:1: ( rule__Chart__Group_4__1__Impl )
            // InternalChartDsl.g:1150:2: rule__Chart__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chart__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_4__1"


    // $ANTLR start "rule__Chart__Group_4__1__Impl"
    // InternalChartDsl.g:1156:1: rule__Chart__Group_4__1__Impl : ( ( rule__Chart__TypeAssignment_4_1 ) ) ;
    public final void rule__Chart__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1160:1: ( ( ( rule__Chart__TypeAssignment_4_1 ) ) )
            // InternalChartDsl.g:1161:1: ( ( rule__Chart__TypeAssignment_4_1 ) )
            {
            // InternalChartDsl.g:1161:1: ( ( rule__Chart__TypeAssignment_4_1 ) )
            // InternalChartDsl.g:1162:2: ( rule__Chart__TypeAssignment_4_1 )
            {
             before(grammarAccess.getChartAccess().getTypeAssignment_4_1()); 
            // InternalChartDsl.g:1163:2: ( rule__Chart__TypeAssignment_4_1 )
            // InternalChartDsl.g:1163:3: rule__Chart__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Chart__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_4__1__Impl"


    // $ANTLR start "rule__Chart__Group_5__0"
    // InternalChartDsl.g:1172:1: rule__Chart__Group_5__0 : rule__Chart__Group_5__0__Impl rule__Chart__Group_5__1 ;
    public final void rule__Chart__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1176:1: ( rule__Chart__Group_5__0__Impl rule__Chart__Group_5__1 )
            // InternalChartDsl.g:1177:2: rule__Chart__Group_5__0__Impl rule__Chart__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Chart__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_5__0"


    // $ANTLR start "rule__Chart__Group_5__0__Impl"
    // InternalChartDsl.g:1184:1: rule__Chart__Group_5__0__Impl : ( 'xAxis' ) ;
    public final void rule__Chart__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1188:1: ( ( 'xAxis' ) )
            // InternalChartDsl.g:1189:1: ( 'xAxis' )
            {
            // InternalChartDsl.g:1189:1: ( 'xAxis' )
            // InternalChartDsl.g:1190:2: 'xAxis'
            {
             before(grammarAccess.getChartAccess().getXAxisKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getXAxisKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_5__0__Impl"


    // $ANTLR start "rule__Chart__Group_5__1"
    // InternalChartDsl.g:1199:1: rule__Chart__Group_5__1 : rule__Chart__Group_5__1__Impl rule__Chart__Group_5__2 ;
    public final void rule__Chart__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1203:1: ( rule__Chart__Group_5__1__Impl rule__Chart__Group_5__2 )
            // InternalChartDsl.g:1204:2: rule__Chart__Group_5__1__Impl rule__Chart__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__Chart__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_5__1"


    // $ANTLR start "rule__Chart__Group_5__1__Impl"
    // InternalChartDsl.g:1211:1: rule__Chart__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Chart__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1215:1: ( ( '(' ) )
            // InternalChartDsl.g:1216:1: ( '(' )
            {
            // InternalChartDsl.g:1216:1: ( '(' )
            // InternalChartDsl.g:1217:2: '('
            {
             before(grammarAccess.getChartAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_5__1__Impl"


    // $ANTLR start "rule__Chart__Group_5__2"
    // InternalChartDsl.g:1226:1: rule__Chart__Group_5__2 : rule__Chart__Group_5__2__Impl rule__Chart__Group_5__3 ;
    public final void rule__Chart__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1230:1: ( rule__Chart__Group_5__2__Impl rule__Chart__Group_5__3 )
            // InternalChartDsl.g:1231:2: rule__Chart__Group_5__2__Impl rule__Chart__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__Chart__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_5__2"


    // $ANTLR start "rule__Chart__Group_5__2__Impl"
    // InternalChartDsl.g:1238:1: rule__Chart__Group_5__2__Impl : ( ( rule__Chart__XVariableAssignment_5_2 ) ) ;
    public final void rule__Chart__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1242:1: ( ( ( rule__Chart__XVariableAssignment_5_2 ) ) )
            // InternalChartDsl.g:1243:1: ( ( rule__Chart__XVariableAssignment_5_2 ) )
            {
            // InternalChartDsl.g:1243:1: ( ( rule__Chart__XVariableAssignment_5_2 ) )
            // InternalChartDsl.g:1244:2: ( rule__Chart__XVariableAssignment_5_2 )
            {
             before(grammarAccess.getChartAccess().getXVariableAssignment_5_2()); 
            // InternalChartDsl.g:1245:2: ( rule__Chart__XVariableAssignment_5_2 )
            // InternalChartDsl.g:1245:3: rule__Chart__XVariableAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Chart__XVariableAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getXVariableAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_5__2__Impl"


    // $ANTLR start "rule__Chart__Group_5__3"
    // InternalChartDsl.g:1253:1: rule__Chart__Group_5__3 : rule__Chart__Group_5__3__Impl rule__Chart__Group_5__4 ;
    public final void rule__Chart__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1257:1: ( rule__Chart__Group_5__3__Impl rule__Chart__Group_5__4 )
            // InternalChartDsl.g:1258:2: rule__Chart__Group_5__3__Impl rule__Chart__Group_5__4
            {
            pushFollow(FOLLOW_13);
            rule__Chart__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_5__3"


    // $ANTLR start "rule__Chart__Group_5__3__Impl"
    // InternalChartDsl.g:1265:1: rule__Chart__Group_5__3__Impl : ( ( rule__Chart__Group_5_3__0 )* ) ;
    public final void rule__Chart__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1269:1: ( ( ( rule__Chart__Group_5_3__0 )* ) )
            // InternalChartDsl.g:1270:1: ( ( rule__Chart__Group_5_3__0 )* )
            {
            // InternalChartDsl.g:1270:1: ( ( rule__Chart__Group_5_3__0 )* )
            // InternalChartDsl.g:1271:2: ( rule__Chart__Group_5_3__0 )*
            {
             before(grammarAccess.getChartAccess().getGroup_5_3()); 
            // InternalChartDsl.g:1272:2: ( rule__Chart__Group_5_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalChartDsl.g:1272:3: rule__Chart__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Chart__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getChartAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_5__3__Impl"


    // $ANTLR start "rule__Chart__Group_5__4"
    // InternalChartDsl.g:1280:1: rule__Chart__Group_5__4 : rule__Chart__Group_5__4__Impl ;
    public final void rule__Chart__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1284:1: ( rule__Chart__Group_5__4__Impl )
            // InternalChartDsl.g:1285:2: rule__Chart__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chart__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_5__4"


    // $ANTLR start "rule__Chart__Group_5__4__Impl"
    // InternalChartDsl.g:1291:1: rule__Chart__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Chart__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1295:1: ( ( ')' ) )
            // InternalChartDsl.g:1296:1: ( ')' )
            {
            // InternalChartDsl.g:1296:1: ( ')' )
            // InternalChartDsl.g:1297:2: ')'
            {
             before(grammarAccess.getChartAccess().getRightParenthesisKeyword_5_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_5__4__Impl"


    // $ANTLR start "rule__Chart__Group_5_3__0"
    // InternalChartDsl.g:1307:1: rule__Chart__Group_5_3__0 : rule__Chart__Group_5_3__0__Impl rule__Chart__Group_5_3__1 ;
    public final void rule__Chart__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1311:1: ( rule__Chart__Group_5_3__0__Impl rule__Chart__Group_5_3__1 )
            // InternalChartDsl.g:1312:2: rule__Chart__Group_5_3__0__Impl rule__Chart__Group_5_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Chart__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_5_3__0"


    // $ANTLR start "rule__Chart__Group_5_3__0__Impl"
    // InternalChartDsl.g:1319:1: rule__Chart__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Chart__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1323:1: ( ( ',' ) )
            // InternalChartDsl.g:1324:1: ( ',' )
            {
            // InternalChartDsl.g:1324:1: ( ',' )
            // InternalChartDsl.g:1325:2: ','
            {
             before(grammarAccess.getChartAccess().getCommaKeyword_5_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_5_3__0__Impl"


    // $ANTLR start "rule__Chart__Group_5_3__1"
    // InternalChartDsl.g:1334:1: rule__Chart__Group_5_3__1 : rule__Chart__Group_5_3__1__Impl ;
    public final void rule__Chart__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1338:1: ( rule__Chart__Group_5_3__1__Impl )
            // InternalChartDsl.g:1339:2: rule__Chart__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chart__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_5_3__1"


    // $ANTLR start "rule__Chart__Group_5_3__1__Impl"
    // InternalChartDsl.g:1345:1: rule__Chart__Group_5_3__1__Impl : ( ( rule__Chart__XVariableAssignment_5_3_1 ) ) ;
    public final void rule__Chart__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1349:1: ( ( ( rule__Chart__XVariableAssignment_5_3_1 ) ) )
            // InternalChartDsl.g:1350:1: ( ( rule__Chart__XVariableAssignment_5_3_1 ) )
            {
            // InternalChartDsl.g:1350:1: ( ( rule__Chart__XVariableAssignment_5_3_1 ) )
            // InternalChartDsl.g:1351:2: ( rule__Chart__XVariableAssignment_5_3_1 )
            {
             before(grammarAccess.getChartAccess().getXVariableAssignment_5_3_1()); 
            // InternalChartDsl.g:1352:2: ( rule__Chart__XVariableAssignment_5_3_1 )
            // InternalChartDsl.g:1352:3: rule__Chart__XVariableAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Chart__XVariableAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getXVariableAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_5_3__1__Impl"


    // $ANTLR start "rule__Chart__Group_6__0"
    // InternalChartDsl.g:1361:1: rule__Chart__Group_6__0 : rule__Chart__Group_6__0__Impl rule__Chart__Group_6__1 ;
    public final void rule__Chart__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1365:1: ( rule__Chart__Group_6__0__Impl rule__Chart__Group_6__1 )
            // InternalChartDsl.g:1366:2: rule__Chart__Group_6__0__Impl rule__Chart__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Chart__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_6__0"


    // $ANTLR start "rule__Chart__Group_6__0__Impl"
    // InternalChartDsl.g:1373:1: rule__Chart__Group_6__0__Impl : ( 'yAxis' ) ;
    public final void rule__Chart__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1377:1: ( ( 'yAxis' ) )
            // InternalChartDsl.g:1378:1: ( 'yAxis' )
            {
            // InternalChartDsl.g:1378:1: ( 'yAxis' )
            // InternalChartDsl.g:1379:2: 'yAxis'
            {
             before(grammarAccess.getChartAccess().getYAxisKeyword_6_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getYAxisKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_6__0__Impl"


    // $ANTLR start "rule__Chart__Group_6__1"
    // InternalChartDsl.g:1388:1: rule__Chart__Group_6__1 : rule__Chart__Group_6__1__Impl rule__Chart__Group_6__2 ;
    public final void rule__Chart__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1392:1: ( rule__Chart__Group_6__1__Impl rule__Chart__Group_6__2 )
            // InternalChartDsl.g:1393:2: rule__Chart__Group_6__1__Impl rule__Chart__Group_6__2
            {
            pushFollow(FOLLOW_3);
            rule__Chart__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_6__1"


    // $ANTLR start "rule__Chart__Group_6__1__Impl"
    // InternalChartDsl.g:1400:1: rule__Chart__Group_6__1__Impl : ( '(' ) ;
    public final void rule__Chart__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1404:1: ( ( '(' ) )
            // InternalChartDsl.g:1405:1: ( '(' )
            {
            // InternalChartDsl.g:1405:1: ( '(' )
            // InternalChartDsl.g:1406:2: '('
            {
             before(grammarAccess.getChartAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_6__1__Impl"


    // $ANTLR start "rule__Chart__Group_6__2"
    // InternalChartDsl.g:1415:1: rule__Chart__Group_6__2 : rule__Chart__Group_6__2__Impl rule__Chart__Group_6__3 ;
    public final void rule__Chart__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1419:1: ( rule__Chart__Group_6__2__Impl rule__Chart__Group_6__3 )
            // InternalChartDsl.g:1420:2: rule__Chart__Group_6__2__Impl rule__Chart__Group_6__3
            {
            pushFollow(FOLLOW_13);
            rule__Chart__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_6__2"


    // $ANTLR start "rule__Chart__Group_6__2__Impl"
    // InternalChartDsl.g:1427:1: rule__Chart__Group_6__2__Impl : ( ( rule__Chart__YVariableAssignment_6_2 ) ) ;
    public final void rule__Chart__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1431:1: ( ( ( rule__Chart__YVariableAssignment_6_2 ) ) )
            // InternalChartDsl.g:1432:1: ( ( rule__Chart__YVariableAssignment_6_2 ) )
            {
            // InternalChartDsl.g:1432:1: ( ( rule__Chart__YVariableAssignment_6_2 ) )
            // InternalChartDsl.g:1433:2: ( rule__Chart__YVariableAssignment_6_2 )
            {
             before(grammarAccess.getChartAccess().getYVariableAssignment_6_2()); 
            // InternalChartDsl.g:1434:2: ( rule__Chart__YVariableAssignment_6_2 )
            // InternalChartDsl.g:1434:3: rule__Chart__YVariableAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Chart__YVariableAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getYVariableAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_6__2__Impl"


    // $ANTLR start "rule__Chart__Group_6__3"
    // InternalChartDsl.g:1442:1: rule__Chart__Group_6__3 : rule__Chart__Group_6__3__Impl rule__Chart__Group_6__4 ;
    public final void rule__Chart__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1446:1: ( rule__Chart__Group_6__3__Impl rule__Chart__Group_6__4 )
            // InternalChartDsl.g:1447:2: rule__Chart__Group_6__3__Impl rule__Chart__Group_6__4
            {
            pushFollow(FOLLOW_13);
            rule__Chart__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_6__3"


    // $ANTLR start "rule__Chart__Group_6__3__Impl"
    // InternalChartDsl.g:1454:1: rule__Chart__Group_6__3__Impl : ( ( rule__Chart__Group_6_3__0 )* ) ;
    public final void rule__Chart__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1458:1: ( ( ( rule__Chart__Group_6_3__0 )* ) )
            // InternalChartDsl.g:1459:1: ( ( rule__Chart__Group_6_3__0 )* )
            {
            // InternalChartDsl.g:1459:1: ( ( rule__Chart__Group_6_3__0 )* )
            // InternalChartDsl.g:1460:2: ( rule__Chart__Group_6_3__0 )*
            {
             before(grammarAccess.getChartAccess().getGroup_6_3()); 
            // InternalChartDsl.g:1461:2: ( rule__Chart__Group_6_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalChartDsl.g:1461:3: rule__Chart__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Chart__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getChartAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_6__3__Impl"


    // $ANTLR start "rule__Chart__Group_6__4"
    // InternalChartDsl.g:1469:1: rule__Chart__Group_6__4 : rule__Chart__Group_6__4__Impl ;
    public final void rule__Chart__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1473:1: ( rule__Chart__Group_6__4__Impl )
            // InternalChartDsl.g:1474:2: rule__Chart__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chart__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_6__4"


    // $ANTLR start "rule__Chart__Group_6__4__Impl"
    // InternalChartDsl.g:1480:1: rule__Chart__Group_6__4__Impl : ( ')' ) ;
    public final void rule__Chart__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1484:1: ( ( ')' ) )
            // InternalChartDsl.g:1485:1: ( ')' )
            {
            // InternalChartDsl.g:1485:1: ( ')' )
            // InternalChartDsl.g:1486:2: ')'
            {
             before(grammarAccess.getChartAccess().getRightParenthesisKeyword_6_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_6__4__Impl"


    // $ANTLR start "rule__Chart__Group_6_3__0"
    // InternalChartDsl.g:1496:1: rule__Chart__Group_6_3__0 : rule__Chart__Group_6_3__0__Impl rule__Chart__Group_6_3__1 ;
    public final void rule__Chart__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1500:1: ( rule__Chart__Group_6_3__0__Impl rule__Chart__Group_6_3__1 )
            // InternalChartDsl.g:1501:2: rule__Chart__Group_6_3__0__Impl rule__Chart__Group_6_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Chart__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_6_3__0"


    // $ANTLR start "rule__Chart__Group_6_3__0__Impl"
    // InternalChartDsl.g:1508:1: rule__Chart__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Chart__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1512:1: ( ( ',' ) )
            // InternalChartDsl.g:1513:1: ( ',' )
            {
            // InternalChartDsl.g:1513:1: ( ',' )
            // InternalChartDsl.g:1514:2: ','
            {
             before(grammarAccess.getChartAccess().getCommaKeyword_6_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_6_3__0__Impl"


    // $ANTLR start "rule__Chart__Group_6_3__1"
    // InternalChartDsl.g:1523:1: rule__Chart__Group_6_3__1 : rule__Chart__Group_6_3__1__Impl ;
    public final void rule__Chart__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1527:1: ( rule__Chart__Group_6_3__1__Impl )
            // InternalChartDsl.g:1528:2: rule__Chart__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chart__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_6_3__1"


    // $ANTLR start "rule__Chart__Group_6_3__1__Impl"
    // InternalChartDsl.g:1534:1: rule__Chart__Group_6_3__1__Impl : ( ( rule__Chart__YVariableAssignment_6_3_1 ) ) ;
    public final void rule__Chart__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1538:1: ( ( ( rule__Chart__YVariableAssignment_6_3_1 ) ) )
            // InternalChartDsl.g:1539:1: ( ( rule__Chart__YVariableAssignment_6_3_1 ) )
            {
            // InternalChartDsl.g:1539:1: ( ( rule__Chart__YVariableAssignment_6_3_1 ) )
            // InternalChartDsl.g:1540:2: ( rule__Chart__YVariableAssignment_6_3_1 )
            {
             before(grammarAccess.getChartAccess().getYVariableAssignment_6_3_1()); 
            // InternalChartDsl.g:1541:2: ( rule__Chart__YVariableAssignment_6_3_1 )
            // InternalChartDsl.g:1541:3: rule__Chart__YVariableAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Chart__YVariableAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getYVariableAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_6_3__1__Impl"


    // $ANTLR start "rule__Chart__Group_7__0"
    // InternalChartDsl.g:1550:1: rule__Chart__Group_7__0 : rule__Chart__Group_7__0__Impl rule__Chart__Group_7__1 ;
    public final void rule__Chart__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1554:1: ( rule__Chart__Group_7__0__Impl rule__Chart__Group_7__1 )
            // InternalChartDsl.g:1555:2: rule__Chart__Group_7__0__Impl rule__Chart__Group_7__1
            {
            pushFollow(FOLLOW_15);
            rule__Chart__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_7__0"


    // $ANTLR start "rule__Chart__Group_7__0__Impl"
    // InternalChartDsl.g:1562:1: rule__Chart__Group_7__0__Impl : ( 'Filter' ) ;
    public final void rule__Chart__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1566:1: ( ( 'Filter' ) )
            // InternalChartDsl.g:1567:1: ( 'Filter' )
            {
            // InternalChartDsl.g:1567:1: ( 'Filter' )
            // InternalChartDsl.g:1568:2: 'Filter'
            {
             before(grammarAccess.getChartAccess().getFilterKeyword_7_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getFilterKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_7__0__Impl"


    // $ANTLR start "rule__Chart__Group_7__1"
    // InternalChartDsl.g:1577:1: rule__Chart__Group_7__1 : rule__Chart__Group_7__1__Impl rule__Chart__Group_7__2 ;
    public final void rule__Chart__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1581:1: ( rule__Chart__Group_7__1__Impl rule__Chart__Group_7__2 )
            // InternalChartDsl.g:1582:2: rule__Chart__Group_7__1__Impl rule__Chart__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__Chart__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_7__1"


    // $ANTLR start "rule__Chart__Group_7__1__Impl"
    // InternalChartDsl.g:1589:1: rule__Chart__Group_7__1__Impl : ( '[' ) ;
    public final void rule__Chart__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1593:1: ( ( '[' ) )
            // InternalChartDsl.g:1594:1: ( '[' )
            {
            // InternalChartDsl.g:1594:1: ( '[' )
            // InternalChartDsl.g:1595:2: '['
            {
             before(grammarAccess.getChartAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getLeftSquareBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_7__1__Impl"


    // $ANTLR start "rule__Chart__Group_7__2"
    // InternalChartDsl.g:1604:1: rule__Chart__Group_7__2 : rule__Chart__Group_7__2__Impl rule__Chart__Group_7__3 ;
    public final void rule__Chart__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1608:1: ( rule__Chart__Group_7__2__Impl rule__Chart__Group_7__3 )
            // InternalChartDsl.g:1609:2: rule__Chart__Group_7__2__Impl rule__Chart__Group_7__3
            {
            pushFollow(FOLLOW_16);
            rule__Chart__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_7__2"


    // $ANTLR start "rule__Chart__Group_7__2__Impl"
    // InternalChartDsl.g:1616:1: rule__Chart__Group_7__2__Impl : ( ( rule__Chart__FilterAssignment_7_2 ) ) ;
    public final void rule__Chart__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1620:1: ( ( ( rule__Chart__FilterAssignment_7_2 ) ) )
            // InternalChartDsl.g:1621:1: ( ( rule__Chart__FilterAssignment_7_2 ) )
            {
            // InternalChartDsl.g:1621:1: ( ( rule__Chart__FilterAssignment_7_2 ) )
            // InternalChartDsl.g:1622:2: ( rule__Chart__FilterAssignment_7_2 )
            {
             before(grammarAccess.getChartAccess().getFilterAssignment_7_2()); 
            // InternalChartDsl.g:1623:2: ( rule__Chart__FilterAssignment_7_2 )
            // InternalChartDsl.g:1623:3: rule__Chart__FilterAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Chart__FilterAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getFilterAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_7__2__Impl"


    // $ANTLR start "rule__Chart__Group_7__3"
    // InternalChartDsl.g:1631:1: rule__Chart__Group_7__3 : rule__Chart__Group_7__3__Impl rule__Chart__Group_7__4 ;
    public final void rule__Chart__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1635:1: ( rule__Chart__Group_7__3__Impl rule__Chart__Group_7__4 )
            // InternalChartDsl.g:1636:2: rule__Chart__Group_7__3__Impl rule__Chart__Group_7__4
            {
            pushFollow(FOLLOW_16);
            rule__Chart__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_7__3"


    // $ANTLR start "rule__Chart__Group_7__3__Impl"
    // InternalChartDsl.g:1643:1: rule__Chart__Group_7__3__Impl : ( ( rule__Chart__Group_7_3__0 )* ) ;
    public final void rule__Chart__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1647:1: ( ( ( rule__Chart__Group_7_3__0 )* ) )
            // InternalChartDsl.g:1648:1: ( ( rule__Chart__Group_7_3__0 )* )
            {
            // InternalChartDsl.g:1648:1: ( ( rule__Chart__Group_7_3__0 )* )
            // InternalChartDsl.g:1649:2: ( rule__Chart__Group_7_3__0 )*
            {
             before(grammarAccess.getChartAccess().getGroup_7_3()); 
            // InternalChartDsl.g:1650:2: ( rule__Chart__Group_7_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==46) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalChartDsl.g:1650:3: rule__Chart__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Chart__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getChartAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_7__3__Impl"


    // $ANTLR start "rule__Chart__Group_7__4"
    // InternalChartDsl.g:1658:1: rule__Chart__Group_7__4 : rule__Chart__Group_7__4__Impl ;
    public final void rule__Chart__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1662:1: ( rule__Chart__Group_7__4__Impl )
            // InternalChartDsl.g:1663:2: rule__Chart__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chart__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_7__4"


    // $ANTLR start "rule__Chart__Group_7__4__Impl"
    // InternalChartDsl.g:1669:1: rule__Chart__Group_7__4__Impl : ( ']' ) ;
    public final void rule__Chart__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1673:1: ( ( ']' ) )
            // InternalChartDsl.g:1674:1: ( ']' )
            {
            // InternalChartDsl.g:1674:1: ( ']' )
            // InternalChartDsl.g:1675:2: ']'
            {
             before(grammarAccess.getChartAccess().getRightSquareBracketKeyword_7_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getRightSquareBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_7__4__Impl"


    // $ANTLR start "rule__Chart__Group_7_3__0"
    // InternalChartDsl.g:1685:1: rule__Chart__Group_7_3__0 : rule__Chart__Group_7_3__0__Impl rule__Chart__Group_7_3__1 ;
    public final void rule__Chart__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1689:1: ( rule__Chart__Group_7_3__0__Impl rule__Chart__Group_7_3__1 )
            // InternalChartDsl.g:1690:2: rule__Chart__Group_7_3__0__Impl rule__Chart__Group_7_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Chart__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_7_3__0"


    // $ANTLR start "rule__Chart__Group_7_3__0__Impl"
    // InternalChartDsl.g:1697:1: rule__Chart__Group_7_3__0__Impl : ( 'and' ) ;
    public final void rule__Chart__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1701:1: ( ( 'and' ) )
            // InternalChartDsl.g:1702:1: ( 'and' )
            {
            // InternalChartDsl.g:1702:1: ( 'and' )
            // InternalChartDsl.g:1703:2: 'and'
            {
             before(grammarAccess.getChartAccess().getAndKeyword_7_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getAndKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_7_3__0__Impl"


    // $ANTLR start "rule__Chart__Group_7_3__1"
    // InternalChartDsl.g:1712:1: rule__Chart__Group_7_3__1 : rule__Chart__Group_7_3__1__Impl ;
    public final void rule__Chart__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1716:1: ( rule__Chart__Group_7_3__1__Impl )
            // InternalChartDsl.g:1717:2: rule__Chart__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chart__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_7_3__1"


    // $ANTLR start "rule__Chart__Group_7_3__1__Impl"
    // InternalChartDsl.g:1723:1: rule__Chart__Group_7_3__1__Impl : ( ( rule__Chart__FilterAssignment_7_3_1 ) ) ;
    public final void rule__Chart__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1727:1: ( ( ( rule__Chart__FilterAssignment_7_3_1 ) ) )
            // InternalChartDsl.g:1728:1: ( ( rule__Chart__FilterAssignment_7_3_1 ) )
            {
            // InternalChartDsl.g:1728:1: ( ( rule__Chart__FilterAssignment_7_3_1 ) )
            // InternalChartDsl.g:1729:2: ( rule__Chart__FilterAssignment_7_3_1 )
            {
             before(grammarAccess.getChartAccess().getFilterAssignment_7_3_1()); 
            // InternalChartDsl.g:1730:2: ( rule__Chart__FilterAssignment_7_3_1 )
            // InternalChartDsl.g:1730:3: rule__Chart__FilterAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Chart__FilterAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getFilterAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_7_3__1__Impl"


    // $ANTLR start "rule__DataFile__Group__0"
    // InternalChartDsl.g:1739:1: rule__DataFile__Group__0 : rule__DataFile__Group__0__Impl rule__DataFile__Group__1 ;
    public final void rule__DataFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1743:1: ( rule__DataFile__Group__0__Impl rule__DataFile__Group__1 )
            // InternalChartDsl.g:1744:2: rule__DataFile__Group__0__Impl rule__DataFile__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DataFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__0"


    // $ANTLR start "rule__DataFile__Group__0__Impl"
    // InternalChartDsl.g:1751:1: rule__DataFile__Group__0__Impl : ( ( rule__DataFile__Group_0__0 )? ) ;
    public final void rule__DataFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1755:1: ( ( ( rule__DataFile__Group_0__0 )? ) )
            // InternalChartDsl.g:1756:1: ( ( rule__DataFile__Group_0__0 )? )
            {
            // InternalChartDsl.g:1756:1: ( ( rule__DataFile__Group_0__0 )? )
            // InternalChartDsl.g:1757:2: ( rule__DataFile__Group_0__0 )?
            {
             before(grammarAccess.getDataFileAccess().getGroup_0()); 
            // InternalChartDsl.g:1758:2: ( rule__DataFile__Group_0__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalChartDsl.g:1758:3: rule__DataFile__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFile__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFileAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__0__Impl"


    // $ANTLR start "rule__DataFile__Group__1"
    // InternalChartDsl.g:1766:1: rule__DataFile__Group__1 : rule__DataFile__Group__1__Impl rule__DataFile__Group__2 ;
    public final void rule__DataFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1770:1: ( rule__DataFile__Group__1__Impl rule__DataFile__Group__2 )
            // InternalChartDsl.g:1771:2: rule__DataFile__Group__1__Impl rule__DataFile__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DataFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__1"


    // $ANTLR start "rule__DataFile__Group__1__Impl"
    // InternalChartDsl.g:1778:1: rule__DataFile__Group__1__Impl : ( ( rule__DataFile__Group_1__0 )? ) ;
    public final void rule__DataFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1782:1: ( ( ( rule__DataFile__Group_1__0 )? ) )
            // InternalChartDsl.g:1783:1: ( ( rule__DataFile__Group_1__0 )? )
            {
            // InternalChartDsl.g:1783:1: ( ( rule__DataFile__Group_1__0 )? )
            // InternalChartDsl.g:1784:2: ( rule__DataFile__Group_1__0 )?
            {
             before(grammarAccess.getDataFileAccess().getGroup_1()); 
            // InternalChartDsl.g:1785:2: ( rule__DataFile__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalChartDsl.g:1785:3: rule__DataFile__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFile__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFileAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__1__Impl"


    // $ANTLR start "rule__DataFile__Group__2"
    // InternalChartDsl.g:1793:1: rule__DataFile__Group__2 : rule__DataFile__Group__2__Impl rule__DataFile__Group__3 ;
    public final void rule__DataFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1797:1: ( rule__DataFile__Group__2__Impl rule__DataFile__Group__3 )
            // InternalChartDsl.g:1798:2: rule__DataFile__Group__2__Impl rule__DataFile__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DataFile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__2"


    // $ANTLR start "rule__DataFile__Group__2__Impl"
    // InternalChartDsl.g:1805:1: rule__DataFile__Group__2__Impl : ( ( rule__DataFile__Group_2__0 )? ) ;
    public final void rule__DataFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1809:1: ( ( ( rule__DataFile__Group_2__0 )? ) )
            // InternalChartDsl.g:1810:1: ( ( rule__DataFile__Group_2__0 )? )
            {
            // InternalChartDsl.g:1810:1: ( ( rule__DataFile__Group_2__0 )? )
            // InternalChartDsl.g:1811:2: ( rule__DataFile__Group_2__0 )?
            {
             before(grammarAccess.getDataFileAccess().getGroup_2()); 
            // InternalChartDsl.g:1812:2: ( rule__DataFile__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==53) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalChartDsl.g:1812:3: rule__DataFile__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFile__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFileAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__2__Impl"


    // $ANTLR start "rule__DataFile__Group__3"
    // InternalChartDsl.g:1820:1: rule__DataFile__Group__3 : rule__DataFile__Group__3__Impl rule__DataFile__Group__4 ;
    public final void rule__DataFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1824:1: ( rule__DataFile__Group__3__Impl rule__DataFile__Group__4 )
            // InternalChartDsl.g:1825:2: rule__DataFile__Group__3__Impl rule__DataFile__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__DataFile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__3"


    // $ANTLR start "rule__DataFile__Group__3__Impl"
    // InternalChartDsl.g:1832:1: rule__DataFile__Group__3__Impl : ( ( rule__DataFile__Group_3__0 )? ) ;
    public final void rule__DataFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1836:1: ( ( ( rule__DataFile__Group_3__0 )? ) )
            // InternalChartDsl.g:1837:1: ( ( rule__DataFile__Group_3__0 )? )
            {
            // InternalChartDsl.g:1837:1: ( ( rule__DataFile__Group_3__0 )? )
            // InternalChartDsl.g:1838:2: ( rule__DataFile__Group_3__0 )?
            {
             before(grammarAccess.getDataFileAccess().getGroup_3()); 
            // InternalChartDsl.g:1839:2: ( rule__DataFile__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==54) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalChartDsl.g:1839:3: rule__DataFile__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFile__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFileAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__3__Impl"


    // $ANTLR start "rule__DataFile__Group__4"
    // InternalChartDsl.g:1847:1: rule__DataFile__Group__4 : rule__DataFile__Group__4__Impl rule__DataFile__Group__5 ;
    public final void rule__DataFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1851:1: ( rule__DataFile__Group__4__Impl rule__DataFile__Group__5 )
            // InternalChartDsl.g:1852:2: rule__DataFile__Group__4__Impl rule__DataFile__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__DataFile__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__4"


    // $ANTLR start "rule__DataFile__Group__4__Impl"
    // InternalChartDsl.g:1859:1: rule__DataFile__Group__4__Impl : ( 'Select' ) ;
    public final void rule__DataFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1863:1: ( ( 'Select' ) )
            // InternalChartDsl.g:1864:1: ( 'Select' )
            {
            // InternalChartDsl.g:1864:1: ( 'Select' )
            // InternalChartDsl.g:1865:2: 'Select'
            {
             before(grammarAccess.getDataFileAccess().getSelectKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDataFileAccess().getSelectKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__4__Impl"


    // $ANTLR start "rule__DataFile__Group__5"
    // InternalChartDsl.g:1874:1: rule__DataFile__Group__5 : rule__DataFile__Group__5__Impl rule__DataFile__Group__6 ;
    public final void rule__DataFile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1878:1: ( rule__DataFile__Group__5__Impl rule__DataFile__Group__6 )
            // InternalChartDsl.g:1879:2: rule__DataFile__Group__5__Impl rule__DataFile__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__DataFile__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__5"


    // $ANTLR start "rule__DataFile__Group__5__Impl"
    // InternalChartDsl.g:1886:1: rule__DataFile__Group__5__Impl : ( 'Columns' ) ;
    public final void rule__DataFile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1890:1: ( ( 'Columns' ) )
            // InternalChartDsl.g:1891:1: ( 'Columns' )
            {
            // InternalChartDsl.g:1891:1: ( 'Columns' )
            // InternalChartDsl.g:1892:2: 'Columns'
            {
             before(grammarAccess.getDataFileAccess().getColumnsKeyword_5()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDataFileAccess().getColumnsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__5__Impl"


    // $ANTLR start "rule__DataFile__Group__6"
    // InternalChartDsl.g:1901:1: rule__DataFile__Group__6 : rule__DataFile__Group__6__Impl rule__DataFile__Group__7 ;
    public final void rule__DataFile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1905:1: ( rule__DataFile__Group__6__Impl rule__DataFile__Group__7 )
            // InternalChartDsl.g:1906:2: rule__DataFile__Group__6__Impl rule__DataFile__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__DataFile__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__6"


    // $ANTLR start "rule__DataFile__Group__6__Impl"
    // InternalChartDsl.g:1913:1: rule__DataFile__Group__6__Impl : ( '[' ) ;
    public final void rule__DataFile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1917:1: ( ( '[' ) )
            // InternalChartDsl.g:1918:1: ( '[' )
            {
            // InternalChartDsl.g:1918:1: ( '[' )
            // InternalChartDsl.g:1919:2: '['
            {
             before(grammarAccess.getDataFileAccess().getLeftSquareBracketKeyword_6()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDataFileAccess().getLeftSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__6__Impl"


    // $ANTLR start "rule__DataFile__Group__7"
    // InternalChartDsl.g:1928:1: rule__DataFile__Group__7 : rule__DataFile__Group__7__Impl rule__DataFile__Group__8 ;
    public final void rule__DataFile__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1932:1: ( rule__DataFile__Group__7__Impl rule__DataFile__Group__8 )
            // InternalChartDsl.g:1933:2: rule__DataFile__Group__7__Impl rule__DataFile__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__DataFile__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__7"


    // $ANTLR start "rule__DataFile__Group__7__Impl"
    // InternalChartDsl.g:1940:1: rule__DataFile__Group__7__Impl : ( ( rule__DataFile__UsedColumnAssignment_7 ) ) ;
    public final void rule__DataFile__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1944:1: ( ( ( rule__DataFile__UsedColumnAssignment_7 ) ) )
            // InternalChartDsl.g:1945:1: ( ( rule__DataFile__UsedColumnAssignment_7 ) )
            {
            // InternalChartDsl.g:1945:1: ( ( rule__DataFile__UsedColumnAssignment_7 ) )
            // InternalChartDsl.g:1946:2: ( rule__DataFile__UsedColumnAssignment_7 )
            {
             before(grammarAccess.getDataFileAccess().getUsedColumnAssignment_7()); 
            // InternalChartDsl.g:1947:2: ( rule__DataFile__UsedColumnAssignment_7 )
            // InternalChartDsl.g:1947:3: rule__DataFile__UsedColumnAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__DataFile__UsedColumnAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDataFileAccess().getUsedColumnAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__7__Impl"


    // $ANTLR start "rule__DataFile__Group__8"
    // InternalChartDsl.g:1955:1: rule__DataFile__Group__8 : rule__DataFile__Group__8__Impl rule__DataFile__Group__9 ;
    public final void rule__DataFile__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1959:1: ( rule__DataFile__Group__8__Impl rule__DataFile__Group__9 )
            // InternalChartDsl.g:1960:2: rule__DataFile__Group__8__Impl rule__DataFile__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__DataFile__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__8"


    // $ANTLR start "rule__DataFile__Group__8__Impl"
    // InternalChartDsl.g:1967:1: rule__DataFile__Group__8__Impl : ( ( rule__DataFile__Group_8__0 )* ) ;
    public final void rule__DataFile__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1971:1: ( ( ( rule__DataFile__Group_8__0 )* ) )
            // InternalChartDsl.g:1972:1: ( ( rule__DataFile__Group_8__0 )* )
            {
            // InternalChartDsl.g:1972:1: ( ( rule__DataFile__Group_8__0 )* )
            // InternalChartDsl.g:1973:2: ( rule__DataFile__Group_8__0 )*
            {
             before(grammarAccess.getDataFileAccess().getGroup_8()); 
            // InternalChartDsl.g:1974:2: ( rule__DataFile__Group_8__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalChartDsl.g:1974:3: rule__DataFile__Group_8__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__DataFile__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getDataFileAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__8__Impl"


    // $ANTLR start "rule__DataFile__Group__9"
    // InternalChartDsl.g:1982:1: rule__DataFile__Group__9 : rule__DataFile__Group__9__Impl ;
    public final void rule__DataFile__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1986:1: ( rule__DataFile__Group__9__Impl )
            // InternalChartDsl.g:1987:2: rule__DataFile__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFile__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__9"


    // $ANTLR start "rule__DataFile__Group__9__Impl"
    // InternalChartDsl.g:1993:1: rule__DataFile__Group__9__Impl : ( ']' ) ;
    public final void rule__DataFile__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:1997:1: ( ( ']' ) )
            // InternalChartDsl.g:1998:1: ( ']' )
            {
            // InternalChartDsl.g:1998:1: ( ']' )
            // InternalChartDsl.g:1999:2: ']'
            {
             before(grammarAccess.getDataFileAccess().getRightSquareBracketKeyword_9()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDataFileAccess().getRightSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__9__Impl"


    // $ANTLR start "rule__DataFile__Group_0__0"
    // InternalChartDsl.g:2009:1: rule__DataFile__Group_0__0 : rule__DataFile__Group_0__0__Impl rule__DataFile__Group_0__1 ;
    public final void rule__DataFile__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2013:1: ( rule__DataFile__Group_0__0__Impl rule__DataFile__Group_0__1 )
            // InternalChartDsl.g:2014:2: rule__DataFile__Group_0__0__Impl rule__DataFile__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__DataFile__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_0__0"


    // $ANTLR start "rule__DataFile__Group_0__0__Impl"
    // InternalChartDsl.g:2021:1: rule__DataFile__Group_0__0__Impl : ( 'Load' ) ;
    public final void rule__DataFile__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2025:1: ( ( 'Load' ) )
            // InternalChartDsl.g:2026:1: ( 'Load' )
            {
            // InternalChartDsl.g:2026:1: ( 'Load' )
            // InternalChartDsl.g:2027:2: 'Load'
            {
             before(grammarAccess.getDataFileAccess().getLoadKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDataFileAccess().getLoadKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_0__0__Impl"


    // $ANTLR start "rule__DataFile__Group_0__1"
    // InternalChartDsl.g:2036:1: rule__DataFile__Group_0__1 : rule__DataFile__Group_0__1__Impl rule__DataFile__Group_0__2 ;
    public final void rule__DataFile__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2040:1: ( rule__DataFile__Group_0__1__Impl rule__DataFile__Group_0__2 )
            // InternalChartDsl.g:2041:2: rule__DataFile__Group_0__1__Impl rule__DataFile__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__DataFile__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_0__1"


    // $ANTLR start "rule__DataFile__Group_0__1__Impl"
    // InternalChartDsl.g:2048:1: rule__DataFile__Group_0__1__Impl : ( 'data' ) ;
    public final void rule__DataFile__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2052:1: ( ( 'data' ) )
            // InternalChartDsl.g:2053:1: ( 'data' )
            {
            // InternalChartDsl.g:2053:1: ( 'data' )
            // InternalChartDsl.g:2054:2: 'data'
            {
             before(grammarAccess.getDataFileAccess().getDataKeyword_0_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getDataFileAccess().getDataKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_0__1__Impl"


    // $ANTLR start "rule__DataFile__Group_0__2"
    // InternalChartDsl.g:2063:1: rule__DataFile__Group_0__2 : rule__DataFile__Group_0__2__Impl rule__DataFile__Group_0__3 ;
    public final void rule__DataFile__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2067:1: ( rule__DataFile__Group_0__2__Impl rule__DataFile__Group_0__3 )
            // InternalChartDsl.g:2068:2: rule__DataFile__Group_0__2__Impl rule__DataFile__Group_0__3
            {
            pushFollow(FOLLOW_3);
            rule__DataFile__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_0__2"


    // $ANTLR start "rule__DataFile__Group_0__2__Impl"
    // InternalChartDsl.g:2075:1: rule__DataFile__Group_0__2__Impl : ( 'from' ) ;
    public final void rule__DataFile__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2079:1: ( ( 'from' ) )
            // InternalChartDsl.g:2080:1: ( 'from' )
            {
            // InternalChartDsl.g:2080:1: ( 'from' )
            // InternalChartDsl.g:2081:2: 'from'
            {
             before(grammarAccess.getDataFileAccess().getFromKeyword_0_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getDataFileAccess().getFromKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_0__2__Impl"


    // $ANTLR start "rule__DataFile__Group_0__3"
    // InternalChartDsl.g:2090:1: rule__DataFile__Group_0__3 : rule__DataFile__Group_0__3__Impl ;
    public final void rule__DataFile__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2094:1: ( rule__DataFile__Group_0__3__Impl )
            // InternalChartDsl.g:2095:2: rule__DataFile__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFile__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_0__3"


    // $ANTLR start "rule__DataFile__Group_0__3__Impl"
    // InternalChartDsl.g:2101:1: rule__DataFile__Group_0__3__Impl : ( ( rule__DataFile__FilePathAssignment_0_3 ) ) ;
    public final void rule__DataFile__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2105:1: ( ( ( rule__DataFile__FilePathAssignment_0_3 ) ) )
            // InternalChartDsl.g:2106:1: ( ( rule__DataFile__FilePathAssignment_0_3 ) )
            {
            // InternalChartDsl.g:2106:1: ( ( rule__DataFile__FilePathAssignment_0_3 ) )
            // InternalChartDsl.g:2107:2: ( rule__DataFile__FilePathAssignment_0_3 )
            {
             before(grammarAccess.getDataFileAccess().getFilePathAssignment_0_3()); 
            // InternalChartDsl.g:2108:2: ( rule__DataFile__FilePathAssignment_0_3 )
            // InternalChartDsl.g:2108:3: rule__DataFile__FilePathAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__DataFile__FilePathAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getDataFileAccess().getFilePathAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_0__3__Impl"


    // $ANTLR start "rule__DataFile__Group_1__0"
    // InternalChartDsl.g:2117:1: rule__DataFile__Group_1__0 : rule__DataFile__Group_1__0__Impl rule__DataFile__Group_1__1 ;
    public final void rule__DataFile__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2121:1: ( rule__DataFile__Group_1__0__Impl rule__DataFile__Group_1__1 )
            // InternalChartDsl.g:2122:2: rule__DataFile__Group_1__0__Impl rule__DataFile__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__DataFile__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_1__0"


    // $ANTLR start "rule__DataFile__Group_1__0__Impl"
    // InternalChartDsl.g:2129:1: rule__DataFile__Group_1__0__Impl : ( 'header' ) ;
    public final void rule__DataFile__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2133:1: ( ( 'header' ) )
            // InternalChartDsl.g:2134:1: ( 'header' )
            {
            // InternalChartDsl.g:2134:1: ( 'header' )
            // InternalChartDsl.g:2135:2: 'header'
            {
             before(grammarAccess.getDataFileAccess().getHeaderKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getDataFileAccess().getHeaderKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_1__0__Impl"


    // $ANTLR start "rule__DataFile__Group_1__1"
    // InternalChartDsl.g:2144:1: rule__DataFile__Group_1__1 : rule__DataFile__Group_1__1__Impl ;
    public final void rule__DataFile__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2148:1: ( rule__DataFile__Group_1__1__Impl )
            // InternalChartDsl.g:2149:2: rule__DataFile__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFile__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_1__1"


    // $ANTLR start "rule__DataFile__Group_1__1__Impl"
    // InternalChartDsl.g:2155:1: rule__DataFile__Group_1__1__Impl : ( ( rule__DataFile__HasHeaderAssignment_1_1 ) ) ;
    public final void rule__DataFile__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2159:1: ( ( ( rule__DataFile__HasHeaderAssignment_1_1 ) ) )
            // InternalChartDsl.g:2160:1: ( ( rule__DataFile__HasHeaderAssignment_1_1 ) )
            {
            // InternalChartDsl.g:2160:1: ( ( rule__DataFile__HasHeaderAssignment_1_1 ) )
            // InternalChartDsl.g:2161:2: ( rule__DataFile__HasHeaderAssignment_1_1 )
            {
             before(grammarAccess.getDataFileAccess().getHasHeaderAssignment_1_1()); 
            // InternalChartDsl.g:2162:2: ( rule__DataFile__HasHeaderAssignment_1_1 )
            // InternalChartDsl.g:2162:3: rule__DataFile__HasHeaderAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFile__HasHeaderAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFileAccess().getHasHeaderAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_1__1__Impl"


    // $ANTLR start "rule__DataFile__Group_2__0"
    // InternalChartDsl.g:2171:1: rule__DataFile__Group_2__0 : rule__DataFile__Group_2__0__Impl rule__DataFile__Group_2__1 ;
    public final void rule__DataFile__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2175:1: ( rule__DataFile__Group_2__0__Impl rule__DataFile__Group_2__1 )
            // InternalChartDsl.g:2176:2: rule__DataFile__Group_2__0__Impl rule__DataFile__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__DataFile__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_2__0"


    // $ANTLR start "rule__DataFile__Group_2__0__Impl"
    // InternalChartDsl.g:2183:1: rule__DataFile__Group_2__0__Impl : ( 'types' ) ;
    public final void rule__DataFile__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2187:1: ( ( 'types' ) )
            // InternalChartDsl.g:2188:1: ( 'types' )
            {
            // InternalChartDsl.g:2188:1: ( 'types' )
            // InternalChartDsl.g:2189:2: 'types'
            {
             before(grammarAccess.getDataFileAccess().getTypesKeyword_2_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getDataFileAccess().getTypesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_2__0__Impl"


    // $ANTLR start "rule__DataFile__Group_2__1"
    // InternalChartDsl.g:2198:1: rule__DataFile__Group_2__1 : rule__DataFile__Group_2__1__Impl ;
    public final void rule__DataFile__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2202:1: ( rule__DataFile__Group_2__1__Impl )
            // InternalChartDsl.g:2203:2: rule__DataFile__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFile__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_2__1"


    // $ANTLR start "rule__DataFile__Group_2__1__Impl"
    // InternalChartDsl.g:2209:1: rule__DataFile__Group_2__1__Impl : ( ( rule__DataFile__HasTypeAssignment_2_1 ) ) ;
    public final void rule__DataFile__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2213:1: ( ( ( rule__DataFile__HasTypeAssignment_2_1 ) ) )
            // InternalChartDsl.g:2214:1: ( ( rule__DataFile__HasTypeAssignment_2_1 ) )
            {
            // InternalChartDsl.g:2214:1: ( ( rule__DataFile__HasTypeAssignment_2_1 ) )
            // InternalChartDsl.g:2215:2: ( rule__DataFile__HasTypeAssignment_2_1 )
            {
             before(grammarAccess.getDataFileAccess().getHasTypeAssignment_2_1()); 
            // InternalChartDsl.g:2216:2: ( rule__DataFile__HasTypeAssignment_2_1 )
            // InternalChartDsl.g:2216:3: rule__DataFile__HasTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFile__HasTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFileAccess().getHasTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_2__1__Impl"


    // $ANTLR start "rule__DataFile__Group_3__0"
    // InternalChartDsl.g:2225:1: rule__DataFile__Group_3__0 : rule__DataFile__Group_3__0__Impl rule__DataFile__Group_3__1 ;
    public final void rule__DataFile__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2229:1: ( rule__DataFile__Group_3__0__Impl rule__DataFile__Group_3__1 )
            // InternalChartDsl.g:2230:2: rule__DataFile__Group_3__0__Impl rule__DataFile__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__DataFile__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_3__0"


    // $ANTLR start "rule__DataFile__Group_3__0__Impl"
    // InternalChartDsl.g:2237:1: rule__DataFile__Group_3__0__Impl : ( 'delimiter' ) ;
    public final void rule__DataFile__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2241:1: ( ( 'delimiter' ) )
            // InternalChartDsl.g:2242:1: ( 'delimiter' )
            {
            // InternalChartDsl.g:2242:1: ( 'delimiter' )
            // InternalChartDsl.g:2243:2: 'delimiter'
            {
             before(grammarAccess.getDataFileAccess().getDelimiterKeyword_3_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getDataFileAccess().getDelimiterKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_3__0__Impl"


    // $ANTLR start "rule__DataFile__Group_3__1"
    // InternalChartDsl.g:2252:1: rule__DataFile__Group_3__1 : rule__DataFile__Group_3__1__Impl ;
    public final void rule__DataFile__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2256:1: ( rule__DataFile__Group_3__1__Impl )
            // InternalChartDsl.g:2257:2: rule__DataFile__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFile__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_3__1"


    // $ANTLR start "rule__DataFile__Group_3__1__Impl"
    // InternalChartDsl.g:2263:1: rule__DataFile__Group_3__1__Impl : ( ( rule__DataFile__SeparatorAssignment_3_1 ) ) ;
    public final void rule__DataFile__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2267:1: ( ( ( rule__DataFile__SeparatorAssignment_3_1 ) ) )
            // InternalChartDsl.g:2268:1: ( ( rule__DataFile__SeparatorAssignment_3_1 ) )
            {
            // InternalChartDsl.g:2268:1: ( ( rule__DataFile__SeparatorAssignment_3_1 ) )
            // InternalChartDsl.g:2269:2: ( rule__DataFile__SeparatorAssignment_3_1 )
            {
             before(grammarAccess.getDataFileAccess().getSeparatorAssignment_3_1()); 
            // InternalChartDsl.g:2270:2: ( rule__DataFile__SeparatorAssignment_3_1 )
            // InternalChartDsl.g:2270:3: rule__DataFile__SeparatorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFile__SeparatorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFileAccess().getSeparatorAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_3__1__Impl"


    // $ANTLR start "rule__DataFile__Group_8__0"
    // InternalChartDsl.g:2279:1: rule__DataFile__Group_8__0 : rule__DataFile__Group_8__0__Impl rule__DataFile__Group_8__1 ;
    public final void rule__DataFile__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2283:1: ( rule__DataFile__Group_8__0__Impl rule__DataFile__Group_8__1 )
            // InternalChartDsl.g:2284:2: rule__DataFile__Group_8__0__Impl rule__DataFile__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__DataFile__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFile__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_8__0"


    // $ANTLR start "rule__DataFile__Group_8__0__Impl"
    // InternalChartDsl.g:2291:1: rule__DataFile__Group_8__0__Impl : ( ',' ) ;
    public final void rule__DataFile__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2295:1: ( ( ',' ) )
            // InternalChartDsl.g:2296:1: ( ',' )
            {
            // InternalChartDsl.g:2296:1: ( ',' )
            // InternalChartDsl.g:2297:2: ','
            {
             before(grammarAccess.getDataFileAccess().getCommaKeyword_8_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDataFileAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_8__0__Impl"


    // $ANTLR start "rule__DataFile__Group_8__1"
    // InternalChartDsl.g:2306:1: rule__DataFile__Group_8__1 : rule__DataFile__Group_8__1__Impl ;
    public final void rule__DataFile__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2310:1: ( rule__DataFile__Group_8__1__Impl )
            // InternalChartDsl.g:2311:2: rule__DataFile__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFile__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_8__1"


    // $ANTLR start "rule__DataFile__Group_8__1__Impl"
    // InternalChartDsl.g:2317:1: rule__DataFile__Group_8__1__Impl : ( ( rule__DataFile__UsedColumnAssignment_8_1 ) ) ;
    public final void rule__DataFile__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2321:1: ( ( ( rule__DataFile__UsedColumnAssignment_8_1 ) ) )
            // InternalChartDsl.g:2322:1: ( ( rule__DataFile__UsedColumnAssignment_8_1 ) )
            {
            // InternalChartDsl.g:2322:1: ( ( rule__DataFile__UsedColumnAssignment_8_1 ) )
            // InternalChartDsl.g:2323:2: ( rule__DataFile__UsedColumnAssignment_8_1 )
            {
             before(grammarAccess.getDataFileAccess().getUsedColumnAssignment_8_1()); 
            // InternalChartDsl.g:2324:2: ( rule__DataFile__UsedColumnAssignment_8_1 )
            // InternalChartDsl.g:2324:3: rule__DataFile__UsedColumnAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFile__UsedColumnAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFileAccess().getUsedColumnAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group_8__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalChartDsl.g:2333:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2337:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalChartDsl.g:2338:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalChartDsl.g:2345:1: rule__Condition__Group__0__Impl : ( '(' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2349:1: ( ( '(' ) )
            // InternalChartDsl.g:2350:1: ( '(' )
            {
            // InternalChartDsl.g:2350:1: ( '(' )
            // InternalChartDsl.g:2351:2: '('
            {
             before(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalChartDsl.g:2360:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2364:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalChartDsl.g:2365:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalChartDsl.g:2372:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__LeftElementAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2376:1: ( ( ( rule__Condition__LeftElementAssignment_1 ) ) )
            // InternalChartDsl.g:2377:1: ( ( rule__Condition__LeftElementAssignment_1 ) )
            {
            // InternalChartDsl.g:2377:1: ( ( rule__Condition__LeftElementAssignment_1 ) )
            // InternalChartDsl.g:2378:2: ( rule__Condition__LeftElementAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getLeftElementAssignment_1()); 
            // InternalChartDsl.g:2379:2: ( rule__Condition__LeftElementAssignment_1 )
            // InternalChartDsl.g:2379:3: rule__Condition__LeftElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__LeftElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getLeftElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalChartDsl.g:2387:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2391:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalChartDsl.g:2392:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalChartDsl.g:2399:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__OperatorAssignment_2 )? ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2403:1: ( ( ( rule__Condition__OperatorAssignment_2 )? ) )
            // InternalChartDsl.g:2404:1: ( ( rule__Condition__OperatorAssignment_2 )? )
            {
            // InternalChartDsl.g:2404:1: ( ( rule__Condition__OperatorAssignment_2 )? )
            // InternalChartDsl.g:2405:2: ( rule__Condition__OperatorAssignment_2 )?
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_2()); 
            // InternalChartDsl.g:2406:2: ( rule__Condition__OperatorAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=24 && LA21_0<=29)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalChartDsl.g:2406:3: rule__Condition__OperatorAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__OperatorAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalChartDsl.g:2414:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2418:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalChartDsl.g:2419:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Condition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalChartDsl.g:2426:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__RightElementAssignment_3 ) ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2430:1: ( ( ( rule__Condition__RightElementAssignment_3 ) ) )
            // InternalChartDsl.g:2431:1: ( ( rule__Condition__RightElementAssignment_3 ) )
            {
            // InternalChartDsl.g:2431:1: ( ( rule__Condition__RightElementAssignment_3 ) )
            // InternalChartDsl.g:2432:2: ( rule__Condition__RightElementAssignment_3 )
            {
             before(grammarAccess.getConditionAccess().getRightElementAssignment_3()); 
            // InternalChartDsl.g:2433:2: ( rule__Condition__RightElementAssignment_3 )
            // InternalChartDsl.g:2433:3: rule__Condition__RightElementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Condition__RightElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getRightElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__4"
    // InternalChartDsl.g:2441:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2445:1: ( rule__Condition__Group__4__Impl )
            // InternalChartDsl.g:2446:2: rule__Condition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // InternalChartDsl.g:2452:1: rule__Condition__Group__4__Impl : ( ')' ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2456:1: ( ( ')' ) )
            // InternalChartDsl.g:2457:1: ( ')' )
            {
            // InternalChartDsl.g:2457:1: ( ')' )
            // InternalChartDsl.g:2458:2: ')'
            {
             before(grammarAccess.getConditionAccess().getRightParenthesisKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalChartDsl.g:2468:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2472:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalChartDsl.g:2473:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalChartDsl.g:2480:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2484:1: ( ( () ) )
            // InternalChartDsl.g:2485:1: ( () )
            {
            // InternalChartDsl.g:2485:1: ( () )
            // InternalChartDsl.g:2486:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalChartDsl.g:2487:2: ()
            // InternalChartDsl.g:2487:3: 
            {
            }

             after(grammarAccess.getColumnAccess().getColumnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalChartDsl.g:2495:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2499:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalChartDsl.g:2500:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalChartDsl.g:2507:1: rule__Column__Group__1__Impl : ( '(' ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2511:1: ( ( '(' ) )
            // InternalChartDsl.g:2512:1: ( '(' )
            {
            // InternalChartDsl.g:2512:1: ( '(' )
            // InternalChartDsl.g:2513:2: '('
            {
             before(grammarAccess.getColumnAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalChartDsl.g:2522:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2526:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalChartDsl.g:2527:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalChartDsl.g:2534:1: rule__Column__Group__2__Impl : ( ( rule__Column__Group_2__0 )? ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2538:1: ( ( ( rule__Column__Group_2__0 )? ) )
            // InternalChartDsl.g:2539:1: ( ( rule__Column__Group_2__0 )? )
            {
            // InternalChartDsl.g:2539:1: ( ( rule__Column__Group_2__0 )? )
            // InternalChartDsl.g:2540:2: ( rule__Column__Group_2__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_2()); 
            // InternalChartDsl.g:2541:2: ( rule__Column__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==56) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalChartDsl.g:2541:3: rule__Column__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // InternalChartDsl.g:2549:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2553:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalChartDsl.g:2554:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Column__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // InternalChartDsl.g:2561:1: rule__Column__Group__3__Impl : ( 'as' ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2565:1: ( ( 'as' ) )
            // InternalChartDsl.g:2566:1: ( 'as' )
            {
            // InternalChartDsl.g:2566:1: ( 'as' )
            // InternalChartDsl.g:2567:2: 'as'
            {
             before(grammarAccess.getColumnAccess().getAsKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getAsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Column__Group__4"
    // InternalChartDsl.g:2576:1: rule__Column__Group__4 : rule__Column__Group__4__Impl rule__Column__Group__5 ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2580:1: ( rule__Column__Group__4__Impl rule__Column__Group__5 )
            // InternalChartDsl.g:2581:2: rule__Column__Group__4__Impl rule__Column__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Column__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4"


    // $ANTLR start "rule__Column__Group__4__Impl"
    // InternalChartDsl.g:2588:1: rule__Column__Group__4__Impl : ( ( rule__Column__NameAssignment_4 ) ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2592:1: ( ( ( rule__Column__NameAssignment_4 ) ) )
            // InternalChartDsl.g:2593:1: ( ( rule__Column__NameAssignment_4 ) )
            {
            // InternalChartDsl.g:2593:1: ( ( rule__Column__NameAssignment_4 ) )
            // InternalChartDsl.g:2594:2: ( rule__Column__NameAssignment_4 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_4()); 
            // InternalChartDsl.g:2595:2: ( rule__Column__NameAssignment_4 )
            // InternalChartDsl.g:2595:3: rule__Column__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__5"
    // InternalChartDsl.g:2603:1: rule__Column__Group__5 : rule__Column__Group__5__Impl ;
    public final void rule__Column__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2607:1: ( rule__Column__Group__5__Impl )
            // InternalChartDsl.g:2608:2: rule__Column__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__5"


    // $ANTLR start "rule__Column__Group__5__Impl"
    // InternalChartDsl.g:2614:1: rule__Column__Group__5__Impl : ( ')' ) ;
    public final void rule__Column__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2618:1: ( ( ')' ) )
            // InternalChartDsl.g:2619:1: ( ')' )
            {
            // InternalChartDsl.g:2619:1: ( ')' )
            // InternalChartDsl.g:2620:2: ')'
            {
             before(grammarAccess.getColumnAccess().getRightParenthesisKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__5__Impl"


    // $ANTLR start "rule__Column__Group_2__0"
    // InternalChartDsl.g:2630:1: rule__Column__Group_2__0 : rule__Column__Group_2__0__Impl rule__Column__Group_2__1 ;
    public final void rule__Column__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2634:1: ( rule__Column__Group_2__0__Impl rule__Column__Group_2__1 )
            // InternalChartDsl.g:2635:2: rule__Column__Group_2__0__Impl rule__Column__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__Column__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_2__0"


    // $ANTLR start "rule__Column__Group_2__0__Impl"
    // InternalChartDsl.g:2642:1: rule__Column__Group_2__0__Impl : ( 'index:' ) ;
    public final void rule__Column__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2646:1: ( ( 'index:' ) )
            // InternalChartDsl.g:2647:1: ( 'index:' )
            {
            // InternalChartDsl.g:2647:1: ( 'index:' )
            // InternalChartDsl.g:2648:2: 'index:'
            {
             before(grammarAccess.getColumnAccess().getIndexKeyword_2_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getIndexKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_2__0__Impl"


    // $ANTLR start "rule__Column__Group_2__1"
    // InternalChartDsl.g:2657:1: rule__Column__Group_2__1 : rule__Column__Group_2__1__Impl ;
    public final void rule__Column__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2661:1: ( rule__Column__Group_2__1__Impl )
            // InternalChartDsl.g:2662:2: rule__Column__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_2__1"


    // $ANTLR start "rule__Column__Group_2__1__Impl"
    // InternalChartDsl.g:2668:1: rule__Column__Group_2__1__Impl : ( ( rule__Column__IndexAssignment_2_1 ) ) ;
    public final void rule__Column__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2672:1: ( ( ( rule__Column__IndexAssignment_2_1 ) ) )
            // InternalChartDsl.g:2673:1: ( ( rule__Column__IndexAssignment_2_1 ) )
            {
            // InternalChartDsl.g:2673:1: ( ( rule__Column__IndexAssignment_2_1 ) )
            // InternalChartDsl.g:2674:2: ( rule__Column__IndexAssignment_2_1 )
            {
             before(grammarAccess.getColumnAccess().getIndexAssignment_2_1()); 
            // InternalChartDsl.g:2675:2: ( rule__Column__IndexAssignment_2_1 )
            // InternalChartDsl.g:2675:3: rule__Column__IndexAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__IndexAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getIndexAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_2__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalChartDsl.g:2684:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2688:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalChartDsl.g:2689:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalChartDsl.g:2696:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2700:1: ( ( ( '-' )? ) )
            // InternalChartDsl.g:2701:1: ( ( '-' )? )
            {
            // InternalChartDsl.g:2701:1: ( ( '-' )? )
            // InternalChartDsl.g:2702:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalChartDsl.g:2703:2: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==57) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalChartDsl.g:2703:3: '-'
                    {
                    match(input,57,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalChartDsl.g:2711:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2715:1: ( rule__EInt__Group__1__Impl )
            // InternalChartDsl.g:2716:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalChartDsl.g:2722:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2726:1: ( ( RULE_INT ) )
            // InternalChartDsl.g:2727:1: ( RULE_INT )
            {
            // InternalChartDsl.g:2727:1: ( RULE_INT )
            // InternalChartDsl.g:2728:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__IntVariable__Group__0"
    // InternalChartDsl.g:2738:1: rule__IntVariable__Group__0 : rule__IntVariable__Group__0__Impl rule__IntVariable__Group__1 ;
    public final void rule__IntVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2742:1: ( rule__IntVariable__Group__0__Impl rule__IntVariable__Group__1 )
            // InternalChartDsl.g:2743:2: rule__IntVariable__Group__0__Impl rule__IntVariable__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__IntVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVariable__Group__0"


    // $ANTLR start "rule__IntVariable__Group__0__Impl"
    // InternalChartDsl.g:2750:1: rule__IntVariable__Group__0__Impl : ( () ) ;
    public final void rule__IntVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2754:1: ( ( () ) )
            // InternalChartDsl.g:2755:1: ( () )
            {
            // InternalChartDsl.g:2755:1: ( () )
            // InternalChartDsl.g:2756:2: ()
            {
             before(grammarAccess.getIntVariableAccess().getIntVariableAction_0()); 
            // InternalChartDsl.g:2757:2: ()
            // InternalChartDsl.g:2757:3: 
            {
            }

             after(grammarAccess.getIntVariableAccess().getIntVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVariable__Group__0__Impl"


    // $ANTLR start "rule__IntVariable__Group__1"
    // InternalChartDsl.g:2765:1: rule__IntVariable__Group__1 : rule__IntVariable__Group__1__Impl rule__IntVariable__Group__2 ;
    public final void rule__IntVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2769:1: ( rule__IntVariable__Group__1__Impl rule__IntVariable__Group__2 )
            // InternalChartDsl.g:2770:2: rule__IntVariable__Group__1__Impl rule__IntVariable__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__IntVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVariable__Group__1"


    // $ANTLR start "rule__IntVariable__Group__1__Impl"
    // InternalChartDsl.g:2777:1: rule__IntVariable__Group__1__Impl : ( 'int' ) ;
    public final void rule__IntVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2781:1: ( ( 'int' ) )
            // InternalChartDsl.g:2782:1: ( 'int' )
            {
            // InternalChartDsl.g:2782:1: ( 'int' )
            // InternalChartDsl.g:2783:2: 'int'
            {
             before(grammarAccess.getIntVariableAccess().getIntKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getIntVariableAccess().getIntKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVariable__Group__1__Impl"


    // $ANTLR start "rule__IntVariable__Group__2"
    // InternalChartDsl.g:2792:1: rule__IntVariable__Group__2 : rule__IntVariable__Group__2__Impl rule__IntVariable__Group__3 ;
    public final void rule__IntVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2796:1: ( rule__IntVariable__Group__2__Impl rule__IntVariable__Group__3 )
            // InternalChartDsl.g:2797:2: rule__IntVariable__Group__2__Impl rule__IntVariable__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__IntVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVariable__Group__2"


    // $ANTLR start "rule__IntVariable__Group__2__Impl"
    // InternalChartDsl.g:2804:1: rule__IntVariable__Group__2__Impl : ( '(' ) ;
    public final void rule__IntVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2808:1: ( ( '(' ) )
            // InternalChartDsl.g:2809:1: ( '(' )
            {
            // InternalChartDsl.g:2809:1: ( '(' )
            // InternalChartDsl.g:2810:2: '('
            {
             before(grammarAccess.getIntVariableAccess().getLeftParenthesisKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIntVariableAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVariable__Group__2__Impl"


    // $ANTLR start "rule__IntVariable__Group__3"
    // InternalChartDsl.g:2819:1: rule__IntVariable__Group__3 : rule__IntVariable__Group__3__Impl rule__IntVariable__Group__4 ;
    public final void rule__IntVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2823:1: ( rule__IntVariable__Group__3__Impl rule__IntVariable__Group__4 )
            // InternalChartDsl.g:2824:2: rule__IntVariable__Group__3__Impl rule__IntVariable__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__IntVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntVariable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVariable__Group__3"


    // $ANTLR start "rule__IntVariable__Group__3__Impl"
    // InternalChartDsl.g:2831:1: rule__IntVariable__Group__3__Impl : ( ( rule__IntVariable__InitialValueAssignment_3 )? ) ;
    public final void rule__IntVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2835:1: ( ( ( rule__IntVariable__InitialValueAssignment_3 )? ) )
            // InternalChartDsl.g:2836:1: ( ( rule__IntVariable__InitialValueAssignment_3 )? )
            {
            // InternalChartDsl.g:2836:1: ( ( rule__IntVariable__InitialValueAssignment_3 )? )
            // InternalChartDsl.g:2837:2: ( rule__IntVariable__InitialValueAssignment_3 )?
            {
             before(grammarAccess.getIntVariableAccess().getInitialValueAssignment_3()); 
            // InternalChartDsl.g:2838:2: ( rule__IntVariable__InitialValueAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT||LA24_0==57) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalChartDsl.g:2838:3: rule__IntVariable__InitialValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntVariable__InitialValueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntVariableAccess().getInitialValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVariable__Group__3__Impl"


    // $ANTLR start "rule__IntVariable__Group__4"
    // InternalChartDsl.g:2846:1: rule__IntVariable__Group__4 : rule__IntVariable__Group__4__Impl ;
    public final void rule__IntVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2850:1: ( rule__IntVariable__Group__4__Impl )
            // InternalChartDsl.g:2851:2: rule__IntVariable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntVariable__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVariable__Group__4"


    // $ANTLR start "rule__IntVariable__Group__4__Impl"
    // InternalChartDsl.g:2857:1: rule__IntVariable__Group__4__Impl : ( ')' ) ;
    public final void rule__IntVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2861:1: ( ( ')' ) )
            // InternalChartDsl.g:2862:1: ( ')' )
            {
            // InternalChartDsl.g:2862:1: ( ')' )
            // InternalChartDsl.g:2863:2: ')'
            {
             before(grammarAccess.getIntVariableAccess().getRightParenthesisKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getIntVariableAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVariable__Group__4__Impl"


    // $ANTLR start "rule__StringVariable__Group__0"
    // InternalChartDsl.g:2873:1: rule__StringVariable__Group__0 : rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1 ;
    public final void rule__StringVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2877:1: ( rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1 )
            // InternalChartDsl.g:2878:2: rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__StringVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariable__Group__0"


    // $ANTLR start "rule__StringVariable__Group__0__Impl"
    // InternalChartDsl.g:2885:1: rule__StringVariable__Group__0__Impl : ( () ) ;
    public final void rule__StringVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2889:1: ( ( () ) )
            // InternalChartDsl.g:2890:1: ( () )
            {
            // InternalChartDsl.g:2890:1: ( () )
            // InternalChartDsl.g:2891:2: ()
            {
             before(grammarAccess.getStringVariableAccess().getStringVariableAction_0()); 
            // InternalChartDsl.g:2892:2: ()
            // InternalChartDsl.g:2892:3: 
            {
            }

             after(grammarAccess.getStringVariableAccess().getStringVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariable__Group__0__Impl"


    // $ANTLR start "rule__StringVariable__Group__1"
    // InternalChartDsl.g:2900:1: rule__StringVariable__Group__1 : rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2 ;
    public final void rule__StringVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2904:1: ( rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2 )
            // InternalChartDsl.g:2905:2: rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__StringVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariable__Group__1"


    // $ANTLR start "rule__StringVariable__Group__1__Impl"
    // InternalChartDsl.g:2912:1: rule__StringVariable__Group__1__Impl : ( 'str' ) ;
    public final void rule__StringVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2916:1: ( ( 'str' ) )
            // InternalChartDsl.g:2917:1: ( 'str' )
            {
            // InternalChartDsl.g:2917:1: ( 'str' )
            // InternalChartDsl.g:2918:2: 'str'
            {
             before(grammarAccess.getStringVariableAccess().getStrKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getStringVariableAccess().getStrKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariable__Group__1__Impl"


    // $ANTLR start "rule__StringVariable__Group__2"
    // InternalChartDsl.g:2927:1: rule__StringVariable__Group__2 : rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3 ;
    public final void rule__StringVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2931:1: ( rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3 )
            // InternalChartDsl.g:2932:2: rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__StringVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariable__Group__2"


    // $ANTLR start "rule__StringVariable__Group__2__Impl"
    // InternalChartDsl.g:2939:1: rule__StringVariable__Group__2__Impl : ( '(' ) ;
    public final void rule__StringVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2943:1: ( ( '(' ) )
            // InternalChartDsl.g:2944:1: ( '(' )
            {
            // InternalChartDsl.g:2944:1: ( '(' )
            // InternalChartDsl.g:2945:2: '('
            {
             before(grammarAccess.getStringVariableAccess().getLeftParenthesisKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStringVariableAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariable__Group__2__Impl"


    // $ANTLR start "rule__StringVariable__Group__3"
    // InternalChartDsl.g:2954:1: rule__StringVariable__Group__3 : rule__StringVariable__Group__3__Impl rule__StringVariable__Group__4 ;
    public final void rule__StringVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2958:1: ( rule__StringVariable__Group__3__Impl rule__StringVariable__Group__4 )
            // InternalChartDsl.g:2959:2: rule__StringVariable__Group__3__Impl rule__StringVariable__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__StringVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariable__Group__3"


    // $ANTLR start "rule__StringVariable__Group__3__Impl"
    // InternalChartDsl.g:2966:1: rule__StringVariable__Group__3__Impl : ( ( rule__StringVariable__InitialValueAssignment_3 )? ) ;
    public final void rule__StringVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2970:1: ( ( ( rule__StringVariable__InitialValueAssignment_3 )? ) )
            // InternalChartDsl.g:2971:1: ( ( rule__StringVariable__InitialValueAssignment_3 )? )
            {
            // InternalChartDsl.g:2971:1: ( ( rule__StringVariable__InitialValueAssignment_3 )? )
            // InternalChartDsl.g:2972:2: ( rule__StringVariable__InitialValueAssignment_3 )?
            {
             before(grammarAccess.getStringVariableAccess().getInitialValueAssignment_3()); 
            // InternalChartDsl.g:2973:2: ( rule__StringVariable__InitialValueAssignment_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalChartDsl.g:2973:3: rule__StringVariable__InitialValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringVariable__InitialValueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringVariableAccess().getInitialValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariable__Group__3__Impl"


    // $ANTLR start "rule__StringVariable__Group__4"
    // InternalChartDsl.g:2981:1: rule__StringVariable__Group__4 : rule__StringVariable__Group__4__Impl ;
    public final void rule__StringVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2985:1: ( rule__StringVariable__Group__4__Impl )
            // InternalChartDsl.g:2986:2: rule__StringVariable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringVariable__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariable__Group__4"


    // $ANTLR start "rule__StringVariable__Group__4__Impl"
    // InternalChartDsl.g:2992:1: rule__StringVariable__Group__4__Impl : ( ')' ) ;
    public final void rule__StringVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:2996:1: ( ( ')' ) )
            // InternalChartDsl.g:2997:1: ( ')' )
            {
            // InternalChartDsl.g:2997:1: ( ')' )
            // InternalChartDsl.g:2998:2: ')'
            {
             before(grammarAccess.getStringVariableAccess().getRightParenthesisKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStringVariableAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariable__Group__4__Impl"


    // $ANTLR start "rule__DoubleVariable__Group__0"
    // InternalChartDsl.g:3008:1: rule__DoubleVariable__Group__0 : rule__DoubleVariable__Group__0__Impl rule__DoubleVariable__Group__1 ;
    public final void rule__DoubleVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3012:1: ( rule__DoubleVariable__Group__0__Impl rule__DoubleVariable__Group__1 )
            // InternalChartDsl.g:3013:2: rule__DoubleVariable__Group__0__Impl rule__DoubleVariable__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__DoubleVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleVariable__Group__0"


    // $ANTLR start "rule__DoubleVariable__Group__0__Impl"
    // InternalChartDsl.g:3020:1: rule__DoubleVariable__Group__0__Impl : ( () ) ;
    public final void rule__DoubleVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3024:1: ( ( () ) )
            // InternalChartDsl.g:3025:1: ( () )
            {
            // InternalChartDsl.g:3025:1: ( () )
            // InternalChartDsl.g:3026:2: ()
            {
             before(grammarAccess.getDoubleVariableAccess().getDoubleVariableAction_0()); 
            // InternalChartDsl.g:3027:2: ()
            // InternalChartDsl.g:3027:3: 
            {
            }

             after(grammarAccess.getDoubleVariableAccess().getDoubleVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleVariable__Group__0__Impl"


    // $ANTLR start "rule__DoubleVariable__Group__1"
    // InternalChartDsl.g:3035:1: rule__DoubleVariable__Group__1 : rule__DoubleVariable__Group__1__Impl rule__DoubleVariable__Group__2 ;
    public final void rule__DoubleVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3039:1: ( rule__DoubleVariable__Group__1__Impl rule__DoubleVariable__Group__2 )
            // InternalChartDsl.g:3040:2: rule__DoubleVariable__Group__1__Impl rule__DoubleVariable__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DoubleVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleVariable__Group__1"


    // $ANTLR start "rule__DoubleVariable__Group__1__Impl"
    // InternalChartDsl.g:3047:1: rule__DoubleVariable__Group__1__Impl : ( 'double' ) ;
    public final void rule__DoubleVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3051:1: ( ( 'double' ) )
            // InternalChartDsl.g:3052:1: ( 'double' )
            {
            // InternalChartDsl.g:3052:1: ( 'double' )
            // InternalChartDsl.g:3053:2: 'double'
            {
             before(grammarAccess.getDoubleVariableAccess().getDoubleKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDoubleVariableAccess().getDoubleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleVariable__Group__1__Impl"


    // $ANTLR start "rule__DoubleVariable__Group__2"
    // InternalChartDsl.g:3062:1: rule__DoubleVariable__Group__2 : rule__DoubleVariable__Group__2__Impl rule__DoubleVariable__Group__3 ;
    public final void rule__DoubleVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3066:1: ( rule__DoubleVariable__Group__2__Impl rule__DoubleVariable__Group__3 )
            // InternalChartDsl.g:3067:2: rule__DoubleVariable__Group__2__Impl rule__DoubleVariable__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__DoubleVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleVariable__Group__2"


    // $ANTLR start "rule__DoubleVariable__Group__2__Impl"
    // InternalChartDsl.g:3074:1: rule__DoubleVariable__Group__2__Impl : ( '(' ) ;
    public final void rule__DoubleVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3078:1: ( ( '(' ) )
            // InternalChartDsl.g:3079:1: ( '(' )
            {
            // InternalChartDsl.g:3079:1: ( '(' )
            // InternalChartDsl.g:3080:2: '('
            {
             before(grammarAccess.getDoubleVariableAccess().getLeftParenthesisKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDoubleVariableAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleVariable__Group__2__Impl"


    // $ANTLR start "rule__DoubleVariable__Group__3"
    // InternalChartDsl.g:3089:1: rule__DoubleVariable__Group__3 : rule__DoubleVariable__Group__3__Impl rule__DoubleVariable__Group__4 ;
    public final void rule__DoubleVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3093:1: ( rule__DoubleVariable__Group__3__Impl rule__DoubleVariable__Group__4 )
            // InternalChartDsl.g:3094:2: rule__DoubleVariable__Group__3__Impl rule__DoubleVariable__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__DoubleVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleVariable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleVariable__Group__3"


    // $ANTLR start "rule__DoubleVariable__Group__3__Impl"
    // InternalChartDsl.g:3101:1: rule__DoubleVariable__Group__3__Impl : ( ( rule__DoubleVariable__InitialValueAssignment_3 )? ) ;
    public final void rule__DoubleVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3105:1: ( ( ( rule__DoubleVariable__InitialValueAssignment_3 )? ) )
            // InternalChartDsl.g:3106:1: ( ( rule__DoubleVariable__InitialValueAssignment_3 )? )
            {
            // InternalChartDsl.g:3106:1: ( ( rule__DoubleVariable__InitialValueAssignment_3 )? )
            // InternalChartDsl.g:3107:2: ( rule__DoubleVariable__InitialValueAssignment_3 )?
            {
             before(grammarAccess.getDoubleVariableAccess().getInitialValueAssignment_3()); 
            // InternalChartDsl.g:3108:2: ( rule__DoubleVariable__InitialValueAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT||LA26_0==57||LA26_0==61) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalChartDsl.g:3108:3: rule__DoubleVariable__InitialValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleVariable__InitialValueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoubleVariableAccess().getInitialValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleVariable__Group__3__Impl"


    // $ANTLR start "rule__DoubleVariable__Group__4"
    // InternalChartDsl.g:3116:1: rule__DoubleVariable__Group__4 : rule__DoubleVariable__Group__4__Impl ;
    public final void rule__DoubleVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3120:1: ( rule__DoubleVariable__Group__4__Impl )
            // InternalChartDsl.g:3121:2: rule__DoubleVariable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleVariable__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleVariable__Group__4"


    // $ANTLR start "rule__DoubleVariable__Group__4__Impl"
    // InternalChartDsl.g:3127:1: rule__DoubleVariable__Group__4__Impl : ( ')' ) ;
    public final void rule__DoubleVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3131:1: ( ( ')' ) )
            // InternalChartDsl.g:3132:1: ( ')' )
            {
            // InternalChartDsl.g:3132:1: ( ')' )
            // InternalChartDsl.g:3133:2: ')'
            {
             before(grammarAccess.getDoubleVariableAccess().getRightParenthesisKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDoubleVariableAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleVariable__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalChartDsl.g:3143:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3147:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalChartDsl.g:3148:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalChartDsl.g:3155:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3159:1: ( ( ( '-' )? ) )
            // InternalChartDsl.g:3160:1: ( ( '-' )? )
            {
            // InternalChartDsl.g:3160:1: ( ( '-' )? )
            // InternalChartDsl.g:3161:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalChartDsl.g:3162:2: ( '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==57) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalChartDsl.g:3162:3: '-'
                    {
                    match(input,57,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
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
    // InternalChartDsl.g:3170:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3174:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalChartDsl.g:3175:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalChartDsl.g:3182:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3186:1: ( ( ( RULE_INT )? ) )
            // InternalChartDsl.g:3187:1: ( ( RULE_INT )? )
            {
            // InternalChartDsl.g:3187:1: ( ( RULE_INT )? )
            // InternalChartDsl.g:3188:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalChartDsl.g:3189:2: ( RULE_INT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalChartDsl.g:3189:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalChartDsl.g:3197:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3201:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalChartDsl.g:3202:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalChartDsl.g:3209:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3213:1: ( ( '.' ) )
            // InternalChartDsl.g:3214:1: ( '.' )
            {
            // InternalChartDsl.g:3214:1: ( '.' )
            // InternalChartDsl.g:3215:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
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
    // InternalChartDsl.g:3224:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3228:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalChartDsl.g:3229:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
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
    // InternalChartDsl.g:3236:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3240:1: ( ( RULE_INT ) )
            // InternalChartDsl.g:3241:1: ( RULE_INT )
            {
            // InternalChartDsl.g:3241:1: ( RULE_INT )
            // InternalChartDsl.g:3242:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalChartDsl.g:3251:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3255:1: ( rule__EDouble__Group__4__Impl )
            // InternalChartDsl.g:3256:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalChartDsl.g:3262:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3266:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalChartDsl.g:3267:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalChartDsl.g:3267:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalChartDsl.g:3268:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalChartDsl.g:3269:2: ( rule__EDouble__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=11 && LA29_0<=12)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalChartDsl.g:3269:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalChartDsl.g:3278:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3282:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalChartDsl.g:3283:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalChartDsl.g:3290:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3294:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalChartDsl.g:3295:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalChartDsl.g:3295:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalChartDsl.g:3296:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalChartDsl.g:3297:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalChartDsl.g:3297:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalChartDsl.g:3305:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3309:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalChartDsl.g:3310:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalChartDsl.g:3317:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3321:1: ( ( ( '-' )? ) )
            // InternalChartDsl.g:3322:1: ( ( '-' )? )
            {
            // InternalChartDsl.g:3322:1: ( ( '-' )? )
            // InternalChartDsl.g:3323:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalChartDsl.g:3324:2: ( '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==57) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalChartDsl.g:3324:3: '-'
                    {
                    match(input,57,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalChartDsl.g:3332:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3336:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalChartDsl.g:3337:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalChartDsl.g:3343:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3347:1: ( ( RULE_INT ) )
            // InternalChartDsl.g:3348:1: ( RULE_INT )
            {
            // InternalChartDsl.g:3348:1: ( RULE_INT )
            // InternalChartDsl.g:3349:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalChartDsl.g:3359:1: rule__Program__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3363:1: ( ( ruleEString ) )
            // InternalChartDsl.g:3364:2: ( ruleEString )
            {
            // InternalChartDsl.g:3364:2: ( ruleEString )
            // InternalChartDsl.g:3365:3: ruleEString
            {
             before(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_1"


    // $ANTLR start "rule__Program__CsvFileAssignment_3"
    // InternalChartDsl.g:3374:1: rule__Program__CsvFileAssignment_3 : ( ruleDataFile ) ;
    public final void rule__Program__CsvFileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3378:1: ( ( ruleDataFile ) )
            // InternalChartDsl.g:3379:2: ( ruleDataFile )
            {
            // InternalChartDsl.g:3379:2: ( ruleDataFile )
            // InternalChartDsl.g:3380:3: ruleDataFile
            {
             before(grammarAccess.getProgramAccess().getCsvFileDataFileParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataFile();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getCsvFileDataFileParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__CsvFileAssignment_3"


    // $ANTLR start "rule__Program__ChartAssignment_4"
    // InternalChartDsl.g:3389:1: rule__Program__ChartAssignment_4 : ( ruleChart ) ;
    public final void rule__Program__ChartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3393:1: ( ( ruleChart ) )
            // InternalChartDsl.g:3394:2: ( ruleChart )
            {
            // InternalChartDsl.g:3394:2: ( ruleChart )
            // InternalChartDsl.g:3395:3: ruleChart
            {
             before(grammarAccess.getProgramAccess().getChartChartParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleChart();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getChartChartParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ChartAssignment_4"


    // $ANTLR start "rule__Program__ChartAssignment_5"
    // InternalChartDsl.g:3404:1: rule__Program__ChartAssignment_5 : ( ruleChart ) ;
    public final void rule__Program__ChartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3408:1: ( ( ruleChart ) )
            // InternalChartDsl.g:3409:2: ( ruleChart )
            {
            // InternalChartDsl.g:3409:2: ( ruleChart )
            // InternalChartDsl.g:3410:3: ruleChart
            {
             before(grammarAccess.getProgramAccess().getChartChartParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleChart();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getChartChartParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ChartAssignment_5"


    // $ANTLR start "rule__Chart__TitleAssignment_3_1"
    // InternalChartDsl.g:3419:1: rule__Chart__TitleAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Chart__TitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3423:1: ( ( ruleEString ) )
            // InternalChartDsl.g:3424:2: ( ruleEString )
            {
            // InternalChartDsl.g:3424:2: ( ruleEString )
            // InternalChartDsl.g:3425:3: ruleEString
            {
             before(grammarAccess.getChartAccess().getTitleEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChartAccess().getTitleEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__TitleAssignment_3_1"


    // $ANTLR start "rule__Chart__TypeAssignment_4_1"
    // InternalChartDsl.g:3434:1: rule__Chart__TypeAssignment_4_1 : ( ruleChartType ) ;
    public final void rule__Chart__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3438:1: ( ( ruleChartType ) )
            // InternalChartDsl.g:3439:2: ( ruleChartType )
            {
            // InternalChartDsl.g:3439:2: ( ruleChartType )
            // InternalChartDsl.g:3440:3: ruleChartType
            {
             before(grammarAccess.getChartAccess().getTypeChartTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChartType();

            state._fsp--;

             after(grammarAccess.getChartAccess().getTypeChartTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__TypeAssignment_4_1"


    // $ANTLR start "rule__Chart__XVariableAssignment_5_2"
    // InternalChartDsl.g:3449:1: rule__Chart__XVariableAssignment_5_2 : ( ruleColumnRef ) ;
    public final void rule__Chart__XVariableAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3453:1: ( ( ruleColumnRef ) )
            // InternalChartDsl.g:3454:2: ( ruleColumnRef )
            {
            // InternalChartDsl.g:3454:2: ( ruleColumnRef )
            // InternalChartDsl.g:3455:3: ruleColumnRef
            {
             before(grammarAccess.getChartAccess().getXVariableColumnRefParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnRef();

            state._fsp--;

             after(grammarAccess.getChartAccess().getXVariableColumnRefParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__XVariableAssignment_5_2"


    // $ANTLR start "rule__Chart__XVariableAssignment_5_3_1"
    // InternalChartDsl.g:3464:1: rule__Chart__XVariableAssignment_5_3_1 : ( ruleColumnRef ) ;
    public final void rule__Chart__XVariableAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3468:1: ( ( ruleColumnRef ) )
            // InternalChartDsl.g:3469:2: ( ruleColumnRef )
            {
            // InternalChartDsl.g:3469:2: ( ruleColumnRef )
            // InternalChartDsl.g:3470:3: ruleColumnRef
            {
             before(grammarAccess.getChartAccess().getXVariableColumnRefParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnRef();

            state._fsp--;

             after(grammarAccess.getChartAccess().getXVariableColumnRefParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__XVariableAssignment_5_3_1"


    // $ANTLR start "rule__Chart__YVariableAssignment_6_2"
    // InternalChartDsl.g:3479:1: rule__Chart__YVariableAssignment_6_2 : ( ruleColumnRef ) ;
    public final void rule__Chart__YVariableAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3483:1: ( ( ruleColumnRef ) )
            // InternalChartDsl.g:3484:2: ( ruleColumnRef )
            {
            // InternalChartDsl.g:3484:2: ( ruleColumnRef )
            // InternalChartDsl.g:3485:3: ruleColumnRef
            {
             before(grammarAccess.getChartAccess().getYVariableColumnRefParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnRef();

            state._fsp--;

             after(grammarAccess.getChartAccess().getYVariableColumnRefParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__YVariableAssignment_6_2"


    // $ANTLR start "rule__Chart__YVariableAssignment_6_3_1"
    // InternalChartDsl.g:3494:1: rule__Chart__YVariableAssignment_6_3_1 : ( ruleColumnRef ) ;
    public final void rule__Chart__YVariableAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3498:1: ( ( ruleColumnRef ) )
            // InternalChartDsl.g:3499:2: ( ruleColumnRef )
            {
            // InternalChartDsl.g:3499:2: ( ruleColumnRef )
            // InternalChartDsl.g:3500:3: ruleColumnRef
            {
             before(grammarAccess.getChartAccess().getYVariableColumnRefParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnRef();

            state._fsp--;

             after(grammarAccess.getChartAccess().getYVariableColumnRefParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__YVariableAssignment_6_3_1"


    // $ANTLR start "rule__Chart__FilterAssignment_7_2"
    // InternalChartDsl.g:3509:1: rule__Chart__FilterAssignment_7_2 : ( ruleCondition ) ;
    public final void rule__Chart__FilterAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3513:1: ( ( ruleCondition ) )
            // InternalChartDsl.g:3514:2: ( ruleCondition )
            {
            // InternalChartDsl.g:3514:2: ( ruleCondition )
            // InternalChartDsl.g:3515:3: ruleCondition
            {
             before(grammarAccess.getChartAccess().getFilterConditionParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getChartAccess().getFilterConditionParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__FilterAssignment_7_2"


    // $ANTLR start "rule__Chart__FilterAssignment_7_3_1"
    // InternalChartDsl.g:3524:1: rule__Chart__FilterAssignment_7_3_1 : ( ruleCondition ) ;
    public final void rule__Chart__FilterAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3528:1: ( ( ruleCondition ) )
            // InternalChartDsl.g:3529:2: ( ruleCondition )
            {
            // InternalChartDsl.g:3529:2: ( ruleCondition )
            // InternalChartDsl.g:3530:3: ruleCondition
            {
             before(grammarAccess.getChartAccess().getFilterConditionParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getChartAccess().getFilterConditionParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__FilterAssignment_7_3_1"


    // $ANTLR start "rule__DataFile__FilePathAssignment_0_3"
    // InternalChartDsl.g:3539:1: rule__DataFile__FilePathAssignment_0_3 : ( ruleEString ) ;
    public final void rule__DataFile__FilePathAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3543:1: ( ( ruleEString ) )
            // InternalChartDsl.g:3544:2: ( ruleEString )
            {
            // InternalChartDsl.g:3544:2: ( ruleEString )
            // InternalChartDsl.g:3545:3: ruleEString
            {
             before(grammarAccess.getDataFileAccess().getFilePathEStringParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataFileAccess().getFilePathEStringParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__FilePathAssignment_0_3"


    // $ANTLR start "rule__DataFile__HasHeaderAssignment_1_1"
    // InternalChartDsl.g:3554:1: rule__DataFile__HasHeaderAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__DataFile__HasHeaderAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3558:1: ( ( ruleEBoolean ) )
            // InternalChartDsl.g:3559:2: ( ruleEBoolean )
            {
            // InternalChartDsl.g:3559:2: ( ruleEBoolean )
            // InternalChartDsl.g:3560:3: ruleEBoolean
            {
             before(grammarAccess.getDataFileAccess().getHasHeaderEBooleanParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getDataFileAccess().getHasHeaderEBooleanParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__HasHeaderAssignment_1_1"


    // $ANTLR start "rule__DataFile__HasTypeAssignment_2_1"
    // InternalChartDsl.g:3569:1: rule__DataFile__HasTypeAssignment_2_1 : ( ruleEBoolean ) ;
    public final void rule__DataFile__HasTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3573:1: ( ( ruleEBoolean ) )
            // InternalChartDsl.g:3574:2: ( ruleEBoolean )
            {
            // InternalChartDsl.g:3574:2: ( ruleEBoolean )
            // InternalChartDsl.g:3575:3: ruleEBoolean
            {
             before(grammarAccess.getDataFileAccess().getHasTypeEBooleanParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getDataFileAccess().getHasTypeEBooleanParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__HasTypeAssignment_2_1"


    // $ANTLR start "rule__DataFile__SeparatorAssignment_3_1"
    // InternalChartDsl.g:3584:1: rule__DataFile__SeparatorAssignment_3_1 : ( ruleEString ) ;
    public final void rule__DataFile__SeparatorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3588:1: ( ( ruleEString ) )
            // InternalChartDsl.g:3589:2: ( ruleEString )
            {
            // InternalChartDsl.g:3589:2: ( ruleEString )
            // InternalChartDsl.g:3590:3: ruleEString
            {
             before(grammarAccess.getDataFileAccess().getSeparatorEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataFileAccess().getSeparatorEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__SeparatorAssignment_3_1"


    // $ANTLR start "rule__DataFile__UsedColumnAssignment_7"
    // InternalChartDsl.g:3599:1: rule__DataFile__UsedColumnAssignment_7 : ( ruleColumn ) ;
    public final void rule__DataFile__UsedColumnAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3603:1: ( ( ruleColumn ) )
            // InternalChartDsl.g:3604:2: ( ruleColumn )
            {
            // InternalChartDsl.g:3604:2: ( ruleColumn )
            // InternalChartDsl.g:3605:3: ruleColumn
            {
             before(grammarAccess.getDataFileAccess().getUsedColumnColumnParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getDataFileAccess().getUsedColumnColumnParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__UsedColumnAssignment_7"


    // $ANTLR start "rule__DataFile__UsedColumnAssignment_8_1"
    // InternalChartDsl.g:3614:1: rule__DataFile__UsedColumnAssignment_8_1 : ( ruleColumn ) ;
    public final void rule__DataFile__UsedColumnAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3618:1: ( ( ruleColumn ) )
            // InternalChartDsl.g:3619:2: ( ruleColumn )
            {
            // InternalChartDsl.g:3619:2: ( ruleColumn )
            // InternalChartDsl.g:3620:3: ruleColumn
            {
             before(grammarAccess.getDataFileAccess().getUsedColumnColumnParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getDataFileAccess().getUsedColumnColumnParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__UsedColumnAssignment_8_1"


    // $ANTLR start "rule__ColumnRef__MakeRefToAssignment"
    // InternalChartDsl.g:3629:1: rule__ColumnRef__MakeRefToAssignment : ( ( ruleEString ) ) ;
    public final void rule__ColumnRef__MakeRefToAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3633:1: ( ( ( ruleEString ) ) )
            // InternalChartDsl.g:3634:2: ( ( ruleEString ) )
            {
            // InternalChartDsl.g:3634:2: ( ( ruleEString ) )
            // InternalChartDsl.g:3635:3: ( ruleEString )
            {
             before(grammarAccess.getColumnRefAccess().getMakeRefToColumnCrossReference_0()); 
            // InternalChartDsl.g:3636:3: ( ruleEString )
            // InternalChartDsl.g:3637:4: ruleEString
            {
             before(grammarAccess.getColumnRefAccess().getMakeRefToColumnEStringParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnRefAccess().getMakeRefToColumnEStringParserRuleCall_0_1()); 

            }

             after(grammarAccess.getColumnRefAccess().getMakeRefToColumnCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnRef__MakeRefToAssignment"


    // $ANTLR start "rule__Condition__LeftElementAssignment_1"
    // InternalChartDsl.g:3648:1: rule__Condition__LeftElementAssignment_1 : ( ruleColumnRef ) ;
    public final void rule__Condition__LeftElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3652:1: ( ( ruleColumnRef ) )
            // InternalChartDsl.g:3653:2: ( ruleColumnRef )
            {
            // InternalChartDsl.g:3653:2: ( ruleColumnRef )
            // InternalChartDsl.g:3654:3: ruleColumnRef
            {
             before(grammarAccess.getConditionAccess().getLeftElementColumnRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnRef();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getLeftElementColumnRefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__LeftElementAssignment_1"


    // $ANTLR start "rule__Condition__OperatorAssignment_2"
    // InternalChartDsl.g:3663:1: rule__Condition__OperatorAssignment_2 : ( ruleCompOperator ) ;
    public final void rule__Condition__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3667:1: ( ( ruleCompOperator ) )
            // InternalChartDsl.g:3668:2: ( ruleCompOperator )
            {
            // InternalChartDsl.g:3668:2: ( ruleCompOperator )
            // InternalChartDsl.g:3669:3: ruleCompOperator
            {
             before(grammarAccess.getConditionAccess().getOperatorCompOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCompOperator();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOperatorCompOperatorEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__OperatorAssignment_2"


    // $ANTLR start "rule__Condition__RightElementAssignment_3"
    // InternalChartDsl.g:3678:1: rule__Condition__RightElementAssignment_3 : ( ruleConstant ) ;
    public final void rule__Condition__RightElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3682:1: ( ( ruleConstant ) )
            // InternalChartDsl.g:3683:2: ( ruleConstant )
            {
            // InternalChartDsl.g:3683:2: ( ruleConstant )
            // InternalChartDsl.g:3684:3: ruleConstant
            {
             before(grammarAccess.getConditionAccess().getRightElementConstantParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getRightElementConstantParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__RightElementAssignment_3"


    // $ANTLR start "rule__Column__IndexAssignment_2_1"
    // InternalChartDsl.g:3693:1: rule__Column__IndexAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__Column__IndexAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3697:1: ( ( ruleEInt ) )
            // InternalChartDsl.g:3698:2: ( ruleEInt )
            {
            // InternalChartDsl.g:3698:2: ( ruleEInt )
            // InternalChartDsl.g:3699:3: ruleEInt
            {
             before(grammarAccess.getColumnAccess().getIndexEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getIndexEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__IndexAssignment_2_1"


    // $ANTLR start "rule__Column__NameAssignment_4"
    // InternalChartDsl.g:3708:1: rule__Column__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Column__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3712:1: ( ( ruleEString ) )
            // InternalChartDsl.g:3713:2: ( ruleEString )
            {
            // InternalChartDsl.g:3713:2: ( ruleEString )
            // InternalChartDsl.g:3714:3: ruleEString
            {
             before(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__NameAssignment_4"


    // $ANTLR start "rule__IntVariable__InitialValueAssignment_3"
    // InternalChartDsl.g:3723:1: rule__IntVariable__InitialValueAssignment_3 : ( ruleEInt ) ;
    public final void rule__IntVariable__InitialValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3727:1: ( ( ruleEInt ) )
            // InternalChartDsl.g:3728:2: ( ruleEInt )
            {
            // InternalChartDsl.g:3728:2: ( ruleEInt )
            // InternalChartDsl.g:3729:3: ruleEInt
            {
             before(grammarAccess.getIntVariableAccess().getInitialValueEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntVariableAccess().getInitialValueEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVariable__InitialValueAssignment_3"


    // $ANTLR start "rule__StringVariable__InitialValueAssignment_3"
    // InternalChartDsl.g:3738:1: rule__StringVariable__InitialValueAssignment_3 : ( ruleEString ) ;
    public final void rule__StringVariable__InitialValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3742:1: ( ( ruleEString ) )
            // InternalChartDsl.g:3743:2: ( ruleEString )
            {
            // InternalChartDsl.g:3743:2: ( ruleEString )
            // InternalChartDsl.g:3744:3: ruleEString
            {
             before(grammarAccess.getStringVariableAccess().getInitialValueEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringVariableAccess().getInitialValueEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariable__InitialValueAssignment_3"


    // $ANTLR start "rule__DoubleVariable__InitialValueAssignment_3"
    // InternalChartDsl.g:3753:1: rule__DoubleVariable__InitialValueAssignment_3 : ( ruleEDouble ) ;
    public final void rule__DoubleVariable__InitialValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:3757:1: ( ( ruleEDouble ) )
            // InternalChartDsl.g:3758:2: ( ruleEDouble )
            {
            // InternalChartDsl.g:3758:2: ( ruleEDouble )
            // InternalChartDsl.g:3759:3: ruleEDouble
            {
             before(grammarAccess.getDoubleVariableAccess().getInitialValueEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDoubleVariableAccess().getInitialValueEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleVariable__InitialValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0072800000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000C7800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000FF8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x1C0000003F000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0200000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200010000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2200010000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x2200000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001800L});

}