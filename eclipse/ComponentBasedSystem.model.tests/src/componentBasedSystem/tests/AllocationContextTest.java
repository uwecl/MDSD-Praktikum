/**
 */
package componentBasedSystem.tests;

import componentBasedSystem.AllocationContext;
import componentBasedSystem.ComponentBasedSystemFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Allocation Context</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocationContextTest extends TestCase {

	/**
	 * The fixture for this Allocation Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationContext fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllocationContextTest.class);
	}

	/**
	 * Constructs a new Allocation Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContextTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Allocation Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AllocationContext fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Allocation Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationContext getFixture() {
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
		setFixture(ComponentBasedSystemFactory.eINSTANCE.createAllocationContext());
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

} //AllocationContextTest
