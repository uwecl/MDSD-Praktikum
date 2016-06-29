package cbscodegeneration;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class PivotStandaloneConfiguration {

	public static void init(ResourceSet resourceSet) {

//		initPivotXtextParser();
//		initPivotmetaModel(resourceSet);
//		initPivotDelegates(resourceSet);
//		initPivotOCLStandardLibrary();

	}

	public static void initPivotDelegates(ResourceSet resourceSet) {

		// org.eclipse.ocl.examples.pivot.OCL.initialize(resourceSet);

//		String oclDelegateURI = OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT;
//
//		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
//				new OCLInvocationDelegateFactory.Global());
//
//		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
//				new OCLSettingDelegateFactory.Global());
//
//		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI, new OCLValidationDelegateFactory.Global());
//
//		OCLDelegateDomain.initialize(resourceSet, oclDelegateURI);

	}

	public static void initPivotmetaModel(ResourceSet resourceSet) {
//		UML2Pivot.initialize(resourceSet);
	}

	public static void initPivotOCLStandardLibrary() {
//		OCLstdlib.install();
	}

	public static void initPivotXtextParser() {
//		OCLinEcoreStandaloneSetup.doSetup();
	}

}