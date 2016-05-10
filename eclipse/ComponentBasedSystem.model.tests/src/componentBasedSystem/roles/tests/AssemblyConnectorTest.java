/**
 */
package componentBasedSystem.roles.tests;

import componentBasedSystem.roles.AssemblyConnector;
import componentBasedSystem.roles.RolesFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyConnectorTest extends TestCase {

	/**
	 * The fixture for this Assembly Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnector fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssemblyConnectorTest.class);
	}

	/**
	 * Constructs a new Assembly Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnectorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Assembly Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AssemblyConnector fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Assembly Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnector getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RolesFactory.eINSTANCE.createAssemblyConnector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AssemblyConnectorTest
