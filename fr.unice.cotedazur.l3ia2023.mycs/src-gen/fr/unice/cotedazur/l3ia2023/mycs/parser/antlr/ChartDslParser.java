/*
 * generated by Xtext 2.25.0
 */
package fr.unice.cotedazur.l3ia2023.mycs.parser.antlr;

import com.google.inject.Inject;
import fr.unice.cotedazur.l3ia2023.mycs.parser.antlr.internal.InternalChartDslParser;
import fr.unice.cotedazur.l3ia2023.mycs.services.ChartDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ChartDslParser extends AbstractAntlrParser {

	@Inject
	private ChartDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalChartDslParser createParser(XtextTokenStream stream) {
		return new InternalChartDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}

	public ChartDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ChartDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
