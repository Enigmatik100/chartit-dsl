/**
 */
package chartitproject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see chartitproject.ChartitprojectFactory
 * @model kind="package"
 * @generated
 */
public interface ChartitprojectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chartitproject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/chartitproject";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chartitproject";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChartitprojectPackage eINSTANCE = chartitproject.impl.ChartitprojectPackageImpl.init();

	/**
	 * The meta object id for the '{@link chartitproject.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartitproject.impl.ProgramImpl
	 * @see chartitproject.impl.ChartitprojectPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Chart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CHART = 1;

	/**
	 * The feature id for the '<em><b>Csv File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CSV_FILE = 2;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chartitproject.impl.DataFileImpl <em>Data File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartitproject.impl.DataFileImpl
	 * @see chartitproject.impl.ChartitprojectPackageImpl#getDataFile()
	 * @generated
	 */
	int DATA_FILE = 1;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE__FILE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Has Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE__HAS_HEADER = 1;

	/**
	 * The feature id for the '<em><b>Used Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE__USED_COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Has Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE__HAS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE__SEPARATOR = 4;

	/**
	 * The number of structural features of the '<em>Data File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Data File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chartitproject.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartitproject.impl.ColumnImpl
	 * @see chartitproject.impl.ChartitprojectPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chartitproject.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartitproject.impl.ConditionImpl
	 * @see chartitproject.impl.ChartitprojectPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__RIGHT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__LEFT_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chartitproject.impl.ChartImpl <em>Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartitproject.impl.ChartImpl
	 * @see chartitproject.impl.ChartitprojectPackageImpl#getChart()
	 * @generated
	 */
	int CHART = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__TYPE = 1;

	/**
	 * The feature id for the '<em><b>XVariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__XVARIABLE = 2;

	/**
	 * The feature id for the '<em><b>YVariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__YVARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__FILTER = 4;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chartitproject.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartitproject.impl.ConstantImpl
	 * @see chartitproject.impl.ChartitprojectPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 5;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chartitproject.impl.IntVariableImpl <em>Int Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartitproject.impl.IntVariableImpl
	 * @see chartitproject.impl.ChartitprojectPackageImpl#getIntVariable()
	 * @generated
	 */
	int INT_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VARIABLE__INITIAL_VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VARIABLE_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VARIABLE_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chartitproject.impl.StringVariableImpl <em>String Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartitproject.impl.StringVariableImpl
	 * @see chartitproject.impl.ChartitprojectPackageImpl#getStringVariable()
	 * @generated
	 */
	int STRING_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE__INITIAL_VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chartitproject.impl.DoubleVariableImpl <em>Double Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartitproject.impl.DoubleVariableImpl
	 * @see chartitproject.impl.ChartitprojectPackageImpl#getDoubleVariable()
	 * @generated
	 */
	int DOUBLE_VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VARIABLE__INITIAL_VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VARIABLE_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VARIABLE_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chartitproject.impl.ColumnRefImpl <em>Column Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartitproject.impl.ColumnRefImpl
	 * @see chartitproject.impl.ChartitprojectPackageImpl#getColumnRef()
	 * @generated
	 */
	int COLUMN_REF = 9;

	/**
	 * The feature id for the '<em><b>Make Ref To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REF__MAKE_REF_TO = 0;

	/**
	 * The number of structural features of the '<em>Column Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Column Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chartitproject.ChartType <em>Chart Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartitproject.ChartType
	 * @see chartitproject.impl.ChartitprojectPackageImpl#getChartType()
	 * @generated
	 */
	int CHART_TYPE = 10;

	/**
	 * The meta object id for the '{@link chartitproject.CompOperator <em>Comp Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartitproject.CompOperator
	 * @see chartitproject.impl.ChartitprojectPackageImpl#getCompOperator()
	 * @generated
	 */
	int COMP_OPERATOR = 11;

	/**
	 * The meta object id for the '{@link chartitproject.ColDataType <em>Col Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartitproject.ColDataType
	 * @see chartitproject.impl.ChartitprojectPackageImpl#getColDataType()
	 * @generated
	 */
	int COL_DATA_TYPE = 12;

	/**
	 * Returns the meta object for class '{@link chartitproject.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see chartitproject.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link chartitproject.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chartitproject.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link chartitproject.Program#getChart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chart</em>'.
	 * @see chartitproject.Program#getChart()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Chart();

	/**
	 * Returns the meta object for the containment reference '{@link chartitproject.Program#getCsvFile <em>Csv File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Csv File</em>'.
	 * @see chartitproject.Program#getCsvFile()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_CsvFile();

	/**
	 * Returns the meta object for class '{@link chartitproject.DataFile <em>Data File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data File</em>'.
	 * @see chartitproject.DataFile
	 * @generated
	 */
	EClass getDataFile();

	/**
	 * Returns the meta object for the attribute '{@link chartitproject.DataFile#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see chartitproject.DataFile#getFilePath()
	 * @see #getDataFile()
	 * @generated
	 */
	EAttribute getDataFile_FilePath();

	/**
	 * Returns the meta object for the attribute '{@link chartitproject.DataFile#isHasHeader <em>Has Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Header</em>'.
	 * @see chartitproject.DataFile#isHasHeader()
	 * @see #getDataFile()
	 * @generated
	 */
	EAttribute getDataFile_HasHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link chartitproject.DataFile#getUsedColumn <em>Used Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Used Column</em>'.
	 * @see chartitproject.DataFile#getUsedColumn()
	 * @see #getDataFile()
	 * @generated
	 */
	EReference getDataFile_UsedColumn();

	/**
	 * Returns the meta object for the attribute '{@link chartitproject.DataFile#isHasType <em>Has Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Type</em>'.
	 * @see chartitproject.DataFile#isHasType()
	 * @see #getDataFile()
	 * @generated
	 */
	EAttribute getDataFile_HasType();

	/**
	 * Returns the meta object for the attribute '{@link chartitproject.DataFile#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see chartitproject.DataFile#getSeparator()
	 * @see #getDataFile()
	 * @generated
	 */
	EAttribute getDataFile_Separator();

	/**
	 * Returns the meta object for class '{@link chartitproject.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see chartitproject.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link chartitproject.Column#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see chartitproject.Column#getIndex()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Index();

	/**
	 * Returns the meta object for the attribute '{@link chartitproject.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chartitproject.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for class '{@link chartitproject.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see chartitproject.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link chartitproject.Condition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see chartitproject.Condition#getOperator()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link chartitproject.Condition#getRightElement <em>Right Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Element</em>'.
	 * @see chartitproject.Condition#getRightElement()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_RightElement();

	/**
	 * Returns the meta object for the containment reference '{@link chartitproject.Condition#getLeftElement <em>Left Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Element</em>'.
	 * @see chartitproject.Condition#getLeftElement()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_LeftElement();

	/**
	 * Returns the meta object for class '{@link chartitproject.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart</em>'.
	 * @see chartitproject.Chart
	 * @generated
	 */
	EClass getChart();

	/**
	 * Returns the meta object for the attribute '{@link chartitproject.Chart#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see chartitproject.Chart#getTitle()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_Title();

	/**
	 * Returns the meta object for the attribute '{@link chartitproject.Chart#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see chartitproject.Chart#getType()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link chartitproject.Chart#getXVariable <em>XVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>XVariable</em>'.
	 * @see chartitproject.Chart#getXVariable()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_XVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link chartitproject.Chart#getYVariable <em>YVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>YVariable</em>'.
	 * @see chartitproject.Chart#getYVariable()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_YVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link chartitproject.Chart#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see chartitproject.Chart#getFilter()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Filter();

	/**
	 * Returns the meta object for class '{@link chartitproject.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see chartitproject.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link chartitproject.IntVariable <em>Int Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Variable</em>'.
	 * @see chartitproject.IntVariable
	 * @generated
	 */
	EClass getIntVariable();

	/**
	 * Returns the meta object for the attribute '{@link chartitproject.IntVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see chartitproject.IntVariable#getInitialValue()
	 * @see #getIntVariable()
	 * @generated
	 */
	EAttribute getIntVariable_InitialValue();

	/**
	 * Returns the meta object for class '{@link chartitproject.StringVariable <em>String Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Variable</em>'.
	 * @see chartitproject.StringVariable
	 * @generated
	 */
	EClass getStringVariable();

	/**
	 * Returns the meta object for the attribute '{@link chartitproject.StringVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see chartitproject.StringVariable#getInitialValue()
	 * @see #getStringVariable()
	 * @generated
	 */
	EAttribute getStringVariable_InitialValue();

	/**
	 * Returns the meta object for class '{@link chartitproject.DoubleVariable <em>Double Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Variable</em>'.
	 * @see chartitproject.DoubleVariable
	 * @generated
	 */
	EClass getDoubleVariable();

	/**
	 * Returns the meta object for the attribute '{@link chartitproject.DoubleVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see chartitproject.DoubleVariable#getInitialValue()
	 * @see #getDoubleVariable()
	 * @generated
	 */
	EAttribute getDoubleVariable_InitialValue();

	/**
	 * Returns the meta object for class '{@link chartitproject.ColumnRef <em>Column Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Ref</em>'.
	 * @see chartitproject.ColumnRef
	 * @generated
	 */
	EClass getColumnRef();

	/**
	 * Returns the meta object for the reference '{@link chartitproject.ColumnRef#getMakeRefTo <em>Make Ref To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Make Ref To</em>'.
	 * @see chartitproject.ColumnRef#getMakeRefTo()
	 * @see #getColumnRef()
	 * @generated
	 */
	EReference getColumnRef_MakeRefTo();

	/**
	 * Returns the meta object for enum '{@link chartitproject.ChartType <em>Chart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Chart Type</em>'.
	 * @see chartitproject.ChartType
	 * @generated
	 */
	EEnum getChartType();

	/**
	 * Returns the meta object for enum '{@link chartitproject.CompOperator <em>Comp Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comp Operator</em>'.
	 * @see chartitproject.CompOperator
	 * @generated
	 */
	EEnum getCompOperator();

	/**
	 * Returns the meta object for enum '{@link chartitproject.ColDataType <em>Col Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Col Data Type</em>'.
	 * @see chartitproject.ColDataType
	 * @generated
	 */
	EEnum getColDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChartitprojectFactory getChartitprojectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link chartitproject.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartitproject.impl.ProgramImpl
		 * @see chartitproject.impl.ChartitprojectPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Chart</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CHART = eINSTANCE.getProgram_Chart();

		/**
		 * The meta object literal for the '<em><b>Csv File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CSV_FILE = eINSTANCE.getProgram_CsvFile();

		/**
		 * The meta object literal for the '{@link chartitproject.impl.DataFileImpl <em>Data File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartitproject.impl.DataFileImpl
		 * @see chartitproject.impl.ChartitprojectPackageImpl#getDataFile()
		 * @generated
		 */
		EClass DATA_FILE = eINSTANCE.getDataFile();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILE__FILE_PATH = eINSTANCE.getDataFile_FilePath();

		/**
		 * The meta object literal for the '<em><b>Has Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILE__HAS_HEADER = eINSTANCE.getDataFile_HasHeader();

		/**
		 * The meta object literal for the '<em><b>Used Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FILE__USED_COLUMN = eINSTANCE.getDataFile_UsedColumn();

		/**
		 * The meta object literal for the '<em><b>Has Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILE__HAS_TYPE = eINSTANCE.getDataFile_HasType();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILE__SEPARATOR = eINSTANCE.getDataFile_Separator();

		/**
		 * The meta object literal for the '{@link chartitproject.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartitproject.impl.ColumnImpl
		 * @see chartitproject.impl.ChartitprojectPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__INDEX = eINSTANCE.getColumn_Index();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '{@link chartitproject.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartitproject.impl.ConditionImpl
		 * @see chartitproject.impl.ChartitprojectPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__OPERATOR = eINSTANCE.getCondition_Operator();

		/**
		 * The meta object literal for the '<em><b>Right Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__RIGHT_ELEMENT = eINSTANCE.getCondition_RightElement();

		/**
		 * The meta object literal for the '<em><b>Left Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__LEFT_ELEMENT = eINSTANCE.getCondition_LeftElement();

		/**
		 * The meta object literal for the '{@link chartitproject.impl.ChartImpl <em>Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartitproject.impl.ChartImpl
		 * @see chartitproject.impl.ChartitprojectPackageImpl#getChart()
		 * @generated
		 */
		EClass CHART = eINSTANCE.getChart();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__TITLE = eINSTANCE.getChart_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__TYPE = eINSTANCE.getChart_Type();

		/**
		 * The meta object literal for the '<em><b>XVariable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__XVARIABLE = eINSTANCE.getChart_XVariable();

		/**
		 * The meta object literal for the '<em><b>YVariable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__YVARIABLE = eINSTANCE.getChart_YVariable();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__FILTER = eINSTANCE.getChart_Filter();

		/**
		 * The meta object literal for the '{@link chartitproject.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartitproject.impl.ConstantImpl
		 * @see chartitproject.impl.ChartitprojectPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link chartitproject.impl.IntVariableImpl <em>Int Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartitproject.impl.IntVariableImpl
		 * @see chartitproject.impl.ChartitprojectPackageImpl#getIntVariable()
		 * @generated
		 */
		EClass INT_VARIABLE = eINSTANCE.getIntVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_VARIABLE__INITIAL_VALUE = eINSTANCE.getIntVariable_InitialValue();

		/**
		 * The meta object literal for the '{@link chartitproject.impl.StringVariableImpl <em>String Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartitproject.impl.StringVariableImpl
		 * @see chartitproject.impl.ChartitprojectPackageImpl#getStringVariable()
		 * @generated
		 */
		EClass STRING_VARIABLE = eINSTANCE.getStringVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VARIABLE__INITIAL_VALUE = eINSTANCE.getStringVariable_InitialValue();

		/**
		 * The meta object literal for the '{@link chartitproject.impl.DoubleVariableImpl <em>Double Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartitproject.impl.DoubleVariableImpl
		 * @see chartitproject.impl.ChartitprojectPackageImpl#getDoubleVariable()
		 * @generated
		 */
		EClass DOUBLE_VARIABLE = eINSTANCE.getDoubleVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_VARIABLE__INITIAL_VALUE = eINSTANCE.getDoubleVariable_InitialValue();

		/**
		 * The meta object literal for the '{@link chartitproject.impl.ColumnRefImpl <em>Column Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartitproject.impl.ColumnRefImpl
		 * @see chartitproject.impl.ChartitprojectPackageImpl#getColumnRef()
		 * @generated
		 */
		EClass COLUMN_REF = eINSTANCE.getColumnRef();

		/**
		 * The meta object literal for the '<em><b>Make Ref To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_REF__MAKE_REF_TO = eINSTANCE.getColumnRef_MakeRefTo();

		/**
		 * The meta object literal for the '{@link chartitproject.ChartType <em>Chart Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartitproject.ChartType
		 * @see chartitproject.impl.ChartitprojectPackageImpl#getChartType()
		 * @generated
		 */
		EEnum CHART_TYPE = eINSTANCE.getChartType();

		/**
		 * The meta object literal for the '{@link chartitproject.CompOperator <em>Comp Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartitproject.CompOperator
		 * @see chartitproject.impl.ChartitprojectPackageImpl#getCompOperator()
		 * @generated
		 */
		EEnum COMP_OPERATOR = eINSTANCE.getCompOperator();

		/**
		 * The meta object literal for the '{@link chartitproject.ColDataType <em>Col Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartitproject.ColDataType
		 * @see chartitproject.impl.ChartitprojectPackageImpl#getColDataType()
		 * @generated
		 */
		EEnum COL_DATA_TYPE = eINSTANCE.getColDataType();

	}

} //ChartitprojectPackage
