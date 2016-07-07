/**
 */
package componentBasedSystem.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ComponentBasedSystem</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentBasedSystemAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ComponentBasedSystemAllTests("ComponentBasedSystem Tests");
		suite.addTest(ComponentBasedSystemTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentBasedSystemAllTests(String name) {
		super(name);
	}

} //ComponentBasedSystemAllTests
