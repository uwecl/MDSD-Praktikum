/*
 * generated by Xtext 2.9.1
 */
package edu.kit.ipd.sdq.mdsdpc.system.ui.tests;

import com.google.inject.Injector;
import edu.kit.ipd.sdq.mdsdpc.ComponentBasedSystem.system.ui.internal.SystemActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class SystemUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SystemActivator.getInstance().getInjector("edu.kit.ipd.sdq.mdsdpc.system.System");
	}

}
