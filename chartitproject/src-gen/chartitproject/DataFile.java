/**
 */
package chartitproject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chartitproject.DataFile#getFilePath <em>File Path</em>}</li>
 *   <li>{@link chartitproject.DataFile#isHasHeader <em>Has Header</em>}</li>
 *   <li>{@link chartitproject.DataFile#getUsedColumn <em>Used Column</em>}</li>
 *   <li>{@link chartitproject.DataFile#isHasType <em>Has Type</em>}</li>
 *   <li>{@link chartitproject.DataFile#getSeparator <em>Separator</em>}</li>
 * </ul>
 *
 * @see chartitproject.ChartitprojectPackage#getDataFile()
 * @model
 * @generated
 */
public interface DataFile extends EObject {
	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see chartitproject.ChartitprojectPackage#getDataFile_FilePath()
	 * @model
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '{@link chartitproject.DataFile#getFilePath <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Has Header</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Header</em>' attribute.
	 * @see #setHasHeader(boolean)
	 * @see chartitproject.ChartitprojectPackage#getDataFile_HasHeader()
	 * @model default="true"
	 * @generated
	 */
	boolean isHasHeader();

	/**
	 * Sets the value of the '{@link chartitproject.DataFile#isHasHeader <em>Has Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Header</em>' attribute.
	 * @see #isHasHeader()
	 * @generated
	 */
	void setHasHeader(boolean value);

	/**
	 * Returns the value of the '<em><b>Used Column</b></em>' containment reference list.
	 * The list contents are of type {@link chartitproject.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Column</em>' containment reference list.
	 * @see chartitproject.ChartitprojectPackage#getDataFile_UsedColumn()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Column> getUsedColumn();

	/**
	 * Returns the value of the '<em><b>Has Type</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Type</em>' attribute.
	 * @see #setHasType(boolean)
	 * @see chartitproject.ChartitprojectPackage#getDataFile_HasType()
	 * @model default="true"
	 * @generated
	 */
	boolean isHasType();

	/**
	 * Sets the value of the '{@link chartitproject.DataFile#isHasType <em>Has Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Type</em>' attribute.
	 * @see #isHasType()
	 * @generated
	 */
	void setHasType(boolean value);

	/**
	 * Returns the value of the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator</em>' attribute.
	 * @see #setSeparator(String)
	 * @see chartitproject.ChartitprojectPackage#getDataFile_Separator()
	 * @model
	 * @generated
	 */
	String getSeparator();

	/**
	 * Sets the value of the '{@link chartitproject.DataFile#getSeparator <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' attribute.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(String value);

} // DataFile
