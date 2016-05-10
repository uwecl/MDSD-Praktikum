/**
 */
package componentBasedSystem.dataTypes.tests;

import componentBasedSystem.dataTypes.DataTypesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Void</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VoidTest extends ReturnTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VoidTest.class);
	}

	/**
	 * Constructs a new Void test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoidTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Void test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected componentBasedSystem.dataTypes.Void getFixture() {
		return (componentBasedSystem.dataTypes.Void)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataTypesFactory.eINSTANCE.createVoid());
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

} //VoidTest
