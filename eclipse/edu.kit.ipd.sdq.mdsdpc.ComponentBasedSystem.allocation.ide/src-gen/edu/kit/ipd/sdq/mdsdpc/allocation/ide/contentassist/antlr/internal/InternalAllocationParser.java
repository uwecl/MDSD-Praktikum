package edu.kit.ipd.sdq.mdsdpc.allocation.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import edu.kit.ipd.sdq.mdsdpc.allocation.services.AllocationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAllocationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'boolean'", "'char'", "'date'", "'double'", "'float'", "'list'", "'long'", "'map'", "'string'", "'Allocation'", "'{'", "'allocationcontext'", "'}'", "','", "'AllocationContext'", "'container'", "'assemblycontext'", "'AssemblyContext'", "'component'", "'Component'", "'service'", "'providedrole'", "'behaviourdescription'", "'requiredrole'", "'BehaviourDescription'", "'Service'", "'correspondingSignatures'", "'('", "')'", "'RequiredRole'", "'interface'", "'ProvidedRole'", "'CompositeComponent'", "'delegationconnector'", "'InternalAction'", "'ExternalCall'", "'Loop'", "'Branch'", "'Signature'", "'returntype'", "'parameter'", "'Parameter'", "'parametertype'", "'ReturnType'", "'ParameterType'", "'Simple'", "'kind'", "'Complex'", "'simple'", "'Void'", "'DelegationConnector'", "'role'", "'Role'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAllocationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAllocationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAllocationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAllocation.g"; }


    	private AllocationGrammarAccess grammarAccess;

    	public void setGrammarAccess(AllocationGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAllocation"
    // InternalAllocation.g:53:1: entryRuleAllocation : ruleAllocation EOF ;
    public final void entryRuleAllocation() throws RecognitionException {
        try {
            // InternalAllocation.g:54:1: ( ruleAllocation EOF )
            // InternalAllocation.g:55:1: ruleAllocation EOF
            {
             before(grammarAccess.getAllocationRule()); 
            pushFollow(FOLLOW_1);
            ruleAllocation();

            state._fsp--;

             after(grammarAccess.getAllocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllocation"


    // $ANTLR start "ruleAllocation"
    // InternalAllocation.g:62:1: ruleAllocation : ( ( rule__Allocation__Group__0 ) ) ;
    public final void ruleAllocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:66:2: ( ( ( rule__Allocation__Group__0 ) ) )
            // InternalAllocation.g:67:2: ( ( rule__Allocation__Group__0 ) )
            {
            // InternalAllocation.g:67:2: ( ( rule__Allocation__Group__0 ) )
            // InternalAllocation.g:68:3: ( rule__Allocation__Group__0 )
            {
             before(grammarAccess.getAllocationAccess().getGroup()); 
            // InternalAllocation.g:69:3: ( rule__Allocation__Group__0 )
            // InternalAllocation.g:69:4: rule__Allocation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllocation"


    // $ANTLR start "entryRuleBehaviourDescription"
    // InternalAllocation.g:78:1: entryRuleBehaviourDescription : ruleBehaviourDescription EOF ;
    public final void entryRuleBehaviourDescription() throws RecognitionException {
        try {
            // InternalAllocation.g:79:1: ( ruleBehaviourDescription EOF )
            // InternalAllocation.g:80:1: ruleBehaviourDescription EOF
            {
             before(grammarAccess.getBehaviourDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleBehaviourDescription();

            state._fsp--;

             after(grammarAccess.getBehaviourDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBehaviourDescription"


    // $ANTLR start "ruleBehaviourDescription"
    // InternalAllocation.g:87:1: ruleBehaviourDescription : ( ( rule__BehaviourDescription__Alternatives ) ) ;
    public final void ruleBehaviourDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:91:2: ( ( ( rule__BehaviourDescription__Alternatives ) ) )
            // InternalAllocation.g:92:2: ( ( rule__BehaviourDescription__Alternatives ) )
            {
            // InternalAllocation.g:92:2: ( ( rule__BehaviourDescription__Alternatives ) )
            // InternalAllocation.g:93:3: ( rule__BehaviourDescription__Alternatives )
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getAlternatives()); 
            // InternalAllocation.g:94:3: ( rule__BehaviourDescription__Alternatives )
            // InternalAllocation.g:94:4: rule__BehaviourDescription__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourDescriptionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviourDescription"


    // $ANTLR start "entryRuleAllocationContext"
    // InternalAllocation.g:103:1: entryRuleAllocationContext : ruleAllocationContext EOF ;
    public final void entryRuleAllocationContext() throws RecognitionException {
        try {
            // InternalAllocation.g:104:1: ( ruleAllocationContext EOF )
            // InternalAllocation.g:105:1: ruleAllocationContext EOF
            {
             before(grammarAccess.getAllocationContextRule()); 
            pushFollow(FOLLOW_1);
            ruleAllocationContext();

            state._fsp--;

             after(grammarAccess.getAllocationContextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllocationContext"


    // $ANTLR start "ruleAllocationContext"
    // InternalAllocation.g:112:1: ruleAllocationContext : ( ( rule__AllocationContext__Group__0 ) ) ;
    public final void ruleAllocationContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:116:2: ( ( ( rule__AllocationContext__Group__0 ) ) )
            // InternalAllocation.g:117:2: ( ( rule__AllocationContext__Group__0 ) )
            {
            // InternalAllocation.g:117:2: ( ( rule__AllocationContext__Group__0 ) )
            // InternalAllocation.g:118:3: ( rule__AllocationContext__Group__0 )
            {
             before(grammarAccess.getAllocationContextAccess().getGroup()); 
            // InternalAllocation.g:119:3: ( rule__AllocationContext__Group__0 )
            // InternalAllocation.g:119:4: rule__AllocationContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllocationContext"


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalAllocation.g:128:1: entryRuleAssemblyContext : ruleAssemblyContext EOF ;
    public final void entryRuleAssemblyContext() throws RecognitionException {
        try {
            // InternalAllocation.g:129:1: ( ruleAssemblyContext EOF )
            // InternalAllocation.g:130:1: ruleAssemblyContext EOF
            {
             before(grammarAccess.getAssemblyContextRule()); 
            pushFollow(FOLLOW_1);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getAssemblyContextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssemblyContext"


    // $ANTLR start "ruleAssemblyContext"
    // InternalAllocation.g:137:1: ruleAssemblyContext : ( ( rule__AssemblyContext__Group__0 ) ) ;
    public final void ruleAssemblyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:141:2: ( ( ( rule__AssemblyContext__Group__0 ) ) )
            // InternalAllocation.g:142:2: ( ( rule__AssemblyContext__Group__0 ) )
            {
            // InternalAllocation.g:142:2: ( ( rule__AssemblyContext__Group__0 ) )
            // InternalAllocation.g:143:3: ( rule__AssemblyContext__Group__0 )
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup()); 
            // InternalAllocation.g:144:3: ( rule__AssemblyContext__Group__0 )
            // InternalAllocation.g:144:4: rule__AssemblyContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssemblyContext"


    // $ANTLR start "entryRuleEString"
    // InternalAllocation.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAllocation.g:154:1: ( ruleEString EOF )
            // InternalAllocation.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAllocation.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAllocation.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalAllocation.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalAllocation.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalAllocation.g:169:3: ( rule__EString__Alternatives )
            // InternalAllocation.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleComponent_Impl"
    // InternalAllocation.g:178:1: entryRuleComponent_Impl : ruleComponent_Impl EOF ;
    public final void entryRuleComponent_Impl() throws RecognitionException {
        try {
            // InternalAllocation.g:179:1: ( ruleComponent_Impl EOF )
            // InternalAllocation.g:180:1: ruleComponent_Impl EOF
            {
             before(grammarAccess.getComponent_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent_Impl();

            state._fsp--;

             after(grammarAccess.getComponent_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent_Impl"


    // $ANTLR start "ruleComponent_Impl"
    // InternalAllocation.g:187:1: ruleComponent_Impl : ( ( rule__Component_Impl__Group__0 ) ) ;
    public final void ruleComponent_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:191:2: ( ( ( rule__Component_Impl__Group__0 ) ) )
            // InternalAllocation.g:192:2: ( ( rule__Component_Impl__Group__0 ) )
            {
            // InternalAllocation.g:192:2: ( ( rule__Component_Impl__Group__0 ) )
            // InternalAllocation.g:193:3: ( rule__Component_Impl__Group__0 )
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup()); 
            // InternalAllocation.g:194:3: ( rule__Component_Impl__Group__0 )
            // InternalAllocation.g:194:4: rule__Component_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent_Impl"


    // $ANTLR start "entryRuleBehaviourDescription_Impl"
    // InternalAllocation.g:203:1: entryRuleBehaviourDescription_Impl : ruleBehaviourDescription_Impl EOF ;
    public final void entryRuleBehaviourDescription_Impl() throws RecognitionException {
        try {
            // InternalAllocation.g:204:1: ( ruleBehaviourDescription_Impl EOF )
            // InternalAllocation.g:205:1: ruleBehaviourDescription_Impl EOF
            {
             before(grammarAccess.getBehaviourDescription_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleBehaviourDescription_Impl();

            state._fsp--;

             after(grammarAccess.getBehaviourDescription_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBehaviourDescription_Impl"


    // $ANTLR start "ruleBehaviourDescription_Impl"
    // InternalAllocation.g:212:1: ruleBehaviourDescription_Impl : ( ( rule__BehaviourDescription_Impl__Group__0 ) ) ;
    public final void ruleBehaviourDescription_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:216:2: ( ( ( rule__BehaviourDescription_Impl__Group__0 ) ) )
            // InternalAllocation.g:217:2: ( ( rule__BehaviourDescription_Impl__Group__0 ) )
            {
            // InternalAllocation.g:217:2: ( ( rule__BehaviourDescription_Impl__Group__0 ) )
            // InternalAllocation.g:218:3: ( rule__BehaviourDescription_Impl__Group__0 )
            {
             before(grammarAccess.getBehaviourDescription_ImplAccess().getGroup()); 
            // InternalAllocation.g:219:3: ( rule__BehaviourDescription_Impl__Group__0 )
            // InternalAllocation.g:219:4: rule__BehaviourDescription_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourDescription_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviourDescription_Impl"


    // $ANTLR start "entryRuleService"
    // InternalAllocation.g:228:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalAllocation.g:229:1: ( ruleService EOF )
            // InternalAllocation.g:230:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalAllocation.g:237:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:241:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalAllocation.g:242:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalAllocation.g:242:2: ( ( rule__Service__Group__0 ) )
            // InternalAllocation.g:243:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalAllocation.g:244:3: ( rule__Service__Group__0 )
            // InternalAllocation.g:244:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleRequiredRole"
    // InternalAllocation.g:253:1: entryRuleRequiredRole : ruleRequiredRole EOF ;
    public final void entryRuleRequiredRole() throws RecognitionException {
        try {
            // InternalAllocation.g:254:1: ( ruleRequiredRole EOF )
            // InternalAllocation.g:255:1: ruleRequiredRole EOF
            {
             before(grammarAccess.getRequiredRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRequiredRole();

            state._fsp--;

             after(grammarAccess.getRequiredRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequiredRole"


    // $ANTLR start "ruleRequiredRole"
    // InternalAllocation.g:262:1: ruleRequiredRole : ( ( rule__RequiredRole__Group__0 ) ) ;
    public final void ruleRequiredRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:266:2: ( ( ( rule__RequiredRole__Group__0 ) ) )
            // InternalAllocation.g:267:2: ( ( rule__RequiredRole__Group__0 ) )
            {
            // InternalAllocation.g:267:2: ( ( rule__RequiredRole__Group__0 ) )
            // InternalAllocation.g:268:3: ( rule__RequiredRole__Group__0 )
            {
             before(grammarAccess.getRequiredRoleAccess().getGroup()); 
            // InternalAllocation.g:269:3: ( rule__RequiredRole__Group__0 )
            // InternalAllocation.g:269:4: rule__RequiredRole__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequiredRole"


    // $ANTLR start "entryRuleProvidedRole"
    // InternalAllocation.g:278:1: entryRuleProvidedRole : ruleProvidedRole EOF ;
    public final void entryRuleProvidedRole() throws RecognitionException {
        try {
            // InternalAllocation.g:279:1: ( ruleProvidedRole EOF )
            // InternalAllocation.g:280:1: ruleProvidedRole EOF
            {
             before(grammarAccess.getProvidedRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleProvidedRole();

            state._fsp--;

             after(grammarAccess.getProvidedRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProvidedRole"


    // $ANTLR start "ruleProvidedRole"
    // InternalAllocation.g:287:1: ruleProvidedRole : ( ( rule__ProvidedRole__Group__0 ) ) ;
    public final void ruleProvidedRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:291:2: ( ( ( rule__ProvidedRole__Group__0 ) ) )
            // InternalAllocation.g:292:2: ( ( rule__ProvidedRole__Group__0 ) )
            {
            // InternalAllocation.g:292:2: ( ( rule__ProvidedRole__Group__0 ) )
            // InternalAllocation.g:293:3: ( rule__ProvidedRole__Group__0 )
            {
             before(grammarAccess.getProvidedRoleAccess().getGroup()); 
            // InternalAllocation.g:294:3: ( rule__ProvidedRole__Group__0 )
            // InternalAllocation.g:294:4: rule__ProvidedRole__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProvidedRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProvidedRole"


    // $ANTLR start "entryRuleCompositeComponent"
    // InternalAllocation.g:303:1: entryRuleCompositeComponent : ruleCompositeComponent EOF ;
    public final void entryRuleCompositeComponent() throws RecognitionException {
        try {
            // InternalAllocation.g:304:1: ( ruleCompositeComponent EOF )
            // InternalAllocation.g:305:1: ruleCompositeComponent EOF
            {
             before(grammarAccess.getCompositeComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeComponent();

            state._fsp--;

             after(grammarAccess.getCompositeComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeComponent"


    // $ANTLR start "ruleCompositeComponent"
    // InternalAllocation.g:312:1: ruleCompositeComponent : ( ( rule__CompositeComponent__Group__0 ) ) ;
    public final void ruleCompositeComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:316:2: ( ( ( rule__CompositeComponent__Group__0 ) ) )
            // InternalAllocation.g:317:2: ( ( rule__CompositeComponent__Group__0 ) )
            {
            // InternalAllocation.g:317:2: ( ( rule__CompositeComponent__Group__0 ) )
            // InternalAllocation.g:318:3: ( rule__CompositeComponent__Group__0 )
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup()); 
            // InternalAllocation.g:319:3: ( rule__CompositeComponent__Group__0 )
            // InternalAllocation.g:319:4: rule__CompositeComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeComponent"


    // $ANTLR start "entryRuleInternalAction"
    // InternalAllocation.g:328:1: entryRuleInternalAction : ruleInternalAction EOF ;
    public final void entryRuleInternalAction() throws RecognitionException {
        try {
            // InternalAllocation.g:329:1: ( ruleInternalAction EOF )
            // InternalAllocation.g:330:1: ruleInternalAction EOF
            {
             before(grammarAccess.getInternalActionRule()); 
            pushFollow(FOLLOW_1);
            ruleInternalAction();

            state._fsp--;

             after(grammarAccess.getInternalActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInternalAction"


    // $ANTLR start "ruleInternalAction"
    // InternalAllocation.g:337:1: ruleInternalAction : ( ( rule__InternalAction__Group__0 ) ) ;
    public final void ruleInternalAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:341:2: ( ( ( rule__InternalAction__Group__0 ) ) )
            // InternalAllocation.g:342:2: ( ( rule__InternalAction__Group__0 ) )
            {
            // InternalAllocation.g:342:2: ( ( rule__InternalAction__Group__0 ) )
            // InternalAllocation.g:343:3: ( rule__InternalAction__Group__0 )
            {
             before(grammarAccess.getInternalActionAccess().getGroup()); 
            // InternalAllocation.g:344:3: ( rule__InternalAction__Group__0 )
            // InternalAllocation.g:344:4: rule__InternalAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InternalAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternalActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternalAction"


    // $ANTLR start "entryRuleExternalCall"
    // InternalAllocation.g:353:1: entryRuleExternalCall : ruleExternalCall EOF ;
    public final void entryRuleExternalCall() throws RecognitionException {
        try {
            // InternalAllocation.g:354:1: ( ruleExternalCall EOF )
            // InternalAllocation.g:355:1: ruleExternalCall EOF
            {
             before(grammarAccess.getExternalCallRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalCall();

            state._fsp--;

             after(grammarAccess.getExternalCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalCall"


    // $ANTLR start "ruleExternalCall"
    // InternalAllocation.g:362:1: ruleExternalCall : ( ( rule__ExternalCall__Group__0 ) ) ;
    public final void ruleExternalCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:366:2: ( ( ( rule__ExternalCall__Group__0 ) ) )
            // InternalAllocation.g:367:2: ( ( rule__ExternalCall__Group__0 ) )
            {
            // InternalAllocation.g:367:2: ( ( rule__ExternalCall__Group__0 ) )
            // InternalAllocation.g:368:3: ( rule__ExternalCall__Group__0 )
            {
             before(grammarAccess.getExternalCallAccess().getGroup()); 
            // InternalAllocation.g:369:3: ( rule__ExternalCall__Group__0 )
            // InternalAllocation.g:369:4: rule__ExternalCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalCall"


    // $ANTLR start "entryRuleLoop"
    // InternalAllocation.g:378:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalAllocation.g:379:1: ( ruleLoop EOF )
            // InternalAllocation.g:380:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalAllocation.g:387:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:391:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalAllocation.g:392:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalAllocation.g:392:2: ( ( rule__Loop__Group__0 ) )
            // InternalAllocation.g:393:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalAllocation.g:394:3: ( rule__Loop__Group__0 )
            // InternalAllocation.g:394:4: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBranch"
    // InternalAllocation.g:403:1: entryRuleBranch : ruleBranch EOF ;
    public final void entryRuleBranch() throws RecognitionException {
        try {
            // InternalAllocation.g:404:1: ( ruleBranch EOF )
            // InternalAllocation.g:405:1: ruleBranch EOF
            {
             before(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            ruleBranch();

            state._fsp--;

             after(grammarAccess.getBranchRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalAllocation.g:412:1: ruleBranch : ( ( rule__Branch__Group__0 ) ) ;
    public final void ruleBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:416:2: ( ( ( rule__Branch__Group__0 ) ) )
            // InternalAllocation.g:417:2: ( ( rule__Branch__Group__0 ) )
            {
            // InternalAllocation.g:417:2: ( ( rule__Branch__Group__0 ) )
            // InternalAllocation.g:418:3: ( rule__Branch__Group__0 )
            {
             before(grammarAccess.getBranchAccess().getGroup()); 
            // InternalAllocation.g:419:3: ( rule__Branch__Group__0 )
            // InternalAllocation.g:419:4: rule__Branch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleSignature"
    // InternalAllocation.g:428:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalAllocation.g:429:1: ( ruleSignature EOF )
            // InternalAllocation.g:430:1: ruleSignature EOF
            {
             before(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getSignatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalAllocation.g:437:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:441:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalAllocation.g:442:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalAllocation.g:442:2: ( ( rule__Signature__Group__0 ) )
            // InternalAllocation.g:443:3: ( rule__Signature__Group__0 )
            {
             before(grammarAccess.getSignatureAccess().getGroup()); 
            // InternalAllocation.g:444:3: ( rule__Signature__Group__0 )
            // InternalAllocation.g:444:4: rule__Signature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleParameter"
    // InternalAllocation.g:453:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalAllocation.g:454:1: ( ruleParameter EOF )
            // InternalAllocation.g:455:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalAllocation.g:462:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:466:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalAllocation.g:467:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalAllocation.g:467:2: ( ( rule__Parameter__Group__0 ) )
            // InternalAllocation.g:468:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalAllocation.g:469:3: ( rule__Parameter__Group__0 )
            // InternalAllocation.g:469:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleReturnType_Impl"
    // InternalAllocation.g:478:1: entryRuleReturnType_Impl : ruleReturnType_Impl EOF ;
    public final void entryRuleReturnType_Impl() throws RecognitionException {
        try {
            // InternalAllocation.g:479:1: ( ruleReturnType_Impl EOF )
            // InternalAllocation.g:480:1: ruleReturnType_Impl EOF
            {
             before(grammarAccess.getReturnType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleReturnType_Impl();

            state._fsp--;

             after(grammarAccess.getReturnType_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturnType_Impl"


    // $ANTLR start "ruleReturnType_Impl"
    // InternalAllocation.g:487:1: ruleReturnType_Impl : ( ( rule__ReturnType_Impl__Group__0 ) ) ;
    public final void ruleReturnType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:491:2: ( ( ( rule__ReturnType_Impl__Group__0 ) ) )
            // InternalAllocation.g:492:2: ( ( rule__ReturnType_Impl__Group__0 ) )
            {
            // InternalAllocation.g:492:2: ( ( rule__ReturnType_Impl__Group__0 ) )
            // InternalAllocation.g:493:3: ( rule__ReturnType_Impl__Group__0 )
            {
             before(grammarAccess.getReturnType_ImplAccess().getGroup()); 
            // InternalAllocation.g:494:3: ( rule__ReturnType_Impl__Group__0 )
            // InternalAllocation.g:494:4: rule__ReturnType_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnType_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnType_Impl"


    // $ANTLR start "entryRuleParameterType_Impl"
    // InternalAllocation.g:503:1: entryRuleParameterType_Impl : ruleParameterType_Impl EOF ;
    public final void entryRuleParameterType_Impl() throws RecognitionException {
        try {
            // InternalAllocation.g:504:1: ( ruleParameterType_Impl EOF )
            // InternalAllocation.g:505:1: ruleParameterType_Impl EOF
            {
             before(grammarAccess.getParameterType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterType_Impl();

            state._fsp--;

             after(grammarAccess.getParameterType_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterType_Impl"


    // $ANTLR start "ruleParameterType_Impl"
    // InternalAllocation.g:512:1: ruleParameterType_Impl : ( ( rule__ParameterType_Impl__Group__0 ) ) ;
    public final void ruleParameterType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:516:2: ( ( ( rule__ParameterType_Impl__Group__0 ) ) )
            // InternalAllocation.g:517:2: ( ( rule__ParameterType_Impl__Group__0 ) )
            {
            // InternalAllocation.g:517:2: ( ( rule__ParameterType_Impl__Group__0 ) )
            // InternalAllocation.g:518:3: ( rule__ParameterType_Impl__Group__0 )
            {
             before(grammarAccess.getParameterType_ImplAccess().getGroup()); 
            // InternalAllocation.g:519:3: ( rule__ParameterType_Impl__Group__0 )
            // InternalAllocation.g:519:4: rule__ParameterType_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterType_Impl"


    // $ANTLR start "entryRuleSimple"
    // InternalAllocation.g:528:1: entryRuleSimple : ruleSimple EOF ;
    public final void entryRuleSimple() throws RecognitionException {
        try {
            // InternalAllocation.g:529:1: ( ruleSimple EOF )
            // InternalAllocation.g:530:1: ruleSimple EOF
            {
             before(grammarAccess.getSimpleRule()); 
            pushFollow(FOLLOW_1);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getSimpleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimple"


    // $ANTLR start "ruleSimple"
    // InternalAllocation.g:537:1: ruleSimple : ( ( rule__Simple__Group__0 ) ) ;
    public final void ruleSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:541:2: ( ( ( rule__Simple__Group__0 ) ) )
            // InternalAllocation.g:542:2: ( ( rule__Simple__Group__0 ) )
            {
            // InternalAllocation.g:542:2: ( ( rule__Simple__Group__0 ) )
            // InternalAllocation.g:543:3: ( rule__Simple__Group__0 )
            {
             before(grammarAccess.getSimpleAccess().getGroup()); 
            // InternalAllocation.g:544:3: ( rule__Simple__Group__0 )
            // InternalAllocation.g:544:4: rule__Simple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleComplex"
    // InternalAllocation.g:553:1: entryRuleComplex : ruleComplex EOF ;
    public final void entryRuleComplex() throws RecognitionException {
        try {
            // InternalAllocation.g:554:1: ( ruleComplex EOF )
            // InternalAllocation.g:555:1: ruleComplex EOF
            {
             before(grammarAccess.getComplexRule()); 
            pushFollow(FOLLOW_1);
            ruleComplex();

            state._fsp--;

             after(grammarAccess.getComplexRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplex"


    // $ANTLR start "ruleComplex"
    // InternalAllocation.g:562:1: ruleComplex : ( ( rule__Complex__Group__0 ) ) ;
    public final void ruleComplex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:566:2: ( ( ( rule__Complex__Group__0 ) ) )
            // InternalAllocation.g:567:2: ( ( rule__Complex__Group__0 ) )
            {
            // InternalAllocation.g:567:2: ( ( rule__Complex__Group__0 ) )
            // InternalAllocation.g:568:3: ( rule__Complex__Group__0 )
            {
             before(grammarAccess.getComplexAccess().getGroup()); 
            // InternalAllocation.g:569:3: ( rule__Complex__Group__0 )
            // InternalAllocation.g:569:4: rule__Complex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Complex__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplex"


    // $ANTLR start "entryRuleVoid"
    // InternalAllocation.g:578:1: entryRuleVoid : ruleVoid EOF ;
    public final void entryRuleVoid() throws RecognitionException {
        try {
            // InternalAllocation.g:579:1: ( ruleVoid EOF )
            // InternalAllocation.g:580:1: ruleVoid EOF
            {
             before(grammarAccess.getVoidRule()); 
            pushFollow(FOLLOW_1);
            ruleVoid();

            state._fsp--;

             after(grammarAccess.getVoidRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVoid"


    // $ANTLR start "ruleVoid"
    // InternalAllocation.g:587:1: ruleVoid : ( ( rule__Void__Group__0 ) ) ;
    public final void ruleVoid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:591:2: ( ( ( rule__Void__Group__0 ) ) )
            // InternalAllocation.g:592:2: ( ( rule__Void__Group__0 ) )
            {
            // InternalAllocation.g:592:2: ( ( rule__Void__Group__0 ) )
            // InternalAllocation.g:593:3: ( rule__Void__Group__0 )
            {
             before(grammarAccess.getVoidAccess().getGroup()); 
            // InternalAllocation.g:594:3: ( rule__Void__Group__0 )
            // InternalAllocation.g:594:4: rule__Void__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Void__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVoidAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVoid"


    // $ANTLR start "entryRuleDelegationConnector"
    // InternalAllocation.g:603:1: entryRuleDelegationConnector : ruleDelegationConnector EOF ;
    public final void entryRuleDelegationConnector() throws RecognitionException {
        try {
            // InternalAllocation.g:604:1: ( ruleDelegationConnector EOF )
            // InternalAllocation.g:605:1: ruleDelegationConnector EOF
            {
             before(grammarAccess.getDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleDelegationConnector();

            state._fsp--;

             after(grammarAccess.getDelegationConnectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDelegationConnector"


    // $ANTLR start "ruleDelegationConnector"
    // InternalAllocation.g:612:1: ruleDelegationConnector : ( ( rule__DelegationConnector__Group__0 ) ) ;
    public final void ruleDelegationConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:616:2: ( ( ( rule__DelegationConnector__Group__0 ) ) )
            // InternalAllocation.g:617:2: ( ( rule__DelegationConnector__Group__0 ) )
            {
            // InternalAllocation.g:617:2: ( ( rule__DelegationConnector__Group__0 ) )
            // InternalAllocation.g:618:3: ( rule__DelegationConnector__Group__0 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getGroup()); 
            // InternalAllocation.g:619:3: ( rule__DelegationConnector__Group__0 )
            // InternalAllocation.g:619:4: rule__DelegationConnector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelegationConnectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelegationConnector"


    // $ANTLR start "entryRuleRole_Impl"
    // InternalAllocation.g:628:1: entryRuleRole_Impl : ruleRole_Impl EOF ;
    public final void entryRuleRole_Impl() throws RecognitionException {
        try {
            // InternalAllocation.g:629:1: ( ruleRole_Impl EOF )
            // InternalAllocation.g:630:1: ruleRole_Impl EOF
            {
             before(grammarAccess.getRole_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleRole_Impl();

            state._fsp--;

             after(grammarAccess.getRole_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole_Impl"


    // $ANTLR start "ruleRole_Impl"
    // InternalAllocation.g:637:1: ruleRole_Impl : ( ( rule__Role_Impl__Group__0 ) ) ;
    public final void ruleRole_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:641:2: ( ( ( rule__Role_Impl__Group__0 ) ) )
            // InternalAllocation.g:642:2: ( ( rule__Role_Impl__Group__0 ) )
            {
            // InternalAllocation.g:642:2: ( ( rule__Role_Impl__Group__0 ) )
            // InternalAllocation.g:643:3: ( rule__Role_Impl__Group__0 )
            {
             before(grammarAccess.getRole_ImplAccess().getGroup()); 
            // InternalAllocation.g:644:3: ( rule__Role_Impl__Group__0 )
            // InternalAllocation.g:644:4: rule__Role_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRole_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole_Impl"


    // $ANTLR start "rulesimpleTypes"
    // InternalAllocation.g:653:1: rulesimpleTypes : ( ( rule__SimpleTypes__Alternatives ) ) ;
    public final void rulesimpleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:657:1: ( ( ( rule__SimpleTypes__Alternatives ) ) )
            // InternalAllocation.g:658:2: ( ( rule__SimpleTypes__Alternatives ) )
            {
            // InternalAllocation.g:658:2: ( ( rule__SimpleTypes__Alternatives ) )
            // InternalAllocation.g:659:3: ( rule__SimpleTypes__Alternatives )
            {
             before(grammarAccess.getSimpleTypesAccess().getAlternatives()); 
            // InternalAllocation.g:660:3: ( rule__SimpleTypes__Alternatives )
            // InternalAllocation.g:660:4: rule__SimpleTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesimpleTypes"


    // $ANTLR start "rule__BehaviourDescription__Alternatives"
    // InternalAllocation.g:668:1: rule__BehaviourDescription__Alternatives : ( ( ruleBehaviourDescription_Impl ) | ( ruleInternalAction ) | ( ruleExternalCall ) | ( ruleLoop ) | ( ruleBranch ) );
    public final void rule__BehaviourDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:672:1: ( ( ruleBehaviourDescription_Impl ) | ( ruleInternalAction ) | ( ruleExternalCall ) | ( ruleLoop ) | ( ruleBranch ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt1=1;
                }
                break;
            case 46:
                {
                alt1=2;
                }
                break;
            case 47:
                {
                alt1=3;
                }
                break;
            case 48:
                {
                alt1=4;
                }
                break;
            case 49:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalAllocation.g:673:2: ( ruleBehaviourDescription_Impl )
                    {
                    // InternalAllocation.g:673:2: ( ruleBehaviourDescription_Impl )
                    // InternalAllocation.g:674:3: ruleBehaviourDescription_Impl
                    {
                     before(grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescription_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBehaviourDescription_Impl();

                    state._fsp--;

                     after(grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescription_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAllocation.g:679:2: ( ruleInternalAction )
                    {
                    // InternalAllocation.g:679:2: ( ruleInternalAction )
                    // InternalAllocation.g:680:3: ruleInternalAction
                    {
                     before(grammarAccess.getBehaviourDescriptionAccess().getInternalActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInternalAction();

                    state._fsp--;

                     after(grammarAccess.getBehaviourDescriptionAccess().getInternalActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAllocation.g:685:2: ( ruleExternalCall )
                    {
                    // InternalAllocation.g:685:2: ( ruleExternalCall )
                    // InternalAllocation.g:686:3: ruleExternalCall
                    {
                     before(grammarAccess.getBehaviourDescriptionAccess().getExternalCallParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalCall();

                    state._fsp--;

                     after(grammarAccess.getBehaviourDescriptionAccess().getExternalCallParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAllocation.g:691:2: ( ruleLoop )
                    {
                    // InternalAllocation.g:691:2: ( ruleLoop )
                    // InternalAllocation.g:692:3: ruleLoop
                    {
                     before(grammarAccess.getBehaviourDescriptionAccess().getLoopParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;

                     after(grammarAccess.getBehaviourDescriptionAccess().getLoopParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAllocation.g:697:2: ( ruleBranch )
                    {
                    // InternalAllocation.g:697:2: ( ruleBranch )
                    // InternalAllocation.g:698:3: ruleBranch
                    {
                     before(grammarAccess.getBehaviourDescriptionAccess().getBranchParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBranch();

                    state._fsp--;

                     after(grammarAccess.getBehaviourDescriptionAccess().getBranchParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalAllocation.g:707:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:711:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAllocation.g:712:2: ( RULE_STRING )
                    {
                    // InternalAllocation.g:712:2: ( RULE_STRING )
                    // InternalAllocation.g:713:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAllocation.g:718:2: ( RULE_ID )
                    {
                    // InternalAllocation.g:718:2: ( RULE_ID )
                    // InternalAllocation.g:719:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__SimpleTypes__Alternatives"
    // InternalAllocation.g:728:1: rule__SimpleTypes__Alternatives : ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'double' ) ) | ( ( 'float' ) ) | ( ( 'list' ) ) | ( ( 'long' ) ) | ( ( 'map' ) ) | ( ( 'string' ) ) );
    public final void rule__SimpleTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:732:1: ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'double' ) ) | ( ( 'float' ) ) | ( ( 'list' ) ) | ( ( 'long' ) ) | ( ( 'map' ) ) | ( ( 'string' ) ) )
            int alt3=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            case 19:
                {
                alt3=9;
                }
                break;
            case 20:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAllocation.g:733:2: ( ( 'int' ) )
                    {
                    // InternalAllocation.g:733:2: ( ( 'int' ) )
                    // InternalAllocation.g:734:3: ( 'int' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0()); 
                    // InternalAllocation.g:735:3: ( 'int' )
                    // InternalAllocation.g:735:4: 'int'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAllocation.g:739:2: ( ( 'boolean' ) )
                    {
                    // InternalAllocation.g:739:2: ( ( 'boolean' ) )
                    // InternalAllocation.g:740:3: ( 'boolean' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1()); 
                    // InternalAllocation.g:741:3: ( 'boolean' )
                    // InternalAllocation.g:741:4: 'boolean'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAllocation.g:745:2: ( ( 'char' ) )
                    {
                    // InternalAllocation.g:745:2: ( ( 'char' ) )
                    // InternalAllocation.g:746:3: ( 'char' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2()); 
                    // InternalAllocation.g:747:3: ( 'char' )
                    // InternalAllocation.g:747:4: 'char'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAllocation.g:751:2: ( ( 'date' ) )
                    {
                    // InternalAllocation.g:751:2: ( ( 'date' ) )
                    // InternalAllocation.g:752:3: ( 'date' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalAllocation.g:753:3: ( 'date' )
                    // InternalAllocation.g:753:4: 'date'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAllocation.g:757:2: ( ( 'double' ) )
                    {
                    // InternalAllocation.g:757:2: ( ( 'double' ) )
                    // InternalAllocation.g:758:3: ( 'double' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // InternalAllocation.g:759:3: ( 'double' )
                    // InternalAllocation.g:759:4: 'double'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAllocation.g:763:2: ( ( 'float' ) )
                    {
                    // InternalAllocation.g:763:2: ( ( 'float' ) )
                    // InternalAllocation.g:764:3: ( 'float' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5()); 
                    // InternalAllocation.g:765:3: ( 'float' )
                    // InternalAllocation.g:765:4: 'float'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAllocation.g:769:2: ( ( 'list' ) )
                    {
                    // InternalAllocation.g:769:2: ( ( 'list' ) )
                    // InternalAllocation.g:770:3: ( 'list' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6()); 
                    // InternalAllocation.g:771:3: ( 'list' )
                    // InternalAllocation.g:771:4: 'list'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAllocation.g:775:2: ( ( 'long' ) )
                    {
                    // InternalAllocation.g:775:2: ( ( 'long' ) )
                    // InternalAllocation.g:776:3: ( 'long' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7()); 
                    // InternalAllocation.g:777:3: ( 'long' )
                    // InternalAllocation.g:777:4: 'long'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalAllocation.g:781:2: ( ( 'map' ) )
                    {
                    // InternalAllocation.g:781:2: ( ( 'map' ) )
                    // InternalAllocation.g:782:3: ( 'map' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8()); 
                    // InternalAllocation.g:783:3: ( 'map' )
                    // InternalAllocation.g:783:4: 'map'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalAllocation.g:787:2: ( ( 'string' ) )
                    {
                    // InternalAllocation.g:787:2: ( ( 'string' ) )
                    // InternalAllocation.g:788:3: ( 'string' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_9()); 
                    // InternalAllocation.g:789:3: ( 'string' )
                    // InternalAllocation.g:789:4: 'string'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypes__Alternatives"


    // $ANTLR start "rule__Allocation__Group__0"
    // InternalAllocation.g:797:1: rule__Allocation__Group__0 : rule__Allocation__Group__0__Impl rule__Allocation__Group__1 ;
    public final void rule__Allocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:801:1: ( rule__Allocation__Group__0__Impl rule__Allocation__Group__1 )
            // InternalAllocation.g:802:2: rule__Allocation__Group__0__Impl rule__Allocation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Allocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__0"


    // $ANTLR start "rule__Allocation__Group__0__Impl"
    // InternalAllocation.g:809:1: rule__Allocation__Group__0__Impl : ( 'Allocation' ) ;
    public final void rule__Allocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:813:1: ( ( 'Allocation' ) )
            // InternalAllocation.g:814:1: ( 'Allocation' )
            {
            // InternalAllocation.g:814:1: ( 'Allocation' )
            // InternalAllocation.g:815:2: 'Allocation'
            {
             before(grammarAccess.getAllocationAccess().getAllocationKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getAllocationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__0__Impl"


    // $ANTLR start "rule__Allocation__Group__1"
    // InternalAllocation.g:824:1: rule__Allocation__Group__1 : rule__Allocation__Group__1__Impl rule__Allocation__Group__2 ;
    public final void rule__Allocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:828:1: ( rule__Allocation__Group__1__Impl rule__Allocation__Group__2 )
            // InternalAllocation.g:829:2: rule__Allocation__Group__1__Impl rule__Allocation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Allocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__1"


    // $ANTLR start "rule__Allocation__Group__1__Impl"
    // InternalAllocation.g:836:1: rule__Allocation__Group__1__Impl : ( '{' ) ;
    public final void rule__Allocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:840:1: ( ( '{' ) )
            // InternalAllocation.g:841:1: ( '{' )
            {
            // InternalAllocation.g:841:1: ( '{' )
            // InternalAllocation.g:842:2: '{'
            {
             before(grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__1__Impl"


    // $ANTLR start "rule__Allocation__Group__2"
    // InternalAllocation.g:851:1: rule__Allocation__Group__2 : rule__Allocation__Group__2__Impl rule__Allocation__Group__3 ;
    public final void rule__Allocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:855:1: ( rule__Allocation__Group__2__Impl rule__Allocation__Group__3 )
            // InternalAllocation.g:856:2: rule__Allocation__Group__2__Impl rule__Allocation__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Allocation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__2"


    // $ANTLR start "rule__Allocation__Group__2__Impl"
    // InternalAllocation.g:863:1: rule__Allocation__Group__2__Impl : ( 'allocationcontext' ) ;
    public final void rule__Allocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:867:1: ( ( 'allocationcontext' ) )
            // InternalAllocation.g:868:1: ( 'allocationcontext' )
            {
            // InternalAllocation.g:868:1: ( 'allocationcontext' )
            // InternalAllocation.g:869:2: 'allocationcontext'
            {
             before(grammarAccess.getAllocationAccess().getAllocationcontextKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getAllocationcontextKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__2__Impl"


    // $ANTLR start "rule__Allocation__Group__3"
    // InternalAllocation.g:878:1: rule__Allocation__Group__3 : rule__Allocation__Group__3__Impl rule__Allocation__Group__4 ;
    public final void rule__Allocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:882:1: ( rule__Allocation__Group__3__Impl rule__Allocation__Group__4 )
            // InternalAllocation.g:883:2: rule__Allocation__Group__3__Impl rule__Allocation__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Allocation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__3"


    // $ANTLR start "rule__Allocation__Group__3__Impl"
    // InternalAllocation.g:890:1: rule__Allocation__Group__3__Impl : ( '{' ) ;
    public final void rule__Allocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:894:1: ( ( '{' ) )
            // InternalAllocation.g:895:1: ( '{' )
            {
            // InternalAllocation.g:895:1: ( '{' )
            // InternalAllocation.g:896:2: '{'
            {
             before(grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__3__Impl"


    // $ANTLR start "rule__Allocation__Group__4"
    // InternalAllocation.g:905:1: rule__Allocation__Group__4 : rule__Allocation__Group__4__Impl rule__Allocation__Group__5 ;
    public final void rule__Allocation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:909:1: ( rule__Allocation__Group__4__Impl rule__Allocation__Group__5 )
            // InternalAllocation.g:910:2: rule__Allocation__Group__4__Impl rule__Allocation__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Allocation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__4"


    // $ANTLR start "rule__Allocation__Group__4__Impl"
    // InternalAllocation.g:917:1: rule__Allocation__Group__4__Impl : ( ( rule__Allocation__AllocationcontextAssignment_4 ) ) ;
    public final void rule__Allocation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:921:1: ( ( ( rule__Allocation__AllocationcontextAssignment_4 ) ) )
            // InternalAllocation.g:922:1: ( ( rule__Allocation__AllocationcontextAssignment_4 ) )
            {
            // InternalAllocation.g:922:1: ( ( rule__Allocation__AllocationcontextAssignment_4 ) )
            // InternalAllocation.g:923:2: ( rule__Allocation__AllocationcontextAssignment_4 )
            {
             before(grammarAccess.getAllocationAccess().getAllocationcontextAssignment_4()); 
            // InternalAllocation.g:924:2: ( rule__Allocation__AllocationcontextAssignment_4 )
            // InternalAllocation.g:924:3: rule__Allocation__AllocationcontextAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__AllocationcontextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAllocationAccess().getAllocationcontextAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__4__Impl"


    // $ANTLR start "rule__Allocation__Group__5"
    // InternalAllocation.g:932:1: rule__Allocation__Group__5 : rule__Allocation__Group__5__Impl rule__Allocation__Group__6 ;
    public final void rule__Allocation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:936:1: ( rule__Allocation__Group__5__Impl rule__Allocation__Group__6 )
            // InternalAllocation.g:937:2: rule__Allocation__Group__5__Impl rule__Allocation__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Allocation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__5"


    // $ANTLR start "rule__Allocation__Group__5__Impl"
    // InternalAllocation.g:944:1: rule__Allocation__Group__5__Impl : ( ( rule__Allocation__Group_5__0 )* ) ;
    public final void rule__Allocation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:948:1: ( ( ( rule__Allocation__Group_5__0 )* ) )
            // InternalAllocation.g:949:1: ( ( rule__Allocation__Group_5__0 )* )
            {
            // InternalAllocation.g:949:1: ( ( rule__Allocation__Group_5__0 )* )
            // InternalAllocation.g:950:2: ( rule__Allocation__Group_5__0 )*
            {
             before(grammarAccess.getAllocationAccess().getGroup_5()); 
            // InternalAllocation.g:951:2: ( rule__Allocation__Group_5__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAllocation.g:951:3: rule__Allocation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Allocation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAllocationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__5__Impl"


    // $ANTLR start "rule__Allocation__Group__6"
    // InternalAllocation.g:959:1: rule__Allocation__Group__6 : rule__Allocation__Group__6__Impl rule__Allocation__Group__7 ;
    public final void rule__Allocation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:963:1: ( rule__Allocation__Group__6__Impl rule__Allocation__Group__7 )
            // InternalAllocation.g:964:2: rule__Allocation__Group__6__Impl rule__Allocation__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Allocation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__6"


    // $ANTLR start "rule__Allocation__Group__6__Impl"
    // InternalAllocation.g:971:1: rule__Allocation__Group__6__Impl : ( '}' ) ;
    public final void rule__Allocation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:975:1: ( ( '}' ) )
            // InternalAllocation.g:976:1: ( '}' )
            {
            // InternalAllocation.g:976:1: ( '}' )
            // InternalAllocation.g:977:2: '}'
            {
             before(grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__6__Impl"


    // $ANTLR start "rule__Allocation__Group__7"
    // InternalAllocation.g:986:1: rule__Allocation__Group__7 : rule__Allocation__Group__7__Impl ;
    public final void rule__Allocation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:990:1: ( rule__Allocation__Group__7__Impl )
            // InternalAllocation.g:991:2: rule__Allocation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__7"


    // $ANTLR start "rule__Allocation__Group__7__Impl"
    // InternalAllocation.g:997:1: rule__Allocation__Group__7__Impl : ( '}' ) ;
    public final void rule__Allocation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1001:1: ( ( '}' ) )
            // InternalAllocation.g:1002:1: ( '}' )
            {
            // InternalAllocation.g:1002:1: ( '}' )
            // InternalAllocation.g:1003:2: '}'
            {
             before(grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__7__Impl"


    // $ANTLR start "rule__Allocation__Group_5__0"
    // InternalAllocation.g:1013:1: rule__Allocation__Group_5__0 : rule__Allocation__Group_5__0__Impl rule__Allocation__Group_5__1 ;
    public final void rule__Allocation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1017:1: ( rule__Allocation__Group_5__0__Impl rule__Allocation__Group_5__1 )
            // InternalAllocation.g:1018:2: rule__Allocation__Group_5__0__Impl rule__Allocation__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Allocation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group_5__0"


    // $ANTLR start "rule__Allocation__Group_5__0__Impl"
    // InternalAllocation.g:1025:1: rule__Allocation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Allocation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1029:1: ( ( ',' ) )
            // InternalAllocation.g:1030:1: ( ',' )
            {
            // InternalAllocation.g:1030:1: ( ',' )
            // InternalAllocation.g:1031:2: ','
            {
             before(grammarAccess.getAllocationAccess().getCommaKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group_5__0__Impl"


    // $ANTLR start "rule__Allocation__Group_5__1"
    // InternalAllocation.g:1040:1: rule__Allocation__Group_5__1 : rule__Allocation__Group_5__1__Impl ;
    public final void rule__Allocation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1044:1: ( rule__Allocation__Group_5__1__Impl )
            // InternalAllocation.g:1045:2: rule__Allocation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group_5__1"


    // $ANTLR start "rule__Allocation__Group_5__1__Impl"
    // InternalAllocation.g:1051:1: rule__Allocation__Group_5__1__Impl : ( ( rule__Allocation__AllocationcontextAssignment_5_1 ) ) ;
    public final void rule__Allocation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1055:1: ( ( ( rule__Allocation__AllocationcontextAssignment_5_1 ) ) )
            // InternalAllocation.g:1056:1: ( ( rule__Allocation__AllocationcontextAssignment_5_1 ) )
            {
            // InternalAllocation.g:1056:1: ( ( rule__Allocation__AllocationcontextAssignment_5_1 ) )
            // InternalAllocation.g:1057:2: ( rule__Allocation__AllocationcontextAssignment_5_1 )
            {
             before(grammarAccess.getAllocationAccess().getAllocationcontextAssignment_5_1()); 
            // InternalAllocation.g:1058:2: ( rule__Allocation__AllocationcontextAssignment_5_1 )
            // InternalAllocation.g:1058:3: rule__Allocation__AllocationcontextAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__AllocationcontextAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAllocationAccess().getAllocationcontextAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group_5__1__Impl"


    // $ANTLR start "rule__AllocationContext__Group__0"
    // InternalAllocation.g:1067:1: rule__AllocationContext__Group__0 : rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 ;
    public final void rule__AllocationContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1071:1: ( rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 )
            // InternalAllocation.g:1072:2: rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AllocationContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__0"


    // $ANTLR start "rule__AllocationContext__Group__0__Impl"
    // InternalAllocation.g:1079:1: rule__AllocationContext__Group__0__Impl : ( 'AllocationContext' ) ;
    public final void rule__AllocationContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1083:1: ( ( 'AllocationContext' ) )
            // InternalAllocation.g:1084:1: ( 'AllocationContext' )
            {
            // InternalAllocation.g:1084:1: ( 'AllocationContext' )
            // InternalAllocation.g:1085:2: 'AllocationContext'
            {
             before(grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__0__Impl"


    // $ANTLR start "rule__AllocationContext__Group__1"
    // InternalAllocation.g:1094:1: rule__AllocationContext__Group__1 : rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 ;
    public final void rule__AllocationContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1098:1: ( rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 )
            // InternalAllocation.g:1099:2: rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__AllocationContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__1"


    // $ANTLR start "rule__AllocationContext__Group__1__Impl"
    // InternalAllocation.g:1106:1: rule__AllocationContext__Group__1__Impl : ( '{' ) ;
    public final void rule__AllocationContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1110:1: ( ( '{' ) )
            // InternalAllocation.g:1111:1: ( '{' )
            {
            // InternalAllocation.g:1111:1: ( '{' )
            // InternalAllocation.g:1112:2: '{'
            {
             before(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__1__Impl"


    // $ANTLR start "rule__AllocationContext__Group__2"
    // InternalAllocation.g:1121:1: rule__AllocationContext__Group__2 : rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 ;
    public final void rule__AllocationContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1125:1: ( rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 )
            // InternalAllocation.g:1126:2: rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__AllocationContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__2"


    // $ANTLR start "rule__AllocationContext__Group__2__Impl"
    // InternalAllocation.g:1133:1: rule__AllocationContext__Group__2__Impl : ( 'container' ) ;
    public final void rule__AllocationContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1137:1: ( ( 'container' ) )
            // InternalAllocation.g:1138:1: ( 'container' )
            {
            // InternalAllocation.g:1138:1: ( 'container' )
            // InternalAllocation.g:1139:2: 'container'
            {
             before(grammarAccess.getAllocationContextAccess().getContainerKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getContainerKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__2__Impl"


    // $ANTLR start "rule__AllocationContext__Group__3"
    // InternalAllocation.g:1148:1: rule__AllocationContext__Group__3 : rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 ;
    public final void rule__AllocationContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1152:1: ( rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 )
            // InternalAllocation.g:1153:2: rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__AllocationContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__3"


    // $ANTLR start "rule__AllocationContext__Group__3__Impl"
    // InternalAllocation.g:1160:1: rule__AllocationContext__Group__3__Impl : ( ( rule__AllocationContext__ContainerAssignment_3 ) ) ;
    public final void rule__AllocationContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1164:1: ( ( ( rule__AllocationContext__ContainerAssignment_3 ) ) )
            // InternalAllocation.g:1165:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            {
            // InternalAllocation.g:1165:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            // InternalAllocation.g:1166:2: ( rule__AllocationContext__ContainerAssignment_3 )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerAssignment_3()); 
            // InternalAllocation.g:1167:2: ( rule__AllocationContext__ContainerAssignment_3 )
            // InternalAllocation.g:1167:3: rule__AllocationContext__ContainerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__ContainerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getContainerAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__3__Impl"


    // $ANTLR start "rule__AllocationContext__Group__4"
    // InternalAllocation.g:1175:1: rule__AllocationContext__Group__4 : rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 ;
    public final void rule__AllocationContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1179:1: ( rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 )
            // InternalAllocation.g:1180:2: rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__AllocationContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__4"


    // $ANTLR start "rule__AllocationContext__Group__4__Impl"
    // InternalAllocation.g:1187:1: rule__AllocationContext__Group__4__Impl : ( 'assemblycontext' ) ;
    public final void rule__AllocationContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1191:1: ( ( 'assemblycontext' ) )
            // InternalAllocation.g:1192:1: ( 'assemblycontext' )
            {
            // InternalAllocation.g:1192:1: ( 'assemblycontext' )
            // InternalAllocation.g:1193:2: 'assemblycontext'
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblycontextKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getAssemblycontextKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__4__Impl"


    // $ANTLR start "rule__AllocationContext__Group__5"
    // InternalAllocation.g:1202:1: rule__AllocationContext__Group__5 : rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 ;
    public final void rule__AllocationContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1206:1: ( rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 )
            // InternalAllocation.g:1207:2: rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__AllocationContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__5"


    // $ANTLR start "rule__AllocationContext__Group__5__Impl"
    // InternalAllocation.g:1214:1: rule__AllocationContext__Group__5__Impl : ( ( rule__AllocationContext__AssemblycontextAssignment_5 ) ) ;
    public final void rule__AllocationContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1218:1: ( ( ( rule__AllocationContext__AssemblycontextAssignment_5 ) ) )
            // InternalAllocation.g:1219:1: ( ( rule__AllocationContext__AssemblycontextAssignment_5 ) )
            {
            // InternalAllocation.g:1219:1: ( ( rule__AllocationContext__AssemblycontextAssignment_5 ) )
            // InternalAllocation.g:1220:2: ( rule__AllocationContext__AssemblycontextAssignment_5 )
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblycontextAssignment_5()); 
            // InternalAllocation.g:1221:2: ( rule__AllocationContext__AssemblycontextAssignment_5 )
            // InternalAllocation.g:1221:3: rule__AllocationContext__AssemblycontextAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__AssemblycontextAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getAssemblycontextAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__5__Impl"


    // $ANTLR start "rule__AllocationContext__Group__6"
    // InternalAllocation.g:1229:1: rule__AllocationContext__Group__6 : rule__AllocationContext__Group__6__Impl ;
    public final void rule__AllocationContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1233:1: ( rule__AllocationContext__Group__6__Impl )
            // InternalAllocation.g:1234:2: rule__AllocationContext__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__6"


    // $ANTLR start "rule__AllocationContext__Group__6__Impl"
    // InternalAllocation.g:1240:1: rule__AllocationContext__Group__6__Impl : ( '}' ) ;
    public final void rule__AllocationContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1244:1: ( ( '}' ) )
            // InternalAllocation.g:1245:1: ( '}' )
            {
            // InternalAllocation.g:1245:1: ( '}' )
            // InternalAllocation.g:1246:2: '}'
            {
             before(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__6__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__0"
    // InternalAllocation.g:1256:1: rule__AssemblyContext__Group__0 : rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 ;
    public final void rule__AssemblyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1260:1: ( rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 )
            // InternalAllocation.g:1261:2: rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AssemblyContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__0"


    // $ANTLR start "rule__AssemblyContext__Group__0__Impl"
    // InternalAllocation.g:1268:1: rule__AssemblyContext__Group__0__Impl : ( 'AssemblyContext' ) ;
    public final void rule__AssemblyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1272:1: ( ( 'AssemblyContext' ) )
            // InternalAllocation.g:1273:1: ( 'AssemblyContext' )
            {
            // InternalAllocation.g:1273:1: ( 'AssemblyContext' )
            // InternalAllocation.g:1274:2: 'AssemblyContext'
            {
             before(grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__1"
    // InternalAllocation.g:1283:1: rule__AssemblyContext__Group__1 : rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 ;
    public final void rule__AssemblyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1287:1: ( rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 )
            // InternalAllocation.g:1288:2: rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AssemblyContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__1"


    // $ANTLR start "rule__AssemblyContext__Group__1__Impl"
    // InternalAllocation.g:1295:1: rule__AssemblyContext__Group__1__Impl : ( ( rule__AssemblyContext__NameAssignment_1 ) ) ;
    public final void rule__AssemblyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1299:1: ( ( ( rule__AssemblyContext__NameAssignment_1 ) ) )
            // InternalAllocation.g:1300:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            {
            // InternalAllocation.g:1300:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            // InternalAllocation.g:1301:2: ( rule__AssemblyContext__NameAssignment_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getNameAssignment_1()); 
            // InternalAllocation.g:1302:2: ( rule__AssemblyContext__NameAssignment_1 )
            // InternalAllocation.g:1302:3: rule__AssemblyContext__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__2"
    // InternalAllocation.g:1310:1: rule__AssemblyContext__Group__2 : rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 ;
    public final void rule__AssemblyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1314:1: ( rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 )
            // InternalAllocation.g:1315:2: rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__AssemblyContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__2"


    // $ANTLR start "rule__AssemblyContext__Group__2__Impl"
    // InternalAllocation.g:1322:1: rule__AssemblyContext__Group__2__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1326:1: ( ( '{' ) )
            // InternalAllocation.g:1327:1: ( '{' )
            {
            // InternalAllocation.g:1327:1: ( '{' )
            // InternalAllocation.g:1328:2: '{'
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__2__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__3"
    // InternalAllocation.g:1337:1: rule__AssemblyContext__Group__3 : rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 ;
    public final void rule__AssemblyContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1341:1: ( rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 )
            // InternalAllocation.g:1342:2: rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__AssemblyContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__3"


    // $ANTLR start "rule__AssemblyContext__Group__3__Impl"
    // InternalAllocation.g:1349:1: rule__AssemblyContext__Group__3__Impl : ( 'component' ) ;
    public final void rule__AssemblyContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1353:1: ( ( 'component' ) )
            // InternalAllocation.g:1354:1: ( 'component' )
            {
            // InternalAllocation.g:1354:1: ( 'component' )
            // InternalAllocation.g:1355:2: 'component'
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getComponentKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__3__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__4"
    // InternalAllocation.g:1364:1: rule__AssemblyContext__Group__4 : rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 ;
    public final void rule__AssemblyContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1368:1: ( rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 )
            // InternalAllocation.g:1369:2: rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__AssemblyContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__4"


    // $ANTLR start "rule__AssemblyContext__Group__4__Impl"
    // InternalAllocation.g:1376:1: rule__AssemblyContext__Group__4__Impl : ( ( rule__AssemblyContext__ComponentAssignment_4 ) ) ;
    public final void rule__AssemblyContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1380:1: ( ( ( rule__AssemblyContext__ComponentAssignment_4 ) ) )
            // InternalAllocation.g:1381:1: ( ( rule__AssemblyContext__ComponentAssignment_4 ) )
            {
            // InternalAllocation.g:1381:1: ( ( rule__AssemblyContext__ComponentAssignment_4 ) )
            // InternalAllocation.g:1382:2: ( rule__AssemblyContext__ComponentAssignment_4 )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentAssignment_4()); 
            // InternalAllocation.g:1383:2: ( rule__AssemblyContext__ComponentAssignment_4 )
            // InternalAllocation.g:1383:3: rule__AssemblyContext__ComponentAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__ComponentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getComponentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__4__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__5"
    // InternalAllocation.g:1391:1: rule__AssemblyContext__Group__5 : rule__AssemblyContext__Group__5__Impl ;
    public final void rule__AssemblyContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1395:1: ( rule__AssemblyContext__Group__5__Impl )
            // InternalAllocation.g:1396:2: rule__AssemblyContext__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__5"


    // $ANTLR start "rule__AssemblyContext__Group__5__Impl"
    // InternalAllocation.g:1402:1: rule__AssemblyContext__Group__5__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1406:1: ( ( '}' ) )
            // InternalAllocation.g:1407:1: ( '}' )
            {
            // InternalAllocation.g:1407:1: ( '}' )
            // InternalAllocation.g:1408:2: '}'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__5__Impl"


    // $ANTLR start "rule__Component_Impl__Group__0"
    // InternalAllocation.g:1418:1: rule__Component_Impl__Group__0 : rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1 ;
    public final void rule__Component_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1422:1: ( rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1 )
            // InternalAllocation.g:1423:2: rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Component_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__0"


    // $ANTLR start "rule__Component_Impl__Group__0__Impl"
    // InternalAllocation.g:1430:1: rule__Component_Impl__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1434:1: ( ( 'Component' ) )
            // InternalAllocation.g:1435:1: ( 'Component' )
            {
            // InternalAllocation.g:1435:1: ( 'Component' )
            // InternalAllocation.g:1436:2: 'Component'
            {
             before(grammarAccess.getComponent_ImplAccess().getComponentKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group__1"
    // InternalAllocation.g:1445:1: rule__Component_Impl__Group__1 : rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2 ;
    public final void rule__Component_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1449:1: ( rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2 )
            // InternalAllocation.g:1450:2: rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Component_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__1"


    // $ANTLR start "rule__Component_Impl__Group__1__Impl"
    // InternalAllocation.g:1457:1: rule__Component_Impl__Group__1__Impl : ( ( rule__Component_Impl__NameAssignment_1 ) ) ;
    public final void rule__Component_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1461:1: ( ( ( rule__Component_Impl__NameAssignment_1 ) ) )
            // InternalAllocation.g:1462:1: ( ( rule__Component_Impl__NameAssignment_1 ) )
            {
            // InternalAllocation.g:1462:1: ( ( rule__Component_Impl__NameAssignment_1 ) )
            // InternalAllocation.g:1463:2: ( rule__Component_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getNameAssignment_1()); 
            // InternalAllocation.g:1464:2: ( rule__Component_Impl__NameAssignment_1 )
            // InternalAllocation.g:1464:3: rule__Component_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group__2"
    // InternalAllocation.g:1472:1: rule__Component_Impl__Group__2 : rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3 ;
    public final void rule__Component_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1476:1: ( rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3 )
            // InternalAllocation.g:1477:2: rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Component_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__2"


    // $ANTLR start "rule__Component_Impl__Group__2__Impl"
    // InternalAllocation.g:1484:1: rule__Component_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1488:1: ( ( '{' ) )
            // InternalAllocation.g:1489:1: ( '{' )
            {
            // InternalAllocation.g:1489:1: ( '{' )
            // InternalAllocation.g:1490:2: '{'
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__2__Impl"


    // $ANTLR start "rule__Component_Impl__Group__3"
    // InternalAllocation.g:1499:1: rule__Component_Impl__Group__3 : rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4 ;
    public final void rule__Component_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1503:1: ( rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4 )
            // InternalAllocation.g:1504:2: rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Component_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__3"


    // $ANTLR start "rule__Component_Impl__Group__3__Impl"
    // InternalAllocation.g:1511:1: rule__Component_Impl__Group__3__Impl : ( ( rule__Component_Impl__Group_3__0 )? ) ;
    public final void rule__Component_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1515:1: ( ( ( rule__Component_Impl__Group_3__0 )? ) )
            // InternalAllocation.g:1516:1: ( ( rule__Component_Impl__Group_3__0 )? )
            {
            // InternalAllocation.g:1516:1: ( ( rule__Component_Impl__Group_3__0 )? )
            // InternalAllocation.g:1517:2: ( rule__Component_Impl__Group_3__0 )?
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_3()); 
            // InternalAllocation.g:1518:2: ( rule__Component_Impl__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAllocation.g:1518:3: rule__Component_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponent_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__3__Impl"


    // $ANTLR start "rule__Component_Impl__Group__4"
    // InternalAllocation.g:1526:1: rule__Component_Impl__Group__4 : rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5 ;
    public final void rule__Component_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1530:1: ( rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5 )
            // InternalAllocation.g:1531:2: rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Component_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__4"


    // $ANTLR start "rule__Component_Impl__Group__4__Impl"
    // InternalAllocation.g:1538:1: rule__Component_Impl__Group__4__Impl : ( 'service' ) ;
    public final void rule__Component_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1542:1: ( ( 'service' ) )
            // InternalAllocation.g:1543:1: ( 'service' )
            {
            // InternalAllocation.g:1543:1: ( 'service' )
            // InternalAllocation.g:1544:2: 'service'
            {
             before(grammarAccess.getComponent_ImplAccess().getServiceKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getServiceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__4__Impl"


    // $ANTLR start "rule__Component_Impl__Group__5"
    // InternalAllocation.g:1553:1: rule__Component_Impl__Group__5 : rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6 ;
    public final void rule__Component_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1557:1: ( rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6 )
            // InternalAllocation.g:1558:2: rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Component_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__5"


    // $ANTLR start "rule__Component_Impl__Group__5__Impl"
    // InternalAllocation.g:1565:1: rule__Component_Impl__Group__5__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1569:1: ( ( '{' ) )
            // InternalAllocation.g:1570:1: ( '{' )
            {
            // InternalAllocation.g:1570:1: ( '{' )
            // InternalAllocation.g:1571:2: '{'
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__5__Impl"


    // $ANTLR start "rule__Component_Impl__Group__6"
    // InternalAllocation.g:1580:1: rule__Component_Impl__Group__6 : rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7 ;
    public final void rule__Component_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1584:1: ( rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7 )
            // InternalAllocation.g:1585:2: rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Component_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__6"


    // $ANTLR start "rule__Component_Impl__Group__6__Impl"
    // InternalAllocation.g:1592:1: rule__Component_Impl__Group__6__Impl : ( ( rule__Component_Impl__ServiceAssignment_6 ) ) ;
    public final void rule__Component_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1596:1: ( ( ( rule__Component_Impl__ServiceAssignment_6 ) ) )
            // InternalAllocation.g:1597:1: ( ( rule__Component_Impl__ServiceAssignment_6 ) )
            {
            // InternalAllocation.g:1597:1: ( ( rule__Component_Impl__ServiceAssignment_6 ) )
            // InternalAllocation.g:1598:2: ( rule__Component_Impl__ServiceAssignment_6 )
            {
             before(grammarAccess.getComponent_ImplAccess().getServiceAssignment_6()); 
            // InternalAllocation.g:1599:2: ( rule__Component_Impl__ServiceAssignment_6 )
            // InternalAllocation.g:1599:3: rule__Component_Impl__ServiceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__ServiceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getServiceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__6__Impl"


    // $ANTLR start "rule__Component_Impl__Group__7"
    // InternalAllocation.g:1607:1: rule__Component_Impl__Group__7 : rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8 ;
    public final void rule__Component_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1611:1: ( rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8 )
            // InternalAllocation.g:1612:2: rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Component_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__7"


    // $ANTLR start "rule__Component_Impl__Group__7__Impl"
    // InternalAllocation.g:1619:1: rule__Component_Impl__Group__7__Impl : ( ( rule__Component_Impl__Group_7__0 )* ) ;
    public final void rule__Component_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1623:1: ( ( ( rule__Component_Impl__Group_7__0 )* ) )
            // InternalAllocation.g:1624:1: ( ( rule__Component_Impl__Group_7__0 )* )
            {
            // InternalAllocation.g:1624:1: ( ( rule__Component_Impl__Group_7__0 )* )
            // InternalAllocation.g:1625:2: ( rule__Component_Impl__Group_7__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_7()); 
            // InternalAllocation.g:1626:2: ( rule__Component_Impl__Group_7__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAllocation.g:1626:3: rule__Component_Impl__Group_7__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Component_Impl__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getComponent_ImplAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__7__Impl"


    // $ANTLR start "rule__Component_Impl__Group__8"
    // InternalAllocation.g:1634:1: rule__Component_Impl__Group__8 : rule__Component_Impl__Group__8__Impl rule__Component_Impl__Group__9 ;
    public final void rule__Component_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1638:1: ( rule__Component_Impl__Group__8__Impl rule__Component_Impl__Group__9 )
            // InternalAllocation.g:1639:2: rule__Component_Impl__Group__8__Impl rule__Component_Impl__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Component_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__8"


    // $ANTLR start "rule__Component_Impl__Group__8__Impl"
    // InternalAllocation.g:1646:1: rule__Component_Impl__Group__8__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1650:1: ( ( '}' ) )
            // InternalAllocation.g:1651:1: ( '}' )
            {
            // InternalAllocation.g:1651:1: ( '}' )
            // InternalAllocation.g:1652:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__8__Impl"


    // $ANTLR start "rule__Component_Impl__Group__9"
    // InternalAllocation.g:1661:1: rule__Component_Impl__Group__9 : rule__Component_Impl__Group__9__Impl rule__Component_Impl__Group__10 ;
    public final void rule__Component_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1665:1: ( rule__Component_Impl__Group__9__Impl rule__Component_Impl__Group__10 )
            // InternalAllocation.g:1666:2: rule__Component_Impl__Group__9__Impl rule__Component_Impl__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__Component_Impl__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__9"


    // $ANTLR start "rule__Component_Impl__Group__9__Impl"
    // InternalAllocation.g:1673:1: rule__Component_Impl__Group__9__Impl : ( ( rule__Component_Impl__Group_9__0 )? ) ;
    public final void rule__Component_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1677:1: ( ( ( rule__Component_Impl__Group_9__0 )? ) )
            // InternalAllocation.g:1678:1: ( ( rule__Component_Impl__Group_9__0 )? )
            {
            // InternalAllocation.g:1678:1: ( ( rule__Component_Impl__Group_9__0 )? )
            // InternalAllocation.g:1679:2: ( rule__Component_Impl__Group_9__0 )?
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_9()); 
            // InternalAllocation.g:1680:2: ( rule__Component_Impl__Group_9__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAllocation.g:1680:3: rule__Component_Impl__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component_Impl__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponent_ImplAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__9__Impl"


    // $ANTLR start "rule__Component_Impl__Group__10"
    // InternalAllocation.g:1688:1: rule__Component_Impl__Group__10 : rule__Component_Impl__Group__10__Impl rule__Component_Impl__Group__11 ;
    public final void rule__Component_Impl__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1692:1: ( rule__Component_Impl__Group__10__Impl rule__Component_Impl__Group__11 )
            // InternalAllocation.g:1693:2: rule__Component_Impl__Group__10__Impl rule__Component_Impl__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Component_Impl__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__10"


    // $ANTLR start "rule__Component_Impl__Group__10__Impl"
    // InternalAllocation.g:1700:1: rule__Component_Impl__Group__10__Impl : ( 'providedrole' ) ;
    public final void rule__Component_Impl__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1704:1: ( ( 'providedrole' ) )
            // InternalAllocation.g:1705:1: ( 'providedrole' )
            {
            // InternalAllocation.g:1705:1: ( 'providedrole' )
            // InternalAllocation.g:1706:2: 'providedrole'
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedroleKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getProvidedroleKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__10__Impl"


    // $ANTLR start "rule__Component_Impl__Group__11"
    // InternalAllocation.g:1715:1: rule__Component_Impl__Group__11 : rule__Component_Impl__Group__11__Impl rule__Component_Impl__Group__12 ;
    public final void rule__Component_Impl__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1719:1: ( rule__Component_Impl__Group__11__Impl rule__Component_Impl__Group__12 )
            // InternalAllocation.g:1720:2: rule__Component_Impl__Group__11__Impl rule__Component_Impl__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Component_Impl__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__11"


    // $ANTLR start "rule__Component_Impl__Group__11__Impl"
    // InternalAllocation.g:1727:1: rule__Component_Impl__Group__11__Impl : ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) ) ;
    public final void rule__Component_Impl__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1731:1: ( ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) ) )
            // InternalAllocation.g:1732:1: ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) )
            {
            // InternalAllocation.g:1732:1: ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) )
            // InternalAllocation.g:1733:2: ( rule__Component_Impl__ProvidedroleAssignment_11 )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedroleAssignment_11()); 
            // InternalAllocation.g:1734:2: ( rule__Component_Impl__ProvidedroleAssignment_11 )
            // InternalAllocation.g:1734:3: rule__Component_Impl__ProvidedroleAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__ProvidedroleAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getProvidedroleAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__11__Impl"


    // $ANTLR start "rule__Component_Impl__Group__12"
    // InternalAllocation.g:1742:1: rule__Component_Impl__Group__12 : rule__Component_Impl__Group__12__Impl ;
    public final void rule__Component_Impl__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1746:1: ( rule__Component_Impl__Group__12__Impl )
            // InternalAllocation.g:1747:2: rule__Component_Impl__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__12"


    // $ANTLR start "rule__Component_Impl__Group__12__Impl"
    // InternalAllocation.g:1753:1: rule__Component_Impl__Group__12__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1757:1: ( ( '}' ) )
            // InternalAllocation.g:1758:1: ( '}' )
            {
            // InternalAllocation.g:1758:1: ( '}' )
            // InternalAllocation.g:1759:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_12()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__12__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3__0"
    // InternalAllocation.g:1769:1: rule__Component_Impl__Group_3__0 : rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1 ;
    public final void rule__Component_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1773:1: ( rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1 )
            // InternalAllocation.g:1774:2: rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Component_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__0"


    // $ANTLR start "rule__Component_Impl__Group_3__0__Impl"
    // InternalAllocation.g:1781:1: rule__Component_Impl__Group_3__0__Impl : ( 'behaviourdescription' ) ;
    public final void rule__Component_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1785:1: ( ( 'behaviourdescription' ) )
            // InternalAllocation.g:1786:1: ( 'behaviourdescription' )
            {
            // InternalAllocation.g:1786:1: ( 'behaviourdescription' )
            // InternalAllocation.g:1787:2: 'behaviourdescription'
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3__1"
    // InternalAllocation.g:1796:1: rule__Component_Impl__Group_3__1 : rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2 ;
    public final void rule__Component_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1800:1: ( rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2 )
            // InternalAllocation.g:1801:2: rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2
            {
            pushFollow(FOLLOW_17);
            rule__Component_Impl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__1"


    // $ANTLR start "rule__Component_Impl__Group_3__1__Impl"
    // InternalAllocation.g:1808:1: rule__Component_Impl__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1812:1: ( ( '{' ) )
            // InternalAllocation.g:1813:1: ( '{' )
            {
            // InternalAllocation.g:1813:1: ( '{' )
            // InternalAllocation.g:1814:2: '{'
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3__2"
    // InternalAllocation.g:1823:1: rule__Component_Impl__Group_3__2 : rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3 ;
    public final void rule__Component_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1827:1: ( rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3 )
            // InternalAllocation.g:1828:2: rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__Component_Impl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__2"


    // $ANTLR start "rule__Component_Impl__Group_3__2__Impl"
    // InternalAllocation.g:1835:1: rule__Component_Impl__Group_3__2__Impl : ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) ) ;
    public final void rule__Component_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1839:1: ( ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) ) )
            // InternalAllocation.g:1840:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) )
            {
            // InternalAllocation.g:1840:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) )
            // InternalAllocation.g:1841:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 )
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionAssignment_3_2()); 
            // InternalAllocation.g:1842:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 )
            // InternalAllocation.g:1842:3: rule__Component_Impl__BehaviourdescriptionAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__BehaviourdescriptionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__2__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3__3"
    // InternalAllocation.g:1850:1: rule__Component_Impl__Group_3__3 : rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4 ;
    public final void rule__Component_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1854:1: ( rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4 )
            // InternalAllocation.g:1855:2: rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4
            {
            pushFollow(FOLLOW_6);
            rule__Component_Impl__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__3"


    // $ANTLR start "rule__Component_Impl__Group_3__3__Impl"
    // InternalAllocation.g:1862:1: rule__Component_Impl__Group_3__3__Impl : ( ( rule__Component_Impl__Group_3_3__0 )* ) ;
    public final void rule__Component_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1866:1: ( ( ( rule__Component_Impl__Group_3_3__0 )* ) )
            // InternalAllocation.g:1867:1: ( ( rule__Component_Impl__Group_3_3__0 )* )
            {
            // InternalAllocation.g:1867:1: ( ( rule__Component_Impl__Group_3_3__0 )* )
            // InternalAllocation.g:1868:2: ( rule__Component_Impl__Group_3_3__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_3_3()); 
            // InternalAllocation.g:1869:2: ( rule__Component_Impl__Group_3_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAllocation.g:1869:3: rule__Component_Impl__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Component_Impl__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getComponent_ImplAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__3__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3__4"
    // InternalAllocation.g:1877:1: rule__Component_Impl__Group_3__4 : rule__Component_Impl__Group_3__4__Impl ;
    public final void rule__Component_Impl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1881:1: ( rule__Component_Impl__Group_3__4__Impl )
            // InternalAllocation.g:1882:2: rule__Component_Impl__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__4"


    // $ANTLR start "rule__Component_Impl__Group_3__4__Impl"
    // InternalAllocation.g:1888:1: rule__Component_Impl__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1892:1: ( ( '}' ) )
            // InternalAllocation.g:1893:1: ( '}' )
            {
            // InternalAllocation.g:1893:1: ( '}' )
            // InternalAllocation.g:1894:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__4__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3_3__0"
    // InternalAllocation.g:1904:1: rule__Component_Impl__Group_3_3__0 : rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1 ;
    public final void rule__Component_Impl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1908:1: ( rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1 )
            // InternalAllocation.g:1909:2: rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Component_Impl__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3_3__0"


    // $ANTLR start "rule__Component_Impl__Group_3_3__0__Impl"
    // InternalAllocation.g:1916:1: rule__Component_Impl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1920:1: ( ( ',' ) )
            // InternalAllocation.g:1921:1: ( ',' )
            {
            // InternalAllocation.g:1921:1: ( ',' )
            // InternalAllocation.g:1922:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_3_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3_3__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3_3__1"
    // InternalAllocation.g:1931:1: rule__Component_Impl__Group_3_3__1 : rule__Component_Impl__Group_3_3__1__Impl ;
    public final void rule__Component_Impl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1935:1: ( rule__Component_Impl__Group_3_3__1__Impl )
            // InternalAllocation.g:1936:2: rule__Component_Impl__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3_3__1"


    // $ANTLR start "rule__Component_Impl__Group_3_3__1__Impl"
    // InternalAllocation.g:1942:1: rule__Component_Impl__Group_3_3__1__Impl : ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) ) ;
    public final void rule__Component_Impl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1946:1: ( ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) ) )
            // InternalAllocation.g:1947:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) )
            {
            // InternalAllocation.g:1947:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) )
            // InternalAllocation.g:1948:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionAssignment_3_3_1()); 
            // InternalAllocation.g:1949:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 )
            // InternalAllocation.g:1949:3: rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3_3__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_7__0"
    // InternalAllocation.g:1958:1: rule__Component_Impl__Group_7__0 : rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1 ;
    public final void rule__Component_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1962:1: ( rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1 )
            // InternalAllocation.g:1963:2: rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__Component_Impl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_7__0"


    // $ANTLR start "rule__Component_Impl__Group_7__0__Impl"
    // InternalAllocation.g:1970:1: rule__Component_Impl__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1974:1: ( ( ',' ) )
            // InternalAllocation.g:1975:1: ( ',' )
            {
            // InternalAllocation.g:1975:1: ( ',' )
            // InternalAllocation.g:1976:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_7_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_7__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_7__1"
    // InternalAllocation.g:1985:1: rule__Component_Impl__Group_7__1 : rule__Component_Impl__Group_7__1__Impl ;
    public final void rule__Component_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1989:1: ( rule__Component_Impl__Group_7__1__Impl )
            // InternalAllocation.g:1990:2: rule__Component_Impl__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_7__1"


    // $ANTLR start "rule__Component_Impl__Group_7__1__Impl"
    // InternalAllocation.g:1996:1: rule__Component_Impl__Group_7__1__Impl : ( ( rule__Component_Impl__ServiceAssignment_7_1 ) ) ;
    public final void rule__Component_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2000:1: ( ( ( rule__Component_Impl__ServiceAssignment_7_1 ) ) )
            // InternalAllocation.g:2001:1: ( ( rule__Component_Impl__ServiceAssignment_7_1 ) )
            {
            // InternalAllocation.g:2001:1: ( ( rule__Component_Impl__ServiceAssignment_7_1 ) )
            // InternalAllocation.g:2002:2: ( rule__Component_Impl__ServiceAssignment_7_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getServiceAssignment_7_1()); 
            // InternalAllocation.g:2003:2: ( rule__Component_Impl__ServiceAssignment_7_1 )
            // InternalAllocation.g:2003:3: rule__Component_Impl__ServiceAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__ServiceAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getServiceAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_7__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9__0"
    // InternalAllocation.g:2012:1: rule__Component_Impl__Group_9__0 : rule__Component_Impl__Group_9__0__Impl rule__Component_Impl__Group_9__1 ;
    public final void rule__Component_Impl__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2016:1: ( rule__Component_Impl__Group_9__0__Impl rule__Component_Impl__Group_9__1 )
            // InternalAllocation.g:2017:2: rule__Component_Impl__Group_9__0__Impl rule__Component_Impl__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__Component_Impl__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__0"


    // $ANTLR start "rule__Component_Impl__Group_9__0__Impl"
    // InternalAllocation.g:2024:1: rule__Component_Impl__Group_9__0__Impl : ( 'requiredrole' ) ;
    public final void rule__Component_Impl__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2028:1: ( ( 'requiredrole' ) )
            // InternalAllocation.g:2029:1: ( 'requiredrole' )
            {
            // InternalAllocation.g:2029:1: ( 'requiredrole' )
            // InternalAllocation.g:2030:2: 'requiredrole'
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredroleKeyword_9_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRequiredroleKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9__1"
    // InternalAllocation.g:2039:1: rule__Component_Impl__Group_9__1 : rule__Component_Impl__Group_9__1__Impl rule__Component_Impl__Group_9__2 ;
    public final void rule__Component_Impl__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2043:1: ( rule__Component_Impl__Group_9__1__Impl rule__Component_Impl__Group_9__2 )
            // InternalAllocation.g:2044:2: rule__Component_Impl__Group_9__1__Impl rule__Component_Impl__Group_9__2
            {
            pushFollow(FOLLOW_18);
            rule__Component_Impl__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__1"


    // $ANTLR start "rule__Component_Impl__Group_9__1__Impl"
    // InternalAllocation.g:2051:1: rule__Component_Impl__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2055:1: ( ( '{' ) )
            // InternalAllocation.g:2056:1: ( '{' )
            {
            // InternalAllocation.g:2056:1: ( '{' )
            // InternalAllocation.g:2057:2: '{'
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9__2"
    // InternalAllocation.g:2066:1: rule__Component_Impl__Group_9__2 : rule__Component_Impl__Group_9__2__Impl rule__Component_Impl__Group_9__3 ;
    public final void rule__Component_Impl__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2070:1: ( rule__Component_Impl__Group_9__2__Impl rule__Component_Impl__Group_9__3 )
            // InternalAllocation.g:2071:2: rule__Component_Impl__Group_9__2__Impl rule__Component_Impl__Group_9__3
            {
            pushFollow(FOLLOW_6);
            rule__Component_Impl__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__2"


    // $ANTLR start "rule__Component_Impl__Group_9__2__Impl"
    // InternalAllocation.g:2078:1: rule__Component_Impl__Group_9__2__Impl : ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) ) ;
    public final void rule__Component_Impl__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2082:1: ( ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) ) )
            // InternalAllocation.g:2083:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) )
            {
            // InternalAllocation.g:2083:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) )
            // InternalAllocation.g:2084:2: ( rule__Component_Impl__RequiredroleAssignment_9_2 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredroleAssignment_9_2()); 
            // InternalAllocation.g:2085:2: ( rule__Component_Impl__RequiredroleAssignment_9_2 )
            // InternalAllocation.g:2085:3: rule__Component_Impl__RequiredroleAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__RequiredroleAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredroleAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__2__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9__3"
    // InternalAllocation.g:2093:1: rule__Component_Impl__Group_9__3 : rule__Component_Impl__Group_9__3__Impl rule__Component_Impl__Group_9__4 ;
    public final void rule__Component_Impl__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2097:1: ( rule__Component_Impl__Group_9__3__Impl rule__Component_Impl__Group_9__4 )
            // InternalAllocation.g:2098:2: rule__Component_Impl__Group_9__3__Impl rule__Component_Impl__Group_9__4
            {
            pushFollow(FOLLOW_6);
            rule__Component_Impl__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__3"


    // $ANTLR start "rule__Component_Impl__Group_9__3__Impl"
    // InternalAllocation.g:2105:1: rule__Component_Impl__Group_9__3__Impl : ( ( rule__Component_Impl__Group_9_3__0 )* ) ;
    public final void rule__Component_Impl__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2109:1: ( ( ( rule__Component_Impl__Group_9_3__0 )* ) )
            // InternalAllocation.g:2110:1: ( ( rule__Component_Impl__Group_9_3__0 )* )
            {
            // InternalAllocation.g:2110:1: ( ( rule__Component_Impl__Group_9_3__0 )* )
            // InternalAllocation.g:2111:2: ( rule__Component_Impl__Group_9_3__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_9_3()); 
            // InternalAllocation.g:2112:2: ( rule__Component_Impl__Group_9_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAllocation.g:2112:3: rule__Component_Impl__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Component_Impl__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComponent_ImplAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__3__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9__4"
    // InternalAllocation.g:2120:1: rule__Component_Impl__Group_9__4 : rule__Component_Impl__Group_9__4__Impl ;
    public final void rule__Component_Impl__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2124:1: ( rule__Component_Impl__Group_9__4__Impl )
            // InternalAllocation.g:2125:2: rule__Component_Impl__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__4"


    // $ANTLR start "rule__Component_Impl__Group_9__4__Impl"
    // InternalAllocation.g:2131:1: rule__Component_Impl__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2135:1: ( ( '}' ) )
            // InternalAllocation.g:2136:1: ( '}' )
            {
            // InternalAllocation.g:2136:1: ( '}' )
            // InternalAllocation.g:2137:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__4__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9_3__0"
    // InternalAllocation.g:2147:1: rule__Component_Impl__Group_9_3__0 : rule__Component_Impl__Group_9_3__0__Impl rule__Component_Impl__Group_9_3__1 ;
    public final void rule__Component_Impl__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2151:1: ( rule__Component_Impl__Group_9_3__0__Impl rule__Component_Impl__Group_9_3__1 )
            // InternalAllocation.g:2152:2: rule__Component_Impl__Group_9_3__0__Impl rule__Component_Impl__Group_9_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Component_Impl__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9_3__0"


    // $ANTLR start "rule__Component_Impl__Group_9_3__0__Impl"
    // InternalAllocation.g:2159:1: rule__Component_Impl__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2163:1: ( ( ',' ) )
            // InternalAllocation.g:2164:1: ( ',' )
            {
            // InternalAllocation.g:2164:1: ( ',' )
            // InternalAllocation.g:2165:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_9_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9_3__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9_3__1"
    // InternalAllocation.g:2174:1: rule__Component_Impl__Group_9_3__1 : rule__Component_Impl__Group_9_3__1__Impl ;
    public final void rule__Component_Impl__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2178:1: ( rule__Component_Impl__Group_9_3__1__Impl )
            // InternalAllocation.g:2179:2: rule__Component_Impl__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9_3__1"


    // $ANTLR start "rule__Component_Impl__Group_9_3__1__Impl"
    // InternalAllocation.g:2185:1: rule__Component_Impl__Group_9_3__1__Impl : ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) ) ;
    public final void rule__Component_Impl__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2189:1: ( ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) ) )
            // InternalAllocation.g:2190:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) )
            {
            // InternalAllocation.g:2190:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) )
            // InternalAllocation.g:2191:2: ( rule__Component_Impl__RequiredroleAssignment_9_3_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredroleAssignment_9_3_1()); 
            // InternalAllocation.g:2192:2: ( rule__Component_Impl__RequiredroleAssignment_9_3_1 )
            // InternalAllocation.g:2192:3: rule__Component_Impl__RequiredroleAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__RequiredroleAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredroleAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9_3__1__Impl"


    // $ANTLR start "rule__BehaviourDescription_Impl__Group__0"
    // InternalAllocation.g:2201:1: rule__BehaviourDescription_Impl__Group__0 : rule__BehaviourDescription_Impl__Group__0__Impl rule__BehaviourDescription_Impl__Group__1 ;
    public final void rule__BehaviourDescription_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2205:1: ( rule__BehaviourDescription_Impl__Group__0__Impl rule__BehaviourDescription_Impl__Group__1 )
            // InternalAllocation.g:2206:2: rule__BehaviourDescription_Impl__Group__0__Impl rule__BehaviourDescription_Impl__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__BehaviourDescription_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription_Impl__Group__0"


    // $ANTLR start "rule__BehaviourDescription_Impl__Group__0__Impl"
    // InternalAllocation.g:2213:1: rule__BehaviourDescription_Impl__Group__0__Impl : ( () ) ;
    public final void rule__BehaviourDescription_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2217:1: ( ( () ) )
            // InternalAllocation.g:2218:1: ( () )
            {
            // InternalAllocation.g:2218:1: ( () )
            // InternalAllocation.g:2219:2: ()
            {
             before(grammarAccess.getBehaviourDescription_ImplAccess().getBehaviourDescriptionAction_0()); 
            // InternalAllocation.g:2220:2: ()
            // InternalAllocation.g:2220:3: 
            {
            }

             after(grammarAccess.getBehaviourDescription_ImplAccess().getBehaviourDescriptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription_Impl__Group__0__Impl"


    // $ANTLR start "rule__BehaviourDescription_Impl__Group__1"
    // InternalAllocation.g:2228:1: rule__BehaviourDescription_Impl__Group__1 : rule__BehaviourDescription_Impl__Group__1__Impl ;
    public final void rule__BehaviourDescription_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2232:1: ( rule__BehaviourDescription_Impl__Group__1__Impl )
            // InternalAllocation.g:2233:2: rule__BehaviourDescription_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription_Impl__Group__1"


    // $ANTLR start "rule__BehaviourDescription_Impl__Group__1__Impl"
    // InternalAllocation.g:2239:1: rule__BehaviourDescription_Impl__Group__1__Impl : ( 'BehaviourDescription' ) ;
    public final void rule__BehaviourDescription_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2243:1: ( ( 'BehaviourDescription' ) )
            // InternalAllocation.g:2244:1: ( 'BehaviourDescription' )
            {
            // InternalAllocation.g:2244:1: ( 'BehaviourDescription' )
            // InternalAllocation.g:2245:2: 'BehaviourDescription'
            {
             before(grammarAccess.getBehaviourDescription_ImplAccess().getBehaviourDescriptionKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescription_ImplAccess().getBehaviourDescriptionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription_Impl__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalAllocation.g:2255:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2259:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalAllocation.g:2260:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalAllocation.g:2267:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2271:1: ( ( 'Service' ) )
            // InternalAllocation.g:2272:1: ( 'Service' )
            {
            // InternalAllocation.g:2272:1: ( 'Service' )
            // InternalAllocation.g:2273:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalAllocation.g:2282:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2286:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalAllocation.g:2287:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalAllocation.g:2294:1: rule__Service__Group__1__Impl : ( '{' ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2298:1: ( ( '{' ) )
            // InternalAllocation.g:2299:1: ( '{' )
            {
            // InternalAllocation.g:2299:1: ( '{' )
            // InternalAllocation.g:2300:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalAllocation.g:2309:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2313:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalAllocation.g:2314:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalAllocation.g:2321:1: rule__Service__Group__2__Impl : ( 'correspondingSignatures' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2325:1: ( ( 'correspondingSignatures' ) )
            // InternalAllocation.g:2326:1: ( 'correspondingSignatures' )
            {
            // InternalAllocation.g:2326:1: ( 'correspondingSignatures' )
            // InternalAllocation.g:2327:2: 'correspondingSignatures'
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCorrespondingSignaturesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalAllocation.g:2336:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2340:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalAllocation.g:2341:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalAllocation.g:2348:1: rule__Service__Group__3__Impl : ( '(' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2352:1: ( ( '(' ) )
            // InternalAllocation.g:2353:1: ( '(' )
            {
            // InternalAllocation.g:2353:1: ( '(' )
            // InternalAllocation.g:2354:2: '('
            {
             before(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalAllocation.g:2363:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2367:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalAllocation.g:2368:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalAllocation.g:2375:1: rule__Service__Group__4__Impl : ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2379:1: ( ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) ) )
            // InternalAllocation.g:2380:1: ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) )
            {
            // InternalAllocation.g:2380:1: ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) )
            // InternalAllocation.g:2381:2: ( rule__Service__CorrespondingSignaturesAssignment_4 )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesAssignment_4()); 
            // InternalAllocation.g:2382:2: ( rule__Service__CorrespondingSignaturesAssignment_4 )
            // InternalAllocation.g:2382:3: rule__Service__CorrespondingSignaturesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Service__CorrespondingSignaturesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getCorrespondingSignaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalAllocation.g:2390:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2394:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalAllocation.g:2395:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalAllocation.g:2402:1: rule__Service__Group__5__Impl : ( ( rule__Service__Group_5__0 )* ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2406:1: ( ( ( rule__Service__Group_5__0 )* ) )
            // InternalAllocation.g:2407:1: ( ( rule__Service__Group_5__0 )* )
            {
            // InternalAllocation.g:2407:1: ( ( rule__Service__Group_5__0 )* )
            // InternalAllocation.g:2408:2: ( rule__Service__Group_5__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_5()); 
            // InternalAllocation.g:2409:2: ( rule__Service__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAllocation.g:2409:3: rule__Service__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Service__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalAllocation.g:2417:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2421:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalAllocation.g:2422:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalAllocation.g:2429:1: rule__Service__Group__6__Impl : ( ')' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2433:1: ( ( ')' ) )
            // InternalAllocation.g:2434:1: ( ')' )
            {
            // InternalAllocation.g:2434:1: ( ')' )
            // InternalAllocation.g:2435:2: ')'
            {
             before(grammarAccess.getServiceAccess().getRightParenthesisKeyword_6()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // InternalAllocation.g:2444:1: rule__Service__Group__7 : rule__Service__Group__7__Impl ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2448:1: ( rule__Service__Group__7__Impl )
            // InternalAllocation.g:2449:2: rule__Service__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // InternalAllocation.g:2455:1: rule__Service__Group__7__Impl : ( '}' ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2459:1: ( ( '}' ) )
            // InternalAllocation.g:2460:1: ( '}' )
            {
            // InternalAllocation.g:2460:1: ( '}' )
            // InternalAllocation.g:2461:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group_5__0"
    // InternalAllocation.g:2471:1: rule__Service__Group_5__0 : rule__Service__Group_5__0__Impl rule__Service__Group_5__1 ;
    public final void rule__Service__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2475:1: ( rule__Service__Group_5__0__Impl rule__Service__Group_5__1 )
            // InternalAllocation.g:2476:2: rule__Service__Group_5__0__Impl rule__Service__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Service__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_5__0"


    // $ANTLR start "rule__Service__Group_5__0__Impl"
    // InternalAllocation.g:2483:1: rule__Service__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2487:1: ( ( ',' ) )
            // InternalAllocation.g:2488:1: ( ',' )
            {
            // InternalAllocation.g:2488:1: ( ',' )
            // InternalAllocation.g:2489:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_5__0__Impl"


    // $ANTLR start "rule__Service__Group_5__1"
    // InternalAllocation.g:2498:1: rule__Service__Group_5__1 : rule__Service__Group_5__1__Impl ;
    public final void rule__Service__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2502:1: ( rule__Service__Group_5__1__Impl )
            // InternalAllocation.g:2503:2: rule__Service__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_5__1"


    // $ANTLR start "rule__Service__Group_5__1__Impl"
    // InternalAllocation.g:2509:1: rule__Service__Group_5__1__Impl : ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) ) ;
    public final void rule__Service__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2513:1: ( ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) ) )
            // InternalAllocation.g:2514:1: ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) )
            {
            // InternalAllocation.g:2514:1: ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) )
            // InternalAllocation.g:2515:2: ( rule__Service__CorrespondingSignaturesAssignment_5_1 )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesAssignment_5_1()); 
            // InternalAllocation.g:2516:2: ( rule__Service__CorrespondingSignaturesAssignment_5_1 )
            // InternalAllocation.g:2516:3: rule__Service__CorrespondingSignaturesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__CorrespondingSignaturesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getCorrespondingSignaturesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_5__1__Impl"


    // $ANTLR start "rule__RequiredRole__Group__0"
    // InternalAllocation.g:2525:1: rule__RequiredRole__Group__0 : rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 ;
    public final void rule__RequiredRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2529:1: ( rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 )
            // InternalAllocation.g:2530:2: rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__RequiredRole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__0"


    // $ANTLR start "rule__RequiredRole__Group__0__Impl"
    // InternalAllocation.g:2537:1: rule__RequiredRole__Group__0__Impl : ( 'RequiredRole' ) ;
    public final void rule__RequiredRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2541:1: ( ( 'RequiredRole' ) )
            // InternalAllocation.g:2542:1: ( 'RequiredRole' )
            {
            // InternalAllocation.g:2542:1: ( 'RequiredRole' )
            // InternalAllocation.g:2543:2: 'RequiredRole'
            {
             before(grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__0__Impl"


    // $ANTLR start "rule__RequiredRole__Group__1"
    // InternalAllocation.g:2552:1: rule__RequiredRole__Group__1 : rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 ;
    public final void rule__RequiredRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2556:1: ( rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 )
            // InternalAllocation.g:2557:2: rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RequiredRole__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__1"


    // $ANTLR start "rule__RequiredRole__Group__1__Impl"
    // InternalAllocation.g:2564:1: rule__RequiredRole__Group__1__Impl : ( ( rule__RequiredRole__NameAssignment_1 ) ) ;
    public final void rule__RequiredRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2568:1: ( ( ( rule__RequiredRole__NameAssignment_1 ) ) )
            // InternalAllocation.g:2569:1: ( ( rule__RequiredRole__NameAssignment_1 ) )
            {
            // InternalAllocation.g:2569:1: ( ( rule__RequiredRole__NameAssignment_1 ) )
            // InternalAllocation.g:2570:2: ( rule__RequiredRole__NameAssignment_1 )
            {
             before(grammarAccess.getRequiredRoleAccess().getNameAssignment_1()); 
            // InternalAllocation.g:2571:2: ( rule__RequiredRole__NameAssignment_1 )
            // InternalAllocation.g:2571:3: rule__RequiredRole__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RequiredRole__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequiredRoleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__1__Impl"


    // $ANTLR start "rule__RequiredRole__Group__2"
    // InternalAllocation.g:2579:1: rule__RequiredRole__Group__2 : rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3 ;
    public final void rule__RequiredRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2583:1: ( rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3 )
            // InternalAllocation.g:2584:2: rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__RequiredRole__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__2"


    // $ANTLR start "rule__RequiredRole__Group__2__Impl"
    // InternalAllocation.g:2591:1: rule__RequiredRole__Group__2__Impl : ( '{' ) ;
    public final void rule__RequiredRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2595:1: ( ( '{' ) )
            // InternalAllocation.g:2596:1: ( '{' )
            {
            // InternalAllocation.g:2596:1: ( '{' )
            // InternalAllocation.g:2597:2: '{'
            {
             before(grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__2__Impl"


    // $ANTLR start "rule__RequiredRole__Group__3"
    // InternalAllocation.g:2606:1: rule__RequiredRole__Group__3 : rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4 ;
    public final void rule__RequiredRole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2610:1: ( rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4 )
            // InternalAllocation.g:2611:2: rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__RequiredRole__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__3"


    // $ANTLR start "rule__RequiredRole__Group__3__Impl"
    // InternalAllocation.g:2618:1: rule__RequiredRole__Group__3__Impl : ( 'interface' ) ;
    public final void rule__RequiredRole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2622:1: ( ( 'interface' ) )
            // InternalAllocation.g:2623:1: ( 'interface' )
            {
            // InternalAllocation.g:2623:1: ( 'interface' )
            // InternalAllocation.g:2624:2: 'interface'
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRequiredRoleAccess().getInterfaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__3__Impl"


    // $ANTLR start "rule__RequiredRole__Group__4"
    // InternalAllocation.g:2633:1: rule__RequiredRole__Group__4 : rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5 ;
    public final void rule__RequiredRole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2637:1: ( rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5 )
            // InternalAllocation.g:2638:2: rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__RequiredRole__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__4"


    // $ANTLR start "rule__RequiredRole__Group__4__Impl"
    // InternalAllocation.g:2645:1: rule__RequiredRole__Group__4__Impl : ( ( rule__RequiredRole__InterfaceAssignment_4 ) ) ;
    public final void rule__RequiredRole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2649:1: ( ( ( rule__RequiredRole__InterfaceAssignment_4 ) ) )
            // InternalAllocation.g:2650:1: ( ( rule__RequiredRole__InterfaceAssignment_4 ) )
            {
            // InternalAllocation.g:2650:1: ( ( rule__RequiredRole__InterfaceAssignment_4 ) )
            // InternalAllocation.g:2651:2: ( rule__RequiredRole__InterfaceAssignment_4 )
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceAssignment_4()); 
            // InternalAllocation.g:2652:2: ( rule__RequiredRole__InterfaceAssignment_4 )
            // InternalAllocation.g:2652:3: rule__RequiredRole__InterfaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RequiredRole__InterfaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRequiredRoleAccess().getInterfaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__4__Impl"


    // $ANTLR start "rule__RequiredRole__Group__5"
    // InternalAllocation.g:2660:1: rule__RequiredRole__Group__5 : rule__RequiredRole__Group__5__Impl ;
    public final void rule__RequiredRole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2664:1: ( rule__RequiredRole__Group__5__Impl )
            // InternalAllocation.g:2665:2: rule__RequiredRole__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__5"


    // $ANTLR start "rule__RequiredRole__Group__5__Impl"
    // InternalAllocation.g:2671:1: rule__RequiredRole__Group__5__Impl : ( '}' ) ;
    public final void rule__RequiredRole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2675:1: ( ( '}' ) )
            // InternalAllocation.g:2676:1: ( '}' )
            {
            // InternalAllocation.g:2676:1: ( '}' )
            // InternalAllocation.g:2677:2: '}'
            {
             before(grammarAccess.getRequiredRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRequiredRoleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__5__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__0"
    // InternalAllocation.g:2687:1: rule__ProvidedRole__Group__0 : rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 ;
    public final void rule__ProvidedRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2691:1: ( rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 )
            // InternalAllocation.g:2692:2: rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ProvidedRole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__0"


    // $ANTLR start "rule__ProvidedRole__Group__0__Impl"
    // InternalAllocation.g:2699:1: rule__ProvidedRole__Group__0__Impl : ( 'ProvidedRole' ) ;
    public final void rule__ProvidedRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2703:1: ( ( 'ProvidedRole' ) )
            // InternalAllocation.g:2704:1: ( 'ProvidedRole' )
            {
            // InternalAllocation.g:2704:1: ( 'ProvidedRole' )
            // InternalAllocation.g:2705:2: 'ProvidedRole'
            {
             before(grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__0__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__1"
    // InternalAllocation.g:2714:1: rule__ProvidedRole__Group__1 : rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 ;
    public final void rule__ProvidedRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2718:1: ( rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 )
            // InternalAllocation.g:2719:2: rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ProvidedRole__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__1"


    // $ANTLR start "rule__ProvidedRole__Group__1__Impl"
    // InternalAllocation.g:2726:1: rule__ProvidedRole__Group__1__Impl : ( ( rule__ProvidedRole__NameAssignment_1 ) ) ;
    public final void rule__ProvidedRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2730:1: ( ( ( rule__ProvidedRole__NameAssignment_1 ) ) )
            // InternalAllocation.g:2731:1: ( ( rule__ProvidedRole__NameAssignment_1 ) )
            {
            // InternalAllocation.g:2731:1: ( ( rule__ProvidedRole__NameAssignment_1 ) )
            // InternalAllocation.g:2732:2: ( rule__ProvidedRole__NameAssignment_1 )
            {
             before(grammarAccess.getProvidedRoleAccess().getNameAssignment_1()); 
            // InternalAllocation.g:2733:2: ( rule__ProvidedRole__NameAssignment_1 )
            // InternalAllocation.g:2733:3: rule__ProvidedRole__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedRole__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProvidedRoleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__1__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__2"
    // InternalAllocation.g:2741:1: rule__ProvidedRole__Group__2 : rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3 ;
    public final void rule__ProvidedRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2745:1: ( rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3 )
            // InternalAllocation.g:2746:2: rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ProvidedRole__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__2"


    // $ANTLR start "rule__ProvidedRole__Group__2__Impl"
    // InternalAllocation.g:2753:1: rule__ProvidedRole__Group__2__Impl : ( '{' ) ;
    public final void rule__ProvidedRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2757:1: ( ( '{' ) )
            // InternalAllocation.g:2758:1: ( '{' )
            {
            // InternalAllocation.g:2758:1: ( '{' )
            // InternalAllocation.g:2759:2: '{'
            {
             before(grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__2__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__3"
    // InternalAllocation.g:2768:1: rule__ProvidedRole__Group__3 : rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4 ;
    public final void rule__ProvidedRole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2772:1: ( rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4 )
            // InternalAllocation.g:2773:2: rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ProvidedRole__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__3"


    // $ANTLR start "rule__ProvidedRole__Group__3__Impl"
    // InternalAllocation.g:2780:1: rule__ProvidedRole__Group__3__Impl : ( 'interface' ) ;
    public final void rule__ProvidedRole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2784:1: ( ( 'interface' ) )
            // InternalAllocation.g:2785:1: ( 'interface' )
            {
            // InternalAllocation.g:2785:1: ( 'interface' )
            // InternalAllocation.g:2786:2: 'interface'
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getProvidedRoleAccess().getInterfaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__3__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__4"
    // InternalAllocation.g:2795:1: rule__ProvidedRole__Group__4 : rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5 ;
    public final void rule__ProvidedRole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2799:1: ( rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5 )
            // InternalAllocation.g:2800:2: rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__ProvidedRole__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__4"


    // $ANTLR start "rule__ProvidedRole__Group__4__Impl"
    // InternalAllocation.g:2807:1: rule__ProvidedRole__Group__4__Impl : ( ( rule__ProvidedRole__InterfaceAssignment_4 ) ) ;
    public final void rule__ProvidedRole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2811:1: ( ( ( rule__ProvidedRole__InterfaceAssignment_4 ) ) )
            // InternalAllocation.g:2812:1: ( ( rule__ProvidedRole__InterfaceAssignment_4 ) )
            {
            // InternalAllocation.g:2812:1: ( ( rule__ProvidedRole__InterfaceAssignment_4 ) )
            // InternalAllocation.g:2813:2: ( rule__ProvidedRole__InterfaceAssignment_4 )
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceAssignment_4()); 
            // InternalAllocation.g:2814:2: ( rule__ProvidedRole__InterfaceAssignment_4 )
            // InternalAllocation.g:2814:3: rule__ProvidedRole__InterfaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedRole__InterfaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProvidedRoleAccess().getInterfaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__4__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__5"
    // InternalAllocation.g:2822:1: rule__ProvidedRole__Group__5 : rule__ProvidedRole__Group__5__Impl ;
    public final void rule__ProvidedRole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2826:1: ( rule__ProvidedRole__Group__5__Impl )
            // InternalAllocation.g:2827:2: rule__ProvidedRole__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__5"


    // $ANTLR start "rule__ProvidedRole__Group__5__Impl"
    // InternalAllocation.g:2833:1: rule__ProvidedRole__Group__5__Impl : ( '}' ) ;
    public final void rule__ProvidedRole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2837:1: ( ( '}' ) )
            // InternalAllocation.g:2838:1: ( '}' )
            {
            // InternalAllocation.g:2838:1: ( '}' )
            // InternalAllocation.g:2839:2: '}'
            {
             before(grammarAccess.getProvidedRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProvidedRoleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__5__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__0"
    // InternalAllocation.g:2849:1: rule__CompositeComponent__Group__0 : rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1 ;
    public final void rule__CompositeComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2853:1: ( rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1 )
            // InternalAllocation.g:2854:2: rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__CompositeComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__0"


    // $ANTLR start "rule__CompositeComponent__Group__0__Impl"
    // InternalAllocation.g:2861:1: rule__CompositeComponent__Group__0__Impl : ( 'CompositeComponent' ) ;
    public final void rule__CompositeComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2865:1: ( ( 'CompositeComponent' ) )
            // InternalAllocation.g:2866:1: ( 'CompositeComponent' )
            {
            // InternalAllocation.g:2866:1: ( 'CompositeComponent' )
            // InternalAllocation.g:2867:2: 'CompositeComponent'
            {
             before(grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__1"
    // InternalAllocation.g:2876:1: rule__CompositeComponent__Group__1 : rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2 ;
    public final void rule__CompositeComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2880:1: ( rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2 )
            // InternalAllocation.g:2881:2: rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__CompositeComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__1"


    // $ANTLR start "rule__CompositeComponent__Group__1__Impl"
    // InternalAllocation.g:2888:1: rule__CompositeComponent__Group__1__Impl : ( ( rule__CompositeComponent__NameAssignment_1 ) ) ;
    public final void rule__CompositeComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2892:1: ( ( ( rule__CompositeComponent__NameAssignment_1 ) ) )
            // InternalAllocation.g:2893:1: ( ( rule__CompositeComponent__NameAssignment_1 ) )
            {
            // InternalAllocation.g:2893:1: ( ( rule__CompositeComponent__NameAssignment_1 ) )
            // InternalAllocation.g:2894:2: ( rule__CompositeComponent__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getNameAssignment_1()); 
            // InternalAllocation.g:2895:2: ( rule__CompositeComponent__NameAssignment_1 )
            // InternalAllocation.g:2895:3: rule__CompositeComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__2"
    // InternalAllocation.g:2903:1: rule__CompositeComponent__Group__2 : rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3 ;
    public final void rule__CompositeComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2907:1: ( rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3 )
            // InternalAllocation.g:2908:2: rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__CompositeComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__2"


    // $ANTLR start "rule__CompositeComponent__Group__2__Impl"
    // InternalAllocation.g:2915:1: rule__CompositeComponent__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2919:1: ( ( '{' ) )
            // InternalAllocation.g:2920:1: ( '{' )
            {
            // InternalAllocation.g:2920:1: ( '{' )
            // InternalAllocation.g:2921:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__2__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__3"
    // InternalAllocation.g:2930:1: rule__CompositeComponent__Group__3 : rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4 ;
    public final void rule__CompositeComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2934:1: ( rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4 )
            // InternalAllocation.g:2935:2: rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__CompositeComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__3"


    // $ANTLR start "rule__CompositeComponent__Group__3__Impl"
    // InternalAllocation.g:2942:1: rule__CompositeComponent__Group__3__Impl : ( ( rule__CompositeComponent__Group_3__0 )? ) ;
    public final void rule__CompositeComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2946:1: ( ( ( rule__CompositeComponent__Group_3__0 )? ) )
            // InternalAllocation.g:2947:1: ( ( rule__CompositeComponent__Group_3__0 )? )
            {
            // InternalAllocation.g:2947:1: ( ( rule__CompositeComponent__Group_3__0 )? )
            // InternalAllocation.g:2948:2: ( rule__CompositeComponent__Group_3__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_3()); 
            // InternalAllocation.g:2949:2: ( rule__CompositeComponent__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAllocation.g:2949:3: rule__CompositeComponent__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeComponent__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeComponentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__3__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__4"
    // InternalAllocation.g:2957:1: rule__CompositeComponent__Group__4 : rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5 ;
    public final void rule__CompositeComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2961:1: ( rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5 )
            // InternalAllocation.g:2962:2: rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__CompositeComponent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__4"


    // $ANTLR start "rule__CompositeComponent__Group__4__Impl"
    // InternalAllocation.g:2969:1: rule__CompositeComponent__Group__4__Impl : ( 'service' ) ;
    public final void rule__CompositeComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2973:1: ( ( 'service' ) )
            // InternalAllocation.g:2974:1: ( 'service' )
            {
            // InternalAllocation.g:2974:1: ( 'service' )
            // InternalAllocation.g:2975:2: 'service'
            {
             before(grammarAccess.getCompositeComponentAccess().getServiceKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getServiceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__4__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__5"
    // InternalAllocation.g:2984:1: rule__CompositeComponent__Group__5 : rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6 ;
    public final void rule__CompositeComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2988:1: ( rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6 )
            // InternalAllocation.g:2989:2: rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__CompositeComponent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__5"


    // $ANTLR start "rule__CompositeComponent__Group__5__Impl"
    // InternalAllocation.g:2996:1: rule__CompositeComponent__Group__5__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3000:1: ( ( '{' ) )
            // InternalAllocation.g:3001:1: ( '{' )
            {
            // InternalAllocation.g:3001:1: ( '{' )
            // InternalAllocation.g:3002:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__5__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__6"
    // InternalAllocation.g:3011:1: rule__CompositeComponent__Group__6 : rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7 ;
    public final void rule__CompositeComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3015:1: ( rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7 )
            // InternalAllocation.g:3016:2: rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__6"


    // $ANTLR start "rule__CompositeComponent__Group__6__Impl"
    // InternalAllocation.g:3023:1: rule__CompositeComponent__Group__6__Impl : ( ( rule__CompositeComponent__ServiceAssignment_6 ) ) ;
    public final void rule__CompositeComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3027:1: ( ( ( rule__CompositeComponent__ServiceAssignment_6 ) ) )
            // InternalAllocation.g:3028:1: ( ( rule__CompositeComponent__ServiceAssignment_6 ) )
            {
            // InternalAllocation.g:3028:1: ( ( rule__CompositeComponent__ServiceAssignment_6 ) )
            // InternalAllocation.g:3029:2: ( rule__CompositeComponent__ServiceAssignment_6 )
            {
             before(grammarAccess.getCompositeComponentAccess().getServiceAssignment_6()); 
            // InternalAllocation.g:3030:2: ( rule__CompositeComponent__ServiceAssignment_6 )
            // InternalAllocation.g:3030:3: rule__CompositeComponent__ServiceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ServiceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getServiceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__6__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__7"
    // InternalAllocation.g:3038:1: rule__CompositeComponent__Group__7 : rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8 ;
    public final void rule__CompositeComponent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3042:1: ( rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8 )
            // InternalAllocation.g:3043:2: rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__7"


    // $ANTLR start "rule__CompositeComponent__Group__7__Impl"
    // InternalAllocation.g:3050:1: rule__CompositeComponent__Group__7__Impl : ( ( rule__CompositeComponent__Group_7__0 )* ) ;
    public final void rule__CompositeComponent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3054:1: ( ( ( rule__CompositeComponent__Group_7__0 )* ) )
            // InternalAllocation.g:3055:1: ( ( rule__CompositeComponent__Group_7__0 )* )
            {
            // InternalAllocation.g:3055:1: ( ( rule__CompositeComponent__Group_7__0 )* )
            // InternalAllocation.g:3056:2: ( rule__CompositeComponent__Group_7__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_7()); 
            // InternalAllocation.g:3057:2: ( rule__CompositeComponent__Group_7__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAllocation.g:3057:3: rule__CompositeComponent__Group_7__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeComponent__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__7__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__8"
    // InternalAllocation.g:3065:1: rule__CompositeComponent__Group__8 : rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9 ;
    public final void rule__CompositeComponent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3069:1: ( rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9 )
            // InternalAllocation.g:3070:2: rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__CompositeComponent__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__8"


    // $ANTLR start "rule__CompositeComponent__Group__8__Impl"
    // InternalAllocation.g:3077:1: rule__CompositeComponent__Group__8__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3081:1: ( ( '}' ) )
            // InternalAllocation.g:3082:1: ( '}' )
            {
            // InternalAllocation.g:3082:1: ( '}' )
            // InternalAllocation.g:3083:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__8__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__9"
    // InternalAllocation.g:3092:1: rule__CompositeComponent__Group__9 : rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10 ;
    public final void rule__CompositeComponent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3096:1: ( rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10 )
            // InternalAllocation.g:3097:2: rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__CompositeComponent__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__9"


    // $ANTLR start "rule__CompositeComponent__Group__9__Impl"
    // InternalAllocation.g:3104:1: rule__CompositeComponent__Group__9__Impl : ( ( rule__CompositeComponent__Group_9__0 )? ) ;
    public final void rule__CompositeComponent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3108:1: ( ( ( rule__CompositeComponent__Group_9__0 )? ) )
            // InternalAllocation.g:3109:1: ( ( rule__CompositeComponent__Group_9__0 )? )
            {
            // InternalAllocation.g:3109:1: ( ( rule__CompositeComponent__Group_9__0 )? )
            // InternalAllocation.g:3110:2: ( rule__CompositeComponent__Group_9__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_9()); 
            // InternalAllocation.g:3111:2: ( rule__CompositeComponent__Group_9__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAllocation.g:3111:3: rule__CompositeComponent__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeComponent__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeComponentAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__9__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__10"
    // InternalAllocation.g:3119:1: rule__CompositeComponent__Group__10 : rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11 ;
    public final void rule__CompositeComponent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3123:1: ( rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11 )
            // InternalAllocation.g:3124:2: rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__CompositeComponent__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__10"


    // $ANTLR start "rule__CompositeComponent__Group__10__Impl"
    // InternalAllocation.g:3131:1: rule__CompositeComponent__Group__10__Impl : ( 'providedrole' ) ;
    public final void rule__CompositeComponent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3135:1: ( ( 'providedrole' ) )
            // InternalAllocation.g:3136:1: ( 'providedrole' )
            {
            // InternalAllocation.g:3136:1: ( 'providedrole' )
            // InternalAllocation.g:3137:2: 'providedrole'
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedroleKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getProvidedroleKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__10__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__11"
    // InternalAllocation.g:3146:1: rule__CompositeComponent__Group__11 : rule__CompositeComponent__Group__11__Impl rule__CompositeComponent__Group__12 ;
    public final void rule__CompositeComponent__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3150:1: ( rule__CompositeComponent__Group__11__Impl rule__CompositeComponent__Group__12 )
            // InternalAllocation.g:3151:2: rule__CompositeComponent__Group__11__Impl rule__CompositeComponent__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__CompositeComponent__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__11"


    // $ANTLR start "rule__CompositeComponent__Group__11__Impl"
    // InternalAllocation.g:3158:1: rule__CompositeComponent__Group__11__Impl : ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) ) ;
    public final void rule__CompositeComponent__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3162:1: ( ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) ) )
            // InternalAllocation.g:3163:1: ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) )
            {
            // InternalAllocation.g:3163:1: ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) )
            // InternalAllocation.g:3164:2: ( rule__CompositeComponent__ProvidedroleAssignment_11 )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedroleAssignment_11()); 
            // InternalAllocation.g:3165:2: ( rule__CompositeComponent__ProvidedroleAssignment_11 )
            // InternalAllocation.g:3165:3: rule__CompositeComponent__ProvidedroleAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ProvidedroleAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedroleAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__11__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__12"
    // InternalAllocation.g:3173:1: rule__CompositeComponent__Group__12 : rule__CompositeComponent__Group__12__Impl rule__CompositeComponent__Group__13 ;
    public final void rule__CompositeComponent__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3177:1: ( rule__CompositeComponent__Group__12__Impl rule__CompositeComponent__Group__13 )
            // InternalAllocation.g:3178:2: rule__CompositeComponent__Group__12__Impl rule__CompositeComponent__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__CompositeComponent__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__12"


    // $ANTLR start "rule__CompositeComponent__Group__12__Impl"
    // InternalAllocation.g:3185:1: rule__CompositeComponent__Group__12__Impl : ( 'assemblycontext' ) ;
    public final void rule__CompositeComponent__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3189:1: ( ( 'assemblycontext' ) )
            // InternalAllocation.g:3190:1: ( 'assemblycontext' )
            {
            // InternalAllocation.g:3190:1: ( 'assemblycontext' )
            // InternalAllocation.g:3191:2: 'assemblycontext'
            {
             before(grammarAccess.getCompositeComponentAccess().getAssemblycontextKeyword_12()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getAssemblycontextKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__12__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__13"
    // InternalAllocation.g:3200:1: rule__CompositeComponent__Group__13 : rule__CompositeComponent__Group__13__Impl rule__CompositeComponent__Group__14 ;
    public final void rule__CompositeComponent__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3204:1: ( rule__CompositeComponent__Group__13__Impl rule__CompositeComponent__Group__14 )
            // InternalAllocation.g:3205:2: rule__CompositeComponent__Group__13__Impl rule__CompositeComponent__Group__14
            {
            pushFollow(FOLLOW_24);
            rule__CompositeComponent__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__13"


    // $ANTLR start "rule__CompositeComponent__Group__13__Impl"
    // InternalAllocation.g:3212:1: rule__CompositeComponent__Group__13__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3216:1: ( ( '{' ) )
            // InternalAllocation.g:3217:1: ( '{' )
            {
            // InternalAllocation.g:3217:1: ( '{' )
            // InternalAllocation.g:3218:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__13__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__14"
    // InternalAllocation.g:3227:1: rule__CompositeComponent__Group__14 : rule__CompositeComponent__Group__14__Impl rule__CompositeComponent__Group__15 ;
    public final void rule__CompositeComponent__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3231:1: ( rule__CompositeComponent__Group__14__Impl rule__CompositeComponent__Group__15 )
            // InternalAllocation.g:3232:2: rule__CompositeComponent__Group__14__Impl rule__CompositeComponent__Group__15
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__14"


    // $ANTLR start "rule__CompositeComponent__Group__14__Impl"
    // InternalAllocation.g:3239:1: rule__CompositeComponent__Group__14__Impl : ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) ) ;
    public final void rule__CompositeComponent__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3243:1: ( ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) ) )
            // InternalAllocation.g:3244:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) )
            {
            // InternalAllocation.g:3244:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) )
            // InternalAllocation.g:3245:2: ( rule__CompositeComponent__AssemblycontextAssignment_14 )
            {
             before(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssignment_14()); 
            // InternalAllocation.g:3246:2: ( rule__CompositeComponent__AssemblycontextAssignment_14 )
            // InternalAllocation.g:3246:3: rule__CompositeComponent__AssemblycontextAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__AssemblycontextAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__14__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__15"
    // InternalAllocation.g:3254:1: rule__CompositeComponent__Group__15 : rule__CompositeComponent__Group__15__Impl rule__CompositeComponent__Group__16 ;
    public final void rule__CompositeComponent__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3258:1: ( rule__CompositeComponent__Group__15__Impl rule__CompositeComponent__Group__16 )
            // InternalAllocation.g:3259:2: rule__CompositeComponent__Group__15__Impl rule__CompositeComponent__Group__16
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__15"


    // $ANTLR start "rule__CompositeComponent__Group__15__Impl"
    // InternalAllocation.g:3266:1: rule__CompositeComponent__Group__15__Impl : ( ( rule__CompositeComponent__Group_15__0 )* ) ;
    public final void rule__CompositeComponent__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3270:1: ( ( ( rule__CompositeComponent__Group_15__0 )* ) )
            // InternalAllocation.g:3271:1: ( ( rule__CompositeComponent__Group_15__0 )* )
            {
            // InternalAllocation.g:3271:1: ( ( rule__CompositeComponent__Group_15__0 )* )
            // InternalAllocation.g:3272:2: ( rule__CompositeComponent__Group_15__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_15()); 
            // InternalAllocation.g:3273:2: ( rule__CompositeComponent__Group_15__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAllocation.g:3273:3: rule__CompositeComponent__Group_15__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeComponent__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__15__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__16"
    // InternalAllocation.g:3281:1: rule__CompositeComponent__Group__16 : rule__CompositeComponent__Group__16__Impl rule__CompositeComponent__Group__17 ;
    public final void rule__CompositeComponent__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3285:1: ( rule__CompositeComponent__Group__16__Impl rule__CompositeComponent__Group__17 )
            // InternalAllocation.g:3286:2: rule__CompositeComponent__Group__16__Impl rule__CompositeComponent__Group__17
            {
            pushFollow(FOLLOW_25);
            rule__CompositeComponent__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__16"


    // $ANTLR start "rule__CompositeComponent__Group__16__Impl"
    // InternalAllocation.g:3293:1: rule__CompositeComponent__Group__16__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3297:1: ( ( '}' ) )
            // InternalAllocation.g:3298:1: ( '}' )
            {
            // InternalAllocation.g:3298:1: ( '}' )
            // InternalAllocation.g:3299:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_16()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__16__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__17"
    // InternalAllocation.g:3308:1: rule__CompositeComponent__Group__17 : rule__CompositeComponent__Group__17__Impl rule__CompositeComponent__Group__18 ;
    public final void rule__CompositeComponent__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3312:1: ( rule__CompositeComponent__Group__17__Impl rule__CompositeComponent__Group__18 )
            // InternalAllocation.g:3313:2: rule__CompositeComponent__Group__17__Impl rule__CompositeComponent__Group__18
            {
            pushFollow(FOLLOW_3);
            rule__CompositeComponent__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__17"


    // $ANTLR start "rule__CompositeComponent__Group__17__Impl"
    // InternalAllocation.g:3320:1: rule__CompositeComponent__Group__17__Impl : ( 'delegationconnector' ) ;
    public final void rule__CompositeComponent__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3324:1: ( ( 'delegationconnector' ) )
            // InternalAllocation.g:3325:1: ( 'delegationconnector' )
            {
            // InternalAllocation.g:3325:1: ( 'delegationconnector' )
            // InternalAllocation.g:3326:2: 'delegationconnector'
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorKeyword_17()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getDelegationconnectorKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__17__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__18"
    // InternalAllocation.g:3335:1: rule__CompositeComponent__Group__18 : rule__CompositeComponent__Group__18__Impl rule__CompositeComponent__Group__19 ;
    public final void rule__CompositeComponent__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3339:1: ( rule__CompositeComponent__Group__18__Impl rule__CompositeComponent__Group__19 )
            // InternalAllocation.g:3340:2: rule__CompositeComponent__Group__18__Impl rule__CompositeComponent__Group__19
            {
            pushFollow(FOLLOW_26);
            rule__CompositeComponent__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__18"


    // $ANTLR start "rule__CompositeComponent__Group__18__Impl"
    // InternalAllocation.g:3347:1: rule__CompositeComponent__Group__18__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3351:1: ( ( '{' ) )
            // InternalAllocation.g:3352:1: ( '{' )
            {
            // InternalAllocation.g:3352:1: ( '{' )
            // InternalAllocation.g:3353:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_18()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__18__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__19"
    // InternalAllocation.g:3362:1: rule__CompositeComponent__Group__19 : rule__CompositeComponent__Group__19__Impl rule__CompositeComponent__Group__20 ;
    public final void rule__CompositeComponent__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3366:1: ( rule__CompositeComponent__Group__19__Impl rule__CompositeComponent__Group__20 )
            // InternalAllocation.g:3367:2: rule__CompositeComponent__Group__19__Impl rule__CompositeComponent__Group__20
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__19"


    // $ANTLR start "rule__CompositeComponent__Group__19__Impl"
    // InternalAllocation.g:3374:1: rule__CompositeComponent__Group__19__Impl : ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) ) ;
    public final void rule__CompositeComponent__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3378:1: ( ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) ) )
            // InternalAllocation.g:3379:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) )
            {
            // InternalAllocation.g:3379:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) )
            // InternalAllocation.g:3380:2: ( rule__CompositeComponent__DelegationconnectorAssignment_19 )
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorAssignment_19()); 
            // InternalAllocation.g:3381:2: ( rule__CompositeComponent__DelegationconnectorAssignment_19 )
            // InternalAllocation.g:3381:3: rule__CompositeComponent__DelegationconnectorAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__DelegationconnectorAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getDelegationconnectorAssignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__19__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__20"
    // InternalAllocation.g:3389:1: rule__CompositeComponent__Group__20 : rule__CompositeComponent__Group__20__Impl rule__CompositeComponent__Group__21 ;
    public final void rule__CompositeComponent__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3393:1: ( rule__CompositeComponent__Group__20__Impl rule__CompositeComponent__Group__21 )
            // InternalAllocation.g:3394:2: rule__CompositeComponent__Group__20__Impl rule__CompositeComponent__Group__21
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__20"


    // $ANTLR start "rule__CompositeComponent__Group__20__Impl"
    // InternalAllocation.g:3401:1: rule__CompositeComponent__Group__20__Impl : ( ( rule__CompositeComponent__Group_20__0 )* ) ;
    public final void rule__CompositeComponent__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3405:1: ( ( ( rule__CompositeComponent__Group_20__0 )* ) )
            // InternalAllocation.g:3406:1: ( ( rule__CompositeComponent__Group_20__0 )* )
            {
            // InternalAllocation.g:3406:1: ( ( rule__CompositeComponent__Group_20__0 )* )
            // InternalAllocation.g:3407:2: ( rule__CompositeComponent__Group_20__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_20()); 
            // InternalAllocation.g:3408:2: ( rule__CompositeComponent__Group_20__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAllocation.g:3408:3: rule__CompositeComponent__Group_20__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeComponent__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__20__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__21"
    // InternalAllocation.g:3416:1: rule__CompositeComponent__Group__21 : rule__CompositeComponent__Group__21__Impl rule__CompositeComponent__Group__22 ;
    public final void rule__CompositeComponent__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3420:1: ( rule__CompositeComponent__Group__21__Impl rule__CompositeComponent__Group__22 )
            // InternalAllocation.g:3421:2: rule__CompositeComponent__Group__21__Impl rule__CompositeComponent__Group__22
            {
            pushFollow(FOLLOW_8);
            rule__CompositeComponent__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__21"


    // $ANTLR start "rule__CompositeComponent__Group__21__Impl"
    // InternalAllocation.g:3428:1: rule__CompositeComponent__Group__21__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3432:1: ( ( '}' ) )
            // InternalAllocation.g:3433:1: ( '}' )
            {
            // InternalAllocation.g:3433:1: ( '}' )
            // InternalAllocation.g:3434:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_21()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__21__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__22"
    // InternalAllocation.g:3443:1: rule__CompositeComponent__Group__22 : rule__CompositeComponent__Group__22__Impl ;
    public final void rule__CompositeComponent__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3447:1: ( rule__CompositeComponent__Group__22__Impl )
            // InternalAllocation.g:3448:2: rule__CompositeComponent__Group__22__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__22__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__22"


    // $ANTLR start "rule__CompositeComponent__Group__22__Impl"
    // InternalAllocation.g:3454:1: rule__CompositeComponent__Group__22__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3458:1: ( ( '}' ) )
            // InternalAllocation.g:3459:1: ( '}' )
            {
            // InternalAllocation.g:3459:1: ( '}' )
            // InternalAllocation.g:3460:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_22()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__22__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__0"
    // InternalAllocation.g:3470:1: rule__CompositeComponent__Group_3__0 : rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1 ;
    public final void rule__CompositeComponent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3474:1: ( rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1 )
            // InternalAllocation.g:3475:2: rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeComponent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__0"


    // $ANTLR start "rule__CompositeComponent__Group_3__0__Impl"
    // InternalAllocation.g:3482:1: rule__CompositeComponent__Group_3__0__Impl : ( 'behaviourdescription' ) ;
    public final void rule__CompositeComponent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3486:1: ( ( 'behaviourdescription' ) )
            // InternalAllocation.g:3487:1: ( 'behaviourdescription' )
            {
            // InternalAllocation.g:3487:1: ( 'behaviourdescription' )
            // InternalAllocation.g:3488:2: 'behaviourdescription'
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__1"
    // InternalAllocation.g:3497:1: rule__CompositeComponent__Group_3__1 : rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2 ;
    public final void rule__CompositeComponent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3501:1: ( rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2 )
            // InternalAllocation.g:3502:2: rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2
            {
            pushFollow(FOLLOW_17);
            rule__CompositeComponent__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__1"


    // $ANTLR start "rule__CompositeComponent__Group_3__1__Impl"
    // InternalAllocation.g:3509:1: rule__CompositeComponent__Group_3__1__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3513:1: ( ( '{' ) )
            // InternalAllocation.g:3514:1: ( '{' )
            {
            // InternalAllocation.g:3514:1: ( '{' )
            // InternalAllocation.g:3515:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__2"
    // InternalAllocation.g:3524:1: rule__CompositeComponent__Group_3__2 : rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3 ;
    public final void rule__CompositeComponent__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3528:1: ( rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3 )
            // InternalAllocation.g:3529:2: rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__2"


    // $ANTLR start "rule__CompositeComponent__Group_3__2__Impl"
    // InternalAllocation.g:3536:1: rule__CompositeComponent__Group_3__2__Impl : ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) ) ;
    public final void rule__CompositeComponent__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3540:1: ( ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) ) )
            // InternalAllocation.g:3541:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) )
            {
            // InternalAllocation.g:3541:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) )
            // InternalAllocation.g:3542:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 )
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionAssignment_3_2()); 
            // InternalAllocation.g:3543:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 )
            // InternalAllocation.g:3543:3: rule__CompositeComponent__BehaviourdescriptionAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__BehaviourdescriptionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__2__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__3"
    // InternalAllocation.g:3551:1: rule__CompositeComponent__Group_3__3 : rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4 ;
    public final void rule__CompositeComponent__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3555:1: ( rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4 )
            // InternalAllocation.g:3556:2: rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__3"


    // $ANTLR start "rule__CompositeComponent__Group_3__3__Impl"
    // InternalAllocation.g:3563:1: rule__CompositeComponent__Group_3__3__Impl : ( ( rule__CompositeComponent__Group_3_3__0 )* ) ;
    public final void rule__CompositeComponent__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3567:1: ( ( ( rule__CompositeComponent__Group_3_3__0 )* ) )
            // InternalAllocation.g:3568:1: ( ( rule__CompositeComponent__Group_3_3__0 )* )
            {
            // InternalAllocation.g:3568:1: ( ( rule__CompositeComponent__Group_3_3__0 )* )
            // InternalAllocation.g:3569:2: ( rule__CompositeComponent__Group_3_3__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_3_3()); 
            // InternalAllocation.g:3570:2: ( rule__CompositeComponent__Group_3_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAllocation.g:3570:3: rule__CompositeComponent__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeComponent__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__3__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__4"
    // InternalAllocation.g:3578:1: rule__CompositeComponent__Group_3__4 : rule__CompositeComponent__Group_3__4__Impl ;
    public final void rule__CompositeComponent__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3582:1: ( rule__CompositeComponent__Group_3__4__Impl )
            // InternalAllocation.g:3583:2: rule__CompositeComponent__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__4"


    // $ANTLR start "rule__CompositeComponent__Group_3__4__Impl"
    // InternalAllocation.g:3589:1: rule__CompositeComponent__Group_3__4__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3593:1: ( ( '}' ) )
            // InternalAllocation.g:3594:1: ( '}' )
            {
            // InternalAllocation.g:3594:1: ( '}' )
            // InternalAllocation.g:3595:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__4__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__0"
    // InternalAllocation.g:3605:1: rule__CompositeComponent__Group_3_3__0 : rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1 ;
    public final void rule__CompositeComponent__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3609:1: ( rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1 )
            // InternalAllocation.g:3610:2: rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1
            {
            pushFollow(FOLLOW_17);
            rule__CompositeComponent__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__0"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__0__Impl"
    // InternalAllocation.g:3617:1: rule__CompositeComponent__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3621:1: ( ( ',' ) )
            // InternalAllocation.g:3622:1: ( ',' )
            {
            // InternalAllocation.g:3622:1: ( ',' )
            // InternalAllocation.g:3623:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__1"
    // InternalAllocation.g:3632:1: rule__CompositeComponent__Group_3_3__1 : rule__CompositeComponent__Group_3_3__1__Impl ;
    public final void rule__CompositeComponent__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3636:1: ( rule__CompositeComponent__Group_3_3__1__Impl )
            // InternalAllocation.g:3637:2: rule__CompositeComponent__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__1"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__1__Impl"
    // InternalAllocation.g:3643:1: rule__CompositeComponent__Group_3_3__1__Impl : ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) ) ;
    public final void rule__CompositeComponent__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3647:1: ( ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) ) )
            // InternalAllocation.g:3648:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) )
            {
            // InternalAllocation.g:3648:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) )
            // InternalAllocation.g:3649:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionAssignment_3_3_1()); 
            // InternalAllocation.g:3650:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 )
            // InternalAllocation.g:3650:3: rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_7__0"
    // InternalAllocation.g:3659:1: rule__CompositeComponent__Group_7__0 : rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1 ;
    public final void rule__CompositeComponent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3663:1: ( rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1 )
            // InternalAllocation.g:3664:2: rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__CompositeComponent__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__0"


    // $ANTLR start "rule__CompositeComponent__Group_7__0__Impl"
    // InternalAllocation.g:3671:1: rule__CompositeComponent__Group_7__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3675:1: ( ( ',' ) )
            // InternalAllocation.g:3676:1: ( ',' )
            {
            // InternalAllocation.g:3676:1: ( ',' )
            // InternalAllocation.g:3677:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_7__1"
    // InternalAllocation.g:3686:1: rule__CompositeComponent__Group_7__1 : rule__CompositeComponent__Group_7__1__Impl ;
    public final void rule__CompositeComponent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3690:1: ( rule__CompositeComponent__Group_7__1__Impl )
            // InternalAllocation.g:3691:2: rule__CompositeComponent__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__1"


    // $ANTLR start "rule__CompositeComponent__Group_7__1__Impl"
    // InternalAllocation.g:3697:1: rule__CompositeComponent__Group_7__1__Impl : ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) ) ;
    public final void rule__CompositeComponent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3701:1: ( ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) ) )
            // InternalAllocation.g:3702:1: ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) )
            {
            // InternalAllocation.g:3702:1: ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) )
            // InternalAllocation.g:3703:2: ( rule__CompositeComponent__ServiceAssignment_7_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getServiceAssignment_7_1()); 
            // InternalAllocation.g:3704:2: ( rule__CompositeComponent__ServiceAssignment_7_1 )
            // InternalAllocation.g:3704:3: rule__CompositeComponent__ServiceAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ServiceAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getServiceAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9__0"
    // InternalAllocation.g:3713:1: rule__CompositeComponent__Group_9__0 : rule__CompositeComponent__Group_9__0__Impl rule__CompositeComponent__Group_9__1 ;
    public final void rule__CompositeComponent__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3717:1: ( rule__CompositeComponent__Group_9__0__Impl rule__CompositeComponent__Group_9__1 )
            // InternalAllocation.g:3718:2: rule__CompositeComponent__Group_9__0__Impl rule__CompositeComponent__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeComponent__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__0"


    // $ANTLR start "rule__CompositeComponent__Group_9__0__Impl"
    // InternalAllocation.g:3725:1: rule__CompositeComponent__Group_9__0__Impl : ( 'requiredrole' ) ;
    public final void rule__CompositeComponent__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3729:1: ( ( 'requiredrole' ) )
            // InternalAllocation.g:3730:1: ( 'requiredrole' )
            {
            // InternalAllocation.g:3730:1: ( 'requiredrole' )
            // InternalAllocation.g:3731:2: 'requiredrole'
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredroleKeyword_9_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRequiredroleKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9__1"
    // InternalAllocation.g:3740:1: rule__CompositeComponent__Group_9__1 : rule__CompositeComponent__Group_9__1__Impl rule__CompositeComponent__Group_9__2 ;
    public final void rule__CompositeComponent__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3744:1: ( rule__CompositeComponent__Group_9__1__Impl rule__CompositeComponent__Group_9__2 )
            // InternalAllocation.g:3745:2: rule__CompositeComponent__Group_9__1__Impl rule__CompositeComponent__Group_9__2
            {
            pushFollow(FOLLOW_18);
            rule__CompositeComponent__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__1"


    // $ANTLR start "rule__CompositeComponent__Group_9__1__Impl"
    // InternalAllocation.g:3752:1: rule__CompositeComponent__Group_9__1__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3756:1: ( ( '{' ) )
            // InternalAllocation.g:3757:1: ( '{' )
            {
            // InternalAllocation.g:3757:1: ( '{' )
            // InternalAllocation.g:3758:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9__2"
    // InternalAllocation.g:3767:1: rule__CompositeComponent__Group_9__2 : rule__CompositeComponent__Group_9__2__Impl rule__CompositeComponent__Group_9__3 ;
    public final void rule__CompositeComponent__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3771:1: ( rule__CompositeComponent__Group_9__2__Impl rule__CompositeComponent__Group_9__3 )
            // InternalAllocation.g:3772:2: rule__CompositeComponent__Group_9__2__Impl rule__CompositeComponent__Group_9__3
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__2"


    // $ANTLR start "rule__CompositeComponent__Group_9__2__Impl"
    // InternalAllocation.g:3779:1: rule__CompositeComponent__Group_9__2__Impl : ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) ) ;
    public final void rule__CompositeComponent__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3783:1: ( ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) ) )
            // InternalAllocation.g:3784:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) )
            {
            // InternalAllocation.g:3784:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) )
            // InternalAllocation.g:3785:2: ( rule__CompositeComponent__RequiredroleAssignment_9_2 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredroleAssignment_9_2()); 
            // InternalAllocation.g:3786:2: ( rule__CompositeComponent__RequiredroleAssignment_9_2 )
            // InternalAllocation.g:3786:3: rule__CompositeComponent__RequiredroleAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__RequiredroleAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredroleAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__2__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9__3"
    // InternalAllocation.g:3794:1: rule__CompositeComponent__Group_9__3 : rule__CompositeComponent__Group_9__3__Impl rule__CompositeComponent__Group_9__4 ;
    public final void rule__CompositeComponent__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3798:1: ( rule__CompositeComponent__Group_9__3__Impl rule__CompositeComponent__Group_9__4 )
            // InternalAllocation.g:3799:2: rule__CompositeComponent__Group_9__3__Impl rule__CompositeComponent__Group_9__4
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__3"


    // $ANTLR start "rule__CompositeComponent__Group_9__3__Impl"
    // InternalAllocation.g:3806:1: rule__CompositeComponent__Group_9__3__Impl : ( ( rule__CompositeComponent__Group_9_3__0 )* ) ;
    public final void rule__CompositeComponent__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3810:1: ( ( ( rule__CompositeComponent__Group_9_3__0 )* ) )
            // InternalAllocation.g:3811:1: ( ( rule__CompositeComponent__Group_9_3__0 )* )
            {
            // InternalAllocation.g:3811:1: ( ( rule__CompositeComponent__Group_9_3__0 )* )
            // InternalAllocation.g:3812:2: ( rule__CompositeComponent__Group_9_3__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_9_3()); 
            // InternalAllocation.g:3813:2: ( rule__CompositeComponent__Group_9_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAllocation.g:3813:3: rule__CompositeComponent__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeComponent__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__3__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9__4"
    // InternalAllocation.g:3821:1: rule__CompositeComponent__Group_9__4 : rule__CompositeComponent__Group_9__4__Impl ;
    public final void rule__CompositeComponent__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3825:1: ( rule__CompositeComponent__Group_9__4__Impl )
            // InternalAllocation.g:3826:2: rule__CompositeComponent__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__4"


    // $ANTLR start "rule__CompositeComponent__Group_9__4__Impl"
    // InternalAllocation.g:3832:1: rule__CompositeComponent__Group_9__4__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3836:1: ( ( '}' ) )
            // InternalAllocation.g:3837:1: ( '}' )
            {
            // InternalAllocation.g:3837:1: ( '}' )
            // InternalAllocation.g:3838:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__4__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9_3__0"
    // InternalAllocation.g:3848:1: rule__CompositeComponent__Group_9_3__0 : rule__CompositeComponent__Group_9_3__0__Impl rule__CompositeComponent__Group_9_3__1 ;
    public final void rule__CompositeComponent__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3852:1: ( rule__CompositeComponent__Group_9_3__0__Impl rule__CompositeComponent__Group_9_3__1 )
            // InternalAllocation.g:3853:2: rule__CompositeComponent__Group_9_3__0__Impl rule__CompositeComponent__Group_9_3__1
            {
            pushFollow(FOLLOW_18);
            rule__CompositeComponent__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9_3__0"


    // $ANTLR start "rule__CompositeComponent__Group_9_3__0__Impl"
    // InternalAllocation.g:3860:1: rule__CompositeComponent__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3864:1: ( ( ',' ) )
            // InternalAllocation.g:3865:1: ( ',' )
            {
            // InternalAllocation.g:3865:1: ( ',' )
            // InternalAllocation.g:3866:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_9_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9_3__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9_3__1"
    // InternalAllocation.g:3875:1: rule__CompositeComponent__Group_9_3__1 : rule__CompositeComponent__Group_9_3__1__Impl ;
    public final void rule__CompositeComponent__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3879:1: ( rule__CompositeComponent__Group_9_3__1__Impl )
            // InternalAllocation.g:3880:2: rule__CompositeComponent__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9_3__1"


    // $ANTLR start "rule__CompositeComponent__Group_9_3__1__Impl"
    // InternalAllocation.g:3886:1: rule__CompositeComponent__Group_9_3__1__Impl : ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) ) ;
    public final void rule__CompositeComponent__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3890:1: ( ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) ) )
            // InternalAllocation.g:3891:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) )
            {
            // InternalAllocation.g:3891:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) )
            // InternalAllocation.g:3892:2: ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredroleAssignment_9_3_1()); 
            // InternalAllocation.g:3893:2: ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 )
            // InternalAllocation.g:3893:3: rule__CompositeComponent__RequiredroleAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__RequiredroleAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredroleAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9_3__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_15__0"
    // InternalAllocation.g:3902:1: rule__CompositeComponent__Group_15__0 : rule__CompositeComponent__Group_15__0__Impl rule__CompositeComponent__Group_15__1 ;
    public final void rule__CompositeComponent__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3906:1: ( rule__CompositeComponent__Group_15__0__Impl rule__CompositeComponent__Group_15__1 )
            // InternalAllocation.g:3907:2: rule__CompositeComponent__Group_15__0__Impl rule__CompositeComponent__Group_15__1
            {
            pushFollow(FOLLOW_24);
            rule__CompositeComponent__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_15__0"


    // $ANTLR start "rule__CompositeComponent__Group_15__0__Impl"
    // InternalAllocation.g:3914:1: rule__CompositeComponent__Group_15__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3918:1: ( ( ',' ) )
            // InternalAllocation.g:3919:1: ( ',' )
            {
            // InternalAllocation.g:3919:1: ( ',' )
            // InternalAllocation.g:3920:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_15_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_15__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_15__1"
    // InternalAllocation.g:3929:1: rule__CompositeComponent__Group_15__1 : rule__CompositeComponent__Group_15__1__Impl ;
    public final void rule__CompositeComponent__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3933:1: ( rule__CompositeComponent__Group_15__1__Impl )
            // InternalAllocation.g:3934:2: rule__CompositeComponent__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_15__1"


    // $ANTLR start "rule__CompositeComponent__Group_15__1__Impl"
    // InternalAllocation.g:3940:1: rule__CompositeComponent__Group_15__1__Impl : ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) ) ;
    public final void rule__CompositeComponent__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3944:1: ( ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) ) )
            // InternalAllocation.g:3945:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) )
            {
            // InternalAllocation.g:3945:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) )
            // InternalAllocation.g:3946:2: ( rule__CompositeComponent__AssemblycontextAssignment_15_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssignment_15_1()); 
            // InternalAllocation.g:3947:2: ( rule__CompositeComponent__AssemblycontextAssignment_15_1 )
            // InternalAllocation.g:3947:3: rule__CompositeComponent__AssemblycontextAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__AssemblycontextAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_15__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_20__0"
    // InternalAllocation.g:3956:1: rule__CompositeComponent__Group_20__0 : rule__CompositeComponent__Group_20__0__Impl rule__CompositeComponent__Group_20__1 ;
    public final void rule__CompositeComponent__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3960:1: ( rule__CompositeComponent__Group_20__0__Impl rule__CompositeComponent__Group_20__1 )
            // InternalAllocation.g:3961:2: rule__CompositeComponent__Group_20__0__Impl rule__CompositeComponent__Group_20__1
            {
            pushFollow(FOLLOW_26);
            rule__CompositeComponent__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_20__0"


    // $ANTLR start "rule__CompositeComponent__Group_20__0__Impl"
    // InternalAllocation.g:3968:1: rule__CompositeComponent__Group_20__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3972:1: ( ( ',' ) )
            // InternalAllocation.g:3973:1: ( ',' )
            {
            // InternalAllocation.g:3973:1: ( ',' )
            // InternalAllocation.g:3974:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_20_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_20__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_20__1"
    // InternalAllocation.g:3983:1: rule__CompositeComponent__Group_20__1 : rule__CompositeComponent__Group_20__1__Impl ;
    public final void rule__CompositeComponent__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3987:1: ( rule__CompositeComponent__Group_20__1__Impl )
            // InternalAllocation.g:3988:2: rule__CompositeComponent__Group_20__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_20__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_20__1"


    // $ANTLR start "rule__CompositeComponent__Group_20__1__Impl"
    // InternalAllocation.g:3994:1: rule__CompositeComponent__Group_20__1__Impl : ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) ) ;
    public final void rule__CompositeComponent__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3998:1: ( ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) ) )
            // InternalAllocation.g:3999:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) )
            {
            // InternalAllocation.g:3999:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) )
            // InternalAllocation.g:4000:2: ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorAssignment_20_1()); 
            // InternalAllocation.g:4001:2: ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 )
            // InternalAllocation.g:4001:3: rule__CompositeComponent__DelegationconnectorAssignment_20_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__DelegationconnectorAssignment_20_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getDelegationconnectorAssignment_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_20__1__Impl"


    // $ANTLR start "rule__InternalAction__Group__0"
    // InternalAllocation.g:4010:1: rule__InternalAction__Group__0 : rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 ;
    public final void rule__InternalAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4014:1: ( rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 )
            // InternalAllocation.g:4015:2: rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__InternalAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__0"


    // $ANTLR start "rule__InternalAction__Group__0__Impl"
    // InternalAllocation.g:4022:1: rule__InternalAction__Group__0__Impl : ( () ) ;
    public final void rule__InternalAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4026:1: ( ( () ) )
            // InternalAllocation.g:4027:1: ( () )
            {
            // InternalAllocation.g:4027:1: ( () )
            // InternalAllocation.g:4028:2: ()
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionAction_0()); 
            // InternalAllocation.g:4029:2: ()
            // InternalAllocation.g:4029:3: 
            {
            }

             after(grammarAccess.getInternalActionAccess().getInternalActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__0__Impl"


    // $ANTLR start "rule__InternalAction__Group__1"
    // InternalAllocation.g:4037:1: rule__InternalAction__Group__1 : rule__InternalAction__Group__1__Impl ;
    public final void rule__InternalAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4041:1: ( rule__InternalAction__Group__1__Impl )
            // InternalAllocation.g:4042:2: rule__InternalAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternalAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__1"


    // $ANTLR start "rule__InternalAction__Group__1__Impl"
    // InternalAllocation.g:4048:1: rule__InternalAction__Group__1__Impl : ( 'InternalAction' ) ;
    public final void rule__InternalAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4052:1: ( ( 'InternalAction' ) )
            // InternalAllocation.g:4053:1: ( 'InternalAction' )
            {
            // InternalAllocation.g:4053:1: ( 'InternalAction' )
            // InternalAllocation.g:4054:2: 'InternalAction'
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getInternalActionAccess().getInternalActionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__1__Impl"


    // $ANTLR start "rule__ExternalCall__Group__0"
    // InternalAllocation.g:4064:1: rule__ExternalCall__Group__0 : rule__ExternalCall__Group__0__Impl rule__ExternalCall__Group__1 ;
    public final void rule__ExternalCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4068:1: ( rule__ExternalCall__Group__0__Impl rule__ExternalCall__Group__1 )
            // InternalAllocation.g:4069:2: rule__ExternalCall__Group__0__Impl rule__ExternalCall__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ExternalCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__0"


    // $ANTLR start "rule__ExternalCall__Group__0__Impl"
    // InternalAllocation.g:4076:1: rule__ExternalCall__Group__0__Impl : ( () ) ;
    public final void rule__ExternalCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4080:1: ( ( () ) )
            // InternalAllocation.g:4081:1: ( () )
            {
            // InternalAllocation.g:4081:1: ( () )
            // InternalAllocation.g:4082:2: ()
            {
             before(grammarAccess.getExternalCallAccess().getExternalCallAction_0()); 
            // InternalAllocation.g:4083:2: ()
            // InternalAllocation.g:4083:3: 
            {
            }

             after(grammarAccess.getExternalCallAccess().getExternalCallAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__0__Impl"


    // $ANTLR start "rule__ExternalCall__Group__1"
    // InternalAllocation.g:4091:1: rule__ExternalCall__Group__1 : rule__ExternalCall__Group__1__Impl ;
    public final void rule__ExternalCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4095:1: ( rule__ExternalCall__Group__1__Impl )
            // InternalAllocation.g:4096:2: rule__ExternalCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__1"


    // $ANTLR start "rule__ExternalCall__Group__1__Impl"
    // InternalAllocation.g:4102:1: rule__ExternalCall__Group__1__Impl : ( 'ExternalCall' ) ;
    public final void rule__ExternalCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4106:1: ( ( 'ExternalCall' ) )
            // InternalAllocation.g:4107:1: ( 'ExternalCall' )
            {
            // InternalAllocation.g:4107:1: ( 'ExternalCall' )
            // InternalAllocation.g:4108:2: 'ExternalCall'
            {
             before(grammarAccess.getExternalCallAccess().getExternalCallKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getExternalCallAccess().getExternalCallKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__0"
    // InternalAllocation.g:4118:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4122:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalAllocation.g:4123:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Loop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // InternalAllocation.g:4130:1: rule__Loop__Group__0__Impl : ( () ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4134:1: ( ( () ) )
            // InternalAllocation.g:4135:1: ( () )
            {
            // InternalAllocation.g:4135:1: ( () )
            // InternalAllocation.g:4136:2: ()
            {
             before(grammarAccess.getLoopAccess().getLoopAction_0()); 
            // InternalAllocation.g:4137:2: ()
            // InternalAllocation.g:4137:3: 
            {
            }

             after(grammarAccess.getLoopAccess().getLoopAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // InternalAllocation.g:4145:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4149:1: ( rule__Loop__Group__1__Impl )
            // InternalAllocation.g:4150:2: rule__Loop__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // InternalAllocation.g:4156:1: rule__Loop__Group__1__Impl : ( 'Loop' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4160:1: ( ( 'Loop' ) )
            // InternalAllocation.g:4161:1: ( 'Loop' )
            {
            // InternalAllocation.g:4161:1: ( 'Loop' )
            // InternalAllocation.g:4162:2: 'Loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Branch__Group__0"
    // InternalAllocation.g:4172:1: rule__Branch__Group__0 : rule__Branch__Group__0__Impl rule__Branch__Group__1 ;
    public final void rule__Branch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4176:1: ( rule__Branch__Group__0__Impl rule__Branch__Group__1 )
            // InternalAllocation.g:4177:2: rule__Branch__Group__0__Impl rule__Branch__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Branch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__0"


    // $ANTLR start "rule__Branch__Group__0__Impl"
    // InternalAllocation.g:4184:1: rule__Branch__Group__0__Impl : ( () ) ;
    public final void rule__Branch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4188:1: ( ( () ) )
            // InternalAllocation.g:4189:1: ( () )
            {
            // InternalAllocation.g:4189:1: ( () )
            // InternalAllocation.g:4190:2: ()
            {
             before(grammarAccess.getBranchAccess().getBranchAction_0()); 
            // InternalAllocation.g:4191:2: ()
            // InternalAllocation.g:4191:3: 
            {
            }

             after(grammarAccess.getBranchAccess().getBranchAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__0__Impl"


    // $ANTLR start "rule__Branch__Group__1"
    // InternalAllocation.g:4199:1: rule__Branch__Group__1 : rule__Branch__Group__1__Impl ;
    public final void rule__Branch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4203:1: ( rule__Branch__Group__1__Impl )
            // InternalAllocation.g:4204:2: rule__Branch__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__1"


    // $ANTLR start "rule__Branch__Group__1__Impl"
    // InternalAllocation.g:4210:1: rule__Branch__Group__1__Impl : ( 'Branch' ) ;
    public final void rule__Branch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4214:1: ( ( 'Branch' ) )
            // InternalAllocation.g:4215:1: ( 'Branch' )
            {
            // InternalAllocation.g:4215:1: ( 'Branch' )
            // InternalAllocation.g:4216:2: 'Branch'
            {
             before(grammarAccess.getBranchAccess().getBranchKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getBranchKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__1__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // InternalAllocation.g:4226:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4230:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalAllocation.g:4231:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Signature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0"


    // $ANTLR start "rule__Signature__Group__0__Impl"
    // InternalAllocation.g:4238:1: rule__Signature__Group__0__Impl : ( 'Signature' ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4242:1: ( ( 'Signature' ) )
            // InternalAllocation.g:4243:1: ( 'Signature' )
            {
            // InternalAllocation.g:4243:1: ( 'Signature' )
            // InternalAllocation.g:4244:2: 'Signature'
            {
             before(grammarAccess.getSignatureAccess().getSignatureKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getSignatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0__Impl"


    // $ANTLR start "rule__Signature__Group__1"
    // InternalAllocation.g:4253:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4257:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalAllocation.g:4258:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Signature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1"


    // $ANTLR start "rule__Signature__Group__1__Impl"
    // InternalAllocation.g:4265:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__NameAssignment_1 ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4269:1: ( ( ( rule__Signature__NameAssignment_1 ) ) )
            // InternalAllocation.g:4270:1: ( ( rule__Signature__NameAssignment_1 ) )
            {
            // InternalAllocation.g:4270:1: ( ( rule__Signature__NameAssignment_1 ) )
            // InternalAllocation.g:4271:2: ( rule__Signature__NameAssignment_1 )
            {
             before(grammarAccess.getSignatureAccess().getNameAssignment_1()); 
            // InternalAllocation.g:4272:2: ( rule__Signature__NameAssignment_1 )
            // InternalAllocation.g:4272:3: rule__Signature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1__Impl"


    // $ANTLR start "rule__Signature__Group__2"
    // InternalAllocation.g:4280:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl rule__Signature__Group__3 ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4284:1: ( rule__Signature__Group__2__Impl rule__Signature__Group__3 )
            // InternalAllocation.g:4285:2: rule__Signature__Group__2__Impl rule__Signature__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Signature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2"


    // $ANTLR start "rule__Signature__Group__2__Impl"
    // InternalAllocation.g:4292:1: rule__Signature__Group__2__Impl : ( '{' ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4296:1: ( ( '{' ) )
            // InternalAllocation.g:4297:1: ( '{' )
            {
            // InternalAllocation.g:4297:1: ( '{' )
            // InternalAllocation.g:4298:2: '{'
            {
             before(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2__Impl"


    // $ANTLR start "rule__Signature__Group__3"
    // InternalAllocation.g:4307:1: rule__Signature__Group__3 : rule__Signature__Group__3__Impl rule__Signature__Group__4 ;
    public final void rule__Signature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4311:1: ( rule__Signature__Group__3__Impl rule__Signature__Group__4 )
            // InternalAllocation.g:4312:2: rule__Signature__Group__3__Impl rule__Signature__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Signature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__3"


    // $ANTLR start "rule__Signature__Group__3__Impl"
    // InternalAllocation.g:4319:1: rule__Signature__Group__3__Impl : ( 'returntype' ) ;
    public final void rule__Signature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4323:1: ( ( 'returntype' ) )
            // InternalAllocation.g:4324:1: ( 'returntype' )
            {
            // InternalAllocation.g:4324:1: ( 'returntype' )
            // InternalAllocation.g:4325:2: 'returntype'
            {
             before(grammarAccess.getSignatureAccess().getReturntypeKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getReturntypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__3__Impl"


    // $ANTLR start "rule__Signature__Group__4"
    // InternalAllocation.g:4334:1: rule__Signature__Group__4 : rule__Signature__Group__4__Impl rule__Signature__Group__5 ;
    public final void rule__Signature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4338:1: ( rule__Signature__Group__4__Impl rule__Signature__Group__5 )
            // InternalAllocation.g:4339:2: rule__Signature__Group__4__Impl rule__Signature__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Signature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__4"


    // $ANTLR start "rule__Signature__Group__4__Impl"
    // InternalAllocation.g:4346:1: rule__Signature__Group__4__Impl : ( ( rule__Signature__ReturntypeAssignment_4 ) ) ;
    public final void rule__Signature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4350:1: ( ( ( rule__Signature__ReturntypeAssignment_4 ) ) )
            // InternalAllocation.g:4351:1: ( ( rule__Signature__ReturntypeAssignment_4 ) )
            {
            // InternalAllocation.g:4351:1: ( ( rule__Signature__ReturntypeAssignment_4 ) )
            // InternalAllocation.g:4352:2: ( rule__Signature__ReturntypeAssignment_4 )
            {
             before(grammarAccess.getSignatureAccess().getReturntypeAssignment_4()); 
            // InternalAllocation.g:4353:2: ( rule__Signature__ReturntypeAssignment_4 )
            // InternalAllocation.g:4353:3: rule__Signature__ReturntypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ReturntypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getReturntypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__4__Impl"


    // $ANTLR start "rule__Signature__Group__5"
    // InternalAllocation.g:4361:1: rule__Signature__Group__5 : rule__Signature__Group__5__Impl rule__Signature__Group__6 ;
    public final void rule__Signature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4365:1: ( rule__Signature__Group__5__Impl rule__Signature__Group__6 )
            // InternalAllocation.g:4366:2: rule__Signature__Group__5__Impl rule__Signature__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Signature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__5"


    // $ANTLR start "rule__Signature__Group__5__Impl"
    // InternalAllocation.g:4373:1: rule__Signature__Group__5__Impl : ( ( rule__Signature__Group_5__0 )? ) ;
    public final void rule__Signature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4377:1: ( ( ( rule__Signature__Group_5__0 )? ) )
            // InternalAllocation.g:4378:1: ( ( rule__Signature__Group_5__0 )? )
            {
            // InternalAllocation.g:4378:1: ( ( rule__Signature__Group_5__0 )? )
            // InternalAllocation.g:4379:2: ( rule__Signature__Group_5__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_5()); 
            // InternalAllocation.g:4380:2: ( rule__Signature__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==52) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAllocation.g:4380:3: rule__Signature__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signature__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignatureAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__5__Impl"


    // $ANTLR start "rule__Signature__Group__6"
    // InternalAllocation.g:4388:1: rule__Signature__Group__6 : rule__Signature__Group__6__Impl ;
    public final void rule__Signature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4392:1: ( rule__Signature__Group__6__Impl )
            // InternalAllocation.g:4393:2: rule__Signature__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__6"


    // $ANTLR start "rule__Signature__Group__6__Impl"
    // InternalAllocation.g:4399:1: rule__Signature__Group__6__Impl : ( '}' ) ;
    public final void rule__Signature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4403:1: ( ( '}' ) )
            // InternalAllocation.g:4404:1: ( '}' )
            {
            // InternalAllocation.g:4404:1: ( '}' )
            // InternalAllocation.g:4405:2: '}'
            {
             before(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__6__Impl"


    // $ANTLR start "rule__Signature__Group_5__0"
    // InternalAllocation.g:4415:1: rule__Signature__Group_5__0 : rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1 ;
    public final void rule__Signature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4419:1: ( rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1 )
            // InternalAllocation.g:4420:2: rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Signature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__0"


    // $ANTLR start "rule__Signature__Group_5__0__Impl"
    // InternalAllocation.g:4427:1: rule__Signature__Group_5__0__Impl : ( 'parameter' ) ;
    public final void rule__Signature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4431:1: ( ( 'parameter' ) )
            // InternalAllocation.g:4432:1: ( 'parameter' )
            {
            // InternalAllocation.g:4432:1: ( 'parameter' )
            // InternalAllocation.g:4433:2: 'parameter'
            {
             before(grammarAccess.getSignatureAccess().getParameterKeyword_5_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getParameterKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__0__Impl"


    // $ANTLR start "rule__Signature__Group_5__1"
    // InternalAllocation.g:4442:1: rule__Signature__Group_5__1 : rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2 ;
    public final void rule__Signature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4446:1: ( rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2 )
            // InternalAllocation.g:4447:2: rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2
            {
            pushFollow(FOLLOW_32);
            rule__Signature__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__1"


    // $ANTLR start "rule__Signature__Group_5__1__Impl"
    // InternalAllocation.g:4454:1: rule__Signature__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Signature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4458:1: ( ( '{' ) )
            // InternalAllocation.g:4459:1: ( '{' )
            {
            // InternalAllocation.g:4459:1: ( '{' )
            // InternalAllocation.g:4460:2: '{'
            {
             before(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__1__Impl"


    // $ANTLR start "rule__Signature__Group_5__2"
    // InternalAllocation.g:4469:1: rule__Signature__Group_5__2 : rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3 ;
    public final void rule__Signature__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4473:1: ( rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3 )
            // InternalAllocation.g:4474:2: rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3
            {
            pushFollow(FOLLOW_6);
            rule__Signature__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__2"


    // $ANTLR start "rule__Signature__Group_5__2__Impl"
    // InternalAllocation.g:4481:1: rule__Signature__Group_5__2__Impl : ( ( rule__Signature__ParameterAssignment_5_2 ) ) ;
    public final void rule__Signature__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4485:1: ( ( ( rule__Signature__ParameterAssignment_5_2 ) ) )
            // InternalAllocation.g:4486:1: ( ( rule__Signature__ParameterAssignment_5_2 ) )
            {
            // InternalAllocation.g:4486:1: ( ( rule__Signature__ParameterAssignment_5_2 ) )
            // InternalAllocation.g:4487:2: ( rule__Signature__ParameterAssignment_5_2 )
            {
             before(grammarAccess.getSignatureAccess().getParameterAssignment_5_2()); 
            // InternalAllocation.g:4488:2: ( rule__Signature__ParameterAssignment_5_2 )
            // InternalAllocation.g:4488:3: rule__Signature__ParameterAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParameterAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParameterAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__2__Impl"


    // $ANTLR start "rule__Signature__Group_5__3"
    // InternalAllocation.g:4496:1: rule__Signature__Group_5__3 : rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4 ;
    public final void rule__Signature__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4500:1: ( rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4 )
            // InternalAllocation.g:4501:2: rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4
            {
            pushFollow(FOLLOW_6);
            rule__Signature__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__3"


    // $ANTLR start "rule__Signature__Group_5__3__Impl"
    // InternalAllocation.g:4508:1: rule__Signature__Group_5__3__Impl : ( ( rule__Signature__Group_5_3__0 )* ) ;
    public final void rule__Signature__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4512:1: ( ( ( rule__Signature__Group_5_3__0 )* ) )
            // InternalAllocation.g:4513:1: ( ( rule__Signature__Group_5_3__0 )* )
            {
            // InternalAllocation.g:4513:1: ( ( rule__Signature__Group_5_3__0 )* )
            // InternalAllocation.g:4514:2: ( rule__Signature__Group_5_3__0 )*
            {
             before(grammarAccess.getSignatureAccess().getGroup_5_3()); 
            // InternalAllocation.g:4515:2: ( rule__Signature__Group_5_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAllocation.g:4515:3: rule__Signature__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Signature__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSignatureAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__3__Impl"


    // $ANTLR start "rule__Signature__Group_5__4"
    // InternalAllocation.g:4523:1: rule__Signature__Group_5__4 : rule__Signature__Group_5__4__Impl ;
    public final void rule__Signature__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4527:1: ( rule__Signature__Group_5__4__Impl )
            // InternalAllocation.g:4528:2: rule__Signature__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__4"


    // $ANTLR start "rule__Signature__Group_5__4__Impl"
    // InternalAllocation.g:4534:1: rule__Signature__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Signature__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4538:1: ( ( '}' ) )
            // InternalAllocation.g:4539:1: ( '}' )
            {
            // InternalAllocation.g:4539:1: ( '}' )
            // InternalAllocation.g:4540:2: '}'
            {
             before(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__4__Impl"


    // $ANTLR start "rule__Signature__Group_5_3__0"
    // InternalAllocation.g:4550:1: rule__Signature__Group_5_3__0 : rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1 ;
    public final void rule__Signature__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4554:1: ( rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1 )
            // InternalAllocation.g:4555:2: rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1
            {
            pushFollow(FOLLOW_32);
            rule__Signature__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__0"


    // $ANTLR start "rule__Signature__Group_5_3__0__Impl"
    // InternalAllocation.g:4562:1: rule__Signature__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Signature__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4566:1: ( ( ',' ) )
            // InternalAllocation.g:4567:1: ( ',' )
            {
            // InternalAllocation.g:4567:1: ( ',' )
            // InternalAllocation.g:4568:2: ','
            {
             before(grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__0__Impl"


    // $ANTLR start "rule__Signature__Group_5_3__1"
    // InternalAllocation.g:4577:1: rule__Signature__Group_5_3__1 : rule__Signature__Group_5_3__1__Impl ;
    public final void rule__Signature__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4581:1: ( rule__Signature__Group_5_3__1__Impl )
            // InternalAllocation.g:4582:2: rule__Signature__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__1"


    // $ANTLR start "rule__Signature__Group_5_3__1__Impl"
    // InternalAllocation.g:4588:1: rule__Signature__Group_5_3__1__Impl : ( ( rule__Signature__ParameterAssignment_5_3_1 ) ) ;
    public final void rule__Signature__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4592:1: ( ( ( rule__Signature__ParameterAssignment_5_3_1 ) ) )
            // InternalAllocation.g:4593:1: ( ( rule__Signature__ParameterAssignment_5_3_1 ) )
            {
            // InternalAllocation.g:4593:1: ( ( rule__Signature__ParameterAssignment_5_3_1 ) )
            // InternalAllocation.g:4594:2: ( rule__Signature__ParameterAssignment_5_3_1 )
            {
             before(grammarAccess.getSignatureAccess().getParameterAssignment_5_3_1()); 
            // InternalAllocation.g:4595:2: ( rule__Signature__ParameterAssignment_5_3_1 )
            // InternalAllocation.g:4595:3: rule__Signature__ParameterAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParameterAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParameterAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalAllocation.g:4604:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4608:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalAllocation.g:4609:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalAllocation.g:4616:1: rule__Parameter__Group__0__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4620:1: ( ( 'Parameter' ) )
            // InternalAllocation.g:4621:1: ( 'Parameter' )
            {
            // InternalAllocation.g:4621:1: ( 'Parameter' )
            // InternalAllocation.g:4622:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalAllocation.g:4631:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4635:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalAllocation.g:4636:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalAllocation.g:4643:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4647:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalAllocation.g:4648:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalAllocation.g:4648:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalAllocation.g:4649:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalAllocation.g:4650:2: ( rule__Parameter__NameAssignment_1 )
            // InternalAllocation.g:4650:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalAllocation.g:4658:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4662:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalAllocation.g:4663:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalAllocation.g:4670:1: rule__Parameter__Group__2__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4674:1: ( ( '{' ) )
            // InternalAllocation.g:4675:1: ( '{' )
            {
            // InternalAllocation.g:4675:1: ( '{' )
            // InternalAllocation.g:4676:2: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalAllocation.g:4685:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4689:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalAllocation.g:4690:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalAllocation.g:4697:1: rule__Parameter__Group__3__Impl : ( 'parametertype' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4701:1: ( ( 'parametertype' ) )
            // InternalAllocation.g:4702:1: ( 'parametertype' )
            {
            // InternalAllocation.g:4702:1: ( 'parametertype' )
            // InternalAllocation.g:4703:2: 'parametertype'
            {
             before(grammarAccess.getParameterAccess().getParametertypeKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParametertypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalAllocation.g:4712:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4716:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalAllocation.g:4717:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalAllocation.g:4724:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__ParametertypeAssignment_4 ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4728:1: ( ( ( rule__Parameter__ParametertypeAssignment_4 ) ) )
            // InternalAllocation.g:4729:1: ( ( rule__Parameter__ParametertypeAssignment_4 ) )
            {
            // InternalAllocation.g:4729:1: ( ( rule__Parameter__ParametertypeAssignment_4 ) )
            // InternalAllocation.g:4730:2: ( rule__Parameter__ParametertypeAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getParametertypeAssignment_4()); 
            // InternalAllocation.g:4731:2: ( rule__Parameter__ParametertypeAssignment_4 )
            // InternalAllocation.g:4731:3: rule__Parameter__ParametertypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ParametertypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getParametertypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalAllocation.g:4739:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4743:1: ( rule__Parameter__Group__5__Impl )
            // InternalAllocation.g:4744:2: rule__Parameter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalAllocation.g:4750:1: rule__Parameter__Group__5__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4754:1: ( ( '}' ) )
            // InternalAllocation.g:4755:1: ( '}' )
            {
            // InternalAllocation.g:4755:1: ( '}' )
            // InternalAllocation.g:4756:2: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__ReturnType_Impl__Group__0"
    // InternalAllocation.g:4766:1: rule__ReturnType_Impl__Group__0 : rule__ReturnType_Impl__Group__0__Impl rule__ReturnType_Impl__Group__1 ;
    public final void rule__ReturnType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4770:1: ( rule__ReturnType_Impl__Group__0__Impl rule__ReturnType_Impl__Group__1 )
            // InternalAllocation.g:4771:2: rule__ReturnType_Impl__Group__0__Impl rule__ReturnType_Impl__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ReturnType_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnType_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType_Impl__Group__0"


    // $ANTLR start "rule__ReturnType_Impl__Group__0__Impl"
    // InternalAllocation.g:4778:1: rule__ReturnType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ReturnType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4782:1: ( ( () ) )
            // InternalAllocation.g:4783:1: ( () )
            {
            // InternalAllocation.g:4783:1: ( () )
            // InternalAllocation.g:4784:2: ()
            {
             before(grammarAccess.getReturnType_ImplAccess().getReturnTypeAction_0()); 
            // InternalAllocation.g:4785:2: ()
            // InternalAllocation.g:4785:3: 
            {
            }

             after(grammarAccess.getReturnType_ImplAccess().getReturnTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType_Impl__Group__0__Impl"


    // $ANTLR start "rule__ReturnType_Impl__Group__1"
    // InternalAllocation.g:4793:1: rule__ReturnType_Impl__Group__1 : rule__ReturnType_Impl__Group__1__Impl rule__ReturnType_Impl__Group__2 ;
    public final void rule__ReturnType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4797:1: ( rule__ReturnType_Impl__Group__1__Impl rule__ReturnType_Impl__Group__2 )
            // InternalAllocation.g:4798:2: rule__ReturnType_Impl__Group__1__Impl rule__ReturnType_Impl__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ReturnType_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnType_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType_Impl__Group__1"


    // $ANTLR start "rule__ReturnType_Impl__Group__1__Impl"
    // InternalAllocation.g:4805:1: rule__ReturnType_Impl__Group__1__Impl : ( 'ReturnType' ) ;
    public final void rule__ReturnType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4809:1: ( ( 'ReturnType' ) )
            // InternalAllocation.g:4810:1: ( 'ReturnType' )
            {
            // InternalAllocation.g:4810:1: ( 'ReturnType' )
            // InternalAllocation.g:4811:2: 'ReturnType'
            {
             before(grammarAccess.getReturnType_ImplAccess().getReturnTypeKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getReturnType_ImplAccess().getReturnTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType_Impl__Group__1__Impl"


    // $ANTLR start "rule__ReturnType_Impl__Group__2"
    // InternalAllocation.g:4820:1: rule__ReturnType_Impl__Group__2 : rule__ReturnType_Impl__Group__2__Impl ;
    public final void rule__ReturnType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4824:1: ( rule__ReturnType_Impl__Group__2__Impl )
            // InternalAllocation.g:4825:2: rule__ReturnType_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnType_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType_Impl__Group__2"


    // $ANTLR start "rule__ReturnType_Impl__Group__2__Impl"
    // InternalAllocation.g:4831:1: rule__ReturnType_Impl__Group__2__Impl : ( ( rule__ReturnType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ReturnType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4835:1: ( ( ( rule__ReturnType_Impl__NameAssignment_2 ) ) )
            // InternalAllocation.g:4836:1: ( ( rule__ReturnType_Impl__NameAssignment_2 ) )
            {
            // InternalAllocation.g:4836:1: ( ( rule__ReturnType_Impl__NameAssignment_2 ) )
            // InternalAllocation.g:4837:2: ( rule__ReturnType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getReturnType_ImplAccess().getNameAssignment_2()); 
            // InternalAllocation.g:4838:2: ( rule__ReturnType_Impl__NameAssignment_2 )
            // InternalAllocation.g:4838:3: rule__ReturnType_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReturnType_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReturnType_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType_Impl__Group__2__Impl"


    // $ANTLR start "rule__ParameterType_Impl__Group__0"
    // InternalAllocation.g:4847:1: rule__ParameterType_Impl__Group__0 : rule__ParameterType_Impl__Group__0__Impl rule__ParameterType_Impl__Group__1 ;
    public final void rule__ParameterType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4851:1: ( rule__ParameterType_Impl__Group__0__Impl rule__ParameterType_Impl__Group__1 )
            // InternalAllocation.g:4852:2: rule__ParameterType_Impl__Group__0__Impl rule__ParameterType_Impl__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ParameterType_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterType_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__Group__0"


    // $ANTLR start "rule__ParameterType_Impl__Group__0__Impl"
    // InternalAllocation.g:4859:1: rule__ParameterType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ParameterType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4863:1: ( ( () ) )
            // InternalAllocation.g:4864:1: ( () )
            {
            // InternalAllocation.g:4864:1: ( () )
            // InternalAllocation.g:4865:2: ()
            {
             before(grammarAccess.getParameterType_ImplAccess().getParameterTypeAction_0()); 
            // InternalAllocation.g:4866:2: ()
            // InternalAllocation.g:4866:3: 
            {
            }

             after(grammarAccess.getParameterType_ImplAccess().getParameterTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__Group__0__Impl"


    // $ANTLR start "rule__ParameterType_Impl__Group__1"
    // InternalAllocation.g:4874:1: rule__ParameterType_Impl__Group__1 : rule__ParameterType_Impl__Group__1__Impl rule__ParameterType_Impl__Group__2 ;
    public final void rule__ParameterType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4878:1: ( rule__ParameterType_Impl__Group__1__Impl rule__ParameterType_Impl__Group__2 )
            // InternalAllocation.g:4879:2: rule__ParameterType_Impl__Group__1__Impl rule__ParameterType_Impl__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ParameterType_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterType_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__Group__1"


    // $ANTLR start "rule__ParameterType_Impl__Group__1__Impl"
    // InternalAllocation.g:4886:1: rule__ParameterType_Impl__Group__1__Impl : ( 'ParameterType' ) ;
    public final void rule__ParameterType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4890:1: ( ( 'ParameterType' ) )
            // InternalAllocation.g:4891:1: ( 'ParameterType' )
            {
            // InternalAllocation.g:4891:1: ( 'ParameterType' )
            // InternalAllocation.g:4892:2: 'ParameterType'
            {
             before(grammarAccess.getParameterType_ImplAccess().getParameterTypeKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getParameterType_ImplAccess().getParameterTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__Group__1__Impl"


    // $ANTLR start "rule__ParameterType_Impl__Group__2"
    // InternalAllocation.g:4901:1: rule__ParameterType_Impl__Group__2 : rule__ParameterType_Impl__Group__2__Impl ;
    public final void rule__ParameterType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4905:1: ( rule__ParameterType_Impl__Group__2__Impl )
            // InternalAllocation.g:4906:2: rule__ParameterType_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__Group__2"


    // $ANTLR start "rule__ParameterType_Impl__Group__2__Impl"
    // InternalAllocation.g:4912:1: rule__ParameterType_Impl__Group__2__Impl : ( ( rule__ParameterType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ParameterType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4916:1: ( ( ( rule__ParameterType_Impl__NameAssignment_2 ) ) )
            // InternalAllocation.g:4917:1: ( ( rule__ParameterType_Impl__NameAssignment_2 ) )
            {
            // InternalAllocation.g:4917:1: ( ( rule__ParameterType_Impl__NameAssignment_2 ) )
            // InternalAllocation.g:4918:2: ( rule__ParameterType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getParameterType_ImplAccess().getNameAssignment_2()); 
            // InternalAllocation.g:4919:2: ( rule__ParameterType_Impl__NameAssignment_2 )
            // InternalAllocation.g:4919:3: rule__ParameterType_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterType_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__Group__2__Impl"


    // $ANTLR start "rule__Simple__Group__0"
    // InternalAllocation.g:4928:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4932:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalAllocation.g:4933:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Simple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__0"


    // $ANTLR start "rule__Simple__Group__0__Impl"
    // InternalAllocation.g:4940:1: rule__Simple__Group__0__Impl : ( () ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4944:1: ( ( () ) )
            // InternalAllocation.g:4945:1: ( () )
            {
            // InternalAllocation.g:4945:1: ( () )
            // InternalAllocation.g:4946:2: ()
            {
             before(grammarAccess.getSimpleAccess().getSimpleAction_0()); 
            // InternalAllocation.g:4947:2: ()
            // InternalAllocation.g:4947:3: 
            {
            }

             after(grammarAccess.getSimpleAccess().getSimpleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__0__Impl"


    // $ANTLR start "rule__Simple__Group__1"
    // InternalAllocation.g:4955:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl rule__Simple__Group__2 ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4959:1: ( rule__Simple__Group__1__Impl rule__Simple__Group__2 )
            // InternalAllocation.g:4960:2: rule__Simple__Group__1__Impl rule__Simple__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Simple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__1"


    // $ANTLR start "rule__Simple__Group__1__Impl"
    // InternalAllocation.g:4967:1: rule__Simple__Group__1__Impl : ( 'Simple' ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4971:1: ( ( 'Simple' ) )
            // InternalAllocation.g:4972:1: ( 'Simple' )
            {
            // InternalAllocation.g:4972:1: ( 'Simple' )
            // InternalAllocation.g:4973:2: 'Simple'
            {
             before(grammarAccess.getSimpleAccess().getSimpleKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getSimpleAccess().getSimpleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__1__Impl"


    // $ANTLR start "rule__Simple__Group__2"
    // InternalAllocation.g:4982:1: rule__Simple__Group__2 : rule__Simple__Group__2__Impl rule__Simple__Group__3 ;
    public final void rule__Simple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4986:1: ( rule__Simple__Group__2__Impl rule__Simple__Group__3 )
            // InternalAllocation.g:4987:2: rule__Simple__Group__2__Impl rule__Simple__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Simple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__2"


    // $ANTLR start "rule__Simple__Group__2__Impl"
    // InternalAllocation.g:4994:1: rule__Simple__Group__2__Impl : ( ( rule__Simple__NameAssignment_2 ) ) ;
    public final void rule__Simple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4998:1: ( ( ( rule__Simple__NameAssignment_2 ) ) )
            // InternalAllocation.g:4999:1: ( ( rule__Simple__NameAssignment_2 ) )
            {
            // InternalAllocation.g:4999:1: ( ( rule__Simple__NameAssignment_2 ) )
            // InternalAllocation.g:5000:2: ( rule__Simple__NameAssignment_2 )
            {
             before(grammarAccess.getSimpleAccess().getNameAssignment_2()); 
            // InternalAllocation.g:5001:2: ( rule__Simple__NameAssignment_2 )
            // InternalAllocation.g:5001:3: rule__Simple__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Simple__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__2__Impl"


    // $ANTLR start "rule__Simple__Group__3"
    // InternalAllocation.g:5009:1: rule__Simple__Group__3 : rule__Simple__Group__3__Impl rule__Simple__Group__4 ;
    public final void rule__Simple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5013:1: ( rule__Simple__Group__3__Impl rule__Simple__Group__4 )
            // InternalAllocation.g:5014:2: rule__Simple__Group__3__Impl rule__Simple__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__Simple__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__3"


    // $ANTLR start "rule__Simple__Group__3__Impl"
    // InternalAllocation.g:5021:1: rule__Simple__Group__3__Impl : ( '{' ) ;
    public final void rule__Simple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5025:1: ( ( '{' ) )
            // InternalAllocation.g:5026:1: ( '{' )
            {
            // InternalAllocation.g:5026:1: ( '{' )
            // InternalAllocation.g:5027:2: '{'
            {
             before(grammarAccess.getSimpleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSimpleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__3__Impl"


    // $ANTLR start "rule__Simple__Group__4"
    // InternalAllocation.g:5036:1: rule__Simple__Group__4 : rule__Simple__Group__4__Impl rule__Simple__Group__5 ;
    public final void rule__Simple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5040:1: ( rule__Simple__Group__4__Impl rule__Simple__Group__5 )
            // InternalAllocation.g:5041:2: rule__Simple__Group__4__Impl rule__Simple__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__Simple__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__4"


    // $ANTLR start "rule__Simple__Group__4__Impl"
    // InternalAllocation.g:5048:1: rule__Simple__Group__4__Impl : ( ( rule__Simple__Group_4__0 )? ) ;
    public final void rule__Simple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5052:1: ( ( ( rule__Simple__Group_4__0 )? ) )
            // InternalAllocation.g:5053:1: ( ( rule__Simple__Group_4__0 )? )
            {
            // InternalAllocation.g:5053:1: ( ( rule__Simple__Group_4__0 )? )
            // InternalAllocation.g:5054:2: ( rule__Simple__Group_4__0 )?
            {
             before(grammarAccess.getSimpleAccess().getGroup_4()); 
            // InternalAllocation.g:5055:2: ( rule__Simple__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==58) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAllocation.g:5055:3: rule__Simple__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__4__Impl"


    // $ANTLR start "rule__Simple__Group__5"
    // InternalAllocation.g:5063:1: rule__Simple__Group__5 : rule__Simple__Group__5__Impl ;
    public final void rule__Simple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5067:1: ( rule__Simple__Group__5__Impl )
            // InternalAllocation.g:5068:2: rule__Simple__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__5"


    // $ANTLR start "rule__Simple__Group__5__Impl"
    // InternalAllocation.g:5074:1: rule__Simple__Group__5__Impl : ( '}' ) ;
    public final void rule__Simple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5078:1: ( ( '}' ) )
            // InternalAllocation.g:5079:1: ( '}' )
            {
            // InternalAllocation.g:5079:1: ( '}' )
            // InternalAllocation.g:5080:2: '}'
            {
             before(grammarAccess.getSimpleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSimpleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__5__Impl"


    // $ANTLR start "rule__Simple__Group_4__0"
    // InternalAllocation.g:5090:1: rule__Simple__Group_4__0 : rule__Simple__Group_4__0__Impl rule__Simple__Group_4__1 ;
    public final void rule__Simple__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5094:1: ( rule__Simple__Group_4__0__Impl rule__Simple__Group_4__1 )
            // InternalAllocation.g:5095:2: rule__Simple__Group_4__0__Impl rule__Simple__Group_4__1
            {
            pushFollow(FOLLOW_38);
            rule__Simple__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group_4__0"


    // $ANTLR start "rule__Simple__Group_4__0__Impl"
    // InternalAllocation.g:5102:1: rule__Simple__Group_4__0__Impl : ( 'kind' ) ;
    public final void rule__Simple__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5106:1: ( ( 'kind' ) )
            // InternalAllocation.g:5107:1: ( 'kind' )
            {
            // InternalAllocation.g:5107:1: ( 'kind' )
            // InternalAllocation.g:5108:2: 'kind'
            {
             before(grammarAccess.getSimpleAccess().getKindKeyword_4_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getSimpleAccess().getKindKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group_4__0__Impl"


    // $ANTLR start "rule__Simple__Group_4__1"
    // InternalAllocation.g:5117:1: rule__Simple__Group_4__1 : rule__Simple__Group_4__1__Impl ;
    public final void rule__Simple__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5121:1: ( rule__Simple__Group_4__1__Impl )
            // InternalAllocation.g:5122:2: rule__Simple__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group_4__1"


    // $ANTLR start "rule__Simple__Group_4__1__Impl"
    // InternalAllocation.g:5128:1: rule__Simple__Group_4__1__Impl : ( ( rule__Simple__KindAssignment_4_1 ) ) ;
    public final void rule__Simple__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5132:1: ( ( ( rule__Simple__KindAssignment_4_1 ) ) )
            // InternalAllocation.g:5133:1: ( ( rule__Simple__KindAssignment_4_1 ) )
            {
            // InternalAllocation.g:5133:1: ( ( rule__Simple__KindAssignment_4_1 ) )
            // InternalAllocation.g:5134:2: ( rule__Simple__KindAssignment_4_1 )
            {
             before(grammarAccess.getSimpleAccess().getKindAssignment_4_1()); 
            // InternalAllocation.g:5135:2: ( rule__Simple__KindAssignment_4_1 )
            // InternalAllocation.g:5135:3: rule__Simple__KindAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Simple__KindAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getKindAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group_4__1__Impl"


    // $ANTLR start "rule__Complex__Group__0"
    // InternalAllocation.g:5144:1: rule__Complex__Group__0 : rule__Complex__Group__0__Impl rule__Complex__Group__1 ;
    public final void rule__Complex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5148:1: ( rule__Complex__Group__0__Impl rule__Complex__Group__1 )
            // InternalAllocation.g:5149:2: rule__Complex__Group__0__Impl rule__Complex__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Complex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__0"


    // $ANTLR start "rule__Complex__Group__0__Impl"
    // InternalAllocation.g:5156:1: rule__Complex__Group__0__Impl : ( 'Complex' ) ;
    public final void rule__Complex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5160:1: ( ( 'Complex' ) )
            // InternalAllocation.g:5161:1: ( 'Complex' )
            {
            // InternalAllocation.g:5161:1: ( 'Complex' )
            // InternalAllocation.g:5162:2: 'Complex'
            {
             before(grammarAccess.getComplexAccess().getComplexKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getComplexKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__0__Impl"


    // $ANTLR start "rule__Complex__Group__1"
    // InternalAllocation.g:5171:1: rule__Complex__Group__1 : rule__Complex__Group__1__Impl rule__Complex__Group__2 ;
    public final void rule__Complex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5175:1: ( rule__Complex__Group__1__Impl rule__Complex__Group__2 )
            // InternalAllocation.g:5176:2: rule__Complex__Group__1__Impl rule__Complex__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Complex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__1"


    // $ANTLR start "rule__Complex__Group__1__Impl"
    // InternalAllocation.g:5183:1: rule__Complex__Group__1__Impl : ( ( rule__Complex__NameAssignment_1 ) ) ;
    public final void rule__Complex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5187:1: ( ( ( rule__Complex__NameAssignment_1 ) ) )
            // InternalAllocation.g:5188:1: ( ( rule__Complex__NameAssignment_1 ) )
            {
            // InternalAllocation.g:5188:1: ( ( rule__Complex__NameAssignment_1 ) )
            // InternalAllocation.g:5189:2: ( rule__Complex__NameAssignment_1 )
            {
             before(grammarAccess.getComplexAccess().getNameAssignment_1()); 
            // InternalAllocation.g:5190:2: ( rule__Complex__NameAssignment_1 )
            // InternalAllocation.g:5190:3: rule__Complex__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Complex__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__1__Impl"


    // $ANTLR start "rule__Complex__Group__2"
    // InternalAllocation.g:5198:1: rule__Complex__Group__2 : rule__Complex__Group__2__Impl rule__Complex__Group__3 ;
    public final void rule__Complex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5202:1: ( rule__Complex__Group__2__Impl rule__Complex__Group__3 )
            // InternalAllocation.g:5203:2: rule__Complex__Group__2__Impl rule__Complex__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Complex__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__2"


    // $ANTLR start "rule__Complex__Group__2__Impl"
    // InternalAllocation.g:5210:1: rule__Complex__Group__2__Impl : ( '{' ) ;
    public final void rule__Complex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5214:1: ( ( '{' ) )
            // InternalAllocation.g:5215:1: ( '{' )
            {
            // InternalAllocation.g:5215:1: ( '{' )
            // InternalAllocation.g:5216:2: '{'
            {
             before(grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__2__Impl"


    // $ANTLR start "rule__Complex__Group__3"
    // InternalAllocation.g:5225:1: rule__Complex__Group__3 : rule__Complex__Group__3__Impl rule__Complex__Group__4 ;
    public final void rule__Complex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5229:1: ( rule__Complex__Group__3__Impl rule__Complex__Group__4 )
            // InternalAllocation.g:5230:2: rule__Complex__Group__3__Impl rule__Complex__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Complex__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__3"


    // $ANTLR start "rule__Complex__Group__3__Impl"
    // InternalAllocation.g:5237:1: rule__Complex__Group__3__Impl : ( 'simple' ) ;
    public final void rule__Complex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5241:1: ( ( 'simple' ) )
            // InternalAllocation.g:5242:1: ( 'simple' )
            {
            // InternalAllocation.g:5242:1: ( 'simple' )
            // InternalAllocation.g:5243:2: 'simple'
            {
             before(grammarAccess.getComplexAccess().getSimpleKeyword_3()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getSimpleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__3__Impl"


    // $ANTLR start "rule__Complex__Group__4"
    // InternalAllocation.g:5252:1: rule__Complex__Group__4 : rule__Complex__Group__4__Impl rule__Complex__Group__5 ;
    public final void rule__Complex__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5256:1: ( rule__Complex__Group__4__Impl rule__Complex__Group__5 )
            // InternalAllocation.g:5257:2: rule__Complex__Group__4__Impl rule__Complex__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Complex__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__4"


    // $ANTLR start "rule__Complex__Group__4__Impl"
    // InternalAllocation.g:5264:1: rule__Complex__Group__4__Impl : ( '{' ) ;
    public final void rule__Complex__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5268:1: ( ( '{' ) )
            // InternalAllocation.g:5269:1: ( '{' )
            {
            // InternalAllocation.g:5269:1: ( '{' )
            // InternalAllocation.g:5270:2: '{'
            {
             before(grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__4__Impl"


    // $ANTLR start "rule__Complex__Group__5"
    // InternalAllocation.g:5279:1: rule__Complex__Group__5 : rule__Complex__Group__5__Impl rule__Complex__Group__6 ;
    public final void rule__Complex__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5283:1: ( rule__Complex__Group__5__Impl rule__Complex__Group__6 )
            // InternalAllocation.g:5284:2: rule__Complex__Group__5__Impl rule__Complex__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Complex__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__5"


    // $ANTLR start "rule__Complex__Group__5__Impl"
    // InternalAllocation.g:5291:1: rule__Complex__Group__5__Impl : ( ( rule__Complex__SimpleAssignment_5 ) ) ;
    public final void rule__Complex__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5295:1: ( ( ( rule__Complex__SimpleAssignment_5 ) ) )
            // InternalAllocation.g:5296:1: ( ( rule__Complex__SimpleAssignment_5 ) )
            {
            // InternalAllocation.g:5296:1: ( ( rule__Complex__SimpleAssignment_5 ) )
            // InternalAllocation.g:5297:2: ( rule__Complex__SimpleAssignment_5 )
            {
             before(grammarAccess.getComplexAccess().getSimpleAssignment_5()); 
            // InternalAllocation.g:5298:2: ( rule__Complex__SimpleAssignment_5 )
            // InternalAllocation.g:5298:3: rule__Complex__SimpleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Complex__SimpleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComplexAccess().getSimpleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__5__Impl"


    // $ANTLR start "rule__Complex__Group__6"
    // InternalAllocation.g:5306:1: rule__Complex__Group__6 : rule__Complex__Group__6__Impl rule__Complex__Group__7 ;
    public final void rule__Complex__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5310:1: ( rule__Complex__Group__6__Impl rule__Complex__Group__7 )
            // InternalAllocation.g:5311:2: rule__Complex__Group__6__Impl rule__Complex__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Complex__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__6"


    // $ANTLR start "rule__Complex__Group__6__Impl"
    // InternalAllocation.g:5318:1: rule__Complex__Group__6__Impl : ( ( rule__Complex__Group_6__0 )* ) ;
    public final void rule__Complex__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5322:1: ( ( ( rule__Complex__Group_6__0 )* ) )
            // InternalAllocation.g:5323:1: ( ( rule__Complex__Group_6__0 )* )
            {
            // InternalAllocation.g:5323:1: ( ( rule__Complex__Group_6__0 )* )
            // InternalAllocation.g:5324:2: ( rule__Complex__Group_6__0 )*
            {
             before(grammarAccess.getComplexAccess().getGroup_6()); 
            // InternalAllocation.g:5325:2: ( rule__Complex__Group_6__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAllocation.g:5325:3: rule__Complex__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Complex__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getComplexAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__6__Impl"


    // $ANTLR start "rule__Complex__Group__7"
    // InternalAllocation.g:5333:1: rule__Complex__Group__7 : rule__Complex__Group__7__Impl rule__Complex__Group__8 ;
    public final void rule__Complex__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5337:1: ( rule__Complex__Group__7__Impl rule__Complex__Group__8 )
            // InternalAllocation.g:5338:2: rule__Complex__Group__7__Impl rule__Complex__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Complex__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__7"


    // $ANTLR start "rule__Complex__Group__7__Impl"
    // InternalAllocation.g:5345:1: rule__Complex__Group__7__Impl : ( '}' ) ;
    public final void rule__Complex__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5349:1: ( ( '}' ) )
            // InternalAllocation.g:5350:1: ( '}' )
            {
            // InternalAllocation.g:5350:1: ( '}' )
            // InternalAllocation.g:5351:2: '}'
            {
             before(grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__7__Impl"


    // $ANTLR start "rule__Complex__Group__8"
    // InternalAllocation.g:5360:1: rule__Complex__Group__8 : rule__Complex__Group__8__Impl ;
    public final void rule__Complex__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5364:1: ( rule__Complex__Group__8__Impl )
            // InternalAllocation.g:5365:2: rule__Complex__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Complex__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__8"


    // $ANTLR start "rule__Complex__Group__8__Impl"
    // InternalAllocation.g:5371:1: rule__Complex__Group__8__Impl : ( '}' ) ;
    public final void rule__Complex__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5375:1: ( ( '}' ) )
            // InternalAllocation.g:5376:1: ( '}' )
            {
            // InternalAllocation.g:5376:1: ( '}' )
            // InternalAllocation.g:5377:2: '}'
            {
             before(grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__8__Impl"


    // $ANTLR start "rule__Complex__Group_6__0"
    // InternalAllocation.g:5387:1: rule__Complex__Group_6__0 : rule__Complex__Group_6__0__Impl rule__Complex__Group_6__1 ;
    public final void rule__Complex__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5391:1: ( rule__Complex__Group_6__0__Impl rule__Complex__Group_6__1 )
            // InternalAllocation.g:5392:2: rule__Complex__Group_6__0__Impl rule__Complex__Group_6__1
            {
            pushFollow(FOLLOW_36);
            rule__Complex__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group_6__0"


    // $ANTLR start "rule__Complex__Group_6__0__Impl"
    // InternalAllocation.g:5399:1: rule__Complex__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Complex__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5403:1: ( ( ',' ) )
            // InternalAllocation.g:5404:1: ( ',' )
            {
            // InternalAllocation.g:5404:1: ( ',' )
            // InternalAllocation.g:5405:2: ','
            {
             before(grammarAccess.getComplexAccess().getCommaKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group_6__0__Impl"


    // $ANTLR start "rule__Complex__Group_6__1"
    // InternalAllocation.g:5414:1: rule__Complex__Group_6__1 : rule__Complex__Group_6__1__Impl ;
    public final void rule__Complex__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5418:1: ( rule__Complex__Group_6__1__Impl )
            // InternalAllocation.g:5419:2: rule__Complex__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Complex__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group_6__1"


    // $ANTLR start "rule__Complex__Group_6__1__Impl"
    // InternalAllocation.g:5425:1: rule__Complex__Group_6__1__Impl : ( ( rule__Complex__SimpleAssignment_6_1 ) ) ;
    public final void rule__Complex__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5429:1: ( ( ( rule__Complex__SimpleAssignment_6_1 ) ) )
            // InternalAllocation.g:5430:1: ( ( rule__Complex__SimpleAssignment_6_1 ) )
            {
            // InternalAllocation.g:5430:1: ( ( rule__Complex__SimpleAssignment_6_1 ) )
            // InternalAllocation.g:5431:2: ( rule__Complex__SimpleAssignment_6_1 )
            {
             before(grammarAccess.getComplexAccess().getSimpleAssignment_6_1()); 
            // InternalAllocation.g:5432:2: ( rule__Complex__SimpleAssignment_6_1 )
            // InternalAllocation.g:5432:3: rule__Complex__SimpleAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Complex__SimpleAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexAccess().getSimpleAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group_6__1__Impl"


    // $ANTLR start "rule__Void__Group__0"
    // InternalAllocation.g:5441:1: rule__Void__Group__0 : rule__Void__Group__0__Impl rule__Void__Group__1 ;
    public final void rule__Void__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5445:1: ( rule__Void__Group__0__Impl rule__Void__Group__1 )
            // InternalAllocation.g:5446:2: rule__Void__Group__0__Impl rule__Void__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Void__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Void__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__0"


    // $ANTLR start "rule__Void__Group__0__Impl"
    // InternalAllocation.g:5453:1: rule__Void__Group__0__Impl : ( () ) ;
    public final void rule__Void__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5457:1: ( ( () ) )
            // InternalAllocation.g:5458:1: ( () )
            {
            // InternalAllocation.g:5458:1: ( () )
            // InternalAllocation.g:5459:2: ()
            {
             before(grammarAccess.getVoidAccess().getVoidAction_0()); 
            // InternalAllocation.g:5460:2: ()
            // InternalAllocation.g:5460:3: 
            {
            }

             after(grammarAccess.getVoidAccess().getVoidAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__0__Impl"


    // $ANTLR start "rule__Void__Group__1"
    // InternalAllocation.g:5468:1: rule__Void__Group__1 : rule__Void__Group__1__Impl rule__Void__Group__2 ;
    public final void rule__Void__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5472:1: ( rule__Void__Group__1__Impl rule__Void__Group__2 )
            // InternalAllocation.g:5473:2: rule__Void__Group__1__Impl rule__Void__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Void__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Void__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__1"


    // $ANTLR start "rule__Void__Group__1__Impl"
    // InternalAllocation.g:5480:1: rule__Void__Group__1__Impl : ( 'Void' ) ;
    public final void rule__Void__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5484:1: ( ( 'Void' ) )
            // InternalAllocation.g:5485:1: ( 'Void' )
            {
            // InternalAllocation.g:5485:1: ( 'Void' )
            // InternalAllocation.g:5486:2: 'Void'
            {
             before(grammarAccess.getVoidAccess().getVoidKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getVoidAccess().getVoidKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__1__Impl"


    // $ANTLR start "rule__Void__Group__2"
    // InternalAllocation.g:5495:1: rule__Void__Group__2 : rule__Void__Group__2__Impl ;
    public final void rule__Void__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5499:1: ( rule__Void__Group__2__Impl )
            // InternalAllocation.g:5500:2: rule__Void__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Void__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__2"


    // $ANTLR start "rule__Void__Group__2__Impl"
    // InternalAllocation.g:5506:1: rule__Void__Group__2__Impl : ( ( rule__Void__NameAssignment_2 ) ) ;
    public final void rule__Void__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5510:1: ( ( ( rule__Void__NameAssignment_2 ) ) )
            // InternalAllocation.g:5511:1: ( ( rule__Void__NameAssignment_2 ) )
            {
            // InternalAllocation.g:5511:1: ( ( rule__Void__NameAssignment_2 ) )
            // InternalAllocation.g:5512:2: ( rule__Void__NameAssignment_2 )
            {
             before(grammarAccess.getVoidAccess().getNameAssignment_2()); 
            // InternalAllocation.g:5513:2: ( rule__Void__NameAssignment_2 )
            // InternalAllocation.g:5513:3: rule__Void__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Void__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVoidAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__2__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__0"
    // InternalAllocation.g:5522:1: rule__DelegationConnector__Group__0 : rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1 ;
    public final void rule__DelegationConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5526:1: ( rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1 )
            // InternalAllocation.g:5527:2: rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DelegationConnector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__0"


    // $ANTLR start "rule__DelegationConnector__Group__0__Impl"
    // InternalAllocation.g:5534:1: rule__DelegationConnector__Group__0__Impl : ( 'DelegationConnector' ) ;
    public final void rule__DelegationConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5538:1: ( ( 'DelegationConnector' ) )
            // InternalAllocation.g:5539:1: ( 'DelegationConnector' )
            {
            // InternalAllocation.g:5539:1: ( 'DelegationConnector' )
            // InternalAllocation.g:5540:2: 'DelegationConnector'
            {
             before(grammarAccess.getDelegationConnectorAccess().getDelegationConnectorKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getDelegationConnectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__0__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__1"
    // InternalAllocation.g:5549:1: rule__DelegationConnector__Group__1 : rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2 ;
    public final void rule__DelegationConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5553:1: ( rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2 )
            // InternalAllocation.g:5554:2: rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__DelegationConnector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__1"


    // $ANTLR start "rule__DelegationConnector__Group__1__Impl"
    // InternalAllocation.g:5561:1: rule__DelegationConnector__Group__1__Impl : ( ( rule__DelegationConnector__NameAssignment_1 ) ) ;
    public final void rule__DelegationConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5565:1: ( ( ( rule__DelegationConnector__NameAssignment_1 ) ) )
            // InternalAllocation.g:5566:1: ( ( rule__DelegationConnector__NameAssignment_1 ) )
            {
            // InternalAllocation.g:5566:1: ( ( rule__DelegationConnector__NameAssignment_1 ) )
            // InternalAllocation.g:5567:2: ( rule__DelegationConnector__NameAssignment_1 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getNameAssignment_1()); 
            // InternalAllocation.g:5568:2: ( rule__DelegationConnector__NameAssignment_1 )
            // InternalAllocation.g:5568:3: rule__DelegationConnector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDelegationConnectorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__1__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__2"
    // InternalAllocation.g:5576:1: rule__DelegationConnector__Group__2 : rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3 ;
    public final void rule__DelegationConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5580:1: ( rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3 )
            // InternalAllocation.g:5581:2: rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__DelegationConnector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__2"


    // $ANTLR start "rule__DelegationConnector__Group__2__Impl"
    // InternalAllocation.g:5588:1: rule__DelegationConnector__Group__2__Impl : ( '{' ) ;
    public final void rule__DelegationConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5592:1: ( ( '{' ) )
            // InternalAllocation.g:5593:1: ( '{' )
            {
            // InternalAllocation.g:5593:1: ( '{' )
            // InternalAllocation.g:5594:2: '{'
            {
             before(grammarAccess.getDelegationConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__2__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__3"
    // InternalAllocation.g:5603:1: rule__DelegationConnector__Group__3 : rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4 ;
    public final void rule__DelegationConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5607:1: ( rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4 )
            // InternalAllocation.g:5608:2: rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__DelegationConnector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__3"


    // $ANTLR start "rule__DelegationConnector__Group__3__Impl"
    // InternalAllocation.g:5615:1: rule__DelegationConnector__Group__3__Impl : ( 'role' ) ;
    public final void rule__DelegationConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5619:1: ( ( 'role' ) )
            // InternalAllocation.g:5620:1: ( 'role' )
            {
            // InternalAllocation.g:5620:1: ( 'role' )
            // InternalAllocation.g:5621:2: 'role'
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleKeyword_3()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getRoleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__3__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__4"
    // InternalAllocation.g:5630:1: rule__DelegationConnector__Group__4 : rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5 ;
    public final void rule__DelegationConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5634:1: ( rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5 )
            // InternalAllocation.g:5635:2: rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__DelegationConnector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__4"


    // $ANTLR start "rule__DelegationConnector__Group__4__Impl"
    // InternalAllocation.g:5642:1: rule__DelegationConnector__Group__4__Impl : ( '(' ) ;
    public final void rule__DelegationConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5646:1: ( ( '(' ) )
            // InternalAllocation.g:5647:1: ( '(' )
            {
            // InternalAllocation.g:5647:1: ( '(' )
            // InternalAllocation.g:5648:2: '('
            {
             before(grammarAccess.getDelegationConnectorAccess().getLeftParenthesisKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__4__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__5"
    // InternalAllocation.g:5657:1: rule__DelegationConnector__Group__5 : rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6 ;
    public final void rule__DelegationConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5661:1: ( rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6 )
            // InternalAllocation.g:5662:2: rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__DelegationConnector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__5"


    // $ANTLR start "rule__DelegationConnector__Group__5__Impl"
    // InternalAllocation.g:5669:1: rule__DelegationConnector__Group__5__Impl : ( ( rule__DelegationConnector__RoleAssignment_5 ) ) ;
    public final void rule__DelegationConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5673:1: ( ( ( rule__DelegationConnector__RoleAssignment_5 ) ) )
            // InternalAllocation.g:5674:1: ( ( rule__DelegationConnector__RoleAssignment_5 ) )
            {
            // InternalAllocation.g:5674:1: ( ( rule__DelegationConnector__RoleAssignment_5 ) )
            // InternalAllocation.g:5675:2: ( rule__DelegationConnector__RoleAssignment_5 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_5()); 
            // InternalAllocation.g:5676:2: ( rule__DelegationConnector__RoleAssignment_5 )
            // InternalAllocation.g:5676:3: rule__DelegationConnector__RoleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__RoleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__5__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__6"
    // InternalAllocation.g:5684:1: rule__DelegationConnector__Group__6 : rule__DelegationConnector__Group__6__Impl rule__DelegationConnector__Group__7 ;
    public final void rule__DelegationConnector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5688:1: ( rule__DelegationConnector__Group__6__Impl rule__DelegationConnector__Group__7 )
            // InternalAllocation.g:5689:2: rule__DelegationConnector__Group__6__Impl rule__DelegationConnector__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__DelegationConnector__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__6"


    // $ANTLR start "rule__DelegationConnector__Group__6__Impl"
    // InternalAllocation.g:5696:1: rule__DelegationConnector__Group__6__Impl : ( ( rule__DelegationConnector__Group_6__0 )* ) ;
    public final void rule__DelegationConnector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5700:1: ( ( ( rule__DelegationConnector__Group_6__0 )* ) )
            // InternalAllocation.g:5701:1: ( ( rule__DelegationConnector__Group_6__0 )* )
            {
            // InternalAllocation.g:5701:1: ( ( rule__DelegationConnector__Group_6__0 )* )
            // InternalAllocation.g:5702:2: ( rule__DelegationConnector__Group_6__0 )*
            {
             before(grammarAccess.getDelegationConnectorAccess().getGroup_6()); 
            // InternalAllocation.g:5703:2: ( rule__DelegationConnector__Group_6__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAllocation.g:5703:3: rule__DelegationConnector__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DelegationConnector__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getDelegationConnectorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__6__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__7"
    // InternalAllocation.g:5711:1: rule__DelegationConnector__Group__7 : rule__DelegationConnector__Group__7__Impl rule__DelegationConnector__Group__8 ;
    public final void rule__DelegationConnector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5715:1: ( rule__DelegationConnector__Group__7__Impl rule__DelegationConnector__Group__8 )
            // InternalAllocation.g:5716:2: rule__DelegationConnector__Group__7__Impl rule__DelegationConnector__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__DelegationConnector__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__7"


    // $ANTLR start "rule__DelegationConnector__Group__7__Impl"
    // InternalAllocation.g:5723:1: rule__DelegationConnector__Group__7__Impl : ( ')' ) ;
    public final void rule__DelegationConnector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5727:1: ( ( ')' ) )
            // InternalAllocation.g:5728:1: ( ')' )
            {
            // InternalAllocation.g:5728:1: ( ')' )
            // InternalAllocation.g:5729:2: ')'
            {
             before(grammarAccess.getDelegationConnectorAccess().getRightParenthesisKeyword_7()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__7__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__8"
    // InternalAllocation.g:5738:1: rule__DelegationConnector__Group__8 : rule__DelegationConnector__Group__8__Impl ;
    public final void rule__DelegationConnector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5742:1: ( rule__DelegationConnector__Group__8__Impl )
            // InternalAllocation.g:5743:2: rule__DelegationConnector__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__8"


    // $ANTLR start "rule__DelegationConnector__Group__8__Impl"
    // InternalAllocation.g:5749:1: rule__DelegationConnector__Group__8__Impl : ( '}' ) ;
    public final void rule__DelegationConnector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5753:1: ( ( '}' ) )
            // InternalAllocation.g:5754:1: ( '}' )
            {
            // InternalAllocation.g:5754:1: ( '}' )
            // InternalAllocation.g:5755:2: '}'
            {
             before(grammarAccess.getDelegationConnectorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__8__Impl"


    // $ANTLR start "rule__DelegationConnector__Group_6__0"
    // InternalAllocation.g:5765:1: rule__DelegationConnector__Group_6__0 : rule__DelegationConnector__Group_6__0__Impl rule__DelegationConnector__Group_6__1 ;
    public final void rule__DelegationConnector__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5769:1: ( rule__DelegationConnector__Group_6__0__Impl rule__DelegationConnector__Group_6__1 )
            // InternalAllocation.g:5770:2: rule__DelegationConnector__Group_6__0__Impl rule__DelegationConnector__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__DelegationConnector__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group_6__0"


    // $ANTLR start "rule__DelegationConnector__Group_6__0__Impl"
    // InternalAllocation.g:5777:1: rule__DelegationConnector__Group_6__0__Impl : ( ',' ) ;
    public final void rule__DelegationConnector__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5781:1: ( ( ',' ) )
            // InternalAllocation.g:5782:1: ( ',' )
            {
            // InternalAllocation.g:5782:1: ( ',' )
            // InternalAllocation.g:5783:2: ','
            {
             before(grammarAccess.getDelegationConnectorAccess().getCommaKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group_6__0__Impl"


    // $ANTLR start "rule__DelegationConnector__Group_6__1"
    // InternalAllocation.g:5792:1: rule__DelegationConnector__Group_6__1 : rule__DelegationConnector__Group_6__1__Impl ;
    public final void rule__DelegationConnector__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5796:1: ( rule__DelegationConnector__Group_6__1__Impl )
            // InternalAllocation.g:5797:2: rule__DelegationConnector__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group_6__1"


    // $ANTLR start "rule__DelegationConnector__Group_6__1__Impl"
    // InternalAllocation.g:5803:1: rule__DelegationConnector__Group_6__1__Impl : ( ( rule__DelegationConnector__RoleAssignment_6_1 ) ) ;
    public final void rule__DelegationConnector__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5807:1: ( ( ( rule__DelegationConnector__RoleAssignment_6_1 ) ) )
            // InternalAllocation.g:5808:1: ( ( rule__DelegationConnector__RoleAssignment_6_1 ) )
            {
            // InternalAllocation.g:5808:1: ( ( rule__DelegationConnector__RoleAssignment_6_1 ) )
            // InternalAllocation.g:5809:2: ( rule__DelegationConnector__RoleAssignment_6_1 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_6_1()); 
            // InternalAllocation.g:5810:2: ( rule__DelegationConnector__RoleAssignment_6_1 )
            // InternalAllocation.g:5810:3: rule__DelegationConnector__RoleAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__RoleAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group_6__1__Impl"


    // $ANTLR start "rule__Role_Impl__Group__0"
    // InternalAllocation.g:5819:1: rule__Role_Impl__Group__0 : rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1 ;
    public final void rule__Role_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5823:1: ( rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1 )
            // InternalAllocation.g:5824:2: rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Role_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__0"


    // $ANTLR start "rule__Role_Impl__Group__0__Impl"
    // InternalAllocation.g:5831:1: rule__Role_Impl__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Role_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5835:1: ( ( 'Role' ) )
            // InternalAllocation.g:5836:1: ( 'Role' )
            {
            // InternalAllocation.g:5836:1: ( 'Role' )
            // InternalAllocation.g:5837:2: 'Role'
            {
             before(grammarAccess.getRole_ImplAccess().getRoleKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getRole_ImplAccess().getRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__0__Impl"


    // $ANTLR start "rule__Role_Impl__Group__1"
    // InternalAllocation.g:5846:1: rule__Role_Impl__Group__1 : rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2 ;
    public final void rule__Role_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5850:1: ( rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2 )
            // InternalAllocation.g:5851:2: rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Role_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__1"


    // $ANTLR start "rule__Role_Impl__Group__1__Impl"
    // InternalAllocation.g:5858:1: rule__Role_Impl__Group__1__Impl : ( ( rule__Role_Impl__NameAssignment_1 ) ) ;
    public final void rule__Role_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5862:1: ( ( ( rule__Role_Impl__NameAssignment_1 ) ) )
            // InternalAllocation.g:5863:1: ( ( rule__Role_Impl__NameAssignment_1 ) )
            {
            // InternalAllocation.g:5863:1: ( ( rule__Role_Impl__NameAssignment_1 ) )
            // InternalAllocation.g:5864:2: ( rule__Role_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getRole_ImplAccess().getNameAssignment_1()); 
            // InternalAllocation.g:5865:2: ( rule__Role_Impl__NameAssignment_1 )
            // InternalAllocation.g:5865:3: rule__Role_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Role_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRole_ImplAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__1__Impl"


    // $ANTLR start "rule__Role_Impl__Group__2"
    // InternalAllocation.g:5873:1: rule__Role_Impl__Group__2 : rule__Role_Impl__Group__2__Impl rule__Role_Impl__Group__3 ;
    public final void rule__Role_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5877:1: ( rule__Role_Impl__Group__2__Impl rule__Role_Impl__Group__3 )
            // InternalAllocation.g:5878:2: rule__Role_Impl__Group__2__Impl rule__Role_Impl__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Role_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__2"


    // $ANTLR start "rule__Role_Impl__Group__2__Impl"
    // InternalAllocation.g:5885:1: rule__Role_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Role_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5889:1: ( ( '{' ) )
            // InternalAllocation.g:5890:1: ( '{' )
            {
            // InternalAllocation.g:5890:1: ( '{' )
            // InternalAllocation.g:5891:2: '{'
            {
             before(grammarAccess.getRole_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRole_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__2__Impl"


    // $ANTLR start "rule__Role_Impl__Group__3"
    // InternalAllocation.g:5900:1: rule__Role_Impl__Group__3 : rule__Role_Impl__Group__3__Impl rule__Role_Impl__Group__4 ;
    public final void rule__Role_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5904:1: ( rule__Role_Impl__Group__3__Impl rule__Role_Impl__Group__4 )
            // InternalAllocation.g:5905:2: rule__Role_Impl__Group__3__Impl rule__Role_Impl__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Role_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__3"


    // $ANTLR start "rule__Role_Impl__Group__3__Impl"
    // InternalAllocation.g:5912:1: rule__Role_Impl__Group__3__Impl : ( 'interface' ) ;
    public final void rule__Role_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5916:1: ( ( 'interface' ) )
            // InternalAllocation.g:5917:1: ( 'interface' )
            {
            // InternalAllocation.g:5917:1: ( 'interface' )
            // InternalAllocation.g:5918:2: 'interface'
            {
             before(grammarAccess.getRole_ImplAccess().getInterfaceKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRole_ImplAccess().getInterfaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__3__Impl"


    // $ANTLR start "rule__Role_Impl__Group__4"
    // InternalAllocation.g:5927:1: rule__Role_Impl__Group__4 : rule__Role_Impl__Group__4__Impl rule__Role_Impl__Group__5 ;
    public final void rule__Role_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5931:1: ( rule__Role_Impl__Group__4__Impl rule__Role_Impl__Group__5 )
            // InternalAllocation.g:5932:2: rule__Role_Impl__Group__4__Impl rule__Role_Impl__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Role_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__4"


    // $ANTLR start "rule__Role_Impl__Group__4__Impl"
    // InternalAllocation.g:5939:1: rule__Role_Impl__Group__4__Impl : ( ( rule__Role_Impl__InterfaceAssignment_4 ) ) ;
    public final void rule__Role_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5943:1: ( ( ( rule__Role_Impl__InterfaceAssignment_4 ) ) )
            // InternalAllocation.g:5944:1: ( ( rule__Role_Impl__InterfaceAssignment_4 ) )
            {
            // InternalAllocation.g:5944:1: ( ( rule__Role_Impl__InterfaceAssignment_4 ) )
            // InternalAllocation.g:5945:2: ( rule__Role_Impl__InterfaceAssignment_4 )
            {
             before(grammarAccess.getRole_ImplAccess().getInterfaceAssignment_4()); 
            // InternalAllocation.g:5946:2: ( rule__Role_Impl__InterfaceAssignment_4 )
            // InternalAllocation.g:5946:3: rule__Role_Impl__InterfaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Role_Impl__InterfaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRole_ImplAccess().getInterfaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__4__Impl"


    // $ANTLR start "rule__Role_Impl__Group__5"
    // InternalAllocation.g:5954:1: rule__Role_Impl__Group__5 : rule__Role_Impl__Group__5__Impl ;
    public final void rule__Role_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5958:1: ( rule__Role_Impl__Group__5__Impl )
            // InternalAllocation.g:5959:2: rule__Role_Impl__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__5"


    // $ANTLR start "rule__Role_Impl__Group__5__Impl"
    // InternalAllocation.g:5965:1: rule__Role_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__Role_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5969:1: ( ( '}' ) )
            // InternalAllocation.g:5970:1: ( '}' )
            {
            // InternalAllocation.g:5970:1: ( '}' )
            // InternalAllocation.g:5971:2: '}'
            {
             before(grammarAccess.getRole_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRole_ImplAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__5__Impl"


    // $ANTLR start "rule__Allocation__AllocationcontextAssignment_4"
    // InternalAllocation.g:5981:1: rule__Allocation__AllocationcontextAssignment_4 : ( ruleAllocationContext ) ;
    public final void rule__Allocation__AllocationcontextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5985:1: ( ( ruleAllocationContext ) )
            // InternalAllocation.g:5986:2: ( ruleAllocationContext )
            {
            // InternalAllocation.g:5986:2: ( ruleAllocationContext )
            // InternalAllocation.g:5987:3: ruleAllocationContext
            {
             before(grammarAccess.getAllocationAccess().getAllocationcontextAllocationContextParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAllocationContext();

            state._fsp--;

             after(grammarAccess.getAllocationAccess().getAllocationcontextAllocationContextParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__AllocationcontextAssignment_4"


    // $ANTLR start "rule__Allocation__AllocationcontextAssignment_5_1"
    // InternalAllocation.g:5996:1: rule__Allocation__AllocationcontextAssignment_5_1 : ( ruleAllocationContext ) ;
    public final void rule__Allocation__AllocationcontextAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6000:1: ( ( ruleAllocationContext ) )
            // InternalAllocation.g:6001:2: ( ruleAllocationContext )
            {
            // InternalAllocation.g:6001:2: ( ruleAllocationContext )
            // InternalAllocation.g:6002:3: ruleAllocationContext
            {
             before(grammarAccess.getAllocationAccess().getAllocationcontextAllocationContextParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAllocationContext();

            state._fsp--;

             after(grammarAccess.getAllocationAccess().getAllocationcontextAllocationContextParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__AllocationcontextAssignment_5_1"


    // $ANTLR start "rule__AllocationContext__ContainerAssignment_3"
    // InternalAllocation.g:6011:1: rule__AllocationContext__ContainerAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__ContainerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6015:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:6016:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:6016:2: ( ( ruleEString ) )
            // InternalAllocation.g:6017:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0()); 
            // InternalAllocation.g:6018:3: ( ruleEString )
            // InternalAllocation.g:6019:4: ruleEString
            {
             before(grammarAccess.getAllocationContextAccess().getContainerContainerEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getContainerContainerEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__ContainerAssignment_3"


    // $ANTLR start "rule__AllocationContext__AssemblycontextAssignment_5"
    // InternalAllocation.g:6030:1: rule__AllocationContext__AssemblycontextAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__AssemblycontextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6034:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:6035:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:6035:2: ( ( ruleEString ) )
            // InternalAllocation.g:6036:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblycontextAssemblyContextCrossReference_5_0()); 
            // InternalAllocation.g:6037:3: ( ruleEString )
            // InternalAllocation.g:6038:4: ruleEString
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblycontextAssemblyContextEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getAssemblycontextAssemblyContextEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAllocationContextAccess().getAssemblycontextAssemblyContextCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__AssemblycontextAssignment_5"


    // $ANTLR start "rule__AssemblyContext__NameAssignment_1"
    // InternalAllocation.g:6049:1: rule__AssemblyContext__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AssemblyContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6053:1: ( ( ruleEString ) )
            // InternalAllocation.g:6054:2: ( ruleEString )
            {
            // InternalAllocation.g:6054:2: ( ruleEString )
            // InternalAllocation.g:6055:3: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__NameAssignment_1"


    // $ANTLR start "rule__AssemblyContext__ComponentAssignment_4"
    // InternalAllocation.g:6064:1: rule__AssemblyContext__ComponentAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__ComponentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6068:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:6069:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:6069:2: ( ( ruleEString ) )
            // InternalAllocation.g:6070:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_4_0()); 
            // InternalAllocation.g:6071:3: ( ruleEString )
            // InternalAllocation.g:6072:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentComponentEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getComponentComponentEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__ComponentAssignment_4"


    // $ANTLR start "rule__Component_Impl__NameAssignment_1"
    // InternalAllocation.g:6083:1: rule__Component_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Component_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6087:1: ( ( ruleEString ) )
            // InternalAllocation.g:6088:2: ( ruleEString )
            {
            // InternalAllocation.g:6088:2: ( ruleEString )
            // InternalAllocation.g:6089:3: ruleEString
            {
             before(grammarAccess.getComponent_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__NameAssignment_1"


    // $ANTLR start "rule__Component_Impl__BehaviourdescriptionAssignment_3_2"
    // InternalAllocation.g:6098:1: rule__Component_Impl__BehaviourdescriptionAssignment_3_2 : ( ruleBehaviourDescription ) ;
    public final void rule__Component_Impl__BehaviourdescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6102:1: ( ( ruleBehaviourDescription ) )
            // InternalAllocation.g:6103:2: ( ruleBehaviourDescription )
            {
            // InternalAllocation.g:6103:2: ( ruleBehaviourDescription )
            // InternalAllocation.g:6104:3: ruleBehaviourDescription
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviourDescription();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__BehaviourdescriptionAssignment_3_2"


    // $ANTLR start "rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1"
    // InternalAllocation.g:6113:1: rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 : ( ruleBehaviourDescription ) ;
    public final void rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6117:1: ( ( ruleBehaviourDescription ) )
            // InternalAllocation.g:6118:2: ( ruleBehaviourDescription )
            {
            // InternalAllocation.g:6118:2: ( ruleBehaviourDescription )
            // InternalAllocation.g:6119:3: ruleBehaviourDescription
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviourDescription();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1"


    // $ANTLR start "rule__Component_Impl__ServiceAssignment_6"
    // InternalAllocation.g:6128:1: rule__Component_Impl__ServiceAssignment_6 : ( ruleService ) ;
    public final void rule__Component_Impl__ServiceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6132:1: ( ( ruleService ) )
            // InternalAllocation.g:6133:2: ( ruleService )
            {
            // InternalAllocation.g:6133:2: ( ruleService )
            // InternalAllocation.g:6134:3: ruleService
            {
             before(grammarAccess.getComponent_ImplAccess().getServiceServiceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getServiceServiceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__ServiceAssignment_6"


    // $ANTLR start "rule__Component_Impl__ServiceAssignment_7_1"
    // InternalAllocation.g:6143:1: rule__Component_Impl__ServiceAssignment_7_1 : ( ruleService ) ;
    public final void rule__Component_Impl__ServiceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6147:1: ( ( ruleService ) )
            // InternalAllocation.g:6148:2: ( ruleService )
            {
            // InternalAllocation.g:6148:2: ( ruleService )
            // InternalAllocation.g:6149:3: ruleService
            {
             before(grammarAccess.getComponent_ImplAccess().getServiceServiceParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getServiceServiceParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__ServiceAssignment_7_1"


    // $ANTLR start "rule__Component_Impl__RequiredroleAssignment_9_2"
    // InternalAllocation.g:6158:1: rule__Component_Impl__RequiredroleAssignment_9_2 : ( ruleRequiredRole ) ;
    public final void rule__Component_Impl__RequiredroleAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6162:1: ( ( ruleRequiredRole ) )
            // InternalAllocation.g:6163:2: ( ruleRequiredRole )
            {
            // InternalAllocation.g:6163:2: ( ruleRequiredRole )
            // InternalAllocation.g:6164:3: ruleRequiredRole
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredroleRequiredRoleParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredRole();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getRequiredroleRequiredRoleParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__RequiredroleAssignment_9_2"


    // $ANTLR start "rule__Component_Impl__RequiredroleAssignment_9_3_1"
    // InternalAllocation.g:6173:1: rule__Component_Impl__RequiredroleAssignment_9_3_1 : ( ruleRequiredRole ) ;
    public final void rule__Component_Impl__RequiredroleAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6177:1: ( ( ruleRequiredRole ) )
            // InternalAllocation.g:6178:2: ( ruleRequiredRole )
            {
            // InternalAllocation.g:6178:2: ( ruleRequiredRole )
            // InternalAllocation.g:6179:3: ruleRequiredRole
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredroleRequiredRoleParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredRole();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getRequiredroleRequiredRoleParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__RequiredroleAssignment_9_3_1"


    // $ANTLR start "rule__Component_Impl__ProvidedroleAssignment_11"
    // InternalAllocation.g:6188:1: rule__Component_Impl__ProvidedroleAssignment_11 : ( ruleProvidedRole ) ;
    public final void rule__Component_Impl__ProvidedroleAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6192:1: ( ( ruleProvidedRole ) )
            // InternalAllocation.g:6193:2: ( ruleProvidedRole )
            {
            // InternalAllocation.g:6193:2: ( ruleProvidedRole )
            // InternalAllocation.g:6194:3: ruleProvidedRole
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedroleProvidedRoleParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleProvidedRole();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getProvidedroleProvidedRoleParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__ProvidedroleAssignment_11"


    // $ANTLR start "rule__Service__CorrespondingSignaturesAssignment_4"
    // InternalAllocation.g:6203:1: rule__Service__CorrespondingSignaturesAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Service__CorrespondingSignaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6207:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:6208:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:6208:2: ( ( ruleEString ) )
            // InternalAllocation.g:6209:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_4_0()); 
            // InternalAllocation.g:6210:3: ( ruleEString )
            // InternalAllocation.g:6211:4: ruleEString
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__CorrespondingSignaturesAssignment_4"


    // $ANTLR start "rule__Service__CorrespondingSignaturesAssignment_5_1"
    // InternalAllocation.g:6222:1: rule__Service__CorrespondingSignaturesAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Service__CorrespondingSignaturesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6226:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:6227:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:6227:2: ( ( ruleEString ) )
            // InternalAllocation.g:6228:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_5_1_0()); 
            // InternalAllocation.g:6229:3: ( ruleEString )
            // InternalAllocation.g:6230:4: ruleEString
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__CorrespondingSignaturesAssignment_5_1"


    // $ANTLR start "rule__RequiredRole__NameAssignment_1"
    // InternalAllocation.g:6241:1: rule__RequiredRole__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RequiredRole__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6245:1: ( ( ruleEString ) )
            // InternalAllocation.g:6246:2: ( ruleEString )
            {
            // InternalAllocation.g:6246:2: ( ruleEString )
            // InternalAllocation.g:6247:3: ruleEString
            {
             before(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__NameAssignment_1"


    // $ANTLR start "rule__RequiredRole__InterfaceAssignment_4"
    // InternalAllocation.g:6256:1: rule__RequiredRole__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__RequiredRole__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6260:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:6261:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:6261:2: ( ( ruleEString ) )
            // InternalAllocation.g:6262:3: ( ruleEString )
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalAllocation.g:6263:3: ( ruleEString )
            // InternalAllocation.g:6264:4: ruleEString
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__InterfaceAssignment_4"


    // $ANTLR start "rule__ProvidedRole__NameAssignment_1"
    // InternalAllocation.g:6275:1: rule__ProvidedRole__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ProvidedRole__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6279:1: ( ( ruleEString ) )
            // InternalAllocation.g:6280:2: ( ruleEString )
            {
            // InternalAllocation.g:6280:2: ( ruleEString )
            // InternalAllocation.g:6281:3: ruleEString
            {
             before(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__NameAssignment_1"


    // $ANTLR start "rule__ProvidedRole__InterfaceAssignment_4"
    // InternalAllocation.g:6290:1: rule__ProvidedRole__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ProvidedRole__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6294:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:6295:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:6295:2: ( ( ruleEString ) )
            // InternalAllocation.g:6296:3: ( ruleEString )
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalAllocation.g:6297:3: ( ruleEString )
            // InternalAllocation.g:6298:4: ruleEString
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__InterfaceAssignment_4"


    // $ANTLR start "rule__CompositeComponent__NameAssignment_1"
    // InternalAllocation.g:6309:1: rule__CompositeComponent__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompositeComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6313:1: ( ( ruleEString ) )
            // InternalAllocation.g:6314:2: ( ruleEString )
            {
            // InternalAllocation.g:6314:2: ( ruleEString )
            // InternalAllocation.g:6315:3: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__NameAssignment_1"


    // $ANTLR start "rule__CompositeComponent__BehaviourdescriptionAssignment_3_2"
    // InternalAllocation.g:6324:1: rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 : ( ruleBehaviourDescription ) ;
    public final void rule__CompositeComponent__BehaviourdescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6328:1: ( ( ruleBehaviourDescription ) )
            // InternalAllocation.g:6329:2: ( ruleBehaviourDescription )
            {
            // InternalAllocation.g:6329:2: ( ruleBehaviourDescription )
            // InternalAllocation.g:6330:3: ruleBehaviourDescription
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviourDescription();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__BehaviourdescriptionAssignment_3_2"


    // $ANTLR start "rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1"
    // InternalAllocation.g:6339:1: rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 : ( ruleBehaviourDescription ) ;
    public final void rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6343:1: ( ( ruleBehaviourDescription ) )
            // InternalAllocation.g:6344:2: ( ruleBehaviourDescription )
            {
            // InternalAllocation.g:6344:2: ( ruleBehaviourDescription )
            // InternalAllocation.g:6345:3: ruleBehaviourDescription
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviourDescription();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1"


    // $ANTLR start "rule__CompositeComponent__ServiceAssignment_6"
    // InternalAllocation.g:6354:1: rule__CompositeComponent__ServiceAssignment_6 : ( ruleService ) ;
    public final void rule__CompositeComponent__ServiceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6358:1: ( ( ruleService ) )
            // InternalAllocation.g:6359:2: ( ruleService )
            {
            // InternalAllocation.g:6359:2: ( ruleService )
            // InternalAllocation.g:6360:3: ruleService
            {
             before(grammarAccess.getCompositeComponentAccess().getServiceServiceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getServiceServiceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ServiceAssignment_6"


    // $ANTLR start "rule__CompositeComponent__ServiceAssignment_7_1"
    // InternalAllocation.g:6369:1: rule__CompositeComponent__ServiceAssignment_7_1 : ( ruleService ) ;
    public final void rule__CompositeComponent__ServiceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6373:1: ( ( ruleService ) )
            // InternalAllocation.g:6374:2: ( ruleService )
            {
            // InternalAllocation.g:6374:2: ( ruleService )
            // InternalAllocation.g:6375:3: ruleService
            {
             before(grammarAccess.getCompositeComponentAccess().getServiceServiceParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getServiceServiceParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ServiceAssignment_7_1"


    // $ANTLR start "rule__CompositeComponent__RequiredroleAssignment_9_2"
    // InternalAllocation.g:6384:1: rule__CompositeComponent__RequiredroleAssignment_9_2 : ( ruleRequiredRole ) ;
    public final void rule__CompositeComponent__RequiredroleAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6388:1: ( ( ruleRequiredRole ) )
            // InternalAllocation.g:6389:2: ( ruleRequiredRole )
            {
            // InternalAllocation.g:6389:2: ( ruleRequiredRole )
            // InternalAllocation.g:6390:3: ruleRequiredRole
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredroleRequiredRoleParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredRole();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getRequiredroleRequiredRoleParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__RequiredroleAssignment_9_2"


    // $ANTLR start "rule__CompositeComponent__RequiredroleAssignment_9_3_1"
    // InternalAllocation.g:6399:1: rule__CompositeComponent__RequiredroleAssignment_9_3_1 : ( ruleRequiredRole ) ;
    public final void rule__CompositeComponent__RequiredroleAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6403:1: ( ( ruleRequiredRole ) )
            // InternalAllocation.g:6404:2: ( ruleRequiredRole )
            {
            // InternalAllocation.g:6404:2: ( ruleRequiredRole )
            // InternalAllocation.g:6405:3: ruleRequiredRole
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredroleRequiredRoleParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredRole();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getRequiredroleRequiredRoleParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__RequiredroleAssignment_9_3_1"


    // $ANTLR start "rule__CompositeComponent__ProvidedroleAssignment_11"
    // InternalAllocation.g:6414:1: rule__CompositeComponent__ProvidedroleAssignment_11 : ( ruleProvidedRole ) ;
    public final void rule__CompositeComponent__ProvidedroleAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6418:1: ( ( ruleProvidedRole ) )
            // InternalAllocation.g:6419:2: ( ruleProvidedRole )
            {
            // InternalAllocation.g:6419:2: ( ruleProvidedRole )
            // InternalAllocation.g:6420:3: ruleProvidedRole
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedroleProvidedRoleParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleProvidedRole();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getProvidedroleProvidedRoleParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ProvidedroleAssignment_11"


    // $ANTLR start "rule__CompositeComponent__AssemblycontextAssignment_14"
    // InternalAllocation.g:6429:1: rule__CompositeComponent__AssemblycontextAssignment_14 : ( ruleAssemblyContext ) ;
    public final void rule__CompositeComponent__AssemblycontextAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6433:1: ( ( ruleAssemblyContext ) )
            // InternalAllocation.g:6434:2: ( ruleAssemblyContext )
            {
            // InternalAllocation.g:6434:2: ( ruleAssemblyContext )
            // InternalAllocation.g:6435:3: ruleAssemblyContext
            {
             before(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssemblyContextParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssemblyContextParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__AssemblycontextAssignment_14"


    // $ANTLR start "rule__CompositeComponent__AssemblycontextAssignment_15_1"
    // InternalAllocation.g:6444:1: rule__CompositeComponent__AssemblycontextAssignment_15_1 : ( ruleAssemblyContext ) ;
    public final void rule__CompositeComponent__AssemblycontextAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6448:1: ( ( ruleAssemblyContext ) )
            // InternalAllocation.g:6449:2: ( ruleAssemblyContext )
            {
            // InternalAllocation.g:6449:2: ( ruleAssemblyContext )
            // InternalAllocation.g:6450:3: ruleAssemblyContext
            {
             before(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssemblyContextParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssemblyContextParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__AssemblycontextAssignment_15_1"


    // $ANTLR start "rule__CompositeComponent__DelegationconnectorAssignment_19"
    // InternalAllocation.g:6459:1: rule__CompositeComponent__DelegationconnectorAssignment_19 : ( ruleDelegationConnector ) ;
    public final void rule__CompositeComponent__DelegationconnectorAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6463:1: ( ( ruleDelegationConnector ) )
            // InternalAllocation.g:6464:2: ( ruleDelegationConnector )
            {
            // InternalAllocation.g:6464:2: ( ruleDelegationConnector )
            // InternalAllocation.g:6465:3: ruleDelegationConnector
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorDelegationConnectorParserRuleCall_19_0()); 
            pushFollow(FOLLOW_2);
            ruleDelegationConnector();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getDelegationconnectorDelegationConnectorParserRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__DelegationconnectorAssignment_19"


    // $ANTLR start "rule__CompositeComponent__DelegationconnectorAssignment_20_1"
    // InternalAllocation.g:6474:1: rule__CompositeComponent__DelegationconnectorAssignment_20_1 : ( ruleDelegationConnector ) ;
    public final void rule__CompositeComponent__DelegationconnectorAssignment_20_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6478:1: ( ( ruleDelegationConnector ) )
            // InternalAllocation.g:6479:2: ( ruleDelegationConnector )
            {
            // InternalAllocation.g:6479:2: ( ruleDelegationConnector )
            // InternalAllocation.g:6480:3: ruleDelegationConnector
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorDelegationConnectorParserRuleCall_20_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDelegationConnector();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getDelegationconnectorDelegationConnectorParserRuleCall_20_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__DelegationconnectorAssignment_20_1"


    // $ANTLR start "rule__Signature__NameAssignment_1"
    // InternalAllocation.g:6489:1: rule__Signature__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Signature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6493:1: ( ( ruleEString ) )
            // InternalAllocation.g:6494:2: ( ruleEString )
            {
            // InternalAllocation.g:6494:2: ( ruleEString )
            // InternalAllocation.g:6495:3: ruleEString
            {
             before(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__NameAssignment_1"


    // $ANTLR start "rule__Signature__ReturntypeAssignment_4"
    // InternalAllocation.g:6504:1: rule__Signature__ReturntypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Signature__ReturntypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6508:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:6509:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:6509:2: ( ( ruleEString ) )
            // InternalAllocation.g:6510:3: ( ruleEString )
            {
             before(grammarAccess.getSignatureAccess().getReturntypeReturnTypeCrossReference_4_0()); 
            // InternalAllocation.g:6511:3: ( ruleEString )
            // InternalAllocation.g:6512:4: ruleEString
            {
             before(grammarAccess.getSignatureAccess().getReturntypeReturnTypeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getReturntypeReturnTypeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSignatureAccess().getReturntypeReturnTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ReturntypeAssignment_4"


    // $ANTLR start "rule__Signature__ParameterAssignment_5_2"
    // InternalAllocation.g:6523:1: rule__Signature__ParameterAssignment_5_2 : ( ruleParameter ) ;
    public final void rule__Signature__ParameterAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6527:1: ( ( ruleParameter ) )
            // InternalAllocation.g:6528:2: ( ruleParameter )
            {
            // InternalAllocation.g:6528:2: ( ruleParameter )
            // InternalAllocation.g:6529:3: ruleParameter
            {
             before(grammarAccess.getSignatureAccess().getParameterParameterParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParameterParameterParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ParameterAssignment_5_2"


    // $ANTLR start "rule__Signature__ParameterAssignment_5_3_1"
    // InternalAllocation.g:6538:1: rule__Signature__ParameterAssignment_5_3_1 : ( ruleParameter ) ;
    public final void rule__Signature__ParameterAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6542:1: ( ( ruleParameter ) )
            // InternalAllocation.g:6543:2: ( ruleParameter )
            {
            // InternalAllocation.g:6543:2: ( ruleParameter )
            // InternalAllocation.g:6544:3: ruleParameter
            {
             before(grammarAccess.getSignatureAccess().getParameterParameterParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParameterParameterParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ParameterAssignment_5_3_1"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalAllocation.g:6553:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6557:1: ( ( ruleEString ) )
            // InternalAllocation.g:6558:2: ( ruleEString )
            {
            // InternalAllocation.g:6558:2: ( ruleEString )
            // InternalAllocation.g:6559:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__ParametertypeAssignment_4"
    // InternalAllocation.g:6568:1: rule__Parameter__ParametertypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Parameter__ParametertypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6572:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:6573:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:6573:2: ( ( ruleEString ) )
            // InternalAllocation.g:6574:3: ( ruleEString )
            {
             before(grammarAccess.getParameterAccess().getParametertypeParameterTypeCrossReference_4_0()); 
            // InternalAllocation.g:6575:3: ( ruleEString )
            // InternalAllocation.g:6576:4: ruleEString
            {
             before(grammarAccess.getParameterAccess().getParametertypeParameterTypeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getParametertypeParameterTypeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getParametertypeParameterTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ParametertypeAssignment_4"


    // $ANTLR start "rule__ReturnType_Impl__NameAssignment_2"
    // InternalAllocation.g:6587:1: rule__ReturnType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ReturnType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6591:1: ( ( ruleEString ) )
            // InternalAllocation.g:6592:2: ( ruleEString )
            {
            // InternalAllocation.g:6592:2: ( ruleEString )
            // InternalAllocation.g:6593:3: ruleEString
            {
             before(grammarAccess.getReturnType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReturnType_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType_Impl__NameAssignment_2"


    // $ANTLR start "rule__ParameterType_Impl__NameAssignment_2"
    // InternalAllocation.g:6602:1: rule__ParameterType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ParameterType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6606:1: ( ( ruleEString ) )
            // InternalAllocation.g:6607:2: ( ruleEString )
            {
            // InternalAllocation.g:6607:2: ( ruleEString )
            // InternalAllocation.g:6608:3: ruleEString
            {
             before(grammarAccess.getParameterType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterType_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__NameAssignment_2"


    // $ANTLR start "rule__Simple__NameAssignment_2"
    // InternalAllocation.g:6617:1: rule__Simple__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Simple__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6621:1: ( ( ruleEString ) )
            // InternalAllocation.g:6622:2: ( ruleEString )
            {
            // InternalAllocation.g:6622:2: ( ruleEString )
            // InternalAllocation.g:6623:3: ruleEString
            {
             before(grammarAccess.getSimpleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__NameAssignment_2"


    // $ANTLR start "rule__Simple__KindAssignment_4_1"
    // InternalAllocation.g:6632:1: rule__Simple__KindAssignment_4_1 : ( rulesimpleTypes ) ;
    public final void rule__Simple__KindAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6636:1: ( ( rulesimpleTypes ) )
            // InternalAllocation.g:6637:2: ( rulesimpleTypes )
            {
            // InternalAllocation.g:6637:2: ( rulesimpleTypes )
            // InternalAllocation.g:6638:3: rulesimpleTypes
            {
             before(grammarAccess.getSimpleAccess().getKindSimpleTypesEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulesimpleTypes();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getKindSimpleTypesEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__KindAssignment_4_1"


    // $ANTLR start "rule__Complex__NameAssignment_1"
    // InternalAllocation.g:6647:1: rule__Complex__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Complex__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6651:1: ( ( ruleEString ) )
            // InternalAllocation.g:6652:2: ( ruleEString )
            {
            // InternalAllocation.g:6652:2: ( ruleEString )
            // InternalAllocation.g:6653:3: ruleEString
            {
             before(grammarAccess.getComplexAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__NameAssignment_1"


    // $ANTLR start "rule__Complex__SimpleAssignment_5"
    // InternalAllocation.g:6662:1: rule__Complex__SimpleAssignment_5 : ( ruleSimple ) ;
    public final void rule__Complex__SimpleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6666:1: ( ( ruleSimple ) )
            // InternalAllocation.g:6667:2: ( ruleSimple )
            {
            // InternalAllocation.g:6667:2: ( ruleSimple )
            // InternalAllocation.g:6668:3: ruleSimple
            {
             before(grammarAccess.getComplexAccess().getSimpleSimpleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getComplexAccess().getSimpleSimpleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__SimpleAssignment_5"


    // $ANTLR start "rule__Complex__SimpleAssignment_6_1"
    // InternalAllocation.g:6677:1: rule__Complex__SimpleAssignment_6_1 : ( ruleSimple ) ;
    public final void rule__Complex__SimpleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6681:1: ( ( ruleSimple ) )
            // InternalAllocation.g:6682:2: ( ruleSimple )
            {
            // InternalAllocation.g:6682:2: ( ruleSimple )
            // InternalAllocation.g:6683:3: ruleSimple
            {
             before(grammarAccess.getComplexAccess().getSimpleSimpleParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getComplexAccess().getSimpleSimpleParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__SimpleAssignment_6_1"


    // $ANTLR start "rule__Void__NameAssignment_2"
    // InternalAllocation.g:6692:1: rule__Void__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Void__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6696:1: ( ( ruleEString ) )
            // InternalAllocation.g:6697:2: ( ruleEString )
            {
            // InternalAllocation.g:6697:2: ( ruleEString )
            // InternalAllocation.g:6698:3: ruleEString
            {
             before(grammarAccess.getVoidAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVoidAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__NameAssignment_2"


    // $ANTLR start "rule__DelegationConnector__NameAssignment_1"
    // InternalAllocation.g:6707:1: rule__DelegationConnector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DelegationConnector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6711:1: ( ( ruleEString ) )
            // InternalAllocation.g:6712:2: ( ruleEString )
            {
            // InternalAllocation.g:6712:2: ( ruleEString )
            // InternalAllocation.g:6713:3: ruleEString
            {
             before(grammarAccess.getDelegationConnectorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDelegationConnectorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__NameAssignment_1"


    // $ANTLR start "rule__DelegationConnector__RoleAssignment_5"
    // InternalAllocation.g:6722:1: rule__DelegationConnector__RoleAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__DelegationConnector__RoleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6726:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:6727:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:6727:2: ( ( ruleEString ) )
            // InternalAllocation.g:6728:3: ( ruleEString )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_5_0()); 
            // InternalAllocation.g:6729:3: ( ruleEString )
            // InternalAllocation.g:6730:4: ruleEString
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDelegationConnectorAccess().getRoleRoleEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__RoleAssignment_5"


    // $ANTLR start "rule__DelegationConnector__RoleAssignment_6_1"
    // InternalAllocation.g:6741:1: rule__DelegationConnector__RoleAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__DelegationConnector__RoleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6745:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:6746:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:6746:2: ( ( ruleEString ) )
            // InternalAllocation.g:6747:3: ( ruleEString )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_6_1_0()); 
            // InternalAllocation.g:6748:3: ( ruleEString )
            // InternalAllocation.g:6749:4: ruleEString
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDelegationConnectorAccess().getRoleRoleEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__RoleAssignment_6_1"


    // $ANTLR start "rule__Role_Impl__NameAssignment_1"
    // InternalAllocation.g:6760:1: rule__Role_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Role_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6764:1: ( ( ruleEString ) )
            // InternalAllocation.g:6765:2: ( ruleEString )
            {
            // InternalAllocation.g:6765:2: ( ruleEString )
            // InternalAllocation.g:6766:3: ruleEString
            {
             before(grammarAccess.getRole_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRole_ImplAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__NameAssignment_1"


    // $ANTLR start "rule__Role_Impl__InterfaceAssignment_4"
    // InternalAllocation.g:6775:1: rule__Role_Impl__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Role_Impl__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6779:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:6780:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:6780:2: ( ( ruleEString ) )
            // InternalAllocation.g:6781:3: ( ruleEString )
            {
             before(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalAllocation.g:6782:3: ( ruleEString )
            // InternalAllocation.g:6783:4: ruleEString
            {
             before(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__InterfaceAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0003C01000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000001000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000001000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000000000000000L});

}