/**
 */
package chartitproject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chartitproject.Program#getName <em>Name</em>}</li>
 *   <li>{@link chartitproject.Program#getChart <em>Chart</em>}</li>
 *   <li>{@link chartitproject.Program#getCsvFile <em>Csv File</em>}</li>
 * </ul>
 *
 * @see chartitproject.ChartitprojectPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see chartitproject.ChartitprojectPackage#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chartitproject.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Chart</b></em>' containment reference list.
	 * The list contents are of type {@link chartitproject.Chart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart</em>' containment reference list.
	 * @see chartitproject.ChartitprojectPackage#getProgram_Chart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Chart> getChart();

	/**
	 * Returns the value of the '<em><b>Csv File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csv File</em>' containment reference.
	 * @see #setCsvFile(DataFile)
	 * @see chartitproject.ChartitprojectPackage#getProgram_CsvFile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataFile getCsvFile();

	/**
	 * Sets the value of the '{@link chartitproject.Program#getCsvFile <em>Csv File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csv File</em>' containment reference.
	 * @see #getCsvFile()
	 * @generated
	 */
	void setCsvFile(DataFile value);

} // Program
