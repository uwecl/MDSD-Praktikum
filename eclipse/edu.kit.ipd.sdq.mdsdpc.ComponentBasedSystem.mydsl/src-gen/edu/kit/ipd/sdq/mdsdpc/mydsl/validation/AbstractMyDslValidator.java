/*
 * generated by Xtext 2.9.1
 */
package edu.kit.ipd.sdq.mdsdpc.mydsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMyDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("edu.kit.ipd.sdq.mdsdpc.componentBasedSystem"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("edu.kit.ipd.sdq.mdsdpc.componentBasedSystem/dataTypes"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("edu.kit.ipd.sdq.mdsdpc.componentBasedSystem/behaviourDescription"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("edu.kit.ipd.sdq.mdsdpc.componentBasedSystem/roles"));
		return result;
	}
	
}
