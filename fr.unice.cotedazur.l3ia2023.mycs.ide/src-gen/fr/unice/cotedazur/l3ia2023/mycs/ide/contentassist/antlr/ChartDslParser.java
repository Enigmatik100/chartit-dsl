/*
 * generated by Xtext 2.25.0
 */
package fr.unice.cotedazur.l3ia2023.mycs.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.unice.cotedazur.l3ia2023.mycs.ide.contentassist.antlr.internal.InternalChartDslParser;
import fr.unice.cotedazur.l3ia2023.mycs.services.ChartDslGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ChartDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ChartDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ChartDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getConstantAccess().getAlternatives(), "rule__Constant__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getChartTypeAccess().getAlternatives(), "rule__ChartType__Alternatives");
			builder.put(grammarAccess.getCompOperatorAccess().getAlternatives(), "rule__CompOperator__Alternatives");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getChartAccess().getGroup(), "rule__Chart__Group__0");
			builder.put(grammarAccess.getChartAccess().getGroup_3(), "rule__Chart__Group_3__0");
			builder.put(grammarAccess.getChartAccess().getGroup_4(), "rule__Chart__Group_4__0");
			builder.put(grammarAccess.getChartAccess().getGroup_5(), "rule__Chart__Group_5__0");
			builder.put(grammarAccess.getChartAccess().getGroup_6(), "rule__Chart__Group_6__0");
			builder.put(grammarAccess.getChartAccess().getGroup_7(), "rule__Chart__Group_7__0");
			builder.put(grammarAccess.getDataFileAccess().getGroup(), "rule__DataFile__Group__0");
			builder.put(grammarAccess.getDataFileAccess().getGroup_0(), "rule__DataFile__Group_0__0");
			builder.put(grammarAccess.getDataFileAccess().getGroup_1(), "rule__DataFile__Group_1__0");
			builder.put(grammarAccess.getDataFileAccess().getGroup_2(), "rule__DataFile__Group_2__0");
			builder.put(grammarAccess.getDataFileAccess().getGroup_3(), "rule__DataFile__Group_3__0");
			builder.put(grammarAccess.getDataFileAccess().getGroup_8(), "rule__DataFile__Group_8__0");
			builder.put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
			builder.put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
			builder.put(grammarAccess.getColumnAccess().getGroup_2(), "rule__Column__Group_2__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getIntVariableAccess().getGroup(), "rule__IntVariable__Group__0");
			builder.put(grammarAccess.getStringVariableAccess().getGroup(), "rule__StringVariable__Group__0");
			builder.put(grammarAccess.getDoubleVariableAccess().getGroup(), "rule__DoubleVariable__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getProgramAccess().getCsvFileAssignment_0(), "rule__Program__CsvFileAssignment_0");
			builder.put(grammarAccess.getProgramAccess().getChartAssignment_1(), "rule__Program__ChartAssignment_1");
			builder.put(grammarAccess.getProgramAccess().getChartAssignment_2(), "rule__Program__ChartAssignment_2");
			builder.put(grammarAccess.getChartAccess().getTitleAssignment_3_1(), "rule__Chart__TitleAssignment_3_1");
			builder.put(grammarAccess.getChartAccess().getTypeAssignment_4_1(), "rule__Chart__TypeAssignment_4_1");
			builder.put(grammarAccess.getChartAccess().getXVariableAssignment_5_1(), "rule__Chart__XVariableAssignment_5_1");
			builder.put(grammarAccess.getChartAccess().getXVariableAssignment_5_2(), "rule__Chart__XVariableAssignment_5_2");
			builder.put(grammarAccess.getChartAccess().getYVariableAssignment_6_1(), "rule__Chart__YVariableAssignment_6_1");
			builder.put(grammarAccess.getChartAccess().getYVariableAssignment_6_2(), "rule__Chart__YVariableAssignment_6_2");
			builder.put(grammarAccess.getChartAccess().getFilterAssignment_7_1(), "rule__Chart__FilterAssignment_7_1");
			builder.put(grammarAccess.getChartAccess().getFilterAssignment_7_2(), "rule__Chart__FilterAssignment_7_2");
			builder.put(grammarAccess.getDataFileAccess().getFilePathAssignment_0_3(), "rule__DataFile__FilePathAssignment_0_3");
			builder.put(grammarAccess.getDataFileAccess().getHasHeaderAssignment_1_1(), "rule__DataFile__HasHeaderAssignment_1_1");
			builder.put(grammarAccess.getDataFileAccess().getHasTypeAssignment_2_1(), "rule__DataFile__HasTypeAssignment_2_1");
			builder.put(grammarAccess.getDataFileAccess().getSeparatorAssignment_3_1(), "rule__DataFile__SeparatorAssignment_3_1");
			builder.put(grammarAccess.getDataFileAccess().getUsedColumnAssignment_7(), "rule__DataFile__UsedColumnAssignment_7");
			builder.put(grammarAccess.getDataFileAccess().getUsedColumnAssignment_8_1(), "rule__DataFile__UsedColumnAssignment_8_1");
			builder.put(grammarAccess.getColumnRefAccess().getMakeRefToAssignment(), "rule__ColumnRef__MakeRefToAssignment");
			builder.put(grammarAccess.getConditionAccess().getLeftElementAssignment_0(), "rule__Condition__LeftElementAssignment_0");
			builder.put(grammarAccess.getConditionAccess().getOperatorAssignment_1(), "rule__Condition__OperatorAssignment_1");
			builder.put(grammarAccess.getConditionAccess().getRightElementAssignment_2(), "rule__Condition__RightElementAssignment_2");
			builder.put(grammarAccess.getColumnAccess().getIndexAssignment_2_1(), "rule__Column__IndexAssignment_2_1");
			builder.put(grammarAccess.getColumnAccess().getNameAssignment_4(), "rule__Column__NameAssignment_4");
			builder.put(grammarAccess.getIntVariableAccess().getInitialValueAssignment_3(), "rule__IntVariable__InitialValueAssignment_3");
			builder.put(grammarAccess.getStringVariableAccess().getInitialValueAssignment_3(), "rule__StringVariable__InitialValueAssignment_3");
			builder.put(grammarAccess.getDoubleVariableAccess().getInitialValueAssignment_3(), "rule__DoubleVariable__InitialValueAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ChartDslGrammarAccess grammarAccess;

	@Override
	protected InternalChartDslParser createParser() {
		InternalChartDslParser result = new InternalChartDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ChartDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ChartDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
