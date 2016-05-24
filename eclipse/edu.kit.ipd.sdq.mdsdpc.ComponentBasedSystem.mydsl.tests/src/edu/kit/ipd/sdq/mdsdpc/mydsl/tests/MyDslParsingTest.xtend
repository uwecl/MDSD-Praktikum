/*
 * generated by Xtext 2.9.2
 */
package edu.kit.ipd.sdq.mdsdpc.mydsl.tests

import com.google.inject.Inject
import componentBasedSystem.ComponentBasedSystem
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(MyDslInjectorProvider)
class MyDslParsingTest{

	@Inject
	ParseHelper<ComponentBasedSystem> parseHelper;

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
