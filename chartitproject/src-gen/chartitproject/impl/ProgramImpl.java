/**
 */
package chartitproject.impl;

import chartitproject.Chart;
import chartitproject.ChartitprojectPackage;
import chartitproject.DataFile;
import chartitproject.Program;

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
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chartitproject.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link chartitproject.impl.ProgramImpl#getChart <em>Chart</em>}</li>
 *   <li>{@link chartitproject.impl.ProgramImpl#getCsvFile <em>Csv File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChart() <em>Chart</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChart()
	 * @generated
	 * @ordered
	 */
	protected EList<Chart> chart;

	/**
	 * The cached value of the '{@link #getCsvFile() <em>Csv File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsvFile()
	 * @generated
	 * @ordered
	 */
	protected DataFile csvFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartitprojectPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartitprojectPackage.PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chart> getChart() {
		if (chart == null) {
			chart = new EObjectContainmentEList<Chart>(Chart.class, this, ChartitprojectPackage.PROGRAM__CHART);
		}
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFile getCsvFile() {
		return csvFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsvFile(DataFile newCsvFile, NotificationChain msgs) {
		DataFile oldCsvFile = csvFile;
		csvFile = newCsvFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ChartitprojectPackage.PROGRAM__CSV_FILE, oldCsvFile, newCsvFile);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsvFile(DataFile newCsvFile) {
		if (newCsvFile != csvFile) {
			NotificationChain msgs = null;
			if (csvFile != null)
				msgs = ((InternalEObject) csvFile).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ChartitprojectPackage.PROGRAM__CSV_FILE, null, msgs);
			if (newCsvFile != null)
				msgs = ((InternalEObject) newCsvFile).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ChartitprojectPackage.PROGRAM__CSV_FILE, null, msgs);
			msgs = basicSetCsvFile(newCsvFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartitprojectPackage.PROGRAM__CSV_FILE, newCsvFile,
					newCsvFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChartitprojectPackage.PROGRAM__CHART:
			return ((InternalEList<?>) getChart()).basicRemove(otherEnd, msgs);
		case ChartitprojectPackage.PROGRAM__CSV_FILE:
			return basicSetCsvFile(null, msgs);
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
		case ChartitprojectPackage.PROGRAM__NAME:
			return getName();
		case ChartitprojectPackage.PROGRAM__CHART:
			return getChart();
		case ChartitprojectPackage.PROGRAM__CSV_FILE:
			return getCsvFile();
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
		case ChartitprojectPackage.PROGRAM__NAME:
			setName((String) newValue);
			return;
		case ChartitprojectPackage.PROGRAM__CHART:
			getChart().clear();
			getChart().addAll((Collection<? extends Chart>) newValue);
			return;
		case ChartitprojectPackage.PROGRAM__CSV_FILE:
			setCsvFile((DataFile) newValue);
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
		case ChartitprojectPackage.PROGRAM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ChartitprojectPackage.PROGRAM__CHART:
			getChart().clear();
			return;
		case ChartitprojectPackage.PROGRAM__CSV_FILE:
			setCsvFile((DataFile) null);
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
		case ChartitprojectPackage.PROGRAM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ChartitprojectPackage.PROGRAM__CHART:
			return chart != null && !chart.isEmpty();
		case ChartitprojectPackage.PROGRAM__CSV_FILE:
			return csvFile != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
