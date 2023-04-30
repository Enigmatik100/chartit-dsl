/*
 * generated by Xtext 2.25.0
 */
package fr.unice.cotedazur.l3ia2023.mycs.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import chartitproject.Program
import chartitproject.Column
import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import chartitproject.Chart
import chartitproject.Condition
import chartitproject.IntVariable
import chartitproject.ColumnRef
import java.util.List
import java.io.File
import java.util.Scanner
import java.io.FileNotFoundException
import java.util.Map
import java.util.HashMap
import chartitproject.StringVariable
import chartitproject.DoubleVariable

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ChartDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val Program root = resource.allContents.head as Program
		// unkown value: by default I choose unknown (May be after we will add features to handle missing values in data
		val String commonDefaultMissingValue = "unknown"
		
		// read the program name
		val String program = root.name
		// read csv delimiter
		val String csvDelimiter = root.csvFile.separator
		// read hasHeader value
		val boolean hasHeader = root.csvFile.hasHeader
		// read hasType value
		val boolean hasType = root.csvFile.hasType
		
		// read file path 
		val String filePath = root.csvFile.filePath
		
		// read selected columns
		val EList<Column> columns = root.csvFile.usedColumn
		
		// read selected columns
		val EList<Chart> charts = root.chart
	
		
		var ArrayList<ArrayList<String>> list = readCSV(filePath, csvDelimiter, commonDefaultMissingValue);
		       
		var StringBuilder content = new StringBuilder("");
		for (var int i = 0; i < list.size(); i++) {
		    var StringBuilder sb = new StringBuilder();
		    for (var int j = 0; j < list.get(i).size(); j++) {
		        if (!sb.toString().isEmpty()) { sb.append(", "); }
		        sb.append(list.get(i).get(j));
		    }
		    sb.append("\n")
		    content.append(sb)
		}
			
		val String jsonData = createJsonData( list, columns, csvDelimiter, commonDefaultMissingValue )
		val String jsScript = generateGraphJsScript(charts.get(0))
			
			
		
		var html  = '''
		<!DOCTYPE html>
		<head>
		  <title>«root.name»</title>
		  <style>
		  /* Resets */
		   * {
		     margin: 0;
		     padding: 0;
		     box-sizing: border-box;
		   }
		   h1 {
		        text-align: center;
		        line-height: 100px;
		        margin: 0;
		    }
		section {
			height: 100%;
			padding: 0;
			margin: 0;
			display: flex;
			align-items: center;
			justify-content: center;
		} 
		
		  #chartCard {
		  	width:auto;
		  	background: rgba(255, 255, 255, 1);
		  	display: flex;
		  	align-items: center; 
		  	justify-content: center;
		  	flex-wrap: wrap;
		  }
		  
		  .myChartBox{
		  	width: 700px;
		  	padding:20px;
		  	border: solid 3px rgba(232, 244, 248, 1);
		  	background: white;
		  }
		   </style> 
		</head>
		<body>
		<h1> ChartIT Project </h1>
		<section>
			<div  id="chartCard">
				«FOR id : generateChartIdName(charts)»
					 <div class="myChartBox">
					 	<canvas id="myChart«id»"></canvas>
					 </div>
				«ENDFOR»
			</div>
		</section>
		<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
		<!-- <script src="https://raw.githubusercontent.com/chartjs/Chart.js/master/docs/scripts/utils.js"></script> -->
		
		<script>
		
			// Default json data based on selected column
			«jsonData»
			
			// filter data			
			«FOR chart : charts»
				«IF chart.filter.size() > 0 »
				    «filteredData(chart)»
				«ENDIF»
			«ENDFOR»
			
			
			
			«FOR chart : charts»
				«generateGraphJsScript(chart)»
			«ENDFOR»
		
		</script>
		
		</body>
		</html>
		'''
			 
			
			
			 
			
		fsa.generateFile(program+'.html', html)
	}
	
	
	def List<String> generateChartIdName(EList<Chart> charts){
			var List<String> idsName = new ArrayList()
			
			for (Chart chart: charts){
				var String type = chart.type.getName().toLowerCase()
				var String id = type.substring(0, 1).toUpperCase() + type.substring(1)
				idsName.add(id)
			}
			
		return idsName
	}
	
	def String filteredData(Chart chart){
		
		val Map<String, String> compOperators = new HashMap()
		compOperators.put("GREATER", '>')
		compOperators.put("LESS", '<')
		compOperators.put("EQUAL", '===')
		compOperators.put("NOT_EQUAL", '!==')
		compOperators.put("GREATER_OR_EQUAL", '>=')
		compOperators.put("LESS_OR_EQUAL", '>=')
		
		
		var EList<Condition> filters = chart.filter
		
		var String type = chart.type.getName().toLowerCase()
		var List<String> conditions = new ArrayList()
		for (Condition cond: filters){
			val StringBuilder c =  new StringBuilder('row.'+cond.leftElement.makeRefTo.name).append(" ")
			c.append(compOperators.get(cond.operator.getName())).append(" ")
			if (cond.rightElement instanceof IntVariable){
				c.append((cond.rightElement as IntVariable).initialValue)
			}else if (cond.rightElement instanceof StringVariable){
				c.append("\"").append((cond.rightElement as StringVariable).initialValue).append("\"")
				
			}else{
				c.append((cond.rightElement as DoubleVariable).initialValue)
			}
			
			conditions.add(c.toString())
		}
		
		
		val String camelType = type.substring(0, 1).toUpperCase() + type.substring(1)
		var filteredDataScript = '''
			const filteredData«camelType» = data.filter(row => {
				if («conditions.join(" && ")»){
					return row
				}
			})
		''' 
		return filteredDataScript
	}
	
	
	def String generateGraphJsScript(Chart chart){
		var String xAxis = chart.XVariable.get(0).makeRefTo.name
		var EList<ColumnRef> yAxises = chart.YVariable
		var String type = chart.type.getName().toLowerCase()
		val boolean hasFilter = chart.filter.size() > 0
		
		val String camelType = type.substring(0, 1).toUpperCase() + type.substring(1)
		val String dataVariableName = hasFilter ? '''filteredData«camelType»''': 'data'
		var String script = '''
		new Chart(
		    document.getElementById('myChart«camelType»'),
		    {
		      type: '«type»',
		      data: {
		        labels: «dataVariableName».map(row => row.«xAxis»),
		        datasets: [
		        «FOR yColRef : yAxises»
		          {
		             label: "«yColRef.makeRefTo.name»",
		             data: «dataVariableName».map(row => row.«yColRef.makeRefTo.name»),
		          }, 
		        «ENDFOR»
		        ]
		      }
		    }
		  );
		'''
		
		return script
	}
	
	
	def String createJsonData(ArrayList<ArrayList<String>> data, EList<Column> columns, String delimiter, String commonDefaultMissingValue){
		var StringBuilder jsonData = new StringBuilder("const data = [\n");
		val ArrayList<String> columnTypes = data.get(0)
		
		val List<String> stringColumnTypesNames = new ArrayList()
		stringColumnTypesNames.add("STRING")
		stringColumnTypesNames.add("String")
		stringColumnTypesNames.add("string")
		stringColumnTypesNames.add("CAT")
		stringColumnTypesNames.add("Category")
		
		
		
		for (var int i = 1; i < data.size(); i++) {
		    var StringBuilder row = new StringBuilder("{");
		   
		     var int countUnkownValues = 0
		      for (var int j = 0; j < columns.size(); j++){
		        val String colName = columns.get(j).name
		        var int index = columns.get(j).index
		        
		        // check if my data is unknown
		        if (data.get(i).get(index).equals(commonDefaultMissingValue)){
		        	countUnkownValues +=1
		        } 
		        
		        if (stringColumnTypesNames.contains(columnTypes.get(index))){
		        	row.append(colName).append(": ").append("\""+data.get(i).get(index)+"\"")
		        }else{
		        	row.append(colName).append(": ").append(data.get(i).get(index))
		        }
		        if (j != columns.size() - 1){
		        	row.append(",")
		        }
		     }
		     row.append("}")
		     
		     // Take only row without unknown data
		     if (countUnkownValues == 0){
		     	jsonData.append(row)
		     	if (i != data.size() - 1){
					jsonData.append(",")
					jsonData.append("\n")
				}
		     }
		     
		     
		}
		jsonData.append("\n")
		jsonData.append("]")
		return jsonData.toString()
	}
	
	def ArrayList<ArrayList<String>> readCSV(String path, String csvDelimiter, String commonDefault){
			// read csv file and file the missing value by commonDefault
			// By default commonDefault is unknown
			var ArrayList<ArrayList<String>> fileData = new ArrayList()	
			
			var File csvFile = new File(path)
			
			try(var Scanner reader = new Scanner(csvFile)) {
				
				var String[] columnData = reader.nextLine().split("\\s*\\" + csvDelimiter+ "\\s*");
				val int csvValuesPerLineCount = columnData.length;
				
				var ArrayList<String> rowData;
				while(reader.hasNextLine()){ 
					rowData = new ArrayList()
					var String aLine = reader.nextLine().trim()
					// ignore blank line
					if (!aLine.isEmpty()){
						var String[] aLineParts = aLine.split("\\s*\\" + csvDelimiter + "\\s*", csvValuesPerLineCount)
					
						for (var int i=0; i < aLineParts.length; i++){
							rowData.add((aLineParts.get(i).isEmpty() || aLineParts.get(i).equalsIgnoreCase("null"))
								? commonDefault: aLineParts.get(i)
							);
						}
					}
					fileData.add(rowData)
				}
			}catch (FileNotFoundException ex){
				System.err.println("The csv file to read can not be found")
			}catch (IndexOutOfBoundsException e){
				System.err.println("Index out of bound"+e.getMessage())
				
			}
			return fileData
		 }	
}
 