/*
 * generated by Xtext 2.9.2
 */
package edu.kit.ipd.sdq.mdsdpc.mydsl.ui.tests;

import com.google.inject.Injector;
import edu.kit.ipd.sdq.mdsdpc.ComponentBasedSystem.mydsl.ui.internal.MydslActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class MyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MydslActivator.getInstance().getInjector("edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl");
	}

}