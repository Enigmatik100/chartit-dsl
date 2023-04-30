/**
 */
package chartitproject.impl;

import chartitproject.ChartitprojectPackage;
import chartitproject.Column;
import chartitproject.DataFile;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chartitproject.impl.DataFileImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link chartitproject.impl.DataFileImpl#isHasHeader <em>Has Header</em>}</li>
 *   <li>{@link chartitproject.impl.DataFileImpl#getUsedColumn <em>Used Column</em>}</li>
 *   <li>{@link chartitproject.impl.DataFileImpl#isHasType <em>Has Type</em>}</li>
 *   <li>{@link chartitproject.impl.DataFileImpl#getSeparator <em>Separator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFileImpl extends MinimalEObjectImpl.Container implements DataFile {
	/**
	 * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected String filePath = FILE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasHeader() <em>Has Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_HEADER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHasHeader() <em>Has Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasHeader()
	 * @generated
	 * @ordered
	 */
	protected boolean hasHeader = HAS_HEADER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsedColumn() <em>Used Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> usedColumn;

	/**
	 * The default value of the '{@link #isHasType() <em>Has Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TYPE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHasType() <em>Has Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasType()
	 * @generated
	 * @ordered
	 */
	protected boolean hasType = HAS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected String separator = SEPARATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartitprojectPackage.Literals.DATA_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilePath(String newFilePath) {
		String oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartitprojectPackage.DATA_FILE__FILE_PATH,
					oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasHeader() {
		return hasHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasHeader(boolean newHasHeader) {
		boolean oldHasHeader = hasHeader;
		hasHeader = newHasHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartitprojectPackage.DATA_FILE__HAS_HEADER,
					oldHasHeader, hasHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getUsedColumn() {
		if (usedColumn == null) {
			usedColumn = new EObjectContainmentEList<Column>(Column.class, this,
					ChartitprojectPackage.DATA_FILE__USED_COLUMN);
		}
		return usedColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasType() {
		return hasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasType(boolean newHasType) {
		boolean oldHasType = hasType;
		hasType = newHasType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartitprojectPackage.DATA_FILE__HAS_TYPE, oldHasType,
					hasType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparator(String newSeparator) {
		String oldSeparator = separator;
		separator = newSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartitprojectPackage.DATA_FILE__SEPARATOR,
					oldSeparator, separator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChartitprojectPackage.DATA_FILE__USED_COLUMN:
			return ((InternalEList<?>) getUsedColumn()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChartitprojectPackage.DATA_FILE__FILE_PATH:
			return getFilePath();
		case ChartitprojectPackage.DATA_FILE__HAS_HEADER:
			return isHasHeader();
		case ChartitprojectPackage.DATA_FILE__USED_COLUMN:
			return getUsedColumn();
		case ChartitprojectPackage.DATA_FILE__HAS_TYPE:
			return isHasType();
		case ChartitprojectPackage.DATA_FILE__SEPARATOR:
			return getSeparator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ChartitprojectPackage.DATA_FILE__FILE_PATH:
			setFilePath((String) newValue);
			return;
		case ChartitprojectPackage.DATA_FILE__HAS_HEADER:
			setHasHeader((Boolean) newValue);
			return;
		case ChartitprojectPackage.DATA_FILE__USED_COLUMN:
			getUsedColumn().clear();
			getUsedColumn().addAll((Collection<? extends Column>) newValue);
			return;
		case ChartitprojectPackage.DATA_FILE__HAS_TYPE:
			setHasType((Boolean) newValue);
			return;
		case ChartitprojectPackage.DATA_FILE__SEPARATOR:
			setSeparator((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ChartitprojectPackage.DATA_FILE__FILE_PATH:
			setFilePath(FILE_PATH_EDEFAULT);
			return;
		case ChartitprojectPackage.DATA_FILE__HAS_HEADER:
			setHasHeader(HAS_HEADER_EDEFAULT);
			return;
		case ChartitprojectPackage.DATA_FILE__USED_COLUMN:
			getUsedColumn().clear();
			return;
		case ChartitprojectPackage.DATA_FILE__HAS_TYPE:
			setHasType(HAS_TYPE_EDEFAULT);
			return;
		case ChartitprojectPackage.DATA_FILE__SEPARATOR:
			setSeparator(SEPARATOR_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ChartitprojectPackage.DATA_FILE__FILE_PATH:
			return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
		case ChartitprojectPackage.DATA_FILE__HAS_HEADER:
			return hasHeader != HAS_HEADER_EDEFAULT;
		case ChartitprojectPackage.DATA_FILE__USED_COLUMN:
			return usedColumn != null && !usedColumn.isEmpty();
		case ChartitprojectPackage.DATA_FILE__HAS_TYPE:
			return hasType != HAS_TYPE_EDEFAULT;
		case ChartitprojectPackage.DATA_FILE__SEPARATOR:
			return SEPARATOR_EDEFAULT == null ? separator != null : !SEPARATOR_EDEFAULT.equals(separator);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (filePath: ");
		result.append(filePath);
		result.append(", hasHeader: ");
		result.append(hasHeader);
		result.append(", hasType: ");
		result.append(hasType);
		result.append(", separator: ");
		result.append(separator);
		result.append(')');
		return result.toString();
	}

} //DataFileImpl
