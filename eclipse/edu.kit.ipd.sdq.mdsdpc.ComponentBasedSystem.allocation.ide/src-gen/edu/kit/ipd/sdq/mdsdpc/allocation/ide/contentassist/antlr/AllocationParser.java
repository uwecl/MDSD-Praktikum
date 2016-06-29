/*
 * generated by Xtext 2.9.1
 */
package edu.kit.ipd.sdq.mdsdpc.allocation.ide.contentassist.antlr;

import com.google.inject.Inject;
import edu.kit.ipd.sdq.mdsdpc.allocation.ide.contentassist.antlr.internal.InternalAllocationParser;
import edu.kit.ipd.sdq.mdsdpc.allocation.services.AllocationGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class AllocationParser extends AbstractContentAssistParser {

	@Inject
	private AllocationGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalAllocationParser createParser() {
		InternalAllocationParser result = new InternalAllocationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getComponentAccess().getAlternatives(), "rule__Component__Alternatives");
					put(grammarAccess.getDescriptionElementAccess().getAlternatives(), "rule__DescriptionElement__Alternatives");
					put(grammarAccess.getReturnTypeAccess().getAlternatives(), "rule__ReturnType__Alternatives");
					put(grammarAccess.getParameterTypeAccess().getAlternatives(), "rule__ParameterType__Alternatives");
					put(grammarAccess.getRoleAccess().getAlternatives(), "rule__Role__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getSimpleTypesAccess().getAlternatives(), "rule__SimpleTypes__Alternatives");
					put(grammarAccess.getAllocationAccess().getGroup(), "rule__Allocation__Group__0");
					put(grammarAccess.getAllocationAccess().getGroup_5(), "rule__Allocation__Group_5__0");
					put(grammarAccess.getAllocationContextAccess().getGroup(), "rule__AllocationContext__Group__0");
					put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
					put(grammarAccess.getAssemblyContextAccess().getGroup(), "rule__AssemblyContext__Group__0");
					put(grammarAccess.getComponent_ImplAccess().getGroup(), "rule__Component_Impl__Group__0");
					put(grammarAccess.getComponent_ImplAccess().getGroup_3(), "rule__Component_Impl__Group_3__0");
					put(grammarAccess.getComponent_ImplAccess().getGroup_3_3(), "rule__Component_Impl__Group_3_3__0");
					put(grammarAccess.getComponent_ImplAccess().getGroup_7(), "rule__Component_Impl__Group_7__0");
					put(grammarAccess.getComponent_ImplAccess().getGroup_9(), "rule__Component_Impl__Group_9__0");
					put(grammarAccess.getComponent_ImplAccess().getGroup_9_3(), "rule__Component_Impl__Group_9_3__0");
					put(grammarAccess.getBehaviourDescriptionAccess().getGroup(), "rule__BehaviourDescription__Group__0");
					put(grammarAccess.getBehaviourDescriptionAccess().getGroup_3(), "rule__BehaviourDescription__Group_3__0");
					put(grammarAccess.getBehaviourDescriptionAccess().getGroup_3_3(), "rule__BehaviourDescription__Group_3_3__0");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getServiceAccess().getGroup_5(), "rule__Service__Group_5__0");
					put(grammarAccess.getRequiredRoleAccess().getGroup(), "rule__RequiredRole__Group__0");
					put(grammarAccess.getProvidedRoleAccess().getGroup(), "rule__ProvidedRole__Group__0");
					put(grammarAccess.getCompositeComponentAccess().getGroup(), "rule__CompositeComponent__Group__0");
					put(grammarAccess.getCompositeComponentAccess().getGroup_3(), "rule__CompositeComponent__Group_3__0");
					put(grammarAccess.getCompositeComponentAccess().getGroup_3_3(), "rule__CompositeComponent__Group_3_3__0");
					put(grammarAccess.getCompositeComponentAccess().getGroup_7(), "rule__CompositeComponent__Group_7__0");
					put(grammarAccess.getCompositeComponentAccess().getGroup_9(), "rule__CompositeComponent__Group_9__0");
					put(grammarAccess.getCompositeComponentAccess().getGroup_9_3(), "rule__CompositeComponent__Group_9_3__0");
					put(grammarAccess.getCompositeComponentAccess().getGroup_15(), "rule__CompositeComponent__Group_15__0");
					put(grammarAccess.getCompositeComponentAccess().getGroup_20(), "rule__CompositeComponent__Group_20__0");
					put(grammarAccess.getDescriptionElement_ImplAccess().getGroup(), "rule__DescriptionElement_Impl__Group__0");
					put(grammarAccess.getInternalActionAccess().getGroup(), "rule__InternalAction__Group__0");
					put(grammarAccess.getExternalCallAccess().getGroup(), "rule__ExternalCall__Group__0");
					put(grammarAccess.getLoopAccess().getGroup(), "rule__Loop__Group__0");
					put(grammarAccess.getLoopAccess().getGroup_3(), "rule__Loop__Group_3__0");
					put(grammarAccess.getLoopAccess().getGroup_3_3(), "rule__Loop__Group_3_3__0");
					put(grammarAccess.getBranchAccess().getGroup(), "rule__Branch__Group__0");
					put(grammarAccess.getBranchAccess().getGroup_3(), "rule__Branch__Group_3__0");
					put(grammarAccess.getBranchAccess().getGroup_3_3(), "rule__Branch__Group_3_3__0");
					put(grammarAccess.getSignatureAccess().getGroup(), "rule__Signature__Group__0");
					put(grammarAccess.getSignatureAccess().getGroup_5(), "rule__Signature__Group_5__0");
					put(grammarAccess.getSignatureAccess().getGroup_5_3(), "rule__Signature__Group_5_3__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getReturnType_ImplAccess().getGroup(), "rule__ReturnType_Impl__Group__0");
					put(grammarAccess.getParameterType_ImplAccess().getGroup(), "rule__ParameterType_Impl__Group__0");
					put(grammarAccess.getSimpleAccess().getGroup(), "rule__Simple__Group__0");
					put(grammarAccess.getSimpleAccess().getGroup_4(), "rule__Simple__Group_4__0");
					put(grammarAccess.getComplexAccess().getGroup(), "rule__Complex__Group__0");
					put(grammarAccess.getComplexAccess().getGroup_6(), "rule__Complex__Group_6__0");
					put(grammarAccess.getVoidAccess().getGroup(), "rule__Void__Group__0");
					put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
					put(grammarAccess.getInterfaceAccess().getGroup_4(), "rule__Interface__Group_4__0");
					put(grammarAccess.getInterfaceAccess().getGroup_4_3(), "rule__Interface__Group_4_3__0");
					put(grammarAccess.getDelegationConnectorAccess().getGroup(), "rule__DelegationConnector__Group__0");
					put(grammarAccess.getDelegationConnectorAccess().getGroup_6(), "rule__DelegationConnector__Group_6__0");
					put(grammarAccess.getRole_ImplAccess().getGroup(), "rule__Role_Impl__Group__0");
					put(grammarAccess.getAllocationAccess().getAllocationcontextAssignment_4(), "rule__Allocation__AllocationcontextAssignment_4");
					put(grammarAccess.getAllocationAccess().getAllocationcontextAssignment_5_1(), "rule__Allocation__AllocationcontextAssignment_5_1");
					put(grammarAccess.getAllocationContextAccess().getContainerAssignment_3(), "rule__AllocationContext__ContainerAssignment_3");
					put(grammarAccess.getAllocationContextAccess().getAssemblycontextAssignment_5(), "rule__AllocationContext__AssemblycontextAssignment_5");
					put(grammarAccess.getContainerAccess().getNameAssignment_2(), "rule__Container__NameAssignment_2");
					put(grammarAccess.getAssemblyContextAccess().getNameAssignment_1(), "rule__AssemblyContext__NameAssignment_1");
					put(grammarAccess.getAssemblyContextAccess().getComponentAssignment_4(), "rule__AssemblyContext__ComponentAssignment_4");
					put(grammarAccess.getComponent_ImplAccess().getNameAssignment_1(), "rule__Component_Impl__NameAssignment_1");
					put(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionAssignment_3_2(), "rule__Component_Impl__BehaviourdescriptionAssignment_3_2");
					put(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionAssignment_3_3_1(), "rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1");
					put(grammarAccess.getComponent_ImplAccess().getServiceAssignment_6(), "rule__Component_Impl__ServiceAssignment_6");
					put(grammarAccess.getComponent_ImplAccess().getServiceAssignment_7_1(), "rule__Component_Impl__ServiceAssignment_7_1");
					put(grammarAccess.getComponent_ImplAccess().getRequiredroleAssignment_9_2(), "rule__Component_Impl__RequiredroleAssignment_9_2");
					put(grammarAccess.getComponent_ImplAccess().getRequiredroleAssignment_9_3_1(), "rule__Component_Impl__RequiredroleAssignment_9_3_1");
					put(grammarAccess.getComponent_ImplAccess().getProvidedroleAssignment_11(), "rule__Component_Impl__ProvidedroleAssignment_11");
					put(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementAssignment_3_2(), "rule__BehaviourDescription__DescriptionelementAssignment_3_2");
					put(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementAssignment_3_3_1(), "rule__BehaviourDescription__DescriptionelementAssignment_3_3_1");
					put(grammarAccess.getServiceAccess().getCorrespondingSignaturesAssignment_4(), "rule__Service__CorrespondingSignaturesAssignment_4");
					put(grammarAccess.getServiceAccess().getCorrespondingSignaturesAssignment_5_1(), "rule__Service__CorrespondingSignaturesAssignment_5_1");
					put(grammarAccess.getRequiredRoleAccess().getNameAssignment_1(), "rule__RequiredRole__NameAssignment_1");
					put(grammarAccess.getRequiredRoleAccess().getInterfaceAssignment_4(), "rule__RequiredRole__InterfaceAssignment_4");
					put(grammarAccess.getProvidedRoleAccess().getNameAssignment_1(), "rule__ProvidedRole__NameAssignment_1");
					put(grammarAccess.getProvidedRoleAccess().getInterfaceAssignment_4(), "rule__ProvidedRole__InterfaceAssignment_4");
					put(grammarAccess.getCompositeComponentAccess().getNameAssignment_1(), "rule__CompositeComponent__NameAssignment_1");
					put(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionAssignment_3_2(), "rule__CompositeComponent__BehaviourdescriptionAssignment_3_2");
					put(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionAssignment_3_3_1(), "rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1");
					put(grammarAccess.getCompositeComponentAccess().getServiceAssignment_6(), "rule__CompositeComponent__ServiceAssignment_6");
					put(grammarAccess.getCompositeComponentAccess().getServiceAssignment_7_1(), "rule__CompositeComponent__ServiceAssignment_7_1");
					put(grammarAccess.getCompositeComponentAccess().getRequiredroleAssignment_9_2(), "rule__CompositeComponent__RequiredroleAssignment_9_2");
					put(grammarAccess.getCompositeComponentAccess().getRequiredroleAssignment_9_3_1(), "rule__CompositeComponent__RequiredroleAssignment_9_3_1");
					put(grammarAccess.getCompositeComponentAccess().getProvidedroleAssignment_11(), "rule__CompositeComponent__ProvidedroleAssignment_11");
					put(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssignment_14(), "rule__CompositeComponent__AssemblycontextAssignment_14");
					put(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssignment_15_1(), "rule__CompositeComponent__AssemblycontextAssignment_15_1");
					put(grammarAccess.getCompositeComponentAccess().getDelegationconnectorAssignment_19(), "rule__CompositeComponent__DelegationconnectorAssignment_19");
					put(grammarAccess.getCompositeComponentAccess().getDelegationconnectorAssignment_20_1(), "rule__CompositeComponent__DelegationconnectorAssignment_20_1");
					put(grammarAccess.getLoopAccess().getDescriptionelementAssignment_3_2(), "rule__Loop__DescriptionelementAssignment_3_2");
					put(grammarAccess.getLoopAccess().getDescriptionelementAssignment_3_3_1(), "rule__Loop__DescriptionelementAssignment_3_3_1");
					put(grammarAccess.getBranchAccess().getDescriptionelementAssignment_3_2(), "rule__Branch__DescriptionelementAssignment_3_2");
					put(grammarAccess.getBranchAccess().getDescriptionelementAssignment_3_3_1(), "rule__Branch__DescriptionelementAssignment_3_3_1");
					put(grammarAccess.getSignatureAccess().getNameAssignment_1(), "rule__Signature__NameAssignment_1");
					put(grammarAccess.getSignatureAccess().getReturntypeAssignment_4(), "rule__Signature__ReturntypeAssignment_4");
					put(grammarAccess.getSignatureAccess().getParameterAssignment_5_2(), "rule__Signature__ParameterAssignment_5_2");
					put(grammarAccess.getSignatureAccess().getParameterAssignment_5_3_1(), "rule__Signature__ParameterAssignment_5_3_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getParameterAccess().getParametertypeAssignment_4(), "rule__Parameter__ParametertypeAssignment_4");
					put(grammarAccess.getReturnType_ImplAccess().getNameAssignment_2(), "rule__ReturnType_Impl__NameAssignment_2");
					put(grammarAccess.getParameterType_ImplAccess().getNameAssignment_2(), "rule__ParameterType_Impl__NameAssignment_2");
					put(grammarAccess.getSimpleAccess().getNameAssignment_2(), "rule__Simple__NameAssignment_2");
					put(grammarAccess.getSimpleAccess().getKindAssignment_4_1(), "rule__Simple__KindAssignment_4_1");
					put(grammarAccess.getComplexAccess().getNameAssignment_1(), "rule__Complex__NameAssignment_1");
					put(grammarAccess.getComplexAccess().getSimpleAssignment_5(), "rule__Complex__SimpleAssignment_5");
					put(grammarAccess.getComplexAccess().getSimpleAssignment_6_1(), "rule__Complex__SimpleAssignment_6_1");
					put(grammarAccess.getVoidAccess().getNameAssignment_2(), "rule__Void__NameAssignment_2");
					put(grammarAccess.getInterfaceAccess().getNameAssignment_2(), "rule__Interface__NameAssignment_2");
					put(grammarAccess.getInterfaceAccess().getSignatureAssignment_4_2(), "rule__Interface__SignatureAssignment_4_2");
					put(grammarAccess.getInterfaceAccess().getSignatureAssignment_4_3_1(), "rule__Interface__SignatureAssignment_4_3_1");
					put(grammarAccess.getDelegationConnectorAccess().getNameAssignment_1(), "rule__DelegationConnector__NameAssignment_1");
					put(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_5(), "rule__DelegationConnector__RoleAssignment_5");
					put(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_6_1(), "rule__DelegationConnector__RoleAssignment_6_1");
					put(grammarAccess.getRole_ImplAccess().getNameAssignment_1(), "rule__Role_Impl__NameAssignment_1");
					put(grammarAccess.getRole_ImplAccess().getInterfaceAssignment_4(), "rule__Role_Impl__InterfaceAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalAllocationParser typedParser = (InternalAllocationParser) parser;
			typedParser.entryRuleAllocation();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AllocationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AllocationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
