/*
 * generated by Xtext 2.25.0
 */
package fr.unice.cotedazur.l3ia2023.mycs.formatting2

import chartitproject.Chart
import chartitproject.Program
import com.google.inject.Inject
import fr.unice.cotedazur.l3ia2023.mycs.services.ChartDslGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ChartDslFormatter extends AbstractFormatter2 {
	
	@Inject extension ChartDslGrammarAccess

	def dispatch void format(Program program, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		program.csvFile.format
		for (chart : program.chart) {
			chart.format
		}
	}

	def dispatch void format(Chart chart, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (columnRef : chart.XVariable) {
			columnRef.format
		} 
		for (columnRef : chart.YVariable) {
			columnRef.format
		}
		for (condition : chart.filter) {
			condition.format
		}
	}
	
	// TODO: implement for DataFile, Condition
}
