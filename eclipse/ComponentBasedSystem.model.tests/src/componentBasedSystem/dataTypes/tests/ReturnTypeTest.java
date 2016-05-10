/**
 */
package componentBasedSystem.dataTypes.tests;

import componentBasedSystem.dataTypes.DataTypesFactory;
import componentBasedSystem.dataTypes.ReturnType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Return Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReturnTypeTest extends TypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReturnTypeTest.class);
	}

	/**
	 * Constructs a new Return Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Return Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReturnType getFixture() {
		return (ReturnType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataTypesFactory.eINSTANCE.createReturnType());
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

} //ReturnTypeTest
