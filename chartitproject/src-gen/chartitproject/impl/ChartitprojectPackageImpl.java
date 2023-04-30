/**
 */
package chartitproject.impl;

import chartitproject.Chart;
import chartitproject.ChartType;
import chartitproject.ChartitprojectFactory;
import chartitproject.ChartitprojectPackage;
import chartitproject.ColDataType;
import chartitproject.Column;
import chartitproject.ColumnRef;
import chartitproject.CompOperator;
import chartitproject.Condition;
import chartitproject.Constant;
import chartitproject.DataFile;
import chartitproject.DoubleVariable;
import chartitproject.IntVariable;
import chartitproject.Program;
import chartitproject.StringVariable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChartitprojectPackageImpl extends EPackageImpl implements ChartitprojectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chartTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colDataTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see chartitproject.ChartitprojectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChartitprojectPackageImpl() {
		super(eNS_URI, ChartitprojectFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ChartitprojectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ChartitprojectPackage init() {
		if (isInited)
			return (ChartitprojectPackage) EPackage.Registry.INSTANCE.getEPackage(ChartitprojectPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredChartitprojectPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ChartitprojectPackageImpl theChartitprojectPackage = registeredChartitprojectPackage instanceof ChartitprojectPackageImpl
				? (ChartitprojectPackageImpl) registeredChartitprojectPackage
				: new ChartitprojectPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theChartitprojectPackage.createPackageContents();

		// Initialize created meta-data
		theChartitprojectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChartitprojectPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChartitprojectPackage.eNS_URI, theChartitprojectPackage);
		return theChartitprojectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgram_Name() {
		return (EAttribute) programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Chart() {
		return (EReference) programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_CsvFile() {
		return (EReference) programEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFile() {
		return dataFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFile_FilePath() {
		return (EAttribute) dataFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFile_HasHeader() {
		return (EAttribute) dataFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFile_UsedColumn() {
		return (EReference) dataFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFile_HasType() {
		return (EAttribute) dataFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFile_Separator() {
		return (EAttribute) dataFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Index() {
		return (EAttribute) columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Name() {
		return (EAttribute) columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Operator() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_RightElement() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_LeftElement() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChart() {
		return chartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChart_Title() {
		return (EAttribute) chartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChart_Type() {
		return (EAttribute) chartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChart_XVariable() {
		return (EReference) chartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChart_YVariable() {
		return (EReference) chartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChart_Filter() {
		return (EReference) chartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntVariable() {
		return intVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntVariable_InitialValue() {
		return (EAttribute) intVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringVariable() {
		return stringVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringVariable_InitialValue() {
		return (EAttribute) stringVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleVariable() {
		return doubleVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleVariable_InitialValue() {
		return (EAttribute) doubleVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnRef() {
		return columnRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnRef_MakeRefTo() {
		return (EReference) columnRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChartType() {
		return chartTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompOperator() {
		return compOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColDataType() {
		return colDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartitprojectFactory getChartitprojectFactory() {
		return (ChartitprojectFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		programEClass = createEClass(PROGRAM);
		createEAttribute(programEClass, PROGRAM__NAME);
		createEReference(programEClass, PROGRAM__CHART);
		createEReference(programEClass, PROGRAM__CSV_FILE);

		dataFileEClass = createEClass(DATA_FILE);
		createEAttribute(dataFileEClass, DATA_FILE__FILE_PATH);
		createEAttribute(dataFileEClass, DATA_FILE__HAS_HEADER);
		createEReference(dataFileEClass, DATA_FILE__USED_COLUMN);
		createEAttribute(dataFileEClass, DATA_FILE__HAS_TYPE);
		createEAttribute(dataFileEClass, DATA_FILE__SEPARATOR);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__INDEX);
		createEAttribute(columnEClass, COLUMN__NAME);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__OPERATOR);
		createEReference(conditionEClass, CONDITION__RIGHT_ELEMENT);
		createEReference(conditionEClass, CONDITION__LEFT_ELEMENT);

		chartEClass = createEClass(CHART);
		createEAttribute(chartEClass, CHART__TITLE);
		createEAttribute(chartEClass, CHART__TYPE);
		createEReference(chartEClass, CHART__XVARIABLE);
		createEReference(chartEClass, CHART__YVARIABLE);
		createEReference(chartEClass, CHART__FILTER);

		constantEClass = createEClass(CONSTANT);

		intVariableEClass = createEClass(INT_VARIABLE);
		createEAttribute(intVariableEClass, INT_VARIABLE__INITIAL_VALUE);

		stringVariableEClass = createEClass(STRING_VARIABLE);
		createEAttribute(stringVariableEClass, STRING_VARIABLE__INITIAL_VALUE);

		doubleVariableEClass = createEClass(DOUBLE_VARIABLE);
		createEAttribute(doubleVariableEClass, DOUBLE_VARIABLE__INITIAL_VALUE);

		columnRefEClass = createEClass(COLUMN_REF);
		createEReference(columnRefEClass, COLUMN_REF__MAKE_REF_TO);

		// Create enums
		chartTypeEEnum = createEEnum(CHART_TYPE);
		compOperatorEEnum = createEEnum(COMP_OPERATOR);
		colDataTypeEEnum = createEEnum(COL_DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		intVariableEClass.getESuperTypes().add(this.getConstant());
		stringVariableEClass.getESuperTypes().add(this.getConstant());
		doubleVariableEClass.getESuperTypes().add(this.getConstant());

		// Initialize classes, features, and operations; add parameters
		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Program.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Chart(), this.getChart(), null, "chart", null, 1, -1, Program.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getProgram_CsvFile(), this.getDataFile(), null, "CsvFile", null, 1, 1, Program.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFileEClass, DataFile.class, "DataFile", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataFile_FilePath(), ecorePackage.getEString(), "filePath", null, 0, 1, DataFile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFile_HasHeader(), ecorePackage.getEBoolean(), "hasHeader", "true", 0, 1, DataFile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFile_UsedColumn(), this.getColumn(), null, "UsedColumn", null, 1, -1, DataFile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFile_HasType(), ecorePackage.getEBoolean(), "hasType", "true", 0, 1, DataFile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFile_Separator(), ecorePackage.getEString(), "separator", null, 0, 1, DataFile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_Index(), ecorePackage.getEInt(), "index", null, 0, 1, Column.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, Column.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Operator(), this.getCompOperator(), "operator", null, 0, 1, Condition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_RightElement(), this.getConstant(), null, "rightElement", null, 1, 1,
				Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_LeftElement(), this.getColumnRef(), null, "leftElement", null, 1, 1,
				Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chartEClass, Chart.class, "Chart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChart_Title(), ecorePackage.getEString(), "title", null, 0, 1, Chart.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChart_Type(), this.getChartType(), "type", null, 0, 1, Chart.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChart_XVariable(), this.getColumnRef(), null, "xVariable", null, 0, -1, Chart.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChart_YVariable(), this.getColumnRef(), null, "yVariable", null, 0, -1, Chart.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChart_Filter(), this.getCondition(), null, "Filter", null, 0, -1, Chart.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intVariableEClass, IntVariable.class, "IntVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntVariable_InitialValue(), ecorePackage.getEInt(), "initialValue", null, 0, 1,
				IntVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(stringVariableEClass, StringVariable.class, "StringVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringVariable_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1,
				StringVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(doubleVariableEClass, DoubleVariable.class, "DoubleVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleVariable_InitialValue(), ecorePackage.getEDouble(), "initialValue", null, 0, 1,
				DoubleVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(columnRefEClass, ColumnRef.class, "ColumnRef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumnRef_MakeRefTo(), this.getColumn(), null, "makeRefTo", null, 1, 1, ColumnRef.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(chartTypeEEnum, ChartType.class, "ChartType");
		addEEnumLiteral(chartTypeEEnum, ChartType.BAR);
		addEEnumLiteral(chartTypeEEnum, ChartType.PIE);
		addEEnumLiteral(chartTypeEEnum, ChartType.SCATTER);
		addEEnumLiteral(chartTypeEEnum, ChartType.LINE);
		addEEnumLiteral(chartTypeEEnum, ChartType.MIXED);
		addEEnumLiteral(chartTypeEEnum, ChartType.BUBBLE);
		addEEnumLiteral(chartTypeEEnum, ChartType.RADAR);
		addEEnumLiteral(chartTypeEEnum, ChartType.AREA);
		addEEnumLiteral(chartTypeEEnum, ChartType.DONUT);

		initEEnum(compOperatorEEnum, CompOperator.class, "CompOperator");
		addEEnumLiteral(compOperatorEEnum, CompOperator.EQUAL);
		addEEnumLiteral(compOperatorEEnum, CompOperator.GREATER);
		addEEnumLiteral(compOperatorEEnum, CompOperator.LESS);
		addEEnumLiteral(compOperatorEEnum, CompOperator.NOT_EQUAL);
		addEEnumLiteral(compOperatorEEnum, CompOperator.GREATER_OR_EQUAL);
		addEEnumLiteral(compOperatorEEnum, CompOperator.LESS_OR_EQUAL);

		initEEnum(colDataTypeEEnum, ColDataType.class, "ColDataType");
		addEEnumLiteral(colDataTypeEEnum, ColDataType.STRING);
		addEEnumLiteral(colDataTypeEEnum, ColDataType.INTEGER);
		addEEnumLiteral(colDataTypeEEnum, ColDataType.DOUBLE);

		// Create resource
		createResource(eNS_URI);
	}

} //ChartitprojectPackageImpl
