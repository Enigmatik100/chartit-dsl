/**
 */
package chartitproject.impl;

import chartitproject.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChartitprojectFactoryImpl extends EFactoryImpl implements ChartitprojectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChartitprojectFactory init() {
		try {
			ChartitprojectFactory theChartitprojectFactory = (ChartitprojectFactory) EPackage.Registry.INSTANCE
					.getEFactory(ChartitprojectPackage.eNS_URI);
			if (theChartitprojectFactory != null) {
				return theChartitprojectFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChartitprojectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartitprojectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ChartitprojectPackage.PROGRAM:
			return createProgram();
		case ChartitprojectPackage.DATA_FILE:
			return createDataFile();
		case ChartitprojectPackage.COLUMN:
			return createColumn();
		case ChartitprojectPackage.CONDITION:
			return createCondition();
		case ChartitprojectPackage.CHART:
			return createChart();
		case ChartitprojectPackage.INT_VARIABLE:
			return createIntVariable();
		case ChartitprojectPackage.STRING_VARIABLE:
			return createStringVariable();
		case ChartitprojectPackage.DOUBLE_VARIABLE:
			return createDoubleVariable();
		case ChartitprojectPackage.COLUMN_REF:
			return createColumnRef();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ChartitprojectPackage.CHART_TYPE:
			return createChartTypeFromString(eDataType, initialValue);
		case ChartitprojectPackage.COMP_OPERATOR:
			return createCompOperatorFromString(eDataType, initialValue);
		case ChartitprojectPackage.COL_DATA_TYPE:
			return createColDataTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ChartitprojectPackage.CHART_TYPE:
			return convertChartTypeToString(eDataType, instanceValue);
		case ChartitprojectPackage.COMP_OPERATOR:
			return convertCompOperatorToString(eDataType, instanceValue);
		case ChartitprojectPackage.COL_DATA_TYPE:
			return convertColDataTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFile createDataFile() {
		DataFileImpl dataFile = new DataFileImpl();
		return dataFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chart createChart() {
		ChartImpl chart = new ChartImpl();
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntVariable createIntVariable() {
		IntVariableImpl intVariable = new IntVariableImpl();
		return intVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringVariable createStringVariable() {
		StringVariableImpl stringVariable = new StringVariableImpl();
		return stringVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleVariable createDoubleVariable() {
		DoubleVariableImpl doubleVariable = new DoubleVariableImpl();
		return doubleVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnRef createColumnRef() {
		ColumnRefImpl columnRef = new ColumnRefImpl();
		return columnRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartType createChartTypeFromString(EDataType eDataType, String initialValue) {
		ChartType result = ChartType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChartTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompOperator createCompOperatorFromString(EDataType eDataType, String initialValue) {
		CompOperator result = CompOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColDataType createColDataTypeFromString(EDataType eDataType, String initialValue) {
		ColDataType result = ColDataType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartitprojectPackage getChartitprojectPackage() {
		return (ChartitprojectPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChartitprojectPackage getPackage() {
		return ChartitprojectPackage.eINSTANCE;
	}

} //ChartitprojectFactoryImpl
