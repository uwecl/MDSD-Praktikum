package edu.kit.ipd.sdq.mdsdpc.mydsl.ide.contentassist.antlr.internal;

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
import edu.kit.ipd.sdq.mdsdpc.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'boolean'", "'char'", "'date'", "'double'", "'float'", "'list'", "'long'", "'map'", "'string'", "'ComponentBasedSystem'", "'{'", "'interface'", "'('", "')'", "'environment'", "'}'", "','", "'assemblycontext'", "'type'", "'assemblyconnector'", "'AssemblyContext'", "'component'", "'Type'", "'AssemblyConnector'", "'providedrole'", "'requiredrole'", "'Signature'", "'returntype'", "'parameter'", "'Parameter'", "'parametertype'", "'ReturnType'", "'ParameterType'", "'Simple'", "'kind'", "'Complex'", "'simple'", "'Void'", "'Component'", "'service'", "'behaviourdescription'", "'BehaviourDescription'", "'Service'", "'correspondingSignatures'", "'RequiredRole'", "'ProvidedRole'", "'CompositeComponent'", "'delegationconnector'", "'InternalAction'", "'ExternalCall'", "'Loop'", "'Branch'", "'DelegationConnector'", "'role'", "'Role'", "'Container'", "'Link'", "'container'"
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
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleComponentBasedSystem"
    // InternalMyDsl.g:53:1: entryRuleComponentBasedSystem : ruleComponentBasedSystem EOF ;
    public final void entryRuleComponentBasedSystem() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleComponentBasedSystem EOF )
            // InternalMyDsl.g:55:1: ruleComponentBasedSystem EOF
            {
             before(grammarAccess.getComponentBasedSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentBasedSystem();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemRule()); 
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
    // $ANTLR end "entryRuleComponentBasedSystem"


    // $ANTLR start "ruleComponentBasedSystem"
    // InternalMyDsl.g:62:1: ruleComponentBasedSystem : ( ( rule__ComponentBasedSystem__Group__0 ) ) ;
    public final void ruleComponentBasedSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__ComponentBasedSystem__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__ComponentBasedSystem__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__ComponentBasedSystem__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__ComponentBasedSystem__Group__0 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__ComponentBasedSystem__Group__0 )
            // InternalMyDsl.g:69:4: rule__ComponentBasedSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentBasedSystem"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleType EOF )
            // InternalMyDsl.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBehaviourDescription"
    // InternalMyDsl.g:103:1: entryRuleBehaviourDescription : ruleBehaviourDescription EOF ;
    public final void entryRuleBehaviourDescription() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleBehaviourDescription EOF )
            // InternalMyDsl.g:105:1: ruleBehaviourDescription EOF
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
    // InternalMyDsl.g:112:1: ruleBehaviourDescription : ( ( rule__BehaviourDescription__Alternatives ) ) ;
    public final void ruleBehaviourDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__BehaviourDescription__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__BehaviourDescription__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__BehaviourDescription__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__BehaviourDescription__Alternatives )
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__BehaviourDescription__Alternatives )
            // InternalMyDsl.g:119:4: rule__BehaviourDescription__Alternatives
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


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalMyDsl.g:128:1: entryRuleAssemblyContext : ruleAssemblyContext EOF ;
    public final void entryRuleAssemblyContext() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAssemblyContext EOF )
            // InternalMyDsl.g:130:1: ruleAssemblyContext EOF
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
    // InternalMyDsl.g:137:1: ruleAssemblyContext : ( ( rule__AssemblyContext__Group__0 ) ) ;
    public final void ruleAssemblyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__AssemblyContext__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__AssemblyContext__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__AssemblyContext__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__AssemblyContext__Group__0 )
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__AssemblyContext__Group__0 )
            // InternalMyDsl.g:144:4: rule__AssemblyContext__Group__0
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


    // $ANTLR start "entryRuleType_Impl"
    // InternalMyDsl.g:153:1: entryRuleType_Impl : ruleType_Impl EOF ;
    public final void entryRuleType_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleType_Impl EOF )
            // InternalMyDsl.g:155:1: ruleType_Impl EOF
            {
             before(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleType_Impl();

            state._fsp--;

             after(grammarAccess.getType_ImplRule()); 
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
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalMyDsl.g:162:1: ruleType_Impl : ( ( rule__Type_Impl__Group__0 ) ) ;
    public final void ruleType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Type_Impl__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Type_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Type_Impl__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Type_Impl__Group__0 )
            {
             before(grammarAccess.getType_ImplAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Type_Impl__Group__0 )
            // InternalMyDsl.g:169:4: rule__Type_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleAssemblyConnector"
    // InternalMyDsl.g:178:1: entryRuleAssemblyConnector : ruleAssemblyConnector EOF ;
    public final void entryRuleAssemblyConnector() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAssemblyConnector EOF )
            // InternalMyDsl.g:180:1: ruleAssemblyConnector EOF
            {
             before(grammarAccess.getAssemblyConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleAssemblyConnector();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorRule()); 
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
    // $ANTLR end "entryRuleAssemblyConnector"


    // $ANTLR start "ruleAssemblyConnector"
    // InternalMyDsl.g:187:1: ruleAssemblyConnector : ( ( rule__AssemblyConnector__Group__0 ) ) ;
    public final void ruleAssemblyConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__AssemblyConnector__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__AssemblyConnector__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__AssemblyConnector__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__AssemblyConnector__Group__0 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__AssemblyConnector__Group__0 )
            // InternalMyDsl.g:194:4: rule__AssemblyConnector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssemblyConnector"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleEString EOF )
            // InternalMyDsl.g:205:1: ruleEString EOF
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
    // InternalMyDsl.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:219:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleSignature"
    // InternalMyDsl.g:228:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleSignature EOF )
            // InternalMyDsl.g:230:1: ruleSignature EOF
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
    // InternalMyDsl.g:237:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Signature__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Signature__Group__0 )
            {
             before(grammarAccess.getSignatureAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Signature__Group__0 )
            // InternalMyDsl.g:244:4: rule__Signature__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleParameter EOF )
            // InternalMyDsl.g:255:1: ruleParameter EOF
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
    // InternalMyDsl.g:262:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Parameter__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Parameter__Group__0 )
            // InternalMyDsl.g:269:4: rule__Parameter__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleReturnType_Impl : ruleReturnType_Impl EOF ;
    public final void entryRuleReturnType_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleReturnType_Impl EOF )
            // InternalMyDsl.g:280:1: ruleReturnType_Impl EOF
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
    // InternalMyDsl.g:287:1: ruleReturnType_Impl : ( ( rule__ReturnType_Impl__Group__0 ) ) ;
    public final void ruleReturnType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__ReturnType_Impl__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__ReturnType_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__ReturnType_Impl__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__ReturnType_Impl__Group__0 )
            {
             before(grammarAccess.getReturnType_ImplAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__ReturnType_Impl__Group__0 )
            // InternalMyDsl.g:294:4: rule__ReturnType_Impl__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleParameterType_Impl : ruleParameterType_Impl EOF ;
    public final void entryRuleParameterType_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleParameterType_Impl EOF )
            // InternalMyDsl.g:305:1: ruleParameterType_Impl EOF
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
    // InternalMyDsl.g:312:1: ruleParameterType_Impl : ( ( rule__ParameterType_Impl__Group__0 ) ) ;
    public final void ruleParameterType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__ParameterType_Impl__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__ParameterType_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__ParameterType_Impl__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__ParameterType_Impl__Group__0 )
            {
             before(grammarAccess.getParameterType_ImplAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__ParameterType_Impl__Group__0 )
            // InternalMyDsl.g:319:4: rule__ParameterType_Impl__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleSimple : ruleSimple EOF ;
    public final void entryRuleSimple() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleSimple EOF )
            // InternalMyDsl.g:330:1: ruleSimple EOF
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
    // InternalMyDsl.g:337:1: ruleSimple : ( ( rule__Simple__Group__0 ) ) ;
    public final void ruleSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Simple__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Simple__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Simple__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Simple__Group__0 )
            {
             before(grammarAccess.getSimpleAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Simple__Group__0 )
            // InternalMyDsl.g:344:4: rule__Simple__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleComplex : ruleComplex EOF ;
    public final void entryRuleComplex() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleComplex EOF )
            // InternalMyDsl.g:355:1: ruleComplex EOF
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
    // InternalMyDsl.g:362:1: ruleComplex : ( ( rule__Complex__Group__0 ) ) ;
    public final void ruleComplex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Complex__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Complex__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Complex__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Complex__Group__0 )
            {
             before(grammarAccess.getComplexAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Complex__Group__0 )
            // InternalMyDsl.g:369:4: rule__Complex__Group__0
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
    // InternalMyDsl.g:378:1: entryRuleVoid : ruleVoid EOF ;
    public final void entryRuleVoid() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleVoid EOF )
            // InternalMyDsl.g:380:1: ruleVoid EOF
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
    // InternalMyDsl.g:387:1: ruleVoid : ( ( rule__Void__Group__0 ) ) ;
    public final void ruleVoid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Void__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Void__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Void__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Void__Group__0 )
            {
             before(grammarAccess.getVoidAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Void__Group__0 )
            // InternalMyDsl.g:394:4: rule__Void__Group__0
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


    // $ANTLR start "entryRuleComponent_Impl"
    // InternalMyDsl.g:403:1: entryRuleComponent_Impl : ruleComponent_Impl EOF ;
    public final void entryRuleComponent_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleComponent_Impl EOF )
            // InternalMyDsl.g:405:1: ruleComponent_Impl EOF
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
    // InternalMyDsl.g:412:1: ruleComponent_Impl : ( ( rule__Component_Impl__Group__0 ) ) ;
    public final void ruleComponent_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Component_Impl__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Component_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Component_Impl__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Component_Impl__Group__0 )
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Component_Impl__Group__0 )
            // InternalMyDsl.g:419:4: rule__Component_Impl__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleBehaviourDescription_Impl : ruleBehaviourDescription_Impl EOF ;
    public final void entryRuleBehaviourDescription_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleBehaviourDescription_Impl EOF )
            // InternalMyDsl.g:430:1: ruleBehaviourDescription_Impl EOF
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
    // InternalMyDsl.g:437:1: ruleBehaviourDescription_Impl : ( ( rule__BehaviourDescription_Impl__Group__0 ) ) ;
    public final void ruleBehaviourDescription_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__BehaviourDescription_Impl__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__BehaviourDescription_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__BehaviourDescription_Impl__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__BehaviourDescription_Impl__Group__0 )
            {
             before(grammarAccess.getBehaviourDescription_ImplAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__BehaviourDescription_Impl__Group__0 )
            // InternalMyDsl.g:444:4: rule__BehaviourDescription_Impl__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleService EOF )
            // InternalMyDsl.g:455:1: ruleService EOF
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
    // InternalMyDsl.g:462:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Service__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Service__Group__0 )
            // InternalMyDsl.g:469:4: rule__Service__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleRequiredRole : ruleRequiredRole EOF ;
    public final void entryRuleRequiredRole() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleRequiredRole EOF )
            // InternalMyDsl.g:480:1: ruleRequiredRole EOF
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
    // InternalMyDsl.g:487:1: ruleRequiredRole : ( ( rule__RequiredRole__Group__0 ) ) ;
    public final void ruleRequiredRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__RequiredRole__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__RequiredRole__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__RequiredRole__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__RequiredRole__Group__0 )
            {
             before(grammarAccess.getRequiredRoleAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__RequiredRole__Group__0 )
            // InternalMyDsl.g:494:4: rule__RequiredRole__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleProvidedRole : ruleProvidedRole EOF ;
    public final void entryRuleProvidedRole() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleProvidedRole EOF )
            // InternalMyDsl.g:505:1: ruleProvidedRole EOF
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
    // InternalMyDsl.g:512:1: ruleProvidedRole : ( ( rule__ProvidedRole__Group__0 ) ) ;
    public final void ruleProvidedRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__ProvidedRole__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__ProvidedRole__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__ProvidedRole__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__ProvidedRole__Group__0 )
            {
             before(grammarAccess.getProvidedRoleAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__ProvidedRole__Group__0 )
            // InternalMyDsl.g:519:4: rule__ProvidedRole__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleCompositeComponent : ruleCompositeComponent EOF ;
    public final void entryRuleCompositeComponent() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleCompositeComponent EOF )
            // InternalMyDsl.g:530:1: ruleCompositeComponent EOF
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
    // InternalMyDsl.g:537:1: ruleCompositeComponent : ( ( rule__CompositeComponent__Group__0 ) ) ;
    public final void ruleCompositeComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__CompositeComponent__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__CompositeComponent__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__CompositeComponent__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__CompositeComponent__Group__0 )
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__CompositeComponent__Group__0 )
            // InternalMyDsl.g:544:4: rule__CompositeComponent__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleInternalAction : ruleInternalAction EOF ;
    public final void entryRuleInternalAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleInternalAction EOF )
            // InternalMyDsl.g:555:1: ruleInternalAction EOF
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
    // InternalMyDsl.g:562:1: ruleInternalAction : ( ( rule__InternalAction__Group__0 ) ) ;
    public final void ruleInternalAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__InternalAction__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__InternalAction__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__InternalAction__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__InternalAction__Group__0 )
            {
             before(grammarAccess.getInternalActionAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__InternalAction__Group__0 )
            // InternalMyDsl.g:569:4: rule__InternalAction__Group__0
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
    // InternalMyDsl.g:578:1: entryRuleExternalCall : ruleExternalCall EOF ;
    public final void entryRuleExternalCall() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleExternalCall EOF )
            // InternalMyDsl.g:580:1: ruleExternalCall EOF
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
    // InternalMyDsl.g:587:1: ruleExternalCall : ( ( rule__ExternalCall__Group__0 ) ) ;
    public final void ruleExternalCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__ExternalCall__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__ExternalCall__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__ExternalCall__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__ExternalCall__Group__0 )
            {
             before(grammarAccess.getExternalCallAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__ExternalCall__Group__0 )
            // InternalMyDsl.g:594:4: rule__ExternalCall__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleLoop EOF )
            // InternalMyDsl.g:605:1: ruleLoop EOF
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
    // InternalMyDsl.g:612:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Loop__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__Loop__Group__0 )
            // InternalMyDsl.g:619:4: rule__Loop__Group__0
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
    // InternalMyDsl.g:628:1: entryRuleBranch : ruleBranch EOF ;
    public final void entryRuleBranch() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleBranch EOF )
            // InternalMyDsl.g:630:1: ruleBranch EOF
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
    // InternalMyDsl.g:637:1: ruleBranch : ( ( rule__Branch__Group__0 ) ) ;
    public final void ruleBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Branch__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Branch__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Branch__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__Branch__Group__0 )
            {
             before(grammarAccess.getBranchAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__Branch__Group__0 )
            // InternalMyDsl.g:644:4: rule__Branch__Group__0
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


    // $ANTLR start "entryRuleDelegationConnector"
    // InternalMyDsl.g:653:1: entryRuleDelegationConnector : ruleDelegationConnector EOF ;
    public final void entryRuleDelegationConnector() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleDelegationConnector EOF )
            // InternalMyDsl.g:655:1: ruleDelegationConnector EOF
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
    // InternalMyDsl.g:662:1: ruleDelegationConnector : ( ( rule__DelegationConnector__Group__0 ) ) ;
    public final void ruleDelegationConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__DelegationConnector__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__DelegationConnector__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__DelegationConnector__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__DelegationConnector__Group__0 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__DelegationConnector__Group__0 )
            // InternalMyDsl.g:669:4: rule__DelegationConnector__Group__0
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
    // InternalMyDsl.g:678:1: entryRuleRole_Impl : ruleRole_Impl EOF ;
    public final void entryRuleRole_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleRole_Impl EOF )
            // InternalMyDsl.g:680:1: ruleRole_Impl EOF
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
    // InternalMyDsl.g:687:1: ruleRole_Impl : ( ( rule__Role_Impl__Group__0 ) ) ;
    public final void ruleRole_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__Role_Impl__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__Role_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__Role_Impl__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__Role_Impl__Group__0 )
            {
             before(grammarAccess.getRole_ImplAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__Role_Impl__Group__0 )
            // InternalMyDsl.g:694:4: rule__Role_Impl__Group__0
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


    // $ANTLR start "entryRuleContainer"
    // InternalMyDsl.g:703:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleContainer EOF )
            // InternalMyDsl.g:705:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalMyDsl.g:712:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__Container__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__Container__Group__0 )
            // InternalMyDsl.g:719:4: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:728:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleLink EOF )
            // InternalMyDsl.g:730:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalMyDsl.g:737:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__Link__Group__0 ) )
            // InternalMyDsl.g:743:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalMyDsl.g:744:3: ( rule__Link__Group__0 )
            // InternalMyDsl.g:744:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "rulesimpleTypes"
    // InternalMyDsl.g:753:1: rulesimpleTypes : ( ( rule__SimpleTypes__Alternatives ) ) ;
    public final void rulesimpleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:757:1: ( ( ( rule__SimpleTypes__Alternatives ) ) )
            // InternalMyDsl.g:758:2: ( ( rule__SimpleTypes__Alternatives ) )
            {
            // InternalMyDsl.g:758:2: ( ( rule__SimpleTypes__Alternatives ) )
            // InternalMyDsl.g:759:3: ( rule__SimpleTypes__Alternatives )
            {
             before(grammarAccess.getSimpleTypesAccess().getAlternatives()); 
            // InternalMyDsl.g:760:3: ( rule__SimpleTypes__Alternatives )
            // InternalMyDsl.g:760:4: rule__SimpleTypes__Alternatives
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:768:1: rule__Type__Alternatives : ( ( ruleType_Impl ) | ( ruleSimple ) | ( ruleComplex ) | ( ruleParameterType_Impl ) | ( ruleVoid ) | ( ruleReturnType_Impl ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:772:1: ( ( ruleType_Impl ) | ( ruleSimple ) | ( ruleComplex ) | ( ruleParameterType_Impl ) | ( ruleVoid ) | ( ruleReturnType_Impl ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt1=1;
                }
                break;
            case 45:
                {
                alt1=2;
                }
                break;
            case 47:
                {
                alt1=3;
                }
                break;
            case 44:
                {
                alt1=4;
                }
                break;
            case 49:
                {
                alt1=5;
                }
                break;
            case 43:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:773:2: ( ruleType_Impl )
                    {
                    // InternalMyDsl.g:773:2: ( ruleType_Impl )
                    // InternalMyDsl.g:774:3: ruleType_Impl
                    {
                     before(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType_Impl();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:779:2: ( ruleSimple )
                    {
                    // InternalMyDsl.g:779:2: ( ruleSimple )
                    // InternalMyDsl.g:780:3: ruleSimple
                    {
                     before(grammarAccess.getTypeAccess().getSimpleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimple();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:785:2: ( ruleComplex )
                    {
                    // InternalMyDsl.g:785:2: ( ruleComplex )
                    // InternalMyDsl.g:786:3: ruleComplex
                    {
                     before(grammarAccess.getTypeAccess().getComplexParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleComplex();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getComplexParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:791:2: ( ruleParameterType_Impl )
                    {
                    // InternalMyDsl.g:791:2: ( ruleParameterType_Impl )
                    // InternalMyDsl.g:792:3: ruleParameterType_Impl
                    {
                     before(grammarAccess.getTypeAccess().getParameterType_ImplParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterType_Impl();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getParameterType_ImplParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:797:2: ( ruleVoid )
                    {
                    // InternalMyDsl.g:797:2: ( ruleVoid )
                    // InternalMyDsl.g:798:3: ruleVoid
                    {
                     before(grammarAccess.getTypeAccess().getVoidParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVoid();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getVoidParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:803:2: ( ruleReturnType_Impl )
                    {
                    // InternalMyDsl.g:803:2: ( ruleReturnType_Impl )
                    // InternalMyDsl.g:804:3: ruleReturnType_Impl
                    {
                     before(grammarAccess.getTypeAccess().getReturnType_ImplParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleReturnType_Impl();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getReturnType_ImplParserRuleCall_5()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__BehaviourDescription__Alternatives"
    // InternalMyDsl.g:813:1: rule__BehaviourDescription__Alternatives : ( ( ruleBehaviourDescription_Impl ) | ( ruleInternalAction ) | ( ruleExternalCall ) | ( ruleLoop ) | ( ruleBranch ) );
    public final void rule__BehaviourDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:817:1: ( ( ruleBehaviourDescription_Impl ) | ( ruleInternalAction ) | ( ruleExternalCall ) | ( ruleLoop ) | ( ruleBranch ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt2=1;
                }
                break;
            case 60:
                {
                alt2=2;
                }
                break;
            case 61:
                {
                alt2=3;
                }
                break;
            case 62:
                {
                alt2=4;
                }
                break;
            case 63:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:818:2: ( ruleBehaviourDescription_Impl )
                    {
                    // InternalMyDsl.g:818:2: ( ruleBehaviourDescription_Impl )
                    // InternalMyDsl.g:819:3: ruleBehaviourDescription_Impl
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
                    // InternalMyDsl.g:824:2: ( ruleInternalAction )
                    {
                    // InternalMyDsl.g:824:2: ( ruleInternalAction )
                    // InternalMyDsl.g:825:3: ruleInternalAction
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
                    // InternalMyDsl.g:830:2: ( ruleExternalCall )
                    {
                    // InternalMyDsl.g:830:2: ( ruleExternalCall )
                    // InternalMyDsl.g:831:3: ruleExternalCall
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
                    // InternalMyDsl.g:836:2: ( ruleLoop )
                    {
                    // InternalMyDsl.g:836:2: ( ruleLoop )
                    // InternalMyDsl.g:837:3: ruleLoop
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
                    // InternalMyDsl.g:842:2: ( ruleBranch )
                    {
                    // InternalMyDsl.g:842:2: ( ruleBranch )
                    // InternalMyDsl.g:843:3: ruleBranch
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
    // InternalMyDsl.g:852:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:856:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:857:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:857:2: ( RULE_STRING )
                    // InternalMyDsl.g:858:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:863:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:863:2: ( RULE_ID )
                    // InternalMyDsl.g:864:3: RULE_ID
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
    // InternalMyDsl.g:873:1: rule__SimpleTypes__Alternatives : ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'double' ) ) | ( ( 'float' ) ) | ( ( 'list' ) ) | ( ( 'long' ) ) | ( ( 'map' ) ) | ( ( 'string' ) ) );
    public final void rule__SimpleTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:877:1: ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'double' ) ) | ( ( 'float' ) ) | ( ( 'list' ) ) | ( ( 'long' ) ) | ( ( 'map' ) ) | ( ( 'string' ) ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            case 17:
                {
                alt4=7;
                }
                break;
            case 18:
                {
                alt4=8;
                }
                break;
            case 19:
                {
                alt4=9;
                }
                break;
            case 20:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:878:2: ( ( 'int' ) )
                    {
                    // InternalMyDsl.g:878:2: ( ( 'int' ) )
                    // InternalMyDsl.g:879:3: ( 'int' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:880:3: ( 'int' )
                    // InternalMyDsl.g:880:4: 'int'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:884:2: ( ( 'boolean' ) )
                    {
                    // InternalMyDsl.g:884:2: ( ( 'boolean' ) )
                    // InternalMyDsl.g:885:3: ( 'boolean' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:886:3: ( 'boolean' )
                    // InternalMyDsl.g:886:4: 'boolean'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:890:2: ( ( 'char' ) )
                    {
                    // InternalMyDsl.g:890:2: ( ( 'char' ) )
                    // InternalMyDsl.g:891:3: ( 'char' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:892:3: ( 'char' )
                    // InternalMyDsl.g:892:4: 'char'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:896:2: ( ( 'date' ) )
                    {
                    // InternalMyDsl.g:896:2: ( ( 'date' ) )
                    // InternalMyDsl.g:897:3: ( 'date' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:898:3: ( 'date' )
                    // InternalMyDsl.g:898:4: 'date'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:902:2: ( ( 'double' ) )
                    {
                    // InternalMyDsl.g:902:2: ( ( 'double' ) )
                    // InternalMyDsl.g:903:3: ( 'double' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:904:3: ( 'double' )
                    // InternalMyDsl.g:904:4: 'double'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:908:2: ( ( 'float' ) )
                    {
                    // InternalMyDsl.g:908:2: ( ( 'float' ) )
                    // InternalMyDsl.g:909:3: ( 'float' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:910:3: ( 'float' )
                    // InternalMyDsl.g:910:4: 'float'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:914:2: ( ( 'list' ) )
                    {
                    // InternalMyDsl.g:914:2: ( ( 'list' ) )
                    // InternalMyDsl.g:915:3: ( 'list' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:916:3: ( 'list' )
                    // InternalMyDsl.g:916:4: 'list'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:920:2: ( ( 'long' ) )
                    {
                    // InternalMyDsl.g:920:2: ( ( 'long' ) )
                    // InternalMyDsl.g:921:3: ( 'long' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:922:3: ( 'long' )
                    // InternalMyDsl.g:922:4: 'long'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:926:2: ( ( 'map' ) )
                    {
                    // InternalMyDsl.g:926:2: ( ( 'map' ) )
                    // InternalMyDsl.g:927:3: ( 'map' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8()); 
                    // InternalMyDsl.g:928:3: ( 'map' )
                    // InternalMyDsl.g:928:4: 'map'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:932:2: ( ( 'string' ) )
                    {
                    // InternalMyDsl.g:932:2: ( ( 'string' ) )
                    // InternalMyDsl.g:933:3: ( 'string' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_9()); 
                    // InternalMyDsl.g:934:3: ( 'string' )
                    // InternalMyDsl.g:934:4: 'string'
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


    // $ANTLR start "rule__ComponentBasedSystem__Group__0"
    // InternalMyDsl.g:942:1: rule__ComponentBasedSystem__Group__0 : rule__ComponentBasedSystem__Group__0__Impl rule__ComponentBasedSystem__Group__1 ;
    public final void rule__ComponentBasedSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:946:1: ( rule__ComponentBasedSystem__Group__0__Impl rule__ComponentBasedSystem__Group__1 )
            // InternalMyDsl.g:947:2: rule__ComponentBasedSystem__Group__0__Impl rule__ComponentBasedSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentBasedSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group__0__Impl"
    // InternalMyDsl.g:954:1: rule__ComponentBasedSystem__Group__0__Impl : ( 'ComponentBasedSystem' ) ;
    public final void rule__ComponentBasedSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:958:1: ( ( 'ComponentBasedSystem' ) )
            // InternalMyDsl.g:959:1: ( 'ComponentBasedSystem' )
            {
            // InternalMyDsl.g:959:1: ( 'ComponentBasedSystem' )
            // InternalMyDsl.g:960:2: 'ComponentBasedSystem'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getComponentBasedSystemKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getComponentBasedSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__1"
    // InternalMyDsl.g:969:1: rule__ComponentBasedSystem__Group__1 : rule__ComponentBasedSystem__Group__1__Impl rule__ComponentBasedSystem__Group__2 ;
    public final void rule__ComponentBasedSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( rule__ComponentBasedSystem__Group__1__Impl rule__ComponentBasedSystem__Group__2 )
            // InternalMyDsl.g:974:2: rule__ComponentBasedSystem__Group__1__Impl rule__ComponentBasedSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComponentBasedSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group__1__Impl"
    // InternalMyDsl.g:981:1: rule__ComponentBasedSystem__Group__1__Impl : ( '{' ) ;
    public final void rule__ComponentBasedSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:985:1: ( ( '{' ) )
            // InternalMyDsl.g:986:1: ( '{' )
            {
            // InternalMyDsl.g:986:1: ( '{' )
            // InternalMyDsl.g:987:2: '{'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__2"
    // InternalMyDsl.g:996:1: rule__ComponentBasedSystem__Group__2 : rule__ComponentBasedSystem__Group__2__Impl rule__ComponentBasedSystem__Group__3 ;
    public final void rule__ComponentBasedSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( rule__ComponentBasedSystem__Group__2__Impl rule__ComponentBasedSystem__Group__3 )
            // InternalMyDsl.g:1001:2: rule__ComponentBasedSystem__Group__2__Impl rule__ComponentBasedSystem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ComponentBasedSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__2"


    // $ANTLR start "rule__ComponentBasedSystem__Group__2__Impl"
    // InternalMyDsl.g:1008:1: rule__ComponentBasedSystem__Group__2__Impl : ( 'interface' ) ;
    public final void rule__ComponentBasedSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1012:1: ( ( 'interface' ) )
            // InternalMyDsl.g:1013:1: ( 'interface' )
            {
            // InternalMyDsl.g:1013:1: ( 'interface' )
            // InternalMyDsl.g:1014:2: 'interface'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getInterfaceKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getInterfaceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__2__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__3"
    // InternalMyDsl.g:1023:1: rule__ComponentBasedSystem__Group__3 : rule__ComponentBasedSystem__Group__3__Impl rule__ComponentBasedSystem__Group__4 ;
    public final void rule__ComponentBasedSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1027:1: ( rule__ComponentBasedSystem__Group__3__Impl rule__ComponentBasedSystem__Group__4 )
            // InternalMyDsl.g:1028:2: rule__ComponentBasedSystem__Group__3__Impl rule__ComponentBasedSystem__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ComponentBasedSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__3"


    // $ANTLR start "rule__ComponentBasedSystem__Group__3__Impl"
    // InternalMyDsl.g:1035:1: rule__ComponentBasedSystem__Group__3__Impl : ( '(' ) ;
    public final void rule__ComponentBasedSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1039:1: ( ( '(' ) )
            // InternalMyDsl.g:1040:1: ( '(' )
            {
            // InternalMyDsl.g:1040:1: ( '(' )
            // InternalMyDsl.g:1041:2: '('
            {
             before(grammarAccess.getComponentBasedSystemAccess().getLeftParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__3__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__4"
    // InternalMyDsl.g:1050:1: rule__ComponentBasedSystem__Group__4 : rule__ComponentBasedSystem__Group__4__Impl rule__ComponentBasedSystem__Group__5 ;
    public final void rule__ComponentBasedSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1054:1: ( rule__ComponentBasedSystem__Group__4__Impl rule__ComponentBasedSystem__Group__5 )
            // InternalMyDsl.g:1055:2: rule__ComponentBasedSystem__Group__4__Impl rule__ComponentBasedSystem__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ComponentBasedSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__4"


    // $ANTLR start "rule__ComponentBasedSystem__Group__4__Impl"
    // InternalMyDsl.g:1062:1: rule__ComponentBasedSystem__Group__4__Impl : ( ( rule__ComponentBasedSystem__InterfaceAssignment_4 ) ) ;
    public final void rule__ComponentBasedSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:1: ( ( ( rule__ComponentBasedSystem__InterfaceAssignment_4 ) ) )
            // InternalMyDsl.g:1067:1: ( ( rule__ComponentBasedSystem__InterfaceAssignment_4 ) )
            {
            // InternalMyDsl.g:1067:1: ( ( rule__ComponentBasedSystem__InterfaceAssignment_4 ) )
            // InternalMyDsl.g:1068:2: ( rule__ComponentBasedSystem__InterfaceAssignment_4 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getInterfaceAssignment_4()); 
            // InternalMyDsl.g:1069:2: ( rule__ComponentBasedSystem__InterfaceAssignment_4 )
            // InternalMyDsl.g:1069:3: rule__ComponentBasedSystem__InterfaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__InterfaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getInterfaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__4__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__5"
    // InternalMyDsl.g:1077:1: rule__ComponentBasedSystem__Group__5 : rule__ComponentBasedSystem__Group__5__Impl rule__ComponentBasedSystem__Group__6 ;
    public final void rule__ComponentBasedSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1081:1: ( rule__ComponentBasedSystem__Group__5__Impl rule__ComponentBasedSystem__Group__6 )
            // InternalMyDsl.g:1082:2: rule__ComponentBasedSystem__Group__5__Impl rule__ComponentBasedSystem__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ComponentBasedSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__5"


    // $ANTLR start "rule__ComponentBasedSystem__Group__5__Impl"
    // InternalMyDsl.g:1089:1: rule__ComponentBasedSystem__Group__5__Impl : ( ( rule__ComponentBasedSystem__Group_5__0 )* ) ;
    public final void rule__ComponentBasedSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1093:1: ( ( ( rule__ComponentBasedSystem__Group_5__0 )* ) )
            // InternalMyDsl.g:1094:1: ( ( rule__ComponentBasedSystem__Group_5__0 )* )
            {
            // InternalMyDsl.g:1094:1: ( ( rule__ComponentBasedSystem__Group_5__0 )* )
            // InternalMyDsl.g:1095:2: ( rule__ComponentBasedSystem__Group_5__0 )*
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_5()); 
            // InternalMyDsl.g:1096:2: ( rule__ComponentBasedSystem__Group_5__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:1096:3: rule__ComponentBasedSystem__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComponentBasedSystem__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__5__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__6"
    // InternalMyDsl.g:1104:1: rule__ComponentBasedSystem__Group__6 : rule__ComponentBasedSystem__Group__6__Impl rule__ComponentBasedSystem__Group__7 ;
    public final void rule__ComponentBasedSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1108:1: ( rule__ComponentBasedSystem__Group__6__Impl rule__ComponentBasedSystem__Group__7 )
            // InternalMyDsl.g:1109:2: rule__ComponentBasedSystem__Group__6__Impl rule__ComponentBasedSystem__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__ComponentBasedSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__6"


    // $ANTLR start "rule__ComponentBasedSystem__Group__6__Impl"
    // InternalMyDsl.g:1116:1: rule__ComponentBasedSystem__Group__6__Impl : ( ')' ) ;
    public final void rule__ComponentBasedSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1120:1: ( ( ')' ) )
            // InternalMyDsl.g:1121:1: ( ')' )
            {
            // InternalMyDsl.g:1121:1: ( ')' )
            // InternalMyDsl.g:1122:2: ')'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getRightParenthesisKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__6__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__7"
    // InternalMyDsl.g:1131:1: rule__ComponentBasedSystem__Group__7 : rule__ComponentBasedSystem__Group__7__Impl rule__ComponentBasedSystem__Group__8 ;
    public final void rule__ComponentBasedSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1135:1: ( rule__ComponentBasedSystem__Group__7__Impl rule__ComponentBasedSystem__Group__8 )
            // InternalMyDsl.g:1136:2: rule__ComponentBasedSystem__Group__7__Impl rule__ComponentBasedSystem__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ComponentBasedSystem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__7"


    // $ANTLR start "rule__ComponentBasedSystem__Group__7__Impl"
    // InternalMyDsl.g:1143:1: rule__ComponentBasedSystem__Group__7__Impl : ( 'environment' ) ;
    public final void rule__ComponentBasedSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1147:1: ( ( 'environment' ) )
            // InternalMyDsl.g:1148:1: ( 'environment' )
            {
            // InternalMyDsl.g:1148:1: ( 'environment' )
            // InternalMyDsl.g:1149:2: 'environment'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getEnvironmentKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getEnvironmentKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__7__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__8"
    // InternalMyDsl.g:1158:1: rule__ComponentBasedSystem__Group__8 : rule__ComponentBasedSystem__Group__8__Impl rule__ComponentBasedSystem__Group__9 ;
    public final void rule__ComponentBasedSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( rule__ComponentBasedSystem__Group__8__Impl rule__ComponentBasedSystem__Group__9 )
            // InternalMyDsl.g:1163:2: rule__ComponentBasedSystem__Group__8__Impl rule__ComponentBasedSystem__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__ComponentBasedSystem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__8"


    // $ANTLR start "rule__ComponentBasedSystem__Group__8__Impl"
    // InternalMyDsl.g:1170:1: rule__ComponentBasedSystem__Group__8__Impl : ( ( rule__ComponentBasedSystem__EnvironmentAssignment_8 ) ) ;
    public final void rule__ComponentBasedSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1174:1: ( ( ( rule__ComponentBasedSystem__EnvironmentAssignment_8 ) ) )
            // InternalMyDsl.g:1175:1: ( ( rule__ComponentBasedSystem__EnvironmentAssignment_8 ) )
            {
            // InternalMyDsl.g:1175:1: ( ( rule__ComponentBasedSystem__EnvironmentAssignment_8 ) )
            // InternalMyDsl.g:1176:2: ( rule__ComponentBasedSystem__EnvironmentAssignment_8 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getEnvironmentAssignment_8()); 
            // InternalMyDsl.g:1177:2: ( rule__ComponentBasedSystem__EnvironmentAssignment_8 )
            // InternalMyDsl.g:1177:3: rule__ComponentBasedSystem__EnvironmentAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__EnvironmentAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getEnvironmentAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__8__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__9"
    // InternalMyDsl.g:1185:1: rule__ComponentBasedSystem__Group__9 : rule__ComponentBasedSystem__Group__9__Impl rule__ComponentBasedSystem__Group__10 ;
    public final void rule__ComponentBasedSystem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1189:1: ( rule__ComponentBasedSystem__Group__9__Impl rule__ComponentBasedSystem__Group__10 )
            // InternalMyDsl.g:1190:2: rule__ComponentBasedSystem__Group__9__Impl rule__ComponentBasedSystem__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__ComponentBasedSystem__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__9"


    // $ANTLR start "rule__ComponentBasedSystem__Group__9__Impl"
    // InternalMyDsl.g:1197:1: rule__ComponentBasedSystem__Group__9__Impl : ( ( rule__ComponentBasedSystem__Group_9__0 )? ) ;
    public final void rule__ComponentBasedSystem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1201:1: ( ( ( rule__ComponentBasedSystem__Group_9__0 )? ) )
            // InternalMyDsl.g:1202:1: ( ( rule__ComponentBasedSystem__Group_9__0 )? )
            {
            // InternalMyDsl.g:1202:1: ( ( rule__ComponentBasedSystem__Group_9__0 )? )
            // InternalMyDsl.g:1203:2: ( rule__ComponentBasedSystem__Group_9__0 )?
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_9()); 
            // InternalMyDsl.g:1204:2: ( rule__ComponentBasedSystem__Group_9__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1204:3: rule__ComponentBasedSystem__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentBasedSystem__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__9__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__10"
    // InternalMyDsl.g:1212:1: rule__ComponentBasedSystem__Group__10 : rule__ComponentBasedSystem__Group__10__Impl rule__ComponentBasedSystem__Group__11 ;
    public final void rule__ComponentBasedSystem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( rule__ComponentBasedSystem__Group__10__Impl rule__ComponentBasedSystem__Group__11 )
            // InternalMyDsl.g:1217:2: rule__ComponentBasedSystem__Group__10__Impl rule__ComponentBasedSystem__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__ComponentBasedSystem__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__10"


    // $ANTLR start "rule__ComponentBasedSystem__Group__10__Impl"
    // InternalMyDsl.g:1224:1: rule__ComponentBasedSystem__Group__10__Impl : ( ( rule__ComponentBasedSystem__Group_10__0 )? ) ;
    public final void rule__ComponentBasedSystem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1228:1: ( ( ( rule__ComponentBasedSystem__Group_10__0 )? ) )
            // InternalMyDsl.g:1229:1: ( ( rule__ComponentBasedSystem__Group_10__0 )? )
            {
            // InternalMyDsl.g:1229:1: ( ( rule__ComponentBasedSystem__Group_10__0 )? )
            // InternalMyDsl.g:1230:2: ( rule__ComponentBasedSystem__Group_10__0 )?
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_10()); 
            // InternalMyDsl.g:1231:2: ( rule__ComponentBasedSystem__Group_10__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1231:3: rule__ComponentBasedSystem__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentBasedSystem__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__10__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__11"
    // InternalMyDsl.g:1239:1: rule__ComponentBasedSystem__Group__11 : rule__ComponentBasedSystem__Group__11__Impl rule__ComponentBasedSystem__Group__12 ;
    public final void rule__ComponentBasedSystem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1243:1: ( rule__ComponentBasedSystem__Group__11__Impl rule__ComponentBasedSystem__Group__12 )
            // InternalMyDsl.g:1244:2: rule__ComponentBasedSystem__Group__11__Impl rule__ComponentBasedSystem__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__ComponentBasedSystem__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__11"


    // $ANTLR start "rule__ComponentBasedSystem__Group__11__Impl"
    // InternalMyDsl.g:1251:1: rule__ComponentBasedSystem__Group__11__Impl : ( ( rule__ComponentBasedSystem__Group_11__0 )? ) ;
    public final void rule__ComponentBasedSystem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1255:1: ( ( ( rule__ComponentBasedSystem__Group_11__0 )? ) )
            // InternalMyDsl.g:1256:1: ( ( rule__ComponentBasedSystem__Group_11__0 )? )
            {
            // InternalMyDsl.g:1256:1: ( ( rule__ComponentBasedSystem__Group_11__0 )? )
            // InternalMyDsl.g:1257:2: ( rule__ComponentBasedSystem__Group_11__0 )?
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_11()); 
            // InternalMyDsl.g:1258:2: ( rule__ComponentBasedSystem__Group_11__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1258:3: rule__ComponentBasedSystem__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentBasedSystem__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__11__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__12"
    // InternalMyDsl.g:1266:1: rule__ComponentBasedSystem__Group__12 : rule__ComponentBasedSystem__Group__12__Impl ;
    public final void rule__ComponentBasedSystem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( rule__ComponentBasedSystem__Group__12__Impl )
            // InternalMyDsl.g:1271:2: rule__ComponentBasedSystem__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__12"


    // $ANTLR start "rule__ComponentBasedSystem__Group__12__Impl"
    // InternalMyDsl.g:1277:1: rule__ComponentBasedSystem__Group__12__Impl : ( '}' ) ;
    public final void rule__ComponentBasedSystem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1281:1: ( ( '}' ) )
            // InternalMyDsl.g:1282:1: ( '}' )
            {
            // InternalMyDsl.g:1282:1: ( '}' )
            // InternalMyDsl.g:1283:2: '}'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_12()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__12__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_5__0"
    // InternalMyDsl.g:1293:1: rule__ComponentBasedSystem__Group_5__0 : rule__ComponentBasedSystem__Group_5__0__Impl rule__ComponentBasedSystem__Group_5__1 ;
    public final void rule__ComponentBasedSystem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1297:1: ( rule__ComponentBasedSystem__Group_5__0__Impl rule__ComponentBasedSystem__Group_5__1 )
            // InternalMyDsl.g:1298:2: rule__ComponentBasedSystem__Group_5__0__Impl rule__ComponentBasedSystem__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__ComponentBasedSystem__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_5__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_5__0__Impl"
    // InternalMyDsl.g:1305:1: rule__ComponentBasedSystem__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ComponentBasedSystem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1309:1: ( ( ',' ) )
            // InternalMyDsl.g:1310:1: ( ',' )
            {
            // InternalMyDsl.g:1310:1: ( ',' )
            // InternalMyDsl.g:1311:2: ','
            {
             before(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_5__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_5__1"
    // InternalMyDsl.g:1320:1: rule__ComponentBasedSystem__Group_5__1 : rule__ComponentBasedSystem__Group_5__1__Impl ;
    public final void rule__ComponentBasedSystem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1324:1: ( rule__ComponentBasedSystem__Group_5__1__Impl )
            // InternalMyDsl.g:1325:2: rule__ComponentBasedSystem__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_5__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_5__1__Impl"
    // InternalMyDsl.g:1331:1: rule__ComponentBasedSystem__Group_5__1__Impl : ( ( rule__ComponentBasedSystem__InterfaceAssignment_5_1 ) ) ;
    public final void rule__ComponentBasedSystem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1335:1: ( ( ( rule__ComponentBasedSystem__InterfaceAssignment_5_1 ) ) )
            // InternalMyDsl.g:1336:1: ( ( rule__ComponentBasedSystem__InterfaceAssignment_5_1 ) )
            {
            // InternalMyDsl.g:1336:1: ( ( rule__ComponentBasedSystem__InterfaceAssignment_5_1 ) )
            // InternalMyDsl.g:1337:2: ( rule__ComponentBasedSystem__InterfaceAssignment_5_1 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getInterfaceAssignment_5_1()); 
            // InternalMyDsl.g:1338:2: ( rule__ComponentBasedSystem__InterfaceAssignment_5_1 )
            // InternalMyDsl.g:1338:3: rule__ComponentBasedSystem__InterfaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__InterfaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getInterfaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_5__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9__0"
    // InternalMyDsl.g:1347:1: rule__ComponentBasedSystem__Group_9__0 : rule__ComponentBasedSystem__Group_9__0__Impl rule__ComponentBasedSystem__Group_9__1 ;
    public final void rule__ComponentBasedSystem__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1351:1: ( rule__ComponentBasedSystem__Group_9__0__Impl rule__ComponentBasedSystem__Group_9__1 )
            // InternalMyDsl.g:1352:2: rule__ComponentBasedSystem__Group_9__0__Impl rule__ComponentBasedSystem__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentBasedSystem__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9__0__Impl"
    // InternalMyDsl.g:1359:1: rule__ComponentBasedSystem__Group_9__0__Impl : ( 'assemblycontext' ) ;
    public final void rule__ComponentBasedSystem__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( ( 'assemblycontext' ) )
            // InternalMyDsl.g:1364:1: ( 'assemblycontext' )
            {
            // InternalMyDsl.g:1364:1: ( 'assemblycontext' )
            // InternalMyDsl.g:1365:2: 'assemblycontext'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextKeyword_9_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9__1"
    // InternalMyDsl.g:1374:1: rule__ComponentBasedSystem__Group_9__1 : rule__ComponentBasedSystem__Group_9__1__Impl rule__ComponentBasedSystem__Group_9__2 ;
    public final void rule__ComponentBasedSystem__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( rule__ComponentBasedSystem__Group_9__1__Impl rule__ComponentBasedSystem__Group_9__2 )
            // InternalMyDsl.g:1379:2: rule__ComponentBasedSystem__Group_9__1__Impl rule__ComponentBasedSystem__Group_9__2
            {
            pushFollow(FOLLOW_11);
            rule__ComponentBasedSystem__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9__1__Impl"
    // InternalMyDsl.g:1386:1: rule__ComponentBasedSystem__Group_9__1__Impl : ( '{' ) ;
    public final void rule__ComponentBasedSystem__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1390:1: ( ( '{' ) )
            // InternalMyDsl.g:1391:1: ( '{' )
            {
            // InternalMyDsl.g:1391:1: ( '{' )
            // InternalMyDsl.g:1392:2: '{'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9__2"
    // InternalMyDsl.g:1401:1: rule__ComponentBasedSystem__Group_9__2 : rule__ComponentBasedSystem__Group_9__2__Impl rule__ComponentBasedSystem__Group_9__3 ;
    public final void rule__ComponentBasedSystem__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1405:1: ( rule__ComponentBasedSystem__Group_9__2__Impl rule__ComponentBasedSystem__Group_9__3 )
            // InternalMyDsl.g:1406:2: rule__ComponentBasedSystem__Group_9__2__Impl rule__ComponentBasedSystem__Group_9__3
            {
            pushFollow(FOLLOW_12);
            rule__ComponentBasedSystem__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9__2"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9__2__Impl"
    // InternalMyDsl.g:1413:1: rule__ComponentBasedSystem__Group_9__2__Impl : ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_9_2 ) ) ;
    public final void rule__ComponentBasedSystem__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1417:1: ( ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_9_2 ) ) )
            // InternalMyDsl.g:1418:1: ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_9_2 ) )
            {
            // InternalMyDsl.g:1418:1: ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_9_2 ) )
            // InternalMyDsl.g:1419:2: ( rule__ComponentBasedSystem__AssemblycontextAssignment_9_2 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssignment_9_2()); 
            // InternalMyDsl.g:1420:2: ( rule__ComponentBasedSystem__AssemblycontextAssignment_9_2 )
            // InternalMyDsl.g:1420:3: rule__ComponentBasedSystem__AssemblycontextAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__AssemblycontextAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9__2__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9__3"
    // InternalMyDsl.g:1428:1: rule__ComponentBasedSystem__Group_9__3 : rule__ComponentBasedSystem__Group_9__3__Impl rule__ComponentBasedSystem__Group_9__4 ;
    public final void rule__ComponentBasedSystem__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1432:1: ( rule__ComponentBasedSystem__Group_9__3__Impl rule__ComponentBasedSystem__Group_9__4 )
            // InternalMyDsl.g:1433:2: rule__ComponentBasedSystem__Group_9__3__Impl rule__ComponentBasedSystem__Group_9__4
            {
            pushFollow(FOLLOW_12);
            rule__ComponentBasedSystem__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9__3"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9__3__Impl"
    // InternalMyDsl.g:1440:1: rule__ComponentBasedSystem__Group_9__3__Impl : ( ( rule__ComponentBasedSystem__Group_9_3__0 )* ) ;
    public final void rule__ComponentBasedSystem__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1444:1: ( ( ( rule__ComponentBasedSystem__Group_9_3__0 )* ) )
            // InternalMyDsl.g:1445:1: ( ( rule__ComponentBasedSystem__Group_9_3__0 )* )
            {
            // InternalMyDsl.g:1445:1: ( ( rule__ComponentBasedSystem__Group_9_3__0 )* )
            // InternalMyDsl.g:1446:2: ( rule__ComponentBasedSystem__Group_9_3__0 )*
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_9_3()); 
            // InternalMyDsl.g:1447:2: ( rule__ComponentBasedSystem__Group_9_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1447:3: rule__ComponentBasedSystem__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComponentBasedSystem__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9__3__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9__4"
    // InternalMyDsl.g:1455:1: rule__ComponentBasedSystem__Group_9__4 : rule__ComponentBasedSystem__Group_9__4__Impl ;
    public final void rule__ComponentBasedSystem__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1459:1: ( rule__ComponentBasedSystem__Group_9__4__Impl )
            // InternalMyDsl.g:1460:2: rule__ComponentBasedSystem__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9__4"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9__4__Impl"
    // InternalMyDsl.g:1466:1: rule__ComponentBasedSystem__Group_9__4__Impl : ( '}' ) ;
    public final void rule__ComponentBasedSystem__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1470:1: ( ( '}' ) )
            // InternalMyDsl.g:1471:1: ( '}' )
            {
            // InternalMyDsl.g:1471:1: ( '}' )
            // InternalMyDsl.g:1472:2: '}'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9__4__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9_3__0"
    // InternalMyDsl.g:1482:1: rule__ComponentBasedSystem__Group_9_3__0 : rule__ComponentBasedSystem__Group_9_3__0__Impl rule__ComponentBasedSystem__Group_9_3__1 ;
    public final void rule__ComponentBasedSystem__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1486:1: ( rule__ComponentBasedSystem__Group_9_3__0__Impl rule__ComponentBasedSystem__Group_9_3__1 )
            // InternalMyDsl.g:1487:2: rule__ComponentBasedSystem__Group_9_3__0__Impl rule__ComponentBasedSystem__Group_9_3__1
            {
            pushFollow(FOLLOW_11);
            rule__ComponentBasedSystem__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9_3__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9_3__0__Impl"
    // InternalMyDsl.g:1494:1: rule__ComponentBasedSystem__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentBasedSystem__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1498:1: ( ( ',' ) )
            // InternalMyDsl.g:1499:1: ( ',' )
            {
            // InternalMyDsl.g:1499:1: ( ',' )
            // InternalMyDsl.g:1500:2: ','
            {
             before(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_9_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9_3__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9_3__1"
    // InternalMyDsl.g:1509:1: rule__ComponentBasedSystem__Group_9_3__1 : rule__ComponentBasedSystem__Group_9_3__1__Impl ;
    public final void rule__ComponentBasedSystem__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1513:1: ( rule__ComponentBasedSystem__Group_9_3__1__Impl )
            // InternalMyDsl.g:1514:2: rule__ComponentBasedSystem__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9_3__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9_3__1__Impl"
    // InternalMyDsl.g:1520:1: rule__ComponentBasedSystem__Group_9_3__1__Impl : ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_9_3_1 ) ) ;
    public final void rule__ComponentBasedSystem__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1524:1: ( ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_9_3_1 ) ) )
            // InternalMyDsl.g:1525:1: ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_9_3_1 ) )
            {
            // InternalMyDsl.g:1525:1: ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_9_3_1 ) )
            // InternalMyDsl.g:1526:2: ( rule__ComponentBasedSystem__AssemblycontextAssignment_9_3_1 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssignment_9_3_1()); 
            // InternalMyDsl.g:1527:2: ( rule__ComponentBasedSystem__AssemblycontextAssignment_9_3_1 )
            // InternalMyDsl.g:1527:3: rule__ComponentBasedSystem__AssemblycontextAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__AssemblycontextAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9_3__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10__0"
    // InternalMyDsl.g:1536:1: rule__ComponentBasedSystem__Group_10__0 : rule__ComponentBasedSystem__Group_10__0__Impl rule__ComponentBasedSystem__Group_10__1 ;
    public final void rule__ComponentBasedSystem__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1540:1: ( rule__ComponentBasedSystem__Group_10__0__Impl rule__ComponentBasedSystem__Group_10__1 )
            // InternalMyDsl.g:1541:2: rule__ComponentBasedSystem__Group_10__0__Impl rule__ComponentBasedSystem__Group_10__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentBasedSystem__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10__0__Impl"
    // InternalMyDsl.g:1548:1: rule__ComponentBasedSystem__Group_10__0__Impl : ( 'type' ) ;
    public final void rule__ComponentBasedSystem__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1552:1: ( ( 'type' ) )
            // InternalMyDsl.g:1553:1: ( 'type' )
            {
            // InternalMyDsl.g:1553:1: ( 'type' )
            // InternalMyDsl.g:1554:2: 'type'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getTypeKeyword_10_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getTypeKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10__1"
    // InternalMyDsl.g:1563:1: rule__ComponentBasedSystem__Group_10__1 : rule__ComponentBasedSystem__Group_10__1__Impl rule__ComponentBasedSystem__Group_10__2 ;
    public final void rule__ComponentBasedSystem__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1567:1: ( rule__ComponentBasedSystem__Group_10__1__Impl rule__ComponentBasedSystem__Group_10__2 )
            // InternalMyDsl.g:1568:2: rule__ComponentBasedSystem__Group_10__1__Impl rule__ComponentBasedSystem__Group_10__2
            {
            pushFollow(FOLLOW_13);
            rule__ComponentBasedSystem__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10__1__Impl"
    // InternalMyDsl.g:1575:1: rule__ComponentBasedSystem__Group_10__1__Impl : ( '{' ) ;
    public final void rule__ComponentBasedSystem__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1579:1: ( ( '{' ) )
            // InternalMyDsl.g:1580:1: ( '{' )
            {
            // InternalMyDsl.g:1580:1: ( '{' )
            // InternalMyDsl.g:1581:2: '{'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10__2"
    // InternalMyDsl.g:1590:1: rule__ComponentBasedSystem__Group_10__2 : rule__ComponentBasedSystem__Group_10__2__Impl rule__ComponentBasedSystem__Group_10__3 ;
    public final void rule__ComponentBasedSystem__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1594:1: ( rule__ComponentBasedSystem__Group_10__2__Impl rule__ComponentBasedSystem__Group_10__3 )
            // InternalMyDsl.g:1595:2: rule__ComponentBasedSystem__Group_10__2__Impl rule__ComponentBasedSystem__Group_10__3
            {
            pushFollow(FOLLOW_12);
            rule__ComponentBasedSystem__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10__2"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10__2__Impl"
    // InternalMyDsl.g:1602:1: rule__ComponentBasedSystem__Group_10__2__Impl : ( ( rule__ComponentBasedSystem__TypeAssignment_10_2 ) ) ;
    public final void rule__ComponentBasedSystem__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1606:1: ( ( ( rule__ComponentBasedSystem__TypeAssignment_10_2 ) ) )
            // InternalMyDsl.g:1607:1: ( ( rule__ComponentBasedSystem__TypeAssignment_10_2 ) )
            {
            // InternalMyDsl.g:1607:1: ( ( rule__ComponentBasedSystem__TypeAssignment_10_2 ) )
            // InternalMyDsl.g:1608:2: ( rule__ComponentBasedSystem__TypeAssignment_10_2 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getTypeAssignment_10_2()); 
            // InternalMyDsl.g:1609:2: ( rule__ComponentBasedSystem__TypeAssignment_10_2 )
            // InternalMyDsl.g:1609:3: rule__ComponentBasedSystem__TypeAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__TypeAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getTypeAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10__2__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10__3"
    // InternalMyDsl.g:1617:1: rule__ComponentBasedSystem__Group_10__3 : rule__ComponentBasedSystem__Group_10__3__Impl rule__ComponentBasedSystem__Group_10__4 ;
    public final void rule__ComponentBasedSystem__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1621:1: ( rule__ComponentBasedSystem__Group_10__3__Impl rule__ComponentBasedSystem__Group_10__4 )
            // InternalMyDsl.g:1622:2: rule__ComponentBasedSystem__Group_10__3__Impl rule__ComponentBasedSystem__Group_10__4
            {
            pushFollow(FOLLOW_12);
            rule__ComponentBasedSystem__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10__3"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10__3__Impl"
    // InternalMyDsl.g:1629:1: rule__ComponentBasedSystem__Group_10__3__Impl : ( ( rule__ComponentBasedSystem__Group_10_3__0 )* ) ;
    public final void rule__ComponentBasedSystem__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1633:1: ( ( ( rule__ComponentBasedSystem__Group_10_3__0 )* ) )
            // InternalMyDsl.g:1634:1: ( ( rule__ComponentBasedSystem__Group_10_3__0 )* )
            {
            // InternalMyDsl.g:1634:1: ( ( rule__ComponentBasedSystem__Group_10_3__0 )* )
            // InternalMyDsl.g:1635:2: ( rule__ComponentBasedSystem__Group_10_3__0 )*
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_10_3()); 
            // InternalMyDsl.g:1636:2: ( rule__ComponentBasedSystem__Group_10_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1636:3: rule__ComponentBasedSystem__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComponentBasedSystem__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10__3__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10__4"
    // InternalMyDsl.g:1644:1: rule__ComponentBasedSystem__Group_10__4 : rule__ComponentBasedSystem__Group_10__4__Impl ;
    public final void rule__ComponentBasedSystem__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1648:1: ( rule__ComponentBasedSystem__Group_10__4__Impl )
            // InternalMyDsl.g:1649:2: rule__ComponentBasedSystem__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10__4"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10__4__Impl"
    // InternalMyDsl.g:1655:1: rule__ComponentBasedSystem__Group_10__4__Impl : ( '}' ) ;
    public final void rule__ComponentBasedSystem__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1659:1: ( ( '}' ) )
            // InternalMyDsl.g:1660:1: ( '}' )
            {
            // InternalMyDsl.g:1660:1: ( '}' )
            // InternalMyDsl.g:1661:2: '}'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10__4__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10_3__0"
    // InternalMyDsl.g:1671:1: rule__ComponentBasedSystem__Group_10_3__0 : rule__ComponentBasedSystem__Group_10_3__0__Impl rule__ComponentBasedSystem__Group_10_3__1 ;
    public final void rule__ComponentBasedSystem__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1675:1: ( rule__ComponentBasedSystem__Group_10_3__0__Impl rule__ComponentBasedSystem__Group_10_3__1 )
            // InternalMyDsl.g:1676:2: rule__ComponentBasedSystem__Group_10_3__0__Impl rule__ComponentBasedSystem__Group_10_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ComponentBasedSystem__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10_3__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10_3__0__Impl"
    // InternalMyDsl.g:1683:1: rule__ComponentBasedSystem__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentBasedSystem__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1687:1: ( ( ',' ) )
            // InternalMyDsl.g:1688:1: ( ',' )
            {
            // InternalMyDsl.g:1688:1: ( ',' )
            // InternalMyDsl.g:1689:2: ','
            {
             before(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_10_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10_3__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10_3__1"
    // InternalMyDsl.g:1698:1: rule__ComponentBasedSystem__Group_10_3__1 : rule__ComponentBasedSystem__Group_10_3__1__Impl ;
    public final void rule__ComponentBasedSystem__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1702:1: ( rule__ComponentBasedSystem__Group_10_3__1__Impl )
            // InternalMyDsl.g:1703:2: rule__ComponentBasedSystem__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10_3__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10_3__1__Impl"
    // InternalMyDsl.g:1709:1: rule__ComponentBasedSystem__Group_10_3__1__Impl : ( ( rule__ComponentBasedSystem__TypeAssignment_10_3_1 ) ) ;
    public final void rule__ComponentBasedSystem__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1713:1: ( ( ( rule__ComponentBasedSystem__TypeAssignment_10_3_1 ) ) )
            // InternalMyDsl.g:1714:1: ( ( rule__ComponentBasedSystem__TypeAssignment_10_3_1 ) )
            {
            // InternalMyDsl.g:1714:1: ( ( rule__ComponentBasedSystem__TypeAssignment_10_3_1 ) )
            // InternalMyDsl.g:1715:2: ( rule__ComponentBasedSystem__TypeAssignment_10_3_1 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getTypeAssignment_10_3_1()); 
            // InternalMyDsl.g:1716:2: ( rule__ComponentBasedSystem__TypeAssignment_10_3_1 )
            // InternalMyDsl.g:1716:3: rule__ComponentBasedSystem__TypeAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__TypeAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getTypeAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10_3__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__0"
    // InternalMyDsl.g:1725:1: rule__ComponentBasedSystem__Group_11__0 : rule__ComponentBasedSystem__Group_11__0__Impl rule__ComponentBasedSystem__Group_11__1 ;
    public final void rule__ComponentBasedSystem__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1729:1: ( rule__ComponentBasedSystem__Group_11__0__Impl rule__ComponentBasedSystem__Group_11__1 )
            // InternalMyDsl.g:1730:2: rule__ComponentBasedSystem__Group_11__0__Impl rule__ComponentBasedSystem__Group_11__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentBasedSystem__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__0__Impl"
    // InternalMyDsl.g:1737:1: rule__ComponentBasedSystem__Group_11__0__Impl : ( 'assemblyconnector' ) ;
    public final void rule__ComponentBasedSystem__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1741:1: ( ( 'assemblyconnector' ) )
            // InternalMyDsl.g:1742:1: ( 'assemblyconnector' )
            {
            // InternalMyDsl.g:1742:1: ( 'assemblyconnector' )
            // InternalMyDsl.g:1743:2: 'assemblyconnector'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorKeyword_11_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__1"
    // InternalMyDsl.g:1752:1: rule__ComponentBasedSystem__Group_11__1 : rule__ComponentBasedSystem__Group_11__1__Impl rule__ComponentBasedSystem__Group_11__2 ;
    public final void rule__ComponentBasedSystem__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1756:1: ( rule__ComponentBasedSystem__Group_11__1__Impl rule__ComponentBasedSystem__Group_11__2 )
            // InternalMyDsl.g:1757:2: rule__ComponentBasedSystem__Group_11__1__Impl rule__ComponentBasedSystem__Group_11__2
            {
            pushFollow(FOLLOW_14);
            rule__ComponentBasedSystem__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__1__Impl"
    // InternalMyDsl.g:1764:1: rule__ComponentBasedSystem__Group_11__1__Impl : ( '{' ) ;
    public final void rule__ComponentBasedSystem__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1768:1: ( ( '{' ) )
            // InternalMyDsl.g:1769:1: ( '{' )
            {
            // InternalMyDsl.g:1769:1: ( '{' )
            // InternalMyDsl.g:1770:2: '{'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__2"
    // InternalMyDsl.g:1779:1: rule__ComponentBasedSystem__Group_11__2 : rule__ComponentBasedSystem__Group_11__2__Impl rule__ComponentBasedSystem__Group_11__3 ;
    public final void rule__ComponentBasedSystem__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1783:1: ( rule__ComponentBasedSystem__Group_11__2__Impl rule__ComponentBasedSystem__Group_11__3 )
            // InternalMyDsl.g:1784:2: rule__ComponentBasedSystem__Group_11__2__Impl rule__ComponentBasedSystem__Group_11__3
            {
            pushFollow(FOLLOW_12);
            rule__ComponentBasedSystem__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__2"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__2__Impl"
    // InternalMyDsl.g:1791:1: rule__ComponentBasedSystem__Group_11__2__Impl : ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_2 ) ) ;
    public final void rule__ComponentBasedSystem__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1795:1: ( ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_2 ) ) )
            // InternalMyDsl.g:1796:1: ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_2 ) )
            {
            // InternalMyDsl.g:1796:1: ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_2 ) )
            // InternalMyDsl.g:1797:2: ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_2 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssignment_11_2()); 
            // InternalMyDsl.g:1798:2: ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_2 )
            // InternalMyDsl.g:1798:3: rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__2__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__3"
    // InternalMyDsl.g:1806:1: rule__ComponentBasedSystem__Group_11__3 : rule__ComponentBasedSystem__Group_11__3__Impl rule__ComponentBasedSystem__Group_11__4 ;
    public final void rule__ComponentBasedSystem__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1810:1: ( rule__ComponentBasedSystem__Group_11__3__Impl rule__ComponentBasedSystem__Group_11__4 )
            // InternalMyDsl.g:1811:2: rule__ComponentBasedSystem__Group_11__3__Impl rule__ComponentBasedSystem__Group_11__4
            {
            pushFollow(FOLLOW_12);
            rule__ComponentBasedSystem__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__3"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__3__Impl"
    // InternalMyDsl.g:1818:1: rule__ComponentBasedSystem__Group_11__3__Impl : ( ( rule__ComponentBasedSystem__Group_11_3__0 )* ) ;
    public final void rule__ComponentBasedSystem__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1822:1: ( ( ( rule__ComponentBasedSystem__Group_11_3__0 )* ) )
            // InternalMyDsl.g:1823:1: ( ( rule__ComponentBasedSystem__Group_11_3__0 )* )
            {
            // InternalMyDsl.g:1823:1: ( ( rule__ComponentBasedSystem__Group_11_3__0 )* )
            // InternalMyDsl.g:1824:2: ( rule__ComponentBasedSystem__Group_11_3__0 )*
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_11_3()); 
            // InternalMyDsl.g:1825:2: ( rule__ComponentBasedSystem__Group_11_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1825:3: rule__ComponentBasedSystem__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComponentBasedSystem__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__3__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__4"
    // InternalMyDsl.g:1833:1: rule__ComponentBasedSystem__Group_11__4 : rule__ComponentBasedSystem__Group_11__4__Impl ;
    public final void rule__ComponentBasedSystem__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1837:1: ( rule__ComponentBasedSystem__Group_11__4__Impl )
            // InternalMyDsl.g:1838:2: rule__ComponentBasedSystem__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__4"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__4__Impl"
    // InternalMyDsl.g:1844:1: rule__ComponentBasedSystem__Group_11__4__Impl : ( '}' ) ;
    public final void rule__ComponentBasedSystem__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1848:1: ( ( '}' ) )
            // InternalMyDsl.g:1849:1: ( '}' )
            {
            // InternalMyDsl.g:1849:1: ( '}' )
            // InternalMyDsl.g:1850:2: '}'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__4__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11_3__0"
    // InternalMyDsl.g:1860:1: rule__ComponentBasedSystem__Group_11_3__0 : rule__ComponentBasedSystem__Group_11_3__0__Impl rule__ComponentBasedSystem__Group_11_3__1 ;
    public final void rule__ComponentBasedSystem__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1864:1: ( rule__ComponentBasedSystem__Group_11_3__0__Impl rule__ComponentBasedSystem__Group_11_3__1 )
            // InternalMyDsl.g:1865:2: rule__ComponentBasedSystem__Group_11_3__0__Impl rule__ComponentBasedSystem__Group_11_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ComponentBasedSystem__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_11_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11_3__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11_3__0__Impl"
    // InternalMyDsl.g:1872:1: rule__ComponentBasedSystem__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentBasedSystem__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1876:1: ( ( ',' ) )
            // InternalMyDsl.g:1877:1: ( ',' )
            {
            // InternalMyDsl.g:1877:1: ( ',' )
            // InternalMyDsl.g:1878:2: ','
            {
             before(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_11_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11_3__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11_3__1"
    // InternalMyDsl.g:1887:1: rule__ComponentBasedSystem__Group_11_3__1 : rule__ComponentBasedSystem__Group_11_3__1__Impl ;
    public final void rule__ComponentBasedSystem__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1891:1: ( rule__ComponentBasedSystem__Group_11_3__1__Impl )
            // InternalMyDsl.g:1892:2: rule__ComponentBasedSystem__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_11_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11_3__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11_3__1__Impl"
    // InternalMyDsl.g:1898:1: rule__ComponentBasedSystem__Group_11_3__1__Impl : ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_3_1 ) ) ;
    public final void rule__ComponentBasedSystem__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1902:1: ( ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_3_1 ) ) )
            // InternalMyDsl.g:1903:1: ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_3_1 ) )
            {
            // InternalMyDsl.g:1903:1: ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_3_1 ) )
            // InternalMyDsl.g:1904:2: ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_3_1 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssignment_11_3_1()); 
            // InternalMyDsl.g:1905:2: ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_3_1 )
            // InternalMyDsl.g:1905:3: rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11_3__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__0"
    // InternalMyDsl.g:1914:1: rule__AssemblyContext__Group__0 : rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 ;
    public final void rule__AssemblyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1918:1: ( rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 )
            // InternalMyDsl.g:1919:2: rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1926:1: rule__AssemblyContext__Group__0__Impl : ( 'AssemblyContext' ) ;
    public final void rule__AssemblyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1930:1: ( ( 'AssemblyContext' ) )
            // InternalMyDsl.g:1931:1: ( 'AssemblyContext' )
            {
            // InternalMyDsl.g:1931:1: ( 'AssemblyContext' )
            // InternalMyDsl.g:1932:2: 'AssemblyContext'
            {
             before(grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:1941:1: rule__AssemblyContext__Group__1 : rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 ;
    public final void rule__AssemblyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1945:1: ( rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 )
            // InternalMyDsl.g:1946:2: rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2
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
    // InternalMyDsl.g:1953:1: rule__AssemblyContext__Group__1__Impl : ( ( rule__AssemblyContext__NameAssignment_1 ) ) ;
    public final void rule__AssemblyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1957:1: ( ( ( rule__AssemblyContext__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1958:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1958:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            // InternalMyDsl.g:1959:2: ( rule__AssemblyContext__NameAssignment_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1960:2: ( rule__AssemblyContext__NameAssignment_1 )
            // InternalMyDsl.g:1960:3: rule__AssemblyContext__NameAssignment_1
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
    // InternalMyDsl.g:1968:1: rule__AssemblyContext__Group__2 : rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 ;
    public final void rule__AssemblyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1972:1: ( rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 )
            // InternalMyDsl.g:1973:2: rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1980:1: rule__AssemblyContext__Group__2__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1984:1: ( ( '{' ) )
            // InternalMyDsl.g:1985:1: ( '{' )
            {
            // InternalMyDsl.g:1985:1: ( '{' )
            // InternalMyDsl.g:1986:2: '{'
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
    // InternalMyDsl.g:1995:1: rule__AssemblyContext__Group__3 : rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 ;
    public final void rule__AssemblyContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1999:1: ( rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 )
            // InternalMyDsl.g:2000:2: rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2007:1: rule__AssemblyContext__Group__3__Impl : ( 'component' ) ;
    public final void rule__AssemblyContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2011:1: ( ( 'component' ) )
            // InternalMyDsl.g:2012:1: ( 'component' )
            {
            // InternalMyDsl.g:2012:1: ( 'component' )
            // InternalMyDsl.g:2013:2: 'component'
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2022:1: rule__AssemblyContext__Group__4 : rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 ;
    public final void rule__AssemblyContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2026:1: ( rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 )
            // InternalMyDsl.g:2027:2: rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2034:1: rule__AssemblyContext__Group__4__Impl : ( ( rule__AssemblyContext__ComponentAssignment_4 ) ) ;
    public final void rule__AssemblyContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2038:1: ( ( ( rule__AssemblyContext__ComponentAssignment_4 ) ) )
            // InternalMyDsl.g:2039:1: ( ( rule__AssemblyContext__ComponentAssignment_4 ) )
            {
            // InternalMyDsl.g:2039:1: ( ( rule__AssemblyContext__ComponentAssignment_4 ) )
            // InternalMyDsl.g:2040:2: ( rule__AssemblyContext__ComponentAssignment_4 )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentAssignment_4()); 
            // InternalMyDsl.g:2041:2: ( rule__AssemblyContext__ComponentAssignment_4 )
            // InternalMyDsl.g:2041:3: rule__AssemblyContext__ComponentAssignment_4
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
    // InternalMyDsl.g:2049:1: rule__AssemblyContext__Group__5 : rule__AssemblyContext__Group__5__Impl ;
    public final void rule__AssemblyContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2053:1: ( rule__AssemblyContext__Group__5__Impl )
            // InternalMyDsl.g:2054:2: rule__AssemblyContext__Group__5__Impl
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
    // InternalMyDsl.g:2060:1: rule__AssemblyContext__Group__5__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2064:1: ( ( '}' ) )
            // InternalMyDsl.g:2065:1: ( '}' )
            {
            // InternalMyDsl.g:2065:1: ( '}' )
            // InternalMyDsl.g:2066:2: '}'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
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


    // $ANTLR start "rule__Type_Impl__Group__0"
    // InternalMyDsl.g:2076:1: rule__Type_Impl__Group__0 : rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 ;
    public final void rule__Type_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2080:1: ( rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 )
            // InternalMyDsl.g:2081:2: rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Type_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0"


    // $ANTLR start "rule__Type_Impl__Group__0__Impl"
    // InternalMyDsl.g:2088:1: rule__Type_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Type_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2092:1: ( ( () ) )
            // InternalMyDsl.g:2093:1: ( () )
            {
            // InternalMyDsl.g:2093:1: ( () )
            // InternalMyDsl.g:2094:2: ()
            {
             before(grammarAccess.getType_ImplAccess().getTypeAction_0()); 
            // InternalMyDsl.g:2095:2: ()
            // InternalMyDsl.g:2095:3: 
            {
            }

             after(grammarAccess.getType_ImplAccess().getTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0__Impl"


    // $ANTLR start "rule__Type_Impl__Group__1"
    // InternalMyDsl.g:2103:1: rule__Type_Impl__Group__1 : rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2 ;
    public final void rule__Type_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2107:1: ( rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2 )
            // InternalMyDsl.g:2108:2: rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Type_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1"


    // $ANTLR start "rule__Type_Impl__Group__1__Impl"
    // InternalMyDsl.g:2115:1: rule__Type_Impl__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2119:1: ( ( 'Type' ) )
            // InternalMyDsl.g:2120:1: ( 'Type' )
            {
            // InternalMyDsl.g:2120:1: ( 'Type' )
            // InternalMyDsl.g:2121:2: 'Type'
            {
             before(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1__Impl"


    // $ANTLR start "rule__Type_Impl__Group__2"
    // InternalMyDsl.g:2130:1: rule__Type_Impl__Group__2 : rule__Type_Impl__Group__2__Impl ;
    public final void rule__Type_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2134:1: ( rule__Type_Impl__Group__2__Impl )
            // InternalMyDsl.g:2135:2: rule__Type_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__2"


    // $ANTLR start "rule__Type_Impl__Group__2__Impl"
    // InternalMyDsl.g:2141:1: rule__Type_Impl__Group__2__Impl : ( ( rule__Type_Impl__NameAssignment_2 ) ) ;
    public final void rule__Type_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2145:1: ( ( ( rule__Type_Impl__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2146:1: ( ( rule__Type_Impl__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2146:1: ( ( rule__Type_Impl__NameAssignment_2 ) )
            // InternalMyDsl.g:2147:2: ( rule__Type_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getType_ImplAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2148:2: ( rule__Type_Impl__NameAssignment_2 )
            // InternalMyDsl.g:2148:3: rule__Type_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getType_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__2__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__0"
    // InternalMyDsl.g:2157:1: rule__AssemblyConnector__Group__0 : rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1 ;
    public final void rule__AssemblyConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2161:1: ( rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1 )
            // InternalMyDsl.g:2162:2: rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AssemblyConnector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__0"


    // $ANTLR start "rule__AssemblyConnector__Group__0__Impl"
    // InternalMyDsl.g:2169:1: rule__AssemblyConnector__Group__0__Impl : ( 'AssemblyConnector' ) ;
    public final void rule__AssemblyConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2173:1: ( ( 'AssemblyConnector' ) )
            // InternalMyDsl.g:2174:1: ( 'AssemblyConnector' )
            {
            // InternalMyDsl.g:2174:1: ( 'AssemblyConnector' )
            // InternalMyDsl.g:2175:2: 'AssemblyConnector'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__0__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__1"
    // InternalMyDsl.g:2184:1: rule__AssemblyConnector__Group__1 : rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2 ;
    public final void rule__AssemblyConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2188:1: ( rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2 )
            // InternalMyDsl.g:2189:2: rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AssemblyConnector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__1"


    // $ANTLR start "rule__AssemblyConnector__Group__1__Impl"
    // InternalMyDsl.g:2196:1: rule__AssemblyConnector__Group__1__Impl : ( ( rule__AssemblyConnector__NameAssignment_1 ) ) ;
    public final void rule__AssemblyConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2200:1: ( ( ( rule__AssemblyConnector__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2201:1: ( ( rule__AssemblyConnector__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2201:1: ( ( rule__AssemblyConnector__NameAssignment_1 ) )
            // InternalMyDsl.g:2202:2: ( rule__AssemblyConnector__NameAssignment_1 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2203:2: ( rule__AssemblyConnector__NameAssignment_1 )
            // InternalMyDsl.g:2203:3: rule__AssemblyConnector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__1__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__2"
    // InternalMyDsl.g:2211:1: rule__AssemblyConnector__Group__2 : rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3 ;
    public final void rule__AssemblyConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2215:1: ( rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3 )
            // InternalMyDsl.g:2216:2: rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__AssemblyConnector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__2"


    // $ANTLR start "rule__AssemblyConnector__Group__2__Impl"
    // InternalMyDsl.g:2223:1: rule__AssemblyConnector__Group__2__Impl : ( '{' ) ;
    public final void rule__AssemblyConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2227:1: ( ( '{' ) )
            // InternalMyDsl.g:2228:1: ( '{' )
            {
            // InternalMyDsl.g:2228:1: ( '{' )
            // InternalMyDsl.g:2229:2: '{'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__2__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__3"
    // InternalMyDsl.g:2238:1: rule__AssemblyConnector__Group__3 : rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4 ;
    public final void rule__AssemblyConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2242:1: ( rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4 )
            // InternalMyDsl.g:2243:2: rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AssemblyConnector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__3"


    // $ANTLR start "rule__AssemblyConnector__Group__3__Impl"
    // InternalMyDsl.g:2250:1: rule__AssemblyConnector__Group__3__Impl : ( 'providedrole' ) ;
    public final void rule__AssemblyConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2254:1: ( ( 'providedrole' ) )
            // InternalMyDsl.g:2255:1: ( 'providedrole' )
            {
            // InternalMyDsl.g:2255:1: ( 'providedrole' )
            // InternalMyDsl.g:2256:2: 'providedrole'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedroleKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getProvidedroleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__3__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__4"
    // InternalMyDsl.g:2265:1: rule__AssemblyConnector__Group__4 : rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5 ;
    public final void rule__AssemblyConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2269:1: ( rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5 )
            // InternalMyDsl.g:2270:2: rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__AssemblyConnector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__4"


    // $ANTLR start "rule__AssemblyConnector__Group__4__Impl"
    // InternalMyDsl.g:2277:1: rule__AssemblyConnector__Group__4__Impl : ( ( rule__AssemblyConnector__ProvidedroleAssignment_4 ) ) ;
    public final void rule__AssemblyConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2281:1: ( ( ( rule__AssemblyConnector__ProvidedroleAssignment_4 ) ) )
            // InternalMyDsl.g:2282:1: ( ( rule__AssemblyConnector__ProvidedroleAssignment_4 ) )
            {
            // InternalMyDsl.g:2282:1: ( ( rule__AssemblyConnector__ProvidedroleAssignment_4 ) )
            // InternalMyDsl.g:2283:2: ( rule__AssemblyConnector__ProvidedroleAssignment_4 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedroleAssignment_4()); 
            // InternalMyDsl.g:2284:2: ( rule__AssemblyConnector__ProvidedroleAssignment_4 )
            // InternalMyDsl.g:2284:3: rule__AssemblyConnector__ProvidedroleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__ProvidedroleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getProvidedroleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__4__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__5"
    // InternalMyDsl.g:2292:1: rule__AssemblyConnector__Group__5 : rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6 ;
    public final void rule__AssemblyConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2296:1: ( rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6 )
            // InternalMyDsl.g:2297:2: rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__AssemblyConnector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__5"


    // $ANTLR start "rule__AssemblyConnector__Group__5__Impl"
    // InternalMyDsl.g:2304:1: rule__AssemblyConnector__Group__5__Impl : ( 'requiredrole' ) ;
    public final void rule__AssemblyConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2308:1: ( ( 'requiredrole' ) )
            // InternalMyDsl.g:2309:1: ( 'requiredrole' )
            {
            // InternalMyDsl.g:2309:1: ( 'requiredrole' )
            // InternalMyDsl.g:2310:2: 'requiredrole'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredroleKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getRequiredroleKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__5__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__6"
    // InternalMyDsl.g:2319:1: rule__AssemblyConnector__Group__6 : rule__AssemblyConnector__Group__6__Impl rule__AssemblyConnector__Group__7 ;
    public final void rule__AssemblyConnector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2323:1: ( rule__AssemblyConnector__Group__6__Impl rule__AssemblyConnector__Group__7 )
            // InternalMyDsl.g:2324:2: rule__AssemblyConnector__Group__6__Impl rule__AssemblyConnector__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__AssemblyConnector__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__6"


    // $ANTLR start "rule__AssemblyConnector__Group__6__Impl"
    // InternalMyDsl.g:2331:1: rule__AssemblyConnector__Group__6__Impl : ( ( rule__AssemblyConnector__RequiredroleAssignment_6 ) ) ;
    public final void rule__AssemblyConnector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2335:1: ( ( ( rule__AssemblyConnector__RequiredroleAssignment_6 ) ) )
            // InternalMyDsl.g:2336:1: ( ( rule__AssemblyConnector__RequiredroleAssignment_6 ) )
            {
            // InternalMyDsl.g:2336:1: ( ( rule__AssemblyConnector__RequiredroleAssignment_6 ) )
            // InternalMyDsl.g:2337:2: ( rule__AssemblyConnector__RequiredroleAssignment_6 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredroleAssignment_6()); 
            // InternalMyDsl.g:2338:2: ( rule__AssemblyConnector__RequiredroleAssignment_6 )
            // InternalMyDsl.g:2338:3: rule__AssemblyConnector__RequiredroleAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__RequiredroleAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getRequiredroleAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__6__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__7"
    // InternalMyDsl.g:2346:1: rule__AssemblyConnector__Group__7 : rule__AssemblyConnector__Group__7__Impl ;
    public final void rule__AssemblyConnector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2350:1: ( rule__AssemblyConnector__Group__7__Impl )
            // InternalMyDsl.g:2351:2: rule__AssemblyConnector__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__7"


    // $ANTLR start "rule__AssemblyConnector__Group__7__Impl"
    // InternalMyDsl.g:2357:1: rule__AssemblyConnector__Group__7__Impl : ( '}' ) ;
    public final void rule__AssemblyConnector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2361:1: ( ( '}' ) )
            // InternalMyDsl.g:2362:1: ( '}' )
            {
            // InternalMyDsl.g:2362:1: ( '}' )
            // InternalMyDsl.g:2363:2: '}'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__7__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // InternalMyDsl.g:2373:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2377:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalMyDsl.g:2378:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2385:1: rule__Signature__Group__0__Impl : ( 'Signature' ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2389:1: ( ( 'Signature' ) )
            // InternalMyDsl.g:2390:1: ( 'Signature' )
            {
            // InternalMyDsl.g:2390:1: ( 'Signature' )
            // InternalMyDsl.g:2391:2: 'Signature'
            {
             before(grammarAccess.getSignatureAccess().getSignatureKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2400:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2404:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalMyDsl.g:2405:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
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
    // InternalMyDsl.g:2412:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__NameAssignment_1 ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2416:1: ( ( ( rule__Signature__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2417:1: ( ( rule__Signature__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2417:1: ( ( rule__Signature__NameAssignment_1 ) )
            // InternalMyDsl.g:2418:2: ( rule__Signature__NameAssignment_1 )
            {
             before(grammarAccess.getSignatureAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2419:2: ( rule__Signature__NameAssignment_1 )
            // InternalMyDsl.g:2419:3: rule__Signature__NameAssignment_1
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
    // InternalMyDsl.g:2427:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl rule__Signature__Group__3 ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2431:1: ( rule__Signature__Group__2__Impl rule__Signature__Group__3 )
            // InternalMyDsl.g:2432:2: rule__Signature__Group__2__Impl rule__Signature__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2439:1: rule__Signature__Group__2__Impl : ( '{' ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2443:1: ( ( '{' ) )
            // InternalMyDsl.g:2444:1: ( '{' )
            {
            // InternalMyDsl.g:2444:1: ( '{' )
            // InternalMyDsl.g:2445:2: '{'
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
    // InternalMyDsl.g:2454:1: rule__Signature__Group__3 : rule__Signature__Group__3__Impl rule__Signature__Group__4 ;
    public final void rule__Signature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2458:1: ( rule__Signature__Group__3__Impl rule__Signature__Group__4 )
            // InternalMyDsl.g:2459:2: rule__Signature__Group__3__Impl rule__Signature__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2466:1: rule__Signature__Group__3__Impl : ( 'returntype' ) ;
    public final void rule__Signature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2470:1: ( ( 'returntype' ) )
            // InternalMyDsl.g:2471:1: ( 'returntype' )
            {
            // InternalMyDsl.g:2471:1: ( 'returntype' )
            // InternalMyDsl.g:2472:2: 'returntype'
            {
             before(grammarAccess.getSignatureAccess().getReturntypeKeyword_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2481:1: rule__Signature__Group__4 : rule__Signature__Group__4__Impl rule__Signature__Group__5 ;
    public final void rule__Signature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2485:1: ( rule__Signature__Group__4__Impl rule__Signature__Group__5 )
            // InternalMyDsl.g:2486:2: rule__Signature__Group__4__Impl rule__Signature__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2493:1: rule__Signature__Group__4__Impl : ( ( rule__Signature__ReturntypeAssignment_4 ) ) ;
    public final void rule__Signature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2497:1: ( ( ( rule__Signature__ReturntypeAssignment_4 ) ) )
            // InternalMyDsl.g:2498:1: ( ( rule__Signature__ReturntypeAssignment_4 ) )
            {
            // InternalMyDsl.g:2498:1: ( ( rule__Signature__ReturntypeAssignment_4 ) )
            // InternalMyDsl.g:2499:2: ( rule__Signature__ReturntypeAssignment_4 )
            {
             before(grammarAccess.getSignatureAccess().getReturntypeAssignment_4()); 
            // InternalMyDsl.g:2500:2: ( rule__Signature__ReturntypeAssignment_4 )
            // InternalMyDsl.g:2500:3: rule__Signature__ReturntypeAssignment_4
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
    // InternalMyDsl.g:2508:1: rule__Signature__Group__5 : rule__Signature__Group__5__Impl rule__Signature__Group__6 ;
    public final void rule__Signature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2512:1: ( rule__Signature__Group__5__Impl rule__Signature__Group__6 )
            // InternalMyDsl.g:2513:2: rule__Signature__Group__5__Impl rule__Signature__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2520:1: rule__Signature__Group__5__Impl : ( ( rule__Signature__Group_5__0 )? ) ;
    public final void rule__Signature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2524:1: ( ( ( rule__Signature__Group_5__0 )? ) )
            // InternalMyDsl.g:2525:1: ( ( rule__Signature__Group_5__0 )? )
            {
            // InternalMyDsl.g:2525:1: ( ( rule__Signature__Group_5__0 )? )
            // InternalMyDsl.g:2526:2: ( rule__Signature__Group_5__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_5()); 
            // InternalMyDsl.g:2527:2: ( rule__Signature__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:2527:3: rule__Signature__Group_5__0
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
    // InternalMyDsl.g:2535:1: rule__Signature__Group__6 : rule__Signature__Group__6__Impl ;
    public final void rule__Signature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2539:1: ( rule__Signature__Group__6__Impl )
            // InternalMyDsl.g:2540:2: rule__Signature__Group__6__Impl
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
    // InternalMyDsl.g:2546:1: rule__Signature__Group__6__Impl : ( '}' ) ;
    public final void rule__Signature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2550:1: ( ( '}' ) )
            // InternalMyDsl.g:2551:1: ( '}' )
            {
            // InternalMyDsl.g:2551:1: ( '}' )
            // InternalMyDsl.g:2552:2: '}'
            {
             before(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2562:1: rule__Signature__Group_5__0 : rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1 ;
    public final void rule__Signature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2566:1: ( rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1 )
            // InternalMyDsl.g:2567:2: rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1
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
    // InternalMyDsl.g:2574:1: rule__Signature__Group_5__0__Impl : ( 'parameter' ) ;
    public final void rule__Signature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2578:1: ( ( 'parameter' ) )
            // InternalMyDsl.g:2579:1: ( 'parameter' )
            {
            // InternalMyDsl.g:2579:1: ( 'parameter' )
            // InternalMyDsl.g:2580:2: 'parameter'
            {
             before(grammarAccess.getSignatureAccess().getParameterKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:2589:1: rule__Signature__Group_5__1 : rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2 ;
    public final void rule__Signature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2593:1: ( rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2 )
            // InternalMyDsl.g:2594:2: rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2601:1: rule__Signature__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Signature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2605:1: ( ( '{' ) )
            // InternalMyDsl.g:2606:1: ( '{' )
            {
            // InternalMyDsl.g:2606:1: ( '{' )
            // InternalMyDsl.g:2607:2: '{'
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
    // InternalMyDsl.g:2616:1: rule__Signature__Group_5__2 : rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3 ;
    public final void rule__Signature__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2620:1: ( rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3 )
            // InternalMyDsl.g:2621:2: rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2628:1: rule__Signature__Group_5__2__Impl : ( ( rule__Signature__ParameterAssignment_5_2 ) ) ;
    public final void rule__Signature__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2632:1: ( ( ( rule__Signature__ParameterAssignment_5_2 ) ) )
            // InternalMyDsl.g:2633:1: ( ( rule__Signature__ParameterAssignment_5_2 ) )
            {
            // InternalMyDsl.g:2633:1: ( ( rule__Signature__ParameterAssignment_5_2 ) )
            // InternalMyDsl.g:2634:2: ( rule__Signature__ParameterAssignment_5_2 )
            {
             before(grammarAccess.getSignatureAccess().getParameterAssignment_5_2()); 
            // InternalMyDsl.g:2635:2: ( rule__Signature__ParameterAssignment_5_2 )
            // InternalMyDsl.g:2635:3: rule__Signature__ParameterAssignment_5_2
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
    // InternalMyDsl.g:2643:1: rule__Signature__Group_5__3 : rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4 ;
    public final void rule__Signature__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2647:1: ( rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4 )
            // InternalMyDsl.g:2648:2: rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2655:1: rule__Signature__Group_5__3__Impl : ( ( rule__Signature__Group_5_3__0 )* ) ;
    public final void rule__Signature__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2659:1: ( ( ( rule__Signature__Group_5_3__0 )* ) )
            // InternalMyDsl.g:2660:1: ( ( rule__Signature__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:2660:1: ( ( rule__Signature__Group_5_3__0 )* )
            // InternalMyDsl.g:2661:2: ( rule__Signature__Group_5_3__0 )*
            {
             before(grammarAccess.getSignatureAccess().getGroup_5_3()); 
            // InternalMyDsl.g:2662:2: ( rule__Signature__Group_5_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2662:3: rule__Signature__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Signature__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMyDsl.g:2670:1: rule__Signature__Group_5__4 : rule__Signature__Group_5__4__Impl ;
    public final void rule__Signature__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2674:1: ( rule__Signature__Group_5__4__Impl )
            // InternalMyDsl.g:2675:2: rule__Signature__Group_5__4__Impl
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
    // InternalMyDsl.g:2681:1: rule__Signature__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Signature__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2685:1: ( ( '}' ) )
            // InternalMyDsl.g:2686:1: ( '}' )
            {
            // InternalMyDsl.g:2686:1: ( '}' )
            // InternalMyDsl.g:2687:2: '}'
            {
             before(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2697:1: rule__Signature__Group_5_3__0 : rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1 ;
    public final void rule__Signature__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2701:1: ( rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1 )
            // InternalMyDsl.g:2702:2: rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2709:1: rule__Signature__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Signature__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2713:1: ( ( ',' ) )
            // InternalMyDsl.g:2714:1: ( ',' )
            {
            // InternalMyDsl.g:2714:1: ( ',' )
            // InternalMyDsl.g:2715:2: ','
            {
             before(grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:2724:1: rule__Signature__Group_5_3__1 : rule__Signature__Group_5_3__1__Impl ;
    public final void rule__Signature__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2728:1: ( rule__Signature__Group_5_3__1__Impl )
            // InternalMyDsl.g:2729:2: rule__Signature__Group_5_3__1__Impl
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
    // InternalMyDsl.g:2735:1: rule__Signature__Group_5_3__1__Impl : ( ( rule__Signature__ParameterAssignment_5_3_1 ) ) ;
    public final void rule__Signature__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2739:1: ( ( ( rule__Signature__ParameterAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:2740:1: ( ( rule__Signature__ParameterAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:2740:1: ( ( rule__Signature__ParameterAssignment_5_3_1 ) )
            // InternalMyDsl.g:2741:2: ( rule__Signature__ParameterAssignment_5_3_1 )
            {
             before(grammarAccess.getSignatureAccess().getParameterAssignment_5_3_1()); 
            // InternalMyDsl.g:2742:2: ( rule__Signature__ParameterAssignment_5_3_1 )
            // InternalMyDsl.g:2742:3: rule__Signature__ParameterAssignment_5_3_1
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
    // InternalMyDsl.g:2751:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2755:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMyDsl.g:2756:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2763:1: rule__Parameter__Group__0__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2767:1: ( ( 'Parameter' ) )
            // InternalMyDsl.g:2768:1: ( 'Parameter' )
            {
            // InternalMyDsl.g:2768:1: ( 'Parameter' )
            // InternalMyDsl.g:2769:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:2778:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2782:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalMyDsl.g:2783:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalMyDsl.g:2790:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2794:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2795:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2795:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalMyDsl.g:2796:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2797:2: ( rule__Parameter__NameAssignment_1 )
            // InternalMyDsl.g:2797:3: rule__Parameter__NameAssignment_1
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
    // InternalMyDsl.g:2805:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2809:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalMyDsl.g:2810:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2817:1: rule__Parameter__Group__2__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2821:1: ( ( '{' ) )
            // InternalMyDsl.g:2822:1: ( '{' )
            {
            // InternalMyDsl.g:2822:1: ( '{' )
            // InternalMyDsl.g:2823:2: '{'
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
    // InternalMyDsl.g:2832:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2836:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalMyDsl.g:2837:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2844:1: rule__Parameter__Group__3__Impl : ( 'parametertype' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2848:1: ( ( 'parametertype' ) )
            // InternalMyDsl.g:2849:1: ( 'parametertype' )
            {
            // InternalMyDsl.g:2849:1: ( 'parametertype' )
            // InternalMyDsl.g:2850:2: 'parametertype'
            {
             before(grammarAccess.getParameterAccess().getParametertypeKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:2859:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2863:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalMyDsl.g:2864:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2871:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__ParametertypeAssignment_4 ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2875:1: ( ( ( rule__Parameter__ParametertypeAssignment_4 ) ) )
            // InternalMyDsl.g:2876:1: ( ( rule__Parameter__ParametertypeAssignment_4 ) )
            {
            // InternalMyDsl.g:2876:1: ( ( rule__Parameter__ParametertypeAssignment_4 ) )
            // InternalMyDsl.g:2877:2: ( rule__Parameter__ParametertypeAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getParametertypeAssignment_4()); 
            // InternalMyDsl.g:2878:2: ( rule__Parameter__ParametertypeAssignment_4 )
            // InternalMyDsl.g:2878:3: rule__Parameter__ParametertypeAssignment_4
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
    // InternalMyDsl.g:2886:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2890:1: ( rule__Parameter__Group__5__Impl )
            // InternalMyDsl.g:2891:2: rule__Parameter__Group__5__Impl
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
    // InternalMyDsl.g:2897:1: rule__Parameter__Group__5__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2901:1: ( ( '}' ) )
            // InternalMyDsl.g:2902:1: ( '}' )
            {
            // InternalMyDsl.g:2902:1: ( '}' )
            // InternalMyDsl.g:2903:2: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2913:1: rule__ReturnType_Impl__Group__0 : rule__ReturnType_Impl__Group__0__Impl rule__ReturnType_Impl__Group__1 ;
    public final void rule__ReturnType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2917:1: ( rule__ReturnType_Impl__Group__0__Impl rule__ReturnType_Impl__Group__1 )
            // InternalMyDsl.g:2918:2: rule__ReturnType_Impl__Group__0__Impl rule__ReturnType_Impl__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:2925:1: rule__ReturnType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ReturnType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2929:1: ( ( () ) )
            // InternalMyDsl.g:2930:1: ( () )
            {
            // InternalMyDsl.g:2930:1: ( () )
            // InternalMyDsl.g:2931:2: ()
            {
             before(grammarAccess.getReturnType_ImplAccess().getReturnTypeAction_0()); 
            // InternalMyDsl.g:2932:2: ()
            // InternalMyDsl.g:2932:3: 
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
    // InternalMyDsl.g:2940:1: rule__ReturnType_Impl__Group__1 : rule__ReturnType_Impl__Group__1__Impl rule__ReturnType_Impl__Group__2 ;
    public final void rule__ReturnType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2944:1: ( rule__ReturnType_Impl__Group__1__Impl rule__ReturnType_Impl__Group__2 )
            // InternalMyDsl.g:2945:2: rule__ReturnType_Impl__Group__1__Impl rule__ReturnType_Impl__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2952:1: rule__ReturnType_Impl__Group__1__Impl : ( 'ReturnType' ) ;
    public final void rule__ReturnType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2956:1: ( ( 'ReturnType' ) )
            // InternalMyDsl.g:2957:1: ( 'ReturnType' )
            {
            // InternalMyDsl.g:2957:1: ( 'ReturnType' )
            // InternalMyDsl.g:2958:2: 'ReturnType'
            {
             before(grammarAccess.getReturnType_ImplAccess().getReturnTypeKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:2967:1: rule__ReturnType_Impl__Group__2 : rule__ReturnType_Impl__Group__2__Impl ;
    public final void rule__ReturnType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2971:1: ( rule__ReturnType_Impl__Group__2__Impl )
            // InternalMyDsl.g:2972:2: rule__ReturnType_Impl__Group__2__Impl
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
    // InternalMyDsl.g:2978:1: rule__ReturnType_Impl__Group__2__Impl : ( ( rule__ReturnType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ReturnType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2982:1: ( ( ( rule__ReturnType_Impl__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2983:1: ( ( rule__ReturnType_Impl__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2983:1: ( ( rule__ReturnType_Impl__NameAssignment_2 ) )
            // InternalMyDsl.g:2984:2: ( rule__ReturnType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getReturnType_ImplAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2985:2: ( rule__ReturnType_Impl__NameAssignment_2 )
            // InternalMyDsl.g:2985:3: rule__ReturnType_Impl__NameAssignment_2
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
    // InternalMyDsl.g:2994:1: rule__ParameterType_Impl__Group__0 : rule__ParameterType_Impl__Group__0__Impl rule__ParameterType_Impl__Group__1 ;
    public final void rule__ParameterType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2998:1: ( rule__ParameterType_Impl__Group__0__Impl rule__ParameterType_Impl__Group__1 )
            // InternalMyDsl.g:2999:2: rule__ParameterType_Impl__Group__0__Impl rule__ParameterType_Impl__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:3006:1: rule__ParameterType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ParameterType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3010:1: ( ( () ) )
            // InternalMyDsl.g:3011:1: ( () )
            {
            // InternalMyDsl.g:3011:1: ( () )
            // InternalMyDsl.g:3012:2: ()
            {
             before(grammarAccess.getParameterType_ImplAccess().getParameterTypeAction_0()); 
            // InternalMyDsl.g:3013:2: ()
            // InternalMyDsl.g:3013:3: 
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
    // InternalMyDsl.g:3021:1: rule__ParameterType_Impl__Group__1 : rule__ParameterType_Impl__Group__1__Impl rule__ParameterType_Impl__Group__2 ;
    public final void rule__ParameterType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3025:1: ( rule__ParameterType_Impl__Group__1__Impl rule__ParameterType_Impl__Group__2 )
            // InternalMyDsl.g:3026:2: rule__ParameterType_Impl__Group__1__Impl rule__ParameterType_Impl__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3033:1: rule__ParameterType_Impl__Group__1__Impl : ( 'ParameterType' ) ;
    public final void rule__ParameterType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3037:1: ( ( 'ParameterType' ) )
            // InternalMyDsl.g:3038:1: ( 'ParameterType' )
            {
            // InternalMyDsl.g:3038:1: ( 'ParameterType' )
            // InternalMyDsl.g:3039:2: 'ParameterType'
            {
             before(grammarAccess.getParameterType_ImplAccess().getParameterTypeKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:3048:1: rule__ParameterType_Impl__Group__2 : rule__ParameterType_Impl__Group__2__Impl ;
    public final void rule__ParameterType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3052:1: ( rule__ParameterType_Impl__Group__2__Impl )
            // InternalMyDsl.g:3053:2: rule__ParameterType_Impl__Group__2__Impl
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
    // InternalMyDsl.g:3059:1: rule__ParameterType_Impl__Group__2__Impl : ( ( rule__ParameterType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ParameterType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3063:1: ( ( ( rule__ParameterType_Impl__NameAssignment_2 ) ) )
            // InternalMyDsl.g:3064:1: ( ( rule__ParameterType_Impl__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:3064:1: ( ( rule__ParameterType_Impl__NameAssignment_2 ) )
            // InternalMyDsl.g:3065:2: ( rule__ParameterType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getParameterType_ImplAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3066:2: ( rule__ParameterType_Impl__NameAssignment_2 )
            // InternalMyDsl.g:3066:3: rule__ParameterType_Impl__NameAssignment_2
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
    // InternalMyDsl.g:3075:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3079:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalMyDsl.g:3080:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:3087:1: rule__Simple__Group__0__Impl : ( () ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3091:1: ( ( () ) )
            // InternalMyDsl.g:3092:1: ( () )
            {
            // InternalMyDsl.g:3092:1: ( () )
            // InternalMyDsl.g:3093:2: ()
            {
             before(grammarAccess.getSimpleAccess().getSimpleAction_0()); 
            // InternalMyDsl.g:3094:2: ()
            // InternalMyDsl.g:3094:3: 
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
    // InternalMyDsl.g:3102:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl rule__Simple__Group__2 ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3106:1: ( rule__Simple__Group__1__Impl rule__Simple__Group__2 )
            // InternalMyDsl.g:3107:2: rule__Simple__Group__1__Impl rule__Simple__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3114:1: rule__Simple__Group__1__Impl : ( 'Simple' ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3118:1: ( ( 'Simple' ) )
            // InternalMyDsl.g:3119:1: ( 'Simple' )
            {
            // InternalMyDsl.g:3119:1: ( 'Simple' )
            // InternalMyDsl.g:3120:2: 'Simple'
            {
             before(grammarAccess.getSimpleAccess().getSimpleKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:3129:1: rule__Simple__Group__2 : rule__Simple__Group__2__Impl rule__Simple__Group__3 ;
    public final void rule__Simple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3133:1: ( rule__Simple__Group__2__Impl rule__Simple__Group__3 )
            // InternalMyDsl.g:3134:2: rule__Simple__Group__2__Impl rule__Simple__Group__3
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
    // InternalMyDsl.g:3141:1: rule__Simple__Group__2__Impl : ( ( rule__Simple__NameAssignment_2 ) ) ;
    public final void rule__Simple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3145:1: ( ( ( rule__Simple__NameAssignment_2 ) ) )
            // InternalMyDsl.g:3146:1: ( ( rule__Simple__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:3146:1: ( ( rule__Simple__NameAssignment_2 ) )
            // InternalMyDsl.g:3147:2: ( rule__Simple__NameAssignment_2 )
            {
             before(grammarAccess.getSimpleAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3148:2: ( rule__Simple__NameAssignment_2 )
            // InternalMyDsl.g:3148:3: rule__Simple__NameAssignment_2
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
    // InternalMyDsl.g:3156:1: rule__Simple__Group__3 : rule__Simple__Group__3__Impl rule__Simple__Group__4 ;
    public final void rule__Simple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3160:1: ( rule__Simple__Group__3__Impl rule__Simple__Group__4 )
            // InternalMyDsl.g:3161:2: rule__Simple__Group__3__Impl rule__Simple__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:3168:1: rule__Simple__Group__3__Impl : ( '{' ) ;
    public final void rule__Simple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3172:1: ( ( '{' ) )
            // InternalMyDsl.g:3173:1: ( '{' )
            {
            // InternalMyDsl.g:3173:1: ( '{' )
            // InternalMyDsl.g:3174:2: '{'
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
    // InternalMyDsl.g:3183:1: rule__Simple__Group__4 : rule__Simple__Group__4__Impl rule__Simple__Group__5 ;
    public final void rule__Simple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3187:1: ( rule__Simple__Group__4__Impl rule__Simple__Group__5 )
            // InternalMyDsl.g:3188:2: rule__Simple__Group__4__Impl rule__Simple__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:3195:1: rule__Simple__Group__4__Impl : ( ( rule__Simple__Group_4__0 )? ) ;
    public final void rule__Simple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3199:1: ( ( ( rule__Simple__Group_4__0 )? ) )
            // InternalMyDsl.g:3200:1: ( ( rule__Simple__Group_4__0 )? )
            {
            // InternalMyDsl.g:3200:1: ( ( rule__Simple__Group_4__0 )? )
            // InternalMyDsl.g:3201:2: ( rule__Simple__Group_4__0 )?
            {
             before(grammarAccess.getSimpleAccess().getGroup_4()); 
            // InternalMyDsl.g:3202:2: ( rule__Simple__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==46) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:3202:3: rule__Simple__Group_4__0
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
    // InternalMyDsl.g:3210:1: rule__Simple__Group__5 : rule__Simple__Group__5__Impl ;
    public final void rule__Simple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3214:1: ( rule__Simple__Group__5__Impl )
            // InternalMyDsl.g:3215:2: rule__Simple__Group__5__Impl
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
    // InternalMyDsl.g:3221:1: rule__Simple__Group__5__Impl : ( '}' ) ;
    public final void rule__Simple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3225:1: ( ( '}' ) )
            // InternalMyDsl.g:3226:1: ( '}' )
            {
            // InternalMyDsl.g:3226:1: ( '}' )
            // InternalMyDsl.g:3227:2: '}'
            {
             before(grammarAccess.getSimpleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:3237:1: rule__Simple__Group_4__0 : rule__Simple__Group_4__0__Impl rule__Simple__Group_4__1 ;
    public final void rule__Simple__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3241:1: ( rule__Simple__Group_4__0__Impl rule__Simple__Group_4__1 )
            // InternalMyDsl.g:3242:2: rule__Simple__Group_4__0__Impl rule__Simple__Group_4__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3249:1: rule__Simple__Group_4__0__Impl : ( 'kind' ) ;
    public final void rule__Simple__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3253:1: ( ( 'kind' ) )
            // InternalMyDsl.g:3254:1: ( 'kind' )
            {
            // InternalMyDsl.g:3254:1: ( 'kind' )
            // InternalMyDsl.g:3255:2: 'kind'
            {
             before(grammarAccess.getSimpleAccess().getKindKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:3264:1: rule__Simple__Group_4__1 : rule__Simple__Group_4__1__Impl ;
    public final void rule__Simple__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3268:1: ( rule__Simple__Group_4__1__Impl )
            // InternalMyDsl.g:3269:2: rule__Simple__Group_4__1__Impl
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
    // InternalMyDsl.g:3275:1: rule__Simple__Group_4__1__Impl : ( ( rule__Simple__KindAssignment_4_1 ) ) ;
    public final void rule__Simple__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3279:1: ( ( ( rule__Simple__KindAssignment_4_1 ) ) )
            // InternalMyDsl.g:3280:1: ( ( rule__Simple__KindAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3280:1: ( ( rule__Simple__KindAssignment_4_1 ) )
            // InternalMyDsl.g:3281:2: ( rule__Simple__KindAssignment_4_1 )
            {
             before(grammarAccess.getSimpleAccess().getKindAssignment_4_1()); 
            // InternalMyDsl.g:3282:2: ( rule__Simple__KindAssignment_4_1 )
            // InternalMyDsl.g:3282:3: rule__Simple__KindAssignment_4_1
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
    // InternalMyDsl.g:3291:1: rule__Complex__Group__0 : rule__Complex__Group__0__Impl rule__Complex__Group__1 ;
    public final void rule__Complex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3295:1: ( rule__Complex__Group__0__Impl rule__Complex__Group__1 )
            // InternalMyDsl.g:3296:2: rule__Complex__Group__0__Impl rule__Complex__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3303:1: rule__Complex__Group__0__Impl : ( 'Complex' ) ;
    public final void rule__Complex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3307:1: ( ( 'Complex' ) )
            // InternalMyDsl.g:3308:1: ( 'Complex' )
            {
            // InternalMyDsl.g:3308:1: ( 'Complex' )
            // InternalMyDsl.g:3309:2: 'Complex'
            {
             before(grammarAccess.getComplexAccess().getComplexKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:3318:1: rule__Complex__Group__1 : rule__Complex__Group__1__Impl rule__Complex__Group__2 ;
    public final void rule__Complex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3322:1: ( rule__Complex__Group__1__Impl rule__Complex__Group__2 )
            // InternalMyDsl.g:3323:2: rule__Complex__Group__1__Impl rule__Complex__Group__2
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
    // InternalMyDsl.g:3330:1: rule__Complex__Group__1__Impl : ( ( rule__Complex__NameAssignment_1 ) ) ;
    public final void rule__Complex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3334:1: ( ( ( rule__Complex__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3335:1: ( ( rule__Complex__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3335:1: ( ( rule__Complex__NameAssignment_1 ) )
            // InternalMyDsl.g:3336:2: ( rule__Complex__NameAssignment_1 )
            {
             before(grammarAccess.getComplexAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3337:2: ( rule__Complex__NameAssignment_1 )
            // InternalMyDsl.g:3337:3: rule__Complex__NameAssignment_1
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
    // InternalMyDsl.g:3345:1: rule__Complex__Group__2 : rule__Complex__Group__2__Impl rule__Complex__Group__3 ;
    public final void rule__Complex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3349:1: ( rule__Complex__Group__2__Impl rule__Complex__Group__3 )
            // InternalMyDsl.g:3350:2: rule__Complex__Group__2__Impl rule__Complex__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3357:1: rule__Complex__Group__2__Impl : ( '{' ) ;
    public final void rule__Complex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3361:1: ( ( '{' ) )
            // InternalMyDsl.g:3362:1: ( '{' )
            {
            // InternalMyDsl.g:3362:1: ( '{' )
            // InternalMyDsl.g:3363:2: '{'
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
    // InternalMyDsl.g:3372:1: rule__Complex__Group__3 : rule__Complex__Group__3__Impl rule__Complex__Group__4 ;
    public final void rule__Complex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3376:1: ( rule__Complex__Group__3__Impl rule__Complex__Group__4 )
            // InternalMyDsl.g:3377:2: rule__Complex__Group__3__Impl rule__Complex__Group__4
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
    // InternalMyDsl.g:3384:1: rule__Complex__Group__3__Impl : ( 'simple' ) ;
    public final void rule__Complex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3388:1: ( ( 'simple' ) )
            // InternalMyDsl.g:3389:1: ( 'simple' )
            {
            // InternalMyDsl.g:3389:1: ( 'simple' )
            // InternalMyDsl.g:3390:2: 'simple'
            {
             before(grammarAccess.getComplexAccess().getSimpleKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:3399:1: rule__Complex__Group__4 : rule__Complex__Group__4__Impl rule__Complex__Group__5 ;
    public final void rule__Complex__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3403:1: ( rule__Complex__Group__4__Impl rule__Complex__Group__5 )
            // InternalMyDsl.g:3404:2: rule__Complex__Group__4__Impl rule__Complex__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:3411:1: rule__Complex__Group__4__Impl : ( '{' ) ;
    public final void rule__Complex__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3415:1: ( ( '{' ) )
            // InternalMyDsl.g:3416:1: ( '{' )
            {
            // InternalMyDsl.g:3416:1: ( '{' )
            // InternalMyDsl.g:3417:2: '{'
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
    // InternalMyDsl.g:3426:1: rule__Complex__Group__5 : rule__Complex__Group__5__Impl rule__Complex__Group__6 ;
    public final void rule__Complex__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3430:1: ( rule__Complex__Group__5__Impl rule__Complex__Group__6 )
            // InternalMyDsl.g:3431:2: rule__Complex__Group__5__Impl rule__Complex__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:3438:1: rule__Complex__Group__5__Impl : ( ( rule__Complex__SimpleAssignment_5 ) ) ;
    public final void rule__Complex__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3442:1: ( ( ( rule__Complex__SimpleAssignment_5 ) ) )
            // InternalMyDsl.g:3443:1: ( ( rule__Complex__SimpleAssignment_5 ) )
            {
            // InternalMyDsl.g:3443:1: ( ( rule__Complex__SimpleAssignment_5 ) )
            // InternalMyDsl.g:3444:2: ( rule__Complex__SimpleAssignment_5 )
            {
             before(grammarAccess.getComplexAccess().getSimpleAssignment_5()); 
            // InternalMyDsl.g:3445:2: ( rule__Complex__SimpleAssignment_5 )
            // InternalMyDsl.g:3445:3: rule__Complex__SimpleAssignment_5
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
    // InternalMyDsl.g:3453:1: rule__Complex__Group__6 : rule__Complex__Group__6__Impl rule__Complex__Group__7 ;
    public final void rule__Complex__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3457:1: ( rule__Complex__Group__6__Impl rule__Complex__Group__7 )
            // InternalMyDsl.g:3458:2: rule__Complex__Group__6__Impl rule__Complex__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:3465:1: rule__Complex__Group__6__Impl : ( ( rule__Complex__Group_6__0 )* ) ;
    public final void rule__Complex__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3469:1: ( ( ( rule__Complex__Group_6__0 )* ) )
            // InternalMyDsl.g:3470:1: ( ( rule__Complex__Group_6__0 )* )
            {
            // InternalMyDsl.g:3470:1: ( ( rule__Complex__Group_6__0 )* )
            // InternalMyDsl.g:3471:2: ( rule__Complex__Group_6__0 )*
            {
             before(grammarAccess.getComplexAccess().getGroup_6()); 
            // InternalMyDsl.g:3472:2: ( rule__Complex__Group_6__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:3472:3: rule__Complex__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Complex__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyDsl.g:3480:1: rule__Complex__Group__7 : rule__Complex__Group__7__Impl rule__Complex__Group__8 ;
    public final void rule__Complex__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3484:1: ( rule__Complex__Group__7__Impl rule__Complex__Group__8 )
            // InternalMyDsl.g:3485:2: rule__Complex__Group__7__Impl rule__Complex__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:3492:1: rule__Complex__Group__7__Impl : ( '}' ) ;
    public final void rule__Complex__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3496:1: ( ( '}' ) )
            // InternalMyDsl.g:3497:1: ( '}' )
            {
            // InternalMyDsl.g:3497:1: ( '}' )
            // InternalMyDsl.g:3498:2: '}'
            {
             before(grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:3507:1: rule__Complex__Group__8 : rule__Complex__Group__8__Impl ;
    public final void rule__Complex__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3511:1: ( rule__Complex__Group__8__Impl )
            // InternalMyDsl.g:3512:2: rule__Complex__Group__8__Impl
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
    // InternalMyDsl.g:3518:1: rule__Complex__Group__8__Impl : ( '}' ) ;
    public final void rule__Complex__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3522:1: ( ( '}' ) )
            // InternalMyDsl.g:3523:1: ( '}' )
            {
            // InternalMyDsl.g:3523:1: ( '}' )
            // InternalMyDsl.g:3524:2: '}'
            {
             before(grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:3534:1: rule__Complex__Group_6__0 : rule__Complex__Group_6__0__Impl rule__Complex__Group_6__1 ;
    public final void rule__Complex__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3538:1: ( rule__Complex__Group_6__0__Impl rule__Complex__Group_6__1 )
            // InternalMyDsl.g:3539:2: rule__Complex__Group_6__0__Impl rule__Complex__Group_6__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:3546:1: rule__Complex__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Complex__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3550:1: ( ( ',' ) )
            // InternalMyDsl.g:3551:1: ( ',' )
            {
            // InternalMyDsl.g:3551:1: ( ',' )
            // InternalMyDsl.g:3552:2: ','
            {
             before(grammarAccess.getComplexAccess().getCommaKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:3561:1: rule__Complex__Group_6__1 : rule__Complex__Group_6__1__Impl ;
    public final void rule__Complex__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3565:1: ( rule__Complex__Group_6__1__Impl )
            // InternalMyDsl.g:3566:2: rule__Complex__Group_6__1__Impl
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
    // InternalMyDsl.g:3572:1: rule__Complex__Group_6__1__Impl : ( ( rule__Complex__SimpleAssignment_6_1 ) ) ;
    public final void rule__Complex__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3576:1: ( ( ( rule__Complex__SimpleAssignment_6_1 ) ) )
            // InternalMyDsl.g:3577:1: ( ( rule__Complex__SimpleAssignment_6_1 ) )
            {
            // InternalMyDsl.g:3577:1: ( ( rule__Complex__SimpleAssignment_6_1 ) )
            // InternalMyDsl.g:3578:2: ( rule__Complex__SimpleAssignment_6_1 )
            {
             before(grammarAccess.getComplexAccess().getSimpleAssignment_6_1()); 
            // InternalMyDsl.g:3579:2: ( rule__Complex__SimpleAssignment_6_1 )
            // InternalMyDsl.g:3579:3: rule__Complex__SimpleAssignment_6_1
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
    // InternalMyDsl.g:3588:1: rule__Void__Group__0 : rule__Void__Group__0__Impl rule__Void__Group__1 ;
    public final void rule__Void__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3592:1: ( rule__Void__Group__0__Impl rule__Void__Group__1 )
            // InternalMyDsl.g:3593:2: rule__Void__Group__0__Impl rule__Void__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3600:1: rule__Void__Group__0__Impl : ( () ) ;
    public final void rule__Void__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3604:1: ( ( () ) )
            // InternalMyDsl.g:3605:1: ( () )
            {
            // InternalMyDsl.g:3605:1: ( () )
            // InternalMyDsl.g:3606:2: ()
            {
             before(grammarAccess.getVoidAccess().getVoidAction_0()); 
            // InternalMyDsl.g:3607:2: ()
            // InternalMyDsl.g:3607:3: 
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
    // InternalMyDsl.g:3615:1: rule__Void__Group__1 : rule__Void__Group__1__Impl rule__Void__Group__2 ;
    public final void rule__Void__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3619:1: ( rule__Void__Group__1__Impl rule__Void__Group__2 )
            // InternalMyDsl.g:3620:2: rule__Void__Group__1__Impl rule__Void__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3627:1: rule__Void__Group__1__Impl : ( 'Void' ) ;
    public final void rule__Void__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3631:1: ( ( 'Void' ) )
            // InternalMyDsl.g:3632:1: ( 'Void' )
            {
            // InternalMyDsl.g:3632:1: ( 'Void' )
            // InternalMyDsl.g:3633:2: 'Void'
            {
             before(grammarAccess.getVoidAccess().getVoidKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:3642:1: rule__Void__Group__2 : rule__Void__Group__2__Impl ;
    public final void rule__Void__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3646:1: ( rule__Void__Group__2__Impl )
            // InternalMyDsl.g:3647:2: rule__Void__Group__2__Impl
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
    // InternalMyDsl.g:3653:1: rule__Void__Group__2__Impl : ( ( rule__Void__NameAssignment_2 ) ) ;
    public final void rule__Void__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3657:1: ( ( ( rule__Void__NameAssignment_2 ) ) )
            // InternalMyDsl.g:3658:1: ( ( rule__Void__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:3658:1: ( ( rule__Void__NameAssignment_2 ) )
            // InternalMyDsl.g:3659:2: ( rule__Void__NameAssignment_2 )
            {
             before(grammarAccess.getVoidAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3660:2: ( rule__Void__NameAssignment_2 )
            // InternalMyDsl.g:3660:3: rule__Void__NameAssignment_2
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


    // $ANTLR start "rule__Component_Impl__Group__0"
    // InternalMyDsl.g:3669:1: rule__Component_Impl__Group__0 : rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1 ;
    public final void rule__Component_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3673:1: ( rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1 )
            // InternalMyDsl.g:3674:2: rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3681:1: rule__Component_Impl__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3685:1: ( ( 'Component' ) )
            // InternalMyDsl.g:3686:1: ( 'Component' )
            {
            // InternalMyDsl.g:3686:1: ( 'Component' )
            // InternalMyDsl.g:3687:2: 'Component'
            {
             before(grammarAccess.getComponent_ImplAccess().getComponentKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:3696:1: rule__Component_Impl__Group__1 : rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2 ;
    public final void rule__Component_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3700:1: ( rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2 )
            // InternalMyDsl.g:3701:2: rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2
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
    // InternalMyDsl.g:3708:1: rule__Component_Impl__Group__1__Impl : ( ( rule__Component_Impl__NameAssignment_1 ) ) ;
    public final void rule__Component_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3712:1: ( ( ( rule__Component_Impl__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3713:1: ( ( rule__Component_Impl__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3713:1: ( ( rule__Component_Impl__NameAssignment_1 ) )
            // InternalMyDsl.g:3714:2: ( rule__Component_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3715:2: ( rule__Component_Impl__NameAssignment_1 )
            // InternalMyDsl.g:3715:3: rule__Component_Impl__NameAssignment_1
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
    // InternalMyDsl.g:3723:1: rule__Component_Impl__Group__2 : rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3 ;
    public final void rule__Component_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3727:1: ( rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3 )
            // InternalMyDsl.g:3728:2: rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3735:1: rule__Component_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3739:1: ( ( '{' ) )
            // InternalMyDsl.g:3740:1: ( '{' )
            {
            // InternalMyDsl.g:3740:1: ( '{' )
            // InternalMyDsl.g:3741:2: '{'
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
    // InternalMyDsl.g:3750:1: rule__Component_Impl__Group__3 : rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4 ;
    public final void rule__Component_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3754:1: ( rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4 )
            // InternalMyDsl.g:3755:2: rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3762:1: rule__Component_Impl__Group__3__Impl : ( ( rule__Component_Impl__Group_3__0 )? ) ;
    public final void rule__Component_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3766:1: ( ( ( rule__Component_Impl__Group_3__0 )? ) )
            // InternalMyDsl.g:3767:1: ( ( rule__Component_Impl__Group_3__0 )? )
            {
            // InternalMyDsl.g:3767:1: ( ( rule__Component_Impl__Group_3__0 )? )
            // InternalMyDsl.g:3768:2: ( rule__Component_Impl__Group_3__0 )?
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_3()); 
            // InternalMyDsl.g:3769:2: ( rule__Component_Impl__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==52) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:3769:3: rule__Component_Impl__Group_3__0
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
    // InternalMyDsl.g:3777:1: rule__Component_Impl__Group__4 : rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5 ;
    public final void rule__Component_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3781:1: ( rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5 )
            // InternalMyDsl.g:3782:2: rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5
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
    // InternalMyDsl.g:3789:1: rule__Component_Impl__Group__4__Impl : ( 'service' ) ;
    public final void rule__Component_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3793:1: ( ( 'service' ) )
            // InternalMyDsl.g:3794:1: ( 'service' )
            {
            // InternalMyDsl.g:3794:1: ( 'service' )
            // InternalMyDsl.g:3795:2: 'service'
            {
             before(grammarAccess.getComponent_ImplAccess().getServiceKeyword_4()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:3804:1: rule__Component_Impl__Group__5 : rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6 ;
    public final void rule__Component_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3808:1: ( rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6 )
            // InternalMyDsl.g:3809:2: rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3816:1: rule__Component_Impl__Group__5__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3820:1: ( ( '{' ) )
            // InternalMyDsl.g:3821:1: ( '{' )
            {
            // InternalMyDsl.g:3821:1: ( '{' )
            // InternalMyDsl.g:3822:2: '{'
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
    // InternalMyDsl.g:3831:1: rule__Component_Impl__Group__6 : rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7 ;
    public final void rule__Component_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3835:1: ( rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7 )
            // InternalMyDsl.g:3836:2: rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:3843:1: rule__Component_Impl__Group__6__Impl : ( ( rule__Component_Impl__ServiceAssignment_6 ) ) ;
    public final void rule__Component_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3847:1: ( ( ( rule__Component_Impl__ServiceAssignment_6 ) ) )
            // InternalMyDsl.g:3848:1: ( ( rule__Component_Impl__ServiceAssignment_6 ) )
            {
            // InternalMyDsl.g:3848:1: ( ( rule__Component_Impl__ServiceAssignment_6 ) )
            // InternalMyDsl.g:3849:2: ( rule__Component_Impl__ServiceAssignment_6 )
            {
             before(grammarAccess.getComponent_ImplAccess().getServiceAssignment_6()); 
            // InternalMyDsl.g:3850:2: ( rule__Component_Impl__ServiceAssignment_6 )
            // InternalMyDsl.g:3850:3: rule__Component_Impl__ServiceAssignment_6
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
    // InternalMyDsl.g:3858:1: rule__Component_Impl__Group__7 : rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8 ;
    public final void rule__Component_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3862:1: ( rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8 )
            // InternalMyDsl.g:3863:2: rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:3870:1: rule__Component_Impl__Group__7__Impl : ( ( rule__Component_Impl__Group_7__0 )* ) ;
    public final void rule__Component_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3874:1: ( ( ( rule__Component_Impl__Group_7__0 )* ) )
            // InternalMyDsl.g:3875:1: ( ( rule__Component_Impl__Group_7__0 )* )
            {
            // InternalMyDsl.g:3875:1: ( ( rule__Component_Impl__Group_7__0 )* )
            // InternalMyDsl.g:3876:2: ( rule__Component_Impl__Group_7__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_7()); 
            // InternalMyDsl.g:3877:2: ( rule__Component_Impl__Group_7__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:3877:3: rule__Component_Impl__Group_7__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Component_Impl__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMyDsl.g:3885:1: rule__Component_Impl__Group__8 : rule__Component_Impl__Group__8__Impl rule__Component_Impl__Group__9 ;
    public final void rule__Component_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3889:1: ( rule__Component_Impl__Group__8__Impl rule__Component_Impl__Group__9 )
            // InternalMyDsl.g:3890:2: rule__Component_Impl__Group__8__Impl rule__Component_Impl__Group__9
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3897:1: rule__Component_Impl__Group__8__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3901:1: ( ( '}' ) )
            // InternalMyDsl.g:3902:1: ( '}' )
            {
            // InternalMyDsl.g:3902:1: ( '}' )
            // InternalMyDsl.g:3903:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:3912:1: rule__Component_Impl__Group__9 : rule__Component_Impl__Group__9__Impl rule__Component_Impl__Group__10 ;
    public final void rule__Component_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3916:1: ( rule__Component_Impl__Group__9__Impl rule__Component_Impl__Group__10 )
            // InternalMyDsl.g:3917:2: rule__Component_Impl__Group__9__Impl rule__Component_Impl__Group__10
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3924:1: rule__Component_Impl__Group__9__Impl : ( ( rule__Component_Impl__Group_9__0 )? ) ;
    public final void rule__Component_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3928:1: ( ( ( rule__Component_Impl__Group_9__0 )? ) )
            // InternalMyDsl.g:3929:1: ( ( rule__Component_Impl__Group_9__0 )? )
            {
            // InternalMyDsl.g:3929:1: ( ( rule__Component_Impl__Group_9__0 )? )
            // InternalMyDsl.g:3930:2: ( rule__Component_Impl__Group_9__0 )?
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_9()); 
            // InternalMyDsl.g:3931:2: ( rule__Component_Impl__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:3931:3: rule__Component_Impl__Group_9__0
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
    // InternalMyDsl.g:3939:1: rule__Component_Impl__Group__10 : rule__Component_Impl__Group__10__Impl rule__Component_Impl__Group__11 ;
    public final void rule__Component_Impl__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3943:1: ( rule__Component_Impl__Group__10__Impl rule__Component_Impl__Group__11 )
            // InternalMyDsl.g:3944:2: rule__Component_Impl__Group__10__Impl rule__Component_Impl__Group__11
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3951:1: rule__Component_Impl__Group__10__Impl : ( 'providedrole' ) ;
    public final void rule__Component_Impl__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3955:1: ( ( 'providedrole' ) )
            // InternalMyDsl.g:3956:1: ( 'providedrole' )
            {
            // InternalMyDsl.g:3956:1: ( 'providedrole' )
            // InternalMyDsl.g:3957:2: 'providedrole'
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedroleKeyword_10()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:3966:1: rule__Component_Impl__Group__11 : rule__Component_Impl__Group__11__Impl rule__Component_Impl__Group__12 ;
    public final void rule__Component_Impl__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3970:1: ( rule__Component_Impl__Group__11__Impl rule__Component_Impl__Group__12 )
            // InternalMyDsl.g:3971:2: rule__Component_Impl__Group__11__Impl rule__Component_Impl__Group__12
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:3978:1: rule__Component_Impl__Group__11__Impl : ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) ) ;
    public final void rule__Component_Impl__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3982:1: ( ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) ) )
            // InternalMyDsl.g:3983:1: ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) )
            {
            // InternalMyDsl.g:3983:1: ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) )
            // InternalMyDsl.g:3984:2: ( rule__Component_Impl__ProvidedroleAssignment_11 )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedroleAssignment_11()); 
            // InternalMyDsl.g:3985:2: ( rule__Component_Impl__ProvidedroleAssignment_11 )
            // InternalMyDsl.g:3985:3: rule__Component_Impl__ProvidedroleAssignment_11
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
    // InternalMyDsl.g:3993:1: rule__Component_Impl__Group__12 : rule__Component_Impl__Group__12__Impl ;
    public final void rule__Component_Impl__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3997:1: ( rule__Component_Impl__Group__12__Impl )
            // InternalMyDsl.g:3998:2: rule__Component_Impl__Group__12__Impl
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
    // InternalMyDsl.g:4004:1: rule__Component_Impl__Group__12__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4008:1: ( ( '}' ) )
            // InternalMyDsl.g:4009:1: ( '}' )
            {
            // InternalMyDsl.g:4009:1: ( '}' )
            // InternalMyDsl.g:4010:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_12()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:4020:1: rule__Component_Impl__Group_3__0 : rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1 ;
    public final void rule__Component_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4024:1: ( rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1 )
            // InternalMyDsl.g:4025:2: rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1
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
    // InternalMyDsl.g:4032:1: rule__Component_Impl__Group_3__0__Impl : ( 'behaviourdescription' ) ;
    public final void rule__Component_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4036:1: ( ( 'behaviourdescription' ) )
            // InternalMyDsl.g:4037:1: ( 'behaviourdescription' )
            {
            // InternalMyDsl.g:4037:1: ( 'behaviourdescription' )
            // InternalMyDsl.g:4038:2: 'behaviourdescription'
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionKeyword_3_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:4047:1: rule__Component_Impl__Group_3__1 : rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2 ;
    public final void rule__Component_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4051:1: ( rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2 )
            // InternalMyDsl.g:4052:2: rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:4059:1: rule__Component_Impl__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4063:1: ( ( '{' ) )
            // InternalMyDsl.g:4064:1: ( '{' )
            {
            // InternalMyDsl.g:4064:1: ( '{' )
            // InternalMyDsl.g:4065:2: '{'
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
    // InternalMyDsl.g:4074:1: rule__Component_Impl__Group_3__2 : rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3 ;
    public final void rule__Component_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4078:1: ( rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3 )
            // InternalMyDsl.g:4079:2: rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:4086:1: rule__Component_Impl__Group_3__2__Impl : ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) ) ;
    public final void rule__Component_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4090:1: ( ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) ) )
            // InternalMyDsl.g:4091:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) )
            {
            // InternalMyDsl.g:4091:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) )
            // InternalMyDsl.g:4092:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 )
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionAssignment_3_2()); 
            // InternalMyDsl.g:4093:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 )
            // InternalMyDsl.g:4093:3: rule__Component_Impl__BehaviourdescriptionAssignment_3_2
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
    // InternalMyDsl.g:4101:1: rule__Component_Impl__Group_3__3 : rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4 ;
    public final void rule__Component_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4105:1: ( rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4 )
            // InternalMyDsl.g:4106:2: rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:4113:1: rule__Component_Impl__Group_3__3__Impl : ( ( rule__Component_Impl__Group_3_3__0 )* ) ;
    public final void rule__Component_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4117:1: ( ( ( rule__Component_Impl__Group_3_3__0 )* ) )
            // InternalMyDsl.g:4118:1: ( ( rule__Component_Impl__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:4118:1: ( ( rule__Component_Impl__Group_3_3__0 )* )
            // InternalMyDsl.g:4119:2: ( rule__Component_Impl__Group_3_3__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_3_3()); 
            // InternalMyDsl.g:4120:2: ( rule__Component_Impl__Group_3_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:4120:3: rule__Component_Impl__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Component_Impl__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMyDsl.g:4128:1: rule__Component_Impl__Group_3__4 : rule__Component_Impl__Group_3__4__Impl ;
    public final void rule__Component_Impl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4132:1: ( rule__Component_Impl__Group_3__4__Impl )
            // InternalMyDsl.g:4133:2: rule__Component_Impl__Group_3__4__Impl
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
    // InternalMyDsl.g:4139:1: rule__Component_Impl__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4143:1: ( ( '}' ) )
            // InternalMyDsl.g:4144:1: ( '}' )
            {
            // InternalMyDsl.g:4144:1: ( '}' )
            // InternalMyDsl.g:4145:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:4155:1: rule__Component_Impl__Group_3_3__0 : rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1 ;
    public final void rule__Component_Impl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4159:1: ( rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1 )
            // InternalMyDsl.g:4160:2: rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:4167:1: rule__Component_Impl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4171:1: ( ( ',' ) )
            // InternalMyDsl.g:4172:1: ( ',' )
            {
            // InternalMyDsl.g:4172:1: ( ',' )
            // InternalMyDsl.g:4173:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_3_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:4182:1: rule__Component_Impl__Group_3_3__1 : rule__Component_Impl__Group_3_3__1__Impl ;
    public final void rule__Component_Impl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4186:1: ( rule__Component_Impl__Group_3_3__1__Impl )
            // InternalMyDsl.g:4187:2: rule__Component_Impl__Group_3_3__1__Impl
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
    // InternalMyDsl.g:4193:1: rule__Component_Impl__Group_3_3__1__Impl : ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) ) ;
    public final void rule__Component_Impl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4197:1: ( ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:4198:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:4198:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) )
            // InternalMyDsl.g:4199:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionAssignment_3_3_1()); 
            // InternalMyDsl.g:4200:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 )
            // InternalMyDsl.g:4200:3: rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1
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
    // InternalMyDsl.g:4209:1: rule__Component_Impl__Group_7__0 : rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1 ;
    public final void rule__Component_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4213:1: ( rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1 )
            // InternalMyDsl.g:4214:2: rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:4221:1: rule__Component_Impl__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4225:1: ( ( ',' ) )
            // InternalMyDsl.g:4226:1: ( ',' )
            {
            // InternalMyDsl.g:4226:1: ( ',' )
            // InternalMyDsl.g:4227:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:4236:1: rule__Component_Impl__Group_7__1 : rule__Component_Impl__Group_7__1__Impl ;
    public final void rule__Component_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4240:1: ( rule__Component_Impl__Group_7__1__Impl )
            // InternalMyDsl.g:4241:2: rule__Component_Impl__Group_7__1__Impl
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
    // InternalMyDsl.g:4247:1: rule__Component_Impl__Group_7__1__Impl : ( ( rule__Component_Impl__ServiceAssignment_7_1 ) ) ;
    public final void rule__Component_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4251:1: ( ( ( rule__Component_Impl__ServiceAssignment_7_1 ) ) )
            // InternalMyDsl.g:4252:1: ( ( rule__Component_Impl__ServiceAssignment_7_1 ) )
            {
            // InternalMyDsl.g:4252:1: ( ( rule__Component_Impl__ServiceAssignment_7_1 ) )
            // InternalMyDsl.g:4253:2: ( rule__Component_Impl__ServiceAssignment_7_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getServiceAssignment_7_1()); 
            // InternalMyDsl.g:4254:2: ( rule__Component_Impl__ServiceAssignment_7_1 )
            // InternalMyDsl.g:4254:3: rule__Component_Impl__ServiceAssignment_7_1
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
    // InternalMyDsl.g:4263:1: rule__Component_Impl__Group_9__0 : rule__Component_Impl__Group_9__0__Impl rule__Component_Impl__Group_9__1 ;
    public final void rule__Component_Impl__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4267:1: ( rule__Component_Impl__Group_9__0__Impl rule__Component_Impl__Group_9__1 )
            // InternalMyDsl.g:4268:2: rule__Component_Impl__Group_9__0__Impl rule__Component_Impl__Group_9__1
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
    // InternalMyDsl.g:4275:1: rule__Component_Impl__Group_9__0__Impl : ( 'requiredrole' ) ;
    public final void rule__Component_Impl__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4279:1: ( ( 'requiredrole' ) )
            // InternalMyDsl.g:4280:1: ( 'requiredrole' )
            {
            // InternalMyDsl.g:4280:1: ( 'requiredrole' )
            // InternalMyDsl.g:4281:2: 'requiredrole'
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredroleKeyword_9_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:4290:1: rule__Component_Impl__Group_9__1 : rule__Component_Impl__Group_9__1__Impl rule__Component_Impl__Group_9__2 ;
    public final void rule__Component_Impl__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4294:1: ( rule__Component_Impl__Group_9__1__Impl rule__Component_Impl__Group_9__2 )
            // InternalMyDsl.g:4295:2: rule__Component_Impl__Group_9__1__Impl rule__Component_Impl__Group_9__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:4302:1: rule__Component_Impl__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4306:1: ( ( '{' ) )
            // InternalMyDsl.g:4307:1: ( '{' )
            {
            // InternalMyDsl.g:4307:1: ( '{' )
            // InternalMyDsl.g:4308:2: '{'
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
    // InternalMyDsl.g:4317:1: rule__Component_Impl__Group_9__2 : rule__Component_Impl__Group_9__2__Impl rule__Component_Impl__Group_9__3 ;
    public final void rule__Component_Impl__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4321:1: ( rule__Component_Impl__Group_9__2__Impl rule__Component_Impl__Group_9__3 )
            // InternalMyDsl.g:4322:2: rule__Component_Impl__Group_9__2__Impl rule__Component_Impl__Group_9__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:4329:1: rule__Component_Impl__Group_9__2__Impl : ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) ) ;
    public final void rule__Component_Impl__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4333:1: ( ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) ) )
            // InternalMyDsl.g:4334:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) )
            {
            // InternalMyDsl.g:4334:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) )
            // InternalMyDsl.g:4335:2: ( rule__Component_Impl__RequiredroleAssignment_9_2 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredroleAssignment_9_2()); 
            // InternalMyDsl.g:4336:2: ( rule__Component_Impl__RequiredroleAssignment_9_2 )
            // InternalMyDsl.g:4336:3: rule__Component_Impl__RequiredroleAssignment_9_2
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
    // InternalMyDsl.g:4344:1: rule__Component_Impl__Group_9__3 : rule__Component_Impl__Group_9__3__Impl rule__Component_Impl__Group_9__4 ;
    public final void rule__Component_Impl__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4348:1: ( rule__Component_Impl__Group_9__3__Impl rule__Component_Impl__Group_9__4 )
            // InternalMyDsl.g:4349:2: rule__Component_Impl__Group_9__3__Impl rule__Component_Impl__Group_9__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:4356:1: rule__Component_Impl__Group_9__3__Impl : ( ( rule__Component_Impl__Group_9_3__0 )* ) ;
    public final void rule__Component_Impl__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4360:1: ( ( ( rule__Component_Impl__Group_9_3__0 )* ) )
            // InternalMyDsl.g:4361:1: ( ( rule__Component_Impl__Group_9_3__0 )* )
            {
            // InternalMyDsl.g:4361:1: ( ( rule__Component_Impl__Group_9_3__0 )* )
            // InternalMyDsl.g:4362:2: ( rule__Component_Impl__Group_9_3__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_9_3()); 
            // InternalMyDsl.g:4363:2: ( rule__Component_Impl__Group_9_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:4363:3: rule__Component_Impl__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Component_Impl__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMyDsl.g:4371:1: rule__Component_Impl__Group_9__4 : rule__Component_Impl__Group_9__4__Impl ;
    public final void rule__Component_Impl__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4375:1: ( rule__Component_Impl__Group_9__4__Impl )
            // InternalMyDsl.g:4376:2: rule__Component_Impl__Group_9__4__Impl
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
    // InternalMyDsl.g:4382:1: rule__Component_Impl__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4386:1: ( ( '}' ) )
            // InternalMyDsl.g:4387:1: ( '}' )
            {
            // InternalMyDsl.g:4387:1: ( '}' )
            // InternalMyDsl.g:4388:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:4398:1: rule__Component_Impl__Group_9_3__0 : rule__Component_Impl__Group_9_3__0__Impl rule__Component_Impl__Group_9_3__1 ;
    public final void rule__Component_Impl__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4402:1: ( rule__Component_Impl__Group_9_3__0__Impl rule__Component_Impl__Group_9_3__1 )
            // InternalMyDsl.g:4403:2: rule__Component_Impl__Group_9_3__0__Impl rule__Component_Impl__Group_9_3__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:4410:1: rule__Component_Impl__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4414:1: ( ( ',' ) )
            // InternalMyDsl.g:4415:1: ( ',' )
            {
            // InternalMyDsl.g:4415:1: ( ',' )
            // InternalMyDsl.g:4416:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_9_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:4425:1: rule__Component_Impl__Group_9_3__1 : rule__Component_Impl__Group_9_3__1__Impl ;
    public final void rule__Component_Impl__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4429:1: ( rule__Component_Impl__Group_9_3__1__Impl )
            // InternalMyDsl.g:4430:2: rule__Component_Impl__Group_9_3__1__Impl
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
    // InternalMyDsl.g:4436:1: rule__Component_Impl__Group_9_3__1__Impl : ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) ) ;
    public final void rule__Component_Impl__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4440:1: ( ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) ) )
            // InternalMyDsl.g:4441:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) )
            {
            // InternalMyDsl.g:4441:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) )
            // InternalMyDsl.g:4442:2: ( rule__Component_Impl__RequiredroleAssignment_9_3_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredroleAssignment_9_3_1()); 
            // InternalMyDsl.g:4443:2: ( rule__Component_Impl__RequiredroleAssignment_9_3_1 )
            // InternalMyDsl.g:4443:3: rule__Component_Impl__RequiredroleAssignment_9_3_1
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
    // InternalMyDsl.g:4452:1: rule__BehaviourDescription_Impl__Group__0 : rule__BehaviourDescription_Impl__Group__0__Impl rule__BehaviourDescription_Impl__Group__1 ;
    public final void rule__BehaviourDescription_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4456:1: ( rule__BehaviourDescription_Impl__Group__0__Impl rule__BehaviourDescription_Impl__Group__1 )
            // InternalMyDsl.g:4457:2: rule__BehaviourDescription_Impl__Group__0__Impl rule__BehaviourDescription_Impl__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:4464:1: rule__BehaviourDescription_Impl__Group__0__Impl : ( () ) ;
    public final void rule__BehaviourDescription_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4468:1: ( ( () ) )
            // InternalMyDsl.g:4469:1: ( () )
            {
            // InternalMyDsl.g:4469:1: ( () )
            // InternalMyDsl.g:4470:2: ()
            {
             before(grammarAccess.getBehaviourDescription_ImplAccess().getBehaviourDescriptionAction_0()); 
            // InternalMyDsl.g:4471:2: ()
            // InternalMyDsl.g:4471:3: 
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
    // InternalMyDsl.g:4479:1: rule__BehaviourDescription_Impl__Group__1 : rule__BehaviourDescription_Impl__Group__1__Impl ;
    public final void rule__BehaviourDescription_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4483:1: ( rule__BehaviourDescription_Impl__Group__1__Impl )
            // InternalMyDsl.g:4484:2: rule__BehaviourDescription_Impl__Group__1__Impl
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
    // InternalMyDsl.g:4490:1: rule__BehaviourDescription_Impl__Group__1__Impl : ( 'BehaviourDescription' ) ;
    public final void rule__BehaviourDescription_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4494:1: ( ( 'BehaviourDescription' ) )
            // InternalMyDsl.g:4495:1: ( 'BehaviourDescription' )
            {
            // InternalMyDsl.g:4495:1: ( 'BehaviourDescription' )
            // InternalMyDsl.g:4496:2: 'BehaviourDescription'
            {
             before(grammarAccess.getBehaviourDescription_ImplAccess().getBehaviourDescriptionKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:4506:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4510:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalMyDsl.g:4511:2: rule__Service__Group__0__Impl rule__Service__Group__1
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
    // InternalMyDsl.g:4518:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4522:1: ( ( 'Service' ) )
            // InternalMyDsl.g:4523:1: ( 'Service' )
            {
            // InternalMyDsl.g:4523:1: ( 'Service' )
            // InternalMyDsl.g:4524:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:4533:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4537:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalMyDsl.g:4538:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:4545:1: rule__Service__Group__1__Impl : ( '{' ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4549:1: ( ( '{' ) )
            // InternalMyDsl.g:4550:1: ( '{' )
            {
            // InternalMyDsl.g:4550:1: ( '{' )
            // InternalMyDsl.g:4551:2: '{'
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
    // InternalMyDsl.g:4560:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4564:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalMyDsl.g:4565:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:4572:1: rule__Service__Group__2__Impl : ( 'correspondingSignatures' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4576:1: ( ( 'correspondingSignatures' ) )
            // InternalMyDsl.g:4577:1: ( 'correspondingSignatures' )
            {
            // InternalMyDsl.g:4577:1: ( 'correspondingSignatures' )
            // InternalMyDsl.g:4578:2: 'correspondingSignatures'
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesKeyword_2()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyDsl.g:4587:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4591:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalMyDsl.g:4592:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:4599:1: rule__Service__Group__3__Impl : ( '(' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4603:1: ( ( '(' ) )
            // InternalMyDsl.g:4604:1: ( '(' )
            {
            // InternalMyDsl.g:4604:1: ( '(' )
            // InternalMyDsl.g:4605:2: '('
            {
             before(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:4614:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4618:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalMyDsl.g:4619:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:4626:1: rule__Service__Group__4__Impl : ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4630:1: ( ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) ) )
            // InternalMyDsl.g:4631:1: ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) )
            {
            // InternalMyDsl.g:4631:1: ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) )
            // InternalMyDsl.g:4632:2: ( rule__Service__CorrespondingSignaturesAssignment_4 )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesAssignment_4()); 
            // InternalMyDsl.g:4633:2: ( rule__Service__CorrespondingSignaturesAssignment_4 )
            // InternalMyDsl.g:4633:3: rule__Service__CorrespondingSignaturesAssignment_4
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
    // InternalMyDsl.g:4641:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4645:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalMyDsl.g:4646:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:4653:1: rule__Service__Group__5__Impl : ( ( rule__Service__Group_5__0 )* ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4657:1: ( ( ( rule__Service__Group_5__0 )* ) )
            // InternalMyDsl.g:4658:1: ( ( rule__Service__Group_5__0 )* )
            {
            // InternalMyDsl.g:4658:1: ( ( rule__Service__Group_5__0 )* )
            // InternalMyDsl.g:4659:2: ( rule__Service__Group_5__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_5()); 
            // InternalMyDsl.g:4660:2: ( rule__Service__Group_5__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:4660:3: rule__Service__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Service__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMyDsl.g:4668:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4672:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalMyDsl.g:4673:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:4680:1: rule__Service__Group__6__Impl : ( ')' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4684:1: ( ( ')' ) )
            // InternalMyDsl.g:4685:1: ( ')' )
            {
            // InternalMyDsl.g:4685:1: ( ')' )
            // InternalMyDsl.g:4686:2: ')'
            {
             before(grammarAccess.getServiceAccess().getRightParenthesisKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:4695:1: rule__Service__Group__7 : rule__Service__Group__7__Impl ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4699:1: ( rule__Service__Group__7__Impl )
            // InternalMyDsl.g:4700:2: rule__Service__Group__7__Impl
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
    // InternalMyDsl.g:4706:1: rule__Service__Group__7__Impl : ( '}' ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4710:1: ( ( '}' ) )
            // InternalMyDsl.g:4711:1: ( '}' )
            {
            // InternalMyDsl.g:4711:1: ( '}' )
            // InternalMyDsl.g:4712:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:4722:1: rule__Service__Group_5__0 : rule__Service__Group_5__0__Impl rule__Service__Group_5__1 ;
    public final void rule__Service__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4726:1: ( rule__Service__Group_5__0__Impl rule__Service__Group_5__1 )
            // InternalMyDsl.g:4727:2: rule__Service__Group_5__0__Impl rule__Service__Group_5__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:4734:1: rule__Service__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4738:1: ( ( ',' ) )
            // InternalMyDsl.g:4739:1: ( ',' )
            {
            // InternalMyDsl.g:4739:1: ( ',' )
            // InternalMyDsl.g:4740:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:4749:1: rule__Service__Group_5__1 : rule__Service__Group_5__1__Impl ;
    public final void rule__Service__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4753:1: ( rule__Service__Group_5__1__Impl )
            // InternalMyDsl.g:4754:2: rule__Service__Group_5__1__Impl
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
    // InternalMyDsl.g:4760:1: rule__Service__Group_5__1__Impl : ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) ) ;
    public final void rule__Service__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4764:1: ( ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) ) )
            // InternalMyDsl.g:4765:1: ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) )
            {
            // InternalMyDsl.g:4765:1: ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) )
            // InternalMyDsl.g:4766:2: ( rule__Service__CorrespondingSignaturesAssignment_5_1 )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesAssignment_5_1()); 
            // InternalMyDsl.g:4767:2: ( rule__Service__CorrespondingSignaturesAssignment_5_1 )
            // InternalMyDsl.g:4767:3: rule__Service__CorrespondingSignaturesAssignment_5_1
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
    // InternalMyDsl.g:4776:1: rule__RequiredRole__Group__0 : rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 ;
    public final void rule__RequiredRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4780:1: ( rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 )
            // InternalMyDsl.g:4781:2: rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:4788:1: rule__RequiredRole__Group__0__Impl : ( 'RequiredRole' ) ;
    public final void rule__RequiredRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4792:1: ( ( 'RequiredRole' ) )
            // InternalMyDsl.g:4793:1: ( 'RequiredRole' )
            {
            // InternalMyDsl.g:4793:1: ( 'RequiredRole' )
            // InternalMyDsl.g:4794:2: 'RequiredRole'
            {
             before(grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:4803:1: rule__RequiredRole__Group__1 : rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 ;
    public final void rule__RequiredRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4807:1: ( rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 )
            // InternalMyDsl.g:4808:2: rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2
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
    // InternalMyDsl.g:4815:1: rule__RequiredRole__Group__1__Impl : ( ( rule__RequiredRole__NameAssignment_1 ) ) ;
    public final void rule__RequiredRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4819:1: ( ( ( rule__RequiredRole__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4820:1: ( ( rule__RequiredRole__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4820:1: ( ( rule__RequiredRole__NameAssignment_1 ) )
            // InternalMyDsl.g:4821:2: ( rule__RequiredRole__NameAssignment_1 )
            {
             before(grammarAccess.getRequiredRoleAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4822:2: ( rule__RequiredRole__NameAssignment_1 )
            // InternalMyDsl.g:4822:3: rule__RequiredRole__NameAssignment_1
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
    // InternalMyDsl.g:4830:1: rule__RequiredRole__Group__2 : rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3 ;
    public final void rule__RequiredRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4834:1: ( rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3 )
            // InternalMyDsl.g:4835:2: rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:4842:1: rule__RequiredRole__Group__2__Impl : ( '{' ) ;
    public final void rule__RequiredRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4846:1: ( ( '{' ) )
            // InternalMyDsl.g:4847:1: ( '{' )
            {
            // InternalMyDsl.g:4847:1: ( '{' )
            // InternalMyDsl.g:4848:2: '{'
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
    // InternalMyDsl.g:4857:1: rule__RequiredRole__Group__3 : rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4 ;
    public final void rule__RequiredRole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4861:1: ( rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4 )
            // InternalMyDsl.g:4862:2: rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:4869:1: rule__RequiredRole__Group__3__Impl : ( 'interface' ) ;
    public final void rule__RequiredRole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4873:1: ( ( 'interface' ) )
            // InternalMyDsl.g:4874:1: ( 'interface' )
            {
            // InternalMyDsl.g:4874:1: ( 'interface' )
            // InternalMyDsl.g:4875:2: 'interface'
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:4884:1: rule__RequiredRole__Group__4 : rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5 ;
    public final void rule__RequiredRole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4888:1: ( rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5 )
            // InternalMyDsl.g:4889:2: rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:4896:1: rule__RequiredRole__Group__4__Impl : ( ( rule__RequiredRole__InterfaceAssignment_4 ) ) ;
    public final void rule__RequiredRole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4900:1: ( ( ( rule__RequiredRole__InterfaceAssignment_4 ) ) )
            // InternalMyDsl.g:4901:1: ( ( rule__RequiredRole__InterfaceAssignment_4 ) )
            {
            // InternalMyDsl.g:4901:1: ( ( rule__RequiredRole__InterfaceAssignment_4 ) )
            // InternalMyDsl.g:4902:2: ( rule__RequiredRole__InterfaceAssignment_4 )
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceAssignment_4()); 
            // InternalMyDsl.g:4903:2: ( rule__RequiredRole__InterfaceAssignment_4 )
            // InternalMyDsl.g:4903:3: rule__RequiredRole__InterfaceAssignment_4
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
    // InternalMyDsl.g:4911:1: rule__RequiredRole__Group__5 : rule__RequiredRole__Group__5__Impl ;
    public final void rule__RequiredRole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4915:1: ( rule__RequiredRole__Group__5__Impl )
            // InternalMyDsl.g:4916:2: rule__RequiredRole__Group__5__Impl
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
    // InternalMyDsl.g:4922:1: rule__RequiredRole__Group__5__Impl : ( '}' ) ;
    public final void rule__RequiredRole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4926:1: ( ( '}' ) )
            // InternalMyDsl.g:4927:1: ( '}' )
            {
            // InternalMyDsl.g:4927:1: ( '}' )
            // InternalMyDsl.g:4928:2: '}'
            {
             before(grammarAccess.getRequiredRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:4938:1: rule__ProvidedRole__Group__0 : rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 ;
    public final void rule__ProvidedRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4942:1: ( rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 )
            // InternalMyDsl.g:4943:2: rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:4950:1: rule__ProvidedRole__Group__0__Impl : ( 'ProvidedRole' ) ;
    public final void rule__ProvidedRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4954:1: ( ( 'ProvidedRole' ) )
            // InternalMyDsl.g:4955:1: ( 'ProvidedRole' )
            {
            // InternalMyDsl.g:4955:1: ( 'ProvidedRole' )
            // InternalMyDsl.g:4956:2: 'ProvidedRole'
            {
             before(grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:4965:1: rule__ProvidedRole__Group__1 : rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 ;
    public final void rule__ProvidedRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4969:1: ( rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 )
            // InternalMyDsl.g:4970:2: rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2
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
    // InternalMyDsl.g:4977:1: rule__ProvidedRole__Group__1__Impl : ( ( rule__ProvidedRole__NameAssignment_1 ) ) ;
    public final void rule__ProvidedRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4981:1: ( ( ( rule__ProvidedRole__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4982:1: ( ( rule__ProvidedRole__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4982:1: ( ( rule__ProvidedRole__NameAssignment_1 ) )
            // InternalMyDsl.g:4983:2: ( rule__ProvidedRole__NameAssignment_1 )
            {
             before(grammarAccess.getProvidedRoleAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4984:2: ( rule__ProvidedRole__NameAssignment_1 )
            // InternalMyDsl.g:4984:3: rule__ProvidedRole__NameAssignment_1
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
    // InternalMyDsl.g:4992:1: rule__ProvidedRole__Group__2 : rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3 ;
    public final void rule__ProvidedRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4996:1: ( rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3 )
            // InternalMyDsl.g:4997:2: rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:5004:1: rule__ProvidedRole__Group__2__Impl : ( '{' ) ;
    public final void rule__ProvidedRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5008:1: ( ( '{' ) )
            // InternalMyDsl.g:5009:1: ( '{' )
            {
            // InternalMyDsl.g:5009:1: ( '{' )
            // InternalMyDsl.g:5010:2: '{'
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
    // InternalMyDsl.g:5019:1: rule__ProvidedRole__Group__3 : rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4 ;
    public final void rule__ProvidedRole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5023:1: ( rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4 )
            // InternalMyDsl.g:5024:2: rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:5031:1: rule__ProvidedRole__Group__3__Impl : ( 'interface' ) ;
    public final void rule__ProvidedRole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5035:1: ( ( 'interface' ) )
            // InternalMyDsl.g:5036:1: ( 'interface' )
            {
            // InternalMyDsl.g:5036:1: ( 'interface' )
            // InternalMyDsl.g:5037:2: 'interface'
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:5046:1: rule__ProvidedRole__Group__4 : rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5 ;
    public final void rule__ProvidedRole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5050:1: ( rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5 )
            // InternalMyDsl.g:5051:2: rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:5058:1: rule__ProvidedRole__Group__4__Impl : ( ( rule__ProvidedRole__InterfaceAssignment_4 ) ) ;
    public final void rule__ProvidedRole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5062:1: ( ( ( rule__ProvidedRole__InterfaceAssignment_4 ) ) )
            // InternalMyDsl.g:5063:1: ( ( rule__ProvidedRole__InterfaceAssignment_4 ) )
            {
            // InternalMyDsl.g:5063:1: ( ( rule__ProvidedRole__InterfaceAssignment_4 ) )
            // InternalMyDsl.g:5064:2: ( rule__ProvidedRole__InterfaceAssignment_4 )
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceAssignment_4()); 
            // InternalMyDsl.g:5065:2: ( rule__ProvidedRole__InterfaceAssignment_4 )
            // InternalMyDsl.g:5065:3: rule__ProvidedRole__InterfaceAssignment_4
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
    // InternalMyDsl.g:5073:1: rule__ProvidedRole__Group__5 : rule__ProvidedRole__Group__5__Impl ;
    public final void rule__ProvidedRole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5077:1: ( rule__ProvidedRole__Group__5__Impl )
            // InternalMyDsl.g:5078:2: rule__ProvidedRole__Group__5__Impl
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
    // InternalMyDsl.g:5084:1: rule__ProvidedRole__Group__5__Impl : ( '}' ) ;
    public final void rule__ProvidedRole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5088:1: ( ( '}' ) )
            // InternalMyDsl.g:5089:1: ( '}' )
            {
            // InternalMyDsl.g:5089:1: ( '}' )
            // InternalMyDsl.g:5090:2: '}'
            {
             before(grammarAccess.getProvidedRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:5100:1: rule__CompositeComponent__Group__0 : rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1 ;
    public final void rule__CompositeComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5104:1: ( rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1 )
            // InternalMyDsl.g:5105:2: rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:5112:1: rule__CompositeComponent__Group__0__Impl : ( 'CompositeComponent' ) ;
    public final void rule__CompositeComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5116:1: ( ( 'CompositeComponent' ) )
            // InternalMyDsl.g:5117:1: ( 'CompositeComponent' )
            {
            // InternalMyDsl.g:5117:1: ( 'CompositeComponent' )
            // InternalMyDsl.g:5118:2: 'CompositeComponent'
            {
             before(grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMyDsl.g:5127:1: rule__CompositeComponent__Group__1 : rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2 ;
    public final void rule__CompositeComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5131:1: ( rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2 )
            // InternalMyDsl.g:5132:2: rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2
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
    // InternalMyDsl.g:5139:1: rule__CompositeComponent__Group__1__Impl : ( ( rule__CompositeComponent__NameAssignment_1 ) ) ;
    public final void rule__CompositeComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5143:1: ( ( ( rule__CompositeComponent__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5144:1: ( ( rule__CompositeComponent__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5144:1: ( ( rule__CompositeComponent__NameAssignment_1 ) )
            // InternalMyDsl.g:5145:2: ( rule__CompositeComponent__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5146:2: ( rule__CompositeComponent__NameAssignment_1 )
            // InternalMyDsl.g:5146:3: rule__CompositeComponent__NameAssignment_1
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
    // InternalMyDsl.g:5154:1: rule__CompositeComponent__Group__2 : rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3 ;
    public final void rule__CompositeComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5158:1: ( rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3 )
            // InternalMyDsl.g:5159:2: rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:5166:1: rule__CompositeComponent__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5170:1: ( ( '{' ) )
            // InternalMyDsl.g:5171:1: ( '{' )
            {
            // InternalMyDsl.g:5171:1: ( '{' )
            // InternalMyDsl.g:5172:2: '{'
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
    // InternalMyDsl.g:5181:1: rule__CompositeComponent__Group__3 : rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4 ;
    public final void rule__CompositeComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5185:1: ( rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4 )
            // InternalMyDsl.g:5186:2: rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:5193:1: rule__CompositeComponent__Group__3__Impl : ( ( rule__CompositeComponent__Group_3__0 )? ) ;
    public final void rule__CompositeComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5197:1: ( ( ( rule__CompositeComponent__Group_3__0 )? ) )
            // InternalMyDsl.g:5198:1: ( ( rule__CompositeComponent__Group_3__0 )? )
            {
            // InternalMyDsl.g:5198:1: ( ( rule__CompositeComponent__Group_3__0 )? )
            // InternalMyDsl.g:5199:2: ( rule__CompositeComponent__Group_3__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_3()); 
            // InternalMyDsl.g:5200:2: ( rule__CompositeComponent__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==52) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:5200:3: rule__CompositeComponent__Group_3__0
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
    // InternalMyDsl.g:5208:1: rule__CompositeComponent__Group__4 : rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5 ;
    public final void rule__CompositeComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5212:1: ( rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5 )
            // InternalMyDsl.g:5213:2: rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5
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
    // InternalMyDsl.g:5220:1: rule__CompositeComponent__Group__4__Impl : ( 'service' ) ;
    public final void rule__CompositeComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5224:1: ( ( 'service' ) )
            // InternalMyDsl.g:5225:1: ( 'service' )
            {
            // InternalMyDsl.g:5225:1: ( 'service' )
            // InternalMyDsl.g:5226:2: 'service'
            {
             before(grammarAccess.getCompositeComponentAccess().getServiceKeyword_4()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:5235:1: rule__CompositeComponent__Group__5 : rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6 ;
    public final void rule__CompositeComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5239:1: ( rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6 )
            // InternalMyDsl.g:5240:2: rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:5247:1: rule__CompositeComponent__Group__5__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5251:1: ( ( '{' ) )
            // InternalMyDsl.g:5252:1: ( '{' )
            {
            // InternalMyDsl.g:5252:1: ( '{' )
            // InternalMyDsl.g:5253:2: '{'
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
    // InternalMyDsl.g:5262:1: rule__CompositeComponent__Group__6 : rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7 ;
    public final void rule__CompositeComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5266:1: ( rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7 )
            // InternalMyDsl.g:5267:2: rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:5274:1: rule__CompositeComponent__Group__6__Impl : ( ( rule__CompositeComponent__ServiceAssignment_6 ) ) ;
    public final void rule__CompositeComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5278:1: ( ( ( rule__CompositeComponent__ServiceAssignment_6 ) ) )
            // InternalMyDsl.g:5279:1: ( ( rule__CompositeComponent__ServiceAssignment_6 ) )
            {
            // InternalMyDsl.g:5279:1: ( ( rule__CompositeComponent__ServiceAssignment_6 ) )
            // InternalMyDsl.g:5280:2: ( rule__CompositeComponent__ServiceAssignment_6 )
            {
             before(grammarAccess.getCompositeComponentAccess().getServiceAssignment_6()); 
            // InternalMyDsl.g:5281:2: ( rule__CompositeComponent__ServiceAssignment_6 )
            // InternalMyDsl.g:5281:3: rule__CompositeComponent__ServiceAssignment_6
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
    // InternalMyDsl.g:5289:1: rule__CompositeComponent__Group__7 : rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8 ;
    public final void rule__CompositeComponent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5293:1: ( rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8 )
            // InternalMyDsl.g:5294:2: rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:5301:1: rule__CompositeComponent__Group__7__Impl : ( ( rule__CompositeComponent__Group_7__0 )* ) ;
    public final void rule__CompositeComponent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5305:1: ( ( ( rule__CompositeComponent__Group_7__0 )* ) )
            // InternalMyDsl.g:5306:1: ( ( rule__CompositeComponent__Group_7__0 )* )
            {
            // InternalMyDsl.g:5306:1: ( ( rule__CompositeComponent__Group_7__0 )* )
            // InternalMyDsl.g:5307:2: ( rule__CompositeComponent__Group_7__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_7()); 
            // InternalMyDsl.g:5308:2: ( rule__CompositeComponent__Group_7__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==28) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:5308:3: rule__CompositeComponent__Group_7__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeComponent__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalMyDsl.g:5316:1: rule__CompositeComponent__Group__8 : rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9 ;
    public final void rule__CompositeComponent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5320:1: ( rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9 )
            // InternalMyDsl.g:5321:2: rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:5328:1: rule__CompositeComponent__Group__8__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5332:1: ( ( '}' ) )
            // InternalMyDsl.g:5333:1: ( '}' )
            {
            // InternalMyDsl.g:5333:1: ( '}' )
            // InternalMyDsl.g:5334:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:5343:1: rule__CompositeComponent__Group__9 : rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10 ;
    public final void rule__CompositeComponent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5347:1: ( rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10 )
            // InternalMyDsl.g:5348:2: rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:5355:1: rule__CompositeComponent__Group__9__Impl : ( ( rule__CompositeComponent__Group_9__0 )? ) ;
    public final void rule__CompositeComponent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5359:1: ( ( ( rule__CompositeComponent__Group_9__0 )? ) )
            // InternalMyDsl.g:5360:1: ( ( rule__CompositeComponent__Group_9__0 )? )
            {
            // InternalMyDsl.g:5360:1: ( ( rule__CompositeComponent__Group_9__0 )? )
            // InternalMyDsl.g:5361:2: ( rule__CompositeComponent__Group_9__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_9()); 
            // InternalMyDsl.g:5362:2: ( rule__CompositeComponent__Group_9__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:5362:3: rule__CompositeComponent__Group_9__0
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
    // InternalMyDsl.g:5370:1: rule__CompositeComponent__Group__10 : rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11 ;
    public final void rule__CompositeComponent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5374:1: ( rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11 )
            // InternalMyDsl.g:5375:2: rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:5382:1: rule__CompositeComponent__Group__10__Impl : ( 'providedrole' ) ;
    public final void rule__CompositeComponent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5386:1: ( ( 'providedrole' ) )
            // InternalMyDsl.g:5387:1: ( 'providedrole' )
            {
            // InternalMyDsl.g:5387:1: ( 'providedrole' )
            // InternalMyDsl.g:5388:2: 'providedrole'
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedroleKeyword_10()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:5397:1: rule__CompositeComponent__Group__11 : rule__CompositeComponent__Group__11__Impl rule__CompositeComponent__Group__12 ;
    public final void rule__CompositeComponent__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5401:1: ( rule__CompositeComponent__Group__11__Impl rule__CompositeComponent__Group__12 )
            // InternalMyDsl.g:5402:2: rule__CompositeComponent__Group__11__Impl rule__CompositeComponent__Group__12
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:5409:1: rule__CompositeComponent__Group__11__Impl : ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) ) ;
    public final void rule__CompositeComponent__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5413:1: ( ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) ) )
            // InternalMyDsl.g:5414:1: ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) )
            {
            // InternalMyDsl.g:5414:1: ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) )
            // InternalMyDsl.g:5415:2: ( rule__CompositeComponent__ProvidedroleAssignment_11 )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedroleAssignment_11()); 
            // InternalMyDsl.g:5416:2: ( rule__CompositeComponent__ProvidedroleAssignment_11 )
            // InternalMyDsl.g:5416:3: rule__CompositeComponent__ProvidedroleAssignment_11
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
    // InternalMyDsl.g:5424:1: rule__CompositeComponent__Group__12 : rule__CompositeComponent__Group__12__Impl rule__CompositeComponent__Group__13 ;
    public final void rule__CompositeComponent__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5428:1: ( rule__CompositeComponent__Group__12__Impl rule__CompositeComponent__Group__13 )
            // InternalMyDsl.g:5429:2: rule__CompositeComponent__Group__12__Impl rule__CompositeComponent__Group__13
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
    // InternalMyDsl.g:5436:1: rule__CompositeComponent__Group__12__Impl : ( 'assemblycontext' ) ;
    public final void rule__CompositeComponent__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5440:1: ( ( 'assemblycontext' ) )
            // InternalMyDsl.g:5441:1: ( 'assemblycontext' )
            {
            // InternalMyDsl.g:5441:1: ( 'assemblycontext' )
            // InternalMyDsl.g:5442:2: 'assemblycontext'
            {
             before(grammarAccess.getCompositeComponentAccess().getAssemblycontextKeyword_12()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:5451:1: rule__CompositeComponent__Group__13 : rule__CompositeComponent__Group__13__Impl rule__CompositeComponent__Group__14 ;
    public final void rule__CompositeComponent__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5455:1: ( rule__CompositeComponent__Group__13__Impl rule__CompositeComponent__Group__14 )
            // InternalMyDsl.g:5456:2: rule__CompositeComponent__Group__13__Impl rule__CompositeComponent__Group__14
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:5463:1: rule__CompositeComponent__Group__13__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5467:1: ( ( '{' ) )
            // InternalMyDsl.g:5468:1: ( '{' )
            {
            // InternalMyDsl.g:5468:1: ( '{' )
            // InternalMyDsl.g:5469:2: '{'
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
    // InternalMyDsl.g:5478:1: rule__CompositeComponent__Group__14 : rule__CompositeComponent__Group__14__Impl rule__CompositeComponent__Group__15 ;
    public final void rule__CompositeComponent__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5482:1: ( rule__CompositeComponent__Group__14__Impl rule__CompositeComponent__Group__15 )
            // InternalMyDsl.g:5483:2: rule__CompositeComponent__Group__14__Impl rule__CompositeComponent__Group__15
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:5490:1: rule__CompositeComponent__Group__14__Impl : ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) ) ;
    public final void rule__CompositeComponent__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5494:1: ( ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) ) )
            // InternalMyDsl.g:5495:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) )
            {
            // InternalMyDsl.g:5495:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) )
            // InternalMyDsl.g:5496:2: ( rule__CompositeComponent__AssemblycontextAssignment_14 )
            {
             before(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssignment_14()); 
            // InternalMyDsl.g:5497:2: ( rule__CompositeComponent__AssemblycontextAssignment_14 )
            // InternalMyDsl.g:5497:3: rule__CompositeComponent__AssemblycontextAssignment_14
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
    // InternalMyDsl.g:5505:1: rule__CompositeComponent__Group__15 : rule__CompositeComponent__Group__15__Impl rule__CompositeComponent__Group__16 ;
    public final void rule__CompositeComponent__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5509:1: ( rule__CompositeComponent__Group__15__Impl rule__CompositeComponent__Group__16 )
            // InternalMyDsl.g:5510:2: rule__CompositeComponent__Group__15__Impl rule__CompositeComponent__Group__16
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:5517:1: rule__CompositeComponent__Group__15__Impl : ( ( rule__CompositeComponent__Group_15__0 )* ) ;
    public final void rule__CompositeComponent__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5521:1: ( ( ( rule__CompositeComponent__Group_15__0 )* ) )
            // InternalMyDsl.g:5522:1: ( ( rule__CompositeComponent__Group_15__0 )* )
            {
            // InternalMyDsl.g:5522:1: ( ( rule__CompositeComponent__Group_15__0 )* )
            // InternalMyDsl.g:5523:2: ( rule__CompositeComponent__Group_15__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_15()); 
            // InternalMyDsl.g:5524:2: ( rule__CompositeComponent__Group_15__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==28) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:5524:3: rule__CompositeComponent__Group_15__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeComponent__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalMyDsl.g:5532:1: rule__CompositeComponent__Group__16 : rule__CompositeComponent__Group__16__Impl rule__CompositeComponent__Group__17 ;
    public final void rule__CompositeComponent__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5536:1: ( rule__CompositeComponent__Group__16__Impl rule__CompositeComponent__Group__17 )
            // InternalMyDsl.g:5537:2: rule__CompositeComponent__Group__16__Impl rule__CompositeComponent__Group__17
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:5544:1: rule__CompositeComponent__Group__16__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5548:1: ( ( '}' ) )
            // InternalMyDsl.g:5549:1: ( '}' )
            {
            // InternalMyDsl.g:5549:1: ( '}' )
            // InternalMyDsl.g:5550:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_16()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:5559:1: rule__CompositeComponent__Group__17 : rule__CompositeComponent__Group__17__Impl rule__CompositeComponent__Group__18 ;
    public final void rule__CompositeComponent__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5563:1: ( rule__CompositeComponent__Group__17__Impl rule__CompositeComponent__Group__18 )
            // InternalMyDsl.g:5564:2: rule__CompositeComponent__Group__17__Impl rule__CompositeComponent__Group__18
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
    // InternalMyDsl.g:5571:1: rule__CompositeComponent__Group__17__Impl : ( 'delegationconnector' ) ;
    public final void rule__CompositeComponent__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5575:1: ( ( 'delegationconnector' ) )
            // InternalMyDsl.g:5576:1: ( 'delegationconnector' )
            {
            // InternalMyDsl.g:5576:1: ( 'delegationconnector' )
            // InternalMyDsl.g:5577:2: 'delegationconnector'
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorKeyword_17()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMyDsl.g:5586:1: rule__CompositeComponent__Group__18 : rule__CompositeComponent__Group__18__Impl rule__CompositeComponent__Group__19 ;
    public final void rule__CompositeComponent__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5590:1: ( rule__CompositeComponent__Group__18__Impl rule__CompositeComponent__Group__19 )
            // InternalMyDsl.g:5591:2: rule__CompositeComponent__Group__18__Impl rule__CompositeComponent__Group__19
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:5598:1: rule__CompositeComponent__Group__18__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5602:1: ( ( '{' ) )
            // InternalMyDsl.g:5603:1: ( '{' )
            {
            // InternalMyDsl.g:5603:1: ( '{' )
            // InternalMyDsl.g:5604:2: '{'
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
    // InternalMyDsl.g:5613:1: rule__CompositeComponent__Group__19 : rule__CompositeComponent__Group__19__Impl rule__CompositeComponent__Group__20 ;
    public final void rule__CompositeComponent__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5617:1: ( rule__CompositeComponent__Group__19__Impl rule__CompositeComponent__Group__20 )
            // InternalMyDsl.g:5618:2: rule__CompositeComponent__Group__19__Impl rule__CompositeComponent__Group__20
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:5625:1: rule__CompositeComponent__Group__19__Impl : ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) ) ;
    public final void rule__CompositeComponent__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5629:1: ( ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) ) )
            // InternalMyDsl.g:5630:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) )
            {
            // InternalMyDsl.g:5630:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) )
            // InternalMyDsl.g:5631:2: ( rule__CompositeComponent__DelegationconnectorAssignment_19 )
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorAssignment_19()); 
            // InternalMyDsl.g:5632:2: ( rule__CompositeComponent__DelegationconnectorAssignment_19 )
            // InternalMyDsl.g:5632:3: rule__CompositeComponent__DelegationconnectorAssignment_19
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
    // InternalMyDsl.g:5640:1: rule__CompositeComponent__Group__20 : rule__CompositeComponent__Group__20__Impl rule__CompositeComponent__Group__21 ;
    public final void rule__CompositeComponent__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5644:1: ( rule__CompositeComponent__Group__20__Impl rule__CompositeComponent__Group__21 )
            // InternalMyDsl.g:5645:2: rule__CompositeComponent__Group__20__Impl rule__CompositeComponent__Group__21
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:5652:1: rule__CompositeComponent__Group__20__Impl : ( ( rule__CompositeComponent__Group_20__0 )* ) ;
    public final void rule__CompositeComponent__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5656:1: ( ( ( rule__CompositeComponent__Group_20__0 )* ) )
            // InternalMyDsl.g:5657:1: ( ( rule__CompositeComponent__Group_20__0 )* )
            {
            // InternalMyDsl.g:5657:1: ( ( rule__CompositeComponent__Group_20__0 )* )
            // InternalMyDsl.g:5658:2: ( rule__CompositeComponent__Group_20__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_20()); 
            // InternalMyDsl.g:5659:2: ( rule__CompositeComponent__Group_20__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==28) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:5659:3: rule__CompositeComponent__Group_20__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeComponent__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalMyDsl.g:5667:1: rule__CompositeComponent__Group__21 : rule__CompositeComponent__Group__21__Impl rule__CompositeComponent__Group__22 ;
    public final void rule__CompositeComponent__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5671:1: ( rule__CompositeComponent__Group__21__Impl rule__CompositeComponent__Group__22 )
            // InternalMyDsl.g:5672:2: rule__CompositeComponent__Group__21__Impl rule__CompositeComponent__Group__22
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:5679:1: rule__CompositeComponent__Group__21__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5683:1: ( ( '}' ) )
            // InternalMyDsl.g:5684:1: ( '}' )
            {
            // InternalMyDsl.g:5684:1: ( '}' )
            // InternalMyDsl.g:5685:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_21()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:5694:1: rule__CompositeComponent__Group__22 : rule__CompositeComponent__Group__22__Impl ;
    public final void rule__CompositeComponent__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5698:1: ( rule__CompositeComponent__Group__22__Impl )
            // InternalMyDsl.g:5699:2: rule__CompositeComponent__Group__22__Impl
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
    // InternalMyDsl.g:5705:1: rule__CompositeComponent__Group__22__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5709:1: ( ( '}' ) )
            // InternalMyDsl.g:5710:1: ( '}' )
            {
            // InternalMyDsl.g:5710:1: ( '}' )
            // InternalMyDsl.g:5711:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_22()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:5721:1: rule__CompositeComponent__Group_3__0 : rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1 ;
    public final void rule__CompositeComponent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5725:1: ( rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1 )
            // InternalMyDsl.g:5726:2: rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1
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
    // InternalMyDsl.g:5733:1: rule__CompositeComponent__Group_3__0__Impl : ( 'behaviourdescription' ) ;
    public final void rule__CompositeComponent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5737:1: ( ( 'behaviourdescription' ) )
            // InternalMyDsl.g:5738:1: ( 'behaviourdescription' )
            {
            // InternalMyDsl.g:5738:1: ( 'behaviourdescription' )
            // InternalMyDsl.g:5739:2: 'behaviourdescription'
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionKeyword_3_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:5748:1: rule__CompositeComponent__Group_3__1 : rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2 ;
    public final void rule__CompositeComponent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5752:1: ( rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2 )
            // InternalMyDsl.g:5753:2: rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:5760:1: rule__CompositeComponent__Group_3__1__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5764:1: ( ( '{' ) )
            // InternalMyDsl.g:5765:1: ( '{' )
            {
            // InternalMyDsl.g:5765:1: ( '{' )
            // InternalMyDsl.g:5766:2: '{'
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
    // InternalMyDsl.g:5775:1: rule__CompositeComponent__Group_3__2 : rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3 ;
    public final void rule__CompositeComponent__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5779:1: ( rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3 )
            // InternalMyDsl.g:5780:2: rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:5787:1: rule__CompositeComponent__Group_3__2__Impl : ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) ) ;
    public final void rule__CompositeComponent__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5791:1: ( ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) ) )
            // InternalMyDsl.g:5792:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) )
            {
            // InternalMyDsl.g:5792:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) )
            // InternalMyDsl.g:5793:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 )
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionAssignment_3_2()); 
            // InternalMyDsl.g:5794:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 )
            // InternalMyDsl.g:5794:3: rule__CompositeComponent__BehaviourdescriptionAssignment_3_2
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
    // InternalMyDsl.g:5802:1: rule__CompositeComponent__Group_3__3 : rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4 ;
    public final void rule__CompositeComponent__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5806:1: ( rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4 )
            // InternalMyDsl.g:5807:2: rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:5814:1: rule__CompositeComponent__Group_3__3__Impl : ( ( rule__CompositeComponent__Group_3_3__0 )* ) ;
    public final void rule__CompositeComponent__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5818:1: ( ( ( rule__CompositeComponent__Group_3_3__0 )* ) )
            // InternalMyDsl.g:5819:1: ( ( rule__CompositeComponent__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:5819:1: ( ( rule__CompositeComponent__Group_3_3__0 )* )
            // InternalMyDsl.g:5820:2: ( rule__CompositeComponent__Group_3_3__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_3_3()); 
            // InternalMyDsl.g:5821:2: ( rule__CompositeComponent__Group_3_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==28) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:5821:3: rule__CompositeComponent__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeComponent__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalMyDsl.g:5829:1: rule__CompositeComponent__Group_3__4 : rule__CompositeComponent__Group_3__4__Impl ;
    public final void rule__CompositeComponent__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5833:1: ( rule__CompositeComponent__Group_3__4__Impl )
            // InternalMyDsl.g:5834:2: rule__CompositeComponent__Group_3__4__Impl
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
    // InternalMyDsl.g:5840:1: rule__CompositeComponent__Group_3__4__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5844:1: ( ( '}' ) )
            // InternalMyDsl.g:5845:1: ( '}' )
            {
            // InternalMyDsl.g:5845:1: ( '}' )
            // InternalMyDsl.g:5846:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:5856:1: rule__CompositeComponent__Group_3_3__0 : rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1 ;
    public final void rule__CompositeComponent__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5860:1: ( rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1 )
            // InternalMyDsl.g:5861:2: rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:5868:1: rule__CompositeComponent__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5872:1: ( ( ',' ) )
            // InternalMyDsl.g:5873:1: ( ',' )
            {
            // InternalMyDsl.g:5873:1: ( ',' )
            // InternalMyDsl.g:5874:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:5883:1: rule__CompositeComponent__Group_3_3__1 : rule__CompositeComponent__Group_3_3__1__Impl ;
    public final void rule__CompositeComponent__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5887:1: ( rule__CompositeComponent__Group_3_3__1__Impl )
            // InternalMyDsl.g:5888:2: rule__CompositeComponent__Group_3_3__1__Impl
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
    // InternalMyDsl.g:5894:1: rule__CompositeComponent__Group_3_3__1__Impl : ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) ) ;
    public final void rule__CompositeComponent__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5898:1: ( ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:5899:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:5899:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) )
            // InternalMyDsl.g:5900:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionAssignment_3_3_1()); 
            // InternalMyDsl.g:5901:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 )
            // InternalMyDsl.g:5901:3: rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1
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
    // InternalMyDsl.g:5910:1: rule__CompositeComponent__Group_7__0 : rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1 ;
    public final void rule__CompositeComponent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5914:1: ( rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1 )
            // InternalMyDsl.g:5915:2: rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:5922:1: rule__CompositeComponent__Group_7__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5926:1: ( ( ',' ) )
            // InternalMyDsl.g:5927:1: ( ',' )
            {
            // InternalMyDsl.g:5927:1: ( ',' )
            // InternalMyDsl.g:5928:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:5937:1: rule__CompositeComponent__Group_7__1 : rule__CompositeComponent__Group_7__1__Impl ;
    public final void rule__CompositeComponent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5941:1: ( rule__CompositeComponent__Group_7__1__Impl )
            // InternalMyDsl.g:5942:2: rule__CompositeComponent__Group_7__1__Impl
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
    // InternalMyDsl.g:5948:1: rule__CompositeComponent__Group_7__1__Impl : ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) ) ;
    public final void rule__CompositeComponent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5952:1: ( ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) ) )
            // InternalMyDsl.g:5953:1: ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) )
            {
            // InternalMyDsl.g:5953:1: ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) )
            // InternalMyDsl.g:5954:2: ( rule__CompositeComponent__ServiceAssignment_7_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getServiceAssignment_7_1()); 
            // InternalMyDsl.g:5955:2: ( rule__CompositeComponent__ServiceAssignment_7_1 )
            // InternalMyDsl.g:5955:3: rule__CompositeComponent__ServiceAssignment_7_1
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
    // InternalMyDsl.g:5964:1: rule__CompositeComponent__Group_9__0 : rule__CompositeComponent__Group_9__0__Impl rule__CompositeComponent__Group_9__1 ;
    public final void rule__CompositeComponent__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5968:1: ( rule__CompositeComponent__Group_9__0__Impl rule__CompositeComponent__Group_9__1 )
            // InternalMyDsl.g:5969:2: rule__CompositeComponent__Group_9__0__Impl rule__CompositeComponent__Group_9__1
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
    // InternalMyDsl.g:5976:1: rule__CompositeComponent__Group_9__0__Impl : ( 'requiredrole' ) ;
    public final void rule__CompositeComponent__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5980:1: ( ( 'requiredrole' ) )
            // InternalMyDsl.g:5981:1: ( 'requiredrole' )
            {
            // InternalMyDsl.g:5981:1: ( 'requiredrole' )
            // InternalMyDsl.g:5982:2: 'requiredrole'
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredroleKeyword_9_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:5991:1: rule__CompositeComponent__Group_9__1 : rule__CompositeComponent__Group_9__1__Impl rule__CompositeComponent__Group_9__2 ;
    public final void rule__CompositeComponent__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5995:1: ( rule__CompositeComponent__Group_9__1__Impl rule__CompositeComponent__Group_9__2 )
            // InternalMyDsl.g:5996:2: rule__CompositeComponent__Group_9__1__Impl rule__CompositeComponent__Group_9__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:6003:1: rule__CompositeComponent__Group_9__1__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6007:1: ( ( '{' ) )
            // InternalMyDsl.g:6008:1: ( '{' )
            {
            // InternalMyDsl.g:6008:1: ( '{' )
            // InternalMyDsl.g:6009:2: '{'
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
    // InternalMyDsl.g:6018:1: rule__CompositeComponent__Group_9__2 : rule__CompositeComponent__Group_9__2__Impl rule__CompositeComponent__Group_9__3 ;
    public final void rule__CompositeComponent__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6022:1: ( rule__CompositeComponent__Group_9__2__Impl rule__CompositeComponent__Group_9__3 )
            // InternalMyDsl.g:6023:2: rule__CompositeComponent__Group_9__2__Impl rule__CompositeComponent__Group_9__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:6030:1: rule__CompositeComponent__Group_9__2__Impl : ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) ) ;
    public final void rule__CompositeComponent__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6034:1: ( ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) ) )
            // InternalMyDsl.g:6035:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) )
            {
            // InternalMyDsl.g:6035:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) )
            // InternalMyDsl.g:6036:2: ( rule__CompositeComponent__RequiredroleAssignment_9_2 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredroleAssignment_9_2()); 
            // InternalMyDsl.g:6037:2: ( rule__CompositeComponent__RequiredroleAssignment_9_2 )
            // InternalMyDsl.g:6037:3: rule__CompositeComponent__RequiredroleAssignment_9_2
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
    // InternalMyDsl.g:6045:1: rule__CompositeComponent__Group_9__3 : rule__CompositeComponent__Group_9__3__Impl rule__CompositeComponent__Group_9__4 ;
    public final void rule__CompositeComponent__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6049:1: ( rule__CompositeComponent__Group_9__3__Impl rule__CompositeComponent__Group_9__4 )
            // InternalMyDsl.g:6050:2: rule__CompositeComponent__Group_9__3__Impl rule__CompositeComponent__Group_9__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:6057:1: rule__CompositeComponent__Group_9__3__Impl : ( ( rule__CompositeComponent__Group_9_3__0 )* ) ;
    public final void rule__CompositeComponent__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6061:1: ( ( ( rule__CompositeComponent__Group_9_3__0 )* ) )
            // InternalMyDsl.g:6062:1: ( ( rule__CompositeComponent__Group_9_3__0 )* )
            {
            // InternalMyDsl.g:6062:1: ( ( rule__CompositeComponent__Group_9_3__0 )* )
            // InternalMyDsl.g:6063:2: ( rule__CompositeComponent__Group_9_3__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_9_3()); 
            // InternalMyDsl.g:6064:2: ( rule__CompositeComponent__Group_9_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==28) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:6064:3: rule__CompositeComponent__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeComponent__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalMyDsl.g:6072:1: rule__CompositeComponent__Group_9__4 : rule__CompositeComponent__Group_9__4__Impl ;
    public final void rule__CompositeComponent__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6076:1: ( rule__CompositeComponent__Group_9__4__Impl )
            // InternalMyDsl.g:6077:2: rule__CompositeComponent__Group_9__4__Impl
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
    // InternalMyDsl.g:6083:1: rule__CompositeComponent__Group_9__4__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6087:1: ( ( '}' ) )
            // InternalMyDsl.g:6088:1: ( '}' )
            {
            // InternalMyDsl.g:6088:1: ( '}' )
            // InternalMyDsl.g:6089:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:6099:1: rule__CompositeComponent__Group_9_3__0 : rule__CompositeComponent__Group_9_3__0__Impl rule__CompositeComponent__Group_9_3__1 ;
    public final void rule__CompositeComponent__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6103:1: ( rule__CompositeComponent__Group_9_3__0__Impl rule__CompositeComponent__Group_9_3__1 )
            // InternalMyDsl.g:6104:2: rule__CompositeComponent__Group_9_3__0__Impl rule__CompositeComponent__Group_9_3__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:6111:1: rule__CompositeComponent__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6115:1: ( ( ',' ) )
            // InternalMyDsl.g:6116:1: ( ',' )
            {
            // InternalMyDsl.g:6116:1: ( ',' )
            // InternalMyDsl.g:6117:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_9_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:6126:1: rule__CompositeComponent__Group_9_3__1 : rule__CompositeComponent__Group_9_3__1__Impl ;
    public final void rule__CompositeComponent__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6130:1: ( rule__CompositeComponent__Group_9_3__1__Impl )
            // InternalMyDsl.g:6131:2: rule__CompositeComponent__Group_9_3__1__Impl
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
    // InternalMyDsl.g:6137:1: rule__CompositeComponent__Group_9_3__1__Impl : ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) ) ;
    public final void rule__CompositeComponent__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6141:1: ( ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) ) )
            // InternalMyDsl.g:6142:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) )
            {
            // InternalMyDsl.g:6142:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) )
            // InternalMyDsl.g:6143:2: ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredroleAssignment_9_3_1()); 
            // InternalMyDsl.g:6144:2: ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 )
            // InternalMyDsl.g:6144:3: rule__CompositeComponent__RequiredroleAssignment_9_3_1
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
    // InternalMyDsl.g:6153:1: rule__CompositeComponent__Group_15__0 : rule__CompositeComponent__Group_15__0__Impl rule__CompositeComponent__Group_15__1 ;
    public final void rule__CompositeComponent__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6157:1: ( rule__CompositeComponent__Group_15__0__Impl rule__CompositeComponent__Group_15__1 )
            // InternalMyDsl.g:6158:2: rule__CompositeComponent__Group_15__0__Impl rule__CompositeComponent__Group_15__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:6165:1: rule__CompositeComponent__Group_15__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6169:1: ( ( ',' ) )
            // InternalMyDsl.g:6170:1: ( ',' )
            {
            // InternalMyDsl.g:6170:1: ( ',' )
            // InternalMyDsl.g:6171:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_15_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:6180:1: rule__CompositeComponent__Group_15__1 : rule__CompositeComponent__Group_15__1__Impl ;
    public final void rule__CompositeComponent__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6184:1: ( rule__CompositeComponent__Group_15__1__Impl )
            // InternalMyDsl.g:6185:2: rule__CompositeComponent__Group_15__1__Impl
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
    // InternalMyDsl.g:6191:1: rule__CompositeComponent__Group_15__1__Impl : ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) ) ;
    public final void rule__CompositeComponent__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6195:1: ( ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) ) )
            // InternalMyDsl.g:6196:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) )
            {
            // InternalMyDsl.g:6196:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) )
            // InternalMyDsl.g:6197:2: ( rule__CompositeComponent__AssemblycontextAssignment_15_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssignment_15_1()); 
            // InternalMyDsl.g:6198:2: ( rule__CompositeComponent__AssemblycontextAssignment_15_1 )
            // InternalMyDsl.g:6198:3: rule__CompositeComponent__AssemblycontextAssignment_15_1
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
    // InternalMyDsl.g:6207:1: rule__CompositeComponent__Group_20__0 : rule__CompositeComponent__Group_20__0__Impl rule__CompositeComponent__Group_20__1 ;
    public final void rule__CompositeComponent__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6211:1: ( rule__CompositeComponent__Group_20__0__Impl rule__CompositeComponent__Group_20__1 )
            // InternalMyDsl.g:6212:2: rule__CompositeComponent__Group_20__0__Impl rule__CompositeComponent__Group_20__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:6219:1: rule__CompositeComponent__Group_20__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6223:1: ( ( ',' ) )
            // InternalMyDsl.g:6224:1: ( ',' )
            {
            // InternalMyDsl.g:6224:1: ( ',' )
            // InternalMyDsl.g:6225:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_20_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:6234:1: rule__CompositeComponent__Group_20__1 : rule__CompositeComponent__Group_20__1__Impl ;
    public final void rule__CompositeComponent__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6238:1: ( rule__CompositeComponent__Group_20__1__Impl )
            // InternalMyDsl.g:6239:2: rule__CompositeComponent__Group_20__1__Impl
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
    // InternalMyDsl.g:6245:1: rule__CompositeComponent__Group_20__1__Impl : ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) ) ;
    public final void rule__CompositeComponent__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6249:1: ( ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) ) )
            // InternalMyDsl.g:6250:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) )
            {
            // InternalMyDsl.g:6250:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) )
            // InternalMyDsl.g:6251:2: ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorAssignment_20_1()); 
            // InternalMyDsl.g:6252:2: ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 )
            // InternalMyDsl.g:6252:3: rule__CompositeComponent__DelegationconnectorAssignment_20_1
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
    // InternalMyDsl.g:6261:1: rule__InternalAction__Group__0 : rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 ;
    public final void rule__InternalAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6265:1: ( rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 )
            // InternalMyDsl.g:6266:2: rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:6273:1: rule__InternalAction__Group__0__Impl : ( () ) ;
    public final void rule__InternalAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6277:1: ( ( () ) )
            // InternalMyDsl.g:6278:1: ( () )
            {
            // InternalMyDsl.g:6278:1: ( () )
            // InternalMyDsl.g:6279:2: ()
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionAction_0()); 
            // InternalMyDsl.g:6280:2: ()
            // InternalMyDsl.g:6280:3: 
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
    // InternalMyDsl.g:6288:1: rule__InternalAction__Group__1 : rule__InternalAction__Group__1__Impl ;
    public final void rule__InternalAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6292:1: ( rule__InternalAction__Group__1__Impl )
            // InternalMyDsl.g:6293:2: rule__InternalAction__Group__1__Impl
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
    // InternalMyDsl.g:6299:1: rule__InternalAction__Group__1__Impl : ( 'InternalAction' ) ;
    public final void rule__InternalAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6303:1: ( ( 'InternalAction' ) )
            // InternalMyDsl.g:6304:1: ( 'InternalAction' )
            {
            // InternalMyDsl.g:6304:1: ( 'InternalAction' )
            // InternalMyDsl.g:6305:2: 'InternalAction'
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionKeyword_1()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMyDsl.g:6315:1: rule__ExternalCall__Group__0 : rule__ExternalCall__Group__0__Impl rule__ExternalCall__Group__1 ;
    public final void rule__ExternalCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6319:1: ( rule__ExternalCall__Group__0__Impl rule__ExternalCall__Group__1 )
            // InternalMyDsl.g:6320:2: rule__ExternalCall__Group__0__Impl rule__ExternalCall__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:6327:1: rule__ExternalCall__Group__0__Impl : ( () ) ;
    public final void rule__ExternalCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6331:1: ( ( () ) )
            // InternalMyDsl.g:6332:1: ( () )
            {
            // InternalMyDsl.g:6332:1: ( () )
            // InternalMyDsl.g:6333:2: ()
            {
             before(grammarAccess.getExternalCallAccess().getExternalCallAction_0()); 
            // InternalMyDsl.g:6334:2: ()
            // InternalMyDsl.g:6334:3: 
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
    // InternalMyDsl.g:6342:1: rule__ExternalCall__Group__1 : rule__ExternalCall__Group__1__Impl ;
    public final void rule__ExternalCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6346:1: ( rule__ExternalCall__Group__1__Impl )
            // InternalMyDsl.g:6347:2: rule__ExternalCall__Group__1__Impl
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
    // InternalMyDsl.g:6353:1: rule__ExternalCall__Group__1__Impl : ( 'ExternalCall' ) ;
    public final void rule__ExternalCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6357:1: ( ( 'ExternalCall' ) )
            // InternalMyDsl.g:6358:1: ( 'ExternalCall' )
            {
            // InternalMyDsl.g:6358:1: ( 'ExternalCall' )
            // InternalMyDsl.g:6359:2: 'ExternalCall'
            {
             before(grammarAccess.getExternalCallAccess().getExternalCallKeyword_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMyDsl.g:6369:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6373:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalMyDsl.g:6374:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:6381:1: rule__Loop__Group__0__Impl : ( () ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6385:1: ( ( () ) )
            // InternalMyDsl.g:6386:1: ( () )
            {
            // InternalMyDsl.g:6386:1: ( () )
            // InternalMyDsl.g:6387:2: ()
            {
             before(grammarAccess.getLoopAccess().getLoopAction_0()); 
            // InternalMyDsl.g:6388:2: ()
            // InternalMyDsl.g:6388:3: 
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
    // InternalMyDsl.g:6396:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6400:1: ( rule__Loop__Group__1__Impl )
            // InternalMyDsl.g:6401:2: rule__Loop__Group__1__Impl
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
    // InternalMyDsl.g:6407:1: rule__Loop__Group__1__Impl : ( 'Loop' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6411:1: ( ( 'Loop' ) )
            // InternalMyDsl.g:6412:1: ( 'Loop' )
            {
            // InternalMyDsl.g:6412:1: ( 'Loop' )
            // InternalMyDsl.g:6413:2: 'Loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_1()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMyDsl.g:6423:1: rule__Branch__Group__0 : rule__Branch__Group__0__Impl rule__Branch__Group__1 ;
    public final void rule__Branch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6427:1: ( rule__Branch__Group__0__Impl rule__Branch__Group__1 )
            // InternalMyDsl.g:6428:2: rule__Branch__Group__0__Impl rule__Branch__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:6435:1: rule__Branch__Group__0__Impl : ( () ) ;
    public final void rule__Branch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6439:1: ( ( () ) )
            // InternalMyDsl.g:6440:1: ( () )
            {
            // InternalMyDsl.g:6440:1: ( () )
            // InternalMyDsl.g:6441:2: ()
            {
             before(grammarAccess.getBranchAccess().getBranchAction_0()); 
            // InternalMyDsl.g:6442:2: ()
            // InternalMyDsl.g:6442:3: 
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
    // InternalMyDsl.g:6450:1: rule__Branch__Group__1 : rule__Branch__Group__1__Impl ;
    public final void rule__Branch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6454:1: ( rule__Branch__Group__1__Impl )
            // InternalMyDsl.g:6455:2: rule__Branch__Group__1__Impl
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
    // InternalMyDsl.g:6461:1: rule__Branch__Group__1__Impl : ( 'Branch' ) ;
    public final void rule__Branch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6465:1: ( ( 'Branch' ) )
            // InternalMyDsl.g:6466:1: ( 'Branch' )
            {
            // InternalMyDsl.g:6466:1: ( 'Branch' )
            // InternalMyDsl.g:6467:2: 'Branch'
            {
             before(grammarAccess.getBranchAccess().getBranchKeyword_1()); 
            match(input,63,FOLLOW_2); 
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


    // $ANTLR start "rule__DelegationConnector__Group__0"
    // InternalMyDsl.g:6477:1: rule__DelegationConnector__Group__0 : rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1 ;
    public final void rule__DelegationConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6481:1: ( rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1 )
            // InternalMyDsl.g:6482:2: rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:6489:1: rule__DelegationConnector__Group__0__Impl : ( 'DelegationConnector' ) ;
    public final void rule__DelegationConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6493:1: ( ( 'DelegationConnector' ) )
            // InternalMyDsl.g:6494:1: ( 'DelegationConnector' )
            {
            // InternalMyDsl.g:6494:1: ( 'DelegationConnector' )
            // InternalMyDsl.g:6495:2: 'DelegationConnector'
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
    // InternalMyDsl.g:6504:1: rule__DelegationConnector__Group__1 : rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2 ;
    public final void rule__DelegationConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6508:1: ( rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2 )
            // InternalMyDsl.g:6509:2: rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2
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
    // InternalMyDsl.g:6516:1: rule__DelegationConnector__Group__1__Impl : ( ( rule__DelegationConnector__NameAssignment_1 ) ) ;
    public final void rule__DelegationConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6520:1: ( ( ( rule__DelegationConnector__NameAssignment_1 ) ) )
            // InternalMyDsl.g:6521:1: ( ( rule__DelegationConnector__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:6521:1: ( ( rule__DelegationConnector__NameAssignment_1 ) )
            // InternalMyDsl.g:6522:2: ( rule__DelegationConnector__NameAssignment_1 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6523:2: ( rule__DelegationConnector__NameAssignment_1 )
            // InternalMyDsl.g:6523:3: rule__DelegationConnector__NameAssignment_1
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
    // InternalMyDsl.g:6531:1: rule__DelegationConnector__Group__2 : rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3 ;
    public final void rule__DelegationConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6535:1: ( rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3 )
            // InternalMyDsl.g:6536:2: rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:6543:1: rule__DelegationConnector__Group__2__Impl : ( '{' ) ;
    public final void rule__DelegationConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6547:1: ( ( '{' ) )
            // InternalMyDsl.g:6548:1: ( '{' )
            {
            // InternalMyDsl.g:6548:1: ( '{' )
            // InternalMyDsl.g:6549:2: '{'
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
    // InternalMyDsl.g:6558:1: rule__DelegationConnector__Group__3 : rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4 ;
    public final void rule__DelegationConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6562:1: ( rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4 )
            // InternalMyDsl.g:6563:2: rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:6570:1: rule__DelegationConnector__Group__3__Impl : ( 'role' ) ;
    public final void rule__DelegationConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6574:1: ( ( 'role' ) )
            // InternalMyDsl.g:6575:1: ( 'role' )
            {
            // InternalMyDsl.g:6575:1: ( 'role' )
            // InternalMyDsl.g:6576:2: 'role'
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
    // InternalMyDsl.g:6585:1: rule__DelegationConnector__Group__4 : rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5 ;
    public final void rule__DelegationConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6589:1: ( rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5 )
            // InternalMyDsl.g:6590:2: rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:6597:1: rule__DelegationConnector__Group__4__Impl : ( '(' ) ;
    public final void rule__DelegationConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6601:1: ( ( '(' ) )
            // InternalMyDsl.g:6602:1: ( '(' )
            {
            // InternalMyDsl.g:6602:1: ( '(' )
            // InternalMyDsl.g:6603:2: '('
            {
             before(grammarAccess.getDelegationConnectorAccess().getLeftParenthesisKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:6612:1: rule__DelegationConnector__Group__5 : rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6 ;
    public final void rule__DelegationConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6616:1: ( rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6 )
            // InternalMyDsl.g:6617:2: rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:6624:1: rule__DelegationConnector__Group__5__Impl : ( ( rule__DelegationConnector__RoleAssignment_5 ) ) ;
    public final void rule__DelegationConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6628:1: ( ( ( rule__DelegationConnector__RoleAssignment_5 ) ) )
            // InternalMyDsl.g:6629:1: ( ( rule__DelegationConnector__RoleAssignment_5 ) )
            {
            // InternalMyDsl.g:6629:1: ( ( rule__DelegationConnector__RoleAssignment_5 ) )
            // InternalMyDsl.g:6630:2: ( rule__DelegationConnector__RoleAssignment_5 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_5()); 
            // InternalMyDsl.g:6631:2: ( rule__DelegationConnector__RoleAssignment_5 )
            // InternalMyDsl.g:6631:3: rule__DelegationConnector__RoleAssignment_5
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
    // InternalMyDsl.g:6639:1: rule__DelegationConnector__Group__6 : rule__DelegationConnector__Group__6__Impl rule__DelegationConnector__Group__7 ;
    public final void rule__DelegationConnector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6643:1: ( rule__DelegationConnector__Group__6__Impl rule__DelegationConnector__Group__7 )
            // InternalMyDsl.g:6644:2: rule__DelegationConnector__Group__6__Impl rule__DelegationConnector__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:6651:1: rule__DelegationConnector__Group__6__Impl : ( ( rule__DelegationConnector__Group_6__0 )* ) ;
    public final void rule__DelegationConnector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6655:1: ( ( ( rule__DelegationConnector__Group_6__0 )* ) )
            // InternalMyDsl.g:6656:1: ( ( rule__DelegationConnector__Group_6__0 )* )
            {
            // InternalMyDsl.g:6656:1: ( ( rule__DelegationConnector__Group_6__0 )* )
            // InternalMyDsl.g:6657:2: ( rule__DelegationConnector__Group_6__0 )*
            {
             before(grammarAccess.getDelegationConnectorAccess().getGroup_6()); 
            // InternalMyDsl.g:6658:2: ( rule__DelegationConnector__Group_6__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==28) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:6658:3: rule__DelegationConnector__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DelegationConnector__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalMyDsl.g:6666:1: rule__DelegationConnector__Group__7 : rule__DelegationConnector__Group__7__Impl rule__DelegationConnector__Group__8 ;
    public final void rule__DelegationConnector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6670:1: ( rule__DelegationConnector__Group__7__Impl rule__DelegationConnector__Group__8 )
            // InternalMyDsl.g:6671:2: rule__DelegationConnector__Group__7__Impl rule__DelegationConnector__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:6678:1: rule__DelegationConnector__Group__7__Impl : ( ')' ) ;
    public final void rule__DelegationConnector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6682:1: ( ( ')' ) )
            // InternalMyDsl.g:6683:1: ( ')' )
            {
            // InternalMyDsl.g:6683:1: ( ')' )
            // InternalMyDsl.g:6684:2: ')'
            {
             before(grammarAccess.getDelegationConnectorAccess().getRightParenthesisKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:6693:1: rule__DelegationConnector__Group__8 : rule__DelegationConnector__Group__8__Impl ;
    public final void rule__DelegationConnector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6697:1: ( rule__DelegationConnector__Group__8__Impl )
            // InternalMyDsl.g:6698:2: rule__DelegationConnector__Group__8__Impl
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
    // InternalMyDsl.g:6704:1: rule__DelegationConnector__Group__8__Impl : ( '}' ) ;
    public final void rule__DelegationConnector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6708:1: ( ( '}' ) )
            // InternalMyDsl.g:6709:1: ( '}' )
            {
            // InternalMyDsl.g:6709:1: ( '}' )
            // InternalMyDsl.g:6710:2: '}'
            {
             before(grammarAccess.getDelegationConnectorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:6720:1: rule__DelegationConnector__Group_6__0 : rule__DelegationConnector__Group_6__0__Impl rule__DelegationConnector__Group_6__1 ;
    public final void rule__DelegationConnector__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6724:1: ( rule__DelegationConnector__Group_6__0__Impl rule__DelegationConnector__Group_6__1 )
            // InternalMyDsl.g:6725:2: rule__DelegationConnector__Group_6__0__Impl rule__DelegationConnector__Group_6__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:6732:1: rule__DelegationConnector__Group_6__0__Impl : ( ',' ) ;
    public final void rule__DelegationConnector__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6736:1: ( ( ',' ) )
            // InternalMyDsl.g:6737:1: ( ',' )
            {
            // InternalMyDsl.g:6737:1: ( ',' )
            // InternalMyDsl.g:6738:2: ','
            {
             before(grammarAccess.getDelegationConnectorAccess().getCommaKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:6747:1: rule__DelegationConnector__Group_6__1 : rule__DelegationConnector__Group_6__1__Impl ;
    public final void rule__DelegationConnector__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6751:1: ( rule__DelegationConnector__Group_6__1__Impl )
            // InternalMyDsl.g:6752:2: rule__DelegationConnector__Group_6__1__Impl
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
    // InternalMyDsl.g:6758:1: rule__DelegationConnector__Group_6__1__Impl : ( ( rule__DelegationConnector__RoleAssignment_6_1 ) ) ;
    public final void rule__DelegationConnector__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6762:1: ( ( ( rule__DelegationConnector__RoleAssignment_6_1 ) ) )
            // InternalMyDsl.g:6763:1: ( ( rule__DelegationConnector__RoleAssignment_6_1 ) )
            {
            // InternalMyDsl.g:6763:1: ( ( rule__DelegationConnector__RoleAssignment_6_1 ) )
            // InternalMyDsl.g:6764:2: ( rule__DelegationConnector__RoleAssignment_6_1 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_6_1()); 
            // InternalMyDsl.g:6765:2: ( rule__DelegationConnector__RoleAssignment_6_1 )
            // InternalMyDsl.g:6765:3: rule__DelegationConnector__RoleAssignment_6_1
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
    // InternalMyDsl.g:6774:1: rule__Role_Impl__Group__0 : rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1 ;
    public final void rule__Role_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6778:1: ( rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1 )
            // InternalMyDsl.g:6779:2: rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:6786:1: rule__Role_Impl__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Role_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6790:1: ( ( 'Role' ) )
            // InternalMyDsl.g:6791:1: ( 'Role' )
            {
            // InternalMyDsl.g:6791:1: ( 'Role' )
            // InternalMyDsl.g:6792:2: 'Role'
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
    // InternalMyDsl.g:6801:1: rule__Role_Impl__Group__1 : rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2 ;
    public final void rule__Role_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6805:1: ( rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2 )
            // InternalMyDsl.g:6806:2: rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2
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
    // InternalMyDsl.g:6813:1: rule__Role_Impl__Group__1__Impl : ( ( rule__Role_Impl__NameAssignment_1 ) ) ;
    public final void rule__Role_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6817:1: ( ( ( rule__Role_Impl__NameAssignment_1 ) ) )
            // InternalMyDsl.g:6818:1: ( ( rule__Role_Impl__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:6818:1: ( ( rule__Role_Impl__NameAssignment_1 ) )
            // InternalMyDsl.g:6819:2: ( rule__Role_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getRole_ImplAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6820:2: ( rule__Role_Impl__NameAssignment_1 )
            // InternalMyDsl.g:6820:3: rule__Role_Impl__NameAssignment_1
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
    // InternalMyDsl.g:6828:1: rule__Role_Impl__Group__2 : rule__Role_Impl__Group__2__Impl rule__Role_Impl__Group__3 ;
    public final void rule__Role_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6832:1: ( rule__Role_Impl__Group__2__Impl rule__Role_Impl__Group__3 )
            // InternalMyDsl.g:6833:2: rule__Role_Impl__Group__2__Impl rule__Role_Impl__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:6840:1: rule__Role_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Role_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6844:1: ( ( '{' ) )
            // InternalMyDsl.g:6845:1: ( '{' )
            {
            // InternalMyDsl.g:6845:1: ( '{' )
            // InternalMyDsl.g:6846:2: '{'
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
    // InternalMyDsl.g:6855:1: rule__Role_Impl__Group__3 : rule__Role_Impl__Group__3__Impl rule__Role_Impl__Group__4 ;
    public final void rule__Role_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6859:1: ( rule__Role_Impl__Group__3__Impl rule__Role_Impl__Group__4 )
            // InternalMyDsl.g:6860:2: rule__Role_Impl__Group__3__Impl rule__Role_Impl__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:6867:1: rule__Role_Impl__Group__3__Impl : ( 'interface' ) ;
    public final void rule__Role_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6871:1: ( ( 'interface' ) )
            // InternalMyDsl.g:6872:1: ( 'interface' )
            {
            // InternalMyDsl.g:6872:1: ( 'interface' )
            // InternalMyDsl.g:6873:2: 'interface'
            {
             before(grammarAccess.getRole_ImplAccess().getInterfaceKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:6882:1: rule__Role_Impl__Group__4 : rule__Role_Impl__Group__4__Impl rule__Role_Impl__Group__5 ;
    public final void rule__Role_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6886:1: ( rule__Role_Impl__Group__4__Impl rule__Role_Impl__Group__5 )
            // InternalMyDsl.g:6887:2: rule__Role_Impl__Group__4__Impl rule__Role_Impl__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:6894:1: rule__Role_Impl__Group__4__Impl : ( ( rule__Role_Impl__InterfaceAssignment_4 ) ) ;
    public final void rule__Role_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6898:1: ( ( ( rule__Role_Impl__InterfaceAssignment_4 ) ) )
            // InternalMyDsl.g:6899:1: ( ( rule__Role_Impl__InterfaceAssignment_4 ) )
            {
            // InternalMyDsl.g:6899:1: ( ( rule__Role_Impl__InterfaceAssignment_4 ) )
            // InternalMyDsl.g:6900:2: ( rule__Role_Impl__InterfaceAssignment_4 )
            {
             before(grammarAccess.getRole_ImplAccess().getInterfaceAssignment_4()); 
            // InternalMyDsl.g:6901:2: ( rule__Role_Impl__InterfaceAssignment_4 )
            // InternalMyDsl.g:6901:3: rule__Role_Impl__InterfaceAssignment_4
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
    // InternalMyDsl.g:6909:1: rule__Role_Impl__Group__5 : rule__Role_Impl__Group__5__Impl ;
    public final void rule__Role_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6913:1: ( rule__Role_Impl__Group__5__Impl )
            // InternalMyDsl.g:6914:2: rule__Role_Impl__Group__5__Impl
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
    // InternalMyDsl.g:6920:1: rule__Role_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__Role_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6924:1: ( ( '}' ) )
            // InternalMyDsl.g:6925:1: ( '}' )
            {
            // InternalMyDsl.g:6925:1: ( '}' )
            // InternalMyDsl.g:6926:2: '}'
            {
             before(grammarAccess.getRole_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
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


    // $ANTLR start "rule__Container__Group__0"
    // InternalMyDsl.g:6936:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6940:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalMyDsl.g:6941:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalMyDsl.g:6948:1: rule__Container__Group__0__Impl : ( () ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6952:1: ( ( () ) )
            // InternalMyDsl.g:6953:1: ( () )
            {
            // InternalMyDsl.g:6953:1: ( () )
            // InternalMyDsl.g:6954:2: ()
            {
             before(grammarAccess.getContainerAccess().getContainerAction_0()); 
            // InternalMyDsl.g:6955:2: ()
            // InternalMyDsl.g:6955:3: 
            {
            }

             after(grammarAccess.getContainerAccess().getContainerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalMyDsl.g:6963:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6967:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalMyDsl.g:6968:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalMyDsl.g:6975:1: rule__Container__Group__1__Impl : ( 'Container' ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6979:1: ( ( 'Container' ) )
            // InternalMyDsl.g:6980:1: ( 'Container' )
            {
            // InternalMyDsl.g:6980:1: ( 'Container' )
            // InternalMyDsl.g:6981:2: 'Container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalMyDsl.g:6990:1: rule__Container__Group__2 : rule__Container__Group__2__Impl ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6994:1: ( rule__Container__Group__2__Impl )
            // InternalMyDsl.g:6995:2: rule__Container__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalMyDsl.g:7001:1: rule__Container__Group__2__Impl : ( ( rule__Container__NameAssignment_2 ) ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7005:1: ( ( ( rule__Container__NameAssignment_2 ) ) )
            // InternalMyDsl.g:7006:1: ( ( rule__Container__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:7006:1: ( ( rule__Container__NameAssignment_2 ) )
            // InternalMyDsl.g:7007:2: ( rule__Container__NameAssignment_2 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:7008:2: ( rule__Container__NameAssignment_2 )
            // InternalMyDsl.g:7008:3: rule__Container__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalMyDsl.g:7017:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7021:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalMyDsl.g:7022:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalMyDsl.g:7029:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7033:1: ( ( 'Link' ) )
            // InternalMyDsl.g:7034:1: ( 'Link' )
            {
            // InternalMyDsl.g:7034:1: ( 'Link' )
            // InternalMyDsl.g:7035:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalMyDsl.g:7044:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7048:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalMyDsl.g:7049:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalMyDsl.g:7056:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7060:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalMyDsl.g:7061:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:7061:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalMyDsl.g:7062:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:7063:2: ( rule__Link__NameAssignment_1 )
            // InternalMyDsl.g:7063:3: rule__Link__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalMyDsl.g:7071:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7075:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalMyDsl.g:7076:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalMyDsl.g:7083:1: rule__Link__Group__2__Impl : ( '{' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7087:1: ( ( '{' ) )
            // InternalMyDsl.g:7088:1: ( '{' )
            {
            // InternalMyDsl.g:7088:1: ( '{' )
            // InternalMyDsl.g:7089:2: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalMyDsl.g:7098:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7102:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalMyDsl.g:7103:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalMyDsl.g:7110:1: rule__Link__Group__3__Impl : ( 'container' ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7114:1: ( ( 'container' ) )
            // InternalMyDsl.g:7115:1: ( 'container' )
            {
            // InternalMyDsl.g:7115:1: ( 'container' )
            // InternalMyDsl.g:7116:2: 'container'
            {
             before(grammarAccess.getLinkAccess().getContainerKeyword_3()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getContainerKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__4"
    // InternalMyDsl.g:7125:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7129:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalMyDsl.g:7130:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Link__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // InternalMyDsl.g:7137:1: rule__Link__Group__4__Impl : ( '(' ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7141:1: ( ( '(' ) )
            // InternalMyDsl.g:7142:1: ( '(' )
            {
            // InternalMyDsl.g:7142:1: ( '(' )
            // InternalMyDsl.g:7143:2: '('
            {
             before(grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Link__Group__5"
    // InternalMyDsl.g:7152:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7156:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // InternalMyDsl.g:7157:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Link__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5"


    // $ANTLR start "rule__Link__Group__5__Impl"
    // InternalMyDsl.g:7164:1: rule__Link__Group__5__Impl : ( ( rule__Link__ContainerAssignment_5 ) ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7168:1: ( ( ( rule__Link__ContainerAssignment_5 ) ) )
            // InternalMyDsl.g:7169:1: ( ( rule__Link__ContainerAssignment_5 ) )
            {
            // InternalMyDsl.g:7169:1: ( ( rule__Link__ContainerAssignment_5 ) )
            // InternalMyDsl.g:7170:2: ( rule__Link__ContainerAssignment_5 )
            {
             before(grammarAccess.getLinkAccess().getContainerAssignment_5()); 
            // InternalMyDsl.g:7171:2: ( rule__Link__ContainerAssignment_5 )
            // InternalMyDsl.g:7171:3: rule__Link__ContainerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Link__ContainerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getContainerAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5__Impl"


    // $ANTLR start "rule__Link__Group__6"
    // InternalMyDsl.g:7179:1: rule__Link__Group__6 : rule__Link__Group__6__Impl rule__Link__Group__7 ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7183:1: ( rule__Link__Group__6__Impl rule__Link__Group__7 )
            // InternalMyDsl.g:7184:2: rule__Link__Group__6__Impl rule__Link__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Link__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__6"


    // $ANTLR start "rule__Link__Group__6__Impl"
    // InternalMyDsl.g:7191:1: rule__Link__Group__6__Impl : ( ( rule__Link__Group_6__0 )* ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7195:1: ( ( ( rule__Link__Group_6__0 )* ) )
            // InternalMyDsl.g:7196:1: ( ( rule__Link__Group_6__0 )* )
            {
            // InternalMyDsl.g:7196:1: ( ( rule__Link__Group_6__0 )* )
            // InternalMyDsl.g:7197:2: ( rule__Link__Group_6__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_6()); 
            // InternalMyDsl.g:7198:2: ( rule__Link__Group_6__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==28) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:7198:3: rule__Link__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Link__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__6__Impl"


    // $ANTLR start "rule__Link__Group__7"
    // InternalMyDsl.g:7206:1: rule__Link__Group__7 : rule__Link__Group__7__Impl rule__Link__Group__8 ;
    public final void rule__Link__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7210:1: ( rule__Link__Group__7__Impl rule__Link__Group__8 )
            // InternalMyDsl.g:7211:2: rule__Link__Group__7__Impl rule__Link__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Link__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__7"


    // $ANTLR start "rule__Link__Group__7__Impl"
    // InternalMyDsl.g:7218:1: rule__Link__Group__7__Impl : ( ')' ) ;
    public final void rule__Link__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7222:1: ( ( ')' ) )
            // InternalMyDsl.g:7223:1: ( ')' )
            {
            // InternalMyDsl.g:7223:1: ( ')' )
            // InternalMyDsl.g:7224:2: ')'
            {
             before(grammarAccess.getLinkAccess().getRightParenthesisKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__7__Impl"


    // $ANTLR start "rule__Link__Group__8"
    // InternalMyDsl.g:7233:1: rule__Link__Group__8 : rule__Link__Group__8__Impl ;
    public final void rule__Link__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7237:1: ( rule__Link__Group__8__Impl )
            // InternalMyDsl.g:7238:2: rule__Link__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__8"


    // $ANTLR start "rule__Link__Group__8__Impl"
    // InternalMyDsl.g:7244:1: rule__Link__Group__8__Impl : ( '}' ) ;
    public final void rule__Link__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7248:1: ( ( '}' ) )
            // InternalMyDsl.g:7249:1: ( '}' )
            {
            // InternalMyDsl.g:7249:1: ( '}' )
            // InternalMyDsl.g:7250:2: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__8__Impl"


    // $ANTLR start "rule__Link__Group_6__0"
    // InternalMyDsl.g:7260:1: rule__Link__Group_6__0 : rule__Link__Group_6__0__Impl rule__Link__Group_6__1 ;
    public final void rule__Link__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7264:1: ( rule__Link__Group_6__0__Impl rule__Link__Group_6__1 )
            // InternalMyDsl.g:7265:2: rule__Link__Group_6__0__Impl rule__Link__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__Link__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__0"


    // $ANTLR start "rule__Link__Group_6__0__Impl"
    // InternalMyDsl.g:7272:1: rule__Link__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Link__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7276:1: ( ( ',' ) )
            // InternalMyDsl.g:7277:1: ( ',' )
            {
            // InternalMyDsl.g:7277:1: ( ',' )
            // InternalMyDsl.g:7278:2: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__0__Impl"


    // $ANTLR start "rule__Link__Group_6__1"
    // InternalMyDsl.g:7287:1: rule__Link__Group_6__1 : rule__Link__Group_6__1__Impl ;
    public final void rule__Link__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7291:1: ( rule__Link__Group_6__1__Impl )
            // InternalMyDsl.g:7292:2: rule__Link__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__1"


    // $ANTLR start "rule__Link__Group_6__1__Impl"
    // InternalMyDsl.g:7298:1: rule__Link__Group_6__1__Impl : ( ( rule__Link__ContainerAssignment_6_1 ) ) ;
    public final void rule__Link__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7302:1: ( ( ( rule__Link__ContainerAssignment_6_1 ) ) )
            // InternalMyDsl.g:7303:1: ( ( rule__Link__ContainerAssignment_6_1 ) )
            {
            // InternalMyDsl.g:7303:1: ( ( rule__Link__ContainerAssignment_6_1 ) )
            // InternalMyDsl.g:7304:2: ( rule__Link__ContainerAssignment_6_1 )
            {
             before(grammarAccess.getLinkAccess().getContainerAssignment_6_1()); 
            // InternalMyDsl.g:7305:2: ( rule__Link__ContainerAssignment_6_1 )
            // InternalMyDsl.g:7305:3: rule__Link__ContainerAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__ContainerAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getContainerAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__InterfaceAssignment_4"
    // InternalMyDsl.g:7314:1: rule__ComponentBasedSystem__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ComponentBasedSystem__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7318:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7319:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7319:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7320:3: ( ruleEString )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalMyDsl.g:7321:3: ( ruleEString )
            // InternalMyDsl.g:7322:4: ruleEString
            {
             before(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__InterfaceAssignment_4"


    // $ANTLR start "rule__ComponentBasedSystem__InterfaceAssignment_5_1"
    // InternalMyDsl.g:7333:1: rule__ComponentBasedSystem__InterfaceAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__ComponentBasedSystem__InterfaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7337:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7338:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7338:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7339:3: ( ruleEString )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceCrossReference_5_1_0()); 
            // InternalMyDsl.g:7340:3: ( ruleEString )
            // InternalMyDsl.g:7341:4: ruleEString
            {
             before(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__InterfaceAssignment_5_1"


    // $ANTLR start "rule__ComponentBasedSystem__EnvironmentAssignment_8"
    // InternalMyDsl.g:7352:1: rule__ComponentBasedSystem__EnvironmentAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__ComponentBasedSystem__EnvironmentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7356:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7357:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7357:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7358:3: ( ruleEString )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getEnvironmentEnvironmentCrossReference_8_0()); 
            // InternalMyDsl.g:7359:3: ( ruleEString )
            // InternalMyDsl.g:7360:4: ruleEString
            {
             before(grammarAccess.getComponentBasedSystemAccess().getEnvironmentEnvironmentEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getEnvironmentEnvironmentEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getComponentBasedSystemAccess().getEnvironmentEnvironmentCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__EnvironmentAssignment_8"


    // $ANTLR start "rule__ComponentBasedSystem__AssemblycontextAssignment_9_2"
    // InternalMyDsl.g:7371:1: rule__ComponentBasedSystem__AssemblycontextAssignment_9_2 : ( ruleAssemblyContext ) ;
    public final void rule__ComponentBasedSystem__AssemblycontextAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7375:1: ( ( ruleAssemblyContext ) )
            // InternalMyDsl.g:7376:2: ( ruleAssemblyContext )
            {
            // InternalMyDsl.g:7376:2: ( ruleAssemblyContext )
            // InternalMyDsl.g:7377:3: ruleAssemblyContext
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssemblyContextParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssemblyContextParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__AssemblycontextAssignment_9_2"


    // $ANTLR start "rule__ComponentBasedSystem__AssemblycontextAssignment_9_3_1"
    // InternalMyDsl.g:7386:1: rule__ComponentBasedSystem__AssemblycontextAssignment_9_3_1 : ( ruleAssemblyContext ) ;
    public final void rule__ComponentBasedSystem__AssemblycontextAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7390:1: ( ( ruleAssemblyContext ) )
            // InternalMyDsl.g:7391:2: ( ruleAssemblyContext )
            {
            // InternalMyDsl.g:7391:2: ( ruleAssemblyContext )
            // InternalMyDsl.g:7392:3: ruleAssemblyContext
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssemblyContextParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssemblyContextParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__AssemblycontextAssignment_9_3_1"


    // $ANTLR start "rule__ComponentBasedSystem__TypeAssignment_10_2"
    // InternalMyDsl.g:7401:1: rule__ComponentBasedSystem__TypeAssignment_10_2 : ( ruleType ) ;
    public final void rule__ComponentBasedSystem__TypeAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7405:1: ( ( ruleType ) )
            // InternalMyDsl.g:7406:2: ( ruleType )
            {
            // InternalMyDsl.g:7406:2: ( ruleType )
            // InternalMyDsl.g:7407:3: ruleType
            {
             before(grammarAccess.getComponentBasedSystemAccess().getTypeTypeParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getTypeTypeParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__TypeAssignment_10_2"


    // $ANTLR start "rule__ComponentBasedSystem__TypeAssignment_10_3_1"
    // InternalMyDsl.g:7416:1: rule__ComponentBasedSystem__TypeAssignment_10_3_1 : ( ruleType ) ;
    public final void rule__ComponentBasedSystem__TypeAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7420:1: ( ( ruleType ) )
            // InternalMyDsl.g:7421:2: ( ruleType )
            {
            // InternalMyDsl.g:7421:2: ( ruleType )
            // InternalMyDsl.g:7422:3: ruleType
            {
             before(grammarAccess.getComponentBasedSystemAccess().getTypeTypeParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getTypeTypeParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__TypeAssignment_10_3_1"


    // $ANTLR start "rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_2"
    // InternalMyDsl.g:7431:1: rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_2 : ( ruleAssemblyConnector ) ;
    public final void rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7435:1: ( ( ruleAssemblyConnector ) )
            // InternalMyDsl.g:7436:2: ( ruleAssemblyConnector )
            {
            // InternalMyDsl.g:7436:2: ( ruleAssemblyConnector )
            // InternalMyDsl.g:7437:3: ruleAssemblyConnector
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssemblyConnectorParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyConnector();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssemblyConnectorParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_2"


    // $ANTLR start "rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_3_1"
    // InternalMyDsl.g:7446:1: rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_3_1 : ( ruleAssemblyConnector ) ;
    public final void rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7450:1: ( ( ruleAssemblyConnector ) )
            // InternalMyDsl.g:7451:2: ( ruleAssemblyConnector )
            {
            // InternalMyDsl.g:7451:2: ( ruleAssemblyConnector )
            // InternalMyDsl.g:7452:3: ruleAssemblyConnector
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssemblyConnectorParserRuleCall_11_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyConnector();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssemblyConnectorParserRuleCall_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__AssemblyconnectorAssignment_11_3_1"


    // $ANTLR start "rule__AssemblyContext__NameAssignment_1"
    // InternalMyDsl.g:7461:1: rule__AssemblyContext__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AssemblyContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7465:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7466:2: ( ruleEString )
            {
            // InternalMyDsl.g:7466:2: ( ruleEString )
            // InternalMyDsl.g:7467:3: ruleEString
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
    // InternalMyDsl.g:7476:1: rule__AssemblyContext__ComponentAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__ComponentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7480:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7481:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7481:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7482:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_4_0()); 
            // InternalMyDsl.g:7483:3: ( ruleEString )
            // InternalMyDsl.g:7484:4: ruleEString
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


    // $ANTLR start "rule__Type_Impl__NameAssignment_2"
    // InternalMyDsl.g:7495:1: rule__Type_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Type_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7499:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7500:2: ( ruleEString )
            {
            // InternalMyDsl.g:7500:2: ( ruleEString )
            // InternalMyDsl.g:7501:3: ruleEString
            {
             before(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__NameAssignment_2"


    // $ANTLR start "rule__AssemblyConnector__NameAssignment_1"
    // InternalMyDsl.g:7510:1: rule__AssemblyConnector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AssemblyConnector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7514:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7515:2: ( ruleEString )
            {
            // InternalMyDsl.g:7515:2: ( ruleEString )
            // InternalMyDsl.g:7516:3: ruleEString
            {
             before(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__NameAssignment_1"


    // $ANTLR start "rule__AssemblyConnector__ProvidedroleAssignment_4"
    // InternalMyDsl.g:7525:1: rule__AssemblyConnector__ProvidedroleAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyConnector__ProvidedroleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7529:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7530:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7530:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7531:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedroleProvidedRoleCrossReference_4_0()); 
            // InternalMyDsl.g:7532:3: ( ruleEString )
            // InternalMyDsl.g:7533:4: ruleEString
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedroleProvidedRoleEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorAccess().getProvidedroleProvidedRoleEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAssemblyConnectorAccess().getProvidedroleProvidedRoleCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__ProvidedroleAssignment_4"


    // $ANTLR start "rule__AssemblyConnector__RequiredroleAssignment_6"
    // InternalMyDsl.g:7544:1: rule__AssemblyConnector__RequiredroleAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyConnector__RequiredroleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7548:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7549:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7549:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7550:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredroleRequiredRoleCrossReference_6_0()); 
            // InternalMyDsl.g:7551:3: ( ruleEString )
            // InternalMyDsl.g:7552:4: ruleEString
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredroleRequiredRoleEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorAccess().getRequiredroleRequiredRoleEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getAssemblyConnectorAccess().getRequiredroleRequiredRoleCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__RequiredroleAssignment_6"


    // $ANTLR start "rule__Signature__NameAssignment_1"
    // InternalMyDsl.g:7563:1: rule__Signature__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Signature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7567:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7568:2: ( ruleEString )
            {
            // InternalMyDsl.g:7568:2: ( ruleEString )
            // InternalMyDsl.g:7569:3: ruleEString
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
    // InternalMyDsl.g:7578:1: rule__Signature__ReturntypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Signature__ReturntypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7582:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7583:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7583:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7584:3: ( ruleEString )
            {
             before(grammarAccess.getSignatureAccess().getReturntypeReturnTypeCrossReference_4_0()); 
            // InternalMyDsl.g:7585:3: ( ruleEString )
            // InternalMyDsl.g:7586:4: ruleEString
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
    // InternalMyDsl.g:7597:1: rule__Signature__ParameterAssignment_5_2 : ( ruleParameter ) ;
    public final void rule__Signature__ParameterAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7601:1: ( ( ruleParameter ) )
            // InternalMyDsl.g:7602:2: ( ruleParameter )
            {
            // InternalMyDsl.g:7602:2: ( ruleParameter )
            // InternalMyDsl.g:7603:3: ruleParameter
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
    // InternalMyDsl.g:7612:1: rule__Signature__ParameterAssignment_5_3_1 : ( ruleParameter ) ;
    public final void rule__Signature__ParameterAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7616:1: ( ( ruleParameter ) )
            // InternalMyDsl.g:7617:2: ( ruleParameter )
            {
            // InternalMyDsl.g:7617:2: ( ruleParameter )
            // InternalMyDsl.g:7618:3: ruleParameter
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
    // InternalMyDsl.g:7627:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7631:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7632:2: ( ruleEString )
            {
            // InternalMyDsl.g:7632:2: ( ruleEString )
            // InternalMyDsl.g:7633:3: ruleEString
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
    // InternalMyDsl.g:7642:1: rule__Parameter__ParametertypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Parameter__ParametertypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7646:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7647:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7647:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7648:3: ( ruleEString )
            {
             before(grammarAccess.getParameterAccess().getParametertypeParameterTypeCrossReference_4_0()); 
            // InternalMyDsl.g:7649:3: ( ruleEString )
            // InternalMyDsl.g:7650:4: ruleEString
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
    // InternalMyDsl.g:7661:1: rule__ReturnType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ReturnType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7665:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7666:2: ( ruleEString )
            {
            // InternalMyDsl.g:7666:2: ( ruleEString )
            // InternalMyDsl.g:7667:3: ruleEString
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
    // InternalMyDsl.g:7676:1: rule__ParameterType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ParameterType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7680:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7681:2: ( ruleEString )
            {
            // InternalMyDsl.g:7681:2: ( ruleEString )
            // InternalMyDsl.g:7682:3: ruleEString
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
    // InternalMyDsl.g:7691:1: rule__Simple__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Simple__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7695:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7696:2: ( ruleEString )
            {
            // InternalMyDsl.g:7696:2: ( ruleEString )
            // InternalMyDsl.g:7697:3: ruleEString
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
    // InternalMyDsl.g:7706:1: rule__Simple__KindAssignment_4_1 : ( rulesimpleTypes ) ;
    public final void rule__Simple__KindAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7710:1: ( ( rulesimpleTypes ) )
            // InternalMyDsl.g:7711:2: ( rulesimpleTypes )
            {
            // InternalMyDsl.g:7711:2: ( rulesimpleTypes )
            // InternalMyDsl.g:7712:3: rulesimpleTypes
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
    // InternalMyDsl.g:7721:1: rule__Complex__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Complex__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7725:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7726:2: ( ruleEString )
            {
            // InternalMyDsl.g:7726:2: ( ruleEString )
            // InternalMyDsl.g:7727:3: ruleEString
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
    // InternalMyDsl.g:7736:1: rule__Complex__SimpleAssignment_5 : ( ruleSimple ) ;
    public final void rule__Complex__SimpleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7740:1: ( ( ruleSimple ) )
            // InternalMyDsl.g:7741:2: ( ruleSimple )
            {
            // InternalMyDsl.g:7741:2: ( ruleSimple )
            // InternalMyDsl.g:7742:3: ruleSimple
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
    // InternalMyDsl.g:7751:1: rule__Complex__SimpleAssignment_6_1 : ( ruleSimple ) ;
    public final void rule__Complex__SimpleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7755:1: ( ( ruleSimple ) )
            // InternalMyDsl.g:7756:2: ( ruleSimple )
            {
            // InternalMyDsl.g:7756:2: ( ruleSimple )
            // InternalMyDsl.g:7757:3: ruleSimple
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
    // InternalMyDsl.g:7766:1: rule__Void__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Void__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7770:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7771:2: ( ruleEString )
            {
            // InternalMyDsl.g:7771:2: ( ruleEString )
            // InternalMyDsl.g:7772:3: ruleEString
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


    // $ANTLR start "rule__Component_Impl__NameAssignment_1"
    // InternalMyDsl.g:7781:1: rule__Component_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Component_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7785:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7786:2: ( ruleEString )
            {
            // InternalMyDsl.g:7786:2: ( ruleEString )
            // InternalMyDsl.g:7787:3: ruleEString
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
    // InternalMyDsl.g:7796:1: rule__Component_Impl__BehaviourdescriptionAssignment_3_2 : ( ruleBehaviourDescription ) ;
    public final void rule__Component_Impl__BehaviourdescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7800:1: ( ( ruleBehaviourDescription ) )
            // InternalMyDsl.g:7801:2: ( ruleBehaviourDescription )
            {
            // InternalMyDsl.g:7801:2: ( ruleBehaviourDescription )
            // InternalMyDsl.g:7802:3: ruleBehaviourDescription
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
    // InternalMyDsl.g:7811:1: rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 : ( ruleBehaviourDescription ) ;
    public final void rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7815:1: ( ( ruleBehaviourDescription ) )
            // InternalMyDsl.g:7816:2: ( ruleBehaviourDescription )
            {
            // InternalMyDsl.g:7816:2: ( ruleBehaviourDescription )
            // InternalMyDsl.g:7817:3: ruleBehaviourDescription
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
    // InternalMyDsl.g:7826:1: rule__Component_Impl__ServiceAssignment_6 : ( ruleService ) ;
    public final void rule__Component_Impl__ServiceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7830:1: ( ( ruleService ) )
            // InternalMyDsl.g:7831:2: ( ruleService )
            {
            // InternalMyDsl.g:7831:2: ( ruleService )
            // InternalMyDsl.g:7832:3: ruleService
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
    // InternalMyDsl.g:7841:1: rule__Component_Impl__ServiceAssignment_7_1 : ( ruleService ) ;
    public final void rule__Component_Impl__ServiceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7845:1: ( ( ruleService ) )
            // InternalMyDsl.g:7846:2: ( ruleService )
            {
            // InternalMyDsl.g:7846:2: ( ruleService )
            // InternalMyDsl.g:7847:3: ruleService
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
    // InternalMyDsl.g:7856:1: rule__Component_Impl__RequiredroleAssignment_9_2 : ( ruleRequiredRole ) ;
    public final void rule__Component_Impl__RequiredroleAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7860:1: ( ( ruleRequiredRole ) )
            // InternalMyDsl.g:7861:2: ( ruleRequiredRole )
            {
            // InternalMyDsl.g:7861:2: ( ruleRequiredRole )
            // InternalMyDsl.g:7862:3: ruleRequiredRole
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
    // InternalMyDsl.g:7871:1: rule__Component_Impl__RequiredroleAssignment_9_3_1 : ( ruleRequiredRole ) ;
    public final void rule__Component_Impl__RequiredroleAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7875:1: ( ( ruleRequiredRole ) )
            // InternalMyDsl.g:7876:2: ( ruleRequiredRole )
            {
            // InternalMyDsl.g:7876:2: ( ruleRequiredRole )
            // InternalMyDsl.g:7877:3: ruleRequiredRole
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
    // InternalMyDsl.g:7886:1: rule__Component_Impl__ProvidedroleAssignment_11 : ( ruleProvidedRole ) ;
    public final void rule__Component_Impl__ProvidedroleAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7890:1: ( ( ruleProvidedRole ) )
            // InternalMyDsl.g:7891:2: ( ruleProvidedRole )
            {
            // InternalMyDsl.g:7891:2: ( ruleProvidedRole )
            // InternalMyDsl.g:7892:3: ruleProvidedRole
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
    // InternalMyDsl.g:7901:1: rule__Service__CorrespondingSignaturesAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Service__CorrespondingSignaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7905:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7906:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7906:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7907:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_4_0()); 
            // InternalMyDsl.g:7908:3: ( ruleEString )
            // InternalMyDsl.g:7909:4: ruleEString
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
    // InternalMyDsl.g:7920:1: rule__Service__CorrespondingSignaturesAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Service__CorrespondingSignaturesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7924:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7925:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7925:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7926:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_5_1_0()); 
            // InternalMyDsl.g:7927:3: ( ruleEString )
            // InternalMyDsl.g:7928:4: ruleEString
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
    // InternalMyDsl.g:7939:1: rule__RequiredRole__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RequiredRole__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7943:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7944:2: ( ruleEString )
            {
            // InternalMyDsl.g:7944:2: ( ruleEString )
            // InternalMyDsl.g:7945:3: ruleEString
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
    // InternalMyDsl.g:7954:1: rule__RequiredRole__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__RequiredRole__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7958:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7959:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7959:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7960:3: ( ruleEString )
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalMyDsl.g:7961:3: ( ruleEString )
            // InternalMyDsl.g:7962:4: ruleEString
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
    // InternalMyDsl.g:7973:1: rule__ProvidedRole__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ProvidedRole__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7977:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7978:2: ( ruleEString )
            {
            // InternalMyDsl.g:7978:2: ( ruleEString )
            // InternalMyDsl.g:7979:3: ruleEString
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
    // InternalMyDsl.g:7988:1: rule__ProvidedRole__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ProvidedRole__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7992:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7993:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7993:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7994:3: ( ruleEString )
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalMyDsl.g:7995:3: ( ruleEString )
            // InternalMyDsl.g:7996:4: ruleEString
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
    // InternalMyDsl.g:8007:1: rule__CompositeComponent__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompositeComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8011:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8012:2: ( ruleEString )
            {
            // InternalMyDsl.g:8012:2: ( ruleEString )
            // InternalMyDsl.g:8013:3: ruleEString
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
    // InternalMyDsl.g:8022:1: rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 : ( ruleBehaviourDescription ) ;
    public final void rule__CompositeComponent__BehaviourdescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8026:1: ( ( ruleBehaviourDescription ) )
            // InternalMyDsl.g:8027:2: ( ruleBehaviourDescription )
            {
            // InternalMyDsl.g:8027:2: ( ruleBehaviourDescription )
            // InternalMyDsl.g:8028:3: ruleBehaviourDescription
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
    // InternalMyDsl.g:8037:1: rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 : ( ruleBehaviourDescription ) ;
    public final void rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8041:1: ( ( ruleBehaviourDescription ) )
            // InternalMyDsl.g:8042:2: ( ruleBehaviourDescription )
            {
            // InternalMyDsl.g:8042:2: ( ruleBehaviourDescription )
            // InternalMyDsl.g:8043:3: ruleBehaviourDescription
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
    // InternalMyDsl.g:8052:1: rule__CompositeComponent__ServiceAssignment_6 : ( ruleService ) ;
    public final void rule__CompositeComponent__ServiceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8056:1: ( ( ruleService ) )
            // InternalMyDsl.g:8057:2: ( ruleService )
            {
            // InternalMyDsl.g:8057:2: ( ruleService )
            // InternalMyDsl.g:8058:3: ruleService
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
    // InternalMyDsl.g:8067:1: rule__CompositeComponent__ServiceAssignment_7_1 : ( ruleService ) ;
    public final void rule__CompositeComponent__ServiceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8071:1: ( ( ruleService ) )
            // InternalMyDsl.g:8072:2: ( ruleService )
            {
            // InternalMyDsl.g:8072:2: ( ruleService )
            // InternalMyDsl.g:8073:3: ruleService
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
    // InternalMyDsl.g:8082:1: rule__CompositeComponent__RequiredroleAssignment_9_2 : ( ruleRequiredRole ) ;
    public final void rule__CompositeComponent__RequiredroleAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8086:1: ( ( ruleRequiredRole ) )
            // InternalMyDsl.g:8087:2: ( ruleRequiredRole )
            {
            // InternalMyDsl.g:8087:2: ( ruleRequiredRole )
            // InternalMyDsl.g:8088:3: ruleRequiredRole
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
    // InternalMyDsl.g:8097:1: rule__CompositeComponent__RequiredroleAssignment_9_3_1 : ( ruleRequiredRole ) ;
    public final void rule__CompositeComponent__RequiredroleAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8101:1: ( ( ruleRequiredRole ) )
            // InternalMyDsl.g:8102:2: ( ruleRequiredRole )
            {
            // InternalMyDsl.g:8102:2: ( ruleRequiredRole )
            // InternalMyDsl.g:8103:3: ruleRequiredRole
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
    // InternalMyDsl.g:8112:1: rule__CompositeComponent__ProvidedroleAssignment_11 : ( ruleProvidedRole ) ;
    public final void rule__CompositeComponent__ProvidedroleAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8116:1: ( ( ruleProvidedRole ) )
            // InternalMyDsl.g:8117:2: ( ruleProvidedRole )
            {
            // InternalMyDsl.g:8117:2: ( ruleProvidedRole )
            // InternalMyDsl.g:8118:3: ruleProvidedRole
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
    // InternalMyDsl.g:8127:1: rule__CompositeComponent__AssemblycontextAssignment_14 : ( ruleAssemblyContext ) ;
    public final void rule__CompositeComponent__AssemblycontextAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8131:1: ( ( ruleAssemblyContext ) )
            // InternalMyDsl.g:8132:2: ( ruleAssemblyContext )
            {
            // InternalMyDsl.g:8132:2: ( ruleAssemblyContext )
            // InternalMyDsl.g:8133:3: ruleAssemblyContext
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
    // InternalMyDsl.g:8142:1: rule__CompositeComponent__AssemblycontextAssignment_15_1 : ( ruleAssemblyContext ) ;
    public final void rule__CompositeComponent__AssemblycontextAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8146:1: ( ( ruleAssemblyContext ) )
            // InternalMyDsl.g:8147:2: ( ruleAssemblyContext )
            {
            // InternalMyDsl.g:8147:2: ( ruleAssemblyContext )
            // InternalMyDsl.g:8148:3: ruleAssemblyContext
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
    // InternalMyDsl.g:8157:1: rule__CompositeComponent__DelegationconnectorAssignment_19 : ( ruleDelegationConnector ) ;
    public final void rule__CompositeComponent__DelegationconnectorAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8161:1: ( ( ruleDelegationConnector ) )
            // InternalMyDsl.g:8162:2: ( ruleDelegationConnector )
            {
            // InternalMyDsl.g:8162:2: ( ruleDelegationConnector )
            // InternalMyDsl.g:8163:3: ruleDelegationConnector
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
    // InternalMyDsl.g:8172:1: rule__CompositeComponent__DelegationconnectorAssignment_20_1 : ( ruleDelegationConnector ) ;
    public final void rule__CompositeComponent__DelegationconnectorAssignment_20_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8176:1: ( ( ruleDelegationConnector ) )
            // InternalMyDsl.g:8177:2: ( ruleDelegationConnector )
            {
            // InternalMyDsl.g:8177:2: ( ruleDelegationConnector )
            // InternalMyDsl.g:8178:3: ruleDelegationConnector
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


    // $ANTLR start "rule__DelegationConnector__NameAssignment_1"
    // InternalMyDsl.g:8187:1: rule__DelegationConnector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DelegationConnector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8191:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8192:2: ( ruleEString )
            {
            // InternalMyDsl.g:8192:2: ( ruleEString )
            // InternalMyDsl.g:8193:3: ruleEString
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
    // InternalMyDsl.g:8202:1: rule__DelegationConnector__RoleAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__DelegationConnector__RoleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8206:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8207:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8207:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8208:3: ( ruleEString )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_5_0()); 
            // InternalMyDsl.g:8209:3: ( ruleEString )
            // InternalMyDsl.g:8210:4: ruleEString
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
    // InternalMyDsl.g:8221:1: rule__DelegationConnector__RoleAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__DelegationConnector__RoleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8225:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8226:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8226:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8227:3: ( ruleEString )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_6_1_0()); 
            // InternalMyDsl.g:8228:3: ( ruleEString )
            // InternalMyDsl.g:8229:4: ruleEString
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
    // InternalMyDsl.g:8240:1: rule__Role_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Role_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8244:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8245:2: ( ruleEString )
            {
            // InternalMyDsl.g:8245:2: ( ruleEString )
            // InternalMyDsl.g:8246:3: ruleEString
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
    // InternalMyDsl.g:8255:1: rule__Role_Impl__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Role_Impl__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8259:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8260:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8260:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8261:3: ( ruleEString )
            {
             before(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalMyDsl.g:8262:3: ( ruleEString )
            // InternalMyDsl.g:8263:4: ruleEString
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


    // $ANTLR start "rule__Container__NameAssignment_2"
    // InternalMyDsl.g:8274:1: rule__Container__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Container__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8278:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8279:2: ( ruleEString )
            {
            // InternalMyDsl.g:8279:2: ( ruleEString )
            // InternalMyDsl.g:8280:3: ruleEString
            {
             before(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__NameAssignment_2"


    // $ANTLR start "rule__Link__NameAssignment_1"
    // InternalMyDsl.g:8289:1: rule__Link__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8293:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8294:2: ( ruleEString )
            {
            // InternalMyDsl.g:8294:2: ( ruleEString )
            // InternalMyDsl.g:8295:3: ruleEString
            {
             before(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_1"


    // $ANTLR start "rule__Link__ContainerAssignment_5"
    // InternalMyDsl.g:8304:1: rule__Link__ContainerAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Link__ContainerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8308:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8309:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8309:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8310:3: ( ruleEString )
            {
             before(grammarAccess.getLinkAccess().getContainerContainerCrossReference_5_0()); 
            // InternalMyDsl.g:8311:3: ( ruleEString )
            // InternalMyDsl.g:8312:4: ruleEString
            {
             before(grammarAccess.getLinkAccess().getContainerContainerEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getContainerContainerEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getContainerContainerCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__ContainerAssignment_5"


    // $ANTLR start "rule__Link__ContainerAssignment_6_1"
    // InternalMyDsl.g:8323:1: rule__Link__ContainerAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Link__ContainerAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8327:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8328:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8328:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8329:3: ( ruleEString )
            {
             before(grammarAccess.getLinkAccess().getContainerContainerCrossReference_6_1_0()); 
            // InternalMyDsl.g:8330:3: ( ruleEString )
            // InternalMyDsl.g:8331:4: ruleEString
            {
             before(grammarAccess.getLinkAccess().getContainerContainerEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getContainerContainerEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getContainerContainerCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__ContainerAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000E8000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0002B80400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xF020000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});

}