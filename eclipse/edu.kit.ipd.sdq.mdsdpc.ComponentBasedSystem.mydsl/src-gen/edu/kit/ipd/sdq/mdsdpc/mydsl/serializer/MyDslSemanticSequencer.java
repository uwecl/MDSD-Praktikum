/*
 * generated by Xtext 2.9.2
 */
package edu.kit.ipd.sdq.mdsdpc.mydsl.serializer;

import com.google.inject.Inject;
import componentBasedSystem.AssemblyContext;
import componentBasedSystem.Component;
import componentBasedSystem.ComponentBasedSystem;
import componentBasedSystem.ComponentBasedSystemPackage;
import componentBasedSystem.CompositeComponent;
import componentBasedSystem.Container;
import componentBasedSystem.DelegationConnector;
import componentBasedSystem.Environment;
import componentBasedSystem.Interface;
import componentBasedSystem.Link;
import componentBasedSystem.Service;
import componentBasedSystem.Signature;
import componentBasedSystem.behaviourDescription.BehaviourDescription;
import componentBasedSystem.behaviourDescription.BehaviourDescriptionPackage;
import componentBasedSystem.behaviourDescription.Branch;
import componentBasedSystem.behaviourDescription.ExternalCall;
import componentBasedSystem.behaviourDescription.InternalAction;
import componentBasedSystem.behaviourDescription.Loop;
import componentBasedSystem.dataTypes.Complex;
import componentBasedSystem.dataTypes.DataTypesPackage;
import componentBasedSystem.dataTypes.ParameterType;
import componentBasedSystem.dataTypes.ReturnType;
import componentBasedSystem.dataTypes.Simple;
import componentBasedSystem.dataTypes.Type;
import componentBasedSystem.roles.AssemblyConnector;
import componentBasedSystem.roles.ProvidedRole;
import componentBasedSystem.roles.RequiredRole;
import componentBasedSystem.roles.Role;
import componentBasedSystem.roles.RolesPackage;
import edu.kit.ipd.sdq.mdsdpc.mydsl.services.MyDslGrammarAccess;
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
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BehaviourDescriptionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BehaviourDescriptionPackage.BEHAVIOUR_DESCRIPTION:
				sequence_BehaviourDescription_Impl(context, (BehaviourDescription) semanticObject); 
				return; 
			case BehaviourDescriptionPackage.BRANCH:
				sequence_Branch(context, (Branch) semanticObject); 
				return; 
			case BehaviourDescriptionPackage.EXTERNAL_CALL:
				sequence_ExternalCall(context, (ExternalCall) semanticObject); 
				return; 
			case BehaviourDescriptionPackage.INTERNAL_ACTION:
				sequence_InternalAction(context, (InternalAction) semanticObject); 
				return; 
			case BehaviourDescriptionPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			}
		else if (epackage == ComponentBasedSystemPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentBasedSystemPackage.ASSEMBLY_CONTEXT:
				sequence_AssemblyContext(context, (AssemblyContext) semanticObject); 
				return; 
			case ComponentBasedSystemPackage.COMPONENT:
				sequence_Component_Impl(context, (Component) semanticObject); 
				return; 
			case ComponentBasedSystemPackage.COMPONENT_BASED_SYSTEM:
				sequence_ComponentBasedSystem(context, (ComponentBasedSystem) semanticObject); 
				return; 
			case ComponentBasedSystemPackage.COMPOSITE_COMPONENT:
				sequence_CompositeComponent(context, (CompositeComponent) semanticObject); 
				return; 
			case ComponentBasedSystemPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case ComponentBasedSystemPackage.DELEGATION_CONNECTOR:
				sequence_DelegationConnector(context, (DelegationConnector) semanticObject); 
				return; 
			case ComponentBasedSystemPackage.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case ComponentBasedSystemPackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case ComponentBasedSystemPackage.LINK:
				sequence_Link(context, (Link) semanticObject); 
				return; 
			case ComponentBasedSystemPackage.PARAMETER:
				sequence_Parameter(context, (componentBasedSystem.Parameter) semanticObject); 
				return; 
			case ComponentBasedSystemPackage.SERVICE:
				sequence_Service(context, (Service) semanticObject); 
				return; 
			case ComponentBasedSystemPackage.SIGNATURE:
				sequence_Signature(context, (Signature) semanticObject); 
				return; 
			}
		else if (epackage == DataTypesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DataTypesPackage.COMPLEX:
				sequence_Complex(context, (Complex) semanticObject); 
				return; 
			case DataTypesPackage.PARAMETER_TYPE:
				sequence_ParameterType_Impl(context, (ParameterType) semanticObject); 
				return; 
			case DataTypesPackage.RETURN_TYPE:
				sequence_ReturnType_Impl(context, (ReturnType) semanticObject); 
				return; 
			case DataTypesPackage.SIMPLE:
				sequence_Simple(context, (Simple) semanticObject); 
				return; 
			case DataTypesPackage.TYPE:
				sequence_Type_Impl(context, (Type) semanticObject); 
				return; 
			case DataTypesPackage.VOID:
				sequence_Void(context, (componentBasedSystem.dataTypes.Void) semanticObject); 
				return; 
			}
		else if (epackage == RolesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RolesPackage.ASSEMBLY_CONNECTOR:
				sequence_AssemblyConnector(context, (AssemblyConnector) semanticObject); 
				return; 
			case RolesPackage.PROVIDED_ROLE:
				sequence_ProvidedRole(context, (ProvidedRole) semanticObject); 
				return; 
			case RolesPackage.REQUIRED_ROLE:
				sequence_RequiredRole(context, (RequiredRole) semanticObject); 
				return; 
			case RolesPackage.ROLE:
				sequence_Role_Impl(context, (Role) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AssemblyConnector returns AssemblyConnector
	 *
	 * Constraint:
	 *     (name=EString providedrole=[ProvidedRole|EString] requiredrole=[RequiredRole|EString])
	 */
	protected void sequence_AssemblyConnector(ISerializationContext context, AssemblyConnector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RolesPackage.Literals.ASSEMBLY_CONNECTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RolesPackage.Literals.ASSEMBLY_CONNECTOR__NAME));
			if (transientValues.isValueTransient(semanticObject, RolesPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDEDROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RolesPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDEDROLE));
			if (transientValues.isValueTransient(semanticObject, RolesPackage.Literals.ASSEMBLY_CONNECTOR__REQUIREDROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RolesPackage.Literals.ASSEMBLY_CONNECTOR__REQUIREDROLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getProvidedroleProvidedRoleEStringParserRuleCall_4_0_1(), semanticObject.getProvidedrole());
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getRequiredroleRequiredRoleEStringParserRuleCall_6_0_1(), semanticObject.getRequiredrole());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AssemblyContext returns AssemblyContext
	 *
	 * Constraint:
	 *     (name=EString component=[Component|EString])
	 */
	protected void sequence_AssemblyContext(ISerializationContext context, AssemblyContext semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentBasedSystemPackage.Literals.ASSEMBLY_CONTEXT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentBasedSystemPackage.Literals.ASSEMBLY_CONTEXT__NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentBasedSystemPackage.Literals.ASSEMBLY_CONTEXT__COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentBasedSystemPackage.Literals.ASSEMBLY_CONTEXT__COMPONENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssemblyContextAccess().getComponentComponentEStringParserRuleCall_4_0_1(), semanticObject.getComponent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BehaviourDescription returns BehaviourDescription
	 *     BehaviourDescription_Impl returns BehaviourDescription
	 *
	 * Constraint:
	 *     {BehaviourDescription}
	 */
	protected void sequence_BehaviourDescription_Impl(ISerializationContext context, BehaviourDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BehaviourDescription returns Branch
	 *     Branch returns Branch
	 *
	 * Constraint:
	 *     {Branch}
	 */
	protected void sequence_Branch(ISerializationContext context, Branch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Complex
	 *     ReturnType returns Complex
	 *     ParameterType returns Complex
	 *     Complex returns Complex
	 *
	 * Constraint:
	 *     (name=EString simple+=Simple simple+=Simple*)
	 */
	protected void sequence_Complex(ISerializationContext context, Complex semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentBasedSystem returns ComponentBasedSystem
	 *
	 * Constraint:
	 *     (
	 *         interface+=[Interface|EString] 
	 *         interface+=[Interface|EString]* 
	 *         environment=[Environment|EString] 
	 *         (assemblycontext+=AssemblyContext assemblycontext+=AssemblyContext*)? 
	 *         (type+=Type type+=Type*)? 
	 *         (assemblyconnector+=AssemblyConnector assemblyconnector+=AssemblyConnector*)?
	 *     )
	 */
	protected void sequence_ComponentBasedSystem(ISerializationContext context, ComponentBasedSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Component returns Component
	 *     Component_Impl returns Component
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (behaviourdescription+=BehaviourDescription behaviourdescription+=BehaviourDescription*)? 
	 *         service+=Service 
	 *         service+=Service* 
	 *         (requiredrole+=RequiredRole requiredrole+=RequiredRole*)? 
	 *         providedrole=ProvidedRole
	 *     )
	 */
	protected void sequence_Component_Impl(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Component returns CompositeComponent
	 *     CompositeComponent returns CompositeComponent
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (behaviourdescription+=BehaviourDescription behaviourdescription+=BehaviourDescription*)? 
	 *         service+=Service 
	 *         service+=Service* 
	 *         (requiredrole+=RequiredRole requiredrole+=RequiredRole*)? 
	 *         providedrole=ProvidedRole 
	 *         assemblycontext+=AssemblyContext 
	 *         assemblycontext+=AssemblyContext* 
	 *         delegationconnector+=DelegationConnector 
	 *         delegationconnector+=DelegationConnector*
	 *     )
	 */
	protected void sequence_CompositeComponent(ISerializationContext context, CompositeComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     DelegationConnector returns DelegationConnector
	 *
	 * Constraint:
	 *     (name=EString role+=[Role|EString] role+=[Role|EString]*)
	 */
	protected void sequence_DelegationConnector(ISerializationContext context, DelegationConnector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Environment returns Environment
	 *
	 * Constraint:
	 *     ((container+=Container container+=Container*)? (link+=Link link+=Link*)?)
	 */
	protected void sequence_Environment(ISerializationContext context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BehaviourDescription returns ExternalCall
	 *     ExternalCall returns ExternalCall
	 *
	 * Constraint:
	 *     {ExternalCall}
	 */
	protected void sequence_ExternalCall(ISerializationContext context, ExternalCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interface returns Interface
	 *
	 * Constraint:
	 *     (name=EString (signature+=Signature signature+=Signature*)?)
	 */
	protected void sequence_Interface(ISerializationContext context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BehaviourDescription returns InternalAction
	 *     InternalAction returns InternalAction
	 *
	 * Constraint:
	 *     {InternalAction}
	 */
	protected void sequence_InternalAction(ISerializationContext context, InternalAction semanticObject) {
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
	
	
	/**
	 * Contexts:
	 *     BehaviourDescription returns Loop
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     {Loop}
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns ParameterType
	 *     ParameterType returns ParameterType
	 *     ParameterType_Impl returns ParameterType
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ParameterType_Impl(ISerializationContext context, ParameterType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataTypesPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataTypesPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterType_ImplAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (name=EString parametertype=[ParameterType|EString])
	 */
	protected void sequence_Parameter(ISerializationContext context, componentBasedSystem.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentBasedSystemPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentBasedSystemPackage.Literals.PARAMETER__NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentBasedSystemPackage.Literals.PARAMETER__PARAMETERTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentBasedSystemPackage.Literals.PARAMETER__PARAMETERTYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAccess().getParametertypeParameterTypeEStringParserRuleCall_4_0_1(), semanticObject.getParametertype());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Role returns ProvidedRole
	 *     ProvidedRole returns ProvidedRole
	 *
	 * Constraint:
	 *     (name=EString interface=[Interface|EString])
	 */
	protected void sequence_ProvidedRole(ISerializationContext context, ProvidedRole semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RolesPackage.Literals.ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RolesPackage.Literals.ROLE__NAME));
			if (transientValues.isValueTransient(semanticObject, RolesPackage.Literals.ROLE__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RolesPackage.Literals.ROLE__INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1(), semanticObject.getInterface());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Role returns RequiredRole
	 *     RequiredRole returns RequiredRole
	 *
	 * Constraint:
	 *     (name=EString interface=[Interface|EString])
	 */
	protected void sequence_RequiredRole(ISerializationContext context, RequiredRole semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RolesPackage.Literals.ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RolesPackage.Literals.ROLE__NAME));
			if (transientValues.isValueTransient(semanticObject, RolesPackage.Literals.ROLE__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RolesPackage.Literals.ROLE__INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1(), semanticObject.getInterface());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns ReturnType
	 *     ReturnType returns ReturnType
	 *     ReturnType_Impl returns ReturnType
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ReturnType_Impl(ISerializationContext context, ReturnType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataTypesPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataTypesPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReturnType_ImplAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Role returns Role
	 *     Role_Impl returns Role
	 *
	 * Constraint:
	 *     (name=EString interface=[Interface|EString])
	 */
	protected void sequence_Role_Impl(ISerializationContext context, Role semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RolesPackage.Literals.ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RolesPackage.Literals.ROLE__NAME));
			if (transientValues.isValueTransient(semanticObject, RolesPackage.Literals.ROLE__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RolesPackage.Literals.ROLE__INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRole_ImplAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1(), semanticObject.getInterface());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Service returns Service
	 *
	 * Constraint:
	 *     (correspondingSignatures+=[Signature|EString] correspondingSignatures+=[Signature|EString]*)
	 */
	protected void sequence_Service(ISerializationContext context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Signature returns Signature
	 *
	 * Constraint:
	 *     (name=EString returntype=[ReturnType|EString] (parameter+=Parameter parameter+=Parameter*)?)
	 */
	protected void sequence_Signature(ISerializationContext context, Signature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Simple
	 *     ReturnType returns Simple
	 *     ParameterType returns Simple
	 *     Simple returns Simple
	 *
	 * Constraint:
	 *     (name=EString kind=simpleTypes?)
	 */
	protected void sequence_Simple(ISerializationContext context, Simple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *     Type_Impl returns Type
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Type_Impl(ISerializationContext context, Type semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataTypesPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataTypesPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Void
	 *     ReturnType returns Void
	 *     Void returns Void
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Void(ISerializationContext context, componentBasedSystem.dataTypes.Void semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataTypesPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataTypesPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVoidAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}