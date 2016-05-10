/**
 */
package componentBasedSystem.tests;

import componentBasedSystem.AssemblyContext;
import componentBasedSystem.ComponentBasedSystemFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assembly Context</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyContextTest extends TestCase {

	/**
	 * The fixture for this Assembly Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyContext fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssemblyContextTest.class);
	}

	/**
	 * Constructs a new Assembly Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContextTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Assembly Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AssemblyContext fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Assembly Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyContext getFixture() {
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
		setFixture(ComponentBasedSystemFactory.eINSTANCE.createAssemblyContext());
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

} //AssemblyContextTest
