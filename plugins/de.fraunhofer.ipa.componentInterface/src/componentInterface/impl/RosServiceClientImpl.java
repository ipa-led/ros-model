/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterface;
import componentInterface.ComponentInterfacePackage;
import componentInterface.RosServiceClient;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ros.ServiceClient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Service Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.impl.RosServiceClientImpl#getSrvclient <em>Srvclient</em>}</li>
 *   <li>{@link componentInterface.impl.RosServiceClientImpl#getName <em>Name</em>}</li>
 *   <li>{@link componentInterface.impl.RosServiceClientImpl#getNs <em>Ns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosServiceClientImpl extends MinimalEObjectImpl.Container implements RosServiceClient {
	/**
	 * The cached value of the '{@link #getSrvclient() <em>Srvclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvclient()
	 * @generated
	 * @ordered
	 */
	protected ServiceClient srvclient;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated NOT
	 * @ordered
	 */
	protected static String NAME_EDEFAULT = null;
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
	 * The default value of the '{@link #getNs() <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated NOT
	 * @ordered
	 */
	protected static String NS_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getNs() <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated
	 * @ordered
	 */
	protected String ns = NS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RosServiceClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInterfacePackage.Literals.ROS_SERVICE_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClient getSrvclient() {
		if (srvclient != null && srvclient.eIsProxy()) {
			InternalEObject oldSrvclient = (InternalEObject)srvclient;
			srvclient = (ServiceClient)eResolveProxy(oldSrvclient);
			if (srvclient != oldSrvclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInterfacePackage.ROS_SERVICE_CLIENT__SRVCLIENT, oldSrvclient, srvclient));
			}
		}
		return srvclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClient basicGetSrvclient() {
		return srvclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrvclient(ServiceClient newSrvclient) {
		ServiceClient oldSrvclient = srvclient;
		srvclient = newSrvclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_SERVICE_CLIENT__SRVCLIENT, oldSrvclient, srvclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		/**if (name!=null) {
			if (name.length()>0) {
				return name;
			}if (ns != null && srvclient != null) {
				String composed_name = String.format("/%s/%s", ns.replaceFirst("/",""), srvclient.getName().replaceFirst("/",""));	
				return composed_name.replaceFirst("//","/");
			}else if (srvclient != null) {
				return String.format("/%s", srvclient.getName().replaceFirst("/",""));	
			}else {
				return name;
			}
		}else {
			return name;
		}*/
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_SERVICE_CLIENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getComponentNs() {
		ComponentInterface component = (ComponentInterface) srvclient.eContainer();
		String component_ns = component.getNameSpace();
		if (component_ns.length()>0) {
			return component_ns;
		}else {
			return NS_EDEFAULT;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setDefaultValues() {
		NS_EDEFAULT = getComponentNs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getNs() {
		/**setDefaultValues();
		if (ns.isEmpty()) {
			ns = NS_EDEFAULT;
			return NS_EDEFAULT;
		}else {
			return ns;
		}*/
		return ns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setNs(String newNs) {
		/*setDefaultValues();*/
		String oldNs = ns;
		ns = newNs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_SERVICE_CLIENT__NS, oldNs, ns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__SRVCLIENT:
				if (resolve) return getSrvclient();
				return basicGetSrvclient();
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__NAME:
				return getName();
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__NS:
				return getNs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__SRVCLIENT:
				setSrvclient((ServiceClient)newValue);
				return;
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__NAME:
				setName((String)newValue);
				return;
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__NS:
				setNs((String)newValue);
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
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__SRVCLIENT:
				setSrvclient((ServiceClient)null);
				return;
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__NS:
				setNs(NS_EDEFAULT);
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
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__SRVCLIENT:
				return srvclient != null;
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__NS:
				return NS_EDEFAULT == null ? ns != null : !NS_EDEFAULT.equals(ns);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", ns: ");
		result.append(ns);
		result.append(')');
		return result.toString();
	}

} //RosServiceClientImpl
