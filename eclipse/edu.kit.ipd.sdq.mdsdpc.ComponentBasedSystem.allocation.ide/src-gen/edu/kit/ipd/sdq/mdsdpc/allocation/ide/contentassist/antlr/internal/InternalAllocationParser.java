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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'boolean'", "'char'", "'date'", "'double'", "'float'", "'list'", "'long'", "'map'", "'string'", "'Allocation'", "'{'", "'allocationcontext'", "'}'", "','", "'AllocationContext'", "'container'", "'assemblycontext'", "'AssemblyContext'", "'component'", "'Component'", "'service'", "'providedrole'", "'behaviourdescription'", "'requiredrole'", "'BehaviourDescription'", "'descriptionelement'", "'Service'", "'correspondingSignatures'", "'('", "')'", "'RequiredRole'", "'interface'", "'ProvidedRole'", "'CompositeComponent'", "'delegationconnector'", "'DescriptionElement'", "'InternalAction'", "'ExternalCall'", "'Loop'", "'Branch'", "'Signature'", "'returntype'", "'parameter'", "'Parameter'", "'parametertype'", "'ReturnType'", "'ParameterType'", "'Simple'", "'kind'", "'Complex'", "'simple'", "'Void'", "'DelegationConnector'", "'role'", "'Role'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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


    // $ANTLR start "entryRuleDescriptionElement"
    // InternalAllocation.g:78:1: entryRuleDescriptionElement : ruleDescriptionElement EOF ;
    public final void entryRuleDescriptionElement() throws RecognitionException {
        try {
            // InternalAllocation.g:79:1: ( ruleDescriptionElement EOF )
            // InternalAllocation.g:80:1: ruleDescriptionElement EOF
            {
             before(grammarAccess.getDescriptionElementRule()); 
            pushFollow(FOLLOW_1);
            ruleDescriptionElement();

            state._fsp--;

             after(grammarAccess.getDescriptionElementRule()); 
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
    // $ANTLR end "entryRuleDescriptionElement"


    // $ANTLR start "ruleDescriptionElement"
    // InternalAllocation.g:87:1: ruleDescriptionElement : ( ( rule__DescriptionElement__Alternatives ) ) ;
    public final void ruleDescriptionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:91:2: ( ( ( rule__DescriptionElement__Alternatives ) ) )
            // InternalAllocation.g:92:2: ( ( rule__DescriptionElement__Alternatives ) )
            {
            // InternalAllocation.g:92:2: ( ( rule__DescriptionElement__Alternatives ) )
            // InternalAllocation.g:93:3: ( rule__DescriptionElement__Alternatives )
            {
             before(grammarAccess.getDescriptionElementAccess().getAlternatives()); 
            // InternalAllocation.g:94:3: ( rule__DescriptionElement__Alternatives )
            // InternalAllocation.g:94:4: rule__DescriptionElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DescriptionElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescriptionElement"


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


    // $ANTLR start "entryRuleBehaviourDescription"
    // InternalAllocation.g:203:1: entryRuleBehaviourDescription : ruleBehaviourDescription EOF ;
    public final void entryRuleBehaviourDescription() throws RecognitionException {
        try {
            // InternalAllocation.g:204:1: ( ruleBehaviourDescription EOF )
            // InternalAllocation.g:205:1: ruleBehaviourDescription EOF
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
    // InternalAllocation.g:212:1: ruleBehaviourDescription : ( ( rule__BehaviourDescription__Group__0 ) ) ;
    public final void ruleBehaviourDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:216:2: ( ( ( rule__BehaviourDescription__Group__0 ) ) )
            // InternalAllocation.g:217:2: ( ( rule__BehaviourDescription__Group__0 ) )
            {
            // InternalAllocation.g:217:2: ( ( rule__BehaviourDescription__Group__0 ) )
            // InternalAllocation.g:218:3: ( rule__BehaviourDescription__Group__0 )
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getGroup()); 
            // InternalAllocation.g:219:3: ( rule__BehaviourDescription__Group__0 )
            // InternalAllocation.g:219:4: rule__BehaviourDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourDescriptionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleDescriptionElement_Impl"
    // InternalAllocation.g:328:1: entryRuleDescriptionElement_Impl : ruleDescriptionElement_Impl EOF ;
    public final void entryRuleDescriptionElement_Impl() throws RecognitionException {
        try {
            // InternalAllocation.g:329:1: ( ruleDescriptionElement_Impl EOF )
            // InternalAllocation.g:330:1: ruleDescriptionElement_Impl EOF
            {
             before(grammarAccess.getDescriptionElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleDescriptionElement_Impl();

            state._fsp--;

             after(grammarAccess.getDescriptionElement_ImplRule()); 
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
    // $ANTLR end "entryRuleDescriptionElement_Impl"


    // $ANTLR start "ruleDescriptionElement_Impl"
    // InternalAllocation.g:337:1: ruleDescriptionElement_Impl : ( ( rule__DescriptionElement_Impl__Group__0 ) ) ;
    public final void ruleDescriptionElement_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:341:2: ( ( ( rule__DescriptionElement_Impl__Group__0 ) ) )
            // InternalAllocation.g:342:2: ( ( rule__DescriptionElement_Impl__Group__0 ) )
            {
            // InternalAllocation.g:342:2: ( ( rule__DescriptionElement_Impl__Group__0 ) )
            // InternalAllocation.g:343:3: ( rule__DescriptionElement_Impl__Group__0 )
            {
             before(grammarAccess.getDescriptionElement_ImplAccess().getGroup()); 
            // InternalAllocation.g:344:3: ( rule__DescriptionElement_Impl__Group__0 )
            // InternalAllocation.g:344:4: rule__DescriptionElement_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DescriptionElement_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionElement_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescriptionElement_Impl"


    // $ANTLR start "entryRuleInternalAction"
    // InternalAllocation.g:353:1: entryRuleInternalAction : ruleInternalAction EOF ;
    public final void entryRuleInternalAction() throws RecognitionException {
        try {
            // InternalAllocation.g:354:1: ( ruleInternalAction EOF )
            // InternalAllocation.g:355:1: ruleInternalAction EOF
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
    // InternalAllocation.g:362:1: ruleInternalAction : ( ( rule__InternalAction__Group__0 ) ) ;
    public final void ruleInternalAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:366:2: ( ( ( rule__InternalAction__Group__0 ) ) )
            // InternalAllocation.g:367:2: ( ( rule__InternalAction__Group__0 ) )
            {
            // InternalAllocation.g:367:2: ( ( rule__InternalAction__Group__0 ) )
            // InternalAllocation.g:368:3: ( rule__InternalAction__Group__0 )
            {
             before(grammarAccess.getInternalActionAccess().getGroup()); 
            // InternalAllocation.g:369:3: ( rule__InternalAction__Group__0 )
            // InternalAllocation.g:369:4: rule__InternalAction__Group__0
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
    // InternalAllocation.g:378:1: entryRuleExternalCall : ruleExternalCall EOF ;
    public final void entryRuleExternalCall() throws RecognitionException {
        try {
            // InternalAllocation.g:379:1: ( ruleExternalCall EOF )
            // InternalAllocation.g:380:1: ruleExternalCall EOF
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
    // InternalAllocation.g:387:1: ruleExternalCall : ( ( rule__ExternalCall__Group__0 ) ) ;
    public final void ruleExternalCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:391:2: ( ( ( rule__ExternalCall__Group__0 ) ) )
            // InternalAllocation.g:392:2: ( ( rule__ExternalCall__Group__0 ) )
            {
            // InternalAllocation.g:392:2: ( ( rule__ExternalCall__Group__0 ) )
            // InternalAllocation.g:393:3: ( rule__ExternalCall__Group__0 )
            {
             before(grammarAccess.getExternalCallAccess().getGroup()); 
            // InternalAllocation.g:394:3: ( rule__ExternalCall__Group__0 )
            // InternalAllocation.g:394:4: rule__ExternalCall__Group__0
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
    // InternalAllocation.g:403:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalAllocation.g:404:1: ( ruleLoop EOF )
            // InternalAllocation.g:405:1: ruleLoop EOF
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
    // InternalAllocation.g:412:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:416:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalAllocation.g:417:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalAllocation.g:417:2: ( ( rule__Loop__Group__0 ) )
            // InternalAllocation.g:418:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalAllocation.g:419:3: ( rule__Loop__Group__0 )
            // InternalAllocation.g:419:4: rule__Loop__Group__0
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
    // InternalAllocation.g:428:1: entryRuleBranch : ruleBranch EOF ;
    public final void entryRuleBranch() throws RecognitionException {
        try {
            // InternalAllocation.g:429:1: ( ruleBranch EOF )
            // InternalAllocation.g:430:1: ruleBranch EOF
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
    // InternalAllocation.g:437:1: ruleBranch : ( ( rule__Branch__Group__0 ) ) ;
    public final void ruleBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:441:2: ( ( ( rule__Branch__Group__0 ) ) )
            // InternalAllocation.g:442:2: ( ( rule__Branch__Group__0 ) )
            {
            // InternalAllocation.g:442:2: ( ( rule__Branch__Group__0 ) )
            // InternalAllocation.g:443:3: ( rule__Branch__Group__0 )
            {
             before(grammarAccess.getBranchAccess().getGroup()); 
            // InternalAllocation.g:444:3: ( rule__Branch__Group__0 )
            // InternalAllocation.g:444:4: rule__Branch__Group__0
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
    // InternalAllocation.g:453:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalAllocation.g:454:1: ( ruleSignature EOF )
            // InternalAllocation.g:455:1: ruleSignature EOF
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
    // InternalAllocation.g:462:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:466:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalAllocation.g:467:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalAllocation.g:467:2: ( ( rule__Signature__Group__0 ) )
            // InternalAllocation.g:468:3: ( rule__Signature__Group__0 )
            {
             before(grammarAccess.getSignatureAccess().getGroup()); 
            // InternalAllocation.g:469:3: ( rule__Signature__Group__0 )
            // InternalAllocation.g:469:4: rule__Signature__Group__0
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
    // InternalAllocation.g:478:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalAllocation.g:479:1: ( ruleParameter EOF )
            // InternalAllocation.g:480:1: ruleParameter EOF
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
    // InternalAllocation.g:487:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:491:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalAllocation.g:492:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalAllocation.g:492:2: ( ( rule__Parameter__Group__0 ) )
            // InternalAllocation.g:493:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalAllocation.g:494:3: ( rule__Parameter__Group__0 )
            // InternalAllocation.g:494:4: rule__Parameter__Group__0
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
    // InternalAllocation.g:503:1: entryRuleReturnType_Impl : ruleReturnType_Impl EOF ;
    public final void entryRuleReturnType_Impl() throws RecognitionException {
        try {
            // InternalAllocation.g:504:1: ( ruleReturnType_Impl EOF )
            // InternalAllocation.g:505:1: ruleReturnType_Impl EOF
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
    // InternalAllocation.g:512:1: ruleReturnType_Impl : ( ( rule__ReturnType_Impl__Group__0 ) ) ;
    public final void ruleReturnType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:516:2: ( ( ( rule__ReturnType_Impl__Group__0 ) ) )
            // InternalAllocation.g:517:2: ( ( rule__ReturnType_Impl__Group__0 ) )
            {
            // InternalAllocation.g:517:2: ( ( rule__ReturnType_Impl__Group__0 ) )
            // InternalAllocation.g:518:3: ( rule__ReturnType_Impl__Group__0 )
            {
             before(grammarAccess.getReturnType_ImplAccess().getGroup()); 
            // InternalAllocation.g:519:3: ( rule__ReturnType_Impl__Group__0 )
            // InternalAllocation.g:519:4: rule__ReturnType_Impl__Group__0
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
    // InternalAllocation.g:528:1: entryRuleParameterType_Impl : ruleParameterType_Impl EOF ;
    public final void entryRuleParameterType_Impl() throws RecognitionException {
        try {
            // InternalAllocation.g:529:1: ( ruleParameterType_Impl EOF )
            // InternalAllocation.g:530:1: ruleParameterType_Impl EOF
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
    // InternalAllocation.g:537:1: ruleParameterType_Impl : ( ( rule__ParameterType_Impl__Group__0 ) ) ;
    public final void ruleParameterType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:541:2: ( ( ( rule__ParameterType_Impl__Group__0 ) ) )
            // InternalAllocation.g:542:2: ( ( rule__ParameterType_Impl__Group__0 ) )
            {
            // InternalAllocation.g:542:2: ( ( rule__ParameterType_Impl__Group__0 ) )
            // InternalAllocation.g:543:3: ( rule__ParameterType_Impl__Group__0 )
            {
             before(grammarAccess.getParameterType_ImplAccess().getGroup()); 
            // InternalAllocation.g:544:3: ( rule__ParameterType_Impl__Group__0 )
            // InternalAllocation.g:544:4: rule__ParameterType_Impl__Group__0
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
    // InternalAllocation.g:553:1: entryRuleSimple : ruleSimple EOF ;
    public final void entryRuleSimple() throws RecognitionException {
        try {
            // InternalAllocation.g:554:1: ( ruleSimple EOF )
            // InternalAllocation.g:555:1: ruleSimple EOF
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
    // InternalAllocation.g:562:1: ruleSimple : ( ( rule__Simple__Group__0 ) ) ;
    public final void ruleSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:566:2: ( ( ( rule__Simple__Group__0 ) ) )
            // InternalAllocation.g:567:2: ( ( rule__Simple__Group__0 ) )
            {
            // InternalAllocation.g:567:2: ( ( rule__Simple__Group__0 ) )
            // InternalAllocation.g:568:3: ( rule__Simple__Group__0 )
            {
             before(grammarAccess.getSimpleAccess().getGroup()); 
            // InternalAllocation.g:569:3: ( rule__Simple__Group__0 )
            // InternalAllocation.g:569:4: rule__Simple__Group__0
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
    // InternalAllocation.g:578:1: entryRuleComplex : ruleComplex EOF ;
    public final void entryRuleComplex() throws RecognitionException {
        try {
            // InternalAllocation.g:579:1: ( ruleComplex EOF )
            // InternalAllocation.g:580:1: ruleComplex EOF
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
    // InternalAllocation.g:587:1: ruleComplex : ( ( rule__Complex__Group__0 ) ) ;
    public final void ruleComplex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:591:2: ( ( ( rule__Complex__Group__0 ) ) )
            // InternalAllocation.g:592:2: ( ( rule__Complex__Group__0 ) )
            {
            // InternalAllocation.g:592:2: ( ( rule__Complex__Group__0 ) )
            // InternalAllocation.g:593:3: ( rule__Complex__Group__0 )
            {
             before(grammarAccess.getComplexAccess().getGroup()); 
            // InternalAllocation.g:594:3: ( rule__Complex__Group__0 )
            // InternalAllocation.g:594:4: rule__Complex__Group__0
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
    // InternalAllocation.g:603:1: entryRuleVoid : ruleVoid EOF ;
    public final void entryRuleVoid() throws RecognitionException {
        try {
            // InternalAllocation.g:604:1: ( ruleVoid EOF )
            // InternalAllocation.g:605:1: ruleVoid EOF
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
    // InternalAllocation.g:612:1: ruleVoid : ( ( rule__Void__Group__0 ) ) ;
    public final void ruleVoid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:616:2: ( ( ( rule__Void__Group__0 ) ) )
            // InternalAllocation.g:617:2: ( ( rule__Void__Group__0 ) )
            {
            // InternalAllocation.g:617:2: ( ( rule__Void__Group__0 ) )
            // InternalAllocation.g:618:3: ( rule__Void__Group__0 )
            {
             before(grammarAccess.getVoidAccess().getGroup()); 
            // InternalAllocation.g:619:3: ( rule__Void__Group__0 )
            // InternalAllocation.g:619:4: rule__Void__Group__0
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
    // InternalAllocation.g:628:1: entryRuleDelegationConnector : ruleDelegationConnector EOF ;
    public final void entryRuleDelegationConnector() throws RecognitionException {
        try {
            // InternalAllocation.g:629:1: ( ruleDelegationConnector EOF )
            // InternalAllocation.g:630:1: ruleDelegationConnector EOF
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
    // InternalAllocation.g:637:1: ruleDelegationConnector : ( ( rule__DelegationConnector__Group__0 ) ) ;
    public final void ruleDelegationConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:641:2: ( ( ( rule__DelegationConnector__Group__0 ) ) )
            // InternalAllocation.g:642:2: ( ( rule__DelegationConnector__Group__0 ) )
            {
            // InternalAllocation.g:642:2: ( ( rule__DelegationConnector__Group__0 ) )
            // InternalAllocation.g:643:3: ( rule__DelegationConnector__Group__0 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getGroup()); 
            // InternalAllocation.g:644:3: ( rule__DelegationConnector__Group__0 )
            // InternalAllocation.g:644:4: rule__DelegationConnector__Group__0
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
    // InternalAllocation.g:653:1: entryRuleRole_Impl : ruleRole_Impl EOF ;
    public final void entryRuleRole_Impl() throws RecognitionException {
        try {
            // InternalAllocation.g:654:1: ( ruleRole_Impl EOF )
            // InternalAllocation.g:655:1: ruleRole_Impl EOF
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
    // InternalAllocation.g:662:1: ruleRole_Impl : ( ( rule__Role_Impl__Group__0 ) ) ;
    public final void ruleRole_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:666:2: ( ( ( rule__Role_Impl__Group__0 ) ) )
            // InternalAllocation.g:667:2: ( ( rule__Role_Impl__Group__0 ) )
            {
            // InternalAllocation.g:667:2: ( ( rule__Role_Impl__Group__0 ) )
            // InternalAllocation.g:668:3: ( rule__Role_Impl__Group__0 )
            {
             before(grammarAccess.getRole_ImplAccess().getGroup()); 
            // InternalAllocation.g:669:3: ( rule__Role_Impl__Group__0 )
            // InternalAllocation.g:669:4: rule__Role_Impl__Group__0
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
    // InternalAllocation.g:678:1: rulesimpleTypes : ( ( rule__SimpleTypes__Alternatives ) ) ;
    public final void rulesimpleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:682:1: ( ( ( rule__SimpleTypes__Alternatives ) ) )
            // InternalAllocation.g:683:2: ( ( rule__SimpleTypes__Alternatives ) )
            {
            // InternalAllocation.g:683:2: ( ( rule__SimpleTypes__Alternatives ) )
            // InternalAllocation.g:684:3: ( rule__SimpleTypes__Alternatives )
            {
             before(grammarAccess.getSimpleTypesAccess().getAlternatives()); 
            // InternalAllocation.g:685:3: ( rule__SimpleTypes__Alternatives )
            // InternalAllocation.g:685:4: rule__SimpleTypes__Alternatives
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


    // $ANTLR start "rule__DescriptionElement__Alternatives"
    // InternalAllocation.g:693:1: rule__DescriptionElement__Alternatives : ( ( ruleDescriptionElement_Impl ) | ( ruleInternalAction ) | ( ruleExternalCall ) | ( ruleLoop ) | ( ruleBranch ) );
    public final void rule__DescriptionElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:697:1: ( ( ruleDescriptionElement_Impl ) | ( ruleInternalAction ) | ( ruleExternalCall ) | ( ruleLoop ) | ( ruleBranch ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt1=1;
                }
                break;
            case 48:
                {
                alt1=2;
                }
                break;
            case 49:
                {
                alt1=3;
                }
                break;
            case 50:
                {
                alt1=4;
                }
                break;
            case 51:
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
                    // InternalAllocation.g:698:2: ( ruleDescriptionElement_Impl )
                    {
                    // InternalAllocation.g:698:2: ( ruleDescriptionElement_Impl )
                    // InternalAllocation.g:699:3: ruleDescriptionElement_Impl
                    {
                     before(grammarAccess.getDescriptionElementAccess().getDescriptionElement_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDescriptionElement_Impl();

                    state._fsp--;

                     after(grammarAccess.getDescriptionElementAccess().getDescriptionElement_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAllocation.g:704:2: ( ruleInternalAction )
                    {
                    // InternalAllocation.g:704:2: ( ruleInternalAction )
                    // InternalAllocation.g:705:3: ruleInternalAction
                    {
                     before(grammarAccess.getDescriptionElementAccess().getInternalActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInternalAction();

                    state._fsp--;

                     after(grammarAccess.getDescriptionElementAccess().getInternalActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAllocation.g:710:2: ( ruleExternalCall )
                    {
                    // InternalAllocation.g:710:2: ( ruleExternalCall )
                    // InternalAllocation.g:711:3: ruleExternalCall
                    {
                     before(grammarAccess.getDescriptionElementAccess().getExternalCallParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalCall();

                    state._fsp--;

                     after(grammarAccess.getDescriptionElementAccess().getExternalCallParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAllocation.g:716:2: ( ruleLoop )
                    {
                    // InternalAllocation.g:716:2: ( ruleLoop )
                    // InternalAllocation.g:717:3: ruleLoop
                    {
                     before(grammarAccess.getDescriptionElementAccess().getLoopParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;

                     after(grammarAccess.getDescriptionElementAccess().getLoopParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAllocation.g:722:2: ( ruleBranch )
                    {
                    // InternalAllocation.g:722:2: ( ruleBranch )
                    // InternalAllocation.g:723:3: ruleBranch
                    {
                     before(grammarAccess.getDescriptionElementAccess().getBranchParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBranch();

                    state._fsp--;

                     after(grammarAccess.getDescriptionElementAccess().getBranchParserRuleCall_4()); 

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
    // $ANTLR end "rule__DescriptionElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalAllocation.g:732:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:736:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalAllocation.g:737:2: ( RULE_STRING )
                    {
                    // InternalAllocation.g:737:2: ( RULE_STRING )
                    // InternalAllocation.g:738:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAllocation.g:743:2: ( RULE_ID )
                    {
                    // InternalAllocation.g:743:2: ( RULE_ID )
                    // InternalAllocation.g:744:3: RULE_ID
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
    // InternalAllocation.g:753:1: rule__SimpleTypes__Alternatives : ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'double' ) ) | ( ( 'float' ) ) | ( ( 'list' ) ) | ( ( 'long' ) ) | ( ( 'map' ) ) | ( ( 'string' ) ) );
    public final void rule__SimpleTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:757:1: ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'double' ) ) | ( ( 'float' ) ) | ( ( 'list' ) ) | ( ( 'long' ) ) | ( ( 'map' ) ) | ( ( 'string' ) ) )
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
                    // InternalAllocation.g:758:2: ( ( 'int' ) )
                    {
                    // InternalAllocation.g:758:2: ( ( 'int' ) )
                    // InternalAllocation.g:759:3: ( 'int' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0()); 
                    // InternalAllocation.g:760:3: ( 'int' )
                    // InternalAllocation.g:760:4: 'int'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAllocation.g:764:2: ( ( 'boolean' ) )
                    {
                    // InternalAllocation.g:764:2: ( ( 'boolean' ) )
                    // InternalAllocation.g:765:3: ( 'boolean' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1()); 
                    // InternalAllocation.g:766:3: ( 'boolean' )
                    // InternalAllocation.g:766:4: 'boolean'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAllocation.g:770:2: ( ( 'char' ) )
                    {
                    // InternalAllocation.g:770:2: ( ( 'char' ) )
                    // InternalAllocation.g:771:3: ( 'char' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2()); 
                    // InternalAllocation.g:772:3: ( 'char' )
                    // InternalAllocation.g:772:4: 'char'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAllocation.g:776:2: ( ( 'date' ) )
                    {
                    // InternalAllocation.g:776:2: ( ( 'date' ) )
                    // InternalAllocation.g:777:3: ( 'date' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalAllocation.g:778:3: ( 'date' )
                    // InternalAllocation.g:778:4: 'date'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAllocation.g:782:2: ( ( 'double' ) )
                    {
                    // InternalAllocation.g:782:2: ( ( 'double' ) )
                    // InternalAllocation.g:783:3: ( 'double' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // InternalAllocation.g:784:3: ( 'double' )
                    // InternalAllocation.g:784:4: 'double'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAllocation.g:788:2: ( ( 'float' ) )
                    {
                    // InternalAllocation.g:788:2: ( ( 'float' ) )
                    // InternalAllocation.g:789:3: ( 'float' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5()); 
                    // InternalAllocation.g:790:3: ( 'float' )
                    // InternalAllocation.g:790:4: 'float'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAllocation.g:794:2: ( ( 'list' ) )
                    {
                    // InternalAllocation.g:794:2: ( ( 'list' ) )
                    // InternalAllocation.g:795:3: ( 'list' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6()); 
                    // InternalAllocation.g:796:3: ( 'list' )
                    // InternalAllocation.g:796:4: 'list'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAllocation.g:800:2: ( ( 'long' ) )
                    {
                    // InternalAllocation.g:800:2: ( ( 'long' ) )
                    // InternalAllocation.g:801:3: ( 'long' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7()); 
                    // InternalAllocation.g:802:3: ( 'long' )
                    // InternalAllocation.g:802:4: 'long'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalAllocation.g:806:2: ( ( 'map' ) )
                    {
                    // InternalAllocation.g:806:2: ( ( 'map' ) )
                    // InternalAllocation.g:807:3: ( 'map' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8()); 
                    // InternalAllocation.g:808:3: ( 'map' )
                    // InternalAllocation.g:808:4: 'map'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalAllocation.g:812:2: ( ( 'string' ) )
                    {
                    // InternalAllocation.g:812:2: ( ( 'string' ) )
                    // InternalAllocation.g:813:3: ( 'string' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_9()); 
                    // InternalAllocation.g:814:3: ( 'string' )
                    // InternalAllocation.g:814:4: 'string'
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
    // InternalAllocation.g:822:1: rule__Allocation__Group__0 : rule__Allocation__Group__0__Impl rule__Allocation__Group__1 ;
    public final void rule__Allocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:826:1: ( rule__Allocation__Group__0__Impl rule__Allocation__Group__1 )
            // InternalAllocation.g:827:2: rule__Allocation__Group__0__Impl rule__Allocation__Group__1
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
    // InternalAllocation.g:834:1: rule__Allocation__Group__0__Impl : ( 'Allocation' ) ;
    public final void rule__Allocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:838:1: ( ( 'Allocation' ) )
            // InternalAllocation.g:839:1: ( 'Allocation' )
            {
            // InternalAllocation.g:839:1: ( 'Allocation' )
            // InternalAllocation.g:840:2: 'Allocation'
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
    // InternalAllocation.g:849:1: rule__Allocation__Group__1 : rule__Allocation__Group__1__Impl rule__Allocation__Group__2 ;
    public final void rule__Allocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:853:1: ( rule__Allocation__Group__1__Impl rule__Allocation__Group__2 )
            // InternalAllocation.g:854:2: rule__Allocation__Group__1__Impl rule__Allocation__Group__2
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
    // InternalAllocation.g:861:1: rule__Allocation__Group__1__Impl : ( '{' ) ;
    public final void rule__Allocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:865:1: ( ( '{' ) )
            // InternalAllocation.g:866:1: ( '{' )
            {
            // InternalAllocation.g:866:1: ( '{' )
            // InternalAllocation.g:867:2: '{'
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
    // InternalAllocation.g:876:1: rule__Allocation__Group__2 : rule__Allocation__Group__2__Impl rule__Allocation__Group__3 ;
    public final void rule__Allocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:880:1: ( rule__Allocation__Group__2__Impl rule__Allocation__Group__3 )
            // InternalAllocation.g:881:2: rule__Allocation__Group__2__Impl rule__Allocation__Group__3
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
    // InternalAllocation.g:888:1: rule__Allocation__Group__2__Impl : ( 'allocationcontext' ) ;
    public final void rule__Allocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:892:1: ( ( 'allocationcontext' ) )
            // InternalAllocation.g:893:1: ( 'allocationcontext' )
            {
            // InternalAllocation.g:893:1: ( 'allocationcontext' )
            // InternalAllocation.g:894:2: 'allocationcontext'
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
    // InternalAllocation.g:903:1: rule__Allocation__Group__3 : rule__Allocation__Group__3__Impl rule__Allocation__Group__4 ;
    public final void rule__Allocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:907:1: ( rule__Allocation__Group__3__Impl rule__Allocation__Group__4 )
            // InternalAllocation.g:908:2: rule__Allocation__Group__3__Impl rule__Allocation__Group__4
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
    // InternalAllocation.g:915:1: rule__Allocation__Group__3__Impl : ( '{' ) ;
    public final void rule__Allocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:919:1: ( ( '{' ) )
            // InternalAllocation.g:920:1: ( '{' )
            {
            // InternalAllocation.g:920:1: ( '{' )
            // InternalAllocation.g:921:2: '{'
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
    // InternalAllocation.g:930:1: rule__Allocation__Group__4 : rule__Allocation__Group__4__Impl rule__Allocation__Group__5 ;
    public final void rule__Allocation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:934:1: ( rule__Allocation__Group__4__Impl rule__Allocation__Group__5 )
            // InternalAllocation.g:935:2: rule__Allocation__Group__4__Impl rule__Allocation__Group__5
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
    // InternalAllocation.g:942:1: rule__Allocation__Group__4__Impl : ( ( rule__Allocation__AllocationcontextAssignment_4 ) ) ;
    public final void rule__Allocation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:946:1: ( ( ( rule__Allocation__AllocationcontextAssignment_4 ) ) )
            // InternalAllocation.g:947:1: ( ( rule__Allocation__AllocationcontextAssignment_4 ) )
            {
            // InternalAllocation.g:947:1: ( ( rule__Allocation__AllocationcontextAssignment_4 ) )
            // InternalAllocation.g:948:2: ( rule__Allocation__AllocationcontextAssignment_4 )
            {
             before(grammarAccess.getAllocationAccess().getAllocationcontextAssignment_4()); 
            // InternalAllocation.g:949:2: ( rule__Allocation__AllocationcontextAssignment_4 )
            // InternalAllocation.g:949:3: rule__Allocation__AllocationcontextAssignment_4
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
    // InternalAllocation.g:957:1: rule__Allocation__Group__5 : rule__Allocation__Group__5__Impl rule__Allocation__Group__6 ;
    public final void rule__Allocation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:961:1: ( rule__Allocation__Group__5__Impl rule__Allocation__Group__6 )
            // InternalAllocation.g:962:2: rule__Allocation__Group__5__Impl rule__Allocation__Group__6
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
    // InternalAllocation.g:969:1: rule__Allocation__Group__5__Impl : ( ( rule__Allocation__Group_5__0 )* ) ;
    public final void rule__Allocation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:973:1: ( ( ( rule__Allocation__Group_5__0 )* ) )
            // InternalAllocation.g:974:1: ( ( rule__Allocation__Group_5__0 )* )
            {
            // InternalAllocation.g:974:1: ( ( rule__Allocation__Group_5__0 )* )
            // InternalAllocation.g:975:2: ( rule__Allocation__Group_5__0 )*
            {
             before(grammarAccess.getAllocationAccess().getGroup_5()); 
            // InternalAllocation.g:976:2: ( rule__Allocation__Group_5__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAllocation.g:976:3: rule__Allocation__Group_5__0
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
    // InternalAllocation.g:984:1: rule__Allocation__Group__6 : rule__Allocation__Group__6__Impl rule__Allocation__Group__7 ;
    public final void rule__Allocation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:988:1: ( rule__Allocation__Group__6__Impl rule__Allocation__Group__7 )
            // InternalAllocation.g:989:2: rule__Allocation__Group__6__Impl rule__Allocation__Group__7
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
    // InternalAllocation.g:996:1: rule__Allocation__Group__6__Impl : ( '}' ) ;
    public final void rule__Allocation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1000:1: ( ( '}' ) )
            // InternalAllocation.g:1001:1: ( '}' )
            {
            // InternalAllocation.g:1001:1: ( '}' )
            // InternalAllocation.g:1002:2: '}'
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
    // InternalAllocation.g:1011:1: rule__Allocation__Group__7 : rule__Allocation__Group__7__Impl ;
    public final void rule__Allocation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1015:1: ( rule__Allocation__Group__7__Impl )
            // InternalAllocation.g:1016:2: rule__Allocation__Group__7__Impl
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
    // InternalAllocation.g:1022:1: rule__Allocation__Group__7__Impl : ( '}' ) ;
    public final void rule__Allocation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1026:1: ( ( '}' ) )
            // InternalAllocation.g:1027:1: ( '}' )
            {
            // InternalAllocation.g:1027:1: ( '}' )
            // InternalAllocation.g:1028:2: '}'
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
    // InternalAllocation.g:1038:1: rule__Allocation__Group_5__0 : rule__Allocation__Group_5__0__Impl rule__Allocation__Group_5__1 ;
    public final void rule__Allocation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1042:1: ( rule__Allocation__Group_5__0__Impl rule__Allocation__Group_5__1 )
            // InternalAllocation.g:1043:2: rule__Allocation__Group_5__0__Impl rule__Allocation__Group_5__1
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
    // InternalAllocation.g:1050:1: rule__Allocation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Allocation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1054:1: ( ( ',' ) )
            // InternalAllocation.g:1055:1: ( ',' )
            {
            // InternalAllocation.g:1055:1: ( ',' )
            // InternalAllocation.g:1056:2: ','
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
    // InternalAllocation.g:1065:1: rule__Allocation__Group_5__1 : rule__Allocation__Group_5__1__Impl ;
    public final void rule__Allocation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1069:1: ( rule__Allocation__Group_5__1__Impl )
            // InternalAllocation.g:1070:2: rule__Allocation__Group_5__1__Impl
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
    // InternalAllocation.g:1076:1: rule__Allocation__Group_5__1__Impl : ( ( rule__Allocation__AllocationcontextAssignment_5_1 ) ) ;
    public final void rule__Allocation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1080:1: ( ( ( rule__Allocation__AllocationcontextAssignment_5_1 ) ) )
            // InternalAllocation.g:1081:1: ( ( rule__Allocation__AllocationcontextAssignment_5_1 ) )
            {
            // InternalAllocation.g:1081:1: ( ( rule__Allocation__AllocationcontextAssignment_5_1 ) )
            // InternalAllocation.g:1082:2: ( rule__Allocation__AllocationcontextAssignment_5_1 )
            {
             before(grammarAccess.getAllocationAccess().getAllocationcontextAssignment_5_1()); 
            // InternalAllocation.g:1083:2: ( rule__Allocation__AllocationcontextAssignment_5_1 )
            // InternalAllocation.g:1083:3: rule__Allocation__AllocationcontextAssignment_5_1
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
    // InternalAllocation.g:1092:1: rule__AllocationContext__Group__0 : rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 ;
    public final void rule__AllocationContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1096:1: ( rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 )
            // InternalAllocation.g:1097:2: rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1
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
    // InternalAllocation.g:1104:1: rule__AllocationContext__Group__0__Impl : ( 'AllocationContext' ) ;
    public final void rule__AllocationContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1108:1: ( ( 'AllocationContext' ) )
            // InternalAllocation.g:1109:1: ( 'AllocationContext' )
            {
            // InternalAllocation.g:1109:1: ( 'AllocationContext' )
            // InternalAllocation.g:1110:2: 'AllocationContext'
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
    // InternalAllocation.g:1119:1: rule__AllocationContext__Group__1 : rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 ;
    public final void rule__AllocationContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1123:1: ( rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 )
            // InternalAllocation.g:1124:2: rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2
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
    // InternalAllocation.g:1131:1: rule__AllocationContext__Group__1__Impl : ( '{' ) ;
    public final void rule__AllocationContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1135:1: ( ( '{' ) )
            // InternalAllocation.g:1136:1: ( '{' )
            {
            // InternalAllocation.g:1136:1: ( '{' )
            // InternalAllocation.g:1137:2: '{'
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
    // InternalAllocation.g:1146:1: rule__AllocationContext__Group__2 : rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 ;
    public final void rule__AllocationContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1150:1: ( rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 )
            // InternalAllocation.g:1151:2: rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3
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
    // InternalAllocation.g:1158:1: rule__AllocationContext__Group__2__Impl : ( 'container' ) ;
    public final void rule__AllocationContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1162:1: ( ( 'container' ) )
            // InternalAllocation.g:1163:1: ( 'container' )
            {
            // InternalAllocation.g:1163:1: ( 'container' )
            // InternalAllocation.g:1164:2: 'container'
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
    // InternalAllocation.g:1173:1: rule__AllocationContext__Group__3 : rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 ;
    public final void rule__AllocationContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1177:1: ( rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 )
            // InternalAllocation.g:1178:2: rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4
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
    // InternalAllocation.g:1185:1: rule__AllocationContext__Group__3__Impl : ( ( rule__AllocationContext__ContainerAssignment_3 ) ) ;
    public final void rule__AllocationContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1189:1: ( ( ( rule__AllocationContext__ContainerAssignment_3 ) ) )
            // InternalAllocation.g:1190:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            {
            // InternalAllocation.g:1190:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            // InternalAllocation.g:1191:2: ( rule__AllocationContext__ContainerAssignment_3 )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerAssignment_3()); 
            // InternalAllocation.g:1192:2: ( rule__AllocationContext__ContainerAssignment_3 )
            // InternalAllocation.g:1192:3: rule__AllocationContext__ContainerAssignment_3
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
    // InternalAllocation.g:1200:1: rule__AllocationContext__Group__4 : rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 ;
    public final void rule__AllocationContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1204:1: ( rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 )
            // InternalAllocation.g:1205:2: rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5
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
    // InternalAllocation.g:1212:1: rule__AllocationContext__Group__4__Impl : ( 'assemblycontext' ) ;
    public final void rule__AllocationContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1216:1: ( ( 'assemblycontext' ) )
            // InternalAllocation.g:1217:1: ( 'assemblycontext' )
            {
            // InternalAllocation.g:1217:1: ( 'assemblycontext' )
            // InternalAllocation.g:1218:2: 'assemblycontext'
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
    // InternalAllocation.g:1227:1: rule__AllocationContext__Group__5 : rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 ;
    public final void rule__AllocationContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1231:1: ( rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 )
            // InternalAllocation.g:1232:2: rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6
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
    // InternalAllocation.g:1239:1: rule__AllocationContext__Group__5__Impl : ( ( rule__AllocationContext__AssemblycontextAssignment_5 ) ) ;
    public final void rule__AllocationContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1243:1: ( ( ( rule__AllocationContext__AssemblycontextAssignment_5 ) ) )
            // InternalAllocation.g:1244:1: ( ( rule__AllocationContext__AssemblycontextAssignment_5 ) )
            {
            // InternalAllocation.g:1244:1: ( ( rule__AllocationContext__AssemblycontextAssignment_5 ) )
            // InternalAllocation.g:1245:2: ( rule__AllocationContext__AssemblycontextAssignment_5 )
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblycontextAssignment_5()); 
            // InternalAllocation.g:1246:2: ( rule__AllocationContext__AssemblycontextAssignment_5 )
            // InternalAllocation.g:1246:3: rule__AllocationContext__AssemblycontextAssignment_5
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
    // InternalAllocation.g:1254:1: rule__AllocationContext__Group__6 : rule__AllocationContext__Group__6__Impl ;
    public final void rule__AllocationContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1258:1: ( rule__AllocationContext__Group__6__Impl )
            // InternalAllocation.g:1259:2: rule__AllocationContext__Group__6__Impl
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
    // InternalAllocation.g:1265:1: rule__AllocationContext__Group__6__Impl : ( '}' ) ;
    public final void rule__AllocationContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1269:1: ( ( '}' ) )
            // InternalAllocation.g:1270:1: ( '}' )
            {
            // InternalAllocation.g:1270:1: ( '}' )
            // InternalAllocation.g:1271:2: '}'
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
    // InternalAllocation.g:1281:1: rule__AssemblyContext__Group__0 : rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 ;
    public final void rule__AssemblyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1285:1: ( rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 )
            // InternalAllocation.g:1286:2: rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1
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
    // InternalAllocation.g:1293:1: rule__AssemblyContext__Group__0__Impl : ( 'AssemblyContext' ) ;
    public final void rule__AssemblyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1297:1: ( ( 'AssemblyContext' ) )
            // InternalAllocation.g:1298:1: ( 'AssemblyContext' )
            {
            // InternalAllocation.g:1298:1: ( 'AssemblyContext' )
            // InternalAllocation.g:1299:2: 'AssemblyContext'
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
    // InternalAllocation.g:1308:1: rule__AssemblyContext__Group__1 : rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 ;
    public final void rule__AssemblyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1312:1: ( rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 )
            // InternalAllocation.g:1313:2: rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2
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
    // InternalAllocation.g:1320:1: rule__AssemblyContext__Group__1__Impl : ( ( rule__AssemblyContext__NameAssignment_1 ) ) ;
    public final void rule__AssemblyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1324:1: ( ( ( rule__AssemblyContext__NameAssignment_1 ) ) )
            // InternalAllocation.g:1325:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            {
            // InternalAllocation.g:1325:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            // InternalAllocation.g:1326:2: ( rule__AssemblyContext__NameAssignment_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getNameAssignment_1()); 
            // InternalAllocation.g:1327:2: ( rule__AssemblyContext__NameAssignment_1 )
            // InternalAllocation.g:1327:3: rule__AssemblyContext__NameAssignment_1
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
    // InternalAllocation.g:1335:1: rule__AssemblyContext__Group__2 : rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 ;
    public final void rule__AssemblyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1339:1: ( rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 )
            // InternalAllocation.g:1340:2: rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3
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
    // InternalAllocation.g:1347:1: rule__AssemblyContext__Group__2__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1351:1: ( ( '{' ) )
            // InternalAllocation.g:1352:1: ( '{' )
            {
            // InternalAllocation.g:1352:1: ( '{' )
            // InternalAllocation.g:1353:2: '{'
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
    // InternalAllocation.g:1362:1: rule__AssemblyContext__Group__3 : rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 ;
    public final void rule__AssemblyContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1366:1: ( rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 )
            // InternalAllocation.g:1367:2: rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4
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
    // InternalAllocation.g:1374:1: rule__AssemblyContext__Group__3__Impl : ( 'component' ) ;
    public final void rule__AssemblyContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1378:1: ( ( 'component' ) )
            // InternalAllocation.g:1379:1: ( 'component' )
            {
            // InternalAllocation.g:1379:1: ( 'component' )
            // InternalAllocation.g:1380:2: 'component'
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
    // InternalAllocation.g:1389:1: rule__AssemblyContext__Group__4 : rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 ;
    public final void rule__AssemblyContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1393:1: ( rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 )
            // InternalAllocation.g:1394:2: rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5
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
    // InternalAllocation.g:1401:1: rule__AssemblyContext__Group__4__Impl : ( ( rule__AssemblyContext__ComponentAssignment_4 ) ) ;
    public final void rule__AssemblyContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1405:1: ( ( ( rule__AssemblyContext__ComponentAssignment_4 ) ) )
            // InternalAllocation.g:1406:1: ( ( rule__AssemblyContext__ComponentAssignment_4 ) )
            {
            // InternalAllocation.g:1406:1: ( ( rule__AssemblyContext__ComponentAssignment_4 ) )
            // InternalAllocation.g:1407:2: ( rule__AssemblyContext__ComponentAssignment_4 )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentAssignment_4()); 
            // InternalAllocation.g:1408:2: ( rule__AssemblyContext__ComponentAssignment_4 )
            // InternalAllocation.g:1408:3: rule__AssemblyContext__ComponentAssignment_4
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
    // InternalAllocation.g:1416:1: rule__AssemblyContext__Group__5 : rule__AssemblyContext__Group__5__Impl ;
    public final void rule__AssemblyContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1420:1: ( rule__AssemblyContext__Group__5__Impl )
            // InternalAllocation.g:1421:2: rule__AssemblyContext__Group__5__Impl
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
    // InternalAllocation.g:1427:1: rule__AssemblyContext__Group__5__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1431:1: ( ( '}' ) )
            // InternalAllocation.g:1432:1: ( '}' )
            {
            // InternalAllocation.g:1432:1: ( '}' )
            // InternalAllocation.g:1433:2: '}'
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
    // InternalAllocation.g:1443:1: rule__Component_Impl__Group__0 : rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1 ;
    public final void rule__Component_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1447:1: ( rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1 )
            // InternalAllocation.g:1448:2: rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1
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
    // InternalAllocation.g:1455:1: rule__Component_Impl__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1459:1: ( ( 'Component' ) )
            // InternalAllocation.g:1460:1: ( 'Component' )
            {
            // InternalAllocation.g:1460:1: ( 'Component' )
            // InternalAllocation.g:1461:2: 'Component'
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
    // InternalAllocation.g:1470:1: rule__Component_Impl__Group__1 : rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2 ;
    public final void rule__Component_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1474:1: ( rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2 )
            // InternalAllocation.g:1475:2: rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2
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
    // InternalAllocation.g:1482:1: rule__Component_Impl__Group__1__Impl : ( ( rule__Component_Impl__NameAssignment_1 ) ) ;
    public final void rule__Component_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1486:1: ( ( ( rule__Component_Impl__NameAssignment_1 ) ) )
            // InternalAllocation.g:1487:1: ( ( rule__Component_Impl__NameAssignment_1 ) )
            {
            // InternalAllocation.g:1487:1: ( ( rule__Component_Impl__NameAssignment_1 ) )
            // InternalAllocation.g:1488:2: ( rule__Component_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getNameAssignment_1()); 
            // InternalAllocation.g:1489:2: ( rule__Component_Impl__NameAssignment_1 )
            // InternalAllocation.g:1489:3: rule__Component_Impl__NameAssignment_1
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
    // InternalAllocation.g:1497:1: rule__Component_Impl__Group__2 : rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3 ;
    public final void rule__Component_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1501:1: ( rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3 )
            // InternalAllocation.g:1502:2: rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3
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
    // InternalAllocation.g:1509:1: rule__Component_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1513:1: ( ( '{' ) )
            // InternalAllocation.g:1514:1: ( '{' )
            {
            // InternalAllocation.g:1514:1: ( '{' )
            // InternalAllocation.g:1515:2: '{'
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
    // InternalAllocation.g:1524:1: rule__Component_Impl__Group__3 : rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4 ;
    public final void rule__Component_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1528:1: ( rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4 )
            // InternalAllocation.g:1529:2: rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4
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
    // InternalAllocation.g:1536:1: rule__Component_Impl__Group__3__Impl : ( ( rule__Component_Impl__Group_3__0 )? ) ;
    public final void rule__Component_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1540:1: ( ( ( rule__Component_Impl__Group_3__0 )? ) )
            // InternalAllocation.g:1541:1: ( ( rule__Component_Impl__Group_3__0 )? )
            {
            // InternalAllocation.g:1541:1: ( ( rule__Component_Impl__Group_3__0 )? )
            // InternalAllocation.g:1542:2: ( rule__Component_Impl__Group_3__0 )?
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_3()); 
            // InternalAllocation.g:1543:2: ( rule__Component_Impl__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAllocation.g:1543:3: rule__Component_Impl__Group_3__0
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
    // InternalAllocation.g:1551:1: rule__Component_Impl__Group__4 : rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5 ;
    public final void rule__Component_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1555:1: ( rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5 )
            // InternalAllocation.g:1556:2: rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5
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
    // InternalAllocation.g:1563:1: rule__Component_Impl__Group__4__Impl : ( 'service' ) ;
    public final void rule__Component_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1567:1: ( ( 'service' ) )
            // InternalAllocation.g:1568:1: ( 'service' )
            {
            // InternalAllocation.g:1568:1: ( 'service' )
            // InternalAllocation.g:1569:2: 'service'
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
    // InternalAllocation.g:1578:1: rule__Component_Impl__Group__5 : rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6 ;
    public final void rule__Component_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1582:1: ( rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6 )
            // InternalAllocation.g:1583:2: rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6
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
    // InternalAllocation.g:1590:1: rule__Component_Impl__Group__5__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1594:1: ( ( '{' ) )
            // InternalAllocation.g:1595:1: ( '{' )
            {
            // InternalAllocation.g:1595:1: ( '{' )
            // InternalAllocation.g:1596:2: '{'
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
    // InternalAllocation.g:1605:1: rule__Component_Impl__Group__6 : rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7 ;
    public final void rule__Component_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1609:1: ( rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7 )
            // InternalAllocation.g:1610:2: rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7
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
    // InternalAllocation.g:1617:1: rule__Component_Impl__Group__6__Impl : ( ( rule__Component_Impl__ServiceAssignment_6 ) ) ;
    public final void rule__Component_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1621:1: ( ( ( rule__Component_Impl__ServiceAssignment_6 ) ) )
            // InternalAllocation.g:1622:1: ( ( rule__Component_Impl__ServiceAssignment_6 ) )
            {
            // InternalAllocation.g:1622:1: ( ( rule__Component_Impl__ServiceAssignment_6 ) )
            // InternalAllocation.g:1623:2: ( rule__Component_Impl__ServiceAssignment_6 )
            {
             before(grammarAccess.getComponent_ImplAccess().getServiceAssignment_6()); 
            // InternalAllocation.g:1624:2: ( rule__Component_Impl__ServiceAssignment_6 )
            // InternalAllocation.g:1624:3: rule__Component_Impl__ServiceAssignment_6
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
    // InternalAllocation.g:1632:1: rule__Component_Impl__Group__7 : rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8 ;
    public final void rule__Component_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1636:1: ( rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8 )
            // InternalAllocation.g:1637:2: rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8
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
    // InternalAllocation.g:1644:1: rule__Component_Impl__Group__7__Impl : ( ( rule__Component_Impl__Group_7__0 )* ) ;
    public final void rule__Component_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1648:1: ( ( ( rule__Component_Impl__Group_7__0 )* ) )
            // InternalAllocation.g:1649:1: ( ( rule__Component_Impl__Group_7__0 )* )
            {
            // InternalAllocation.g:1649:1: ( ( rule__Component_Impl__Group_7__0 )* )
            // InternalAllocation.g:1650:2: ( rule__Component_Impl__Group_7__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_7()); 
            // InternalAllocation.g:1651:2: ( rule__Component_Impl__Group_7__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAllocation.g:1651:3: rule__Component_Impl__Group_7__0
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
    // InternalAllocation.g:1659:1: rule__Component_Impl__Group__8 : rule__Component_Impl__Group__8__Impl rule__Component_Impl__Group__9 ;
    public final void rule__Component_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1663:1: ( rule__Component_Impl__Group__8__Impl rule__Component_Impl__Group__9 )
            // InternalAllocation.g:1664:2: rule__Component_Impl__Group__8__Impl rule__Component_Impl__Group__9
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
    // InternalAllocation.g:1671:1: rule__Component_Impl__Group__8__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1675:1: ( ( '}' ) )
            // InternalAllocation.g:1676:1: ( '}' )
            {
            // InternalAllocation.g:1676:1: ( '}' )
            // InternalAllocation.g:1677:2: '}'
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
    // InternalAllocation.g:1686:1: rule__Component_Impl__Group__9 : rule__Component_Impl__Group__9__Impl rule__Component_Impl__Group__10 ;
    public final void rule__Component_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1690:1: ( rule__Component_Impl__Group__9__Impl rule__Component_Impl__Group__10 )
            // InternalAllocation.g:1691:2: rule__Component_Impl__Group__9__Impl rule__Component_Impl__Group__10
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
    // InternalAllocation.g:1698:1: rule__Component_Impl__Group__9__Impl : ( ( rule__Component_Impl__Group_9__0 )? ) ;
    public final void rule__Component_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1702:1: ( ( ( rule__Component_Impl__Group_9__0 )? ) )
            // InternalAllocation.g:1703:1: ( ( rule__Component_Impl__Group_9__0 )? )
            {
            // InternalAllocation.g:1703:1: ( ( rule__Component_Impl__Group_9__0 )? )
            // InternalAllocation.g:1704:2: ( rule__Component_Impl__Group_9__0 )?
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_9()); 
            // InternalAllocation.g:1705:2: ( rule__Component_Impl__Group_9__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAllocation.g:1705:3: rule__Component_Impl__Group_9__0
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
    // InternalAllocation.g:1713:1: rule__Component_Impl__Group__10 : rule__Component_Impl__Group__10__Impl rule__Component_Impl__Group__11 ;
    public final void rule__Component_Impl__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1717:1: ( rule__Component_Impl__Group__10__Impl rule__Component_Impl__Group__11 )
            // InternalAllocation.g:1718:2: rule__Component_Impl__Group__10__Impl rule__Component_Impl__Group__11
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
    // InternalAllocation.g:1725:1: rule__Component_Impl__Group__10__Impl : ( 'providedrole' ) ;
    public final void rule__Component_Impl__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1729:1: ( ( 'providedrole' ) )
            // InternalAllocation.g:1730:1: ( 'providedrole' )
            {
            // InternalAllocation.g:1730:1: ( 'providedrole' )
            // InternalAllocation.g:1731:2: 'providedrole'
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
    // InternalAllocation.g:1740:1: rule__Component_Impl__Group__11 : rule__Component_Impl__Group__11__Impl rule__Component_Impl__Group__12 ;
    public final void rule__Component_Impl__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1744:1: ( rule__Component_Impl__Group__11__Impl rule__Component_Impl__Group__12 )
            // InternalAllocation.g:1745:2: rule__Component_Impl__Group__11__Impl rule__Component_Impl__Group__12
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
    // InternalAllocation.g:1752:1: rule__Component_Impl__Group__11__Impl : ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) ) ;
    public final void rule__Component_Impl__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1756:1: ( ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) ) )
            // InternalAllocation.g:1757:1: ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) )
            {
            // InternalAllocation.g:1757:1: ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) )
            // InternalAllocation.g:1758:2: ( rule__Component_Impl__ProvidedroleAssignment_11 )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedroleAssignment_11()); 
            // InternalAllocation.g:1759:2: ( rule__Component_Impl__ProvidedroleAssignment_11 )
            // InternalAllocation.g:1759:3: rule__Component_Impl__ProvidedroleAssignment_11
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
    // InternalAllocation.g:1767:1: rule__Component_Impl__Group__12 : rule__Component_Impl__Group__12__Impl ;
    public final void rule__Component_Impl__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1771:1: ( rule__Component_Impl__Group__12__Impl )
            // InternalAllocation.g:1772:2: rule__Component_Impl__Group__12__Impl
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
    // InternalAllocation.g:1778:1: rule__Component_Impl__Group__12__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1782:1: ( ( '}' ) )
            // InternalAllocation.g:1783:1: ( '}' )
            {
            // InternalAllocation.g:1783:1: ( '}' )
            // InternalAllocation.g:1784:2: '}'
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
    // InternalAllocation.g:1794:1: rule__Component_Impl__Group_3__0 : rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1 ;
    public final void rule__Component_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1798:1: ( rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1 )
            // InternalAllocation.g:1799:2: rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1
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
    // InternalAllocation.g:1806:1: rule__Component_Impl__Group_3__0__Impl : ( 'behaviourdescription' ) ;
    public final void rule__Component_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1810:1: ( ( 'behaviourdescription' ) )
            // InternalAllocation.g:1811:1: ( 'behaviourdescription' )
            {
            // InternalAllocation.g:1811:1: ( 'behaviourdescription' )
            // InternalAllocation.g:1812:2: 'behaviourdescription'
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
    // InternalAllocation.g:1821:1: rule__Component_Impl__Group_3__1 : rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2 ;
    public final void rule__Component_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1825:1: ( rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2 )
            // InternalAllocation.g:1826:2: rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2
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
    // InternalAllocation.g:1833:1: rule__Component_Impl__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1837:1: ( ( '{' ) )
            // InternalAllocation.g:1838:1: ( '{' )
            {
            // InternalAllocation.g:1838:1: ( '{' )
            // InternalAllocation.g:1839:2: '{'
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
    // InternalAllocation.g:1848:1: rule__Component_Impl__Group_3__2 : rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3 ;
    public final void rule__Component_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1852:1: ( rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3 )
            // InternalAllocation.g:1853:2: rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3
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
    // InternalAllocation.g:1860:1: rule__Component_Impl__Group_3__2__Impl : ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) ) ;
    public final void rule__Component_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1864:1: ( ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) ) )
            // InternalAllocation.g:1865:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) )
            {
            // InternalAllocation.g:1865:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) )
            // InternalAllocation.g:1866:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 )
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionAssignment_3_2()); 
            // InternalAllocation.g:1867:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 )
            // InternalAllocation.g:1867:3: rule__Component_Impl__BehaviourdescriptionAssignment_3_2
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
    // InternalAllocation.g:1875:1: rule__Component_Impl__Group_3__3 : rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4 ;
    public final void rule__Component_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1879:1: ( rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4 )
            // InternalAllocation.g:1880:2: rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4
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
    // InternalAllocation.g:1887:1: rule__Component_Impl__Group_3__3__Impl : ( ( rule__Component_Impl__Group_3_3__0 )* ) ;
    public final void rule__Component_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1891:1: ( ( ( rule__Component_Impl__Group_3_3__0 )* ) )
            // InternalAllocation.g:1892:1: ( ( rule__Component_Impl__Group_3_3__0 )* )
            {
            // InternalAllocation.g:1892:1: ( ( rule__Component_Impl__Group_3_3__0 )* )
            // InternalAllocation.g:1893:2: ( rule__Component_Impl__Group_3_3__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_3_3()); 
            // InternalAllocation.g:1894:2: ( rule__Component_Impl__Group_3_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAllocation.g:1894:3: rule__Component_Impl__Group_3_3__0
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
    // InternalAllocation.g:1902:1: rule__Component_Impl__Group_3__4 : rule__Component_Impl__Group_3__4__Impl ;
    public final void rule__Component_Impl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1906:1: ( rule__Component_Impl__Group_3__4__Impl )
            // InternalAllocation.g:1907:2: rule__Component_Impl__Group_3__4__Impl
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
    // InternalAllocation.g:1913:1: rule__Component_Impl__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1917:1: ( ( '}' ) )
            // InternalAllocation.g:1918:1: ( '}' )
            {
            // InternalAllocation.g:1918:1: ( '}' )
            // InternalAllocation.g:1919:2: '}'
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
    // InternalAllocation.g:1929:1: rule__Component_Impl__Group_3_3__0 : rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1 ;
    public final void rule__Component_Impl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1933:1: ( rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1 )
            // InternalAllocation.g:1934:2: rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1
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
    // InternalAllocation.g:1941:1: rule__Component_Impl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1945:1: ( ( ',' ) )
            // InternalAllocation.g:1946:1: ( ',' )
            {
            // InternalAllocation.g:1946:1: ( ',' )
            // InternalAllocation.g:1947:2: ','
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
    // InternalAllocation.g:1956:1: rule__Component_Impl__Group_3_3__1 : rule__Component_Impl__Group_3_3__1__Impl ;
    public final void rule__Component_Impl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1960:1: ( rule__Component_Impl__Group_3_3__1__Impl )
            // InternalAllocation.g:1961:2: rule__Component_Impl__Group_3_3__1__Impl
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
    // InternalAllocation.g:1967:1: rule__Component_Impl__Group_3_3__1__Impl : ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) ) ;
    public final void rule__Component_Impl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1971:1: ( ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) ) )
            // InternalAllocation.g:1972:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) )
            {
            // InternalAllocation.g:1972:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) )
            // InternalAllocation.g:1973:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionAssignment_3_3_1()); 
            // InternalAllocation.g:1974:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 )
            // InternalAllocation.g:1974:3: rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1
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
    // InternalAllocation.g:1983:1: rule__Component_Impl__Group_7__0 : rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1 ;
    public final void rule__Component_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1987:1: ( rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1 )
            // InternalAllocation.g:1988:2: rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1
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
    // InternalAllocation.g:1995:1: rule__Component_Impl__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:1999:1: ( ( ',' ) )
            // InternalAllocation.g:2000:1: ( ',' )
            {
            // InternalAllocation.g:2000:1: ( ',' )
            // InternalAllocation.g:2001:2: ','
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
    // InternalAllocation.g:2010:1: rule__Component_Impl__Group_7__1 : rule__Component_Impl__Group_7__1__Impl ;
    public final void rule__Component_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2014:1: ( rule__Component_Impl__Group_7__1__Impl )
            // InternalAllocation.g:2015:2: rule__Component_Impl__Group_7__1__Impl
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
    // InternalAllocation.g:2021:1: rule__Component_Impl__Group_7__1__Impl : ( ( rule__Component_Impl__ServiceAssignment_7_1 ) ) ;
    public final void rule__Component_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2025:1: ( ( ( rule__Component_Impl__ServiceAssignment_7_1 ) ) )
            // InternalAllocation.g:2026:1: ( ( rule__Component_Impl__ServiceAssignment_7_1 ) )
            {
            // InternalAllocation.g:2026:1: ( ( rule__Component_Impl__ServiceAssignment_7_1 ) )
            // InternalAllocation.g:2027:2: ( rule__Component_Impl__ServiceAssignment_7_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getServiceAssignment_7_1()); 
            // InternalAllocation.g:2028:2: ( rule__Component_Impl__ServiceAssignment_7_1 )
            // InternalAllocation.g:2028:3: rule__Component_Impl__ServiceAssignment_7_1
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
    // InternalAllocation.g:2037:1: rule__Component_Impl__Group_9__0 : rule__Component_Impl__Group_9__0__Impl rule__Component_Impl__Group_9__1 ;
    public final void rule__Component_Impl__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2041:1: ( rule__Component_Impl__Group_9__0__Impl rule__Component_Impl__Group_9__1 )
            // InternalAllocation.g:2042:2: rule__Component_Impl__Group_9__0__Impl rule__Component_Impl__Group_9__1
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
    // InternalAllocation.g:2049:1: rule__Component_Impl__Group_9__0__Impl : ( 'requiredrole' ) ;
    public final void rule__Component_Impl__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2053:1: ( ( 'requiredrole' ) )
            // InternalAllocation.g:2054:1: ( 'requiredrole' )
            {
            // InternalAllocation.g:2054:1: ( 'requiredrole' )
            // InternalAllocation.g:2055:2: 'requiredrole'
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
    // InternalAllocation.g:2064:1: rule__Component_Impl__Group_9__1 : rule__Component_Impl__Group_9__1__Impl rule__Component_Impl__Group_9__2 ;
    public final void rule__Component_Impl__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2068:1: ( rule__Component_Impl__Group_9__1__Impl rule__Component_Impl__Group_9__2 )
            // InternalAllocation.g:2069:2: rule__Component_Impl__Group_9__1__Impl rule__Component_Impl__Group_9__2
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
    // InternalAllocation.g:2076:1: rule__Component_Impl__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2080:1: ( ( '{' ) )
            // InternalAllocation.g:2081:1: ( '{' )
            {
            // InternalAllocation.g:2081:1: ( '{' )
            // InternalAllocation.g:2082:2: '{'
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
    // InternalAllocation.g:2091:1: rule__Component_Impl__Group_9__2 : rule__Component_Impl__Group_9__2__Impl rule__Component_Impl__Group_9__3 ;
    public final void rule__Component_Impl__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2095:1: ( rule__Component_Impl__Group_9__2__Impl rule__Component_Impl__Group_9__3 )
            // InternalAllocation.g:2096:2: rule__Component_Impl__Group_9__2__Impl rule__Component_Impl__Group_9__3
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
    // InternalAllocation.g:2103:1: rule__Component_Impl__Group_9__2__Impl : ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) ) ;
    public final void rule__Component_Impl__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2107:1: ( ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) ) )
            // InternalAllocation.g:2108:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) )
            {
            // InternalAllocation.g:2108:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) )
            // InternalAllocation.g:2109:2: ( rule__Component_Impl__RequiredroleAssignment_9_2 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredroleAssignment_9_2()); 
            // InternalAllocation.g:2110:2: ( rule__Component_Impl__RequiredroleAssignment_9_2 )
            // InternalAllocation.g:2110:3: rule__Component_Impl__RequiredroleAssignment_9_2
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
    // InternalAllocation.g:2118:1: rule__Component_Impl__Group_9__3 : rule__Component_Impl__Group_9__3__Impl rule__Component_Impl__Group_9__4 ;
    public final void rule__Component_Impl__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2122:1: ( rule__Component_Impl__Group_9__3__Impl rule__Component_Impl__Group_9__4 )
            // InternalAllocation.g:2123:2: rule__Component_Impl__Group_9__3__Impl rule__Component_Impl__Group_9__4
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
    // InternalAllocation.g:2130:1: rule__Component_Impl__Group_9__3__Impl : ( ( rule__Component_Impl__Group_9_3__0 )* ) ;
    public final void rule__Component_Impl__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2134:1: ( ( ( rule__Component_Impl__Group_9_3__0 )* ) )
            // InternalAllocation.g:2135:1: ( ( rule__Component_Impl__Group_9_3__0 )* )
            {
            // InternalAllocation.g:2135:1: ( ( rule__Component_Impl__Group_9_3__0 )* )
            // InternalAllocation.g:2136:2: ( rule__Component_Impl__Group_9_3__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_9_3()); 
            // InternalAllocation.g:2137:2: ( rule__Component_Impl__Group_9_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAllocation.g:2137:3: rule__Component_Impl__Group_9_3__0
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
    // InternalAllocation.g:2145:1: rule__Component_Impl__Group_9__4 : rule__Component_Impl__Group_9__4__Impl ;
    public final void rule__Component_Impl__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2149:1: ( rule__Component_Impl__Group_9__4__Impl )
            // InternalAllocation.g:2150:2: rule__Component_Impl__Group_9__4__Impl
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
    // InternalAllocation.g:2156:1: rule__Component_Impl__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2160:1: ( ( '}' ) )
            // InternalAllocation.g:2161:1: ( '}' )
            {
            // InternalAllocation.g:2161:1: ( '}' )
            // InternalAllocation.g:2162:2: '}'
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
    // InternalAllocation.g:2172:1: rule__Component_Impl__Group_9_3__0 : rule__Component_Impl__Group_9_3__0__Impl rule__Component_Impl__Group_9_3__1 ;
    public final void rule__Component_Impl__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2176:1: ( rule__Component_Impl__Group_9_3__0__Impl rule__Component_Impl__Group_9_3__1 )
            // InternalAllocation.g:2177:2: rule__Component_Impl__Group_9_3__0__Impl rule__Component_Impl__Group_9_3__1
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
    // InternalAllocation.g:2184:1: rule__Component_Impl__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2188:1: ( ( ',' ) )
            // InternalAllocation.g:2189:1: ( ',' )
            {
            // InternalAllocation.g:2189:1: ( ',' )
            // InternalAllocation.g:2190:2: ','
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
    // InternalAllocation.g:2199:1: rule__Component_Impl__Group_9_3__1 : rule__Component_Impl__Group_9_3__1__Impl ;
    public final void rule__Component_Impl__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2203:1: ( rule__Component_Impl__Group_9_3__1__Impl )
            // InternalAllocation.g:2204:2: rule__Component_Impl__Group_9_3__1__Impl
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
    // InternalAllocation.g:2210:1: rule__Component_Impl__Group_9_3__1__Impl : ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) ) ;
    public final void rule__Component_Impl__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2214:1: ( ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) ) )
            // InternalAllocation.g:2215:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) )
            {
            // InternalAllocation.g:2215:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) )
            // InternalAllocation.g:2216:2: ( rule__Component_Impl__RequiredroleAssignment_9_3_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredroleAssignment_9_3_1()); 
            // InternalAllocation.g:2217:2: ( rule__Component_Impl__RequiredroleAssignment_9_3_1 )
            // InternalAllocation.g:2217:3: rule__Component_Impl__RequiredroleAssignment_9_3_1
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


    // $ANTLR start "rule__BehaviourDescription__Group__0"
    // InternalAllocation.g:2226:1: rule__BehaviourDescription__Group__0 : rule__BehaviourDescription__Group__0__Impl rule__BehaviourDescription__Group__1 ;
    public final void rule__BehaviourDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2230:1: ( rule__BehaviourDescription__Group__0__Impl rule__BehaviourDescription__Group__1 )
            // InternalAllocation.g:2231:2: rule__BehaviourDescription__Group__0__Impl rule__BehaviourDescription__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__BehaviourDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__1();

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
    // $ANTLR end "rule__BehaviourDescription__Group__0"


    // $ANTLR start "rule__BehaviourDescription__Group__0__Impl"
    // InternalAllocation.g:2238:1: rule__BehaviourDescription__Group__0__Impl : ( () ) ;
    public final void rule__BehaviourDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2242:1: ( ( () ) )
            // InternalAllocation.g:2243:1: ( () )
            {
            // InternalAllocation.g:2243:1: ( () )
            // InternalAllocation.g:2244:2: ()
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionAction_0()); 
            // InternalAllocation.g:2245:2: ()
            // InternalAllocation.g:2245:3: 
            {
            }

             after(grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__0__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group__1"
    // InternalAllocation.g:2253:1: rule__BehaviourDescription__Group__1 : rule__BehaviourDescription__Group__1__Impl rule__BehaviourDescription__Group__2 ;
    public final void rule__BehaviourDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2257:1: ( rule__BehaviourDescription__Group__1__Impl rule__BehaviourDescription__Group__2 )
            // InternalAllocation.g:2258:2: rule__BehaviourDescription__Group__1__Impl rule__BehaviourDescription__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BehaviourDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__2();

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
    // $ANTLR end "rule__BehaviourDescription__Group__1"


    // $ANTLR start "rule__BehaviourDescription__Group__1__Impl"
    // InternalAllocation.g:2265:1: rule__BehaviourDescription__Group__1__Impl : ( 'BehaviourDescription' ) ;
    public final void rule__BehaviourDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2269:1: ( ( 'BehaviourDescription' ) )
            // InternalAllocation.g:2270:1: ( 'BehaviourDescription' )
            {
            // InternalAllocation.g:2270:1: ( 'BehaviourDescription' )
            // InternalAllocation.g:2271:2: 'BehaviourDescription'
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__1__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group__2"
    // InternalAllocation.g:2280:1: rule__BehaviourDescription__Group__2 : rule__BehaviourDescription__Group__2__Impl rule__BehaviourDescription__Group__3 ;
    public final void rule__BehaviourDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2284:1: ( rule__BehaviourDescription__Group__2__Impl rule__BehaviourDescription__Group__3 )
            // InternalAllocation.g:2285:2: rule__BehaviourDescription__Group__2__Impl rule__BehaviourDescription__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__BehaviourDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__3();

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
    // $ANTLR end "rule__BehaviourDescription__Group__2"


    // $ANTLR start "rule__BehaviourDescription__Group__2__Impl"
    // InternalAllocation.g:2292:1: rule__BehaviourDescription__Group__2__Impl : ( '{' ) ;
    public final void rule__BehaviourDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2296:1: ( ( '{' ) )
            // InternalAllocation.g:2297:1: ( '{' )
            {
            // InternalAllocation.g:2297:1: ( '{' )
            // InternalAllocation.g:2298:2: '{'
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__2__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group__3"
    // InternalAllocation.g:2307:1: rule__BehaviourDescription__Group__3 : rule__BehaviourDescription__Group__3__Impl rule__BehaviourDescription__Group__4 ;
    public final void rule__BehaviourDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2311:1: ( rule__BehaviourDescription__Group__3__Impl rule__BehaviourDescription__Group__4 )
            // InternalAllocation.g:2312:2: rule__BehaviourDescription__Group__3__Impl rule__BehaviourDescription__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__BehaviourDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__4();

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
    // $ANTLR end "rule__BehaviourDescription__Group__3"


    // $ANTLR start "rule__BehaviourDescription__Group__3__Impl"
    // InternalAllocation.g:2319:1: rule__BehaviourDescription__Group__3__Impl : ( ( rule__BehaviourDescription__Group_3__0 )? ) ;
    public final void rule__BehaviourDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2323:1: ( ( ( rule__BehaviourDescription__Group_3__0 )? ) )
            // InternalAllocation.g:2324:1: ( ( rule__BehaviourDescription__Group_3__0 )? )
            {
            // InternalAllocation.g:2324:1: ( ( rule__BehaviourDescription__Group_3__0 )? )
            // InternalAllocation.g:2325:2: ( rule__BehaviourDescription__Group_3__0 )?
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getGroup_3()); 
            // InternalAllocation.g:2326:2: ( rule__BehaviourDescription__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAllocation.g:2326:3: rule__BehaviourDescription__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BehaviourDescription__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBehaviourDescriptionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__3__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group__4"
    // InternalAllocation.g:2334:1: rule__BehaviourDescription__Group__4 : rule__BehaviourDescription__Group__4__Impl ;
    public final void rule__BehaviourDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2338:1: ( rule__BehaviourDescription__Group__4__Impl )
            // InternalAllocation.g:2339:2: rule__BehaviourDescription__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__4__Impl();

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
    // $ANTLR end "rule__BehaviourDescription__Group__4"


    // $ANTLR start "rule__BehaviourDescription__Group__4__Impl"
    // InternalAllocation.g:2345:1: rule__BehaviourDescription__Group__4__Impl : ( '}' ) ;
    public final void rule__BehaviourDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2349:1: ( ( '}' ) )
            // InternalAllocation.g:2350:1: ( '}' )
            {
            // InternalAllocation.g:2350:1: ( '}' )
            // InternalAllocation.g:2351:2: '}'
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__4__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group_3__0"
    // InternalAllocation.g:2361:1: rule__BehaviourDescription__Group_3__0 : rule__BehaviourDescription__Group_3__0__Impl rule__BehaviourDescription__Group_3__1 ;
    public final void rule__BehaviourDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2365:1: ( rule__BehaviourDescription__Group_3__0__Impl rule__BehaviourDescription__Group_3__1 )
            // InternalAllocation.g:2366:2: rule__BehaviourDescription__Group_3__0__Impl rule__BehaviourDescription__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__BehaviourDescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group_3__1();

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
    // $ANTLR end "rule__BehaviourDescription__Group_3__0"


    // $ANTLR start "rule__BehaviourDescription__Group_3__0__Impl"
    // InternalAllocation.g:2373:1: rule__BehaviourDescription__Group_3__0__Impl : ( 'descriptionelement' ) ;
    public final void rule__BehaviourDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2377:1: ( ( 'descriptionelement' ) )
            // InternalAllocation.g:2378:1: ( 'descriptionelement' )
            {
            // InternalAllocation.g:2378:1: ( 'descriptionelement' )
            // InternalAllocation.g:2379:2: 'descriptionelement'
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group_3__0__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group_3__1"
    // InternalAllocation.g:2388:1: rule__BehaviourDescription__Group_3__1 : rule__BehaviourDescription__Group_3__1__Impl rule__BehaviourDescription__Group_3__2 ;
    public final void rule__BehaviourDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2392:1: ( rule__BehaviourDescription__Group_3__1__Impl rule__BehaviourDescription__Group_3__2 )
            // InternalAllocation.g:2393:2: rule__BehaviourDescription__Group_3__1__Impl rule__BehaviourDescription__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__BehaviourDescription__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group_3__2();

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
    // $ANTLR end "rule__BehaviourDescription__Group_3__1"


    // $ANTLR start "rule__BehaviourDescription__Group_3__1__Impl"
    // InternalAllocation.g:2400:1: rule__BehaviourDescription__Group_3__1__Impl : ( '{' ) ;
    public final void rule__BehaviourDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2404:1: ( ( '{' ) )
            // InternalAllocation.g:2405:1: ( '{' )
            {
            // InternalAllocation.g:2405:1: ( '{' )
            // InternalAllocation.g:2406:2: '{'
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group_3__1__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group_3__2"
    // InternalAllocation.g:2415:1: rule__BehaviourDescription__Group_3__2 : rule__BehaviourDescription__Group_3__2__Impl rule__BehaviourDescription__Group_3__3 ;
    public final void rule__BehaviourDescription__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2419:1: ( rule__BehaviourDescription__Group_3__2__Impl rule__BehaviourDescription__Group_3__3 )
            // InternalAllocation.g:2420:2: rule__BehaviourDescription__Group_3__2__Impl rule__BehaviourDescription__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__BehaviourDescription__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group_3__3();

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
    // $ANTLR end "rule__BehaviourDescription__Group_3__2"


    // $ANTLR start "rule__BehaviourDescription__Group_3__2__Impl"
    // InternalAllocation.g:2427:1: rule__BehaviourDescription__Group_3__2__Impl : ( ( rule__BehaviourDescription__DescriptionelementAssignment_3_2 ) ) ;
    public final void rule__BehaviourDescription__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2431:1: ( ( ( rule__BehaviourDescription__DescriptionelementAssignment_3_2 ) ) )
            // InternalAllocation.g:2432:1: ( ( rule__BehaviourDescription__DescriptionelementAssignment_3_2 ) )
            {
            // InternalAllocation.g:2432:1: ( ( rule__BehaviourDescription__DescriptionelementAssignment_3_2 ) )
            // InternalAllocation.g:2433:2: ( rule__BehaviourDescription__DescriptionelementAssignment_3_2 )
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementAssignment_3_2()); 
            // InternalAllocation.g:2434:2: ( rule__BehaviourDescription__DescriptionelementAssignment_3_2 )
            // InternalAllocation.g:2434:3: rule__BehaviourDescription__DescriptionelementAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__DescriptionelementAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group_3__2__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group_3__3"
    // InternalAllocation.g:2442:1: rule__BehaviourDescription__Group_3__3 : rule__BehaviourDescription__Group_3__3__Impl rule__BehaviourDescription__Group_3__4 ;
    public final void rule__BehaviourDescription__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2446:1: ( rule__BehaviourDescription__Group_3__3__Impl rule__BehaviourDescription__Group_3__4 )
            // InternalAllocation.g:2447:2: rule__BehaviourDescription__Group_3__3__Impl rule__BehaviourDescription__Group_3__4
            {
            pushFollow(FOLLOW_6);
            rule__BehaviourDescription__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group_3__4();

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
    // $ANTLR end "rule__BehaviourDescription__Group_3__3"


    // $ANTLR start "rule__BehaviourDescription__Group_3__3__Impl"
    // InternalAllocation.g:2454:1: rule__BehaviourDescription__Group_3__3__Impl : ( ( rule__BehaviourDescription__Group_3_3__0 )* ) ;
    public final void rule__BehaviourDescription__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2458:1: ( ( ( rule__BehaviourDescription__Group_3_3__0 )* ) )
            // InternalAllocation.g:2459:1: ( ( rule__BehaviourDescription__Group_3_3__0 )* )
            {
            // InternalAllocation.g:2459:1: ( ( rule__BehaviourDescription__Group_3_3__0 )* )
            // InternalAllocation.g:2460:2: ( rule__BehaviourDescription__Group_3_3__0 )*
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getGroup_3_3()); 
            // InternalAllocation.g:2461:2: ( rule__BehaviourDescription__Group_3_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAllocation.g:2461:3: rule__BehaviourDescription__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BehaviourDescription__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBehaviourDescriptionAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group_3__3__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group_3__4"
    // InternalAllocation.g:2469:1: rule__BehaviourDescription__Group_3__4 : rule__BehaviourDescription__Group_3__4__Impl ;
    public final void rule__BehaviourDescription__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2473:1: ( rule__BehaviourDescription__Group_3__4__Impl )
            // InternalAllocation.g:2474:2: rule__BehaviourDescription__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group_3__4__Impl();

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
    // $ANTLR end "rule__BehaviourDescription__Group_3__4"


    // $ANTLR start "rule__BehaviourDescription__Group_3__4__Impl"
    // InternalAllocation.g:2480:1: rule__BehaviourDescription__Group_3__4__Impl : ( '}' ) ;
    public final void rule__BehaviourDescription__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2484:1: ( ( '}' ) )
            // InternalAllocation.g:2485:1: ( '}' )
            {
            // InternalAllocation.g:2485:1: ( '}' )
            // InternalAllocation.g:2486:2: '}'
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group_3__4__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group_3_3__0"
    // InternalAllocation.g:2496:1: rule__BehaviourDescription__Group_3_3__0 : rule__BehaviourDescription__Group_3_3__0__Impl rule__BehaviourDescription__Group_3_3__1 ;
    public final void rule__BehaviourDescription__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2500:1: ( rule__BehaviourDescription__Group_3_3__0__Impl rule__BehaviourDescription__Group_3_3__1 )
            // InternalAllocation.g:2501:2: rule__BehaviourDescription__Group_3_3__0__Impl rule__BehaviourDescription__Group_3_3__1
            {
            pushFollow(FOLLOW_20);
            rule__BehaviourDescription__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group_3_3__1();

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
    // $ANTLR end "rule__BehaviourDescription__Group_3_3__0"


    // $ANTLR start "rule__BehaviourDescription__Group_3_3__0__Impl"
    // InternalAllocation.g:2508:1: rule__BehaviourDescription__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__BehaviourDescription__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2512:1: ( ( ',' ) )
            // InternalAllocation.g:2513:1: ( ',' )
            {
            // InternalAllocation.g:2513:1: ( ',' )
            // InternalAllocation.g:2514:2: ','
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_3_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group_3_3__0__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group_3_3__1"
    // InternalAllocation.g:2523:1: rule__BehaviourDescription__Group_3_3__1 : rule__BehaviourDescription__Group_3_3__1__Impl ;
    public final void rule__BehaviourDescription__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2527:1: ( rule__BehaviourDescription__Group_3_3__1__Impl )
            // InternalAllocation.g:2528:2: rule__BehaviourDescription__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__BehaviourDescription__Group_3_3__1"


    // $ANTLR start "rule__BehaviourDescription__Group_3_3__1__Impl"
    // InternalAllocation.g:2534:1: rule__BehaviourDescription__Group_3_3__1__Impl : ( ( rule__BehaviourDescription__DescriptionelementAssignment_3_3_1 ) ) ;
    public final void rule__BehaviourDescription__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2538:1: ( ( ( rule__BehaviourDescription__DescriptionelementAssignment_3_3_1 ) ) )
            // InternalAllocation.g:2539:1: ( ( rule__BehaviourDescription__DescriptionelementAssignment_3_3_1 ) )
            {
            // InternalAllocation.g:2539:1: ( ( rule__BehaviourDescription__DescriptionelementAssignment_3_3_1 ) )
            // InternalAllocation.g:2540:2: ( rule__BehaviourDescription__DescriptionelementAssignment_3_3_1 )
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementAssignment_3_3_1()); 
            // InternalAllocation.g:2541:2: ( rule__BehaviourDescription__DescriptionelementAssignment_3_3_1 )
            // InternalAllocation.g:2541:3: rule__BehaviourDescription__DescriptionelementAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__DescriptionelementAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group_3_3__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalAllocation.g:2550:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2554:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalAllocation.g:2555:2: rule__Service__Group__0__Impl rule__Service__Group__1
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
    // InternalAllocation.g:2562:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2566:1: ( ( 'Service' ) )
            // InternalAllocation.g:2567:1: ( 'Service' )
            {
            // InternalAllocation.g:2567:1: ( 'Service' )
            // InternalAllocation.g:2568:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAllocation.g:2577:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2581:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalAllocation.g:2582:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalAllocation.g:2589:1: rule__Service__Group__1__Impl : ( '{' ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2593:1: ( ( '{' ) )
            // InternalAllocation.g:2594:1: ( '{' )
            {
            // InternalAllocation.g:2594:1: ( '{' )
            // InternalAllocation.g:2595:2: '{'
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
    // InternalAllocation.g:2604:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2608:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalAllocation.g:2609:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalAllocation.g:2616:1: rule__Service__Group__2__Impl : ( 'correspondingSignatures' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2620:1: ( ( 'correspondingSignatures' ) )
            // InternalAllocation.g:2621:1: ( 'correspondingSignatures' )
            {
            // InternalAllocation.g:2621:1: ( 'correspondingSignatures' )
            // InternalAllocation.g:2622:2: 'correspondingSignatures'
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalAllocation.g:2631:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2635:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalAllocation.g:2636:2: rule__Service__Group__3__Impl rule__Service__Group__4
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
    // InternalAllocation.g:2643:1: rule__Service__Group__3__Impl : ( '(' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2647:1: ( ( '(' ) )
            // InternalAllocation.g:2648:1: ( '(' )
            {
            // InternalAllocation.g:2648:1: ( '(' )
            // InternalAllocation.g:2649:2: '('
            {
             before(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalAllocation.g:2658:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2662:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalAllocation.g:2663:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalAllocation.g:2670:1: rule__Service__Group__4__Impl : ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2674:1: ( ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) ) )
            // InternalAllocation.g:2675:1: ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) )
            {
            // InternalAllocation.g:2675:1: ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) )
            // InternalAllocation.g:2676:2: ( rule__Service__CorrespondingSignaturesAssignment_4 )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesAssignment_4()); 
            // InternalAllocation.g:2677:2: ( rule__Service__CorrespondingSignaturesAssignment_4 )
            // InternalAllocation.g:2677:3: rule__Service__CorrespondingSignaturesAssignment_4
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
    // InternalAllocation.g:2685:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2689:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalAllocation.g:2690:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalAllocation.g:2697:1: rule__Service__Group__5__Impl : ( ( rule__Service__Group_5__0 )* ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2701:1: ( ( ( rule__Service__Group_5__0 )* ) )
            // InternalAllocation.g:2702:1: ( ( rule__Service__Group_5__0 )* )
            {
            // InternalAllocation.g:2702:1: ( ( rule__Service__Group_5__0 )* )
            // InternalAllocation.g:2703:2: ( rule__Service__Group_5__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_5()); 
            // InternalAllocation.g:2704:2: ( rule__Service__Group_5__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAllocation.g:2704:3: rule__Service__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Service__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalAllocation.g:2712:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2716:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalAllocation.g:2717:2: rule__Service__Group__6__Impl rule__Service__Group__7
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
    // InternalAllocation.g:2724:1: rule__Service__Group__6__Impl : ( ')' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2728:1: ( ( ')' ) )
            // InternalAllocation.g:2729:1: ( ')' )
            {
            // InternalAllocation.g:2729:1: ( ')' )
            // InternalAllocation.g:2730:2: ')'
            {
             before(grammarAccess.getServiceAccess().getRightParenthesisKeyword_6()); 
            match(input,41,FOLLOW_2); 
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
    // InternalAllocation.g:2739:1: rule__Service__Group__7 : rule__Service__Group__7__Impl ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2743:1: ( rule__Service__Group__7__Impl )
            // InternalAllocation.g:2744:2: rule__Service__Group__7__Impl
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
    // InternalAllocation.g:2750:1: rule__Service__Group__7__Impl : ( '}' ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2754:1: ( ( '}' ) )
            // InternalAllocation.g:2755:1: ( '}' )
            {
            // InternalAllocation.g:2755:1: ( '}' )
            // InternalAllocation.g:2756:2: '}'
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
    // InternalAllocation.g:2766:1: rule__Service__Group_5__0 : rule__Service__Group_5__0__Impl rule__Service__Group_5__1 ;
    public final void rule__Service__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2770:1: ( rule__Service__Group_5__0__Impl rule__Service__Group_5__1 )
            // InternalAllocation.g:2771:2: rule__Service__Group_5__0__Impl rule__Service__Group_5__1
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
    // InternalAllocation.g:2778:1: rule__Service__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2782:1: ( ( ',' ) )
            // InternalAllocation.g:2783:1: ( ',' )
            {
            // InternalAllocation.g:2783:1: ( ',' )
            // InternalAllocation.g:2784:2: ','
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
    // InternalAllocation.g:2793:1: rule__Service__Group_5__1 : rule__Service__Group_5__1__Impl ;
    public final void rule__Service__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2797:1: ( rule__Service__Group_5__1__Impl )
            // InternalAllocation.g:2798:2: rule__Service__Group_5__1__Impl
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
    // InternalAllocation.g:2804:1: rule__Service__Group_5__1__Impl : ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) ) ;
    public final void rule__Service__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2808:1: ( ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) ) )
            // InternalAllocation.g:2809:1: ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) )
            {
            // InternalAllocation.g:2809:1: ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) )
            // InternalAllocation.g:2810:2: ( rule__Service__CorrespondingSignaturesAssignment_5_1 )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesAssignment_5_1()); 
            // InternalAllocation.g:2811:2: ( rule__Service__CorrespondingSignaturesAssignment_5_1 )
            // InternalAllocation.g:2811:3: rule__Service__CorrespondingSignaturesAssignment_5_1
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
    // InternalAllocation.g:2820:1: rule__RequiredRole__Group__0 : rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 ;
    public final void rule__RequiredRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2824:1: ( rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 )
            // InternalAllocation.g:2825:2: rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1
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
    // InternalAllocation.g:2832:1: rule__RequiredRole__Group__0__Impl : ( 'RequiredRole' ) ;
    public final void rule__RequiredRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2836:1: ( ( 'RequiredRole' ) )
            // InternalAllocation.g:2837:1: ( 'RequiredRole' )
            {
            // InternalAllocation.g:2837:1: ( 'RequiredRole' )
            // InternalAllocation.g:2838:2: 'RequiredRole'
            {
             before(grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalAllocation.g:2847:1: rule__RequiredRole__Group__1 : rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 ;
    public final void rule__RequiredRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2851:1: ( rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 )
            // InternalAllocation.g:2852:2: rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2
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
    // InternalAllocation.g:2859:1: rule__RequiredRole__Group__1__Impl : ( ( rule__RequiredRole__NameAssignment_1 ) ) ;
    public final void rule__RequiredRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2863:1: ( ( ( rule__RequiredRole__NameAssignment_1 ) ) )
            // InternalAllocation.g:2864:1: ( ( rule__RequiredRole__NameAssignment_1 ) )
            {
            // InternalAllocation.g:2864:1: ( ( rule__RequiredRole__NameAssignment_1 ) )
            // InternalAllocation.g:2865:2: ( rule__RequiredRole__NameAssignment_1 )
            {
             before(grammarAccess.getRequiredRoleAccess().getNameAssignment_1()); 
            // InternalAllocation.g:2866:2: ( rule__RequiredRole__NameAssignment_1 )
            // InternalAllocation.g:2866:3: rule__RequiredRole__NameAssignment_1
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
    // InternalAllocation.g:2874:1: rule__RequiredRole__Group__2 : rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3 ;
    public final void rule__RequiredRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2878:1: ( rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3 )
            // InternalAllocation.g:2879:2: rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalAllocation.g:2886:1: rule__RequiredRole__Group__2__Impl : ( '{' ) ;
    public final void rule__RequiredRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2890:1: ( ( '{' ) )
            // InternalAllocation.g:2891:1: ( '{' )
            {
            // InternalAllocation.g:2891:1: ( '{' )
            // InternalAllocation.g:2892:2: '{'
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
    // InternalAllocation.g:2901:1: rule__RequiredRole__Group__3 : rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4 ;
    public final void rule__RequiredRole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2905:1: ( rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4 )
            // InternalAllocation.g:2906:2: rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4
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
    // InternalAllocation.g:2913:1: rule__RequiredRole__Group__3__Impl : ( 'interface' ) ;
    public final void rule__RequiredRole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2917:1: ( ( 'interface' ) )
            // InternalAllocation.g:2918:1: ( 'interface' )
            {
            // InternalAllocation.g:2918:1: ( 'interface' )
            // InternalAllocation.g:2919:2: 'interface'
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalAllocation.g:2928:1: rule__RequiredRole__Group__4 : rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5 ;
    public final void rule__RequiredRole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2932:1: ( rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5 )
            // InternalAllocation.g:2933:2: rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5
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
    // InternalAllocation.g:2940:1: rule__RequiredRole__Group__4__Impl : ( ( rule__RequiredRole__InterfaceAssignment_4 ) ) ;
    public final void rule__RequiredRole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2944:1: ( ( ( rule__RequiredRole__InterfaceAssignment_4 ) ) )
            // InternalAllocation.g:2945:1: ( ( rule__RequiredRole__InterfaceAssignment_4 ) )
            {
            // InternalAllocation.g:2945:1: ( ( rule__RequiredRole__InterfaceAssignment_4 ) )
            // InternalAllocation.g:2946:2: ( rule__RequiredRole__InterfaceAssignment_4 )
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceAssignment_4()); 
            // InternalAllocation.g:2947:2: ( rule__RequiredRole__InterfaceAssignment_4 )
            // InternalAllocation.g:2947:3: rule__RequiredRole__InterfaceAssignment_4
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
    // InternalAllocation.g:2955:1: rule__RequiredRole__Group__5 : rule__RequiredRole__Group__5__Impl ;
    public final void rule__RequiredRole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2959:1: ( rule__RequiredRole__Group__5__Impl )
            // InternalAllocation.g:2960:2: rule__RequiredRole__Group__5__Impl
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
    // InternalAllocation.g:2966:1: rule__RequiredRole__Group__5__Impl : ( '}' ) ;
    public final void rule__RequiredRole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2970:1: ( ( '}' ) )
            // InternalAllocation.g:2971:1: ( '}' )
            {
            // InternalAllocation.g:2971:1: ( '}' )
            // InternalAllocation.g:2972:2: '}'
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
    // InternalAllocation.g:2982:1: rule__ProvidedRole__Group__0 : rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 ;
    public final void rule__ProvidedRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2986:1: ( rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 )
            // InternalAllocation.g:2987:2: rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1
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
    // InternalAllocation.g:2994:1: rule__ProvidedRole__Group__0__Impl : ( 'ProvidedRole' ) ;
    public final void rule__ProvidedRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:2998:1: ( ( 'ProvidedRole' ) )
            // InternalAllocation.g:2999:1: ( 'ProvidedRole' )
            {
            // InternalAllocation.g:2999:1: ( 'ProvidedRole' )
            // InternalAllocation.g:3000:2: 'ProvidedRole'
            {
             before(grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAllocation.g:3009:1: rule__ProvidedRole__Group__1 : rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 ;
    public final void rule__ProvidedRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3013:1: ( rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 )
            // InternalAllocation.g:3014:2: rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2
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
    // InternalAllocation.g:3021:1: rule__ProvidedRole__Group__1__Impl : ( ( rule__ProvidedRole__NameAssignment_1 ) ) ;
    public final void rule__ProvidedRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3025:1: ( ( ( rule__ProvidedRole__NameAssignment_1 ) ) )
            // InternalAllocation.g:3026:1: ( ( rule__ProvidedRole__NameAssignment_1 ) )
            {
            // InternalAllocation.g:3026:1: ( ( rule__ProvidedRole__NameAssignment_1 ) )
            // InternalAllocation.g:3027:2: ( rule__ProvidedRole__NameAssignment_1 )
            {
             before(grammarAccess.getProvidedRoleAccess().getNameAssignment_1()); 
            // InternalAllocation.g:3028:2: ( rule__ProvidedRole__NameAssignment_1 )
            // InternalAllocation.g:3028:3: rule__ProvidedRole__NameAssignment_1
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
    // InternalAllocation.g:3036:1: rule__ProvidedRole__Group__2 : rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3 ;
    public final void rule__ProvidedRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3040:1: ( rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3 )
            // InternalAllocation.g:3041:2: rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalAllocation.g:3048:1: rule__ProvidedRole__Group__2__Impl : ( '{' ) ;
    public final void rule__ProvidedRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3052:1: ( ( '{' ) )
            // InternalAllocation.g:3053:1: ( '{' )
            {
            // InternalAllocation.g:3053:1: ( '{' )
            // InternalAllocation.g:3054:2: '{'
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
    // InternalAllocation.g:3063:1: rule__ProvidedRole__Group__3 : rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4 ;
    public final void rule__ProvidedRole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3067:1: ( rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4 )
            // InternalAllocation.g:3068:2: rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4
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
    // InternalAllocation.g:3075:1: rule__ProvidedRole__Group__3__Impl : ( 'interface' ) ;
    public final void rule__ProvidedRole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3079:1: ( ( 'interface' ) )
            // InternalAllocation.g:3080:1: ( 'interface' )
            {
            // InternalAllocation.g:3080:1: ( 'interface' )
            // InternalAllocation.g:3081:2: 'interface'
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalAllocation.g:3090:1: rule__ProvidedRole__Group__4 : rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5 ;
    public final void rule__ProvidedRole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3094:1: ( rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5 )
            // InternalAllocation.g:3095:2: rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5
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
    // InternalAllocation.g:3102:1: rule__ProvidedRole__Group__4__Impl : ( ( rule__ProvidedRole__InterfaceAssignment_4 ) ) ;
    public final void rule__ProvidedRole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3106:1: ( ( ( rule__ProvidedRole__InterfaceAssignment_4 ) ) )
            // InternalAllocation.g:3107:1: ( ( rule__ProvidedRole__InterfaceAssignment_4 ) )
            {
            // InternalAllocation.g:3107:1: ( ( rule__ProvidedRole__InterfaceAssignment_4 ) )
            // InternalAllocation.g:3108:2: ( rule__ProvidedRole__InterfaceAssignment_4 )
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceAssignment_4()); 
            // InternalAllocation.g:3109:2: ( rule__ProvidedRole__InterfaceAssignment_4 )
            // InternalAllocation.g:3109:3: rule__ProvidedRole__InterfaceAssignment_4
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
    // InternalAllocation.g:3117:1: rule__ProvidedRole__Group__5 : rule__ProvidedRole__Group__5__Impl ;
    public final void rule__ProvidedRole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3121:1: ( rule__ProvidedRole__Group__5__Impl )
            // InternalAllocation.g:3122:2: rule__ProvidedRole__Group__5__Impl
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
    // InternalAllocation.g:3128:1: rule__ProvidedRole__Group__5__Impl : ( '}' ) ;
    public final void rule__ProvidedRole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3132:1: ( ( '}' ) )
            // InternalAllocation.g:3133:1: ( '}' )
            {
            // InternalAllocation.g:3133:1: ( '}' )
            // InternalAllocation.g:3134:2: '}'
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
    // InternalAllocation.g:3144:1: rule__CompositeComponent__Group__0 : rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1 ;
    public final void rule__CompositeComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3148:1: ( rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1 )
            // InternalAllocation.g:3149:2: rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1
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
    // InternalAllocation.g:3156:1: rule__CompositeComponent__Group__0__Impl : ( 'CompositeComponent' ) ;
    public final void rule__CompositeComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3160:1: ( ( 'CompositeComponent' ) )
            // InternalAllocation.g:3161:1: ( 'CompositeComponent' )
            {
            // InternalAllocation.g:3161:1: ( 'CompositeComponent' )
            // InternalAllocation.g:3162:2: 'CompositeComponent'
            {
             before(grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAllocation.g:3171:1: rule__CompositeComponent__Group__1 : rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2 ;
    public final void rule__CompositeComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3175:1: ( rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2 )
            // InternalAllocation.g:3176:2: rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2
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
    // InternalAllocation.g:3183:1: rule__CompositeComponent__Group__1__Impl : ( ( rule__CompositeComponent__NameAssignment_1 ) ) ;
    public final void rule__CompositeComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3187:1: ( ( ( rule__CompositeComponent__NameAssignment_1 ) ) )
            // InternalAllocation.g:3188:1: ( ( rule__CompositeComponent__NameAssignment_1 ) )
            {
            // InternalAllocation.g:3188:1: ( ( rule__CompositeComponent__NameAssignment_1 ) )
            // InternalAllocation.g:3189:2: ( rule__CompositeComponent__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getNameAssignment_1()); 
            // InternalAllocation.g:3190:2: ( rule__CompositeComponent__NameAssignment_1 )
            // InternalAllocation.g:3190:3: rule__CompositeComponent__NameAssignment_1
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
    // InternalAllocation.g:3198:1: rule__CompositeComponent__Group__2 : rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3 ;
    public final void rule__CompositeComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3202:1: ( rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3 )
            // InternalAllocation.g:3203:2: rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3
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
    // InternalAllocation.g:3210:1: rule__CompositeComponent__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3214:1: ( ( '{' ) )
            // InternalAllocation.g:3215:1: ( '{' )
            {
            // InternalAllocation.g:3215:1: ( '{' )
            // InternalAllocation.g:3216:2: '{'
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
    // InternalAllocation.g:3225:1: rule__CompositeComponent__Group__3 : rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4 ;
    public final void rule__CompositeComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3229:1: ( rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4 )
            // InternalAllocation.g:3230:2: rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4
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
    // InternalAllocation.g:3237:1: rule__CompositeComponent__Group__3__Impl : ( ( rule__CompositeComponent__Group_3__0 )? ) ;
    public final void rule__CompositeComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3241:1: ( ( ( rule__CompositeComponent__Group_3__0 )? ) )
            // InternalAllocation.g:3242:1: ( ( rule__CompositeComponent__Group_3__0 )? )
            {
            // InternalAllocation.g:3242:1: ( ( rule__CompositeComponent__Group_3__0 )? )
            // InternalAllocation.g:3243:2: ( rule__CompositeComponent__Group_3__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_3()); 
            // InternalAllocation.g:3244:2: ( rule__CompositeComponent__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAllocation.g:3244:3: rule__CompositeComponent__Group_3__0
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
    // InternalAllocation.g:3252:1: rule__CompositeComponent__Group__4 : rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5 ;
    public final void rule__CompositeComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3256:1: ( rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5 )
            // InternalAllocation.g:3257:2: rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5
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
    // InternalAllocation.g:3264:1: rule__CompositeComponent__Group__4__Impl : ( 'service' ) ;
    public final void rule__CompositeComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3268:1: ( ( 'service' ) )
            // InternalAllocation.g:3269:1: ( 'service' )
            {
            // InternalAllocation.g:3269:1: ( 'service' )
            // InternalAllocation.g:3270:2: 'service'
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
    // InternalAllocation.g:3279:1: rule__CompositeComponent__Group__5 : rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6 ;
    public final void rule__CompositeComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3283:1: ( rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6 )
            // InternalAllocation.g:3284:2: rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6
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
    // InternalAllocation.g:3291:1: rule__CompositeComponent__Group__5__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3295:1: ( ( '{' ) )
            // InternalAllocation.g:3296:1: ( '{' )
            {
            // InternalAllocation.g:3296:1: ( '{' )
            // InternalAllocation.g:3297:2: '{'
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
    // InternalAllocation.g:3306:1: rule__CompositeComponent__Group__6 : rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7 ;
    public final void rule__CompositeComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3310:1: ( rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7 )
            // InternalAllocation.g:3311:2: rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7
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
    // InternalAllocation.g:3318:1: rule__CompositeComponent__Group__6__Impl : ( ( rule__CompositeComponent__ServiceAssignment_6 ) ) ;
    public final void rule__CompositeComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3322:1: ( ( ( rule__CompositeComponent__ServiceAssignment_6 ) ) )
            // InternalAllocation.g:3323:1: ( ( rule__CompositeComponent__ServiceAssignment_6 ) )
            {
            // InternalAllocation.g:3323:1: ( ( rule__CompositeComponent__ServiceAssignment_6 ) )
            // InternalAllocation.g:3324:2: ( rule__CompositeComponent__ServiceAssignment_6 )
            {
             before(grammarAccess.getCompositeComponentAccess().getServiceAssignment_6()); 
            // InternalAllocation.g:3325:2: ( rule__CompositeComponent__ServiceAssignment_6 )
            // InternalAllocation.g:3325:3: rule__CompositeComponent__ServiceAssignment_6
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
    // InternalAllocation.g:3333:1: rule__CompositeComponent__Group__7 : rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8 ;
    public final void rule__CompositeComponent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3337:1: ( rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8 )
            // InternalAllocation.g:3338:2: rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8
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
    // InternalAllocation.g:3345:1: rule__CompositeComponent__Group__7__Impl : ( ( rule__CompositeComponent__Group_7__0 )* ) ;
    public final void rule__CompositeComponent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3349:1: ( ( ( rule__CompositeComponent__Group_7__0 )* ) )
            // InternalAllocation.g:3350:1: ( ( rule__CompositeComponent__Group_7__0 )* )
            {
            // InternalAllocation.g:3350:1: ( ( rule__CompositeComponent__Group_7__0 )* )
            // InternalAllocation.g:3351:2: ( rule__CompositeComponent__Group_7__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_7()); 
            // InternalAllocation.g:3352:2: ( rule__CompositeComponent__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAllocation.g:3352:3: rule__CompositeComponent__Group_7__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeComponent__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalAllocation.g:3360:1: rule__CompositeComponent__Group__8 : rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9 ;
    public final void rule__CompositeComponent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3364:1: ( rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9 )
            // InternalAllocation.g:3365:2: rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9
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
    // InternalAllocation.g:3372:1: rule__CompositeComponent__Group__8__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3376:1: ( ( '}' ) )
            // InternalAllocation.g:3377:1: ( '}' )
            {
            // InternalAllocation.g:3377:1: ( '}' )
            // InternalAllocation.g:3378:2: '}'
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
    // InternalAllocation.g:3387:1: rule__CompositeComponent__Group__9 : rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10 ;
    public final void rule__CompositeComponent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3391:1: ( rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10 )
            // InternalAllocation.g:3392:2: rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10
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
    // InternalAllocation.g:3399:1: rule__CompositeComponent__Group__9__Impl : ( ( rule__CompositeComponent__Group_9__0 )? ) ;
    public final void rule__CompositeComponent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3403:1: ( ( ( rule__CompositeComponent__Group_9__0 )? ) )
            // InternalAllocation.g:3404:1: ( ( rule__CompositeComponent__Group_9__0 )? )
            {
            // InternalAllocation.g:3404:1: ( ( rule__CompositeComponent__Group_9__0 )? )
            // InternalAllocation.g:3405:2: ( rule__CompositeComponent__Group_9__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_9()); 
            // InternalAllocation.g:3406:2: ( rule__CompositeComponent__Group_9__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAllocation.g:3406:3: rule__CompositeComponent__Group_9__0
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
    // InternalAllocation.g:3414:1: rule__CompositeComponent__Group__10 : rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11 ;
    public final void rule__CompositeComponent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3418:1: ( rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11 )
            // InternalAllocation.g:3419:2: rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11
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
    // InternalAllocation.g:3426:1: rule__CompositeComponent__Group__10__Impl : ( 'providedrole' ) ;
    public final void rule__CompositeComponent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3430:1: ( ( 'providedrole' ) )
            // InternalAllocation.g:3431:1: ( 'providedrole' )
            {
            // InternalAllocation.g:3431:1: ( 'providedrole' )
            // InternalAllocation.g:3432:2: 'providedrole'
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
    // InternalAllocation.g:3441:1: rule__CompositeComponent__Group__11 : rule__CompositeComponent__Group__11__Impl rule__CompositeComponent__Group__12 ;
    public final void rule__CompositeComponent__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3445:1: ( rule__CompositeComponent__Group__11__Impl rule__CompositeComponent__Group__12 )
            // InternalAllocation.g:3446:2: rule__CompositeComponent__Group__11__Impl rule__CompositeComponent__Group__12
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
    // InternalAllocation.g:3453:1: rule__CompositeComponent__Group__11__Impl : ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) ) ;
    public final void rule__CompositeComponent__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3457:1: ( ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) ) )
            // InternalAllocation.g:3458:1: ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) )
            {
            // InternalAllocation.g:3458:1: ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) )
            // InternalAllocation.g:3459:2: ( rule__CompositeComponent__ProvidedroleAssignment_11 )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedroleAssignment_11()); 
            // InternalAllocation.g:3460:2: ( rule__CompositeComponent__ProvidedroleAssignment_11 )
            // InternalAllocation.g:3460:3: rule__CompositeComponent__ProvidedroleAssignment_11
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
    // InternalAllocation.g:3468:1: rule__CompositeComponent__Group__12 : rule__CompositeComponent__Group__12__Impl rule__CompositeComponent__Group__13 ;
    public final void rule__CompositeComponent__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3472:1: ( rule__CompositeComponent__Group__12__Impl rule__CompositeComponent__Group__13 )
            // InternalAllocation.g:3473:2: rule__CompositeComponent__Group__12__Impl rule__CompositeComponent__Group__13
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
    // InternalAllocation.g:3480:1: rule__CompositeComponent__Group__12__Impl : ( 'assemblycontext' ) ;
    public final void rule__CompositeComponent__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3484:1: ( ( 'assemblycontext' ) )
            // InternalAllocation.g:3485:1: ( 'assemblycontext' )
            {
            // InternalAllocation.g:3485:1: ( 'assemblycontext' )
            // InternalAllocation.g:3486:2: 'assemblycontext'
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
    // InternalAllocation.g:3495:1: rule__CompositeComponent__Group__13 : rule__CompositeComponent__Group__13__Impl rule__CompositeComponent__Group__14 ;
    public final void rule__CompositeComponent__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3499:1: ( rule__CompositeComponent__Group__13__Impl rule__CompositeComponent__Group__14 )
            // InternalAllocation.g:3500:2: rule__CompositeComponent__Group__13__Impl rule__CompositeComponent__Group__14
            {
            pushFollow(FOLLOW_25);
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
    // InternalAllocation.g:3507:1: rule__CompositeComponent__Group__13__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3511:1: ( ( '{' ) )
            // InternalAllocation.g:3512:1: ( '{' )
            {
            // InternalAllocation.g:3512:1: ( '{' )
            // InternalAllocation.g:3513:2: '{'
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
    // InternalAllocation.g:3522:1: rule__CompositeComponent__Group__14 : rule__CompositeComponent__Group__14__Impl rule__CompositeComponent__Group__15 ;
    public final void rule__CompositeComponent__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3526:1: ( rule__CompositeComponent__Group__14__Impl rule__CompositeComponent__Group__15 )
            // InternalAllocation.g:3527:2: rule__CompositeComponent__Group__14__Impl rule__CompositeComponent__Group__15
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
    // InternalAllocation.g:3534:1: rule__CompositeComponent__Group__14__Impl : ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) ) ;
    public final void rule__CompositeComponent__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3538:1: ( ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) ) )
            // InternalAllocation.g:3539:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) )
            {
            // InternalAllocation.g:3539:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) )
            // InternalAllocation.g:3540:2: ( rule__CompositeComponent__AssemblycontextAssignment_14 )
            {
             before(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssignment_14()); 
            // InternalAllocation.g:3541:2: ( rule__CompositeComponent__AssemblycontextAssignment_14 )
            // InternalAllocation.g:3541:3: rule__CompositeComponent__AssemblycontextAssignment_14
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
    // InternalAllocation.g:3549:1: rule__CompositeComponent__Group__15 : rule__CompositeComponent__Group__15__Impl rule__CompositeComponent__Group__16 ;
    public final void rule__CompositeComponent__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3553:1: ( rule__CompositeComponent__Group__15__Impl rule__CompositeComponent__Group__16 )
            // InternalAllocation.g:3554:2: rule__CompositeComponent__Group__15__Impl rule__CompositeComponent__Group__16
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
    // InternalAllocation.g:3561:1: rule__CompositeComponent__Group__15__Impl : ( ( rule__CompositeComponent__Group_15__0 )* ) ;
    public final void rule__CompositeComponent__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3565:1: ( ( ( rule__CompositeComponent__Group_15__0 )* ) )
            // InternalAllocation.g:3566:1: ( ( rule__CompositeComponent__Group_15__0 )* )
            {
            // InternalAllocation.g:3566:1: ( ( rule__CompositeComponent__Group_15__0 )* )
            // InternalAllocation.g:3567:2: ( rule__CompositeComponent__Group_15__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_15()); 
            // InternalAllocation.g:3568:2: ( rule__CompositeComponent__Group_15__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAllocation.g:3568:3: rule__CompositeComponent__Group_15__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeComponent__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalAllocation.g:3576:1: rule__CompositeComponent__Group__16 : rule__CompositeComponent__Group__16__Impl rule__CompositeComponent__Group__17 ;
    public final void rule__CompositeComponent__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3580:1: ( rule__CompositeComponent__Group__16__Impl rule__CompositeComponent__Group__17 )
            // InternalAllocation.g:3581:2: rule__CompositeComponent__Group__16__Impl rule__CompositeComponent__Group__17
            {
            pushFollow(FOLLOW_26);
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
    // InternalAllocation.g:3588:1: rule__CompositeComponent__Group__16__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3592:1: ( ( '}' ) )
            // InternalAllocation.g:3593:1: ( '}' )
            {
            // InternalAllocation.g:3593:1: ( '}' )
            // InternalAllocation.g:3594:2: '}'
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
    // InternalAllocation.g:3603:1: rule__CompositeComponent__Group__17 : rule__CompositeComponent__Group__17__Impl rule__CompositeComponent__Group__18 ;
    public final void rule__CompositeComponent__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3607:1: ( rule__CompositeComponent__Group__17__Impl rule__CompositeComponent__Group__18 )
            // InternalAllocation.g:3608:2: rule__CompositeComponent__Group__17__Impl rule__CompositeComponent__Group__18
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
    // InternalAllocation.g:3615:1: rule__CompositeComponent__Group__17__Impl : ( 'delegationconnector' ) ;
    public final void rule__CompositeComponent__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3619:1: ( ( 'delegationconnector' ) )
            // InternalAllocation.g:3620:1: ( 'delegationconnector' )
            {
            // InternalAllocation.g:3620:1: ( 'delegationconnector' )
            // InternalAllocation.g:3621:2: 'delegationconnector'
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorKeyword_17()); 
            match(input,46,FOLLOW_2); 
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
    // InternalAllocation.g:3630:1: rule__CompositeComponent__Group__18 : rule__CompositeComponent__Group__18__Impl rule__CompositeComponent__Group__19 ;
    public final void rule__CompositeComponent__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3634:1: ( rule__CompositeComponent__Group__18__Impl rule__CompositeComponent__Group__19 )
            // InternalAllocation.g:3635:2: rule__CompositeComponent__Group__18__Impl rule__CompositeComponent__Group__19
            {
            pushFollow(FOLLOW_27);
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
    // InternalAllocation.g:3642:1: rule__CompositeComponent__Group__18__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3646:1: ( ( '{' ) )
            // InternalAllocation.g:3647:1: ( '{' )
            {
            // InternalAllocation.g:3647:1: ( '{' )
            // InternalAllocation.g:3648:2: '{'
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
    // InternalAllocation.g:3657:1: rule__CompositeComponent__Group__19 : rule__CompositeComponent__Group__19__Impl rule__CompositeComponent__Group__20 ;
    public final void rule__CompositeComponent__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3661:1: ( rule__CompositeComponent__Group__19__Impl rule__CompositeComponent__Group__20 )
            // InternalAllocation.g:3662:2: rule__CompositeComponent__Group__19__Impl rule__CompositeComponent__Group__20
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
    // InternalAllocation.g:3669:1: rule__CompositeComponent__Group__19__Impl : ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) ) ;
    public final void rule__CompositeComponent__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3673:1: ( ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) ) )
            // InternalAllocation.g:3674:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) )
            {
            // InternalAllocation.g:3674:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) )
            // InternalAllocation.g:3675:2: ( rule__CompositeComponent__DelegationconnectorAssignment_19 )
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorAssignment_19()); 
            // InternalAllocation.g:3676:2: ( rule__CompositeComponent__DelegationconnectorAssignment_19 )
            // InternalAllocation.g:3676:3: rule__CompositeComponent__DelegationconnectorAssignment_19
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
    // InternalAllocation.g:3684:1: rule__CompositeComponent__Group__20 : rule__CompositeComponent__Group__20__Impl rule__CompositeComponent__Group__21 ;
    public final void rule__CompositeComponent__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3688:1: ( rule__CompositeComponent__Group__20__Impl rule__CompositeComponent__Group__21 )
            // InternalAllocation.g:3689:2: rule__CompositeComponent__Group__20__Impl rule__CompositeComponent__Group__21
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
    // InternalAllocation.g:3696:1: rule__CompositeComponent__Group__20__Impl : ( ( rule__CompositeComponent__Group_20__0 )* ) ;
    public final void rule__CompositeComponent__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3700:1: ( ( ( rule__CompositeComponent__Group_20__0 )* ) )
            // InternalAllocation.g:3701:1: ( ( rule__CompositeComponent__Group_20__0 )* )
            {
            // InternalAllocation.g:3701:1: ( ( rule__CompositeComponent__Group_20__0 )* )
            // InternalAllocation.g:3702:2: ( rule__CompositeComponent__Group_20__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_20()); 
            // InternalAllocation.g:3703:2: ( rule__CompositeComponent__Group_20__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAllocation.g:3703:3: rule__CompositeComponent__Group_20__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeComponent__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalAllocation.g:3711:1: rule__CompositeComponent__Group__21 : rule__CompositeComponent__Group__21__Impl rule__CompositeComponent__Group__22 ;
    public final void rule__CompositeComponent__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3715:1: ( rule__CompositeComponent__Group__21__Impl rule__CompositeComponent__Group__22 )
            // InternalAllocation.g:3716:2: rule__CompositeComponent__Group__21__Impl rule__CompositeComponent__Group__22
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
    // InternalAllocation.g:3723:1: rule__CompositeComponent__Group__21__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3727:1: ( ( '}' ) )
            // InternalAllocation.g:3728:1: ( '}' )
            {
            // InternalAllocation.g:3728:1: ( '}' )
            // InternalAllocation.g:3729:2: '}'
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
    // InternalAllocation.g:3738:1: rule__CompositeComponent__Group__22 : rule__CompositeComponent__Group__22__Impl ;
    public final void rule__CompositeComponent__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3742:1: ( rule__CompositeComponent__Group__22__Impl )
            // InternalAllocation.g:3743:2: rule__CompositeComponent__Group__22__Impl
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
    // InternalAllocation.g:3749:1: rule__CompositeComponent__Group__22__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3753:1: ( ( '}' ) )
            // InternalAllocation.g:3754:1: ( '}' )
            {
            // InternalAllocation.g:3754:1: ( '}' )
            // InternalAllocation.g:3755:2: '}'
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
    // InternalAllocation.g:3765:1: rule__CompositeComponent__Group_3__0 : rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1 ;
    public final void rule__CompositeComponent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3769:1: ( rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1 )
            // InternalAllocation.g:3770:2: rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1
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
    // InternalAllocation.g:3777:1: rule__CompositeComponent__Group_3__0__Impl : ( 'behaviourdescription' ) ;
    public final void rule__CompositeComponent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3781:1: ( ( 'behaviourdescription' ) )
            // InternalAllocation.g:3782:1: ( 'behaviourdescription' )
            {
            // InternalAllocation.g:3782:1: ( 'behaviourdescription' )
            // InternalAllocation.g:3783:2: 'behaviourdescription'
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
    // InternalAllocation.g:3792:1: rule__CompositeComponent__Group_3__1 : rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2 ;
    public final void rule__CompositeComponent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3796:1: ( rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2 )
            // InternalAllocation.g:3797:2: rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2
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
    // InternalAllocation.g:3804:1: rule__CompositeComponent__Group_3__1__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3808:1: ( ( '{' ) )
            // InternalAllocation.g:3809:1: ( '{' )
            {
            // InternalAllocation.g:3809:1: ( '{' )
            // InternalAllocation.g:3810:2: '{'
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
    // InternalAllocation.g:3819:1: rule__CompositeComponent__Group_3__2 : rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3 ;
    public final void rule__CompositeComponent__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3823:1: ( rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3 )
            // InternalAllocation.g:3824:2: rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3
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
    // InternalAllocation.g:3831:1: rule__CompositeComponent__Group_3__2__Impl : ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) ) ;
    public final void rule__CompositeComponent__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3835:1: ( ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) ) )
            // InternalAllocation.g:3836:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) )
            {
            // InternalAllocation.g:3836:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) )
            // InternalAllocation.g:3837:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 )
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionAssignment_3_2()); 
            // InternalAllocation.g:3838:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 )
            // InternalAllocation.g:3838:3: rule__CompositeComponent__BehaviourdescriptionAssignment_3_2
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
    // InternalAllocation.g:3846:1: rule__CompositeComponent__Group_3__3 : rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4 ;
    public final void rule__CompositeComponent__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3850:1: ( rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4 )
            // InternalAllocation.g:3851:2: rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4
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
    // InternalAllocation.g:3858:1: rule__CompositeComponent__Group_3__3__Impl : ( ( rule__CompositeComponent__Group_3_3__0 )* ) ;
    public final void rule__CompositeComponent__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3862:1: ( ( ( rule__CompositeComponent__Group_3_3__0 )* ) )
            // InternalAllocation.g:3863:1: ( ( rule__CompositeComponent__Group_3_3__0 )* )
            {
            // InternalAllocation.g:3863:1: ( ( rule__CompositeComponent__Group_3_3__0 )* )
            // InternalAllocation.g:3864:2: ( rule__CompositeComponent__Group_3_3__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_3_3()); 
            // InternalAllocation.g:3865:2: ( rule__CompositeComponent__Group_3_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAllocation.g:3865:3: rule__CompositeComponent__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeComponent__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalAllocation.g:3873:1: rule__CompositeComponent__Group_3__4 : rule__CompositeComponent__Group_3__4__Impl ;
    public final void rule__CompositeComponent__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3877:1: ( rule__CompositeComponent__Group_3__4__Impl )
            // InternalAllocation.g:3878:2: rule__CompositeComponent__Group_3__4__Impl
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
    // InternalAllocation.g:3884:1: rule__CompositeComponent__Group_3__4__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3888:1: ( ( '}' ) )
            // InternalAllocation.g:3889:1: ( '}' )
            {
            // InternalAllocation.g:3889:1: ( '}' )
            // InternalAllocation.g:3890:2: '}'
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
    // InternalAllocation.g:3900:1: rule__CompositeComponent__Group_3_3__0 : rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1 ;
    public final void rule__CompositeComponent__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3904:1: ( rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1 )
            // InternalAllocation.g:3905:2: rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1
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
    // InternalAllocation.g:3912:1: rule__CompositeComponent__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3916:1: ( ( ',' ) )
            // InternalAllocation.g:3917:1: ( ',' )
            {
            // InternalAllocation.g:3917:1: ( ',' )
            // InternalAllocation.g:3918:2: ','
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
    // InternalAllocation.g:3927:1: rule__CompositeComponent__Group_3_3__1 : rule__CompositeComponent__Group_3_3__1__Impl ;
    public final void rule__CompositeComponent__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3931:1: ( rule__CompositeComponent__Group_3_3__1__Impl )
            // InternalAllocation.g:3932:2: rule__CompositeComponent__Group_3_3__1__Impl
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
    // InternalAllocation.g:3938:1: rule__CompositeComponent__Group_3_3__1__Impl : ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) ) ;
    public final void rule__CompositeComponent__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3942:1: ( ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) ) )
            // InternalAllocation.g:3943:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) )
            {
            // InternalAllocation.g:3943:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) )
            // InternalAllocation.g:3944:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionAssignment_3_3_1()); 
            // InternalAllocation.g:3945:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 )
            // InternalAllocation.g:3945:3: rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1
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
    // InternalAllocation.g:3954:1: rule__CompositeComponent__Group_7__0 : rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1 ;
    public final void rule__CompositeComponent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3958:1: ( rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1 )
            // InternalAllocation.g:3959:2: rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1
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
    // InternalAllocation.g:3966:1: rule__CompositeComponent__Group_7__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3970:1: ( ( ',' ) )
            // InternalAllocation.g:3971:1: ( ',' )
            {
            // InternalAllocation.g:3971:1: ( ',' )
            // InternalAllocation.g:3972:2: ','
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
    // InternalAllocation.g:3981:1: rule__CompositeComponent__Group_7__1 : rule__CompositeComponent__Group_7__1__Impl ;
    public final void rule__CompositeComponent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3985:1: ( rule__CompositeComponent__Group_7__1__Impl )
            // InternalAllocation.g:3986:2: rule__CompositeComponent__Group_7__1__Impl
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
    // InternalAllocation.g:3992:1: rule__CompositeComponent__Group_7__1__Impl : ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) ) ;
    public final void rule__CompositeComponent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:3996:1: ( ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) ) )
            // InternalAllocation.g:3997:1: ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) )
            {
            // InternalAllocation.g:3997:1: ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) )
            // InternalAllocation.g:3998:2: ( rule__CompositeComponent__ServiceAssignment_7_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getServiceAssignment_7_1()); 
            // InternalAllocation.g:3999:2: ( rule__CompositeComponent__ServiceAssignment_7_1 )
            // InternalAllocation.g:3999:3: rule__CompositeComponent__ServiceAssignment_7_1
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
    // InternalAllocation.g:4008:1: rule__CompositeComponent__Group_9__0 : rule__CompositeComponent__Group_9__0__Impl rule__CompositeComponent__Group_9__1 ;
    public final void rule__CompositeComponent__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4012:1: ( rule__CompositeComponent__Group_9__0__Impl rule__CompositeComponent__Group_9__1 )
            // InternalAllocation.g:4013:2: rule__CompositeComponent__Group_9__0__Impl rule__CompositeComponent__Group_9__1
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
    // InternalAllocation.g:4020:1: rule__CompositeComponent__Group_9__0__Impl : ( 'requiredrole' ) ;
    public final void rule__CompositeComponent__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4024:1: ( ( 'requiredrole' ) )
            // InternalAllocation.g:4025:1: ( 'requiredrole' )
            {
            // InternalAllocation.g:4025:1: ( 'requiredrole' )
            // InternalAllocation.g:4026:2: 'requiredrole'
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
    // InternalAllocation.g:4035:1: rule__CompositeComponent__Group_9__1 : rule__CompositeComponent__Group_9__1__Impl rule__CompositeComponent__Group_9__2 ;
    public final void rule__CompositeComponent__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4039:1: ( rule__CompositeComponent__Group_9__1__Impl rule__CompositeComponent__Group_9__2 )
            // InternalAllocation.g:4040:2: rule__CompositeComponent__Group_9__1__Impl rule__CompositeComponent__Group_9__2
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
    // InternalAllocation.g:4047:1: rule__CompositeComponent__Group_9__1__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4051:1: ( ( '{' ) )
            // InternalAllocation.g:4052:1: ( '{' )
            {
            // InternalAllocation.g:4052:1: ( '{' )
            // InternalAllocation.g:4053:2: '{'
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
    // InternalAllocation.g:4062:1: rule__CompositeComponent__Group_9__2 : rule__CompositeComponent__Group_9__2__Impl rule__CompositeComponent__Group_9__3 ;
    public final void rule__CompositeComponent__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4066:1: ( rule__CompositeComponent__Group_9__2__Impl rule__CompositeComponent__Group_9__3 )
            // InternalAllocation.g:4067:2: rule__CompositeComponent__Group_9__2__Impl rule__CompositeComponent__Group_9__3
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
    // InternalAllocation.g:4074:1: rule__CompositeComponent__Group_9__2__Impl : ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) ) ;
    public final void rule__CompositeComponent__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4078:1: ( ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) ) )
            // InternalAllocation.g:4079:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) )
            {
            // InternalAllocation.g:4079:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) )
            // InternalAllocation.g:4080:2: ( rule__CompositeComponent__RequiredroleAssignment_9_2 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredroleAssignment_9_2()); 
            // InternalAllocation.g:4081:2: ( rule__CompositeComponent__RequiredroleAssignment_9_2 )
            // InternalAllocation.g:4081:3: rule__CompositeComponent__RequiredroleAssignment_9_2
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
    // InternalAllocation.g:4089:1: rule__CompositeComponent__Group_9__3 : rule__CompositeComponent__Group_9__3__Impl rule__CompositeComponent__Group_9__4 ;
    public final void rule__CompositeComponent__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4093:1: ( rule__CompositeComponent__Group_9__3__Impl rule__CompositeComponent__Group_9__4 )
            // InternalAllocation.g:4094:2: rule__CompositeComponent__Group_9__3__Impl rule__CompositeComponent__Group_9__4
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
    // InternalAllocation.g:4101:1: rule__CompositeComponent__Group_9__3__Impl : ( ( rule__CompositeComponent__Group_9_3__0 )* ) ;
    public final void rule__CompositeComponent__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4105:1: ( ( ( rule__CompositeComponent__Group_9_3__0 )* ) )
            // InternalAllocation.g:4106:1: ( ( rule__CompositeComponent__Group_9_3__0 )* )
            {
            // InternalAllocation.g:4106:1: ( ( rule__CompositeComponent__Group_9_3__0 )* )
            // InternalAllocation.g:4107:2: ( rule__CompositeComponent__Group_9_3__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_9_3()); 
            // InternalAllocation.g:4108:2: ( rule__CompositeComponent__Group_9_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAllocation.g:4108:3: rule__CompositeComponent__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeComponent__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalAllocation.g:4116:1: rule__CompositeComponent__Group_9__4 : rule__CompositeComponent__Group_9__4__Impl ;
    public final void rule__CompositeComponent__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4120:1: ( rule__CompositeComponent__Group_9__4__Impl )
            // InternalAllocation.g:4121:2: rule__CompositeComponent__Group_9__4__Impl
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
    // InternalAllocation.g:4127:1: rule__CompositeComponent__Group_9__4__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4131:1: ( ( '}' ) )
            // InternalAllocation.g:4132:1: ( '}' )
            {
            // InternalAllocation.g:4132:1: ( '}' )
            // InternalAllocation.g:4133:2: '}'
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
    // InternalAllocation.g:4143:1: rule__CompositeComponent__Group_9_3__0 : rule__CompositeComponent__Group_9_3__0__Impl rule__CompositeComponent__Group_9_3__1 ;
    public final void rule__CompositeComponent__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4147:1: ( rule__CompositeComponent__Group_9_3__0__Impl rule__CompositeComponent__Group_9_3__1 )
            // InternalAllocation.g:4148:2: rule__CompositeComponent__Group_9_3__0__Impl rule__CompositeComponent__Group_9_3__1
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
    // InternalAllocation.g:4155:1: rule__CompositeComponent__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4159:1: ( ( ',' ) )
            // InternalAllocation.g:4160:1: ( ',' )
            {
            // InternalAllocation.g:4160:1: ( ',' )
            // InternalAllocation.g:4161:2: ','
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
    // InternalAllocation.g:4170:1: rule__CompositeComponent__Group_9_3__1 : rule__CompositeComponent__Group_9_3__1__Impl ;
    public final void rule__CompositeComponent__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4174:1: ( rule__CompositeComponent__Group_9_3__1__Impl )
            // InternalAllocation.g:4175:2: rule__CompositeComponent__Group_9_3__1__Impl
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
    // InternalAllocation.g:4181:1: rule__CompositeComponent__Group_9_3__1__Impl : ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) ) ;
    public final void rule__CompositeComponent__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4185:1: ( ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) ) )
            // InternalAllocation.g:4186:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) )
            {
            // InternalAllocation.g:4186:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) )
            // InternalAllocation.g:4187:2: ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredroleAssignment_9_3_1()); 
            // InternalAllocation.g:4188:2: ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 )
            // InternalAllocation.g:4188:3: rule__CompositeComponent__RequiredroleAssignment_9_3_1
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
    // InternalAllocation.g:4197:1: rule__CompositeComponent__Group_15__0 : rule__CompositeComponent__Group_15__0__Impl rule__CompositeComponent__Group_15__1 ;
    public final void rule__CompositeComponent__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4201:1: ( rule__CompositeComponent__Group_15__0__Impl rule__CompositeComponent__Group_15__1 )
            // InternalAllocation.g:4202:2: rule__CompositeComponent__Group_15__0__Impl rule__CompositeComponent__Group_15__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAllocation.g:4209:1: rule__CompositeComponent__Group_15__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4213:1: ( ( ',' ) )
            // InternalAllocation.g:4214:1: ( ',' )
            {
            // InternalAllocation.g:4214:1: ( ',' )
            // InternalAllocation.g:4215:2: ','
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
    // InternalAllocation.g:4224:1: rule__CompositeComponent__Group_15__1 : rule__CompositeComponent__Group_15__1__Impl ;
    public final void rule__CompositeComponent__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4228:1: ( rule__CompositeComponent__Group_15__1__Impl )
            // InternalAllocation.g:4229:2: rule__CompositeComponent__Group_15__1__Impl
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
    // InternalAllocation.g:4235:1: rule__CompositeComponent__Group_15__1__Impl : ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) ) ;
    public final void rule__CompositeComponent__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4239:1: ( ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) ) )
            // InternalAllocation.g:4240:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) )
            {
            // InternalAllocation.g:4240:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) )
            // InternalAllocation.g:4241:2: ( rule__CompositeComponent__AssemblycontextAssignment_15_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssignment_15_1()); 
            // InternalAllocation.g:4242:2: ( rule__CompositeComponent__AssemblycontextAssignment_15_1 )
            // InternalAllocation.g:4242:3: rule__CompositeComponent__AssemblycontextAssignment_15_1
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
    // InternalAllocation.g:4251:1: rule__CompositeComponent__Group_20__0 : rule__CompositeComponent__Group_20__0__Impl rule__CompositeComponent__Group_20__1 ;
    public final void rule__CompositeComponent__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4255:1: ( rule__CompositeComponent__Group_20__0__Impl rule__CompositeComponent__Group_20__1 )
            // InternalAllocation.g:4256:2: rule__CompositeComponent__Group_20__0__Impl rule__CompositeComponent__Group_20__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalAllocation.g:4263:1: rule__CompositeComponent__Group_20__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4267:1: ( ( ',' ) )
            // InternalAllocation.g:4268:1: ( ',' )
            {
            // InternalAllocation.g:4268:1: ( ',' )
            // InternalAllocation.g:4269:2: ','
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
    // InternalAllocation.g:4278:1: rule__CompositeComponent__Group_20__1 : rule__CompositeComponent__Group_20__1__Impl ;
    public final void rule__CompositeComponent__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4282:1: ( rule__CompositeComponent__Group_20__1__Impl )
            // InternalAllocation.g:4283:2: rule__CompositeComponent__Group_20__1__Impl
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
    // InternalAllocation.g:4289:1: rule__CompositeComponent__Group_20__1__Impl : ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) ) ;
    public final void rule__CompositeComponent__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4293:1: ( ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) ) )
            // InternalAllocation.g:4294:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) )
            {
            // InternalAllocation.g:4294:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) )
            // InternalAllocation.g:4295:2: ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorAssignment_20_1()); 
            // InternalAllocation.g:4296:2: ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 )
            // InternalAllocation.g:4296:3: rule__CompositeComponent__DelegationconnectorAssignment_20_1
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


    // $ANTLR start "rule__DescriptionElement_Impl__Group__0"
    // InternalAllocation.g:4305:1: rule__DescriptionElement_Impl__Group__0 : rule__DescriptionElement_Impl__Group__0__Impl rule__DescriptionElement_Impl__Group__1 ;
    public final void rule__DescriptionElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4309:1: ( rule__DescriptionElement_Impl__Group__0__Impl rule__DescriptionElement_Impl__Group__1 )
            // InternalAllocation.g:4310:2: rule__DescriptionElement_Impl__Group__0__Impl rule__DescriptionElement_Impl__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__DescriptionElement_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptionElement_Impl__Group__1();

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
    // $ANTLR end "rule__DescriptionElement_Impl__Group__0"


    // $ANTLR start "rule__DescriptionElement_Impl__Group__0__Impl"
    // InternalAllocation.g:4317:1: rule__DescriptionElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__DescriptionElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4321:1: ( ( () ) )
            // InternalAllocation.g:4322:1: ( () )
            {
            // InternalAllocation.g:4322:1: ( () )
            // InternalAllocation.g:4323:2: ()
            {
             before(grammarAccess.getDescriptionElement_ImplAccess().getDescriptionElementAction_0()); 
            // InternalAllocation.g:4324:2: ()
            // InternalAllocation.g:4324:3: 
            {
            }

             after(grammarAccess.getDescriptionElement_ImplAccess().getDescriptionElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionElement_Impl__Group__0__Impl"


    // $ANTLR start "rule__DescriptionElement_Impl__Group__1"
    // InternalAllocation.g:4332:1: rule__DescriptionElement_Impl__Group__1 : rule__DescriptionElement_Impl__Group__1__Impl ;
    public final void rule__DescriptionElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4336:1: ( rule__DescriptionElement_Impl__Group__1__Impl )
            // InternalAllocation.g:4337:2: rule__DescriptionElement_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DescriptionElement_Impl__Group__1__Impl();

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
    // $ANTLR end "rule__DescriptionElement_Impl__Group__1"


    // $ANTLR start "rule__DescriptionElement_Impl__Group__1__Impl"
    // InternalAllocation.g:4343:1: rule__DescriptionElement_Impl__Group__1__Impl : ( 'DescriptionElement' ) ;
    public final void rule__DescriptionElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4347:1: ( ( 'DescriptionElement' ) )
            // InternalAllocation.g:4348:1: ( 'DescriptionElement' )
            {
            // InternalAllocation.g:4348:1: ( 'DescriptionElement' )
            // InternalAllocation.g:4349:2: 'DescriptionElement'
            {
             before(grammarAccess.getDescriptionElement_ImplAccess().getDescriptionElementKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDescriptionElement_ImplAccess().getDescriptionElementKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionElement_Impl__Group__1__Impl"


    // $ANTLR start "rule__InternalAction__Group__0"
    // InternalAllocation.g:4359:1: rule__InternalAction__Group__0 : rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 ;
    public final void rule__InternalAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4363:1: ( rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 )
            // InternalAllocation.g:4364:2: rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalAllocation.g:4371:1: rule__InternalAction__Group__0__Impl : ( () ) ;
    public final void rule__InternalAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4375:1: ( ( () ) )
            // InternalAllocation.g:4376:1: ( () )
            {
            // InternalAllocation.g:4376:1: ( () )
            // InternalAllocation.g:4377:2: ()
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionAction_0()); 
            // InternalAllocation.g:4378:2: ()
            // InternalAllocation.g:4378:3: 
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
    // InternalAllocation.g:4386:1: rule__InternalAction__Group__1 : rule__InternalAction__Group__1__Impl ;
    public final void rule__InternalAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4390:1: ( rule__InternalAction__Group__1__Impl )
            // InternalAllocation.g:4391:2: rule__InternalAction__Group__1__Impl
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
    // InternalAllocation.g:4397:1: rule__InternalAction__Group__1__Impl : ( 'InternalAction' ) ;
    public final void rule__InternalAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4401:1: ( ( 'InternalAction' ) )
            // InternalAllocation.g:4402:1: ( 'InternalAction' )
            {
            // InternalAllocation.g:4402:1: ( 'InternalAction' )
            // InternalAllocation.g:4403:2: 'InternalAction'
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalAllocation.g:4413:1: rule__ExternalCall__Group__0 : rule__ExternalCall__Group__0__Impl rule__ExternalCall__Group__1 ;
    public final void rule__ExternalCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4417:1: ( rule__ExternalCall__Group__0__Impl rule__ExternalCall__Group__1 )
            // InternalAllocation.g:4418:2: rule__ExternalCall__Group__0__Impl rule__ExternalCall__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAllocation.g:4425:1: rule__ExternalCall__Group__0__Impl : ( () ) ;
    public final void rule__ExternalCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4429:1: ( ( () ) )
            // InternalAllocation.g:4430:1: ( () )
            {
            // InternalAllocation.g:4430:1: ( () )
            // InternalAllocation.g:4431:2: ()
            {
             before(grammarAccess.getExternalCallAccess().getExternalCallAction_0()); 
            // InternalAllocation.g:4432:2: ()
            // InternalAllocation.g:4432:3: 
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
    // InternalAllocation.g:4440:1: rule__ExternalCall__Group__1 : rule__ExternalCall__Group__1__Impl ;
    public final void rule__ExternalCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4444:1: ( rule__ExternalCall__Group__1__Impl )
            // InternalAllocation.g:4445:2: rule__ExternalCall__Group__1__Impl
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
    // InternalAllocation.g:4451:1: rule__ExternalCall__Group__1__Impl : ( 'ExternalCall' ) ;
    public final void rule__ExternalCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4455:1: ( ( 'ExternalCall' ) )
            // InternalAllocation.g:4456:1: ( 'ExternalCall' )
            {
            // InternalAllocation.g:4456:1: ( 'ExternalCall' )
            // InternalAllocation.g:4457:2: 'ExternalCall'
            {
             before(grammarAccess.getExternalCallAccess().getExternalCallKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalAllocation.g:4467:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4471:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalAllocation.g:4472:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAllocation.g:4479:1: rule__Loop__Group__0__Impl : ( () ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4483:1: ( ( () ) )
            // InternalAllocation.g:4484:1: ( () )
            {
            // InternalAllocation.g:4484:1: ( () )
            // InternalAllocation.g:4485:2: ()
            {
             before(grammarAccess.getLoopAccess().getLoopAction_0()); 
            // InternalAllocation.g:4486:2: ()
            // InternalAllocation.g:4486:3: 
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
    // InternalAllocation.g:4494:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4498:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalAllocation.g:4499:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Loop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__2();

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
    // InternalAllocation.g:4506:1: rule__Loop__Group__1__Impl : ( 'Loop' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4510:1: ( ( 'Loop' ) )
            // InternalAllocation.g:4511:1: ( 'Loop' )
            {
            // InternalAllocation.g:4511:1: ( 'Loop' )
            // InternalAllocation.g:4512:2: 'Loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_1()); 
            match(input,50,FOLLOW_2); 
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


    // $ANTLR start "rule__Loop__Group__2"
    // InternalAllocation.g:4521:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4525:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalAllocation.g:4526:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Loop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__3();

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
    // $ANTLR end "rule__Loop__Group__2"


    // $ANTLR start "rule__Loop__Group__2__Impl"
    // InternalAllocation.g:4533:1: rule__Loop__Group__2__Impl : ( '{' ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4537:1: ( ( '{' ) )
            // InternalAllocation.g:4538:1: ( '{' )
            {
            // InternalAllocation.g:4538:1: ( '{' )
            // InternalAllocation.g:4539:2: '{'
            {
             before(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2__Impl"


    // $ANTLR start "rule__Loop__Group__3"
    // InternalAllocation.g:4548:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4552:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalAllocation.g:4553:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Loop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__4();

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
    // $ANTLR end "rule__Loop__Group__3"


    // $ANTLR start "rule__Loop__Group__3__Impl"
    // InternalAllocation.g:4560:1: rule__Loop__Group__3__Impl : ( ( rule__Loop__Group_3__0 )? ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4564:1: ( ( ( rule__Loop__Group_3__0 )? ) )
            // InternalAllocation.g:4565:1: ( ( rule__Loop__Group_3__0 )? )
            {
            // InternalAllocation.g:4565:1: ( ( rule__Loop__Group_3__0 )? )
            // InternalAllocation.g:4566:2: ( rule__Loop__Group_3__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_3()); 
            // InternalAllocation.g:4567:2: ( rule__Loop__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAllocation.g:4567:3: rule__Loop__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__3__Impl"


    // $ANTLR start "rule__Loop__Group__4"
    // InternalAllocation.g:4575:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4579:1: ( rule__Loop__Group__4__Impl )
            // InternalAllocation.g:4580:2: rule__Loop__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__4__Impl();

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
    // $ANTLR end "rule__Loop__Group__4"


    // $ANTLR start "rule__Loop__Group__4__Impl"
    // InternalAllocation.g:4586:1: rule__Loop__Group__4__Impl : ( '}' ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4590:1: ( ( '}' ) )
            // InternalAllocation.g:4591:1: ( '}' )
            {
            // InternalAllocation.g:4591:1: ( '}' )
            // InternalAllocation.g:4592:2: '}'
            {
             before(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__4__Impl"


    // $ANTLR start "rule__Loop__Group_3__0"
    // InternalAllocation.g:4602:1: rule__Loop__Group_3__0 : rule__Loop__Group_3__0__Impl rule__Loop__Group_3__1 ;
    public final void rule__Loop__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4606:1: ( rule__Loop__Group_3__0__Impl rule__Loop__Group_3__1 )
            // InternalAllocation.g:4607:2: rule__Loop__Group_3__0__Impl rule__Loop__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Loop__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_3__1();

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
    // $ANTLR end "rule__Loop__Group_3__0"


    // $ANTLR start "rule__Loop__Group_3__0__Impl"
    // InternalAllocation.g:4614:1: rule__Loop__Group_3__0__Impl : ( 'descriptionelement' ) ;
    public final void rule__Loop__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4618:1: ( ( 'descriptionelement' ) )
            // InternalAllocation.g:4619:1: ( 'descriptionelement' )
            {
            // InternalAllocation.g:4619:1: ( 'descriptionelement' )
            // InternalAllocation.g:4620:2: 'descriptionelement'
            {
             before(grammarAccess.getLoopAccess().getDescriptionelementKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getDescriptionelementKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3__0__Impl"


    // $ANTLR start "rule__Loop__Group_3__1"
    // InternalAllocation.g:4629:1: rule__Loop__Group_3__1 : rule__Loop__Group_3__1__Impl rule__Loop__Group_3__2 ;
    public final void rule__Loop__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4633:1: ( rule__Loop__Group_3__1__Impl rule__Loop__Group_3__2 )
            // InternalAllocation.g:4634:2: rule__Loop__Group_3__1__Impl rule__Loop__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__Loop__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_3__2();

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
    // $ANTLR end "rule__Loop__Group_3__1"


    // $ANTLR start "rule__Loop__Group_3__1__Impl"
    // InternalAllocation.g:4641:1: rule__Loop__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Loop__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4645:1: ( ( '{' ) )
            // InternalAllocation.g:4646:1: ( '{' )
            {
            // InternalAllocation.g:4646:1: ( '{' )
            // InternalAllocation.g:4647:2: '{'
            {
             before(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3__1__Impl"


    // $ANTLR start "rule__Loop__Group_3__2"
    // InternalAllocation.g:4656:1: rule__Loop__Group_3__2 : rule__Loop__Group_3__2__Impl rule__Loop__Group_3__3 ;
    public final void rule__Loop__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4660:1: ( rule__Loop__Group_3__2__Impl rule__Loop__Group_3__3 )
            // InternalAllocation.g:4661:2: rule__Loop__Group_3__2__Impl rule__Loop__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__Loop__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_3__3();

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
    // $ANTLR end "rule__Loop__Group_3__2"


    // $ANTLR start "rule__Loop__Group_3__2__Impl"
    // InternalAllocation.g:4668:1: rule__Loop__Group_3__2__Impl : ( ( rule__Loop__DescriptionelementAssignment_3_2 ) ) ;
    public final void rule__Loop__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4672:1: ( ( ( rule__Loop__DescriptionelementAssignment_3_2 ) ) )
            // InternalAllocation.g:4673:1: ( ( rule__Loop__DescriptionelementAssignment_3_2 ) )
            {
            // InternalAllocation.g:4673:1: ( ( rule__Loop__DescriptionelementAssignment_3_2 ) )
            // InternalAllocation.g:4674:2: ( rule__Loop__DescriptionelementAssignment_3_2 )
            {
             before(grammarAccess.getLoopAccess().getDescriptionelementAssignment_3_2()); 
            // InternalAllocation.g:4675:2: ( rule__Loop__DescriptionelementAssignment_3_2 )
            // InternalAllocation.g:4675:3: rule__Loop__DescriptionelementAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__DescriptionelementAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getDescriptionelementAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3__2__Impl"


    // $ANTLR start "rule__Loop__Group_3__3"
    // InternalAllocation.g:4683:1: rule__Loop__Group_3__3 : rule__Loop__Group_3__3__Impl rule__Loop__Group_3__4 ;
    public final void rule__Loop__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4687:1: ( rule__Loop__Group_3__3__Impl rule__Loop__Group_3__4 )
            // InternalAllocation.g:4688:2: rule__Loop__Group_3__3__Impl rule__Loop__Group_3__4
            {
            pushFollow(FOLLOW_6);
            rule__Loop__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_3__4();

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
    // $ANTLR end "rule__Loop__Group_3__3"


    // $ANTLR start "rule__Loop__Group_3__3__Impl"
    // InternalAllocation.g:4695:1: rule__Loop__Group_3__3__Impl : ( ( rule__Loop__Group_3_3__0 )* ) ;
    public final void rule__Loop__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4699:1: ( ( ( rule__Loop__Group_3_3__0 )* ) )
            // InternalAllocation.g:4700:1: ( ( rule__Loop__Group_3_3__0 )* )
            {
            // InternalAllocation.g:4700:1: ( ( rule__Loop__Group_3_3__0 )* )
            // InternalAllocation.g:4701:2: ( rule__Loop__Group_3_3__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_3_3()); 
            // InternalAllocation.g:4702:2: ( rule__Loop__Group_3_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAllocation.g:4702:3: rule__Loop__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Loop__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3__3__Impl"


    // $ANTLR start "rule__Loop__Group_3__4"
    // InternalAllocation.g:4710:1: rule__Loop__Group_3__4 : rule__Loop__Group_3__4__Impl ;
    public final void rule__Loop__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4714:1: ( rule__Loop__Group_3__4__Impl )
            // InternalAllocation.g:4715:2: rule__Loop__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_3__4__Impl();

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
    // $ANTLR end "rule__Loop__Group_3__4"


    // $ANTLR start "rule__Loop__Group_3__4__Impl"
    // InternalAllocation.g:4721:1: rule__Loop__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Loop__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4725:1: ( ( '}' ) )
            // InternalAllocation.g:4726:1: ( '}' )
            {
            // InternalAllocation.g:4726:1: ( '}' )
            // InternalAllocation.g:4727:2: '}'
            {
             before(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3__4__Impl"


    // $ANTLR start "rule__Loop__Group_3_3__0"
    // InternalAllocation.g:4737:1: rule__Loop__Group_3_3__0 : rule__Loop__Group_3_3__0__Impl rule__Loop__Group_3_3__1 ;
    public final void rule__Loop__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4741:1: ( rule__Loop__Group_3_3__0__Impl rule__Loop__Group_3_3__1 )
            // InternalAllocation.g:4742:2: rule__Loop__Group_3_3__0__Impl rule__Loop__Group_3_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Loop__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_3_3__1();

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
    // $ANTLR end "rule__Loop__Group_3_3__0"


    // $ANTLR start "rule__Loop__Group_3_3__0__Impl"
    // InternalAllocation.g:4749:1: rule__Loop__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4753:1: ( ( ',' ) )
            // InternalAllocation.g:4754:1: ( ',' )
            {
            // InternalAllocation.g:4754:1: ( ',' )
            // InternalAllocation.g:4755:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_3_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3_3__0__Impl"


    // $ANTLR start "rule__Loop__Group_3_3__1"
    // InternalAllocation.g:4764:1: rule__Loop__Group_3_3__1 : rule__Loop__Group_3_3__1__Impl ;
    public final void rule__Loop__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4768:1: ( rule__Loop__Group_3_3__1__Impl )
            // InternalAllocation.g:4769:2: rule__Loop__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_3_3__1"


    // $ANTLR start "rule__Loop__Group_3_3__1__Impl"
    // InternalAllocation.g:4775:1: rule__Loop__Group_3_3__1__Impl : ( ( rule__Loop__DescriptionelementAssignment_3_3_1 ) ) ;
    public final void rule__Loop__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4779:1: ( ( ( rule__Loop__DescriptionelementAssignment_3_3_1 ) ) )
            // InternalAllocation.g:4780:1: ( ( rule__Loop__DescriptionelementAssignment_3_3_1 ) )
            {
            // InternalAllocation.g:4780:1: ( ( rule__Loop__DescriptionelementAssignment_3_3_1 ) )
            // InternalAllocation.g:4781:2: ( rule__Loop__DescriptionelementAssignment_3_3_1 )
            {
             before(grammarAccess.getLoopAccess().getDescriptionelementAssignment_3_3_1()); 
            // InternalAllocation.g:4782:2: ( rule__Loop__DescriptionelementAssignment_3_3_1 )
            // InternalAllocation.g:4782:3: rule__Loop__DescriptionelementAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__DescriptionelementAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getDescriptionelementAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3_3__1__Impl"


    // $ANTLR start "rule__Branch__Group__0"
    // InternalAllocation.g:4791:1: rule__Branch__Group__0 : rule__Branch__Group__0__Impl rule__Branch__Group__1 ;
    public final void rule__Branch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4795:1: ( rule__Branch__Group__0__Impl rule__Branch__Group__1 )
            // InternalAllocation.g:4796:2: rule__Branch__Group__0__Impl rule__Branch__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAllocation.g:4803:1: rule__Branch__Group__0__Impl : ( () ) ;
    public final void rule__Branch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4807:1: ( ( () ) )
            // InternalAllocation.g:4808:1: ( () )
            {
            // InternalAllocation.g:4808:1: ( () )
            // InternalAllocation.g:4809:2: ()
            {
             before(grammarAccess.getBranchAccess().getBranchAction_0()); 
            // InternalAllocation.g:4810:2: ()
            // InternalAllocation.g:4810:3: 
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
    // InternalAllocation.g:4818:1: rule__Branch__Group__1 : rule__Branch__Group__1__Impl rule__Branch__Group__2 ;
    public final void rule__Branch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4822:1: ( rule__Branch__Group__1__Impl rule__Branch__Group__2 )
            // InternalAllocation.g:4823:2: rule__Branch__Group__1__Impl rule__Branch__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Branch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__2();

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
    // InternalAllocation.g:4830:1: rule__Branch__Group__1__Impl : ( 'Branch' ) ;
    public final void rule__Branch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4834:1: ( ( 'Branch' ) )
            // InternalAllocation.g:4835:1: ( 'Branch' )
            {
            // InternalAllocation.g:4835:1: ( 'Branch' )
            // InternalAllocation.g:4836:2: 'Branch'
            {
             before(grammarAccess.getBranchAccess().getBranchKeyword_1()); 
            match(input,51,FOLLOW_2); 
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


    // $ANTLR start "rule__Branch__Group__2"
    // InternalAllocation.g:4845:1: rule__Branch__Group__2 : rule__Branch__Group__2__Impl rule__Branch__Group__3 ;
    public final void rule__Branch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4849:1: ( rule__Branch__Group__2__Impl rule__Branch__Group__3 )
            // InternalAllocation.g:4850:2: rule__Branch__Group__2__Impl rule__Branch__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Branch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__3();

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
    // $ANTLR end "rule__Branch__Group__2"


    // $ANTLR start "rule__Branch__Group__2__Impl"
    // InternalAllocation.g:4857:1: rule__Branch__Group__2__Impl : ( '{' ) ;
    public final void rule__Branch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4861:1: ( ( '{' ) )
            // InternalAllocation.g:4862:1: ( '{' )
            {
            // InternalAllocation.g:4862:1: ( '{' )
            // InternalAllocation.g:4863:2: '{'
            {
             before(grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__2__Impl"


    // $ANTLR start "rule__Branch__Group__3"
    // InternalAllocation.g:4872:1: rule__Branch__Group__3 : rule__Branch__Group__3__Impl rule__Branch__Group__4 ;
    public final void rule__Branch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4876:1: ( rule__Branch__Group__3__Impl rule__Branch__Group__4 )
            // InternalAllocation.g:4877:2: rule__Branch__Group__3__Impl rule__Branch__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Branch__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__4();

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
    // $ANTLR end "rule__Branch__Group__3"


    // $ANTLR start "rule__Branch__Group__3__Impl"
    // InternalAllocation.g:4884:1: rule__Branch__Group__3__Impl : ( ( rule__Branch__Group_3__0 )? ) ;
    public final void rule__Branch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4888:1: ( ( ( rule__Branch__Group_3__0 )? ) )
            // InternalAllocation.g:4889:1: ( ( rule__Branch__Group_3__0 )? )
            {
            // InternalAllocation.g:4889:1: ( ( rule__Branch__Group_3__0 )? )
            // InternalAllocation.g:4890:2: ( rule__Branch__Group_3__0 )?
            {
             before(grammarAccess.getBranchAccess().getGroup_3()); 
            // InternalAllocation.g:4891:2: ( rule__Branch__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAllocation.g:4891:3: rule__Branch__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Branch__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBranchAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__3__Impl"


    // $ANTLR start "rule__Branch__Group__4"
    // InternalAllocation.g:4899:1: rule__Branch__Group__4 : rule__Branch__Group__4__Impl ;
    public final void rule__Branch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4903:1: ( rule__Branch__Group__4__Impl )
            // InternalAllocation.g:4904:2: rule__Branch__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group__4__Impl();

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
    // $ANTLR end "rule__Branch__Group__4"


    // $ANTLR start "rule__Branch__Group__4__Impl"
    // InternalAllocation.g:4910:1: rule__Branch__Group__4__Impl : ( '}' ) ;
    public final void rule__Branch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4914:1: ( ( '}' ) )
            // InternalAllocation.g:4915:1: ( '}' )
            {
            // InternalAllocation.g:4915:1: ( '}' )
            // InternalAllocation.g:4916:2: '}'
            {
             before(grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__4__Impl"


    // $ANTLR start "rule__Branch__Group_3__0"
    // InternalAllocation.g:4926:1: rule__Branch__Group_3__0 : rule__Branch__Group_3__0__Impl rule__Branch__Group_3__1 ;
    public final void rule__Branch__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4930:1: ( rule__Branch__Group_3__0__Impl rule__Branch__Group_3__1 )
            // InternalAllocation.g:4931:2: rule__Branch__Group_3__0__Impl rule__Branch__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Branch__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group_3__1();

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
    // $ANTLR end "rule__Branch__Group_3__0"


    // $ANTLR start "rule__Branch__Group_3__0__Impl"
    // InternalAllocation.g:4938:1: rule__Branch__Group_3__0__Impl : ( 'descriptionelement' ) ;
    public final void rule__Branch__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4942:1: ( ( 'descriptionelement' ) )
            // InternalAllocation.g:4943:1: ( 'descriptionelement' )
            {
            // InternalAllocation.g:4943:1: ( 'descriptionelement' )
            // InternalAllocation.g:4944:2: 'descriptionelement'
            {
             before(grammarAccess.getBranchAccess().getDescriptionelementKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getDescriptionelementKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3__0__Impl"


    // $ANTLR start "rule__Branch__Group_3__1"
    // InternalAllocation.g:4953:1: rule__Branch__Group_3__1 : rule__Branch__Group_3__1__Impl rule__Branch__Group_3__2 ;
    public final void rule__Branch__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4957:1: ( rule__Branch__Group_3__1__Impl rule__Branch__Group_3__2 )
            // InternalAllocation.g:4958:2: rule__Branch__Group_3__1__Impl rule__Branch__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__Branch__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group_3__2();

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
    // $ANTLR end "rule__Branch__Group_3__1"


    // $ANTLR start "rule__Branch__Group_3__1__Impl"
    // InternalAllocation.g:4965:1: rule__Branch__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Branch__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4969:1: ( ( '{' ) )
            // InternalAllocation.g:4970:1: ( '{' )
            {
            // InternalAllocation.g:4970:1: ( '{' )
            // InternalAllocation.g:4971:2: '{'
            {
             before(grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3__1__Impl"


    // $ANTLR start "rule__Branch__Group_3__2"
    // InternalAllocation.g:4980:1: rule__Branch__Group_3__2 : rule__Branch__Group_3__2__Impl rule__Branch__Group_3__3 ;
    public final void rule__Branch__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4984:1: ( rule__Branch__Group_3__2__Impl rule__Branch__Group_3__3 )
            // InternalAllocation.g:4985:2: rule__Branch__Group_3__2__Impl rule__Branch__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__Branch__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group_3__3();

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
    // $ANTLR end "rule__Branch__Group_3__2"


    // $ANTLR start "rule__Branch__Group_3__2__Impl"
    // InternalAllocation.g:4992:1: rule__Branch__Group_3__2__Impl : ( ( rule__Branch__DescriptionelementAssignment_3_2 ) ) ;
    public final void rule__Branch__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:4996:1: ( ( ( rule__Branch__DescriptionelementAssignment_3_2 ) ) )
            // InternalAllocation.g:4997:1: ( ( rule__Branch__DescriptionelementAssignment_3_2 ) )
            {
            // InternalAllocation.g:4997:1: ( ( rule__Branch__DescriptionelementAssignment_3_2 ) )
            // InternalAllocation.g:4998:2: ( rule__Branch__DescriptionelementAssignment_3_2 )
            {
             before(grammarAccess.getBranchAccess().getDescriptionelementAssignment_3_2()); 
            // InternalAllocation.g:4999:2: ( rule__Branch__DescriptionelementAssignment_3_2 )
            // InternalAllocation.g:4999:3: rule__Branch__DescriptionelementAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Branch__DescriptionelementAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getDescriptionelementAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3__2__Impl"


    // $ANTLR start "rule__Branch__Group_3__3"
    // InternalAllocation.g:5007:1: rule__Branch__Group_3__3 : rule__Branch__Group_3__3__Impl rule__Branch__Group_3__4 ;
    public final void rule__Branch__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5011:1: ( rule__Branch__Group_3__3__Impl rule__Branch__Group_3__4 )
            // InternalAllocation.g:5012:2: rule__Branch__Group_3__3__Impl rule__Branch__Group_3__4
            {
            pushFollow(FOLLOW_6);
            rule__Branch__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group_3__4();

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
    // $ANTLR end "rule__Branch__Group_3__3"


    // $ANTLR start "rule__Branch__Group_3__3__Impl"
    // InternalAllocation.g:5019:1: rule__Branch__Group_3__3__Impl : ( ( rule__Branch__Group_3_3__0 )* ) ;
    public final void rule__Branch__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5023:1: ( ( ( rule__Branch__Group_3_3__0 )* ) )
            // InternalAllocation.g:5024:1: ( ( rule__Branch__Group_3_3__0 )* )
            {
            // InternalAllocation.g:5024:1: ( ( rule__Branch__Group_3_3__0 )* )
            // InternalAllocation.g:5025:2: ( rule__Branch__Group_3_3__0 )*
            {
             before(grammarAccess.getBranchAccess().getGroup_3_3()); 
            // InternalAllocation.g:5026:2: ( rule__Branch__Group_3_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==25) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAllocation.g:5026:3: rule__Branch__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Branch__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getBranchAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3__3__Impl"


    // $ANTLR start "rule__Branch__Group_3__4"
    // InternalAllocation.g:5034:1: rule__Branch__Group_3__4 : rule__Branch__Group_3__4__Impl ;
    public final void rule__Branch__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5038:1: ( rule__Branch__Group_3__4__Impl )
            // InternalAllocation.g:5039:2: rule__Branch__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group_3__4__Impl();

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
    // $ANTLR end "rule__Branch__Group_3__4"


    // $ANTLR start "rule__Branch__Group_3__4__Impl"
    // InternalAllocation.g:5045:1: rule__Branch__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Branch__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5049:1: ( ( '}' ) )
            // InternalAllocation.g:5050:1: ( '}' )
            {
            // InternalAllocation.g:5050:1: ( '}' )
            // InternalAllocation.g:5051:2: '}'
            {
             before(grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3__4__Impl"


    // $ANTLR start "rule__Branch__Group_3_3__0"
    // InternalAllocation.g:5061:1: rule__Branch__Group_3_3__0 : rule__Branch__Group_3_3__0__Impl rule__Branch__Group_3_3__1 ;
    public final void rule__Branch__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5065:1: ( rule__Branch__Group_3_3__0__Impl rule__Branch__Group_3_3__1 )
            // InternalAllocation.g:5066:2: rule__Branch__Group_3_3__0__Impl rule__Branch__Group_3_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Branch__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group_3_3__1();

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
    // $ANTLR end "rule__Branch__Group_3_3__0"


    // $ANTLR start "rule__Branch__Group_3_3__0__Impl"
    // InternalAllocation.g:5073:1: rule__Branch__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Branch__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5077:1: ( ( ',' ) )
            // InternalAllocation.g:5078:1: ( ',' )
            {
            // InternalAllocation.g:5078:1: ( ',' )
            // InternalAllocation.g:5079:2: ','
            {
             before(grammarAccess.getBranchAccess().getCommaKeyword_3_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3_3__0__Impl"


    // $ANTLR start "rule__Branch__Group_3_3__1"
    // InternalAllocation.g:5088:1: rule__Branch__Group_3_3__1 : rule__Branch__Group_3_3__1__Impl ;
    public final void rule__Branch__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5092:1: ( rule__Branch__Group_3_3__1__Impl )
            // InternalAllocation.g:5093:2: rule__Branch__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Branch__Group_3_3__1"


    // $ANTLR start "rule__Branch__Group_3_3__1__Impl"
    // InternalAllocation.g:5099:1: rule__Branch__Group_3_3__1__Impl : ( ( rule__Branch__DescriptionelementAssignment_3_3_1 ) ) ;
    public final void rule__Branch__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5103:1: ( ( ( rule__Branch__DescriptionelementAssignment_3_3_1 ) ) )
            // InternalAllocation.g:5104:1: ( ( rule__Branch__DescriptionelementAssignment_3_3_1 ) )
            {
            // InternalAllocation.g:5104:1: ( ( rule__Branch__DescriptionelementAssignment_3_3_1 ) )
            // InternalAllocation.g:5105:2: ( rule__Branch__DescriptionelementAssignment_3_3_1 )
            {
             before(grammarAccess.getBranchAccess().getDescriptionelementAssignment_3_3_1()); 
            // InternalAllocation.g:5106:2: ( rule__Branch__DescriptionelementAssignment_3_3_1 )
            // InternalAllocation.g:5106:3: rule__Branch__DescriptionelementAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Branch__DescriptionelementAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getDescriptionelementAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3_3__1__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // InternalAllocation.g:5115:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5119:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalAllocation.g:5120:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
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
    // InternalAllocation.g:5127:1: rule__Signature__Group__0__Impl : ( 'Signature' ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5131:1: ( ( 'Signature' ) )
            // InternalAllocation.g:5132:1: ( 'Signature' )
            {
            // InternalAllocation.g:5132:1: ( 'Signature' )
            // InternalAllocation.g:5133:2: 'Signature'
            {
             before(grammarAccess.getSignatureAccess().getSignatureKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalAllocation.g:5142:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5146:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalAllocation.g:5147:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
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
    // InternalAllocation.g:5154:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__NameAssignment_1 ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5158:1: ( ( ( rule__Signature__NameAssignment_1 ) ) )
            // InternalAllocation.g:5159:1: ( ( rule__Signature__NameAssignment_1 ) )
            {
            // InternalAllocation.g:5159:1: ( ( rule__Signature__NameAssignment_1 ) )
            // InternalAllocation.g:5160:2: ( rule__Signature__NameAssignment_1 )
            {
             before(grammarAccess.getSignatureAccess().getNameAssignment_1()); 
            // InternalAllocation.g:5161:2: ( rule__Signature__NameAssignment_1 )
            // InternalAllocation.g:5161:3: rule__Signature__NameAssignment_1
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
    // InternalAllocation.g:5169:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl rule__Signature__Group__3 ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5173:1: ( rule__Signature__Group__2__Impl rule__Signature__Group__3 )
            // InternalAllocation.g:5174:2: rule__Signature__Group__2__Impl rule__Signature__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalAllocation.g:5181:1: rule__Signature__Group__2__Impl : ( '{' ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5185:1: ( ( '{' ) )
            // InternalAllocation.g:5186:1: ( '{' )
            {
            // InternalAllocation.g:5186:1: ( '{' )
            // InternalAllocation.g:5187:2: '{'
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
    // InternalAllocation.g:5196:1: rule__Signature__Group__3 : rule__Signature__Group__3__Impl rule__Signature__Group__4 ;
    public final void rule__Signature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5200:1: ( rule__Signature__Group__3__Impl rule__Signature__Group__4 )
            // InternalAllocation.g:5201:2: rule__Signature__Group__3__Impl rule__Signature__Group__4
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
    // InternalAllocation.g:5208:1: rule__Signature__Group__3__Impl : ( 'returntype' ) ;
    public final void rule__Signature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5212:1: ( ( 'returntype' ) )
            // InternalAllocation.g:5213:1: ( 'returntype' )
            {
            // InternalAllocation.g:5213:1: ( 'returntype' )
            // InternalAllocation.g:5214:2: 'returntype'
            {
             before(grammarAccess.getSignatureAccess().getReturntypeKeyword_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalAllocation.g:5223:1: rule__Signature__Group__4 : rule__Signature__Group__4__Impl rule__Signature__Group__5 ;
    public final void rule__Signature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5227:1: ( rule__Signature__Group__4__Impl rule__Signature__Group__5 )
            // InternalAllocation.g:5228:2: rule__Signature__Group__4__Impl rule__Signature__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalAllocation.g:5235:1: rule__Signature__Group__4__Impl : ( ( rule__Signature__ReturntypeAssignment_4 ) ) ;
    public final void rule__Signature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5239:1: ( ( ( rule__Signature__ReturntypeAssignment_4 ) ) )
            // InternalAllocation.g:5240:1: ( ( rule__Signature__ReturntypeAssignment_4 ) )
            {
            // InternalAllocation.g:5240:1: ( ( rule__Signature__ReturntypeAssignment_4 ) )
            // InternalAllocation.g:5241:2: ( rule__Signature__ReturntypeAssignment_4 )
            {
             before(grammarAccess.getSignatureAccess().getReturntypeAssignment_4()); 
            // InternalAllocation.g:5242:2: ( rule__Signature__ReturntypeAssignment_4 )
            // InternalAllocation.g:5242:3: rule__Signature__ReturntypeAssignment_4
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
    // InternalAllocation.g:5250:1: rule__Signature__Group__5 : rule__Signature__Group__5__Impl rule__Signature__Group__6 ;
    public final void rule__Signature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5254:1: ( rule__Signature__Group__5__Impl rule__Signature__Group__6 )
            // InternalAllocation.g:5255:2: rule__Signature__Group__5__Impl rule__Signature__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalAllocation.g:5262:1: rule__Signature__Group__5__Impl : ( ( rule__Signature__Group_5__0 )? ) ;
    public final void rule__Signature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5266:1: ( ( ( rule__Signature__Group_5__0 )? ) )
            // InternalAllocation.g:5267:1: ( ( rule__Signature__Group_5__0 )? )
            {
            // InternalAllocation.g:5267:1: ( ( rule__Signature__Group_5__0 )? )
            // InternalAllocation.g:5268:2: ( rule__Signature__Group_5__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_5()); 
            // InternalAllocation.g:5269:2: ( rule__Signature__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==54) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAllocation.g:5269:3: rule__Signature__Group_5__0
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
    // InternalAllocation.g:5277:1: rule__Signature__Group__6 : rule__Signature__Group__6__Impl ;
    public final void rule__Signature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5281:1: ( rule__Signature__Group__6__Impl )
            // InternalAllocation.g:5282:2: rule__Signature__Group__6__Impl
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
    // InternalAllocation.g:5288:1: rule__Signature__Group__6__Impl : ( '}' ) ;
    public final void rule__Signature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5292:1: ( ( '}' ) )
            // InternalAllocation.g:5293:1: ( '}' )
            {
            // InternalAllocation.g:5293:1: ( '}' )
            // InternalAllocation.g:5294:2: '}'
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
    // InternalAllocation.g:5304:1: rule__Signature__Group_5__0 : rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1 ;
    public final void rule__Signature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5308:1: ( rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1 )
            // InternalAllocation.g:5309:2: rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1
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
    // InternalAllocation.g:5316:1: rule__Signature__Group_5__0__Impl : ( 'parameter' ) ;
    public final void rule__Signature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5320:1: ( ( 'parameter' ) )
            // InternalAllocation.g:5321:1: ( 'parameter' )
            {
            // InternalAllocation.g:5321:1: ( 'parameter' )
            // InternalAllocation.g:5322:2: 'parameter'
            {
             before(grammarAccess.getSignatureAccess().getParameterKeyword_5_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalAllocation.g:5331:1: rule__Signature__Group_5__1 : rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2 ;
    public final void rule__Signature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5335:1: ( rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2 )
            // InternalAllocation.g:5336:2: rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalAllocation.g:5343:1: rule__Signature__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Signature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5347:1: ( ( '{' ) )
            // InternalAllocation.g:5348:1: ( '{' )
            {
            // InternalAllocation.g:5348:1: ( '{' )
            // InternalAllocation.g:5349:2: '{'
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
    // InternalAllocation.g:5358:1: rule__Signature__Group_5__2 : rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3 ;
    public final void rule__Signature__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5362:1: ( rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3 )
            // InternalAllocation.g:5363:2: rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3
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
    // InternalAllocation.g:5370:1: rule__Signature__Group_5__2__Impl : ( ( rule__Signature__ParameterAssignment_5_2 ) ) ;
    public final void rule__Signature__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5374:1: ( ( ( rule__Signature__ParameterAssignment_5_2 ) ) )
            // InternalAllocation.g:5375:1: ( ( rule__Signature__ParameterAssignment_5_2 ) )
            {
            // InternalAllocation.g:5375:1: ( ( rule__Signature__ParameterAssignment_5_2 ) )
            // InternalAllocation.g:5376:2: ( rule__Signature__ParameterAssignment_5_2 )
            {
             before(grammarAccess.getSignatureAccess().getParameterAssignment_5_2()); 
            // InternalAllocation.g:5377:2: ( rule__Signature__ParameterAssignment_5_2 )
            // InternalAllocation.g:5377:3: rule__Signature__ParameterAssignment_5_2
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
    // InternalAllocation.g:5385:1: rule__Signature__Group_5__3 : rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4 ;
    public final void rule__Signature__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5389:1: ( rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4 )
            // InternalAllocation.g:5390:2: rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4
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
    // InternalAllocation.g:5397:1: rule__Signature__Group_5__3__Impl : ( ( rule__Signature__Group_5_3__0 )* ) ;
    public final void rule__Signature__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5401:1: ( ( ( rule__Signature__Group_5_3__0 )* ) )
            // InternalAllocation.g:5402:1: ( ( rule__Signature__Group_5_3__0 )* )
            {
            // InternalAllocation.g:5402:1: ( ( rule__Signature__Group_5_3__0 )* )
            // InternalAllocation.g:5403:2: ( rule__Signature__Group_5_3__0 )*
            {
             before(grammarAccess.getSignatureAccess().getGroup_5_3()); 
            // InternalAllocation.g:5404:2: ( rule__Signature__Group_5_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==25) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAllocation.g:5404:3: rule__Signature__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Signature__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalAllocation.g:5412:1: rule__Signature__Group_5__4 : rule__Signature__Group_5__4__Impl ;
    public final void rule__Signature__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5416:1: ( rule__Signature__Group_5__4__Impl )
            // InternalAllocation.g:5417:2: rule__Signature__Group_5__4__Impl
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
    // InternalAllocation.g:5423:1: rule__Signature__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Signature__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5427:1: ( ( '}' ) )
            // InternalAllocation.g:5428:1: ( '}' )
            {
            // InternalAllocation.g:5428:1: ( '}' )
            // InternalAllocation.g:5429:2: '}'
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
    // InternalAllocation.g:5439:1: rule__Signature__Group_5_3__0 : rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1 ;
    public final void rule__Signature__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5443:1: ( rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1 )
            // InternalAllocation.g:5444:2: rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAllocation.g:5451:1: rule__Signature__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Signature__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5455:1: ( ( ',' ) )
            // InternalAllocation.g:5456:1: ( ',' )
            {
            // InternalAllocation.g:5456:1: ( ',' )
            // InternalAllocation.g:5457:2: ','
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
    // InternalAllocation.g:5466:1: rule__Signature__Group_5_3__1 : rule__Signature__Group_5_3__1__Impl ;
    public final void rule__Signature__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5470:1: ( rule__Signature__Group_5_3__1__Impl )
            // InternalAllocation.g:5471:2: rule__Signature__Group_5_3__1__Impl
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
    // InternalAllocation.g:5477:1: rule__Signature__Group_5_3__1__Impl : ( ( rule__Signature__ParameterAssignment_5_3_1 ) ) ;
    public final void rule__Signature__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5481:1: ( ( ( rule__Signature__ParameterAssignment_5_3_1 ) ) )
            // InternalAllocation.g:5482:1: ( ( rule__Signature__ParameterAssignment_5_3_1 ) )
            {
            // InternalAllocation.g:5482:1: ( ( rule__Signature__ParameterAssignment_5_3_1 ) )
            // InternalAllocation.g:5483:2: ( rule__Signature__ParameterAssignment_5_3_1 )
            {
             before(grammarAccess.getSignatureAccess().getParameterAssignment_5_3_1()); 
            // InternalAllocation.g:5484:2: ( rule__Signature__ParameterAssignment_5_3_1 )
            // InternalAllocation.g:5484:3: rule__Signature__ParameterAssignment_5_3_1
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
    // InternalAllocation.g:5493:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5497:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalAllocation.g:5498:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalAllocation.g:5505:1: rule__Parameter__Group__0__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5509:1: ( ( 'Parameter' ) )
            // InternalAllocation.g:5510:1: ( 'Parameter' )
            {
            // InternalAllocation.g:5510:1: ( 'Parameter' )
            // InternalAllocation.g:5511:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalAllocation.g:5520:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5524:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalAllocation.g:5525:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalAllocation.g:5532:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5536:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalAllocation.g:5537:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalAllocation.g:5537:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalAllocation.g:5538:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalAllocation.g:5539:2: ( rule__Parameter__NameAssignment_1 )
            // InternalAllocation.g:5539:3: rule__Parameter__NameAssignment_1
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
    // InternalAllocation.g:5547:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5551:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalAllocation.g:5552:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalAllocation.g:5559:1: rule__Parameter__Group__2__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5563:1: ( ( '{' ) )
            // InternalAllocation.g:5564:1: ( '{' )
            {
            // InternalAllocation.g:5564:1: ( '{' )
            // InternalAllocation.g:5565:2: '{'
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
    // InternalAllocation.g:5574:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5578:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalAllocation.g:5579:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
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
    // InternalAllocation.g:5586:1: rule__Parameter__Group__3__Impl : ( 'parametertype' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5590:1: ( ( 'parametertype' ) )
            // InternalAllocation.g:5591:1: ( 'parametertype' )
            {
            // InternalAllocation.g:5591:1: ( 'parametertype' )
            // InternalAllocation.g:5592:2: 'parametertype'
            {
             before(grammarAccess.getParameterAccess().getParametertypeKeyword_3()); 
            match(input,56,FOLLOW_2); 
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
    // InternalAllocation.g:5601:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5605:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalAllocation.g:5606:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
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
    // InternalAllocation.g:5613:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__ParametertypeAssignment_4 ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5617:1: ( ( ( rule__Parameter__ParametertypeAssignment_4 ) ) )
            // InternalAllocation.g:5618:1: ( ( rule__Parameter__ParametertypeAssignment_4 ) )
            {
            // InternalAllocation.g:5618:1: ( ( rule__Parameter__ParametertypeAssignment_4 ) )
            // InternalAllocation.g:5619:2: ( rule__Parameter__ParametertypeAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getParametertypeAssignment_4()); 
            // InternalAllocation.g:5620:2: ( rule__Parameter__ParametertypeAssignment_4 )
            // InternalAllocation.g:5620:3: rule__Parameter__ParametertypeAssignment_4
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
    // InternalAllocation.g:5628:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5632:1: ( rule__Parameter__Group__5__Impl )
            // InternalAllocation.g:5633:2: rule__Parameter__Group__5__Impl
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
    // InternalAllocation.g:5639:1: rule__Parameter__Group__5__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5643:1: ( ( '}' ) )
            // InternalAllocation.g:5644:1: ( '}' )
            {
            // InternalAllocation.g:5644:1: ( '}' )
            // InternalAllocation.g:5645:2: '}'
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
    // InternalAllocation.g:5655:1: rule__ReturnType_Impl__Group__0 : rule__ReturnType_Impl__Group__0__Impl rule__ReturnType_Impl__Group__1 ;
    public final void rule__ReturnType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5659:1: ( rule__ReturnType_Impl__Group__0__Impl rule__ReturnType_Impl__Group__1 )
            // InternalAllocation.g:5660:2: rule__ReturnType_Impl__Group__0__Impl rule__ReturnType_Impl__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAllocation.g:5667:1: rule__ReturnType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ReturnType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5671:1: ( ( () ) )
            // InternalAllocation.g:5672:1: ( () )
            {
            // InternalAllocation.g:5672:1: ( () )
            // InternalAllocation.g:5673:2: ()
            {
             before(grammarAccess.getReturnType_ImplAccess().getReturnTypeAction_0()); 
            // InternalAllocation.g:5674:2: ()
            // InternalAllocation.g:5674:3: 
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
    // InternalAllocation.g:5682:1: rule__ReturnType_Impl__Group__1 : rule__ReturnType_Impl__Group__1__Impl rule__ReturnType_Impl__Group__2 ;
    public final void rule__ReturnType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5686:1: ( rule__ReturnType_Impl__Group__1__Impl rule__ReturnType_Impl__Group__2 )
            // InternalAllocation.g:5687:2: rule__ReturnType_Impl__Group__1__Impl rule__ReturnType_Impl__Group__2
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
    // InternalAllocation.g:5694:1: rule__ReturnType_Impl__Group__1__Impl : ( 'ReturnType' ) ;
    public final void rule__ReturnType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5698:1: ( ( 'ReturnType' ) )
            // InternalAllocation.g:5699:1: ( 'ReturnType' )
            {
            // InternalAllocation.g:5699:1: ( 'ReturnType' )
            // InternalAllocation.g:5700:2: 'ReturnType'
            {
             before(grammarAccess.getReturnType_ImplAccess().getReturnTypeKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalAllocation.g:5709:1: rule__ReturnType_Impl__Group__2 : rule__ReturnType_Impl__Group__2__Impl ;
    public final void rule__ReturnType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5713:1: ( rule__ReturnType_Impl__Group__2__Impl )
            // InternalAllocation.g:5714:2: rule__ReturnType_Impl__Group__2__Impl
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
    // InternalAllocation.g:5720:1: rule__ReturnType_Impl__Group__2__Impl : ( ( rule__ReturnType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ReturnType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5724:1: ( ( ( rule__ReturnType_Impl__NameAssignment_2 ) ) )
            // InternalAllocation.g:5725:1: ( ( rule__ReturnType_Impl__NameAssignment_2 ) )
            {
            // InternalAllocation.g:5725:1: ( ( rule__ReturnType_Impl__NameAssignment_2 ) )
            // InternalAllocation.g:5726:2: ( rule__ReturnType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getReturnType_ImplAccess().getNameAssignment_2()); 
            // InternalAllocation.g:5727:2: ( rule__ReturnType_Impl__NameAssignment_2 )
            // InternalAllocation.g:5727:3: rule__ReturnType_Impl__NameAssignment_2
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
    // InternalAllocation.g:5736:1: rule__ParameterType_Impl__Group__0 : rule__ParameterType_Impl__Group__0__Impl rule__ParameterType_Impl__Group__1 ;
    public final void rule__ParameterType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5740:1: ( rule__ParameterType_Impl__Group__0__Impl rule__ParameterType_Impl__Group__1 )
            // InternalAllocation.g:5741:2: rule__ParameterType_Impl__Group__0__Impl rule__ParameterType_Impl__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalAllocation.g:5748:1: rule__ParameterType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ParameterType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5752:1: ( ( () ) )
            // InternalAllocation.g:5753:1: ( () )
            {
            // InternalAllocation.g:5753:1: ( () )
            // InternalAllocation.g:5754:2: ()
            {
             before(grammarAccess.getParameterType_ImplAccess().getParameterTypeAction_0()); 
            // InternalAllocation.g:5755:2: ()
            // InternalAllocation.g:5755:3: 
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
    // InternalAllocation.g:5763:1: rule__ParameterType_Impl__Group__1 : rule__ParameterType_Impl__Group__1__Impl rule__ParameterType_Impl__Group__2 ;
    public final void rule__ParameterType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5767:1: ( rule__ParameterType_Impl__Group__1__Impl rule__ParameterType_Impl__Group__2 )
            // InternalAllocation.g:5768:2: rule__ParameterType_Impl__Group__1__Impl rule__ParameterType_Impl__Group__2
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
    // InternalAllocation.g:5775:1: rule__ParameterType_Impl__Group__1__Impl : ( 'ParameterType' ) ;
    public final void rule__ParameterType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5779:1: ( ( 'ParameterType' ) )
            // InternalAllocation.g:5780:1: ( 'ParameterType' )
            {
            // InternalAllocation.g:5780:1: ( 'ParameterType' )
            // InternalAllocation.g:5781:2: 'ParameterType'
            {
             before(grammarAccess.getParameterType_ImplAccess().getParameterTypeKeyword_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalAllocation.g:5790:1: rule__ParameterType_Impl__Group__2 : rule__ParameterType_Impl__Group__2__Impl ;
    public final void rule__ParameterType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5794:1: ( rule__ParameterType_Impl__Group__2__Impl )
            // InternalAllocation.g:5795:2: rule__ParameterType_Impl__Group__2__Impl
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
    // InternalAllocation.g:5801:1: rule__ParameterType_Impl__Group__2__Impl : ( ( rule__ParameterType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ParameterType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5805:1: ( ( ( rule__ParameterType_Impl__NameAssignment_2 ) ) )
            // InternalAllocation.g:5806:1: ( ( rule__ParameterType_Impl__NameAssignment_2 ) )
            {
            // InternalAllocation.g:5806:1: ( ( rule__ParameterType_Impl__NameAssignment_2 ) )
            // InternalAllocation.g:5807:2: ( rule__ParameterType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getParameterType_ImplAccess().getNameAssignment_2()); 
            // InternalAllocation.g:5808:2: ( rule__ParameterType_Impl__NameAssignment_2 )
            // InternalAllocation.g:5808:3: rule__ParameterType_Impl__NameAssignment_2
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
    // InternalAllocation.g:5817:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5821:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalAllocation.g:5822:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalAllocation.g:5829:1: rule__Simple__Group__0__Impl : ( () ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5833:1: ( ( () ) )
            // InternalAllocation.g:5834:1: ( () )
            {
            // InternalAllocation.g:5834:1: ( () )
            // InternalAllocation.g:5835:2: ()
            {
             before(grammarAccess.getSimpleAccess().getSimpleAction_0()); 
            // InternalAllocation.g:5836:2: ()
            // InternalAllocation.g:5836:3: 
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
    // InternalAllocation.g:5844:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl rule__Simple__Group__2 ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5848:1: ( rule__Simple__Group__1__Impl rule__Simple__Group__2 )
            // InternalAllocation.g:5849:2: rule__Simple__Group__1__Impl rule__Simple__Group__2
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
    // InternalAllocation.g:5856:1: rule__Simple__Group__1__Impl : ( 'Simple' ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5860:1: ( ( 'Simple' ) )
            // InternalAllocation.g:5861:1: ( 'Simple' )
            {
            // InternalAllocation.g:5861:1: ( 'Simple' )
            // InternalAllocation.g:5862:2: 'Simple'
            {
             before(grammarAccess.getSimpleAccess().getSimpleKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalAllocation.g:5871:1: rule__Simple__Group__2 : rule__Simple__Group__2__Impl rule__Simple__Group__3 ;
    public final void rule__Simple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5875:1: ( rule__Simple__Group__2__Impl rule__Simple__Group__3 )
            // InternalAllocation.g:5876:2: rule__Simple__Group__2__Impl rule__Simple__Group__3
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
    // InternalAllocation.g:5883:1: rule__Simple__Group__2__Impl : ( ( rule__Simple__NameAssignment_2 ) ) ;
    public final void rule__Simple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5887:1: ( ( ( rule__Simple__NameAssignment_2 ) ) )
            // InternalAllocation.g:5888:1: ( ( rule__Simple__NameAssignment_2 ) )
            {
            // InternalAllocation.g:5888:1: ( ( rule__Simple__NameAssignment_2 ) )
            // InternalAllocation.g:5889:2: ( rule__Simple__NameAssignment_2 )
            {
             before(grammarAccess.getSimpleAccess().getNameAssignment_2()); 
            // InternalAllocation.g:5890:2: ( rule__Simple__NameAssignment_2 )
            // InternalAllocation.g:5890:3: rule__Simple__NameAssignment_2
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
    // InternalAllocation.g:5898:1: rule__Simple__Group__3 : rule__Simple__Group__3__Impl rule__Simple__Group__4 ;
    public final void rule__Simple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5902:1: ( rule__Simple__Group__3__Impl rule__Simple__Group__4 )
            // InternalAllocation.g:5903:2: rule__Simple__Group__3__Impl rule__Simple__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalAllocation.g:5910:1: rule__Simple__Group__3__Impl : ( '{' ) ;
    public final void rule__Simple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5914:1: ( ( '{' ) )
            // InternalAllocation.g:5915:1: ( '{' )
            {
            // InternalAllocation.g:5915:1: ( '{' )
            // InternalAllocation.g:5916:2: '{'
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
    // InternalAllocation.g:5925:1: rule__Simple__Group__4 : rule__Simple__Group__4__Impl rule__Simple__Group__5 ;
    public final void rule__Simple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5929:1: ( rule__Simple__Group__4__Impl rule__Simple__Group__5 )
            // InternalAllocation.g:5930:2: rule__Simple__Group__4__Impl rule__Simple__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalAllocation.g:5937:1: rule__Simple__Group__4__Impl : ( ( rule__Simple__Group_4__0 )? ) ;
    public final void rule__Simple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5941:1: ( ( ( rule__Simple__Group_4__0 )? ) )
            // InternalAllocation.g:5942:1: ( ( rule__Simple__Group_4__0 )? )
            {
            // InternalAllocation.g:5942:1: ( ( rule__Simple__Group_4__0 )? )
            // InternalAllocation.g:5943:2: ( rule__Simple__Group_4__0 )?
            {
             before(grammarAccess.getSimpleAccess().getGroup_4()); 
            // InternalAllocation.g:5944:2: ( rule__Simple__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==60) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAllocation.g:5944:3: rule__Simple__Group_4__0
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
    // InternalAllocation.g:5952:1: rule__Simple__Group__5 : rule__Simple__Group__5__Impl ;
    public final void rule__Simple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5956:1: ( rule__Simple__Group__5__Impl )
            // InternalAllocation.g:5957:2: rule__Simple__Group__5__Impl
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
    // InternalAllocation.g:5963:1: rule__Simple__Group__5__Impl : ( '}' ) ;
    public final void rule__Simple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5967:1: ( ( '}' ) )
            // InternalAllocation.g:5968:1: ( '}' )
            {
            // InternalAllocation.g:5968:1: ( '}' )
            // InternalAllocation.g:5969:2: '}'
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
    // InternalAllocation.g:5979:1: rule__Simple__Group_4__0 : rule__Simple__Group_4__0__Impl rule__Simple__Group_4__1 ;
    public final void rule__Simple__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5983:1: ( rule__Simple__Group_4__0__Impl rule__Simple__Group_4__1 )
            // InternalAllocation.g:5984:2: rule__Simple__Group_4__0__Impl rule__Simple__Group_4__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalAllocation.g:5991:1: rule__Simple__Group_4__0__Impl : ( 'kind' ) ;
    public final void rule__Simple__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:5995:1: ( ( 'kind' ) )
            // InternalAllocation.g:5996:1: ( 'kind' )
            {
            // InternalAllocation.g:5996:1: ( 'kind' )
            // InternalAllocation.g:5997:2: 'kind'
            {
             before(grammarAccess.getSimpleAccess().getKindKeyword_4_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalAllocation.g:6006:1: rule__Simple__Group_4__1 : rule__Simple__Group_4__1__Impl ;
    public final void rule__Simple__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6010:1: ( rule__Simple__Group_4__1__Impl )
            // InternalAllocation.g:6011:2: rule__Simple__Group_4__1__Impl
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
    // InternalAllocation.g:6017:1: rule__Simple__Group_4__1__Impl : ( ( rule__Simple__KindAssignment_4_1 ) ) ;
    public final void rule__Simple__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6021:1: ( ( ( rule__Simple__KindAssignment_4_1 ) ) )
            // InternalAllocation.g:6022:1: ( ( rule__Simple__KindAssignment_4_1 ) )
            {
            // InternalAllocation.g:6022:1: ( ( rule__Simple__KindAssignment_4_1 ) )
            // InternalAllocation.g:6023:2: ( rule__Simple__KindAssignment_4_1 )
            {
             before(grammarAccess.getSimpleAccess().getKindAssignment_4_1()); 
            // InternalAllocation.g:6024:2: ( rule__Simple__KindAssignment_4_1 )
            // InternalAllocation.g:6024:3: rule__Simple__KindAssignment_4_1
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
    // InternalAllocation.g:6033:1: rule__Complex__Group__0 : rule__Complex__Group__0__Impl rule__Complex__Group__1 ;
    public final void rule__Complex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6037:1: ( rule__Complex__Group__0__Impl rule__Complex__Group__1 )
            // InternalAllocation.g:6038:2: rule__Complex__Group__0__Impl rule__Complex__Group__1
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
    // InternalAllocation.g:6045:1: rule__Complex__Group__0__Impl : ( 'Complex' ) ;
    public final void rule__Complex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6049:1: ( ( 'Complex' ) )
            // InternalAllocation.g:6050:1: ( 'Complex' )
            {
            // InternalAllocation.g:6050:1: ( 'Complex' )
            // InternalAllocation.g:6051:2: 'Complex'
            {
             before(grammarAccess.getComplexAccess().getComplexKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalAllocation.g:6060:1: rule__Complex__Group__1 : rule__Complex__Group__1__Impl rule__Complex__Group__2 ;
    public final void rule__Complex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6064:1: ( rule__Complex__Group__1__Impl rule__Complex__Group__2 )
            // InternalAllocation.g:6065:2: rule__Complex__Group__1__Impl rule__Complex__Group__2
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
    // InternalAllocation.g:6072:1: rule__Complex__Group__1__Impl : ( ( rule__Complex__NameAssignment_1 ) ) ;
    public final void rule__Complex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6076:1: ( ( ( rule__Complex__NameAssignment_1 ) ) )
            // InternalAllocation.g:6077:1: ( ( rule__Complex__NameAssignment_1 ) )
            {
            // InternalAllocation.g:6077:1: ( ( rule__Complex__NameAssignment_1 ) )
            // InternalAllocation.g:6078:2: ( rule__Complex__NameAssignment_1 )
            {
             before(grammarAccess.getComplexAccess().getNameAssignment_1()); 
            // InternalAllocation.g:6079:2: ( rule__Complex__NameAssignment_1 )
            // InternalAllocation.g:6079:3: rule__Complex__NameAssignment_1
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
    // InternalAllocation.g:6087:1: rule__Complex__Group__2 : rule__Complex__Group__2__Impl rule__Complex__Group__3 ;
    public final void rule__Complex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6091:1: ( rule__Complex__Group__2__Impl rule__Complex__Group__3 )
            // InternalAllocation.g:6092:2: rule__Complex__Group__2__Impl rule__Complex__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalAllocation.g:6099:1: rule__Complex__Group__2__Impl : ( '{' ) ;
    public final void rule__Complex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6103:1: ( ( '{' ) )
            // InternalAllocation.g:6104:1: ( '{' )
            {
            // InternalAllocation.g:6104:1: ( '{' )
            // InternalAllocation.g:6105:2: '{'
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
    // InternalAllocation.g:6114:1: rule__Complex__Group__3 : rule__Complex__Group__3__Impl rule__Complex__Group__4 ;
    public final void rule__Complex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6118:1: ( rule__Complex__Group__3__Impl rule__Complex__Group__4 )
            // InternalAllocation.g:6119:2: rule__Complex__Group__3__Impl rule__Complex__Group__4
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
    // InternalAllocation.g:6126:1: rule__Complex__Group__3__Impl : ( 'simple' ) ;
    public final void rule__Complex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6130:1: ( ( 'simple' ) )
            // InternalAllocation.g:6131:1: ( 'simple' )
            {
            // InternalAllocation.g:6131:1: ( 'simple' )
            // InternalAllocation.g:6132:2: 'simple'
            {
             before(grammarAccess.getComplexAccess().getSimpleKeyword_3()); 
            match(input,62,FOLLOW_2); 
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
    // InternalAllocation.g:6141:1: rule__Complex__Group__4 : rule__Complex__Group__4__Impl rule__Complex__Group__5 ;
    public final void rule__Complex__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6145:1: ( rule__Complex__Group__4__Impl rule__Complex__Group__5 )
            // InternalAllocation.g:6146:2: rule__Complex__Group__4__Impl rule__Complex__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalAllocation.g:6153:1: rule__Complex__Group__4__Impl : ( '{' ) ;
    public final void rule__Complex__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6157:1: ( ( '{' ) )
            // InternalAllocation.g:6158:1: ( '{' )
            {
            // InternalAllocation.g:6158:1: ( '{' )
            // InternalAllocation.g:6159:2: '{'
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
    // InternalAllocation.g:6168:1: rule__Complex__Group__5 : rule__Complex__Group__5__Impl rule__Complex__Group__6 ;
    public final void rule__Complex__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6172:1: ( rule__Complex__Group__5__Impl rule__Complex__Group__6 )
            // InternalAllocation.g:6173:2: rule__Complex__Group__5__Impl rule__Complex__Group__6
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
    // InternalAllocation.g:6180:1: rule__Complex__Group__5__Impl : ( ( rule__Complex__SimpleAssignment_5 ) ) ;
    public final void rule__Complex__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6184:1: ( ( ( rule__Complex__SimpleAssignment_5 ) ) )
            // InternalAllocation.g:6185:1: ( ( rule__Complex__SimpleAssignment_5 ) )
            {
            // InternalAllocation.g:6185:1: ( ( rule__Complex__SimpleAssignment_5 ) )
            // InternalAllocation.g:6186:2: ( rule__Complex__SimpleAssignment_5 )
            {
             before(grammarAccess.getComplexAccess().getSimpleAssignment_5()); 
            // InternalAllocation.g:6187:2: ( rule__Complex__SimpleAssignment_5 )
            // InternalAllocation.g:6187:3: rule__Complex__SimpleAssignment_5
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
    // InternalAllocation.g:6195:1: rule__Complex__Group__6 : rule__Complex__Group__6__Impl rule__Complex__Group__7 ;
    public final void rule__Complex__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6199:1: ( rule__Complex__Group__6__Impl rule__Complex__Group__7 )
            // InternalAllocation.g:6200:2: rule__Complex__Group__6__Impl rule__Complex__Group__7
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
    // InternalAllocation.g:6207:1: rule__Complex__Group__6__Impl : ( ( rule__Complex__Group_6__0 )* ) ;
    public final void rule__Complex__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6211:1: ( ( ( rule__Complex__Group_6__0 )* ) )
            // InternalAllocation.g:6212:1: ( ( rule__Complex__Group_6__0 )* )
            {
            // InternalAllocation.g:6212:1: ( ( rule__Complex__Group_6__0 )* )
            // InternalAllocation.g:6213:2: ( rule__Complex__Group_6__0 )*
            {
             before(grammarAccess.getComplexAccess().getGroup_6()); 
            // InternalAllocation.g:6214:2: ( rule__Complex__Group_6__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==25) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAllocation.g:6214:3: rule__Complex__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Complex__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalAllocation.g:6222:1: rule__Complex__Group__7 : rule__Complex__Group__7__Impl rule__Complex__Group__8 ;
    public final void rule__Complex__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6226:1: ( rule__Complex__Group__7__Impl rule__Complex__Group__8 )
            // InternalAllocation.g:6227:2: rule__Complex__Group__7__Impl rule__Complex__Group__8
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
    // InternalAllocation.g:6234:1: rule__Complex__Group__7__Impl : ( '}' ) ;
    public final void rule__Complex__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6238:1: ( ( '}' ) )
            // InternalAllocation.g:6239:1: ( '}' )
            {
            // InternalAllocation.g:6239:1: ( '}' )
            // InternalAllocation.g:6240:2: '}'
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
    // InternalAllocation.g:6249:1: rule__Complex__Group__8 : rule__Complex__Group__8__Impl ;
    public final void rule__Complex__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6253:1: ( rule__Complex__Group__8__Impl )
            // InternalAllocation.g:6254:2: rule__Complex__Group__8__Impl
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
    // InternalAllocation.g:6260:1: rule__Complex__Group__8__Impl : ( '}' ) ;
    public final void rule__Complex__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6264:1: ( ( '}' ) )
            // InternalAllocation.g:6265:1: ( '}' )
            {
            // InternalAllocation.g:6265:1: ( '}' )
            // InternalAllocation.g:6266:2: '}'
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
    // InternalAllocation.g:6276:1: rule__Complex__Group_6__0 : rule__Complex__Group_6__0__Impl rule__Complex__Group_6__1 ;
    public final void rule__Complex__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6280:1: ( rule__Complex__Group_6__0__Impl rule__Complex__Group_6__1 )
            // InternalAllocation.g:6281:2: rule__Complex__Group_6__0__Impl rule__Complex__Group_6__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalAllocation.g:6288:1: rule__Complex__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Complex__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6292:1: ( ( ',' ) )
            // InternalAllocation.g:6293:1: ( ',' )
            {
            // InternalAllocation.g:6293:1: ( ',' )
            // InternalAllocation.g:6294:2: ','
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
    // InternalAllocation.g:6303:1: rule__Complex__Group_6__1 : rule__Complex__Group_6__1__Impl ;
    public final void rule__Complex__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6307:1: ( rule__Complex__Group_6__1__Impl )
            // InternalAllocation.g:6308:2: rule__Complex__Group_6__1__Impl
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
    // InternalAllocation.g:6314:1: rule__Complex__Group_6__1__Impl : ( ( rule__Complex__SimpleAssignment_6_1 ) ) ;
    public final void rule__Complex__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6318:1: ( ( ( rule__Complex__SimpleAssignment_6_1 ) ) )
            // InternalAllocation.g:6319:1: ( ( rule__Complex__SimpleAssignment_6_1 ) )
            {
            // InternalAllocation.g:6319:1: ( ( rule__Complex__SimpleAssignment_6_1 ) )
            // InternalAllocation.g:6320:2: ( rule__Complex__SimpleAssignment_6_1 )
            {
             before(grammarAccess.getComplexAccess().getSimpleAssignment_6_1()); 
            // InternalAllocation.g:6321:2: ( rule__Complex__SimpleAssignment_6_1 )
            // InternalAllocation.g:6321:3: rule__Complex__SimpleAssignment_6_1
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
    // InternalAllocation.g:6330:1: rule__Void__Group__0 : rule__Void__Group__0__Impl rule__Void__Group__1 ;
    public final void rule__Void__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6334:1: ( rule__Void__Group__0__Impl rule__Void__Group__1 )
            // InternalAllocation.g:6335:2: rule__Void__Group__0__Impl rule__Void__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalAllocation.g:6342:1: rule__Void__Group__0__Impl : ( () ) ;
    public final void rule__Void__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6346:1: ( ( () ) )
            // InternalAllocation.g:6347:1: ( () )
            {
            // InternalAllocation.g:6347:1: ( () )
            // InternalAllocation.g:6348:2: ()
            {
             before(grammarAccess.getVoidAccess().getVoidAction_0()); 
            // InternalAllocation.g:6349:2: ()
            // InternalAllocation.g:6349:3: 
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
    // InternalAllocation.g:6357:1: rule__Void__Group__1 : rule__Void__Group__1__Impl rule__Void__Group__2 ;
    public final void rule__Void__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6361:1: ( rule__Void__Group__1__Impl rule__Void__Group__2 )
            // InternalAllocation.g:6362:2: rule__Void__Group__1__Impl rule__Void__Group__2
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
    // InternalAllocation.g:6369:1: rule__Void__Group__1__Impl : ( 'Void' ) ;
    public final void rule__Void__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6373:1: ( ( 'Void' ) )
            // InternalAllocation.g:6374:1: ( 'Void' )
            {
            // InternalAllocation.g:6374:1: ( 'Void' )
            // InternalAllocation.g:6375:2: 'Void'
            {
             before(grammarAccess.getVoidAccess().getVoidKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalAllocation.g:6384:1: rule__Void__Group__2 : rule__Void__Group__2__Impl ;
    public final void rule__Void__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6388:1: ( rule__Void__Group__2__Impl )
            // InternalAllocation.g:6389:2: rule__Void__Group__2__Impl
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
    // InternalAllocation.g:6395:1: rule__Void__Group__2__Impl : ( ( rule__Void__NameAssignment_2 ) ) ;
    public final void rule__Void__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6399:1: ( ( ( rule__Void__NameAssignment_2 ) ) )
            // InternalAllocation.g:6400:1: ( ( rule__Void__NameAssignment_2 ) )
            {
            // InternalAllocation.g:6400:1: ( ( rule__Void__NameAssignment_2 ) )
            // InternalAllocation.g:6401:2: ( rule__Void__NameAssignment_2 )
            {
             before(grammarAccess.getVoidAccess().getNameAssignment_2()); 
            // InternalAllocation.g:6402:2: ( rule__Void__NameAssignment_2 )
            // InternalAllocation.g:6402:3: rule__Void__NameAssignment_2
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
    // InternalAllocation.g:6411:1: rule__DelegationConnector__Group__0 : rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1 ;
    public final void rule__DelegationConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6415:1: ( rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1 )
            // InternalAllocation.g:6416:2: rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1
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
    // InternalAllocation.g:6423:1: rule__DelegationConnector__Group__0__Impl : ( 'DelegationConnector' ) ;
    public final void rule__DelegationConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6427:1: ( ( 'DelegationConnector' ) )
            // InternalAllocation.g:6428:1: ( 'DelegationConnector' )
            {
            // InternalAllocation.g:6428:1: ( 'DelegationConnector' )
            // InternalAllocation.g:6429:2: 'DelegationConnector'
            {
             before(grammarAccess.getDelegationConnectorAccess().getDelegationConnectorKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalAllocation.g:6438:1: rule__DelegationConnector__Group__1 : rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2 ;
    public final void rule__DelegationConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6442:1: ( rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2 )
            // InternalAllocation.g:6443:2: rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2
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
    // InternalAllocation.g:6450:1: rule__DelegationConnector__Group__1__Impl : ( ( rule__DelegationConnector__NameAssignment_1 ) ) ;
    public final void rule__DelegationConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6454:1: ( ( ( rule__DelegationConnector__NameAssignment_1 ) ) )
            // InternalAllocation.g:6455:1: ( ( rule__DelegationConnector__NameAssignment_1 ) )
            {
            // InternalAllocation.g:6455:1: ( ( rule__DelegationConnector__NameAssignment_1 ) )
            // InternalAllocation.g:6456:2: ( rule__DelegationConnector__NameAssignment_1 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getNameAssignment_1()); 
            // InternalAllocation.g:6457:2: ( rule__DelegationConnector__NameAssignment_1 )
            // InternalAllocation.g:6457:3: rule__DelegationConnector__NameAssignment_1
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
    // InternalAllocation.g:6465:1: rule__DelegationConnector__Group__2 : rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3 ;
    public final void rule__DelegationConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6469:1: ( rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3 )
            // InternalAllocation.g:6470:2: rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalAllocation.g:6477:1: rule__DelegationConnector__Group__2__Impl : ( '{' ) ;
    public final void rule__DelegationConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6481:1: ( ( '{' ) )
            // InternalAllocation.g:6482:1: ( '{' )
            {
            // InternalAllocation.g:6482:1: ( '{' )
            // InternalAllocation.g:6483:2: '{'
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
    // InternalAllocation.g:6492:1: rule__DelegationConnector__Group__3 : rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4 ;
    public final void rule__DelegationConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6496:1: ( rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4 )
            // InternalAllocation.g:6497:2: rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalAllocation.g:6504:1: rule__DelegationConnector__Group__3__Impl : ( 'role' ) ;
    public final void rule__DelegationConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6508:1: ( ( 'role' ) )
            // InternalAllocation.g:6509:1: ( 'role' )
            {
            // InternalAllocation.g:6509:1: ( 'role' )
            // InternalAllocation.g:6510:2: 'role'
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleKeyword_3()); 
            match(input,65,FOLLOW_2); 
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
    // InternalAllocation.g:6519:1: rule__DelegationConnector__Group__4 : rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5 ;
    public final void rule__DelegationConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6523:1: ( rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5 )
            // InternalAllocation.g:6524:2: rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5
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
    // InternalAllocation.g:6531:1: rule__DelegationConnector__Group__4__Impl : ( '(' ) ;
    public final void rule__DelegationConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6535:1: ( ( '(' ) )
            // InternalAllocation.g:6536:1: ( '(' )
            {
            // InternalAllocation.g:6536:1: ( '(' )
            // InternalAllocation.g:6537:2: '('
            {
             before(grammarAccess.getDelegationConnectorAccess().getLeftParenthesisKeyword_4()); 
            match(input,40,FOLLOW_2); 
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
    // InternalAllocation.g:6546:1: rule__DelegationConnector__Group__5 : rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6 ;
    public final void rule__DelegationConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6550:1: ( rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6 )
            // InternalAllocation.g:6551:2: rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalAllocation.g:6558:1: rule__DelegationConnector__Group__5__Impl : ( ( rule__DelegationConnector__RoleAssignment_5 ) ) ;
    public final void rule__DelegationConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6562:1: ( ( ( rule__DelegationConnector__RoleAssignment_5 ) ) )
            // InternalAllocation.g:6563:1: ( ( rule__DelegationConnector__RoleAssignment_5 ) )
            {
            // InternalAllocation.g:6563:1: ( ( rule__DelegationConnector__RoleAssignment_5 ) )
            // InternalAllocation.g:6564:2: ( rule__DelegationConnector__RoleAssignment_5 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_5()); 
            // InternalAllocation.g:6565:2: ( rule__DelegationConnector__RoleAssignment_5 )
            // InternalAllocation.g:6565:3: rule__DelegationConnector__RoleAssignment_5
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
    // InternalAllocation.g:6573:1: rule__DelegationConnector__Group__6 : rule__DelegationConnector__Group__6__Impl rule__DelegationConnector__Group__7 ;
    public final void rule__DelegationConnector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6577:1: ( rule__DelegationConnector__Group__6__Impl rule__DelegationConnector__Group__7 )
            // InternalAllocation.g:6578:2: rule__DelegationConnector__Group__6__Impl rule__DelegationConnector__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalAllocation.g:6585:1: rule__DelegationConnector__Group__6__Impl : ( ( rule__DelegationConnector__Group_6__0 )* ) ;
    public final void rule__DelegationConnector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6589:1: ( ( ( rule__DelegationConnector__Group_6__0 )* ) )
            // InternalAllocation.g:6590:1: ( ( rule__DelegationConnector__Group_6__0 )* )
            {
            // InternalAllocation.g:6590:1: ( ( rule__DelegationConnector__Group_6__0 )* )
            // InternalAllocation.g:6591:2: ( rule__DelegationConnector__Group_6__0 )*
            {
             before(grammarAccess.getDelegationConnectorAccess().getGroup_6()); 
            // InternalAllocation.g:6592:2: ( rule__DelegationConnector__Group_6__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==25) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAllocation.g:6592:3: rule__DelegationConnector__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DelegationConnector__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalAllocation.g:6600:1: rule__DelegationConnector__Group__7 : rule__DelegationConnector__Group__7__Impl rule__DelegationConnector__Group__8 ;
    public final void rule__DelegationConnector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6604:1: ( rule__DelegationConnector__Group__7__Impl rule__DelegationConnector__Group__8 )
            // InternalAllocation.g:6605:2: rule__DelegationConnector__Group__7__Impl rule__DelegationConnector__Group__8
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
    // InternalAllocation.g:6612:1: rule__DelegationConnector__Group__7__Impl : ( ')' ) ;
    public final void rule__DelegationConnector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6616:1: ( ( ')' ) )
            // InternalAllocation.g:6617:1: ( ')' )
            {
            // InternalAllocation.g:6617:1: ( ')' )
            // InternalAllocation.g:6618:2: ')'
            {
             before(grammarAccess.getDelegationConnectorAccess().getRightParenthesisKeyword_7()); 
            match(input,41,FOLLOW_2); 
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
    // InternalAllocation.g:6627:1: rule__DelegationConnector__Group__8 : rule__DelegationConnector__Group__8__Impl ;
    public final void rule__DelegationConnector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6631:1: ( rule__DelegationConnector__Group__8__Impl )
            // InternalAllocation.g:6632:2: rule__DelegationConnector__Group__8__Impl
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
    // InternalAllocation.g:6638:1: rule__DelegationConnector__Group__8__Impl : ( '}' ) ;
    public final void rule__DelegationConnector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6642:1: ( ( '}' ) )
            // InternalAllocation.g:6643:1: ( '}' )
            {
            // InternalAllocation.g:6643:1: ( '}' )
            // InternalAllocation.g:6644:2: '}'
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
    // InternalAllocation.g:6654:1: rule__DelegationConnector__Group_6__0 : rule__DelegationConnector__Group_6__0__Impl rule__DelegationConnector__Group_6__1 ;
    public final void rule__DelegationConnector__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6658:1: ( rule__DelegationConnector__Group_6__0__Impl rule__DelegationConnector__Group_6__1 )
            // InternalAllocation.g:6659:2: rule__DelegationConnector__Group_6__0__Impl rule__DelegationConnector__Group_6__1
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
    // InternalAllocation.g:6666:1: rule__DelegationConnector__Group_6__0__Impl : ( ',' ) ;
    public final void rule__DelegationConnector__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6670:1: ( ( ',' ) )
            // InternalAllocation.g:6671:1: ( ',' )
            {
            // InternalAllocation.g:6671:1: ( ',' )
            // InternalAllocation.g:6672:2: ','
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
    // InternalAllocation.g:6681:1: rule__DelegationConnector__Group_6__1 : rule__DelegationConnector__Group_6__1__Impl ;
    public final void rule__DelegationConnector__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6685:1: ( rule__DelegationConnector__Group_6__1__Impl )
            // InternalAllocation.g:6686:2: rule__DelegationConnector__Group_6__1__Impl
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
    // InternalAllocation.g:6692:1: rule__DelegationConnector__Group_6__1__Impl : ( ( rule__DelegationConnector__RoleAssignment_6_1 ) ) ;
    public final void rule__DelegationConnector__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6696:1: ( ( ( rule__DelegationConnector__RoleAssignment_6_1 ) ) )
            // InternalAllocation.g:6697:1: ( ( rule__DelegationConnector__RoleAssignment_6_1 ) )
            {
            // InternalAllocation.g:6697:1: ( ( rule__DelegationConnector__RoleAssignment_6_1 ) )
            // InternalAllocation.g:6698:2: ( rule__DelegationConnector__RoleAssignment_6_1 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_6_1()); 
            // InternalAllocation.g:6699:2: ( rule__DelegationConnector__RoleAssignment_6_1 )
            // InternalAllocation.g:6699:3: rule__DelegationConnector__RoleAssignment_6_1
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
    // InternalAllocation.g:6708:1: rule__Role_Impl__Group__0 : rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1 ;
    public final void rule__Role_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6712:1: ( rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1 )
            // InternalAllocation.g:6713:2: rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1
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
    // InternalAllocation.g:6720:1: rule__Role_Impl__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Role_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6724:1: ( ( 'Role' ) )
            // InternalAllocation.g:6725:1: ( 'Role' )
            {
            // InternalAllocation.g:6725:1: ( 'Role' )
            // InternalAllocation.g:6726:2: 'Role'
            {
             before(grammarAccess.getRole_ImplAccess().getRoleKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalAllocation.g:6735:1: rule__Role_Impl__Group__1 : rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2 ;
    public final void rule__Role_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6739:1: ( rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2 )
            // InternalAllocation.g:6740:2: rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2
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
    // InternalAllocation.g:6747:1: rule__Role_Impl__Group__1__Impl : ( ( rule__Role_Impl__NameAssignment_1 ) ) ;
    public final void rule__Role_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6751:1: ( ( ( rule__Role_Impl__NameAssignment_1 ) ) )
            // InternalAllocation.g:6752:1: ( ( rule__Role_Impl__NameAssignment_1 ) )
            {
            // InternalAllocation.g:6752:1: ( ( rule__Role_Impl__NameAssignment_1 ) )
            // InternalAllocation.g:6753:2: ( rule__Role_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getRole_ImplAccess().getNameAssignment_1()); 
            // InternalAllocation.g:6754:2: ( rule__Role_Impl__NameAssignment_1 )
            // InternalAllocation.g:6754:3: rule__Role_Impl__NameAssignment_1
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
    // InternalAllocation.g:6762:1: rule__Role_Impl__Group__2 : rule__Role_Impl__Group__2__Impl rule__Role_Impl__Group__3 ;
    public final void rule__Role_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6766:1: ( rule__Role_Impl__Group__2__Impl rule__Role_Impl__Group__3 )
            // InternalAllocation.g:6767:2: rule__Role_Impl__Group__2__Impl rule__Role_Impl__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalAllocation.g:6774:1: rule__Role_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Role_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6778:1: ( ( '{' ) )
            // InternalAllocation.g:6779:1: ( '{' )
            {
            // InternalAllocation.g:6779:1: ( '{' )
            // InternalAllocation.g:6780:2: '{'
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
    // InternalAllocation.g:6789:1: rule__Role_Impl__Group__3 : rule__Role_Impl__Group__3__Impl rule__Role_Impl__Group__4 ;
    public final void rule__Role_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6793:1: ( rule__Role_Impl__Group__3__Impl rule__Role_Impl__Group__4 )
            // InternalAllocation.g:6794:2: rule__Role_Impl__Group__3__Impl rule__Role_Impl__Group__4
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
    // InternalAllocation.g:6801:1: rule__Role_Impl__Group__3__Impl : ( 'interface' ) ;
    public final void rule__Role_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6805:1: ( ( 'interface' ) )
            // InternalAllocation.g:6806:1: ( 'interface' )
            {
            // InternalAllocation.g:6806:1: ( 'interface' )
            // InternalAllocation.g:6807:2: 'interface'
            {
             before(grammarAccess.getRole_ImplAccess().getInterfaceKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalAllocation.g:6816:1: rule__Role_Impl__Group__4 : rule__Role_Impl__Group__4__Impl rule__Role_Impl__Group__5 ;
    public final void rule__Role_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6820:1: ( rule__Role_Impl__Group__4__Impl rule__Role_Impl__Group__5 )
            // InternalAllocation.g:6821:2: rule__Role_Impl__Group__4__Impl rule__Role_Impl__Group__5
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
    // InternalAllocation.g:6828:1: rule__Role_Impl__Group__4__Impl : ( ( rule__Role_Impl__InterfaceAssignment_4 ) ) ;
    public final void rule__Role_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6832:1: ( ( ( rule__Role_Impl__InterfaceAssignment_4 ) ) )
            // InternalAllocation.g:6833:1: ( ( rule__Role_Impl__InterfaceAssignment_4 ) )
            {
            // InternalAllocation.g:6833:1: ( ( rule__Role_Impl__InterfaceAssignment_4 ) )
            // InternalAllocation.g:6834:2: ( rule__Role_Impl__InterfaceAssignment_4 )
            {
             before(grammarAccess.getRole_ImplAccess().getInterfaceAssignment_4()); 
            // InternalAllocation.g:6835:2: ( rule__Role_Impl__InterfaceAssignment_4 )
            // InternalAllocation.g:6835:3: rule__Role_Impl__InterfaceAssignment_4
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
    // InternalAllocation.g:6843:1: rule__Role_Impl__Group__5 : rule__Role_Impl__Group__5__Impl ;
    public final void rule__Role_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6847:1: ( rule__Role_Impl__Group__5__Impl )
            // InternalAllocation.g:6848:2: rule__Role_Impl__Group__5__Impl
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
    // InternalAllocation.g:6854:1: rule__Role_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__Role_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6858:1: ( ( '}' ) )
            // InternalAllocation.g:6859:1: ( '}' )
            {
            // InternalAllocation.g:6859:1: ( '}' )
            // InternalAllocation.g:6860:2: '}'
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
    // InternalAllocation.g:6870:1: rule__Allocation__AllocationcontextAssignment_4 : ( ruleAllocationContext ) ;
    public final void rule__Allocation__AllocationcontextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6874:1: ( ( ruleAllocationContext ) )
            // InternalAllocation.g:6875:2: ( ruleAllocationContext )
            {
            // InternalAllocation.g:6875:2: ( ruleAllocationContext )
            // InternalAllocation.g:6876:3: ruleAllocationContext
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
    // InternalAllocation.g:6885:1: rule__Allocation__AllocationcontextAssignment_5_1 : ( ruleAllocationContext ) ;
    public final void rule__Allocation__AllocationcontextAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6889:1: ( ( ruleAllocationContext ) )
            // InternalAllocation.g:6890:2: ( ruleAllocationContext )
            {
            // InternalAllocation.g:6890:2: ( ruleAllocationContext )
            // InternalAllocation.g:6891:3: ruleAllocationContext
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
    // InternalAllocation.g:6900:1: rule__AllocationContext__ContainerAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__ContainerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6904:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:6905:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:6905:2: ( ( ruleEString ) )
            // InternalAllocation.g:6906:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0()); 
            // InternalAllocation.g:6907:3: ( ruleEString )
            // InternalAllocation.g:6908:4: ruleEString
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
    // InternalAllocation.g:6919:1: rule__AllocationContext__AssemblycontextAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__AssemblycontextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6923:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:6924:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:6924:2: ( ( ruleEString ) )
            // InternalAllocation.g:6925:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblycontextAssemblyContextCrossReference_5_0()); 
            // InternalAllocation.g:6926:3: ( ruleEString )
            // InternalAllocation.g:6927:4: ruleEString
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
    // InternalAllocation.g:6938:1: rule__AssemblyContext__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AssemblyContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6942:1: ( ( ruleEString ) )
            // InternalAllocation.g:6943:2: ( ruleEString )
            {
            // InternalAllocation.g:6943:2: ( ruleEString )
            // InternalAllocation.g:6944:3: ruleEString
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
    // InternalAllocation.g:6953:1: rule__AssemblyContext__ComponentAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__ComponentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6957:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:6958:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:6958:2: ( ( ruleEString ) )
            // InternalAllocation.g:6959:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_4_0()); 
            // InternalAllocation.g:6960:3: ( ruleEString )
            // InternalAllocation.g:6961:4: ruleEString
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
    // InternalAllocation.g:6972:1: rule__Component_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Component_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6976:1: ( ( ruleEString ) )
            // InternalAllocation.g:6977:2: ( ruleEString )
            {
            // InternalAllocation.g:6977:2: ( ruleEString )
            // InternalAllocation.g:6978:3: ruleEString
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
    // InternalAllocation.g:6987:1: rule__Component_Impl__BehaviourdescriptionAssignment_3_2 : ( ruleBehaviourDescription ) ;
    public final void rule__Component_Impl__BehaviourdescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:6991:1: ( ( ruleBehaviourDescription ) )
            // InternalAllocation.g:6992:2: ( ruleBehaviourDescription )
            {
            // InternalAllocation.g:6992:2: ( ruleBehaviourDescription )
            // InternalAllocation.g:6993:3: ruleBehaviourDescription
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
    // InternalAllocation.g:7002:1: rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 : ( ruleBehaviourDescription ) ;
    public final void rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7006:1: ( ( ruleBehaviourDescription ) )
            // InternalAllocation.g:7007:2: ( ruleBehaviourDescription )
            {
            // InternalAllocation.g:7007:2: ( ruleBehaviourDescription )
            // InternalAllocation.g:7008:3: ruleBehaviourDescription
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
    // InternalAllocation.g:7017:1: rule__Component_Impl__ServiceAssignment_6 : ( ruleService ) ;
    public final void rule__Component_Impl__ServiceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7021:1: ( ( ruleService ) )
            // InternalAllocation.g:7022:2: ( ruleService )
            {
            // InternalAllocation.g:7022:2: ( ruleService )
            // InternalAllocation.g:7023:3: ruleService
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
    // InternalAllocation.g:7032:1: rule__Component_Impl__ServiceAssignment_7_1 : ( ruleService ) ;
    public final void rule__Component_Impl__ServiceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7036:1: ( ( ruleService ) )
            // InternalAllocation.g:7037:2: ( ruleService )
            {
            // InternalAllocation.g:7037:2: ( ruleService )
            // InternalAllocation.g:7038:3: ruleService
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
    // InternalAllocation.g:7047:1: rule__Component_Impl__RequiredroleAssignment_9_2 : ( ruleRequiredRole ) ;
    public final void rule__Component_Impl__RequiredroleAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7051:1: ( ( ruleRequiredRole ) )
            // InternalAllocation.g:7052:2: ( ruleRequiredRole )
            {
            // InternalAllocation.g:7052:2: ( ruleRequiredRole )
            // InternalAllocation.g:7053:3: ruleRequiredRole
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
    // InternalAllocation.g:7062:1: rule__Component_Impl__RequiredroleAssignment_9_3_1 : ( ruleRequiredRole ) ;
    public final void rule__Component_Impl__RequiredroleAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7066:1: ( ( ruleRequiredRole ) )
            // InternalAllocation.g:7067:2: ( ruleRequiredRole )
            {
            // InternalAllocation.g:7067:2: ( ruleRequiredRole )
            // InternalAllocation.g:7068:3: ruleRequiredRole
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
    // InternalAllocation.g:7077:1: rule__Component_Impl__ProvidedroleAssignment_11 : ( ruleProvidedRole ) ;
    public final void rule__Component_Impl__ProvidedroleAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7081:1: ( ( ruleProvidedRole ) )
            // InternalAllocation.g:7082:2: ( ruleProvidedRole )
            {
            // InternalAllocation.g:7082:2: ( ruleProvidedRole )
            // InternalAllocation.g:7083:3: ruleProvidedRole
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


    // $ANTLR start "rule__BehaviourDescription__DescriptionelementAssignment_3_2"
    // InternalAllocation.g:7092:1: rule__BehaviourDescription__DescriptionelementAssignment_3_2 : ( ruleDescriptionElement ) ;
    public final void rule__BehaviourDescription__DescriptionelementAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7096:1: ( ( ruleDescriptionElement ) )
            // InternalAllocation.g:7097:2: ( ruleDescriptionElement )
            {
            // InternalAllocation.g:7097:2: ( ruleDescriptionElement )
            // InternalAllocation.g:7098:3: ruleDescriptionElement
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementDescriptionElementParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDescriptionElement();

            state._fsp--;

             after(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementDescriptionElementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__DescriptionelementAssignment_3_2"


    // $ANTLR start "rule__BehaviourDescription__DescriptionelementAssignment_3_3_1"
    // InternalAllocation.g:7107:1: rule__BehaviourDescription__DescriptionelementAssignment_3_3_1 : ( ruleDescriptionElement ) ;
    public final void rule__BehaviourDescription__DescriptionelementAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7111:1: ( ( ruleDescriptionElement ) )
            // InternalAllocation.g:7112:2: ( ruleDescriptionElement )
            {
            // InternalAllocation.g:7112:2: ( ruleDescriptionElement )
            // InternalAllocation.g:7113:3: ruleDescriptionElement
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementDescriptionElementParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDescriptionElement();

            state._fsp--;

             after(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementDescriptionElementParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__DescriptionelementAssignment_3_3_1"


    // $ANTLR start "rule__Service__CorrespondingSignaturesAssignment_4"
    // InternalAllocation.g:7122:1: rule__Service__CorrespondingSignaturesAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Service__CorrespondingSignaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7126:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:7127:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:7127:2: ( ( ruleEString ) )
            // InternalAllocation.g:7128:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_4_0()); 
            // InternalAllocation.g:7129:3: ( ruleEString )
            // InternalAllocation.g:7130:4: ruleEString
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
    // InternalAllocation.g:7141:1: rule__Service__CorrespondingSignaturesAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Service__CorrespondingSignaturesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7145:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:7146:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:7146:2: ( ( ruleEString ) )
            // InternalAllocation.g:7147:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_5_1_0()); 
            // InternalAllocation.g:7148:3: ( ruleEString )
            // InternalAllocation.g:7149:4: ruleEString
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
    // InternalAllocation.g:7160:1: rule__RequiredRole__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RequiredRole__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7164:1: ( ( ruleEString ) )
            // InternalAllocation.g:7165:2: ( ruleEString )
            {
            // InternalAllocation.g:7165:2: ( ruleEString )
            // InternalAllocation.g:7166:3: ruleEString
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
    // InternalAllocation.g:7175:1: rule__RequiredRole__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__RequiredRole__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7179:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:7180:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:7180:2: ( ( ruleEString ) )
            // InternalAllocation.g:7181:3: ( ruleEString )
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalAllocation.g:7182:3: ( ruleEString )
            // InternalAllocation.g:7183:4: ruleEString
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
    // InternalAllocation.g:7194:1: rule__ProvidedRole__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ProvidedRole__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7198:1: ( ( ruleEString ) )
            // InternalAllocation.g:7199:2: ( ruleEString )
            {
            // InternalAllocation.g:7199:2: ( ruleEString )
            // InternalAllocation.g:7200:3: ruleEString
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
    // InternalAllocation.g:7209:1: rule__ProvidedRole__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ProvidedRole__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7213:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:7214:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:7214:2: ( ( ruleEString ) )
            // InternalAllocation.g:7215:3: ( ruleEString )
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalAllocation.g:7216:3: ( ruleEString )
            // InternalAllocation.g:7217:4: ruleEString
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
    // InternalAllocation.g:7228:1: rule__CompositeComponent__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompositeComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7232:1: ( ( ruleEString ) )
            // InternalAllocation.g:7233:2: ( ruleEString )
            {
            // InternalAllocation.g:7233:2: ( ruleEString )
            // InternalAllocation.g:7234:3: ruleEString
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
    // InternalAllocation.g:7243:1: rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 : ( ruleBehaviourDescription ) ;
    public final void rule__CompositeComponent__BehaviourdescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7247:1: ( ( ruleBehaviourDescription ) )
            // InternalAllocation.g:7248:2: ( ruleBehaviourDescription )
            {
            // InternalAllocation.g:7248:2: ( ruleBehaviourDescription )
            // InternalAllocation.g:7249:3: ruleBehaviourDescription
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
    // InternalAllocation.g:7258:1: rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 : ( ruleBehaviourDescription ) ;
    public final void rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7262:1: ( ( ruleBehaviourDescription ) )
            // InternalAllocation.g:7263:2: ( ruleBehaviourDescription )
            {
            // InternalAllocation.g:7263:2: ( ruleBehaviourDescription )
            // InternalAllocation.g:7264:3: ruleBehaviourDescription
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
    // InternalAllocation.g:7273:1: rule__CompositeComponent__ServiceAssignment_6 : ( ruleService ) ;
    public final void rule__CompositeComponent__ServiceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7277:1: ( ( ruleService ) )
            // InternalAllocation.g:7278:2: ( ruleService )
            {
            // InternalAllocation.g:7278:2: ( ruleService )
            // InternalAllocation.g:7279:3: ruleService
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
    // InternalAllocation.g:7288:1: rule__CompositeComponent__ServiceAssignment_7_1 : ( ruleService ) ;
    public final void rule__CompositeComponent__ServiceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7292:1: ( ( ruleService ) )
            // InternalAllocation.g:7293:2: ( ruleService )
            {
            // InternalAllocation.g:7293:2: ( ruleService )
            // InternalAllocation.g:7294:3: ruleService
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
    // InternalAllocation.g:7303:1: rule__CompositeComponent__RequiredroleAssignment_9_2 : ( ruleRequiredRole ) ;
    public final void rule__CompositeComponent__RequiredroleAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7307:1: ( ( ruleRequiredRole ) )
            // InternalAllocation.g:7308:2: ( ruleRequiredRole )
            {
            // InternalAllocation.g:7308:2: ( ruleRequiredRole )
            // InternalAllocation.g:7309:3: ruleRequiredRole
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
    // InternalAllocation.g:7318:1: rule__CompositeComponent__RequiredroleAssignment_9_3_1 : ( ruleRequiredRole ) ;
    public final void rule__CompositeComponent__RequiredroleAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7322:1: ( ( ruleRequiredRole ) )
            // InternalAllocation.g:7323:2: ( ruleRequiredRole )
            {
            // InternalAllocation.g:7323:2: ( ruleRequiredRole )
            // InternalAllocation.g:7324:3: ruleRequiredRole
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
    // InternalAllocation.g:7333:1: rule__CompositeComponent__ProvidedroleAssignment_11 : ( ruleProvidedRole ) ;
    public final void rule__CompositeComponent__ProvidedroleAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7337:1: ( ( ruleProvidedRole ) )
            // InternalAllocation.g:7338:2: ( ruleProvidedRole )
            {
            // InternalAllocation.g:7338:2: ( ruleProvidedRole )
            // InternalAllocation.g:7339:3: ruleProvidedRole
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
    // InternalAllocation.g:7348:1: rule__CompositeComponent__AssemblycontextAssignment_14 : ( ruleAssemblyContext ) ;
    public final void rule__CompositeComponent__AssemblycontextAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7352:1: ( ( ruleAssemblyContext ) )
            // InternalAllocation.g:7353:2: ( ruleAssemblyContext )
            {
            // InternalAllocation.g:7353:2: ( ruleAssemblyContext )
            // InternalAllocation.g:7354:3: ruleAssemblyContext
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
    // InternalAllocation.g:7363:1: rule__CompositeComponent__AssemblycontextAssignment_15_1 : ( ruleAssemblyContext ) ;
    public final void rule__CompositeComponent__AssemblycontextAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7367:1: ( ( ruleAssemblyContext ) )
            // InternalAllocation.g:7368:2: ( ruleAssemblyContext )
            {
            // InternalAllocation.g:7368:2: ( ruleAssemblyContext )
            // InternalAllocation.g:7369:3: ruleAssemblyContext
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
    // InternalAllocation.g:7378:1: rule__CompositeComponent__DelegationconnectorAssignment_19 : ( ruleDelegationConnector ) ;
    public final void rule__CompositeComponent__DelegationconnectorAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7382:1: ( ( ruleDelegationConnector ) )
            // InternalAllocation.g:7383:2: ( ruleDelegationConnector )
            {
            // InternalAllocation.g:7383:2: ( ruleDelegationConnector )
            // InternalAllocation.g:7384:3: ruleDelegationConnector
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
    // InternalAllocation.g:7393:1: rule__CompositeComponent__DelegationconnectorAssignment_20_1 : ( ruleDelegationConnector ) ;
    public final void rule__CompositeComponent__DelegationconnectorAssignment_20_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7397:1: ( ( ruleDelegationConnector ) )
            // InternalAllocation.g:7398:2: ( ruleDelegationConnector )
            {
            // InternalAllocation.g:7398:2: ( ruleDelegationConnector )
            // InternalAllocation.g:7399:3: ruleDelegationConnector
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


    // $ANTLR start "rule__Loop__DescriptionelementAssignment_3_2"
    // InternalAllocation.g:7408:1: rule__Loop__DescriptionelementAssignment_3_2 : ( ruleDescriptionElement ) ;
    public final void rule__Loop__DescriptionelementAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7412:1: ( ( ruleDescriptionElement ) )
            // InternalAllocation.g:7413:2: ( ruleDescriptionElement )
            {
            // InternalAllocation.g:7413:2: ( ruleDescriptionElement )
            // InternalAllocation.g:7414:3: ruleDescriptionElement
            {
             before(grammarAccess.getLoopAccess().getDescriptionelementDescriptionElementParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDescriptionElement();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getDescriptionelementDescriptionElementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__DescriptionelementAssignment_3_2"


    // $ANTLR start "rule__Loop__DescriptionelementAssignment_3_3_1"
    // InternalAllocation.g:7423:1: rule__Loop__DescriptionelementAssignment_3_3_1 : ( ruleDescriptionElement ) ;
    public final void rule__Loop__DescriptionelementAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7427:1: ( ( ruleDescriptionElement ) )
            // InternalAllocation.g:7428:2: ( ruleDescriptionElement )
            {
            // InternalAllocation.g:7428:2: ( ruleDescriptionElement )
            // InternalAllocation.g:7429:3: ruleDescriptionElement
            {
             before(grammarAccess.getLoopAccess().getDescriptionelementDescriptionElementParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDescriptionElement();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getDescriptionelementDescriptionElementParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__DescriptionelementAssignment_3_3_1"


    // $ANTLR start "rule__Branch__DescriptionelementAssignment_3_2"
    // InternalAllocation.g:7438:1: rule__Branch__DescriptionelementAssignment_3_2 : ( ruleDescriptionElement ) ;
    public final void rule__Branch__DescriptionelementAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7442:1: ( ( ruleDescriptionElement ) )
            // InternalAllocation.g:7443:2: ( ruleDescriptionElement )
            {
            // InternalAllocation.g:7443:2: ( ruleDescriptionElement )
            // InternalAllocation.g:7444:3: ruleDescriptionElement
            {
             before(grammarAccess.getBranchAccess().getDescriptionelementDescriptionElementParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDescriptionElement();

            state._fsp--;

             after(grammarAccess.getBranchAccess().getDescriptionelementDescriptionElementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__DescriptionelementAssignment_3_2"


    // $ANTLR start "rule__Branch__DescriptionelementAssignment_3_3_1"
    // InternalAllocation.g:7453:1: rule__Branch__DescriptionelementAssignment_3_3_1 : ( ruleDescriptionElement ) ;
    public final void rule__Branch__DescriptionelementAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7457:1: ( ( ruleDescriptionElement ) )
            // InternalAllocation.g:7458:2: ( ruleDescriptionElement )
            {
            // InternalAllocation.g:7458:2: ( ruleDescriptionElement )
            // InternalAllocation.g:7459:3: ruleDescriptionElement
            {
             before(grammarAccess.getBranchAccess().getDescriptionelementDescriptionElementParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDescriptionElement();

            state._fsp--;

             after(grammarAccess.getBranchAccess().getDescriptionelementDescriptionElementParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__DescriptionelementAssignment_3_3_1"


    // $ANTLR start "rule__Signature__NameAssignment_1"
    // InternalAllocation.g:7468:1: rule__Signature__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Signature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7472:1: ( ( ruleEString ) )
            // InternalAllocation.g:7473:2: ( ruleEString )
            {
            // InternalAllocation.g:7473:2: ( ruleEString )
            // InternalAllocation.g:7474:3: ruleEString
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
    // InternalAllocation.g:7483:1: rule__Signature__ReturntypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Signature__ReturntypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7487:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:7488:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:7488:2: ( ( ruleEString ) )
            // InternalAllocation.g:7489:3: ( ruleEString )
            {
             before(grammarAccess.getSignatureAccess().getReturntypeReturnTypeCrossReference_4_0()); 
            // InternalAllocation.g:7490:3: ( ruleEString )
            // InternalAllocation.g:7491:4: ruleEString
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
    // InternalAllocation.g:7502:1: rule__Signature__ParameterAssignment_5_2 : ( ruleParameter ) ;
    public final void rule__Signature__ParameterAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7506:1: ( ( ruleParameter ) )
            // InternalAllocation.g:7507:2: ( ruleParameter )
            {
            // InternalAllocation.g:7507:2: ( ruleParameter )
            // InternalAllocation.g:7508:3: ruleParameter
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
    // InternalAllocation.g:7517:1: rule__Signature__ParameterAssignment_5_3_1 : ( ruleParameter ) ;
    public final void rule__Signature__ParameterAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7521:1: ( ( ruleParameter ) )
            // InternalAllocation.g:7522:2: ( ruleParameter )
            {
            // InternalAllocation.g:7522:2: ( ruleParameter )
            // InternalAllocation.g:7523:3: ruleParameter
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
    // InternalAllocation.g:7532:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7536:1: ( ( ruleEString ) )
            // InternalAllocation.g:7537:2: ( ruleEString )
            {
            // InternalAllocation.g:7537:2: ( ruleEString )
            // InternalAllocation.g:7538:3: ruleEString
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
    // InternalAllocation.g:7547:1: rule__Parameter__ParametertypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Parameter__ParametertypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7551:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:7552:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:7552:2: ( ( ruleEString ) )
            // InternalAllocation.g:7553:3: ( ruleEString )
            {
             before(grammarAccess.getParameterAccess().getParametertypeParameterTypeCrossReference_4_0()); 
            // InternalAllocation.g:7554:3: ( ruleEString )
            // InternalAllocation.g:7555:4: ruleEString
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
    // InternalAllocation.g:7566:1: rule__ReturnType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ReturnType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7570:1: ( ( ruleEString ) )
            // InternalAllocation.g:7571:2: ( ruleEString )
            {
            // InternalAllocation.g:7571:2: ( ruleEString )
            // InternalAllocation.g:7572:3: ruleEString
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
    // InternalAllocation.g:7581:1: rule__ParameterType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ParameterType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7585:1: ( ( ruleEString ) )
            // InternalAllocation.g:7586:2: ( ruleEString )
            {
            // InternalAllocation.g:7586:2: ( ruleEString )
            // InternalAllocation.g:7587:3: ruleEString
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
    // InternalAllocation.g:7596:1: rule__Simple__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Simple__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7600:1: ( ( ruleEString ) )
            // InternalAllocation.g:7601:2: ( ruleEString )
            {
            // InternalAllocation.g:7601:2: ( ruleEString )
            // InternalAllocation.g:7602:3: ruleEString
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
    // InternalAllocation.g:7611:1: rule__Simple__KindAssignment_4_1 : ( rulesimpleTypes ) ;
    public final void rule__Simple__KindAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7615:1: ( ( rulesimpleTypes ) )
            // InternalAllocation.g:7616:2: ( rulesimpleTypes )
            {
            // InternalAllocation.g:7616:2: ( rulesimpleTypes )
            // InternalAllocation.g:7617:3: rulesimpleTypes
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
    // InternalAllocation.g:7626:1: rule__Complex__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Complex__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7630:1: ( ( ruleEString ) )
            // InternalAllocation.g:7631:2: ( ruleEString )
            {
            // InternalAllocation.g:7631:2: ( ruleEString )
            // InternalAllocation.g:7632:3: ruleEString
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
    // InternalAllocation.g:7641:1: rule__Complex__SimpleAssignment_5 : ( ruleSimple ) ;
    public final void rule__Complex__SimpleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7645:1: ( ( ruleSimple ) )
            // InternalAllocation.g:7646:2: ( ruleSimple )
            {
            // InternalAllocation.g:7646:2: ( ruleSimple )
            // InternalAllocation.g:7647:3: ruleSimple
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
    // InternalAllocation.g:7656:1: rule__Complex__SimpleAssignment_6_1 : ( ruleSimple ) ;
    public final void rule__Complex__SimpleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7660:1: ( ( ruleSimple ) )
            // InternalAllocation.g:7661:2: ( ruleSimple )
            {
            // InternalAllocation.g:7661:2: ( ruleSimple )
            // InternalAllocation.g:7662:3: ruleSimple
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
    // InternalAllocation.g:7671:1: rule__Void__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Void__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7675:1: ( ( ruleEString ) )
            // InternalAllocation.g:7676:2: ( ruleEString )
            {
            // InternalAllocation.g:7676:2: ( ruleEString )
            // InternalAllocation.g:7677:3: ruleEString
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
    // InternalAllocation.g:7686:1: rule__DelegationConnector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DelegationConnector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7690:1: ( ( ruleEString ) )
            // InternalAllocation.g:7691:2: ( ruleEString )
            {
            // InternalAllocation.g:7691:2: ( ruleEString )
            // InternalAllocation.g:7692:3: ruleEString
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
    // InternalAllocation.g:7701:1: rule__DelegationConnector__RoleAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__DelegationConnector__RoleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7705:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:7706:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:7706:2: ( ( ruleEString ) )
            // InternalAllocation.g:7707:3: ( ruleEString )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_5_0()); 
            // InternalAllocation.g:7708:3: ( ruleEString )
            // InternalAllocation.g:7709:4: ruleEString
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
    // InternalAllocation.g:7720:1: rule__DelegationConnector__RoleAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__DelegationConnector__RoleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7724:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:7725:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:7725:2: ( ( ruleEString ) )
            // InternalAllocation.g:7726:3: ( ruleEString )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_6_1_0()); 
            // InternalAllocation.g:7727:3: ( ruleEString )
            // InternalAllocation.g:7728:4: ruleEString
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
    // InternalAllocation.g:7739:1: rule__Role_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Role_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7743:1: ( ( ruleEString ) )
            // InternalAllocation.g:7744:2: ( ruleEString )
            {
            // InternalAllocation.g:7744:2: ( ruleEString )
            // InternalAllocation.g:7745:3: ruleEString
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
    // InternalAllocation.g:7754:1: rule__Role_Impl__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Role_Impl__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocation.g:7758:1: ( ( ( ruleEString ) ) )
            // InternalAllocation.g:7759:2: ( ( ruleEString ) )
            {
            // InternalAllocation.g:7759:2: ( ( ruleEString ) )
            // InternalAllocation.g:7760:3: ( ruleEString )
            {
             before(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalAllocation.g:7761:3: ( ruleEString )
            // InternalAllocation.g:7762:4: ruleEString
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000001000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000001000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});

}