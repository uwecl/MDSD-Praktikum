/*
 * generated by Xtext 2.9.1
 */
package edu.kit.ipd.sdq.mdsdpc.environment.serializer;

import com.google.inject.Inject;
import componentBasedSystem.ComponentBasedSystemPackage;
import componentBasedSystem.Container;
import componentBasedSystem.Environment;
import componentBasedSystem.Link;
import edu.kit.ipd.sdq.mdsdpc.environment.services.EnvironmentGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EnvironmentSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EnvironmentGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ComponentBasedSystemPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentBasedSystemPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case ComponentBasedSystemPackage.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case ComponentBasedSystemPackage.LINK:
				sequence_Link(context, (Link) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Container returns Container
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Container(ISerializationContext context, Container semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentBasedSystemPackage.Literals.CONTAINER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentBasedSystemPackage.Literals.CONTAINER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Environment returns Environment
	 *
	 * Constraint:
	 *     (name=EString (container+=Container container+=Container*)? (link+=Link link+=Link*)?)
	 */
	protected void sequence_Environment(ISerializationContext context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Link returns Link
	 *
	 * Constraint:
	 *     (name=EString container+=[Container|EString] container+=[Container|EString]*)
	 */
	protected void sequence_Link(ISerializationContext context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
