/**
 */
package componentBasedSystem.roles;

import org.eclipse.emf.ecore.EClass;
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
 * @see componentBasedSystem.roles.RolesFactory
 * @model kind="package"
 * @generated
 */
public interface RolesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "roles";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.mdsdpc.componentBasedSystem/roles";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "roles";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RolesPackage eINSTANCE = componentBasedSystem.roles.impl.RolesPackageImpl.init();

	/**
	 * The meta object id for the '{@link componentBasedSystem.roles.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.roles.impl.RoleImpl
	 * @see componentBasedSystem.roles.impl.RolesPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentBasedSystem.roles.impl.RequiredRoleImpl <em>Required Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.roles.impl.RequiredRoleImpl
	 * @see componentBasedSystem.roles.impl.RolesPackageImpl#getRequiredRole()
	 * @generated
	 */
	int REQUIRED_ROLE = 1;

	/**
	 * The number of structural features of the '<em>Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentBasedSystem.roles.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.roles.impl.ProvidedRoleImpl
	 * @see componentBasedSystem.roles.impl.RolesPackageImpl#getProvidedRole()
	 * @generated
	 */
	int PROVIDED_ROLE = 2;

	/**
	 * The number of structural features of the '<em>Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentBasedSystem.roles.impl.AssemblyConnectorImpl <em>Assembly Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentBasedSystem.roles.impl.AssemblyConnectorImpl
	 * @see componentBasedSystem.roles.impl.RolesPackageImpl#getAssemblyConnector()
	 * @generated
	 */
	int ASSEMBLY_CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__PROVIDEDROLE = 0;

	/**
	 * The feature id for the '<em><b>Requiredrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__REQUIREDROLE = 1;

	/**
	 * The number of structural features of the '<em>Assembly Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assembly Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link componentBasedSystem.roles.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see componentBasedSystem.roles.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link componentBasedSystem.roles.RequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Role</em>'.
	 * @see componentBasedSystem.roles.RequiredRole
	 * @generated
	 */
	EClass getRequiredRole();

	/**
	 * Returns the meta object for class '{@link componentBasedSystem.roles.ProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Role</em>'.
	 * @see componentBasedSystem.roles.ProvidedRole
	 * @generated
	 */
	EClass getProvidedRole();

	/**
	 * Returns the meta object for class '{@link componentBasedSystem.roles.AssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Connector</em>'.
	 * @see componentBasedSystem.roles.AssemblyConnector
	 * @generated
	 */
	EClass getAssemblyConnector();

	/**
	 * Returns the meta object for the reference '{@link componentBasedSystem.roles.AssemblyConnector#getProvidedrole <em>Providedrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providedrole</em>'.
	 * @see componentBasedSystem.roles.AssemblyConnector#getProvidedrole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_Providedrole();

	/**
	 * Returns the meta object for the reference '{@link componentBasedSystem.roles.AssemblyConnector#getRequiredrole <em>Requiredrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requiredrole</em>'.
	 * @see componentBasedSystem.roles.AssemblyConnector#getRequiredrole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_Requiredrole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RolesFactory getRolesFactory();

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
		 * The meta object literal for the '{@link componentBasedSystem.roles.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.roles.impl.RoleImpl
		 * @see componentBasedSystem.roles.impl.RolesPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link componentBasedSystem.roles.impl.RequiredRoleImpl <em>Required Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.roles.impl.RequiredRoleImpl
		 * @see componentBasedSystem.roles.impl.RolesPackageImpl#getRequiredRole()
		 * @generated
		 */
		EClass REQUIRED_ROLE = eINSTANCE.getRequiredRole();

		/**
		 * The meta object literal for the '{@link componentBasedSystem.roles.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.roles.impl.ProvidedRoleImpl
		 * @see componentBasedSystem.roles.impl.RolesPackageImpl#getProvidedRole()
		 * @generated
		 */
		EClass PROVIDED_ROLE = eINSTANCE.getProvidedRole();

		/**
		 * The meta object literal for the '{@link componentBasedSystem.roles.impl.AssemblyConnectorImpl <em>Assembly Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentBasedSystem.roles.impl.AssemblyConnectorImpl
		 * @see componentBasedSystem.roles.impl.RolesPackageImpl#getAssemblyConnector()
		 * @generated
		 */
		EClass ASSEMBLY_CONNECTOR = eINSTANCE.getAssemblyConnector();

		/**
		 * The meta object literal for the '<em><b>Providedrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__PROVIDEDROLE = eINSTANCE.getAssemblyConnector_Providedrole();

		/**
		 * The meta object literal for the '<em><b>Requiredrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__REQUIREDROLE = eINSTANCE.getAssemblyConnector_Requiredrole();

	}

} //RolesPackage
